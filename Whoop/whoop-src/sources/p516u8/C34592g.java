package p516u8;

import java.util.Arrays;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p607x8.AbstractC38065t;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: u8.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C34592g {

    /* JADX INFO: renamed from: h */
    public static final C34592g f145657h = new C34592g(1, 2, 3, -1, -1, null);

    /* JADX INFO: renamed from: a */
    public final int f145658a;

    /* JADX INFO: renamed from: b */
    public final int f145659b;

    /* JADX INFO: renamed from: c */
    public final int f145660c;

    /* JADX INFO: renamed from: d */
    public final byte[] f145661d;

    /* JADX INFO: renamed from: e */
    public final int f145662e;

    /* JADX INFO: renamed from: f */
    public final int f145663f;

    /* JADX INFO: renamed from: g */
    public int f145664g;

    static {
        AbstractC33745d.m106663v(0, 1, 2, 3, 4);
        AbstractC38065t.m121892F(5);
    }

    public C34592g(int i13, int i14, int i15, int i16, int i17, byte[] bArr) {
        this.f145658a = i13;
        this.f145659b = i14;
        this.f145660c = i15;
        this.f145661d = bArr;
        this.f145662e = i16;
        this.f145663f = i17;
    }

    /* JADX INFO: renamed from: a */
    public static String m109383a(int i13) {
        if (i13 == -1) {
            return "Unset color range";
        }
        if (i13 != 1) {
            return i13 != 2 ? AbstractC2875y.m8295h(i13, "Undefined color range ") : "Limited range";
        }
        return "Full range";
    }

    /* JADX INFO: renamed from: b */
    public static String m109384b(int i13) {
        if (i13 == -1) {
            return "Unset color space";
        }
        if (i13 == 6) {
            return "BT2020";
        }
        if (i13 != 1) {
            return i13 != 2 ? AbstractC2875y.m8295h(i13, "Undefined color space ") : "BT601";
        }
        return "BT709";
    }

    /* JADX INFO: renamed from: c */
    public static String m109385c(int i13) {
        if (i13 == -1) {
            return "Unset color transfer";
        }
        if (i13 == 10) {
            return "Gamma 2.2";
        }
        if (i13 == 1) {
            return "Linear";
        }
        if (i13 == 2) {
            return "sRGB";
        }
        if (i13 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i13 != 6) {
            return i13 != 7 ? AbstractC2875y.m8295h(i13, "Undefined color transfer ") : "HLG";
        }
        return "ST2084 PQ";
    }

    /* JADX INFO: renamed from: e */
    public static boolean m109386e(C34592g c34592g) {
        if (c34592g == null) {
            return true;
        }
        int i13 = c34592g.f145658a;
        if (i13 != -1 && i13 != 1 && i13 != 2) {
            return false;
        }
        int i14 = c34592g.f145659b;
        if (i14 != -1 && i14 != 2) {
            return false;
        }
        int i15 = c34592g.f145660c;
        if ((i15 != -1 && i15 != 3) || c34592g.f145661d != null) {
            return false;
        }
        int i16 = c34592g.f145663f;
        if (i16 != -1 && i16 != 8) {
            return false;
        }
        int i17 = c34592g.f145662e;
        return i17 == -1 || i17 == 8;
    }

    /* JADX INFO: renamed from: f */
    public static int m109387f(int i13) {
        if (i13 == 1) {
            return 1;
        }
        if (i13 != 9) {
            return (i13 == 4 || i13 == 5 || i13 == 6 || i13 == 7) ? 2 : -1;
        }
        return 6;
    }

    /* JADX INFO: renamed from: g */
    public static int m109388g(int i13) {
        if (i13 == 1) {
            return 3;
        }
        if (i13 == 4) {
            return 10;
        }
        if (i13 == 13) {
            return 2;
        }
        if (i13 == 16) {
            return 6;
        }
        if (i13 != 18) {
            return (i13 == 6 || i13 == 7) ? 3 : -1;
        }
        return 7;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m109389d() {
        return (this.f145658a == -1 || this.f145659b == -1 || this.f145660c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C34592g.class == obj.getClass()) {
            C34592g c34592g = (C34592g) obj;
            if (this.f145658a == c34592g.f145658a && this.f145659b == c34592g.f145659b && this.f145660c == c34592g.f145660c && Arrays.equals(this.f145661d, c34592g.f145661d) && this.f145662e == c34592g.f145662e && this.f145663f == c34592g.f145663f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f145664g == 0) {
            this.f145664g = ((((Arrays.hashCode(this.f145661d) + ((((((527 + this.f145658a) * 31) + this.f145659b) * 31) + this.f145660c) * 31)) * 31) + this.f145662e) * 31) + this.f145663f;
        }
        return this.f145664g;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ColorInfo(");
        sb4.append(m109384b(this.f145658a));
        sb4.append(", ");
        sb4.append(m109383a(this.f145659b));
        sb4.append(", ");
        sb4.append(m109385c(this.f145660c));
        sb4.append(", ");
        sb4.append(this.f145661d != null);
        sb4.append(", ");
        int i13 = this.f145662e;
        sb4.append(i13 != -1 ? AbstractC31061c.m95635k(i13, "bit Luma") : "NA");
        sb4.append(", ");
        int i14 = this.f145663f;
        return AbstractC25012a.m73376i(i14 != -1 ? AbstractC31061c.m95635k(i14, "bit Chroma") : "NA", ")", sb4);
    }
}
