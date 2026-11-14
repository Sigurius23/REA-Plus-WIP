import ProbePayloadModule

public enum ProbeChild {
    case payload0(ProbePayload)
    case payload1(ProbePayload)
    case payload2(ProbePayload)
    case payload3(ProbePayload)
    case payload4(ProbePayload)
    case payload5(ProbePayload)
    case payload6(ProbePayload)
    case payload7(ProbePayload)
    case payload8(ProbePayload)
    case payload9(ProbePayload)
    case payload10(ProbePayload)
    case payload11(ProbePayload)
    case payload12(ProbePayload)
    case payload13(ProbePayload)
    case payload14(ProbePayload)
    case payload15(ProbePayload)
    case payload16(ProbePayload)
    case payload17(ProbePayload)
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
}

public enum ProbeAction {
    case child(ProbeChild)
    case load(Int)
    case close
    case select(Int)
}

public struct ProbeState {
    public var total: Int = 0
    public init() {}
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
@_silgen_name("probe_case_24")
func probeCase24(_ value: Int) -> Int
@_silgen_name("probe_case_25")
func probeCase25(_ value: Int) -> Int
@_silgen_name("probe_case_26")
func probeCase26(_ value: Int) -> Int
@_silgen_name("probe_case_27")
func probeCase27(_ value: Int) -> Int
@_silgen_name("probe_case_28")
func probeCase28(_ value: Int) -> Int
@_silgen_name("probe_case_29")
func probeCase29(_ value: Int) -> Int

@inline(never)
public func probeReduce(_ action: ProbeAction, _ value: Int) -> Int {
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
        case .payload11: return probeCase11(value)
        case .payload12: return probeCase12(value)
        case .payload13: return probeCase13(value)
        case .payload14: return probeCase14(value)
        case .payload15: return probeCase15(value)
        case .payload16: return probeCase16(value)
        case .payload17: return probeCase17(value)
        case .empty0: return probeCase18(value)
        case .empty1: return probeCase19(value)
        case .empty2: return probeCase20(value)
        case .empty3: return probeCase21(value)
        case .empty4: return probeCase22(value)
        case .empty5: return probeCase23(value)
        case .empty6: return probeCase24(value)
        case .empty7: return probeCase25(value)
        case .empty8: return probeCase26(value)
        case .empty9: return probeCase27(value)
        case .empty10: return probeCase28(value)
        case .empty11: return probeCase29(value)
        }
    case .load(let amount): return amount &+ value
    case .close: return -100
    case .select(let selected): return selected &- value
    }
}
