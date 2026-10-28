package yy0;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bz0.C3711a;
import com.whoop.design.util.AbstractC8693b;
import ht2.C17630b;
import ih0.AbstractC18489d0;
import java.util.List;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p292l1.AbstractC23164r1;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;
import p91.AbstractC29011e;
import p91.C29007a;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: yy0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\f\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lyy0/c;", "state", "Ll83/a0;", "c", "(Landroidx/compose/ui/Modifier;Lyy0/c;Landroidx/compose/runtime/Composer;II)V", "", "Lp91/a;", "anchorPoint", "", "isInverted", "e", "(Ljava/util/List;Lp91/a;ZLandroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39888b {
    /* JADX INFO: renamed from: c */
    public static final void m127971c(Modifier modifier, C39889c state, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C17919x c17919xM31989h;
        long jM53358D;
        boolean z4;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1531893274);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(state) : c28655q.m87157i(state) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            InterfaceC39332e color = state.getColor();
            if (color == null) {
                c28655q.m87150e0(1690060360);
                c28655q.m87173q(false);
                c17919xM31989h = null;
            } else {
                c28655q.m87150e0(1024349401);
                c17919xM31989h = AbstractC11895b.m31989h(c28655q, false, color.mo134584toComposableColorWaAFU9c(c28655q, 0));
            }
            if (c17919xM31989h == null) {
                c28655q.m87150e0(1024350701);
                jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, 6, false);
            } else {
                c28655q.m87150e0(1024349027);
                c28655q.m87173q(false);
                jM53358D = c17919xM31989h.f69639a;
            }
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier2);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            if (state.getIcon() != null) {
                c28655q.m87150e0(-1522214945);
                float f13 = 4;
                AbstractC23164r1.m67132a(AbstractC29125c.m88500I(state.getIcon().toWhoopIcon(), c28655q, 0), null, AbstractC1102d.m3419p(3 * f13, AbstractC1099a.m3392n(c2314t, 0.0f, ((float) 0.25d) * f13, 1)), jM53358D, c28655q, 432);
                c28655q.m87173q(false);
                z4 = true;
            } else {
                if (state.getSubLabel() != null) {
                    c28655q.m87150e0(-1521879246);
                    String strM21274h = AbstractC8693b.m21274h(state.getLabel(), c28655q, 0);
                    C38072d c38072d = C38072d.f163053a;
                    AbstractC30795n.m94707h(strM21274h, null, jM53358D, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB4(), null, c28655q, 0, 0, 196602);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(state.getSubLabel(), c28655q, 0), null, jM53358D, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getN9(), null, c28655q, 0, 0, 196602);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1521654403);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(state.getLabel(), c28655q, 0), null, jM53358D, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getN10(), null, c28655q, 0, 0, 196602);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                z4 = true;
            }
            c28655q.m87173q(z4);
        } else {
            c28655q.m87138X();
        }
        Modifier modifier3 = modifier2;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3711a(modifier3, i13, state, i14, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m127972d(Modifier modifier, C39889c c39889c, int i13, int i14, Composer composer, int i15) {
        m127971c(modifier, c39889c, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    public static final void m127973e(List<C39889c> list, C29007a c29007a, boolean z4, Composer composer, int i13, int i14) {
        AbstractC22676k.m65750j(list, "<this>");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1714537816);
        int i15 = (i13 & 6) == 0 ? (c28655q.m87157i(list) ? 4 : 2) | i13 : i13;
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(c29007a) ? 32 : 16;
        }
        int i17 = i14 & 2;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            if (i16 != 0) {
                c29007a = C29007a.INSTANCE.m88137b();
            }
            if (i17 != 0) {
                z4 = false;
            }
            for (C39889c c39889c : list) {
                m127971c(AbstractC29011e.m88149j(C2314t.f9131w, c39889c.getXPercent(), z4 ? 1 - c39889c.getYPercent() : c39889c.getYPercent(), c29007a), c39889c, c28655q, 0, 0);
            }
        } else {
            c28655q.m87138X();
        }
        C29007a c29007a2 = c29007a;
        boolean z13 = z4;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17630b(list, c29007a2, z13, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m127974f(List list, C29007a c29007a, boolean z4, int i13, int i14, Composer composer, int i15) {
        m127973e(list, c29007a, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
