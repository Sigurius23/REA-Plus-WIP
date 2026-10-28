package p291l0;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.p018ui.Modifier;
import p026b2.C2306l;
import p315m0.AbstractC24868a;

/* JADX INFO: renamed from: l0.t0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22999t0 implements InterfaceC22997s1, InterfaceC22996s0 {

    /* JADX INFO: renamed from: a */
    public static final C22999t0 f90726a = new C22999t0();

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
}
