import * as t from "@babel/types";
import { compareUnicodeCodePoints } from "../../domain/unicodeCodePointOrder.js";
import { parseJavaScriptSource } from "../../domain/javascript/javascriptSourceParser.js";
import {
  createJavaScriptLexicalBindingIndexSteps,
  type JavaScriptLexicalBindingIndex,
} from "../../domain/javascript/javascriptSemanticAnalysis.js";
import { traverseJavaScriptAstSteps } from "../../domain/javascript/javascriptSemanticTraversal.js";
import {
  collectElectronHelperModelsSteps,
  type ElectronHelperModel,
  type ElectronHelperParameter,
} from "../../domain/javascript/electronHelperModels.js";
import {
  readExactJavaScriptLiteral,
  semanticStaticPropertyName,
} from "../../domain/javascript/javascriptAstValues.js";
import {
  range,
  sourceSlice,
} from "../../domain/javascript/javascriptStaticAnalysisHelpers.js";
import type { JavaScriptArtifactFile } from "../../domain/javascript/javascriptArtifactFiles.js";
import type { JavaScriptModuleSemanticIr } from "../../domain/javascript/javascriptModuleSemanticIr.js";
import type {
  ElectronContextBridgeFinding,
  ElectronIpcFinding,
} from "../../domain/javascript/electronStaticAnalysisTypes.js";
import type { JavaScriptModuleArtifactAnalysis } from "./JavaScriptArtifactAnalysisTypes.js";
import { resolveArtifactPathByContext } from "./JavaScriptArtifactPathResolution.js";
import { electronImportedStringResolver } from "./ElectronIpcChannelResolution.js";

type ModuleFile = JavaScriptModuleArtifactAnalysis["files"][number];
type ImportedString = ReturnType<typeof electronImportedStringResolver>;
interface Helper {
  readonly file: ModuleFile;
  readonly model: ElectronHelperModel;
}
interface Helpers {
  readonly exported: Map<string, Helper[]>;
  readonly local: Map<string, Map<string, Helper>>;
}
interface Caller {
  readonly file: JavaScriptArtifactFile;
  readonly source: string;
  readonly ir: JavaScriptModuleSemanticIr | null;
}

/** Recover static helper-call candidates; never execute helpers or infer runtime invocation. */
export function* resolveElectronHelperArgumentsSteps(
  analysis: JavaScriptModuleArtifactAnalysis,
  moduleRoots: readonly string[],
): Generator<void, JavaScriptModuleArtifactAnalysis> {
  const helpers = yield* collectHelpersSteps(analysis);
  if (helpers.local.size === 0 && helpers.exported.size === 0) return analysis;
  const files = new Map(analysis.files.map(({ file }) => [file.path, file]));
  const importedString = electronImportedStringResolver(analysis, moduleRoots);
  const updated: ModuleFile[] = [];
  for (const file of analysis.files)
    updated.push(
      yield* resolveCallerSteps(
        file,
        helperImports(file, helpers, files, moduleRoots),
        importedString,
      ),
    );
  return {
    ...analysis,
    files: updated,
    limitations: [
      ...analysis.limitations,
      "Electron helper argument flows are static call-site candidates. They preserve helper source locations; runtime invocation, mapValues callbacks and bridge member selection were not executed.",
    ],
  };
}

function* collectHelpersSteps(
  analysis: JavaScriptModuleArtifactAnalysis,
): Generator<void, Helpers> {
  const exported = new Map<string, Helper[]>();
  const local = new Map<string, Map<string, Helper>>();
  for (const file of analysis.files) {
    if (
      file.javascript === null ||
      file.application_projection_failure !== undefined ||
      file.javascript.electron.context_bridge_apis.length === 0 ||
      !file.file.text.included
    )
      continue;
    const ast = parseJavaScriptSource(file.file.text.value);
    if (ast === null) continue;
    const bindings = yield* createJavaScriptLexicalBindingIndexSteps(ast);
    const models = yield* collectElectronHelperModelsSteps(
      ast,
      bindings,
      file.javascript,
    );
    for (const model of models) {
      const helper = { file, model };
      if (model.bindingId !== null) {
        const entries = local.get(file.file.path) ?? new Map<string, Helper>();
        entries.set(model.bindingId, helper);
        local.set(file.file.path, entries);
      }
      for (const name of exportedHelperNames(file, model)) {
        const key = JSON.stringify([file.file.path, name]);
        const existing = exported.get(key) ?? [];
        existing.push(helper);
        exported.set(key, existing);
      }
    }
  }
  return { exported, local };
}

const helperImports = (
  file: ModuleFile,
  helpers: Helpers,
  files: ReadonlyMap<string, JavaScriptArtifactFile>,
  moduleRoots: readonly string[],
): ReadonlyMap<string, Helper> => {
  const imports = new Map(helpers.local.get(file.file.path));
  for (const binding of file.semantic?.ir.bindings ?? []) {
    if (
      binding.definitions.length !== 1 ||
      binding.provenance.status !== "module"
    )
      continue;
    const origin = binding.provenance.origins[0];
    if (origin.importedPath.length !== 1) continue;
    const provider = resolveArtifactPathByContext({
      declaredPath: origin.specifier,
      sourcePath: file.file.path,
      context: "module-specifier",
      files,
      module_roots: moduleRoots,
    });
    if (provider.resolved_path === null) continue;
    const matches = helpers.exported.get(
      JSON.stringify([provider.resolved_path, origin.importedPath[0]]),
    );
    if (matches?.length === 1 && matches[0] !== undefined)
      imports.set(binding.bindingId, matches[0]);
  }
  return imports;
};

function* resolveCallerSteps(
  file: ModuleFile,
  imports: ReadonlyMap<string, Helper>,
  importedString: ImportedString,
): Generator<void, ModuleFile> {
  if (
    imports.size === 0 ||
    file.application_projection_failure !== undefined ||
    !file.file.text.included ||
    file.javascript === null
  )
    return file;
  const ast = parseJavaScriptSource(file.file.text.value);
  if (ast === null) return file;
  const bindings = yield* createJavaScriptLexicalBindingIndexSteps(ast);
  const ipc: ElectronIpcFinding[] = [];
  const bridges: ElectronContextBridgeFinding[] = [];
  const caller: Caller = {
    file: file.file,
    source: file.file.text.value,
    ir: file.semantic?.ir ?? null,
  };
  yield* traverseJavaScriptAstSteps(ast, {
    enter: (node) => {
      if (
        !t.isCallExpression(node) ||
        !t.isIdentifier(node.callee) ||
        node.arguments.some((argument) => t.isSpreadElement(argument))
      )
        return;
      const binding = bindings.resolve(node.callee);
      const helper =
        binding === undefined ? undefined : imports.get(binding.bindingId);
      if (helper !== undefined)
        collectHelperCall(
          node,
          caller,
          bindings,
          helper,
          importedString,
          ipc,
          bridges,
        );
    },
  });
  return {
    ...file,
    javascript: {
      ...file.javascript,
      electron: {
        ...file.javascript.electron,
        ipc: [...file.javascript.electron.ipc, ...ipc],
        context_bridge_apis: [
          ...file.javascript.electron.context_bridge_apis,
          ...bridges,
        ],
      },
    },
  };
}

const callerString = (
  argument: t.Node,
  caller: Caller,
  bindings: JavaScriptLexicalBindingIndex,
  importedString: ImportedString,
): string | null => {
  const literal = readExactJavaScriptLiteral(argument);
  if (literal.found && typeof literal.value === "string") return literal.value;
  if (t.isIdentifier(argument)) {
    const actual = bindings.resolve(argument);
    if (
      actual?.definitions.length === 1 &&
      actual.initializers.length === 1 &&
      actual.initializers[0] !== undefined &&
      actual.initializers[0].projection.length === 0 &&
      bindings.initializerIsUnconditional(actual.initializers[0].node)
    ) {
      const initial = readExactJavaScriptLiteral(actual.initializers[0].node);
      if (initial.found && typeof initial.value === "string")
        return initial.value;
    }
    const local = caller.ir?.bindings.find(
      (candidate) => candidate.bindingId === actual?.bindingId,
    );
    if (
      local?.definitions.length === 1 &&
      local.value.status === "literal" &&
      typeof local.value.value === "string"
    )
      return local.value.value;
    if (local?.provenance.status !== "module") return null;
  }
  let root = argument;
  while (t.isMemberExpression(root)) root = root.object;
  if (t.isIdentifier(root)) {
    const actual = bindings.resolve(root);
    if (
      actual === undefined ||
      !caller.ir?.bindings.some(
        (candidate) =>
          candidate.bindingId === actual.bindingId &&
          candidate.definitions.length === 1 &&
          candidate.provenance.status === "module",
      )
    )
      return null;
  }
  return caller.ir === null
    ? null
    : importedString(
        caller.file,
        caller.ir,
        sourceSlice(caller.source, argument),
      );
};

const collectHelperCall = (
  node: t.CallExpression,
  caller: Caller,
  bindings: JavaScriptLexicalBindingIndex,
  helper: Helper,
  importedString: ImportedString,
  ipc: ElectronIpcFinding[],
  bridges: ElectronContextBridgeFinding[],
): void => {
  const text = (argument: t.Node) =>
    callerString(argument, caller, bindings, importedString);
  const selected = (parameter: ElectronHelperParameter) =>
    argumentAt(node, parameter);
  const namespaceNode = selected(helper.model.namespace);
  const namespace = namespaceNode === undefined ? null : text(namespaceNode);
  const members = new Set<string>();
  for (const rule of helper.model.rules) {
    const input = selected(rule.parameter);
    const entries = rule.values
      ? literalMembers(input)
      : input === undefined
        ? []
        : [{ name: null, value: input }];
    for (const entry of entries) {
      if (entry.name !== null) members.add(entry.name);
      const channel = text(entry.value);
      if (channel === null) continue;
      const candidate: ElectronIpcFinding = {
        ...rule.finding,
        channel,
        channel_expression: null,
        channel_origin: "helper-argument",
        module_key: null,
        location: range(node),
        helper_source: {
          path: helper.file.file.path,
          sha256: helper.file.file.sha256,
          location: rule.finding.location,
          expression:
            rule.finding.channel_expression ?? rule.finding.channel ?? "",
        },
      };
      ipc.push(
        candidate.mode === "listen" || candidate.mode === "handle"
          ? {
              ...candidate,
              handler_kind: "dynamic-expression",
              handler_location: range(node),
            }
          : candidate,
      );
    }
  }
  if (helper.model.api !== null)
    for (const member of literalMembers(selected(helper.model.api)))
      if (member.name !== null) members.add(member.name);
  bridges.push({
    ...helper.model.bridge,
    ...(namespace === null
      ? {
          api_key: null,
          api_key_expression:
            namespaceNode === undefined
              ? "[missing]"
              : sourceSlice(caller.source, namespaceNode),
        }
      : { api_key: namespace, api_key_expression: null }),
    module_key: null,
    location: range(node),
    members: [],
    api_status: "dynamic",
    unknown_members: 1,
    helper_candidates: {
      helper_path: helper.file.file.path,
      helper_sha256: helper.file.file.sha256,
      members: [...members].sort(compareUnicodeCodePoints),
      limitation:
        "Candidate members from helper arguments; selection, helper invocation and runtime exposure remain unverified.",
    },
  });
};

const literalMembers = (
  node: t.Node | undefined,
): { name: string | null; value: t.Node }[] => {
  if (
    !t.isObjectExpression(node) ||
    node.properties.some(
      (property) => !t.isObjectProperty(property) || property.computed,
    )
  )
    return [];
  const members = new Map<string, t.Node>();
  for (const property of node.properties)
    if (t.isObjectProperty(property)) {
      const name = semanticStaticPropertyName(property.key, property.computed);
      // This setter changes the prototype rather than adding an own entry.
      // Shorthand {__proto__} is an ordinary own property and stays eligible.
      if (name === "__proto__" && !property.shorthand) continue;
      members.set(name, property.value);
    }
  return [...members].map(([name, value]) => ({ name, value }));
};
const argumentAt = (
  call: t.CallExpression,
  parameter: ElectronHelperParameter,
): t.Node | undefined => {
  let node: t.Node | undefined = call.arguments[parameter.index];
  for (const name of parameter.path) {
    // A lexical initializer does not establish an object's current contents:
    // member writes and escapes need heap-aware analysis. Project literals only.
    node = literalMembers(node).findLast((entry) => entry.name === name)?.value;
  }
  return node;
};
const exportedHelperNames = (
  file: ModuleFile,
  model: ElectronHelperModel,
): string[] => {
  const ir = file.semantic?.ir;
  if (ir === undefined) return [];
  const binding = ir.bindings.find(
    (candidate) => candidate.bindingId === model.bindingId,
  );
  const callable = ir.callables.find(
    (candidate) =>
      JSON.stringify(candidate.location) === JSON.stringify(range(model.fn)),
  );
  return ir.moduleLinks.flatMap((link) =>
    link.kind === "export" &&
    link.exportedName !== null &&
    ((binding !== undefined && link.localName === binding.name) ||
      (callable !== undefined && link.callableId === callable.callableId))
      ? [link.exportedName]
      : [],
  );
};
