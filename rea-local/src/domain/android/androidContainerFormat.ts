/** Input formats admitted by the Android package analysis workflow. */
export const APK_CONTAINER_FORMATS = [
  "apk",
  "xapk",
  "apks",
  "apk-set",
  "aab",
] as const;

export type AndroidContainerFormat = (typeof APK_CONTAINER_FORMATS)[number];

/**
 * Narrow an admitted target to what the Android provider actually detected.
 * Partial observations and evidence must never claim a format the provider
 * did not gate on, so non-Android formats fail loudly here.
 */
export const admittedAndroidContainerFormat = (
  format: string,
): AndroidContainerFormat => {
  if (
    format === "apk" ||
    format === "xapk" ||
    format === "apks" ||
    format === "apk-set" ||
    format === "aab"
  )
    return format;
  throw new TypeError(
    `Android admission recorded an unexpected container format: ${format}`,
  );
};
