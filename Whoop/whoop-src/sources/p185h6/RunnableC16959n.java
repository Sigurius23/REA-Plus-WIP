package p185h6;

import android.os.Trace;
import java.util.ArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import p029b5.AbstractC2732k;
import y73.AbstractC39302n;

/* JADX INFO: renamed from: h6.n */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC16959n implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f65095w;

    /* JADX INFO: renamed from: a */
    private final void m47717a() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f65095w) {
            case 0:
                try {
                    int i13 = AbstractC2732k.f10742a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (C16955j.m47709d()) {
                        C16955j.m47708a().m47712e();
                        break;
                    }
                    return;
                } finally {
                    int i14 = AbstractC2732k.f10742a;
                    Trace.endSection();
                }
            case 1:
                return;
            default:
                for (ScheduledThreadPoolExecutor scheduledThreadPoolExecutor : new ArrayList(AbstractC39302n.f169098d.keySet())) {
                    if (scheduledThreadPoolExecutor.isShutdown()) {
                        AbstractC39302n.f169098d.remove(scheduledThreadPoolExecutor);
                    } else {
                        scheduledThreadPoolExecutor.purge();
                    }
                }
                return;
        }
    }

    public String toString() {
        switch (this.f65095w) {
            case 1:
                return "EmptyRunnable";
            default:
                return super.toString();
        }
    }
}
