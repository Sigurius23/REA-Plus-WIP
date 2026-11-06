import { expect, it } from "vitest";

import { analyzeJavaScriptSemantics } from "./javascriptSemanticAnalysis.js";

it.each([
  "function receive(value) { consume(value); } bus.on('owned-event', receive);",
  "const receive = value => consume(value); const alias = receive; bus.once('owned-event', alias);",
  "bus.prependListener('owned-event', function receive(value) { consume(value); });",
  "bus.on('owned-event', value => consume(value));",
])("retains exact local callback identity for %s", (source) => {
  const ir = analyzeJavaScriptSemantics(source);
  const event = ir.eventOperations[0];
  const target = ir.callables.find(
    ({ callableId }) => callableId === event?.listenerTarget?.callableId,
  );
  expect(target?.kind).toBe("function");
  expect(event?.listenerTarget?.reason).toBeNull();
  expect(event?.eventProfile).toBe("event-emitter");
});

it.each([
  "let receive = () => {}; receive = other; bus.on('x', receive);",
  "function receive() {} receive = other; bus.on('x', receive);",
  "function run(receive) { receive = () => {}; bus.on('x', receive); }",
  "function run(receive = () => {}) { bus.on('x', receive); }",
  "try {} catch (receive) { bus.on('x', receive); }",
  "import receive from './outside.js'; bus.on('x', receive);",
  "if (flag) var receive = () => {}; bus.on('x', receive);",
  "const receive = flag ? () => {} : () => {}; bus.on('x', receive);",
  "const { receive } = { receive: () => {} }; bus.on('x', receive);",
  "const first = second; const second = first; bus.on('x', first);",
  "function receive() {} function run(receive) { bus.on('x', receive); }",
  "bus.on('x', handlers[key]);",
  "bus.on('x', receive.bind(null));",
  "bus.on('x');",
  "function receive() {} bus.on(...args, receive);",
  "function receive() {} document.addEventListener(...args, receive);",
  "chrome.tabs.onUpdated.addListener(...callbacks);",
  "const object = { receive() {} }; bus.on('x', object.receive);",
  "function receive() {} with (other) { bus.on('x', receive); }",
])("keeps an unsupported or changing callback unknown: %s", (source) => {
  const event = analyzeJavaScriptSemantics(source).eventOperations.find(
    ({ kind }) => kind === "register",
  );
  expect(event?.listenerTarget?.callableId).toBeNull();
  expect(event?.listenerTarget?.reason).toEqual(expect.any(String));
});

it("uses explicit browser callback positions while keeping dispatch partial", () => {
  const ir = analyzeJavaScriptSemantics(`
    function receive() {}
    chrome.tabs.onUpdated.addListener(receive);
    chrome.tabs.onUpdated.removeListener(receive);
    document.addEventListener('DOMContentLoaded', receive);
    window.removeEventListener('load', receive);
  `);
  expect(
    ir.eventOperations.map((operation) => ({
      profile: operation.eventProfile,
      kind: operation.kind,
      event: operation.eventName,
      resolution: operation.resolution,
      target: operation.listenerTarget?.callableId,
    })),
  ).toEqual([
    {
      profile: "chrome-event",
      kind: "register",
      event: "chrome.tabs.onUpdated",
      resolution: "partial",
      target: ir.callables[0]?.callableId,
    },
    {
      profile: "chrome-event",
      kind: "remove",
      event: "chrome.tabs.onUpdated",
      resolution: "partial",
      target: ir.callables[0]?.callableId,
    },
    {
      profile: "dom-event-target",
      kind: "register",
      event: "DOMContentLoaded",
      resolution: "partial",
      target: ir.callables[0]?.callableId,
    },
    {
      profile: "dom-event-target",
      kind: "remove",
      event: "load",
      resolution: "partial",
      target: ir.callables[0]?.callableId,
    },
  ]);
  expect(ir.eventOperations[0]?.emitterKey).toBe(
    ir.eventOperations[1]?.emitterKey,
  );
});

it.each([
  "function run(chrome) { chrome.tabs.onUpdated.addListener(() => {}); }",
  "function run(document) { document.addEventListener('x', () => {}); }",
  "function run(window) { window.addEventListener('x', () => {}); }",
  "chrome.tabs[resolveEvent()].addListener(() => {});",
  "chrome.tabs.onUpdated[resolveMethod()](() => {});",
  "const element = unknown(); element.addEventListener('x', () => {});",
])("does not assign a browser profile to %s", (source) => {
  const events = analyzeJavaScriptSemantics(source).eventOperations;
  expect(
    events.some(
      ({ eventProfile }) =>
        eventProfile === "chrome-event" || eventProfile === "dom-event-target",
    ),
  ).toBe(false);
  expect(
    events.some(({ listenerTarget }) => listenerTarget?.callableId != null),
  ).toBe(false);
});

it("keeps component boundaries in browser emitter identity", () => {
  const ir = analyzeJavaScriptSemantics(`
    chrome['tabs.part'].onUpdated.addListener(() => {});
    chrome.tabs.part.onUpdated.addListener(() => {});
  `);
  expect(ir.eventOperations[0]?.eventName).toBe(
    ir.eventOperations[1]?.eventName,
  );
  expect(ir.eventOperations[0]?.emitterKey).not.toBe(
    ir.eventOperations[1]?.emitterKey,
  );
});
