package c41;

import a01.C0085e;
import a01.C0091k;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bs1.C3603v;
import c01.C3804d;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.whoopaction.domain.models.Action;
import gb1.AbstractC15673b0;
import ge3.AbstractC15751g;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p292l1.AbstractC23164r1;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: c41.e0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a5\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a)\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lc41/f0;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "Landroidx/compose/ui/Modifier;", "modifier", "f", "(Lc41/f0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "m", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lgz0/m0;", "icon", "Ly3/f;", "size", "k", "(Lgz0/m0;FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lineWidth", "centerIcon", "i", "(FFLgz0/m0;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4013e0 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x008f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:46:0x009d  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:55:0x010b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0119  */
    /* JADX WARN: Code duplicated, block: B:59:0x0123  */
    /* JADX WARN: Code duplicated, block: B:63:0x0148  */
    /* JADX WARN: Code duplicated, block: B:66:0x015e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0169  */
    /* JADX WARN: Code duplicated, block: B:70:0x0191  */
    /* JADX WARN: Code duplicated, block: B:73:0x019b  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public static final void m12182f(C4020f0 c4020f0, Function1 function1, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        float f13;
        boolean z13;
        boolean z14;
        Object objM87133R;
        float f14;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        EnumC16313m0 enumC16313m0M12221e;
        EnumC16313m0 enumC16313m0M12222f;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2110230281);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(c4020f0) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                f13 = 4;
                Modifier modifierM3357b = AbstractC1092a.m3357b(AbstractC18489d0.m53364e(AbstractC1102d.m3411h(15 * f13, AbstractC1102d.m3409f(1.0f, modifier4)), 3, f13), AbstractC15673b0.m44002P(), null, 0.0f, 6);
                boolean zM87157i = c28655q.m87157i(c4020f0);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | zM87157i;
                objM87133R = c28655q.m87133R();
                if (z14 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C3603v(c4020f0, function1, 8);
                    c28655q.m87172p0(objM87133R);
                }
                f14 = 8;
                Modifier modifierM3394p = AbstractC1099a.m3394p(2 * f14, AbstractC1092a.m3362g(modifierM3357b, false, null, null, (InterfaceC4339a) objM87133R, 15));
                C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q(f14, 1.5f, C2299e.f9108K, c28655q, 54);
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
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M53376q);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                enumC16313m0M12221e = c4020f0.getLeftIcon();
                if (enumC16313m0M12221e == null) {
                    c28655q.m87150e0(1618847979);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1618847980);
                    m12185i(6 * f13, (float) 1.5d, enumC16313m0M12221e, c28655q, 54);
                    c28655q.m87173q(false);
                }
                TextResource textResourceM12223g = c4020f0.getTitle();
                TextResource textResourceM12220d = c4020f0.getSubtitle();
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                m12189m(textResourceM12223g, textResourceM12220d, new LayoutWeightElement(1.0f, true), c28655q, 0, 0);
                enumC16313m0M12222f = c4020f0.getRightIcon();
                if (enumC16313m0M12222f == null) {
                    c28655q.m87150e0(1619125181);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1619125182);
                    m12187k(enumC16313m0M12222f, 5 * f13, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, f14 * 0.5f, 0.0f, 11), c28655q, 432, 0);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0085e((Object) c4020f0, (Object) function1, modifier3, i13, i14, 29);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            f13 = 4;
            Modifier modifierM3357b2 = AbstractC1092a.m3357b(AbstractC18489d0.m53364e(AbstractC1102d.m3411h(15 * f13, AbstractC1102d.m3409f(1.0f, modifier4)), 3, f13), AbstractC15673b0.m44002P(), null, 0.0f, 6);
            boolean zM87157i2 = c28655q.m87157i(c4020f0);
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = z13 | zM87157i2;
            objM87133R = c28655q.m87133R();
            if (z14) {
                objM87133R = new C3603v(c4020f0, function1, 8);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C3603v(c4020f0, function1, 8);
                c28655q.m87172p0(objM87133R);
            }
            f14 = 8;
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(2 * f14, AbstractC1092a.m3362g(modifierM3357b2, false, null, null, (InterfaceC4339a) objM87133R, 15));
            C22994r1 c22994r1M53376q2 = AbstractC18489d0.m53376q(f14, 1.5f, C2299e.f9108K, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M53376q2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            enumC16313m0M12221e = c4020f0.getLeftIcon();
            if (enumC16313m0M12221e == null) {
                c28655q.m87150e0(1618847979);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1618847980);
                m12185i(6 * f13, (float) 1.5d, enumC16313m0M12221e, c28655q, 54);
                c28655q.m87173q(false);
            }
            TextResource textResourceM12223g2 = c4020f0.getTitle();
            TextResource textResourceM12220d2 = c4020f0.getSubtitle();
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            m12189m(textResourceM12223g2, textResourceM12220d2, new LayoutWeightElement(1.0f, true), c28655q, 0, 0);
            enumC16313m0M12222f = c4020f0.getRightIcon();
            if (enumC16313m0M12222f == null) {
                c28655q.m87150e0(1619125181);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1619125182);
                m12187k(enumC16313m0M12222f, 5 * f13, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, f14 * 0.5f, 0.0f, 11), c28655q, 432, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0085e((Object) c4020f0, (Object) function1, modifier3, i13, i14, 29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m12183g(C4020f0 c4020f0, Function1 function1) {
        Action actionM12217a = c4020f0.getAction();
        if (actionM12217a != null) {
            function1.invoke(actionM12217a);
        } else {
            C9598e c9598eM12218b = c4020f0.getDestination();
            if (c9598eM12218b != null) {
                function1.invoke(c9598eM12218b);
            }
        }
        Action actionM12219c = c4020f0.getDismissAction();
        if (actionM12219c != null) {
            function1.invoke(actionM12219c);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m12184h(C4020f0 c4020f0, Function1 function1, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m12182f(c4020f0, function1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    private static final void m12185i(float f13, float f14, EnumC16313m0 enumC16313m0, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1184166724);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87147d(f13) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87147d(f14) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87149e(enumC16313m0.ordinal()) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            Modifier modifierM3419p = AbstractC1102d.m3419p(f13, C2314t.f9131w);
            C33252i c33252i = AbstractC33253j.f138651a;
            Modifier modifierM44456i = AbstractC15751g.m44456i(f14, AbstractC37056f.m118994r(modifierM3419p, c33252i), AbstractC15673b0.m43972A(), c33252i);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44456i);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            m12187k(enumC16313m0, f13 / 2, null, c28655q, (i14 >> 6) & 14, 4);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0091k(f13, f14, enumC16313m0, i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m12186j(float f13, float f14, EnumC16313m0 enumC16313m0, int i13, Composer composer, int i14) {
        m12185i(f13, f14, enumC16313m0, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    private static final void m12187k(EnumC16313m0 enumC16313m0, float f13, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-23463544);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87149e(enumC16313m0.ordinal()) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87147d(f13) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            AbstractC23164r1.m67133b(AbstractC34132o.m107874S(enumC16313m0.toWhoopIcon(), c28655q, 6), null, AbstractC1102d.m3419p(f13, modifier), C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), c28655q, 48, 0);
        } else {
            c28655q.m87138X();
        }
        Modifier modifier2 = modifier;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4006d0(enumC16313m0, f13, modifier2, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m12188l(EnumC16313m0 enumC16313m0, float f13, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m12187k(enumC16313m0, f13, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0091  */
    /* JADX WARN: Code duplicated, block: B:40:0x0095  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:48:0x0126  */
    /* JADX WARN: Code duplicated, block: B:50:0x0131  */
    /* JADX WARN: Code duplicated, block: B:52:0x017d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0187  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: m */
    private static final void m12189m(TextResource textResource, TextResource textResource2, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C38072d c38072d;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-238876974);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(textResource) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(textResource2) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(8 * 0.25f), C2299e.f9110M, c28655q2, 6);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifier3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                String strM21274h = AbstractC8693b.m21274h(textResource, c28655q2, i15 & 14);
                c38072d = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getH4(), null, c28655q2, 0, 0, 196602);
                c28655q = c28655q2;
                if (textResource2 == null) {
                    c28655q.m87150e0(1998432068);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1998432069);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource2, c28655q, 0), null, c38072d.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB4(), null, c28655q, 0, 0, 196602);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                modifier2 = modifier3;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3804d(i13, i14, 1, modifier2, textResource, textResource2);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(8 * 0.25f), C2299e.f9110M, c28655q2, 6);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifier3);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
            String strM21274h2 = AbstractC8693b.m21274h(textResource, c28655q2, i15 & 14);
            c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h2, null, c38072d.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getH4(), null, c28655q2, 0, 0, 196602);
            c28655q = c28655q2;
            if (textResource2 == null) {
                c28655q.m87150e0(1998432068);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1998432069);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource2, c28655q, 0), null, c38072d.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB4(), null, c28655q, 0, 0, 196602);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            modifier2 = modifier3;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3804d(i13, i14, 1, modifier2, textResource, textResource2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m12190n(TextResource textResource, TextResource textResource2, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m12189m(textResource, textResource2, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
