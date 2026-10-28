package p465rm;

import p690zr.AbstractC41023g0;
import p690zr.C41017e0;
import p690zr.C41060w0;

/* JADX INFO: renamed from: rm.q1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31564q1 implements InterfaceC31529f {

    /* JADX INFO: renamed from: x */
    public static final C31564q1 f130357x;

    /* JADX INFO: renamed from: w */
    public final AbstractC41023g0 f130358w;

    static {
        C41017e0 c41017e0 = AbstractC41023g0.f176998x;
        f130357x = new C31564q1(C41060w0.f177067E);
    }

    public C31564q1(AbstractC41023g0 abstractC41023g0) {
        this.f130358w = AbstractC41023g0.m133252m(abstractC41023g0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C31564q1.class != obj.getClass()) {
            return false;
        }
        return this.f130358w.equals(((C31564q1) obj).f130358w);
    }

    public final int hashCode() {
        return this.f130358w.hashCode();
    }
}
