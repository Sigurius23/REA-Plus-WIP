package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import com.google.crypto.tink.internal.C5101l0;
import java.util.Arrays;
import java.util.HashMap;
import lc.AbstractC23818d;
import p005a3.C0237p;
import p014aj.C0928c;
import p088dc.AbstractC11895b;
import p185h6.RunnableC16957l;
import p218ic.C18389w;
import p249jc.C21577g;
import p249jc.C21586l;
import p249jc.C21596v;
import p249jc.InterfaceC21571d;
import p420qc.C30200j;
import sc.InterfaceC32351a;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements InterfaceC21571d {

    /* JADX INFO: renamed from: E */
    public static final String f7353E = C18389w.m52887f("SystemJobService");

    /* JADX INFO: renamed from: w */
    public C21596v f7354w;

    /* JADX INFO: renamed from: x */
    public final HashMap f7355x = new HashMap();

    /* JADX INFO: renamed from: y */
    public final C0928c f7356y = new C0928c(18, (byte) 0);

    /* JADX INFO: renamed from: z */
    public C5101l0 f7357z;

    /* JADX INFO: renamed from: a */
    public static void m5523a(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(AbstractC11895b.m31996o("Cannot invoke ", str, " on a background thread"));
        }
    }

    /* JADX INFO: renamed from: c */
    public static C30200j m5524c(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new C30200j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // p249jc.InterfaceC21571d
    /* JADX INFO: renamed from: b */
    public final void mo5525b(C30200j c30200j, boolean z4) {
        m5523a("onExecuted");
        C18389w.m52886d().m52888a(f7353E, c30200j.f123603a + " executed on JobScheduler");
        JobParameters jobParameters = (JobParameters) this.f7355x.remove(c30200j);
        this.f7356y.m2307Q(c30200j);
        if (jobParameters != null) {
            jobFinished(jobParameters, z4);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            C21596v c21596vM60637g = C21596v.m60637g(getApplicationContext());
            this.f7354w = c21596vM60637g;
            C21577g c21577g = c21596vM60637g.f82810f;
            this.f7357z = new C5101l0(c21577g, c21596vM60637g.f82808d);
            c21577g.m60619a(this);
        } catch (IllegalStateException e5) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e5);
            }
            C18389w.m52886d().m52892g(f7353E, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        C21596v c21596v = this.f7354w;
        if (c21596v != null) {
            C21577g c21577g = c21596v.f82810f;
            synchronized (c21577g.f82749k) {
                c21577g.f82748j.remove(this);
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        m5523a("onStartJob");
        C21596v c21596v = this.f7354w;
        String str = f7353E;
        if (c21596v == null) {
            C18389w.m52886d().m52888a(str, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        C30200j c30200jM5524c = m5524c(jobParameters);
        if (c30200jM5524c == null) {
            C18389w.m52886d().m52889b(str, "WorkSpec id not found!");
            return false;
        }
        HashMap map = this.f7355x;
        if (map.containsKey(c30200jM5524c)) {
            C18389w.m52886d().m52888a(str, "Job is already being executed by SystemJobService: " + c30200jM5524c);
            return false;
        }
        C18389w.m52886d().m52888a(str, "onStartJob for " + c30200jM5524c);
        map.put(c30200jM5524c, jobParameters);
        C0237p c0237p = new C0237p(7);
        if (jobParameters.getTriggeredContentUris() != null) {
            c0237p.f813y = Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            c0237p.f812x = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        c0237p.f814z = jobParameters.getNetwork();
        C5101l0 c5101l0 = this.f7357z;
        C21586l c21586lM2314X = this.f7356y.m2314X(c30200jM5524c);
        c5101l0.getClass();
        ((InterfaceC32351a) c5101l0.f21444y).m100716a(new RunnableC16957l(c5101l0, c21586lM2314X, c0237p, 5));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        m5523a("onStopJob");
        if (this.f7354w == null) {
            C18389w.m52886d().m52888a(f7353E, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        C30200j c30200jM5524c = m5524c(jobParameters);
        if (c30200jM5524c == null) {
            C18389w.m52886d().m52889b(f7353E, "WorkSpec id not found!");
            return false;
        }
        C18389w.m52886d().m52888a(f7353E, "onStopJob for " + c30200jM5524c);
        this.f7355x.remove(c30200jM5524c);
        C21586l c21586lM2307Q = this.f7356y.m2307Q(c30200jM5524c);
        if (c21586lM2307Q != null) {
            int iM69922a = Build.VERSION.SDK_INT >= 31 ? AbstractC23818d.m69922a(jobParameters) : -512;
            C5101l0 c5101l0 = this.f7357z;
            c5101l0.getClass();
            c5101l0.m16061j0(c21586lM2307Q, iM69922a);
        }
        C21577g c21577g = this.f7354w.f82810f;
        String str = c30200jM5524c.f123603a;
        synchronized (c21577g.f82749k) {
            zContains = c21577g.f82747i.contains(str);
        }
        return !zContains;
    }
}
