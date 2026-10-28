package c31;

import a01.C0085e;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bf0.C3189a;
import bs1.C3595n;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gy0.AbstractC16272a;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: c31.h */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "errorMessage", "errorClickableText", "Lkotlin/Function1;", "Lc31/c;", "Ll83/a0;", "onErrorViewEvent", "d", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3924h {
    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:61:0x012f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0133  */
    /* JADX WARN: Code duplicated, block: B:65:0x0140  */
    /* JADX WARN: Code duplicated, block: B:67:0x014e  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:74:0x021e  */
    /* JADX WARN: Code duplicated, block: B:75:0x022f  */
    /* JADX WARN: Code duplicated, block: B:77:0x024f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0251  */
    /* JADX WARN: Code duplicated, block: B:81:0x0258  */
    /* JADX WARN: Code duplicated, block: B:83:0x025c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0291  */
    /* JADX WARN: Code duplicated, block: B:88:0x0299  */
    /* JADX WARN: Code duplicated, block: B:91:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:93:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:96:0x033f  */
    /* JADX WARN: Code duplicated, block: B:99:0x034a  */
    /* JADX INFO: renamed from: d */
    public static final void m11918d(TextResource errorMessage, TextResource textResource, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        TextResource textResource2;
        int i16;
        Function1 function2;
        int i17;
        boolean z4;
        TextResource textResource3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        TextResource textResource4;
        C28676v0 c28676v0;
        Function1 function4;
        C38072d c38072d;
        float f13;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        float f14;
        C0209i c0209i4;
        float f15;
        float f16;
        C2306l c2306l;
        C22949e c22949e;
        int i18;
        TextResource textResource5;
        int iHashCode2;
        float f17;
        boolean z13;
        Object objM87133R;
        int iHashCode3;
        float f18;
        C2314t c2314t2;
        boolean z14;
        Object objM87133R2;
        AbstractC22676k.m65750j(errorMessage, "errorMessage");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2086609688);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(errorMessage) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                textResource2 = textResource;
                i15 |= c28655q.m87153g(textResource2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i15 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i19 != 0) {
                        textResource4 = null;
                    } else {
                        textResource4 = textResource2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C3595n(28);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function4 = (Function1) objM87133R2;
                    } else {
                        function4 = function2;
                    }
                    c38072d = C38072d.f163053a;
                    long jM125394g = c38072d.m121949b(c28655q, 6).getAccentNegativeTrend15();
                    f13 = 4;
                    c2314t = C2314t.f9131w;
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC11895b.m31987f(3, f13, c2314t, jM125394g));
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
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
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        f14 = f13;
                    } else {
                        f14 = f13;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                        f15 = 8;
                        float f19 = 2 * f15;
                        f16 = 1 * f15;
                        Modifier modifierM3397s = AbstractC1099a.m3397s(c2314t, f19, f19, f19, f16);
                        c2306l = C2299e.f9108K;
                        c22949e = AbstractC22977m.f90650a;
                        i18 = i15;
                        textResource5 = textResource4;
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3397s);
                        c28655q.m87158i0();
                        Function1 function5 = function4;
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                        f17 = f14 * f14;
                        function3 = function5;
                        AbstractC15005f3.m43107a(AbstractC29125c.m88500I(AbstractC16272a.f62158t, c28655q, 0), null, AbstractC1102d.m3419p(f17, c2314t), c38072d.m121949b(c28655q, 6).getAccentNegativeTrend(), c28655q, 432, 0);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f16, c2314t));
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(errorMessage, c28655q, i18 & 14), new LayoutWeightElement(1.0f, true), c38072d.m121949b(c28655q, 6).getAccentNegativeTrend(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB2(), null, c28655q, 0, 0, 196600);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        if (textResource5 == null) {
                            c28655q.m87150e0(-1894256376);
                            c28655q.m87173q(false);
                            z14 = true;
                            c2314t2 = c2314t;
                            f18 = f16;
                        } else {
                            c28655q.m87150e0(-1894256375);
                            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 5 * f15, 0.0f, 0.0f, f16, 6);
                            if ((i18 & 896) == 256) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            objM87133R = c28655q.m87133R();
                            if (z13 || objM87133R == c28676v0) {
                                objM87133R = new C3189a(function3, 9);
                                c28655q.m87172p0(objM87133R);
                            }
                            Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3398t, false, null, null, (InterfaceC4339a) objM87133R, 15);
                            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
                            iHashCode3 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3362g);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
                            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                            f18 = f16;
                            c2314t2 = c2314t;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource5, c28655q, 0), null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getBtS(), null, c28655q, 0, 0, 196602);
                            c28655q = c28655q;
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f18, c2314t2));
                            AbstractC15005f3.m43107a(AbstractC29125c.m88500I(AbstractC16272a.f62140q, c28655q, 0), null, AbstractC1102d.m3419p(f17, c2314t2), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                            z14 = true;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        }
                        AbstractC25012a.m73389v(c2314t2, f18, c28655q, z14);
                        textResource3 = textResource5;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    f15 = 8;
                    float f110 = 2 * f15;
                    f16 = 1 * f15;
                    Modifier modifierM3397s2 = AbstractC1099a.m3397s(c2314t, f110, f110, f110, f16);
                    c2306l = C2299e.f9108K;
                    c22949e = AbstractC22977m.f90650a;
                    i18 = i15;
                    textResource5 = textResource4;
                    C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3397s2);
                    c28655q.m87158i0();
                    Function1 function6 = function4;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a3);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
                    f17 = f14 * f14;
                    function3 = function6;
                    AbstractC15005f3.m43107a(AbstractC29125c.m88500I(AbstractC16272a.f62158t, c28655q, 0), null, AbstractC1102d.m3419p(f17, c2314t), c38072d.m121949b(c28655q, 6).getAccentNegativeTrend(), c28655q, 432, 0);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f16, c2314t));
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(errorMessage, c28655q, i18 & 14), new LayoutWeightElement(1.0f, true), c38072d.m121949b(c28655q, 6).getAccentNegativeTrend(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB2(), null, c28655q, 0, 0, 196600);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    if (textResource5 == null) {
                        c28655q.m87150e0(-1894256376);
                        c28655q.m87173q(false);
                        z14 = true;
                        c2314t2 = c2314t;
                        f18 = f16;
                    } else {
                        c28655q.m87150e0(-1894256375);
                        Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 5 * f15, 0.0f, 0.0f, f16, 6);
                        if ((i18 & 896) == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z13) {
                            objM87133R = new C3189a(function3, 9);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C3189a(function3, 9);
                            c28655q.m87172p0(objM87133R);
                        }
                        Modifier modifierM3362g2 = AbstractC1092a.m3362g(modifierM3398t2, false, null, null, (InterfaceC4339a) objM87133R, 15);
                        C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3362g2);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a4);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m5);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N5);
                        f18 = f16;
                        c2314t2 = c2314t;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource5, c28655q, 0), null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getBtS(), null, c28655q, 0, 0, 196602);
                        c28655q = c28655q;
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f18, c2314t2));
                        AbstractC15005f3.m43107a(AbstractC29125c.m88500I(AbstractC16272a.f62140q, c28655q, 0), null, AbstractC1102d.m3419p(f17, c2314t2), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                        z14 = true;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    AbstractC25012a.m73389v(c2314t2, f18, c28655q, z14);
                    textResource3 = textResource5;
                } else {
                    c28655q.m87138X();
                    textResource3 = textResource2;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0085e(errorMessage, textResource3, function3, i13, i14, 26);
                }
            }
            i15 |= 384;
            function2 = function1;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i19 != 0) {
                    textResource4 = null;
                } else {
                    textResource4 = textResource2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C3595n(28);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                c38072d = C38072d.f163053a;
                long jM125394g2 = c38072d.m121949b(c28655q, 6).getAccentNegativeTrend15();
                f13 = 4;
                c2314t = C2314t.f9131w;
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, AbstractC11895b.m31987f(3, f13, c2314t, jM125394g2));
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m6);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    f14 = f13;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N6);
                    f15 = 8;
                    float f111 = 2 * f15;
                    f16 = 1 * f15;
                    Modifier modifierM3397s3 = AbstractC1099a.m3397s(c2314t, f111, f111, f111, f16);
                    c2306l = C2299e.f9108K;
                    c22949e = AbstractC22977m.f90650a;
                    i18 = i15;
                    textResource5 = textResource4;
                    C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3397s3);
                    c28655q.m87158i0();
                    Function1 function7 = function4;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a5);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m7);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N7);
                    f17 = f14 * f14;
                    function3 = function7;
                    AbstractC15005f3.m43107a(AbstractC29125c.m88500I(AbstractC16272a.f62158t, c28655q, 0), null, AbstractC1102d.m3419p(f17, c2314t), c38072d.m121949b(c28655q, 6).getAccentNegativeTrend(), c28655q, 432, 0);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f16, c2314t));
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(errorMessage, c28655q, i18 & 14), new LayoutWeightElement(1.0f, true), c38072d.m121949b(c28655q, 6).getAccentNegativeTrend(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB2(), null, c28655q, 0, 0, 196600);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    if (textResource5 == null) {
                        c28655q.m87150e0(-1894256376);
                        c28655q.m87173q(false);
                        z14 = true;
                        c2314t2 = c2314t;
                        f18 = f16;
                    } else {
                        c28655q.m87150e0(-1894256375);
                        Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t, 5 * f15, 0.0f, 0.0f, f16, 6);
                        if ((i18 & 896) == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z13) {
                            objM87133R = new C3189a(function3, 9);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C3189a(function3, 9);
                            c28655q.m87172p0(objM87133R);
                        }
                        Modifier modifierM3362g3 = AbstractC1092a.m3362g(modifierM3398t3, false, null, null, (InterfaceC4339a) objM87133R, 15);
                        C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                        Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3362g3);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a6);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m8);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N8);
                        f18 = f16;
                        c2314t2 = c2314t;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource5, c28655q, 0), null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getBtS(), null, c28655q, 0, 0, 196602);
                        c28655q = c28655q;
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f18, c2314t2));
                        AbstractC15005f3.m43107a(AbstractC29125c.m88500I(AbstractC16272a.f62140q, c28655q, 0), null, AbstractC1102d.m3419p(f17, c2314t2), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                        z14 = true;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    AbstractC25012a.m73389v(c2314t2, f18, c28655q, z14);
                    textResource3 = textResource5;
                } else {
                    f14 = f13;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N6);
                f15 = 8;
                float f112 = 2 * f15;
                f16 = 1 * f15;
                Modifier modifierM3397s4 = AbstractC1099a.m3397s(c2314t, f112, f112, f112, f16);
                c2306l = C2299e.f9108K;
                c22949e = AbstractC22977m.f90650a;
                i18 = i15;
                textResource5 = textResource4;
                C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3397s4);
                c28655q.m87158i0();
                Function1 function8 = function4;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a7);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m9);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N9);
                f17 = f14 * f14;
                function3 = function8;
                AbstractC15005f3.m43107a(AbstractC29125c.m88500I(AbstractC16272a.f62158t, c28655q, 0), null, AbstractC1102d.m3419p(f17, c2314t), c38072d.m121949b(c28655q, 6).getAccentNegativeTrend(), c28655q, 432, 0);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f16, c2314t));
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(errorMessage, c28655q, i18 & 14), new LayoutWeightElement(1.0f, true), c38072d.m121949b(c28655q, 6).getAccentNegativeTrend(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB2(), null, c28655q, 0, 0, 196600);
                c28655q = c28655q;
                c28655q.m87173q(true);
                if (textResource5 == null) {
                    c28655q.m87150e0(-1894256376);
                    c28655q.m87173q(false);
                    z14 = true;
                    c2314t2 = c2314t;
                    f18 = f16;
                } else {
                    c28655q.m87150e0(-1894256375);
                    Modifier modifierM3398t4 = AbstractC1099a.m3398t(c2314t, 5 * f15, 0.0f, 0.0f, f16, 6);
                    if ((i18 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13) {
                        objM87133R = new C3189a(function3, 9);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C3189a(function3, 9);
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifierM3362g4 = AbstractC1092a.m3362g(modifierM3398t4, false, null, null, (InterfaceC4339a) objM87133R, 15);
                    C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3362g4);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a8);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m10);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N10);
                    f18 = f16;
                    c2314t2 = c2314t;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource5, c28655q, 0), null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getBtS(), null, c28655q, 0, 0, 196602);
                    c28655q = c28655q;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f18, c2314t2));
                    AbstractC15005f3.m43107a(AbstractC29125c.m88500I(AbstractC16272a.f62140q, c28655q, 0), null, AbstractC1102d.m3419p(f17, c2314t2), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                    z14 = true;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                AbstractC25012a.m73389v(c2314t2, f18, c28655q, z14);
                textResource3 = textResource5;
            } else {
                c28655q.m87138X();
                textResource3 = textResource2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0085e(errorMessage, textResource3, function3, i13, i14, 26);
            }
        }
        i15 |= 48;
        textResource2 = textResource;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                if (c28655q.m87157i(function2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i19 != 0) {
                    textResource4 = null;
                } else {
                    textResource4 = textResource2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C3595n(28);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                c38072d = C38072d.f163053a;
                long jM125394g3 = c38072d.m121949b(c28655q, 6).getAccentNegativeTrend15();
                f13 = 4;
                c2314t = C2314t.f9131w;
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, AbstractC11895b.m31987f(3, f13, c2314t, jM125394g3));
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a3);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    f14 = f13;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11);
                    f15 = 8;
                    float f113 = 2 * f15;
                    f16 = 1 * f15;
                    Modifier modifierM3397s5 = AbstractC1099a.m3397s(c2314t, f113, f113, f113, f16);
                    c2306l = C2299e.f9108K;
                    c22949e = AbstractC22977m.f90650a;
                    i18 = i15;
                    textResource5 = textResource4;
                    C22994r1 c22994r1M66759a9 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3397s5);
                    c28655q.m87158i0();
                    Function1 function9 = function4;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a9);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m12);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N12);
                    f17 = f14 * f14;
                    function3 = function9;
                    AbstractC15005f3.m43107a(AbstractC29125c.m88500I(AbstractC16272a.f62158t, c28655q, 0), null, AbstractC1102d.m3419p(f17, c2314t), c38072d.m121949b(c28655q, 6).getAccentNegativeTrend(), c28655q, 432, 0);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f16, c2314t));
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(errorMessage, c28655q, i18 & 14), new LayoutWeightElement(1.0f, true), c38072d.m121949b(c28655q, 6).getAccentNegativeTrend(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB2(), null, c28655q, 0, 0, 196600);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    if (textResource5 == null) {
                        c28655q.m87150e0(-1894256376);
                        c28655q.m87173q(false);
                        z14 = true;
                        c2314t2 = c2314t;
                        f18 = f16;
                    } else {
                        c28655q.m87150e0(-1894256375);
                        Modifier modifierM3398t5 = AbstractC1099a.m3398t(c2314t, 5 * f15, 0.0f, 0.0f, f16, 6);
                        if ((i18 & 896) == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z13) {
                            objM87133R = new C3189a(function3, 9);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C3189a(function3, 9);
                            c28655q.m87172p0(objM87133R);
                        }
                        Modifier modifierM3362g5 = AbstractC1092a.m3362g(modifierM3398t5, false, null, null, (InterfaceC4339a) objM87133R, 15);
                        C22994r1 c22994r1M66759a10 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                        Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierM3362g5);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a10);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m13);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N13);
                        f18 = f16;
                        c2314t2 = c2314t;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource5, c28655q, 0), null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getBtS(), null, c28655q, 0, 0, 196602);
                        c28655q = c28655q;
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f18, c2314t2));
                        AbstractC15005f3.m43107a(AbstractC29125c.m88500I(AbstractC16272a.f62140q, c28655q, 0), null, AbstractC1102d.m3419p(f17, c2314t2), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                        z14 = true;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    AbstractC25012a.m73389v(c2314t2, f18, c28655q, z14);
                    textResource3 = textResource5;
                } else {
                    f14 = f13;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11);
                f15 = 8;
                float f114 = 2 * f15;
                f16 = 1 * f15;
                Modifier modifierM3397s6 = AbstractC1099a.m3397s(c2314t, f114, f114, f114, f16);
                c2306l = C2299e.f9108K;
                c22949e = AbstractC22977m.f90650a;
                i18 = i15;
                textResource5 = textResource4;
                C22994r1 c22994r1M66759a11 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierM3397s6);
                c28655q.m87158i0();
                Function1 function10 = function4;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a11);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m14);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N14);
                f17 = f14 * f14;
                function3 = function10;
                AbstractC15005f3.m43107a(AbstractC29125c.m88500I(AbstractC16272a.f62158t, c28655q, 0), null, AbstractC1102d.m3419p(f17, c2314t), c38072d.m121949b(c28655q, 6).getAccentNegativeTrend(), c28655q, 432, 0);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f16, c2314t));
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(errorMessage, c28655q, i18 & 14), new LayoutWeightElement(1.0f, true), c38072d.m121949b(c28655q, 6).getAccentNegativeTrend(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB2(), null, c28655q, 0, 0, 196600);
                c28655q = c28655q;
                c28655q.m87173q(true);
                if (textResource5 == null) {
                    c28655q.m87150e0(-1894256376);
                    c28655q.m87173q(false);
                    z14 = true;
                    c2314t2 = c2314t;
                    f18 = f16;
                } else {
                    c28655q.m87150e0(-1894256375);
                    Modifier modifierM3398t6 = AbstractC1099a.m3398t(c2314t, 5 * f15, 0.0f, 0.0f, f16, 6);
                    if ((i18 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13) {
                        objM87133R = new C3189a(function3, 9);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C3189a(function3, 9);
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifierM3362g6 = AbstractC1092a.m3362g(modifierM3398t6, false, null, null, (InterfaceC4339a) objM87133R, 15);
                    C22994r1 c22994r1M66759a12 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                    Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM3362g6);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a12);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m15);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N15);
                    f18 = f16;
                    c2314t2 = c2314t;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource5, c28655q, 0), null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getBtS(), null, c28655q, 0, 0, 196602);
                    c28655q = c28655q;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f18, c2314t2));
                    AbstractC15005f3.m43107a(AbstractC29125c.m88500I(AbstractC16272a.f62140q, c28655q, 0), null, AbstractC1102d.m3419p(f17, c2314t2), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                    z14 = true;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                AbstractC25012a.m73389v(c2314t2, f18, c28655q, z14);
                textResource3 = textResource5;
            } else {
                c28655q.m87138X();
                textResource3 = textResource2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0085e(errorMessage, textResource3, function3, i13, i14, 26);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i19 != 0) {
                textResource4 = null;
            } else {
                textResource4 = textResource2;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C3595n(28);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            c38072d = C38072d.f163053a;
            long jM125394g4 = c38072d.m121949b(c28655q, 6).getAccentNegativeTrend15();
            f13 = 4;
            c2314t = C2314t.f9131w;
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, AbstractC11895b.m31987f(3, f13, c2314t, jM125394g4));
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
            Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM3409f4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a4);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m16);
            c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                f14 = f13;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N16);
                f15 = 8;
                float f115 = 2 * f15;
                f16 = 1 * f15;
                Modifier modifierM3397s7 = AbstractC1099a.m3397s(c2314t, f115, f115, f115, f16);
                c2306l = C2299e.f9108K;
                c22949e = AbstractC22977m.f90650a;
                i18 = i15;
                textResource5 = textResource4;
                C22994r1 c22994r1M66759a13 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q.m87165m();
                Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q, modifierM3397s7);
                c28655q.m87158i0();
                Function1 function11 = function4;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a13);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m17);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N17);
                f17 = f14 * f14;
                function3 = function11;
                AbstractC15005f3.m43107a(AbstractC29125c.m88500I(AbstractC16272a.f62158t, c28655q, 0), null, AbstractC1102d.m3419p(f17, c2314t), c38072d.m121949b(c28655q, 6).getAccentNegativeTrend(), c28655q, 432, 0);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f16, c2314t));
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(errorMessage, c28655q, i18 & 14), new LayoutWeightElement(1.0f, true), c38072d.m121949b(c28655q, 6).getAccentNegativeTrend(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB2(), null, c28655q, 0, 0, 196600);
                c28655q = c28655q;
                c28655q.m87173q(true);
                if (textResource5 == null) {
                    c28655q.m87150e0(-1894256376);
                    c28655q.m87173q(false);
                    z14 = true;
                    c2314t2 = c2314t;
                    f18 = f16;
                } else {
                    c28655q.m87150e0(-1894256375);
                    Modifier modifierM3398t7 = AbstractC1099a.m3398t(c2314t, 5 * f15, 0.0f, 0.0f, f16, 6);
                    if ((i18 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13) {
                        objM87133R = new C3189a(function3, 9);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C3189a(function3, 9);
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifierM3362g7 = AbstractC1092a.m3362g(modifierM3398t7, false, null, null, (InterfaceC4339a) objM87133R, 15);
                    C22994r1 c22994r1M66759a14 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q.m87165m();
                    Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q, modifierM3362g7);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a14);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m18);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N18);
                    f18 = f16;
                    c2314t2 = c2314t;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource5, c28655q, 0), null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getBtS(), null, c28655q, 0, 0, 196602);
                    c28655q = c28655q;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f18, c2314t2));
                    AbstractC15005f3.m43107a(AbstractC29125c.m88500I(AbstractC16272a.f62140q, c28655q, 0), null, AbstractC1102d.m3419p(f17, c2314t2), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                    z14 = true;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                AbstractC25012a.m73389v(c2314t2, f18, c28655q, z14);
                textResource3 = textResource5;
            } else {
                f14 = f13;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N16);
            f15 = 8;
            float f116 = 2 * f15;
            f16 = 1 * f15;
            Modifier modifierM3397s8 = AbstractC1099a.m3397s(c2314t, f116, f116, f116, f16);
            c2306l = C2299e.f9108K;
            c22949e = AbstractC22977m.f90650a;
            i18 = i15;
            textResource5 = textResource4;
            C22994r1 c22994r1M66759a15 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q.m87165m();
            Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q, modifierM3397s8);
            c28655q.m87158i0();
            Function1 function12 = function4;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a15);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m19);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N19);
            f17 = f14 * f14;
            function3 = function12;
            AbstractC15005f3.m43107a(AbstractC29125c.m88500I(AbstractC16272a.f62158t, c28655q, 0), null, AbstractC1102d.m3419p(f17, c2314t), c38072d.m121949b(c28655q, 6).getAccentNegativeTrend(), c28655q, 432, 0);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f16, c2314t));
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(errorMessage, c28655q, i18 & 14), new LayoutWeightElement(1.0f, true), c38072d.m121949b(c28655q, 6).getAccentNegativeTrend(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB2(), null, c28655q, 0, 0, 196600);
            c28655q = c28655q;
            c28655q.m87173q(true);
            if (textResource5 == null) {
                c28655q.m87150e0(-1894256376);
                c28655q.m87173q(false);
                z14 = true;
                c2314t2 = c2314t;
                f18 = f16;
            } else {
                c28655q.m87150e0(-1894256375);
                Modifier modifierM3398t8 = AbstractC1099a.m3398t(c2314t, 5 * f15, 0.0f, 0.0f, f16, 6);
                if ((i18 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new C3189a(function3, 9);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C3189a(function3, 9);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM3362g8 = AbstractC1092a.m3362g(modifierM3398t8, false, null, null, (InterfaceC4339a) objM87133R, 15);
                C22994r1 c22994r1M66759a16 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q.m87165m();
                Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q, modifierM3362g8);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a16);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m110);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N110);
                f18 = f16;
                c2314t2 = c2314t;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource5, c28655q, 0), null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getBtS(), null, c28655q, 0, 0, 196602);
                c28655q = c28655q;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f18, c2314t2));
                AbstractC15005f3.m43107a(AbstractC29125c.m88500I(AbstractC16272a.f62140q, c28655q, 0), null, AbstractC1102d.m3419p(f17, c2314t2), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                z14 = true;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            AbstractC25012a.m73389v(c2314t2, f18, c28655q, z14);
            textResource3 = textResource5;
        } else {
            c28655q.m87138X();
            textResource3 = textResource2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0085e(errorMessage, textResource3, function3, i13, i14, 26);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m11919e(EnumC3919c it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m11920f(Function1 function1) {
        function1.invoke(EnumC3919c.ERROR_MESSAGE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m11921g(TextResource textResource, TextResource textResource2, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m11918d(textResource, textResource2, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
