package io.ktor.utils.p228io.internal;

import bc3.InterfaceC3027k1;
import bc3.InterfaceC3056s0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.ktor.utils.io.internal.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C19991a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC3027k1 f75040w;

    /* JADX INFO: renamed from: x */
    public InterfaceC3056s0 f75041x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C19992b f75042y;

    public C19991a(C19992b c19992b, InterfaceC3027k1 interfaceC3027k1) {
        this.f75042y = c19992b;
        this.f75040w = interfaceC3027k1;
        InterfaceC3056s0 interfaceC3056s0InvokeOnCompletion = interfaceC3027k1.invokeOnCompletion(true, true, this);
        if (interfaceC3027k1.isActive()) {
            this.f75041x = interfaceC3056s0InvokeOnCompletion;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m55788a() {
        InterfaceC3056s0 interfaceC3056s0 = this.f75041x;
        if (interfaceC3056s0 != null) {
            this.f75041x = null;
            interfaceC3056s0.dispose();
        }
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C19992b c19992b;
        Throwable th3 = (Throwable) obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C19992b.f75044x;
        do {
            c19992b = this.f75042y;
            if (atomicReferenceFieldUpdater.compareAndSet(c19992b, this, null)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(c19992b) == this);
        m55788a();
        if (th3 != null) {
            C19992b.m55789a(c19992b, this.f75040w, th3);
        }
        return C23454a0.f92919a;
    }
}
