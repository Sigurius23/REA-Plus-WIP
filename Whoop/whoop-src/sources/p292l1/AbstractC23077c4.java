package p292l1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import ge3.AbstractC15751g;
import p000.AbstractC11266d;
import p026b2.C2314t;
import p132f0.C13825t;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p208i2.InterfaceC17869a1;
import p238j0.InterfaceC21083i;
import p390p1.AbstractC28683x;
import p390p1.C28596b0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p636y3.C39174f;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: l1.c4 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC23077c4 {

    /* JADX INFO: renamed from: a */
    public static final C28596b0 f91050a = new C28596b0(new C23091f0(9));

    /* JADX INFO: renamed from: a */
    public static final void m67048a(Modifier modifier, InterfaceC17869a1 interfaceC17869a1, long j7, long j13, float f13, float f14, C13825t c13825t, C37816b c37816b, Composer composer, int i13, int i14) {
        long jM67116b = (i14 & 8) != 0 ? AbstractC23138n.m67116b(j7, composer) : j13;
        float f15 = (i14 & 16) != 0 ? 0 : f13;
        float f16 = (i14 & 32) != 0 ? 0 : f14;
        C13825t c13825t2 = (i14 & 64) != 0 ? null : c13825t;
        C28655q c28655q = (C28655q) composer;
        C28596b0 c28596b0 = f91050a;
        float f17 = ((C39174f) c28655q.m87161k(c28596b0)).f168413w + f15;
        AbstractC28683x.m87248b(new C28673u1[]{AbstractC23168s.f91626a.mo86977a(new C17919x(jM67116b)), c28596b0.mo86977a(new C39174f(f17))}, AbstractC37817c.m121344e(421772006, c28655q, new C23214z3(modifier, interfaceC17869a1, j7, f17, c13825t2, f16, c37816b)), c28655q, 56);
    }

    /* JADX INFO: renamed from: b */
    public static final void m67049b(boolean z4, InterfaceC4339a interfaceC4339a, Modifier modifier, boolean z13, InterfaceC17869a1 interfaceC17869a1, long j7, C13825t c13825t, C37816b c37816b, Composer composer, int i13) {
        long jM67116b = AbstractC23138n.m67116b(j7, composer);
        float f13 = 0;
        float f14 = 0;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1528143336);
        Object objM87133R = c28655q.m87133R();
        if (objM87133R == C28635l.f115821a) {
            objM87133R = AbstractC11266d.m30453g(c28655q);
        }
        c28655q.m87173q(false);
        C28655q c28655q2 = (C28655q) composer;
        C28596b0 c28596b0 = f91050a;
        float f15 = ((C39174f) c28655q2.m87161k(c28596b0)).f168413w + f13;
        AbstractC28683x.m87248b(new C28673u1[]{AbstractC23168s.f91626a.mo86977a(new C17919x(jM67116b)), c28596b0.mo86977a(new C39174f(f15))}, AbstractC37817c.m121344e(1508735219, c28655q2, new C23071b4(modifier, interfaceC17869a1, j7, f15, c13825t, z4, (InterfaceC21083i) objM87133R, z13, interfaceC4339a, f14, c37816b)), c28655q2, 56);
    }

    /* JADX INFO: renamed from: c */
    public static final Modifier m67050c(Modifier modifier, InterfaceC17869a1 interfaceC17869a1, long j7, C13825t c13825t, float f13) {
        InterfaceC17869a1 interfaceC17869a2;
        Modifier modifierM3487b;
        Modifier modifierM44456i = C2314t.f9131w;
        if (f13 > 0.0f) {
            interfaceC17869a2 = interfaceC17869a1;
            modifierM3487b = AbstractC1127a.m3487b(modifierM44456i, 0.0f, 0.0f, 0.0f, f13, interfaceC17869a2, 124895);
        } else {
            interfaceC17869a2 = interfaceC17869a1;
            modifierM3487b = modifierM44456i;
        }
        Modifier modifierMo3471e = modifier.mo3471e(modifierM3487b);
        if (c13825t != null) {
            modifierM44456i = AbstractC15751g.m44456i(c13825t.f49345a, modifierM44456i, c13825t.f49346b, interfaceC17869a2);
        }
        return AbstractC37056f.m118994r(AbstractC1092a.m3358c(modifierMo3471e.mo3471e(modifierM44456i), j7, interfaceC17869a2), interfaceC17869a2);
    }

    /* JADX INFO: renamed from: d */
    public static final long m67051d(long j7, float f13, C28655q c28655q) {
        C23132m c23132m = (C23132m) c28655q.m87161k(AbstractC23138n.f91494a);
        boolean zBooleanValue = ((Boolean) c28655q.m87161k(AbstractC23138n.f91495b)).booleanValue();
        long j13 = c23132m.f91456p;
        if (C17919x.m51542d(j7, j13) && zBooleanValue) {
            return C39174f.m124782b(f13, (float) 0) ? j13 : AbstractC17918w0.m51528p(C17919x.m51541c(((((float) Math.log(f13 + 1)) * 4.5f) + 2.0f) / 100.0f, c23132m.f91460t), j13);
        }
        return j7;
    }
}
