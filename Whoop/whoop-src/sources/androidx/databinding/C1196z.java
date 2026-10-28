package androidx.databinding;

import androidx.lifecycle.InterfaceC1585g0;
import java.lang.ref.ReferenceQueue;

/* JADX INFO: renamed from: androidx.databinding.z */
/* JADX INFO: loaded from: classes5.dex */
public final class C1196z extends AbstractC1179i implements InterfaceC1183m {

    /* JADX INFO: renamed from: w */
    public final C1174d0 f5347w;

    public C1196z(AbstractC1168a0 abstractC1168a0, int i13, ReferenceQueue referenceQueue) {
        this.f5347w = new C1174d0(abstractC1168a0, i13, this, referenceQueue);
    }

    @Override // androidx.databinding.InterfaceC1183m
    /* JADX INFO: renamed from: a */
    public final void mo3734a(InterfaceC1585g0 interfaceC1585g0) {
    }

    @Override // androidx.databinding.InterfaceC1183m
    /* JADX INFO: renamed from: b */
    public final void mo3735b(Object obj) {
        ((InterfaceC1180j) obj).removeOnPropertyChangedCallback(this);
    }

    @Override // androidx.databinding.InterfaceC1183m
    /* JADX INFO: renamed from: c */
    public final void mo3736c(Object obj) {
        ((InterfaceC1180j) obj).addOnPropertyChangedCallback(this);
    }

    /* JADX INFO: renamed from: d */
    public final C1174d0 m3742d() {
        return this.f5347w;
    }
}
