package androidx.compose.p018ui.input.key;

import androidx.compose.p018ui.Modifier;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: androidx.compose.ui.input.key.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1128a {
    /* JADX INFO: renamed from: a */
    public static final Modifier m3493a(Modifier modifier, Function1 function1) {
        return modifier.mo3471e(new KeyInputElement(function1, null));
    }

    /* JADX INFO: renamed from: b */
    public static final Modifier m3494b(Modifier modifier, Function1 function1) {
        return modifier.mo3471e(new KeyInputElement(null, function1));
    }
}
