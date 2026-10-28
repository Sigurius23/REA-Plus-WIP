package i20;

import h20.C16760x0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i20.s0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C17976s0 implements InterfaceC17978t0 {

    /* JADX INFO: renamed from: a */
    public final C16760x0 f69808a;

    public C17976s0(C16760x0 c16760x0) {
        this.f69808a = c16760x0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17976s0) && AbstractC22676k.m65745e(this.f69808a, ((C17976s0) obj).f69808a);
    }

    public final int hashCode() {
        C16760x0 c16760x0 = this.f69808a;
        if (c16760x0 == null) {
            return 0;
        }
        return c16760x0.hashCode();
    }

    public final String toString() {
        return "GoBack(address=" + this.f69808a + ")";
    }
}
