package qk2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import kk2.AbstractC22551d;
import l83.C23454a0;
import ok2.C27999e;
import ok2.C28003i;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p294l3.C23285v0;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p571w3.C36775k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import v63.AbstractC35745c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: qk2.j */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lok2/i;", "itemState", "Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "b", "(Lok2/i;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "track-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30454j {
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0078  */
    /* JADX WARN: Code duplicated, block: B:37:0x007b  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:55:0x011c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0127  */
    /* JADX WARN: Code duplicated, block: B:60:0x0218  */
    /* JADX WARN: Code duplicated, block: B:62:0x0224  */
    /* JADX WARN: Code duplicated, block: B:64:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m93218b(C28003i itemState, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        C28655q c28655q;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifierM3398t;
        Modifier modifier4;
        float f13;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        TextResource textResourceM21277k;
        int i16;
        C38072d c38072d;
        int i17;
        long white20;
        int i18;
        C27999e zoneLabelState;
        AbstractC22676k.m65750j(itemState, "itemState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1880734222);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q2.m87153g(itemState) : c28655q2.m87157i(itemState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                modifierM3398t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier4 = modifierM3398t;
                } else {
                    modifier4 = modifier2;
                }
                f13 = 8;
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, modifier4), 2 * f13, 0.0f, 2);
                if (itemState.getCenterInContent()) {
                    modifierM3398t = AbstractC1099a.m3398t(modifierM3398t, 0.0f, 4 * f13, 0.0f, 0.0f, 13);
                }
                Modifier modifierMo3471e = modifierM3396r.mo3471e(modifierM3398t);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierMo3471e);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                if (itemState.getIsConnected() || itemState.getHeartRateBpm() == null) {
                    textResourceM21277k = AbstractC8693b.m21277k(AbstractC22551d.f88685a);
                } else {
                    textResourceM21277k = AbstractC8693b.m21278l(String.valueOf(itemState.getHeartRateBpm().intValue()));
                }
                i16 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(textResourceM21277k, c28655q2, i16);
                c38072d = C38072d.f163053a;
                i17 = C38072d.f163054b;
                C2886a n13 = c38072d.m121952e(c28655q2, i17).getN1();
                if (itemState.getIsConnected()) {
                    white20 = AbstractC25012a.m73366B(c28655q2, 594431026, c38072d, c28655q2, i17);
                } else {
                    c28655q2.m87150e0(594432111);
                    white20 = c38072d.m121949b(c28655q2, i17).getWhite20();
                }
                c28655q2.m87173q(false);
                i18 = C2886a.f11498d << 18;
                Modifier modifier5 = modifier4;
                AbstractC30795n.m94707h(strM21274h, null, white20, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, n13, null, c28655q2, 0, i18, 196602);
                float f14 = ((float) 1.5d) * f13;
                AbstractC30795n.m94707h(AbstractC8693b.m21273g(AbstractC22551d.f88687b, c28655q2, 0), AbstractC1099a.m3398t(modifierM3398t, 0.0f, f14, 0.0f, f14, 5), c38072d.m121949b(c28655q2, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new C2886a(C23285v0.m67364b(c38072d.m121952e(c28655q2, i17).getH3().getStyle(), 0L, AbstractC35745c.m113246h(18), null, null, 0L, 0, 0L, null, null, 16777213), null, 2, null), null, c28655q2, 0, i18, 196600);
                c28655q = c28655q2;
                zoneLabelState = itemState.getZoneLabelState();
                if (zoneLabelState == null) {
                    c28655q.m87150e0(1247905357);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1247905358);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(((float) 0.5d) * f13, modifierM3398t));
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(zoneLabelState.getLabel(), c28655q, i16), null, zoneLabelState.getColor().mo134584toComposableColorWaAFU9c(c28655q, 0), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, new C2886a(C23285v0.m67364b(c38072d.m121952e(c28655q, i17).getH2().getStyle(), 0L, AbstractC35745c.m113246h(21), null, null, 0L, 0, 0L, null, null, 16777213), null, 2, null), null, c28655q, 0, i18, 196090);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                modifier3 = modifier5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C30453i(itemState, i13, modifier3, i14, 0);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            modifierM3398t = C2314t.f9131w;
            if (i19 != 0) {
                modifier4 = modifierM3398t;
            } else {
                modifier4 = modifier2;
            }
            f13 = 8;
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, modifier4), 2 * f13, 0.0f, 2);
            if (itemState.getCenterInContent()) {
                modifierM3398t = AbstractC1099a.m3398t(modifierM3398t, 0.0f, 4 * f13, 0.0f, 0.0f, 13);
            }
            Modifier modifierMo3471e2 = modifierM3396r2.mo3471e(modifierM3398t);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
            if (itemState.getIsConnected()) {
                textResourceM21277k = AbstractC8693b.m21277k(AbstractC22551d.f88685a);
            } else {
                textResourceM21277k = AbstractC8693b.m21277k(AbstractC22551d.f88685a);
            }
            i16 = TextResource.$stable;
            String strM21274h2 = AbstractC8693b.m21274h(textResourceM21277k, c28655q2, i16);
            c38072d = C38072d.f163053a;
            i17 = C38072d.f163054b;
            C2886a n14 = c38072d.m121952e(c28655q2, i17).getN1();
            if (itemState.getIsConnected()) {
                white20 = AbstractC25012a.m73366B(c28655q2, 594431026, c38072d, c28655q2, i17);
            } else {
                c28655q2.m87150e0(594432111);
                white20 = c38072d.m121949b(c28655q2, i17).getWhite20();
            }
            c28655q2.m87173q(false);
            i18 = C2886a.f11498d << 18;
            Modifier modifier6 = modifier4;
            AbstractC30795n.m94707h(strM21274h2, null, white20, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, n14, null, c28655q2, 0, i18, 196602);
            float f15 = ((float) 1.5d) * f13;
            AbstractC30795n.m94707h(AbstractC8693b.m21273g(AbstractC22551d.f88687b, c28655q2, 0), AbstractC1099a.m3398t(modifierM3398t, 0.0f, f15, 0.0f, f15, 5), c38072d.m121949b(c28655q2, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new C2886a(C23285v0.m67364b(c38072d.m121952e(c28655q2, i17).getH3().getStyle(), 0L, AbstractC35745c.m113246h(18), null, null, 0L, 0, 0L, null, null, 16777213), null, 2, null), null, c28655q2, 0, i18, 196600);
            c28655q = c28655q2;
            zoneLabelState = itemState.getZoneLabelState();
            if (zoneLabelState == null) {
                c28655q.m87150e0(1247905357);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1247905358);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(((float) 0.5d) * f13, modifierM3398t));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(zoneLabelState.getLabel(), c28655q, i16), null, zoneLabelState.getColor().mo134584toComposableColorWaAFU9c(c28655q, 0), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, new C2886a(C23285v0.m67364b(c38072d.m121952e(c28655q, i17).getH2().getStyle(), 0L, AbstractC35745c.m113246h(21), null, null, 0L, 0, 0L, null, null, 16777213), null, 2, null), null, c28655q, 0, i18, 196090);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            modifier3 = modifier6;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30453i(itemState, i13, modifier3, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m93219c(C28003i c28003i, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m93218b(c28003i, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
