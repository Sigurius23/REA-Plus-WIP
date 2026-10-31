import { describe, expect, it } from "vitest";

import { inspectNativeDispatchMetadata } from "./objcSwiftMetadata.js";

describe("ObjC/Swift metadata", () => {
  it.each(["swift-conformances", "swift-vtables"] as const)(
    "keeps a requested binary %s facet unsupported for a symbol-only provider",
    (facet) => {
      const result = inspectNativeDispatchMetadata(
        [
          { address: "0x1000", name: "OBJC_CLASS_$_Unrequested" },
          { address: "0x2000", name: "$s5Store7launchyyF" },
        ],
        100,
        facet,
      );
      expect(result.objc_classes).toEqual([]);
      expect(result.swift_symbols).toEqual([]);
      expect(
        result.coverage.find(
          ({ facet: name }) => name === "objc_class_symbols",
        ),
      ).toMatchObject({ status: "not_requested", examined: 0 });
      expect(
        result.coverage.find(
          ({ facet: name }) =>
            name ===
            (facet === "swift-vtables"
              ? "swift_class_vtable_descriptors"
              : "swift_conformances_static_witness_slots"),
        ),
      ).toMatchObject({ status: "unsupported", examined: 0 });
    },
  );

  it("does not include Swift symbols in an Objective-C-only selection", () => {
    const result = inspectNativeDispatchMetadata(
      [
        { address: "0x2000", name: "$s5Store7launchyyF" },
        { address: "0x1000", name: "OBJC_CLASS_$_Widget" },
      ],
      1,
      "objc",
    );
    expect(result.objc_classes).toHaveLength(1);
    expect(result.swift_symbols).toEqual([]);
    expect(
      result.coverage.find(({ facet }) => facet === "swift_dispatch_tables"),
    ).toMatchObject({ status: "not_requested" });
  });

  it("bounds symbol projections and labels symbol-only metadata as partial", () => {
    const result = inspectNativeDispatchMetadata(
      [
        { address: "ram:0x1000", name: "OBJC_CLASS_$_StoreController" },
        { address: "ram:0x2000", name: "-[StoreController buildTapped:]" },
        { address: "ram:0x3000", name: "$s5Store7launchyyF" },
      ],
      2,
    );
    expect(result.objc_classes).toHaveLength(1);
    expect(result.objc_dispatch_implementations).toHaveLength(1);
    expect(result.objc_classes[0]).toMatchObject({
      is_meta_class: null,
      is_root_class: null,
      ivar_count: null,
    });
    expect(result.objc_classes[0]?.methods[0]).toMatchObject({
      is_required: null,
      is_optional: null,
    });
    expect(result.swift_symbols).toHaveLength(0);
    expect(result.coverage).toContainEqual(
      expect.objectContaining({
        facet: "objc_class_symbols",
        status: "partial",
        reason: expect.stringContaining("record_limit_reached"),
      }),
    );
    expect(result.coverage).toContainEqual(
      expect.objectContaining({
        facet: "swift_dispatch_tables",
        status: "unsupported",
      }),
    );
  });
});
