package p000;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import j93.AbstractC21478l0;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28617g1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p390p1.InterfaceC28690z0;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: g */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC14893g {

    /* JADX INFO: renamed from: a */
    public static final C37816b f55561a = new C37816b(new C13762f(0), false, -11367304);

    /* JADX WARN: Code duplicated, block: B:58:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:60:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:67:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:70:0x0250  */
    /* JADX WARN: Code duplicated, block: B:71:0x0254  */
    /* JADX WARN: Code duplicated, block: B:76:0x026f  */
    /* JADX INFO: renamed from: a */
    public static final void m42994a(C12476e0 c12476e0, Modifier modifier, Composer composer, int i13) {
        Modifier modifier2;
        Object c11327d0;
        Boolean bool;
        C0209i c0209i;
        boolean z4;
        boolean zM87147d;
        Object objM87133R;
        C28655q c28655q;
        int i14;
        int iHashCode;
        C12476e0 state = c12476e0;
        AbstractC22676k.m65750j(state, "state");
        float f13 = state.f42577a;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1316691804);
        int i15 = i13 | (c28655q2.m87153g(state) ? 4 : 2) | 48;
        if (c28655q2.m87135U(i15 & 1, (i15 & 19) != 18)) {
            Object objM87133R2 = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC11266d.m30468v(0.0f, c28655q2);
            }
            InterfaceC28690z0 interfaceC28690z0 = (InterfaceC28690z0) objM87133R2;
            Object objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC11266d.m30468v(0.0f, c28655q2);
            }
            InterfaceC28690z0 interfaceC28690z1 = (InterfaceC28690z0) objM87133R3;
            InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
            float fMo743q0 = interfaceC39171c.mo743q0(state.f42586j);
            float fMo743q1 = interfaceC39171c.mo743q0(state.f42587k);
            float fMo743q2 = interfaceC39171c.mo743q0(state.f42588l);
            Float fValueOf = Float.valueOf(f13);
            Boolean bool2 = Boolean.FALSE;
            int i16 = i15 & 14;
            boolean z13 = i16 == 4;
            Object objM87133R4 = c28655q2.m87133R();
            if (z13 || objM87133R4 == c28676v0) {
                bool = bool2;
                c11327d0 = new C11327d0(state, interfaceC28690z0, interfaceC28690z1, null, 0);
                c28655q2.m87172p0(c11327d0);
            } else {
                c11327d0 = objM87133R4;
                bool = bool2;
            }
            AbstractC28683x.m87254h(fValueOf, bool, (InterfaceC4351m) c11327d0, c28655q2);
            c28655q2.m87150e0(-369260790);
            float fFloatValue = ((Number) AbstractC11352g.m30588b(((C28617g1) interfaceC28690z1).m87022x(), AbstractC11348f.m30574v(0, 0, r4, 6), "GaugeAnimation", null, c28655q2, 3120, 20).getValue()).floatValue();
            c28655q2.m87173q(false);
            boolean z14 = r2.m87022x() >= 85.0f;
            InterfaceC28670t2 interfaceC28670t2M30588b = AbstractC11352g.m30588b(z14 ? 1.0f : 0.0f, AbstractC11348f.m30574v(600, 0, r4, 6), "FadeAlpha", null, c28655q2, 3120, 20);
            InterfaceC28670t2 interfaceC28670t2M30587a = AbstractC11352g.m30587a(z14 ? 0 : 10, AbstractC11348f.m30574v(600, 0, r4, 6), "SlideUpOffset", c28655q2, 432, 8);
            InterfaceC28670t2 interfaceC28670t2M30587a2 = AbstractC11352g.m30587a(z14 ? 0 : -10, AbstractC11348f.m30574v(600, 0, null, 6), "SlideDownOffset", c28655q2, 432, 8);
            float f14 = c12476e0.f42596t;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3419p = AbstractC1102d.m3419p(f14, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3419p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q2.f115903S) {
                c0209i = c0209i3;
            } else {
                c0209i = c0209i3;
                if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                }
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N);
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                if (i16 == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zM87147d = z4 | c28655q2.m87147d(fFloatValue) | c28655q2.m87147d(fMo743q0) | c28655q2.m87147d(fMo743q2) | c28655q2.m87147d(fMo743q1);
                objM87133R = c28655q2.m87133R();
                if (!zM87147d || objM87133R == c28676v0) {
                    c28655q = c28655q2;
                    state = c12476e0;
                    i14 = 6;
                    objM87133R = new C38770y(state, fFloatValue, interfaceC28690z0, fMo743q0, fMo743q2, fMo743q1);
                    c28655q.m87172p0(objM87133R);
                } else {
                    c28655q = c28655q2;
                    state = c12476e0;
                    i14 = 6;
                }
                AbstractC21478l0.m60421a(modifierM3407d, (Function1) objM87133R, c28655q, i14);
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 5 * 8, 7);
                modifier2 = c2314t;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
                AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(-1959719400, c28655q, new C39916z(interfaceC28670t2M30587a, interfaceC28670t2M30588b, fFloatValue, state)), c28655q, 56);
                String str = state.f42578b;
                C38072d c38072d = C38072d.f163053a;
                C28655q c28655q3 = c28655q;
                AbstractC30795n.m94707h(str, AbstractC34132o.m107879c(((Number) interfaceC28670t2M30588b.getValue()).floatValue(), AbstractC1099a.m3392n(modifier2, 0.0f, ((C39174f) interfaceC28670t2M30587a2.getValue()).f168413w, 1)), c38072d.m121949b(c28655q, i14).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getH4(), null, c28655q3, 0, 0, 196600);
                c28655q2 = c28655q3;
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
            }
            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i4);
            C0209i c0209i6 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i6, modifierM118962N);
            Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t);
            if (i16 == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            zM87147d = z4 | c28655q2.m87147d(fFloatValue) | c28655q2.m87147d(fMo743q0) | c28655q2.m87147d(fMo743q2) | c28655q2.m87147d(fMo743q1);
            objM87133R = c28655q2.m87133R();
            if (zM87147d) {
                c28655q = c28655q2;
                state = c12476e0;
                i14 = 6;
                objM87133R = new C38770y(state, fFloatValue, interfaceC28690z0, fMo743q0, fMo743q2, fMo743q1);
                c28655q.m87172p0(objM87133R);
            } else {
                c28655q = c28655q2;
                state = c12476e0;
                i14 = 6;
                objM87133R = new C38770y(state, fFloatValue, interfaceC28690z0, fMo743q0, fMo743q2, fMo743q1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC21478l0.m60421a(modifierM3407d2, (Function1) objM87133R, c28655q, i14);
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 5 * 8, 7);
            modifier2 = c2314t;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m3);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N3);
            AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(-1959719400, c28655q, new C39916z(interfaceC28670t2M30587a, interfaceC28670t2M30588b, fFloatValue, state)), c28655q, 56);
            String str2 = state.f42578b;
            C38072d c38072d2 = C38072d.f163053a;
            C28655q c28655q4 = c28655q;
            AbstractC30795n.m94707h(str2, AbstractC34132o.m107879c(((Number) interfaceC28670t2M30588b.getValue()).floatValue(), AbstractC1099a.m3392n(modifier2, 0.0f, ((C39174f) interfaceC28670t2M30587a2.getValue()).f168413w, 1)), c38072d2.m121949b(c28655q, i14).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i14).getH4(), null, c28655q4, 0, 0, 196600);
            c28655q2 = c28655q4;
            c28655q2.m87173q(true);
            c28655q2.m87173q(true);
        } else {
            c28655q2.m87138X();
            modifier2 = modifier;
        }
        C28677v1 c28677v1M87180u = c28655q2.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0003a0(state, modifier2, i13, 0);
        }
    }
}
