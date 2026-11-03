export function control(key) { const input = { value: "input" }; return { output: input.value, [key]: "replacement" }; }
