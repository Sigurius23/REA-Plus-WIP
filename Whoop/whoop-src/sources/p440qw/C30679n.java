package p440qw;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;
import p026b2.C2298d;

/* JADX INFO: renamed from: qw.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C30679n extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: I */
    public static final C2298d f126236I = new C2298d(29);

    /* JADX INFO: renamed from: F */
    public final C30678m f126238F;

    /* JADX INFO: renamed from: G */
    public C30676k f126239G;

    /* JADX INFO: renamed from: H */
    public C30676k f126240H;

    /* JADX INFO: renamed from: x */
    public final boolean f126242x;

    /* JADX INFO: renamed from: y */
    public C30678m f126243y;

    /* JADX INFO: renamed from: z */
    public int f126244z = 0;

    /* JADX INFO: renamed from: E */
    public int f126237E = 0;

    /* JADX INFO: renamed from: w */
    public final Comparator f126241w = f126236I;

    public C30679n(boolean z4) {
        this.f126242x = z4;
        this.f126238F = new C30678m(z4);
    }

    /* JADX INFO: renamed from: a */
    public final C30678m m94279a(Object obj, boolean z4) {
        int iCompareTo;
        C30678m c30678m;
        C30678m c30678m2 = this.f126243y;
        C2298d c2298d = f126236I;
        Comparator comparator = this.f126241w;
        if (c30678m2 != null) {
            Comparable comparable = comparator == c2298d ? (Comparable) obj : null;
            while (true) {
                Object obj2 = c30678m2.f126228F;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return c30678m2;
                }
                C30678m c30678m3 = iCompareTo < 0 ? c30678m2.f126233x : c30678m2.f126234y;
                if (c30678m3 == null) {
                    break;
                }
                c30678m2 = c30678m3;
            }
        } else {
            iCompareTo = 0;
        }
        C30678m c30678m4 = c30678m2;
        if (!z4) {
            return null;
        }
        C30678m c30678m5 = this.f126238F;
        if (c30678m4 != null) {
            c30678m = new C30678m(this.f126242x, c30678m4, obj, c30678m5, c30678m5.f126227E);
            if (iCompareTo < 0) {
                c30678m4.f126233x = c30678m;
            } else {
                c30678m4.f126234y = c30678m;
            }
            m94280b(c30678m4, true);
        } else {
            if (comparator == c2298d && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            c30678m = new C30678m(this.f126242x, c30678m4, obj, c30678m5, c30678m5.f126227E);
            this.f126243y = c30678m;
        }
        this.f126244z++;
        this.f126237E++;
        return c30678m;
    }

    /* JADX INFO: renamed from: b */
    public final void m94280b(C30678m c30678m, boolean z4) {
        while (c30678m != null) {
            C30678m c30678m2 = c30678m.f126233x;
            C30678m c30678m3 = c30678m.f126234y;
            int i13 = c30678m2 != null ? c30678m2.f126231I : 0;
            int i14 = c30678m3 != null ? c30678m3.f126231I : 0;
            int i15 = i13 - i14;
            if (i15 == -2) {
                C30678m c30678m4 = c30678m3.f126233x;
                C30678m c30678m5 = c30678m3.f126234y;
                int i16 = (c30678m4 != null ? c30678m4.f126231I : 0) - (c30678m5 != null ? c30678m5.f126231I : 0);
                if (i16 == -1 || (i16 == 0 && !z4)) {
                    m94283e(c30678m);
                } else {
                    m94284g(c30678m3);
                    m94283e(c30678m);
                }
                if (z4) {
                    return;
                }
            } else if (i15 == 2) {
                C30678m c30678m6 = c30678m2.f126233x;
                C30678m c30678m7 = c30678m2.f126234y;
                int i17 = (c30678m6 != null ? c30678m6.f126231I : 0) - (c30678m7 != null ? c30678m7.f126231I : 0);
                if (i17 == 1 || (i17 == 0 && !z4)) {
                    m94284g(c30678m);
                } else {
                    m94283e(c30678m2);
                    m94284g(c30678m);
                }
                if (z4) {
                    return;
                }
            } else if (i15 == 0) {
                c30678m.f126231I = i13 + 1;
                if (z4) {
                    return;
                }
            } else {
                c30678m.f126231I = Math.max(i13, i14) + 1;
                if (!z4) {
                    return;
                }
            }
            c30678m = c30678m.f126232w;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m94281c(C30678m c30678m, boolean z4) {
        C30678m c30678m2;
        C30678m c30678m3;
        int i13;
        if (z4) {
            C30678m c30678m4 = c30678m.f126227E;
            c30678m4.f126235z = c30678m.f126235z;
            c30678m.f126235z.f126227E = c30678m4;
        }
        C30678m c30678m5 = c30678m.f126233x;
        C30678m c30678m6 = c30678m.f126234y;
        C30678m c30678m7 = c30678m.f126232w;
        int i14 = 0;
        if (c30678m5 == null || c30678m6 == null) {
            if (c30678m5 != null) {
                m94282d(c30678m, c30678m5);
                c30678m.f126233x = null;
            } else if (c30678m6 != null) {
                m94282d(c30678m, c30678m6);
                c30678m.f126234y = null;
            } else {
                m94282d(c30678m, null);
            }
            m94280b(c30678m7, false);
            this.f126244z--;
            this.f126237E++;
            return;
        }
        if (c30678m5.f126231I > c30678m6.f126231I) {
            C30678m c30678m8 = c30678m5.f126234y;
            while (true) {
                C30678m c30678m9 = c30678m8;
                c30678m3 = c30678m5;
                c30678m5 = c30678m9;
                if (c30678m5 == null) {
                    break;
                } else {
                    c30678m8 = c30678m5.f126234y;
                }
            }
        } else {
            C30678m c30678m10 = c30678m6.f126233x;
            while (true) {
                c30678m2 = c30678m6;
                c30678m6 = c30678m10;
                if (c30678m6 == null) {
                    break;
                } else {
                    c30678m10 = c30678m6.f126233x;
                }
            }
            c30678m3 = c30678m2;
        }
        m94281c(c30678m3, false);
        C30678m c30678m11 = c30678m.f126233x;
        if (c30678m11 != null) {
            i13 = c30678m11.f126231I;
            c30678m3.f126233x = c30678m11;
            c30678m11.f126232w = c30678m3;
            c30678m.f126233x = null;
        } else {
            i13 = 0;
        }
        C30678m c30678m12 = c30678m.f126234y;
        if (c30678m12 != null) {
            i14 = c30678m12.f126231I;
            c30678m3.f126234y = c30678m12;
            c30678m12.f126232w = c30678m3;
            c30678m.f126234y = null;
        }
        c30678m3.f126231I = Math.max(i13, i14) + 1;
        m94282d(c30678m, c30678m3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f126243y = null;
        this.f126244z = 0;
        this.f126237E++;
        C30678m c30678m = this.f126238F;
        c30678m.f126227E = c30678m;
        c30678m.f126235z = c30678m;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        C30678m c30678mM94279a = null;
        if (obj != null) {
            try {
                c30678mM94279a = m94279a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return c30678mM94279a != null;
    }

    /* JADX INFO: renamed from: d */
    public final void m94282d(C30678m c30678m, C30678m c30678m2) {
        C30678m c30678m3 = c30678m.f126232w;
        c30678m.f126232w = null;
        if (c30678m2 != null) {
            c30678m2.f126232w = c30678m3;
        }
        if (c30678m3 == null) {
            this.f126243y = c30678m2;
        } else if (c30678m3.f126233x == c30678m) {
            c30678m3.f126233x = c30678m2;
        } else {
            c30678m3.f126234y = c30678m2;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m94283e(C30678m c30678m) {
        C30678m c30678m2 = c30678m.f126233x;
        C30678m c30678m3 = c30678m.f126234y;
        C30678m c30678m4 = c30678m3.f126233x;
        C30678m c30678m5 = c30678m3.f126234y;
        c30678m.f126234y = c30678m4;
        if (c30678m4 != null) {
            c30678m4.f126232w = c30678m;
        }
        m94282d(c30678m, c30678m3);
        c30678m3.f126233x = c30678m;
        c30678m.f126232w = c30678m3;
        int iMax = Math.max(c30678m2 != null ? c30678m2.f126231I : 0, c30678m4 != null ? c30678m4.f126231I : 0) + 1;
        c30678m.f126231I = iMax;
        c30678m3.f126231I = Math.max(iMax, c30678m5 != null ? c30678m5.f126231I : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C30676k c30676k = this.f126239G;
        if (c30676k != null) {
            return c30676k;
        }
        C30676k c30676k2 = new C30676k(this, 0);
        this.f126239G = c30676k2;
        return c30676k2;
    }

    /* JADX INFO: renamed from: g */
    public final void m94284g(C30678m c30678m) {
        C30678m c30678m2 = c30678m.f126233x;
        C30678m c30678m3 = c30678m.f126234y;
        C30678m c30678m4 = c30678m2.f126233x;
        C30678m c30678m5 = c30678m2.f126234y;
        c30678m.f126233x = c30678m5;
        if (c30678m5 != null) {
            c30678m5.f126232w = c30678m;
        }
        m94282d(c30678m, c30678m2);
        c30678m2.f126234y = c30678m;
        c30678m.f126232w = c30678m2;
        int iMax = Math.max(c30678m3 != null ? c30678m3.f126231I : 0, c30678m5 != null ? c30678m5.f126231I : 0) + 1;
        c30678m.f126231I = iMax;
        c30678m2.f126231I = Math.max(iMax, c30678m4 != null ? c30678m4.f126231I : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        C30678m c30678mM94279a;
        if (obj != null) {
            try {
                c30678mM94279a = m94279a(obj, false);
            } catch (ClassCastException unused) {
                c30678mM94279a = null;
            }
        } else {
            c30678mM94279a = null;
        }
        if (c30678mM94279a != null) {
            return c30678mM94279a.f126230H;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C30676k c30676k = this.f126240H;
        if (c30676k != null) {
            return c30676k;
        }
        C30676k c30676k2 = new C30676k(this, 1);
        this.f126240H = c30676k2;
        return c30676k2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f126242x) {
            throw new NullPointerException("value == null");
        }
        C30678m c30678mM94279a = m94279a(obj, true);
        Object obj3 = c30678mM94279a.f126230H;
        c30678mM94279a.f126230H = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        C30678m c30678mM94279a;
        if (obj != null) {
            try {
                c30678mM94279a = m94279a(obj, false);
            } catch (ClassCastException unused) {
                c30678mM94279a = null;
            }
        } else {
            c30678mM94279a = null;
        }
        if (c30678mM94279a != null) {
            m94281c(c30678mM94279a, true);
        }
        if (c30678mM94279a != null) {
            return c30678mM94279a.f126230H;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f126244z;
    }
}
