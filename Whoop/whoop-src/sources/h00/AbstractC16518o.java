package h00;

import android.content.Context;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import b30.C2549j2;
import b30.C2557k2;
import b30.C2663y4;
import b30.C2665z;
import bi.C3278p;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.android.R;
import d71.C11757c;
import f01.C13849c0;
import g00.AbstractC14930a;
import g00.AbstractC14933d;
import g00.AbstractC14936g;
import g00.C14931b;
import g00.C14934e;
import ge3.AbstractC15751g;
import go1.C16016a;
import h20.EnumC16701n1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import l83.C23454a0;
import m83.C25271y;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC14981d1;
import p163g1.AbstractC15005f3;
import p163g1.AbstractC15011f9;
import p163g1.AbstractC15047j1;
import p163g1.AbstractC15067l1;
import p163g1.C14970c1;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p209i3.AbstractC18032n;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p291l0.InterfaceC22997s1;
import p294l3.C23246c;
import p294l3.C23248d;
import p294l3.C23249d0;
import p294l3.C23254g;
import p294l3.C23285v0;
import p315m0.AbstractC24868a;
import p386oy.AbstractC28465b;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p479s4.AbstractC32128i;
import p505ts.AbstractC34132o;
import p510u0.AbstractC34339n0;
import p510u0.C34327j0;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q00.C29725l;
import q00.C29727m;
import q00.C29731o;
import q00.InterfaceC29729n;
import q83.AbstractC30060g;
import se.AbstractC32417h;
import v63.AbstractC35745c;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: h00.o */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC16518o {

    /* JADX INFO: renamed from: a */
    public static final float f63508a = 10;

    /* JADX INFO: renamed from: b */
    public static final float f63509b = 25;

    /* JADX INFO: renamed from: a */
    public static final void m46677a(AbstractC32417h abstractC32417h, boolean z4, InterfaceC4339a interfaceC4339a, Modifier modifier, EnumC16701n1 enumC16701n1, Composer composer, int i13) {
        int i14;
        float f13;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(210164924);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(abstractC32417h) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 256 : 128;
        }
        if (((i14 | 27648) & 9363) == 9362 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            enumC16701n1 = EnumC16701n1.f64226w;
            c28655q.m87150e0(830453071);
            if (z4) {
                f13 = 1.0f;
            } else {
                long j7 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                if (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                    AbstractC17918w0.m51536x(j7);
                } else {
                    AbstractC17918w0.m51536x(j7);
                }
                f13 = 0.38f;
            }
            c28655q.m87173q(false);
            AbstractC28683x.m87247a(AbstractC15047j1.f56336a.mo86977a(Float.valueOf(f13)), AbstractC37817c.m121344e(1090326524, c28655q, new C16514m(interfaceC4339a, z4, abstractC32417h, 1)), c28655q, 56);
            modifier = C2314t.f9131w;
        }
        Modifier modifier2 = modifier;
        EnumC16701n1 enumC16701n2 = enumC16701n1;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2549j2(abstractC32417h, z4, interfaceC4339a, modifier2, enumC16701n2, i13, 6);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m46678b(int i13, Composer composer, int i14) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-711568649);
        int i15 = (c28655q.m87149e(i13) ? 4 : 2) | i14;
        if ((i15 & 3) == 2 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            AbstractC15005f3.m43107a(AbstractC29125c.m88500I(i13, c28655q, i15 & 14), AbstractC30060g.m92103Y(c28655q, R.string.stripe_link), AbstractC34132o.m107879c(((Number) c28655q.m87161k(AbstractC15047j1.f56336a)).floatValue(), AbstractC1099a.m3384f(C2314t.f9131w, false, 2.7692308f)), C17919x.f69637n, c28655q, 3072, 0);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13849c0(i13, i14);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m46679c(long j7, Composer composer, final int i13) {
        final long j13;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(472251077);
        int i14 = (c28655q.m87151f(j7) ? 4 : 2) | i13;
        if ((i14 & 3) == 2 && c28655q.m87121F()) {
            c28655q.m87138X();
            j13 = j7;
        } else {
            j13 = j7;
            AbstractC15751g.m44449b(AbstractC1102d.m3406c(1.0f, AbstractC1102d.m3424u(1, C2314t.f9131w)), j13, 0.0f, 0.0f, c28655q, ((i14 << 3) & 112) | 6, 12);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m(j13, i13) { // from class: h00.k

                /* JADX INFO: renamed from: w */
                public final /* synthetic */ long f63488w;

                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM87244L = AbstractC28683x.m87244L(1);
                    AbstractC16518o.m46679c(this.f63488w, (Composer) obj, iM87244L);
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m46680d(Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        EnumC16701n1 enumC16701n1 = EnumC16701n1.f64226w;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(2080046201);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(enumC16701n1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i14 & 3) == 2 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c28655q = c28655q2;
        } else {
            c28655q2.m87150e0(-1036456255);
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                C23248d c23248d = new C23248d();
                AbstractC34339n0.m108632j(c23248d, "LinkIcon", "[icon]");
                AbstractC34339n0.m108632j(c23248d, "LinkDividerSpacer", "[divider_spacer]");
                AbstractC34339n0.m108632j(c23248d, "LinkDivider", "[divider]");
                AbstractC34339n0.m108632j(c23248d, "LinkDividerSpacer", "[divider_spacer]");
                objM87133R = c23248d.m67309k();
                c28655q2.m87172p0(objM87133R);
            }
            C23254g c23254g = (C23254g) objM87133R;
            c28655q2.m87173q(false);
            long jM113246h = AbstractC35745c.m113246h(16);
            c28655q2.m87150e0(-1418551394);
            C14934e c14934e = (C14934e) c28655q2.m87161k(AbstractC14936g.f55705b);
            c28655q2.m87173q(false);
            C23285v0 c23285v0 = c14934e.f55696c;
            c28655q2.m87150e0(-1036428943);
            C3278p c3278p = new C3278p(3);
            c3278p.m9547a("LinkIcon", AbstractC35745c.m113248j(3, 8589934592L), AbstractC35745c.m113244f(1.1d), AbstractC37817c.m121344e(1897900476, c28655q2, new C16516n(0)));
            c3278p.m9547a("LinkDivider", AbstractC35745c.m113244f(0.1d), AbstractC35745c.m113244f(1.3d), AbstractC37817c.m121344e(1780808691, c28655q2, new C16516n(1)));
            c3278p.m9547a("LinkDividerSpacer", AbstractC35745c.m113244f(0.5d), AbstractC35745c.m113248j(0, 8589934592L), AbstractC28465b.f114769a);
            c28655q2.m87173q(false);
            c28655q2.m87150e0(-1036418360);
            Object objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C16016a(25);
                c28655q2.m87172p0(objM87133R2);
            }
            c28655q2.m87173q(false);
            c28655q = c28655q2;
            AbstractC15011f9.m43115c(c23254g, AbstractC18032n.m51775c(C2314t.f9131w, false, (Function1) objM87133R2), 0L, jM113246h, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, c3278p.f12803a, null, c23285v0, c28655q, 3078, 3120, 88052);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13849c0(i13);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m46681e(C29731o c29731o, Composer composer, int i13) {
        C28655q c28655q;
        EnumC16701n1 enumC16701n1 = EnumC16701n1.f64226w;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(495698044);
        int i14 = (c28655q2.m87153g(enumC16701n1) ? 32 : 16) | (c28655q2.m87153g(c29731o) ? 4 : 2) | i13;
        if ((i14 & 19) == 18 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c28655q = c28655q2;
        } else {
            int i15 = (i14 >> 3) & 14;
            long jM51541c = C17919x.m51541c(((Number) c28655q2.m87161k(AbstractC15047j1.f56336a)).floatValue(), m46686j(c28655q2));
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q2, 48);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            m46680d(c28655q2, i15);
            m46682f(c29731o, c28655q2, i14 & 14);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(4, c2314t));
            String str = c29731o.f121591x;
            c28655q2.m87150e0(-1418551394);
            C14934e c14934e = (C14934e) c28655q2.m87161k(AbstractC14936g.f55705b);
            c28655q2.m87173q(false);
            C23285v0 c23285v0 = c14934e.f55696c;
            long jM113246h = AbstractC35745c.m113246h(16);
            if (0.5f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC15011f9.m43114b(str, new LayoutWeightElement(0.5f, false), jM51541c, jM113246h, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, c23285v0, c28655q2, 3072, 3120, 55280);
            c28655q = c28655q2;
            c28655q.m87173q(true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16512l(c29731o, i13, 0);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m46682f(C29731o c29731o, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1692861304);
        if ((((c28655q.m87153g(c29731o) ? 4 : 2) | i13) & 3) == 2 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3419p = AbstractC1102d.m3419p(24, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3419p);
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
            InterfaceC29729n interfaceC29729n = c29731o.f121590w;
            if (interfaceC29729n instanceof C29727m) {
                c28655q.m87150e0(1002017113);
                AbstractC29125c.m88522c(AbstractC29125c.m88500I(((C29727m) interfaceC29729n).f121579w, c28655q, 0), null, AbstractC1102d.m3407d(1.0f, c2314t), null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
                c28655q.m87173q(false);
            } else {
                if (!(interfaceC29729n instanceof C29725l)) {
                    throw AbstractC11895b.m32003v(1002014699, c28655q, false);
                }
                c28655q.m87150e0(1002026469);
                AbstractC22674j.m65715a(((C29725l) interfaceC29729n).f121571w, null, c28655q, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16512l(c29731o, i13, 1);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m46683g(String str, Composer composer, int i13) {
        EnumC16701n1 enumC16701n1 = EnumC16701n1.f64226w;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(114777055);
        int i14 = (c28655q.m87153g(enumC16701n1) ? 32 : 16) | (c28655q.m87153g(str) ? 4 : 2) | i13;
        if ((i14 & 19) == 18 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            c28655q.m87150e0(-196465273);
            boolean z4 = (i14 & 14) == 4;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                StringBuilder sb4 = new StringBuilder(16);
                new ArrayList();
                ArrayList arrayList = new ArrayList();
                new ArrayList();
                sb4.append(str);
                String string = sb4.toString();
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i15 = 0; i15 < size; i15++) {
                    arrayList2.add(((C23246c) arrayList.get(i15)).m67297a(sb4.length()));
                }
                objM87133R = new C23254g(string, arrayList2);
                c28655q.m87172p0(objM87133R);
            }
            C23254g c23254g = (C23254g) objM87133R;
            c28655q.m87173q(false);
            int i16 = (i14 >> 3) & 14;
            long jM51541c = C17919x.m51541c(((Number) c28655q.m87161k(AbstractC15047j1.f56336a)).floatValue(), m46686j(c28655q));
            String strMo133889M = AbstractC32128i.m100064s(R.string.stripe_pay_with_link, new Object[0], C25271y.f99162w).mo133889M((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b));
            c28655q.m87150e0(-196453682);
            boolean zM87153g = c28655q.m87153g(strMo133889M);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new C2663y4(strMo133889M, 26);
                c28655q.m87172p0(objM87133R2);
            }
            c28655q.m87173q(false);
            Modifier modifierM51775c = AbstractC18032n.m51775c(C2314t.f9131w, true, (Function1) objM87133R2);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM51775c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            m46680d(c28655q, i16);
            c28655q.m87150e0(-1418551394);
            C14934e c14934e = (C14934e) c28655q.m87161k(AbstractC14936g.f55705b);
            c28655q.m87173q(false);
            C23285v0 c23285v0 = c14934e.f55696c;
            long jM113246h = AbstractC35745c.m113246h(16);
            if (0.5f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC15011f9.m43115c(c23254g, new LayoutWeightElement(0.5f, false), jM51541c, jM113246h, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, c23285v0, c28655q, 3072, 3120, 120816);
            c28655q = c28655q;
            c28655q.m87173q(true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2665z(str, i13);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m46684h(InterfaceC22997s1 interfaceC22997s1, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        EnumC16701n1 enumC16701n1 = EnumC16701n1.f64226w;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1386169631);
        if ((i13 & 48) == 0) {
            i14 = (c28655q2.m87153g(enumC16701n1) ? 32 : 16) | i13;
        } else {
            i14 = i13;
        }
        if ((i14 & 17) == 16 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c28655q = c28655q2;
        } else {
            String strM92103Y = AbstractC30060g.m92103Y(c28655q2, R.string.stripe_pay_with_link);
            C23248d c23248d = new C23248d();
            c23248d.m67300b(AbstractC39414r.m125863I0(strM92103Y, "Link"));
            AbstractC34339n0.m108632j(c23248d, "LinkIcon", "[icon]");
            c23248d.m67300b(AbstractC39414r.m125859E0(strM92103Y, "Link", strM92103Y));
            C23254g c23254gM67309k = c23248d.m67309k();
            c28655q2.m87150e0(-106717435);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("LinkIcon", new C34327j0(new C23249d0(AbstractC35745c.m113244f(2.6d), AbstractC35745c.m113244f(0.9d), 4), new C37816b(new C2557k2(AbstractC37817c.m121344e(-1421888448, c28655q2, new C16516n(2)), 8), true, -905386904)));
            c28655q2.m87173q(false);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(C2314t.f9131w, 6, 0.0f, 0.0f, 0.0f, 14));
            c28655q2.m87150e0(-106709716);
            boolean zM87153g = c28655q2.m87153g(strM92103Y);
            Object objM87133R = c28655q2.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C2663y4(strM92103Y, 25);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q2.m87173q(false);
            Modifier modifierM51775c = AbstractC18032n.m51775c(modifierM3409f, false, (Function1) objM87133R);
            long jM51541c = C17919x.m51541c(((Number) c28655q2.m87161k(AbstractC15047j1.f56336a)).floatValue(), m46686j(c28655q2));
            c28655q2.m87150e0(-1418551394);
            C14934e c14934e = (C14934e) c28655q2.m87161k(AbstractC14936g.f55705b);
            c28655q2.m87173q(false);
            c28655q = c28655q2;
            AbstractC15011f9.m43115c(c23254gM67309k, modifierM51775c, jM51541c, AbstractC35745c.m113246h(21), null, null, null, 0L, null, new C36775k(3), 0L, 2, false, 1, 0, linkedHashMap, null, c14934e.f55696c, c28655q, 3072, 3120, 87536);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11757c(interfaceC22997s1, i13);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final int m46685i(Composer composer) {
        EnumC16701n1 enumC16701n1 = EnumC16701n1.f64226w;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1657154600);
        c28655q.m87173q(false);
        return R.drawable.stripe_link_logo_bw;
    }

    /* JADX INFO: renamed from: j */
    public static final long m46686j(Composer composer) {
        EnumC16701n1 enumC16701n1 = EnumC16701n1.f64226w;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1976706718);
        EnumC16701n1 enumC16701n2 = EnumC16701n1.f64226w;
        C14931b c14931b = AbstractC14933d.f55692a;
        c28655q.m87150e0(-443512897);
        C14931b contentOnPrimaryButton = (C14931b) c28655q.m87161k(AbstractC14936g.f55706c);
        c28655q.m87173q(false);
        AbstractC22676k.m65750j(contentOnPrimaryButton, "$this$contentOnPrimaryButton");
        long j7 = AbstractC14930a.f55646a;
        c28655q.m87173q(false);
        return j7;
    }
}
