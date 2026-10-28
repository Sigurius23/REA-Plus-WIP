package p559vr;

import p073cq.C11040i;

/* JADX INFO: renamed from: vr.e */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractRunnableC36295e implements Runnable {

    /* JADX INFO: renamed from: w */
    public final C11040i f155533w;

    public AbstractRunnableC36295e() {
        this.f155533w = null;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo111312a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo111312a();
        } catch (Exception e5) {
            C11040i c11040i = this.f155533w;
            if (c11040i != null) {
                c11040i.m29688c(e5);
            }
        }
    }

    public AbstractRunnableC36295e(C11040i c11040i) {
        this.f155533w = c11040i;
    }
}
