export function control(extra) { const input = { value: "input" }; Object.setPrototypeOf(input, extra); return { output: input.value }; }
