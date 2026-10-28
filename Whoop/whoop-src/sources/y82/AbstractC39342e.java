package y82;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.whoop.data.repositories.ConnectivityFeatureFlagsKt;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.domain.exception.ConnectivityException;
import com.whoop.service.WhoopActionJobService;
import ge3.AbstractC15751g;
import java.util.HashMap;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p031b9.AbstractC2875y;
import qr2.AbstractC30556a;
import rr2.InterfaceC31766c;
import tr2.InterfaceC34116n;
import x82.C38076c;

/* JADX INFO: renamed from: y82.e */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC39342e {

    /* JADX INFO: renamed from: a */
    private static final FeatureFlagChecker f169314a;

    /* JADX INFO: renamed from: b */
    private static final InterfaceC34116n f169315b;

    /* JADX INFO: renamed from: c */
    private static final Handler f169316c;

    /* JADX INFO: renamed from: d */
    private static final HashMap<Integer, a> f169317d;

    /* JADX INFO: renamed from: e */
    private static final HandlerThread f169318e;

    /* JADX INFO: renamed from: f */
    private static final DateTimeFormatter f169319f;

    /* JADX INFO: renamed from: y82.e$a */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: w */
        private final EnumC39339b f169320w;

        /* JADX INFO: renamed from: x */
        private final Context f169321x;

        /* JADX INFO: renamed from: y */
        private final int f169322y;

        public a(EnumC39339b enumC39339b, Context context, int i13) {
            this.f169320w = enumC39339b;
            this.f169321x = context.getApplicationContext();
            this.f169322y = i13;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AbstractC39342e.f169315b.mo85231w()) {
                AbstractC39342e.f169315b.mo85212b("WhoopActionScheduler:PreemptRunnable", "Preempting job: " + this.f169322y, new AbstractC30556a.a[0]);
            }
            AbstractC39342e.f169317d.remove(Integer.valueOf(this.f169322y));
            AbstractC39342e.m125453c(this.f169321x, this.f169322y);
            EnumC39339b.t tVarPerform = this.f169320w.perform(this.f169321x);
            if (AbstractC39342e.f169315b.mo85231w()) {
                AbstractC39342e.f169315b.mo85212b("WhoopActionScheduler:PreemptRunnable", "Performed: " + this.f169320w.getActionString() + " Result: " + tVarPerform, new AbstractC30556a.a[0]);
            }
        }
    }

    static {
        FeatureFlagChecker featureFlagChecker = (FeatureFlagChecker) AbstractC15751g.m44472y(FeatureFlagChecker.class, null, null);
        f169314a = featureFlagChecker;
        f169315b = InterfaceC34116n.m107847r("WhoopActionScheduler", featureFlagChecker.isFeatureEnabled(ConnectivityFeatureFlagsKt.VERBOSE_SYNCING_LOGGING));
        f169317d = new HashMap<>();
        HandlerThread handlerThread = new HandlerThread("Action Scheduler Preempt");
        f169318e = handlerThread;
        handlerThread.start();
        f169316c = new Handler(handlerThread.getLooper());
        f169319f = DateTimeFormat.forPattern("H:mm:ss");
    }

    /* JADX INFO: renamed from: c */
    public static void m125453c(Context context, int i13) {
        C38076c c38076c = (C38076c) AbstractC15751g.m44472y(C38076c.class, null, null);
        InterfaceC34116n interfaceC34116n = f169315b;
        if (interfaceC34116n.mo85231w()) {
            interfaceC34116n.mo85219j(AbstractC2875y.m8295h(i13, "Canceling scheduled jobs: "), new AbstractC30556a.a[0]);
        }
        m125454d(i13);
        c38076c.m121981a().cancel(i13);
    }

    /* JADX INFO: renamed from: d */
    private static void m125454d(int i13) {
        a aVar = f169317d.get(Integer.valueOf(i13));
        if (aVar != null) {
            f169316c.removeCallbacks(aVar);
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m125455e(int i13) {
        return ((C38076c) AbstractC15751g.m44472y(C38076c.class, null, null)).m121981a().getPendingJob(i13) != null;
    }

    /* JADX INFO: renamed from: f */
    public static void m125456f(EnumC39339b enumC39339b, Context context, int i13) {
        C38076c c38076c = (C38076c) AbstractC15751g.m44472y(C38076c.class, null, null);
        InterfaceC34116n interfaceC34116n = f169315b;
        if (interfaceC34116n.mo85231w()) {
            interfaceC34116n.mo85219j("Scheduling job for action: " + enumC39339b, new AbstractC30556a.a[0]);
        }
        c38076c.m121981a().schedule(WhoopActionJobService.m24483a(enumC39339b, context, i13));
    }

    /* JADX INFO: renamed from: g */
    public static synchronized void m125457g(EnumC39339b enumC39339b, Context context, int i13, long j7, long j13, InterfaceC31766c interfaceC31766c) {
        long j14;
        try {
            C38076c c38076c = (C38076c) AbstractC15751g.m44472y(C38076c.class, null, null);
            long jCurrentTimeMillis = System.currentTimeMillis();
            DateTimeFormatter dateTimeFormatter = f169319f;
            String strPrint = dateTimeFormatter.print(jCurrentTimeMillis + j7);
            String str = strPrint + " - " + dateTimeFormatter.print(jCurrentTimeMillis + j13);
            if (j13 - j7 > 2000) {
                InterfaceC34116n interfaceC34116n = f169315b;
                if (interfaceC34116n.mo85231w()) {
                    interfaceC34116n.mo85219j(String.format("Posting preempt runnable to go off at %s to run action: %s", strPrint, enumC39339b), new AbstractC30556a.a[0]);
                }
                m125454d(i13);
                m125458h(enumC39339b, context, i13, j7);
                j14 = j7 + 2000;
            } else {
                j14 = j7;
            }
            InterfaceC34116n interfaceC34116n2 = f169315b;
            if (interfaceC34116n2.mo85231w()) {
                interfaceC34116n2.mo85219j(String.format("Scheduling job (%d) with window (%s), action: %s", Integer.valueOf(i13), str, enumC39339b), new AbstractC30556a.a[0]);
            }
            try {
                c38076c.m121981a().schedule(WhoopActionJobService.m24485c(enumC39339b, context, i13).setMinimumLatency(j14).setOverrideDeadline(j13).build());
            } catch (IllegalStateException e5) {
                interfaceC31766c.mo98626g(new ConnectivityException("Caught an exception when trying to schedule a job in WhoopActionScheduler", e5), null);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: h */
    private static void m125458h(EnumC39339b enumC39339b, Context context, int i13, long j7) {
        a aVar = new a(enumC39339b, context, i13);
        f169317d.put(Integer.valueOf(i13), aVar);
        f169316c.postDelayed(aVar, j7);
    }

    /* JADX INFO: renamed from: i */
    public static synchronized void m125459i(EnumC39339b enumC39339b, Context context, int i13, long j7, long j13, InterfaceC31766c interfaceC31766c) {
        C38076c c38076c = (C38076c) AbstractC15751g.m44472y(C38076c.class, null, null);
        long jCurrentTimeMillis = System.currentTimeMillis();
        DateTimeFormatter dateTimeFormatter = f169319f;
        String str = dateTimeFormatter.print(jCurrentTimeMillis + j7) + " - " + dateTimeFormatter.print(jCurrentTimeMillis + j13);
        InterfaceC34116n interfaceC34116n = f169315b;
        if (interfaceC34116n.mo85231w()) {
            interfaceC34116n.mo85219j(String.format("Scheduling job (%d) without pre-empt runnable with window (%s), action: %s", Integer.valueOf(i13), str, enumC39339b), new AbstractC30556a.a[0]);
        }
        try {
            c38076c.m121981a().schedule(WhoopActionJobService.m24485c(enumC39339b, context, i13).setMinimumLatency(j7).setOverrideDeadline(j13).build());
        } catch (IllegalStateException e5) {
            interfaceC31766c.mo98626g(new ConnectivityException("Caught an exception when trying to schedule a job in WhoopActionScheduler", e5), null);
        }
    }
}
