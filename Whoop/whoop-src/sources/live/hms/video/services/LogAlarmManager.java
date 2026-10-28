package live.hms.video.services;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.preference.PreferenceManager;
import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import java.util.Calendar;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import live.hms.video.utils.AndroidSDKConstants;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m65681d2 = {"Llive/hms/video/services/LogAlarmManager;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "", "getTimeForTrigger", "()J", "Landroid/content/Context;", "context", "dirSize", "Ll83/a0;", "scheduleWork", "(Landroid/content/Context;J)V", "Landroid/content/Intent;", "intent", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class LogAlarmManager extends BroadcastReceiver {
    public static final long DEFAULT_DIR_SIZE = 1000000;
    public static final String DEFAULT_LOGS_FILE_NAME = "session_log";
    public static final String MAX_DIR_SIZE = "max_dir_size";

    private final long getTimeForTrigger() {
        Calendar calendar = Calendar.getInstance();
        AbstractC22676k.m65749i(calendar, "getInstance(...)");
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        return calendar.getTimeInMillis();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (context != null) {
            C22365e c22365e = AbstractC3050q0.f12077a;
            AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(ExecutorC22364d.f87316w), null, null, new LogAlarmManager$onReceive$1$1(context, null), 3);
        }
    }

    @SuppressLint({"UnspecifiedImmutableFlag", "WrongConstant"})
    public final void scheduleWork(Context context, long dirSize) {
        AbstractC22676k.m65750j(context, "context");
        PreferenceManager.getDefaultSharedPreferences(context).edit().putLong("max_dir_size", dirSize).apply();
        long timeForTrigger = getTimeForTrigger();
        Intent intent = new Intent(context, (Class<?>) LogAlarmManager.class);
        PendingIntent broadcast = Build.VERSION.SDK_INT >= 31 ? PendingIntent.getBroadcast(context, 0, intent, AndroidSDKConstants.FLAG_MUTABLE) : PendingIntent.getBroadcast(context, 0, intent, 134217728);
        Object systemService = context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        AlarmManager alarmManager = (AlarmManager) systemService;
        alarmManager.cancel(broadcast);
        alarmManager.setAndAllowWhileIdle(2, timeForTrigger, broadcast);
    }
}
