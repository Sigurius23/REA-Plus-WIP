package bc3;

import java.util.concurrent.locks.LockSupport;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: bc3.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C3005f extends AbstractC2985a {

    /* JADX INFO: renamed from: E */
    public final AbstractC2987a1 f12013E;

    /* JADX INFO: renamed from: z */
    public final Thread f12014z;

    public C3005f(InterfaceC30063j interfaceC30063j, Thread thread, AbstractC2987a1 abstractC2987a1) {
        super(interfaceC30063j, true, true);
        this.f12014z = thread;
        this.f12013E = abstractC2987a1;
    }

    @Override // bc3.C3060t1
    /* JADX INFO: renamed from: j */
    public final void mo8694j(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f12014z;
        if (AbstractC22676k.m65745e(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
