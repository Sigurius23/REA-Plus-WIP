package p457rc;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import ge3.AbstractC15751g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import lc.AbstractC23815a;
import lc.C23817c;
import p037bu.C3632c;
import p218ic.C18348b;
import p218ic.C18389w;
import p218ic.EnumC18371m0;
import p249jc.AbstractC21585k;
import p249jc.C21596v;
import p380os.C28301a;
import p420qc.C30194d;
import p420qc.C30200j;
import p420qc.C30204n;
import p420qc.C30207q;
import p420qc.C30211u;
import p505ts.AbstractC34132o;
import pl0.C29343a;

/* JADX INFO: renamed from: rc.b */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC31219b implements Runnable {

    /* JADX INFO: renamed from: E */
    public static final String f128587E = C18389w.m52887f("ForceStopRunnable");

    /* JADX INFO: renamed from: F */
    public static final long f128588F = TimeUnit.DAYS.toMillis(3650);

    /* JADX INFO: renamed from: w */
    public final Context f128589w;

    /* JADX INFO: renamed from: x */
    public final C21596v f128590x;

    /* JADX INFO: renamed from: y */
    public final C3632c f128591y;

    /* JADX INFO: renamed from: z */
    public int f128592z = 0;

    public RunnableC31219b(Context context, C21596v c21596v) {
        this.f128589w = context.getApplicationContext();
        this.f128590x = c21596v;
        this.f128591y = c21596v.f82811g;
    }

    /* JADX INFO: renamed from: c */
    public static void m96157c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        int i13 = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i13);
        long jCurrentTimeMillis = System.currentTimeMillis() + f128588F;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0204  */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x01ec  */
    /* JADX INFO: renamed from: a */
    public final void m96158a() {
        boolean z4;
        C3632c c3632c = this.f128591y;
        C21596v c21596v = this.f128590x;
        WorkDatabase workDatabase = c21596v.f82807c;
        C18348b c18348b = c21596v.f82806b;
        C3632c c3632c2 = c21596v.f82811g;
        WorkDatabase workDatabase2 = c21596v.f82807c;
        String str = C23817c.f94218F;
        Context context = this.f128589w;
        JobScheduler jobSchedulerM69916b = AbstractC23815a.m69916b(context);
        ArrayList<JobInfo> arrayListM69919d = C23817c.m69919d(context, jobSchedulerM69916b);
        List list = (List) AbstractC15751g.m44432L(workDatabase.mo5518e().f123601a, true, false, new C29343a(23));
        HashSet hashSet = new HashSet(arrayListM69919d != null ? arrayListM69919d.size() : 0);
        if (arrayListM69919d != null && !arrayListM69919d.isEmpty()) {
            for (JobInfo jobInfo : arrayListM69919d) {
                C30200j c30200jM69920f = C23817c.m69920f(jobInfo);
                if (c30200jM69920f != null) {
                    hashSet.add(c30200jM69920f.f123603a);
                } else {
                    C23817c.m69918b(jobSchedulerM69916b, jobInfo.getId());
                }
            }
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains((String) it.next())) {
                    C18389w.m52886d().m52888a(C23817c.f94218F, "Reconciling jobs");
                    z4 = true;
                    break;
                }
            } else {
                z4 = false;
                break;
            }
        }
        if (z4) {
            workDatabase.beginTransaction();
            try {
                C30211u c30211uMo5521h = workDatabase.mo5521h();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    c30211uMo5521h.m92436g(-1L, (String) it3.next());
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
            } catch (Throwable th3) {
                workDatabase.endTransaction();
                throw th3;
            }
        }
        C30211u c30211uMo5521h2 = workDatabase2.mo5521h();
        C30204n c30204nMo5520g = workDatabase2.mo5520g();
        workDatabase2.beginTransaction();
        try {
            List<C30207q> list2 = (List) AbstractC15751g.m44432L(c30211uMo5521h2.f123665a, true, false, new C29343a(25));
            boolean z13 = (list2 == null || list2.isEmpty()) ? false : true;
            if (z13) {
                for (C30207q c30207q : list2) {
                    EnumC18371m0 enumC18371m0 = EnumC18371m0.f71515w;
                    String str2 = c30207q.f123634a;
                    c30211uMo5521h2.m92439j(enumC18371m0, str2);
                    c30211uMo5521h2.m92440k(-512, str2);
                    c30211uMo5521h2.m92436g(-1L, str2);
                }
            }
            AbstractC15751g.m44432L(c30204nMo5520g.f123611a, false, true, new C29343a(24));
            workDatabase2.setTransactionSuccessful();
            workDatabase2.endTransaction();
            boolean z14 = z13 || z4;
            Long lM92417a = ((WorkDatabase) c3632c2.f14788w).mo5516c().m92417a("reschedule_needed");
            String str3 = f128587E;
            if (lM92417a != null && lM92417a.longValue() == 1) {
                C18389w.m52886d().m52888a(str3, "Rescheduling Workers.");
                c21596v.m60640i();
                c3632c2.getClass();
                ((WorkDatabase) c3632c2.f14788w).mo5516c().m92418b(new C30194d("reschedule_needed", 0L));
                return;
            }
            try {
                int i13 = Build.VERSION.SDK_INT;
                int i14 = i13 >= 31 ? 570425344 : 536870912;
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i14);
                if (i13 < 30) {
                    if (broadcast == null) {
                        m96157c(context);
                        C18389w.m52886d().m52888a(str3, "Application was force-stopped, rescheduling.");
                        c21596v.m60640i();
                        c18348b.f71449d.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        c3632c.getClass();
                        ((WorkDatabase) c3632c.f14788w).mo5516c().m92418b(new C30194d("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis)));
                        return;
                    }
                    if (z14) {
                        C18389w.m52886d().m52888a(str3, "Found unfinished work, scheduling it.");
                        AbstractC21585k.m60632b(c18348b, workDatabase2, c21596v.f82809e);
                    }
                }
                if (broadcast != null) {
                    broadcast.cancel();
                }
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    Long lM92417a2 = ((WorkDatabase) c3632c.f14788w).mo5516c().m92417a("last_force_stop_ms");
                    long jLongValue = lM92417a2 != null ? lM92417a2.longValue() : 0L;
                    for (int i15 = 0; i15 < historicalProcessExitReasons.size(); i15++) {
                        ApplicationExitInfo applicationExitInfoM85738i = C28301a.m85738i(historicalProcessExitReasons.get(i15));
                        if (applicationExitInfoM85738i.getReason() == 10 && applicationExitInfoM85738i.getTimestamp() >= jLongValue) {
                            C18389w.m52886d().m52888a(str3, "Application was force-stopped, rescheduling.");
                            c21596v.m60640i();
                            c18348b.f71449d.getClass();
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            c3632c.getClass();
                            ((WorkDatabase) c3632c.f14788w).mo5516c().m92418b(new C30194d("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis2)));
                            return;
                        }
                    }
                }
                if (z14) {
                    C18389w.m52886d().m52888a(str3, "Found unfinished work, scheduling it.");
                    AbstractC21585k.m60632b(c18348b, workDatabase2, c21596v.f82809e);
                }
            } catch (IllegalArgumentException e5) {
                e = e5;
                if (C18389w.m52886d().f71556a <= 5) {
                    Log.w(str3, "Ignoring exception", e);
                }
            } catch (SecurityException e13) {
                e = e13;
                if (C18389w.m52886d().f71556a <= 5) {
                    Log.w(str3, "Ignoring exception", e);
                }
            }
        } catch (Throwable th4) {
            workDatabase2.endTransaction();
            throw th4;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m96159b() {
        C18348b c18348b = this.f128590x.f82806b;
        c18348b.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = f128587E;
        if (zIsEmpty) {
            C18389w.m52886d().m52888a(str, "The default process name was not specified.");
            return true;
        }
        boolean zM96166a = AbstractC31225h.m96166a(this.f128589w, c18348b);
        C18389w.m52886d().m52888a(str, "Is default app process = " + zM96166a);
        return zM96166a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f128589w;
        String str = f128587E;
        C21596v c21596v = this.f128590x;
        try {
            if (!m96159b()) {
                c21596v.m60639h();
                return;
            }
            while (true) {
                try {
                    AbstractC34132o.m107860E(context);
                    C18389w.m52886d().m52888a(str, "Performing cleanup operations.");
                    try {
                        m96158a();
                        c21596v.m60639h();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e5) {
                        int i13 = this.f128592z + 1;
                        this.f128592z = i13;
                        if (i13 >= 3) {
                            String str2 = AbstractC15751g.m44427G(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            C18389w.m52886d().m52890c(str, str2, e5);
                            IllegalStateException illegalStateException = new IllegalStateException(str2, e5);
                            c21596v.f82806b.getClass();
                            throw illegalStateException;
                        }
                        long j7 = ((long) i13) * 300;
                        String str3 = "Retrying after " + j7;
                        if (C18389w.m52886d().f71556a <= 3) {
                            Log.d(str, str3, e5);
                        }
                        try {
                            Thread.sleep(((long) this.f128592z) * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e13) {
                    C18389w.m52886d().m52889b(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e13);
                    c21596v.f82806b.getClass();
                    throw illegalStateException2;
                }
            }
        } catch (Throwable th3) {
            c21596v.m60639h();
            throw th3;
        }
    }
}
