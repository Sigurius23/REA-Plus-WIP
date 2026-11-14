public class BudgetFirst {
    public var value: Int
    public init(_ value: Int) { self.value = value }
    public func result() -> Int { value + 1 }
}
public class BudgetMiddle {
    public var value: Int
    public init(_ value: Int) { self.value = value }
    public func result() -> Int { value + 2 }
}
public class BudgetTarget {
    public var value: Int
    public init(_ value: Int) { self.value = value }
    public func result() -> Int { value + 3 }
}
