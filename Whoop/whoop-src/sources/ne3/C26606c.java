package ne3;

import bd3.C3143v;
import java.util.concurrent.locks.ReentrantLock;
import p249jc.C21565a;

/* JADX INFO: renamed from: ne3.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C26606c extends Thread {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f105834w = 1;

    public /* synthetic */ C26606c(Runnable runnable, String str) {
        super(runnable, str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        switch (this.f105834w) {
            case 0:
                break;
            default:
                super.run();
                return;
        }
        while (true) {
            try {
                C3143v c3143v = C26608d.f105837h;
                ReentrantLock reentrantLock = C26608d.f105839j;
                reentrantLock.lock();
                try {
                    C26608d c26608dM60597h = C21565a.m60597h();
                    if (c26608dM60597h == C26608d.f105838i) {
                        C26608d.f105838i = null;
                        reentrantLock.unlock();
                        return;
                    } else {
                        reentrantLock.unlock();
                        if (c26608dM60597h != null) {
                            c26608dM60597h.mo14147k();
                        }
                    }
                } catch (Throwable th3) {
                    reentrantLock.unlock();
                    throw th3;
                }
            } catch (InterruptedException unused) {
            }
        }
    }

    public /* synthetic */ C26606c(String str) {
        super(str);
    }
}
