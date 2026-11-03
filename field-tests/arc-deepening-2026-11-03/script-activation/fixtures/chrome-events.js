function onUpdated(id, change, tab) {
  if (change.status === "complete") consume(id, tab.url);
}
chrome.tabs.onUpdated.addListener(onUpdated);
