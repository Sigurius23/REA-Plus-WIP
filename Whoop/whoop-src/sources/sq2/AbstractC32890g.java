package sq2;

import am0.C0998b;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import jr2.AbstractC21904c;
import kq2.AbstractC22776b;
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
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
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
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: sq2.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lsq2/d;", "viewState", "", "isCurrentStep", "Ll83/a0;", "e", "(Lsq2/d;ZLandroidx/compose/runtime/Composer;I)V", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32890g {
    /* JADX INFO: renamed from: e */
    public static final void m103265e(final C32887d viewState, boolean z4, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        Object obj;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1959282040);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(viewState) ? 4 : 2) | i13;
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
            c28655q2.m87150e0(-365506752);
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
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90656g, C2299e.f9110M, c28655q2, 6);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3407d);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC22953f.m66715b(c28655q2, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            final int i15 = 0;
            AbstractC22813b.m66084k(c11393q1, null, AbstractC37817c.m121344e(-1841260951, c28655q2, new InterfaceC4351m() { // from class: sq2.f
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj2, Object obj3) {
                    int i16 = i15;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (i16) {
                        case 0:
                            return AbstractC32890g.m103266f(viewState, composer2, iIntValue);
                        case 1:
                            return AbstractC32890g.m103267g(viewState, composer2, iIntValue);
                        default:
                            return AbstractC32890g.m103268h(viewState, C23016z.f90757a, composer2, iIntValue);
                    }
                }
            }), c28655q2, 384, 2);
            AbstractC11266d.m30469w(3, 8, c2314t, c28655q2);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
            final int i16 = 1;
            AbstractC22813b.m66084k(c11393q1, null, AbstractC37817c.m121344e(-2032215697, c28655q2, new InterfaceC4351m() { // from class: sq2.f
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj2, Object obj3) {
                    int i17 = i16;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (i17) {
                        case 0:
                            return AbstractC32890g.m103266f(viewState, composer2, iIntValue);
                        case 1:
                            return AbstractC32890g.m103267g(viewState, composer2, iIntValue);
                        default:
                            return AbstractC32890g.m103268h(viewState, C23016z.f90757a, composer2, iIntValue);
                    }
                }
            }), c28655q2, 384, 2);
            c28655q2.m87173q(true);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC22953f.m66715b(c28655q2, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            final int i17 = 2;
            AbstractC22813b.m66094u(c11393q1, EnumC22818g.BOTTOM, null, AbstractC37817c.m121344e(-1299773788, c28655q2, new InterfaceC4351m() { // from class: sq2.f
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj2, Object obj3) {
                    int i18 = i17;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (i18) {
                        case 0:
                            return AbstractC32890g.m103266f(viewState, composer2, iIntValue);
                        case 1:
                            return AbstractC32890g.m103267g(viewState, composer2, iIntValue);
                        default:
                            return AbstractC32890g.m103268h(viewState, C23016z.f90757a, composer2, iIntValue);
                    }
                }
            }), c28655q2, 3120, 4);
            C28655q c28655q3 = c28655q2;
            c28655q3.m87173q(true);
            c28655q3.m87173q(false);
            c28655q = c28655q3;
        } else {
            c28655q2.m87150e0(-362744838);
            c28655q2.m87173q(false);
            c28655q = c28655q2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0998b(viewState, z4, i13, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m103266f(C32887d c32887d, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = ((float) 2.5d) * 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1136a.m3599a(C2314t.f9131w, "DonutStepTitle"), f13, 0.0f, f13, 0.0f, 10);
            String strM21274h = AbstractC8693b.m21274h(c32887d.getStatSectionTitle(), c28655q, TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, modifierM3398t, c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getT2(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m103267g(C32887d c32887d, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC32884a.m103221c(c32887d.m103253i(), c32887d.getDonutBackgroundColor(), c28655q, 0);
            AbstractC32888e.m103259e(c32887d.m103253i(), C1100b.f4583a.mo3400a(c2314t, C2299e.f9117z), c28655q, 0, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m103268h(C32887d c32887d, InterfaceC23013y interfaceC23013y, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zIsEmpty = c32887d.m103252h().isEmpty();
            C2314t c2314t = C2314t.f9131w;
            if (zIsEmpty) {
                c28655q.m87150e0(1864794473);
                Modifier modifierM3599a = AbstractC1136a.m3599a(((C23016z) interfaceC23013y).m66778b(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 2.5d) * 8, 0.0f, 2), C2299e.f9110M), "DonutFooterText");
                TextResource footerText = c32887d.getFooterText();
                TextResource footerSubText = c32887d.getFooterSubText();
                int i14 = TextResource.$stable;
                AbstractC22776b.m65990b(modifierM3599a, footerText, footerSubText, c28655q, (i14 << 6) | (i14 << 3));
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1864319832);
                float f13 = 5 * 4;
                AbstractC30795n.m94704e(AbstractC21904c.m62321i(c32887d.m103252h()), AbstractC1136a.m3599a(AbstractC1099a.m3398t(((C23016z) interfaceC23013y).m66778b(c2314t, C2299e.f9111N), f13, f13, f13, 0.0f, 8), "DonutFooterHighlightedText"), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getT2(), c28655q, 0, C2886a.f11498d << 21, 131068);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m103269i(C32887d c32887d, boolean z4, int i13, Composer composer, int i14) {
        m103265e(c32887d, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
