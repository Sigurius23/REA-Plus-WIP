package androidx.compose.foundation;

import android.os.Build;
import androidx.compose.p018ui.Modifier;
import p026b2.C2314t;
import p238j0.InterfaceC21083i;

/* JADX INFO: renamed from: androidx.compose.foundation.c */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1094c {
    /* JADX INFO: renamed from: a */
    public static final Modifier m3366a(Modifier modifier, boolean z4, InterfaceC21083i interfaceC21083i) {
        return modifier.mo3471e(z4 ? new FocusableElement(interfaceC21083i) : C2314t.f9131w);
    }

    /* JADX INFO: renamed from: b */
    public static Modifier m3367b(Modifier modifier, InterfaceC21083i interfaceC21083i) {
        return modifier.mo3471e(new HoverableElement(interfaceC21083i));
    }

    /* JADX INFO: renamed from: c */
    public static final Modifier m3368c(Modifier modifier) {
        return Build.VERSION.SDK_INT < 29 ? modifier : modifier.mo3471e(new ExcludeFromSystemGestureElement());
    }
}
