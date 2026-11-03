export function control() { const input = { get value() { return "input"; } }; return { output: input.value }; }
