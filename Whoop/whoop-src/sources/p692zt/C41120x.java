package p692zt;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: zt.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C41120x extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public RunnableC41121y f177256a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RunnableC41121y f177257b;

    public C41120x(RunnableC41121y runnableC41121y, RunnableC41121y runnableC41121y2) {
        this.f177257b = runnableC41121y;
        this.f177256a = runnableC41121y2;
    }

    /* JADX INFO: renamed from: a */
    public final void m133489a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        this.f177257b.f177262w.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        try {
            RunnableC41121y runnableC41121y = this.f177256a;
            if (runnableC41121y == null) {
                return;
            }
            if (runnableC41121y.m133493d()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                RunnableC41121y runnableC41121y2 = this.f177256a;
                runnableC41121y2.f177265z.f177253f.schedule(runnableC41121y2, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.f177256a = null;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
