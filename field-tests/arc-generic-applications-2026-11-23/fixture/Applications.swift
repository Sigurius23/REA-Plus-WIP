public enum Setting { case first, second, third }
public struct Client { public var flag: Bool }
public struct Dependency<Value> { public var value: Value }
public struct Pair<First, Second> {
  public var first: First
  public var second: Second
}
public struct Constrained<Value: Equatable> { public var value: Value }
public enum Foreign {
  public struct Client { public var other: UInt }
  public struct Dependency<Value> { public var value: Value }
}
public struct Root {
  public var client: Dependency<Client>
  public var boolean: Dependency<Bool>
  public var pair: Pair<Bool, Client>
  public var enumArgument: Dependency<Setting>
  public var foreignArgument: Dependency<Foreign.Client>
  public var foreignOwner: Foreign.Dependency<Client>
  public var optional: Dependency<Client>?
  public var nested: Dependency<Dependency<Client>>
  public var constrained: Constrained<Bool>
}
