export const explicit = input => { return { output: input.value }; };
export const implicit = input => ({ output: input.value });
export const identity = input => input;
export const bound = input => { const result = { output: input.value }; return result; };
const source = { value: "owned-input" };
export const explicitResult = explicit(source);
export const implicitResult = implicit(source);
export const identityResult = identity(source);
export const boundResult = bound(source);
