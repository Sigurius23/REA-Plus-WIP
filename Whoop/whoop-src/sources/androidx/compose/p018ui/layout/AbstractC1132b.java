package androidx.compose.p018ui.layout;

import androidx.compose.p018ui.Modifier;
import p635y2.C39141w;
import p702ch0.C4626i;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: androidx.compose.ui.layout.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1132b {
    /* JADX INFO: renamed from: a */
    public static final Modifier m3501a(Modifier modifier, Function1 function1) {
        return modifier.mo3471e(new OnPlacedElement(function1));
    }

    /* JADX INFO: renamed from: b */
    public static final Modifier m3502b(Modifier modifier, Function1 function1) {
        return modifier.mo3471e(new OnSizeChangedModifier(function1));
    }

    /* JADX INFO: renamed from: c */
    public static Modifier m3503c(C39141w c39141w, C4626i c4626i) {
        return new OnVisibilityChangedElement(c39141w, c4626i);
    }
}
