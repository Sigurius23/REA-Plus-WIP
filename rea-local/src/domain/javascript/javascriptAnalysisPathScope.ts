import { z } from "zod";

/**
 * One artifact-relative path selection pattern.
 *
 * Patterns match the logical path with `/` separators, are anchored to the
 * whole path, and stay glob-lite: `**` spans path segments (a double-star
 * prefix followed by a slash also matches zero segments), `*` and `?` stop at segment boundaries. A
 * bare name therefore matches that exact path only; a subtree needs a
 * trailing `/**`.
 */
export const javascriptPathPatternSchema = z
  .string()
  .min(1)
  .refine((pattern) => !pattern.startsWith("/"), {
    message: "Path patterns are relative to the artifact root",
  });

/** Optional artifact-relative include and exclude pattern lists. */
export const javascriptAnalysisPathScopeSchema = z.strictObject({
  paths_include: z.array(javascriptPathPatternSchema).optional(),
  paths_exclude: z.array(javascriptPathPatternSchema).optional(),
});

/** Honest counts and the pattern lists that produced them. */
export const javaScriptPathScopeSummarySchema = z.strictObject({
  paths_include: z.array(z.string()),
  paths_exclude: z.array(z.string()),
  considered_files: z.number().int().min(0),
  selected_files: z.number().int().min(0),
  excluded_files: z.number().int().min(0),
});

export type JavaScriptPathScopeSummary = z.infer<
  typeof javaScriptPathScopeSummarySchema
>;

export type JavaScriptAnalysisPathScopeInput = z.infer<
  typeof javascriptAnalysisPathScopeSchema
>;

/** Scope decision for one candidate path. */
export interface JavaScriptAnalysisPathScope {
  /** Include patterns verbatim, possibly empty. */
  readonly paths_include: readonly string[];
  /** Exclude patterns verbatim, possibly empty. */
  readonly paths_exclude: readonly string[];
  /** Whether analysis should read and project this artifact-relative path. */
  readonly considersPath: (path: string) => boolean;
}

/** Scope that admits every path; shared instance avoids per-call allocation. */
export const UNFILTERED_JAVASCRIPT_PATH_SCOPE: JavaScriptAnalysisPathScope = {
  paths_include: [],
  paths_exclude: [],
  considersPath: () => true,
};

/**
 * Build the scope decision from validated pattern lists. Every path that no
 * include pattern admits is out; every path an exclude pattern hits stays
 * out, exclude winning over include.
 */
export const createJavaScriptAnalysisPathScope = (
  input: JavaScriptAnalysisPathScopeInput,
): JavaScriptAnalysisPathScope => {
  const includes = input.paths_include ?? [];
  const excludes = input.paths_exclude ?? [];
  if (includes.length === 0 && excludes.length === 0)
    return UNFILTERED_JAVASCRIPT_PATH_SCOPE;
  const excludeMatchers = excludes.map(compileJavaScriptPathPattern);
  const includeMatchers = includes.map(compileJavaScriptPathPattern);
  return {
    paths_include: includes,
    paths_exclude: excludes,
    considersPath: (path) =>
      (includeMatchers.length === 0 ||
        includeMatchers.some((match) => match(path))) &&
      !excludeMatchers.some((match) => match(path)),
  };
};

/**
 * Glob-lite pattern compilation. `**` spans whole segments (a leading
 * double-star followed by a slash also matches zero segments), `*` and `?` stay inside one segment, and
 * every other character matches literally.
 */
const compileJavaScriptPathPattern = (
  pattern: string,
): ((path: string) => boolean) => {
  const source = compilePatternSource(pattern);
  const expression = new RegExp(`^${source}$`, "u");
  return (path) => expression.test(path);
};

const compilePatternSource = (pattern: string): string => {
  let source = "";
  for (let index = 0; index < pattern.length; index += 1) {
    const character = pattern.charAt(index);
    if (character === "*") {
      if (pattern[index + 1] === "*") {
        index += 1;
        if (pattern[index + 1] === "/") {
          index += 1;
          source += "(?:.*/)?";
        } else {
          source += ".*";
        }
      } else {
        source += "[^/]*";
      }
      continue;
    }
    if (character === "?") {
      source += "[^/]";
      continue;
    }
    source += character.replace(/[.*+?^${}()|[\]\\]/gu, "\\$&");
  }
  return source;
};
