package p162g0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import aq1.C1909c;
import c93.InterfaceC4339a;
import cy1.C11186b;
import d30.C11518b0;
import d42.C11699o;
import e93.AbstractC12889b;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p043c4.AbstractC3975r;
import p043c4.EnumC3968k0;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.C23016z;
import p291l0.EnumC22935a1;
import p294l3.C23285v0;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28596b0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: g0.f */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14929f {

    /* JADX INFO: renamed from: a */
    public static final C14926c f55645a;

    static {
        EnumC3968k0 enumC3968k0 = EnumC3968k0.f16173w;
        C28596b0 c28596b0 = AbstractC3975r.f16196a;
        EnumC3968k0 enumC3968k1 = EnumC3968k0.f16173w;
        EnumC3968k0 enumC3968k2 = EnumC3968k0.f16173w;
        long j7 = C17919x.f69629f;
        long j13 = C17919x.f69625b;
        f55645a = new C14926c(j7, j13, j13, C17919x.m51541c(0.38f, j13), C17919x.m51541c(0.38f, j13));
    }

    /* JADX INFO: renamed from: a */
    public static final void m43023a(C14926c c14926c, Modifier modifier, C37816b c37816b, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(621449936);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(c14926c) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(c37816b) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1099a.m3396r(AbstractC1099a.m3399u(AbstractC1092a.m3358c(AbstractC12889b.m36262a0(modifier, AbstractC14928e.f55632d, AbstractC33253j.m105489e(AbstractC14928e.f55633e), false, 0L, 0L, 28), c14926c.f55623a, AbstractC17918w0.f69621a), EnumC22935a1.f90538x), 0.0f, AbstractC14928e.f55637i, 1), AbstractC30060g.m92099U(0, c28655q, 1), 14);
            int i15 = (i14 << 3) & 7168;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
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
            c37816b.invoke(C23016z.f90757a, c28655q, Integer.valueOf(((i15 >> 6) & 112) | 6));
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11186b(c14926c, modifier, c37816b, i13, 20);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m43024b(Modifier modifier, C14926c c14926c, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        int i16;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1430784946);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
        } else {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        }
        int i18 = i14 & 2;
        if (i18 != 0) {
            i16 = i15 | 48;
        } else {
            i16 = i15 | (c28655q.m87153g(c14926c) ? 32 : 16);
        }
        int i19 = i16 | (c28655q.m87157i(function1) ? 256 : 128);
        if (c28655q.m87135U(i19 & 1, (i19 & 147) != 146)) {
            if (i17 != 0) {
                modifier = C2314t.f9131w;
            }
            if (i18 != 0) {
                c14926c = f55645a;
            }
            m43023a(c14926c, modifier, AbstractC37817c.m121344e(860259975, c28655q, new C11518b0(2, function1, c14926c)), c28655q, ((i19 << 3) & 112) | ((i19 >> 3) & 14) | 384);
        } else {
            c28655q.m87138X();
        }
        Modifier modifier2 = modifier;
        C14926c c14926c2 = c14926c;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11186b(modifier2, c14926c2, function1, i13, i14);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m43025c(String str, C14926c c14926c, Modifier modifier, Function3 function3, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        Modifier modifier2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1027365588);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(true) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(c14926c) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            modifier2 = modifier;
            i14 |= c28655q.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            modifier2 = modifier;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(function3) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 131072 : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if (c28655q.m87135U(i14 & 1, (74899 & i14) != 74898)) {
            C2306l c2306l = AbstractC14928e.f55634f;
            C22949e c22949e = AbstractC22977m.f90650a;
            float f13 = AbstractC14928e.f55636h;
            C22971k c22971kM66746i = AbstractC22977m.m66746i(f13);
            boolean z4 = ((i14 & 112) == 32) | ((458752 & i14) == 131072);
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C11699o(interfaceC4339a, 25);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3362g(modifier2, true, str, null, (InterfaceC4339a) objM87133R, 12));
            float f14 = AbstractC14928e.f55629a;
            float f15 = AbstractC14928e.f55630b;
            float f16 = AbstractC14928e.f55631c;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3422s(modifierM3409f, f14, f16, f15, f16), f13, 0.0f, 2);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22971kM66746i, c2306l, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
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
            if (function3 == null) {
                c28655q.m87150e0(-1483499797);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1483499796);
                float f17 = AbstractC14928e.f55638j;
                Modifier modifierM3417n = AbstractC1102d.m3417n(C2314t.f9131w, f17, 0.0f, f17, f17, 2);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3417n);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                function3.invoke(new C17919x(c14926c.f55625c), c28655q, 0);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            C23285v0 c23285v0 = new C23285v0(c14926c.f55624b, AbstractC14928e.f55641m, AbstractC14928e.f55642n, null, null, AbstractC14928e.f55644p, null, null, AbstractC14928e.f55635g, AbstractC14928e.f55643o, 16613240);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC30060g.m92107b(str, new LayoutWeightElement(1.0f, true), c23285v0, null, 0, false, 1, 0, null, null, c28655q, (i14 & 14) | 1572864, 952);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1909c(str, (Object) c14926c, (Object) modifier, (Object) function3, (Object) interfaceC4339a, i13, 10);
        }
    }
}
