package p295l4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import p087db.C11858k0;
import p136f4.C14051c;
import p319m4.AbstractC25023l;
import p319m4.C25015d;
import p319m4.C25016e;
import p319m4.C25017f;

/* JADX INFO: renamed from: l4.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C23327a extends AbstractC25023l {

    /* JADX INFO: renamed from: E0 */
    public C25017f f92470E0;

    /* JADX INFO: renamed from: F0 */
    public C25016e[] f92471F0;

    /* JADX INFO: renamed from: G0 */
    public boolean f92472G0;

    /* JADX INFO: renamed from: H0 */
    public int f92473H0;

    /* JADX INFO: renamed from: I0 */
    public int f92474I0;

    /* JADX INFO: renamed from: J0 */
    public int f92475J0;

    /* JADX INFO: renamed from: K0 */
    public int f92476K0;

    /* JADX INFO: renamed from: L0 */
    public float f92477L0;

    /* JADX INFO: renamed from: M0 */
    public float f92478M0;

    /* JADX INFO: renamed from: N0 */
    public String f92479N0;

    /* JADX INFO: renamed from: O0 */
    public String f92480O0;

    /* JADX INFO: renamed from: P0 */
    public String f92481P0;

    /* JADX INFO: renamed from: Q0 */
    public String f92482Q0;

    /* JADX INFO: renamed from: R0 */
    public int f92483R0;

    /* JADX INFO: renamed from: S0 */
    public int f92484S0;

    /* JADX INFO: renamed from: T0 */
    public boolean[][] f92485T0;

    /* JADX INFO: renamed from: U0 */
    public HashSet f92486U0;

    /* JADX INFO: renamed from: V0 */
    public int[][] f92487V0;

    /* JADX INFO: renamed from: W0 */
    public int f92488W0;

    /* JADX INFO: renamed from: X0 */
    public int[][] f92489X0;

    /* JADX INFO: renamed from: Y0 */
    public int f92490Y0;

    /* JADX INFO: renamed from: a0 */
    public static void m67540a0(C25016e c25016e) {
        c25016e.f97930l0[1] = -1.0f;
        c25016e.f97891K.m73408j();
        c25016e.f97893M.m73408j();
        c25016e.f97894N.m73408j();
    }

    /* JADX INFO: renamed from: j0 */
    public static float[] m67541j0(int i13, String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        float[] fArr = new float[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            if (i14 < strArrSplit.length) {
                try {
                    fArr[i14] = Float.parseFloat(strArrSplit[i14]);
                } catch (Exception e5) {
                    System.err.println("Error parsing `" + strArrSplit[i14] + "`: " + e5.getMessage());
                    fArr[i14] = 1.0f;
                }
            } else {
                fArr[i14] = 1.0f;
            }
        }
        return fArr;
    }

    @Override // p319m4.AbstractC25023l
    /* JADX INFO: renamed from: Y */
    public final void mo67542Y(int i13, int i14, int i15, int i16) {
        int[][] iArrM67551i0;
        this.f92470E0 = this.f97901U;
        if (this.f92473H0 >= 1 && this.f92475J0 >= 1) {
            this.f92484S0 = 0;
            String str = this.f92482Q0;
            if (str != null && !str.trim().isEmpty() && (iArrM67551i0 = m67551i0(this.f92482Q0, false)) != null) {
                m67547e0(iArrM67551i0);
            }
            String str2 = this.f92481P0;
            if (str2 != null && !str2.trim().isEmpty()) {
                this.f92489X0 = m67551i0(this.f92481P0, true);
            }
            int iMax = Math.max(this.f92473H0, this.f92475J0);
            C25016e[] c25016eArr = this.f92471F0;
            if (c25016eArr == null) {
                this.f92471F0 = new C25016e[iMax];
                int i17 = 0;
                while (true) {
                    C25016e[] c25016eArr2 = this.f92471F0;
                    if (i17 >= c25016eArr2.length) {
                        break;
                    }
                    C25016e c25016e = new C25016e();
                    int[] iArr = c25016e.f97940q0;
                    iArr[0] = 3;
                    iArr[1] = 3;
                    c25016e.f97927k = String.valueOf(c25016e.hashCode());
                    c25016eArr2[i17] = c25016e;
                    i17++;
                }
            } else if (iMax != c25016eArr.length) {
                C25016e[] c25016eArr3 = new C25016e[iMax];
                for (int i18 = 0; i18 < iMax; i18++) {
                    C25016e[] c25016eArr4 = this.f92471F0;
                    if (i18 < c25016eArr4.length) {
                        c25016eArr3[i18] = c25016eArr4[i18];
                    } else {
                        C25016e c25016e2 = new C25016e();
                        int[] iArr2 = c25016e2.f97940q0;
                        iArr2[0] = 3;
                        iArr2[1] = 3;
                        c25016e2.f97927k = String.valueOf(c25016e2.hashCode());
                        c25016eArr3[i18] = c25016e2;
                    }
                }
                while (true) {
                    C25016e[] c25016eArr5 = this.f92471F0;
                    if (iMax >= c25016eArr5.length) {
                        break;
                    }
                    C25016e c25016e3 = c25016eArr5[iMax];
                    this.f92470E0.f97963r0.remove(c25016e3);
                    c25016e3.mo73416D();
                    iMax++;
                }
                this.f92471F0 = c25016eArr3;
            }
            int[][] iArr3 = this.f92489X0;
            if (iArr3 != null) {
                m67548f0(iArr3);
            }
        }
        C25017f c25017f = this.f92470E0;
        C25016e[] c25016eArr6 = this.f92471F0;
        c25017f.getClass();
        for (C25016e c25016e4 : c25016eArr6) {
            c25017f.m73455V(c25016e4);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m67543b0(int i13, int i14, int i15, int i16, C25016e c25016e) {
        c25016e.f97890J.m73399a(this.f92471F0[i14].f97890J, 0);
        c25016e.f97891K.m73399a(this.f92471F0[i13].f97891K, 0);
        c25016e.f97892L.m73399a(this.f92471F0[(i14 + i16) - 1].f97892L, 0);
        c25016e.f97893M.m73399a(this.f92471F0[(i13 + i15) - 1].f97893M, 0);
    }

    /* JADX WARN: Code duplicated, block: B:75:0x01b3  */
    @Override // p319m4.C25016e
    /* JADX INFO: renamed from: c */
    public final void mo67544c(C14051c c14051c, boolean z4) {
        int i13;
        int i14;
        int[][] iArr;
        int i15;
        super.mo67544c(c14051c, z4);
        int iMax = Math.max(this.f92473H0, this.f92475J0);
        C25016e c25016e = this.f92471F0[0];
        float[] fArrM67541j0 = m67541j0(this.f92473H0, this.f92479N0);
        int i16 = this.f92473H0;
        C25015d c25015d = this.f97893M;
        C25015d c25015d2 = this.f97891K;
        if (i16 == 1) {
            m67540a0(c25016e);
            c25016e.f97891K.m73399a(c25015d2, 0);
            c25016e.f97893M.m73399a(c25015d, 0);
        } else {
            int i17 = 0;
            while (true) {
                i13 = this.f92473H0;
                if (i17 >= i13) {
                    break;
                }
                C25016e c25016e2 = this.f92471F0[i17];
                m67540a0(c25016e2);
                C25015d c25015d3 = c25016e2.f97893M;
                C25015d c25015d4 = c25016e2.f97891K;
                if (fArrM67541j0 != null) {
                    c25016e2.f97930l0[1] = fArrM67541j0[i17];
                }
                if (i17 > 0) {
                    c25015d4.m73399a(this.f92471F0[i17 - 1].f97893M, 0);
                } else {
                    c25015d4.m73399a(c25015d2, 0);
                }
                if (i17 < this.f92473H0 - 1) {
                    c25015d3.m73399a(this.f92471F0[i17 + 1].f97891K, 0);
                } else {
                    c25015d3.m73399a(c25015d, 0);
                }
                if (i17 > 0) {
                    c25015d4.f97878g = (int) this.f92478M0;
                }
                i17++;
            }
            while (i13 < iMax) {
                C25016e c25016e3 = this.f92471F0[i13];
                m67540a0(c25016e3);
                c25016e3.f97891K.m73399a(c25015d2, 0);
                c25016e3.f97893M.m73399a(c25015d, 0);
                i13++;
            }
        }
        int iMax2 = Math.max(this.f92473H0, this.f92475J0);
        C25016e c25016e4 = this.f92471F0[0];
        float[] fArrM67541j1 = m67541j0(this.f92475J0, this.f92480O0);
        int i18 = this.f92475J0;
        C25015d c25015d5 = this.f97892L;
        C25015d c25015d6 = this.f97890J;
        if (i18 == 1) {
            float[] fArr = c25016e4.f97930l0;
            C25015d c25015d7 = c25016e4.f97892L;
            C25015d c25015d8 = c25016e4.f97890J;
            fArr[0] = -1.0f;
            c25015d8.m73408j();
            c25015d7.m73408j();
            c25015d8.m73399a(c25015d6, 0);
            c25015d7.m73399a(c25015d5, 0);
        } else {
            int i19 = 0;
            while (true) {
                i14 = this.f92475J0;
                if (i19 >= i14) {
                    break;
                }
                C25016e c25016e5 = this.f92471F0[i19];
                float[] fArr2 = c25016e5.f97930l0;
                C25015d c25015d9 = c25016e5.f97892L;
                C25015d c25015d10 = c25016e5.f97890J;
                fArr2[0] = -1.0f;
                c25015d10.m73408j();
                c25015d9.m73408j();
                if (fArrM67541j1 != null) {
                    c25016e5.f97930l0[0] = fArrM67541j1[i19];
                }
                if (i19 > 0) {
                    c25015d10.m73399a(this.f92471F0[i19 - 1].f97892L, 0);
                } else {
                    c25015d10.m73399a(c25015d6, 0);
                }
                if (i19 < this.f92475J0 - 1) {
                    c25015d9.m73399a(this.f92471F0[i19 + 1].f97890J, 0);
                } else {
                    c25015d9.m73399a(c25015d5, 0);
                }
                if (i19 > 0) {
                    c25015d10.f97878g = (int) this.f92477L0;
                }
                i19++;
            }
            while (i14 < iMax2) {
                C25016e c25016e6 = this.f92471F0[i14];
                float[] fArr3 = c25016e6.f97930l0;
                C25015d c25015d11 = c25016e6.f97892L;
                C25015d c25015d12 = c25016e6.f97890J;
                fArr3[0] = -1.0f;
                c25015d12.m73408j();
                c25015d11.m73408j();
                c25015d12.m73399a(c25015d6, 0);
                c25015d11.m73399a(c25015d5, 0);
                i14++;
            }
        }
        for (int i24 = 0; i24 < this.f98022s0; i24++) {
            if (!this.f92486U0.contains(this.f98021r0[i24].f97927k)) {
                boolean z13 = false;
                int i25 = 0;
                while (!z13) {
                    i25 = this.f92484S0;
                    if (i25 >= this.f92473H0 * this.f92475J0) {
                        i25 = -1;
                        break;
                    }
                    int iM67546d0 = m67546d0(i25);
                    int iM67545c0 = m67545c0(this.f92484S0);
                    boolean[] zArr = this.f92485T0[iM67546d0];
                    if (zArr[iM67545c0]) {
                        zArr[iM67545c0] = false;
                        z13 = true;
                    }
                    this.f92484S0++;
                }
                int iM67546d1 = m67546d0(i25);
                int iM67545c1 = m67545c0(i25);
                if (i25 == -1) {
                    return;
                }
                if ((this.f92488W0 & 2) <= 0 || (iArr = this.f92489X0) == null || (i15 = this.f92490Y0) >= iArr.length) {
                    m67543b0(iM67546d1, iM67545c1, 1, 1, this.f98021r0[i24]);
                } else {
                    int[] iArr2 = iArr[i15];
                    if (iArr2[0] == i25) {
                        this.f92485T0[iM67546d1][iM67545c1] = true;
                        if (m67550h0(iM67546d1, iM67545c1, iArr2[1], iArr2[2])) {
                            C25016e c25016e7 = this.f98021r0[i24];
                            int[] iArr3 = this.f92489X0[this.f92490Y0];
                            m67543b0(iM67546d1, iM67545c1, iArr3[1], iArr3[2], c25016e7);
                            this.f92490Y0++;
                        }
                    } else {
                        m67543b0(iM67546d1, iM67545c1, 1, 1, this.f98021r0[i24]);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final int m67545c0(int i13) {
        return this.f92483R0 == 1 ? i13 / this.f92473H0 : i13 % this.f92475J0;
    }

    /* JADX INFO: renamed from: d0 */
    public final int m67546d0(int i13) {
        return this.f92483R0 == 1 ? i13 % this.f92473H0 : i13 / this.f92475J0;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m67547e0(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            if (!m67550h0(m67546d0(iArr2[0]), m67545c0(iArr2[0]), iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m67548f0(int[][] iArr) {
        if ((this.f92488W0 & 2) > 0) {
            return;
        }
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int iM67546d0 = m67546d0(iArr[i13][0]);
            int iM67545c0 = m67545c0(iArr[i13][0]);
            int[] iArr2 = iArr[i13];
            if (!m67550h0(iM67546d0, iM67545c0, iArr2[1], iArr2[2])) {
                break;
            }
            C25016e c25016e = this.f98021r0[i13];
            int[] iArr3 = iArr[i13];
            m67543b0(iM67546d0, iM67545c0, iArr3[1], iArr3[2], c25016e);
            this.f92486U0.add(this.f98021r0[i13].f97927k);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m67549g0() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.f92473H0, this.f92475J0);
        this.f92485T0 = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
        int i13 = this.f98022s0;
        if (i13 > 0) {
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i13, 4);
            this.f92487V0 = iArr;
            for (int[] iArr2 : iArr) {
                Arrays.fill(iArr2, -1);
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final boolean m67550h0(int i13, int i14, int i15, int i16) {
        for (int i17 = i13; i17 < i13 + i15; i17++) {
            for (int i18 = i14; i18 < i14 + i16; i18++) {
                boolean[][] zArr = this.f92485T0;
                if (i17 < zArr.length && i18 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i17];
                    if (zArr2[i18]) {
                        zArr2[i18] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: i0 */
    public final int[][] m67551i0(String str, boolean z4) {
        int i13;
        int i14;
        try {
            String[] strArrSplit = str.split(",");
            Arrays.sort(strArrSplit, new C11858k0(29));
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArrSplit.length, 3);
            if (this.f92473H0 != 1 && this.f92475J0 != 1) {
                for (int i15 = 0; i15 < strArrSplit.length; i15++) {
                    String[] strArrSplit2 = strArrSplit[i15].trim().split(":");
                    String[] strArrSplit3 = strArrSplit2[1].split("x");
                    iArr[i15][0] = Integer.parseInt(strArrSplit2[0]);
                    if ((this.f92488W0 & 1) > 0) {
                        iArr[i15][1] = Integer.parseInt(strArrSplit3[1]);
                        iArr[i15][2] = Integer.parseInt(strArrSplit3[0]);
                    } else {
                        iArr[i15][1] = Integer.parseInt(strArrSplit3[0]);
                        iArr[i15][2] = Integer.parseInt(strArrSplit3[1]);
                    }
                }
                return iArr;
            }
            int i16 = 0;
            int i17 = 0;
            for (int i18 = 0; i18 < strArrSplit.length; i18++) {
                String[] strArrSplit4 = strArrSplit[i18].trim().split(":");
                iArr[i18][0] = Integer.parseInt(strArrSplit4[0]);
                int[] iArr2 = iArr[i18];
                iArr2[1] = 1;
                iArr2[2] = 1;
                if (this.f92475J0 == 1) {
                    iArr2[1] = Integer.parseInt(strArrSplit4[1]);
                    i16 += iArr[i18][1];
                    if (z4) {
                        i16--;
                    }
                }
                if (this.f92473H0 == 1) {
                    iArr[i18][2] = Integer.parseInt(strArrSplit4[1]);
                    i17 += iArr[i18][2];
                    if (z4) {
                        i17--;
                    }
                }
            }
            if (i16 != 0 && !this.f92472G0 && (i14 = this.f92473H0 + i16) <= 50 && this.f92474I0 != i14) {
                this.f92474I0 = i14;
                m67552k0();
                m67549g0();
            }
            if (i17 != 0 && !this.f92472G0 && (i13 = this.f92475J0 + i17) <= 50 && this.f92476K0 != i13) {
                this.f92476K0 = i13;
                m67552k0();
                m67549g0();
            }
            this.f92472G0 = true;
            return iArr;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m67552k0() {
        int i13;
        int i14 = this.f92474I0;
        if (i14 != 0 && (i13 = this.f92476K0) != 0) {
            this.f92473H0 = i14;
            this.f92475J0 = i13;
            return;
        }
        int i15 = this.f92476K0;
        if (i15 > 0) {
            this.f92475J0 = i15;
            this.f92473H0 = ((this.f98022s0 + i15) - 1) / i15;
        } else if (i14 > 0) {
            this.f92473H0 = i14;
            this.f92475J0 = ((this.f98022s0 + i14) - 1) / i14;
        } else {
            int iSqrt = (int) (Math.sqrt(this.f98022s0) + 1.5d);
            this.f92473H0 = iSqrt;
            this.f92475J0 = ((this.f98022s0 + iSqrt) - 1) / iSqrt;
        }
    }
}
