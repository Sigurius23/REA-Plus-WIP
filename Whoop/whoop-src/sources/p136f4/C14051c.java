package p136f4;

import bd3.C3143v;
import com.google.crypto.tink.internal.C5101l0;
import java.util.ArrayList;
import java.util.Arrays;
import p005a3.C0237p;
import p319m4.C25015d;

/* JADX INFO: renamed from: f4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C14051c {

    /* JADX INFO: renamed from: q */
    public static boolean f50153q = false;

    /* JADX INFO: renamed from: d */
    public final C14053e f50157d;

    /* JADX INFO: renamed from: m */
    public final C0237p f50166m;

    /* JADX INFO: renamed from: p */
    public C14050b f50169p;

    /* JADX INFO: renamed from: a */
    public int f50154a = 1000;

    /* JADX INFO: renamed from: b */
    public boolean f50155b = false;

    /* JADX INFO: renamed from: c */
    public int f50156c = 0;

    /* JADX INFO: renamed from: e */
    public int f50158e = 32;

    /* JADX INFO: renamed from: f */
    public int f50159f = 32;

    /* JADX INFO: renamed from: h */
    public boolean f50161h = false;

    /* JADX INFO: renamed from: i */
    public boolean[] f50162i = new boolean[32];

    /* JADX INFO: renamed from: j */
    public int f50163j = 1;

    /* JADX INFO: renamed from: k */
    public int f50164k = 0;

    /* JADX INFO: renamed from: l */
    public int f50165l = 32;

    /* JADX INFO: renamed from: n */
    public C14054f[] f50167n = new C14054f[1000];

    /* JADX INFO: renamed from: o */
    public int f50168o = 0;

    /* JADX INFO: renamed from: g */
    public C14050b[] f50160g = new C14050b[32];

    public C14051c() {
        m40012s();
        C0237p c0237p = new C0237p(5, false);
        c0237p.f812x = new C3143v(3, (byte) 0);
        c0237p.f813y = new C3143v(3, (byte) 0);
        c0237p.f814z = new C14054f[32];
        this.f50166m = c0237p;
        C14053e c14053e = new C14053e(c0237p);
        c14053e.f50170f = new C14054f[128];
        c14053e.f50171g = 0;
        c14053e.f50172h = new C5101l0(c14053e);
        this.f50157d = c14053e;
        this.f50169p = new C14050b(c0237p);
    }

    /* JADX INFO: renamed from: n */
    public static int m39994n(Object obj) {
        C14054f c14054f = ((C25015d) obj).f97880i;
        if (c14054f != null) {
            return (int) (c14054f.f50173E + 0.5f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public final C14054f m39995a(int i13) {
        C3143v c3143v = (C3143v) this.f50166m.f813y;
        int i14 = c3143v.f12310x;
        Object obj = null;
        if (i14 > 0) {
            int i15 = i14 - 1;
            Object[] objArr = (Object[]) c3143v.f12311y;
            Object obj2 = objArr[i15];
            objArr[i15] = null;
            c3143v.f12310x = i15;
            obj = obj2;
        }
        C14054f c14054f = (C14054f) obj;
        if (c14054f == null) {
            c14054f = new C14054f(i13);
            c14054f.f50180L = i13;
        } else {
            c14054f.m40018c();
            c14054f.f50180L = i13;
        }
        int i16 = this.f50168o;
        int i17 = this.f50154a;
        if (i16 >= i17) {
            int i18 = i17 * 2;
            this.f50154a = i18;
            this.f50167n = (C14054f[]) Arrays.copyOf(this.f50167n, i18);
        }
        C14054f[] c14054fArr = this.f50167n;
        int i19 = this.f50168o;
        this.f50168o = i19 + 1;
        c14054fArr[i19] = c14054f;
        return c14054f;
    }

    /* JADX INFO: renamed from: b */
    public final void m39996b(C14054f c14054f, C14054f c14054f2, int i13, float f13, C14054f c14054f3, C14054f c14054f4, int i14, int i15) {
        C14050b c14050bM40006l = m40006l();
        if (c14054f2 == c14054f3) {
            c14050bM40006l.f50151d.m39983g(c14054f, 1.0f);
            c14050bM40006l.f50151d.m39983g(c14054f4, 1.0f);
            c14050bM40006l.f50151d.m39983g(c14054f2, -2.0f);
        } else if (f13 == 0.5f) {
            c14050bM40006l.f50151d.m39983g(c14054f, 1.0f);
            c14050bM40006l.f50151d.m39983g(c14054f2, -1.0f);
            c14050bM40006l.f50151d.m39983g(c14054f3, -1.0f);
            c14050bM40006l.f50151d.m39983g(c14054f4, 1.0f);
            if (i13 > 0 || i14 > 0) {
                c14050bM40006l.f50149b = (-i13) + i14;
            }
        } else if (f13 <= 0.0f) {
            c14050bM40006l.f50151d.m39983g(c14054f, -1.0f);
            c14050bM40006l.f50151d.m39983g(c14054f2, 1.0f);
            c14050bM40006l.f50149b = i13;
        } else if (f13 >= 1.0f) {
            c14050bM40006l.f50151d.m39983g(c14054f4, -1.0f);
            c14050bM40006l.f50151d.m39983g(c14054f3, 1.0f);
            c14050bM40006l.f50149b = -i14;
        } else {
            float f14 = 1.0f - f13;
            c14050bM40006l.f50151d.m39983g(c14054f, f14 * 1.0f);
            c14050bM40006l.f50151d.m39983g(c14054f2, f14 * (-1.0f));
            c14050bM40006l.f50151d.m39983g(c14054f3, (-1.0f) * f13);
            c14050bM40006l.f50151d.m39983g(c14054f4, 1.0f * f13);
            if (i13 > 0 || i14 > 0) {
                c14050bM40006l.f50149b = (i14 * f13) + ((-i13) * f14);
            }
        }
        if (i15 != 8) {
            c14050bM40006l.m39985a(this, i15);
        }
        m39997c(c14050bM40006l);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f8  */
    /* JADX INFO: renamed from: c */
    public final void m39997c(C14050b c14050b) {
        boolean z4;
        boolean z13;
        C14054f c14054fM39990f;
        if (this.f50164k + 1 >= this.f50165l || this.f50163j + 1 >= this.f50159f) {
            m40008o();
        }
        if (c14050b.f50152e) {
            z4 = false;
        } else {
            ArrayList arrayList = c14050b.f50150c;
            if (this.f50160g.length != 0) {
                boolean z14 = false;
                while (!z14) {
                    int iM39980d = c14050b.f50151d.m39980d();
                    for (int i13 = 0; i13 < iM39980d; i13++) {
                        C14054f c14054fM39981e = c14050b.f50151d.m39981e(i13);
                        if (c14054fM39981e.f50183y != -1 || c14054fM39981e.f50174F) {
                            arrayList.add(c14054fM39981e);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i14 = 0; i14 < size; i14++) {
                            C14054f c14054f = (C14054f) arrayList.get(i14);
                            if (c14054f.f50174F) {
                                c14050b.m39992h(this, c14054f, true);
                            } else {
                                c14050b.mo39993i(this, this.f50160g[c14054f.f50183y], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z14 = true;
                    }
                }
                if (c14050b.f50148a != null && c14050b.f50151d.m39980d() == 0) {
                    c14050b.f50152e = true;
                    this.f50155b = true;
                }
            }
            if (c14050b.mo39989e()) {
                return;
            }
            float f13 = c14050b.f50149b;
            float f14 = 0.0f;
            if (f13 < 0.0f) {
                c14050b.f50149b = f13 * (-1.0f);
                C14049a c14049a = c14050b.f50151d;
                int i15 = c14049a.f50145h;
                for (int i16 = 0; i15 != -1 && i16 < c14049a.f50138a; i16++) {
                    float[] fArr = c14049a.f50144g;
                    fArr[i15] = fArr[i15] * (-1.0f);
                    i15 = c14049a.f50143f[i15];
                }
            }
            int iM39980d2 = c14050b.f50151d.m39980d();
            float f15 = 0.0f;
            float f16 = 0.0f;
            C14054f c14054f2 = null;
            C14054f c14054f3 = null;
            int i17 = 0;
            boolean z15 = false;
            boolean z16 = false;
            while (i17 < iM39980d2) {
                float fM39982f = c14050b.f50151d.m39982f(i17);
                C14054f c14054fM39981e2 = c14050b.f50151d.m39981e(i17);
                float f17 = f14;
                if (c14054fM39981e2.f50180L == 1) {
                    if (c14054f2 == null) {
                        if (c14054fM39981e2.f50179K <= 1) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        c14054f2 = c14054fM39981e2;
                        f15 = fM39982f;
                    } else {
                        if (f15 > fM39982f) {
                            if (c14054fM39981e2.f50179K > 1) {
                                z15 = false;
                            }
                            c14054f2 = c14054fM39981e2;
                            f15 = fM39982f;
                        } else if (z15 || c14054fM39981e2.f50179K > 1) {
                        }
                        z15 = true;
                        c14054f2 = c14054fM39981e2;
                        f15 = fM39982f;
                    }
                } else if (c14054f2 == null && fM39982f < f17) {
                    if (c14054f3 == null) {
                        if (c14054fM39981e2.f50179K <= 1) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        c14054f3 = c14054fM39981e2;
                        f16 = fM39982f;
                    } else {
                        if (f16 > fM39982f) {
                            if (c14054fM39981e2.f50179K > 1) {
                                z16 = false;
                            }
                            c14054f3 = c14054fM39981e2;
                            f16 = fM39982f;
                        } else if (z16 || c14054fM39981e2.f50179K > 1) {
                        }
                        z16 = true;
                        c14054f3 = c14054fM39981e2;
                        f16 = fM39982f;
                    }
                }
                i17++;
                f14 = f17;
            }
            float f18 = f14;
            if (c14054f2 == null) {
                c14054f2 = c14054f3;
            }
            if (c14054f2 == null) {
                z13 = true;
            } else {
                c14050b.m39991g(c14054f2);
                z13 = false;
            }
            if (c14050b.f50151d.m39980d() == 0) {
                c14050b.f50152e = true;
            }
            if (z13) {
                if (this.f50163j + 1 >= this.f50159f) {
                    m40008o();
                }
                C14054f c14054fM39995a = m39995a(3);
                int i18 = this.f50156c + 1;
                this.f50156c = i18;
                this.f50163j++;
                c14054fM39995a.f50182x = i18;
                C0237p c0237p = this.f50166m;
                ((C14054f[]) c0237p.f814z)[i18] = c14054fM39995a;
                c14050b.f50148a = c14054fM39995a;
                int i19 = this.f50164k;
                m40002h(c14050b);
                if (this.f50164k == i19 + 1) {
                    C14050b c14050b2 = this.f50169p;
                    c14050b2.f50148a = null;
                    c14050b2.f50151d.m39978b();
                    for (int i24 = 0; i24 < c14050b.f50151d.m39980d(); i24++) {
                        c14050b2.f50151d.m39977a(c14050b.f50151d.m39981e(i24), c14050b.f50151d.m39982f(i24), true);
                    }
                    m40011r(this.f50169p);
                    if (c14054fM39995a.f50183y == -1) {
                        if (c14050b.f50148a == c14054fM39995a && (c14054fM39990f = c14050b.m39990f(null, c14054fM39995a)) != null) {
                            c14050b.m39991g(c14054fM39990f);
                        }
                        if (!c14050b.f50152e) {
                            c14050b.f50148a.m40020e(this, c14050b);
                        }
                        ((C3143v) c0237p.f812x).m9042k(c14050b);
                        this.f50164k--;
                    }
                    z4 = true;
                } else {
                    z4 = false;
                }
            } else {
                z4 = false;
            }
            C14054f c14054f4 = c14050b.f50148a;
            if (c14054f4 == null) {
                return;
            }
            if (c14054f4.f50180L != 1 && c14050b.f50149b < f18) {
                return;
            }
        }
        if (z4) {
            return;
        }
        m40002h(c14050b);
    }

    /* JADX INFO: renamed from: d */
    public final void m39998d(C14054f c14054f, int i13) {
        int i14 = c14054f.f50183y;
        if (i14 == -1) {
            c14054f.m40019d(this, i13);
            for (int i15 = 0; i15 < this.f50156c + 1; i15++) {
                C14054f c14054f2 = ((C14054f[]) this.f50166m.f814z)[i15];
            }
            return;
        }
        if (i14 == -1) {
            C14050b c14050bM40006l = m40006l();
            c14050bM40006l.f50148a = c14054f;
            float f13 = i13;
            c14054f.f50173E = f13;
            c14050bM40006l.f50149b = f13;
            c14050bM40006l.f50152e = true;
            m39997c(c14050bM40006l);
            return;
        }
        C14050b c14050b = this.f50160g[i14];
        if (c14050b.f50152e) {
            c14050b.f50149b = i13;
            return;
        }
        if (c14050b.f50151d.m39980d() == 0) {
            c14050b.f50152e = true;
            c14050b.f50149b = i13;
            return;
        }
        C14050b c14050bM40006l2 = m40006l();
        if (i13 < 0) {
            c14050bM40006l2.f50149b = i13 * (-1);
            c14050bM40006l2.f50151d.m39983g(c14054f, 1.0f);
        } else {
            c14050bM40006l2.f50149b = i13;
            c14050bM40006l2.f50151d.m39983g(c14054f, -1.0f);
        }
        m39997c(c14050bM40006l2);
    }

    /* JADX INFO: renamed from: e */
    public final void m39999e(C14054f c14054f, C14054f c14054f2, int i13, int i14) {
        if (i14 == 8 && c14054f2.f50174F && c14054f.f50183y == -1) {
            c14054f.m40019d(this, c14054f2.f50173E + i13);
            return;
        }
        C14050b c14050bM40006l = m40006l();
        boolean z4 = false;
        if (i13 != 0) {
            if (i13 < 0) {
                i13 *= -1;
                z4 = true;
            }
            c14050bM40006l.f50149b = i13;
        }
        if (z4) {
            c14050bM40006l.f50151d.m39983g(c14054f, 1.0f);
            c14050bM40006l.f50151d.m39983g(c14054f2, -1.0f);
        } else {
            c14050bM40006l.f50151d.m39983g(c14054f, -1.0f);
            c14050bM40006l.f50151d.m39983g(c14054f2, 1.0f);
        }
        if (i14 != 8) {
            c14050bM40006l.m39985a(this, i14);
        }
        m39997c(c14050bM40006l);
    }

    /* JADX INFO: renamed from: f */
    public final void m40000f(C14054f c14054f, C14054f c14054f2, int i13, int i14) {
        C14050b c14050bM40006l = m40006l();
        C14054f c14054fM40007m = m40007m();
        c14054fM40007m.f50184z = 0;
        c14050bM40006l.m39986b(c14054f, c14054f2, c14054fM40007m, i13);
        if (i14 != 8) {
            c14050bM40006l.f50151d.m39983g(m40004j(i14), (int) (c14050bM40006l.f50151d.m39979c(c14054fM40007m) * (-1.0f)));
        }
        m39997c(c14050bM40006l);
    }

    /* JADX INFO: renamed from: g */
    public final void m40001g(C14054f c14054f, C14054f c14054f2, int i13, int i14) {
        C14050b c14050bM40006l = m40006l();
        C14054f c14054fM40007m = m40007m();
        c14054fM40007m.f50184z = 0;
        c14050bM40006l.m39987c(c14054f, c14054f2, c14054fM40007m, i13);
        if (i14 != 8) {
            c14050bM40006l.f50151d.m39983g(m40004j(i14), (int) (c14050bM40006l.f50151d.m39979c(c14054fM40007m) * (-1.0f)));
        }
        m39997c(c14050bM40006l);
    }

    /* JADX INFO: renamed from: h */
    public final void m40002h(C14050b c14050b) {
        int i13;
        if (c14050b.f50152e) {
            c14050b.f50148a.m40019d(this, c14050b.f50149b);
        } else {
            C14050b[] c14050bArr = this.f50160g;
            int i14 = this.f50164k;
            c14050bArr[i14] = c14050b;
            C14054f c14054f = c14050b.f50148a;
            c14054f.f50183y = i14;
            this.f50164k = i14 + 1;
            c14054f.m40020e(this, c14050b);
        }
        if (this.f50155b) {
            int i15 = 0;
            while (i15 < this.f50164k) {
                if (this.f50160g[i15] == null) {
                    System.out.println("WTF");
                }
                C14050b c14050b2 = this.f50160g[i15];
                if (c14050b2 != null && c14050b2.f50152e) {
                    c14050b2.f50148a.m40019d(this, c14050b2.f50149b);
                    ((C3143v) this.f50166m.f812x).m9042k(c14050b2);
                    this.f50160g[i15] = null;
                    int i16 = i15 + 1;
                    int i17 = i16;
                    while (true) {
                        i13 = this.f50164k;
                        if (i16 >= i13) {
                            break;
                        }
                        C14050b[] c14050bArr2 = this.f50160g;
                        int i18 = i16 - 1;
                        C14050b c14050b3 = c14050bArr2[i16];
                        c14050bArr2[i18] = c14050b3;
                        C14054f c14054f2 = c14050b3.f50148a;
                        if (c14054f2.f50183y == i16) {
                            c14054f2.f50183y = i18;
                        }
                        i17 = i16;
                        i16++;
                    }
                    if (i17 < i13) {
                        this.f50160g[i17] = null;
                    }
                    this.f50164k = i13 - 1;
                    i15--;
                }
                i15++;
            }
            this.f50155b = false;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m40003i() {
        for (int i13 = 0; i13 < this.f50164k; i13++) {
            C14050b c14050b = this.f50160g[i13];
            c14050b.f50148a.f50173E = c14050b.f50149b;
        }
    }

    /* JADX INFO: renamed from: j */
    public final C14054f m40004j(int i13) {
        if (this.f50163j + 1 >= this.f50159f) {
            m40008o();
        }
        C14054f c14054fM39995a = m39995a(4);
        float[] fArr = c14054fM39995a.f50176H;
        int i14 = this.f50156c + 1;
        this.f50156c = i14;
        this.f50163j++;
        c14054fM39995a.f50182x = i14;
        c14054fM39995a.f50184z = i13;
        ((C14054f[]) this.f50166m.f814z)[i14] = c14054fM39995a;
        C14053e c14053e = this.f50157d;
        c14053e.f50172h.f21443x = c14054fM39995a;
        Arrays.fill(fArr, 0.0f);
        fArr[c14054fM39995a.f50184z] = 1.0f;
        c14053e.m40014j(c14054fM39995a);
        return c14054fM39995a;
    }

    /* JADX INFO: renamed from: k */
    public final C14054f m40005k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f50163j + 1 >= this.f50159f) {
            m40008o();
        }
        if (!(obj instanceof C25015d)) {
            return null;
        }
        C25015d c25015d = (C25015d) obj;
        C14054f c14054f = c25015d.f97880i;
        if (c14054f == null) {
            c25015d.m73409k();
            c14054f = c25015d.f97880i;
        }
        int i13 = c14054f.f50182x;
        C0237p c0237p = this.f50166m;
        if (i13 != -1 && i13 <= this.f50156c && ((C14054f[]) c0237p.f814z)[i13] != null) {
            return c14054f;
        }
        if (i13 != -1) {
            c14054f.m40018c();
        }
        int i14 = this.f50156c + 1;
        this.f50156c = i14;
        this.f50163j++;
        c14054f.f50182x = i14;
        c14054f.f50180L = 1;
        ((C14054f[]) c0237p.f814z)[i14] = c14054f;
        return c14054f;
    }

    /* JADX INFO: renamed from: l */
    public final C14050b m40006l() {
        Object obj;
        C0237p c0237p = this.f50166m;
        C3143v c3143v = (C3143v) c0237p.f812x;
        int i13 = c3143v.f12310x;
        if (i13 > 0) {
            int i14 = i13 - 1;
            Object[] objArr = (Object[]) c3143v.f12311y;
            obj = objArr[i14];
            objArr[i14] = null;
            c3143v.f12310x = i14;
        } else {
            obj = null;
        }
        C14050b c14050b = (C14050b) obj;
        if (c14050b == null) {
            return new C14050b(c0237p);
        }
        c14050b.f50148a = null;
        c14050b.f50151d.m39978b();
        c14050b.f50149b = 0.0f;
        c14050b.f50152e = false;
        return c14050b;
    }

    /* JADX INFO: renamed from: m */
    public final C14054f m40007m() {
        if (this.f50163j + 1 >= this.f50159f) {
            m40008o();
        }
        C14054f c14054fM39995a = m39995a(3);
        int i13 = this.f50156c + 1;
        this.f50156c = i13;
        this.f50163j++;
        c14054fM39995a.f50182x = i13;
        ((C14054f[]) this.f50166m.f814z)[i13] = c14054fM39995a;
        return c14054fM39995a;
    }

    /* JADX INFO: renamed from: o */
    public final void m40008o() {
        int i13 = this.f50158e * 2;
        this.f50158e = i13;
        this.f50160g = (C14050b[]) Arrays.copyOf(this.f50160g, i13);
        C0237p c0237p = this.f50166m;
        c0237p.f814z = (C14054f[]) Arrays.copyOf((C14054f[]) c0237p.f814z, this.f50158e);
        int i14 = this.f50158e;
        this.f50162i = new boolean[i14];
        this.f50159f = i14;
        this.f50165l = i14;
    }

    /* JADX INFO: renamed from: p */
    public final void m40009p() {
        C14053e c14053e = this.f50157d;
        if (c14053e.mo39989e()) {
            m40003i();
            return;
        }
        if (!this.f50161h) {
            m40010q(c14053e);
            return;
        }
        for (int i13 = 0; i13 < this.f50164k; i13++) {
            if (!this.f50160g[i13].f50152e) {
                m40010q(c14053e);
                return;
            }
        }
        m40003i();
    }

    /* JADX INFO: renamed from: q */
    public final void m40010q(C14053e c14053e) {
        for (int i13 = 0; i13 < this.f50164k; i13++) {
            C14050b c14050b = this.f50160g[i13];
            int i14 = 1;
            if (c14050b.f50148a.f50180L != 1) {
                float f13 = 0.0f;
                if (c14050b.f50149b < 0.0f) {
                    boolean z4 = false;
                    int i15 = 0;
                    while (!z4) {
                        i15 += i14;
                        float f14 = Float.MAX_VALUE;
                        int i16 = -1;
                        int i17 = -1;
                        int i18 = 0;
                        int i19 = 0;
                        while (i18 < this.f50164k) {
                            C14050b c14050b2 = this.f50160g[i18];
                            if (c14050b2.f50148a.f50180L != i14 && !c14050b2.f50152e && c14050b2.f50149b < f13) {
                                int iM39980d = c14050b2.f50151d.m39980d();
                                int i24 = 0;
                                while (i24 < iM39980d) {
                                    C14054f c14054fM39981e = c14050b2.f50151d.m39981e(i24);
                                    float fM39979c = c14050b2.f50151d.m39979c(c14054fM39981e);
                                    if (fM39979c > f13) {
                                        for (int i25 = 0; i25 < 9; i25++) {
                                            float f15 = c14054fM39981e.f50175G[i25] / fM39979c;
                                            if ((f15 < f14 && i25 == i19) || i25 > i19) {
                                                i19 = i25;
                                                i17 = c14054fM39981e.f50182x;
                                                i16 = i18;
                                                f14 = f15;
                                            }
                                        }
                                    }
                                    i24++;
                                    f13 = 0.0f;
                                }
                            }
                            i18++;
                            f13 = 0.0f;
                            i14 = 1;
                        }
                        if (i16 != -1) {
                            C14050b c14050b3 = this.f50160g[i16];
                            c14050b3.f50148a.f50183y = -1;
                            c14050b3.m39991g(((C14054f[]) this.f50166m.f814z)[i17]);
                            C14054f c14054f = c14050b3.f50148a;
                            c14054f.f50183y = i16;
                            c14054f.m40020e(this, c14050b3);
                        } else {
                            z4 = true;
                        }
                        if (i15 > this.f50163j / 2) {
                            z4 = true;
                        }
                        f13 = 0.0f;
                        i14 = 1;
                    }
                    break;
                }
            }
        }
        m40011r(c14053e);
        m40003i();
    }

    /* JADX INFO: renamed from: r */
    public final void m40011r(C14050b c14050b) {
        boolean z4;
        int i13 = 0;
        for (int i14 = 0; i14 < this.f50163j; i14++) {
            this.f50162i[i14] = false;
        }
        boolean z13 = false;
        int i15 = 0;
        while (!z13) {
            int i16 = 1;
            i15++;
            if (i15 >= this.f50163j * 2) {
                return;
            }
            C14054f c14054f = c14050b.f50148a;
            if (c14054f != null) {
                this.f50162i[c14054f.f50182x] = true;
            }
            C14054f c14054fMo39988d = c14050b.mo39988d(this.f50162i);
            if (c14054fMo39988d != null) {
                boolean[] zArr = this.f50162i;
                int i17 = c14054fMo39988d.f50182x;
                if (zArr[i17]) {
                    return;
                } else {
                    zArr[i17] = true;
                }
            }
            if (c14054fMo39988d != null) {
                float f13 = Float.MAX_VALUE;
                int i18 = i13;
                int i19 = -1;
                while (i18 < this.f50164k) {
                    C14050b c14050b2 = this.f50160g[i18];
                    if (c14050b2.f50148a.f50180L != i16 && !c14050b2.f50152e) {
                        C14049a c14049a = c14050b2.f50151d;
                        int i24 = c14049a.f50145h;
                        if (i24 == -1) {
                            z4 = false;
                            break;
                        }
                        int i25 = 0;
                        while (true) {
                            if (i24 == -1 || i25 >= c14049a.f50138a) {
                                z4 = false;
                                break;
                            } else if (c14049a.f50142e[i24] == c14054fMo39988d.f50182x) {
                                z4 = true;
                                break;
                            } else {
                                i24 = c14049a.f50143f[i24];
                                i25++;
                            }
                        }
                        if (z4) {
                            float fM39979c = c14050b2.f50151d.m39979c(c14054fMo39988d);
                            if (fM39979c < 0.0f) {
                                float f14 = (-c14050b2.f50149b) / fM39979c;
                                if (f14 < f13) {
                                    f13 = f14;
                                    i19 = i18;
                                }
                            }
                        }
                    }
                    i18++;
                    i16 = 1;
                }
                if (i19 > -1) {
                    C14050b c14050b3 = this.f50160g[i19];
                    c14050b3.f50148a.f50183y = -1;
                    c14050b3.m39991g(c14054fMo39988d);
                    C14054f c14054f2 = c14050b3.f50148a;
                    c14054f2.f50183y = i19;
                    c14054f2.m40020e(this, c14050b3);
                }
            } else {
                z13 = true;
            }
            i13 = 0;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m40012s() {
        for (int i13 = 0; i13 < this.f50164k; i13++) {
            C14050b c14050b = this.f50160g[i13];
            if (c14050b != null) {
                ((C3143v) this.f50166m.f812x).m9042k(c14050b);
            }
            this.f50160g[i13] = null;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m40013t() {
        C0237p c0237p;
        int i13 = 0;
        while (true) {
            c0237p = this.f50166m;
            C14054f[] c14054fArr = (C14054f[]) c0237p.f814z;
            if (i13 >= c14054fArr.length) {
                break;
            }
            C14054f c14054f = c14054fArr[i13];
            if (c14054f != null) {
                c14054f.m40018c();
            }
            i13++;
        }
        C3143v c3143v = (C3143v) c0237p.f813y;
        C14054f[] c14054fArr2 = this.f50167n;
        int length = this.f50168o;
        c3143v.getClass();
        if (length > c14054fArr2.length) {
            length = c14054fArr2.length;
        }
        for (int i14 = 0; i14 < length; i14++) {
            C14054f c14054f2 = c14054fArr2[i14];
            int i15 = c3143v.f12310x;
            Object[] objArr = (Object[]) c3143v.f12311y;
            if (i15 < objArr.length) {
                objArr[i15] = c14054f2;
                c3143v.f12310x = i15 + 1;
            }
        }
        this.f50168o = 0;
        Arrays.fill((C14054f[]) c0237p.f814z, (Object) null);
        this.f50156c = 0;
        C14053e c14053e = this.f50157d;
        c14053e.f50171g = 0;
        c14053e.f50149b = 0.0f;
        this.f50163j = 1;
        for (int i16 = 0; i16 < this.f50164k; i16++) {
            C14050b c14050b = this.f50160g[i16];
        }
        m40012s();
        this.f50164k = 0;
        this.f50169p = new C14050b(c0237p);
    }
}
