package os0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import e93.AbstractC12889b;
import id2.C18432q;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p208i2.AbstractC17918w0;
import p208i2.C17903p;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22994r1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import ug.AbstractC34924m;
import wb3.AbstractC37056f;
import x81.C38072d;
import yg2.C39531f;

/* JADX INFO: renamed from: os0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lyg2/f;", "state", "Ll83/a0;", "e", "(Lyg2/f;Landroidx/compose/runtime/Composer;I)V", "", "chargePercent", "color", "c", "(IILandroidx/compose/runtime/Composer;I)V", "connectivity-common-ui_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28309e {
    /* JADX INFO: renamed from: c */
    private static final void m85768c(int i13, int i14, Composer composer, int i15) {
        int i16;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1614928533);
        if ((i15 & 6) == 0) {
            i16 = (c28655q.m87149e(i13) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= c28655q.m87149e(i14) ? 32 : 16;
        }
        if (c28655q.m87135U(i16 & 1, (i16 & 19) != 18)) {
            float f13 = 4;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3419p = AbstractC1102d.m3419p(f13 * f13, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3419p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1099a.m3392n(AbstractC1102d.m3424u(((float) 2.9d) * f13 * AbstractC12889b.m36283m(i13 / 100.0f, 0.0f, 1.0f), AbstractC1102d.m3406c(1.0f, AbstractC1099a.m3396r(c2314t, 0.0f, 1 * f13, 1))), ((float) 0.4d) * f13, 0.0f, 2), C17919x.m51541c(0.5f, AbstractC34924m.m110156q(c28655q, i14)), AbstractC17918w0.f69621a), c28655q, 0);
            AbstractC29125c.m88522c(AbstractC29125c.m88500I(AbstractC28310f.f114132d, c28655q, 0), null, c2314t, null, null, 0.0f, new C17903p(AbstractC34924m.m110156q(c28655q, i14), 5), c28655q, 432, 56);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18432q(i13, i14, i15, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m85769d(int i13, int i14, int i15, Composer composer, int i16) {
        m85768c(i13, i14, composer, AbstractC28683x.m87244L(i15 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    public static final void m85770e(C39531f state, Composer composer, int i13) {
        int i14;
        C2314t c2314t;
        boolean z4;
        int i15;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-444721739);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87153g(state) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2306l c2306l = C2299e.f9108K;
            C22949e c22949e = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t2);
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
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9112O, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            if (state.getIsPuffinReady()) {
                c28655q.m87150e0(-1733222352);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
                int iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                m85768c(state.getChargePercent(), state.getColor(), c28655q, 0);
                float f13 = 4;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(1 * f13, c2314t2));
                String strM126283b = state.getChargePercentLabel();
                C38072d c38072d = C38072d.f163053a;
                int i16 = C38072d.f163054b;
                C2886a c2886aM8408F = c38072d.m121952e(c28655q, i16).getN9();
                long jM125430y = c38072d.m121949b(c28655q, i16).getBrandWhite();
                int i17 = C2886a.f11498d << 18;
                z4 = true;
                c2314t = c2314t2;
                AbstractC30795n.m94707h(strM126283b, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8408F, null, c28655q, 0, i17, 196602);
                c28655q.m87173q(true);
                AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, AbstractC28312h.f114174j), AbstractC1102d.m3424u(21 * f13, c2314t), c38072d.m121949b(c28655q, i16).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, true, 0, 0, null, c38072d.m121952e(c28655q, i16).getH6(), null, c28655q, 48, i17 | 384, 191992);
                c28655q = c28655q;
                i15 = 0;
                c28655q.m87173q(false);
            } else {
                c2314t = c2314t2;
                z4 = true;
                i15 = 0;
                c28655q.m87150e0(-1732389165);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z4);
            AbstractC29125c.m88522c(AbstractC29125c.m88500I(AbstractC28310f.f114131c, c28655q, i15), null, AbstractC1102d.m3419p(12 * 4, c2314t), null, null, 0.0f, null, c28655q, 432, 120);
            c28655q.m87173q(z4);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28308d(state, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m85771f(C39531f c39531f, int i13, Composer composer, int i14) {
        m85770e(c39531f, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
