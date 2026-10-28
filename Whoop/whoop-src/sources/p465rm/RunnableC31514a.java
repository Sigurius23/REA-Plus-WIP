package p465rm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import p133f1.C13968p1;

/* JADX INFO: renamed from: rm.a */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC31514a extends BroadcastReceiver implements Runnable {

    /* JADX INFO: renamed from: w */
    public final SurfaceHolderCallbackC31565r f130016w;

    /* JADX INFO: renamed from: x */
    public final Handler f130017x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C13968p1 f130018y;

    public RunnableC31514a(C13968p1 c13968p1, Handler handler, SurfaceHolderCallbackC31565r surfaceHolderCallbackC31565r) {
        this.f130018y = c13968p1;
        this.f130017x = handler;
        this.f130016w = surfaceHolderCallbackC31565r;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f130017x.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f130018y.f49807x) {
            this.f130016w.f130359w.m97230y0(-1, 3, false);
        }
    }
}
