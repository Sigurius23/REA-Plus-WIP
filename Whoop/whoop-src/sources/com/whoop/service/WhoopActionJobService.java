package com.whoop.service;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import e50.C12723b;
import p000.AbstractC11266d;
import qr2.AbstractC30556a;
import tr2.C34117o;
import tr2.InterfaceC34116n;
import y82.EnumC39339b;

/* JADX INFO: loaded from: classes4.dex */
public class WhoopActionJobService extends JobService {
    /* JADX INFO: renamed from: a */
    public static JobInfo m24483a(EnumC39339b enumC39339b, Context context, int i13) {
        return m24485c(enumC39339b, context, i13).build();
    }

    /* JADX INFO: renamed from: b */
    private static JobInfo.Builder m24484b(PersistableBundle persistableBundle, Context context, int i13, boolean z4) {
        JobInfo.Builder extras = new JobInfo.Builder(i13, new ComponentName(context, (Class<?>) WhoopActionJobService.class)).setRequiredNetworkType(z4 ? 1 : 0).setBackoffCriteria(30000L, 1).setPersisted(true).setExtras(persistableBundle);
        if (!z4) {
            extras.setOverrideDeadline(5000L);
        }
        return extras;
    }

    /* JADX INFO: renamed from: c */
    public static JobInfo.Builder m24485c(EnumC39339b enumC39339b, Context context, int i13) {
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("actionString", enumC39339b.getActionString());
        return m24484b(persistableBundle, context, i13, enumC39339b.requiresNetwork());
    }

    /* JADX INFO: renamed from: d */
    private boolean m24486d(JobParameters jobParameters, InterfaceC34116n interfaceC34116n) {
        String string = jobParameters.getExtras().getString("actionString");
        EnumC39339b enumC39339bFromActionString = EnumC39339b.fromActionString(string);
        if (enumC39339bFromActionString != null) {
            interfaceC34116n.mo85219j("Attempting to perform WhoopAction: " + enumC39339bFromActionString + "(" + string + ")", new AbstractC30556a.a[0]);
            EnumC39339b.t tVarAttemptToPerform = enumC39339bFromActionString.attemptToPerform(this);
            boolean zM125448g = EnumC39339b.t.m125448g(tVarAttemptToPerform);
            if (zM125448g) {
                interfaceC34116n.mo85228t("Performed WhoopAction: " + string + " Result: " + tVarAttemptToPerform, new AbstractC30556a.a[0]);
            } else {
                interfaceC34116n.mo85216g(AbstractC11266d.m30461o("Failure detected - rescheduling WhoopAction: ", string), new AbstractC30556a.a[0]);
            }
            jobFinished(jobParameters, !zM125448g);
        } else {
            interfaceC34116n.mo85226q(AbstractC11266d.m30461o("No WhoopAction found for: ", string), new AbstractC30556a.a[0]);
            jobFinished(jobParameters, false);
        }
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        C34117o c34117o = new C34117o(C12723b.m35566a().m35569d(), "WhoopActionJobService");
        c34117o.mo85216g("Starting job", new AbstractC30556a.a[0]);
        if (jobParameters.getExtras().containsKey("actionString")) {
            return m24486d(jobParameters, c34117o);
        }
        c34117o.mo85226q("Found no action to take: " + jobParameters.getExtras(), new AbstractC30556a.a[0]);
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
