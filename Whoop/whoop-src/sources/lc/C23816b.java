package lc;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import p218ic.C18352d;
import p218ic.C18354e;
import p218ic.C18389w;
import p218ic.C18391y;
import p218ic.EnumC18346a;
import p218ic.EnumC18390x;
import p420qc.C30207q;
import se.AbstractC32411b;

/* JADX INFO: renamed from: lc.b */
/* JADX INFO: loaded from: classes.dex */
public final class C23816b {

    /* JADX INFO: renamed from: d */
    public static final String f94214d = C18389w.m52887f("SystemJobInfoConverter");

    /* JADX INFO: renamed from: a */
    public final ComponentName f94215a;

    /* JADX INFO: renamed from: b */
    public final C18391y f94216b;

    /* JADX INFO: renamed from: c */
    public final boolean f94217c;

    public C23816b(Context context, C18391y c18391y, boolean z4) {
        this.f94216b = c18391y;
        this.f94215a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.f94217c = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final JobInfo m69917a(C30207q c30207q, int i13) {
        int i14;
        String str;
        C18354e c18354e = c30207q.f123643j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", c30207q.f123634a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", c30207q.f123653t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", c30207q.m92426c());
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i13, this.f94215a).setRequiresCharging(c18354e.f71467c);
        boolean z4 = c18354e.f71468d;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z4).setExtras(persistableBundle);
        NetworkRequest networkRequestM52856a = c18354e.m52856a();
        int i15 = Build.VERSION.SDK_INT;
        if (networkRequestM52856a != null) {
            AbstractC32411b.m101090d0(extras, networkRequestM52856a);
        } else {
            EnumC18390x enumC18390x = c18354e.f71465a;
            if (i15 < 30 || enumC18390x != EnumC18390x.f71558F) {
                int iOrdinal = enumC18390x.ordinal();
                if (iOrdinal == 0) {
                    i14 = 0;
                } else if (iOrdinal != 1) {
                    i14 = 2;
                    if (iOrdinal != 2) {
                        i14 = 3;
                        if (iOrdinal != 3) {
                            i14 = 4;
                            if (iOrdinal != 4) {
                                C18389w.m52886d().m52888a(f94214d, "API version too low. Cannot convert network type value " + enumC18390x);
                                i14 = 1;
                            }
                        }
                    }
                } else {
                    i14 = 1;
                }
                extras.setRequiredNetworkType(i14);
            } else {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        }
        if (!z4) {
            extras.setBackoffCriteria(c30207q.f123646m, c30207q.f123645l == EnumC18346a.f71444x ? 0 : 1);
        }
        long jM92425a = c30207q.m92425a();
        this.f94216b.getClass();
        long jMax = Math.max(jM92425a - System.currentTimeMillis(), 0L);
        if (i15 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!c30207q.f123650q && this.f94217c) {
            extras.setImportantWhileForeground(true);
        }
        if (c18354e.m52857b()) {
            for (C18352d c18352d : c18354e.f71473i) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(c18352d.m52854a(), c18352d.m52855b() ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(c18354e.f71471g);
            extras.setTriggerContentMaxDelay(c18354e.f71472h);
        }
        extras.setPersisted(false);
        int i16 = Build.VERSION.SDK_INT;
        extras.setRequiresBatteryNotLow(c18354e.f71469e);
        extras.setRequiresStorageNotLow(c18354e.f71470f);
        Object[] objArr = c30207q.f123644k > 0;
        boolean z13 = jMax > 0;
        if (i16 >= 31 && c30207q.f123650q && objArr == false && !z13) {
            extras.setExpedited(true);
        }
        if (i16 >= 35 && (str = c30207q.f123657x) != null) {
            extras.setTraceTag(str);
        }
        return extras.build();
    }
}
