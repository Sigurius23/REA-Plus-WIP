import { createHash } from "node:crypto";
import { mkdir, readFile, readdir, rm, writeFile } from "node:fs/promises";
import { join } from "node:path";

import { Uint8ArrayReader, Uint8ArrayWriter, ZipWriter } from "@zip.js/zip.js";
import { describe, expect, it } from "vitest";

import { ZipArtifactReader } from "../../../src/artifacts/ZipArtifactReader.js";
import { composeAndroidXapkBundle } from "../../../src/android/AndroidXapkBundle.js";
import { AnalysisCapabilityUnavailableError } from "../../../src/domain/analysisErrorCore.js";
import { createTestTempDirectory } from "../../fixtures/temporaryDirectory.js";

const DEX_BYTES = Uint8Array.from([
  0x64, 0x65, 0x78, 0x0a, 0x30, 0x33, 0x35, 0,
]);
const MANIFEST_BYTES = Uint8Array.from([3, 0, 8, 0]);
const RESOURCE_BYTES = Uint8Array.from([0x72, 0x65, 0x73, 0x73]);
const ELF_BYTES = Uint8Array.from([0x7f, 0x45, 0x4c, 0x46, 2, 1, 1, 0]);

const buildApk = async (
  entries: readonly (readonly [name: string, bytes: Uint8Array])[],
): Promise<Uint8Array> => {
  const writer = new ZipWriter(new Uint8ArrayWriter());
  for (const [name, bytes] of entries)
    await writer.add(name, new Uint8ArrayReader(bytes));
  return writer.close();
};

const buildXapk = async (
  entries: readonly (readonly [name: string, bytes: Uint8Array])[],
): Promise<Uint8Array> => {
  const writer = new ZipWriter(new Uint8ArrayWriter());
  for (const [name, bytes] of entries)
    await writer.add(name, new Uint8ArrayReader(bytes));
  const bytes = await writer.close();
  return bytes;
};

const writeFixture = async (
  root: string,
  name: string,
  bytes: Uint8Array,
): Promise<string> => {
  const path = join(root, name);
  await writeFile(path, bytes);
  return path;
};

const entryBytes = async (
  path: string,
  name: string,
): Promise<Uint8Array | undefined> => {
  const reader = new ZipArtifactReader(path, "apk", undefined, undefined);
  try {
    for await (const entry of reader.entries()) {
      if (entry.path !== name) continue;
      const source = await reader.open(entry);
      const chunks: Buffer[] = [];
      for await (const chunk of source)
        chunks.push(Buffer.isBuffer(chunk) ? chunk : Buffer.from(chunk));
      return Buffer.concat(chunks);
    }
    return undefined;
  } finally {
    await reader.close();
  }
};

describe("XAPK bundle admission", () => {
  it.each([
    { baseName: "base.apk", manifest: {} },
    {
      baseName: "Com.Whoop.Android.apk",
      manifest: {
        package_name: "com.whoop.android",
        split_apks: [
          { id: "base", file: "Com.Whoop.Android.apk" },
          { id: "config.arm64", file: "split_config.arm64_v8a.apk" },
        ],
      },
    },
    {
      baseName: "com.whoop.android.apk",
      manifest: { package_name: "com.whoop.android" },
    },
  ])(
    "composes base $baseName with split DEX entries",
    async ({ baseName, manifest }) => {
      const root = await createTestTempDirectory("rea-xapk-");
      const base = await buildApk([
        ["AndroidManifest.xml", MANIFEST_BYTES],
        ["resources.arsc", RESOURCE_BYTES],
        ["classes.dex", DEX_BYTES],
        ["lib/arm64-v8a/libbase.so", ELF_BYTES],
      ]);
      const split = await buildApk([
        ["classes.dex", Uint8Array.from([1, 2, 3])],
        ["classes2.dex", Uint8Array.from([4, 5, 6, 7])],
        ["lib/arm64-v8a/libsplit.so", ELF_BYTES],
      ]);
      const container = await buildXapk([
        ["manifest.json", new TextEncoder().encode(JSON.stringify(manifest))],
        ["split_config.arm64_v8a.apk", split],
        [baseName, base],
      ]);
      const containerPath = await writeFixture(root, "Bundle.xapk", container);
      const runtimeRoot = join(root, "runtime");
      await mkdir(runtimeRoot);

      const snapshot = await composeAndroidXapkBundle(
        {
          path: containerPath,
          sha256: createHash("sha256").update(container).digest("hex"),
        },
        runtimeRoot,
        "inspect_android_package",
        new AbortController().signal,
      );

      expect(snapshot.members).toEqual([
        baseName,
        "split_config.arm64_v8a.apk",
      ]);
      expect(snapshot.mergedMembers).toEqual([
        baseName,
        "split_config.arm64_v8a.apk",
      ]);
      expect(snapshot.limitations.join(" ")).toContain(
        "split_config.arm64_v8a",
      );
      expect(snapshot.limitations.join(" ")).toContain(baseName);
      expect(await existsOnDisk(snapshot.path)).toBe(true);
      const observed = await readFile(snapshot.path);
      expect(snapshot.sha256).toBe(
        createHash("sha256").update(observed).digest("hex"),
      );

      // The composed image keeps base entries verbatim, adds split DEX entries,
      // and only lets colliding split names through under splits/<member>/.
      expect(await entryBytes(snapshot.path, "AndroidManifest.xml")).toEqual(
        Buffer.from(MANIFEST_BYTES),
      );
      expect(await entryBytes(snapshot.path, "resources.arsc")).toEqual(
        Buffer.from(RESOURCE_BYTES),
      );
      expect(await entryBytes(snapshot.path, "classes.dex")).toEqual(
        Buffer.from(DEX_BYTES),
      );
      expect(await entryBytes(snapshot.path, "classes2.dex")).toEqual(
        Buffer.from([4, 5, 6, 7]),
      );
      expect(
        await entryBytes(
          snapshot.path,
          "splits/split_config.arm64_v8a/classes.dex",
        ),
      ).toEqual(Buffer.from([1, 2, 3]));
      expect(
        await entryBytes(snapshot.path, "lib/arm64-v8a/libbase.so"),
      ).toEqual(Buffer.from(ELF_BYTES));
      // Split resources and native libraries stay out of the merged image.
      expect(
        await entryBytes(snapshot.path, "lib/arm64-v8a/libsplit.so"),
      ).toBeUndefined();

      // Staged member APKs are transient admission state inside the runtime root.
      expect(await readdir(runtimeRoot)).toEqual(["bundle.apk"]);

      await rm(snapshot.path, { force: true });
    },
  );
});

describe("XAPK manifest validation", () => {
  it.each([
    { name: "invalid JSON", manifest: "{", reason: /valid UTF-8 JSON/u },
    {
      name: "invalid schema",
      manifest: '{"split_apks":{}}',
      reason: /invalid.*metadata/u,
    },
    {
      name: "multiple base declarations",
      manifest: JSON.stringify({
        split_apks: [
          { id: "base", file: "base.apk" },
          { id: "base", file: "com.whoop.android.apk" },
        ],
      }),
      reason: /duplicate module/u,
    },
    {
      name: "conflicting file roles",
      manifest: JSON.stringify({
        split_apks: [
          { id: "base", file: "base.apk" },
          { id: "config", file: "base.apk" },
        ],
      }),
      reason: /duplicate module/u,
    },
    {
      name: "missing declared base despite fallback filename",
      manifest: JSON.stringify({
        split_apks: [{ id: "base", file: "missing.apk" }],
      }),
      reason: /not a readable top-level/u,
    },
    {
      name: "path traversal declaration",
      manifest: JSON.stringify({
        split_apks: [{ id: "base", file: "../base.apk" }],
      }),
      reason: /not a readable top-level/u,
    },
    {
      name: "ambiguous filename fallbacks",
      manifest: '{"package_name":"com.whoop.android"}',
      reason: /ambiguous base APK/u,
    },
    {
      name: "manifest beyond memory budget",
      manifest: " ".repeat(1024 * 1024) + "{}",
      reason: /JSON memory budget/u,
    },
  ])(
    "refuses $name before creating an analysis image",
    async ({ manifest, reason }) => {
      const root = await createTestTempDirectory("rea-xapk-invalid-manifest-");
      const apk = await buildApk([["classes.dex", DEX_BYTES]]);
      const container = await buildXapk([
        ["manifest.json", new TextEncoder().encode(manifest)],
        ["base.apk", apk],
        ["com.whoop.android.apk", apk],
      ]);
      const path = await writeFixture(root, "Bundle.xapk", container);
      const runtime = join(root, "runtime");
      await mkdir(runtime);
      await expect(
        composeAndroidXapkBundle(
          {
            path,
            sha256: createHash("sha256").update(container).digest("hex"),
          },
          runtime,
          "inspect_android_package",
          new AbortController().signal,
        ),
      ).rejects.toMatchObject({
        _tag: "AnalysisInputError",
        issues: [{ path: ["path"], message: expect.stringMatching(reason) }],
      });
      expect(await readdir(runtime)).toEqual([]);
    },
  );
});

describe("XAPK base selection", () => {
  it("uses the declared base rather than a competing conventional filename", async () => {
    const root = await createTestTempDirectory("rea-xapk-explicit-base-");
    const base = await buildApk([
      ["AndroidManifest.xml", MANIFEST_BYTES],
      ["classes.dex", DEX_BYTES],
    ]);
    const split = await buildApk([
      ["AndroidManifest.xml", Buffer.from("split")],
    ]);
    const container = await buildXapk([
      [
        "manifest.json",
        Buffer.from(
          JSON.stringify({
            split_apks: [
              { id: "base", file: "com.whoop.android.apk" },
              { id: "config", file: "base.apk" },
            ],
          }),
        ),
      ],
      ["base.apk", split],
      ["com.whoop.android.apk", base],
    ]);
    const path = await writeFixture(root, "Bundle.xapk", container);
    const runtime = join(root, "runtime");
    await mkdir(runtime);
    const snapshot = await composeAndroidXapkBundle(
      { path, sha256: createHash("sha256").update(container).digest("hex") },
      runtime,
      "inspect_android_package",
      new AbortController().signal,
    );
    expect(await entryBytes(snapshot.path, "AndroidManifest.xml")).toEqual(
      Buffer.from(MANIFEST_BYTES),
    );
    expect(snapshot.members).toEqual(["com.whoop.android.apk", "base.apk"]);
    expect(snapshot.mergedMembers).toEqual(["com.whoop.android.apk"]);
    expect(snapshot.limitations.join(" ")).toContain(
      "com.whoop.android.apk only",
    );
  });

  it("refuses a XAPK without a readable top-level base module", async () => {
    const root = await createTestTempDirectory("rea-xapk-missing-base-");
    const split = await buildApk([["classes2.dex", DEX_BYTES]]);
    const container = await buildXapk([
      ["manifest.json", new TextEncoder().encode("{}")],
      ["splits/base.apk", split],
    ]);
    const containerPath = await writeFixture(root, "Bundle.xapk", container);

    await expect(
      composeAndroidXapkBundle(
        {
          path: containerPath,
          sha256: createHash("sha256").update(container).digest("hex"),
        },
        join(root, "runtime"),
        "inspect_android_package",
        new AbortController().signal,
      ),
    ).rejects.toThrow(AnalysisCapabilityUnavailableError);
  });

  it("refuses a ZIP package without the XAPK manifest", async () => {
    const root = await createTestTempDirectory("rea-xapk-manifest-");
    const container = await buildXapk([
      ["metadata.json", new TextEncoder().encode("{}")],
    ]);
    const containerPath = await writeFixture(root, "Bundle.xapk", container);

    await expect(
      composeAndroidXapkBundle(
        {
          path: containerPath,
          sha256: createHash("sha256").update(container).digest("hex"),
        },
        join(root, "runtime"),
        "inspect_android_package",
        new AbortController().signal,
      ),
    ).rejects.toThrow(/manifest\.json/u);
  });
});

const existsOnDisk = async (path: string): Promise<boolean> => {
  const bytes = await readFile(path).catch(() => undefined);
  return bytes !== undefined && bytes.length > 0;
};

it("admits explicit nested .apks variants and retains original members only for requested signature checks", async () => {
  const root = await createTestTempDirectory("rea-apks-selection-");
  const base = await buildApk([
    ["AndroidManifest.xml", MANIFEST_BYTES],
    ["classes.dex", DEX_BYTES],
  ]);
  const split = await buildApk([["classes.dex", DEX_BYTES]]);
  const path = await writeFixture(
    root,
    "selected.apks",
    await buildXapk([
      ["splits/base-master.apk", base],
      ["splits/feature-master.apk", split],
      ["standalones/other.apk", base],
    ]),
  );
  const sha256 = createHash("sha256")
    .update(await readFile(path))
    .digest("hex");
  const signal = new AbortController().signal;
  await expect(
    composeAndroidXapkBundle(
      { path, sha256 },
      root,
      "search_android_classes",
      signal,
      false,
      { format: "apks" },
    ),
  ).rejects.toMatchObject({
    issues: [
      expect.objectContaining({
        message: expect.stringContaining("nested/device-specific"),
      }),
    ],
  });
  const result = await composeAndroidXapkBundle(
    { path, sha256 },
    root,
    "search_android_classes",
    signal,
    true,
    {
      format: "apks",
      apk_members: ["splits/base-master.apk", "splits/feature-master.apk"],
      base_apk: "splits/base-master.apk",
    },
  );
  expect(result.members).toEqual([
    "splits/base-master.apk",
    "splits/feature-master.apk",
  ]);
  expect(result.verificationMembers).toHaveLength(2);
  for (const member of result.verificationMembers)
    expect(
      createHash("sha256")
        .update(await readFile(member.path))
        .digest("hex"),
    ).toBe(member.sha256);
  expect(
    await entryBytes(result.path, "splits/splits/feature-master/classes.dex"),
  ).toEqual(Buffer.from(DEX_BYTES));
});

it("binds loose-set names and bytes to admission and rejects a member changed before composition", async () => {
  const root = await createTestTempDirectory("rea-apk-directory-");
  const input = join(root, "input");
  const output = join(root, "output");
  await mkdir(input);
  await mkdir(output);
  const base = await buildApk([
    ["AndroidManifest.xml", MANIFEST_BYTES],
    ["classes.dex", DEX_BYTES],
  ]);
  await writeFile(join(input, "base.apk"), base);
  const { resolveAndroidPackageSetTarget } =
    await import("../../../src/application/android/AndroidPackageSetTarget.js");
  const signal = new AbortController().signal;
  const target = await resolveAndroidPackageSetTarget(
    input,
    "inspect_android_package",
    undefined,
    signal,
  );
  if (target === null) throw new Error("Expected package set");
  expect(target.apkSetMembers).toMatchObject([
    { name: "base.apk", bytes: base.length },
  ]);
  await writeFile(
    join(input, "base.apk"),
    await buildApk([
      ["AndroidManifest.xml", MANIFEST_BYTES],
      ["classes.dex", Uint8Array.from([...DEX_BYTES, 1])],
    ]),
  );
  await expect(
    composeAndroidXapkBundle(
      target,
      output,
      "inspect_android_package",
      signal,
      false,
      { format: "apk-set", directory_members: target.apkSetMembers },
    ),
  ).rejects.toMatchObject({
    issues: [
      expect.objectContaining({
        message: expect.stringContaining("changed after loose-set admission"),
      }),
    ],
  });
});
