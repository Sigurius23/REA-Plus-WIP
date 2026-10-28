package p455ra;

import qa.C30104i;

/* JADX INFO: renamed from: ra.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C31176g extends C30104i implements Comparable {

    /* JADX INFO: renamed from: K */
    public long f128465K;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C31176g c31176g = (C31176g) obj;
        if (m1496f(4) != c31176g.m1496f(4)) {
            return m1496f(4) ? 1 : -1;
        }
        long j7 = this.f2065G - c31176g.f2065G;
        if (j7 == 0) {
            j7 = this.f128465K - c31176g.f128465K;
            if (j7 == 0) {
                return 0;
            }
        }
        return j7 > 0 ? 1 : -1;
    }
}
