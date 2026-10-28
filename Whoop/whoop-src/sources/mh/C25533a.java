package mh;

import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.InterfaceC3027k1;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: mh.a */
/* JADX INFO: loaded from: classes.dex */
public final class C25533a implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: w */
    public final AbstractC1638x f100048w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC3027k1 f100049x;

    public C25533a(AbstractC1638x abstractC1638x, InterfaceC3027k1 interfaceC3027k1) {
        this.f100048w = abstractC1638x;
        this.f100049x = interfaceC3027k1;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(InterfaceC1585g0 interfaceC1585g0) {
        this.f100049x.cancel((CancellationException) null);
    }
}
