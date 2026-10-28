package pp2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import cd0.C4435a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import gy0.AbstractC16276e;
import i91.AbstractC18249c;
import l83.C23454a0;
import ln2.AbstractC24541a;
import np2.C27036c;
import np2.InterfaceC27034a;
import nx1.C27225g;
import ny0.AbstractC27249e;
import ny0.C27256h;
import ny0.EnumC27254g;
import ny0.EnumC27272p;
import of2.C27900d;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p127ev.AbstractC13673n;
import p163g1.AbstractC14983d3;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.InterfaceC23001u;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p719m22.C24965t;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p736sz0.C33211q0;
import p736sz0.Function0;
import p745y81.EnumC39333f;
import pc3.C29096r;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: pp2.h */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\b\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\n\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\r\u001a\u00020\u0004*\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lnp2/c$c;", "viewState", "Lkotlin/Function1;", "Lnp2/a;", "Ll83/a0;", "onEvent", "q", "(Lnp2/c$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "n", "(Landroidx/compose/runtime/Composer;I)V", "v", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Ll0/u;", "k", "(Ll0/u;Lnp2/c$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "universal-checkout_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29444h {
    /* JADX INFO: renamed from: k */
    private static final void m89862k(InterfaceC23001u interfaceC23001u, C27036c.c cVar, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-461892119);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(interfaceC23001u) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(cVar) : c28655q.m87157i(cVar) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            c28655q.m87138X();
        } else if (cVar.getState().getType() instanceof AbstractC33208p0.b) {
            c28655q.m87150e0(847299517);
            boolean z4 = ((i14 & 896) == 256) | ((i14 & 112) == 32 || ((i14 & 64) != 0 && c28655q.m87157i(cVar)));
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C29442f(cVar, function1, 3);
                c28655q.m87172p0(objM87133R);
            }
            float f13 = 8;
            AbstractC14983d3.m43104a((InterfaceC4339a) objM87133R, AbstractC1099a.m3398t(interfaceC23001u.mo3400a(C2314t.f9131w, C2299e.f9114w), 1 * f13, 4 * f13, 0.0f, 0.0f, 12), false, C29437a.f119534a.m89819b(), c28655q, 24576, 12);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(847787705);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27225g(interfaceC23001u, cVar, function1, i13, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m89863l(C27036c.c cVar, Function1 function1) {
        InterfaceC27034a interfaceC27034aM81126a = cVar.getBackClickEvent();
        if (interfaceC27034aM81126a != null) {
            function1.invoke(interfaceC27034aM81126a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m89864m(InterfaceC23001u interfaceC23001u, C27036c.c cVar, Function1 function1, int i13, Composer composer, int i14) {
        m89862k(interfaceC23001u, cVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private static final void m89865n(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1613841403);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44028b0);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, c2314t), 6 * 8, 0.0f, 2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            float f13 = 4;
            Modifier modifierM3419p = AbstractC1102d.m3419p(92 * f13, c2314t);
            InterfaceC35689r0.d dVarM113128a = InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d));
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C29096r(15);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC35684p.m113047h(modifierM3419p, dVarM113128a, false, 0.0f, 0, (InterfaceC4339a) objM87133R, null, null, null, c28655q, 196614, 476);
            Modifier modifierM3392n = AbstractC1099a.m3392n(c2314t, 0.0f, (-24) * f13, 1);
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC24541a.f95791w);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            C2886a c2886aM8437r = c38072d.m121952e(c28655q, i14).getH4();
            long jM125430y = c38072d.m121949b(c28655q, i14).getBrandWhite();
            C36775k c36775k = new C36775k(3);
            int i15 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM92103Y, modifierM3392n, jM125430y, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, c2886aM8437r, null, c28655q, 48, i15, 196088);
            AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, AbstractC24541a.f95790v), AbstractC1099a.m3392n(c2314t, 0.0f, (-22) * f13, 1), AbstractC13673n.m38559f(c38072d, c28655q, i14, 0.7f), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getB2(), null, c28655q, 48, i15, 196088);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24965t(i13, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m89866o() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m89867p(int i13, Composer composer, int i14) {
        m89865n(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    public static final void m89868q(C27036c.c viewState, Function1 onEvent, Composer composer, int i13) {
        int i14;
        int i15;
        boolean z4;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1974313688);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
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
            if (AbstractC22676k.m65745e(viewState.getIsFormSubmissionLoading(), Boolean.TRUE)) {
                c28655q.m87150e0(589601908);
                m89865n(c28655q, 0);
                c28655q.m87173q(false);
            } else {
                if (viewState.getIsCustomSubmissionError()) {
                    c28655q.m87150e0(589604617);
                    m89873v(onEvent, c28655q, (i14 >> 3) & 14);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1097974726);
                    C33211q0 c33211q0M81129d = viewState.getState();
                    boolean z13 = c33211q0M81129d.getType() instanceof AbstractC33208p0.h;
                    C28676v0 c28676v0 = C28635l.f115821a;
                    if (z13) {
                        TextResource textResourceM114676d = AbstractC36095b.m114676d(c28655q, -678525539, c33211q0M81129d);
                        boolean z14 = ((i14 & 14) == 4 || ((i14 & 8) != 0 && c28655q.m87157i(viewState))) | ((i14 & 112) == 32);
                        Object objM87133R = c28655q.m87133R();
                        if (z14 || objM87133R == c28676v0) {
                            objM87133R = new C29442f(viewState, onEvent, 0);
                            c28655q.m87172p0(objM87133R);
                        }
                        i15 = i14;
                        z4 = false;
                        AbstractC33199m0.m105214F(new AbstractC33208p0.h(textResourceM114676d, 0L, (InterfaceC4339a) objM87133R, 2, null), c33211q0M81129d.getSupportText(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        i15 = i14;
                        z4 = false;
                        c28655q.m87150e0(-678129452);
                        C33211q0 c33211q0M81129d2 = viewState.getState();
                        int i16 = i15 & 14;
                        int i17 = i15 & 112;
                        boolean z15 = (i16 == 4 || ((i15 & 8) != 0 && c28655q.m87157i(viewState))) | (i17 == 32);
                        Object objM87133R2 = c28655q.m87133R();
                        if (z15 || objM87133R2 == c28676v0) {
                            objM87133R2 = new C29442f(viewState, onEvent, 1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                        boolean z16 = (i17 == 32) | (i16 == 4 || ((i15 & 8) != 0 && c28655q.m87157i(viewState)));
                        Object objM87133R3 = c28655q.m87133R();
                        if (z16 || objM87133R3 == c28676v0) {
                            objM87133R3 = new C29442f(viewState, onEvent, 2);
                            c28655q.m87172p0(objM87133R3);
                        }
                        Function0.m105274p(c33211q0M81129d2, interfaceC4339a, (InterfaceC4339a) objM87133R3, c28655q, C33211q0.f138501k, 0);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z4);
                }
                int i18 = i15 << 3;
                m89862k(C1100b.f4583a, viewState, onEvent, c28655q, (i18 & 896) | (i18 & 112) | 6);
                c28655q.m87173q(true);
            }
            i15 = i14;
            int i19 = i15 << 3;
            m89862k(C1100b.f4583a, viewState, onEvent, c28655q, (i19 & 896) | (i19 & 112) | 6);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27900d(viewState, onEvent, i13, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m89869r(C27036c.c cVar, Function1 function1) {
        InterfaceC27034a interfaceC27034aM81127b = cVar.getPrimaryClickEvent();
        if (interfaceC27034aM81127b != null) {
            function1.invoke(interfaceC27034aM81127b);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m89870s(C27036c.c cVar, Function1 function1) {
        InterfaceC27034a interfaceC27034aM81127b = cVar.getPrimaryClickEvent();
        if (interfaceC27034aM81127b != null) {
            function1.invoke(interfaceC27034aM81127b);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m89871t(C27036c.c cVar, Function1 function1) {
        InterfaceC27034a interfaceC27034aM81128c = cVar.getSecondaryClickEvent();
        if (interfaceC27034aM81128c != null) {
            function1.invoke(interfaceC27034aM81128c);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m89872u(C27036c.c cVar, Function1 function1, int i13, Composer composer, int i14) {
        m89868q(cVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v */
    private static final void m89873v(Function1 function1, Composer composer, int i13) {
        int i14;
        Function1 function2;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1852209880);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87157i(function1) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM3407d, c38072d.m121949b(c28655q2, i15).getBrandBlack(), AbstractC17918w0.f69621a);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3358c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
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
            float f13 = 8;
            float f14 = 6 * f13;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, c2314t), f14, 0.0f, 2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q2, 54);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3396r);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
            float f15 = 4;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getVarious().getAlertCircle(), c28655q2, 6), "Error", AbstractC1099a.m3398t(AbstractC1102d.m3419p(45 * f15, c2314t), 0.0f, 0.0f, 0.0f, f13 * f13, 7), c38072d.m121949b(c28655q2, i15).getAccentNegativeTrend(), c28655q2, 432, 0);
            AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q2, AbstractC24541a.f95768A), AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f15 * f13, 7), c38072d.m121949b(c28655q2, i15).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i15).getH2(), null, c28655q2, 48, C2886a.f11498d << 18, 196088);
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f14, 0.0f, 0.0f, 13);
            C27256h c27256h = new C27256h(AbstractC8693b.m21277k(AbstractC24541a.f95794z), null, AbstractC18249c.m52575m(EnumC39333f.BRAND_WHITE), EnumC39333f.BRAND_BLACK, null, null, EnumC27272p.DEFAULT, null, null, null, EnumC27254g.STANDARD, null, null, false, true, null, true, false, null, null, null, null, null, null, null, 33463218, null);
            boolean z4 = (i14 & 14) == 4;
            Object objM87133R = c28655q2.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                function2 = function1;
                objM87133R = new C29443g(function2, 0);
                c28655q2.m87172p0(objM87133R);
            } else {
                function2 = function1;
            }
            AbstractC27249e.m82121d(modifierM3398t, c27256h, null, (InterfaceC4339a) objM87133R, c28655q2, (C27256h.f109055z << 3) | 6, 4);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            function2 = function1;
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4435a(function2, i13, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m89874w(Function1 function1) {
        function1.invoke(InterfaceC27034a.j.f107846a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m89875x(Function1 function1, int i13, Composer composer, int i14) {
        m89873v(function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
