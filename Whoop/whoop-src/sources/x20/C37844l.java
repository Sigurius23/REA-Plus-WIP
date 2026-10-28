package x20;

import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.AbstractC3006f0;
import bc3.C2996c2;
import f30.C14042e;
import java.util.concurrent.CancellationException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: x20.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C37844l implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: w */
    public final C37855w f162015w;

    public C37844l(C37855w c37855w) {
        this.f162015w = c37855w;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        super.onStart(owner);
        C37855w c37855w = this.f162015w;
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(c37855w), null, null, new C37850r(c37855w, null, 1), 3);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        C14042e c14042e = this.f162015w.f162052x;
        C2996c2 c2996c2 = c14042e.f50111e;
        if (c2996c2 != null) {
            c2996c2.cancel((CancellationException) null);
        }
        c14042e.f50111e = null;
        super.onStop(owner);
    }
}
