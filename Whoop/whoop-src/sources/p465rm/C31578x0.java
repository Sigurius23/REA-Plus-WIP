package p465rm;

import android.util.SparseBooleanArray;
import p309lo.AbstractC24543a;
import p309lo.C24548f;

/* JADX INFO: renamed from: rm.x0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31578x0 implements InterfaceC31529f {

    /* JADX INFO: renamed from: w */
    public final C24548f f130475w;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        AbstractC24543a.m71573i(!false);
        new C24548f(sparseBooleanArray);
    }

    public C31578x0(C24548f c24548f) {
        this.f130475w = c24548f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C31578x0) {
            return this.f130475w.equals(((C31578x0) obj).f130475w);
        }
        return false;
    }

    public final int hashCode() {
        return this.f130475w.hashCode();
    }
}
