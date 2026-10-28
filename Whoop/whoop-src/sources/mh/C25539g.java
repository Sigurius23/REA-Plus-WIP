package mh;

import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.EnumC1635w;
import androidx.lifecycle.InterfaceC1581f0;

/* JADX INFO: renamed from: mh.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C25539g extends AbstractC1638x {

    /* JADX INFO: renamed from: b */
    public static final C25539g f100075b = new C25539g();

    /* JADX INFO: renamed from: c */
    public static final C25538f f100076c = new C25538f();

    @Override // androidx.lifecycle.AbstractC1638x
    /* JADX INFO: renamed from: a */
    public final void mo4986a(InterfaceC1581f0 interfaceC1581f0) {
        if (!(interfaceC1581f0 instanceof DefaultLifecycleObserver)) {
            throw new IllegalArgumentException((interfaceC1581f0 + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) interfaceC1581f0;
        C25538f c25538f = f100076c;
        defaultLifecycleObserver.onCreate(c25538f);
        defaultLifecycleObserver.onStart(c25538f);
        defaultLifecycleObserver.onResume(c25538f);
    }

    @Override // androidx.lifecycle.AbstractC1638x
    /* JADX INFO: renamed from: b */
    public final EnumC1635w mo4987b() {
        return EnumC1635w.f6323E;
    }

    @Override // androidx.lifecycle.AbstractC1638x
    /* JADX INFO: renamed from: d */
    public final void mo4988d(InterfaceC1581f0 interfaceC1581f0) {
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }
}
