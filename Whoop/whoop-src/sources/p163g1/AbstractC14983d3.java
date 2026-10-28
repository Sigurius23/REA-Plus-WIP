package p163g1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.material.MinimumInteractiveModifier;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import f61.C14143e;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p097ds.AbstractC12313p;
import p209i3.C18027i;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: g1.d3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14983d3 {

    /* JADX INFO: renamed from: a */
    public static final float f56002a = 24;

    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:63:0x010a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0133  */
    /* JADX WARN: Code duplicated, block: B:68:0x013d  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m43104a(InterfaceC4339a interfaceC4339a, Modifier modifier, boolean z4, InterfaceC4351m interfaceC4351m, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        boolean z13;
        int i17;
        int i18;
        boolean z14;
        boolean z15;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        boolean z16;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        float fFloatValue;
        int i19;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1316660641);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(interfaceC4339a) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i24 = i14 & 2;
        if (i24 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    z13 = z4;
                    if (c28655q.m87155h(z13)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i15 | 3072;
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87157i(interfaceC4351m)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i18 |= i19;
                }
                if ((i18 & 9363) != 9362) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i18 & 1, z14)) {
                    if (i24 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i16 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    C28674u2 c28674u2 = AbstractC15027h3.f56241a;
                    Modifier modifierM3360e = AbstractC1092a.m3360e(modifier3.mo3471e(MinimumInteractiveModifier.f4718w), null, AbstractC15210z4.m43228a(0L, 4, false, f56002a), z16, new C18027i(0), interfaceC4339a, 8);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3360e);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    if (z16) {
                        c28655q.m87150e0(-1874697310);
                        fFloatValue = ((Number) c28655q.m87161k(AbstractC15047j1.f56336a)).floatValue();
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1874696477);
                        AbstractC12313p.m34255G(c28655q);
                        c28655q.m87173q(false);
                        fFloatValue = 0.38f;
                    }
                    AbstractC28683x.m87247a(AbstractC15047j1.f56336a.mo86977a(Float.valueOf(fFloatValue)), interfaceC4351m, c28655q, ((i18 >> 9) & 112) | 8);
                    c28655q.m87173q(true);
                    modifier2 = modifier3;
                    z15 = z16;
                } else {
                    c28655q.m87138X();
                    z15 = z13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C14143e(i13, i14, 1, interfaceC4339a, modifier2, interfaceC4351m, z15);
                }
            }
            i15 |= 384;
            z13 = z4;
            i18 = i15 | 3072;
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(interfaceC4351m)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i18 |= i19;
            }
            if ((i18 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i18 & 1, z14)) {
                if (i24 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if (i16 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                C28674u2 c28674u3 = AbstractC15027h3.f56241a;
                Modifier modifierM3360e2 = AbstractC1092a.m3360e(modifier3.mo3471e(MinimumInteractiveModifier.f4718w), null, AbstractC15210z4.m43228a(0L, 4, false, f56002a), z16, new C18027i(0), interfaceC4339a, 8);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3360e2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                if (z16) {
                    c28655q.m87150e0(-1874697310);
                    fFloatValue = ((Number) c28655q.m87161k(AbstractC15047j1.f56336a)).floatValue();
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1874696477);
                    AbstractC12313p.m34255G(c28655q);
                    c28655q.m87173q(false);
                    fFloatValue = 0.38f;
                }
                AbstractC28683x.m87247a(AbstractC15047j1.f56336a.mo86977a(Float.valueOf(fFloatValue)), interfaceC4351m, c28655q, ((i18 >> 9) & 112) | 8);
                c28655q.m87173q(true);
                modifier2 = modifier3;
                z15 = z16;
            } else {
                c28655q.m87138X();
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14143e(i13, i14, 1, interfaceC4339a, modifier2, interfaceC4351m, z15);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                if (c28655q.m87155h(z13)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i15 | 3072;
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(interfaceC4351m)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i18 |= i19;
            }
            if ((i18 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i18 & 1, z14)) {
                if (i24 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if (i16 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                C28674u2 c28674u4 = AbstractC15027h3.f56241a;
                Modifier modifierM3360e3 = AbstractC1092a.m3360e(modifier3.mo3471e(MinimumInteractiveModifier.f4718w), null, AbstractC15210z4.m43228a(0L, 4, false, f56002a), z16, new C18027i(0), interfaceC4339a, 8);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3360e3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                if (z16) {
                    c28655q.m87150e0(-1874697310);
                    fFloatValue = ((Number) c28655q.m87161k(AbstractC15047j1.f56336a)).floatValue();
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1874696477);
                    AbstractC12313p.m34255G(c28655q);
                    c28655q.m87173q(false);
                    fFloatValue = 0.38f;
                }
                AbstractC28683x.m87247a(AbstractC15047j1.f56336a.mo86977a(Float.valueOf(fFloatValue)), interfaceC4351m, c28655q, ((i18 >> 9) & 112) | 8);
                c28655q.m87173q(true);
                modifier2 = modifier3;
                z15 = z16;
            } else {
                c28655q.m87138X();
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14143e(i13, i14, 1, interfaceC4339a, modifier2, interfaceC4351m, z15);
            }
        }
        i15 |= 384;
        z13 = z4;
        i18 = i15 | 3072;
        if ((i13 & 24576) == 0) {
            if (c28655q.m87157i(interfaceC4351m)) {
                i19 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i19 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i18 |= i19;
        }
        if ((i18 & 9363) != 9362) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i18 & 1, z14)) {
            if (i24 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            if (i16 != 0) {
                z16 = true;
            } else {
                z16 = z13;
            }
            C28674u2 c28674u5 = AbstractC15027h3.f56241a;
            Modifier modifierM3360e4 = AbstractC1092a.m3360e(modifier3.mo3471e(MinimumInteractiveModifier.f4718w), null, AbstractC15210z4.m43228a(0L, 4, false, f56002a), z16, new C18027i(0), interfaceC4339a, 8);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3360e4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
            if (z16) {
                c28655q.m87150e0(-1874697310);
                fFloatValue = ((Number) c28655q.m87161k(AbstractC15047j1.f56336a)).floatValue();
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1874696477);
                AbstractC12313p.m34255G(c28655q);
                c28655q.m87173q(false);
                fFloatValue = 0.38f;
            }
            AbstractC28683x.m87247a(AbstractC15047j1.f56336a.mo86977a(Float.valueOf(fFloatValue)), interfaceC4351m, c28655q, ((i18 >> 9) & 112) | 8);
            c28655q.m87173q(true);
            modifier2 = modifier3;
            z15 = z16;
        } else {
            c28655q.m87138X();
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14143e(i13, i14, 1, interfaceC4339a, modifier2, interfaceC4351m, z15);
        }
    }
}
