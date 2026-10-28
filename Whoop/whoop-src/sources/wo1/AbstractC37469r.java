package wo1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import e93.AbstractC12889b;
import ih0.AbstractC18489d0;
import java.io.IOException;
import l83.C23454a0;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22960g2;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22996s0;
import p315m0.AbstractC24868a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p733ry2.C31918g;
import p745y81.EnumC39333f;
import pp2.C29451o;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import so1.C32835s;
import so1.C32837u;
import t80.C33592b;
import vq2.C36287d;
import wb3.AbstractC37056f;
import wl2.C37358a;
import x81.C38072d;
import xn1.AbstractC38480c;

/* JADX INFO: renamed from: wo1.r */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lso1/s;", "viewState", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "g", "(Lso1/s;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37469r {
    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0079  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public static final void m120105g(C32835s viewState, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        boolean z4;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        boolean z13;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1853948047);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
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
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C37358a(27);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
                z13 = (i15 & 112) == 32;
                objM87133R = c28655q.m87133R();
                if (z13 || objM87133R == c28676v0) {
                    objM87133R = new C31918g(interfaceC4339a4, 23);
                    c28655q.m87172p0(objM87133R);
                }
                float f13 = 4;
                AbstractC12889b.m36263b(AbstractC1092a.m3362g(modifierM3409f, false, null, null, (InterfaceC4339a) objM87133R, 15), AbstractC33253j.m105489e(3 * f13), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), null, 0 * f13, AbstractC37817c.m121344e(-1167957198, c28655q, new C29451o(24, viewState, interfaceC4339a4)), c28655q, 1769472, 24);
                interfaceC4339a3 = interfaceC4339a4;
            } else {
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33592b(viewState, i13, interfaceC4339a3, i14, 28);
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
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C37358a(27);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            if ((i15 & 112) == 32) {
            }
            objM87133R = c28655q.m87133R();
            if (z13) {
                objM87133R = new C31918g(interfaceC4339a4, 23);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C31918g(interfaceC4339a4, 23);
                c28655q.m87172p0(objM87133R);
            }
            float f14 = 4;
            AbstractC12889b.m36263b(AbstractC1092a.m3362g(modifierM3409f2, false, null, null, (InterfaceC4339a) objM87133R, 15), AbstractC33253j.m105489e(3 * f14), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), null, 0 * f14, AbstractC37817c.m121344e(-1167957198, c28655q, new C29451o(24, viewState, interfaceC4339a4)), c28655q, 1769472, 24);
            interfaceC4339a3 = interfaceC4339a4;
        } else {
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33592b(viewState, i13, interfaceC4339a3, i14, 28);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m120106h() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m120107i(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m120108j(C32835s c32835s, InterfaceC4339a interfaceC4339a, Composer composer, int i13) throws XmlPullParserException, IOException {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 2;
            float f14 = f13 * 8;
            float f15 = 4;
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t), f14, 3 * f15);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
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
            Modifier modifierM3419p = AbstractC1102d.m3419p(6 * f15, c2314t);
            C27430e c27430eM107874S = AbstractC34132o.m107874S(c32835s.getTitleIcon().toWhoopIcon(), c28655q, 6);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC15005f3.m43108b(c27430eM107874S, null, modifierM3419p, c38072d.m121949b(c28655q, i14).getWhite50(), c28655q, 432, 0);
            AbstractC18489d0.m53380u(f15, f15, c2314t, c28655q);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c32835s.getTitle(), c28655q, TextResource.$stable), new LayoutWeightElement(1.0f, true), c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, c38072d.m121952e(c28655q, i14).getSh4(), null, c28655q, 0, (C2886a.f11498d << 18) | 3120, 186360);
            C28655q c28655q2 = c28655q;
            C27270o c27270o = new C27270o(AbstractC27274q.f.f109143f, c32835s.getFabIcon().toWhoopIcon(), EnumC39333f.BRAND_BLACK, EnumC39333f.BRAND_WHITE, null, false, false, false, 0.0f, true, 496, null);
            Modifier modifierM3599a = AbstractC1136a.m3599a(c2314t, "LogPeriodButtonTag");
            String strM92103Y = AbstractC30060g.m92103Y(c28655q2, AbstractC38480c.f164866m);
            boolean zM87153g = c28655q2.m87153g(interfaceC4339a);
            Object objM87133R = c28655q2.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C31918g(interfaceC4339a, 24);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC27242b1.m82092d(c27270o, strM92103Y, modifierM3599a, null, (InterfaceC4339a) objM87133R, c28655q2, C27270o.f109105k | 384, 8);
            c28655q2.m87173q(true);
            if (c32835s.m103046b().isEmpty()) {
                c28655q2.m87150e0(-842908550);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-844038686);
                float f16 = f13 * f15;
                AbstractC22960g2.m66729a(AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13), AbstractC22977m.m66746i(f16), AbstractC22977m.m66746i(f16), null, 0, 0, AbstractC37817c.m121344e(-1889510104, c28655q2, new C36287d(c32835s, 4)), c28655q2, 1573302, 56);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m120109k(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m120110l(C32835s c32835s, InterfaceC22996s0 FlowRow, Composer composer, int i13) {
        AbstractC22676k.m65750j(FlowRow, "$this$FlowRow");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            for (C32837u c32837u : c32835s.m103046b()) {
                float f13 = 4;
                float f14 = 2 * f13;
                Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1092a.m3358c(AbstractC37056f.m118994r(C2314t.f9131w, AbstractC33253j.m105489e(f14)), C17919x.m51541c(0.15f, c32837u.getStyle().mo134584toComposableColorWaAFU9c(c28655q, 0)), AbstractC17918w0.f69621a), 3 * f13, f14);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
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
                C28655q c28655q2 = c28655q;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c32837u.getDisplay(), c28655q, TextResource.$stable), null, c32837u.getStyle().mo134584toComposableColorWaAFU9c(c28655q, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getSh5(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                c28655q2.m87173q(true);
                c28655q = c28655q2;
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m120111m(C32835s c32835s, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m120105g(c32835s, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
