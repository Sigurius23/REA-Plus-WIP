package oh0;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import iz0.AbstractC21050i;
import iz0.C21054m;
import l83.C23454a0;
import l83.C23465k;
import no0.C26984y0;
import ny0.AbstractC27282u;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.AbstractC17911t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p734sl0.AbstractC32637l2;
import pl0.C29348f;
import wb3.AbstractC37056f;
import zk0.AbstractC40817h0;
import zk0.C40819i0;

/* JADX INFO: renamed from: oh0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Loh0/c;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "b", "(Loh0/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27933a {
    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x007d  */
    /* JADX WARN: Code duplicated, block: B:37:0x007f  */
    /* JADX WARN: Code duplicated, block: B:40:0x008c  */
    /* JADX WARN: Code duplicated, block: B:41:0x008f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0097  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:53:0x011f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0132  */
    /* JADX WARN: Code duplicated, block: B:66:0x016e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0172  */
    /* JADX WARN: Code duplicated, block: B:72:0x018d  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:77:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m84277b(C27935c viewState, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        Modifier modifier4;
        Object objM87133R;
        C21054m c21054m;
        C40819i0 c40819i0;
        C21054m c21054m2;
        C21054m c21054m3;
        C40819i0 c40819i1;
        C40819i0 c40819i0M132311b;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        AbstractC17911t colorBrush;
        int iHashCode2;
        Modifier modifierM82299o;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1351377928);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87153g(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                modifier3 = C2314t.f9131w;
                if (i16 != 0) {
                    modifier4 = modifier3;
                } else {
                    modifier4 = modifier2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = C29348f.INSTANCE.m89452a();
                    c28655q.m87172p0(objM87133R);
                }
                C23465k c23465k = (C23465k) objM87133R;
                c21054m = (C21054m) c23465k.f92937w;
                c40819i0 = (C40819i0) c23465k.f92938x;
                c21054m2 = (C21054m) c28655q.m87161k(AbstractC21050i.m58879c());
                if (c21054m2 == null) {
                    c21054m3 = c21054m;
                } else {
                    c21054m3 = c21054m2;
                }
                c40819i1 = (C40819i0) c28655q.m87161k(AbstractC40817h0.m132310c());
                if (c40819i1 == null) {
                    c40819i0M132311b = c40819i0;
                } else {
                    c40819i0M132311b = c40819i1;
                }
                if (viewState.getSuppressParagraphBottomMargin()) {
                    c40819i0M132311b = C40819i0.m132311b(c40819i0M132311b, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 253951, null);
                }
                C40819i0 c40819i2 = c40819i0M132311b;
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier3);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(1 * 8), C2299e.f9107J, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                C21054m c21054m4 = c21054m3;
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                colorBrush = viewState.getColorBrush();
                if (colorBrush != null && (modifierM82299o = AbstractC27282u.m82299o(modifier3, colorBrush)) != null) {
                    modifier3 = modifierM82299o;
                }
                Modifier modifierMo3471e = layoutWeightElement.mo3471e(modifier3).mo3471e(modifier4);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                AbstractC32637l2.m101983u(viewState.getContent(), null, null, false, false, false, c21054m4, c40819i2, viewState.getFadeInReveal(), null, c28655q, C21054m.f79836p << 18, 574);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                modifier2 = modifier4;
            } else {
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C26984y0(viewState, i13, modifier2, i14, 5);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            modifier3 = C2314t.f9131w;
            if (i16 != 0) {
                modifier4 = modifier3;
            } else {
                modifier4 = modifier2;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = C29348f.INSTANCE.m89452a();
                c28655q.m87172p0(objM87133R);
            }
            C23465k c23465k2 = (C23465k) objM87133R;
            c21054m = (C21054m) c23465k2.f92937w;
            c40819i0 = (C40819i0) c23465k2.f92938x;
            c21054m2 = (C21054m) c28655q.m87161k(AbstractC21050i.m58879c());
            if (c21054m2 == null) {
                c21054m3 = c21054m;
            } else {
                c21054m3 = c21054m2;
            }
            c40819i1 = (C40819i0) c28655q.m87161k(AbstractC40817h0.m132310c());
            if (c40819i1 == null) {
                c40819i0M132311b = c40819i0;
            } else {
                c40819i0M132311b = c40819i1;
            }
            if (viewState.getSuppressParagraphBottomMargin()) {
                c40819i0M132311b = C40819i0.m132311b(c40819i0M132311b, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 253951, null);
            }
            C40819i0 c40819i3 = c40819i0M132311b;
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier3);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(1 * 8), C2299e.f9107J, c28655q, 6);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
            C21054m c21054m5 = c21054m3;
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
            colorBrush = viewState.getColorBrush();
            if (colorBrush != null) {
                modifier3 = modifierM82299o;
            }
            Modifier modifierMo3471e2 = layoutWeightElement2.mo3471e(modifier3).mo3471e(modifier4);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierMo3471e2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            AbstractC32637l2.m101983u(viewState.getContent(), null, null, false, false, false, c21054m5, c40819i3, viewState.getFadeInReveal(), null, c28655q, C21054m.f79836p << 18, 574);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            modifier2 = modifier4;
        } else {
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26984y0(viewState, i13, modifier2, i14, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m84278c(C27935c c27935c, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m84277b(c27935c, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
