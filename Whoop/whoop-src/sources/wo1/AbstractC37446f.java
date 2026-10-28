package wo1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.analytics.AnalyticEventModel;
import eh0.C13193b;
import gb1.AbstractC15680h;
import gz0.EnumC16313m0;
import hy0.AbstractC17746g1;
import hy0.AbstractC17755i2;
import hy0.C17750h1;
import ih0.AbstractC18489d0;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22960g2;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22996s0;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p734sl0.C32676t1;
import p739ui0.C35015q;
import pp2.C29451o;
import qz0.AbstractC30795n;
import rz0.AbstractC31926e;
import v31.C35608d;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: wo1.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a5\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a1\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lwo1/g;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "j", "(Landroidx/compose/ui/Modifier;Lwo1/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lwo1/c;", "g", "(Landroidx/compose/ui/Modifier;Lwo1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "Lhy0/h1;", "tags", "", "isEnabled", "m", "(Landroidx/compose/ui/Modifier;Ljava/util/List;ZLandroidx/compose/runtime/Composer;II)V", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37446f {
    /* JADX INFO: renamed from: g */
    private static final void m119894g(Modifier modifier, C37440c c37440c, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        boolean z4;
        long white30;
        boolean z13;
        long white31;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1698402948);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(c37440c) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t : modifier2;
            boolean zM119865g = c37440c.getIsEnabled();
            boolean zM87157i = ((i15 & 896) == 256) | c28655q.m87157i(c37440c);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C35015q(27, function1, c37440c);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3362g = AbstractC1092a.m3362g(c2314t, zM119865g, null, null, (InterfaceC4339a) objM87133R, 14);
            float f13 = 8;
            Modifier modifierMo3471e = AbstractC15680h.m44112a(AbstractC1099a.m3394p(2 * f13, modifierM3362g), c37440c.getIsEnabled()).mo3471e(modifier4);
            C2306l c2306l = C2299e.f9108K;
            C22949e c22949e = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            String strM119864f = c37440c.getTitle();
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 1 * f13, 0.0f, 11);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            C2886a c2886aM8420a = c38072d.m121952e(c28655q, i17).getB1();
            if (c37440c.getIsEnabled()) {
                white30 = AbstractC25012a.m73366B(c28655q, 1199064334, c38072d, c28655q, i17);
                z4 = false;
            } else {
                z4 = false;
                c28655q.m87150e0(1199065419);
                white30 = c38072d.m121949b(c28655q, i17).getWhite30();
            }
            c28655q.m87173q(z4);
            boolean z14 = z4;
            Modifier modifier5 = modifier4;
            AbstractC30795n.m94707h(strM119864f, modifierM3398t, white30, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q, 48, C2886a.f11498d << 18, 196600);
            c28655q = c28655q;
            List<C17750h1> listM119863e = c37440c.m119863e();
            if (listM119863e == null) {
                c28655q.m87150e0(-1483621285);
                c28655q.m87173q(z14);
                z13 = true;
            } else {
                c28655q.m87150e0(-1483621284);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                float f14 = 1.0f;
                if (1.0f > Float.MAX_VALUE) {
                    f14 = Float.MAX_VALUE;
                }
                z13 = true;
                m119900m(new LayoutWeightElement(f14, true), listM119863e, c37440c.getIsEnabled(), c28655q, 0, 0);
                c28655q = c28655q;
                c28655q.m87173q(z14);
            }
            c28655q.m87173q(z13);
            EnumC16313m0 enumC16313m0M119862d = c37440c.getRightIcon();
            if (enumC16313m0M119862d == null) {
                c28655q.m87150e0(258646996);
                c28655q.m87173q(z14);
            } else {
                C27430e c27430eM53378s = AbstractC18489d0.m53378s(c28655q, 258646997, enumC16313m0M119862d, c28655q, 6);
                if (c37440c.getIsEnabled()) {
                    white31 = AbstractC25012a.m73366B(c28655q, -349640098, c38072d, c28655q, i17);
                } else {
                    c28655q.m87150e0(-349639013);
                    white31 = c38072d.m121949b(c28655q, i17).getWhite30();
                }
                c28655q.m87173q(z14);
                AbstractC15005f3.m43108b(c27430eM53378s, null, AbstractC1102d.m3419p(5 * 4, c2314t), white31, c28655q, 432, 0);
                c28655q.m87173q(z14);
            }
            c28655q.m87173q(z13);
            modifier3 = modifier5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35608d(modifier3, c37440c, function1, i13, i14, 26);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m119895h(Function1 function1, C37440c c37440c) {
        function1.invoke(new AbstractC37442d.d(c37440c.getTitle()));
        AnalyticEventModel analyticEventModelM119860b = c37440c.getAnalyticEvent();
        if (analyticEventModelM119860b != null) {
            function1.invoke(new AbstractC37442d.b(analyticEventModelM119860b));
        }
        if (c37440c.getAction() != null) {
            function1.invoke(new AbstractC37442d.a(c37440c.getAction()));
        } else if (c37440c.getDestination() != null) {
            function1.invoke(new AbstractC37442d.c(c37440c.getDestination()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m119896i(Modifier modifier, C37440c c37440c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m119894g(modifier, c37440c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    public static final void m119897j(Modifier modifier, C37448g viewState, Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        int i16;
        Modifier modifier3;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2082065377);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            if (i17 != 0) {
                int i18 = i15;
                modifier3 = C2314t.f9131w;
                i16 = i18;
            } else {
                i16 = i15;
                modifier3 = modifier2;
            }
            AbstractC31926e.m99375j(modifier3, null, 0L, null, null, null, 0.0f, AbstractC37817c.m121344e(-1767428239, c28655q, new C29451o(23, viewState, onViewEvent)), c28655q, (i16 & 14) | 12582912, 126);
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35608d(modifier2, viewState, onViewEvent, i13, i14, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m119898k(C37448g c37448g, Function1 function1, Composer composer, int i13) {
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
            c28655q.m87150e0(-759092429);
            int i14 = 0;
            for (Object obj : c37448g.m119922a()) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                m119894g(null, (C37440c) obj, function1, c28655q, 0, 1);
                if (i14 < AbstractC37056f.m118951C(c37448g.m119922a())) {
                    c28655q.m87150e0(856758486);
                    AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 2 * 8, 0.0f, 2), null, null, null, null, 0L, 0L, null, c28655q, 6, 254);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(856861313);
                    c28655q.m87173q(false);
                }
                c2314t = c2314t;
                i14 = i15;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m119899l(Modifier modifier, C37448g c37448g, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m119897j(modifier, c37448g, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    private static final void m119900m(Modifier modifier, List<C17750h1> list, boolean z4, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(634555944);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(list) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            if (i17 != 0) {
                z4 = true;
            }
            Modifier modifierM44112a = AbstractC15680h.m44112a(modifier, z4);
            C22949e c22949e = AbstractC22977m.f90650a;
            float f13 = ((float) 0.5d) * 8;
            AbstractC22960g2.m66729a(modifierM44112a, AbstractC22977m.m66747j(f13, C2299e.f9112O), AbstractC22977m.m66746i(f13), null, 0, 0, AbstractC37817c.m121344e(-1191708253, c28655q, new C13193b(list, 6)), c28655q, 1573296, 56);
        } else {
            c28655q.m87138X();
        }
        Modifier modifier2 = modifier;
        boolean z13 = z4;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32676t1(modifier2, list, z13, i13, i14, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m119901n(List list, InterfaceC22996s0 FlowRow, Composer composer, int i13) {
        AbstractC22676k.m65750j(FlowRow, "$this$FlowRow");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC17746g1.m50872h((C17750h1) it.next(), null, null, c28655q, C17750h1.f69012w, 6);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m119902o(Modifier modifier, List list, boolean z4, int i13, int i14, Composer composer, int i15) {
        m119900m(modifier, list, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
