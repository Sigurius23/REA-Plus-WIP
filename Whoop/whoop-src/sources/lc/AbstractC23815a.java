package lc;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import java.util.List;
import p211i5.AbstractC18092e;
import p218ic.C18389w;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lc.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23815a {

    /* JADX INFO: renamed from: a */
    public static final String f94213a;

    static {
        String strM52887f = C18389w.m52887f("SystemJobScheduler");
        AbstractC22676k.m65749i(strM52887f, "tagWithPrefix(...)");
        f94213a = strM52887f;
    }

    /* JADX INFO: renamed from: a */
    public static final List m69915a(JobScheduler jobScheduler) {
        AbstractC22676k.m65750j(jobScheduler, "<this>");
        try {
            List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
            AbstractC22676k.m65749i(allPendingJobs, "getAllPendingJobs(...)");
            return allPendingJobs;
        } catch (Throwable th3) {
            C18389w.m52886d().m52890c(f94213a, "getAllPendingJobs() is not reliable on this device.", th3);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final JobScheduler m69916b(Context context) {
        AbstractC22676k.m65750j(context, "<this>");
        Object systemService = context.getSystemService("jobscheduler");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        JobScheduler jobScheduler = (JobScheduler) systemService;
        return Build.VERSION.SDK_INT >= 34 ? AbstractC18092e.m51940a(jobScheduler) : jobScheduler;
    }
}
