package androidx.compose.foundation.text.input.internal;

import androidx.compose.p018ui.Modifier;
import p078d1.C11449b;
import p133f1.C13977s1;
import p510u0.C34354s0;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1115a {
    /* JADX INFO: renamed from: a */
    public static final Modifier m3455a(Modifier modifier, C11449b c11449b, C34354s0 c34354s0, C13977s1 c13977s1) {
        return modifier.mo3471e(new LegacyAdaptingPlatformTextInputModifier(c11449b, c34354s0, c13977s1));
    }
}
