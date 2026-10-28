package androidx.databinding;

import androidx.lifecycle.InterfaceC1585g0;
import java.lang.ref.ReferenceQueue;
import nh3.AbstractC26725a;

/* JADX INFO: renamed from: androidx.databinding.y */
/* JADX INFO: loaded from: classes5.dex */
public final class C1195y implements InterfaceC1183m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f5345w;

    /* JADX INFO: renamed from: x */
    public final C1174d0 f5346x;

    public C1195y(AbstractC1168a0 abstractC1168a0, int i13, ReferenceQueue referenceQueue, int i14) {
        this.f5345w = i14;
        switch (i14) {
            case 1:
                this.f5346x = new C1174d0(abstractC1168a0, i13, this, referenceQueue);
                break;
            default:
                this.f5346x = new C1174d0(abstractC1168a0, i13, this, referenceQueue);
                break;
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m3739e(InterfaceC1585g0 interfaceC1585g0) {
    }

    /* JADX INFO: renamed from: f */
    private final void m3740f(InterfaceC1585g0 interfaceC1585g0) {
    }

    @Override // androidx.databinding.InterfaceC1183m
    /* JADX INFO: renamed from: a */
    public final void mo3734a(InterfaceC1585g0 interfaceC1585g0) {
        int i13 = this.f5345w;
    }

    @Override // androidx.databinding.InterfaceC1183m
    /* JADX INFO: renamed from: b */
    public final void mo3735b(Object obj) {
        switch (this.f5345w) {
            case 0:
                throw AbstractC26725a.m79500d(obj);
            default:
                throw AbstractC26725a.m79500d(obj);
        }
    }

    @Override // androidx.databinding.InterfaceC1183m
    /* JADX INFO: renamed from: c */
    public final void mo3736c(Object obj) {
        switch (this.f5345w) {
            case 0:
                throw new ClassCastException();
            default:
                throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: d */
    public final C1174d0 m3741d() {
        switch (this.f5345w) {
            case 0:
                break;
        }
        return this.f5346x;
    }
}
