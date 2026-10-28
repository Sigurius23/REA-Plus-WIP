package p692zt;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p020ap.ThreadFactoryC1879b;
import p073cq.C11040i;
import p073cq.C11052u;
import p185h6.RunnableC16957l;
import p320m5.ExecutorC25061e;
import qm2.C30486c;
import zd3.C40576t;

/* JADX INFO: renamed from: zt.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceC41104h extends Service {

    /* JADX INFO: renamed from: E */
    private int f177195E;

    /* JADX INFO: renamed from: w */
    final ExecutorService f177196w;

    /* JADX INFO: renamed from: x */
    private Binder f177197x;

    /* JADX INFO: renamed from: y */
    private final Object f177198y;

    /* JADX INFO: renamed from: z */
    private int f177199z;

    public AbstractServiceC41104h() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC1879b("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f177196w = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f177198y = new Object();
        this.f177195E = 0;
    }

    /* JADX INFO: renamed from: a */
    public static Task m133438a(AbstractServiceC41104h abstractServiceC41104h, Intent intent) {
        if (abstractServiceC41104h.m133440e(intent)) {
            return Tasks.m15640d(null);
        }
        C11040i c11040i = new C11040i();
        abstractServiceC41104h.f177196w.execute(new RunnableC16957l(abstractServiceC41104h, intent, c11040i, 7));
        return c11040i.f34644a;
    }

    /* JADX INFO: renamed from: b */
    public final void m133439b(Intent intent) {
        if (intent != null) {
            AbstractC41122z.m133495b(intent);
        }
        synchronized (this.f177198y) {
            try {
                int i13 = this.f177195E - 1;
                this.f177195E = i13;
                if (i13 == 0) {
                    m133441f(this.f177199z);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract Intent mo16394c(Intent intent);

    /* JADX INFO: renamed from: d */
    public abstract void mo16395d(Intent intent);

    /* JADX INFO: renamed from: e */
    public boolean m133440e(Intent intent) {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m133441f(int i13) {
        return stopSelfResult(i13);
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.f177197x == null) {
                this.f177197x = new BinderC41095a0(new C40576t(this));
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.f177197x;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f177196w.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i13, int i14) {
        C11052u c11052uM15640d;
        synchronized (this.f177198y) {
            this.f177199z = i14;
            this.f177195E++;
        }
        Intent intentMo16394c = mo16394c(intent);
        if (intentMo16394c == null) {
            m133439b(intent);
            return 2;
        }
        if (m133440e(intentMo16394c)) {
            c11052uM15640d = Tasks.m15640d(null);
        } else {
            C11040i c11040i = new C11040i();
            this.f177196w.execute(new RunnableC16957l(this, intentMo16394c, c11040i, 7));
            c11052uM15640d = c11040i.f34644a;
        }
        if (c11052uM15640d.isComplete()) {
            m133439b(intent);
            return 2;
        }
        c11052uM15640d.addOnCompleteListener(new ExecutorC25061e(0), new C30486c(11, this, intent));
        return 3;
    }
}
