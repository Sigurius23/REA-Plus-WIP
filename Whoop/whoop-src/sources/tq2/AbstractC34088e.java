package tq2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import kr2.AbstractC22813b;
import kr2.EnumC22818g;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p077d0.C11393q0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.C23016z;
import p291l0.InterfaceC23013y;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: tq2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Ltq2/g;", "viewState", "", "isCurrentStep", "Ll83/a0;", "d", "(Ltq2/g;ZLandroidx/compose/runtime/Composer;I)V", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34088e {
    /* JADX INFO: renamed from: d */
    public static final void m107754d(final C34090g viewState, boolean z4, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        Object obj;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(468727232);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(viewState) : c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87155h(z4) ? 32 : 16;
        }
        if (!c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q2.m87138X();
            c28655q = c28655q2;
        } else if (z4) {
            c28655q2.m87150e0(914487990);
            Object objM87133R = c28655q2.m87133R();
            if (objM87133R == C28635l.f115821a) {
                obj = objM87133R;
                C11393q0 c11393q0 = new C11393q0(Boolean.FALSE);
                c11393q0.m30628I0(Boolean.TRUE);
                c28655q2.m87172p0(c11393q0);
                obj = c11393q0;
            }
            obj = objM87133R;
            C11393q0 c11393q1 = (C11393q0) obj;
            C2314t c2314t = C2314t.f9131w;
            float f13 = 8;
            float f14 = ((float) 2.5d) * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t), f14, 3 * f13, f14, 0.0f, 8);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q2, 6);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3398t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3413j(c2314t, 2 * f13, 0.0f, 2));
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            float f15 = 1.0f;
            if (1.0f > Float.MAX_VALUE) {
                f15 = Float.MAX_VALUE;
            }
            final int i15 = 0;
            AbstractC22813b.m66084k(c11393q1, new LayoutWeightElement(f15, true), AbstractC37817c.m121344e(2122288319, c28655q2, new InterfaceC4351m() { // from class: tq2.d
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj2, Object obj3) {
                    int i16 = i15;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (i16) {
                        case 0:
                            return AbstractC34088e.m107755e(C23016z.f90757a, viewState, composer2, iIntValue);
                        default:
                            return AbstractC34088e.m107756f(viewState, composer2, iIntValue);
                    }
                }
            }), c28655q2, 384, 0);
            AbstractC22813b.m66084k(c11393q1, null, C34084a.f142954a.m107742b(), c28655q2, 384, 2);
            AbstractC11266d.m30469w(10, 4, c2314t, c28655q2);
            final int i16 = 1;
            AbstractC22813b.m66094u(c11393q1, EnumC22818g.BOTTOM, null, AbstractC37817c.m121344e(844565028, c28655q2, new InterfaceC4351m() { // from class: tq2.d
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj2, Object obj3) {
                    int i17 = i16;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (i17) {
                        case 0:
                            return AbstractC34088e.m107755e(C23016z.f90757a, viewState, composer2, iIntValue);
                        default:
                            return AbstractC34088e.m107756f(viewState, composer2, iIntValue);
                    }
                }
            }), c28655q2, 3120, 4);
            C28655q c28655q3 = c28655q2;
            c28655q3.m87173q(true);
            c28655q3.m87173q(false);
            c28655q = c28655q3;
        } else {
            c28655q2.m87150e0(917267202);
            c28655q2.m87173q(false);
            c28655q = c28655q2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34085b(viewState, z4, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m107755e(InterfaceC23013y interfaceC23013y, C34090g c34090g, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 8;
            Modifier modifierM3396r = AbstractC1099a.m3396r(((C23016z) interfaceC23013y).m66779c(C2314t.f9131w, true, 1.0f), 1 * f13, 0.0f, 2);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9109L, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            C34091h leftBar = c34090g.getLeftBar();
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            float f14 = 2 * f13;
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), f14, 0.0f, 2);
            int i14 = TextResource.$stable;
            AbstractC34086c.m107749g(leftBar, modifierM3396r2, c28655q, i14);
            C34091h rightBar = c34090g.getRightBar();
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC34086c.m107749g(rightBar, AbstractC1099a.m3396r(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), f14, 0.0f, 2), c28655q, i14);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m107756f(C34090g c34090g, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, ((float) 1.5d) * 8, 7);
            TextResource footerText = c34090g.getFooterText();
            int i14 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(footerText, c28655q, i14);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            C2886a c2886aM8416N = c38072d.m121952e(c28655q, i15).getT1();
            long brandWhite = c38072d.m121949b(c28655q, i15).getBrandWhite();
            int i16 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, modifierM3398t, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8416N, null, c28655q, 48, i16, 196600);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c34090g.getFooterSubText(), c28655q, i14), AbstractC1136a.m3599a(c2314t, "DualBarFooterSubText"), c38072d.m121949b(c28655q, i15).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB1(), null, c28655q, 48, i16, 196600);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m107757g(C34090g c34090g, boolean z4, int i13, Composer composer, int i14) {
        m107754d(c34090g, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
