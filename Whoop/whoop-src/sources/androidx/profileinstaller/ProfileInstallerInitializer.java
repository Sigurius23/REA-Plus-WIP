package androidx.profileinstaller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p644yb.InterfaceC39377b;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC39377b {
    private static final int DELAY_MS = 5000;

    public static class Handler28Impl {
        private Handler28Impl() {
        }

        public static Handler createAsync(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static class Result {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$create$0(Context context, long j7) {
        installAfterDelay(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeInBackground(Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC1654e(context, 1));
    }

    @Override // p644yb.InterfaceC39377b
    public List<Class<? extends InterfaceC39377b>> dependencies() {
        return Collections.EMPTY_LIST;
    }

    public void installAfterDelay(Context context) {
        Handler28Impl.createAsync(Looper.getMainLooper()).postDelayed(new RunnableC1654e(context, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
    }

    @Override // p644yb.InterfaceC39377b
    public Result create(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.profileinstaller.d
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j7) {
                this.f6525w.lambda$create$0(applicationContext, j7);
            }
        });
        return new Result();
    }
}
