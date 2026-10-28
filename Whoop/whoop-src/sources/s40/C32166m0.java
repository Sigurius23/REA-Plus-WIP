package s40;

import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.C1593i0;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1585g0;
import m83.C25262p;
import p399pb.C29047d;
import p399pb.C29048e;
import p399pb.InterfaceC29049f;
import p456rb.C31183a;

/* JADX INFO: renamed from: s40.m0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C32166m0 implements InterfaceC1585g0, InterfaceC1583f2, InterfaceC29049f {

    /* JADX INFO: renamed from: w */
    public final C1593i0 f133238w = new C1593i0(this);

    /* JADX INFO: renamed from: x */
    public final C1579e2 f133239x = new C1579e2();

    /* JADX INFO: renamed from: y */
    public final C29048e f133240y = new C29048e(new C31183a(this, new C25262p(this, 10)));

    @Override // androidx.lifecycle.InterfaceC1585g0
    public final AbstractC1638x getLifecycle() {
        return this.f133238w;
    }

    @Override // p399pb.InterfaceC29049f
    public final C29047d getSavedStateRegistry() {
        return this.f133240y.f117551b;
    }

    @Override // androidx.lifecycle.InterfaceC1583f2
    public final C1579e2 getViewModelStore() {
        return this.f133239x;
    }
}
