public enum Setting { case first, second, third }
public struct Client {
  public var boolForSetting: @Sendable (Setting) -> Bool
}
public struct InitialValues {
  public var first: UInt
  public var second: UInt
}
public struct Dependency<Value> {
  public var initialValues: InitialValues
  public var keyPath: KeyPath<InitialValues, Value>
  public var filePath: StaticString
  public var fileID: StaticString
  public var line: UInt
}
public struct GenericClosure<Value> {
  public var value: Value
  public var predicate: @Sendable (Setting) -> Bool
}
public enum GenericEnum<Value> { case none, value(Value) }
public enum Foreign {
  public struct Dependency<Value> { public var other: Value }
}
public struct Root {
  public var client: Dependency<Client>
  public var scalar: Dependency<Bool>
  public var foreign: Foreign.Dependency<Client>
}
