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

// These imported resilient requirements have static pairs even when their
// witness-table pattern is null. The fixture is inspected, never executed.
public struct ReaResilientBody: Decodable {
  public let id: String
}
public enum ReaResilientRequest: Decodable {
  case loadCSS(ReaResilientBody)
  case editCSS(ReaResilientBody)
}

// Generic patterns with and without a conditional conformance control tail.
// These functions are compiled as metadata oracles; the fixture is never run.
public protocol ReaAsyncRunner {
  func run(_ source: String) async throws -> String
}
public protocol ReaAsyncSurface {
  func evaluate(_ source: String) async throws -> String
  var scale: Double { get }
}
public struct ReaGenericAdaptor<Runner: ReaAsyncRunner>: ReaAsyncSurface {
  public let runner: Runner
  public init(_ runner: Runner) { self.runner = runner }
  public func evaluate(_ source: String) async throws -> String {
    try await runner.run(source)
  }
  public var scale: Double { 1.0 }
}
public struct ReaConditionalBox<Value> {
  public let value: Value
  public init(_ value: Value) { self.value = value }
}
extension ReaConditionalBox: ReaAsyncSurface where Value: ReaAsyncRunner {
  public func evaluate(_ source: String) async throws -> String {
    try await value.run(source)
  }
  public var scale: Double { 2.0 }
}
