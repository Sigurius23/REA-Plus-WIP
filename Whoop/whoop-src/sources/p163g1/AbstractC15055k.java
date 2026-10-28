package p163g1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4351m;
import f01.C13857f;
import hg3.AbstractC17269i;
import ih0.AbstractC18489d0;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p127ev.AbstractC13673n;
import p208i2.InterfaceC17869a1;
import p291l0.AbstractC22989q;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.jvm.internal.AbstractC22676k;
import v63.AbstractC35745c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: g1.k */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15055k {

    /* JADX INFO: renamed from: a */
    public static final Modifier f56362a;

    /* JADX INFO: renamed from: b */
    public static final Modifier f56363b;

    /* JADX INFO: renamed from: c */
    public static final long f56364c;

    /* JADX INFO: renamed from: d */
    public static final long f56365d;

    /* JADX INFO: renamed from: e */
    public static final long f56366e;

    static {
        float f13 = 24;
        C2314t c2314t = C2314t.f9131w;
        f56362a = AbstractC1099a.m3398t(c2314t, f13, 0.0f, f13, 0.0f, 10);
        f56363b = AbstractC1099a.m3398t(c2314t, f13, 0.0f, f13, 28, 2);
        f56364c = AbstractC35745c.m113246h(40);
        f56365d = AbstractC35745c.m113246h(36);
        f56366e = AbstractC35745c.m113246h(38);
    }

    /* JADX INFO: renamed from: a */
    public static final void m43140a(InterfaceC4351m interfaceC4351m, InterfaceC4351m interfaceC4351m2, Composer composer, int i13) {
        InterfaceC4351m interfaceC4351m3;
        Object obj;
        boolean z4;
        boolean z13;
        InterfaceC4351m interfaceC4351m4;
        InterfaceC4351m interfaceC4351m5 = interfaceC4351m2;
        C2307m c2307m = C2299e.f9114w;
        C2305k c2305k = C2299e.f9110M;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1213983107);
        int i14 = (c28655q.m87157i(interfaceC4351m) ? 32 : 16) | i13 | (c28655q.m87157i(interfaceC4351m5) ? 256 : 128);
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = C14979d.f55983b;
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC39127r0 interfaceC39127r0 = (InterfaceC39127r0) objM87133R;
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            if (interfaceC4351m == null) {
                c28655q.m87150e0(1809237538);
                c28655q.m87173q(false);
                z4 = false;
                obj = 0;
            } else {
                c28655q.m87150e0(1809237539);
                Modifier modifierM38560g = AbstractC13673n.m38560g(c2305k, AbstractC1131a.m3499c(f56362a, "title"));
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM38560g);
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
                obj = 0;
                interfaceC4351m.invoke(c28655q, null);
                c28655q.m87173q(true);
                z4 = false;
                c28655q.m87173q(false);
            }
            if (interfaceC4351m5 == null) {
                c28655q.m87150e0(1809370342);
                c28655q.m87173q(z4);
                z13 = true;
                interfaceC4351m4 = interfaceC4351m5;
            } else {
                c28655q.m87150e0(1809370343);
                Modifier modifierM38560g2 = AbstractC13673n.m38560g(c2305k, AbstractC1131a.m3499c(f56363b, "text"));
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, z4);
                int iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM38560g2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                InterfaceC4351m interfaceC4351m6 = interfaceC4351m2;
                interfaceC4351m6.invoke(c28655q, obj);
                z13 = true;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
                interfaceC4351m4 = interfaceC4351m6;
            }
            c28655q.m87173q(z13);
            interfaceC4351m3 = interfaceC4351m4;
        } else {
            c28655q.m87138X();
            interfaceC4351m3 = interfaceC4351m5;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13857f(interfaceC4351m, interfaceC4351m3, i13, 12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m43141b(final C37816b c37816b, final Modifier modifier, final InterfaceC4351m interfaceC4351m, final InterfaceC4351m interfaceC4351m2, final InterfaceC17869a1 interfaceC17869a1, final long j7, final long j13, Composer composer, final int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1945098332);
        int i14 = i13 | (c28655q.m87157i(c37816b) ? 4 : 2) | (c28655q.m87153g(modifier) ? 32 : 16) | (c28655q.m87157i(interfaceC4351m) ? 256 : 128) | (c28655q.m87157i(interfaceC4351m2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) | (c28655q.m87153g(interfaceC17869a1) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK) | (c28655q.m87151f(j7) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) | (c28655q.m87151f(j13) ? 1048576 : 524288);
        if (c28655q.m87135U(i14 & 1, (599187 & i14) != 599186)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0 && !c28655q.m87118C()) {
                c28655q.m87138X();
            }
            c28655q.m87175r();
            int i15 = ((i14 >> 3) & 14) | 1572864;
            int i16 = i14 >> 9;
            AbstractC17269i.m48898k(modifier, interfaceC17869a1, j7, j13, null, 0.0f, AbstractC37817c.m121344e(802957984, c28655q, new C15001f(interfaceC4351m, interfaceC4351m2, c37816b, 0)), c28655q, i15 | (i16 & 112) | (i16 & 896) | (i16 & 7168), 48);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m(modifier, interfaceC4351m, interfaceC4351m2, interfaceC17869a1, j7, j13, i13) { // from class: g1.b

                /* JADX INFO: renamed from: E */
                public final /* synthetic */ InterfaceC17869a1 f55799E;

                /* JADX INFO: renamed from: F */
                public final /* synthetic */ long f55800F;

                /* JADX INFO: renamed from: G */
                public final /* synthetic */ long f55801G;

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ Modifier f55803x;

                /* JADX INFO: renamed from: y */
                public final /* synthetic */ InterfaceC4351m f55804y;

                /* JADX INFO: renamed from: z */
                public final /* synthetic */ InterfaceC4351m f55805z;

                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM87244L = AbstractC28683x.m87244L(1);
                    AbstractC15055k.m43141b(this.f55802w, this.f55803x, this.f55804y, this.f55805z, this.f55799E, this.f55800F, this.f55801G, (Composer) obj, iM87244L);
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m43142c(float f13, float f14, C37816b c37816b, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1271829505);
        if (c28655q.m87135U(i13 & 1, (i13 & 147) != 146)) {
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C15023h(f13, f14, 0);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC39127r0 interfaceC39127r0 = (InterfaceC39127r0) objM87133R;
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC18489d0.m53384y(6, c37816b, c28655q, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14946a(f13, f14, c37816b, i13, 0);
        }
    }
}
