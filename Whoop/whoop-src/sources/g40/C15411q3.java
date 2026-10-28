package g40;

import c93.InterfaceC4339a;
import h02.C16587n0;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g40.q3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15411q3 extends AbstractC15416r3 {

    /* JADX INFO: renamed from: a */
    public final int f57893a;

    /* JADX INFO: renamed from: b */
    public final Integer f57894b;

    /* JADX INFO: renamed from: c */
    public final boolean f57895c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC4339a f57896d;

    public C15411q3(int i13, Integer num, boolean z4, InterfaceC4339a interfaceC4339a) {
        this.f57893a = i13;
        this.f57894b = num;
        this.f57895c = z4;
        this.f57896d = interfaceC4339a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15411q3)) {
            return false;
        }
        C15411q3 c15411q3 = (C15411q3) obj;
        return this.f57893a == c15411q3.f57893a && AbstractC22676k.m65745e(this.f57894b, c15411q3.f57894b) && this.f57895c == c15411q3.f57895c && AbstractC22676k.m65745e(this.f57896d, c15411q3.f57896d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f57893a) * 31;
        Integer num = this.f57894b;
        int iM8289b = AbstractC2875y.m8289b((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f57895c);
        InterfaceC4339a interfaceC4339a = this.f57896d;
        return iM8289b + (interfaceC4339a != null ? interfaceC4339a.hashCode() : 0);
    }

    public final String toString() {
        return "Trailing(idRes=" + this.f57893a + ", contentDescription=" + this.f57894b + ", isTintable=" + this.f57895c + ", onClick=" + this.f57896d + ")";
    }

    public /* synthetic */ C15411q3(int i13, boolean z4, C16587n0 c16587n0, int i14) {
        this(i13, (Integer) null, z4, (i14 & 8) != 0 ? null : c16587n0);
    }
}
