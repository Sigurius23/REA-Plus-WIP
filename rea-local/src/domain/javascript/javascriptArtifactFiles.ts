import type { JavaScriptPathScopeSummary } from "./javascriptAnalysisPathScope.js";
import type { JavaScriptSourceRange } from "./javascriptStaticAnalysisTypes.js";

/** A logical source body, mapped to its actual inventoried HTML document. */
export interface JavaScriptInlineSourceOrigin {
  readonly html_path: string;
  readonly html_sha256: string;
  readonly html_inventory_artifact_id: string;
  readonly script_kind: "classic" | "module";
  readonly base_href: string | null;
  readonly start_offset: number;
  readonly end_offset: number;
  readonly offset_encoding: "utf16-code-units";
  readonly source_range: JavaScriptSourceRange;
}

/** Relevant file categories projected from the complete artifact inventory. */
export type JavaScriptArtifactFileKind =
  | "package-json"
  | "json"
  | "javascript"
  | "html"
  | "source-map"
  | "native-addon";

/** An inventoried file or explicitly derived inline source and its inert text. */
export interface JavaScriptArtifactFile {
  readonly path: string;
  readonly container_sha256: string;
  readonly sha256: string;
  readonly bytes: number;
  readonly inventory_artifact_id: string | null;
  /** Present only for a derived body; its path is a logical URI, never a file. */
  readonly inline_source?: JavaScriptInlineSourceOrigin | undefined;
  readonly kind: JavaScriptArtifactFileKind;
  readonly unpacked: boolean;
  readonly text:
    | { readonly included: true; readonly value: string }
    | {
        readonly included: false;
        readonly reason: "not-applicable" | "invalid-utf8";
      };
}

/** One filesystem-backed ASAR nested beneath a directory input. */
export interface JavaScriptArtifactContainer {
  readonly path: string;
  readonly sha256: string;
  readonly bytes: number;
  readonly inventory_artifact_id: string;
}

/** Deterministic relevant-file projection plus explicit omissions. */
export interface JavaScriptArtifactFileSet {
  readonly files: readonly JavaScriptArtifactFile[];
  readonly containers: readonly JavaScriptArtifactContainer[];
  readonly text_bytes_read: number;
  readonly invalid_utf8_files: number;
  /** Honest path-scope accounting for the file selection. */
  readonly paths_scope: JavaScriptPathScopeSummary;
}
