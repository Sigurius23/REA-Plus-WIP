package p163g1;

import a81.C0556g;
import al.AbstractC0954a;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import cy1.C11186b;
import e93.AbstractC12889b;
import ep1.C13412g;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11343d2;
import p077d0.AbstractC11348f;
import p077d0.C11347e2;
import p077d0.C11351f2;
import p077d0.C11393q0;
import p077d0.C11409v1;
import p077d0.C11421z1;
import p077d0.InterfaceC11403t1;
import p077d0.InterfaceC11419z;
import p132f0.C13821r1;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22994r1;
import p291l0.InterfaceC22973k1;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: g1.o3 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15099o3 {

    /* JADX INFO: renamed from: a */
    public static final float f56552a;

    /* JADX INFO: renamed from: b */
    public static final float f56553b;

    /* JADX INFO: renamed from: d */
    public static final float f56555d;

    /* JADX INFO: renamed from: g */
    public static final float f56558g;

    /* JADX INFO: renamed from: c */
    public static final float f56554c = 16;

    /* JADX INFO: renamed from: e */
    public static final float f56556e = 112;

    /* JADX INFO: renamed from: f */
    public static final float f56557f = 280;

    static {
        float f13 = 8;
        f56552a = f13;
        float f14 = 48;
        f56553b = f14;
        f56555d = f13;
        f56558g = f14;
    }

    /* JADX INFO: renamed from: a */
    public static final void m43167a(C11393q0 c11393q0, InterfaceC28601c1 interfaceC28601c1, C13821r1 c13821r1, Modifier modifier, Function3 function3, Composer composer, int i13) {
        InterfaceC11419z interfaceC11419z;
        C11347e2 c11347e2M30574v;
        boolean z4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1077393800);
        int i14 = i13 | (c28655q.m87153g(c11393q0) ? 4 : 2) | (c28655q.m87153g(c13821r1) ? 256 : 128) | (c28655q.m87153g(modifier) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) | (c28655q.m87157i(function3) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK);
        if (c28655q.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            C11421z1 c11421z1M30543e = AbstractC11343d2.m30543e(c11393q0, "DropDownMenu", c28655q, (i14 & 14) | 48);
            C11351f2 c11351f2 = AbstractC11348f.f36367i;
            AbstractC0954a abstractC0954a = c11421z1M30543e.f36630a;
            C28633k1 c28633k1 = c11421z1M30543e.f36633d;
            boolean zBooleanValue = ((Boolean) abstractC0954a.mo2428y0()).booleanValue();
            c28655q.m87150e0(-1833869404);
            float f13 = zBooleanValue ? 1.0f : 0.8f;
            c28655q.m87173q(false);
            Float fValueOf = Float.valueOf(f13);
            boolean zBooleanValue2 = ((Boolean) c28633k1.getValue()).booleanValue();
            c28655q.m87150e0(-1833869404);
            float f14 = zBooleanValue2 ? 1.0f : 0.8f;
            c28655q.m87173q(false);
            Float fValueOf2 = Float.valueOf(f14);
            InterfaceC11403t1 interfaceC11403t1M30664f = c11421z1M30543e.m30664f();
            c28655q.m87150e0(445475263);
            Boolean bool = Boolean.FALSE;
            Boolean bool2 = Boolean.TRUE;
            if (interfaceC11403t1M30664f.m30637d(bool, bool2)) {
                c11347e2M30574v = AbstractC11348f.m30574v(120, 0, AbstractC11333b0.f36311b, 2);
                z4 = false;
                interfaceC11419z = null;
            } else {
                interfaceC11419z = null;
                c11347e2M30574v = AbstractC11348f.m30574v(1, 74, null, 4);
                z4 = false;
            }
            c28655q.m87173q(z4);
            InterfaceC11419z interfaceC11419z2 = interfaceC11419z;
            C11409v1 c11409v1M30542d = AbstractC11343d2.m30542d(c11421z1M30543e, fValueOf, fValueOf2, c11347e2M30574v, c11351f2, c28655q, 0);
            boolean zBooleanValue3 = ((Boolean) c11421z1M30543e.f36630a.mo2428y0()).booleanValue();
            c28655q.m87150e0(-1578341192);
            float f15 = zBooleanValue3 ? 1.0f : 0.0f;
            c28655q.m87173q(false);
            Float fValueOf3 = Float.valueOf(f15);
            boolean zBooleanValue4 = ((Boolean) c28633k1.getValue()).booleanValue();
            c28655q.m87150e0(-1578341192);
            float f16 = zBooleanValue4 ? 1.0f : 0.0f;
            c28655q.m87173q(false);
            Float fValueOf4 = Float.valueOf(f16);
            InterfaceC11403t1 interfaceC11403t1M30664f2 = c11421z1M30543e.m30664f();
            c28655q.m87150e0(701003475);
            C11347e2 c11347e2M30574v2 = interfaceC11403t1M30664f2.m30637d(bool, bool2) ? AbstractC11348f.m30574v(30, 0, interfaceC11419z2, 6) : AbstractC11348f.m30574v(75, 0, interfaceC11419z2, 6);
            c28655q.m87173q(false);
            C11409v1 c11409v1M30542d2 = AbstractC11343d2.m30542d(c11421z1M30543e, fValueOf3, fValueOf4, c11347e2M30574v2, c11351f2, c28655q, 0);
            boolean zM87153g = c28655q.m87153g(c11409v1M30542d) | c28655q.m87153g(c11409v1M30542d2);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C13412g(interfaceC28601c1, c11409v1M30542d, c11409v1M30542d2, 13);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC12889b.m36263b(AbstractC1127a.m3486a(C2314t.f9131w, (Function1) objM87133R), null, 0L, null, f56552a, AbstractC37817c.m121344e(-707086267, c28655q, new C15001f(modifier, c13821r1, function3, 1)), c28655q, 1769472, 30);
            c28655q = c28655q;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0556g(c11393q0, interfaceC28601c1, c13821r1, modifier, function3, i13, 4);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m43168b(InterfaceC4339a interfaceC4339a, InterfaceC22973k1 interfaceC22973k1, Function3 function3, Composer composer, int i13) {
        int i14;
        InterfaceC4339a interfaceC4339a2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-674391690);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(interfaceC4339a) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        int i15 = i13 & 48;
        C2314t c2314t = C2314t.f9131w;
        if (i15 == 0) {
            i14 |= c28655q.m87153g(c2314t) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87155h(true) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87153g(interfaceC22973k1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87153g(null) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87157i(function3) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if (c28655q.m87135U(i14 & 1, (74899 & i14) != 74898)) {
            interfaceC4339a2 = interfaceC4339a;
            Modifier modifierM3393o = AbstractC1099a.m3393o(interfaceC22973k1, AbstractC1102d.m3423t(AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3360e(c2314t, null, AbstractC15210z4.m43228a(0L, 6, true, 0.0f), true, null, interfaceC4339a2, 24)), f56556e, f56558g, f56557f, 0.0f, 8));
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3393o);
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
            AbstractC15011f9.m43113a(((C15033h9) c28655q.m87161k(AbstractC15044i9.f56319b)).f56280g, AbstractC37817c.m121344e(-77738101, c28655q, new C15076m0(2, function3)), c28655q, 48);
            c28655q.m87173q(true);
        } else {
            interfaceC4339a2 = interfaceC4339a;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11186b(interfaceC4339a2, interfaceC22973k1, function3, i13);
        }
    }
}
