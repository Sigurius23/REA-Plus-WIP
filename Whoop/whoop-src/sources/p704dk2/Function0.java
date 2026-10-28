package p704dk2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import d42.C11699o;
import df2.C12000a;
import ek2.AbstractC13306c;
import java.io.IOException;
import l83.C23454a0;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p181h2.C16618c;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C23010x;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p702ch0.C4651t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import tj2.AbstractC33869a;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: dk2.e, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a/\u0010\u0004\u001a\u00020\u00012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lkotlin/Function0;", "Ll83/a0;", "onRetryClicked", "onBackPressed", "f", "(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "j", "(Lc93/a;Landroidx/compose/runtime/Composer;I)V", "tilt-graph_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class Function0 {
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x008a  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:55:0x013a  */
    /* JADX WARN: Code duplicated, block: B:56:0x013e  */
    /* JADX WARN: Code duplicated, block: B:61:0x015b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0185  */
    /* JADX WARN: Code duplicated, block: B:68:0x0190  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public static final void m33503f(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        InterfaceC4339a interfaceC4339a3;
        int i15;
        InterfaceC4339a interfaceC4339a4;
        int i16;
        boolean z4;
        InterfaceC4339a interfaceC4339a5;
        InterfaceC4339a interfaceC4339a6;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a7;
        InterfaceC4339a interfaceC4339a8;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        Object objM87133R;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1904859900);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            interfaceC4339a3 = interfaceC4339a;
        } else if ((i13 & 6) == 0) {
            interfaceC4339a3 = interfaceC4339a;
            i15 = i13 | (c28655q.m87157i(interfaceC4339a3) ? 4 : 2);
        } else {
            interfaceC4339a3 = interfaceC4339a;
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                interfaceC4339a4 = interfaceC4339a2;
                i15 |= c28655q.m87157i(interfaceC4339a4) ? 32 : 16;
            }
            i16 = i15;
            if ((i16 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C12000a(10);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a7 = interfaceC4339a3;
                }
                if (i18 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C12000a(11);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a8 = interfaceC4339a4;
                }
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC12128o.m33588a(AbstractC1102d.m3407d(1.0f, c2314t)));
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66724m);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                AbstractC13306c.m37399g(null, interfaceC4339a8, null, null, null, c28655q, (i16 & 112) | 6, 28);
                float f13 = 8;
                AbstractC11266d.m30469w(2, f13, c2314t, c28655q);
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 1 * f13, 0.0f, 0.0f, 0.0f, 14);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
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
                AbstractC12125l.m33576c(null, new C16618c(0.0f, 0.2f, 0.0f, 0.0f), c28655q, 48, 1);
                c28655q.m87173q(true);
                m33507j(interfaceC4339a7, c28655q, i16 & 14);
                c28655q.m87173q(true);
                interfaceC4339a6 = interfaceC4339a8;
                interfaceC4339a5 = interfaceC4339a7;
            } else {
                c28655q.m87138X();
                interfaceC4339a5 = interfaceC4339a3;
                interfaceC4339a6 = interfaceC4339a4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C12117d(interfaceC4339a5, interfaceC4339a6, i13, i14, 0);
            }
        }
        i15 |= 48;
        interfaceC4339a4 = interfaceC4339a2;
        i16 = i15;
        if ((i16 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C12000a(10);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a7 = interfaceC4339a3;
            }
            if (i18 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C12000a(11);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC4339a8 = (InterfaceC4339a) objM87133R;
            } else {
                interfaceC4339a8 = interfaceC4339a4;
            }
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM66724m2 = AbstractC22953f.m66724m(AbstractC12128o.m33588a(AbstractC1102d.m3407d(1.0f, c2314t2)));
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM66724m2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a2);
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
            AbstractC13306c.m37399g(null, interfaceC4339a8, null, null, null, c28655q, (i16 & 112) | 6, 28);
            float f14 = 8;
            AbstractC11266d.m30469w(2, f14, c2314t2, c28655q);
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t2, 1 * f14, 0.0f, 0.0f, 0.0f, 14);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
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
            AbstractC12125l.m33576c(null, new C16618c(0.0f, 0.2f, 0.0f, 0.0f), c28655q, 48, 1);
            c28655q.m87173q(true);
            m33507j(interfaceC4339a7, c28655q, i16 & 14);
            c28655q.m87173q(true);
            interfaceC4339a6 = interfaceC4339a8;
            interfaceC4339a5 = interfaceC4339a7;
        } else {
            c28655q.m87138X();
            interfaceC4339a5 = interfaceC4339a3;
            interfaceC4339a6 = interfaceC4339a4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12117d(interfaceC4339a5, interfaceC4339a6, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m33504g() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m33505h() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m33506i(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m33503f(interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    private static final void m33507j(InterfaceC4339a interfaceC4339a, Composer composer, int i13) throws XmlPullParserException, IOException {
        int i14;
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2079412463);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(interfaceC4339a) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            C2305k c2305k = C2299e.f9111N;
            C22949e c22949e = AbstractC22977m.f90650a;
            float f13 = 8;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66748k(2 * f13, C2299e.f9108K), c2305k, c28655q, 54);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            Modifier modifierM3419p = AbstractC1102d.m3419p(4 * f13, c2314t);
            C38072d c38072d = C38072d.f163053a;
            C27430e c27430eM107874S = AbstractC34132o.m107874S(c38072d.m121951d().getVarious().getAttention(), c28655q, 6);
            int i16 = C38072d.f163054b;
            AbstractC15005f3.m43108b(c27430eM107874S, null, modifierM3419p, c38072d.m121949b(c28655q, i16).getBrandWhite(), c28655q, 432, 0);
            String strM21273g = AbstractC8693b.m21273g(AbstractC33869a.f141868c, c28655q, 0);
            C2886a c2886aM8436q = c38072d.m121952e(c28655q, i16).getH3();
            long jM125430y = c38072d.m121949b(c28655q, i16).getBrandWhite();
            C36775k c36775k = new C36775k(3);
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21273g, null, jM125430y, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, c2886aM8436q, null, c28655q, 0, i17, 196090);
            AbstractC30795n.m94707h(AbstractC8693b.m21273g(AbstractC33869a.f141867b, c28655q, 0), AbstractC1102d.m3424u(35 * f13, c2314t), c38072d.m121949b(c28655q, i16).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB1(), null, c28655q, 48, i17, 196088);
            EnumC27284v enumC27284v = EnumC27284v.TextMedium;
            String strM21273g2 = AbstractC8693b.m21273g(AbstractC33869a.f141866a, c28655q, 0);
            i15 = 4;
            boolean z4 = (i14 & 14) == 4;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C11699o(interfaceC4339a, 6);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27282u.m82292h(null, enumC27284v, strM21273g2, false, 0L, null, false, (InterfaceC4339a) objM87133R, c28655q, 48, 121);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            i15 = 4;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4651t(i13, i15, interfaceC4339a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m33508k(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m33509l(InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m33507j(interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
