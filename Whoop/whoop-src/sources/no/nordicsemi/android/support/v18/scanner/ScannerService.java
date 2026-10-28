package no.nordicsemi.android.support.v18.scanner;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import io.getstream.chat.android.client.ChatClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import td3.AbstractC33722b;
import td3.AbstractC33729i;
import td3.C33728h;
import td3.C33734n;

/* JADX INFO: loaded from: classes3.dex */
public class ScannerService extends Service {

    /* JADX INFO: renamed from: w */
    public final Object f107448w = new Object();

    /* JADX INFO: renamed from: x */
    public HashMap f107449x;

    /* JADX INFO: renamed from: y */
    public Handler f107450y;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f107449x = new HashMap();
        this.f107450y = new Handler();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        AbstractC33722b abstractC33722bM106606a = AbstractC33722b.m106606a();
        Iterator it = this.f107449x.values().iterator();
        while (it.hasNext()) {
            try {
                abstractC33722bM106606a.m106609d((AbstractC33729i) it.next());
            } catch (Exception unused) {
            }
        }
        this.f107449x.clear();
        this.f107449x = null;
        this.f107450y = null;
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i13, int i14) {
        boolean zContainsKey;
        AbstractC33729i abstractC33729i;
        boolean zIsEmpty;
        boolean zIsEmpty2;
        if (intent != null) {
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("no.nordicsemi.android.support.v18.EXTRA_PENDING_INTENT");
            int intExtra = intent.getIntExtra("no.nordicsemi.android.support.v18.REQUEST_CODE", 0);
            boolean booleanExtra = intent.getBooleanExtra("no.nordicsemi.android.support.v18.EXTRA_START", false);
            if (pendingIntent == null) {
                synchronized (this.f107448w) {
                    zIsEmpty2 = this.f107449x.isEmpty();
                }
                if (zIsEmpty2) {
                    stopSelf();
                    return 2;
                }
            } else {
                synchronized (this.f107448w) {
                    zContainsKey = this.f107449x.containsKey(Integer.valueOf(intExtra));
                }
                if (booleanExtra && !zContainsKey) {
                    List parcelableArrayListExtra = intent.getParcelableArrayListExtra("no.nordicsemi.android.support.v18.EXTRA_FILTERS");
                    C33734n c33734n = (C33734n) intent.getParcelableExtra("no.nordicsemi.android.support.v18.EXTRA_SETTINGS");
                    if (parcelableArrayListExtra == null) {
                        parcelableArrayListExtra = Collections.EMPTY_LIST;
                    }
                    if (c33734n == null) {
                        c33734n = new C33734n(0, 1, 0L, 1, 3, true, 255, true, true, true, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, 500L, 4500L);
                    }
                    C33728h c33728h = new C33728h(pendingIntent, c33734n, this);
                    synchronized (this.f107448w) {
                        this.f107449x.put(Integer.valueOf(intExtra), c33728h);
                    }
                    try {
                        AbstractC33722b.m106606a().mo106608c(parcelableArrayListExtra, c33734n, c33728h, this.f107450y);
                    } catch (Exception e5) {
                        Log.w("ScannerService", "Starting scanning failed", e5);
                    }
                } else if (!booleanExtra && zContainsKey) {
                    synchronized (this.f107448w) {
                        abstractC33729i = (AbstractC33729i) this.f107449x.remove(Integer.valueOf(intExtra));
                        zIsEmpty = this.f107449x.isEmpty();
                    }
                    if (abstractC33729i != null) {
                        try {
                            AbstractC33722b.m106606a().m106609d(abstractC33729i);
                        } catch (Exception e13) {
                            Log.w("ScannerService", "Stopping scanning failed", e13);
                        }
                        if (zIsEmpty) {
                            stopSelf();
                        }
                    }
                }
            }
        }
        return 2;
    }
}
