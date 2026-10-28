package p242j4;

import p319m4.C25016e;

/* JADX INFO: renamed from: j4.f */
/* JADX INFO: loaded from: classes.dex */
public final class C21306f {

    /* JADX INFO: renamed from: h */
    public static final String f81457h = new String("FIXED_DIMENSION");

    /* JADX INFO: renamed from: i */
    public static final String f81458i = new String("WRAP_DIMENSION");

    /* JADX INFO: renamed from: j */
    public static final String f81459j = new String("SPREAD_DIMENSION");

    /* JADX INFO: renamed from: k */
    public static final String f81460k = new String("PARENT_DIMENSION");

    /* JADX INFO: renamed from: l */
    public static final String f81461l = new String("PERCENT_DIMENSION");

    /* JADX INFO: renamed from: m */
    public static final String f81462m = new String("RATIO_DIMENSION");

    /* JADX INFO: renamed from: f */
    public String f81468f;

    /* JADX INFO: renamed from: a */
    public int f81463a = 0;

    /* JADX INFO: renamed from: b */
    public int f81464b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c */
    public float f81465c = 1.0f;

    /* JADX INFO: renamed from: d */
    public int f81466d = 0;

    /* JADX INFO: renamed from: e */
    public String f81467e = null;

    /* JADX INFO: renamed from: g */
    public boolean f81469g = false;

    public C21306f(String str) {
        this.f81468f = str;
    }

    /* JADX INFO: renamed from: b */
    public static C21306f m59826b(int i13) {
        C21306f c21306f = new C21306f(f81457h);
        c21306f.f81468f = null;
        c21306f.f81466d = i13;
        return c21306f;
    }

    /* JADX INFO: renamed from: c */
    public static C21306f m59827c(String str) {
        C21306f c21306f = new C21306f();
        c21306f.f81463a = 0;
        c21306f.f81464b = Integer.MAX_VALUE;
        c21306f.f81465c = 1.0f;
        c21306f.f81466d = 0;
        c21306f.f81467e = null;
        c21306f.f81468f = str;
        c21306f.f81469g = true;
        return c21306f;
    }

    /* JADX INFO: renamed from: a */
    public final void m59828a(C25016e c25016e, int i13) {
        String str = this.f81467e;
        if (str != null) {
            c25016e.m73421K(str);
        }
        int i14 = 1;
        String str2 = f81460k;
        String str3 = f81461l;
        String str4 = f81458i;
        if (i13 == 0) {
            if (this.f81469g) {
                c25016e.m73425O(3);
                String str5 = this.f81468f;
                if (str5 != str4) {
                    i14 = str5 == str3 ? 2 : 0;
                }
                c25016e.m73426P(this.f81465c, i14, this.f81463a, this.f81464b);
                return;
            }
            int i15 = this.f81463a;
            if (i15 > 0) {
                if (i15 < 0) {
                    c25016e.f97912c0 = 0;
                } else {
                    c25016e.f97912c0 = i15;
                }
            }
            int i16 = this.f81464b;
            if (i16 < Integer.MAX_VALUE) {
                c25016e.f97884D[0] = i16;
            }
            String str6 = this.f81468f;
            if (str6 == str4) {
                c25016e.m73425O(2);
                return;
            }
            if (str6 == str2) {
                c25016e.m73425O(4);
                return;
            } else {
                if (str6 == null) {
                    c25016e.m73425O(1);
                    c25016e.m73429S(this.f81466d);
                    return;
                }
                return;
            }
        }
        if (this.f81469g) {
            c25016e.m73427Q(3);
            String str7 = this.f81468f;
            if (str7 != str4) {
                i14 = str7 == str3 ? 2 : 0;
            }
            c25016e.m73428R(this.f81465c, i14, this.f81463a, this.f81464b);
            return;
        }
        int i17 = this.f81463a;
        if (i17 > 0) {
            if (i17 < 0) {
                c25016e.f97914d0 = 0;
            } else {
                c25016e.f97914d0 = i17;
            }
        }
        int i18 = this.f81464b;
        if (i18 < Integer.MAX_VALUE) {
            c25016e.f97884D[1] = i18;
        }
        String str8 = this.f81468f;
        if (str8 == str4) {
            c25016e.m73427Q(2);
            return;
        }
        if (str8 == str2) {
            c25016e.m73427Q(4);
        } else if (str8 == null) {
            c25016e.m73427Q(1);
            c25016e.m73424N(this.f81466d);
        }
    }
}
