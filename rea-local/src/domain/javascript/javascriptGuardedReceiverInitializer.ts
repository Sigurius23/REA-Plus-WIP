import * as t from "@babel/types";
import {
  resolveSemanticBindingState,
  type JavaScriptSemanticAnalysisState,
  type JavaScriptSemanticBindingState,
} from "./javascriptSemanticState.js";

type Initializer = JavaScriptSemanticBindingState["initializers"][number];
interface Guard {
  readonly initializer: Initializer;
  readonly block: t.BlockStatement;
  readonly index: number;
}

/** One successful URL construction dominates later same-frame uses after an abrupt catch. */
export class GuardedReceiverInitializers {
  readonly #guards = new Map<string, Guard | null>();
  readonly #orders = new WeakMap<
    t.BlockStatement,
    ReadonlyMap<t.Node, number>
  >();
  constructor(readonly state: JavaScriptSemanticAnalysisState) {}

  #order(block: t.BlockStatement): ReadonlyMap<t.Node, number> {
    let order = this.#orders.get(block);
    if (order === undefined) {
      order = new Map(block.body.map((node, index) => [node, index]));
      this.#orders.set(block, order);
    }
    return order;
  }

  #candidate(binding: JavaScriptSemanticBindingState): Guard | null {
    let guard = this.#guards.get(binding.bindingId);
    if (guard === undefined) {
      guard = this.#guard(binding) ?? null;
      this.#guards.set(binding.bindingId, guard);
    }
    return guard;
  }

  initializer(
    binding: JavaScriptSemanticBindingState,
  ): Initializer | undefined {
    return this.#candidate(binding)?.initializer;
  }

  initializes(node: t.Node): boolean {
    if (!t.isAssignmentExpression(node) || !t.isIdentifier(node.left))
      return false;
    const binding = resolveSemanticBindingState(
      this.state,
      node.left,
      node.left.name,
    );
    return (
      binding !== undefined &&
      this.#candidate(binding)?.initializer.node === node.right
    );
  }

  allows(bindingId: string, use: t.Node): boolean {
    const guard = this.#guards.get(bindingId);
    if (guard == null) return false;
    let node: t.Node | undefined = use;
    while (node !== undefined) {
      if (t.isFunction(node) || t.isClass(node) || t.isStaticBlock(node))
        return false;
      const parent = this.state.parentsByNode.get(node);
      if (parent === guard.block) {
        const index = this.#order(guard.block).get(node);
        return index !== undefined && index > guard.index;
      }
      node = parent;
    }
    return false;
  }

  #guard(binding: JavaScriptSemanticBindingState): Guard | undefined {
    const [initializer] = binding.initializers;
    if (
      binding.initializers.length !== 1 ||
      initializer === undefined ||
      initializer.projection.length !== 0 ||
      binding.referenceInitializers.length !== 0 ||
      binding.directOrigins.length !== 0 ||
      binding.definitions.length !== 2 ||
      binding.definitions.filter((d) => d.kind === "variable").length !== 1 ||
      binding.definitions.filter((d) => d.kind === "assignment").length !== 1 ||
      !t.isNewExpression(initializer.node) ||
      !t.isIdentifier(initializer.node.callee) ||
      !["URL", "URLSearchParams"].includes(initializer.node.callee.name)
    )
      return undefined;
    const assignment = this.state.parentsByNode.get(initializer.node);
    if (
      !t.isAssignmentExpression(assignment, { operator: "=" }) ||
      assignment.right !== initializer.node ||
      !t.isIdentifier(assignment.left, { name: binding.name }) ||
      resolveSemanticBindingState(this.state, assignment.left, binding.name) !==
        binding
    )
      return undefined;
    const statement = this.state.parentsByNode.get(assignment);
    if (!t.isExpressionStatement(statement)) return undefined;
    const body = this.state.parentsByNode.get(statement);
    if (!t.isBlockStatement(body) || body.body.length !== 1) return undefined;
    const attempt = this.state.parentsByNode.get(body);
    if (
      !t.isTryStatement(attempt) ||
      attempt.block !== body ||
      attempt.finalizer != null ||
      attempt.handler == null ||
      attempt.handler.body.body.length !== 1
    )
      return undefined;
    const exit = attempt.handler.body.body[0];
    if (!t.isReturnStatement(exit) && !t.isThrowStatement(exit))
      return undefined;
    const block = this.state.parentsByNode.get(attempt);
    if (!t.isBlockStatement(block)) return undefined;
    const index = this.#order(block).get(attempt);
    if (index === undefined || index < 1) return undefined;
    const declaration = block.body[index - 1];
    if (
      !t.isVariableDeclaration(declaration, { kind: "let" }) ||
      declaration.declarations.length !== 1
    )
      return undefined;
    const declarator = declaration.declarations[0];
    if (
      declarator === undefined ||
      declarator.init != null ||
      !t.isIdentifier(declarator.id, { name: binding.name }) ||
      resolveSemanticBindingState(this.state, declarator.id, binding.name) !==
        binding
    )
      return undefined;
    return { initializer, block, index };
  }
}
