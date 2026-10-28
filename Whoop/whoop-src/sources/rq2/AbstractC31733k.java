package rq2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import java.util.List;
import jr2.AbstractC21904c;
import kd1.AbstractC22403o;
import kq2.AbstractC22776b;
import kr2.AbstractC22813b;
import kr2.EnumC22818g;
import l83.C23454a0;
import l83.C23465k;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p077d0.C11393q0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22957g;
import p291l0.C23010x;
import p291l0.C23016z;
import p291l0.InterfaceC23013y;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p635y2.C39102j;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import ri2.C31469a;
import rm2.C31604d;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: rq2.k */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lrq2/f;", "viewState", "", "isCurrentStep", "Ll83/a0;", "f", "(Lrq2/f;ZLandroidx/compose/runtime/Composer;I)V", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31733k {
    /* JADX INFO: renamed from: f */
    public static final void m98484f(final C31723f viewState, boolean z4, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        Object obj;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-403315809);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87155h(z4) ? 32 : 16;
        }
        final int i15 = 0;
        final int i16 = 1;
        if (!c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q2.m87138X();
            c28655q = c28655q2;
        } else if (z4) {
            c28655q2.m87150e0(2137416740);
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
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), 0.0f, ((float) 6.5d) * 8, 0.0f, 0.0f, 13);
            C22949e c22949e = AbstractC22977m.f90650a;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66748k(3 * 4, C2299e.f9109L), C2299e.f9110M, c28655q2, 6);
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
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC22813b.m66087n(c11393q1, AbstractC1102d.m3407d(1.0f, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true)), AbstractC37817c.m121344e(-1741168692, c28655q2, new InterfaceC4351m() { // from class: rq2.j
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj2, Object obj3) {
                    int i17 = i15;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (i17) {
                        case 0:
                            return AbstractC31733k.m98485g(viewState, C23016z.f90757a, composer2, iIntValue);
                        default:
                            return AbstractC31733k.m98488j(viewState, composer2, iIntValue);
                    }
                }
            }), c28655q2, 384, 0);
            AbstractC22813b.m66094u(c11393q1, EnumC22818g.BOTTOM, null, AbstractC37817c.m121344e(769638147, c28655q2, new InterfaceC4351m() { // from class: rq2.j
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj2, Object obj3) {
                    int i17 = i16;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (i17) {
                        case 0:
                            return AbstractC31733k.m98485g(viewState, C23016z.f90757a, composer2, iIntValue);
                        default:
                            return AbstractC31733k.m98488j(viewState, composer2, iIntValue);
                    }
                }
            }), c28655q2, 3120, 4);
            C28655q c28655q3 = c28655q2;
            c28655q3.m87173q(true);
            c28655q3.m87173q(false);
            c28655q = c28655q3;
        } else {
            c28655q2.m87150e0(2139875939);
            c28655q2.m87173q(false);
            c28655q = c28655q2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C31727h(viewState, z4, i13, i16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m98485g(C31723f c31723f, InterfaceC23013y interfaceC23013y, Composer composer, int i13) {
        C23454a0 c23454a0;
        C28655q c28655q = (C28655q) composer;
        boolean zM87135U = c28655q.m87135U(i13 & 1, (i13 & 3) != 2);
        C23454a0 c23454a1 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q.m87138X();
            return c23454a1;
        }
        InterfaceC35689r0 interfaceC35689r0M98444i = c31723f.getLottieWrapper();
        if (interfaceC35689r0M98444i == null) {
            c28655q.m87150e0(-836417003);
            c28655q.m87173q(false);
            c23454a0 = null;
        } else {
            c28655q.m87150e0(-836417002);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C31469a(19);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C31604d(10);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC35684p.m113047h(null, interfaceC35689r0M98444i, false, 0.0f, 1, interfaceC4339a, (Function1) objM87133R2, C39102j.f168200b, null, c28655q, 14376960, 269);
            c28655q.m87173q(false);
            c23454a0 = c23454a1;
        }
        if (c23454a0 != null) {
            c28655q.m87150e0(1774133477);
            c28655q.m87173q(false);
            return c23454a1;
        }
        c28655q.m87150e0(-836101670);
        AbstractC31729i.m98467n(c31723f.getImage(), null, c28655q, AbstractC22403o.f87638a, 2);
        c28655q.m87173q(false);
        return c23454a1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m98486h() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m98487i(float f13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m98488j(C31723f c31723f, Composer composer, int i13) {
        C23454a0 c23454a0;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        boolean zM87135U = c28655q2.m87135U(i13 & 1, (i13 & 3) != 2);
        C23454a0 c23454a1 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q2.m87138X();
            return c23454a1;
        }
        C22957g c22957g = AbstractC22977m.f90652c;
        C2305k c2305k = C2299e.f9110M;
        C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
        int iHashCode = Long.hashCode(c28655q2.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, c2314t);
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
        if (c31723f.getFooterText() == null) {
            c28655q2.m87150e0(-439371734);
            c28655q2.m87173q(false);
            c23454a0 = null;
        } else {
            c28655q2.m87150e0(-439371733);
            Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 5 * 4, 0.0f, 2).mo3471e(new HorizontalAlignElement(c2305k)), "ImageFooterStepV2");
            TextResource textResourceM98441f = c31723f.getFooterText();
            TextResource textResourceM98440e = c31723f.getFooterSubText();
            int i14 = TextResource.$stable;
            AbstractC22776b.m65990b(modifierM3599a, textResourceM98441f, textResourceM98440e, c28655q2, (i14 << 6) | (i14 << 3));
            c28655q2.m87173q(false);
            c23454a0 = c23454a1;
        }
        if (c23454a0 == null) {
            c28655q2.m87150e0(-438856544);
            AbstractC31729i.m98465l(c31723f.m98445j(), c28655q2, 0);
            if (c31723f.m98442g().isEmpty()) {
                c28655q = c28655q2;
                c28655q.m87150e0(74667425);
                c28655q.m87173q(false);
            } else {
                c28655q2.m87150e0(74192846);
                List<C23465k> listM62320h = AbstractC21904c.m62320h(c31723f.m98442g());
                C38072d c38072d = C38072d.f163053a;
                int i15 = C38072d.f163054b;
                AbstractC30795n.m94704e(listM62320h, AbstractC1136a.m3599a(AbstractC1099a.m3396r(c2314t, 5 * 4, 0.0f, 2), "ImageStepV2Footer"), c38072d.m121949b(c28655q2, i15).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c38072d.m121952e(c28655q2, i15).getB1(), c28655q2, 48, C2886a.f11498d << 21, 131064);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(false);
        } else {
            c28655q = c28655q2;
            c28655q.m87150e0(817110714);
            c28655q.m87173q(false);
        }
        c28655q.m87173q(true);
        return c23454a1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m98489k(C31723f c31723f, boolean z4, int i13, Composer composer, int i14) {
        m98484f(c31723f, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
