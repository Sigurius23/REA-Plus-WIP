package p020ap;

import android.os.Process;

/* JADX INFO: renamed from: ap.c */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1880c implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7420w;

    /* JADX INFO: renamed from: x */
    public final Runnable f7421x;

    public /* synthetic */ RunnableC1880c(Runnable runnable, int i13) {
        this.f7420w = i13;
        this.f7421x = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7420w) {
            case 0:
                Process.setThreadPriority(0);
                this.f7421x.run();
                break;
            case 1:
                this.f7421x.run();
                break;
            default:
                Process.setThreadPriority(10);
                this.f7421x.run();
                break;
        }
    }

    public String toString() {
        switch (this.f7420w) {
            case 1:
                return this.f7421x.toString();
            default:
                return super.toString();
        }
    }
}
