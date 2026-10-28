package p010a9;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import cl.ThreadFactoryC4793a;
import p187h9.C17018b;
import p621xn.AbstractC38467d;

/* JADX INFO: renamed from: a9.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C0582g extends Thread {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f2072w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f2073x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0582g(Object obj, int i13) {
        super("ExoPlayer:SimpleDecoder");
        this.f2072w = i13;
        this.f2073x = obj;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f2072w) {
            case 0:
                do {
                    try {
                    } catch (InterruptedException e5) {
                        throw new IllegalStateException(e5);
                    }
                    break;
                } while (((C17018b) this.f2073x).m47998h());
                return;
            case 1:
                Process.setThreadPriority(9);
                if (((ThreadFactoryC4793a) this.f2073x).f19715x) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                    return;
                } catch (Throwable th3) {
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th3);
                        return;
                    }
                    return;
                }
            default:
                do {
                    try {
                    } catch (InterruptedException e13) {
                        throw new IllegalStateException(e13);
                    }
                    break;
                } while (((AbstractC38467d) this.f2073x).m123263g());
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0582g(ThreadFactoryC4793a threadFactoryC4793a, Runnable runnable, String str) {
        super(runnable, str);
        this.f2072w = 1;
        this.f2073x = threadFactoryC4793a;
    }
}
