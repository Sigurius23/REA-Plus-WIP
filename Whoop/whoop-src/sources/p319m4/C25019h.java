package p319m4;

import java.util.ArrayList;
import java.util.Arrays;
import p136f4.C14051c;
import p333n4.C26246b;
import p333n4.InterfaceC26247c;

/* JADX INFO: renamed from: m4.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C25019h extends AbstractC25023l {

    /* JADX INFO: renamed from: b1 */
    public C25016e[] f98013b1;

    /* JADX INFO: renamed from: E0 */
    public int f97990E0 = -1;

    /* JADX INFO: renamed from: F0 */
    public int f97991F0 = -1;

    /* JADX INFO: renamed from: G0 */
    public int f97992G0 = -1;

    /* JADX INFO: renamed from: H0 */
    public int f97993H0 = -1;

    /* JADX INFO: renamed from: I0 */
    public int f97994I0 = -1;

    /* JADX INFO: renamed from: J0 */
    public int f97995J0 = -1;

    /* JADX INFO: renamed from: K0 */
    public float f97996K0 = 0.5f;

    /* JADX INFO: renamed from: L0 */
    public float f97997L0 = 0.5f;

    /* JADX INFO: renamed from: M0 */
    public float f97998M0 = 0.5f;

    /* JADX INFO: renamed from: N0 */
    public float f97999N0 = 0.5f;

    /* JADX INFO: renamed from: O0 */
    public float f98000O0 = 0.5f;

    /* JADX INFO: renamed from: P0 */
    public float f98001P0 = 0.5f;

    /* JADX INFO: renamed from: Q0 */
    public int f98002Q0 = 0;

    /* JADX INFO: renamed from: R0 */
    public int f98003R0 = 0;

    /* JADX INFO: renamed from: S0 */
    public int f98004S0 = 2;

    /* JADX INFO: renamed from: T0 */
    public int f98005T0 = 2;

    /* JADX INFO: renamed from: U0 */
    public int f98006U0 = 0;

    /* JADX INFO: renamed from: V0 */
    public int f98007V0 = -1;

    /* JADX INFO: renamed from: W0 */
    public int f98008W0 = 0;

    /* JADX INFO: renamed from: X0 */
    public final ArrayList f98009X0 = new ArrayList();

    /* JADX INFO: renamed from: Y0 */
    public C25016e[] f98010Y0 = null;

    /* JADX INFO: renamed from: Z0 */
    public C25016e[] f98011Z0 = null;

    /* JADX INFO: renamed from: a1 */
    public int[] f98012a1 = null;

    /* JADX INFO: renamed from: c1 */
    public int f98014c1 = 0;

    /* JADX WARN: Code duplicated, block: B:74:0x0107  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p319m4.AbstractC25023l
    /* JADX INFO: renamed from: Y */
    public final void mo67542Y(int i13, int i14, int i15, int i16) {
        int i17;
        int i18;
        int i19;
        int i24;
        int[] iArr;
        int i25;
        C25018g c25018g;
        char c3;
        int i26;
        int i27;
        int i28;
        int iCeil;
        int iCeil2;
        Object obj;
        C25016e c25016e;
        C25015d c25015d;
        int i29;
        int i34;
        int i35;
        int i36;
        if (this.f98022s0 > 0) {
            C25017f c25017f = this.f97901U;
            InterfaceC26247c interfaceC26247c = c25017f != null ? c25017f.f97967v0 : null;
            if (interfaceC26247c == null) {
                this.f98024A0 = 0;
                this.f98025B0 = 0;
                this.f98034z0 = false;
                return;
            }
            for (int i37 = 0; i37 < this.f98022s0; i37++) {
                C25016e c25016e2 = this.f98021r0[i37];
                if (c25016e2 != null && !(c25016e2 instanceof C25020i)) {
                    int iM73440k = c25016e2.m73440k(0);
                    int iM73440k2 = c25016e2.m73440k(1);
                    if (iM73440k != 3 || c25016e2.f97942s == 1 || iM73440k2 != 3 || c25016e2.f97943t == 1) {
                        if (iM73440k == 3) {
                            iM73440k = 2;
                        }
                        if (iM73440k2 == 3) {
                            iM73440k2 = 2;
                        }
                        C26246b c26246b = this.f98026C0;
                        c26246b.f104359a = iM73440k;
                        c26246b.f104360b = iM73440k2;
                        c26246b.f104361c = c25016e2.m73445r();
                        c26246b.f104362d = c25016e2.m73441l();
                        interfaceC26247c.mo3624a(c25016e2, c26246b);
                        c25016e2.m73429S(c26246b.f104363e);
                        c25016e2.m73424N(c26246b.f104364f);
                        c25016e2.m73420J(c26246b.f104365g);
                    }
                }
            }
        }
        int i38 = this.f98032x0;
        int i39 = this.f98033y0;
        int i44 = this.f98028t0;
        int i45 = this.f98029u0;
        int[] iArr2 = new int[2];
        int i46 = (i14 - i38) - i39;
        int i47 = this.f98008W0;
        if (i47 == 1) {
            i46 = (i16 - i44) - i45;
        }
        if (i47 == 0) {
            if (this.f97990E0 == -1) {
                this.f97990E0 = 0;
            }
            if (this.f97991F0 == -1) {
                this.f97991F0 = 0;
            }
        } else {
            if (this.f97990E0 == -1) {
                this.f97990E0 = 0;
            }
            if (this.f97991F0 == -1) {
                this.f97991F0 = 0;
            }
        }
        C25016e[] c25016eArr = this.f98021r0;
        int i48 = 0;
        int i49 = 0;
        int i54 = 0;
        while (true) {
            i17 = this.f98022s0;
            if (i48 >= i17) {
                break;
            }
            if (this.f98021r0[i48].f97922h0 == 8) {
                i49++;
            }
            i48++;
        }
        if (i49 > 0) {
            c25016eArr = new C25016e[i17 - i49];
            int i55 = 0;
            i17 = 0;
            while (i55 < this.f98022s0) {
                C25016e c25016e3 = this.f98021r0[i55];
                int i56 = i38;
                if (c25016e3.f97922h0 != 8) {
                    c25016eArr[i17] = c25016e3;
                    i17++;
                }
                i55++;
                i38 = i56;
            }
        }
        int i57 = i38;
        C25016e[] c25016eArr2 = c25016eArr;
        this.f98013b1 = c25016eArr2;
        this.f98014c1 = i17;
        int i58 = this.f98006U0;
        ArrayList arrayList = this.f98009X0;
        if (i58 != 0) {
            int[] iArr3 = this.f97940q0;
            C25015d c25015d2 = this.f97891K;
            C25015d c25015d3 = this.f97890J;
            C25015d c25015d4 = this.f97892L;
            C25015d c25015d5 = this.f97893M;
            if (i58 == 1) {
                i18 = i39;
                i19 = i44;
                i24 = i45;
                iArr = iArr2;
                i25 = i57;
                int i59 = this.f98008W0;
                if (i17 != 0) {
                    arrayList.clear();
                    C25018g c25018g2 = new C25018g(this, i59, this.f97890J, this.f97891K, this.f97892L, this.f97893M, i46);
                    arrayList.add(c25018g2);
                    if (i59 == 0) {
                        i26 = 0;
                        int i64 = 0;
                        int i65 = 0;
                        while (i65 < i17) {
                            C25016e c25016e4 = c25016eArr2[i65];
                            int iM73469b0 = m73469b0(c25016e4, i46);
                            if (c25016e4.f97940q0[0] == 3) {
                                i26++;
                            }
                            int i66 = i26;
                            boolean z4 = (i64 == i46 || (this.f98002Q0 + i64) + iM73469b0 > i46) && c25018g2.f97973b != null;
                            if (!z4 && i65 > 0 && (i28 = this.f98007V0) > 0 && i65 % i28 == 0) {
                                z4 = true;
                            }
                            if (z4) {
                                c25018g2 = new C25018g(this, i59, this.f97890J, this.f97891K, this.f97892L, this.f97893M, i46);
                                c25018g2.f97985n = i65;
                                arrayList.add(c25018g2);
                            } else {
                                if (i65 > 0) {
                                    i64 = this.f98002Q0 + iM73469b0 + i64;
                                }
                                c25018g2.m73462a(c25016e4);
                                i65++;
                                i26 = i66;
                            }
                            i64 = iM73469b0;
                            c25018g2.m73462a(c25016e4);
                            i65++;
                            i26 = i66;
                        }
                    } else {
                        i26 = 0;
                        int i67 = 0;
                        int i68 = 0;
                        while (i68 < i17) {
                            C25016e c25016e5 = c25016eArr2[i68];
                            int iM73468a0 = m73468a0(c25016e5, i46);
                            if (c25016e5.f97940q0[1] == 3) {
                                i26++;
                            }
                            int i69 = i26;
                            boolean z13 = (i67 == i46 || (this.f98003R0 + i67) + iM73468a0 > i46) && c25018g2.f97973b != null;
                            if (!z13 && i68 > 0 && (i27 = this.f98007V0) > 0 && i68 % i27 == 0) {
                                z13 = true;
                            }
                            if (z13) {
                                c25018g2 = new C25018g(this, i59, this.f97890J, this.f97891K, this.f97892L, this.f97893M, i46);
                                c25018g2.f97985n = i68;
                                arrayList.add(c25018g2);
                            } else {
                                if (i68 > 0) {
                                    i67 = this.f98003R0 + iM73468a0 + i67;
                                }
                                c25018g2.m73462a(c25016e5);
                                i68++;
                                i26 = i69;
                            }
                            i67 = iM73468a0;
                            c25018g2.m73462a(c25016e5);
                            i68++;
                            i26 = i69;
                        }
                    }
                    int size = arrayList.size();
                    int i74 = this.f98032x0;
                    int i75 = this.f98028t0;
                    int i76 = this.f98033y0;
                    int i77 = this.f98029u0;
                    boolean z14 = iArr3[0] == 2 || iArr3[1] == 2;
                    if (i26 > 0 && z14) {
                        for (int i78 = 0; i78 < size; i78++) {
                            C25018g c25018g3 = (C25018g) arrayList.get(i78);
                            if (i59 == 0) {
                                c25018g3.m73466e(i46 - c25018g3.m73465d());
                            } else {
                                c25018g3.m73466e(i46 - c25018g3.m73464c());
                            }
                        }
                    }
                    int i79 = i74;
                    int i83 = i75;
                    int i84 = i76;
                    int i85 = i77;
                    C25015d c25015d6 = c25015d3;
                    C25015d c25015d7 = c25015d2;
                    int iMax = 0;
                    int i86 = 0;
                    C25015d c25015d8 = c25015d4;
                    C25015d c25015d9 = c25015d5;
                    for (int i87 = 0; i87 < size; i87++) {
                        C25018g c25018g4 = (C25018g) arrayList.get(i87);
                        if (i59 == 0) {
                            if (i87 < size - 1) {
                                c25015d9 = ((C25018g) arrayList.get(i87 + 1)).f97973b.f97891K;
                                i85 = 0;
                            } else {
                                i85 = this.f98029u0;
                                c25015d9 = c25015d5;
                            }
                            C25015d c25015d10 = c25018g4.f97973b.f97893M;
                            c25018g4.m73467f(i59, c25015d6, c25015d7, c25015d8, c25015d9, i79, i83, i84, i85, i46);
                            iMax = Math.max(iMax, c25018g4.m73465d());
                            int iM73464c = c25018g4.m73464c() + i86;
                            if (i87 > 0) {
                                iM73464c += this.f98003R0;
                            }
                            i86 = iM73464c;
                            c25015d7 = c25015d10;
                            i83 = 0;
                        } else {
                            if (i87 < size - 1) {
                                c25015d8 = ((C25018g) arrayList.get(i87 + 1)).f97973b.f97890J;
                                i84 = 0;
                            } else {
                                i84 = this.f98033y0;
                                c25015d8 = c25015d4;
                            }
                            C25015d c25015d11 = c25018g4.f97973b.f97892L;
                            c25018g4.m73467f(i59, c25015d6, c25015d7, c25015d8, c25015d9, i79, i83, i84, i85, i46);
                            int iM73465d = c25018g4.m73465d() + iMax;
                            int iMax2 = Math.max(i86, c25018g4.m73464c());
                            if (i87 > 0) {
                                iM73465d += this.f98002Q0;
                            }
                            i86 = iMax2;
                            iMax = iM73465d;
                            c25015d6 = c25015d11;
                            i79 = 0;
                        }
                    }
                    iArr[0] = iMax;
                    iArr[1] = i86;
                }
            } else if (i58 == 2) {
                i18 = i39;
                i19 = i44;
                i24 = i45;
                iArr = iArr2;
                i25 = i57;
                int i88 = this.f98008W0;
                if (i88 == 0) {
                    int i89 = this.f98007V0;
                    if (i89 <= 0) {
                        int i94 = 0;
                        iCeil2 = 0;
                        for (int i95 = 0; i95 < i17; i95++) {
                            if (i95 > 0) {
                                i94 += this.f98002Q0;
                            }
                            C25016e c25016e6 = c25016eArr2[i95];
                            if (c25016e6 != null) {
                                int iM73469b1 = m73469b0(c25016e6, i46) + i94;
                                if (iM73469b1 > i46) {
                                    break;
                                }
                                iCeil2++;
                                i94 = iM73469b1;
                            }
                        }
                    } else {
                        iCeil2 = i89;
                    }
                    iCeil = 0;
                } else {
                    iCeil = this.f98007V0;
                    if (iCeil <= 0) {
                        int i96 = 0;
                        int i97 = 0;
                        for (int i98 = 0; i98 < i17; i98++) {
                            if (i98 > 0) {
                                i96 += this.f98003R0;
                            }
                            C25016e c25016e7 = c25016eArr2[i98];
                            if (c25016e7 != null) {
                                int iM73468a1 = m73468a0(c25016e7, i46) + i96;
                                if (iM73468a1 > i46) {
                                    break;
                                }
                                i97++;
                                i96 = iM73468a1;
                            }
                        }
                        iCeil = i97;
                    }
                    iCeil2 = 0;
                }
                if (this.f98012a1 == null) {
                    this.f98012a1 = new int[2];
                }
                boolean z15 = (iCeil == 0 && i88 == 1) || (iCeil2 == 0 && i88 == 0);
                while (!z15) {
                    if (i88 == 0) {
                        iCeil = (int) Math.ceil(i17 / iCeil2);
                    } else {
                        iCeil2 = (int) Math.ceil(i17 / iCeil);
                    }
                    C25016e[] c25016eArr3 = this.f98011Z0;
                    if (c25016eArr3 == null || c25016eArr3.length < iCeil2) {
                        obj = null;
                        this.f98011Z0 = new C25016e[iCeil2];
                    } else {
                        obj = null;
                        Arrays.fill(c25016eArr3, (Object) null);
                    }
                    C25016e[] c25016eArr4 = this.f98010Y0;
                    if (c25016eArr4 == null || c25016eArr4.length < iCeil) {
                        this.f98010Y0 = new C25016e[iCeil];
                    } else {
                        Arrays.fill(c25016eArr4, obj);
                    }
                    for (int i99 = 0; i99 < iCeil2; i99++) {
                        for (int i100 = 0; i100 < iCeil; i100++) {
                            int i101 = (i100 * iCeil2) + i99;
                            if (i88 == 1) {
                                i101 = (i99 * iCeil) + i100;
                            }
                            if (i101 < c25016eArr2.length && (c25016e = c25016eArr2[i101]) != null) {
                                int iM73469b2 = m73469b0(c25016e, i46);
                                C25016e c25016e8 = this.f98011Z0[i99];
                                if (c25016e8 == null || c25016e8.m73445r() < iM73469b2) {
                                    this.f98011Z0[i99] = c25016e;
                                }
                                int iM73468a2 = m73468a0(c25016e, i46);
                                C25016e c25016e9 = this.f98010Y0[i100];
                                if (c25016e9 == null || c25016e9.m73441l() < iM73468a2) {
                                    this.f98010Y0[i100] = c25016e;
                                }
                            }
                        }
                    }
                    int iM73469b3 = 0;
                    for (int i102 = 0; i102 < iCeil2; i102++) {
                        C25016e c25016e10 = this.f98011Z0[i102];
                        if (c25016e10 != null) {
                            if (i102 > 0) {
                                iM73469b3 += this.f98002Q0;
                            }
                            iM73469b3 = m73469b0(c25016e10, i46) + iM73469b3;
                        }
                    }
                    int iM73468a3 = 0;
                    for (int i103 = 0; i103 < iCeil; i103++) {
                        C25016e c25016e11 = this.f98010Y0[i103];
                        if (c25016e11 != null) {
                            if (i103 > 0) {
                                iM73468a3 += this.f98003R0;
                            }
                            iM73468a3 = m73468a0(c25016e11, i46) + iM73468a3;
                        }
                    }
                    iArr[0] = iM73469b3;
                    iArr[1] = iM73468a3;
                    if (i88 == 0) {
                        if (iM73469b3 <= i46 || iCeil2 <= 1) {
                            z15 = true;
                        } else {
                            iCeil2--;
                        }
                    } else if (iM73468a3 <= i46 || iCeil <= 1) {
                        z15 = true;
                    } else {
                        iCeil--;
                    }
                }
                int[] iArr4 = this.f98012a1;
                iArr4[0] = iCeil2;
                iArr4[1] = iCeil;
                c3 = 1;
            } else if (i58 != 3) {
                i18 = i39;
                i19 = i44;
                i24 = i45;
                iArr = iArr2;
                i25 = i57;
            } else {
                int i104 = this.f98008W0;
                if (i17 == 0) {
                    i18 = i39;
                    i19 = i44;
                    i24 = i45;
                    iArr = iArr2;
                    i25 = i57;
                } else {
                    arrayList.clear();
                    i24 = i45;
                    i25 = i57;
                    iArr = iArr2;
                    i18 = i39;
                    i19 = i44;
                    C25018g c25018g5 = new C25018g(this, i104, this.f97890J, this.f97891K, this.f97892L, this.f97893M, i46);
                    arrayList.add(c25018g5);
                    if (i104 == 0) {
                        int i105 = 0;
                        int i106 = 0;
                        i29 = 0;
                        int i107 = 0;
                        while (i105 < i17) {
                            i106++;
                            C25015d c25015d12 = c25015d5;
                            C25016e c25016e12 = c25016eArr2[i105];
                            int iM73469b4 = m73469b0(c25016e12, i46);
                            int i108 = i104;
                            int i109 = i105;
                            if (c25016e12.f97940q0[0] == 3) {
                                i29++;
                            }
                            int i110 = i29;
                            boolean z16 = (i107 == i46 || (this.f98002Q0 + i107) + iM73469b4 > i46) && c25018g5.f97973b != null;
                            if (!z16 && i109 > 0 && (i36 = this.f98007V0) > 0 && i106 > i36) {
                                z16 = true;
                            }
                            if (z16) {
                                i104 = i108;
                                i35 = i109;
                                c25018g5 = new C25018g(this, i104, this.f97890J, this.f97891K, this.f97892L, this.f97893M, i46);
                                c25018g5.f97985n = i35;
                                arrayList.add(c25018g5);
                                i107 = iM73469b4;
                                i106 = 1;
                            } else {
                                i104 = i108;
                                i35 = i109;
                                i107 = i35 > 0 ? this.f98002Q0 + iM73469b4 + i107 : iM73469b4;
                            }
                            c25018g5.m73462a(c25016e12);
                            i105 = i35 + 1;
                            i29 = i110;
                            c25015d5 = c25015d12;
                        }
                        c25015d = c25015d5;
                    } else {
                        c25015d = c25015d5;
                        int i111 = 0;
                        int i112 = 0;
                        int i113 = 0;
                        int i114 = 0;
                        while (i114 < i17) {
                            i111++;
                            C25016e c25016e13 = c25016eArr2[i114];
                            int iM73468a4 = m73468a0(c25016e13, i46);
                            int i115 = i104;
                            if (c25016e13.f97940q0[1] == 3) {
                                i112++;
                            }
                            int i116 = i112;
                            boolean z17 = (i113 == i46 || (this.f98003R0 + i113) + iM73468a4 > i46) && c25018g5.f97973b != null;
                            if (!z17 && i114 > 0 && (i34 = this.f98007V0) > 0 && i111 > i34) {
                                z17 = true;
                            }
                            if (z17) {
                                i104 = i115;
                                c25018g5 = new C25018g(this, i104, this.f97890J, this.f97891K, this.f97892L, this.f97893M, i46);
                                c25018g5.f97985n = i114;
                                arrayList.add(c25018g5);
                                i113 = iM73468a4;
                                i111 = 1;
                            } else {
                                i104 = i115;
                                i113 = i114 > 0 ? this.f98003R0 + iM73468a4 + i113 : iM73468a4;
                            }
                            c25018g5.m73462a(c25016e13);
                            i114++;
                            i112 = i116;
                        }
                        i29 = i112;
                    }
                    int size2 = arrayList.size();
                    int i117 = this.f98032x0;
                    int i118 = this.f98028t0;
                    int i119 = this.f98033y0;
                    int i120 = this.f98029u0;
                    boolean z18 = iArr3[0] == 2 || iArr3[1] == 2;
                    if (i29 > 0 && z18) {
                        for (int i121 = 0; i121 < size2; i121++) {
                            C25018g c25018g6 = (C25018g) arrayList.get(i121);
                            if (i104 == 0) {
                                c25018g6.m73466e(i46 - c25018g6.m73465d());
                            } else {
                                c25018g6.m73466e(i46 - c25018g6.m73464c());
                            }
                        }
                    }
                    int i122 = i117;
                    int i123 = i118;
                    int i124 = i119;
                    int i125 = i120;
                    C25015d c25015d13 = c25015d3;
                    C25015d c25015d14 = c25015d2;
                    int iMax3 = 0;
                    int i126 = 0;
                    C25015d c25015d15 = c25015d4;
                    C25015d c25015d16 = c25015d;
                    for (int i127 = 0; i127 < size2; i127++) {
                        C25018g c25018g7 = (C25018g) arrayList.get(i127);
                        if (i104 == 0) {
                            if (i127 < size2 - 1) {
                                c25015d16 = ((C25018g) arrayList.get(i127 + 1)).f97973b.f97891K;
                                i125 = 0;
                            } else {
                                i125 = this.f98029u0;
                                c25015d16 = c25015d;
                            }
                            C25015d c25015d17 = c25018g7.f97973b.f97893M;
                            c25018g7.m73467f(i104, c25015d13, c25015d14, c25015d15, c25015d16, i122, i123, i124, i125, i46);
                            iMax3 = Math.max(iMax3, c25018g7.m73465d());
                            int iM73464c2 = c25018g7.m73464c() + i126;
                            if (i127 > 0) {
                                iM73464c2 += this.f98003R0;
                            }
                            i126 = iM73464c2;
                            c25015d14 = c25015d17;
                            i123 = 0;
                        } else {
                            if (i127 < size2 - 1) {
                                c25015d15 = ((C25018g) arrayList.get(i127 + 1)).f97973b.f97890J;
                                i124 = 0;
                            } else {
                                i124 = this.f98033y0;
                                c25015d15 = c25015d4;
                            }
                            C25015d c25015d18 = c25018g7.f97973b.f97892L;
                            c25018g7.m73467f(i104, c25015d13, c25015d14, c25015d15, c25015d16, i122, i123, i124, i125, i46);
                            int iM73465d2 = c25018g7.m73465d() + iMax3;
                            int iMax4 = Math.max(i126, c25018g7.m73464c());
                            if (i127 > 0) {
                                iM73465d2 += this.f98002Q0;
                            }
                            i126 = iMax4;
                            iMax3 = iM73465d2;
                            c25015d13 = c25015d18;
                            i122 = 0;
                        }
                    }
                    iArr[0] = iMax3;
                    iArr[1] = i126;
                }
            }
            c3 = 1;
        } else {
            i18 = i39;
            i19 = i44;
            i24 = i45;
            iArr = iArr2;
            i25 = i57;
            int i128 = this.f98008W0;
            if (i17 == 0) {
                c3 = 1;
            } else {
                if (arrayList.size() == 0) {
                    c25018g = new C25018g(this, i128, this.f97890J, this.f97891K, this.f97892L, this.f97893M, i46);
                    arrayList.add(c25018g);
                } else {
                    C25018g c25018g8 = (C25018g) arrayList.get(0);
                    c25018g8.f97974c = 0;
                    c25018g8.f97973b = null;
                    c25018g8.f97983l = 0;
                    c25018g8.f97984m = 0;
                    c25018g8.f97985n = 0;
                    c25018g8.f97986o = 0;
                    c25018g8.f97987p = 0;
                    c25018g8.m73467f(i128, this.f97890J, this.f97891K, this.f97892L, this.f97893M, this.f98032x0, this.f98028t0, this.f98033y0, this.f98029u0, i46);
                    c25018g = c25018g8;
                }
                for (int i129 = 0; i129 < i17; i129++) {
                    c25018g.m73462a(c25016eArr2[i129]);
                }
                i54 = 0;
                iArr[0] = c25018g.m73465d();
                c3 = 1;
                iArr[1] = c25018g.m73464c();
            }
        }
        int iMin = iArr[i54] + i25 + i18;
        int iMin2 = iArr[c3] + i19 + i24;
        if (i13 == 1073741824) {
            iMin = i14;
        } else if (i13 == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, i14);
        } else if (i13 != 0) {
            iMin = i54;
        }
        if (i15 == 1073741824) {
            iMin2 = i16;
        } else if (i15 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i16);
        } else if (i15 != 0) {
            iMin2 = i54;
        }
        this.f98024A0 = iMin;
        this.f98025B0 = iMin2;
        m73429S(iMin);
        m73424N(iMin2);
        this.f98034z0 = this.f98022s0 > 0 ? c3 : i54;
    }

    /* JADX INFO: renamed from: a0 */
    public final int m73468a0(C25016e c25016e, int i13) {
        C25016e c25016e2;
        if (c25016e != null) {
            int[] iArr = c25016e.f97940q0;
            if (iArr[1] == 3) {
                int i14 = c25016e.f97943t;
                if (i14 != 0) {
                    if (i14 == 2) {
                        int i15 = (int) (c25016e.f97881A * i13);
                        if (i15 != c25016e.m73441l()) {
                            c25016e.f97919g = true;
                            m73478Z(iArr[0], c25016e.m73445r(), 1, i15, c25016e);
                        }
                        return i15;
                    }
                    c25016e2 = c25016e;
                    if (i14 == 1) {
                        return c25016e2.m73441l();
                    }
                    if (i14 == 3) {
                        return (int) ((c25016e2.m73445r() * c25016e2.f97904X) + 0.5f);
                    }
                }
            } else {
                c25016e2 = c25016e;
            }
            return c25016e2.m73441l();
        }
        return 0;
    }

    /* JADX INFO: renamed from: b0 */
    public final int m73469b0(C25016e c25016e, int i13) {
        C25016e c25016e2;
        if (c25016e != null) {
            int[] iArr = c25016e.f97940q0;
            if (iArr[0] == 3) {
                int i14 = c25016e.f97942s;
                if (i14 != 0) {
                    if (i14 == 2) {
                        int i15 = (int) (c25016e.f97947x * i13);
                        if (i15 != c25016e.m73445r()) {
                            c25016e.f97919g = true;
                            m73478Z(1, i15, iArr[1], c25016e.m73441l(), c25016e);
                        }
                        return i15;
                    }
                    c25016e2 = c25016e;
                    if (i14 == 1) {
                        return c25016e2.m73445r();
                    }
                    if (i14 == 3) {
                        return (int) ((c25016e2.m73441l() * c25016e2.f97904X) + 0.5f);
                    }
                }
            } else {
                c25016e2 = c25016e;
            }
            return c25016e2.m73445r();
        }
        return 0;
    }

    @Override // p319m4.C25016e
    /* JADX INFO: renamed from: c */
    public final void mo67544c(C14051c c14051c, boolean z4) {
        C25016e c25016e;
        float f13;
        int i13;
        super.mo67544c(c14051c, z4);
        C25017f c25017f = this.f97901U;
        boolean z13 = c25017f != null && c25017f.f97968w0;
        int i14 = this.f98006U0;
        ArrayList arrayList = this.f98009X0;
        if (i14 != 0) {
            if (i14 == 1) {
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    ((C25018g) arrayList.get(i15)).m73463b(i15, z13, i15 == size + (-1));
                    i15++;
                }
            } else if (i14 != 2) {
                if (i14 == 3) {
                    int size2 = arrayList.size();
                    int i16 = 0;
                    while (i16 < size2) {
                        ((C25018g) arrayList.get(i16)).m73463b(i16, z13, i16 == size2 + (-1));
                        i16++;
                    }
                }
            } else if (this.f98012a1 != null && this.f98011Z0 != null && this.f98010Y0 != null) {
                for (int i17 = 0; i17 < this.f98014c1; i17++) {
                    this.f98013b1[i17].m73417E();
                }
                int[] iArr = this.f98012a1;
                int i18 = iArr[0];
                int i19 = iArr[1];
                float f14 = this.f97996K0;
                C25016e c25016e2 = null;
                int i24 = 0;
                while (i24 < i18) {
                    if (z13) {
                        i13 = (i18 - i24) - 1;
                        f13 = 1.0f - this.f97996K0;
                    } else {
                        f13 = f14;
                        i13 = i24;
                    }
                    C25016e c25016e3 = this.f98011Z0[i13];
                    if (c25016e3 != null) {
                        C25015d c25015d = c25016e3.f97890J;
                        if (c25016e3.f97922h0 != 8) {
                            if (i24 == 0) {
                                c25016e3.m73436g(c25015d, this.f97890J, this.f98032x0);
                                c25016e3.f97926j0 = this.f97990E0;
                                c25016e3.f97916e0 = f13;
                            }
                            if (i24 == i18 - 1) {
                                c25016e3.m73436g(c25016e3.f97892L, this.f97892L, this.f98033y0);
                            }
                            if (i24 > 0 && c25016e2 != null) {
                                C25015d c25015d2 = c25016e2.f97892L;
                                c25016e3.m73436g(c25015d, c25015d2, this.f98002Q0);
                                c25016e2.m73436g(c25015d2, c25015d, 0);
                            }
                            c25016e2 = c25016e3;
                        }
                    }
                    i24++;
                    f14 = f13;
                }
                for (int i25 = 0; i25 < i19; i25++) {
                    C25016e c25016e4 = this.f98010Y0[i25];
                    if (c25016e4 != null) {
                        C25015d c25015d3 = c25016e4.f97891K;
                        if (c25016e4.f97922h0 != 8) {
                            if (i25 == 0) {
                                c25016e4.m73436g(c25015d3, this.f97891K, this.f98028t0);
                                c25016e4.f97928k0 = this.f97991F0;
                                c25016e4.f97918f0 = this.f97997L0;
                            }
                            if (i25 == i19 - 1) {
                                c25016e4.m73436g(c25016e4.f97893M, this.f97893M, this.f98029u0);
                            }
                            if (i25 > 0 && c25016e2 != null) {
                                C25015d c25015d4 = c25016e2.f97893M;
                                c25016e4.m73436g(c25015d3, c25015d4, this.f98003R0);
                                c25016e2.m73436g(c25015d4, c25015d3, 0);
                            }
                            c25016e2 = c25016e4;
                        }
                    }
                }
                for (int i26 = 0; i26 < i18; i26++) {
                    for (int i27 = 0; i27 < i19; i27++) {
                        int i28 = (i27 * i18) + i26;
                        if (this.f98008W0 == 1) {
                            i28 = (i26 * i19) + i27;
                        }
                        C25016e[] c25016eArr = this.f98013b1;
                        if (i28 < c25016eArr.length && (c25016e = c25016eArr[i28]) != null && c25016e.f97922h0 != 8) {
                            C25016e c25016e5 = this.f98011Z0[i26];
                            C25016e c25016e6 = this.f98010Y0[i27];
                            if (c25016e != c25016e5) {
                                c25016e.m73436g(c25016e.f97890J, c25016e5.f97890J, 0);
                                c25016e.m73436g(c25016e.f97892L, c25016e5.f97892L, 0);
                            }
                            if (c25016e != c25016e6) {
                                c25016e.m73436g(c25016e.f97891K, c25016e6.f97891K, 0);
                                c25016e.m73436g(c25016e.f97893M, c25016e6.f97893M, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((C25018g) arrayList.get(0)).m73463b(0, z13, true);
        }
        this.f98034z0 = false;
    }
}
