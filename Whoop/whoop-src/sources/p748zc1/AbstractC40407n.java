package p748zc1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import cp0.C10941a;
import kd1.AbstractC22399k;
import l83.C23454a0;
import ny0.AbstractC27237a;
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
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;
import x81.C38072d;
import z91.C40204a;

/* JADX INFO: renamed from: zc1.n */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Ll83/a0;", "e", "(Landroidx/compose/runtime/Composer;I)V", "", "title", "g", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40407n {
    /* JADX INFO: renamed from: e */
    public static final void m130403e(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1160788772);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            Modifier modifierM3394p = AbstractC1099a.m3394p(4 * 8, AbstractC1102d.m3409f(1.0f, C2314t.f9131w));
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
            m130405g("Alternative Buttons", c28655q, 6);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40363j(i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m130404f(int i13, Composer composer, int i14) {
        m130403e(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    private static final void m130405g(String str, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(54720296);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87153g(str) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC22399k.m64473c(str, c28655q, i14 & 14);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
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
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            EnumC22935a1 enumC22935a1 = EnumC22935a1.f90538x;
            Modifier modifierM3399u = AbstractC1099a.m3399u(layoutWeightElement, enumC22935a1);
            C2305k c2305k = C2299e.f9111N;
            C22957g c22957g = AbstractC22977m.f90652c;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3399u);
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
            AbstractC22399k.m64475e("Enabled", c28655q, 6);
            float f13 = 1 * 4;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
            C38072d c38072d = C38072d.f163053a;
            int checkMark = c38072d.m121951d().getAction().getCheckMark();
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C40204a(18);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27237a.m82073c(checkMark, "", false, 0.0f, (InterfaceC4339a) objM87133R, c28655q, 24624, 12);
            c28655q.m87173q(true);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM3399u2 = AbstractC1099a.m3399u(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), enumC22935a1);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3399u2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            AbstractC22399k.m64475e("Disabled", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
            int checkMark2 = c38072d.m121951d().getAction().getCheckMark();
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C40204a(19);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC27237a.m82073c(checkMark2, "", false, 0.0f, (InterfaceC4339a) objM87133R2, c28655q, 25008, 8);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C10941a(str, i13, 26);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m130406h() {
        InterfaceC34116n.INSTANCE.m107850c().mo85228t("Alternative Button click", new AbstractC30556a.a[0]);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m130407i() {
        InterfaceC34116n.INSTANCE.m107850c().mo85228t("Alternative button shouldn't be clicking", new AbstractC30556a.a[0]);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m130408j(String str, int i13, Composer composer, int i14) {
        m130405g(str, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
