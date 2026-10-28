package p333n4;

import java.util.ArrayList;
import p031b9.AbstractC2875y;
import p319m4.C25016e;
import p319m4.C25017f;

/* JADX INFO: renamed from: n4.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C26257m {

    /* JADX INFO: renamed from: a */
    public final AbstractC26260p f104395a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f104396b = new ArrayList();

    public C26257m(AbstractC26260p abstractC26260p) {
        this.f104395a = null;
        this.f104395a = abstractC26260p;
    }

    /* JADX INFO: renamed from: c */
    public static long m77930c(C26251g c26251g, long j7) {
        AbstractC26260p abstractC26260p = c26251g.f104383d;
        ArrayList arrayList = c26251g.f104390k;
        if (abstractC26260p instanceof C26255k) {
            return j7;
        }
        int size = arrayList.size();
        long jMin = j7;
        for (int i13 = 0; i13 < size; i13++) {
            InterfaceC26249e interfaceC26249e = (InterfaceC26249e) arrayList.get(i13);
            if (interfaceC26249e instanceof C26251g) {
                C26251g c26251g2 = (C26251g) interfaceC26249e;
                if (c26251g2.f104383d != abstractC26260p) {
                    jMin = Math.min(jMin, m77930c(c26251g2, ((long) c26251g2.f104385f) + j7));
                }
            }
        }
        C26251g c26251g3 = abstractC26260p.f104413i;
        C26251g c26251g4 = abstractC26260p.f104412h;
        if (c26251g != c26251g3) {
            return jMin;
        }
        long jMo77905j = j7 - abstractC26260p.mo77905j();
        return Math.min(Math.min(jMin, m77930c(c26251g4, jMo77905j)), jMo77905j - ((long) c26251g4.f104385f));
    }

    /* JADX INFO: renamed from: d */
    public static long m77931d(C26251g c26251g, long j7) {
        AbstractC26260p abstractC26260p = c26251g.f104383d;
        ArrayList arrayList = c26251g.f104390k;
        if (abstractC26260p instanceof C26255k) {
            return j7;
        }
        int size = arrayList.size();
        long jMax = j7;
        for (int i13 = 0; i13 < size; i13++) {
            InterfaceC26249e interfaceC26249e = (InterfaceC26249e) arrayList.get(i13);
            if (interfaceC26249e instanceof C26251g) {
                C26251g c26251g2 = (C26251g) interfaceC26249e;
                if (c26251g2.f104383d != abstractC26260p) {
                    jMax = Math.max(jMax, m77931d(c26251g2, ((long) c26251g2.f104385f) + j7));
                }
            }
        }
        C26251g c26251g3 = abstractC26260p.f104412h;
        C26251g c26251g4 = abstractC26260p.f104413i;
        if (c26251g != c26251g3) {
            return jMax;
        }
        long jMo77905j = abstractC26260p.mo77905j() + j7;
        return Math.max(Math.max(jMax, m77931d(c26251g4, jMo77905j)), jMo77905j - ((long) c26251g4.f104385f));
    }

    /* JADX INFO: renamed from: a */
    public final void m77932a(AbstractC26260p abstractC26260p) {
        this.f104396b.add(abstractC26260p);
    }

    /* JADX INFO: renamed from: b */
    public final long m77933b(C25017f c25017f, int i13) {
        float f13;
        long j7;
        AbstractC26260p abstractC26260p = this.f104395a;
        if (!(abstractC26260p instanceof C26248d) ? i13 != 0 ? (abstractC26260p instanceof C26258n) : (abstractC26260p instanceof C26256l) : ((C26248d) abstractC26260p).f104410f == i13) {
            return 0L;
        }
        C26251g c26251g = (i13 == 0 ? c25017f.f97913d : c25017f.f97915e).f104412h;
        C26251g c26251g2 = (i13 == 0 ? c25017f.f97913d : c25017f.f97915e).f104413i;
        C26251g c26251g3 = abstractC26260p.f104412h;
        C26251g c26251g4 = abstractC26260p.f104412h;
        C26251g c26251g5 = abstractC26260p.f104413i;
        boolean zContains = c26251g3.f104391l.contains(c26251g);
        boolean zContains2 = c26251g5.f104391l.contains(c26251g2);
        long jMo77905j = abstractC26260p.mo77905j();
        if (!zContains || !zContains2) {
            if (zContains) {
                return Math.max(m77931d(c26251g4, c26251g4.f104385f), ((long) c26251g4.f104385f) + jMo77905j);
            }
            if (zContains2) {
                return Math.max(-m77930c(c26251g5, c26251g5.f104385f), ((long) (-c26251g5.f104385f)) + jMo77905j);
            }
            return (abstractC26260p.mo77905j() + ((long) c26251g4.f104385f)) - ((long) c26251g5.f104385f);
        }
        long jM77931d = m77931d(c26251g4, 0L);
        long jM77930c = m77930c(c26251g5, 0L);
        long j13 = jM77931d - jMo77905j;
        int i14 = c26251g5.f104385f;
        if (j13 >= (-i14)) {
            j13 += (long) i14;
        }
        long j14 = c26251g4.f104385f;
        long j15 = ((-jM77930c) - jMo77905j) - j14;
        if (j15 >= j14) {
            j15 -= j14;
        }
        C25016e c25016e = abstractC26260p.f104406b;
        if (i13 == 0) {
            f13 = c25016e.f97916e0;
        } else if (i13 == 1) {
            f13 = c25016e.f97918f0;
        } else {
            c25016e.getClass();
            f13 = -1.0f;
        }
        if (f13 > 0.0f) {
            j7 = (long) ((j13 / (1.0f - f13)) + (j15 / f13));
        } else {
            j7 = 0;
        }
        float f14 = j7;
        return (((long) c26251g4.f104385f) + ((((long) ((f14 * f13) + 0.5f)) + jMo77905j) + ((long) AbstractC2875y.m8288a(1.0f, f13, f14, 0.5f)))) - ((long) c26251g5.f104385f);
    }
}
