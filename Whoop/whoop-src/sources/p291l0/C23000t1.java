package p291l0;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.p018ui.Modifier;
import p026b2.C2306l;
import p315m0.AbstractC24868a;
import p635y2.AbstractC39083d;

/* JADX INFO: renamed from: l0.t1 */
/* JADX INFO: loaded from: classes.dex */
public final class C23000t1 implements InterfaceC22997s1 {

    /* JADX INFO: renamed from: a */
    public static final C23000t1 f90727a = new C23000t1();

    @Override // p291l0.InterfaceC22997s1
    /* JADX INFO: renamed from: a */
    public final Modifier mo66771a(Modifier modifier, C2306l c2306l) {
        return modifier.mo3471e(new VerticalAlignElement(c2306l));
    }

    @Override // p291l0.InterfaceC22997s1
    /* JADX INFO: renamed from: c */
    public final Modifier mo66772c(Modifier modifier, boolean z4, float f13) {
        if (f13 <= 0.0d) {
            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
        }
        if (f13 > Float.MAX_VALUE) {
            f13 = Float.MAX_VALUE;
        }
        return modifier.mo3471e(new LayoutWeightElement(f13, z4));
    }

    /* JADX INFO: renamed from: d */
    public final Modifier m66773d() {
        return new WithAlignmentLineElement(AbstractC39083d.f168140a);
    }
}
