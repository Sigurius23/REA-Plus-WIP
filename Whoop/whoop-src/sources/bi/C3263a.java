package bi;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: bi.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C3263a {

    /* JADX INFO: renamed from: a */
    public final C3281s f12763a;

    public C3263a(C3281s c3281s) {
        this.f12763a = c3281s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3263a) && AbstractC22676k.m65745e(this.f12763a, ((C3263a) obj).f12763a);
    }

    public final int hashCode() {
        C3281s c3281s = this.f12763a;
        if (c3281s != null) {
            return c3281s.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ReadResult(request=null, response=" + this.f12763a + ')';
    }
}
