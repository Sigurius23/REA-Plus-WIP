public enum OwnedWireKeys: String, CodingKey {
  case identifier = "boost-id"
  case command = "type"
  case payload = "payload"
}

@_cdecl("owned_key_word0")
public func ownedKeyWord0(_ ordinal: UInt8) -> UInt64 {
  let key: OwnedWireKeys
  switch ordinal {
  case 0: key = .identifier
  case 1: key = .command
  default: key = .payload
  }
  return unsafeBitCast(key.stringValue, to: (UInt64, UInt64).self).0
}

@_cdecl("owned_key_word1")
public func ownedKeyWord1(_ ordinal: UInt8) -> UInt64 {
  let key: OwnedWireKeys
  switch ordinal {
  case 0: key = .identifier
  case 1: key = .command
  default: key = .payload
  }
  return unsafeBitCast(key.stringValue, to: (UInt64, UInt64).self).1
}
