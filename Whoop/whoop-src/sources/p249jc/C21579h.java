package p249jc;

import android.content.Context;
import android.content.SharedPreferences;
import p325mb.AbstractC25380b;
import p518ub.InterfaceC34728a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jc.h */
/* JADX INFO: loaded from: classes.dex */
public final class C21579h extends AbstractC25380b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f82753a = 1;

    /* JADX INFO: renamed from: b */
    public final Context f82754b;

    public C21579h(Context context, int i13, int i14) {
        super(i13, i14);
        this.f82754b = context;
    }

    @Override // p325mb.AbstractC25380b
    public final void migrate(InterfaceC34728a db4) {
        switch (this.f82753a) {
            case 0:
                AbstractC22676k.m65750j(db4, "db");
                if (this.endVersion >= 10) {
                    db4.mo109658C0(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    this.f82754b.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                AbstractC22676k.m65750j(db4, "db");
                db4.mo109660E("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                Context context = this.f82754b;
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j7 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j13 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    db4.mo109673y();
                    try {
                        db4.mo109658C0(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j7)});
                        db4.mo109658C0(new Object[]{"reschedule_needed", Long.valueOf(j13)});
                        sharedPreferences.edit().clear().apply();
                        db4.mo109663O();
                        db4.mo109665V();
                    } catch (Throwable th3) {
                        db4.mo109665V();
                        throw th3;
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i13 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i14 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    db4.mo109673y();
                    try {
                        db4.mo109658C0(new Object[]{"next_job_scheduler_id", Integer.valueOf(i13)});
                        db4.mo109658C0(new Object[]{"next_alarm_manager_id", Integer.valueOf(i14)});
                        sharedPreferences2.edit().clear().apply();
                        db4.mo109663O();
                        return;
                    } finally {
                        db4.mo109665V();
                    }
                }
                return;
        }
    }

    public C21579h(Context context) {
        super(9, 10);
        this.f82754b = context;
    }
}
