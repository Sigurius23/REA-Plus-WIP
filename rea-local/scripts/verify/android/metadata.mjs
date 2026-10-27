import assert from "node:assert/strict";
import { mkdir, mkdtemp, readdir, rm } from "node:fs/promises";
import { tmpdir } from "node:os";
import { delimiter, join, resolve } from "node:path";

/** Prove parsed metadata and annotation values survive real code generation. */
export const verifyAndroidMetadata = async ({
  java,
  jar,
  apk,
  bridge,
  repository,
  execute,
  jvmArguments = [],
}) => {
  const javac =
    process.env.JAVA_HOME === undefined
      ? "javac"
      : resolve(
          process.env.JAVA_HOME,
          "bin",
          process.platform === "win32" ? "javac.exe" : "javac",
        );
  try {
    await execute(javac, ["-version"], { timeout: 10_000 });
  } catch (cause) {
    throw new Error(
      "verify:android metadata requires the full selected JDK, including javac",
      { cause },
    );
  }
  const classes = await mkdtemp(join(tmpdir(), "rea-android-metadata-"));
  try {
    const fixtureClasses = join(classes, "fixture-classes");
    const fixtureDex = join(classes, "fixture-dex");
    await mkdir(fixtureClasses);
    await mkdir(fixtureDex);
    await execute(
      javac,
      [
        ...jvmArguments.map((argument) => `-J${argument}`),
        "--release",
        "8",
        "-d",
        fixtureClasses,
        resolve(
          repository,
          "tests/fixtures/android/annotations/AnnotationFixture.java",
        ),
      ],
      { timeout: 30_000 },
    );
    const fixtureFiles = (await readdir(fixtureClasses, { recursive: true }))
      .filter((path) => path.endsWith(".class"))
      .sort()
      .map((path) => join(fixtureClasses, path));
    // The pinned engine includes D8; no Android SDK or additional download is needed.
    await execute(
      java,
      [
        ...jvmArguments,
        "-classpath",
        jar,
        "com.android.tools.r8.D8",
        "--min-api",
        "28",
        "--output",
        fixtureDex,
        ...fixtureFiles,
      ],
      { timeout: 30_000, maxBuffer: 8 * 1024 * 1024 },
    );
    await execute(
      javac,
      [
        ...jvmArguments.map((argument) => `-J${argument}`),
        "-classpath",
        jar,
        "-d",
        classes,
        bridge,
        resolve(
          repository,
          "tests/conformance/android/ReaJadxMetadataRegression.java",
        ),
      ],
      { timeout: 30_000 },
    );
    const result = await execute(
      java,
      [
        ...jvmArguments,
        "-classpath",
        `${classes}${delimiter}${jar}`,
        "ReaJadxMetadataRegression",
        apk,
        join(fixtureDex, "classes.dex"),
      ],
      { timeout: 120_000, maxBuffer: 8 * 1024 * 1024 },
    );
    assert.match(
      result.stdout,
      /METADATA_REGRESSION_PASS classes=\d+ overloads=3 annotations=2/u,
    );
    console.log(
      "PASS real cold metadata, generic types, overloaded methods and original annotation values after code generation",
    );
  } finally {
    await rm(classes, { recursive: true, force: true });
  }
};
