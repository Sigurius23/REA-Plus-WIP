package p441qx;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import p002a0.C0028i;

/* JADX INFO: renamed from: qx.h0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C30714h0 extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: I */
    public static final C30706d0 f126473I = new C30706d0(0);

    /* JADX INFO: renamed from: G */
    public C30710f0 f126476G;

    /* JADX INFO: renamed from: H */
    public C30710f0 f126477H;

    /* JADX INFO: renamed from: z */
    public int f126481z = 0;

    /* JADX INFO: renamed from: E */
    public int f126474E = 0;

    /* JADX INFO: renamed from: w */
    public final Comparator f126478w = f126473I;

    /* JADX INFO: renamed from: y */
    public final C30712g0 f126480y = new C30712g0();

    /* JADX INFO: renamed from: x */
    public C30712g0[] f126479x = new C30712g0[16];

    /* JADX INFO: renamed from: F */
    public int f126475F = 12;

    /* JADX INFO: renamed from: a */
    public final C30712g0 m94385a(Object obj, boolean z4) {
        int iCompareTo;
        C30712g0 c30712g0;
        C30712g0 c30712g1;
        C30712g0 c30712g2;
        C30712g0 c30712g3;
        C30712g0 c30712g4;
        C30712g0 c30712g5;
        C30712g0[] c30712g0Arr = this.f126479x;
        int iHashCode = obj.hashCode();
        int i13 = iHashCode ^ ((iHashCode >>> 20) ^ (iHashCode >>> 12));
        int i14 = ((i13 >>> 7) ^ i13) ^ (i13 >>> 4);
        boolean z13 = true;
        int length = i14 & (c30712g0Arr.length - 1);
        C30712g0 c30712g6 = c30712g0Arr[length];
        C30706d0 c30706d0 = f126473I;
        C30712g0 c30712g7 = null;
        Comparator comparator = this.f126478w;
        if (c30712g6 != null) {
            Comparable comparable = comparator == c30706d0 ? (Comparable) obj : null;
            while (true) {
                Object obj2 = c30712g6.f126462F;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return c30712g6;
                }
                C30712g0 c30712g8 = iCompareTo < 0 ? c30712g6.f126467x : c30712g6.f126468y;
                if (c30712g8 == null) {
                    break;
                }
                c30712g6 = c30712g8;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z4) {
            return null;
        }
        C30712g0 c30712g9 = this.f126480y;
        if (c30712g6 != null) {
            C30712g0 c30712g10 = c30712g6;
            c30712g0 = new C30712g0(c30712g10, obj, i14, c30712g9, c30712g9.f126461E);
            if (iCompareTo < 0) {
                c30712g10.f126467x = c30712g0;
            } else {
                c30712g10.f126468y = c30712g0;
            }
            m94386b(c30712g10, true);
        } else {
            if (comparator == c30706d0 && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            c30712g0 = new C30712g0(c30712g6, obj, i14, c30712g9, c30712g9.f126461E);
            c30712g0Arr[length] = c30712g0;
        }
        int i15 = this.f126481z;
        this.f126481z = i15 + 1;
        if (i15 > this.f126475F) {
            C30712g0[] c30712g0Arr2 = this.f126479x;
            int length2 = c30712g0Arr2.length;
            int i16 = length2 * 2;
            C30712g0[] c30712g0Arr3 = new C30712g0[i16];
            C0028i c0028i = new C0028i(3);
            C0028i c0028i2 = new C0028i(3);
            int i17 = 0;
            while (i17 < length2) {
                C30712g0 c30712g11 = c30712g0Arr2[i17];
                if (c30712g11 == null) {
                    z13 = z13;
                    c30712g2 = c30712g7;
                } else {
                    C30712g0 c30712g12 = c30712g7;
                    for (C30712g0 c30712g13 = c30712g11; c30712g13 != null; c30712g13 = c30712g13.f126467x) {
                        c30712g13.f126466w = c30712g12;
                        c30712g12 = c30712g13;
                    }
                    int i18 = 0;
                    int i19 = 0;
                    while (true) {
                        if (c30712g12 != null) {
                            C30712g0 c30712g14 = c30712g12.f126466w;
                            c30712g12.f126466w = c30712g7;
                            C30712g0 c30712g15 = c30712g12.f126468y;
                            while (true) {
                                C30712g0 c30712g16 = c30712g15;
                                c30712g1 = c30712g14;
                                c30712g14 = c30712g16;
                                if (c30712g14 == null) {
                                    break;
                                }
                                c30712g14.f126466w = c30712g1;
                                c30712g15 = c30712g14.f126467x;
                            }
                        } else {
                            C30712g0 c30712g17 = c30712g12;
                            c30712g12 = c30712g7;
                            c30712g1 = c30712g17;
                        }
                        if (c30712g12 == null) {
                            break;
                        }
                        if ((c30712g12.f126463G & length2) == 0) {
                            i18++;
                        } else {
                            i19++;
                        }
                        c30712g12 = c30712g1;
                        z13 = z13;
                        c30712g7 = null;
                    }
                    c0028i.f70b = ((Integer.highestOneBit(i18) * 2) - 1) - i18;
                    c0028i.f72d = 0;
                    c0028i.f71c = 0;
                    c30712g2 = null;
                    c0028i.f73e = null;
                    c0028i2.f70b = ((Integer.highestOneBit(i19) * 2) - 1) - i19;
                    c0028i2.f72d = 0;
                    c0028i2.f71c = 0;
                    c0028i2.f73e = null;
                    C30712g0 c30712g18 = null;
                    while (c30712g11 != null) {
                        c30712g11.f126466w = c30712g18;
                        C30712g0 c30712g19 = c30712g11;
                        c30712g11 = c30712g11.f126467x;
                        c30712g18 = c30712g19;
                    }
                    while (true) {
                        if (c30712g18 != null) {
                            C30712g0 c30712g20 = c30712g18.f126466w;
                            c30712g18.f126466w = null;
                            C30712g0 c30712g21 = c30712g18.f126468y;
                            while (true) {
                                C30712g0 c30712g22 = c30712g21;
                                c30712g3 = c30712g20;
                                c30712g20 = c30712g22;
                                if (c30712g20 == null) {
                                    break;
                                }
                                c30712g20.f126466w = c30712g3;
                                c30712g21 = c30712g20.f126467x;
                            }
                        } else {
                            c30712g3 = c30712g18;
                            c30712g18 = null;
                        }
                        if (c30712g18 == null) {
                            break;
                        }
                        if ((c30712g18.f126463G & length2) == 0) {
                            c0028i.m67a(c30712g18);
                        } else {
                            c0028i2.m67a(c30712g18);
                        }
                        c30712g18 = c30712g3;
                    }
                    if (i18 > 0) {
                        c30712g4 = (C30712g0) c0028i.f73e;
                        if (c30712g4.f126466w != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        c30712g4 = null;
                    }
                    c30712g0Arr3[i17] = c30712g4;
                    int i24 = i17 + length2;
                    if (i19 > 0) {
                        c30712g5 = (C30712g0) c0028i2.f73e;
                        if (c30712g5.f126466w != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        c30712g5 = null;
                    }
                    c30712g0Arr3[i24] = c30712g5;
                }
                i17++;
                c30712g7 = c30712g2;
                z13 = z13;
            }
            this.f126479x = c30712g0Arr3;
            this.f126475F = (i16 / 4) + (i16 / 2);
        }
        this.f126474E++;
        return c30712g0;
    }

    /* JADX INFO: renamed from: b */
    public final void m94386b(C30712g0 c30712g0, boolean z4) {
        while (c30712g0 != null) {
            C30712g0 c30712g1 = c30712g0.f126467x;
            C30712g0 c30712g2 = c30712g0.f126468y;
            int i13 = c30712g1 != null ? c30712g1.f126465I : 0;
            int i14 = c30712g2 != null ? c30712g2.f126465I : 0;
            int i15 = i13 - i14;
            if (i15 == -2) {
                C30712g0 c30712g3 = c30712g2.f126467x;
                C30712g0 c30712g4 = c30712g2.f126468y;
                int i16 = (c30712g3 != null ? c30712g3.f126465I : 0) - (c30712g4 != null ? c30712g4.f126465I : 0);
                if (i16 != -1 && (i16 != 0 || z4)) {
                    m94390g(c30712g2);
                }
                m94389e(c30712g0);
                if (z4) {
                    return;
                }
            } else if (i15 == 2) {
                C30712g0 c30712g5 = c30712g1.f126467x;
                C30712g0 c30712g6 = c30712g1.f126468y;
                int i17 = (c30712g5 != null ? c30712g5.f126465I : 0) - (c30712g6 != null ? c30712g6.f126465I : 0);
                if (i17 != 1 && (i17 != 0 || z4)) {
                    m94389e(c30712g1);
                }
                m94390g(c30712g0);
                if (z4) {
                    return;
                }
            } else if (i15 == 0) {
                c30712g0.f126465I = i13 + 1;
                if (z4) {
                    return;
                }
            } else {
                c30712g0.f126465I = Math.max(i13, i14) + 1;
                if (!z4) {
                    return;
                }
            }
            c30712g0 = c30712g0.f126466w;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m94387c(C30712g0 c30712g0, boolean z4) {
        C30712g0 c30712g1;
        C30712g0 c30712g2;
        int i13;
        if (z4) {
            C30712g0 c30712g3 = c30712g0.f126461E;
            c30712g3.f126469z = c30712g0.f126469z;
            c30712g0.f126469z.f126461E = c30712g3;
            c30712g0.f126461E = null;
            c30712g0.f126469z = null;
        }
        C30712g0 c30712g4 = c30712g0.f126467x;
        C30712g0 c30712g5 = c30712g0.f126468y;
        C30712g0 c30712g6 = c30712g0.f126466w;
        int i14 = 0;
        if (c30712g4 == null || c30712g5 == null) {
            if (c30712g4 != null) {
                m94388d(c30712g0, c30712g4);
                c30712g0.f126467x = null;
            } else if (c30712g5 != null) {
                m94388d(c30712g0, c30712g5);
                c30712g0.f126468y = null;
            } else {
                m94388d(c30712g0, null);
            }
            m94386b(c30712g6, false);
            this.f126481z--;
            this.f126474E++;
            return;
        }
        if (c30712g4.f126465I > c30712g5.f126465I) {
            C30712g0 c30712g7 = c30712g4.f126468y;
            while (true) {
                C30712g0 c30712g8 = c30712g7;
                c30712g2 = c30712g4;
                c30712g4 = c30712g8;
                if (c30712g4 == null) {
                    break;
                } else {
                    c30712g7 = c30712g4.f126468y;
                }
            }
        } else {
            C30712g0 c30712g9 = c30712g5.f126467x;
            while (true) {
                c30712g1 = c30712g5;
                c30712g5 = c30712g9;
                if (c30712g5 == null) {
                    break;
                } else {
                    c30712g9 = c30712g5.f126467x;
                }
            }
            c30712g2 = c30712g1;
        }
        m94387c(c30712g2, false);
        C30712g0 c30712g10 = c30712g0.f126467x;
        if (c30712g10 != null) {
            i13 = c30712g10.f126465I;
            c30712g2.f126467x = c30712g10;
            c30712g10.f126466w = c30712g2;
            c30712g0.f126467x = null;
        } else {
            i13 = 0;
        }
        C30712g0 c30712g11 = c30712g0.f126468y;
        if (c30712g11 != null) {
            i14 = c30712g11.f126465I;
            c30712g2.f126468y = c30712g11;
            c30712g11.f126466w = c30712g2;
            c30712g0.f126468y = null;
        }
        c30712g2.f126465I = Math.max(i13, i14) + 1;
        m94388d(c30712g0, c30712g2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.f126479x, (Object) null);
        this.f126481z = 0;
        this.f126474E++;
        C30712g0 c30712g0 = this.f126480y;
        C30712g0 c30712g1 = c30712g0.f126469z;
        while (c30712g1 != c30712g0) {
            C30712g0 c30712g2 = c30712g1.f126469z;
            c30712g1.f126461E = null;
            c30712g1.f126469z = null;
            c30712g1 = c30712g2;
        }
        c30712g0.f126461E = c30712g0;
        c30712g0.f126469z = c30712g0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        C30712g0 c30712g0M94385a = null;
        if (obj != null) {
            try {
                c30712g0M94385a = m94385a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return c30712g0M94385a != null;
    }

    /* JADX INFO: renamed from: d */
    public final void m94388d(C30712g0 c30712g0, C30712g0 c30712g1) {
        C30712g0 c30712g2 = c30712g0.f126466w;
        c30712g0.f126466w = null;
        if (c30712g1 != null) {
            c30712g1.f126466w = c30712g2;
        }
        if (c30712g2 == null) {
            int i13 = c30712g0.f126463G;
            C30712g0[] c30712g0Arr = this.f126479x;
            c30712g0Arr[i13 & (c30712g0Arr.length - 1)] = c30712g1;
        } else if (c30712g2.f126467x == c30712g0) {
            c30712g2.f126467x = c30712g1;
        } else {
            c30712g2.f126468y = c30712g1;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m94389e(C30712g0 c30712g0) {
        C30712g0 c30712g1 = c30712g0.f126467x;
        C30712g0 c30712g2 = c30712g0.f126468y;
        C30712g0 c30712g3 = c30712g2.f126467x;
        C30712g0 c30712g4 = c30712g2.f126468y;
        c30712g0.f126468y = c30712g3;
        if (c30712g3 != null) {
            c30712g3.f126466w = c30712g0;
        }
        m94388d(c30712g0, c30712g2);
        c30712g2.f126467x = c30712g0;
        c30712g0.f126466w = c30712g2;
        int iMax = Math.max(c30712g1 != null ? c30712g1.f126465I : 0, c30712g3 != null ? c30712g3.f126465I : 0) + 1;
        c30712g0.f126465I = iMax;
        c30712g2.f126465I = Math.max(iMax, c30712g4 != null ? c30712g4.f126465I : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C30710f0 c30710f0 = this.f126476G;
        if (c30710f0 != null) {
            return c30710f0;
        }
        C30710f0 c30710f1 = new C30710f0(this, 0);
        this.f126476G = c30710f1;
        return c30710f1;
    }

    /* JADX INFO: renamed from: g */
    public final void m94390g(C30712g0 c30712g0) {
        C30712g0 c30712g1 = c30712g0.f126467x;
        C30712g0 c30712g2 = c30712g0.f126468y;
        C30712g0 c30712g3 = c30712g1.f126467x;
        C30712g0 c30712g4 = c30712g1.f126468y;
        c30712g0.f126467x = c30712g4;
        if (c30712g4 != null) {
            c30712g4.f126466w = c30712g0;
        }
        m94388d(c30712g0, c30712g1);
        c30712g1.f126468y = c30712g0;
        c30712g0.f126466w = c30712g1;
        int iMax = Math.max(c30712g2 != null ? c30712g2.f126465I : 0, c30712g4 != null ? c30712g4.f126465I : 0) + 1;
        c30712g0.f126465I = iMax;
        c30712g1.f126465I = Math.max(iMax, c30712g3 != null ? c30712g3.f126465I : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        C30712g0 c30712g0M94385a;
        if (obj != null) {
            try {
                c30712g0M94385a = m94385a(obj, false);
            } catch (ClassCastException unused) {
                c30712g0M94385a = null;
            }
        } else {
            c30712g0M94385a = null;
        }
        if (c30712g0M94385a != null) {
            return c30712g0M94385a.f126464H;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C30710f0 c30710f0 = this.f126477H;
        if (c30710f0 != null) {
            return c30710f0;
        }
        C30710f0 c30710f1 = new C30710f0(this, 1);
        this.f126477H = c30710f1;
        return c30710f1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        C30712g0 c30712g0M94385a = m94385a(obj, true);
        Object obj3 = c30712g0M94385a.f126464H;
        c30712g0M94385a.f126464H = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        C30712g0 c30712g0M94385a;
        if (obj != null) {
            try {
                c30712g0M94385a = m94385a(obj, false);
            } catch (ClassCastException unused) {
                c30712g0M94385a = null;
            }
        } else {
            c30712g0M94385a = null;
        }
        if (c30712g0M94385a != null) {
            m94387c(c30712g0M94385a, true);
        }
        if (c30712g0M94385a != null) {
            return c30712g0M94385a.f126464H;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f126481z;
    }
}
