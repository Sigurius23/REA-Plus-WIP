function known() { return { value: "owned-value" }; }
const result = known();
const output = result.value;
consume(output);
