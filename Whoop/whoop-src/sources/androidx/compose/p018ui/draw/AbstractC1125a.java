package androidx.compose.p018ui.draw;

import androidx.compose.p018ui.Modifier;
import p026b2.C2299e;
import p026b2.InterfaceC2302h;
import p208i2.AbstractC17921y;
import p331n2.AbstractC26165a;
import p635y2.InterfaceC39105k;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: androidx.compose.ui.draw.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1125a {
    /* JADX INFO: renamed from: a */
    public static final Modifier m3478a(Modifier modifier, Function1 function1) {
        return modifier.mo3471e(new DrawBehindElement(function1));
    }

    /* JADX INFO: renamed from: b */
    public static final Modifier m3479b(Modifier modifier, Function1 function1) {
        return modifier.mo3471e(new DrawWithCacheElement(function1));
    }

    /* JADX INFO: renamed from: c */
    public static final Modifier m3480c(Modifier modifier, Function1 function1) {
        return modifier.mo3471e(new DrawWithContentElement(function1));
    }

    /* JADX INFO: renamed from: d */
    public static Modifier m3481d(Modifier modifier, AbstractC26165a abstractC26165a, InterfaceC2302h interfaceC2302h, InterfaceC39105k interfaceC39105k, float f13, AbstractC17921y abstractC17921y, int i13) {
        if ((i13 & 4) != 0) {
            interfaceC2302h = C2299e.f9102E;
        }
        InterfaceC2302h interfaceC2302h2 = interfaceC2302h;
        if ((i13 & 16) != 0) {
            f13 = 1.0f;
        }
        float f14 = f13;
        if ((i13 & 32) != 0) {
            abstractC17921y = null;
        }
        return modifier.mo3471e(new PainterElement(abstractC26165a, interfaceC2302h2, interfaceC39105k, f14, abstractC17921y));
    }
}
