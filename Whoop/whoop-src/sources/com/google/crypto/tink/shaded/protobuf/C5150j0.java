package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.j0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5150j0 implements InterfaceC5165o0 {

    /* JADX INFO: renamed from: a */
    public InterfaceC5165o0[] f21524a;

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5165o0
    /* JADX INFO: renamed from: a */
    public final C5189z0 mo16184a(Class cls) {
        for (InterfaceC5165o0 interfaceC5165o0 : this.f21524a) {
            if (interfaceC5165o0.mo16185b(cls)) {
                return interfaceC5165o0.mo16184a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5165o0
    /* JADX INFO: renamed from: b */
    public final boolean mo16185b(Class cls) {
        for (InterfaceC5165o0 interfaceC5165o0 : this.f21524a) {
            if (interfaceC5165o0.mo16185b(cls)) {
                return true;
            }
        }
        return false;
    }
}
