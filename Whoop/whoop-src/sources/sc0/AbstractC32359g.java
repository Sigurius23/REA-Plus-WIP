package sc0;

import a80.C0546j;
import a80.C0547k;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c31.AbstractC3926j;
import c31.C3927k;
import c31.EnumC3919c;
import gb1.AbstractC15673b0;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p040c0.AbstractC3788w0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p41.AbstractC28838i;
import p41.C28834e;
import p41.C28839j;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.InterfaceC25312u;
import p90.C29000h;
import pf.AbstractC29125c;
import q11.C29793c;
import q63.AbstractC30007c;
import qc0.C30216c;
import qc0.InterfaceC30214a;
import qk2.C30453i;
import s32.C32112d;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: sc0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lqc0/c$c;", "viewState", "Lkotlin/Function1;", "Lqc0/a;", "Ll83/a0;", "onEvent", "j", "(Lqc0/c$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lm91/u;", "item", "", "q", "(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32359g {
    /* JADX WARN: Code duplicated, block: B:102:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:103:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:105:0x032b  */
    /* JADX WARN: Code duplicated, block: B:106:0x032f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0350  */
    /* JADX WARN: Code duplicated, block: B:114:0x035e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0362  */
    /* JADX WARN: Code duplicated, block: B:120:0x0371  */
    /* JADX WARN: Code duplicated, block: B:123:0x0392  */
    /* JADX WARN: Code duplicated, block: B:126:0x039b  */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    /* JADX WARN: Code duplicated, block: B:36:0x0097  */
    /* JADX WARN: Code duplicated, block: B:37:0x009b  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:45:0x0182  */
    /* JADX WARN: Code duplicated, block: B:46:0x0186  */
    /* JADX WARN: Code duplicated, block: B:51:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:57:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:60:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:63:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:69:0x0204  */
    /* JADX WARN: Code duplicated, block: B:74:0x0237  */
    /* JADX WARN: Code duplicated, block: B:75:0x0241  */
    /* JADX WARN: Code duplicated, block: B:77:0x0256  */
    /* JADX WARN: Code duplicated, block: B:78:0x0258  */
    /* JADX WARN: Code duplicated, block: B:82:0x0261  */
    /* JADX WARN: Code duplicated, block: B:87:0x0291  */
    /* JADX WARN: Code duplicated, block: B:90:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:92:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:93:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:97:0x02c9  */
    /* JADX INFO: renamed from: j */
    public static final void m100751j(C30216c.c cVar, Function1 function1, Composer composer, int i13, int i14) {
        Function1 function2;
        boolean z4;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function3;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Function1 function4;
        int i15;
        C28676v0 c28676v1;
        float f13;
        float f14;
        int iHashCode2;
        Function1 function5;
        C28839j c28839jM92469h;
        boolean z13;
        Object objM87133R;
        C3927k c3927kM92463b;
        int iHashCode3;
        C0213j c0213j2;
        C0209i c0209i2;
        boolean z14;
        boolean zM87157i;
        Object objM87133R2;
        boolean z15;
        boolean z16;
        boolean zM87157i2;
        Object objM87133R3;
        boolean z17;
        boolean zM87157i3;
        Object objM87133R4;
        Function1 function6;
        Object objM87133R5;
        C30216c.c viewState = cVar;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-160762563);
        int i16 = (i13 & 6) == 0 ? i13 | (c28655q.m87157i(viewState) ? 4 : 2) : i13;
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i16 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            if ((i16 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C32112d(24);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function3 = (Function1) objM87133R5;
                } else {
                    function3 = function2;
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t));
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44028b0);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i3 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC39127r0M66763d);
                C0209i c0209i4 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(viewState.getHeaderImage(), null, null, c28655q, AbstractC22403o.f87638a, 3);
                Modifier modifierM3427x = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c2314t), null, 3);
                C2307m c2307m = C2299e.f9115x;
                C1100b c1100b = C1100b.f4583a;
                function4 = function3;
                i15 = i16;
                c28676v1 = c28676v0;
                AbstractC29125c.m88522c(abstractC26165aM64500i, null, c1100b.mo3400a(modifierM3427x, c2307m), null, C39102j.f168202d, 0.0f, null, c28655q, 24624, 104);
                AbstractC1090b.m3351f(cVar.getDisplayRefreshingAnimation(), AbstractC22953f.m66724m(c1100b.mo3400a(c2314t, c2307m)), AbstractC3788w0.m11577e(null, 3), AbstractC3788w0.m11578f(null, 3), "Loading Animation", C32354b.f133921a.m100724c(), c28655q, 224640, 0);
                c28655q = c28655q;
                Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t)));
                f13 = 2;
                f14 = 8;
                float f15 = f13 * f14;
                Modifier modifierM3395q = AbstractC1099a.m3395q(modifierM66722k, f15, f15);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3395q);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
                c28655q.m87150e0(332905004);
                for (C30216c.a aVar : cVar.m92467f()) {
                    c28655q.m87150e0(332906819);
                    for (InterfaceC25312u interfaceC25312u : aVar.m92457a()) {
                        if ((i15 & 112) == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87157i3 = z17 | c28655q.m87157i(interfaceC25312u);
                        objM87133R4 = c28655q.m87133R();
                        C28676v0 c28676v2 = c28676v1;
                        if (!zM87157i3 || objM87133R4 == c28676v2) {
                            function6 = function4;
                            objM87133R4 = new C0546j(function6, interfaceC25312u, 24);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            function6 = function4;
                        }
                        m100758q(interfaceC25312u, (Function1) objM87133R4, c28655q, 0, 0);
                        AbstractC11266d.m30469w(f13, 4, c2314t, c28655q);
                        c28676v1 = c28676v2;
                        function4 = function6;
                    }
                    c28655q.m87173q(false);
                }
                function5 = function4;
                C28676v0 c28676v3 = c28676v1;
                c28655q.m87173q(false);
                c28839jM92469h = cVar.getToggleState();
                if (c28839jM92469h == null) {
                    c28655q.m87150e0(1730529237);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1730529238);
                    float f16 = 3 * f14;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f16, c2314t));
                    if ((i15 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13 || objM87133R == c28676v3) {
                        objM87133R = new C29000h(function5, 28);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC28838i.m87715e(null, c28839jM92469h, (Function1) objM87133R, c28655q, C28839j.f116731g << 3, 1);
                    AbstractC30007c.m91851u(c2314t, f16, c28655q, false);
                }
                c28655q.m87150e0(332935340);
                for (C30216c.a aVar2 : cVar.m92468g()) {
                    c28655q.m87150e0(332937155);
                    for (InterfaceC25312u interfaceC25312u2 : aVar2.m92457a()) {
                        if ((i15 & 112) == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        zM87157i2 = z16 | c28655q.m87157i(interfaceC25312u2);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87157i2 || objM87133R3 == c28676v3) {
                            objM87133R3 = new C0546j(function5, interfaceC25312u2, 25);
                            c28655q.m87172p0(objM87133R3);
                        }
                        m100758q(interfaceC25312u2, (Function1) objM87133R3, c28655q, 0, 0);
                        AbstractC11266d.m30469w(f13, 4, c2314t, c28655q);
                    }
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
                c3927kM92463b = cVar.getCtaButton();
                if (c3927kM92463b == null) {
                    c28655q.m87150e0(1731470738);
                    c28655q.m87173q(false);
                    z15 = true;
                    viewState = cVar;
                } else {
                    c28655q.m87150e0(1731470739);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9106I, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                    if ((i15 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    viewState = cVar;
                    zM87157i = c28655q.m87157i(viewState) | z14;
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i || objM87133R2 == c28676v3) {
                        objM87133R2 = new C29793c(29, function5, viewState);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC3926j.m11931e(c3927kM92463b, (Function1) objM87133R2, c28655q, C3927k.f16020r, 0);
                    z15 = true;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z15);
                c28655q.m87173q(z15);
                function2 = function5;
            } else {
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C30453i(viewState, i13, function2, i14, 17);
            }
        }
        i16 |= 48;
        function2 = function1;
        if ((i16 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C32112d(24);
                    c28655q.m87172p0(objM87133R5);
                }
                function3 = (Function1) objM87133R5;
            } else {
                function3 = function2;
            }
            c2314t = C2314t.f9131w;
            Modifier modifierM44028b1 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t));
            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM44028b1);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i6 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d3);
            C0209i c0209i7 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i8 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N4);
            AbstractC26165a abstractC26165aM64500i2 = AbstractC22404p.m64500i(viewState.getHeaderImage(), null, null, c28655q, AbstractC22403o.f87638a, 3);
            Modifier modifierM3427x2 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c2314t), null, 3);
            C2307m c2307m2 = C2299e.f9115x;
            C1100b c1100b2 = C1100b.f4583a;
            function4 = function3;
            i15 = i16;
            c28676v1 = c28676v0;
            AbstractC29125c.m88522c(abstractC26165aM64500i2, null, c1100b2.mo3400a(modifierM3427x2, c2307m2), null, C39102j.f168202d, 0.0f, null, c28655q, 24624, 104);
            AbstractC1090b.m3351f(cVar.getDisplayRefreshingAnimation(), AbstractC22953f.m66724m(c1100b2.mo3400a(c2314t, c2307m2)), AbstractC3788w0.m11577e(null, 3), AbstractC3788w0.m11578f(null, 3), "Loading Animation", C32354b.f133921a.m100724c(), c28655q, 224640, 0);
            c28655q = c28655q;
            Modifier modifierM66722k2 = AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t)));
            f13 = 2;
            f14 = 8;
            float f17 = f13 * f14;
            Modifier modifierM3395q2 = AbstractC1099a.m3395q(modifierM66722k2, f17, f17);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q, 6);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3395q2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m5);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N5);
            c28655q.m87150e0(332905004);
            while (r0.hasNext()) {
                c28655q.m87150e0(332906819);
                while (r1.hasNext()) {
                    if ((i15 & 112) == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87157i3 = z17 | c28655q.m87157i(interfaceC25312u);
                    objM87133R4 = c28655q.m87133R();
                    C28676v0 c28676v4 = c28676v1;
                    if (zM87157i3) {
                        function6 = function4;
                        objM87133R4 = new C0546j(function6, interfaceC25312u, 24);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        function6 = function4;
                        objM87133R4 = new C0546j(function6, interfaceC25312u, 24);
                        c28655q.m87172p0(objM87133R4);
                    }
                    m100758q(interfaceC25312u, (Function1) objM87133R4, c28655q, 0, 0);
                    AbstractC11266d.m30469w(f13, 4, c2314t, c28655q);
                    c28676v1 = c28676v4;
                    function4 = function6;
                }
                c28655q.m87173q(false);
            }
            function5 = function4;
            C28676v0 c28676v5 = c28676v1;
            c28655q.m87173q(false);
            c28839jM92469h = cVar.getToggleState();
            if (c28839jM92469h == null) {
                c28655q.m87150e0(1730529237);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1730529238);
                float f18 = 3 * f14;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f18, c2314t));
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new C29000h(function5, 28);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C29000h(function5, 28);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC28838i.m87715e(null, c28839jM92469h, (Function1) objM87133R, c28655q, C28839j.f116731g << 3, 1);
                AbstractC30007c.m91851u(c2314t, f18, c28655q, false);
            }
            c28655q.m87150e0(332935340);
            while (r0.hasNext()) {
                c28655q.m87150e0(332937155);
                while (r1.hasNext()) {
                    if ((i15 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zM87157i2 = z16 | c28655q.m87157i(interfaceC25312u2);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i2) {
                        objM87133R3 = new C0546j(function5, interfaceC25312u2, 25);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C0546j(function5, interfaceC25312u2, 25);
                        c28655q.m87172p0(objM87133R3);
                    }
                    m100758q(interfaceC25312u2, (Function1) objM87133R3, c28655q, 0, 0);
                    AbstractC11266d.m30469w(f13, 4, c2314t, c28655q);
                }
                c28655q.m87173q(false);
            }
            c28655q.m87173q(false);
            c3927kM92463b = cVar.getCtaButton();
            if (c3927kM92463b == null) {
                c28655q.m87150e0(1731470738);
                c28655q.m87173q(false);
                z15 = true;
                viewState = cVar;
            } else {
                c28655q.m87150e0(1731470739);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9106I, false);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                if ((i15 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                viewState = cVar;
                zM87157i = c28655q.m87157i(viewState) | z14;
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R2 = new C29793c(29, function5, viewState);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C29793c(29, function5, viewState);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC3926j.m11931e(c3927kM92463b, (Function1) objM87133R2, c28655q, C3927k.f16020r, 0);
                z15 = true;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z15);
            c28655q.m87173q(z15);
            function2 = function5;
        } else {
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30453i(viewState, i13, function2, i14, 17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m100752k(InterfaceC30214a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m100753l(Function1 function1, InterfaceC25312u interfaceC25312u, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC30214a.e(it, interfaceC25312u));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m100754m(Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof C28834e) {
            function1.invoke(new InterfaceC30214a.j(((C28834e) event).getIsChecked()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m100755n(Function1 function1, InterfaceC25312u interfaceC25312u, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC30214a.e(it, interfaceC25312u));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m100756o(Function1 function1, C30216c.c cVar, EnumC3919c clickType) {
        AbstractC22676k.m65750j(clickType, "clickType");
        if (clickType == EnumC3919c.FILLED_BUTTON) {
            function1.invoke(new InterfaceC30214a.b(cVar.getCtaClickAction()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m100757p(C30216c.c cVar, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m100751j(cVar, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    public static final void m100758q(InterfaceC25312u item, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        Function1 function3;
        AbstractC22676k.m65750j(item, "item");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(71562527);
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
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C32112d(25);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C32112d(26);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC25303l.m74291r(item, p720m91.Function1.m74306g((Function1) objM87133R2), null, function3, c28655q, (i15 & 14) | (C25307p.f99300b << 3) | ((i15 << 6) & 7168), 4);
            function2 = function3;
        } else {
            c28655q.m87138X();
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0547k(item, function2, i13, i14, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m100759r(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m100760s(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m100761t(InterfaceC25312u interfaceC25312u, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m100758q(interfaceC25312u, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
