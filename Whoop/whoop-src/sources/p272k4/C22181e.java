package p272k4;

import java.util.HashMap;
import p108e4.C12685s;
import p242j4.C21307g;
import p319m4.AbstractC25021j;
import p319m4.C25019h;

/* JADX INFO: renamed from: k4.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C22181e extends C21307g {

    /* JADX INFO: renamed from: A0 */
    public int f86012A0;

    /* JADX INFO: renamed from: B0 */
    public int f86013B0;

    /* JADX INFO: renamed from: C0 */
    public int f86014C0;

    /* JADX INFO: renamed from: D0 */
    public int f86015D0;

    /* JADX INFO: renamed from: E0 */
    public int f86016E0;

    /* JADX INFO: renamed from: F0 */
    public int f86017F0;

    /* JADX INFO: renamed from: G0 */
    public int f86018G0;

    /* JADX INFO: renamed from: H0 */
    public int f86019H0;

    /* JADX INFO: renamed from: I0 */
    public float f86020I0;

    /* JADX INFO: renamed from: J0 */
    public float f86021J0;

    /* JADX INFO: renamed from: K0 */
    public float f86022K0;

    /* JADX INFO: renamed from: L0 */
    public float f86023L0;

    /* JADX INFO: renamed from: n0 */
    public C25019h f86024n0;

    /* JADX INFO: renamed from: o0 */
    public HashMap f86025o0;

    /* JADX INFO: renamed from: p0 */
    public HashMap f86026p0;

    /* JADX INFO: renamed from: q0 */
    public HashMap f86027q0;

    /* JADX INFO: renamed from: r0 */
    public int f86028r0;

    /* JADX INFO: renamed from: s0 */
    public int f86029s0;

    /* JADX INFO: renamed from: t0 */
    public int f86030t0;

    /* JADX INFO: renamed from: u0 */
    public int f86031u0;

    /* JADX INFO: renamed from: v0 */
    public int f86032v0;

    /* JADX INFO: renamed from: w0 */
    public int f86033w0;

    /* JADX INFO: renamed from: x0 */
    public int f86034x0;

    /* JADX INFO: renamed from: y0 */
    public int f86035y0;

    /* JADX INFO: renamed from: z0 */
    public int f86036z0;

    public C22181e(C12685s c12685s, int i13) {
        super(c12685s, i13);
        this.f86028r0 = 0;
        this.f86029s0 = -1;
        this.f86030t0 = -1;
        this.f86031u0 = -1;
        this.f86032v0 = -1;
        this.f86033w0 = -1;
        this.f86034x0 = -1;
        this.f86035y0 = 2;
        this.f86036z0 = 2;
        this.f86012A0 = 0;
        this.f86013B0 = 0;
        this.f86014C0 = 0;
        this.f86015D0 = 0;
        this.f86016E0 = 0;
        this.f86017F0 = 0;
        this.f86018G0 = -1;
        this.f86019H0 = 0;
        this.f86020I0 = 0.5f;
        this.f86021J0 = 0.5f;
        this.f86022K0 = 0.5f;
        this.f86023L0 = 0.5f;
        if (i13 == 8) {
            this.f86019H0 = 1;
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m63493A(int i13) {
        this.f86032v0 = i13;
    }

    /* JADX INFO: renamed from: B */
    public final void m63494B(float f13) {
        this.f86023L0 = f13;
    }

    /* JADX INFO: renamed from: C */
    public final void m63495C(int i13) {
        this.f86034x0 = i13;
    }

    /* JADX INFO: renamed from: D */
    public final void m63496D(float f13) {
        this.f86021J0 = f13;
    }

    /* JADX INFO: renamed from: E */
    public final void m63497E(int i13) {
        this.f86031u0 = i13;
    }

    /* JADX INFO: renamed from: F */
    public final void m63498F(int i13) {
        this.f86018G0 = i13;
    }

    /* JADX INFO: renamed from: G */
    public final void m63499G(int i13) {
        this.f86019H0 = i13;
    }

    /* JADX INFO: renamed from: H */
    public final void m63500H(int i13) {
        this.f86017F0 = i13;
    }

    /* JADX INFO: renamed from: I */
    public final void m63501I(int i13) {
        this.f86014C0 = i13;
    }

    /* JADX INFO: renamed from: J */
    public final void m63502J(int i13) {
        this.f86015D0 = i13;
    }

    /* JADX INFO: renamed from: K */
    public final void m63503K(int i13) {
        this.f86016E0 = i13;
    }

    /* JADX INFO: renamed from: L */
    public final void m63504L(int i13) {
        this.f86035y0 = i13;
    }

    /* JADX INFO: renamed from: M */
    public final void m63505M(int i13) {
        this.f86012A0 = i13;
    }

    /* JADX INFO: renamed from: N */
    public final void m63506N(int i13) {
        this.f86029s0 = i13;
    }

    /* JADX INFO: renamed from: O */
    public final void m63507O(int i13) {
        this.f86028r0 = i13;
    }

    @Override // p242j4.C21307g, p242j4.C21302b, p242j4.InterfaceC21308h
    public final void apply() {
        mo59831s();
        mo59810b(this.f86024n0);
        C25019h c25019h = this.f86024n0;
        c25019h.f98008W0 = this.f86019H0;
        c25019h.f98006U0 = this.f86028r0;
        int i13 = this.f86018G0;
        if (i13 != -1) {
            c25019h.f98007V0 = i13;
        }
        int i14 = this.f86014C0;
        if (i14 != 0) {
            c25019h.f98032x0 = i14;
        }
        int i15 = this.f86016E0;
        if (i15 != 0) {
            c25019h.f98028t0 = i15;
        }
        int i16 = this.f86015D0;
        if (i16 != 0) {
            c25019h.f98033y0 = i16;
        }
        int i17 = this.f86017F0;
        if (i17 != 0) {
            c25019h.f98029u0 = i17;
        }
        int i18 = this.f86013B0;
        if (i18 != 0) {
            c25019h.f98002Q0 = i18;
        }
        int i19 = this.f86012A0;
        if (i19 != 0) {
            c25019h.f98003R0 = i19;
        }
        float f13 = this.f81427h;
        if (f13 != 0.5f) {
            c25019h.f97996K0 = f13;
        }
        float f14 = this.f86022K0;
        if (f14 != 0.5f) {
            c25019h.f97998M0 = f14;
        }
        float f15 = this.f86023L0;
        if (f15 != 0.5f) {
            c25019h.f98000O0 = f15;
        }
        float f16 = this.f81429i;
        if (f16 != 0.5f) {
            c25019h.f97997L0 = f16;
        }
        float f17 = this.f86020I0;
        if (f17 != 0.5f) {
            c25019h.f97999N0 = f17;
        }
        float f18 = this.f86021J0;
        if (f18 != 0.5f) {
            c25019h.f98001P0 = f18;
        }
        int i24 = this.f86036z0;
        if (i24 != 2) {
            c25019h.f98004S0 = i24;
        }
        int i25 = this.f86035y0;
        if (i25 != 2) {
            c25019h.f98005T0 = i25;
        }
        int i26 = this.f86029s0;
        if (i26 != -1) {
            c25019h.f97991F0 = i26;
        }
        int i27 = this.f86030t0;
        if (i27 != -1) {
            c25019h.f97993H0 = i27;
        }
        int i28 = this.f86031u0;
        if (i28 != -1) {
            c25019h.f97995J0 = i28;
        }
        int i29 = this.f86032v0;
        if (i29 != -1) {
            c25019h.f97990E0 = i29;
        }
        int i34 = this.f86033w0;
        if (i34 != -1) {
            c25019h.f97992G0 = i34;
        }
        int i35 = this.f86034x0;
        if (i35 != -1) {
            c25019h.f97994I0 = i35;
        }
        m59830r();
    }

    @Override // p242j4.C21307g
    /* JADX INFO: renamed from: s */
    public final AbstractC25021j mo59831s() {
        if (this.f86024n0 == null) {
            this.f86024n0 = new C25019h();
        }
        return this.f86024n0;
    }

    /* JADX INFO: renamed from: t */
    public final void m63508t(String str, float f13, float f14, float f15) {
        m59829q(str);
        if (!Float.isNaN(f13)) {
            if (this.f86025o0 == null) {
                this.f86025o0 = new HashMap();
            }
            this.f86025o0.put(str, Float.valueOf(f13));
        }
        if (!Float.isNaN(f14)) {
            if (this.f86026p0 == null) {
                this.f86026p0 = new HashMap();
            }
            this.f86026p0.put(str, Float.valueOf(f14));
        }
        if (Float.isNaN(f15)) {
            return;
        }
        if (this.f86027q0 == null) {
            this.f86027q0 = new HashMap();
        }
        this.f86027q0.put(str, Float.valueOf(f15));
    }

    /* JADX INFO: renamed from: u */
    public final void m63509u(float f13) {
        this.f86022K0 = f13;
    }

    /* JADX INFO: renamed from: v */
    public final void m63510v(int i13) {
        this.f86033w0 = i13;
    }

    /* JADX INFO: renamed from: w */
    public final void m63511w(float f13) {
        this.f86020I0 = f13;
    }

    /* JADX INFO: renamed from: x */
    public final void m63512x(int i13) {
        this.f86030t0 = i13;
    }

    /* JADX INFO: renamed from: y */
    public final void m63513y(int i13) {
        this.f86036z0 = i13;
    }

    /* JADX INFO: renamed from: z */
    public final void m63514z(int i13) {
        this.f86013B0 = i13;
    }
}
