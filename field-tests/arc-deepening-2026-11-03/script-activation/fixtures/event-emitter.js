import { EventEmitter } from "node:events";
const bus = new EventEmitter();
function receive(value) { consume(value); }
bus.on("owned-event", receive);
bus.emit("owned-event", "owned-value");
