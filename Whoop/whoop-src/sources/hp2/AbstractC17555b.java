package hp2;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import fc0.C14361e;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.C39102j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: hp2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lhp2/c;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "b", "(Lhp2/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "universal-checkout_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17555b {
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0098  */
    /* JADX WARN: Code duplicated, block: B:37:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0131  */
    /* JADX WARN: Code duplicated, block: B:49:0x0137  */
    /* JADX WARN: Code duplicated, block: B:54:0x0155  */
    /* JADX WARN: Code duplicated, block: B:60:0x0205  */
    /* JADX WARN: Code duplicated, block: B:62:0x020d  */
    /* JADX WARN: Code duplicated, block: B:67:0x022b  */
    /* JADX WARN: Code duplicated, block: B:71:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:74:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m49954b(C17556c viewState, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        C0209i c0209i2;
        C0209i c0209i3;
        int iHashCode3;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-460313997);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                float f13 = 8;
                C22971k c22971kM66746i = AbstractC22977m.m66746i(((float) 1.5d) * f13);
                Modifier modifierMo3471e = AbstractC1102d.m3409f(1.0f, c2314t).mo3471e(modifier4);
                C2305k c2305k = C2299e.f9110M;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66746i, c2305k, c28655q, 6);
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
                C0209i c0209i4 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a);
                C0209i c0209i5 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (!c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i6 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N);
                Modifier modifier5 = modifier4;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(viewState.getImage(), null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(24 * 4, c2314t), null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
                C23010x c23010xM73381n = AbstractC25012a.m73381n(1, f13, c2305k, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM73381n);
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m2);
                if (c28655q.f115903S && AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    c0209i2 = c0209i;
                } else {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N2);
                TextResource textResourceM49957b = viewState.getImageSubtitle();
                int i17 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(textResourceM49957b, c28655q, i17);
                C38072d c38072d = C38072d.f163053a;
                int i18 = C38072d.f163054b;
                long white70 = c38072d.m121949b(c28655q, i18).getWhite70();
                C2886a sh5 = c38072d.m121952e(c28655q, i18).getSh5();
                int i19 = C2886a.f11498d << 18;
                c0209i3 = c0209i2;
                AbstractC30795n.m94707h(strM21274h, null, white70, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, sh5, null, c28655q, 0, i19, 196602);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N3);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getTitle(), c28655q, i17), null, c38072d.m121949b(c28655q, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getT1(), null, c28655q, 0, i19, 196602);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSubtitle(), c28655q, i17), null, c38072d.m121949b(c28655q, i18).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getB1(), null, c28655q, 0, i19, 196602);
                c28655q = c28655q;
                AbstractC25012a.m73392y(c28655q, true, true, true);
                modifier3 = modifier5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14361e(viewState, i13, modifier3, i14, 20);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            float f14 = 8;
            C22971k c22971kM66746i2 = AbstractC22977m.m66746i(((float) 1.5d) * f14);
            Modifier modifierMo3471e2 = AbstractC1102d.m3409f(1.0f, c2314t).mo3471e(modifier4);
            C2305k c2305k2 = C2299e.f9110M;
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22971kM66746i2, c2305k2, c28655q, 6);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierMo3471e2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i7 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i7, c23010xM66775a3);
            C0209i c0209i8 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (!c28655q.f115903S) {
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i9 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N4);
            Modifier modifier6 = modifier4;
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(viewState.getImage(), null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(24 * 4, c2314t), null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
            C23010x c23010xM73381n2 = AbstractC25012a.m73381n(1, f14, c2305k2, c28655q, 6);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, c23010xM73381n2);
            AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m5);
            if (c28655q.f115903S) {
                c0209i2 = c0209i;
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
            } else {
                c0209i2 = c0209i;
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N5);
            TextResource textResourceM49957b2 = viewState.getImageSubtitle();
            int i110 = TextResource.$stable;
            String strM21274h2 = AbstractC8693b.m21274h(textResourceM49957b2, c28655q, i110);
            C38072d c38072d2 = C38072d.f163053a;
            int i111 = C38072d.f163054b;
            long white71 = c38072d2.m121949b(c28655q, i111).getWhite70();
            C2886a sh6 = c38072d2.m121952e(c28655q, i111).getSh5();
            int i112 = C2886a.f11498d << 18;
            c0209i3 = c0209i2;
            AbstractC30795n.m94707h(strM21274h2, null, white71, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, sh6, null, c28655q, 0, i112, 196602);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k2, c28655q, 0);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getTitle(), c28655q, i110), null, c38072d2.m121949b(c28655q, i111).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i111).getT1(), null, c28655q, 0, i112, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSubtitle(), c28655q, i110), null, c38072d2.m121949b(c28655q, i111).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i111).getB1(), null, c28655q, 0, i112, 196602);
            c28655q = c28655q;
            AbstractC25012a.m73392y(c28655q, true, true, true);
            modifier3 = modifier6;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14361e(viewState, i13, modifier3, i14, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m49955c(C17556c c17556c, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m49954b(c17556c, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
