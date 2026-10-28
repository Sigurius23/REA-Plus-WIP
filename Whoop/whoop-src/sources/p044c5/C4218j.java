package p044c5;

import android.os.Process;

/* JADX INFO: renamed from: c5.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C4218j extends Thread {

    /* JADX INFO: renamed from: w */
    public final int f17103w;

    public C4218j(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f17103w = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f17103w);
        super.run();
    }
}
