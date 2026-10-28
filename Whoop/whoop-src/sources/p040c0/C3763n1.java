package p040c0;

import p077d0.C11344e;
import p636y3.C39180l;

/* JADX INFO: renamed from: c0.n1 */
/* JADX INFO: loaded from: classes.dex */
public final class C3763n1 {

    /* JADX INFO: renamed from: a */
    public final C11344e f15371a;

    /* JADX INFO: renamed from: b */
    public long f15372b;

    public C3763n1(C11344e c11344e, long j7) {
        this.f15371a = c11344e;
        this.f15372b = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3763n1)) {
            return false;
        }
        C3763n1 c3763n1 = (C3763n1) obj;
        return this.f15371a.equals(c3763n1.f15371a) && C39180l.m124799a(this.f15372b, c3763n1.f15372b);
    }

    public final int hashCode() {
        return Long.hashCode(this.f15372b) + (this.f15371a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimData(anim=" + this.f15371a + ", startSize=" + ((Object) C39180l.m124800b(this.f15372b)) + ')';
    }
}
