import type { ElectronStaticFindings } from "./electronStaticAnalysisTypes.js";

/** Static syntax context retained for later artifact path resolution. */
export type JavaScriptStaticPathContext =
  | "module-specifier"
  | "filesystem-expression";

/** One source coordinate produced by the JavaScript parser. */
export interface JavaScriptSourcePoint {
  readonly line: number;
  readonly column: number;
}

/** One exact source range within a JavaScript artifact. */
export interface JavaScriptSourceRange {
  readonly start: JavaScriptSourcePoint;
  readonly end: JavaScriptSourcePoint;
}

interface JavaScriptStaticReferenceState {
  readonly kind:
    | "static-import"
    | "dynamic-import"
    | "require"
    | "worker"
    | "service-worker";
  readonly module_key: string | null;
  /** Recovered factory runtime; absent in older or unbundled findings. */
  readonly module_runtime?: string;
  readonly location: JavaScriptSourceRange;
}

/** A statically visible module, worker, or service-worker reference. */
export type JavaScriptStaticReference = JavaScriptStaticReferenceState &
  (
    | { readonly specifier: string; readonly expression: null }
    | { readonly specifier: null; readonly expression: string }
  );

/** A route or network endpoint literal observed in syntax. */
export interface JavaScriptStaticEndpoint {
  /** Absent in historical records; an unknown receiver is only a candidate. */
  readonly network_receiver?: import("./javascriptEndpointReceiver.js").JavaScriptEndpointReceiver;
  readonly template_parts?: readonly import("./javascriptEndpointTemplates.js").JavaScriptEndpointTemplatePart[];
  readonly kind: "route" | "network";
  readonly value: string;
  readonly mechanism: string;
  readonly module_key: string | null;
  /** Recovered factory runtime; absent in older or unbundled findings. */
  readonly module_runtime?: string;
  readonly location: JavaScriptSourceRange;
}

/** A storage surface observed without executing application code. */
export interface JavaScriptStaticStorage {
  readonly kind:
    | "local-storage"
    | "session-storage"
    | "indexed-db"
    | "cache-storage"
    | "extension-storage"
    | "sqlite";
  readonly area?: "local" | "session" | "sync" | "managed";
  readonly api?: string;
  readonly name: string | null;
  readonly mechanism: string;
  readonly module_key: string | null;
  /** Recovered factory runtime; absent in older or unbundled findings. */
  readonly module_runtime?: string;
  readonly location: JavaScriptSourceRange;
}

interface JavaScriptBundlerModuleState {
  readonly module_key: string;
  readonly factory_require_name: string | null;
  readonly source_sha256: string;
  readonly exports: readonly string[];
  readonly location: JavaScriptSourceRange;
}

/** One exact module factory recovered from a Webpack/Rspack registration. */
export interface JavaScriptBundlerModule extends JavaScriptBundlerModuleState {
  readonly structural_fingerprint_sha256: string;
  readonly structural_fingerprint_algorithm: "babel-ast-v1";
}

/** One statically recognized bundler chunk or module registration. */
export interface JavaScriptBundlerRegistration {
  readonly bundler: "webpack" | "rspack" | "esbuild" | "commonjs-bootstrap";
  readonly runtime: string;
  readonly chunk_keys: readonly string[];
  readonly unknown_chunk_keys: number;
  readonly runtime_require_name: string | null;
  readonly runtime_module_cache_status: "observed" | "not-observed";
  readonly entry_module_keys: readonly string[];
  readonly unknown_entry_module_keys: number;
  readonly async_chunk_keys: readonly string[];
  readonly unknown_async_chunk_keys: number;
  readonly modules: readonly JavaScriptBundlerModule[];
  readonly location: JavaScriptSourceRange;
}

/** Static Electron role paths discovered from package or JavaScript syntax. */
export interface JavaScriptRolePath {
  readonly role: "preload" | "renderer";
  readonly path: string;
  readonly resolution_context: JavaScriptStaticPathContext;
  readonly mechanism: string;
  readonly module_key: string | null;
  /** Recovered factory runtime; absent in older or unbundled findings. */
  readonly module_runtime?: string;
  readonly location: JavaScriptSourceRange;
}

/** Deterministic AST-only analysis of one JavaScript source file. */
export interface JavaScriptStaticAnalysis {
  /** Generic checks; Electron checks retain their dedicated proven-origin facet. */
  readonly sender_validations?: readonly JavaScriptSenderValidationFinding[];
  readonly shipped_material_candidates?: readonly {
    readonly literal_length: number;
    readonly value_sha256: string;
    readonly location: JavaScriptSourceRange;
  }[];
  /** Legacy aggregate of parsing and static-fact completeness; not syntax alone. */
  readonly parse_status: "complete" | "partial" | "failed";
  /** Actual parser outcome; absent in historical analysis. */
  readonly syntax_parse_status?: "complete" | "partial" | "failed";
  /** Coverage of admitted static facts, including syntax gaps and unresolved values. */
  readonly static_facts_status?: "complete" | "partial" | "failed";
  /** Discovery occurrences before deduplication, not distinct facts or semantic-IR unknowns. */
  readonly unresolved_static_occurrences?: number | null;
  readonly parse_error_count: number;
  readonly visited_ast_nodes: number;
  readonly references: readonly JavaScriptStaticReference[];
  readonly endpoints: readonly JavaScriptStaticEndpoint[];
  readonly storage: readonly JavaScriptStaticStorage[];
  readonly bundler_registrations: readonly JavaScriptBundlerRegistration[];
  readonly role_paths: readonly JavaScriptRolePath[];
  readonly source_map_urls: readonly {
    readonly declared_url: string;
    readonly location: JavaScriptSourceRange;
  }[];
  readonly vendors: readonly string[];
  readonly electron: ElectronStaticFindings;
  readonly limitations: readonly string[];
}

/** Sender-like syntax does not itself establish the messaging transport. */
export interface JavaScriptSenderValidationFinding {
  readonly subject:
    | "sender-url"
    | "sender-origin"
    | "sender-frame"
    | "sender-id"
    | "frame-id"
    | "process-id";
  readonly transport?: "electron" | "browser-extension" | "unknown";
  readonly mechanism: string;
  readonly expected: import("./electronStaticAnalysisTypes.js").ElectronStaticValue;
  readonly enforcement: "unknown";
  readonly module_key: string | null;
  readonly module_runtime?: string;
  readonly location: JavaScriptSourceRange;
}

/** Hard bounds applied to one AST-only JavaScript analysis. */
