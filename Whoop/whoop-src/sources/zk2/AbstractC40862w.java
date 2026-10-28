package zk2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.runtime.Composer;
import fj1.C14540k;
import gb1.C15683k;
import l83.C23454a0;
import l83.C23465k;
import m83.C25272z;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22989q;
import p291l0.InterfaceC23004v;
import p292l1.C23206y1;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p602x1.AbstractC37817c;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.C39169a;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import pp1.C29432e;

/* JADX INFO: renamed from: zk2.w */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001a#\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a1\u0010\u000b\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u001a\u0010\u0011\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e¨\u0006\u0014"}, m65681d2 = {"Ly81/f;", "backgroundColor", "Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "f", "(Ly81/f;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Ly3/f;", "horizontal", "top", "bottom", "j", "(Landroidx/compose/ui/Modifier;FFF)Landroidx/compose/ui/Modifier;", "a", "F", "getTrackSessionRadialGradientHeight", "()F", "TrackSessionRadialGradientHeight", "b", "RadialGradientRadius", "track-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40862w {

    /* JADX INFO: renamed from: a */
    private static final float f176105a;

    /* JADX INFO: renamed from: b */
    private static final float f176106b;

    static {
        float f13 = 8;
        f176105a = 40 * f13;
        f176106b = 45 * f13;
    }

    /* JADX INFO: renamed from: f */
    public static final void m132439f(EnumC39333f enumC39333f, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        C28677v1 c28677v1M87180u;
        C14540k c14540k;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(685105324);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87149e(enumC39333f == null ? -1 : enumC39333f.ordinal()) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            Modifier modifier3 = i16 != 0 ? C2314t.f9131w : modifier;
            if (enumC39333f == null) {
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u == null) {
                    return;
                } else {
                    c14540k = new C14540k(enumC39333f, modifier3, i13, i14, 1);
                }
            } else {
                Modifier modifier4 = modifier3;
                AbstractC22953f.m66714a(AbstractC1102d.m3411h(f176105a, AbstractC1102d.m3409f(1.0f, modifier4)), null, false, AbstractC37817c.m121344e(-163442026, c28655q, new C29432e(enumC39333f.mo134584toComposableColorWaAFU9c(c28655q, i15 & 14), 2)), c28655q, 3072, 6);
                modifier2 = modifier4;
            }
            c28677v1M87180u.f115982d = c14540k;
        }
        c28655q.m87138X();
        modifier2 = modifier;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c14540k = new C14540k(enumC39333f, modifier2, i13, i14, 2);
            c28677v1M87180u.f115982d = c14540k;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m132440g(EnumC39333f enumC39333f, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m132439f(enumC39333f, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m132441h(long j7, InterfaceC23004v BoxWithConstraints, Composer composer, int i13) {
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i13 & 6) == 0) {
            i13 |= ((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 19) != 18)) {
            InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            C1101c c1101c = (C1101c) BoxWithConstraints;
            float fMo743q0 = interfaceC39171c.mo743q0(c1101c.m3403d());
            float fMo743q1 = interfaceC39171c.mo743q0(c1101c.m3402c());
            AbstractC22989q.m66760a(AbstractC1092a.m3357b(C1100b.f4583a.mo3401b(C2314t.f9131w), C17909s.m51490h(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.141559f), new C17919x(C17919x.m51541c(0.4f, j7))), new C23465k(Float.valueOf(0.89963f), new C17919x(C17919x.m51541c(0.0f, j7)))}, (((long) Float.floatToRawIntBits(fMo743q1 * (-0.021875f))) & 4294967295L) | (((long) Float.floatToRawIntBits(fMo743q0 * 0.9720102f)) << 32), interfaceC39171c.mo743q0(f176106b), 8), null, 0.0f, 6), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m132442i(EnumC39333f enumC39333f, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m132439f(enumC39333f, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    public static final Modifier m132443j(Modifier removeParentPadding, float f13, float f14, float f15) {
        AbstractC22676k.m65750j(removeParentPadding, "$this$removeParentPadding");
        return AbstractC1131a.m3498b(removeParentPadding, new C15683k(1, f13, f14, f15));
    }

    /* JADX INFO: renamed from: k */
    public static Modifier m132444k(Modifier modifier, float f13, float f14, float f15, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = 0;
        }
        if ((i13 & 2) != 0) {
            f14 = 0;
        }
        if ((i13 & 4) != 0) {
            f15 = 0;
        }
        return m132443j(modifier, f13, f14, f15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final InterfaceC39130s0 m132445l(float f13, float f14, float f15, InterfaceC39133t0 layout, InterfaceC39124q0 measurable, C39169a c39169a) {
        AbstractC22676k.m65750j(layout, "$this$layout");
        AbstractC22676k.m65750j(measurable, "measurable");
        int iMo724F = layout.mo724F(f13);
        int iMo724F2 = layout.mo724F(f14);
        int iMo724F3 = layout.mo724F(f15);
        int iM124765i = (iMo724F * 2) + C39169a.m124765i(c39169a.f168407a);
        long j7 = c39169a.f168407a;
        int iM124764h = C39169a.m124764h(j7) + iMo724F2 + iMo724F3;
        AbstractC39104j1 abstractC39104j1Mo448T = measurable.mo448T(C39169a.m124757a(iM124765i, iM124765i, iM124764h, iM124764h));
        return layout.mo86822W(C39169a.m124765i(j7), C39169a.m124764h(j7), C25272z.f99163w, new C23206y1(abstractC39104j1Mo448T, iMo724F, iMo724F2, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m132446m(AbstractC39104j1 abstractC39104j1, int i13, int i14, AbstractC39101i1 layout) {
        AbstractC22676k.m65750j(layout, "$this$layout");
        layout.m124632f(abstractC39104j1, -i13, -i14, 0.0f);
        return C23454a0.f92919a;
    }
}
