package p095dp;

import android.os.Process;

/* JADX INFO: renamed from: dp.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C12239c extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(19);
        synchronized (this) {
            while (true) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }
}
