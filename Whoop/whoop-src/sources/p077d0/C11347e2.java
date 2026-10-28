package p077d0;

import ce3.C4497a0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d0.e2 */
/* JADX INFO: loaded from: classes.dex */
public final class C11347e2 implements InterfaceC11416y {

    /* JADX INFO: renamed from: a */
    public final int f36356a;

    /* JADX INFO: renamed from: b */
    public final int f36357b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC11419z f36358c;

    public C11347e2(int i13, InterfaceC11419z interfaceC11419z, int i14) {
        this((i14 & 1) != 0 ? 300 : i13, 0, (i14 & 4) != 0 ? AbstractC11333b0.f36310a : interfaceC11419z);
    }

    @Override // p077d0.InterfaceC11372l
    /* JADX INFO: renamed from: a */
    public final InterfaceC11355g2 mo30534a(C11351f2 c11351f2) {
        return new C4497a0(this.f36356a, this.f36357b, this.f36358c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11347e2) {
            C11347e2 c11347e2 = (C11347e2) obj;
            if (c11347e2.f36356a == this.f36356a && c11347e2.f36357b == this.f36357b && AbstractC22676k.m65745e(c11347e2.f36358c, this.f36358c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f36358c.hashCode() + (this.f36356a * 31)) * 31) + this.f36357b;
    }

    @Override // p077d0.InterfaceC11416y, p077d0.InterfaceC11372l
    /* JADX INFO: renamed from: a */
    public final InterfaceC11363i2 mo30534a(C11351f2 c11351f2) {
        return new C4497a0(this.f36356a, this.f36357b, this.f36358c);
    }

    public C11347e2(int i13, int i14, InterfaceC11419z interfaceC11419z) {
        this.f36356a = i13;
        this.f36357b = i14;
        this.f36358c = interfaceC11419z;
    }
}
