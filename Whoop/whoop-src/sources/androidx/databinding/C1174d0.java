package androidx.databinding;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: androidx.databinding.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1174d0 extends WeakReference {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1183m f5330a;

    /* JADX INFO: renamed from: b */
    public final int f5331b;

    /* JADX INFO: renamed from: c */
    public Object f5332c;

    public C1174d0(AbstractC1168a0 abstractC1168a0, int i13, InterfaceC1183m interfaceC1183m, ReferenceQueue referenceQueue) {
        super(abstractC1168a0, referenceQueue);
        this.f5331b = i13;
        this.f5330a = interfaceC1183m;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3729a() {
        boolean z4;
        Object obj = this.f5332c;
        if (obj != null) {
            this.f5330a.mo3735b(obj);
            z4 = true;
        } else {
            z4 = false;
        }
        this.f5332c = null;
        return z4;
    }
}
