package g93;

import h93.C17031a;
import o73.C27648a;
import w83.AbstractC36949a;
import x43.AbstractC37978j;

/* JADX INFO: renamed from: g93.d */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15612d {

    /* JADX INFO: renamed from: w */
    public static final C15611c f58612w = new C15611c();

    /* JADX INFO: renamed from: x */
    public static final AbstractC15609a f58613x;

    static {
        Integer num = AbstractC36949a.f158107a;
        f58613x = (num == null || num.intValue() >= 34) ? new C17031a() : new C15610b();
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo43925a(int i13);

    /* JADX INFO: renamed from: b */
    public double mo43926b() {
        return AbstractC37978j.m121659t(mo43925a(26), mo43925a(27));
    }

    /* JADX INFO: renamed from: c */
    public double mo43931c(double d3) {
        return mo43932d(d3);
    }

    /* JADX INFO: renamed from: d */
    public double mo43932d(double d3) {
        double dMo43926b;
        C27648a.m83595r(d3);
        double d14 = d3 - 0.0d;
        if (!Double.isInfinite(d14) || Math.abs(0.0d) > Double.MAX_VALUE || Math.abs(d3) > Double.MAX_VALUE) {
            dMo43926b = 0.0d + (mo43926b() * d14);
        } else {
            double d15 = 2;
            double dMo43926b2 = ((d3 / d15) - (0.0d / d15)) * mo43926b();
            dMo43926b = 0.0d + dMo43926b2 + dMo43926b2;
        }
        return dMo43926b >= d3 ? Math.nextAfter(d3, Double.NEGATIVE_INFINITY) : dMo43926b;
    }

    /* JADX INFO: renamed from: e */
    public float mo43927e() {
        return mo43925a(24) / 1.6777216E7f;
    }

    /* JADX INFO: renamed from: f */
    public abstract int mo43928f();

    /* JADX INFO: renamed from: g */
    public int mo43929g(int i13) {
        return mo43933h(0, i13);
    }

    /* JADX INFO: renamed from: h */
    public int mo43933h(int i13, int i14) {
        int iMo43928f;
        int i15;
        int iMo43925a;
        C27648a.m83596s(i13, i14);
        int i16 = i14 - i13;
        if (i16 > 0 || i16 == Integer.MIN_VALUE) {
            if (((-i16) & i16) == i16) {
                iMo43925a = mo43925a(C27648a.m83602y(i16));
            } else {
                do {
                    iMo43928f = mo43928f() >>> 1;
                    i15 = iMo43928f % i16;
                } while ((i16 - 1) + (iMo43928f - i15) < 0);
                iMo43925a = i15;
            }
            return i13 + iMo43925a;
        }
        while (true) {
            int iMo43928f2 = mo43928f();
            if (i13 <= iMo43928f2 && iMo43928f2 < i14) {
                return iMo43928f2;
            }
        }
    }
}
