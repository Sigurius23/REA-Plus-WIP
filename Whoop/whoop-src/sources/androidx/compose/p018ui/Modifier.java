package androidx.compose.p018ui;

import c93.InterfaceC4351m;
import p026b2.C2309o;
import p026b2.C2314t;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public interface Modifier {
    /* JADX INFO: renamed from: a */
    Object mo3469a(Object obj, InterfaceC4351m interfaceC4351m);

    /* JADX INFO: renamed from: c */
    boolean mo3470c(Function1 function1);

    /* JADX INFO: renamed from: e */
    default Modifier mo3471e(Modifier modifier) {
        return modifier == C2314t.f9131w ? this : new C2309o(this, modifier);
    }
}
