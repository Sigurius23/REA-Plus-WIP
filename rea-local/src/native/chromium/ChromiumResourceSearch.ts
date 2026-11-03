import { ArtifactReaderFailure } from "../../artifacts/ArtifactReader.js";
import { createHash } from "node:crypto";
import { setImmediate } from "node:timers/promises";
import { AnalysisCancelledError } from "../../domain/analysisErrorCore.js";
import type {
  ChromiumResourceSearch,
  SearchChromiumResourcesInput,
} from "../../domain/native/chromiumResourceSearch.js";
import {
  decodeChromiumResource,
  indexChromiumResourcePack,
} from "./ChromiumResourcePack.js";

const operation = "search_chromium_resources";
const hash = (bytes: Buffer) =>
  createHash("sha256").update(bytes).digest("hex");
class ResourceCapacity extends Error {}
const cancelled = (signal?: AbortSignal) => {
  if (signal?.aborted) throw new AnalysisCancelledError(operation);
};

const textMatch = (
  bytes: Buffer,
  needle: Buffer,
  offset: number,
  encoding: "utf8" | "utf16le",
): ChromiumResourceSearch["matches"][number]["text"] => {
  try {
    const text = new TextDecoder(encoding === "utf8" ? "utf-8" : "utf-16le", {
      fatal: true,
      ignoreBOM: true,
    }).decode(bytes);
    if (!Buffer.from(text, encoding).equals(bytes)) return null;
    const before = new TextDecoder(encoding === "utf8" ? "utf-8" : "utf-16le", {
      fatal: true,
      ignoreBOM: true,
    }).decode(bytes.subarray(0, offset));
    const matched = new TextDecoder(
      encoding === "utf8" ? "utf-8" : "utf-16le",
      { fatal: true, ignoreBOM: true },
    ).decode(needle);
    if (
      !Buffer.from(before, encoding).equals(bytes.subarray(0, offset)) ||
      !Buffer.from(matched, encoding).equals(needle)
    )
      return null;
    let start = Math.max(0, before.length - 128);
    let end = Math.min(text.length, before.length + 384);
    const splitsPair = (at: number) => {
      const left = text.charCodeAt(at - 1),
        right = text.charCodeAt(at);
      return (
        left >= 0xd800 && left <= 0xdbff && right >= 0xdc00 && right <= 0xdfff
      );
    };
    // Move inward so a bounded preview never publishes half an astral character.
    if (splitsPair(start)) start++;
    if (splitsPair(end)) end--;
    return {
      encoding,
      utf16_offset: before.length,
      utf16_length: matched.length,
      preview: text.slice(start, end),
    };
  } catch {
    return null;
  }
};

/** Parse once and decode each admitted canonical payload once; binary matches remain valid. */
export const searchChromiumResourcePack = async (
  bytes: Buffer,
  artifact: ChromiumResourceSearch["artifact"],
  input: SearchChromiumResourcesInput,
  signal?: AbortSignal,
): Promise<ChromiumResourceSearch> => {
  cancelled(signal);
  const index = await indexChromiumResourcePack(bytes, signal, operation);
  const needle = Buffer.from(input.query, input.query_encoding);
  const matches: ChromiumResourceSearch["matches"] = [];
  const skipped: ChromiumResourceSearch["skipped"] = [];
  const identities = new Map<
    number,
    ChromiumResourceSearch["matches"][number]["identities"]
  >();
  for (const row of index.rows) {
    const group = identities.get(row.index) ?? [];
    group.push({
      resource_id: row.id,
      table_location: { offset: row.at, bytes: row.alias ? 4 : 6 },
    });
    identities.set(row.index, group);
  }
  let examined = 0,
    decoded = 0,
    observed = 0,
    charged = 0;
  let cursor = Math.min(input.canonical_offset, index.canonical.length);
  let stop: ChromiumResourceSearch["page"]["stop_reason"] = "end";
  while (cursor < index.canonical.length) {
    cancelled(signal);
    if (examined >= input.scan_limit) {
      stop = "scan_limit";
      break;
    }
    if (matches.length >= input.match_limit) {
      stop = "match_limit";
      break;
    }
    const target = index.canonical[cursor];
    if (!target) throw new Error("Validated canonical resource is absent");
    const entry = index.entry({
      id: target.id,
      index: cursor,
      at: target.at,
      alias: false,
    });
    const stored = bytes.subarray(target.offset, target.end);
    const declared = entry.compression.declared_decoded_bytes;
    if (
      stored.length > input.max_resource_bytes ||
      (declared !== null && declared > input.max_resource_bytes)
    ) {
      skipped.push({
        entry,
        reason: "resource_budget",
        message:
          "Stored or declared decoded bytes exceed max_resource_bytes; raise that knob up to 8388608. Unchanged limits reproduce the skip.",
      });
      examined++;
      cursor++;
      continue;
    }
    // Unknown expansion (gzip) reserves the full per-resource output bound before
    // the decoder runs. Failed attempts conservatively consume this reservation.
    const reservation =
      entry.compression.kind === "none"
        ? stored.length
        : input.max_resource_bytes;
    if (reservation > input.max_total_decoded_bytes - charged) {
      stop = "decoded_budget";
      break;
    }
    examined++;
    cursor++;
    try {
      const content = decodeChromiumResource(
        stored,
        entry,
        input.max_resource_bytes,
        () => {
          throw new ResourceCapacity(
            "Decoded resource exceeds max_resource_bytes",
          );
        },
        operation,
      );
      observed += content.bytes.length;
      charged += content.bytes.length;
      decoded++;
      const at = content.bytes.indexOf(needle);
      if (at !== -1)
        matches.push({
          entry,
          identities: identities.get(entry.canonical_index) ?? [],
          codec: content.codec,
          decoded_bytes: content.bytes.length,
          decoded_sha256: hash(content.bytes),
          byte_range: { offset: at, bytes: needle.length },
          text: textMatch(content.bytes, needle, at, input.query_encoding),
        });
    } catch (cause) {
      if (
        !(cause instanceof ResourceCapacity) &&
        !(cause instanceof ArtifactReaderFailure)
      )
        throw cause;
      charged += reservation;
      skipped.push({
        entry,
        reason:
          cause instanceof ResourceCapacity
            ? "resource_budget"
            : "decode_failed",
        message: cause instanceof Error ? cause.message : String(cause),
      });
    }
    await setImmediate();
  }
  cancelled(signal);
  const next = cursor < index.canonical.length ? cursor : null;
  const completeWindow =
    skipped.length === 0 && (stop === "end" || stop === "scan_limit");
  return {
    artifact,
    format: "chromium-datapack",
    version: index.version,
    encoding: index.encoding,
    canonical_resources: index.canonical_resources,
    alias_resources: index.alias_resources,
    query: {
      literal: input.query,
      encoding: input.query_encoding,
      bytes: needle.length,
      sha256: hash(needle),
    },
    page: {
      canonical_offset: input.canonical_offset,
      scan_limit: input.scan_limit,
      match_limit: input.match_limit,
      examined,
      decoded,
      next_canonical_offset: next,
      stop_reason: stop,
    },
    budgets: {
      max_resource_bytes: input.max_resource_bytes,
      max_total_decoded_bytes: input.max_total_decoded_bytes,
      observed_decoded_bytes: observed,
      charged_decoded_bytes: charged,
    },
    matches,
    skipped,
    coverage: {
      index: "complete",
      window: completeWindow ? "complete" : "partial",
      pack:
        input.canonical_offset === 0 && next === null && completeWindow
          ? "complete"
          : "partial",
    },
    limitations: [
      "First case-sensitive literal byte occurrence per canonical payload; aliases share one decode. No filename, MIME type or runtime use is inferred.",
      "Query encoding encodes the needle only. Binary and invalid-text payloads are searched; text ranges require a lossless whole-payload decode and proven match boundaries. BOMs are preserved.",
      "Continue next_canonical_offset against expected_sha256. A complete window is not complete pack coverage. Skipped resources remain unknown.",
      "Unknown compressed expansion reserves max_resource_bytes before admission. Failed decoder attempts charge their reservation; observed bytes exclude unobservable failed output.",
      "For decoded_budget, resume at the unchanged next cursor with a larger max_total_decoded_bytes or smaller max_resource_bytes. Unchanged budgets reproduce the stop. Cancellation returns a typed error, not partial Evidence.",
    ],
  };
};
