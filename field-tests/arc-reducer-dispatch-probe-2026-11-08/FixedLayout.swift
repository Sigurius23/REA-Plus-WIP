public enum Nibble {
    case n0
    case n1
    case n2
    case n3
    case n4
    case n5
    case n6
    case n7
    case n8
    case n9
    case n10
    case n11
    case n12
    case n13
    case n14
    case n15
}
public struct WidePayload {
    public var word0: UInt64
    public var word1: UInt64
    public var word2: UInt64
    public var word3: UInt64
    public var word4: UInt64
    public var word5: UInt64
    public var word6: UInt64
    public var word7: UInt64
    public var word8: UInt64
    public var word9: UInt64
    public var word10: UInt64
    public var word11: UInt64
    public var word12: UInt64
    public var word13: UInt64
    public var word14: UInt64
    public var word15: UInt64
    public var word16: UInt64
    public var word17: UInt64
    public var word18: UInt64
    public var byte0: UInt8
    public var byte1: UInt8
    public var byte2: UInt8
    public var nibble: Nibble
}
public enum FixedChild {
    case payload0(WidePayload)
    case payload1(WidePayload)
    case payload2(WidePayload)
    case payload3(WidePayload)
    case payload4(WidePayload)
    case payload5(WidePayload)
    case payload6(WidePayload)
    case payload7(WidePayload)
    case payload8(WidePayload)
    case payload9(WidePayload)
    case payload10(WidePayload)
    case empty0
    case empty1
    case empty2
    case empty3
    case empty4
    case empty5
    case empty6
    case empty7
    case empty8
    case empty9
    case empty10
    case empty11
    case empty12
}
public enum FixedAction {
    case child(FixedChild)
    case load(Int)
    case close
    case select(Int)
}
@_silgen_name("probe_case_0")
func probeCase0(_ value: Int) -> Int
@_silgen_name("probe_case_1")
func probeCase1(_ value: Int) -> Int
@_silgen_name("probe_case_2")
func probeCase2(_ value: Int) -> Int
@_silgen_name("probe_case_3")
func probeCase3(_ value: Int) -> Int
@_silgen_name("probe_case_4")
func probeCase4(_ value: Int) -> Int
@_silgen_name("probe_case_5")
func probeCase5(_ value: Int) -> Int
@_silgen_name("probe_case_6")
func probeCase6(_ value: Int) -> Int
@_silgen_name("probe_case_7")
func probeCase7(_ value: Int) -> Int
@_silgen_name("probe_case_8")
func probeCase8(_ value: Int) -> Int
@_silgen_name("probe_case_9")
func probeCase9(_ value: Int) -> Int
@_silgen_name("probe_case_10")
func probeCase10(_ value: Int) -> Int
@_silgen_name("probe_case_11")
func probeCase11(_ value: Int) -> Int
@_silgen_name("probe_case_12")
func probeCase12(_ value: Int) -> Int
@_silgen_name("probe_case_13")
func probeCase13(_ value: Int) -> Int
@_silgen_name("probe_case_14")
func probeCase14(_ value: Int) -> Int
@_silgen_name("probe_case_15")
func probeCase15(_ value: Int) -> Int
@_silgen_name("probe_case_16")
func probeCase16(_ value: Int) -> Int
@_silgen_name("probe_case_17")
func probeCase17(_ value: Int) -> Int
@_silgen_name("probe_case_18")
func probeCase18(_ value: Int) -> Int
@_silgen_name("probe_case_19")
func probeCase19(_ value: Int) -> Int
@_silgen_name("probe_case_20")
func probeCase20(_ value: Int) -> Int
@_silgen_name("probe_case_21")
func probeCase21(_ value: Int) -> Int
@_silgen_name("probe_case_22")
func probeCase22(_ value: Int) -> Int
@_silgen_name("probe_case_23")
func probeCase23(_ value: Int) -> Int
@inline(never)
public func fixedReduce(_ action: FixedAction, _ value: Int) -> Int {
    switch action {
    case .child(let child):
        switch child {
        case .payload0: return probeCase0(value)
        case .payload1: return probeCase1(value)
        case .payload2: return probeCase2(value)
        case .payload3: return probeCase3(value)
        case .payload4: return probeCase4(value)
        case .payload5: return probeCase5(value)
        case .payload6: return probeCase6(value)
        case .payload7: return probeCase7(value)
        case .payload8: return probeCase8(value)
        case .payload9: return probeCase9(value)
        case .payload10: return probeCase10(value)
        case .empty0: return probeCase11(value)
        case .empty1: return probeCase12(value)
        case .empty2: return probeCase13(value)
        case .empty3: return probeCase14(value)
        case .empty4: return probeCase15(value)
        case .empty5: return probeCase16(value)
        case .empty6: return probeCase17(value)
        case .empty7: return probeCase18(value)
        case .empty8: return probeCase19(value)
        case .empty9: return probeCase20(value)
        case .empty10: return probeCase21(value)
        case .empty11: return probeCase22(value)
        case .empty12: return probeCase23(value)
        }
    case .load(let amount): return amount &+ value
    case .close: return -100
    case .select(let selected): return selected &- value
    }
}
