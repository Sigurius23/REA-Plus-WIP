package so2;

import a80.C0546j;
import a80.C0547k;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import io2.AbstractC20770l;
import java.util.Iterator;
import java.util.WeakHashMap;
import l83.C23454a0;
import oq1.C28119c;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22944c2;
import p291l0.C22949e;
import p291l0.C22957g;
import p291l0.C22976l1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p555vl.AbstractC36095b;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import p734sl0.C32618h3;
import po2.C29404c;
import po2.InterfaceC29402a;
import sg2.C32458i;
import sg2.C32469t;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: so2.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lpo2/c$c;", "viewState", "Lkotlin/Function1;", "Lpo2/a;", "Ll83/a0;", "onEvent", "i", "(Lpo2/c$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lm91/u;", "item", "", "p", "(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "universal-checkout_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32849g {
    /* JADX INFO: renamed from: i */
    public static final void m103107i(C29404c.c viewState, Function1 onEvent, Composer composer, int i13) {
        int i14;
        boolean z4;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(450095301);
        int i15 = 2;
        int i16 = (i13 & 6) == 0 ? i13 | (c28655q.m87157i(viewState) ? 4 : 2) : i13;
        if ((i13 & 48) == 0) {
            i16 |= c28655q.m87157i(onEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i16 & 1, (i16 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM114675c = AbstractC36095b.m114675c(c2314t, 1.0f);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM114675c);
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
            AbstractC6721d.a aVar = new AbstractC6721d.a(viewState.getTitle(), null, viewState.getShowBackButton() ? AbstractC13673n.m38561h(C38072d.f163053a) : null, null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
            float f13 = 8;
            float f14 = 2 * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13);
            int i17 = i16 & 112;
            boolean z13 = i17 == 32;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z13 || objM87133R == c28676v0) {
                objM87133R = new C32458i(onEvent, i15);
                c28655q.m87172p0(objM87133R);
            }
            int i18 = 3;
            AbstractC6719b.m20143d(modifierM3398t, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
            C22976l1 c22976l1M3381c = AbstractC1099a.m3381c(0.0f, 0.0f, 0.0f, 3 * f13, 7);
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM31988g = AbstractC11895b.m31988g(modifierM3396r, true, 1.0f);
            boolean zM87157i = c28655q.m87157i(viewState) | (i17 == 32);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C32469t(i18, viewState, onEvent);
                c28655q.m87172p0(objM87133R2);
            }
            c28655q = c28655q;
            C28676v0 c28676v1 = c28676v0;
            AbstractC22674j.m65717c(modifierM31988g, null, c22976l1M3381c, null, c2305k, null, false, null, (Function1) objM87133R2, c28655q, 196992, 474);
            if (viewState.m89673e().isEmpty()) {
                i14 = 0;
                z4 = true;
                c28655q.m87150e0(1877540327);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1876822150);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                WeakHashMap weakHashMap = C22944c2.f90553v;
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(modifierM3409f, 0.0f, 0.0f, 0.0f, AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a(), 7);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), C2299e.f9111N, c28655q, 54);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                c28655q.m87150e0(1383870423);
                for (InterfaceC25312u interfaceC25312u : viewState.m89673e()) {
                    boolean zM87157i2 = c28655q.m87157i(interfaceC25312u) | (i17 == 32);
                    Object objM87133R3 = c28655q.m87133R();
                    C28676v0 c28676v2 = c28676v1;
                    if (zM87157i2 || objM87133R3 == c28676v2) {
                        objM87133R3 = new C0546j(onEvent, interfaceC25312u, 27);
                        c28655q.m87172p0(objM87133R3);
                    }
                    m103114p(interfaceC25312u, (Function1) objM87133R3, c28655q, 0, 0);
                    c28676v1 = c28676v2;
                }
                i14 = 0;
                z4 = true;
                AbstractC25012a.m73392y(c28655q, false, true, false);
            }
            c28655q.m87173q(z4);
        } else {
            i14 = 0;
            onEvent = onEvent;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32848f(viewState, onEvent, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m103108j(Function1 function1) {
        function1.invoke(InterfaceC29402a.m.f119335a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m103109k(C29404c.c cVar, Function1 function1, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        Iterator<T> it = cVar.m89671c().iterator();
        while (it.hasNext()) {
            InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C28119c(14, (C29404c.a) it.next(), function1), true, 295194857), 3);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m103110l(C29404c.a aVar, Function1 function1, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            c28655q.m87150e0(214417704);
            for (InterfaceC25312u interfaceC25312u : aVar.m89664b()) {
                boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(interfaceC25312u);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    objM87133R = new C0546j(function1, interfaceC25312u, 28);
                    c28655q.m87172p0(objM87133R);
                }
                m103114p(interfaceC25312u, (Function1) objM87133R, c28655q, 0, 0);
            }
            c28655q.m87173q(false);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(aVar.getInsetBottom().getSpacing(), C2314t.f9131w));
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m103111m(Function1 function1, InterfaceC25312u interfaceC25312u, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC29402a.o(it, interfaceC25312u));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m103112n(Function1 function1, InterfaceC25312u interfaceC25312u, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC29402a.o(it, interfaceC25312u));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m103113o(C29404c.c cVar, Function1 function1, int i13, Composer composer, int i14) {
        m103107i(cVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    public static final void m103114p(InterfaceC25312u item, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        Function1 function3;
        AbstractC22676k.m65750j(item, "item");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1616465343);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(item) ? 4 : 2) | i13;
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
                    objM87133R = new C32618h3(17);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            int i17 = i15;
            AbstractC25303l.m74291r(item, AbstractC20770l.m57196c(), null, function3, c28655q, (i17 & 14) | (C25307p.f99300b << 3) | ((i17 << 6) & 7168), 4);
            function2 = function3;
        } else {
            c28655q.m87138X();
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0547k(item, function2, i13, i14, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m103115q(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m103116r(InterfaceC25312u interfaceC25312u, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m103114p(interfaceC25312u, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
