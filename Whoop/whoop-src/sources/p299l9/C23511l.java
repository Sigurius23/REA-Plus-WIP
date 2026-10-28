package p299l9;

import java.util.List;
import p031b9.C2856o0;
import p690zr.AbstractC41023g0;
import p690zr.C41014d0;
import p690zr.C41060w0;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: l9.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C23511l implements InterfaceC23486b1 {

    /* JADX INFO: renamed from: w */
    public final C41060w0 f93057w;

    /* JADX INFO: renamed from: x */
    public long f93058x;

    public C23511l(List list, List list2) {
        C41014d0 c41014d0M133251l = AbstractC41023g0.m133251l();
        AbstractC35849g.m113802d(list.size() == list2.size());
        for (int i13 = 0; i13 < list.size(); i13++) {
            c41014d0M133251l.m133222a(new C23509k((InterfaceC23486b1) list.get(i13), (List) list2.get(i13)));
        }
        this.f93057w = c41014d0M133251l.m133239f();
        this.f93058x = -9223372036854775807L;
    }

    @Override // p299l9.InterfaceC23486b1
    /* JADX INFO: renamed from: a */
    public final boolean mo36121a() {
        int i13 = 0;
        while (true) {
            C41060w0 c41060w0 = this.f93057w;
            if (i13 >= c41060w0.f177069z) {
                return false;
            }
            if (((C23509k) c41060w0.get(i13)).f93045w.mo36121a()) {
                return true;
            }
            i13++;
        }
    }

    @Override // p299l9.InterfaceC23486b1
    /* JADX INFO: renamed from: d */
    public final long mo36122d() {
        int i13 = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            C41060w0 c41060w0 = this.f93057w;
            if (i13 >= c41060w0.f177069z) {
                break;
            }
            long jMo36122d = ((C23509k) c41060w0.get(i13)).f93045w.mo36122d();
            if (jMo36122d != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo36122d);
            }
            i13++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // p299l9.InterfaceC23486b1
    /* JADX INFO: renamed from: m */
    public final long mo36129m() {
        int i13 = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            C41060w0 c41060w0 = this.f93057w;
            if (i13 >= c41060w0.f177069z) {
                break;
            }
            C23509k c23509k = (C23509k) c41060w0.get(i13);
            long jMo36129m = c23509k.f93045w.mo36129m();
            AbstractC41023g0 abstractC41023g0 = c23509k.f93046x;
            if ((abstractC41023g0.contains(1) || abstractC41023g0.contains(2) || abstractC41023g0.contains(4)) && jMo36129m != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo36129m);
            }
            if (jMo36129m != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jMo36129m);
            }
            i13++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.f93058x = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j7 = this.f93058x;
        return j7 != -9223372036854775807L ? j7 : jMin2;
    }

    @Override // p299l9.InterfaceC23486b1
    /* JADX INFO: renamed from: n */
    public final void mo36130n(long j7) {
        int i13 = 0;
        while (true) {
            C41060w0 c41060w0 = this.f93057w;
            if (i13 >= c41060w0.f177069z) {
                return;
            }
            ((C23509k) c41060w0.get(i13)).mo36130n(j7);
            i13++;
        }
    }

    @Override // p299l9.InterfaceC23486b1
    /* JADX INFO: renamed from: x */
    public final boolean mo36134x(C2856o0 c2856o0) {
        boolean zMo36134x;
        boolean z4 = false;
        do {
            long jMo36122d = mo36122d();
            if (jMo36122d == Long.MIN_VALUE) {
                return z4;
            }
            int i13 = 0;
            zMo36134x = false;
            while (true) {
                C41060w0 c41060w0 = this.f93057w;
                if (i13 >= c41060w0.f177069z) {
                    break;
                }
                long jMo36122d2 = ((C23509k) c41060w0.get(i13)).f93045w.mo36122d();
                boolean z13 = jMo36122d2 != Long.MIN_VALUE && jMo36122d2 <= c2856o0.f11327a;
                if (jMo36122d2 == jMo36122d || z13) {
                    zMo36134x |= ((C23509k) c41060w0.get(i13)).f93045w.mo36134x(c2856o0);
                }
                i13++;
            }
            z4 |= zMo36134x;
        } while (zMo36134x);
        return z4;
    }
}
