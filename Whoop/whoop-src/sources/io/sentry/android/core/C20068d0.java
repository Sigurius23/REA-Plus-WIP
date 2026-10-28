package io.sentry.android.core;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import java.util.Iterator;

/* JADX INFO: renamed from: io.sentry.android.core.d0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20068d0 implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: w */
    public final C20063c0 f75383w = new C20063c0(this);

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C20071e0 f75384x;

    public C20068d0(C20071e0 c20071e0) {
        this.f75384x = c20071e0;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(InterfaceC1585g0 interfaceC1585g0) {
        this.f75384x.f75395z = Boolean.FALSE;
        Iterator it = this.f75383w.iterator();
        while (it.hasNext()) {
            ((InterfaceC20060b0) it.next()).mo55909i();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(InterfaceC1585g0 interfaceC1585g0) {
        this.f75384x.f75395z = Boolean.TRUE;
        Iterator it = this.f75383w.iterator();
        while (it.hasNext()) {
            ((InterfaceC20060b0) it.next()).mo55910k();
        }
    }
}
