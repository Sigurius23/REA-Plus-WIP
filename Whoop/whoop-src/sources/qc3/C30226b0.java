package qc3;

import kotlinx.datetime.LocalDateTime;
import p715kotlin.jvm.internal.AbstractC22676k;
import sc3.C32390d;
import uc3.InterfaceC34764b;

/* JADX INFO: renamed from: qc3.b0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C30226b0 extends AbstractC30222a {

    /* JADX INFO: renamed from: a */
    public final C32390d f123765a;

    public C30226b0(C32390d c32390d) {
        this.f123765a = c32390d;
    }

    @Override // qc3.AbstractC30222a
    /* JADX INFO: renamed from: a */
    public final C32390d mo92497a() {
        return this.f123765a;
    }

    @Override // qc3.AbstractC30222a
    /* JADX INFO: renamed from: b */
    public final InterfaceC34764b mo92498b() {
        return AbstractC30229c0.f123768b;
    }

    @Override // qc3.AbstractC30222a
    /* JADX INFO: renamed from: d */
    public final Object mo92500d(InterfaceC34764b interfaceC34764b) {
        C30272t intermediate = (C30272t) interfaceC34764b;
        AbstractC22676k.m65750j(intermediate, "intermediate");
        return new LocalDateTime(intermediate.f123819a.m92536b(), intermediate.f123820b.m92537e());
    }
}
