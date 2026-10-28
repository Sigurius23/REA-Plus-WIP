package zq0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.models.GenericInteraction;
import cw2.C11161b;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import java.util.Iterator;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import nw0.C27198e;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p043c4.AbstractC3975r;
import p043c4.C3966j0;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p292l1.AbstractC23164r1;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import vy0.AbstractC36568c0;
import vy0.AbstractC36597y;
import vy0.C36566b0;
import vy0.C36570d0;
import wb3.AbstractC37056f;
import x81.C38072d;
import yf1.C39516e;
import z51.C40103n;

/* JADX INFO: renamed from: zq0.x */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010²\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lzq0/y;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "i", "(Landroidx/compose/ui/Modifier;Lzq0/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lzq0/y$a;", "button", "l", "(Lzq0/y$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "expanded", "community-everyday-stats_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40983x {
    /* JADX INFO: renamed from: i */
    public static final void m133079i(Modifier modifier, C40984y viewState, Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function1;
        Modifier modifier3;
        C2314t c2314t;
        Modifier modifierM3362g;
        C0209i c0209i;
        C0209i c0209i2;
        C0213j c0213j;
        C0209i c0209i3;
        boolean z4;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1393045062);
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
            i15 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        int i17 = i15;
        if (c28655q.m87135U(i17 & 1, (i17 & 147) != 146)) {
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t2 : modifier2;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
            C2306l c2306l = C2299e.f9108K;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i4 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i4, c22994r1M66759a);
            C0209i c0209i5 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m);
            C0209i c0209i6 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i6);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N);
            float f13 = 4;
            Modifier modifierM118994r = AbstractC37056f.m118994r(c2314t2, AbstractC33253j.m105489e(6 * f13));
            C38072d c38072d = C38072d.f163053a;
            int i18 = C38072d.f163054b;
            Modifier modifier5 = modifier4;
            Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM118994r, c38072d.m121949b(c28655q, i18).getWhite10(), AbstractC17918w0.f69621a);
            GenericInteraction genericInteractionM133091a = viewState.getAction();
            if (genericInteractionM133091a == null) {
                c28655q.m87150e0(-1608803621);
                c28655q.m87173q(false);
                modifierM3362g = null;
                c2314t = c2314t2;
            } else {
                c28655q.m87150e0(-1608803620);
                boolean zM87157i = ((i17 & 896) == 256) | c28655q.m87157i(genericInteractionM133091a);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new C11161b(onViewEvent, genericInteractionM133091a, 10);
                    c28655q.m87172p0(objM87133R);
                }
                c2314t = c2314t2;
                modifierM3362g = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15);
                c28655q.m87173q(false);
            }
            Modifier modifier6 = modifierM3362g;
            if (modifier6 == null) {
                modifier6 = c2314t;
            }
            Modifier modifierMo3471e = modifierM3358c.mo3471e(modifier6);
            float f14 = 8;
            float f15 = ((float) 0.5d) * f14;
            Modifier modifierM3397s = AbstractC1099a.m3397s(modifierMo3471e, f15, f15, ((float) 1.5d) * f14, f15);
            C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q(1, f14, c2306l, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3397s);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, c22994r1M53376q);
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N2);
            AbstractC22403o abstractC22403oM133092b = viewState.getAvatar();
            if (abstractC22403oM133092b == null) {
                c28655q.m87150e0(-1882510800);
                c28655q.m87173q(false);
                c0209i = c0209i5;
                c0209i3 = c0209i7;
                c0209i2 = c0209i6;
                c0213j = c0213j2;
                z4 = false;
            } else {
                c28655q.m87150e0(-1882510799);
                c0209i = c0209i5;
                C2314t c2314t3 = c2314t;
                c0209i2 = c0209i6;
                c0213j = c0213j2;
                c0209i3 = c0209i7;
                c2314t = c2314t3;
                z4 = false;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM133092b, null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC37056f.m118994r(AbstractC1102d.m3419p(f14 * f13, c2314t3), AbstractC33253j.f138651a), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            TextResource textResourceM133093c = viewState.getTitle();
            int i19 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM133093c, c28655q, i19);
            C2886a c2886aM8421b = r46.m121952e(c28655q, r25).getB2();
            long jM125430y = r46.m121949b(c28655q, r25).getBrandWhite();
            int i24 = C2886a.f11498d << 18;
            C28655q c28655q2 = c28655q;
            boolean z13 = z4;
            C2314t c2314t4 = c2314t;
            C0209i c0209i8 = c0209i;
            AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8421b, null, c28655q2, 0, i24, 196602);
            c28655q = c28655q2;
            TextResource textResourceM133094d = viewState.getSubtitle();
            if (textResourceM133094d == null) {
                c28655q.m87150e0(-1881937176);
                c28655q.m87173q(z13);
            } else {
                c28655q.m87150e0(-1881937175);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM133094d, c28655q, i19), null, r46.m121949b(c28655q, r25).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r46.m121952e(c28655q, r25).getB3(), null, c28655q, 0, i24, 196602);
                c28655q = c28655q;
                c28655q.m87173q(z13);
            }
            if (viewState.getAction() != null) {
                c28655q.m87150e0(-1881641962);
                AbstractC23164r1.m67133b(AbstractC34132o.m107874S(EnumC16313m0.CARET_FORWARD.toWhoopIcon(), c28655q, 6), null, AbstractC1102d.m3419p(3 * f13, c2314t4), c38072d.m121949b(c28655q, i18).getWhite50(), c28655q, 432, 0);
                c28655q.m87173q(z13);
            } else {
                c28655q.m87150e0(-1881353228);
                c28655q.m87173q(z13);
            }
            c28655q.m87173q(true);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(1.0f, true));
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f15), c2306l, c28655q, 54);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q, c0209i3, modifierM118962N3);
            c28655q.m87150e0(818507903);
            Iterator<T> it = viewState.m133095e().iterator();
            while (it.hasNext()) {
                m133082l((C40984y.a) it.next(), onViewEvent, c28655q, GenericInteraction.$stable | C36570d0.f156622b | ((i17 >> 3) & 112));
            }
            function1 = onViewEvent;
            AbstractC25012a.m73392y(c28655q, z13, true, true);
            modifier3 = modifier5;
        } else {
            function1 = onViewEvent;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40103n(modifier3, viewState, function1, i13, i14, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m133080j(Function1 function1, GenericInteraction genericInteraction) {
        function1.invoke(genericInteraction);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m133081k(Modifier modifier, C40984y c40984y, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m133079i(modifier, c40984y, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    private static final void m133082l(C40984y.a aVar, Function1 function1, Composer composer, int i13) {
        int i14;
        Object c27198e;
        C36570d0 c36570d0;
        InterfaceC28601c1 interfaceC28601c1;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2039513797);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(aVar) : c28655q.m87157i(aVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C36570d0 c36570d0M133098c = aVar.getMenu();
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
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
            C27270o c27270o = new C27270o(AbstractC27274q.a.f109136f, aVar.getIcon(), null, null, null, false, false, false, 0.0f, false, 1020, null);
            boolean zM87157i = ((i14 & 14) == 4 || ((i14 & 8) != 0 && c28655q.m87157i(aVar))) | ((i14 & 112) == 32) | c28655q.m87157i(c36570d0M133098c);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                c36570d0 = c36570d0M133098c;
                interfaceC28601c1 = interfaceC28601c2;
                c27198e = new C27198e((Object) c36570d0, function1, (Object) aVar, (Object) interfaceC28601c1, 29);
                c28655q.m87172p0(c27198e);
            } else {
                c27198e = objM87133R2;
                c36570d0 = c36570d0M133098c;
                interfaceC28601c1 = interfaceC28601c2;
            }
            boolean z4 = true;
            AbstractC27242b1.m82092d(c27270o, "", null, null, (InterfaceC4339a) c27198e, c28655q, C27270o.f109105k | 48, 12);
            if (c36570d0 == null || !m133083m(interfaceC28601c1)) {
                c28655q.m87150e0(-287486623);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-288067067);
                C40964e0 c40964e0 = C40964e0.f176770w;
                Object objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C40982w(0, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC3975r.m12004a(c40964e0, (InterfaceC4339a) objM87133R3, new C3966j0(z4, 14), AbstractC37817c.m121344e(818720186, c28655q, new C36566b0(c36570d0, function1, interfaceC28601c1, 1)), c28655q, 3510, 0);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C39516e(aVar, function1, i13, 25);
        }
    }

    /* JADX INFO: renamed from: m */
    private static final boolean m133083m(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: n */
    private static final void m133084n(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m133085o(C36570d0 c36570d0, Function1 function1, C40984y.a aVar, InterfaceC28601c1 interfaceC28601c1) {
        if (c36570d0 != null) {
            m133084n(interfaceC28601c1, !m133083m(interfaceC28601c1));
        } else {
            function1.invoke(aVar.getAction());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m133086p(InterfaceC28601c1 interfaceC28601c1) {
        m133084n(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m133087q(C36570d0 c36570d0, Function1 function1, InterfaceC28601c1 interfaceC28601c1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C40982w(1, interfaceC28601c1);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new C40967h(function1, 4);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC36568c0.m117321z(c36570d0, null, interfaceC4339a, (Function1) objM87133R2, c28655q, C36570d0.f156622b | 384, 2);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m133088r(InterfaceC28601c1 interfaceC28601c1) {
        m133084n(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m133089s(Function1 function1, AbstractC36597y event) {
        AbstractC22676k.m65750j(event, "event");
        if (!(event instanceof AbstractC36597y.a)) {
            throw new NoWhenBranchMatchedException();
        }
        function1.invoke(((AbstractC36597y.a) event).getInteraction());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m133090t(C40984y.a aVar, Function1 function1, int i13, Composer composer, int i14) {
        m133082l(aVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
