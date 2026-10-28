package a80;

import a20.C0167g;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import java.util.Iterator;
import java.util.WeakHashMap;
import l83.C23454a0;
import ny0.AbstractC27249e;
import ny0.C27256h;
import p000.AbstractC11266d;
import p000.C22079k;
import p000.C22931l;
import p000.C27314o;
import p000.C28503p;
import p005a3.C0209i;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p040c0.AbstractC3788w0;
import p127ev.AbstractC13673n;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
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
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import u70.AbstractC34561a;
import wb3.AbstractC37056f;
import x81.C38072d;
import y70.C39267c;
import y70.InterfaceC39265a;

/* JADX INFO: renamed from: a80.l */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Ly70/c$d;", "viewState", "Lkotlin/Function1;", "Ly70/a;", "Ll83/a0;", "onEvent", "j", "(Ly70/c$d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lm91/u;", "item", "", "r", "(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC0548l {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static final void m1348j(C39267c.d viewState, Function1 onEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        int i15;
        Object obj;
        boolean z4;
        boolean z13;
        int i16;
        int i17;
        Object obj2;
        boolean z14;
        int i18;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1255240492);
        int i19 = (i13 & 6) == 0 ? i13 | (c28655q2.m87157i(viewState) ? 4 : 2) : i13;
        if ((i13 & 48) == 0) {
            i19 |= c28655q2.m87157i(onEvent) ? 32 : 16;
        }
        if (c28655q2.m87135U(i19 & 1, (i19 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, c2314t), C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBackgroundDarkAlt(), AbstractC17918w0.f69621a);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3358c);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(interfaceC4339a);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3407d);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(interfaceC4339a);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            float f13 = 8;
            float f14 = 2 * f13;
            int i24 = i19;
            C22976l1 c22976l1M3381c = AbstractC1099a.m3381c(0.0f, 0.0f, 0.0f, f14, 7);
            int i25 = i24 & 112;
            boolean zM87157i = c28655q2.m87157i(viewState) | (i25 == 32);
            Object objM87133R = c28655q2.m87133R();
            Object obj3 = C28635l.f115821a;
            if (zM87157i || objM87133R == obj3) {
                objM87133R = new C0167g(2, viewState, onEvent);
                c28655q2.m87172p0(objM87133R);
            }
            C28655q c28655q3 = c28655q2;
            int i26 = i25;
            Object obj4 = obj3;
            AbstractC22674j.m65717c(layoutWeightElement, null, c22976l1M3381c, null, c2305k, null, false, null, (Function1) objM87133R, c28655q3, 196992, 474);
            if (viewState.m125104e().isEmpty()) {
                i15 = i26;
                obj = obj4;
                z4 = false;
                z13 = true;
                i16 = 32;
                c28655q3.m87150e0(-1615402390);
                c28655q3.m87173q(false);
            } else {
                c28655q3.m87150e0(-1616936580);
                WeakHashMap weakHashMap = C22944c2.f90553v;
                float f15 = ((float) 2.5d) * f13;
                Modifier modifierM3397s = AbstractC1099a.m3397s(AbstractC1102d.m3409f(1.0f, c2314t), f15, 4 * f13, f15, AbstractC22953f.m66717e(C22949e.m66712e(c28655q3).f90558e, c28655q3).mo43109a() + f14);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), C2299e.f9111N, c28655q3, 54);
                int iHashCode3 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q3.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q3, modifierM3397s);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(interfaceC4339a);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N3);
                c28655q3.m87150e0(102633326);
                for (InterfaceC25312u interfaceC25312u : viewState.m125104e()) {
                    if (interfaceC25312u instanceof C27256h) {
                        c28655q3.m87150e0(319279692);
                        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                        C27256h c27256h = (C27256h) interfaceC25312u;
                        i17 = i26;
                        boolean zM87157i2 = c28655q3.m87157i(interfaceC25312u) | (i17 == 32);
                        Object objM87133R2 = c28655q3.m87133R();
                        obj2 = obj4;
                        if (zM87157i2 || objM87133R2 == obj2) {
                            i18 = 0;
                            objM87133R2 = new C0545i(onEvent, c27256h, i18);
                            c28655q3.m87172p0(objM87133R2);
                        } else {
                            i18 = 0;
                        }
                        AbstractC27249e.m82121d(modifierM3409f, c27256h, null, (InterfaceC4339a) objM87133R2, c28655q3, 6, 4);
                        c28655q3.m87173q(i18);
                    } else {
                        i17 = i26;
                        obj2 = obj4;
                        c28655q3.m87150e0(319651847);
                        boolean zM87157i3 = c28655q3.m87157i(interfaceC25312u) | (i17 == 32);
                        Object objM87133R3 = c28655q3.m87133R();
                        if (zM87157i3 || objM87133R3 == obj2) {
                            z14 = false;
                            objM87133R3 = new C0546j(onEvent, interfaceC25312u, (int) (false ? 1 : 0));
                            c28655q3.m87172p0(objM87133R3);
                        } else {
                            z14 = false;
                        }
                        AbstractC25303l.m74291r(interfaceC25312u, null, null, (Function1) objM87133R3, c28655q3, 0, 6);
                        c28655q3.m87173q(z14);
                    }
                    i26 = i17;
                    obj4 = obj2;
                }
                i15 = i26;
                obj = obj4;
                z4 = false;
                z13 = true;
                i16 = 32;
                AbstractC25012a.m73392y(c28655q3, false, true, false);
            }
            c28655q3.m87173q(z13);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, z4);
            int iHashCode4 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q3.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q3, modifierM3409f2);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a2 = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a2);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m4);
            C0209i c0209i5 = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode4))) {
                AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i5);
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N4);
            AbstractC6721d.a aVar = new AbstractC6721d.a(AbstractC8693b.m21278l(""), null, AbstractC13673n.m38561h(C38072d.f163053a), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
            Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC1102d.m3409f(1.0f, c2314t));
            boolean z15 = i15 == i16 ? z13 : z4;
            Object objM87133R4 = c28655q3.m87133R();
            if (z15 || objM87133R4 == obj) {
                i14 = 3;
                objM87133R4 = new C27314o(onEvent, i14);
                c28655q3.m87172p0(objM87133R4);
            } else {
                i14 = 3;
            }
            boolean z16 = z13;
            AbstractC6719b.m20143d(modifierM66724m, aVar, null, (InterfaceC4339a) objM87133R4, null, null, c28655q3, AbstractC6721d.a.f25641r << 3, 52);
            c28655q3.m87173q(z16);
            AbstractC1090b.m3351f(viewState.getDisplayRefreshingAnimation(), null, AbstractC3788w0.m11577e(null, i14), AbstractC3788w0.m11578f(null, i14), null, C0538b.f1862a.m1315c(), c28655q3, 200064, 18);
            c28655q3.m87173q(z16);
            c28655q = c28655q3;
        } else {
            onEvent = onEvent;
            C28655q c28655q4 = c28655q2;
            i14 = 3;
            c28655q4.m87138X();
            c28655q = c28655q4;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22079k(viewState, onEvent, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m1349k(C39267c.d dVar, Function1 function1, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        Iterator<T> it = dVar.m125103d().iterator();
        while (it.hasNext()) {
            InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C22931l(2, (C39267c.a) it.next(), function1), true, 754831082), 3);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m1350l(C39267c.a aVar, Function1 function1, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            for (InterfaceC25312u interfaceC25312u : aVar.m125085a()) {
                boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(interfaceC25312u);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    objM87133R = new C0546j(function1, interfaceC25312u, 1);
                    c28655q.m87172p0(objM87133R);
                }
                m1356r(interfaceC25312u, (Function1) objM87133R, c28655q, 0, 0);
                AbstractC11266d.m30469w(2, 8, C2314t.f9131w, c28655q);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m1351m(Function1 function1, InterfaceC25312u interfaceC25312u, Object event) {
        AbstractC22676k.m65750j(event, "event");
        function1.invoke(new InterfaceC39265a.i(event, interfaceC25312u));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m1352n(Function1 function1, InterfaceC25312u interfaceC25312u) {
        function1.invoke(new InterfaceC39265a.i(interfaceC25312u, interfaceC25312u));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m1353o(Function1 function1, InterfaceC25312u interfaceC25312u, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC39265a.i(it, interfaceC25312u));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m1354p(Function1 function1) {
        function1.invoke(InterfaceC39265a.h.f168843a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m1355q(C39267c.d dVar, Function1 function1, int i13, Composer composer, int i14) {
        m1348j(dVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    public static final void m1356r(InterfaceC25312u item, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        Function1 function3;
        AbstractC22676k.m65750j(item, "item");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-229588740);
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
                    objM87133R = new C28503p(9);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            int i17 = i15;
            AbstractC25303l.m74291r(item, AbstractC34561a.m109278b(), null, function3, c28655q, (i17 & 14) | (C25307p.f99300b << 3) | ((i17 << 6) & 7168), 4);
            function2 = function3;
        } else {
            c28655q.m87138X();
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0547k(item, function2, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m1357s(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m1358t(InterfaceC25312u interfaceC25312u, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m1356r(interfaceC25312u, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
