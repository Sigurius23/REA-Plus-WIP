package nr2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import gy0.AbstractC16277f;
import java.io.IOException;
import kc2.C22351a;
import kc2.C22359i;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import m31.C25002h;
import mi2.C25592o;
import no2.C26995a;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p238j0.C21084j;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
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
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.AbstractC24681m;
import p717lq2.AbstractC24688t;
import p717lq2.C24679k;
import p717lq2.EnumC24674f;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;
import yp2.AbstractC39704a;
import yp2.AbstractC39706c;

/* JADX INFO: renamed from: nr2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a=\u0010\b\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lkc2/i;", "viewState", "Lkotlin/Function0;", "Ll83/a0;", "onCloseClicked", "Lkotlin/Function1;", "", "showShareSheet", "e", "(Lkc2/i;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27079a {
    /* JADX WARN: Code duplicated, block: B:103:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:107:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:110:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:113:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:55:0x013d  */
    /* JADX WARN: Code duplicated, block: B:56:0x013f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0146  */
    /* JADX WARN: Code duplicated, block: B:62:0x014b  */
    /* JADX WARN: Code duplicated, block: B:66:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:67:0x01db  */
    /* JADX WARN: Code duplicated, block: B:69:0x020c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0210  */
    /* JADX WARN: Code duplicated, block: B:73:0x021f  */
    /* JADX WARN: Code duplicated, block: B:75:0x022d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0278  */
    /* JADX WARN: Code duplicated, block: B:80:0x027e  */
    /* JADX WARN: Code duplicated, block: B:83:0x030b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0311  */
    /* JADX WARN: Code duplicated, block: B:88:0x0395  */
    /* JADX WARN: Code duplicated, block: B:89:0x0397  */
    /* JADX WARN: Code duplicated, block: B:92:0x039d  */
    /* JADX WARN: Code duplicated, block: B:94:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:97:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:99:0x03ae  */
    /* JADX INFO: renamed from: e */
    public static final void m81447e(C22359i c22359i, InterfaceC4339a interfaceC4339a, Function1 showShareSheet, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        boolean z4;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        int iHashCode;
        C2314t c2314t;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        boolean z13;
        Object objM87133R;
        C28676v0 c28676v1;
        float f13;
        float f14;
        float f15;
        C38072d c38072d;
        int i16;
        int iHashCode2;
        C22351a c22351aM64271a;
        TextResource textResourceM21267a;
        C22351a c22351aM64271a2;
        TextResource textResourceM21267a2;
        boolean z14;
        C22359i c22359i2;
        boolean z15;
        boolean z16;
        Object objM87133R2;
        boolean z17;
        Object objM87133R3;
        int i17;
        AbstractC22676k.m65750j(showShareSheet, "showShareSheet");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-153196477);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(c22359i) : c28655q.m87157i(c22359i) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q.m87157i(interfaceC4339a2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q.m87157i(showShareSheet)) {
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
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C26995a(11);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                c2314t = C2314t.f9131w;
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                AbstractC22989q.m66760a(AbstractC24681m.m72133h(AbstractC1102d.m3407d(1.0f, c2314t), new AbstractC24688t.a(EnumC24674f.PRIMARY)), c28655q, 0);
                InterfaceC4339a interfaceC4339a5 = interfaceC4339a4;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(new AbstractC22403o.a(AbstractC39704a.f170901f), null, null, c28655q, AbstractC22403o.a.f87639c, 3), null, AbstractC1102d.m3407d(1.0f, c2314t), null, C39102j.f168199a, 0.0f, null, c28655q, 25008, 104);
                c28655q = c28655q;
                C21084j c21084j = new C21084j();
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    c28676v1 = c28676v0;
                } else {
                    c28676v1 = c28676v0;
                    if (objM87133R == c28676v1) {
                    }
                    f13 = 8;
                    f14 = 4;
                    f15 = f13 * f14;
                    Modifier modifierMo3400a = C1100b.f4583a.mo3400a(AbstractC1102d.m3419p(f15, AbstractC1099a.m3394p(((float) 2.5d) * f13, AbstractC1092a.m3360e(c2314t, c21084j, null, false, null, (InterfaceC4339a) objM87133R, 28))), C2299e.f9116y);
                    c38072d = C38072d.f163053a;
                    C27430e c27430eM107874S = AbstractC34132o.m107874S(c38072d.m121951d().getAction().getCross(), c28655q, 6);
                    String strM21273g = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0);
                    C28676v0 c28676v2 = c28676v1;
                    i16 = C38072d.f163054b;
                    AbstractC15005f3.m43108b(c27430eM107874S, strM21273g, modifierMo3400a, c38072d.m121949b(c28655q, i16).getBrandWhite(), c28655q, 0, 0);
                    if (c22359i == null) {
                        c28655q.m87150e0(245867623);
                        c28655q.m87173q(false);
                        z17 = true;
                    } else {
                        c28655q.m87150e0(245867624);
                        Modifier modifierM3394p = AbstractC1099a.m3394p(f15, AbstractC1102d.m3407d(1.0f, c2314t));
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9111N, c28655q, 54);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
                        float f16 = 10;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getGrowth().getReferral(), c28655q, 6), null, AbstractC1102d.m3419p(f16 * f14, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * f13, 7)), c38072d.m121949b(c28655q, i16).getWhite50(), c28655q, 432, 0);
                        c22351aM64271a = c22359i.getHub();
                        if (c22351aM64271a != null || (textResourceM21267a = c22351aM64271a.getTitle()) == null) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                        }
                        int i19 = TextResource.$stable;
                        String strM21274h = AbstractC8693b.m21274h(textResourceM21267a, c28655q, i19);
                        long jM125430y = c38072d.m121949b(c28655q, i16).getBrandWhite();
                        C2886a c2886aM8416N = c38072d.m121952e(c28655q, i16).getT1();
                        Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1 * f13, 7);
                        C36775k c36775k = new C36775k(3);
                        int i24 = C2886a.f11498d << 18;
                        AbstractC30795n.m94707h(strM21274h, modifierM3398t, jM125430y, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, c2886aM8416N, null, c28655q, 48, i24, 196088);
                        c22351aM64271a2 = c22359i.getHub();
                        if (c22351aM64271a2 != null || (textResourceM21267a2 = c22351aM64271a2.getBody()) == null) {
                            textResourceM21267a2 = AbstractC8693b.m21267a();
                        }
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM21267a2, c28655q, i19), AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, ((float) 6.5d) * f13, 7), c38072d.m121949b(c28655q, i16).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB1(), null, c28655q, 48, i24, 196088);
                        EnumC27284v enumC27284v = EnumC27284v.TextLarge;
                        String strM21273g2 = AbstractC8693b.m21273g(AbstractC39706c.f170906D, c28655q, 0);
                        long jM125430y2 = c38072d.m121949b(c28655q, i16).getBrandWhite();
                        Modifier modifierM82299o = AbstractC27282u.m82299o(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f16 * f13, 7), AbstractC15673b0.m43981E0());
                        if ((i15 & 896) == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((i15 & 14) != 4) {
                            if ((i15 & 8) != 0) {
                                c22359i2 = c22359i;
                                if (c28655q.m87157i(c22359i2)) {
                                }
                                z16 = z15 | z14;
                                objM87133R2 = c28655q.m87133R();
                                if (z16 || objM87133R2 == c28676v2) {
                                    objM87133R2 = new C25592o(10, showShareSheet, c22359i2);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                AbstractC27282u.m82292h(modifierM82299o, enumC27284v, strM21273g2, false, jM125430y2, null, false, (InterfaceC4339a) objM87133R2, c28655q, 48, 104);
                                c28655q = c28655q;
                                z17 = true;
                                c28655q.m87173q(true);
                                c28655q.m87173q(false);
                            } else {
                                c22359i2 = c22359i;
                            }
                            z15 = false;
                            z16 = z15 | z14;
                            objM87133R2 = c28655q.m87133R();
                            if (z16) {
                                objM87133R2 = new C25592o(10, showShareSheet, c22359i2);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C25592o(10, showShareSheet, c22359i2);
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC27282u.m82292h(modifierM82299o, enumC27284v, strM21273g2, false, jM125430y2, null, false, (InterfaceC4339a) objM87133R2, c28655q, 48, 104);
                            c28655q = c28655q;
                            z17 = true;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        } else {
                            c22359i2 = c22359i;
                        }
                        z15 = true;
                        z16 = z15 | z14;
                        objM87133R2 = c28655q.m87133R();
                        if (z16) {
                            objM87133R2 = new C25592o(10, showShareSheet, c22359i2);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C25592o(10, showShareSheet, c22359i2);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC27282u.m82292h(modifierM82299o, enumC27284v, strM21273g2, false, jM125430y2, null, false, (InterfaceC4339a) objM87133R2, c28655q, 48, 104);
                        c28655q = c28655q;
                        z17 = true;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z17);
                    interfaceC4339a3 = interfaceC4339a5;
                }
                objM87133R = new C24679k(interfaceC4339a5, 15);
                c28655q.m87172p0(objM87133R);
                f13 = 8;
                f14 = 4;
                f15 = f13 * f14;
                Modifier modifierMo3400a2 = C1100b.f4583a.mo3400a(AbstractC1102d.m3419p(f15, AbstractC1099a.m3394p(((float) 2.5d) * f13, AbstractC1092a.m3360e(c2314t, c21084j, null, false, null, (InterfaceC4339a) objM87133R, 28))), C2299e.f9116y);
                c38072d = C38072d.f163053a;
                C27430e c27430eM107874S2 = AbstractC34132o.m107874S(c38072d.m121951d().getAction().getCross(), c28655q, 6);
                String strM21273g3 = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0);
                C28676v0 c28676v3 = c28676v1;
                i16 = C38072d.f163054b;
                AbstractC15005f3.m43108b(c27430eM107874S2, strM21273g3, modifierMo3400a2, c38072d.m121949b(c28655q, i16).getBrandWhite(), c28655q, 0, 0);
                if (c22359i == null) {
                    c28655q.m87150e0(245867623);
                    c28655q.m87173q(false);
                    z17 = true;
                } else {
                    c28655q.m87150e0(245867624);
                    Modifier modifierM3394p2 = AbstractC1099a.m3394p(f15, AbstractC1102d.m3407d(1.0f, c2314t));
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9111N, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                    float f17 = 10;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getGrowth().getReferral(), c28655q, 6), null, AbstractC1102d.m3419p(f17 * f14, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * f13, 7)), c38072d.m121949b(c28655q, i16).getWhite50(), c28655q, 432, 0);
                    c22351aM64271a = c22359i.getHub();
                    if (c22351aM64271a != null) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    } else {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    }
                    int i110 = TextResource.$stable;
                    String strM21274h2 = AbstractC8693b.m21274h(textResourceM21267a, c28655q, i110);
                    long jM125430y3 = c38072d.m121949b(c28655q, i16).getBrandWhite();
                    C2886a c2886aM8416N2 = c38072d.m121952e(c28655q, i16).getT1();
                    Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1 * f13, 7);
                    C36775k c36775k2 = new C36775k(3);
                    int i25 = C2886a.f11498d << 18;
                    AbstractC30795n.m94707h(strM21274h2, modifierM3398t2, jM125430y3, 0L, null, null, null, 0L, null, c36775k2, 0L, 0, false, 0, 0, null, c2886aM8416N2, null, c28655q, 48, i25, 196088);
                    c22351aM64271a2 = c22359i.getHub();
                    if (c22351aM64271a2 != null) {
                        textResourceM21267a2 = AbstractC8693b.m21267a();
                    } else {
                        textResourceM21267a2 = AbstractC8693b.m21267a();
                    }
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM21267a2, c28655q, i110), AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, ((float) 6.5d) * f13, 7), c38072d.m121949b(c28655q, i16).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB1(), null, c28655q, 48, i25, 196088);
                    EnumC27284v enumC27284v2 = EnumC27284v.TextLarge;
                    String strM21273g4 = AbstractC8693b.m21273g(AbstractC39706c.f170906D, c28655q, 0);
                    long jM125430y4 = c38072d.m121949b(c28655q, i16).getBrandWhite();
                    Modifier modifierM82299o2 = AbstractC27282u.m82299o(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f17 * f13, 7), AbstractC15673b0.m43981E0());
                    if ((i15 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i15 & 14) != 4) {
                        if ((i15 & 8) != 0) {
                            c22359i2 = c22359i;
                            if (c28655q.m87157i(c22359i2)) {
                            }
                            z16 = z15 | z14;
                            objM87133R2 = c28655q.m87133R();
                            if (z16) {
                                objM87133R2 = new C25592o(10, showShareSheet, c22359i2);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C25592o(10, showShareSheet, c22359i2);
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC27282u.m82292h(modifierM82299o2, enumC27284v2, strM21273g4, false, jM125430y4, null, false, (InterfaceC4339a) objM87133R2, c28655q, 48, 104);
                            c28655q = c28655q;
                            z17 = true;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        } else {
                            c22359i2 = c22359i;
                        }
                        z15 = false;
                        z16 = z15 | z14;
                        objM87133R2 = c28655q.m87133R();
                        if (z16) {
                            objM87133R2 = new C25592o(10, showShareSheet, c22359i2);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C25592o(10, showShareSheet, c22359i2);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC27282u.m82292h(modifierM82299o2, enumC27284v2, strM21273g4, false, jM125430y4, null, false, (InterfaceC4339a) objM87133R2, c28655q, 48, 104);
                        c28655q = c28655q;
                        z17 = true;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        c22359i2 = c22359i;
                    }
                    z15 = true;
                    z16 = z15 | z14;
                    objM87133R2 = c28655q.m87133R();
                    if (z16) {
                        objM87133R2 = new C25592o(10, showShareSheet, c22359i2);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C25592o(10, showShareSheet, c22359i2);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC27282u.m82292h(modifierM82299o2, enumC27284v2, strM21273g4, false, jM125430y4, null, false, (InterfaceC4339a) objM87133R2, c28655q, 48, 104);
                    c28655q = c28655q;
                    z17 = true;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z17);
                interfaceC4339a3 = interfaceC4339a5;
            } else {
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C25002h(c22359i, interfaceC4339a3, showShareSheet, i13, i14, 23);
            }
        }
        i15 |= 48;
        interfaceC4339a2 = interfaceC4339a;
        if ((i13 & 384) == 0) {
            if (c28655q.m87157i(showShareSheet)) {
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
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C26995a(11);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            c2314t = C2314t.f9131w;
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
            c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
            AbstractC22989q.m66760a(AbstractC24681m.m72133h(AbstractC1102d.m3407d(1.0f, c2314t), new AbstractC24688t.a(EnumC24674f.PRIMARY)), c28655q, 0);
            InterfaceC4339a interfaceC4339a6 = interfaceC4339a4;
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(new AbstractC22403o.a(AbstractC39704a.f170901f), null, null, c28655q, AbstractC22403o.a.f87639c, 3), null, AbstractC1102d.m3407d(1.0f, c2314t), null, C39102j.f168199a, 0.0f, null, c28655q, 25008, 104);
            c28655q = c28655q;
            C21084j c21084j2 = new C21084j();
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q.m87133R();
            if (z13) {
                c28676v1 = c28676v0;
                if (objM87133R == c28676v1) {
                }
                f13 = 8;
                f14 = 4;
                f15 = f13 * f14;
                Modifier modifierMo3400a3 = C1100b.f4583a.mo3400a(AbstractC1102d.m3419p(f15, AbstractC1099a.m3394p(((float) 2.5d) * f13, AbstractC1092a.m3360e(c2314t, c21084j2, null, false, null, (InterfaceC4339a) objM87133R, 28))), C2299e.f9116y);
                c38072d = C38072d.f163053a;
                C27430e c27430eM107874S3 = AbstractC34132o.m107874S(c38072d.m121951d().getAction().getCross(), c28655q, 6);
                String strM21273g5 = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0);
                C28676v0 c28676v4 = c28676v1;
                i16 = C38072d.f163054b;
                AbstractC15005f3.m43108b(c27430eM107874S3, strM21273g5, modifierMo3400a3, c38072d.m121949b(c28655q, i16).getBrandWhite(), c28655q, 0, 0);
                if (c22359i == null) {
                    c28655q.m87150e0(245867623);
                    c28655q.m87173q(false);
                    z17 = true;
                } else {
                    c28655q.m87150e0(245867624);
                    Modifier modifierM3394p3 = AbstractC1099a.m3394p(f15, AbstractC1102d.m3407d(1.0f, c2314t));
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9111N, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3394p3);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m5);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N5);
                    float f18 = 10;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getGrowth().getReferral(), c28655q, 6), null, AbstractC1102d.m3419p(f18 * f14, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * f13, 7)), c38072d.m121949b(c28655q, i16).getWhite50(), c28655q, 432, 0);
                    c22351aM64271a = c22359i.getHub();
                    if (c22351aM64271a != null) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    } else {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    }
                    int i111 = TextResource.$stable;
                    String strM21274h3 = AbstractC8693b.m21274h(textResourceM21267a, c28655q, i111);
                    long jM125430y5 = c38072d.m121949b(c28655q, i16).getBrandWhite();
                    C2886a c2886aM8416N3 = c38072d.m121952e(c28655q, i16).getT1();
                    Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1 * f13, 7);
                    C36775k c36775k3 = new C36775k(3);
                    int i26 = C2886a.f11498d << 18;
                    AbstractC30795n.m94707h(strM21274h3, modifierM3398t3, jM125430y5, 0L, null, null, null, 0L, null, c36775k3, 0L, 0, false, 0, 0, null, c2886aM8416N3, null, c28655q, 48, i26, 196088);
                    c22351aM64271a2 = c22359i.getHub();
                    if (c22351aM64271a2 != null) {
                        textResourceM21267a2 = AbstractC8693b.m21267a();
                    } else {
                        textResourceM21267a2 = AbstractC8693b.m21267a();
                    }
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM21267a2, c28655q, i111), AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, ((float) 6.5d) * f13, 7), c38072d.m121949b(c28655q, i16).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB1(), null, c28655q, 48, i26, 196088);
                    EnumC27284v enumC27284v3 = EnumC27284v.TextLarge;
                    String strM21273g6 = AbstractC8693b.m21273g(AbstractC39706c.f170906D, c28655q, 0);
                    long jM125430y6 = c38072d.m121949b(c28655q, i16).getBrandWhite();
                    Modifier modifierM82299o3 = AbstractC27282u.m82299o(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f18 * f13, 7), AbstractC15673b0.m43981E0());
                    if ((i15 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i15 & 14) != 4) {
                        if ((i15 & 8) != 0) {
                            c22359i2 = c22359i;
                            if (c28655q.m87157i(c22359i2)) {
                            }
                            z16 = z15 | z14;
                            objM87133R2 = c28655q.m87133R();
                            if (z16) {
                                objM87133R2 = new C25592o(10, showShareSheet, c22359i2);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C25592o(10, showShareSheet, c22359i2);
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC27282u.m82292h(modifierM82299o3, enumC27284v3, strM21273g6, false, jM125430y6, null, false, (InterfaceC4339a) objM87133R2, c28655q, 48, 104);
                            c28655q = c28655q;
                            z17 = true;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        } else {
                            c22359i2 = c22359i;
                        }
                        z15 = false;
                        z16 = z15 | z14;
                        objM87133R2 = c28655q.m87133R();
                        if (z16) {
                            objM87133R2 = new C25592o(10, showShareSheet, c22359i2);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C25592o(10, showShareSheet, c22359i2);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC27282u.m82292h(modifierM82299o3, enumC27284v3, strM21273g6, false, jM125430y6, null, false, (InterfaceC4339a) objM87133R2, c28655q, 48, 104);
                        c28655q = c28655q;
                        z17 = true;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        c22359i2 = c22359i;
                    }
                    z15 = true;
                    z16 = z15 | z14;
                    objM87133R2 = c28655q.m87133R();
                    if (z16) {
                        objM87133R2 = new C25592o(10, showShareSheet, c22359i2);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C25592o(10, showShareSheet, c22359i2);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC27282u.m82292h(modifierM82299o3, enumC27284v3, strM21273g6, false, jM125430y6, null, false, (InterfaceC4339a) objM87133R2, c28655q, 48, 104);
                    c28655q = c28655q;
                    z17 = true;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z17);
                interfaceC4339a3 = interfaceC4339a6;
            } else {
                c28676v1 = c28676v0;
            }
            objM87133R = new C24679k(interfaceC4339a6, 15);
            c28655q.m87172p0(objM87133R);
            f13 = 8;
            f14 = 4;
            f15 = f13 * f14;
            Modifier modifierMo3400a4 = C1100b.f4583a.mo3400a(AbstractC1102d.m3419p(f15, AbstractC1099a.m3394p(((float) 2.5d) * f13, AbstractC1092a.m3360e(c2314t, c21084j2, null, false, null, (InterfaceC4339a) objM87133R, 28))), C2299e.f9116y);
            c38072d = C38072d.f163053a;
            C27430e c27430eM107874S4 = AbstractC34132o.m107874S(c38072d.m121951d().getAction().getCross(), c28655q, 6);
            String strM21273g7 = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0);
            C28676v0 c28676v5 = c28676v1;
            i16 = C38072d.f163054b;
            AbstractC15005f3.m43108b(c27430eM107874S4, strM21273g7, modifierMo3400a4, c38072d.m121949b(c28655q, i16).getBrandWhite(), c28655q, 0, 0);
            if (c22359i == null) {
                c28655q.m87150e0(245867623);
                c28655q.m87173q(false);
                z17 = true;
            } else {
                c28655q.m87150e0(245867624);
                Modifier modifierM3394p4 = AbstractC1099a.m3394p(f15, AbstractC1102d.m3407d(1.0f, c2314t));
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9111N, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3394p4);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N6);
                float f19 = 10;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getGrowth().getReferral(), c28655q, 6), null, AbstractC1102d.m3419p(f19 * f14, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * f13, 7)), c38072d.m121949b(c28655q, i16).getWhite50(), c28655q, 432, 0);
                c22351aM64271a = c22359i.getHub();
                if (c22351aM64271a != null) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                } else {
                    textResourceM21267a = AbstractC8693b.m21267a();
                }
                int i112 = TextResource.$stable;
                String strM21274h4 = AbstractC8693b.m21274h(textResourceM21267a, c28655q, i112);
                long jM125430y7 = c38072d.m121949b(c28655q, i16).getBrandWhite();
                C2886a c2886aM8416N4 = c38072d.m121952e(c28655q, i16).getT1();
                Modifier modifierM3398t4 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1 * f13, 7);
                C36775k c36775k4 = new C36775k(3);
                int i27 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h4, modifierM3398t4, jM125430y7, 0L, null, null, null, 0L, null, c36775k4, 0L, 0, false, 0, 0, null, c2886aM8416N4, null, c28655q, 48, i27, 196088);
                c22351aM64271a2 = c22359i.getHub();
                if (c22351aM64271a2 != null) {
                    textResourceM21267a2 = AbstractC8693b.m21267a();
                } else {
                    textResourceM21267a2 = AbstractC8693b.m21267a();
                }
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM21267a2, c28655q, i112), AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, ((float) 6.5d) * f13, 7), c38072d.m121949b(c28655q, i16).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB1(), null, c28655q, 48, i27, 196088);
                EnumC27284v enumC27284v4 = EnumC27284v.TextLarge;
                String strM21273g8 = AbstractC8693b.m21273g(AbstractC39706c.f170906D, c28655q, 0);
                long jM125430y8 = c38072d.m121949b(c28655q, i16).getBrandWhite();
                Modifier modifierM82299o4 = AbstractC27282u.m82299o(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f19 * f13, 7), AbstractC15673b0.m43981E0());
                if ((i15 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((i15 & 14) != 4) {
                    if ((i15 & 8) != 0) {
                        c22359i2 = c22359i;
                        if (c28655q.m87157i(c22359i2)) {
                        }
                        z16 = z15 | z14;
                        objM87133R2 = c28655q.m87133R();
                        if (z16) {
                            objM87133R2 = new C25592o(10, showShareSheet, c22359i2);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C25592o(10, showShareSheet, c22359i2);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC27282u.m82292h(modifierM82299o4, enumC27284v4, strM21273g8, false, jM125430y8, null, false, (InterfaceC4339a) objM87133R2, c28655q, 48, 104);
                        c28655q = c28655q;
                        z17 = true;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        c22359i2 = c22359i;
                    }
                    z15 = false;
                    z16 = z15 | z14;
                    objM87133R2 = c28655q.m87133R();
                    if (z16) {
                        objM87133R2 = new C25592o(10, showShareSheet, c22359i2);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C25592o(10, showShareSheet, c22359i2);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC27282u.m82292h(modifierM82299o4, enumC27284v4, strM21273g8, false, jM125430y8, null, false, (InterfaceC4339a) objM87133R2, c28655q, 48, 104);
                    c28655q = c28655q;
                    z17 = true;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    c22359i2 = c22359i;
                }
                z15 = true;
                z16 = z15 | z14;
                objM87133R2 = c28655q.m87133R();
                if (z16) {
                    objM87133R2 = new C25592o(10, showShareSheet, c22359i2);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C25592o(10, showShareSheet, c22359i2);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC27282u.m82292h(modifierM82299o4, enumC27284v4, strM21273g8, false, jM125430y8, null, false, (InterfaceC4339a) objM87133R2, c28655q, 48, 104);
                c28655q = c28655q;
                z17 = true;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z17);
            interfaceC4339a3 = interfaceC4339a6;
        } else {
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25002h(c22359i, interfaceC4339a3, showShareSheet, i13, i14, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m81448f() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m81449g(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m81450h(Function1 function1, C22359i c22359i) {
        function1.invoke(c22359i.getShareMessage());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m81451i(C22359i c22359i, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m81447e(c22359i, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
