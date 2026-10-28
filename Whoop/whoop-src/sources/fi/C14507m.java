package fi;

import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.InterfaceC3027k1;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import p048ce.AbstractC4482w;
import p461rh.C31430s;
import r83.EnumC31071a;

/* JADX INFO: renamed from: fi.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C14507m implements InterfaceC14510p, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: w */
    public final AbstractC1638x f53000w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC3027k1 f53001x;

    public C14507m(AbstractC1638x abstractC1638x, InterfaceC3027k1 interfaceC3027k1) {
        this.f53000w = abstractC1638x;
        this.f53001x = interfaceC3027k1;
    }

    @Override // fi.InterfaceC14510p
    /* JADX INFO: renamed from: b */
    public final Object mo41414b(C31430s c31430s) throws Throwable {
        Object objM14008r = AbstractC4482w.m14008r(this.f53000w, c31430s);
        return objM14008r == EnumC31071a.f128113w ? objM14008r : C23454a0.f92919a;
    }

    @Override // fi.InterfaceC14510p
    public final void complete() {
        this.f53000w.mo4988d(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(InterfaceC1585g0 interfaceC1585g0) {
        this.f53001x.cancel((CancellationException) null);
    }

    @Override // fi.InterfaceC14510p
    public final void start() {
        this.f53000w.mo4986a(this);
    }
}
