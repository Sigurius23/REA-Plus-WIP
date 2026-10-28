package rq2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
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
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
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
import qz0.AbstractC30795n;
import v63.AbstractC35745c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: rq2.u */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lrq2/s;", "step", "", "isCurrentStep", "Ll83/a0;", "c", "(Lrq2/s;ZLandroidx/compose/runtime/Composer;I)V", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31753u {
    /* JADX INFO: renamed from: c */
    public static final void m98555c(C31749s step, boolean z4, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(step, "step");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(243340285);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(step) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            AbstractC24669a.m72061e(z4, AbstractC37817c.m121344e(-411065337, c28655q, new C24823a(step, 21)), c28655q, ((i14 >> 3) & 14) | 48);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C31751t(step, z4, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m98556d(C31749s c31749s, InterfaceC3747i0 BasicAnimationComponent, Composer composer, int i13) {
        C0209i c0209i;
        Composer composer2;
        AbstractC22676k.m65750j(BasicAnimationComponent, "$this$BasicAnimationComponent");
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
        boolean z4 = false;
        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
        C28655q c28655q = (C28655q) composer;
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(composer, modifierM3407d);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        AbstractC17104a0 abstractC17104a0 = c28655q.f115906a;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        C0209i c0209i2 = C0217k.f729g;
        AbstractC28683x.m87239G(composer, c0209i2, interfaceC39127r0M66763d);
        C0209i c0209i3 = C0217k.f728f;
        AbstractC28683x.m87239G(composer, c0209i3, interfaceC28653p1M87165m);
        C0209i c0209i4 = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
        }
        C0209i c0209i5 = C0217k.f726d;
        AbstractC28683x.m87239G(composer, c0209i5, modifierM118962N);
        AbstractC22403o backgroundImage = c31749s.getBackgroundImage();
        if (backgroundImage == null) {
            c28655q.m87150e0(1683110974);
            c28655q.m87173q(false);
            c0209i = c0209i4;
            composer2 = composer;
        } else {
            c28655q.m87150e0(1683110975);
            c0209i = c0209i4;
            composer2 = composer;
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(backgroundImage, null, null, composer, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3407d(1.0f, c2314t), null, C39102j.f168201c, 0.0f, null, composer2, 25008, 104);
            c28655q.m87173q(false);
        }
        float f13 = 8;
        Modifier modifierMo3400a = C1100b.f4583a.mo3400a(AbstractC27282u.m82299o(AbstractC1099a.m3396r(c2314t, ((float) 2.5d) * f13, 0.0f, 2), AbstractC21902a.m62310e()), C2299e.f9104G);
        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, composer2, 0);
        int iHashCode2 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
        Modifier modifierM118962N2 = AbstractC37056f.m118962N(composer2, modifierMo3400a);
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(composer2, c0209i2, c23010xM66775a);
        AbstractC28683x.m87239G(composer2, c0209i3, interfaceC28653p1M87165m2);
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
        }
        AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N2);
        c28655q.m87150e0(-1068470336);
        for (TextResource textResource : c31749s.m98543g()) {
            C2314t c2314t2 = c2314t;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, composer2, TextResource.$stable), AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 0.0f, 3 * f13, 7), C38072d.f163053a.m121949b(composer2, C38072d.f163054b).getBrandWhite(), AbstractC35745c.m113248j(c31749s.getFontSize(), 8589934592L), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC21904c.m62314b(), null, composer, 48, C2886a.f11498d << 18, 196592);
            composer2 = composer;
            c2314t = c2314t2;
            f13 = f13;
            c28655q = c28655q;
            z4 = false;
        }
        AbstractC25012a.m73392y(c28655q, false, true, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m98557e(C31749s c31749s, boolean z4, int i13, Composer composer, int i14) {
        m98555c(c31749s, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
