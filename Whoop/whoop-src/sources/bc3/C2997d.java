package bc3;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: bc3.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C2997d implements InterfaceC3021j {

    /* JADX INFO: renamed from: w */
    public final C2993c[] f12002w;

    public C2997d(C2993c[] c2993cArr) {
        this.f12002w = c2993cArr;
    }

    @Override // bc3.InterfaceC3021j
    /* JADX INFO: renamed from: a */
    public final void mo8688a(Throwable th3) {
        m8689b();
    }

    /* JADX INFO: renamed from: b */
    public final void m8689b() {
        for (C2993c c2993c : this.f12002w) {
            InterfaceC3056s0 interfaceC3056s0 = c2993c.f12000F;
            if (interfaceC3056s0 == null) {
                AbstractC22676k.m65757q("handle");
                throw null;
            }
            interfaceC3056s0.dispose();
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f12002w + ']';
    }
}
