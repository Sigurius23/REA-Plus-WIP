package p360o8;

import androidx.lifecycle.InterfaceC1633v0;
import ro.C31619d;

/* JADX INFO: renamed from: o8.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C27652d implements InterfaceC1633v0 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC27649a f111262w;

    /* JADX INFO: renamed from: x */
    public boolean f111263x = false;

    public C27652d(C31619d c31619d, InterfaceC27649a interfaceC27649a) {
        this.f111262w = interfaceC27649a;
    }

    @Override // androidx.lifecycle.InterfaceC1633v0
    public final void onChanged(Object obj) {
        this.f111262w.mo83605p(obj);
        this.f111263x = true;
    }

    public final String toString() {
        return this.f111262w.toString();
    }
}
