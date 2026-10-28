package androidx.health.platform.client.impl.sdkservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import p046c8.BinderC4296a;
import p097ds.ThreadFactoryC12321x;

/* JADX INFO: loaded from: classes5.dex */
public final class HealthDataSdkService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        String action = intent.getAction();
        if ("androidx.health.platform.client.ACTION_BIND_SDK_SERVICE".equals(action)) {
            Locale locale = Locale.ROOT;
            return new BinderC4296a(getApplicationContext(), Executors.newSingleThreadExecutor(new ThreadFactoryC12321x(Executors.defaultThreadFactory(), new AtomicLong(0L))));
        }
        Log.i("HealthDataSdkService", "Bind request with an invalid action [" + action + "]");
        return null;
    }
}
