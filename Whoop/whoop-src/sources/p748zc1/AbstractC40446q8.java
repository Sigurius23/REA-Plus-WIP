package p748zc1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import kd1.AbstractC22399k;
import l83.C23454a0;
import ny0.AbstractC27289x0;
import ny0.EnumC27291y0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.EnumC22935a1;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: zc1.q8 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a!\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a!\u0010\t\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\t\u0010\b\u001a\u000f\u0010\n\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\n\u0010\u0002¨\u0006\u000b"}, m65681d2 = {"Ll83/a0;", "q", "(Landroidx/compose/runtime/Composer;I)V", "", "title", "", "enabled", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Ljava/lang/String;ZLandroidx/compose/runtime/Composer;II)V", "s", "l", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40446q8 {
    /* JADX INFO: renamed from: l */
    private static final void m130713l(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1766480715);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
            AbstractC22399k.m64475e("Max Width", c28655q, 6);
            float f13 = 1 * 4;
            TextResource textResourceM61133d = AbstractC21702c.m61133d(c2314t, f13, c28655q, "1234567");
            EnumC27291y0 enumC27291y0 = EnumC27291y0.TextLarge;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C40349h7(7);
                c28655q.m87172p0(objM87133R);
            }
            int i14 = TextResource.$stable;
            int i15 = i14 | 918749184;
            AbstractC27289x0.m82331c(textResourceM61133d, null, null, null, 0L, false, false, enumC27291y0, true, (Function1) objM87133R, c28655q, i15, 94);
            TextResource textResourceM61133d2 = AbstractC21702c.m61133d(c2314t, f13, c28655q, "1234567");
            TextResource textResourceM21278l = AbstractC8693b.m21278l("1234567 sub");
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C40349h7(8);
                c28655q.m87172p0(objM87133R2);
            }
            int i16 = i15 | (i14 << 3);
            AbstractC27289x0.m82331c(textResourceM61133d2, textResourceM21278l, null, null, 0L, false, false, enumC27291y0, true, (Function1) objM87133R2, c28655q, i16, 92);
            TextResource textResourceM61133d3 = AbstractC21702c.m61133d(c2314t, f13, c28655q, "1234567");
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l("1234567 sub");
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l("1234567 sub");
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C40349h7(9);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC27289x0.m82331c(textResourceM61133d3, textResourceM21278l2, textResourceM21278l3, null, 0L, false, false, enumC27291y0, true, (Function1) objM87133R3, c28655q, i16 | (i14 << 6), 88);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40475t7(i13, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m130714m(boolean z4) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m130715n(boolean z4) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m130716o(boolean z4) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m130717p(int i13, Composer composer, int i14) {
        m130713l(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    public static final void m130718q(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1944922006);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 4;
            Modifier modifierM3394p = AbstractC1099a.m3394p(8 * f13, AbstractC1102d.m3409f(1.0f, c2314t));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
            m130724w("Text Enabled", false, c28655q, 6, 2);
            float f14 = f13 * f13;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            m130720s("Numbers Enabled", false, c28655q, 6, 2);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            m130724w("Text Disabled", false, c28655q, 54, 0);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            m130720s("Number Disabled", false, c28655q, 54, 0);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            m130713l(c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40475t7(i13, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m130719r(int i13, Composer composer, int i14) {
        m130718q(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:56:0x0120  */
    /* JADX WARN: Code duplicated, block: B:57:0x0124  */
    /* JADX WARN: Code duplicated, block: B:62:0x013f  */
    /* JADX WARN: Code duplicated, block: B:65:0x016c  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:73:0x01da  */
    /* JADX WARN: Code duplicated, block: B:76:0x0203  */
    /* JADX WARN: Code duplicated, block: B:77:0x0207  */
    /* JADX WARN: Code duplicated, block: B:82:0x0222  */
    /* JADX WARN: Code duplicated, block: B:87:0x0251  */
    /* JADX WARN: Code duplicated, block: B:89:0x0277  */
    /* JADX WARN: Code duplicated, block: B:92:0x0280  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: s */
    private static final void m130720s(String str, boolean z4, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        boolean z14;
        C28677v1 c28677v1M87180u;
        boolean z15;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        float f13;
        int iHashCode2;
        Object objM87133R3;
        float f14;
        int iHashCode3;
        Object objM87133R4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-590405020);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87153g(str) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i16 != 0) {
                    z15 = true;
                } else {
                    z15 = z13;
                }
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                AbstractC22399k.m64473c(str, c28655q, i15 & 14);
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
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
                boolean z16 = z15;
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f13 = Float.MAX_VALUE;
                } else {
                    f13 = 1.0f;
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f13, true);
                EnumC22935a1 enumC22935a1 = EnumC22935a1.f90538x;
                Modifier modifierM3399u = AbstractC1099a.m3399u(layoutWeightElement, enumC22935a1);
                C2305k c2305k = C2299e.f9111N;
                C22957g c22957g = AbstractC22977m.f90652c;
                int i17 = i15;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3399u);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                AbstractC22399k.m64475e("Small", c28655q, 6);
                float f15 = 1 * 4;
                TextResource textResourceM61133d = AbstractC21702c.m61133d(c2314t, f15, c28655q, "1234567");
                EnumC27291y0 enumC27291y0 = EnumC27291y0.NumberSmall;
                boolean zBooleanValue = ((Boolean) interfaceC28601c1.getValue()).booleanValue();
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C40317e8(6, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R3);
                }
                int i18 = TextResource.$stable | 817889280 | ((i17 << 15) & 3670016);
                AbstractC27289x0.m82331c(textResourceM61133d, null, null, null, 0L, zBooleanValue, z16, enumC27291y0, false, (Function1) objM87133R3, c28655q, i18, 286);
                c28655q.m87173q(true);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f14 = Float.MAX_VALUE;
                } else {
                    f14 = 1.0f;
                }
                Modifier modifierM3399u2 = AbstractC1099a.m3399u(new LayoutWeightElement(f14, true), enumC22935a1);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3399u2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                AbstractC22399k.m64475e("Large", c28655q, 6);
                TextResource textResourceM61133d2 = AbstractC21702c.m61133d(c2314t, f15, c28655q, "1234567");
                EnumC27291y0 enumC27291y1 = EnumC27291y0.NumberLarge;
                boolean zBooleanValue2 = ((Boolean) interfaceC28601c2.getValue()).booleanValue();
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C40317e8(7, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC27289x0.m82331c(textResourceM61133d2, null, null, null, 0L, zBooleanValue2, z16, enumC27291y1, false, (Function1) objM87133R4, c28655q, i18, 286);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                z13 = z16;
            } else {
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C40436p8(i13, i14, 0, str, z13);
            }
        }
        i15 |= 48;
        z13 = z4;
        if ((i15 & 19) != 18) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            if (i16 != 0) {
                z15 = true;
            } else {
                z15 = z13;
            }
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R2);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            AbstractC22399k.m64473c(str, c28655q, i15 & 14);
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
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
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            boolean z17 = z15;
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f13 = Float.MAX_VALUE;
            } else {
                f13 = 1.0f;
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(f13, true);
            EnumC22935a1 enumC22935a2 = EnumC22935a1.f90538x;
            Modifier modifierM3399u3 = AbstractC1099a.m3399u(layoutWeightElement2, enumC22935a2);
            C2305k c2305k2 = C2299e.f9111N;
            C22957g c22957g2 = AbstractC22977m.f90652c;
            int i19 = i15;
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 48);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3399u3);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m5);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N5);
            AbstractC22399k.m64475e("Small", c28655q, 6);
            float f16 = 1 * 4;
            TextResource textResourceM61133d3 = AbstractC21702c.m61133d(c2314t2, f16, c28655q, "1234567");
            EnumC27291y0 enumC27291y2 = EnumC27291y0.NumberSmall;
            boolean zBooleanValue3 = ((Boolean) interfaceC28601c1.getValue()).booleanValue();
            objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C40317e8(6, interfaceC28601c1);
                c28655q.m87172p0(objM87133R3);
            }
            int i110 = TextResource.$stable | 817889280 | ((i19 << 15) & 3670016);
            AbstractC27289x0.m82331c(textResourceM61133d3, null, null, null, 0L, zBooleanValue3, z17, enumC27291y2, false, (Function1) objM87133R3, c28655q, i110, 286);
            c28655q.m87173q(true);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f14 = Float.MAX_VALUE;
            } else {
                f14 = 1.0f;
            }
            Modifier modifierM3399u4 = AbstractC1099a.m3399u(new LayoutWeightElement(f14, true), enumC22935a2);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 48);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3399u4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N6);
            AbstractC22399k.m64475e("Large", c28655q, 6);
            TextResource textResourceM61133d4 = AbstractC21702c.m61133d(c2314t2, f16, c28655q, "1234567");
            EnumC27291y0 enumC27291y3 = EnumC27291y0.NumberLarge;
            boolean zBooleanValue4 = ((Boolean) interfaceC28601c2.getValue()).booleanValue();
            objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new C40317e8(7, interfaceC28601c2);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC27289x0.m82331c(textResourceM61133d4, null, null, null, 0L, zBooleanValue4, z17, enumC27291y3, false, (Function1) objM87133R4, c28655q, i110, 286);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            z13 = z17;
        } else {
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40436p8(i13, i14, 0, str, z13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m130721t(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m130722u(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m130723v(String str, boolean z4, int i13, int i14, Composer composer, int i15) {
        m130720s(str, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:56:0x0120  */
    /* JADX WARN: Code duplicated, block: B:57:0x0124  */
    /* JADX WARN: Code duplicated, block: B:62:0x013f  */
    /* JADX WARN: Code duplicated, block: B:65:0x016c  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:73:0x01da  */
    /* JADX WARN: Code duplicated, block: B:76:0x0203  */
    /* JADX WARN: Code duplicated, block: B:77:0x0207  */
    /* JADX WARN: Code duplicated, block: B:82:0x0222  */
    /* JADX WARN: Code duplicated, block: B:87:0x0251  */
    /* JADX WARN: Code duplicated, block: B:89:0x0277  */
    /* JADX WARN: Code duplicated, block: B:92:0x0280  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: w */
    private static final void m130724w(String str, boolean z4, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        boolean z14;
        C28677v1 c28677v1M87180u;
        boolean z15;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        float f13;
        int iHashCode2;
        Object objM87133R3;
        float f14;
        int iHashCode3;
        Object objM87133R4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(933141760);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87153g(str) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i16 != 0) {
                    z15 = true;
                } else {
                    z15 = z13;
                }
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                AbstractC22399k.m64473c(str, c28655q, i15 & 14);
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
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
                boolean z16 = z15;
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f13 = Float.MAX_VALUE;
                } else {
                    f13 = 1.0f;
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f13, true);
                EnumC22935a1 enumC22935a1 = EnumC22935a1.f90538x;
                Modifier modifierM3399u = AbstractC1099a.m3399u(layoutWeightElement, enumC22935a1);
                C2305k c2305k = C2299e.f9111N;
                C22957g c22957g = AbstractC22977m.f90652c;
                int i17 = i15;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3399u);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                AbstractC22399k.m64475e("Small", c28655q, 6);
                float f15 = 1 * 4;
                TextResource textResourceM61133d = AbstractC21702c.m61133d(c2314t, f15, c28655q, "Toggle Button");
                EnumC27291y0 enumC27291y0 = EnumC27291y0.TextSmall;
                boolean zBooleanValue = ((Boolean) interfaceC28601c1.getValue()).booleanValue();
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C40317e8(4, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R3);
                }
                int i18 = TextResource.$stable | 817889280 | ((i17 << 15) & 3670016);
                AbstractC27289x0.m82331c(textResourceM61133d, null, null, null, 0L, zBooleanValue, z16, enumC27291y0, false, (Function1) objM87133R3, c28655q, i18, 286);
                c28655q.m87173q(true);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f14 = Float.MAX_VALUE;
                } else {
                    f14 = 1.0f;
                }
                Modifier modifierM3399u2 = AbstractC1099a.m3399u(new LayoutWeightElement(f14, true), enumC22935a1);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3399u2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                AbstractC22399k.m64475e("Large", c28655q, 6);
                TextResource textResourceM61133d2 = AbstractC21702c.m61133d(c2314t, f15, c28655q, "Toggle Button");
                EnumC27291y0 enumC27291y1 = EnumC27291y0.TextLarge;
                boolean zBooleanValue2 = ((Boolean) interfaceC28601c2.getValue()).booleanValue();
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C40317e8(5, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC27289x0.m82331c(textResourceM61133d2, null, null, null, 0L, zBooleanValue2, z16, enumC27291y1, false, (Function1) objM87133R4, c28655q, i18, 286);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                z13 = z16;
            } else {
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C40436p8(i13, i14, 1, str, z13);
            }
        }
        i15 |= 48;
        z13 = z4;
        if ((i15 & 19) != 18) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            if (i16 != 0) {
                z15 = true;
            } else {
                z15 = z13;
            }
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R2);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            AbstractC22399k.m64473c(str, c28655q, i15 & 14);
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
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
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            boolean z17 = z15;
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f13 = Float.MAX_VALUE;
            } else {
                f13 = 1.0f;
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(f13, true);
            EnumC22935a1 enumC22935a2 = EnumC22935a1.f90538x;
            Modifier modifierM3399u3 = AbstractC1099a.m3399u(layoutWeightElement2, enumC22935a2);
            C2305k c2305k2 = C2299e.f9111N;
            C22957g c22957g2 = AbstractC22977m.f90652c;
            int i19 = i15;
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 48);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3399u3);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m5);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N5);
            AbstractC22399k.m64475e("Small", c28655q, 6);
            float f16 = 1 * 4;
            TextResource textResourceM61133d3 = AbstractC21702c.m61133d(c2314t2, f16, c28655q, "Toggle Button");
            EnumC27291y0 enumC27291y2 = EnumC27291y0.TextSmall;
            boolean zBooleanValue3 = ((Boolean) interfaceC28601c1.getValue()).booleanValue();
            objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C40317e8(4, interfaceC28601c1);
                c28655q.m87172p0(objM87133R3);
            }
            int i110 = TextResource.$stable | 817889280 | ((i19 << 15) & 3670016);
            AbstractC27289x0.m82331c(textResourceM61133d3, null, null, null, 0L, zBooleanValue3, z17, enumC27291y2, false, (Function1) objM87133R3, c28655q, i110, 286);
            c28655q.m87173q(true);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f14 = Float.MAX_VALUE;
            } else {
                f14 = 1.0f;
            }
            Modifier modifierM3399u4 = AbstractC1099a.m3399u(new LayoutWeightElement(f14, true), enumC22935a2);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 48);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3399u4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N6);
            AbstractC22399k.m64475e("Large", c28655q, 6);
            TextResource textResourceM61133d4 = AbstractC21702c.m61133d(c2314t2, f16, c28655q, "Toggle Button");
            EnumC27291y0 enumC27291y3 = EnumC27291y0.TextLarge;
            boolean zBooleanValue4 = ((Boolean) interfaceC28601c2.getValue()).booleanValue();
            objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new C40317e8(5, interfaceC28601c2);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC27289x0.m82331c(textResourceM61133d4, null, null, null, 0L, zBooleanValue4, z17, enumC27291y3, false, (Function1) objM87133R4, c28655q, i110, 286);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            z13 = z17;
        } else {
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40436p8(i13, i14, 1, str, z13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m130725x(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m130726y(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m130727z(String str, boolean z4, int i13, int i14, Composer composer, int i15) {
        m130724w(str, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
