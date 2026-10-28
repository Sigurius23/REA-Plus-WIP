package androidx.compose.foundation.layout;

import androidx.compose.p018ui.Modifier;
import p026b2.C2299e;
import p026b2.InterfaceC2302h;
import p291l0.InterfaceC23001u;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1100b implements InterfaceC23001u {

    /* JADX INFO: renamed from: a */
    public static final C1100b f4583a = new C1100b();

    @Override // p291l0.InterfaceC23001u
    /* JADX INFO: renamed from: a */
    public final Modifier mo3400a(Modifier modifier, InterfaceC2302h interfaceC2302h) {
        return modifier.mo3471e(new BoxChildDataElement(interfaceC2302h, false));
    }

    @Override // p291l0.InterfaceC23001u
    /* JADX INFO: renamed from: b */
    public final Modifier mo3401b(Modifier modifier) {
        return modifier.mo3471e(new BoxChildDataElement(C2299e.f9102E, true));
    }
}
