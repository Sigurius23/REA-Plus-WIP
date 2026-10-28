package lc;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import e61.C12764g;
import ge3.AbstractC15751g;
import hg3.AbstractC17269i;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import p014aj.C0929d;
import p088dc.AbstractC11895b;
import p218ic.C18348b;
import p218ic.C18389w;
import p218ic.EnumC18363i0;
import p218ic.EnumC18371m0;
import p249jc.InterfaceC21581i;
import p392p3.C28761b0;
import p420qc.C30198h;
import p420qc.C30199i;
import p420qc.C30200j;
import p420qc.C30207q;
import p420qc.C30211u;
import p426qi.CallableC30379e;
import p715kotlin.jvm.internal.AbstractC22676k;
import q80.C30034f;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: lc.c */
/* JADX INFO: loaded from: classes.dex */
public final class C23817c implements InterfaceC21581i {

    /* JADX INFO: renamed from: F */
    public static final String f94218F = C18389w.m52887f("SystemJobScheduler");

    /* JADX INFO: renamed from: E */
    public final C18348b f94219E;

    /* JADX INFO: renamed from: w */
    public final Context f94220w;

    /* JADX INFO: renamed from: x */
    public final JobScheduler f94221x;

    /* JADX INFO: renamed from: y */
    public final C23816b f94222y;

    /* JADX INFO: renamed from: z */
    public final WorkDatabase f94223z;

    public C23817c(Context context, WorkDatabase workDatabase, C18348b c18348b) {
        JobScheduler jobSchedulerM69916b = AbstractC23815a.m69916b(context);
        C23816b c23816b = new C23816b(context, c18348b.f71449d, c18348b.f71457l);
        this.f94220w = context;
        this.f94221x = jobSchedulerM69916b;
        this.f94222y = c23816b;
        this.f94223z = workDatabase;
        this.f94219E = c18348b;
    }

    /* JADX INFO: renamed from: b */
    public static void m69918b(JobScheduler jobScheduler, int i13) {
        try {
            jobScheduler.cancel(i13);
        } catch (Throwable th3) {
            C18389w.m52886d().m52890c(f94218F, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i13)), th3);
        }
    }

    /* JADX INFO: renamed from: d */
    public static ArrayList m69919d(Context context, JobScheduler jobScheduler) {
        List<JobInfo> listM69915a = AbstractC23815a.m69915a(jobScheduler);
        if (listM69915a == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listM69915a.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : listM69915a) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static C30200j m69920f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new C30200j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // p249jc.InterfaceC21581i
    /* JADX INFO: renamed from: a */
    public final void mo60623a(String workSpecId) {
        ArrayList arrayList;
        Context context = this.f94220w;
        JobScheduler jobScheduler = this.f94221x;
        ArrayList<JobInfo> arrayListM69919d = m69919d(context, jobScheduler);
        if (arrayListM69919d == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            for (JobInfo jobInfo : arrayListM69919d) {
                C30200j c30200jM69920f = m69920f(jobInfo);
                if (c30200jM69920f != null && workSpecId.equals(c30200jM69920f.f123603a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m69918b(jobScheduler, ((Integer) it.next()).intValue());
        }
        C30199i c30199iMo5518e = this.f94223z.mo5518e();
        c30199iMo5518e.getClass();
        AbstractC22676k.m65750j(workSpecId, "workSpecId");
        AbstractC15751g.m44432L(c30199iMo5518e.f123601a, false, true, new C12764g(workSpecId, 7));
    }

    @Override // p249jc.InterfaceC21581i
    /* JADX INFO: renamed from: c */
    public final boolean mo60624c() {
        return true;
    }

    @Override // p249jc.InterfaceC21581i
    /* JADX INFO: renamed from: e */
    public final void mo60625e(C30207q... c30207qArr) {
        int iIntValue;
        C18348b c18348b = this.f94219E;
        WorkDatabase workDatabase = this.f94223z;
        AbstractC22676k.m65750j(workDatabase, "workDatabase");
        C0929d c0929d = new C0929d();
        c0929d.f3422w = workDatabase;
        for (C30207q c30207q : c30207qArr) {
            workDatabase.beginTransaction();
            try {
                C30211u c30211uMo5521h = workDatabase.mo5521h();
                String str = c30207q.f123634a;
                C30207q c30207qM92434e = c30211uMo5521h.m92434e(str);
                String str2 = f94218F;
                if (c30207qM92434e == null) {
                    C18389w.m52886d().m52892g(str2, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.setTransactionSuccessful();
                } else if (c30207qM92434e.f123635b != EnumC18371m0.f71515w) {
                    C18389w.m52886d().m52892g(str2, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.setTransactionSuccessful();
                } else {
                    C30200j c30200jM48869P = AbstractC17269i.m48869P(c30207q);
                    C30198h c30198hM92421a = workDatabase.mo5518e().m92421a(c30200jM48869P);
                    if (c30198hM92421a != null) {
                        iIntValue = c30198hM92421a.f123600c;
                    } else {
                        c18348b.getClass();
                        Object objRunInTransaction = ((WorkDatabase) c0929d.f3422w).runInTransaction(new CallableC30379e(c0929d, c18348b.f71454i, 1));
                        AbstractC22676k.m65749i(objRunInTransaction, "runInTransaction(...)");
                        iIntValue = ((Number) objRunInTransaction).intValue();
                    }
                    if (c30198hM92421a == null) {
                        C30198h c30198h = new C30198h(c30200jM48869P.f123603a, c30200jM48869P.f123604b, iIntValue);
                        C30199i c30199iMo5518e = workDatabase.mo5518e();
                        c30199iMo5518e.getClass();
                        AbstractC15751g.m44432L(c30199iMo5518e.f123601a, false, true, new C28761b0(3, c30199iMo5518e, c30198h));
                    }
                    m69921g(c30207q, iIntValue);
                    workDatabase.setTransactionSuccessful();
                }
                workDatabase.endTransaction();
            } catch (Throwable th3) {
                workDatabase.endTransaction();
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m69921g(C30207q c30207q, int i13) {
        JobInfo jobInfoM69917a = this.f94222y.m69917a(c30207q, i13);
        C18389w c18389wM52886d = C18389w.m52886d();
        StringBuilder sb4 = new StringBuilder("Scheduling work ID ");
        String str = c30207q.f123634a;
        sb4.append(str);
        sb4.append("Job ID ");
        sb4.append(i13);
        String string = sb4.toString();
        String str2 = f94218F;
        c18389wM52886d.m52888a(str2, string);
        try {
            if (this.f94221x.schedule(jobInfoM69917a) == 0) {
                C18389w.m52886d().m52892g(str2, "Unable to schedule work ID " + str);
                if (c30207q.f123650q && c30207q.f123651r == EnumC18363i0.f71494w) {
                    c30207q.f123650q = false;
                    C18389w.m52886d().m52888a(str2, "Scheduling a non-expedited job (work ID " + str + ")");
                    m69921g(c30207q, i13);
                }
            }
        } catch (IllegalStateException e5) {
            String str3 = AbstractC23815a.f94213a;
            Context context = this.f94220w;
            AbstractC22676k.m65750j(context, "context");
            WorkDatabase workDatabase = this.f94223z;
            AbstractC22676k.m65750j(workDatabase, "workDatabase");
            C18348b configuration = this.f94219E;
            AbstractC22676k.m65750j(configuration, "configuration");
            int i14 = Build.VERSION.SDK_INT;
            int i15 = i14 >= 31 ? 150 : 100;
            int size = ((List) AbstractC15751g.m44432L(workDatabase.mo5521h().f123665a, true, false, new C30034f(12))).size();
            String strM74110N0 = "<faulty JobScheduler failed to getPendingJobs>";
            if (i14 >= 34) {
                JobScheduler jobSchedulerM69916b = AbstractC23815a.m69916b(context);
                List listM69915a = AbstractC23815a.m69915a(jobSchedulerM69916b);
                if (listM69915a != null) {
                    ArrayList arrayListM69919d = m69919d(context, jobSchedulerM69916b);
                    int size2 = arrayListM69919d != null ? listM69915a.size() - arrayListM69919d.size() : 0;
                    String strM95635k = size2 == 0 ? null : AbstractC31061c.m95635k(size2, " of which are not owned by WorkManager");
                    Object systemService = context.getSystemService("jobscheduler");
                    AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
                    ArrayList arrayListM69919d2 = m69919d(context, (JobScheduler) systemService);
                    int size3 = arrayListM69919d2 != null ? arrayListM69919d2.size() : 0;
                    strM74110N0 = AbstractC25265s.m74110N0(AbstractC25260n.m74077r0(new String[]{listM69915a.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", strM95635k, size3 != 0 ? AbstractC31061c.m95635k(size3, " from WorkManager in the default namespace") : null}), ",\n", null, null, null, 62);
                }
            } else {
                ArrayList arrayListM69919d3 = m69919d(context, AbstractC23815a.m69916b(context));
                if (arrayListM69919d3 != null) {
                    strM74110N0 = arrayListM69919d3.size() + " jobs from WorkManager";
                }
            }
            StringBuilder sbM53373n = AbstractC18489d0.m53373n(i15, "JobScheduler ", " job limit exceeded.\nIn JobScheduler there are ", strM74110N0, ".\nThere are ");
            sbM53373n.append(size);
            sbM53373n.append(" jobs tracked by WorkManager's database;\nthe Configuration limit is ");
            String strM31999r = AbstractC11895b.m31999r(sbM53373n, configuration.f71456k, '.');
            C18389w.m52886d().m52889b(str2, strM31999r);
            throw new IllegalStateException(strM31999r, e5);
        } catch (Throwable th3) {
            C18389w.m52886d().m52890c(str2, "Unable to schedule " + c30207q, th3);
        }
    }
}
