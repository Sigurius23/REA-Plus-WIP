package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p218ic.C18389w;
import p249jc.C21596v;

/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final String f7352a = C18389w.m52887f("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C18389w.m52886d().m52888a(f7352a, "Received intent " + intent);
        try {
            C21596v c21596vM60637g = C21596v.m60637g(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (C21596v.f82804m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = c21596vM60637g.f82813i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    c21596vM60637g.f82813i = pendingResultGoAsync;
                    if (c21596vM60637g.f82812h) {
                        pendingResultGoAsync.finish();
                        c21596vM60637g.f82813i = null;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } catch (IllegalStateException e5) {
            C18389w.m52886d().m52890c(f7352a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e5);
        }
    }
}
