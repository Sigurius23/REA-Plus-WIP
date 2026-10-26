import { withArtifactResourceScope } from "../fixtures/artifactInventory.js";
import type { ExecutionOptions } from "../../src/application/AnalysisProvider.js";
import { searchJavaScriptStrings as searchOwned } from "../../src/application/javascript/JavaScriptStringSearchService.js";

/** Run a JavaScript string search with an awaited, test-owned artifact scope. */
export const searchJavaScriptStrings = (
  input: unknown,
  options: ExecutionOptions = {},
) => withArtifactResourceScope((scope) => searchOwned(input, scope, options));
