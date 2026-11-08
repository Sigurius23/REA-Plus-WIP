public protocol OwnedRunner {
    func execute(_ source: String) async throws -> String
}

public protocol OwnedSurface {
    func evaluate(_ source: String) async throws -> String
    var scale: Double { get }
}

public struct OwnedAdaptor<Runner: OwnedRunner>: OwnedSurface {
    public let runner: Runner
    public init(_ runner: Runner) { self.runner = runner }
    public func evaluate(_ source: String) async throws -> String {
        try await runner.execute(source)
    }
    public var scale: Double { 1.0 }
}
