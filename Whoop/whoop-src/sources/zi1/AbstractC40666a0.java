package zi1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b30.C2626t2;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import e93.AbstractC12889b;
import java.io.IOException;
import kd1.C22411w;
import l83.C23454a0;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p208i2.C17903p;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p748zc1.C40349h7;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import ti1.AbstractC33852d;
import wb3.AbstractC37056f;
import x81.C38072d;
import xi1.InterfaceC38321a;
import yi1.C39581o;
import yo1.C39689b;
import z51.C40103n;

/* JADX INFO: renamed from: zi1.a0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lyi1/o;", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "e", "(Landroidx/compose/ui/Modifier;Lyi1/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "kennel_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40666a0 {
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    /* JADX WARN: Code duplicated, block: B:53:0x009f  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:74:0x012d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0137  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final void m132002e(Modifier modifier, C39581o itemState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        boolean z13;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Modifier modifierM3362g;
        C28676v0 c28676v0;
        Function1 function4;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(itemState, "itemState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1323005452);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(itemState) : c28655q.m87157i(itemState) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            z4 = true;
            if ((i15 & 147) != 146) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                modifierM3362g = C2314t.f9131w;
                if (i16 != 0) {
                    modifier2 = modifierM3362g;
                }
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C40349h7(26);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                if (itemState.getDestination() != null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14) {
                    c28655q.m87150e0(-1259240338);
                    if ((i15 & 896) == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if ((i15 & 112) != 32 && ((i15 & 64) == 0 || !c28655q.m87157i(itemState))) {
                        z4 = false;
                    }
                    z16 = z15 | z4;
                    objM87133R = c28655q.m87133R();
                    if (z16 || objM87133R == c28676v0) {
                        objM87133R = new C39689b(19, function4, itemState);
                        c28655q.m87172p0(objM87133R);
                    }
                    modifierM3362g = AbstractC1092a.m3362g(modifierM3362g, false, null, null, (InterfaceC4339a) objM87133R, 15);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1259102946);
                    c28655q.m87173q(false);
                }
                AbstractC12889b.m36263b(AbstractC1102d.m3409f(1.0f, modifierM3362g).mo3471e(modifier2), C22411w.f87680a.m64535a().m64090c(), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), null, 0, AbstractC37817c.m121344e(213153007, c28655q, new C2626t2(itemState, z14, 12)), c28655q, 1769472, 24);
                function3 = function4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C40103n(modifier2, itemState, function3, i13, i14, 9);
            }
        }
        i15 |= 384;
        function2 = function1;
        z4 = true;
        if ((i15 & 147) != 146) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            modifierM3362g = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = modifierM3362g;
            }
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C40349h7(26);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            if (itemState.getDestination() != null) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                c28655q.m87150e0(-1259240338);
                if ((i15 & 896) == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if ((i15 & 112) != 32) {
                    z4 = false;
                }
                z16 = z15 | z4;
                objM87133R = c28655q.m87133R();
                if (z16) {
                    objM87133R = new C39689b(19, function4, itemState);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C39689b(19, function4, itemState);
                    c28655q.m87172p0(objM87133R);
                }
                modifierM3362g = AbstractC1092a.m3362g(modifierM3362g, false, null, null, (InterfaceC4339a) objM87133R, 15);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1259102946);
                c28655q.m87173q(false);
            }
            AbstractC12889b.m36263b(AbstractC1102d.m3409f(1.0f, modifierM3362g).mo3471e(modifier2), C22411w.f87680a.m64535a().m64090c(), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), null, 0, AbstractC37817c.m121344e(213153007, c28655q, new C2626t2(itemState, z14, 12)), c28655q, 1769472, 24);
            function3 = function4;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40103n(modifier2, itemState, function3, i13, i14, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m132003f(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m132004g(Function1 function1, C39581o c39581o) {
        C9598e c9598eM126462a = c39581o.getDestination();
        if (c9598eM126462a == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        function1.invoke(new InterfaceC38321a.f(c9598eM126462a));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m132005h(C39581o c39581o, boolean z4, Composer composer, int i13) throws XmlPullParserException, IOException {
        C38072d c38072d;
        int i14;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 2 * 8;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13), C2299e.f9108K, c28655q, 54);
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
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            C27430e c27430eM107874S = AbstractC34132o.m107874S(c39581o.getLeftIcon(), c28655q, 6);
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC33852d.f141778k);
            float f14 = 20;
            Modifier modifierM3419p = AbstractC1102d.m3419p(f14, c2314t);
            C38072d c38072d2 = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            AbstractC15005f3.m43108b(c27430eM107874S, strM92103Y, modifierM3419p, c38072d2.m121949b(c28655q, i15).getBrandWhite(), c28655q, 384, 0);
            C28655q c28655q2 = c28655q;
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement);
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
            if (c39581o.getTitle() != null) {
                c28655q2.m87150e0(-1117364644);
                c38072d = c38072d2;
                i14 = i15;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c39581o.getTitle(), c28655q2, TextResource.$stable), null, c38072d.m121949b(c28655q2, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i14).getB1(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            } else {
                c38072d = c38072d2;
                i14 = i15;
                c28655q2.m87150e0(-1117121511);
                c28655q2.m87173q(false);
            }
            if (c39581o.getSubtitle() != null) {
                c28655q2.m87150e0(-1117065060);
                C28655q c28655q3 = c28655q2;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c39581o.getSubtitle(), c28655q2, TextResource.$stable), null, c38072d.m121949b(c28655q2, i14).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i14).getB2(), null, c28655q3, 0, C2886a.f11498d << 18, 196602);
                c28655q2 = c28655q3;
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-1116821927);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            if (z4) {
                c28655q2.m87150e0(100421598);
                AbstractC29125c.m88522c(AbstractC29125c.m88500I(c39581o.getRightIcon(), c28655q2, 0), null, AbstractC1102d.m3419p(f14, c2314t), null, null, 0.0f, new C17903p(c38072d.m121949b(c28655q2, i14).getBrandWhite(), 5), c28655q2, 432, 56);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(100714703);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m132006i(Modifier modifier, C39581o c39581o, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m132002e(modifier, c39581o, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
