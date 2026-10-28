package rq2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import hb3.AbstractC17104a0;
import jr2.AbstractC21902a;
import jr2.AbstractC21904c;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import ny0.AbstractC27282u;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p040c0.InterfaceC3747i0;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.AbstractC24669a;
import p718lz1.C24823a;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import v63.AbstractC35745c;
import wb3.AbstractC37056f;
import x81.C38072d;
import yp2.AbstractC39706c;

/* JADX INFO: renamed from: rq2.g0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lrq2/e0;", "step", "", "isCurrentStep", "Ll83/a0;", "c", "(Lrq2/e0;ZLandroidx/compose/runtime/Composer;I)V", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31726g0 {
    /* JADX INFO: renamed from: c */
    public static final void m98451c(C31722e0 step, boolean z4, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(step, "step");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(943440750);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(step) : c28655q.m87157i(step) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            AbstractC24669a.m72061e(z4, AbstractC37817c.m121344e(2004721316, c28655q, new C24823a(step, 22)), c28655q, ((i14 >> 3) & 14) | 48);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C31724f0(step, z4, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m98452d(C31722e0 c31722e0, InterfaceC3747i0 BasicAnimationComponent, Composer composer, int i13) {
        Composer composer2 = composer;
        AbstractC22676k.m65750j(BasicAnimationComponent, "$this$BasicAnimationComponent");
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
        C28655q c28655q = (C28655q) composer2;
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(composer2, modifierM3407d);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        AbstractC17104a0 abstractC17104a0 = c28655q.f115906a;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(composer2, C0217k.f729g, interfaceC39127r0M66763d);
        AbstractC28683x.m87239G(composer2, C0217k.f728f, interfaceC28653p1M87165m);
        C0209i c0209i = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
        }
        AbstractC28683x.m87239G(composer2, C0217k.f726d, modifierM118962N);
        AbstractC22403o backgroundImage = c31722e0.getBackgroundImage();
        if (backgroundImage == null) {
            c28655q.m87150e0(1081896676);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(1081896677);
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(backgroundImage, null, null, composer2, AbstractC22403o.f87638a, 3), AbstractC30060g.m92103Y(composer2, AbstractC39706c.f170905C), AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3413j(c2314t, 0.0f, 140 * 4, 1)), null, C39102j.f168200b, 0.0f, null, composer, 24960, 104);
            composer2 = composer;
            c28655q.m87173q(false);
        }
        AbstractC30795n.m94707h(c31722e0.getText(), C1100b.f4583a.mo3400a(AbstractC1099a.m3396r(AbstractC27282u.m82299o(c2314t, AbstractC21902a.m62310e()), ((float) 2.5d) * 8, 0.0f, 2), C2299e.f9105H), C38072d.f163053a.m121949b(composer2, C38072d.f163054b).getBrandWhite(), AbstractC35745c.m113248j(c31722e0.getFontSize(), 8589934592L), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC21904c.m62315c(), null, composer, 0, C2886a.f11498d << 18, 196592);
        c28655q.m87173q(true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m98453e(C31722e0 c31722e0, boolean z4, int i13, Composer composer, int i14) {
        m98451c(c31722e0, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
