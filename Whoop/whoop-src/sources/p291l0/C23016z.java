package p291l0;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import p026b2.InterfaceC2300f;
import p315m0.AbstractC24868a;

/* JADX INFO: renamed from: l0.z */
/* JADX INFO: loaded from: classes.dex */
public final class C23016z implements InterfaceC23013y {

    /* JADX INFO: renamed from: a */
    public static final C23016z f90757a = new C23016z();

    /* JADX INFO: renamed from: b */
    public final Modifier m66778b(Modifier modifier, InterfaceC2300f interfaceC2300f) {
        return modifier.mo3471e(new HorizontalAlignElement(interfaceC2300f));
    }

    /* JADX INFO: renamed from: c */
    public final Modifier m66779c(Modifier modifier, boolean z4, float f13) {
        if (f13 <= 0.0d) {
            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
        }
        if (f13 > Float.MAX_VALUE) {
            f13 = Float.MAX_VALUE;
        }
        return modifier.mo3471e(new LayoutWeightElement(f13, z4));
    }
}
