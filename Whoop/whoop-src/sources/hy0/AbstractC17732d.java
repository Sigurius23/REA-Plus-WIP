package hy0;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import c31.C3917a;
import i91.AbstractC18247a;
import i91.AbstractC18254h;
import i91.AbstractC18255i;
import i91.C18251e;
import i91.C18253g;
import l83.C23454a0;
import p026b2.C2314t;
import p181h2.C16618c;
import p208i2.AbstractC17897m;
import p208i2.C17891j;
import p208i2.InterfaceC17910s0;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hy0.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Li91/a;", "legendColor", "Ll83/a0;", "c", "(Li91/a;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17732d {
    /* JADX INFO: renamed from: c */
    public static final void m50818c(AbstractC18247a legendColor, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(legendColor, "legendColor");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(480606813);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(legendColor) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC18254h abstractC18254hM52584a = AbstractC18255i.m52584a(legendColor, c28655q, i14 & 14);
            float f13 = 4;
            float f14 = ((float) 0.5d) * f13;
            float f15 = 1 * f13;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            boolean zM87153g = c28655q.m87153g(abstractC18254hM52584a);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                C3917a c3917a = new C3917a(f14, f15, f14, abstractC18254hM52584a, 3);
                c28655q.m87172p0(c3917a);
                objM87133R = c3917a;
            }
            AbstractC22989q.m66760a(AbstractC1125a.m3478a(modifierM3407d, (Function1) objM87133R), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17728c(legendColor, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m50819d(float f13, float f14, float f15, AbstractC18254h abstractC18254h, InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        float fMo743q0 = drawBehind.mo743q0(f13);
        float fMo743q1 = drawBehind.mo743q0(f14);
        float fMo743q2 = drawBehind.mo743q0(f15);
        C17891j c17891jM51478a = AbstractC17897m.m51478a();
        InterfaceC17910s0.m51495a(c17891jM51478a, new C16618c(0.0f, 0.0f, fMo743q0 + 0.0f, Float.intBitsToFloat((int) (drawBehind.mo731d() & 4294967295L))));
        float f16 = fMo743q0 + fMo743q2 + 0.0f;
        InterfaceC17910s0.m51495a(c17891jM51478a, new C16618c(f16, 0.0f, f16 + fMo743q1, Float.intBitsToFloat((int) (drawBehind.mo731d() & 4294967295L))));
        float f17 = fMo743q2 + fMo743q1;
        float f18 = f16 + f17;
        InterfaceC17910s0.m51495a(c17891jM51478a, new C16618c(f18, 0.0f, fMo743q1 + f18, Float.intBitsToFloat((int) (drawBehind.mo731d() & 4294967295L))));
        float f19 = f18 + f17;
        InterfaceC17910s0.m51495a(c17891jM51478a, new C16618c(f19, 0.0f, fMo743q0 + f19, Float.intBitsToFloat((int) (drawBehind.mo731d() & 4294967295L))));
        if (abstractC18254h instanceof C18251e) {
            InterfaceC22131e.m63378L(drawBehind, c17891jM51478a, ((C18251e) abstractC18254h).getBrush(), 0.0f, null, 60);
        } else {
            if (!(abstractC18254h instanceof C18253g)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC22131e.m63386z(drawBehind, c17891jM51478a, ((C18253g) abstractC18254h).getColor(), 0.0f, null, 60);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m50820e(AbstractC18247a abstractC18247a, int i13, Composer composer, int i14) {
        m50818c(abstractC18247a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
