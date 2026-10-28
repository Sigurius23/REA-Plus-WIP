package p319m4;

import java.util.ArrayList;
import p136f4.C14050b;
import p136f4.C14051c;
import p136f4.C14054f;

/* JADX INFO: renamed from: m4.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC25022k {

    /* JADX INFO: renamed from: a */
    public static final boolean[] f98023a = new boolean[3];

    /* JADX WARN: Code duplicated, block: B:188:0x0292  */
    /* JADX WARN: Code duplicated, block: B:205:0x02db  */
    /* JADX WARN: Code duplicated, block: B:207:0x02de  */
    /* JADX WARN: Code duplicated, block: B:209:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:232:0x0376  */
    /* JADX WARN: Code duplicated, block: B:234:0x0392  */
    /* JADX WARN: Code duplicated, block: B:236:0x0397  */
    /* JADX WARN: Code duplicated, block: B:240:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:251:0x042b  */
    /* JADX WARN: Code duplicated, block: B:406:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:409:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:410:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:413:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:414:0x06be  */
    /* JADX WARN: Code duplicated, block: B:416:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:418:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:421:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:423:0x06d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:433:0x06f2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:75:0x0114  */
    /* JADX INFO: renamed from: a */
    public static void m73475a(C25017f c25017f, C14051c c14051c, ArrayList arrayList, int i13) {
        int i14;
        C25014c[] c25014cArr;
        int i15;
        int i16;
        boolean z4;
        boolean z13;
        boolean z14;
        int i17;
        C25016e c25016e;
        C14051c c14051c2;
        C14054f c14054f;
        C25015d c25015d;
        C14054f c14054f2;
        C25016e c25016e2;
        int i18;
        C25015d c25015d2;
        C14054f c14054f3;
        C25016e c25016e3;
        int i19;
        C25015d[] c25015dArr;
        int i24;
        C25015d c25015d3;
        C25015d c25015d4;
        C14054f c14054f4;
        C25015d c25015d5;
        C14054f c14054f5;
        int size;
        ArrayList arrayList2;
        int i25;
        float f13;
        C14054f c14054f6;
        C14054f c14054f7;
        C14054f c14054f8;
        C14054f c14054f9;
        C14050b c14050bM40006l;
        float f14;
        C25015d c25015d6;
        C25016e c25016e4;
        int i26;
        int i27;
        C25016e c25016e5;
        C25017f c25017f2 = c25017f;
        if (i13 == 0) {
            i14 = c25017f2.f97950A0;
            c25014cArr = c25017f2.f97953D0;
            i15 = 0;
        } else {
            i14 = c25017f2.f97951B0;
            c25014cArr = c25017f2.f97952C0;
            i15 = 2;
        }
        int i28 = i14;
        C25014c[] c25014cArr2 = c25014cArr;
        int i29 = 0;
        while (i29 < i28) {
            C25014c c25014c = c25014cArr2[i29];
            boolean z15 = c25014c.f97871q;
            C25016e c25016e6 = c25014c.f97855a;
            C25015d[] c25015dArr2 = c25016e6.f97898R;
            int i34 = 3;
            int i35 = 8;
            float f15 = 0.0f;
            if (z15) {
                i16 = i29;
            } else {
                int i36 = c25014c.f97866l;
                int i37 = i36 * 2;
                C25016e c25016e7 = c25016e6;
                C25016e c25016e8 = c25016e7;
                boolean z16 = false;
                while (!z16) {
                    c25014c.f97863i++;
                    C25016e[] c25016eArr = c25016e7.f97934n0;
                    C25015d[] c25015dArr3 = c25016e7.f97898R;
                    c25016eArr[i36] = null;
                    c25016e7.f97932m0[i36] = null;
                    if (c25016e7.f97922h0 != i35) {
                        c25016e7.m73440k(i36);
                        c25015dArr3[i37].m73403e();
                        int i38 = i37 + 1;
                        c25015dArr3[i38].m73403e();
                        c25015dArr3[i37].m73403e();
                        c25015dArr3[i38].m73403e();
                        if (c25014c.f97856b == null) {
                            c25014c.f97856b = c25016e7;
                        }
                        c25014c.f97858d = c25016e7;
                        int i39 = c25016e7.f97940q0[i36];
                        if (i39 == i34) {
                            int i44 = c25016e7.f97944u[i36];
                            if (i44 == 0 || i44 == i34 || i44 == 2) {
                                c25014c.f97864j++;
                                float f16 = c25016e7.f97930l0[i36];
                                if (f16 > 0.0f) {
                                    c25014c.f97865k += f16;
                                }
                                i27 = i36;
                                if (c25016e7.f97922h0 != 8 && i39 == 3 && (i44 == 0 || i44 == 3)) {
                                    if (f16 < 0.0f) {
                                        c25014c.f97868n = true;
                                    } else {
                                        c25014c.f97869o = true;
                                    }
                                    if (c25014c.f97862h == null) {
                                        c25014c.f97862h = new ArrayList();
                                    }
                                    c25014c.f97862h.add(c25016e7);
                                }
                                if (c25014c.f97860f == null) {
                                    c25014c.f97860f = c25016e7;
                                }
                                C25016e c25016e9 = c25014c.f97861g;
                                if (c25016e9 != null) {
                                    c25016e9.f97932m0[i27] = c25016e7;
                                }
                                c25014c.f97861g = c25016e7;
                            } else {
                                i29 = i29;
                                i27 = i36;
                            }
                            if (i27 == 0) {
                                if (c25016e7.f97942s == 0 && c25016e7.f97945v == 0) {
                                    int i45 = c25016e7.f97946w;
                                }
                            } else if (c25016e7.f97943t == 0 && c25016e7.f97948y == 0) {
                                int i46 = c25016e7.f97949z;
                            }
                        } else {
                            i29 = i29;
                            i27 = i36;
                        }
                    } else {
                        i29 = i29;
                        i27 = i36;
                    }
                    C25016e c25016e10 = c25016e8;
                    if (c25016e10 != c25016e7) {
                        c25016e10.f97934n0[i27] = c25016e7;
                    }
                    C25015d c25015d7 = c25015dArr3[i37 + 1].f97877f;
                    if (c25015d7 != null) {
                        c25016e5 = c25015d7.f97875d;
                        C25015d c25015d8 = c25016e5.f97898R[i37].f97877f;
                        if (c25015d8 == null || c25015d8.f97875d != c25016e7) {
                            c25016e5 = null;
                        }
                    } else {
                        c25016e5 = null;
                    }
                    if (c25016e5 == null) {
                        c25016e5 = c25016e7;
                        z16 = true;
                    }
                    c25016e8 = c25016e7;
                    i36 = i27;
                    i34 = 3;
                    i35 = 8;
                    c25016e7 = c25016e5;
                    i29 = i29;
                }
                i16 = i29;
                int i47 = i36;
                C25016e c25016e11 = c25014c.f97856b;
                if (c25016e11 != null) {
                    c25016e11.f97898R[i37].m73403e();
                }
                C25016e c25016e12 = c25014c.f97858d;
                if (c25016e12 != null) {
                    c25016e12.f97898R[i37 + 1].m73403e();
                }
                c25014c.f97857c = c25016e7;
                if (i47 == 0 && c25014c.f97867m) {
                    c25014c.f97859e = c25016e7;
                } else {
                    c25014c.f97859e = c25016e6;
                }
                c25014c.f97870p = c25014c.f97869o && c25014c.f97868n;
            }
            c25014c.f97871q = true;
            if (arrayList == 0 || arrayList.contains(c25016e6)) {
                C25016e c25016e13 = c25014c.f97857c;
                C25016e c25016e14 = c25014c.f97856b;
                C25016e c25016e15 = c25014c.f97858d;
                C25016e c25016e16 = c25014c.f97859e;
                float f17 = c25014c.f97865k;
                int[] iArr = c25017f2.f97940q0;
                C25015d[] c25015dArr4 = c25017f2.f97898R;
                boolean z17 = iArr[i13] == 2;
                if (i13 == 0) {
                    int i48 = c25016e16.f97926j0;
                    boolean z18 = i48 == 0;
                    boolean z19 = i48 == 1;
                    z4 = i48 == 2;
                    z14 = z19;
                    z13 = z18;
                } else {
                    int i49 = c25016e16.f97928k0;
                    boolean z24 = i49 == 0;
                    boolean z25 = i49 == 1;
                    z4 = i49 == 2;
                    z13 = z24;
                    z14 = z25;
                }
                boolean z26 = false;
                while (!z26) {
                    C25015d[] c25015dArr5 = c25016e6.f97898R;
                    int[] iArr2 = c25016e6.f97940q0;
                    C25015d c25015d9 = c25015dArr5[i15];
                    int i54 = z4 ? 1 : 4;
                    int iM73403e = c25015d9.m73403e();
                    boolean z27 = z17;
                    boolean z28 = z4;
                    boolean z29 = iArr2[i13] == 3 && c25016e6.f97944u[i13] == 0;
                    C25015d c25015d10 = c25015d9.f97877f;
                    if (c25015d10 != null && c25016e6 != c25016e6) {
                        iM73403e = c25015d10.m73403e() + iM73403e;
                    }
                    int i55 = iM73403e;
                    if (z28 && c25016e6 != c25016e6 && c25016e6 != c25016e14) {
                        i54 = 8;
                    }
                    C25016e c25016e17 = c25016e6;
                    C25015d c25015d11 = c25015d9.f97877f;
                    if (c25015d11 != null) {
                        if (c25016e6 == c25016e14) {
                            c14051c.m40000f(c25015d9.f97880i, c25015d11.f97880i, i55, 6);
                        } else {
                            c14051c.m40000f(c25015d9.f97880i, c25015d11.f97880i, i55, 8);
                        }
                        if (z29 && !z28) {
                            i54 = 5;
                        }
                        c14051c.m39999e(c25015d9.f97880i, c25015d9.f97877f.f97880i, i55, (c25016e6 == c25016e14 && z28 && c25016e6.f97900T[i13]) ? 5 : i54);
                    }
                    if (z27) {
                        if (c25016e6.f97922h0 == 8 || iArr2[i13] != 3) {
                            i26 = 0;
                        } else {
                            i26 = 0;
                            c14051c.m40000f(c25015dArr5[i15 + 1].f97880i, c25015dArr5[i15].f97880i, 0, 5);
                        }
                        c14051c.m40000f(c25015dArr5[i15].f97880i, c25015dArr4[i15].f97880i, i26, 8);
                    }
                    C25015d c25015d12 = c25015dArr5[i15 + 1].f97877f;
                    if (c25015d12 != null) {
                        c25016e4 = c25015d12.f97875d;
                        C25015d c25015d13 = c25016e4.f97898R[i15].f97877f;
                        if (c25015d13 == null || c25015d13.f97875d != c25016e6) {
                            c25016e4 = null;
                        }
                    } else {
                        c25016e4 = null;
                    }
                    if (c25016e4 != null) {
                        c25016e6 = c25016e4;
                    } else {
                        z26 = true;
                    }
                    c25016e6 = c25016e17;
                    z17 = z27;
                    z4 = z28;
                }
                boolean z34 = z17;
                boolean z35 = z4;
                if (c25016e15 != null) {
                    int i56 = i15 + 1;
                    if (c25016e13.f97898R[i56].f97877f != null) {
                        C25015d c25015d14 = c25016e15.f97898R[i56];
                        if (c25016e15.f97940q0[i13] == 3 && c25016e15.f97944u[i13] == 0 && !z35) {
                            C25015d c25015d15 = c25015d14.f97877f;
                            if (c25015d15.f97875d == c25017f2) {
                                c14051c.m39999e(c25015d14.f97880i, c25015d15.f97880i, -c25015d14.m73403e(), 5);
                            } else if (z35) {
                                c25015d6 = c25015d14.f97877f;
                                if (c25015d6.f97875d == c25017f2) {
                                    c14051c.m39999e(c25015d14.f97880i, c25015d6.f97880i, -c25015d14.m73403e(), 4);
                                }
                            }
                        } else if (z35) {
                            c25015d6 = c25015d14.f97877f;
                            if (c25015d6.f97875d == c25017f2) {
                                c14051c.m39999e(c25015d14.f97880i, c25015d6.f97880i, -c25015d14.m73403e(), 4);
                            }
                        }
                        c14051c.m40001g(c25015d14.f97880i, c25016e13.f97898R[i56].f97877f.f97880i, -c25015d14.m73403e(), 6);
                    }
                }
                if (z34) {
                    int i57 = i15 + 1;
                    C14054f c14054f10 = c25015dArr4[i57].f97880i;
                    C25015d c25015d16 = c25016e13.f97898R[i57];
                    c14051c.m40000f(c14054f10, c25015d16.f97880i, c25015d16.m73403e(), 8);
                }
                ArrayList arrayList3 = c25014c.f97862h;
                if (arrayList3 != null && (size = arrayList3.size()) > 1) {
                    if (c25014c.f97868n && !c25014c.f97870p) {
                        f17 = c25014c.f97864j;
                    }
                    C25016e c25016e18 = null;
                    float f18 = 0.0f;
                    int i58 = 0;
                    while (i58 < size) {
                        C25016e c25016e19 = (C25016e) arrayList3.get(i58);
                        float[] fArr = c25016e19.f97930l0;
                        C25015d[] c25015dArr6 = c25016e19.f97898R;
                        float f19 = fArr[i13];
                        if (f19 >= f15) {
                            arrayList2 = arrayList3;
                            i25 = size;
                            if (f19 == f15) {
                                c14051c.m39999e(c25015dArr6[i15 + 1].f97880i, c25015dArr6[i15].f97880i, 0, 8);
                                i58 = i58;
                                f13 = f15;
                                f18 = f18;
                                i28 = i28;
                            } else {
                                float f24 = f18;
                                if (c25016e18 != null) {
                                    C25015d[] c25015dArr7 = c25016e18.f97898R;
                                    c14054f6 = c25015dArr7[i15].f97880i;
                                    int i59 = i15 + 1;
                                    c14054f7 = c25015dArr7[i59].f97880i;
                                    c14054f8 = c25015dArr6[i15].f97880i;
                                    c14054f9 = c25015dArr6[i59].f97880i;
                                    c14050bM40006l = c14051c.m40006l();
                                    f14 = f15;
                                    c14050bM40006l.f50149b = f14;
                                    f13 = f14;
                                    if (f17 != f14 || f24 == f19) {
                                        c14050bM40006l.f50151d.m39983g(c14054f6, 1.0f);
                                        c14050bM40006l.f50151d.m39983g(c14054f7, -1.0f);
                                        c14050bM40006l.f50151d.m39983g(c14054f9, 1.0f);
                                        c14050bM40006l.f50151d.m39983g(c14054f8, -1.0f);
                                    } else if (f24 == f13) {
                                        c14050bM40006l.f50151d.m39983g(c14054f6, 1.0f);
                                        c14050bM40006l.f50151d.m39983g(c14054f7, -1.0f);
                                    } else if (f19 == f15) {
                                        c14050bM40006l.f50151d.m39983g(c14054f8, 1.0f);
                                        c14050bM40006l.f50151d.m39983g(c14054f9, -1.0f);
                                    } else {
                                        float f25 = (f24 / f17) / (f19 / f17);
                                        c14050bM40006l.f50151d.m39983g(c14054f6, 1.0f);
                                        c14050bM40006l.f50151d.m39983g(c14054f7, -1.0f);
                                        c14050bM40006l.f50151d.m39983g(c14054f9, f25);
                                        c14050bM40006l.f50151d.m39983g(c14054f8, -f25);
                                    }
                                    c14051c.m39997c(c14050bM40006l);
                                } else {
                                    i58 = i58;
                                    f13 = f15;
                                    i28 = i28;
                                }
                                f18 = f19;
                                c25016e18 = c25016e19;
                            }
                        } else {
                            if (c25014c.f97870p) {
                                arrayList2 = arrayList3;
                                i25 = size;
                                c14051c.m39999e(c25015dArr6[i15 + 1].f97880i, c25015dArr6[i15].f97880i, 0, 4);
                            } else {
                                f19 = 1.0f;
                                arrayList2 = arrayList3;
                                i25 = size;
                                if (f19 == f15) {
                                    c14051c.m39999e(c25015dArr6[i15 + 1].f97880i, c25015dArr6[i15].f97880i, 0, 8);
                                } else {
                                    float f26 = f18;
                                    if (c25016e18 != null) {
                                        C25015d[] c25015dArr8 = c25016e18.f97898R;
                                        c14054f6 = c25015dArr8[i15].f97880i;
                                        int i510 = i15 + 1;
                                        c14054f7 = c25015dArr8[i510].f97880i;
                                        c14054f8 = c25015dArr6[i15].f97880i;
                                        c14054f9 = c25015dArr6[i510].f97880i;
                                        c14050bM40006l = c14051c.m40006l();
                                        f14 = f15;
                                        c14050bM40006l.f50149b = f14;
                                        f13 = f14;
                                        if (f17 != f14) {
                                            c14050bM40006l.f50151d.m39983g(c14054f6, 1.0f);
                                            c14050bM40006l.f50151d.m39983g(c14054f7, -1.0f);
                                            c14050bM40006l.f50151d.m39983g(c14054f9, 1.0f);
                                            c14050bM40006l.f50151d.m39983g(c14054f8, -1.0f);
                                        } else {
                                            c14050bM40006l.f50151d.m39983g(c14054f6, 1.0f);
                                            c14050bM40006l.f50151d.m39983g(c14054f7, -1.0f);
                                            c14050bM40006l.f50151d.m39983g(c14054f9, 1.0f);
                                            c14050bM40006l.f50151d.m39983g(c14054f8, -1.0f);
                                        }
                                        c14051c.m39997c(c14050bM40006l);
                                    } else {
                                        i58 = i58;
                                        f13 = f15;
                                        i28 = i28;
                                    }
                                    f18 = f19;
                                    c25016e18 = c25016e19;
                                }
                            }
                            i58 = i58;
                            f13 = f15;
                            f18 = f18;
                            i28 = i28;
                        }
                        i58++;
                        i28 = i28;
                        arrayList3 = arrayList2;
                        size = i25;
                        f15 = f13;
                    }
                }
                i17 = i28;
                if (c25016e14 == null || !(c25016e14 == c25016e15 || z35)) {
                    c25016e = c25016e15;
                    if (!z13 || c25016e14 == null) {
                        int i64 = 8;
                        if (z14 && c25016e14 != null) {
                            int i65 = c25014c.f97864j;
                            boolean z36 = i65 > 0 && c25014c.f97863i == i65;
                            C25016e c25016e20 = c25016e14;
                            C25016e c25016e21 = c25016e20;
                            while (c25016e21 != null) {
                                C25015d[] c25015dArr9 = c25016e21.f97898R;
                                C25016e c25016e22 = c25016e21.f97934n0[i13];
                                while (c25016e22 != null && c25016e22.f97922h0 == i64) {
                                    c25016e22 = c25016e22.f97934n0[i13];
                                }
                                if (c25016e21 == c25016e14 || c25016e21 == c25016e || c25016e22 == null) {
                                    c25016e20 = c25016e20;
                                } else {
                                    if (c25016e22 == c25016e) {
                                        c25016e22 = null;
                                    }
                                    C25015d c25015d17 = c25015dArr9[i15];
                                    C14054f c14054f11 = c25015d17.f97880i;
                                    int i66 = i15 + 1;
                                    C14054f c14054f12 = c25016e20.f97898R[i66].f97880i;
                                    int iM73403e2 = c25015d17.m73403e();
                                    int iM73403e3 = c25015dArr9[i66].m73403e();
                                    if (c25016e22 != null) {
                                        c25015d = c25016e22.f97898R[i15];
                                        c14054f2 = c25015d.f97880i;
                                        C25015d c25015d18 = c25015d.f97877f;
                                        c14054f = c25015d18 != null ? c25015d18.f97880i : null;
                                    } else {
                                        C25015d c25015d19 = c25016e.f97898R[i15];
                                        C14054f c14054f13 = c25015d19 != null ? c25015d19.f97880i : null;
                                        c14054f = c25015dArr9[i66].f97880i;
                                        c25015d = c25015d19;
                                        c14054f2 = c14054f13;
                                    }
                                    if (c25015d != null) {
                                        iM73403e3 += c25015d.m73403e();
                                    }
                                    int iM73403e4 = iM73403e2 + c25016e20.f97898R[i66].m73403e();
                                    C25016e c25016e23 = c25016e22;
                                    C14054f c14054f14 = c14054f2;
                                    int i67 = z36 ? 8 : 4;
                                    if (c14054f11 == null || c14054f12 == null || c14054f14 == null || c14054f == null) {
                                        c25016e2 = c25016e23;
                                    } else {
                                        c25016e2 = c25016e23;
                                        c14051c.m39996b(c14054f11, c14054f12, iM73403e4, 0.5f, c14054f14, c14054f, iM73403e3, i67);
                                    }
                                    c25016e22 = c25016e2;
                                }
                                if (c25016e21.f97922h0 != 8) {
                                    c25016e20 = c25016e21;
                                }
                                c25016e21 = c25016e22;
                                c25016e20 = c25016e20;
                                i64 = 8;
                            }
                            c14051c2 = c14051c;
                            C25015d c25015d20 = c25016e14.f97898R[i15];
                            C25015d c25015d21 = c25015dArr2[i15].f97877f;
                            int i68 = i15 + 1;
                            C25015d c25015d22 = c25016e.f97898R[i68];
                            C25015d c25015d23 = c25016e13.f97898R[i68].f97877f;
                            if (c25015d21 != null) {
                                if (c25016e14 != c25016e) {
                                    c14051c2.m39999e(c25015d20.f97880i, c25015d21.f97880i, c25015d20.m73403e(), 5);
                                } else if (c25015d23 != null) {
                                    c14051c2.m39996b(c25015d20.f97880i, c25015d21.f97880i, c25015d20.m73403e(), 0.5f, c25015d22.f97880i, c25015d23.f97880i, c25015d22.m73403e(), 5);
                                }
                            }
                            if (c25015d23 != null && c25016e14 != c25016e) {
                                c14051c2.m39999e(c25015d22.f97880i, c25015d23.f97880i, -c25015d22.m73403e(), 5);
                            }
                        }
                        if ((z13 || z14) && c25016e14 != null && c25016e14 != c25016e) {
                            c25015dArr = c25016e14.f97898R;
                            C25015d c25015d24 = c25015dArr[i15];
                            if (c25016e == null) {
                                c25016e = c25016e14;
                            }
                            C25015d[] c25015dArr10 = c25016e.f97898R;
                            i24 = i15 + 1;
                            c25015d3 = c25015dArr10[i24];
                            c25015d4 = c25015d24.f97877f;
                            if (c25015d4 != null) {
                                c14054f4 = c25015d4.f97880i;
                            } else {
                                c14054f4 = null;
                            }
                            c25015d5 = c25015d3.f97877f;
                            if (c25015d5 != null) {
                                c14054f5 = c25015d5.f97880i;
                            } else {
                                c14054f5 = null;
                            }
                            if (c25016e13 != c25016e) {
                                C25015d c25015d25 = c25016e13.f97898R[i24].f97877f;
                                c14054f5 = c25015d25 != null ? c25015d25.f97880i : null;
                            }
                            if (c25016e14 == c25016e) {
                                c25015d3 = c25015dArr[i24];
                            }
                            if (c14054f4 == null && c14054f5 != null) {
                                c14051c2.m39996b(c25015d24.f97880i, c14054f4, c25015d24.m73403e(), 0.5f, c14054f5, c25015d3.f97880i, c25015dArr10[i24].m73403e(), 5);
                            }
                        }
                    } else {
                        int i69 = c25014c.f97864j;
                        boolean z37 = i69 > 0 && c25014c.f97863i == i69;
                        C25016e c25016e24 = c25016e14;
                        C25016e c25016e25 = c25016e24;
                        while (c25016e24 != null) {
                            C25015d[] c25015dArr11 = c25016e24.f97898R;
                            C25016e c25016e26 = c25016e24.f97934n0[i13];
                            while (true) {
                                if (c25016e26 == null) {
                                    i18 = 8;
                                    break;
                                }
                                i18 = 8;
                                if (c25016e26.f97922h0 != 8) {
                                    break;
                                } else {
                                    c25016e26 = c25016e26.f97934n0[i13];
                                }
                            }
                            if (c25016e26 != null || c25016e24 == c25016e) {
                                C25015d c25015d26 = c25015dArr11[i15];
                                C14054f c14054f15 = c25015d26.f97880i;
                                C25015d c25015d27 = c25015d26.f97877f;
                                C14054f c14054f16 = c25015d27 != null ? c25015d27.f97880i : null;
                                if (c25016e25 != c25016e24) {
                                    c14054f16 = c25016e25.f97898R[i15 + 1].f97880i;
                                } else if (c25016e24 == c25016e14) {
                                    C25015d c25015d28 = c25015dArr2[i15].f97877f;
                                    c14054f16 = c25015d28 != null ? c25015d28.f97880i : null;
                                }
                                int iM73403e5 = c25015d26.m73403e();
                                int i74 = i15 + 1;
                                int iM73403e6 = c25015dArr11[i74].m73403e();
                                if (c25016e26 != null) {
                                    c25015d2 = c25016e26.f97898R[i15];
                                    c14054f3 = c25015d2.f97880i;
                                } else {
                                    c25015d2 = c25016e13.f97898R[i74].f97877f;
                                    c14054f3 = c25015d2 != null ? c25015d2.f97880i : null;
                                }
                                C14054f c14054f17 = c25015dArr11[i74].f97880i;
                                if (c25015d2 != null) {
                                    iM73403e6 += c25015d2.m73403e();
                                }
                                int iM73403e7 = c25016e25.f97898R[i74].m73403e() + iM73403e5;
                                if (c14054f15 == null || c14054f16 == null || c14054f3 == null || c14054f17 == null) {
                                    c25016e3 = c25016e26;
                                    i19 = 8;
                                } else {
                                    if (c25016e24 == c25016e14) {
                                        iM73403e7 = c25016e14.f97898R[i15].m73403e();
                                    }
                                    if (c25016e24 == c25016e) {
                                        iM73403e6 = c25016e.f97898R[i74].m73403e();
                                    }
                                    c25016e3 = c25016e26;
                                    i19 = 8;
                                    c14051c.m39996b(c14054f15, c14054f16, iM73403e7, 0.5f, c14054f3, c14054f17, iM73403e6, z37 ? 8 : 5);
                                }
                            } else {
                                c25016e3 = c25016e26;
                                i19 = i18;
                            }
                            if (c25016e24.f97922h0 != i19) {
                                c25016e25 = c25016e24;
                            }
                            c25016e24 = c25016e3;
                            c25016e25 = c25016e25;
                            c25015dArr2 = c25015dArr2;
                        }
                    }
                } else {
                    C25015d c25015d29 = c25015dArr2[i15];
                    int i75 = i15 + 1;
                    C25015d c25015d30 = c25016e13.f97898R[i75];
                    C25015d c25015d31 = c25015d29.f97877f;
                    C14054f c14054f18 = c25015d31 != null ? c25015d31.f97880i : null;
                    C25015d c25015d32 = c25015d30.f97877f;
                    C14054f c14054f19 = c25015d32 != null ? c25015d32.f97880i : null;
                    C25015d c25015d33 = c25016e14.f97898R[i15];
                    if (c25016e15 != null) {
                        c25015d30 = c25016e15.f97898R[i75];
                    }
                    if (c14054f18 == null || c14054f19 == null) {
                        c25016e = c25016e15;
                    } else {
                        float f27 = i13 == 0 ? c25016e16.f97916e0 : c25016e16.f97918f0;
                        int iM73403e8 = c25015d33.m73403e();
                        int iM73403e9 = c25015d30.m73403e();
                        C14054f c14054f20 = c25015d33.f97880i;
                        C14054f c14054f21 = c25015d30.f97880i;
                        C14054f c14054f22 = c14054f18;
                        c25016e = c25016e15;
                        c14051c.m39996b(c14054f20, c14054f22, iM73403e8, f27, c14054f19, c14054f21, iM73403e9, 7);
                    }
                }
                c14051c2 = c14051c;
                if (z13) {
                    c25015dArr = c25016e14.f97898R;
                    C25015d c25015d210 = c25015dArr[i15];
                    if (c25016e == null) {
                        c25016e = c25016e14;
                    }
                    C25015d[] c25015dArr12 = c25016e.f97898R;
                    i24 = i15 + 1;
                    c25015d3 = c25015dArr12[i24];
                    c25015d4 = c25015d210.f97877f;
                    if (c25015d4 != null) {
                        c14054f4 = c25015d4.f97880i;
                    } else {
                        c14054f4 = null;
                    }
                    c25015d5 = c25015d3.f97877f;
                    if (c25015d5 != null) {
                        c14054f5 = c25015d5.f97880i;
                    } else {
                        c14054f5 = null;
                    }
                    if (c25016e13 != c25016e) {
                        C25015d c25015d211 = c25016e13.f97898R[i24].f97877f;
                        c14054f5 = c25015d211 != null ? c25015d211.f97880i : null;
                    }
                    if (c25016e14 == c25016e) {
                        c25015d3 = c25015dArr[i24];
                    }
                    if (c14054f4 == null) {
                    }
                } else {
                    c25015dArr = c25016e14.f97898R;
                    C25015d c25015d212 = c25015dArr[i15];
                    if (c25016e == null) {
                        c25016e = c25016e14;
                    }
                    C25015d[] c25015dArr13 = c25016e.f97898R;
                    i24 = i15 + 1;
                    c25015d3 = c25015dArr13[i24];
                    c25015d4 = c25015d212.f97877f;
                    if (c25015d4 != null) {
                        c14054f4 = c25015d4.f97880i;
                    } else {
                        c14054f4 = null;
                    }
                    c25015d5 = c25015d3.f97877f;
                    if (c25015d5 != null) {
                        c14054f5 = c25015d5.f97880i;
                    } else {
                        c14054f5 = null;
                    }
                    if (c25016e13 != c25016e) {
                        C25015d c25015d213 = c25016e13.f97898R[i24].f97877f;
                        c14054f5 = c25015d213 != null ? c25015d213.f97880i : null;
                    }
                    if (c25016e14 == c25016e) {
                        c25015d3 = c25015dArr[i24];
                    }
                    if (c14054f4 == null) {
                    }
                }
            } else {
                i17 = i28;
            }
            i29 = i16 + 1;
            c25017f2 = c25017f;
            i28 = i17;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m73476b(C25017f c25017f, C14051c c14051c, C25016e c25016e) {
        c25016e.f97937p = -1;
        C25015d c25015d = c25016e.f97894N;
        int[] iArr = c25016e.f97940q0;
        C25015d c25015d2 = c25016e.f97893M;
        C25015d c25015d3 = c25016e.f97891K;
        C25015d c25015d4 = c25016e.f97892L;
        C25015d c25015d5 = c25016e.f97890J;
        c25016e.f97939q = -1;
        int[] iArr2 = c25017f.f97940q0;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i13 = c25015d5.f97878g;
            int iM73445r = c25017f.m73445r() - c25015d4.f97878g;
            c25015d5.f97880i = c14051c.m40005k(c25015d5);
            c25015d4.f97880i = c14051c.m40005k(c25015d4);
            c14051c.m39998d(c25015d5.f97880i, i13);
            c14051c.m39998d(c25015d4.f97880i, iM73445r);
            c25016e.f97937p = 2;
            c25016e.f97906Z = i13;
            int i14 = iM73445r - i13;
            c25016e.f97902V = i14;
            int i15 = c25016e.f97912c0;
            if (i14 < i15) {
                c25016e.f97902V = i15;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i16 = c25015d3.f97878g;
        int iM73441l = c25017f.m73441l() - c25015d2.f97878g;
        c25015d3.f97880i = c14051c.m40005k(c25015d3);
        c25015d2.f97880i = c14051c.m40005k(c25015d2);
        c14051c.m39998d(c25015d3.f97880i, i16);
        c14051c.m39998d(c25015d2.f97880i, iM73441l);
        if (c25016e.f97910b0 > 0 || c25016e.f97922h0 == 8) {
            C14054f c14054fM40005k = c14051c.m40005k(c25015d);
            c25015d.f97880i = c14054fM40005k;
            c14051c.m39998d(c14054fM40005k, c25016e.f97910b0 + i16);
        }
        c25016e.f97939q = 2;
        c25016e.f97908a0 = i16;
        int i17 = iM73441l - i16;
        c25016e.f97903W = i17;
        int i18 = c25016e.f97914d0;
        if (i17 < i18) {
            c25016e.f97903W = i18;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m73477c(int i13, int i14) {
        return (i13 & i14) == i14;
    }
}
