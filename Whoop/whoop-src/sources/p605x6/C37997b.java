package p605x6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import p043c4.AbstractC3979v;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import wr0.C37550r;

/* JADX INFO: renamed from: x6.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C37997b extends BroadcastReceiver {

    /* JADX INFO: renamed from: b */
    public static final List f162769b;

    /* JADX INFO: renamed from: c */
    public static final IntentFilter f162770c;

    /* JADX INFO: renamed from: a */
    public final C37550r f162771a;

    static {
        List listM118959K = AbstractC37056f.m118959K("android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED", "android.os.action.LOW_POWER_STANDBY_ENABLED_CHANGED");
        f162769b = listM118959K;
        IntentFilter intentFilter = new IntentFilter();
        Iterator it = listM118959K.iterator();
        while (it.hasNext()) {
            intentFilter.addAction((String) it.next());
        }
        f162770c = intentFilter;
    }

    public C37997b(C37550r c37550r) {
        this.f162771a = c37550r;
    }

    /* JADX INFO: renamed from: a */
    public final void m121737a(Context context) {
        int i13 = Build.VERSION.SDK_INT;
        Object systemService = context.getSystemService("power");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        PowerManager powerManager = (PowerManager) systemService;
        boolean zIsDeviceIdleMode = powerManager.isDeviceIdleMode();
        if (i13 >= 33) {
            zIsDeviceIdleMode = zIsDeviceIdleMode || AbstractC3979v.m12015f(powerManager);
        }
        if (zIsDeviceIdleMode) {
            this.f162771a.invoke();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (AbstractC25265s.m74155w0(f162769b, intent.getAction())) {
            m121737a(context);
        }
    }
}
