public protocol ReaWitnessFixtureProtocol { func fixtureValue() -> Int }
public struct ReaWitnessFixture: ReaWitnessFixtureProtocol {
  public init() {}
  public func fixtureValue() -> Int { 17 }
}
@_cdecl("rea_witness_fixture_entry")
public func fixtureEntry() -> Int { ReaWitnessFixture().fixtureValue() }

public class ReaVtableFixture {
  public init() {}
  public func fixtureValue() -> Int { 23 }
}

// The protocol descriptor lives in libswiftCore, never in this image.
public struct ReaArrayFixture: ExpressibleByArrayLiteral {
  public typealias ArrayLiteralElement = Int
  public init(arrayLiteral elements: Int...) {}
}
