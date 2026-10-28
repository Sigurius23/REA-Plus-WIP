package b30;

import h02.C16587n0;

/* JADX INFO: renamed from: b30.l3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2566l3 extends AbstractC2590o3 {

    /* JADX INFO: renamed from: a */
    public final C16587n0 f9969a;

    public C2566l3(C16587n0 c16587n0) {
        this.f9969a = c16587n0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2566l3) && this.f9969a.equals(((C2566l3) obj).f9969a);
    }

    public final int hashCode() {
        return this.f9969a.hashCode();
    }

    public final String toString() {
        return "FinishProcessing(onComplete=" + this.f9969a + ")";
    }
}
