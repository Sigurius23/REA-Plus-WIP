package x82;

import android.app.job.JobScheduler;
import android.content.Context;
import android.os.PowerManager;
import e50.C12723b;
import tr2.C34117o;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: x82.c */
/* JADX INFO: loaded from: classes4.dex */
public class C38076c {

    /* JADX INFO: renamed from: a */
    private Context f163074a;

    /* JADX INFO: renamed from: b */
    private PowerManager f163075b;

    /* JADX INFO: renamed from: c */
    private JobScheduler f163076c;

    /* JADX INFO: renamed from: d */
    private InterfaceC34116n f163077d;

    public C38076c(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f163074a = applicationContext;
        this.f163075b = (PowerManager) applicationContext.getSystemService("power");
        this.f163077d = new C34117o(C12723b.m35566a().m35569d(), "PowerMonitor");
        this.f163076c = (JobScheduler) applicationContext.getSystemService("jobscheduler");
    }

    /* JADX INFO: renamed from: a */
    public JobScheduler m121981a() {
        return this.f163076c;
    }

    /* JADX INFO: renamed from: b */
    public boolean m121982b() {
        return this.f163075b.isPowerSaveMode();
    }
}
