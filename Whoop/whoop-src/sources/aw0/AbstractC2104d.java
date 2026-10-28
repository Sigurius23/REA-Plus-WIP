package aw0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
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
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import vv0.AbstractC36529b;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: aw0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, m65681d2 = {"", "isCompleted", "Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "b", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Ly3/f;", "a", "F", "BorderWidth", "core-details_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2104d {

    /* JADX INFO: renamed from: a */
    private static final float f8345a = (float) 1.5d;

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x007c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0092  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:49:0x010f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0113  */
    /* JADX WARN: Code duplicated, block: B:55:0x0134  */
    /* JADX WARN: Code duplicated, block: B:57:0x0158  */
    /* JADX WARN: Code duplicated, block: B:60:0x0161  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m6649b(boolean z4, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z13;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        EnumC16313m0 enumC16313m0;
        long jM53363d;
        long jM125379a1;
        long jM95628d;
        int i16;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1735127058);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87155h(z4) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                c2314t = C2314t.f9131w;
                if (i17 != 0) {
                    modifier2 = c2314t;
                }
                if (z4) {
                    enumC16313m0 = EnumC16313m0.TINY_CHECKMARK;
                } else {
                    enumC16313m0 = EnumC16313m0.TINY_CROSS;
                }
                if (z4) {
                    c28655q.m87150e0(-1009783784);
                    jM53363d = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                } else {
                    c28655q.m87150e0(-1009782699);
                    jM53363d = AbstractC18489d0.m53363d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                }
                long j7 = jM53363d;
                if (z4) {
                    c28655q.m87150e0(-1009780831);
                    jM125379a1 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getAccentPositiveTrend();
                } else {
                    c28655q.m87150e0(-1009779468);
                    jM125379a1 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite5();
                }
                c28655q.m87173q(false);
                if (z4) {
                    c28655q.m87150e0(-1009777575);
                    jM95628d = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getTransparent();
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1009776459);
                    jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                }
                if (z4) {
                    i16 = AbstractC36529b.f156332c;
                } else {
                    i16 = AbstractC36529b.f156333d;
                }
                String strM92103Y = AbstractC30060g.m92103Y(c28655q, i16);
                C33252i c33252i = AbstractC33253j.f138651a;
                Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 0.5d) * 8, AbstractC15751g.m44455h(AbstractC1092a.m3358c(modifier2, jM125379a1, c33252i), f8345a, jM95628d, c33252i));
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
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
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                AbstractC15005f3.m43107a(AbstractC29125c.m88500I(enumC16313m0.toWhoopIcon(), c28655q, 0), strM92103Y, AbstractC1102d.m3419p(2 * 4, c2314t), j7, c28655q, 384, 0);
                c28655q.m87173q(true);
            } else {
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2103c(i13, i14, 0, modifier2, z4);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i15 & 19) != 18) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            c2314t = C2314t.f9131w;
            if (i17 != 0) {
                modifier2 = c2314t;
            }
            if (z4) {
                enumC16313m0 = EnumC16313m0.TINY_CHECKMARK;
            } else {
                enumC16313m0 = EnumC16313m0.TINY_CROSS;
            }
            if (z4) {
                c28655q.m87150e0(-1009783784);
                jM53363d = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            } else {
                c28655q.m87150e0(-1009782699);
                jM53363d = AbstractC18489d0.m53363d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            }
            long j13 = jM53363d;
            if (z4) {
                c28655q.m87150e0(-1009780831);
                jM125379a1 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getAccentPositiveTrend();
            } else {
                c28655q.m87150e0(-1009779468);
                jM125379a1 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite5();
            }
            c28655q.m87173q(false);
            if (z4) {
                c28655q.m87150e0(-1009777575);
                jM95628d = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getTransparent();
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1009776459);
                jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            }
            if (z4) {
                i16 = AbstractC36529b.f156332c;
            } else {
                i16 = AbstractC36529b.f156333d;
            }
            String strM92103Y2 = AbstractC30060g.m92103Y(c28655q, i16);
            C33252i c33252i2 = AbstractC33253j.f138651a;
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(((float) 0.5d) * 8, AbstractC15751g.m44455h(AbstractC1092a.m3358c(modifier2, jM125379a1, c33252i2), f8345a, jM95628d, c33252i2));
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            AbstractC15005f3.m43107a(AbstractC29125c.m88500I(enumC16313m0.toWhoopIcon(), c28655q, 0), strM92103Y2, AbstractC1102d.m3419p(2 * 4, c2314t), j13, c28655q, 384, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2103c(i13, i14, 0, modifier2, z4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m6650c(boolean z4, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m6649b(z4, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
