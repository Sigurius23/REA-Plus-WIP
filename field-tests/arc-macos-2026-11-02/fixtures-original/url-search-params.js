// Owned reproducer: query parameter keys are not network endpoints.
export function videoId(videoURL) {
  const url = new URL(videoURL);
  return url.searchParams.get("v");
}
export async function positiveControl() {
  return fetch("https://example.invalid/control");
}
