package mx1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bg0.C3226h;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22971k;
import p291l0.C22994r1;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p635y2.C39102j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: mx1.s */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lkd1/o;", "tierImage", "Landroidx/compose/ui/Modifier;", "modifier", "", "centerTier", "Ll83/a0;", "b", "(Lkd1/o;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "membership_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26013s {
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:62:0x012b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0136  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m77305b(AbstractC22403o tierImage, Modifier modifier, boolean z4, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        boolean z13;
        int i17;
        boolean z14;
        Modifier modifier3;
        boolean z15;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        boolean z16;
        C2306l c2306l;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        AbstractC22676k.m65750j(tierImage, "tierImage");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-803219183);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(tierImage) : c28655q.m87157i(tierImage) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
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
                if ((i15 & 147) != 146) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    c2314t = C2314t.f9131w;
                    if (i18 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    float f13 = 4;
                    float f14 = ((float) 2.5d) * f13;
                    C22971k c22971kM66746i = AbstractC22977m.m66746i(f14);
                    if (z16) {
                        c2306l = C2299e.f9108K;
                    } else {
                        c2306l = C2299e.f9109L;
                    }
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22971kM66746i, c2306l, c28655q, 6);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    AbstractC29125c.m88524d(AbstractC34132o.m107874S(C38072d.f163053a.m121951d().getLogo().getWhoopText(), c28655q, 6), null, AbstractC1102d.m3411h(f13 * f13, c2314t), null, c28655q, 25008, 104);
                    Modifier modifier5 = modifier4;
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(tierImage, null, null, c28655q, AbstractC22403o.f87638a | (i15 & 14), 3), null, AbstractC1102d.m3411h(f14, c2314t), null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    z15 = z16;
                    modifier3 = modifier5;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    z15 = z13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3226h(tierImage, modifier3, z15, i13, i14, 22);
                }
            }
            i15 |= 384;
            z13 = z4;
            if ((i15 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                float f15 = 4;
                float f16 = ((float) 2.5d) * f15;
                C22971k c22971kM66746i2 = AbstractC22977m.m66746i(f16);
                if (z16) {
                    c2306l = C2299e.f9108K;
                } else {
                    c2306l = C2299e.f9109L;
                }
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22971kM66746i2, c2306l, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifier4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                AbstractC29125c.m88524d(AbstractC34132o.m107874S(C38072d.f163053a.m121951d().getLogo().getWhoopText(), c28655q, 6), null, AbstractC1102d.m3411h(f15 * f15, c2314t), null, c28655q, 25008, 104);
                Modifier modifier6 = modifier4;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(tierImage, null, null, c28655q, AbstractC22403o.f87638a | (i15 & 14), 3), null, AbstractC1102d.m3411h(f16, c2314t), null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
                c28655q = c28655q;
                c28655q.m87173q(true);
                z15 = z16;
                modifier3 = modifier6;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3226h(tierImage, modifier3, z15, i13, i14, 22);
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
            if ((i15 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                float f17 = 4;
                float f18 = ((float) 2.5d) * f17;
                C22971k c22971kM66746i3 = AbstractC22977m.m66746i(f18);
                if (z16) {
                    c2306l = C2299e.f9108K;
                } else {
                    c2306l = C2299e.f9109L;
                }
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22971kM66746i3, c2306l, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifier4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                AbstractC29125c.m88524d(AbstractC34132o.m107874S(C38072d.f163053a.m121951d().getLogo().getWhoopText(), c28655q, 6), null, AbstractC1102d.m3411h(f17 * f17, c2314t), null, c28655q, 25008, 104);
                Modifier modifier7 = modifier4;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(tierImage, null, null, c28655q, AbstractC22403o.f87638a | (i15 & 14), 3), null, AbstractC1102d.m3411h(f18, c2314t), null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
                c28655q = c28655q;
                c28655q.m87173q(true);
                z15 = z16;
                modifier3 = modifier7;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3226h(tierImage, modifier3, z15, i13, i14, 22);
            }
        }
        i15 |= 384;
        z13 = z4;
        if ((i15 & 147) != 146) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            c2314t = C2314t.f9131w;
            if (i18 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            if (i16 != 0) {
                z16 = true;
            } else {
                z16 = z13;
            }
            float f19 = 4;
            float f110 = ((float) 2.5d) * f19;
            C22971k c22971kM66746i4 = AbstractC22977m.m66746i(f110);
            if (z16) {
                c2306l = C2299e.f9108K;
            } else {
                c2306l = C2299e.f9109L;
            }
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(c22971kM66746i4, c2306l, c28655q, 6);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifier4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
            AbstractC29125c.m88524d(AbstractC34132o.m107874S(C38072d.f163053a.m121951d().getLogo().getWhoopText(), c28655q, 6), null, AbstractC1102d.m3411h(f19 * f19, c2314t), null, c28655q, 25008, 104);
            Modifier modifier8 = modifier4;
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(tierImage, null, null, c28655q, AbstractC22403o.f87638a | (i15 & 14), 3), null, AbstractC1102d.m3411h(f110, c2314t), null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
            c28655q = c28655q;
            c28655q.m87173q(true);
            z15 = z16;
            modifier3 = modifier8;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3226h(tierImage, modifier3, z15, i13, i14, 22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m77306c(AbstractC22403o abstractC22403o, Modifier modifier, boolean z4, int i13, int i14, Composer composer, int i15) {
        m77305b(abstractC22403o, modifier, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
