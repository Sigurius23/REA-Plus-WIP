package p177gx;

/* JADX INFO: renamed from: gx.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C16270a {

    /* JADX INFO: renamed from: a */
    public boolean f61879a = false;

    /* JADX INFO: renamed from: a */
    public final void m46089a() {
        synchronized (this) {
            this.f61879a = true;
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m46090b() {
        synchronized (this) {
            while (!this.f61879a) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }
}
