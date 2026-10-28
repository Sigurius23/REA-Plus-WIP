package androidx.compose.p018ui.focus;

import androidx.compose.p018ui.Modifier;
import p164g2.C15244p;
import p164g2.C15247s;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: androidx.compose.ui.focus.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1126a {
    /* JADX INFO: renamed from: a */
    public static final Modifier m3482a(Modifier modifier, Function1 function1) {
        return modifier.mo3471e(new FocusPropertiesElement(new C15244p(function1)));
    }

    /* JADX INFO: renamed from: b */
    public static final Modifier m3483b(Modifier modifier, C15247s c15247s) {
        return modifier.mo3471e(new FocusRequesterElement(c15247s));
    }

    /* JADX INFO: renamed from: c */
    public static final Modifier m3484c(Modifier modifier, Function1 function1) {
        return modifier.mo3471e(new FocusChangedElement(function1));
    }

    /* JADX INFO: renamed from: d */
    public static final Modifier m3485d(Modifier modifier, Function1 function1) {
        return modifier.mo3471e(new FocusEventElement(function1));
    }
}
