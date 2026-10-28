#!/usr/bin/env node
// Terminal chat with glm-5.3-uncensored:free via the Experiential gateway
// (OpenAI Chat Completions API). Zero dependencies; Node >= 18 (fetch + streams).
//
// Usage:
//   export EXPLABS_API_KEY=...   # from the gateway Settings -> API Keys
//   node chat.mjs                # chat with consensus-project context loaded
//   node chat.mjs --no-context   # plain chat, no project docs
//
// In-chat commands: /exit (or Ctrl+C) quit, /clear reset history, /context reload docs.

const BASE_URL = "https://api.experientiallabs.ai/v1";
const MODEL = "glm-5.3-uncensored:free";
const CONTEXT_FILES = ["README.md", "web-app-observations.md"];

const apiKey = process.env.EXPLABS_API_KEY;
if (!apiKey) {
  console.error(`error: EXPLABS_API_KEY is not set.

  1. Create an API key: gateway dashboard -> Settings -> API Keys.
  2. Export it in your shell:
       export EXPLABS_API_KEY="your-key-here"
  3. Re-run: node chat.mjs`);
  process.exit(1);
}

const wantContext = !process.argv.includes("--no-context");
let contextDocs = "";
if (wantContext) {
  const parts = [];
  for (const f of CONTEXT_FILES) {
    try {
      const text = await import("node:fs/promises").then((fs) => fs.readFile(f, "utf8"));
      parts.push(`### ${f}\n${text}`);
    } catch {
      parts.push(`### ${f}\n(not found — skipped)`);
    }
  }
  contextDocs =
    `You are assisting on the "consensus-open-source-rebuild" project: a clean-room, ` +
    `Consensus-inspired open research assistant. Reference documents follow.\n\n` +
    parts.join("\n\n");
}

const systemPrompt =
  `You are a concise, hands-on engineering assistant working with the user on ` +
  `consensus-open-source-rebuild: paper search, cited synthesis, support/contest/inconclusive ` +
  `grouping, study snapshots, extraction tables, and library features built on documented ` +
  `public APIs (Consensus REST API / MCP, Semantic Scholar, OpenAlex, PubMed).` +
  (contextDocs ? `\n\n${contextDocs}` : "");

import readline from "node:readline";

const history = [{ role: "system", content: systemPrompt }];

const rl = readline.createInterface({ input: process.stdin, output: process.stdout, prompt: "you> " });
console.log(`chat with ${MODEL} via ${BASE_URL}`);
console.log("commands: /clear reset · /context reload docs · /exit quit");

function post(body) {
  return fetch(`${BASE_URL}/chat/completions`, {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
      Authorization: `Bearer ${apiKey}`,
    },
    body: JSON.stringify(body),
  });
}

async function complete() {
  const body = { model: MODEL, messages: history, stream: true, stream_options: { include_usage: true } };
  let res = await post(body);
  // Some gateways reject stream_options; retry once without it.
  if (!res.ok) {
    const text = await res.text();
    if (res.status === 400 && /stream_options/i.test(text)) {
      delete body.stream_options;
      res = await post(body);
    } else {
      console.error(`\ngateway error ${res.status}: ${text}`);
      return;
    }
  }
  if (!res.ok) {
    console.error(`\ngateway error ${res.status}: ${await res.text()}`);
    return;
  }

  process.stdout.write("\nassistant> ");
  let full = "";
  let usage = null;
  const decoder = new TextDecoder();
  let buf = "";
  for await (const chunk of res.body) {
    buf += decoder.decode(chunk, { stream: true });
    let idx;
    while ((idx = buf.indexOf("\n")) !== -1) {
      const line = buf.slice(0, idx).trim();
      buf = buf.slice(idx + 1);
      if (!line.startsWith("data:")) continue;
      const payload = line.slice(5).trim();
      if (payload === "[DONE]") continue;
      let json;
      try {
        json = JSON.parse(payload);
      } catch {
        continue; // keep-alive or partial line
      }
      if (json.usage) usage = json.usage;
      const delta = json.choices?.[0]?.delta?.content;
      if (delta) {
        full += delta;
        process.stdout.write(delta);
      }
    }
  }
  if (full) history.push({ role: "assistant", content: full });
  if (usage) {
    console.log(
      `\n  usage — prompt: ${usage.prompt_tokens} · completion: ${usage.completion_tokens} · total: ${usage.total_tokens}`
    );
  } else {
    console.log();
  }
}

async function reloadContext() {
  console.log("reloading context docs…");
  // Rebuild the system message in place.
  if (history[0]?.role === "system") {
    // no-op callback hook for future use
  }
  console.log("(docs were loaded at startup; restart to reload without /clear)");
}

rl.prompt();
rl.on("line", (line) => {
  const trimmed = line.trim();
  if (!trimmed) {
    rl.prompt();
    return;
  }
  if (trimmed === "/exit" || trimmed === "/quit") {
    rl.close();
    return;
  }
  if (trimmed === "/clear") {
    history.length = 0;
    history.push({ role: "system", content: systemPrompt });
    console.log("history cleared.");
    rl.prompt();
    return;
  }
  if (trimmed === "/context") {
    void reloadContext().then(() => rl.prompt());
    return;
  }
  history.push({ role: "user", content: trimmed });
  void complete().then(() => rl.prompt());
});
