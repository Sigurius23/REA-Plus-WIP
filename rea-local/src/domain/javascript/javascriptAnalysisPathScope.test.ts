import { describe, expect, it } from "vitest";

import {
  createJavaScriptAnalysisPathScope,
  javascriptAnalysisPathScopeSchema,
  javascriptPathPatternSchema,
} from "./javascriptAnalysisPathScope.js";

describe("javascript path pattern schema", () => {
  it("rejects absolute and empty patterns", () => {
    expect(
      javascriptPathPatternSchema.safeParse("/absolute/app.asar").success,
    ).toBe(false);
    expect(javascriptPathPatternSchema.safeParse("").success).toBe(false);
    expect(
      javascriptPathPatternSchema.safeParse("node_modules/**").success,
    ).toBe(true);
  });

  it("keeps scope fields optional but strict", () => {
    expect(javascriptAnalysisPathScopeSchema.safeParse({})).toMatchObject({
      success: true,
    });
    expect(
      javascriptAnalysisPathScopeSchema.safeParse({
        paths_include: ["src/**"],
        paths_exclude: ["src/vendor/**"],
        unknown: 1,
      }).success,
    ).toBe(false);
  });
});

describe("createJavaScriptAnalysisPathScope", () => {
  it("admits everything when no pattern list is set", () => {
    const scope = createJavaScriptAnalysisPathScope({});
    expect(scope.paths_include).toEqual([]);
    expect(scope.considersPath("anything/at/all.js")).toBe(true);
  });

  it("matches cross-segment globs including zero segments", () => {
    const scope = createJavaScriptAnalysisPathScope({
      paths_exclude: ["node_modules/**", "**/*.map"],
    });
    expect(scope.considersPath("node_modules/electron-log/src/main.js")).toBe(
      false,
    );
    expect(scope.considersPath("node_modules")).toBe(true);
    expect(scope.considersPath("src/main.js")).toBe(true);
    expect(scope.considersPath("src/renderer/index.js.map")).toBe(false);
    expect(scope.considersPath("index.map")).toBe(false);
  });

  it("keeps single-star matching inside one segment", () => {
    const scope = createJavaScriptAnalysisPathScope({
      paths_exclude: ["src/*.js"],
    });
    expect(scope.considersPath("src/main.js")).toBe(false);
    expect(scope.considersPath("src/main/index.js")).toBe(true);
  });

  it("requires include admission when any include pattern is set", () => {
    const scope = createJavaScriptAnalysisPathScope({
      paths_include: ["src/**/*.js"],
    });
    expect(scope.considersPath("src/main/main.js")).toBe(true);
    expect(scope.considersPath("src/main.js")).toBe(true);
    expect(scope.considersPath("src/main.ts")).toBe(false);
    expect(scope.considersPath("other/main.js")).toBe(false);
    expect(scope.considersPath("package.json")).toBe(false);
  });

  it("lets exclude win over include", () => {
    const scope = createJavaScriptAnalysisPathScope({
      paths_include: ["src/**"],
      paths_exclude: ["src/generated/**"],
    });
    expect(scope.considersPath("src/main.js")).toBe(true);
    expect(scope.considersPath("src/generated/types.d.ts")).toBe(false);
  });

  it("treats a bare name as an exact path, not a subtree", () => {
    const scope = createJavaScriptAnalysisPathScope({
      paths_exclude: ["main.js"],
    });
    expect(scope.considersPath("main.js")).toBe(false);
    expect(scope.considersPath("main/main.js")).toBe(true);
  });

  it("matches '?' within one segment and literal dots", () => {
    const scope = createJavaScriptAnalysisPathScope({
      paths_exclude: ["dist/?.js"],
    });
    expect(scope.considersPath("dist/a.js")).toBe(false);
    expect(scope.considersPath("dist/.js")).toBe(true);
    expect(scope.considersPath("dist/bundle.js")).toBe(true);
  });

  it("admits matched paths even when the include pattern needs escaping", () => {
    const scope = createJavaScriptAnalysisPathScope({
      paths_include: ["pkg+vendor/(name)/**"],
    });
    expect(scope.considersPath("pkg+vendor/(name)/x.js")).toBe(true);
    expect(scope.considersPath("pkgxvendorxnamej/x.js")).toBe(false);
  });
});
