package bi;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: bi.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3264b {

    /* JADX INFO: renamed from: a */
    public final C3281s f12764a;

    public C3264b(C3281s c3281s) {
        this.f12764a = c3281s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3264b) {
            return AbstractC22676k.m65745e(this.f12764a, ((C3264b) obj).f12764a);
        }
        return false;
    }

    public final int hashCode() {
        C3281s c3281s = this.f12764a;
        if (c3281s != null) {
            return c3281s.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "WriteResult(response=" + this.f12764a + ')';
    }
}
