package u73;

import bi.AbstractC3269g;
import java.util.concurrent.atomic.AtomicReference;
import n73.InterfaceC26443b;
import p249jc.AbstractC21598x;
import p299l9.C23494e0;
import q73.EnumC30024c;
import w73.C36919e;

/* JADX INFO: renamed from: u73.a */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC34579a extends AtomicReference implements InterfaceC26443b, Runnable {

    /* JADX INFO: renamed from: w */
    public final C36919e f145600w;

    public RunnableC34579a(C36919e c36919e) {
        this.f145600w = c36919e;
    }

    @Override // n73.InterfaceC26443b
    public final void dispose() {
        EnumC30024c.m91915a(this);
    }

    @Override // n73.InterfaceC26443b
    public final boolean isDisposed() {
        return ((InterfaceC26443b) get()) == EnumC30024c.f122536w;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C36919e c36919e = this.f145600w;
        c36919e.getClass();
        try {
            ((C23494e0) c36919e.f157975x).run();
        } catch (Throwable th3) {
            AbstractC3269g.m9495a0(th3);
            AbstractC21598x.m60677d0(th3);
        }
        c36919e.lazySet(EnumC30024c.f122536w);
    }
}
