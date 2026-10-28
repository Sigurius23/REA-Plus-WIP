package p272k4;

import java.util.HashSet;
import p108e4.C12685s;
import p242j4.C21307g;
import p295l4.C23327a;
import p319m4.AbstractC25021j;

/* JADX INFO: renamed from: k4.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C22182f extends C21307g {

    /* JADX INFO: renamed from: A0 */
    public String f86037A0;

    /* JADX INFO: renamed from: B0 */
    public int f86038B0;

    /* JADX INFO: renamed from: n0 */
    public C23327a f86039n0;

    /* JADX INFO: renamed from: o0 */
    public int f86040o0;

    /* JADX INFO: renamed from: p0 */
    public int f86041p0;

    /* JADX INFO: renamed from: q0 */
    public int f86042q0;

    /* JADX INFO: renamed from: r0 */
    public int f86043r0;

    /* JADX INFO: renamed from: s0 */
    public int f86044s0;

    /* JADX INFO: renamed from: t0 */
    public int f86045t0;

    /* JADX INFO: renamed from: u0 */
    public int f86046u0;

    /* JADX INFO: renamed from: v0 */
    public float f86047v0;

    /* JADX INFO: renamed from: w0 */
    public float f86048w0;

    /* JADX INFO: renamed from: x0 */
    public String f86049x0;

    /* JADX INFO: renamed from: y0 */
    public String f86050y0;

    /* JADX INFO: renamed from: z0 */
    public String f86051z0;

    public C22182f(C12685s c12685s, int i13) {
        super(c12685s, i13);
        this.f86040o0 = 0;
        this.f86041p0 = 0;
        this.f86042q0 = 0;
        this.f86043r0 = 0;
        if (i13 == 10) {
            this.f86045t0 = 1;
        } else if (i13 == 11) {
            this.f86046u0 = 1;
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m63515A(int i13) {
        this.f86041p0 = i13;
    }

    /* JADX INFO: renamed from: B */
    public final void m63516B(int i13) {
        this.f86040o0 = i13;
    }

    /* JADX INFO: renamed from: C */
    public final void m63517C(int i13) {
        this.f86042q0 = i13;
    }

    /* JADX INFO: renamed from: D */
    public final void m63518D(String str) {
        this.f86049x0 = str;
    }

    /* JADX INFO: renamed from: E */
    public final void m63519E(int i13) {
        if (this.f81471l0 == 11) {
            return;
        }
        this.f86045t0 = i13;
    }

    /* JADX INFO: renamed from: F */
    public final void m63520F(String str) {
        this.f86037A0 = str;
    }

    /* JADX INFO: renamed from: G */
    public final void m63521G(String str) {
        this.f86051z0 = str;
    }

    /* JADX INFO: renamed from: H */
    public final void m63522H(float f13) {
        this.f86048w0 = f13;
    }

    @Override // p242j4.C21307g, p242j4.C21302b, p242j4.InterfaceC21308h
    public final void apply() {
        mo59831s();
        C23327a c23327a = this.f86039n0;
        int i13 = this.f86044s0;
        c23327a.getClass();
        if ((i13 == 0 || i13 == 1) && c23327a.f92483R0 != i13) {
            c23327a.f92483R0 = i13;
        }
        int i14 = this.f86045t0;
        if (i14 != 0) {
            C23327a c23327a2 = this.f86039n0;
            if (i14 > 50) {
                c23327a2.getClass();
            } else if (c23327a2.f92474I0 != i14) {
                c23327a2.f92474I0 = i14;
                c23327a2.m67552k0();
                c23327a2.m67549g0();
            }
        }
        int i15 = this.f86046u0;
        if (i15 != 0) {
            C23327a c23327a3 = this.f86039n0;
            if (i15 > 50) {
                c23327a3.getClass();
            } else if (c23327a3.f92476K0 != i15) {
                c23327a3.f92476K0 = i15;
                c23327a3.m67552k0();
                c23327a3.m67549g0();
            }
        }
        float f13 = this.f86047v0;
        if (f13 != 0.0f) {
            C23327a c23327a4 = this.f86039n0;
            if (f13 < 0.0f) {
                c23327a4.getClass();
            } else if (c23327a4.f92477L0 != f13) {
                c23327a4.f92477L0 = f13;
            }
        }
        float f14 = this.f86048w0;
        if (f14 != 0.0f) {
            C23327a c23327a5 = this.f86039n0;
            if (f14 < 0.0f) {
                c23327a5.getClass();
            } else if (c23327a5.f92478M0 != f14) {
                c23327a5.f92478M0 = f14;
            }
        }
        String str = this.f86049x0;
        if (str != null && !str.isEmpty()) {
            C23327a c23327a6 = this.f86039n0;
            String str2 = this.f86049x0;
            String str3 = c23327a6.f92479N0;
            if (str3 == null || !str3.equals(str2)) {
                c23327a6.f92479N0 = str2;
            }
        }
        String str4 = this.f86050y0;
        if (str4 != null && !str4.isEmpty()) {
            C23327a c23327a7 = this.f86039n0;
            String str5 = this.f86050y0;
            String str6 = c23327a7.f92480O0;
            if (str6 == null || !str6.equals(str5)) {
                c23327a7.f92480O0 = str5;
            }
        }
        String str7 = this.f86051z0;
        if (str7 != null && !str7.isEmpty()) {
            C23327a c23327a8 = this.f86039n0;
            String str8 = this.f86051z0;
            String str9 = c23327a8.f92481P0;
            if (str9 == null || !str9.equals(str8.toString())) {
                c23327a8.f92472G0 = false;
                c23327a8.f92481P0 = str8.toString();
            }
        }
        String str10 = this.f86037A0;
        if (str10 != null && !str10.isEmpty()) {
            C23327a c23327a9 = this.f86039n0;
            String str11 = this.f86037A0;
            String str12 = c23327a9.f92482Q0;
            if (str12 == null || !str12.equals(str11)) {
                c23327a9.f92472G0 = false;
                c23327a9.f92482Q0 = str11;
            }
        }
        C23327a c23327a10 = this.f86039n0;
        c23327a10.f92488W0 = this.f86038B0;
        int i16 = this.f86040o0;
        c23327a10.f98030v0 = i16;
        c23327a10.f98032x0 = i16;
        c23327a10.f98033y0 = i16;
        c23327a10.f98031w0 = this.f86041p0;
        c23327a10.f98028t0 = this.f86042q0;
        c23327a10.f98029u0 = this.f86043r0;
        m59830r();
    }

    @Override // p242j4.C21307g
    /* JADX INFO: renamed from: s */
    public final AbstractC25021j mo59831s() {
        int[][] iArrM67551i0;
        int[][] iArrM67551i1;
        boolean[][] zArr;
        if (this.f86039n0 == null) {
            C23327a c23327a = new C23327a();
            c23327a.f92472G0 = false;
            c23327a.f92484S0 = 0;
            c23327a.f92486U0 = new HashSet();
            c23327a.f92490Y0 = 0;
            c23327a.m67552k0();
            int[][] iArr = c23327a.f92487V0;
            boolean z4 = iArr != null && iArr.length == c23327a.f98022s0 && (zArr = c23327a.f92485T0) != null && zArr.length == c23327a.f92473H0 && zArr[0].length == c23327a.f92475J0;
            if (!z4) {
                c23327a.m67549g0();
            }
            if (z4) {
                for (int i13 = 0; i13 < c23327a.f92485T0.length; i13++) {
                    int i14 = 0;
                    while (true) {
                        boolean[][] zArr2 = c23327a.f92485T0;
                        if (i14 < zArr2[0].length) {
                            zArr2[i13][i14] = true;
                            i14++;
                        }
                    }
                }
                for (int i15 = 0; i15 < c23327a.f92487V0.length; i15++) {
                    int i16 = 0;
                    while (true) {
                        int[][] iArr2 = c23327a.f92487V0;
                        if (i16 < iArr2[0].length) {
                            iArr2[i15][i16] = -1;
                            i16++;
                        }
                    }
                }
            }
            c23327a.f92484S0 = 0;
            String str = c23327a.f92482Q0;
            if (str != null && !str.trim().isEmpty() && (iArrM67551i1 = c23327a.m67551i0(c23327a.f92482Q0, false)) != null) {
                c23327a.m67547e0(iArrM67551i1);
            }
            String str2 = c23327a.f92481P0;
            if (str2 != null && !str2.trim().isEmpty() && (iArrM67551i0 = c23327a.m67551i0(c23327a.f92481P0, true)) != null) {
                c23327a.m67548f0(iArrM67551i0);
            }
            this.f86039n0 = c23327a;
        }
        return this.f86039n0;
    }

    /* JADX INFO: renamed from: t */
    public final void m63523t(String str) {
        this.f86050y0 = str;
    }

    /* JADX INFO: renamed from: u */
    public final void m63524u(int i13) {
        if (this.f81471l0 == 10) {
            return;
        }
        this.f86046u0 = i13;
    }

    /* JADX INFO: renamed from: v */
    public final void m63525v(int i13) {
        this.f86038B0 = i13;
    }

    /* JADX INFO: renamed from: w */
    public final void m63526w(String str) {
        if (str.isEmpty()) {
            return;
        }
        String[] strArrSplit = str.split("\\|");
        this.f86038B0 = 0;
        for (String str2 : strArrSplit) {
            String lowerCase = str2.toLowerCase();
            lowerCase.getClass();
            if (lowerCase.equals("subgridbycolrow")) {
                this.f86038B0 |= 1;
            } else if (lowerCase.equals("spansrespectwidgetorder")) {
                this.f86038B0 |= 2;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m63527x(float f13) {
        this.f86047v0 = f13;
    }

    /* JADX INFO: renamed from: y */
    public final void m63528y(int i13) {
        this.f86044s0 = i13;
    }

    /* JADX INFO: renamed from: z */
    public final void m63529z(int i13) {
        this.f86043r0 = i13;
    }
}
