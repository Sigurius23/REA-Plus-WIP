// Owned reproducer, matching Arc's mutable try/catch URL binding.
export function videoId(videoURL) {
  let url;
  try { url = new URL(videoURL); } catch { return null; }
  return url.searchParams.get("v");
}
export async function positiveControl() {
  return fetch("https://example.invalid/control");
}
