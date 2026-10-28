package kc2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import io2.C20769k0;
import iy0.C21026a;
import jx2.C22038b;
import kd1.C22411w;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p705ea2.AbstractC12919p;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: kc2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lkc2/i;", "viewState", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "d", "(Lkc2/i;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "settings_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22352b {
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x009c  */
    /* JADX WARN: Code duplicated, block: B:40:0x009e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:53:0x0119  */
    /* JADX WARN: Code duplicated, block: B:56:0x014d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0150  */
    /* JADX WARN: Code duplicated, block: B:59:0x0154  */
    /* JADX WARN: Code duplicated, block: B:62:0x0179  */
    /* JADX WARN: Code duplicated, block: B:64:0x017f  */
    /* JADX WARN: Code duplicated, block: B:69:0x019d  */
    /* JADX WARN: Code duplicated, block: B:71:0x023e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0248  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m64246d(C22359i viewState, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        boolean z4;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        boolean z13;
        Object objM87133R;
        int i16;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z14;
        int iHashCode2;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1941360550);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q.m87157i(interfaceC4339a2) ? 32 : 16;
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
                        objM87133R2 = new C22038b(20);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM3357b = AbstractC1092a.m3357b(AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3427x(c2314t, null, 3)), AbstractC15673b0.m43981E0(), C22411w.f87680a.m64535a().m64090c(), 0.0f, 4);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                i16 = 8;
                if (z13 || objM87133R == c28676v0) {
                    objM87133R = new C21026a(interfaceC4339a4, i16);
                    c28655q.m87172p0(objM87133R);
                }
                float f13 = 2 * 8;
                Modifier modifierM3394p = AbstractC1099a.m3394p(f13, AbstractC1092a.m3362g(modifierM3357b, false, null, null, (InterfaceC4339a) objM87133R, 15));
                C22949e c22949e = AbstractC22977m.f90650a;
                C2305k c2305k = C2299e.f9110M;
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66747j(f13, c2305k), C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(AbstractC12919p.f44475i, c28655q, 6), null, AbstractC1102d.m3419p(6 * 4, c2314t), 0L, c28655q, 432, 8);
                if (1.0f > 0.0d) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (!z14) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
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
                TextResource textResourceM64274d = viewState.getTitle();
                int i18 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(textResourceM64274d, c28655q, i18);
                C38072d c38072d = C38072d.f163053a;
                int i19 = C38072d.f163054b;
                C2886a c2886aM8437r = c38072d.m121952e(c28655q, i19).getH4();
                long jM125426w = c38072d.m121949b(c28655q, i19).getBrandBlack();
                int i24 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h, null, jM125426w, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r, null, c28655q, 0, i24, 196602);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSubtitle(), c28655q, i18), null, c38072d.m121949b(c28655q, i19).getBlack50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getB3(), null, c28655q, 0, i24, 196602);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                interfaceC4339a3 = interfaceC4339a4;
            } else {
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C20769k0(viewState, i13, interfaceC4339a3, i14, 11);
            }
        }
        i15 |= 48;
        interfaceC4339a2 = interfaceC4339a;
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
                    objM87133R2 = new C22038b(20);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3357b2 = AbstractC1092a.m3357b(AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3427x(c2314t2, null, 3)), AbstractC15673b0.m43981E0(), C22411w.f87680a.m64535a().m64090c(), 0.0f, 4);
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q.m87133R();
            i16 = 8;
            if (z13) {
                objM87133R = new C21026a(interfaceC4339a4, i16);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C21026a(interfaceC4339a4, i16);
                c28655q.m87172p0(objM87133R);
            }
            float f14 = 2 * 8;
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(f14, AbstractC1092a.m3362g(modifierM3357b2, false, null, null, (InterfaceC4339a) objM87133R, 15));
            C22949e c22949e2 = AbstractC22977m.f90650a;
            C2305k c2305k2 = C2299e.f9110M;
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66747j(f14, c2305k2), C2299e.f9108K, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
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
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(AbstractC12919p.f44475i, c28655q, 6), null, AbstractC1102d.m3419p(6 * 4, c2314t2), 0L, c28655q, 432, 8);
            if (1.0f > 0.0d) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z14) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k2, c28655q, 6);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, layoutWeightElement2);
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
            TextResource textResourceM64274d2 = viewState.getTitle();
            int i110 = TextResource.$stable;
            String strM21274h2 = AbstractC8693b.m21274h(textResourceM64274d2, c28655q, i110);
            C38072d c38072d2 = C38072d.f163053a;
            int i111 = C38072d.f163054b;
            C2886a c2886aM8437r2 = c38072d2.m121952e(c28655q, i111).getH4();
            long jM125426w2 = c38072d2.m121949b(c28655q, i111).getBrandBlack();
            int i25 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h2, null, jM125426w2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r2, null, c28655q, 0, i25, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSubtitle(), c28655q, i110), null, c38072d2.m121949b(c28655q, i111).getBlack50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i111).getB3(), null, c28655q, 0, i25, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            interfaceC4339a3 = interfaceC4339a4;
        } else {
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C20769k0(viewState, i13, interfaceC4339a3, i14, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m64247e() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m64248f(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m64249g(C22359i c22359i, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m64246d(c22359i, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
