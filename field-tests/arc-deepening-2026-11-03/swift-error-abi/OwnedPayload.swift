public struct OwnedPayload: Decodable {
  public let contents: String
  enum CodingKeys: String, CodingKey { case contents }
  public init(from decoder: Decoder) throws {
    let container = try decoder.container(keyedBy: CodingKeys.self)
    self.contents = try container.decode(String.self, forKey: .contents)
  }
}
