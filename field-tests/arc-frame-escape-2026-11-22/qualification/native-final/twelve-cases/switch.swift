import ReaResilientPayload

public enum ReaLiveEvent {
    case payload0(ReaPayload)
    case payload1(ReaPayload)
    case payload2(ReaPayload)
    case payload3(ReaPayload)
    case payload4(ReaPayload)
    case payload5(ReaPayload)
    case payload6(ReaPayload)
    case payload7(ReaPayload)
    case empty0
    case empty1
    case empty2
    case empty3
}

@_silgen_name("rea_case_0")
func reaCase0(_ value: Int) -> Int
@_silgen_name("rea_case_1")
func reaCase1(_ value: Int) -> Int
@_silgen_name("rea_case_2")
func reaCase2(_ value: Int) -> Int
@_silgen_name("rea_case_3")
func reaCase3(_ value: Int) -> Int
@_silgen_name("rea_case_4")
func reaCase4(_ value: Int) -> Int
@_silgen_name("rea_case_5")
func reaCase5(_ value: Int) -> Int
@_silgen_name("rea_case_6")
func reaCase6(_ value: Int) -> Int
@_silgen_name("rea_case_7")
func reaCase7(_ value: Int) -> Int
@_silgen_name("rea_case_8")
func reaCase8(_ value: Int) -> Int
@_silgen_name("rea_case_9")
func reaCase9(_ value: Int) -> Int
@_silgen_name("rea_case_10")
func reaCase10(_ value: Int) -> Int
@_silgen_name("rea_case_11")
func reaCase11(_ value: Int) -> Int
@_silgen_name("rea_case_12")
func reaCase12(_ value: Int) -> Int
@_silgen_name("rea_case_13")
func reaCase13(_ value: Int) -> Int
@_silgen_name("rea_case_14")
func reaCase14(_ value: Int) -> Int
@_silgen_name("rea_case_15")
func reaCase15(_ value: Int) -> Int
@_silgen_name("rea_case_16")
func reaCase16(_ value: Int) -> Int
@_silgen_name("rea_case_17")
func reaCase17(_ value: Int) -> Int
@_silgen_name("rea_case_18")
func reaCase18(_ value: Int) -> Int
@_silgen_name("rea_case_19")
func reaCase19(_ value: Int) -> Int
@_silgen_name("rea_case_20")
func reaCase20(_ value: Int) -> Int
@_silgen_name("rea_case_21")
func reaCase21(_ value: Int) -> Int
@_silgen_name("rea_case_22")
func reaCase22(_ value: Int) -> Int
@_silgen_name("rea_case_23")
func reaCase23(_ value: Int) -> Int
@_silgen_name("rea_case_24")
func reaCase24(_ value: Int) -> Int
@_silgen_name("rea_case_25")
func reaCase25(_ value: Int) -> Int
@_silgen_name("rea_case_26")
func reaCase26(_ value: Int) -> Int
@_silgen_name("rea_case_27")
func reaCase27(_ value: Int) -> Int
@_silgen_name("rea_case_28")
func reaCase28(_ value: Int) -> Int
@_silgen_name("rea_case_29")
func reaCase29(_ value: Int) -> Int

@inline(never)
public func reaRelativeSwitch(_ event: ReaLiveEvent, _ value: Int) -> Int {
    switch event {
    case .payload0: return reaCase0(value)
    case .payload1: return reaCase1(value)
    case .payload2: return reaCase2(value)
    case .payload3: return reaCase3(value)
    case .payload4: return reaCase4(value)
    case .payload5: return reaCase5(value)
    case .payload6: return reaCase6(value)
    case .payload7: return reaCase7(value)
    case .empty0: return reaCase8(value)
    case .empty1: return reaCase9(value)
    case .empty2: return reaCase10(value)
    case .empty3: return reaCase11(value)
    }
}
