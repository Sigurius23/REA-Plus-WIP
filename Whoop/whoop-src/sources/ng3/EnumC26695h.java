package ng3;

import com.squareup.wire.AbstractC5583n;
import jg3.C21675b;

/* JADX INFO: renamed from: ng3.h */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC26695h implements InterfaceC26705r {
    /* JADX INFO: Fake field, exist only in values array */
    WEEK_BASED_YEARS("WeekBasedYears"),
    /* JADX INFO: Fake field, exist only in values array */
    QUARTER_YEARS("QuarterYears");


    /* JADX INFO: renamed from: w */
    public final String f106190w;

    static {
        C21675b c21675b = C21675b.f83231y;
    }

    EnumC26695h(String str) {
        this.f106190w = str;
    }

    @Override // ng3.InterfaceC26705r
    /* JADX INFO: renamed from: a */
    public final InterfaceC26697j mo79396a(InterfaceC26697j interfaceC26697j, long j7) {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return interfaceC26697j.mo60994c(j7 / 256, EnumC26689b.YEARS).mo60994c((j7 % 256) * 3, EnumC26689b.MONTHS);
            }
            throw new IllegalStateException("Unreachable");
        }
        int i13 = AbstractC26696i.f106191a;
        C26693f c26693f = EnumC26694g.f106188z;
        return interfaceC26697j.mo60993b(AbstractC5583n.m16763W(interfaceC26697j.mo14018f(c26693f), j7), c26693f);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f106190w;
    }
}
