package com.whoop.service.sync;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import c12.C3853d;
import c12.EnumC3851b;
import c12.InterfaceC3852c;
import ca2.C4373m;
import e50.C12723b;
import ge3.AbstractC15751g;
import hi0.AbstractC17312j;
import hj0.C17358q;
import java.util.HashSet;
import java.util.Iterator;
import or2.AbstractC28155d1;
import p000.AbstractC11266d;
import p479s4.AbstractC32122c;
import qr2.AbstractC30556a;
import tr2.C34117o;
import tr2.InterfaceC34116n;
import u92.C34658b;
import x82.AbstractServiceConnectionC38078e;

/* JADX INFO: loaded from: classes4.dex */
public class WhoopSyncService extends Service {

    /* JADX INFO: renamed from: J */
    private static final C3853d f30031J = new C3853d(EnumC3851b.LOW, "05000_DataSyncing", AbstractC17312j.f67008o).m11812k(false);

    /* JADX INFO: renamed from: E */
    private boolean f30032E;

    /* JADX INFO: renamed from: F */
    private boolean f30033F;

    /* JADX INFO: renamed from: H */
    private Notification f30035H;

    /* JADX INFO: renamed from: I */
    private InterfaceC34116n f30036I;

    /* JADX INFO: renamed from: y */
    private boolean f30039y;

    /* JADX INFO: renamed from: z */
    private boolean f30040z;

    /* JADX INFO: renamed from: w */
    final C4373m f30037w = (C4373m) AbstractC15751g.m44472y(C4373m.class, null, null);

    /* JADX INFO: renamed from: x */
    private final AbstractServiceConnectionC38078e.a<WhoopSyncService> f30038x = new AbstractServiceConnectionC38078e.a<>(this);

    /* JADX INFO: renamed from: G */
    private HashSet<Object> f30034G = new HashSet<>();

    /* JADX INFO: renamed from: com.whoop.service.sync.WhoopSyncService$a */
    public static class C10017a extends C17358q {
        public /* synthetic */ C10017a(Context context, int i13) {
            this(context);
        }

        /* JADX INFO: renamed from: q */
        public C10017a m24788q(String str) {
            m49150i().setAction(str);
            return this;
        }

        /* JADX INFO: renamed from: r */
        public void m24789r() {
            m49149h().startForegroundService(mo23852f());
        }

        /* JADX INFO: renamed from: s */
        public void m24790s() {
            m49149h().startService(mo23852f());
        }

        private C10017a(Context context) {
            super(context, (Class<?>) WhoopSyncService.class);
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.sync.WhoopSyncService$b */
    public static class C10018b extends AbstractServiceConnectionC38078e<WhoopSyncService> {

        /* JADX INFO: renamed from: y */
        private Context f30041y;

        public C10018b(Context context) {
            this.f30041y = context;
        }

        /* JADX INFO: renamed from: c */
        public boolean m24791c(String str) {
            WhoopSyncService whoopSyncServiceM121985a = m121985a();
            if (whoopSyncServiceM121985a != null && (!"background".equals(str) || whoopSyncServiceM121985a.f30039y)) {
                whoopSyncServiceM121985a.m24787g(str);
                return true;
            }
            try {
                C10017a c10017aM24788q = new C10017a(this.f30041y, 0).m24788q(str);
                if (str.equals("btForeground")) {
                    c10017aM24788q.m24789r();
                    return true;
                }
                c10017aM24788q.m24790s();
                return true;
            } catch (IllegalStateException e5) {
                if (e5.getMessage().contains("Not allowed to start service")) {
                    C12723b.m35566a().m35569d().mo85214e("WhoopSyncService", AbstractC11266d.m30461o("Can't start service from background for action: ", str), new AbstractC30556a.a[0]);
                } else {
                    C12723b.m35566a().m35569d().mo85215f("WhoopSyncService", AbstractC11266d.m30461o("Failed to perform action: ", str), e5, new AbstractC30556a.a[0]);
                }
                return false;
            } catch (Exception e13) {
                C12723b.m35566a().m35569d().mo85215f("WhoopSyncService", AbstractC11266d.m30461o("Failed to perform action: ", str), e13, new AbstractC30556a.a[0]);
                return false;
            }
        }

        /* JADX INFO: renamed from: d */
        public boolean m24792d() {
            return m24791c("background");
        }

        /* JADX INFO: renamed from: e */
        public boolean m24793e() {
            return m24791c("btForeground");
        }

        /* JADX INFO: renamed from: f */
        public boolean m24794f() {
            return m24791c("stopBackground");
        }

        /* JADX INFO: renamed from: g */
        public boolean m24795g() {
            return m24791c("btStopForeground");
        }
    }

    /* JADX INFO: renamed from: b */
    public static C10018b m24782b(Context context) {
        Intent intent = new Intent(context, (Class<?>) WhoopSyncService.class);
        C10018b c10018b = new C10018b(context);
        if (context.bindService(intent, c10018b, 1)) {
            return c10018b;
        }
        C34117o c34117o = new C34117o(C12723b.m35566a().m35569d(), "WhoopSyncService");
        c34117o.mo85222m("Binding to service failed", new AbstractC30556a.a[0]);
        if (c10018b.m121985a() != null) {
            c34117o.mo85226q("Binding to service failed, but connection seems fine", new AbstractC30556a.a[0]);
            return c10018b;
        }
        c10018b.m121986b(context);
        C10018b c10018b2 = new C10018b(context.getApplicationContext());
        if (context.bindService(intent, c10018b2, 1)) {
            c34117o.mo85226q("Binding to service failed, but retry succeeded", new AbstractC30556a.a[0]);
            return c10018b2;
        }
        c34117o.mo85222m("Service rebind failed, failing everything", new AbstractC30556a.a[0]);
        c10018b2.m121986b(context);
        return null;
    }

    /* JADX INFO: renamed from: c */
    private void m24783c() {
        m24786e().mo85216g("Starting as foreground", new AbstractC30556a.a[0]);
        this.f30035H.when = System.currentTimeMillis();
        if (Build.VERSION.SDK_INT >= 29) {
            startForeground(70, this.f30035H, 16);
        } else {
            startForeground(70, this.f30035H);
        }
        this.f30033F = true;
    }

    /* JADX INFO: renamed from: d */
    private void m24784d(boolean z4) {
        if (this.f30033F && !this.f30040z && !this.f30032E) {
            Iterator<Object> it = this.f30034G.iterator();
            if (it.hasNext()) {
                throw AbstractC11266d.m30454h(it);
            }
        }
        if (this.f30040z || this.f30032E) {
            m24786e().mo85216g("Not stopping foreground", new AbstractC30556a.a[0]);
            return;
        }
        m24786e().mo85216g("Stopping foreground", new AbstractC30556a.a[0]);
        stopForeground(true);
        this.f30033F = false;
    }

    /* JADX INFO: renamed from: f */
    public static void m24785f(Context context, NotificationManager notificationManager) {
        f30031J.m11806e(notificationManager, context);
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC34116n m24786e() {
        return this.f30036I;
    }

    /* JADX INFO: renamed from: g */
    public int m24787g(String str) {
        m24786e().mo85219j(AbstractC11266d.m30461o("performing action ", str), new AbstractC30556a.a[0]);
        str.getClass();
        switch (str) {
            case "background":
                this.f30039y = true;
                return 1;
            case "btStopForeground":
                this.f30040z = false;
                m24784d(true);
                return 2;
            case "uploadStopForeground":
                this.f30032E = false;
                m24784d(false);
                return 2;
            case "uploadForeground":
                this.f30032E = true;
                m24783c();
                return 1;
            case "stopBackground":
                if (this.f30040z) {
                    m24786e().mo85222m("Tried to stop background, but service is foregrounded... ", new AbstractC30556a.a[0]);
                } else {
                    m24786e().mo85216g("Stopping background", new AbstractC30556a.a[0]);
                    this.f30039y = false;
                    stopSelf();
                }
                return 2;
            case "btForeground":
                this.f30040z = true;
                m24783c();
                return 1;
            default:
                m24786e().mo85222m("performAction(): Unrecognized action: ".concat(str), new AbstractC30556a.a[0]);
                return 2;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        m24786e().mo85216g("onBind()", new AbstractC30556a.a[0]);
        return this.f30038x;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f30036I = new C34117o(C12723b.m35566a().m35569d(), "WhoopSyncService");
        NotificationCompat.Builder contentIntent = ((InterfaceC3852c) AbstractC15751g.m44472y(InterfaceC3852c.class, null, null)).mo11800a(this).setContentTitle(AbstractC32122c.getString(this, AbstractC17312j.f67031w)).setContentText(AbstractC32122c.getString(this, AbstractC17312j.f67029v)).setOnlyAlertOnce(true).setContentIntent(PendingIntent.getActivity(this, 70, AbstractC28155d1.m85196a(this), 67108864));
        f30031J.m11805a(contentIntent);
        this.f30035H = contentIntent.build();
    }

    @Override // android.app.Service
    public void onDestroy() {
        m24786e().mo85216g("onDestroy()", new AbstractC30556a.a[0]);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i13, int i14) {
        InterfaceC34116n interfaceC34116nM24786e = m24786e();
        AbstractC30556a.a aVar = AbstractC30556a.a.IO;
        interfaceC34116nM24786e.mo85216g("onStartCommand(): Starting up", aVar);
        if (intent == null) {
            m24786e().mo85216g("onStartCommand(): Service restarted by system, assuming background", aVar);
            intent = new Intent("background");
        }
        String action = intent.getAction();
        if (action != null) {
            return m24787g(action);
        }
        m24786e().mo85222m("No action specified", new AbstractC30556a.a[0]);
        return 2;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        m24786e().mo85216g("onTaskRemoved()", new AbstractC30556a.a[0]);
        super.onTaskRemoved(intent);
        this.f30037w.m13763a();
        C34658b c34658b = (C34658b) AbstractC15751g.m44472y(C34658b.class, null, null);
        c34658b.m109512A(true);
        c34658b.m109513y();
        c34658b.m109514z(System.currentTimeMillis());
    }
}
