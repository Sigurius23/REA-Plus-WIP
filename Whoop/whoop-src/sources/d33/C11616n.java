package d33;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d33.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C11616n implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C11602h1 f37505w;

    public C11616n(C11602h1 c11602h1) {
        this.f37505w = c11602h1;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        super.onPause(owner);
        this.f37505w.f37452n.m67653b(null, "onBackground");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        super.onResume(owner);
        this.f37505w.f37452n.m67653b(null, "onForeground");
    }
}
