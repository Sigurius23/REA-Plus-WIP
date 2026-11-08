import type { ObjcSwiftMetadata } from "../domain/native/objcSwiftMetadata.js";
import { issue, type FacetDecodeFacts } from "./AppleDispatchDecodeFacts.js";
import type { Segment } from "./AppleMachoSelection.js";
import type { SwiftConformanceTailReader } from "./AppleSwiftConformanceTail.js";
import type {
  createSwiftRelativeReader,
  DispatchRecordBudget,
  SwiftDispatchReaders,
} from "./AppleSwiftDispatchFacets.js";
import {
  readSwiftConditionalRequirement,
  readSwiftConditionalPack,
  readSwiftWitnessTemplateEntry,
} from "./AppleSwiftWitnessTemplateRecords.js";

type Conformance = ObjcSwiftMetadata["swift_conformances"][number];
type Template = NonNullable<
  ObjcSwiftMetadata["swift_witness_templates"]
>[number];
const facet = "swift_witness_template_records";
interface Readers {
  readers: SwiftDispatchReaders;
  relative: ReturnType<typeof createSwiftRelativeReader>;
  segments: readonly Segment[];
  tail: SwiftConformanceTailReader;
  budget: DispatchRecordBudget;
  result: ObjcSwiftMetadata;
}
interface Selected {
  descriptor: bigint;
  flags: number;
  conformance: Conformance;
  protocol: bigint | null;
  pattern: bigint;
}
export interface SwiftWitnessTemplateObserver {
  decodeConformance(input: Selected): void;
  failedConformance(field: bigint, message: string): void;
  facts(): FacetDecodeFacts;
}

const populate = (input: Readers, selected: Selected, record: Template) => {
  const { readers: read, relative, budget } = input;
  const { descriptor, flags, protocol, pattern } = selected;
  const tail = input.tail(descriptor, flags);
  record.generic_control =
    tail.generic === null ? null : read.location(tail.generic);
  record.private_words = tail.control?.privateWords ?? null;
  record.instantiation_flag = tail.control?.instantiationFlag ?? null;
  record.instantiator = tail.control?.instantiatorLocation ?? null;
  record.private_data = tail.control?.privateDataLocation ?? null;
  if (tail.control !== null) {
    const { instantiator, privateData } = tail.control;
    const problems: string[] = [];
    if (
      instantiator.kind !== "local" ||
      (instantiator.address !== 0n &&
        !input.segments.some(
          (s) =>
            s.executable &&
            instantiator.address >= s.address &&
            instantiator.address < s.address + s.size,
        ))
    )
      problems.push(
        "Generic instantiator is unresolved or non-executable; it was not invoked",
      );
    if (privateData.kind !== "local")
      problems.push(
        "Generic private storage is not file-backed or unresolved; runtime storage was not read",
      );
    if (problems.length > 0)
      record.decode = { status: "partial", reason: problems.join("; ") };
  }
  if (tail.retroactive !== null) {
    const context = relative.resolve(tail.retroactive, "indirectable");
    record.retroactive_context = relative.inspect(
      tail.retroactive,
      "indirectable",
    ).record.target;
    if (context.kind !== "local" || context.address === 0n)
      record.decode = {
        status: "partial",
        reason: [
          record.decode.reason,
          "Retroactive context is missing or unresolved",
        ]
          .filter(Boolean)
          .join("; "),
      };
  }
  for (let i = 0; i < tail.conditionalCount; i++) {
    if (!budget.admit()) break;
    record.conditional_requirements.push(
      readSwiftConditionalRequirement(
        { read, relative },
        tail.conditional + BigInt(i * 12),
      ),
    );
  }
  for (let i = 0; i < tail.packCount; i++) {
    if (!budget.admit()) break;
    record.conditional_packs.push(
      readSwiftConditionalPack(read, tail.packs + BigInt(i * 8)),
    );
  }
  const stableProtocol =
    protocol !== null &&
    (read.u32(protocol) & 0x20000) === 0 &&
    (flags & 0x10000) === 0;
  const count = protocol === null ? null : read.u32(protocol + 16n);
  const signatureCount = protocol === null ? 0 : read.u32(protocol + 12n);
  if (tail.control !== null) {
    record.template_words = tail.control.words;
    record.extent_source = "generic_control";
  } else if (stableProtocol && count !== null) {
    record.template_words = count + 1;
    record.extent_source = "local_protocol";
  }
  if (record.template_words === null)
    throw new TypeError(
      "Template extent is unknown; no local stable protocol or generic size control",
    );
  if (record.template_words === 0 && pattern === 0n) return;
  if (record.template_words === 0 || pattern === 0n)
    throw new TypeError("Witness pattern/size is inconsistent");
  read.offset(pattern, record.template_words * 8);
  const header = read.pointer(pattern);
  if (header.kind !== "rebase" || header.target !== descriptor)
    throw new TypeError(
      "Witness pattern conformance header is unresolved or mismatched",
    );
  if (stableProtocol && protocol !== null && count !== null)
    read.offset(protocol, 24 + signatureCount * 12 + count * 8);
  for (let word = 1; word < record.template_words; word++) {
    if (!budget.admit()) break;
    const requirement =
      stableProtocol && protocol !== null && count !== null && word <= count
        ? protocol + 24n + BigInt(signatureCount * 12 + (word - 1) * 8)
        : null;
    record.entries.push(
      readSwiftWitnessTemplateEntry({
        read,
        relative,
        segments: input.segments,
        address: pattern + BigInt(word * 8),
        word,
        requirement,
      }),
    );
  }
};

/** Separate shipped template interpretation from runtime table population and dispatch. */
export const createSwiftWitnessTemplateReader = (
  input: Readers,
): SwiftWitnessTemplateObserver => {
  const { result, budget, readers: read } = input;
  const records: Template[] = [];
  result.swift_witness_templates = records;
  const issues: ReturnType<typeof issue>[] = [];
  let examined = 0;
  const failedConformance = (field: bigint, message: string) =>
    issues.push(
      issue(
        facet,
        "template_conformance_unresolved",
        message,
        `0x${field.toString(16)}`,
      ),
    );
  return {
    failedConformance,
    decodeConformance: (selected) => {
      examined++;
      if (!budget.admit()) return;
      const { descriptor, flags, conformance } = selected;
      const record: Template = {
        conformance: conformance.location,
        conformance_flags: flags,
        type_name: conformance.type_name,
        protocol_name: conformance.protocol_name,
        pattern: conformance.witness_table,
        generic_control: null,
        template_words: null,
        extent_source: "unresolved",
        private_words: null,
        instantiation_flag: null,
        instantiator: null,
        private_data: null,
        retroactive_context: null,
        conditional_requirement_count: (flags >>> 8) & 255,
        conditional_requirements: [],
        conditional_pack_count: flags >>> 24,
        conditional_packs: [],
        entries: [],
        runtime_witness_table: "not_observed",
        decode: { status: "decoded", reason: null },
        evidence: read.evidence(
          descriptor,
          "Static Swift witness template and conformance tails; no runtime table is instantiated or observed",
        ),
      };
      records.push(record);
      try {
        populate(input, selected, record);
      } catch (cause) {
        record.decode = {
          status: "partial",
          reason: cause instanceof Error ? cause.message : String(cause),
        };
      }
      const partial = [
        ...record.entries,
        ...record.conditional_requirements,
        ...record.conditional_packs,
      ].some(({ decode }) => decode.status !== "decoded");
      if (
        partial ||
        budget.truncated ||
        record.conditional_requirements.length <
          record.conditional_requirement_count ||
        record.conditional_packs.length < record.conditional_pack_count
      )
        record.decode = {
          status: "partial",
          reason: [
            record.decode.reason,
            partial ? "Some template/tail records remain unresolved" : null,
            budget.truncated ? "max_records_reached" : null,
          ]
            .filter(Boolean)
            .join("; "),
        };
      if (record.decode.status !== "decoded")
        failedConformance(
          descriptor,
          record.decode.reason ?? "Template records unresolved",
        );
    },
    facts: () => ({
      facet,
      examined,
      decoded: records.filter(({ decode }) => decode.status === "decoded")
        .length,
      exhaustive: !budget.truncated && issues.length === 0,
      issues,
    }),
  };
};
