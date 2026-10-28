package y80;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import by1.C3696c;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l80.AbstractC23438o;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p098dt.AbstractC12350b;
import p163g1.AbstractC15011f9;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22976l1;
import p291l0.C23010x;
import p291l0.InterfaceC22997s1;
import p294l3.C23285v0;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p635y2.C39077b1;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import wq1.C37508b;
import wr0.C37550r;
import x81.C38072d;
import y41.C39211b;

/* JADX INFO: renamed from: y80.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Ly80/d;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "e", "(Ly80/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39326c {
    /* JADX WARN: Code duplicated, block: B:100:0x034f  */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:37:0x0097  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:51:0x0103  */
    /* JADX WARN: Code duplicated, block: B:54:0x0118  */
    /* JADX WARN: Code duplicated, block: B:55:0x012d  */
    /* JADX WARN: Code duplicated, block: B:58:0x013f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0148  */
    /* JADX WARN: Code duplicated, block: B:63:0x014b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0187  */
    /* JADX WARN: Code duplicated, block: B:68:0x0193  */
    /* JADX WARN: Code duplicated, block: B:69:0x019e  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:80:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:83:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:84:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:86:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:87:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:94:0x0306  */
    /* JADX WARN: Code duplicated, block: B:97:0x0345  */
    /* JADX INFO: renamed from: e */
    public static final void m125304e(C39327d viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        C39327d c39327d;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function3;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        AbstractC22403o abstractC22403oM125310b;
        C39077b1 c39077b1;
        float f13;
        float f14;
        C39077b1 c39077b2;
        C2314t c2314t2;
        C28676v0 c28676v1;
        boolean z13;
        C23454a0 c23454a0;
        boolean z14;
        float f15;
        C2314t c2314t3;
        int i16;
        TextResource textResourceM125309a;
        C2314t c2314t4;
        boolean z15;
        boolean z16;
        Object objM87133R;
        Function1 function4;
        InterfaceC35689r0 interfaceC35689r0M125311c;
        float f16;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(944792023);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C39211b(12);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function3 = (Function1) objM87133R2;
                } else {
                    function3 = function2;
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3407d2);
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
                abstractC22403oM125310b = viewState.getImage();
                c39077b1 = C39102j.f168200b;
                if (abstractC22403oM125310b == null) {
                    c28655q.m87150e0(381117377);
                    c28655q.m87173q(false);
                    c23454a0 = null;
                    c2314t2 = c2314t;
                    c28676v1 = c28676v0;
                    c39077b2 = c39077b1;
                    z13 = false;
                    f13 = 1.0f;
                } else {
                    c28655q.m87150e0(381117378);
                    f13 = 1.0f;
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f14 = Float.MAX_VALUE;
                    } else {
                        f14 = 1.0f;
                    }
                    Modifier modifierMo3471e = modifierM3409f.mo3471e(new LayoutWeightElement(f14, true));
                    c39077b2 = c39077b1;
                    c2314t2 = c2314t;
                    c28676v1 = c28676v0;
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM125310b, null, null, c28655q, AbstractC22403o.f87638a, 3), null, modifierMo3471e, null, c39077b2, 0.0f, null, c28655q, 24624, 104);
                    c28655q = c28655q;
                    z13 = false;
                    c28655q.m87173q(false);
                    c23454a0 = C23454a0.f92919a;
                }
                if (c23454a0 == null) {
                    c28655q.m87150e0(381467864);
                    interfaceC35689r0M125311c = viewState.getLottie();
                    if (interfaceC35689r0M125311c == null) {
                        c28655q.m87150e0(381467863);
                        c28655q.m87173q(z13);
                        z14 = z13;
                    } else {
                        c28655q.m87150e0(381467864);
                        Modifier modifierM3409f2 = AbstractC1102d.m3409f(f13, c2314t2);
                        if (f13 <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (f13 > Float.MAX_VALUE) {
                            f16 = Float.MAX_VALUE;
                        } else {
                            f16 = f13;
                        }
                        z14 = z13;
                        AbstractC35684p.m113047h(modifierM3409f2.mo3471e(new LayoutWeightElement(f16, true)), interfaceC35689r0M125311c, false, 0.0f, 0, null, null, c39077b2, null, c28655q, 12582912, 380);
                        c28655q.m87173q(z14);
                    }
                    c28655q.m87173q(z14);
                } else {
                    z14 = z13;
                    c28655q.m87150e0(-957537442);
                    c28655q.m87173q(z14);
                }
                float f17 = 8;
                f15 = ((float) 2.5d) * f17;
                c2314t3 = c2314t2;
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t3, f15, 0.0f, f15, 0.0f, 10);
                TextResource textResourceM125314g = viewState.getTitle();
                int i18 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(textResourceM125314g, c28655q, i18);
                C38072d c38072d = C38072d.f163053a;
                int i19 = C38072d.f163054b;
                C2886a c2886aM8417O = c38072d.m121952e(c28655q, i19).getT2();
                long brandWhite = c38072d.m121949b(c28655q, i19).getBrandWhite();
                int i24 = C2886a.f11498d << 18;
                C28655q c28655q2 = c28655q;
                i16 = i15;
                AbstractC30795n.m94707h(strM21274h, modifierM3398t, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O, null, c28655q2, 48, i24, 196600);
                AbstractC11266d.m30469w(1, f17, c2314t3, c28655q2);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSubTitle(), c28655q2, i18), AbstractC1099a.m3398t(c2314t3, f15, 0.0f, f15, 0.0f, 10), c38072d.m121949b(c28655q2, i19).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i19).getB1(), null, c28655q2, 48, i24, 196600);
                c28655q = c28655q2;
                textResourceM125309a = viewState.getCtaText();
                if (textResourceM125309a == null) {
                    c28655q.m87150e0(382460979);
                    c28655q.m87173q(false);
                    c39327d = viewState;
                    c2314t4 = c2314t3;
                } else {
                    c28655q.m87150e0(382460980);
                    Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t3, f15, 0.0f, f15, 0.0f, 10);
                    c2314t4 = c2314t3;
                    C22976l1 c22976l1M3379a = AbstractC1099a.m3379a(0.0f, 0.0f, 3);
                    c39327d = viewState;
                    boolean zM87157i = c28655q.m87157i(c39327d);
                    if ((i16 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zM87157i | z15;
                    objM87133R = c28655q.m87133R();
                    if (!z16 || objM87133R == c28676v1) {
                        function4 = function3;
                        objM87133R = new C37550r(17, c39327d, function4);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        function4 = function3;
                    }
                    function3 = function4;
                    AbstractC12350b.m34583d((InterfaceC4339a) objM87133R, modifierM3398t2, false, null, null, null, c22976l1M3379a, AbstractC37817c.m121344e(757912185, c28655q, new C3696c(textResourceM125309a, 5)), c28655q, 905969712, 252);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                AbstractC25012a.m73388u(13, f17, c2314t4, c28655q, true);
                c28655q.m87173q(true);
                function2 = function3;
            } else {
                c39327d = viewState;
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C37508b(c39327d, i13, function2, i14, 19);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C39211b(12);
                    c28655q.m87172p0(objM87133R2);
                }
                function3 = (Function1) objM87133R2;
            } else {
                function3 = function2;
            }
            c2314t = C2314t.f9131w;
            Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3407d3);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d2);
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
            Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, c2314t);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q, 6);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3407d4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            abstractC22403oM125310b = viewState.getImage();
            c39077b1 = C39102j.f168200b;
            if (abstractC22403oM125310b == null) {
                c28655q.m87150e0(381117377);
                c28655q.m87173q(false);
                c23454a0 = null;
                c2314t2 = c2314t;
                c28676v1 = c28676v0;
                c39077b2 = c39077b1;
                z13 = false;
                f13 = 1.0f;
            } else {
                c28655q.m87150e0(381117378);
                f13 = 1.0f;
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f14 = Float.MAX_VALUE;
                } else {
                    f14 = 1.0f;
                }
                Modifier modifierMo3471e2 = modifierM3409f3.mo3471e(new LayoutWeightElement(f14, true));
                c39077b2 = c39077b1;
                c2314t2 = c2314t;
                c28676v1 = c28676v0;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM125310b, null, null, c28655q, AbstractC22403o.f87638a, 3), null, modifierMo3471e2, null, c39077b2, 0.0f, null, c28655q, 24624, 104);
                c28655q = c28655q;
                z13 = false;
                c28655q.m87173q(false);
                c23454a0 = C23454a0.f92919a;
            }
            if (c23454a0 == null) {
                c28655q.m87150e0(381467864);
                interfaceC35689r0M125311c = viewState.getLottie();
                if (interfaceC35689r0M125311c == null) {
                    c28655q.m87150e0(381467863);
                    c28655q.m87173q(z13);
                    z14 = z13;
                } else {
                    c28655q.m87150e0(381467864);
                    Modifier modifierM3409f4 = AbstractC1102d.m3409f(f13, c2314t2);
                    if (f13 <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (f13 > Float.MAX_VALUE) {
                        f16 = Float.MAX_VALUE;
                    } else {
                        f16 = f13;
                    }
                    z14 = z13;
                    AbstractC35684p.m113047h(modifierM3409f4.mo3471e(new LayoutWeightElement(f16, true)), interfaceC35689r0M125311c, false, 0.0f, 0, null, null, c39077b2, null, c28655q, 12582912, 380);
                    c28655q.m87173q(z14);
                }
                c28655q.m87173q(z14);
            } else {
                z14 = z13;
                c28655q.m87150e0(-957537442);
                c28655q.m87173q(z14);
            }
            float f18 = 8;
            f15 = ((float) 2.5d) * f18;
            c2314t3 = c2314t2;
            Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t3, f15, 0.0f, f15, 0.0f, 10);
            TextResource textResourceM125314g2 = viewState.getTitle();
            int i110 = TextResource.$stable;
            String strM21274h2 = AbstractC8693b.m21274h(textResourceM125314g2, c28655q, i110);
            C38072d c38072d2 = C38072d.f163053a;
            int i111 = C38072d.f163054b;
            C2886a c2886aM8417O2 = c38072d2.m121952e(c28655q, i111).getT2();
            long brandWhite2 = c38072d2.m121949b(c28655q, i111).getBrandWhite();
            int i25 = C2886a.f11498d << 18;
            C28655q c28655q3 = c28655q;
            i16 = i15;
            AbstractC30795n.m94707h(strM21274h2, modifierM3398t3, brandWhite2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O2, null, c28655q3, 48, i25, 196600);
            AbstractC11266d.m30469w(1, f18, c2314t3, c28655q3);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSubTitle(), c28655q3, i110), AbstractC1099a.m3398t(c2314t3, f15, 0.0f, f15, 0.0f, 10), c38072d2.m121949b(c28655q3, i111).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q3, i111).getB1(), null, c28655q3, 48, i25, 196600);
            c28655q = c28655q3;
            textResourceM125309a = viewState.getCtaText();
            if (textResourceM125309a == null) {
                c28655q.m87150e0(382460979);
                c28655q.m87173q(false);
                c39327d = viewState;
                c2314t4 = c2314t3;
            } else {
                c28655q.m87150e0(382460980);
                Modifier modifierM3398t4 = AbstractC1099a.m3398t(c2314t3, f15, 0.0f, f15, 0.0f, 10);
                c2314t4 = c2314t3;
                C22976l1 c22976l1M3379a2 = AbstractC1099a.m3379a(0.0f, 0.0f, 3);
                c39327d = viewState;
                boolean zM87157i2 = c28655q.m87157i(c39327d);
                if ((i16 & 112) == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zM87157i2 | z15;
                objM87133R = c28655q.m87133R();
                if (z16) {
                    function4 = function3;
                    objM87133R = new C37550r(17, c39327d, function4);
                    c28655q.m87172p0(objM87133R);
                } else {
                    function4 = function3;
                    objM87133R = new C37550r(17, c39327d, function4);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = function4;
                AbstractC12350b.m34583d((InterfaceC4339a) objM87133R, modifierM3398t4, false, null, null, null, c22976l1M3379a2, AbstractC37817c.m121344e(757912185, c28655q, new C3696c(textResourceM125309a, 5)), c28655q, 905969712, 252);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            AbstractC25012a.m73388u(13, f18, c2314t4, c28655q, true);
            c28655q.m87173q(true);
            function2 = function3;
        } else {
            c39327d = viewState;
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37508b(c39327d, i13, function2, i14, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m125305f(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m125306g(C39327d c39327d, Function1 function1) {
        C9598e c9598eM125312e = c39327d.getNavigationAction();
        if (c9598eM125312e != null) {
            function1.invoke(new AbstractC23438o.a(c9598eM125312e));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m125307h(TextResource textResource, InterfaceC22997s1 TextButton, Composer composer, int i13) {
        AbstractC22676k.m65750j(TextButton, "$this$TextButton");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC15011f9.m43114b(AbstractC8693b.m21274h(textResource, c28655q, TextResource.$stable), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C23285v0.m67363a(C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getBtS().getStyle(), C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4278227943L)), new C17919x(AbstractC17918w0.m51517e(4283210713L)), new C17919x(AbstractC17918w0.m51517e(4284923135L))), 0L, 0L, 14), 0L, null, null, 0L, 33554430), c28655q, 0, 0, 65534);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m125308i(C39327d c39327d, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m125304e(c39327d, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
