package p81;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b30.C2520f5;
import c41.C4115s4;
import com.whoop.design.util.AbstractC8693b;
import gb1.AbstractC15676d;
import ge3.AbstractC15751g;
import kd1.AbstractC22404p;
import l83.C23454a0;
import no0.C26970r0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p395p6.C28884h1;
import p490t0.AbstractC33253j;
import p571w3.C36775k;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import te0.AbstractC33745d;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: p81.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lp81/c;", "state", "", "shouldShowBorder", "Ll83/a0;", "d", "(Lp81/c;ZLandroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28970b {
    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:44:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:45:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:48:0x024d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0258  */
    /* JADX WARN: Code duplicated, block: B:52:0x0278  */
    /* JADX WARN: Code duplicated, block: B:55:0x0282  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m87981d(C28971c state, boolean z4, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        boolean z14;
        boolean z15;
        C28677v1 c28677v1M87180u;
        boolean z16;
        C2314t c2314t;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        float f13;
        C38072d c38072d;
        float f14;
        boolean z17;
        C4115s4 c4115s4M87986b;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1382380038);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87153g(state) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i16 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C28884h1(5);
                    c28655q.m87172p0(objM87133R);
                }
                float f15 = 4;
                float f16 = 8;
                Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC15676d.m44099b(modifierM3409f, z16, (Function1) objM87133R), f15 * f16, ((float) 3.5d) * f16);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(state.getTopImage(), null, null, c28655q, 0, 3), null, AbstractC1102d.m3419p(19 * f15, c2314t), null, null, 0.0f, null, c28655q, 432, 120);
                f13 = 2 * f16;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
                String strM21274h = AbstractC8693b.m21274h(state.getTitle(), c28655q, 0);
                c38072d = C38072d.f163053a;
                boolean z18 = z16;
                AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getT4(), null, c28655q, 0, 0, 196090);
                f14 = 1 * f16;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(state.getSubTitle(), c28655q, 0), null, c38072d.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196090);
                c28655q = c28655q;
                if (state.getBody() == null) {
                    c28655q.m87150e0(442048955);
                    z17 = false;
                    c28655q.m87173q(false);
                } else {
                    AbstractC33745d.m106667z(c28655q, 442048956, c2314t, f13, c28655q);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(state.getBody(), c28655q, 0), null, c38072d.m121949b(c28655q, 6).getAccentOnboardingAction(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH5(), null, c28655q, 0, 0, 196090);
                    c28655q = c28655q;
                    z17 = false;
                    c28655q.m87173q(false);
                }
                c4115s4M87986b = state.getRecoveryImpactEmptyState();
                if (c4115s4M87986b == null) {
                    c28655q.m87150e0(442403378);
                    c28655q.m87173q(z17);
                } else {
                    AbstractC33745d.m106667z(c28655q, 442403379, c2314t, f14, c28655q);
                    C28655q c28655q2 = c28655q;
                    AbstractC25303l.m74291r(c4115s4M87986b, null, null, null, c28655q2, 0, 14);
                    c28655q = c28655q2;
                    c28655q.m87173q(z17);
                }
                c28655q.m87173q(true);
                z15 = z18;
            } else {
                c28655q.m87138X();
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2520f5(state, z15, i13, i14, 2);
            }
        }
        i15 |= 48;
        z13 = z4;
        if ((i15 & 19) != 18) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            if (i16 != 0) {
                z16 = true;
            } else {
                z16 = z13;
            }
            c2314t = C2314t.f9131w;
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C28884h1(5);
                c28655q.m87172p0(objM87133R);
            }
            float f17 = 4;
            float f18 = 8;
            Modifier modifierM3395q2 = AbstractC1099a.m3395q(AbstractC15676d.m44099b(modifierM3409f2, z16, (Function1) objM87133R), f17 * f18, ((float) 3.5d) * f18);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3395q2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(state.getTopImage(), null, null, c28655q, 0, 3), null, AbstractC1102d.m3419p(19 * f17, c2314t), null, null, 0.0f, null, c28655q, 432, 120);
            f13 = 2 * f18;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
            String strM21274h2 = AbstractC8693b.m21274h(state.getTitle(), c28655q, 0);
            c38072d = C38072d.f163053a;
            boolean z19 = z16;
            AbstractC30795n.m94707h(strM21274h2, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getT4(), null, c28655q, 0, 0, 196090);
            f14 = 1 * f18;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(state.getSubTitle(), c28655q, 0), null, c38072d.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196090);
            c28655q = c28655q;
            if (state.getBody() == null) {
                c28655q.m87150e0(442048955);
                z17 = false;
                c28655q.m87173q(false);
            } else {
                AbstractC33745d.m106667z(c28655q, 442048956, c2314t, f13, c28655q);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(state.getBody(), c28655q, 0), null, c38072d.m121949b(c28655q, 6).getAccentOnboardingAction(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH5(), null, c28655q, 0, 0, 196090);
                c28655q = c28655q;
                z17 = false;
                c28655q.m87173q(false);
            }
            c4115s4M87986b = state.getRecoveryImpactEmptyState();
            if (c4115s4M87986b == null) {
                c28655q.m87150e0(442403378);
                c28655q.m87173q(z17);
            } else {
                AbstractC33745d.m106667z(c28655q, 442403379, c2314t, f14, c28655q);
                C28655q c28655q3 = c28655q;
                AbstractC25303l.m74291r(c4115s4M87986b, null, null, null, c28655q3, 0, 14);
                c28655q = c28655q3;
                c28655q.m87173q(z17);
            }
            c28655q.m87173q(true);
            z15 = z19;
        } else {
            c28655q.m87138X();
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2520f5(state, z15, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final Modifier m87982e(Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC37056f.m118997u(applyIf, new C26970r0(15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final Modifier m87983f(Modifier composed, Composer composer, int i13) {
        AbstractC22676k.m65750j(composed, "$this$composed");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-744925225);
        float f13 = 4;
        Modifier modifierM44455h = AbstractC15751g.m44455h(composed, ((float) 0.25d) * f13, C38072d.f163053a.m121949b(c28655q, 6).getWhite10(), AbstractC33253j.m105489e(3 * f13));
        c28655q.m87173q(false);
        return modifierM44455h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m87984g(C28971c c28971c, boolean z4, int i13, int i14, Composer composer, int i15) {
        m87981d(c28971c, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
