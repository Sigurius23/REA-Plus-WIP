package ng3;

import jg3.C21677d;
import kg3.AbstractC22465d;
import kg3.C22466e;
import org.threeten.p379bp.temporal.UnsupportedTemporalTypeException;

/* JADX INFO: renamed from: ng3.f */
/* JADX INFO: loaded from: classes3.dex */
public final enum C26693f extends EnumC26694g {
    public C26693f() {
        super("WEEK_BASED_YEAR", 3);
    }

    @Override // ng3.EnumC26694g, ng3.InterfaceC26700m
    /* JADX INFO: renamed from: a */
    public final C26706s mo79389a(InterfaceC26698k interfaceC26698k) {
        return EnumC26688a.YEAR.f106174x;
    }

    @Override // ng3.InterfaceC26700m
    /* JADX INFO: renamed from: b */
    public final boolean mo79390b(InterfaceC26698k interfaceC26698k) {
        return interfaceC26698k.mo60986a(EnumC26688a.EPOCH_DAY) && AbstractC22465d.m64906a(interfaceC26698k).equals(C22466e.f88015w);
    }

    @Override // ng3.InterfaceC26700m
    /* JADX INFO: renamed from: c */
    public final InterfaceC26697j mo79391c(InterfaceC26697j interfaceC26697j, long j7) {
        if (!mo79390b(interfaceC26697j)) {
            throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
        }
        int iM79420a = EnumC26688a.YEAR.f106174x.m79420a(j7, EnumC26694g.f106188z);
        C21677d c21677dM61002q0 = C21677d.m61002q0(interfaceC26697j);
        EnumC26688a enumC26688a = EnumC26688a.DAY_OF_WEEK;
        int iMo14018f = c21677dM61002q0.mo14018f(enumC26688a);
        int iM79397f = EnumC26694g.m79397f(c21677dM61002q0);
        if (iM79397f == 53 && EnumC26694g.m79399h(iM79420a) == 52) {
            iM79397f = 52;
        }
        C21677d c21677dM61003t0 = C21677d.m61003t0(iM79420a, 1, 4);
        return interfaceC26697j.mo60996j(c21677dM61003t0.m61014x0(((iM79397f - 1) * 7) + (iMo14018f - c21677dM61003t0.mo14018f(enumC26688a))));
    }

    @Override // ng3.InterfaceC26700m
    /* JADX INFO: renamed from: e */
    public final long mo79393e(InterfaceC26698k interfaceC26698k) {
        if (interfaceC26698k.mo60986a(this)) {
            return EnumC26694g.m79398g(C21677d.m61002q0(interfaceC26698k));
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
    }

    @Override // ng3.InterfaceC26700m
    public final C26706s range() {
        return EnumC26688a.YEAR.f106174x;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "WeekBasedYear";
    }
}
