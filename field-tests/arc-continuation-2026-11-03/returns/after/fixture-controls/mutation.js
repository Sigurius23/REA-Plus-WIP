export function control() { const input = { value: "input" }; input.value = change(); return { output: input.value }; }
