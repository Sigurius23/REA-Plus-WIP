import { describe, expect, it } from "vitest";

import { analyzeJavaScriptStaticSource } from "./javascriptStaticAnalysis.js";

describe("Electron API identity", () => {
  it("recovers APIs through an ES module default import of Electron", () => {
    const analysis = analyzeJavaScriptStaticSource(`
      import electron from "electron";
      const { ipcMain } = electron;
      new electron.BrowserWindow({ webPreferences: { preload: "./preload.js" } });
      electron.contextBridge.exposeInMainWorld("api", { ping: true });
      electron.ipcRenderer.invoke("default:ping");
      ipcMain.handle("destructured:ping", () => "pong");
      electron.default.ipcMain.handle("nested-default", () => "local");
    `);

    expect(analysis.electron.browser_windows).toMatchObject([
      { preload_path: "./preload.js" },
    ]);
    expect(analysis.electron.context_bridge_apis).toMatchObject([
      { api_key: "api", members: ["ping"] },
    ]);
    expect(
      analysis.electron.ipc.map(({ side, operation, channel }) => ({
        side,
        operation,
        channel,
      })),
    ).toEqual([
      { side: "renderer", operation: "invoke", channel: "default:ping" },
      { side: "main", operation: "handle", channel: "destructured:ping" },
    ]);
  });

  it("recovers APIs and sender checks written with optional chaining", () => {
    const analysis = analyzeJavaScriptStaticSource(`
      const { contextBridge, ipcMain, utilityProcess } = require("electron");
      contextBridge?.exposeInMainWorld("api", {});
      utilityProcess?.fork("./worker.js");
      ipcMain?.handle("optional:ping", (event) => {
        if (!event.senderFrame?.url.startsWith("file://")) return null;
        return event.sender?.getURL() === "file:///index.html";
      });
    `);

    expect(analysis.electron.context_bridge_apis).toMatchObject([
      { api_key: "api" },
    ]);
    expect(analysis.electron.utility_processes).toMatchObject([
      { module_path: "./worker.js" },
    ]);
    expect(analysis.electron.ipc).toMatchObject([
      { side: "main", operation: "handle", channel: "optional:ping" },
    ]);
    expect(
      analysis.electron.sender_validations.map(
        ({ subject, mechanism, expected }) => ({
          subject,
          mechanism,
          expected: expected.value,
        }),
      ),
    ).toEqual([
      {
        subject: "sender-url",
        mechanism: "call:startsWith",
        expected: "file://",
      },
      {
        subject: "sender-url",
        mechanism: "comparison:===",
        expected: "file:///index.html",
      },
    ]);
  });
});

describe("Sender transport authority", () => {
  it("keeps browser and helper checks generic while proving Electron event projections", () => {
    const analysis = analyzeJavaScriptStaticSource(`
      import {ipcMain} from 'electron';
      ipcMain.handle('trusted', event => {
        const sender = event.sender;
        const {senderFrame: frame} = event;
        return sender.id === 42 && frame.origin === 'https://trusted.invalid';
      });
      browser.runtime.onMessage.addListener((message, source) => {
        return source.id === 'extension-id' && source.url.startsWith('https://');
      });
      function helper(event) { return event.sender.id === 123; }
    `);
    expect(analysis.electron.sender_validations).toMatchObject([
      { subject: "sender-id", transport: "electron", expected: { value: 42 } },
      {
        subject: "sender-origin",
        transport: "electron",
        expected: { value: "https://trusted.invalid" },
      },
    ]);
    expect(analysis.sender_validations).toMatchObject([
      {
        subject: "sender-id",
        transport: "browser-extension",
        expected: { value: "extension-id" },
        enforcement: "unknown",
      },
      {
        subject: "sender-url",
        transport: "browser-extension",
        expected: { value: "https://" },
      },
      { subject: "sender-id", transport: "unknown", expected: { value: 123 } },
    ]);
  });

  it("does not promote reassigned, mutated or shadowed callback values", () => {
    const analysis = analyzeJavaScriptStaticSource(`
      import {ipcMain} from 'electron';
      ipcMain.handle('assignment', event => {
        event = other;
        return event.sender.id === 1;
      });
      ipcMain.handle('mutation', event => {
        const sender = event.sender;
        sender.id = custom;
        return event.sender.id === 2;
      });
      ipcMain.handle('nested', event => {
        function nested(event) { return event.sender.id === 3; }
      });
      function shadow(ipcMain) {
        ipcMain.handle('local', event => event.sender.id === 4);
      }
      function customBrowser(chrome) {
        chrome.runtime.onMessage.addListener((message, sender) => sender.id === 5);
      }
    `);
    expect(analysis.electron.sender_validations).toEqual([]);
    expect(
      analysis.sender_validations?.map((v) => ({
        value: v.expected.value,
        transport: v.transport,
      })),
    ).toEqual([
      { value: 1, transport: "unknown" },
      { value: 2, transport: "unknown" },
      { value: 3, transport: "unknown" },
      { value: 4, transport: "unknown" },
      { value: 5, transport: "unknown" },
    ]);
  });
});
