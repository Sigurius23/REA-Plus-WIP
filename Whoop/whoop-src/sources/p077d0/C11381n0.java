package p077d0;

import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d0.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11381n0 {

    /* JADX INFO: renamed from: a */
    public final Float f36484a;

    /* JADX INFO: renamed from: b */
    public InterfaceC11419z f36485b;

    public C11381n0(Float f13, InterfaceC11419z interfaceC11419z) {
        this.f36484a = f13;
        this.f36485b = interfaceC11419z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11381n0)) {
            return false;
        }
        C11381n0 c11381n0 = (C11381n0) obj;
        return c11381n0.f36484a.equals(this.f36484a) && AbstractC22676k.m65745e(c11381n0.f36485b, this.f36485b);
    }

    public final int hashCode() {
        return this.f36485b.hashCode() + AbstractC11266d.m30448b(0, this.f36484a.hashCode() * 31, 31);
    }
}
