package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import a33.C0352d;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import gm.C15981i;
import gm.C15989q;
import io.sentry.android.core.RunnableC20151r0;
import java.util.concurrent.Executor;
import p127ev.C13668i;
import p254jj.RunnableC21737c;
import p430qm.AbstractC30477a;

/* JADX INFO: loaded from: classes6.dex */
public class JobInfoSchedulerService extends JobService {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ int f20364w = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i13 = jobParameters.getExtras().getInt("priority");
        int i14 = jobParameters.getExtras().getInt("attemptNumber");
        C15989q.m45133b(getApplicationContext());
        C0352d c0352dM45125a = C15981i.m45125a();
        c0352dM45125a.m928Q(string);
        c0352dM45125a.f1239z = AbstractC30477a.m93286b(i13);
        if (string2 != null) {
            c0352dM45125a.f1238y = Base64.decode(string2, 0);
        }
        C13668i c13668i = C15989q.m45132a().f60509d;
        ((Executor) c13668i.f48458e).execute(new RunnableC21737c(c13668i, c0352dM45125a.m932d(), i14, new RunnableC20151r0(21, this, jobParameters), 1));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
