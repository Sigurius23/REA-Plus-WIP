// Selectively adapted from upstream REA f7849cad3fe3bffb207b4dc30f34394978c20297.
import { FitMetadataBudget, malformedFit } from "./fitFailure.js";
export interface FdtProperty {
  readonly name: string;
  readonly offset: number;
  readonly length: number;
}
export interface FdtNode {
  readonly name: string;
  readonly path: string;
  readonly parent: string | null;
  readonly offset: number;
  readonly properties: Map<string, FdtProperty>;
}
export interface FdtStructure {
  readonly version: number;
  readonly totalsize: number;
  readonly nodes: readonly FdtNode[];
  readonly byPath: ReadonlyMap<string, FdtNode>;
  readonly children: ReadonlyMap<string, readonly FdtNode[]>;
  readonly propertyCount: number;
  readonly reservationCount: number;
}
const align4 = (n: number): number => Math.ceil(n / 4) * 4;
/** Validate all FDT structure/reservation/string extents, without interpreting device bindings. */
export const parseFdtStructure = (
  bytes: Buffer,
  budget: FitMetadataBudget,
): FdtStructure => {
  if (bytes.length < 28 || bytes.readUInt32BE(0) !== 0xd00dfeed)
    return malformedFit("not an FDT blob");
  const u32 = (offset: number) => bytes.readUInt32BE(offset);
  const version = u32(20),
    headerBytes = version === 17 ? 40 : 36;
  if (version !== 16 && version !== 17)
    return malformedFit(`unsupported FDT version ${String(version)}`);
  if (bytes.length < headerBytes) return malformedFit("truncated FDT header");
  const totalsize = u32(4),
    structStart = u32(8),
    stringsStart = u32(12),
    reservationStart = u32(16),
    stringsSize = u32(32);
  if (
    totalsize < headerBytes ||
    totalsize > bytes.length ||
    u32(24) > version ||
    u32(24) > 17
  )
    return malformedFit("invalid FDT totalsize or compatibility version");
  if (structStart % 4 || reservationStart % 8)
    return malformedFit("misaligned FDT block");
  const ranges = [{ start: 0, end: headerBytes }];
  const range = (start: number, size: number) => {
    if (
      size < 0 ||
      (size > 0 && start < headerBytes) ||
      start > totalsize - size
    )
      return malformedFit("FDT block outside totalsize");
    if (size === 0) return;
    const end = start + size;
    if (ranges.some((other) => start < other.end && other.start < end))
      return malformedFit("overlapping FDT blocks");
    ranges.push({ start, end });
  };
  range(stringsStart, stringsSize);
  const structEnd =
    version === 17
      ? structStart + u32(36)
      : Math.min(
          totalsize,
          ...[
            ...(stringsSize > 0 ? [stringsStart] : []),
            reservationStart,
          ].filter((offset) => offset > structStart),
        );
  range(structStart, structEnd - structStart);
  let cursor = reservationStart,
    reservationCount = 0;
  const reservationEnd = Math.min(
    totalsize,
    ...[structStart, ...(stringsSize > 0 ? [stringsStart] : [])].filter(
      (offset) => offset >= reservationStart,
    ),
  );
  for (;;) {
    if (
      cursor < headerBytes ||
      cursor > reservationEnd - 16 ||
      ranges.some((r) => cursor >= r.start && cursor < r.end)
    )
      return malformedFit("unterminated or overlapping FDT reservation block");
    const address = bytes.readBigUInt64BE(cursor),
      size = bytes.readBigUInt64BE(cursor + 8);
    cursor += 16;
    if (address === 0n && size === 0n) break;
    if (++reservationCount > budget.capacity.maxTreeProperties)
      budget.limit(
        "max_firmware_tree_properties",
        budget.capacity.maxTreeProperties,
      );
    // Reservations are validated but not copied or expanded into a second tree.
  }
  range(reservationStart, cursor - reservationStart);
  const text = (
    start: number,
    end: number,
  ): { value: string; next: number } => {
    const nul = bytes.indexOf(0, start);
    if (nul < start || nul >= end) return malformedFit("unterminated FDT name");
    const raw = bytes.subarray(start, nul);
    if (raw.some((byte) => byte < 0x20 || byte > 0x7e))
      return malformedFit("non-ASCII FDT name");
    budget.charge(raw.length * 2);
    return { value: raw.toString("ascii"), next: nul + 1 };
  };
  const nodes: FdtNode[] = [],
    byPath = new Map<string, FdtNode>(),
    children = new Map<string, FdtNode[]>(),
    names = new Map<number, string>();
  const stack: { node: FdtNode; children: boolean }[] = [];
  let propertyCount = 0,
    finished = false;
  cursor = structStart;
  const need = (length: number) => {
    if (cursor > structEnd - length)
      return malformedFit("truncated FDT structure token or property");
  };
  while (cursor < structEnd) {
    need(4);
    const offset = cursor,
      token = u32(cursor);
    cursor += 4;
    if (token === 1) {
      if (stack.length >= budget.capacity.maxTreeDepth)
        budget.limit("max_firmware_tree_depth", budget.capacity.maxTreeDepth);
      if (nodes.length >= budget.capacity.maxTreeNodes)
        budget.limit("max_firmware_tree_nodes", budget.capacity.maxTreeNodes);
      const name = text(cursor, structEnd);
      cursor = align4(name.next);
      need(0);
      const parent = stack.at(-1);
      if (
        name.value.includes("/") ||
        (!parent && (nodes.length > 0 || name.value !== "")) ||
        (parent && !name.value)
      )
        return malformedFit("invalid FDT node name or multiple roots");
      budget.charge(
        (parent?.node.path.length ?? 0) * 4 + name.value.length * 2 + 128,
      );
      const path = parent
        ? `${parent.node.path === "/" ? "" : parent.node.path}/${name.value}`
        : "/";
      if (byPath.has(path)) return malformedFit("duplicate FDT node path");
      const node: FdtNode = {
        name: name.value,
        path,
        parent: parent?.node.path ?? null,
        offset,
        properties: new Map(),
      };
      nodes.push(node);
      byPath.set(path, node);
      if (parent) {
        parent.children = true;
        const siblings = children.get(parent.node.path);
        if (siblings) siblings.push(node);
        else children.set(parent.node.path, [node]);
      }
      stack.push({ node, children: false });
    } else if (token === 2) {
      if (!stack.pop()) return malformedFit("unbalanced FDT_END_NODE");
    } else if (token === 3) {
      const owner = stack.at(-1);
      if (!owner || owner.children)
        return malformedFit("FDT property outside node or after children");
      need(8);
      const length = u32(cursor),
        nameoff = u32(cursor + 4);
      cursor += 8;
      need(length);
      if (++propertyCount > budget.capacity.maxTreeProperties)
        budget.limit(
          "max_firmware_tree_properties",
          budget.capacity.maxTreeProperties,
        );
      if (nameoff >= stringsSize)
        return malformedFit("FDT property string offset out of range");
      let name = names.get(nameoff);
      if (name === undefined) {
        name = text(stringsStart + nameoff, stringsStart + stringsSize).value;
        names.set(nameoff, name);
      }
      if (!name || owner.node.properties.has(name))
        return malformedFit("empty or duplicate FDT property name");
      budget.charge(name.length * 2 + 128);
      owner.node.properties.set(name, { name, offset: cursor, length });
      cursor = align4(cursor + length);
      need(0);
    } else if (token === 4) continue;
    else if (token === 9) {
      if (stack.length || nodes.length === 0)
        return malformedFit("unclosed FDT nodes or missing root");
      finished = true;
      break;
    } else return malformedFit(`unknown FDT token ${String(token)}`);
  }
  if (!finished) return malformedFit("missing FDT_END token");
  if (version === 17 && cursor !== structEnd)
    return malformedFit(
      "FDT_END does not terminate the declared structure block",
    );
  return {
    version,
    totalsize,
    nodes,
    byPath,
    children,
    propertyCount,
    reservationCount,
  };
};
