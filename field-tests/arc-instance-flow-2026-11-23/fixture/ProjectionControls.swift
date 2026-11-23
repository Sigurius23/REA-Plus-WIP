public enum Setting { case first, second, third }
public struct Client { public let read: @Sendable (Setting) -> Bool }
public struct Values { public var first: Client; public var second: Client }
public struct Dependency<Value> { public var keyPath: KeyPath<Values, Value> }
@inline(never) public func project<Root, Value>(_ root: Root, _ keyPath: KeyPath<Root, Value>) -> Value {
  root[keyPath: keyPath]
}
@inline(never) public func first(_ root: Values) -> Client { project(root, \.first) }
@inline(never) public func second(_ root: Values) -> Client { project(root, \.second) }
@inline(never) public func get(_ root: Values, _ dependency: Dependency<Client>) -> Client {
  project(root, dependency.keyPath)
}
@inline(never) public func rebind(_ dependency: inout Dependency<Client>) {
  dependency.keyPath = \.second
}
