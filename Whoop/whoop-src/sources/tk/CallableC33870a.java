package tk;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: tk.a */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC33870a implements Callable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C33873d f141869w;

    public CallableC33870a(C33873d c33873d) {
        this.f141869w = c33873d;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.f141869w) {
            try {
                C33873d c33873d = this.f141869w;
                if (c33873d.f141881I == null) {
                    return null;
                }
                c33873d.m107122x0();
                if (this.f141869w.m107121x()) {
                    this.f141869w.m107119o0();
                    this.f141869w.f141883K = 0;
                }
                return null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
