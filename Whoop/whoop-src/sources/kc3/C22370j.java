package kc3;

import bc3.AbstractC3006f0;
import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: kc3.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C22370j extends AbstractRunnableC22369i {

    /* JADX INFO: renamed from: y */
    public final Runnable f87323y;

    public C22370j(Runnable runnable, long j7, boolean z4) {
        super(j7, z4);
        this.f87323y = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f87323y.run();
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Task[");
        Runnable runnable = this.f87323y;
        sb4.append(runnable.getClass().getSimpleName());
        sb4.append('@');
        sb4.append(AbstractC3006f0.m8724r(runnable));
        sb4.append(", ");
        sb4.append(this.f87321w);
        sb4.append(", ");
        return AbstractC25012a.m73377j(sb4, this.f87322x ? "Blocking" : "Non-blocking", ']');
    }
}
