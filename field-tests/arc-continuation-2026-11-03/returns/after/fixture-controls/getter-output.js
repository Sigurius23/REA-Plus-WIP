export function control() { const input = { value: "input" }; return { output: input.value, get output() { return "replacement"; } }; }
