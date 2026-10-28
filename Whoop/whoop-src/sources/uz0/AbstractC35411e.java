package uz0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p571w3.C36775k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p734sl0.C32627j2;
import p736sz0.AbstractC33207p;
import p736sz0.EnumC33185h1;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: uz0.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Luz0/n;", "viewState", "Ll83/a0;", "b", "(Luz0/n;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35411e {
    /* JADX INFO: renamed from: b */
    public static final void m112332b(C35420n viewState, Composer composer, int i13) {
        int i14;
        float f13;
        C2314t c2314t;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0213j c0213j;
        int i15;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-805207684);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87153g(viewState) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC35409c.m112326b(viewState.getIconImageSource(), viewState.getActivityStrain(), viewState.getActivityTitle(), viewState.getBackgroundBrush(), c28655q, 0);
            float f14 = 8;
            C2314t c2314t2 = C2314t.f9131w;
            AbstractC11266d.m30469w((float) 1.5d, f14, c2314t2, c28655q);
            Modifier modifierM3411h = AbstractC1102d.m3411h(1, AbstractC1102d.m3409f(1.0f, c2314t2));
            C38072d c38072d = C38072d.f163053a;
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(modifierM3411h, c38072d.m121949b(c28655q, 6).getWhite10(), AbstractC17918w0.f69621a), c28655q, 0);
            AbstractC11266d.m30469w(2, f14, c2314t2, c28655q);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i4 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i4, c22994r1M66759a);
            C0209i c0209i5 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m);
            C0209i c0209i6 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i6);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N);
            if (viewState.getActivityDuration() != null) {
                c28655q.m87150e0(-2053938740);
                TextResource.C8691e c8691e = new TextResource.C8691e(viewState.getActivityDuration());
                String activityDurationUnit = viewState.getActivityDurationUnit();
                TextResource.C8691e c8691e2 = activityDurationUnit != null ? new TextResource.C8691e(activityDurationUnit) : null;
                EnumC33185h1 enumC33185h1 = EnumC33185h1.TEXT;
                String activityDurationLabel = viewState.getActivityDurationLabel();
                if (activityDurationLabel == null) {
                    activityDurationLabel = "";
                }
                c0213j = c0213j2;
                f13 = f14;
                c0209i2 = c0209i7;
                c0209i = c0209i5;
                c0209i3 = c0209i6;
                i15 = 0;
                AbstractC33207p.m105301e(null, null, c8691e, null, c8691e2, enumC33185h1, null, new TextResource.C8691e(activityDurationLabel), false, c38072d.m121949b(c28655q, 6).getBrandWhite(), c38072d.m121949b(c28655q, 6).getWhite70(), c38072d.m121952e(c28655q, 6).getN6(), c38072d.m121952e(c28655q, 6).getB2(), c38072d.m121952e(c28655q, 6).getH5(), false, null, c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21, 0, 49483);
                c28655q = c28655q;
                c2314t = c2314t2;
                AbstractC18489d0.m53381v(4, f13, c2314t, c28655q, false);
            } else {
                f13 = f14;
                c2314t = c2314t2;
                c0209i = c0209i5;
                c0209i2 = c0209i7;
                c0209i3 = c0209i6;
                c0213j = c0213j2;
                i15 = 0;
                c28655q.m87150e0(-2053241054);
                c28655q.m87173q(false);
            }
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, modifierM118962N2);
            String intensityTitle = viewState.getIntensityTitle();
            C2886a b6 = c38072d.m121952e(c28655q, 6).getB1();
            long jM112324a = AbstractC35407a.m112324a(viewState.getIntensityStyle(), c28655q, i15);
            C28655q c28655q2 = c28655q;
            C2314t c2314t3 = c2314t;
            AbstractC30795n.m94707h(intensityTitle, AbstractC1102d.m3409f(1.0f, c2314t), jM112324a, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, b6, null, c28655q2, 48, 0, 196088);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(0.25f * f13, c2314t3));
            AbstractC30795n.m94707h(viewState.getIntensitySubtitle(), AbstractC1102d.m3409f(1.0f, c2314t3), c38072d.m121949b(c28655q2, 6).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getH5(), null, c28655q2, 48, 0, 196088);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32627j2(viewState, i13, 17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m112333c(C35420n c35420n, int i13, Composer composer, int i14) {
        m112332b(c35420n, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
