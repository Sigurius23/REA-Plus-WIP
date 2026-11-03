import Foundation

public struct Body: Decodable {
    public let id: String
    public let text: String
}

public enum Request: Decodable {
    case loadCSS(Body)
    case editCSS(Body)
    case loadJS(Body)
    case editJS(Body)
}

// Kept externally visible so the executable witness used by the decoder is
// present in the library. This fixture is compiled and inspected, never run.
@_cdecl("owned_resilient_decode")
public func ownedResilientDecode(_ input: UnsafePointer<CChar>) -> Int32 {
    do {
        let data = Data(String(cString: input).utf8)
        let request = try JSONDecoder().decode(Request.self, from: data)
        switch request {
        case .loadCSS: return 1
        case .editCSS: return 2
        case .loadJS: return 3
        case .editJS: return 4
        }
    } catch {
        return -1
    }
}
