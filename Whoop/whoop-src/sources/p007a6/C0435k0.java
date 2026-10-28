package p007a6;

import hg3.AbstractC17269i;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: a6.k0 */
/* JADX INFO: loaded from: classes.dex */
public class C0435k0 implements InterfaceC0461w0 {

    /* JADX INFO: renamed from: a */
    public final File f1493a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0465y0 f1494b;

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f1495c = new AtomicBoolean(false);

    public C0435k0(File file, InterfaceC0465y0 interfaceC0465y0) {
        this.f1493a = file;
        this.f1494b = interfaceC0465y0;
    }

    @Override // p007a6.InterfaceC0461w0
    /* JADX INFO: renamed from: a */
    public final Object mo1118a(C0450r c0450r) {
        if (this.f1495c.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
        return AbstractC17269i.m48902m(this.f1493a, new C0432j0(this, null), c0450r);
    }

    @Override // p007a6.InterfaceC0404a
    public final void close() {
        this.f1495c.set(true);
    }
}
