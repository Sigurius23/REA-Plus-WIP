package p218ic;

import c93.InterfaceC4339a;
import java.util.concurrent.atomic.AtomicBoolean;
import p080d4.C11650i;

/* JADX INFO: renamed from: ic.q */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC18378q implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f71538w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AtomicBoolean f71539x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C11650i f71540y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4339a f71541z;

    public /* synthetic */ RunnableC18378q(AtomicBoolean atomicBoolean, C11650i c11650i, InterfaceC4339a interfaceC4339a, int i13) {
        this.f71538w = i13;
        this.f71539x = atomicBoolean;
        this.f71540y = c11650i;
        this.f71541z = interfaceC4339a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f71538w) {
            case 0:
                C11650i c11650i = this.f71540y;
                InterfaceC4339a interfaceC4339a = this.f71541z;
                if (!this.f71539x.get()) {
                    try {
                        c11650i.m31068a(interfaceC4339a.invoke());
                    } catch (Throwable th3) {
                        c11650i.m31069b(th3);
                        return;
                    }
                    break;
                }
                break;
            default:
                C11650i c11650i2 = this.f71540y;
                InterfaceC4339a interfaceC4339a2 = this.f71541z;
                if (!this.f71539x.get()) {
                    try {
                        c11650i2.m31068a(interfaceC4339a2.invoke());
                    } catch (Throwable th4) {
                        c11650i2.m31069b(th4);
                    }
                    break;
                }
                break;
        }
    }
}
