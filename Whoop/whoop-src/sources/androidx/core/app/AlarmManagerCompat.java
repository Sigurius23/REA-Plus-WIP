package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.Build;

/* JADX INFO: loaded from: classes5.dex */
public final class AlarmManagerCompat {

    public static class Api21Impl {
        private Api21Impl() {
        }

        public static AlarmManager.AlarmClockInfo createAlarmClockInfo(long j7, PendingIntent pendingIntent) {
            return new AlarmManager.AlarmClockInfo(j7, pendingIntent);
        }

        public static void setAlarmClock(AlarmManager alarmManager, Object obj, PendingIntent pendingIntent) {
            alarmManager.setAlarmClock((AlarmManager.AlarmClockInfo) obj, pendingIntent);
        }
    }

    public static class Api23Impl {
        private Api23Impl() {
        }

        public static void setAndAllowWhileIdle(AlarmManager alarmManager, int i13, long j7, PendingIntent pendingIntent) {
            alarmManager.setAndAllowWhileIdle(i13, j7, pendingIntent);
        }

        public static void setExactAndAllowWhileIdle(AlarmManager alarmManager, int i13, long j7, PendingIntent pendingIntent) {
            alarmManager.setExactAndAllowWhileIdle(i13, j7, pendingIntent);
        }
    }

    public static class Api31Impl {
        private Api31Impl() {
        }

        public static boolean canScheduleExactAlarms(AlarmManager alarmManager) {
            return alarmManager.canScheduleExactAlarms();
        }
    }

    private AlarmManagerCompat() {
    }

    public static boolean canScheduleExactAlarms(AlarmManager alarmManager) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.canScheduleExactAlarms(alarmManager);
        }
        return true;
    }

    @SuppressLint({"MissingPermission"})
    public static void setAlarmClock(AlarmManager alarmManager, long j7, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        Api21Impl.setAlarmClock(alarmManager, Api21Impl.createAlarmClockInfo(j7, pendingIntent), pendingIntent2);
    }

    public static void setAndAllowWhileIdle(AlarmManager alarmManager, int i13, long j7, PendingIntent pendingIntent) {
        Api23Impl.setAndAllowWhileIdle(alarmManager, i13, j7, pendingIntent);
    }

    @Deprecated
    public static void setExact(AlarmManager alarmManager, int i13, long j7, PendingIntent pendingIntent) {
        alarmManager.setExact(i13, j7, pendingIntent);
    }

    public static void setExactAndAllowWhileIdle(AlarmManager alarmManager, int i13, long j7, PendingIntent pendingIntent) {
        Api23Impl.setExactAndAllowWhileIdle(alarmManager, i13, j7, pendingIntent);
    }
}
