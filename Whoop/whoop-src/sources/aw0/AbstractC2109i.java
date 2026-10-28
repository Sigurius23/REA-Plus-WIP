package aw0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import ih0.AbstractC18489d0;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
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
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: aw0.i */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"", "value", "target", "", "isCompleted", "Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "b", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "core-details_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2109i {
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:62:0x0118  */
    /* JADX WARN: Code duplicated, block: B:64:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:67:0x01df  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m6664b(String value, String target, boolean z4, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z13;
        boolean z14;
        C28655q c28655q;
        String str;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(target, "target");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-471188284);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(value) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(target) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87155h(z4) ? 256 : 128;
        }
        int i16 = i14 & 8;
        if (i16 == 0) {
            if ((i13 & 3072) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z13)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                float f13 = 8;
                C22971k c22971kM66746i = AbstractC22977m.m66746i(((float) 1.5d) * f13);
                C2306l c2306l = C2299e.f9108K;
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22971kM66746i, c2306l, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifier4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q((float) 0.5d, f13, c2306l, c28655q2, 54);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, c2314t);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M53376q);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                C38072d c38072d = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                C2886a n13 = c38072d.m121952e(c28655q2, i17).getN6();
                int i18 = C2886a.f11498d << 18;
                int i19 = i15;
                AbstractC30795n.m94707h(value, null, c38072d.m121949b(c28655q2, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, n13, null, c28655q2, i15 & 14, i18, 196602);
                c28655q = c28655q2;
                str = target;
                AbstractC30795n.m94707h("/".concat(str), null, c38072d.m121949b(c28655q, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getN8(), null, c28655q, 0, i18, 196602);
                c28655q.m87173q(true);
                z14 = z4;
                AbstractC2104d.m6649b(z14, null, c28655q, (i19 >> 6) & 14, 2);
                c28655q.m87173q(true);
                modifier3 = modifier4;
            } else {
                z14 = z4;
                c28655q = c28655q2;
                str = target;
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2108h(value, str, z14, modifier3, i13, i14, 0);
            }
        }
        i15 |= 3072;
        modifier2 = modifier;
        if ((i15 & 1171) != 1170) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z13)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            float f14 = 8;
            C22971k c22971kM66746i2 = AbstractC22977m.m66746i(((float) 1.5d) * f14);
            C2306l c2306l2 = C2299e.f9108K;
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22971kM66746i2, c2306l2, c28655q2, 54);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifier4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i5, c22994r1M66759a2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N3);
            C22994r1 c22994r1M53376q2 = AbstractC18489d0.m53376q((float) 0.5d, f14, c2306l2, c28655q2, 54);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, c2314t);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, c22994r1M53376q2);
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N4);
            C38072d c38072d2 = C38072d.f163053a;
            int i110 = C38072d.f163054b;
            C2886a n14 = c38072d2.m121952e(c28655q2, i110).getN6();
            int i111 = C2886a.f11498d << 18;
            int i112 = i15;
            AbstractC30795n.m94707h(value, null, c38072d2.m121949b(c28655q2, i110).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, n14, null, c28655q2, i15 & 14, i111, 196602);
            c28655q = c28655q2;
            str = target;
            AbstractC30795n.m94707h("/".concat(str), null, c38072d2.m121949b(c28655q, i110).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i110).getN8(), null, c28655q, 0, i111, 196602);
            c28655q.m87173q(true);
            z14 = z4;
            AbstractC2104d.m6649b(z14, null, c28655q, (i112 >> 6) & 14, 2);
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            z14 = z4;
            c28655q = c28655q2;
            str = target;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2108h(value, str, z14, modifier3, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m6665c(String str, String str2, boolean z4, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m6664b(str, str2, z4, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
