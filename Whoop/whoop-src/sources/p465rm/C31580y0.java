package p465rm;

import p309lo.C24548f;

/* JADX INFO: renamed from: rm.y0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31580y0 {

    /* JADX INFO: renamed from: a */
    public final C24548f f130479a;

    public C31580y0(C24548f c24548f) {
        this.f130479a = c24548f;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m97242a(int... iArr) {
        for (int i13 : iArr) {
            if (this.f130479a.f95817a.get(i13)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C31580y0) {
            return this.f130479a.equals(((C31580y0) obj).f130479a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f130479a.hashCode();
    }
}
