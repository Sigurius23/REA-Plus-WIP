export function control() { const input = { nested: { value: "nested-known" } }; return { "a/b~c": input.nested.value }; }
