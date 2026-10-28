package z61;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import j71.AbstractC21394b;
import l83.C23454a0;
import p026b2.C2314t;
import p208i2.AbstractC17918w0;
import p208i2.C17916v0;
import p208i2.C17919x;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p490t0.AbstractC33253j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p91.AbstractC29011e;
import p91.C29007a;
import wb3.AbstractC37056f;
import yf1.C39516e;

/* JADX INFO: renamed from: z61.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lj71/b$j;", "state", "Ll83/a0;", "b", "(Landroidx/compose/ui/Modifier;Lj71/b$j;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40125b {
    /* JADX INFO: renamed from: b */
    public static final void m128666b(Modifier modifier, AbstractC21394b.j state, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(101352993);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(state) : c28655q.m87157i(state) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            long jMo134584toComposableColorWaAFU9c = state.getProgressPlot().getActiveColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
            long jM51541c = state.getProgressPlot().getCurrentValue() != null ? C17919x.m51541c(0.5f, jMo134584toComposableColorWaAFU9c) : jMo134584toComposableColorWaAFU9c;
            float rangeMin = state.getProgressPlot().getRangeMin();
            float positionY = state.getProgressPlot().getPositionY() * (-1.0f);
            float rangeMax = state.getProgressPlot().getRangeMax() - state.getProgressPlot().getRangeMin();
            float height = state.getProgressPlot().getHeight();
            C29007a c29007a = new C29007a(0.0f, 0.0f, false, false, 12, null);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM88144e = AbstractC29011e.m88144e(c2314t, rangeMin, positionY, rangeMax, height, c29007a);
            float f13 = ((float) 0.5d) * 4;
            Modifier modifierM118994r = AbstractC37056f.m118994r(modifierM88144e, AbstractC33253j.m105489e(f13));
            C17916v0 c17916v0 = AbstractC17918w0.f69621a;
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(modifierM118994r, jM51541c, c17916v0).mo3471e(modifier), c28655q, 0);
            if (state.getProgressPlot().getCurrentValue() == null) {
                c28655q.m87150e0(45840950);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(45840951);
                AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC29011e.m88144e(c2314t, state.getProgressPlot().getRangeMin(), state.getProgressPlot().getPositionY() * (-1.0f), state.getProgressPlot().getCurrentValue().floatValue() - state.getProgressPlot().getRangeMin(), state.getProgressPlot().getHeight(), new C29007a(0.0f, 0.0f, false, false, 12, null)), AbstractC33253j.m105489e(f13)), jMo134584toComposableColorWaAFU9c, c17916v0), c28655q, 0);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C39516e(modifier, state, i13, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m128667c(Modifier modifier, AbstractC21394b.j jVar, int i13, Composer composer, int i14) {
        m128666b(modifier, jVar, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
