import Foundation

public struct OwnedPayload: Decodable {
  public let contents: String
  enum CodingKeys: String, CodingKey { case contents }
  public init(from decoder: Decoder) throws {
    let container = try decoder.container(keyedBy: CodingKeys.self)
    self.contents = try container.decode(String.self, forKey: .contents)
  }
}

@inline(never) public func ownedNonthrowing(_ value: Int) -> Int { value + 7 }
@inline(never) public func ownedThrowingCallback(_ callback: () throws -> Int) -> Int { 7 }
@inline(never) public func ownedAsyncThrowing(_ value: Int) async throws -> Int { value + 9 }

public struct OwnedCallbackBox<T> {}
extension OwnedCallbackBox where T == () throws -> Int {
  @inline(never) public func ownedMethodForThrowingCallback() -> Int { 7 }
}

@inline(never) public func ownedDecodeWithCleanup(_ data: Data) -> String {
  do {
    return try JSONDecoder().decode(OwnedPayload.self, from: data).contents
  } catch {
    return "owned-error"
  }
}
