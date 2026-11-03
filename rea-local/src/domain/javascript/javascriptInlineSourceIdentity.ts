import type { JavaScriptInlineSourceOrigin } from "./javascriptArtifactFiles.js";

type InlineIdentity = Pick<
  JavaScriptInlineSourceOrigin,
  "html_path" | "start_offset" | "end_offset" | "script_kind"
>;

/** Reserved logical identity; never a filesystem/ASAR member path. */
export const javaScriptInlineSourceUri = (origin: InlineIdentity): string =>
  `rea-inline-script://${encodeURIComponent(origin.html_path)}?start=${String(origin.start_offset)}&end=${String(origin.end_offset)}&kind=${origin.script_kind}`;

/** Admit only the canonical syntax of our source identity, not arbitrary URLs. */
export const isJavaScriptInlineSourceUri = (value: string): boolean => {
  const match =
    /^rea-inline-script:\/\/([^?]+)\?start=(0|[1-9][0-9]*)&end=(0|[1-9][0-9]*)&kind=(classic|module)$/u.exec(
      value,
    );
  if (match === null) return false;
  const encodedPath = match[1];
  if (encodedPath === undefined) return false;
  try {
    const path = decodeURIComponent(encodedPath);
    const start = Number(match[2]);
    const end = Number(match[3]);
    return (
      encodeURIComponent(path) === encodedPath &&
      !path.startsWith("/") &&
      !path.includes("\\") &&
      path.split("/").every((part) => !["", ".", ".."].includes(part)) &&
      Number.isSafeInteger(start) &&
      Number.isSafeInteger(end) &&
      end > start
    );
  } catch {
    return false;
  }
};
