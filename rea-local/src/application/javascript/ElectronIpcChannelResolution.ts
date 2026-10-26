import type {
  ElectronIpcFinding,
} from "../../domain/javascript/electronStaticAnalysisTypes.js";
import type {
  JavaScriptModuleSemanticIr,
} from "../../domain/javascript/javascriptModuleSemanticIr.js";
import type {
  JavaScriptSemanticBinding,
} from "../../domain/javascript/javascriptSemanticIr.js";
import type {
  JavaScriptArtifactFile,
} from "../../domain/javascript/javascriptArtifactFiles.js";
import { electronIpcChannelParts } from "../../domain/javascript/electronIpcChannelParts.js";
import type { JavaScriptModuleArtifactAnalysis } from "./JavaScriptArtifactAnalysisTypes.js";
import { resolveArtifactPathByContext } from "./JavaScriptArtifactPathResolution.js";

/**
 * One completed channel resolution: per-file counts plus the updated analysis,
 * so callers keep every consumer (graph, pairing, summaries) consistent.
 */
export interface ElectronIpcChannelResolutionResult {
  readonly analysis: JavaScriptModuleArtifactAnalysis;
  readonly resolved_channel_operations: number;
  readonly unresolved_channel_operations: number;
}

/**
 * Resolve dynamic Electron IPC channels to static channel names when every
 * piece of a channel expression is fixed text or a single-string constant
 * imported from a module inside the artifact.
 *
 * The resolution uses only facts already transported with the analysis: the
 * recorded dynamic channel expressions and each file's projected module IR
 * (import binding provenance plus exported literal constants). Anything not
 * covered — local constants, re-export chains deeper than one hop, members of
 * imported objects, ambiguous or shadowed bindings — stays dynamic.
 */
export const resolveElectronIpcChannelsViaImports = (
  analysis: JavaScriptModuleArtifactAnalysis,
): ElectronIpcChannelResolutionResult => {
  const fileTable = new Map(
    analysis.files.map(({ file, semantic }) => [file, semantic?.ir ?? null]),
  );
  const constants = constantTable(analysis);
  const files = new Map(
    analysis.files.map(({ file }) => [file.path, file] as const),
  );

  let resolvedChannelOperations = 0;
  const resolvedFiles: JavaScriptModuleArtifactAnalysis["files"] =
    analysis.files.map((analyzed) => {
      const { file, javascript, semantic } = analyzed;
      if (javascript === null || semantic === null)
        return analyzed;
      const ir = fileTable.get(file);
      if (ir === undefined || ir === null) return analyzed;

      const moduleKindByLocalName = moduleKinds(ir);
      let resolved = 0;
      const patchedIpc: readonly ElectronIpcFinding[] =
        javascript.electron.ipc.map((finding) => {
          if (finding.channel !== null) return finding;
          const channel = resolveChannel(
            finding,
            ir,
            moduleKindByLocalName,
            constants,
            file,
            files,
          );
          if (channel === null) return finding;
          resolved += 1;
          return { ...finding, channel, channel_expression: null, channel_origin: "imported-constant" };
        });
      resolvedChannelOperations += resolved;
      if (resolved === 0) return analyzed;
      return {
        ...analyzed,
        javascript: {
          ...javascript,
          electron: { ...javascript.electron, ipc: patchedIpc },
        },
      };
    });

  const unresolvedChannelOperations = analysis.files.reduce(
    (count, { javascript }) =>
      count +
      (javascript?.electron.ipc ?? []).filter(
        (finding) => finding.channel === null,
      ).length,
    0,
  );

  return {
    analysis: {
      ...analysis,
      files: resolvedFiles,
      limitations:
        resolvedChannelOperations === 0
          ? analysis.limitations
          : [
              ...analysis.limitations,
              `${String(resolvedChannelOperations)} dynamic Electron IPC channel operations were resolved statically through imported string constants; their runtime equality to handler channels was not executed or observed.`,
            ],
    },
    resolved_channel_operations: resolvedChannelOperations,
    unresolved_channel_operations: unresolvedChannelOperations,
  };
};

/** Provider path x exported name x constant string, for single-string exports. */
const constantTable = (
  analysis: JavaScriptModuleArtifactAnalysis,
): ReadonlyMap<string, ReadonlyMap<string, string>> => {
  const table = new Map<string, Map<string, string>>();
  for (const { file, semantic } of analysis.files) {
    const ir = semantic?.ir;
    if (ir === undefined) continue;
    const localNameValues = constantValuesByLocalName(ir.bindings);
    if (localNameValues.size === 0) continue;
    for (const link of ir.moduleLinks) {
      if (link.kind !== "export") continue;
      const { localName, exportedName } = link;
      if (localName === null || exportedName === null) continue;
      const value = localNameValues.get(localName);
      if (value === undefined) continue;
      let exports = table.get(file.path);
      if (exports === undefined) {
        exports = new Map();
        table.set(file.path, exports);
      }
      exports.set(exportedName, value);
    }
  }
  return table;
};

/** Literal string values of program bindings with one clean definition. */
const constantValuesByLocalName = (
  bindings: readonly JavaScriptSemanticBinding[],
): ReadonlyMap<string, string> => {
  const values = new Map<string, string>();
  for (const binding of bindings) {
    if (binding.definitions.length !== 1) continue;
    const { value } = binding;
    if (value.status !== "literal" || typeof value.value !== "string") continue;
    if (value.value === "") continue;
    values.set(binding.name, value.value);
  }
  return values;
};

/** Import kind per local name, preferred when resolving provider files. */
const moduleKinds = (
  ir: JavaScriptModuleSemanticIr,
): ReadonlyMap<string, "import" | "require"> => {
  const kinds = new Map<string, "import" | "require">();
  for (const link of ir.moduleLinks) {
    if (link.kind !== "import" && link.kind !== "require") continue;
    if (link.localName === null) continue;
    kinds.set(link.localName, link.kind);
  }
  return kinds;
};

const resolveChannel = (
  finding: ElectronIpcFinding,
  ir: JavaScriptModuleSemanticIr,
  moduleKinds: ReadonlyMap<string, "import" | "require">,
  constants: ReadonlyMap<string, ReadonlyMap<string, string>>,
  file: JavaScriptArtifactFile,
  files: ReadonlyMap<string, JavaScriptArtifactFile>,
): string | null => {
  // The caller filters, but this function owns its own fail-closed narrowing.
  if (finding.channel !== null) return null;
  const parts = electronIpcChannelParts(finding.channel_expression);
  if (parts === null || parts.length === 0) return null;
  let channel = "";
  for (const part of parts) {
    if (part.kind === "fixed-text") {
      channel += part.text;
      continue;
    }
    const origin = importedOrigin(part.root, ir);
    if (origin === null) return null;
    const importedPath = [...origin.importedPath, ...part.members];
    if (importedPath.length !== 1) return null;
    const [exportedName] = importedPath;
    if (exportedName === "" || exportedName === undefined) return null;
    const provider = resolveArtifactPathByContext({
      declaredPath: origin.specifier,
      sourcePath: file.path,
      context: "module-specifier",
      files,
      ...(moduleKinds.get(part.root) === "require"
        ? { moduleKind: "require" as const }
        : {}),
      ...(moduleKinds.get(part.root) === "import"
        ? { moduleKind: "import" as const }
        : {}),
    });
    if (provider.resolved_path === null) return null;
    const value = constants.get(provider.resolved_path)?.get(exportedName);
    if (value === undefined) return null;
    channel += value;
  }
  return channel === "" ? null : channel;
};

/**
 * The single proven import origin for one channel root name, or null when the
 * name is not import-bound, has an ambiguous origin, or its binding carries
 * more than one definition (a shadow, or parser-recovered duplicates).
 */
const importedOrigin = (
  root: string,
  ir: JavaScriptModuleSemanticIr,
): { readonly specifier: string; readonly importedPath: readonly string[] } | null => {
  const matches = ir.bindings.filter((binding) => binding.name === root);
  if (matches.length !== 1) {
    return null;
  }
  const binding = matches[0];
  if (binding === undefined || binding.definitions.length !== 1) return null;
  if (binding.provenance.status !== "module") return null;
  if (binding.provenance.origins.length !== 1) return null;
  return binding.provenance.origins[0] ?? null;
};
