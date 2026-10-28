package com.mapbox.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"com/mapbox/common/LifecycleMonitorAndroid$lifecycleServiceConnection$1", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "name", "Landroid/os/IBinder;", NotificationCompat.CATEGORY_SERVICE, "Ll83/a0;", "onServiceConnected", "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class LifecycleMonitorAndroid$lifecycleServiceConnection$1 implements ServiceConnection {
    final /* synthetic */ LifecycleMonitorAndroid this$0;

    public LifecycleMonitorAndroid$lifecycleServiceConnection$1(LifecycleMonitorAndroid lifecycleMonitorAndroid) {
        this.this$0 = lifecycleMonitorAndroid;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName name, IBinder service) {
        if (service instanceof LifecycleService.Binder) {
            this.this$0.lifecycleService = ((LifecycleService.Binder) service).getThis$0();
            LifecycleService lifecycleService = this.this$0.lifecycleService;
            if (lifecycleService != null) {
                lifecycleService.setCallback(this.this$0.lifecycleServiceCallback);
            }
            LifecycleMonitorAndroid.updateMonitorState$default(this.this$0, LifecycleMonitorAndroid.MonitorState.STARTED, null, 2, null);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName name) {
        this.this$0.lifecycleService = null;
        LifecycleMonitorAndroid.updateMonitorState$default(this.this$0, LifecycleMonitorAndroid.MonitorState.STOPPED, null, 2, null);
    }
}
