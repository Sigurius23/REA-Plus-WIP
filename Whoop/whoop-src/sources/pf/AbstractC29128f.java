package pf;

import bc3.AbstractC3006f0;
import bc3.C2990b0;
import bc3.C3023j1;
import bc3.InterfaceC3061u;
import e93.AbstractC12889b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import q83.InterfaceC30061h;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: pf.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC29128f implements InterfaceC29123a {

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f117898y = AtomicIntegerFieldUpdater.newUpdater(AbstractC29128f.class, "x");

    /* JADX INFO: renamed from: w */
    public final InterfaceC30063j f117899w = AbstractC12889b.m36254T(AbstractC3006f0.m8710d(), new C2990b0("http-client-engine-OkHttp-context"));

    /* JADX INFO: renamed from: x */
    public volatile /* synthetic */ int f117900x = 0;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (f117898y.compareAndSet(this, 0, 1)) {
            InterfaceC30061h interfaceC30061h = this.f117899w.get(C3023j1.f12041w);
            InterfaceC3061u interfaceC3061u = interfaceC30061h instanceof InterfaceC3061u ? (InterfaceC3061u) interfaceC30061h : null;
            if (interfaceC3061u == null) {
                return;
            }
            interfaceC3061u.complete();
            interfaceC3061u.invokeOnCompletion(new C29124b(this, 1));
        }
    }

    @Override // bc3.InterfaceC2994c0
    public final InterfaceC30063j getCoroutineContext() {
        return this.f117899w;
    }

    public void shutdown() {
    }
}
