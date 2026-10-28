import { expect, it } from "vitest";
import { writeFixtureFiles } from "../../support/javascriptApplicationFixture.js";
import { createTestTempDirectory } from "../../fixtures/temporaryDirectory.js";
import { reconstructJavaScriptArtifact } from "../../support/javascriptApplicationScope.js";

it("follows imported helper/mapValues argument candidates while retaining caller/helper identity and shadowed unknowns", async () => {
  const root = await createTestTempDirectory("rea-helper-args-");
  await writeFixtureFiles(root, {
    "helper.js": `import {contextBridge, ipcRenderer} from 'electron'; import mapValues from 'lodash/mapValues';
      const bridge = (namespace, {send = {}, on = {}}) => {
        const sendFns = mapValues(send, channel => (...args) => ipcRenderer.send(channel, ...args));
        const onFns = mapValues(on, channel => handler => ipcRenderer.on(channel, handler));
        return {preload() {contextBridge.exposeInMainWorld(namespace, {...sendFns, ...onFns});}};
      }; export default bridge;`,
    "constants.js": `export const SIGN_OUT = 'signOut'; export const APP = 'app';`,
    "preload.js": `import bridge from './helper'; import {SIGN_OUT, APP} from './constants';
      const api = bridge(APP, {send: {signOut: SIGN_OUT, overridden: 'wrong', overridden: SIGN_OUT}, on: {changed: 'changed'}});
      function shadow(bridge) {bridge('fake', {send: {fake: 'fake'}})}
      function shadowConstant(SIGN_OUT) {bridge('unknown', {send: {bad: SIGN_OUT}})}
      const options = {send: {go: 'stale-alias-channel'}};
      options.send = {go: 'updated-alias-channel'};
      bridge('mutated', options);
      bridge('prototype-only', {send: {__proto__: 'prototype-false-channel'}});
      const __proto__ = 'own-prototype-channel';
      bridge('own-prototype', {send: {__proto__}});
      api.preload();`,
    "local.js": `import {contextBridge, ipcRenderer} from 'electron'; function local(ns, api, channel) {contextBridge.exposeInMainWorld(ns, api); ipcRenderer.send(channel)} local('local', {go: true}, 'signOut');`,
    "main.js": `const {ipcMain} = require('electron'); ipcMain.on('signOut', () => {});`,
    "anonymous.js": `import {contextBridge, ipcRenderer} from 'electron'; export default (ns, channel) => {contextBridge.exposeInMainWorld(ns, {}); ipcRenderer.send(channel)};`,
    "anonymousCaller.js": `import bridge from './anonymous'; bridge('anonymous', 'anonymous-channel');`,
    "reassigned.js": `import {contextBridge, ipcRenderer} from 'electron'; let bridge = (ns, channel) => {contextBridge.exposeInMainWorld(ns, {}); ipcRenderer.send(channel)}; bridge = () => {}; bridge('reassigned', 'reassigned-channel');`,
  });
  const result = await reconstructJavaScriptArtifact({ input_path: root });
  expect(
    result.electron_summary.ipc.paired_renderer_transmissions,
  ).toBeGreaterThan(0);
  const channels = result.graph.nodes
    .filter((node) => node.kind === "ipc-channel")
    .flatMap((node) => node.observations);
  expect(channels).toEqual(
    expect.arrayContaining([
      expect.objectContaining({
        properties: expect.objectContaining({
          channel: "signOut",
          resolution: "helper-argument",
          helper_source: expect.objectContaining({ path: "helper.js" }),
        }),
        evidence: expect.objectContaining({ state: "inferred" }),
      }),
    ]),
  );
  const serialized = JSON.stringify(channels);
  expect(serialized).not.toContain('"channel":"fake"');
  expect(serialized).not.toContain('"channel":"wrong"');
  expect(serialized).not.toContain('"channel":"stale-alias-channel"');
  expect(serialized).not.toContain('"channel":"updated-alias-channel"');
  expect(serialized).not.toContain('"channel":"prototype-false-channel"');
  expect(serialized).toContain('"channel":"own-prototype-channel"');
  expect(serialized).not.toContain('"channel":"reassigned-channel"');
  expect(serialized).toContain('"channel":"anonymous-channel"');
  const bridges = result.graph.nodes
    .filter((node) => node.kind === "context-bridge-api")
    .flatMap((node) => node.observations);
  expect(bridges).toEqual(
    expect.arrayContaining([
      expect.objectContaining({
        properties: expect.objectContaining({
          api_key: "app",
          members: [],
          helper_candidates: expect.objectContaining({
            members: ["changed", "overridden", "signOut"],
          }),
        }),
      }),
    ]),
  );
});
