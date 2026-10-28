package ng3;

import kg3.AbstractC22465d;
import kg3.C22466e;
import org.threeten.p379bp.temporal.UnsupportedTemporalTypeException;

/* JADX INFO: renamed from: ng3.d */
/* JADX INFO: loaded from: classes3.dex */
public final enum C26691d extends EnumC26694g {
    public C26691d() {
        super("QUARTER_OF_YEAR", 1);
    }

    @Override // ng3.InterfaceC26700m
    /* JADX INFO: renamed from: b */
    public final boolean mo79390b(InterfaceC26698k interfaceC26698k) {
        return interfaceC26698k.mo60986a(EnumC26688a.MONTH_OF_YEAR) && AbstractC22465d.m64906a(interfaceC26698k).equals(C22466e.f88015w);
    }

    @Override // ng3.InterfaceC26700m
    /* JADX INFO: renamed from: c */
    public final InterfaceC26697j mo79391c(InterfaceC26697j interfaceC26697j, long j7) {
        long jMo79393e = mo79393e(interfaceC26697j);
        range().m79421b(j7, this);
        EnumC26688a enumC26688a = EnumC26688a.MONTH_OF_YEAR;
        return interfaceC26697j.mo60993b(((j7 - jMo79393e) * 3) + interfaceC26697j.mo60987h(enumC26688a), enumC26688a);
    }

    @Override // ng3.InterfaceC26700m
    /* JADX INFO: renamed from: e */
    public final long mo79393e(InterfaceC26698k interfaceC26698k) {
        if (interfaceC26698k.mo60986a(this)) {
            return (interfaceC26698k.mo60987h(EnumC26688a.MONTH_OF_YEAR) + 2) / 3;
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: QuarterOfYear");
    }

    @Override // ng3.InterfaceC26700m
    public final C26706s range() {
        return C26706s.m79418c(1L, 4L);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "QuarterOfYear";
    }
}
