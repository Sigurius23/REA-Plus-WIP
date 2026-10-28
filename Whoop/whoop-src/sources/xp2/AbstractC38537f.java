package xp2;

import a80.C0547k;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
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
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p040c0.AbstractC3788w0;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22944c2;
import p291l0.C22949e;
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
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import rp2.AbstractC31641a;
import uf0.C34905f;
import v90.C35813e;
import vp2.C36276c;
import vp2.InterfaceC36274a;
import vv2.C36538d;
import w01.C36681f;
import wb3.AbstractC37056f;
import wr0.C37550r;
import x30.C37900j1;
import x81.C38072d;
import xl0.C38448b;

/* JADX INFO: renamed from: xp2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lvp2/c$c;", "viewState", "Lkotlin/Function1;", "Lvp2/a;", "Ll83/a0;", "onEvent", "j", "(Lvp2/c$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lm91/u;", "item", "", "r", "(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "universal-checkout_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38537f {
    /* JADX WARN: Code duplicated, block: B:100:0x031a  */
    /* JADX WARN: Code duplicated, block: B:101:0x031c  */
    /* JADX WARN: Code duplicated, block: B:107:0x032d  */
    /* JADX WARN: Code duplicated, block: B:111:0x034e  */
    /* JADX WARN: Code duplicated, block: B:73:0x022c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0274  */
    /* JADX WARN: Code duplicated, block: B:76:0x027a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0297  */
    /* JADX WARN: Code duplicated, block: B:85:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:87:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:89:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:90:0x02da  */
    /* JADX WARN: Code duplicated, block: B:96:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:98:0x0307  */
    /* JADX INFO: renamed from: j */
    public static final void m123466j(C36276c.c viewState, Function1 onEvent, Composer composer, int i13) {
        C28676v0 c28676v0;
        int i14;
        C28676v0 c28676v1;
        boolean z4;
        int iHashCode;
        int i15;
        C28676v0 c28676v2;
        boolean z13;
        boolean zM87157i;
        Object objM87133R;
        boolean z14;
        boolean z15;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-436133652);
        int i16 = (i13 & 6) == 0 ? i13 | (c28655q.m87157i(viewState) ? 4 : 2) : i13;
        if ((i13 & 48) == 0) {
            i16 |= c28655q.m87157i(onEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i16 & 1, (i16 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM114675c = AbstractC36095b.m114675c(c2314t, 1.0f);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
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
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            AbstractC6721d.a aVar = new AbstractC6721d.a(viewState.getDisplayRefreshingAnimation() ? AbstractC8693b.m21267a() : viewState.getToolbarTitle(), null, AbstractC13673n.m38561h(C38072d.f163053a), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
            float f13 = 8;
            float f14 = 2 * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13);
            int i17 = i16 & 112;
            boolean z16 = i17 == 32;
            Object objM87133R3 = c28655q.m87133R();
            C28676v0 c28676v3 = C28635l.f115821a;
            if (z16 || objM87133R3 == c28676v3) {
                objM87133R3 = new C36681f(onEvent, 23);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC6719b.m20143d(modifierM3398t, aVar, null, (InterfaceC4339a) objM87133R3, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
            AbstractC1090b.m3351f(viewState.getDisplayRefreshingAnimation(), null, AbstractC3788w0.m11577e(null, 3), AbstractC3788w0.m11578f(null, 3), "Loading Animation", C38533b.f165838a.m123437c(), c28655q, 224640, 2);
            c28655q.m87173q(true);
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM31988g = AbstractC11895b.m31988g(modifierM3396r, true, 1.0f);
            C22976l1 c22976l1M3381c = AbstractC1099a.m3381c(0.0f, 0.0f, 0.0f, f14, 7);
            C2305k c2305k = C2299e.f9111N;
            boolean zM87157i2 = c28655q.m87157i(viewState) | (i17 == 32);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i2) {
                c28676v0 = c28676v3;
            } else {
                c28676v0 = c28676v3;
                if (objM87133R4 == c28676v0) {
                }
                i14 = i17;
                c28676v1 = c28676v0;
                AbstractC22674j.m65717c(modifierM31988g, null, c22976l1M3381c, null, c2305k, null, false, null, (Function1) objM87133R4, c28655q, 196992, 474);
                c28655q = c28655q;
                if (viewState.m115962e().isEmpty()) {
                    z4 = true;
                    c28655q.m87150e0(1396606208);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1394798257);
                    WeakHashMap weakHashMap = C22944c2.f90553v;
                    float f15 = ((float) 2.5d) * f13;
                    Modifier modifierM3397s = AbstractC1099a.m3397s(AbstractC1102d.m3409f(1.0f, c2314t), f15, 4 * f13, f15, AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a() + f14);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), c2305k, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3397s);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                    c28655q.m87150e0(121372183);
                    for (InterfaceC25312u interfaceC25312u : viewState.m115962e()) {
                        if (interfaceC25312u instanceof C27256h) {
                            c28655q.m87150e0(38050738);
                            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                            C27256h c27256h = (C27256h) interfaceC25312u;
                            boolean zM87157i3 = c28655q.m87157i(viewState);
                            i15 = i14;
                            if (i15 == 32) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = zM87157i3 | z14;
                            objM87133R2 = c28655q.m87133R();
                            c28676v2 = c28676v1;
                            if (z15 || objM87133R2 == c28676v2) {
                                objM87133R2 = new C37550r(12, viewState, onEvent);
                                c28655q.m87172p0(objM87133R2);
                            }
                            C28655q c28655q2 = c28655q;
                            AbstractC27249e.m82121d(modifierM3409f2, c27256h, null, (InterfaceC4339a) objM87133R2, c28655q2, 6, 4);
                            c28655q = c28655q2;
                            c28655q.m87173q(false);
                        } else {
                            i15 = i14;
                            c28676v2 = c28676v1;
                            c28655q.m87150e0(38856304);
                            if (i15 == 32) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            zM87157i = c28655q.m87157i(interfaceC25312u) | z13;
                            objM87133R = c28655q.m87133R();
                            if (zM87157i || objM87133R == c28676v2) {
                                objM87133R = new C34905f(onEvent, interfaceC25312u, 2);
                                c28655q.m87172p0(objM87133R);
                            }
                            m123474r(interfaceC25312u, (Function1) objM87133R, c28655q, 0, 0);
                            c28655q.m87173q(false);
                        }
                        i14 = i15;
                        c28676v1 = c28676v2;
                    }
                    z4 = true;
                    AbstractC25012a.m73392y(c28655q, false, true, false);
                }
                c28655q.m87173q(z4);
            }
            objM87133R4 = new C37900j1(6, viewState, onEvent);
            c28655q.m87172p0(objM87133R4);
            i14 = i17;
            c28676v1 = c28676v0;
            AbstractC22674j.m65717c(modifierM31988g, null, c22976l1M3381c, null, c2305k, null, false, null, (Function1) objM87133R4, c28655q, 196992, 474);
            c28655q = c28655q;
            if (viewState.m115962e().isEmpty()) {
                c28655q.m87150e0(1394798257);
                WeakHashMap weakHashMap2 = C22944c2.f90553v;
                float f16 = ((float) 2.5d) * f13;
                Modifier modifierM3397s2 = AbstractC1099a.m3397s(AbstractC1102d.m3409f(1.0f, c2314t), f16, 4 * f13, f16, AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a() + f14);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), c2305k, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3397s2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
                c28655q.m87150e0(121372183);
                while (r1.hasNext()) {
                    if (interfaceC25312u instanceof C27256h) {
                        c28655q.m87150e0(38050738);
                        Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                        C27256h c27256h2 = (C27256h) interfaceC25312u;
                        boolean zM87157i4 = c28655q.m87157i(viewState);
                        i15 = i14;
                        if (i15 == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = zM87157i4 | z14;
                        objM87133R2 = c28655q.m87133R();
                        c28676v2 = c28676v1;
                        if (z15) {
                            objM87133R2 = new C37550r(12, viewState, onEvent);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C37550r(12, viewState, onEvent);
                            c28655q.m87172p0(objM87133R2);
                        }
                        C28655q c28655q3 = c28655q;
                        AbstractC27249e.m82121d(modifierM3409f3, c27256h2, null, (InterfaceC4339a) objM87133R2, c28655q3, 6, 4);
                        c28655q = c28655q3;
                        c28655q.m87173q(false);
                    } else {
                        i15 = i14;
                        c28676v2 = c28676v1;
                        c28655q.m87150e0(38856304);
                        if (i15 == 32) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        zM87157i = c28655q.m87157i(interfaceC25312u) | z13;
                        objM87133R = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R = new C34905f(onEvent, interfaceC25312u, 2);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C34905f(onEvent, interfaceC25312u, 2);
                            c28655q.m87172p0(objM87133R);
                        }
                        m123474r(interfaceC25312u, (Function1) objM87133R, c28655q, 0, 0);
                        c28655q.m87173q(false);
                    }
                    i14 = i15;
                    c28676v1 = c28676v2;
                }
                z4 = true;
                AbstractC25012a.m73392y(c28655q, false, true, false);
            } else {
                z4 = true;
                c28655q.m87150e0(1396606208);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z4);
        } else {
            viewState = viewState;
            onEvent = onEvent;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35813e(viewState, onEvent, i13, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m123467k(Function1 function1) {
        function1.invoke(InterfaceC36274a.e.f155439a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m123468l(C36276c.c cVar, Function1 function1, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        Iterator<T> it = cVar.m115960c().iterator();
        while (it.hasNext()) {
            InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C36538d(8, (C36276c.a) it.next(), function1), true, -591034096), 3);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m123469m(C36276c.a aVar, Function1 function1, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            for (InterfaceC25312u interfaceC25312u : aVar.m115953a()) {
                boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(interfaceC25312u);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    objM87133R = new C34905f(function1, interfaceC25312u, 3);
                    c28655q.m87172p0(objM87133R);
                }
                m123474r(interfaceC25312u, (Function1) objM87133R, c28655q, 0, 0);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m123470n(Function1 function1, InterfaceC25312u interfaceC25312u, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC36274a.f(it, interfaceC25312u));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m123471o(C36276c.c cVar, Function1 function1) {
        String strM115961d = cVar.getSelectedShippingMethodId();
        if (strM115961d != null) {
            function1.invoke(new InterfaceC36274a.k(cVar.getCartId(), strM115961d));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m123472p(Function1 function1, InterfaceC25312u interfaceC25312u, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC36274a.f(it, interfaceC25312u));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m123473q(C36276c.c cVar, Function1 function1, int i13, Composer composer, int i14) {
        m123466j(cVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    public static final void m123474r(InterfaceC25312u item, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        Function1 function3;
        AbstractC22676k.m65750j(item, "item");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(190831972);
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
                    objM87133R = new C38448b(4);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            int i17 = i15;
            AbstractC25303l.m74291r(item, AbstractC31641a.m97787b(), null, function3, c28655q, (i17 & 14) | (C25307p.f99300b << 3) | ((i17 << 6) & 7168), 4);
            function2 = function3;
        } else {
            c28655q.m87138X();
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0547k(item, function2, i13, i14, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m123475s(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m123476t(InterfaceC25312u interfaceC25312u, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m123474r(interfaceC25312u, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
