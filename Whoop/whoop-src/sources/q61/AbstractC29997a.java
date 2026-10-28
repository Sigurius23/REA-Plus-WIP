package q61;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import ge3.AbstractC15751g;
import j71.AbstractC21394b;
import l83.C23454a0;
import of2.C27900d;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p91.AbstractC29011e;
import p91.C29007a;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: q61.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lj71/b$f;", "iconPlotState", "Ll83/a0;", "b", "(Landroidx/compose/ui/Modifier;Lj71/b$f;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29997a {
    /* JADX INFO: renamed from: b */
    public static final void m91770b(Modifier modifier, AbstractC21394b.f iconPlotState, Composer composer, int i13) {
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(iconPlotState, "iconPlotState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1177383953);
        int i14 = (i13 & 6) == 0 ? (c28655q.m87153g(modifier) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(iconPlotState) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C29007a c29007a = new C29007a(0.0f, 0.0f, false, false, 12, null);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierMo3471e = AbstractC29011e.m88144e(c2314t, 0.0f, 0.0f, 1.0f, 1.0f, c29007a).mo3471e(modifier);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
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
            c28655q.m87150e0(-694985283);
            for (C29999c c29999c : iconPlotState.m60073e()) {
                long jMo134584toComposableColorWaAFU9c = c29999c.getStyle().mo134584toComposableColorWaAFU9c(c28655q, 0);
                Modifier modifierM3384f = AbstractC1099a.m3384f(AbstractC29011e.m88145f(c2314t, c29999c.getX(), c29999c.getY(), c29999c.getWidth(), 0.0f, C29007a.INSTANCE.m88136a(), 8, null), false, 1.0f);
                C33252i c33252i = AbstractC33253j.f138651a;
                Modifier modifierM44455h = AbstractC15751g.m44455h(AbstractC37056f.m118994r(modifierM3384f, c33252i), (float) 1.5d, jMo134584toComposableColorWaAFU9c, c33252i);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                c28655q = c28655q;
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM44455h);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                C0209i c0209i2 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                if (c29999c.getIcon() != null) {
                    c28655q.m87150e0(-176747033);
                    AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, c2314t), C38072d.f163053a.m121949b(c28655q, 6).getWhite5(), AbstractC17918w0.f69621a), c28655q, 0);
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c29999c.getIcon().intValue(), c28655q, 6), null, AbstractC1102d.m3419p(10, c2314t), c29999c.getIconColor().mo134584toComposableColorWaAFU9c(c28655q, 0), c28655q, 432, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-176347257);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27900d(modifier, iconPlotState, i13, 28);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m91771c(Modifier modifier, AbstractC21394b.f fVar, int i13, Composer composer, int i14) {
        m91770b(modifier, fVar, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
