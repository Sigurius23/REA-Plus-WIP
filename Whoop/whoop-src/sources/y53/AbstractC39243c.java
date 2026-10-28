package y53;

import bc3.C3023j1;
import bc3.InterfaceC3061u;
import j43.C21317a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import l83.C23470p;
import p005a3.C0222l0;
import q83.AbstractC30060g;
import q83.InterfaceC30061h;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: y53.c */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC39243c implements InterfaceC39242b {

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f168743x = AtomicIntegerFieldUpdater.newUpdater(AbstractC39243c.class, "closed");
    private volatile /* synthetic */ int closed = 0;

    /* JADX INFO: renamed from: w */
    public final C23470p f168744w = AbstractC30060g.m92088H(new C0222l0(this, 23));

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (f168743x.compareAndSet(this, 0, 1)) {
            InterfaceC30061h interfaceC30061h = getCoroutineContext().get(C3023j1.f12041w);
            InterfaceC3061u interfaceC3061u = interfaceC30061h instanceof InterfaceC3061u ? (InterfaceC3061u) interfaceC30061h : null;
            if (interfaceC3061u == null) {
                return;
            }
            interfaceC3061u.complete();
            interfaceC3061u.invokeOnCompletion(new C21317a(this, 24));
        }
    }

    @Override // bc3.InterfaceC2994c0
    public InterfaceC30063j getCoroutineContext() {
        return (InterfaceC30063j) this.f168744w.getValue();
    }
}
