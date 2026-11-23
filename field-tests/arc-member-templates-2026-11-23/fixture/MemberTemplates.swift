public struct Values { public var flag: Bool }
public struct Client { public var flag: Bool }
public struct Dependency<Value> {
  public let keyPath: KeyPath<Values, Value>
  public let value: Value
}
public struct Two<First, Second> {
  public let first: First
  public let second: Second
  public let keyPath: KeyPath<First, Second>
}
public struct Three<First, Second, Third> { public let value: Third }
public struct Constrained<Value: Equatable> { public let keyPath: KeyPath<Values, Value> }
public enum Foreign {
  public struct Values { public var number: UInt }
  public struct Dependency<Value> { public let keyPath: KeyPath<Values, Value> }
}
public struct Nested<Outer> {
  public struct Inner<Value> { public let keyPath: KeyPath<Outer, Value> }
}
public struct Root {
  public let selected: Dependency<Client>
  public let other: Dependency<Bool>
  public let two: Two<Values, Client>
  public let three: Three<Bool, UInt, Client>
}
