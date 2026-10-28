package androidx.databinding;

import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.lifecycle.InterfaceC1633v0;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: androidx.databinding.v */
/* JADX INFO: loaded from: classes5.dex */
public final class C1192v implements InterfaceC1633v0, InterfaceC1183m {

    /* JADX INFO: renamed from: w */
    public final C1174d0 f5342w;

    /* JADX INFO: renamed from: x */
    public WeakReference f5343x = null;

    public C1192v(AbstractC1168a0 abstractC1168a0, int i13, ReferenceQueue referenceQueue) {
        this.f5342w = new C1174d0(abstractC1168a0, i13, this, referenceQueue);
    }

    @Override // androidx.databinding.InterfaceC1183m
    /* JADX INFO: renamed from: a */
    public final void mo3734a(InterfaceC1585g0 interfaceC1585g0) {
        WeakReference weakReference = this.f5343x;
        InterfaceC1585g0 interfaceC1585g1 = weakReference == null ? null : (InterfaceC1585g0) weakReference.get();
        AbstractC1615p0 abstractC1615p0 = (AbstractC1615p0) this.f5342w.f5332c;
        if (abstractC1615p0 != null) {
            if (interfaceC1585g1 != null) {
                abstractC1615p0.removeObserver(this);
            }
            if (interfaceC1585g0 != null) {
                abstractC1615p0.observe(interfaceC1585g0, this);
            }
        }
        if (interfaceC1585g0 != null) {
            this.f5343x = new WeakReference(interfaceC1585g0);
        }
    }

    @Override // androidx.databinding.InterfaceC1183m
    /* JADX INFO: renamed from: b */
    public final void mo3735b(Object obj) {
        ((AbstractC1615p0) obj).removeObserver(this);
    }

    @Override // androidx.databinding.InterfaceC1183m
    /* JADX INFO: renamed from: c */
    public final void mo3736c(Object obj) {
        AbstractC1615p0 abstractC1615p0 = (AbstractC1615p0) obj;
        WeakReference weakReference = this.f5343x;
        InterfaceC1585g0 interfaceC1585g0 = weakReference == null ? null : (InterfaceC1585g0) weakReference.get();
        if (interfaceC1585g0 != null) {
            abstractC1615p0.observe(interfaceC1585g0, this);
        }
    }

    /* JADX INFO: renamed from: d */
    public final C1174d0 m3738d() {
        return this.f5342w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.InterfaceC1633v0
    public final void onChanged(Object obj) {
        C1174d0 c1174d0 = this.f5342w;
        AbstractC1168a0 abstractC1168a0 = (AbstractC1168a0) c1174d0.get();
        if (abstractC1168a0 == null) {
            c1174d0.m3729a();
        }
        if (abstractC1168a0 != null) {
            abstractC1168a0.handleFieldChange(c1174d0.f5331b, c1174d0.f5332c, 0);
        }
    }
}
