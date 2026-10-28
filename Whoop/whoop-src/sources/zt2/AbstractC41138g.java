package zt2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import ge3.AbstractC15751g;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22994r1;
import p291l0.C23000t1;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.C39102j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;
import yf1.C39516e;

/* JADX INFO: renamed from: zt2.g */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lzt2/f;", "dividerWithImageViewState", "Ll83/a0;", "b", "(Landroidx/compose/ui/Modifier;Lzt2/f;Landroidx/compose/runtime/Composer;I)V", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC41138g {
    /* JADX INFO: renamed from: b */
    public static final void m133573b(Modifier modifier, C41137f dividerWithImageViewState, Composer composer, int i13) {
        int i14;
        long transparent;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(dividerWithImageViewState, "dividerWithImageViewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-972168764);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(dividerWithImageViewState) : c28655q.m87157i(dividerWithImageViewState) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            if (dividerWithImageViewState.getDisplayDivider()) {
                c28655q.m87150e0(-914995531);
                transparent = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            } else {
                c28655q.m87150e0(-914948783);
                transparent = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getTransparent();
                c28655q.m87173q(false);
            }
            long j7 = transparent;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            float f13 = 1;
            float f14 = f13 * 8;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, f14, 0.0f, 11);
            C23000t1 c23000t1 = C23000t1.f90727a;
            AbstractC15751g.m44449b(c23000t1.mo66772c(modifierM3398t, true, 1.0f), j7, f13, 0.0f, c28655q, 384, 8);
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(dividerWithImageViewState.getBackgroundImg(), null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3384f(c23000t1.mo66772c(c2314t, false, 1.5f), false, 2.0f)), null, C39102j.f168200b, 0.0f, null, c28655q, 24624, 104);
            c28655q = c28655q;
            AbstractC15751g.m44449b(c23000t1.mo66772c(AbstractC1099a.m3398t(c2314t, f14, 0.0f, 0.0f, 0.0f, 14), true, 1.0f), j7, f13, 0.0f, c28655q, 384, 8);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C39516e(modifier, dividerWithImageViewState, i13, 26);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m133574c(Modifier modifier, C41137f c41137f, int i13, Composer composer, int i14) {
        m133573b(modifier, c41137f, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
