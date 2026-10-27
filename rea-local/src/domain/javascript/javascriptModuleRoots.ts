import { basename, posix } from "node:path";

import * as t from "@babel/types";
import { parse } from "@babel/parser";

import {
  logicalPathEscapesRoot,
  normalizeJoinedLogicalPath,
} from "../artifactIdentity.js";
import type { JavaScriptArtifactFile } from "./javascriptArtifactFiles.js";

/**
 * Application module directories admitted from bundler configuration, in
 * declaration order. Paths are normalized against the artifact root; only
 * entries that stay inside the artifact are kept.
 */
export interface JavaScriptModuleRootsDiscovery {
  readonly roots: readonly string[];
  readonly limitations: readonly string[];
}

/** Directory candidates like `webpack.main.config.js` or `rspack.config.ts`. */
const CONFIG_NAME = /(?:webpack|rspack)[\w.-]*\.config\.[cm]?[jt]s$/iu;

const CONFIG_FILE_LIMIT = 8;
const SOURCE_CHAR_LIMIT = 256_000;
const WALK_NODE_LIMIT = 100_000;

/**
 * Read extra module-root directories from inventoried webpack/rspack
 * configuration files, without executing any configuration code.
 *
 * Only a `resolve.modules` array whose elements are all string literals is
 * admitted; calls (`path.resolve(__dirname, ...)`), spreads, `node_modules`
 * entries, and anything escaping the artifact root fail closed with an
 * explicit limitation. Relative entries resolve against the config file's
 * directory (the webpack default context), never against the artifact root.
 */
export const discoverJavaScriptModuleRoots = (
  files: readonly JavaScriptArtifactFile[],
): JavaScriptModuleRootsDiscovery => {
  const limitations: string[] = [];
  const configs = files.filter(
    (file) =>
      file.kind === "javascript" && CONFIG_NAME.test(basename(file.path)),
  );
  const roots: string[] = [];
  for (const [index, config] of configs.entries()) {
    if (index >= CONFIG_FILE_LIMIT) {
      limitations.push(
        `${String(configs.length - CONFIG_FILE_LIMIT)} additional webpack/rspack configuration files beyond the limit were not scanned; their module directories are not admitted.`,
      );
      break;
    }
    if (config.text.included === false) {
      limitations.push(
        `The webpack/rspack configuration ${config.path} was inventoried but its text is unavailable: ${config.text.reason}; its resolve.modules records are not admitted.`,
      );
      continue;
    }
    if (config.text.value.length > SOURCE_CHAR_LIMIT) {
      limitations.push(
        `The webpack/rspack configuration ${config.path} exceeds the bounded scan budget; its resolve.modules records are not admitted.`,
      );
      continue;
    }
    const program = configFileProgram(
      config.text.value,
      config.path,
      limitations,
    );
    if (program === null) continue;
    const collected = collectResolveModules(program, config.path, limitations);
    for (const root of collected) {
      if (!roots.includes(root)) roots.push(root);
    }
  }
  if (roots.length > 0)
    limitations.push(
      `${String(roots.length)} extra module director${roots.length === 1 ? "y was" : "ies were"} admitted from webpack/rspack configuration resolve.modules records as lower-precedence bare-specifier candidates after node_modules.`,
    );
  return { roots, limitations };
};

/** Parsed program body, or null with an honest limitation when unparseable. */
const configFileProgram = (
  source: string,
  configPath: string,
  limitations: string[],
): readonly t.Statement[] | null => {
  try {
    const file = parse(source, { errorRecovery: false });
    const program = file.program;
    if (program === undefined || program === null) return null;
    return program.body;
  } catch {
    limitations.push(
      `The webpack/rspack configuration ${configPath} does not parse statically; its resolve.modules records are not admitted.`,
    );
    return null;
  }
};

const collectResolveModules = (
  statements: readonly t.Statement[],
  configPath: string,
  limitations: string[],
): readonly string[] => {
  const extracted: string[] = [];
  let visited = 0;
  const walk = (node: t.Node | null): void => {
    if (node === null || node === undefined) return;
    visited += 1;
    if (t.isObjectExpression(node)) {
      const resolveValue = staticObjectProperty(node, "resolve");
      if (resolveValue !== null && t.isObjectExpression(resolveValue)) {
        const modulesValue = staticObjectProperty(resolveValue, "modules");
        if (modulesValue !== null && t.isArrayExpression(modulesValue)) {
          admitRoots(modulesValue, configPath, extracted, limitations);
          return;
        }
      }
      for (const property of node.properties) walk(property);
      return;
    }
    for (const key of t.VISITOR_KEYS[node.type] ?? []) {
      const value: unknown = Reflect.get(node, key);
      if (Array.isArray(value)) {
        for (const item of value) if (t.isNode(item)) walk(item);
      } else if (t.isNode(value)) walk(value);
    }
  };
  for (const statement of statements) walk(statement);
  const exceeded = visited > WALK_NODE_LIMIT;
  if (exceeded)
    limitations.push(
      `The webpack/rspack configuration ${configPath} exceeds the AST walk budget; its resolve.modules records are not admitted and any collected candidates are dropped.`,
    );
  return exceeded ? [] : extracted;
};

/** The value of a statically named object property, or null. */
const staticObjectProperty = (
  object: t.ObjectExpression,
  name: string,
): t.Node | null => {
  for (const property of object.properties) {
    if (!t.isObjectProperty(property) || property.computed) continue;
    const inferred = t.isIdentifier(property.key)
      ? property.key.name
      : t.isStringLiteral(property.key)
        ? property.key.value
        : null;
    if (inferred === name) return property.value;
  }
  return null;
};

/** String-literal entries only; one non-literal element drops the record. */
const admitRoots = (
  array: t.ArrayExpression,
  configPath: string,
  collected: string[],
  limitations: string[],
): void => {
  const declared: string[] = [];
  const context = posix.dirname(configPath);
  for (const element of array.elements) {
    if (!t.isStringLiteral(element)) {
      limitations.push(
        `The webpack/rspack configuration ${configPath} declares a resolve.modules entry that is not a string literal; that record is not admitted.`,
      );
      return;
    }
    declared.push(element.value);
  }
  for (const entry of declared) {
    if (entry === "node_modules") continue;
    const joined = posix.isAbsolute(entry)
      ? entry.slice(1)
      : posix.join(context === "." ? "" : context, entry);
    const normalized = normalizeJoinedLogicalPath(joined);
    if (logicalPathEscapesRoot(normalized)) {
      limitations.push(
        `The webpack/rspack configuration ${configPath} admits a resolve.modules entry that escapes the artifact root; that entry is not admitted.`,
      );
      continue;
    }
    // `[]`/`.`-normalized roots mean the artifact root itself.
    const root = normalized === "." ? "" : normalized;
    if (!collected.includes(root)) collected.push(root);
  }
};
