// Owned static-analysis controls. Compile and inspect only; never execute.
public enum Primary { public enum Setting { case first, second, third } }
public enum Foreign { public enum Setting { case first, second, third } }
@frozen public struct FieldControls {
    public let positive: @Sendable (Primary.Setting) -> Bool
    public let raw: (UInt16) -> Bool
    public let returnOnly: (Bool) -> Primary.Setting
    public let foreign: (Foreign.Setting) -> Bool
    public let optional: (Primary.Setting?) -> Bool
    public let asynchronous: (Primary.Setting) async -> Bool
    public let throwing: (Primary.Setting) throws -> Bool
    public let zeroArguments: () -> Bool
}
@frozen public struct GenericControls<T> {
    public let generic: (T) -> Bool
}
