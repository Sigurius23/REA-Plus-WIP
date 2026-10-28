package sb2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import gb1.AbstractC15673b0;
import java.util.Iterator;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p705ea2.AbstractC12919p;
import p705ea2.AbstractC12922s;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pb2.AbstractC29058a;
import pf.AbstractC29125c;
import q81.C30047e;
import q83.AbstractC30060g;
import qb2.C30183b;
import qb2.InterfaceC30186e;
import qn0.C30515j;
import qz0.AbstractC30795n;
import vu1.AbstractC36517h;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: sb2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lqb2/e$b;", "viewState", "Lkotlin/Function1;", "Lpb2/a;", "Ll83/a0;", "onNavigationEvent", "c", "(Lqb2/e$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "settings_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32349c {
    /* JADX INFO: renamed from: c */
    public static final void m100691c(InterfaceC30186e.b viewState, Function1 onNavigationEvent, Composer composer, int i13) {
        int i14;
        Function1 function1;
        C0209i c0209i;
        C38072d c38072d;
        C2314t c2314t;
        C0213j c0213j;
        boolean z4;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(319182891);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onNavigationEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(AbstractC1102d.m3409f(1.0f, c2314t2));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44028b0);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            Modifier modifierM66723l = AbstractC22953f.m66723l(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t2), AbstractC30060g.m92099U(0, c28655q, 1), 14));
            C2305k c2305k = C2299e.f9111N;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 48);
            int i15 = i14;
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM66723l);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
            C38072d c38072d2 = C38072d.f163053a;
            AbstractC6721d.a aVar = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getHeader()), null, Integer.valueOf(AbstractC39383f.m125595a(c38072d2)), AbstractC8693b.m21273g(AbstractC36517h.f156122e, c28655q, 0), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            boolean z13 = (i15 & 112) == 32;
            Object objM87133R = c28655q.m87133R();
            if (z13 || objM87133R == C28635l.f115821a) {
                objM87133R = new C30515j(onNavigationEvent, 28);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(null, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
            float f13 = 8;
            float f14 = 2 * f13;
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t2, f14, 0.0f, 2);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q, 54);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
            float f15 = 3 * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t2, 0.0f, 5 * f13, 0.0f, f15, 5);
            C22971k c22971kM66746i = AbstractC22977m.m66746i(f14);
            C2305k c2305k2 = C2299e.f9110M;
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22971kM66746i, c2305k2, c28655q, 6);
            int iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m4);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N4);
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(new AbstractC22403o.a(AbstractC12919p.f44470d), null, null, c28655q, AbstractC22403o.a.f87639c, 3), AbstractC8693b.m21273g(AbstractC12922s.f44642z, c28655q, 0), AbstractC1102d.m3409f(1.0f, c2314t2), null, null, 0.0f, null, c28655q, 384, 120);
            C28655q c28655q2 = c28655q;
            if (viewState.getTitle() == null) {
                c28655q2.m87150e0(1604936116);
                c28655q2.m87173q(false);
                c38072d = c38072d2;
                z4 = false;
                c2314t = c2314t2;
                c0209i = c0209i4;
                c0213j = c0213j2;
            } else {
                c28655q2.m87150e0(1604936117);
                String strM92413e = viewState.getTitle();
                C2886a c2886aM8435p = c38072d2.m121952e(c28655q2, C38072d.f163054b).getH2();
                c0209i = c0209i4;
                c38072d = c38072d2;
                c2314t = c2314t2;
                c0213j = c0213j2;
                z4 = false;
                AbstractC30795n.m94707h(strM92413e, AbstractC1102d.m3409f(1.0f, c2314t2), AbstractC17918w0.m51517e(4292923545L), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8435p, null, c28655q2, 432, C2886a.f11498d << 18, 196088);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            }
            String strM92412d = viewState.getSubtitle();
            int i16 = C38072d.f163054b;
            C28655q c28655q3 = c28655q2;
            AbstractC30795n.m94707h(strM92412d, null, c38072d.m121949b(c28655q2, i16).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i16).getB1(), null, c28655q3, 0, C2886a.f11498d << 18, 196090);
            c28655q = c28655q3;
            c28655q.m87173q(true);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), c2305k2, c28655q, 6);
            int iHashCode5 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m5);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode5))) {
                AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N5);
            c28655q.m87150e0(-823858399);
            Iterator<C30183b> it = viewState.m92410b().iterator();
            while (it.hasNext()) {
                AbstractC32348b.m100686c(it.next(), viewState.getStyle().getPromotion(), onNavigationEvent, c28655q, (i15 << 3) & 896);
            }
            function1 = onNavigationEvent;
            AbstractC2875y.m8286B(c28655q, z4, true, true, true);
            c28655q.m87173q(true);
        } else {
            function1 = onNavigationEvent;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30047e(viewState, function1, i13, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m100692d(Function1 function1) {
        function1.invoke(AbstractC29058a.a.f117575a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m100693e(InterfaceC30186e.b bVar, Function1 function1, int i13, Composer composer, int i14) {
        m100691c(bVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
