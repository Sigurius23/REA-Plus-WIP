package m71;

import a31.C0341c;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import e93.AbstractC12889b;
import gb1.AbstractC15676d;
import gf1.C15786e;
import hg3.AbstractC17269i;
import hy0.C17749h0;
import kd1.C22411w;
import l83.C23454a0;
import m01.C24875c;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p132f0.C13825t;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22994r1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.C24671c;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: m71.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lm71/d;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "f", "(Lm71/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25199b {
    /* JADX INFO: renamed from: f */
    public static final void m73783f(C25201d viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        long white5;
        C13825t c13825tM48880a;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2057962203);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C24875c(8);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
            }
            boolean z4 = viewState.getStyle() == EnumC25200c.OUTLINED;
            C33252i c33252iM64090c = C22411w.f87680a.m64535a().m64090c();
            if (z4) {
                c28655q.m87150e0(-2016706896);
                white5 = C38072d.f163053a.m121949b(c28655q, 6).getTransparent();
            } else {
                c28655q.m87150e0(-2016705781);
                white5 = C38072d.f163053a.m121949b(c28655q, 6).getWhite5();
            }
            c28655q.m87173q(false);
            if (z4) {
                c28655q.m87150e0(-2016704430);
                c13825tM48880a = AbstractC17269i.m48880a(1, C38072d.f163053a.m121949b(c28655q, 6).getWhite20());
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1906721432);
                c28655q.m87173q(false);
                c13825tM48880a = null;
            }
            AbstractC12889b.m36263b(C2314t.f9131w, c33252iM64090c, white5, c13825tM48880a, 0, AbstractC37817c.m121344e(-1951528734, c28655q, new C0341c(z4, viewState, function1, 14)), c28655q, 1769478, 8);
        } else {
            c28655q.m87138X();
        }
        Function1 function2 = function1;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24671c(viewState, i13, function2, i14, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m73784g(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m73785h(boolean z4, C25201d c25201d, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2305k c2305k = C2299e.f9110M;
            C2314t c2314t = C2314t.f9131w;
            float f13 = 8;
            float f14 = 2 * f13;
            Modifier modifierM3397s = AbstractC1099a.m3397s(AbstractC1102d.m3409f(1.0f, c2314t), f14, f14, f14, z4 ? 3 * f13 : f14);
            C22949e c22949e = AbstractC22977m.f90650a;
            if (!z4) {
                f14 = 1 * f13;
            }
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), c2305k, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3397s);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            if (c25201d.getTitle() == null && c25201d.getTitleIcon() == null) {
                c28655q.m87150e0(748214230);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(747129788);
                C2306l c2306l = C2299e.f9108K;
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1 * f13, 7);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q, 48);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                Integer titleIcon = c25201d.getTitleIcon();
                if (titleIcon == null) {
                    c28655q.m87150e0(1187834633);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1187834634);
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(titleIcon.intValue(), c28655q, 6), null, AbstractC1102d.m3419p(6 * 4, c2314t), C38072d.f163053a.m121949b(c28655q, 6).getWhite50(), c28655q, 432, 0);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                TextResource title = c25201d.getTitle();
                if (title == null) {
                    c28655q.m87150e0(1188266153);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1188266154);
                    boolean z13 = c25201d.getTitleIcon() != null;
                    Object objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C24875c(9);
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifierM44099b = AbstractC15676d.m44099b(c2314t, z13, (Function1) objM87133R);
                    String strM21274h = AbstractC8693b.m21274h(title, c28655q, 0);
                    C38072d c38072d = C38072d.f163053a;
                    C28655q c28655q2 = c28655q;
                    AbstractC30795n.m94707h(strM21274h, modifierM44099b, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB1(), null, c28655q2, 0, 0, 196600);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            c28655q.m87150e0(1271063169);
            for (InterfaceC25312u interfaceC25312u : c25201d.m73789a()) {
                if (interfaceC25312u instanceof C17749h0) {
                    c28655q.m87150e0(1871700675);
                    AbstractC25303l.m74291r(interfaceC25312u, null, new C15786e(24), null, c28655q, 0, 10);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(2138592058);
                    AbstractC25303l.m74291r(interfaceC25312u, null, null, function1, c28655q, 0, 6);
                    c28655q.m87173q(false);
                }
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final Modifier m73786i(Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC1099a.m3398t(applyIf, 1 * 8, 0.0f, 0.0f, 0.0f, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final Modifier m73787j(C17749h0 it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1546474369);
        Modifier modifierM3384f = AbstractC1099a.m3384f(C2314t.f9131w, false, 1.0f);
        c28655q.m87173q(false);
        return modifierM3384f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m73788k(C25201d c25201d, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m73783f(c25201d, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
