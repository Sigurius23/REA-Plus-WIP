package p654yn;

import p621xn.C38471h;

/* JADX INFO: renamed from: yn.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C39667g extends C38471h implements Comparable {

    /* JADX INFO: renamed from: J */
    public long f170710J;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C39667g c39667g = (C39667g) obj;
        if (m1496f(4) != c39667g.m1496f(4)) {
            return m1496f(4) ? 1 : -1;
        }
        long j7 = this.f148797F - c39667g.f148797F;
        if (j7 == 0) {
            j7 = this.f170710J - c39667g.f170710J;
            if (j7 == 0) {
                return 0;
            }
        }
        return j7 > 0 ? 1 : -1;
    }
}
