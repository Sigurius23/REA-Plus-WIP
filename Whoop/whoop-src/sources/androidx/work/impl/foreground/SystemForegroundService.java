package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.lifecycle.AbstractServiceC1597j0;
import java.util.UUID;
import no.nordicsemi.android.dfu.DfuBaseService;
import p097ds.RunnableC12316s;
import p218ic.C18389w;
import p400pc.C29063b;

/* JADX INFO: loaded from: classes5.dex */
public class SystemForegroundService extends AbstractServiceC1597j0 {

    /* JADX INFO: renamed from: E */
    public static final String f7359E = C18389w.m52887f("SystemFgService");

    /* JADX INFO: renamed from: x */
    public boolean f7360x;

    /* JADX INFO: renamed from: y */
    public C29063b f7361y;

    /* JADX INFO: renamed from: z */
    public NotificationManager f7362z;

    /* JADX INFO: renamed from: a */
    public final void m5526a() {
        this.f7362z = (NotificationManager) getApplicationContext().getSystemService("notification");
        C29063b c29063b = new C29063b(getApplicationContext());
        this.f7361y = c29063b;
        if (c29063b.f117593I != null) {
            C18389w.m52886d().m52889b(C29063b.f117588J, "A callback already exists.");
        } else {
            c29063b.f117593I = this;
        }
    }

    @Override // androidx.lifecycle.AbstractServiceC1597j0, android.app.Service
    public final void onCreate() {
        super.onCreate();
        m5526a();
    }

    @Override // androidx.lifecycle.AbstractServiceC1597j0, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f7361y.m88343f();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i13, int i14) {
        super.onStartCommand(intent, i13, i14);
        boolean z4 = this.f7360x;
        String str = f7359E;
        if (z4) {
            C18389w.m52886d().m52891e(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f7361y.m88343f();
            m5526a();
            this.f7360x = false;
        }
        if (intent == null) {
            return 3;
        }
        C29063b c29063b = this.f7361y;
        c29063b.getClass();
        String str2 = C29063b.f117588J;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            C18389w.m52886d().m52891e(str2, "Started foreground service " + intent);
            c29063b.f117595x.m100716a(new RunnableC12316s(c29063b, intent.getStringExtra("KEY_WORKSPEC_ID"), false, 12));
            c29063b.m88342e(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            c29063b.m88342e(intent);
            return 3;
        }
        if ("ACTION_CANCEL_WORK".equals(action)) {
            C18389w.m52886d().m52891e(str2, "Stopping foreground work for " + intent);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
                return 3;
            }
            c29063b.f117594w.m60638f(UUID.fromString(stringExtra));
            return 3;
        }
        if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        }
        C18389w.m52886d().m52891e(str2, "Stopping foreground service");
        SystemForegroundService systemForegroundService = c29063b.f117593I;
        if (systemForegroundService == null) {
            return 3;
        }
        systemForegroundService.f7360x = true;
        C18389w.m52886d().m52888a(str, "Shutting down.");
        systemForegroundService.stopForeground(true);
        systemForegroundService.stopSelf(i14);
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i13) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.f7361y.m88344g(i13, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS);
    }

    public final void onTimeout(int i13, int i14) {
        this.f7361y.m88344g(i13, i14);
    }
}
