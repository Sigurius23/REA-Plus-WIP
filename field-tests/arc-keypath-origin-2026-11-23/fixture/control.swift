public struct Client {
  public var marker: Int
  public init(marker: Int) { self.marker = marker }
}
public struct Environment {
  public var storage: Client
  public var client: Client {
    @inline(never) get { storage }
    @inline(never) set { storage = newValue }
  }
}
public struct Wrapper {
  public var leading: UInt
  public var keyPath: WritableKeyPath<Environment, Client>
  public var trailing: UInt
  public var extra: UInt
  public var extra2: UInt
}
@inline(never)
public func makeWrapper() -> Wrapper {
  Wrapper(leading: 17, keyPath: \Environment.client, trailing: 23, extra: 29, extra2: 31)
}
