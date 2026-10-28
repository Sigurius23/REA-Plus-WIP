package androidx.compose.foundation.lazy.layout;

import androidx.compose.p018ui.Modifier;
import j93.InterfaceC21488u;
import p014aj.C0929d;
import p180h0.EnumC16377d2;
import p389p0.InterfaceC28540o;
import p389p0.InterfaceC28549s0;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1105a {
    /* JADX INFO: renamed from: a */
    public static final Modifier m3433a(InterfaceC28540o interfaceC28540o, C0929d c0929d, EnumC16377d2 enumC16377d2) {
        return new LazyLayoutBeyondBoundsModifierElement(interfaceC28540o, c0929d, enumC16377d2);
    }

    /* JADX INFO: renamed from: b */
    public static final Modifier m3434b(Modifier modifier, InterfaceC21488u interfaceC21488u, InterfaceC28549s0 interfaceC28549s0, EnumC16377d2 enumC16377d2, boolean z4) {
        return modifier.mo3471e(new LazyLayoutSemanticsModifier(interfaceC21488u, interfaceC28549s0, enumC16377d2, z4));
    }
}
