package p623xr;

import p073cq.C11040i;

/* JADX INFO: renamed from: xr.u */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractRunnableC38625u implements Runnable {

    /* JADX INFO: renamed from: w */
    public final C11040i f166134w;

    public AbstractRunnableC38625u() {
        this.f166134w = null;
    }

    /* JADX INFO: renamed from: a */
    public void mo103294a(Exception exc) {
        C11040i c11040i = this.f166134w;
        if (c11040i != null) {
            c11040i.m29688c(exc);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo103289b();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo103289b();
        } catch (Exception e5) {
            mo103294a(e5);
        }
    }

    public AbstractRunnableC38625u(C11040i c11040i) {
        this.f166134w = c11040i;
    }
}
