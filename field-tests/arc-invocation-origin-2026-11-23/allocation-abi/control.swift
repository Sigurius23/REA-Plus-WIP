import AllocContract
public struct Pair {
  public var code: UnsafeRawPointer
  public var context: UnsafeMutableRawPointer
}
public struct LargeClient {
  public var a: Pair
  public var b: Pair
  public var c: Pair
}
@inline(never)
public func makeClient(_ metadata: UnsafeRawPointer, _ object: UnsafeRawPointer,
                       _ code: UnsafeRawPointer) -> LargeClient {
  let allocated = swift_allocObject(metadata, 24, 7)!
  allocated.storeBytes(of: object, toByteOffset: 16, as: UnsafeRawPointer.self)
  let pair = Pair(code: code, context: allocated)
  return LargeClient(a: pair, b: pair, c: pair)
}
