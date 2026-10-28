package p457rc;

import android.content.Context;
import android.os.PowerManager;
import p218ic.C18389w;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: rc.j */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC31227j {
    static {
        AbstractC22676k.m65749i(C18389w.m52887f("WakeLocks"), "tagWithPrefix(...)");
    }

    /* JADX INFO: renamed from: a */
    public static final PowerManager.WakeLock m96167a(Context context) {
        AbstractC22676k.m65750j(context, "context");
        Object systemService = context.getApplicationContext().getSystemService("power");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String strConcat = "WorkManager: ".concat("ProcessorForegroundLck");
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, strConcat);
        synchronized (C31228k.f128606a) {
        }
        AbstractC22676k.m65747g(wakeLockNewWakeLock);
        return wakeLockNewWakeLock;
    }
}
