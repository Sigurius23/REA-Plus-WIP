package fi;

import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1581f0;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.InterfaceC3027k1;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import p048ce.AbstractC4482w;
import p196hi.C17302a;
import p461rh.C31430s;
import p461rh.C31431t;
import p547v8.AbstractC35785b;
import r83.EnumC31071a;

/* JADX INFO: renamed from: fi.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C14513s implements InterfaceC14510p, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: E */
    public final InterfaceC3027k1 f53022E;

    /* JADX INFO: renamed from: w */
    public final C31431t f53023w;

    /* JADX INFO: renamed from: x */
    public final C14503i f53024x;

    /* JADX INFO: renamed from: y */
    public final C17302a f53025y;

    /* JADX INFO: renamed from: z */
    public final AbstractC1638x f53026z;

    public C14513s(C31431t c31431t, C14503i c14503i, C17302a c17302a, AbstractC1638x abstractC1638x, InterfaceC3027k1 interfaceC3027k1) {
        this.f53023w = c31431t;
        this.f53024x = c14503i;
        this.f53025y = c17302a;
        this.f53026z = abstractC1638x;
        this.f53022E = interfaceC3027k1;
    }

    @Override // fi.InterfaceC14510p
    /* JADX INFO: renamed from: a */
    public final void mo41415a() {
        C17302a c17302a = this.f53025y;
        if (c17302a.f66506x.isAttachedToWindow()) {
            return;
        }
        ViewOnAttachStateChangeListenerC14514t viewOnAttachStateChangeListenerC14514tM113379B = AbstractC35785b.m113379B(c17302a.f66506x);
        C14513s c14513s = viewOnAttachStateChangeListenerC14514tM113379B.f53031z;
        if (c14513s != null) {
            c14513s.m41416c();
        }
        viewOnAttachStateChangeListenerC14514tM113379B.f53031z = this;
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // fi.InterfaceC14510p
    /* JADX INFO: renamed from: b */
    public final Object mo41414b(C31430s c31430s) {
        Object objM14008r;
        AbstractC1638x abstractC1638x = this.f53026z;
        return (abstractC1638x == null || (objM14008r = AbstractC4482w.m14008r(abstractC1638x, c31430s)) != EnumC31071a.f128113w) ? C23454a0.f92919a : objM14008r;
    }

    /* JADX INFO: renamed from: c */
    public final void m41416c() {
        this.f53022E.cancel((CancellationException) null);
        C17302a c17302a = this.f53025y;
        boolean z4 = c17302a instanceof InterfaceC1581f0;
        AbstractC1638x abstractC1638x = this.f53026z;
        if (z4 && abstractC1638x != null) {
            abstractC1638x.mo4988d(c17302a);
        }
        if (abstractC1638x != null) {
            abstractC1638x.mo4988d(this);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(InterfaceC1585g0 interfaceC1585g0) {
        AbstractC35785b.m113379B(this.f53025y.f66506x).m41417a();
    }

    @Override // fi.InterfaceC14510p
    public final void start() {
        AbstractC1638x abstractC1638x = this.f53026z;
        if (abstractC1638x != null) {
            abstractC1638x.mo4986a(this);
        }
        C17302a c17302a = this.f53025y;
        if ((c17302a instanceof InterfaceC1581f0) && abstractC1638x != null) {
            C17302a c17302a2 = c17302a;
            abstractC1638x.mo4988d(c17302a2);
            abstractC1638x.mo4986a(c17302a2);
        }
        ViewOnAttachStateChangeListenerC14514t viewOnAttachStateChangeListenerC14514tM113379B = AbstractC35785b.m113379B(c17302a.f66506x);
        C14513s c14513s = viewOnAttachStateChangeListenerC14514tM113379B.f53031z;
        if (c14513s != null) {
            c14513s.m41416c();
        }
        viewOnAttachStateChangeListenerC14514tM113379B.f53031z = this;
    }
}
