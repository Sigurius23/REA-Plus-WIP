package fy0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bg0.C3226h;
import l83.C23454a0;
import l83.C23465k;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p127ev.AbstractC13673n;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22989q;
import p291l0.InterfaceC23001u;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: fy0.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Ll0/u;", "", "showIconGlow", "Lkotlin/Function1;", "Ll83/a0;", "content", "b", "(Ll0/u;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "deep-dive_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14863a {
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:42:0x011e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0122  */
    /* JADX WARN: Code duplicated, block: B:48:0x0143  */
    /* JADX WARN: Code duplicated, block: B:51:0x0160  */
    /* JADX WARN: Code duplicated, block: B:54:0x016a  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m42887b(InterfaceC23001u interfaceC23001u, boolean z4, Function3 content, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        boolean z14;
        boolean z15;
        C28677v1 c28677v1M87180u;
        Modifier modifierM3357b;
        boolean z16;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i16;
        AbstractC22676k.m65750j(interfaceC23001u, "<this>");
        AbstractC22676k.m65750j(content, "content");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-339220890);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(interfaceC23001u) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i17 = i14 & 1;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q.m87157i(content)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i15 |= i16;
            }
            if ((i15 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i17 != 0) {
                    z13 = false;
                }
                C2307m c2307m = C2299e.f9103F;
                modifierM3357b = C2314t.f9131w;
                Modifier modifierMo3400a = interfaceC23001u.mo3400a(modifierM3357b, c2307m);
                if (z13) {
                    c28655q.m87150e0(328901403);
                    Modifier modifierM3419p = AbstractC1102d.m3419p(10 * 4, modifierM3357b);
                    C33252i c33252i = AbstractC33253j.f138651a;
                    C17909s c17909s = AbstractC17911t.f69612b;
                    Float fValueOf = Float.valueOf(0.0f);
                    C38072d c38072d = C38072d.f163053a;
                    int i18 = C38072d.f163054b;
                    modifierM3357b = AbstractC1092a.m3357b(modifierM3419p, C17909s.m51490h(c17909s, new C23465k[]{new C23465k(fValueOf, new C17919x(AbstractC13673n.m38559f(c38072d, c28655q, i18, 0.5f))), new C23465k(Float.valueOf(0.7f), new C17919x(AbstractC13673n.m38559f(c38072d, c28655q, i18, 0.5f))), new C23465k(Float.valueOf(1.0f), new C17919x(c38072d.m121949b(c28655q, i18).getBlack5()))}, 0L, 0.0f, 14), c33252i, 0.0f, 4);
                    z16 = false;
                    c28655q.m87173q(false);
                } else {
                    z16 = false;
                    c28655q.m87150e0(329419692);
                    c28655q.m87173q(false);
                }
                Modifier modifierMo3471e = modifierMo3400a.mo3471e(modifierM3357b);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, z16);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
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
                content.invoke(C1100b.f4583a, c28655q, Integer.valueOf(((i15 >> 3) & 112) | 6));
                c28655q.m87173q(true);
            } else {
                c28655q.m87138X();
            }
            z15 = z13;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3226h(interfaceC23001u, z15, content, i13, i14, 6);
            }
        }
        i15 |= 48;
        z13 = z4;
        if ((i13 & 384) == 0) {
            if (c28655q.m87157i(content)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i15 |= i16;
        }
        if ((i15 & 147) != 146) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            if (i17 != 0) {
                z13 = false;
            }
            C2307m c2307m2 = C2299e.f9103F;
            modifierM3357b = C2314t.f9131w;
            Modifier modifierMo3400a2 = interfaceC23001u.mo3400a(modifierM3357b, c2307m2);
            if (z13) {
                c28655q.m87150e0(328901403);
                Modifier modifierM3419p2 = AbstractC1102d.m3419p(10 * 4, modifierM3357b);
                C33252i c33252i2 = AbstractC33253j.f138651a;
                C17909s c17909s2 = AbstractC17911t.f69612b;
                Float fValueOf2 = Float.valueOf(0.0f);
                C38072d c38072d2 = C38072d.f163053a;
                int i19 = C38072d.f163054b;
                modifierM3357b = AbstractC1092a.m3357b(modifierM3419p2, C17909s.m51490h(c17909s2, new C23465k[]{new C23465k(fValueOf2, new C17919x(AbstractC13673n.m38559f(c38072d2, c28655q, i19, 0.5f))), new C23465k(Float.valueOf(0.7f), new C17919x(AbstractC13673n.m38559f(c38072d2, c28655q, i19, 0.5f))), new C23465k(Float.valueOf(1.0f), new C17919x(c38072d2.m121949b(c28655q, i19).getBlack5()))}, 0L, 0.0f, 14), c33252i2, 0.0f, 4);
                z16 = false;
                c28655q.m87173q(false);
            } else {
                z16 = false;
                c28655q.m87150e0(329419692);
                c28655q.m87173q(false);
            }
            Modifier modifierMo3471e2 = modifierMo3400a2.mo3471e(modifierM3357b);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, z16);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierMo3471e2);
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
            content.invoke(C1100b.f4583a, c28655q, Integer.valueOf(((i15 >> 3) & 112) | 6));
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        z15 = z13;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3226h(interfaceC23001u, z15, content, i13, i14, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m42888c(InterfaceC23001u interfaceC23001u, boolean z4, Function3 function3, int i13, int i14, Composer composer, int i15) {
        m42887b(interfaceC23001u, z4, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
