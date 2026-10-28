package com.whoop.realtime.service;

import android.annotation.SuppressLint;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.RunnableC1645z0;
import bh3.InterfaceC3255b;
import com.whoop.data.local.room.entity.GpsDto;
import com.whoop.data.onboarding.C6529c;
import com.whoop.data.repositories.FeatureFlagRepository;
import com.whoop.data.repositories.RestingHeartRate;
import com.whoop.domain.model.StrainRecoveryMapping;
import com.whoop.domain.model.User;
import com.whoop.p069ui.C10594l;
import com.whoop.realtime.service.RealTimeActivityService;
import e50.C12723b;
import e92.C12887a;
import ge3.AbstractC15751g;
import i92.AbstractC18263h;
import i92.InterfaceC18260e;
import iy1.InterfaceC21030c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import l73.AbstractC23412c;
import lh3.C24079b;
import live.hms.video.error.ErrorCodes;
import lm2.C24515a;
import lm2.C24517c;
import lm2.C24518d;
import lm2.InterfaceC24516b;
import o52.C27566m0;
import o52.C27588y;
import od1.C27843f;
import od1.C27848k;
import od1.C27858u;
import org.joda.time.DateTime;
import p037bu.C3633d;
import p088dc.AbstractC11895b;
import p380os.C28301a;
import p92.C29014c;
import p92.C29016e;
import p92.C29017f;
import p92.C29019h;
import qr2.AbstractC30556a;
import r73.AbstractC31056a;
import s52.C32225f;
import t73.C33589b;
import tr2.InterfaceC34116n;
import xg3.C38280g;
import z92.InterfaceC40205a;

/* JADX INFO: renamed from: com.whoop.realtime.service.b */
/* JADX INFO: loaded from: classes4.dex */
public class C9907b {

    /* JADX INFO: renamed from: a */
    private C24079b f29227a;

    /* JADX INFO: renamed from: j */
    private final Context f29236j;

    /* JADX INFO: renamed from: k */
    private final C29017f f29237k;

    /* JADX INFO: renamed from: l */
    private final C24515a f29238l;

    /* JADX INFO: renamed from: m */
    private RealTimeActivityService f29239m;

    /* JADX INFO: renamed from: n */
    private c f29240n;

    /* JADX INFO: renamed from: o */
    private boolean f29241o;

    /* JADX INFO: renamed from: r */
    private final ServiceConnection f29244r;

    /* JADX INFO: renamed from: b */
    private final FeatureFlagRepository f29228b = (FeatureFlagRepository) AbstractC15751g.m44472y(FeatureFlagRepository.class, null, null);

    /* JADX INFO: renamed from: c */
    private final C29014c f29229c = (C29014c) AbstractC15751g.m44472y(C29014c.class, null, null);

    /* JADX INFO: renamed from: d */
    private List<C29019h.a> f29230d = new ArrayList();

    /* JADX INFO: renamed from: e */
    private final C10594l f29231e = new C10594l();

    /* JADX INFO: renamed from: f */
    private final InterfaceC34116n f29232f = InterfaceC34116n.m107846d("RealTimeActivityController");

    /* JADX INFO: renamed from: g */
    private final InterfaceC21030c f29233g = (InterfaceC21030c) AbstractC15751g.m44472y(InterfaceC21030c.class, null, null);

    /* JADX INFO: renamed from: h */
    private final InterfaceC40205a f29234h = (InterfaceC40205a) AbstractC15751g.m44472y(InterfaceC40205a.class, null, null);

    /* JADX INFO: renamed from: i */
    private final int f29235i = ErrorCodes.InitAPIErrors.cServerErrors;

    /* JADX INFO: renamed from: p */
    private final Queue<InterfaceC3255b> f29242p = new LinkedList();

    /* JADX INFO: renamed from: q */
    private BroadcastReceiver f29243q = new a();

    /* JADX INFO: renamed from: com.whoop.realtime.service.b$a */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (C9907b.this.f29240n != null) {
                AbstractC9908c.a aVarM24287h = AbstractC9908c.m24287h(context, intent);
                ((C27588y) C9907b.this.f29240n).m83342a(aVarM24287h.m24293t(), aVarM24287h.m24292s());
            }
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.service.b$b */
    public class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C9907b.this.f29232f.mo85228t("RealTimeActivityController RealTimeActivityController onServiceConnected", new AbstractC30556a.a[0]);
            C9907b.this.m24243H(((RealTimeActivityService.BinderC9905a) iBinder).m24234a());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C9907b.this.m24244I();
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.service.b$c */
    /* JADX INFO: loaded from: classes10.dex */
    public interface c {
    }

    @SuppressLint({"UnspecifiedRegisterReceiverFlag"})
    public C9907b(Context context) {
        b bVar = new b();
        this.f29244r = bVar;
        this.f29236j = context;
        this.f29237k = new C29017f(context);
        this.f29238l = new C24515a();
        Intent intent = new Intent(context, (Class<?>) RealTimeActivityService.class);
        if (C12887a.f44370a.m36234a()) {
            context.bindService(intent, bVar, 1);
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this.f29243q, AbstractC9908c.m24281b(context), 4);
            } else {
                context.registerReceiver(this.f29243q, AbstractC9908c.m24281b(context));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ Boolean m24236A(C27858u.a aVar) {
        return Boolean.valueOf(!aVar.m84068c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m24238C(C29017f c29017f, Context context, AbstractC18263h abstractC18263h) throws Exception {
        if (!abstractC18263h.m52614a() || c29017f.m88180d() <= 0) {
            return;
        }
        C12723b.m35566a().m35569d().mo85220k("RealTimeActivityController", "Detected network availability, syncing persisted real time activities", new AbstractC30556a.a[0]);
        m24261r(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public /* synthetic */ void m24239D(InterfaceC3255b interfaceC3255b, C29016e c29016e, RealTimeActivityService realTimeActivityService) {
        User userMo129090d = this.f29234h.mo129090d();
        if (userMo129090d == null) {
            m24242G(interfaceC3255b, this.f29232f);
        } else {
            if (userMo129090d.getProfile() == null) {
                m24242G(interfaceC3255b, this.f29232f);
                return;
            }
            this.f29232f.mo85220k("RealTimeActivityController", "Starting activity recording from restoration", new AbstractC30556a.a[0]);
            realTimeActivityService.m24232o(c29016e);
            interfaceC3255b.mo9472b(c29016e);
        }
    }

    /* JADX INFO: renamed from: F */
    private void m24241F(EnumC9906a enumC9906a) {
        EnumC9906a.INSTANCE.m24235a(enumC9906a, this.f29233g);
    }

    /* JADX INFO: renamed from: G */
    private void m24242G(InterfaceC3255b interfaceC3255b, InterfaceC34116n interfaceC34116n) {
        interfaceC34116n.mo85214e("RealTimeActivityController", "Restoration of recording failed. Cannot start recording without user profile info", new AbstractC30556a.a[0]);
        interfaceC3255b.mo9472b(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public void m24243H(RealTimeActivityService realTimeActivityService) {
        synchronized (this) {
            try {
                if (this.f29241o) {
                    m24277q();
                    return;
                }
                this.f29239m = realTimeActivityService;
                C24079b c24079b = this.f29227a;
                if (c24079b != null) {
                    realTimeActivityService.m24229d(c24079b);
                } else {
                    this.f29232f.mo85222m("RealTimeActivityControllerStrainCoach - strainControllerSubject is null onServiceConnected", new AbstractC30556a.a[0]);
                }
                while (true) {
                    InterfaceC3255b interfaceC3255bPoll = this.f29242p.poll();
                    if (interfaceC3255bPoll == null) {
                        return;
                    } else {
                        interfaceC3255bPoll.mo9472b(realTimeActivityService);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public void m24244I() {
        synchronized (this) {
            this.f29239m = null;
        }
    }

    /* JADX INFO: renamed from: K */
    private void m24245K(final InterfaceC3255b interfaceC3255b) {
        final C29016e c29016eM24278s = m24278s();
        if (c29016eM24278s != null) {
            this.f29232f.mo85220k("RealTimeActivityController", "Restoring existing recording", new AbstractC30556a.a[0]);
            m24246L(new InterfaceC3255b() { // from class: s52.b
                @Override // bh3.InterfaceC3255b
                /* JADX INFO: renamed from: b */
                public final void mo9472b(Object obj) {
                    this.f133414w.m24239D(interfaceC3255b, c29016eM24278s, (RealTimeActivityService) obj);
                }
            });
        } else {
            m24241F(EnumC9906a.NO_ACTIVITY_INFO);
            interfaceC3255b.mo9472b(null);
        }
    }

    /* JADX INFO: renamed from: L */
    private void m24246L(InterfaceC3255b interfaceC3255b) {
        synchronized (this) {
            try {
                RealTimeActivityService realTimeActivityService = this.f29239m;
                if (realTimeActivityService != null) {
                    interfaceC3255b.mo9472b(realTimeActivityService);
                } else {
                    this.f29242p.add(interfaceC3255b);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    private static void m24258l(Context context) {
        if (new C29017f(context).m88180d() > 0) {
            m24261r(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static void m24259m(Context context) {
        new C9907b(context).m24276p();
    }

    /* JADX INFO: renamed from: o */
    private void m24260o(final Runnable runnable) {
        C29016e c29016eM24278s = m24278s();
        final Long lValueOf = c29016eM24278s != null ? Long.valueOf(c29016eM24278s.m88170c()) : null;
        if (lValueOf != null) {
            this.f29229c.m88164d(lValueOf.longValue(), System.currentTimeMillis());
        }
        this.f29237k.m88186k(null);
        m24246L(new InterfaceC3255b() { // from class: s52.a
            @Override // bh3.InterfaceC3255b
            /* JADX INFO: renamed from: b */
            public final void mo9472b(Object obj) {
                this.f133411w.m24266y(lValueOf, runnable, (RealTimeActivityService) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    private static void m24261r(Context context) {
        C32225f.m100247e(context);
    }

    /* JADX INFO: renamed from: t */
    private List<List<C29019h.a>> m24262t(List<C29019h.a> list, int i13) {
        ArrayList arrayList = new ArrayList();
        Iterator<C29019h.a> it = list.iterator();
        while (it.hasNext()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i14 = 0; it.hasNext() && i14 < i13; i14++) {
                arrayList2.add(it.next());
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: v */
    public static void m24263v(Context context) {
        if (m24265x(context)) {
            C9907b c9907b = new C9907b(context);
            c9907b.m24245K(new C6529c(c9907b, 19));
        } else {
            m24259m(context);
        }
        Context applicationContext = context.getApplicationContext();
        C12723b.m35566a().m35572g().m84059j().m122678n(new C28301a(27)).m122661K(new C6529c(applicationContext, 20));
        C29017f c29017f = new C29017f(applicationContext);
        AbstractC23412c abstractC23412cMo52605b = ((InterfaceC18260e) AbstractC15751g.m44472y(InterfaceC18260e.class, null, null)).mo52605b();
        C3633d c3633d = new C3633d(7, c29017f, applicationContext);
        abstractC23412cMo52605b.getClass();
        abstractC23412cMo52605b.m67905c(new C33589b(c3633d, AbstractC31056a.f128065d));
        m24258l(applicationContext);
    }

    /* JADX INFO: renamed from: w */
    public static void m24264w(Context context, NotificationManager notificationManager) {
        RealTimeActivityService.m24222h(context, notificationManager);
    }

    /* JADX INFO: renamed from: x */
    public static boolean m24265x(Context context) {
        return new C29017f(context).m88178b() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m24266y(Long l7, Runnable runnable, RealTimeActivityService realTimeActivityService) {
        realTimeActivityService.m24233p();
        AbstractC9908c.m24280a(this.f29236j, l7, null);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: J */
    public void m24268J(C29016e c29016e, long j7) {
        this.f29232f.mo85216g("RealTimeActivityControllerPersisting activity from " + c29016e.m88170c() + " to " + j7 + " to be retried later", new AbstractC30556a.a[0]);
        this.f29237k.m88181f(c29016e, j7);
        m24261r(this.f29236j);
    }

    /* JADX INFO: renamed from: M */
    public C38280g<C27848k> m24269M(long j7) {
        C38280g<C27848k> c38280gM71422s;
        boolean z4 = false;
        this.f29232f.mo85216g(AbstractC11895b.m31994m(j7, "RealTimeActivityController saveActivity "), new AbstractC30556a.a[0]);
        m24246L(new InterfaceC3255b() { // from class: s52.c
            @Override // bh3.InterfaceC3255b
            /* JADX INFO: renamed from: b */
            public final void mo9472b(Object obj) {
                ((RealTimeActivityService) obj).m24233p();
            }
        });
        C29016e c29016eM24278s = m24278s();
        this.f29232f.mo85216g("RealTimeActivityController saveActivity startInfo " + c29016eM24278s, new AbstractC30556a.a[0]);
        if (c29016eM24278s == null) {
            this.f29232f.mo85228t("RealTimeActivityController startInfo null", new AbstractC30556a.a[0]);
            return C38280g.m122643m(new Throwable("RealTimeActivityStartInfo - current recording info  is null "));
        }
        C27843f c27843fM35568c = C12723b.m35566a().m35568c();
        DateTime dateTime = new DateTime(c29016eM24278s.m88170c());
        DateTime dateTime2 = new DateTime(j7);
        this.f29238l.m71412e(c29016eM24278s.m88168a());
        if (c29016eM24278s.m88168a() instanceof C24517c) {
            this.f29232f.mo85228t("RealTimeActivityController saving start: " + dateTime + "end: " + dateTime2, new AbstractC30556a.a[0]);
            c38280gM71422s = c29016eM24278s.m88168a().mo71414f(c27843fM35568c, dateTime, dateTime2);
            this.f29232f.mo85228t("RealTimeActivityController saving result " + c38280gM71422s, new AbstractC30556a.a[0]);
        } else {
            List<C29019h.a> list = this.f29230d;
            if (list != null && !list.isEmpty()) {
                z4 = true;
            }
            c29016eM24278s.m88174g(z4);
            c38280gM71422s = ((C24518d) c29016eM24278s.m88168a()).m71422s(c27843fM35568c, dateTime, dateTime2, z4);
        }
        AbstractC9908c.m24280a(this.f29236j, Long.valueOf(c29016eM24278s.m88170c()), Long.valueOf(j7));
        this.f29237k.m88186k(null);
        return c38280gM71422s;
    }

    /* JADX INFO: renamed from: N */
    public List<C38280g<Boolean>> m24270N(C29016e c29016e, long j7) {
        InterfaceC24516b interfaceC24516bM88168a = c29016e.m88168a();
        List<C29019h.a> list = this.f29230d;
        boolean z4 = (list == null || list.isEmpty()) ? false : true;
        C27843f c27843fM35568c = C12723b.m35566a().m35568c();
        DateTime dateTime = new DateTime(c29016e.m88170c());
        DateTime dateTime2 = new DateTime(j7);
        ArrayList arrayList = new ArrayList();
        List<List<C29019h.a>> listM24262t = m24262t(this.f29230d, ErrorCodes.InitAPIErrors.cServerErrors);
        if ((interfaceC24516bM88168a instanceof C24518d) && z4) {
            this.f29232f.mo85228t("RealTimeActivityController saveGps", new AbstractC30556a.a[0]);
            Iterator<List<C29019h.a>> it = listM24262t.iterator();
            while (it.hasNext()) {
                arrayList.add(((C24518d) interfaceC24516bM88168a).m71423x(c27843fM35568c, dateTime, dateTime2, it.next()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: O */
    public void m24271O(c cVar) {
        this.f29240n = cVar;
    }

    /* JADX INFO: renamed from: P */
    public void m24272P(List<GpsDto> list) {
        this.f29230d = new ArrayList();
        Iterator<GpsDto> it = list.iterator();
        while (it.hasNext()) {
            this.f29230d.add(it.next().toRoutePoint());
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m24273Q(long j7, InterfaceC24516b interfaceC24516b, RestingHeartRate restingHeartRate) {
        m24274R(j7, interfaceC24516b, null, 0.0d, false, restingHeartRate);
    }

    /* JADX INFO: renamed from: R */
    public void m24274R(long j7, InterfaceC24516b interfaceC24516b, StrainRecoveryMapping strainRecoveryMapping, double d3, boolean z4, RestingHeartRate restingHeartRate) {
        InterfaceC34116n interfaceC34116n = this.f29232f;
        StringBuilder sb4 = new StringBuilder("RealTimeActivityControllerSTRAINCOACH activityController startActivity mapping: ");
        sb4.append(strainRecoveryMapping == null ? "null" : strainRecoveryMapping.toString());
        sb4.append(" goal: ");
        sb4.append(d3);
        interfaceC34116n.mo85216g(sb4.toString(), new AbstractC30556a.a[0]);
        C29016e c29016e = new C29016e(j7, interfaceC24516b, strainRecoveryMapping, d3, z4, restingHeartRate);
        this.f29237k.m88186k(c29016e);
        m24246L(new C27566m0(c29016e, 26));
    }

    /* JADX INFO: renamed from: n */
    public void m24275n(C24079b c24079b) {
        this.f29232f.mo85216g("RealTimeActivityController RealTimeActivityController connect straincontroller subject", new AbstractC30556a.a[0]);
        this.f29227a = c24079b;
        RealTimeActivityService realTimeActivityService = this.f29239m;
        if (realTimeActivityService != null) {
            realTimeActivityService.m24229d(c24079b);
        } else {
            this.f29232f.mo85222m("RealTimeActivityControllerStrainCoach - connectStrainControllerSubject service is null", new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m24276p() {
        m24260o(new RunnableC1645z0(this, 20));
    }

    /* JADX INFO: renamed from: q */
    public void m24277q() {
        synchronized (this) {
            try {
                this.f29241o = true;
                if (this.f29239m != null) {
                    this.f29236j.unbindService(this.f29244r);
                    this.f29239m = null;
                }
                BroadcastReceiver broadcastReceiver = this.f29243q;
                if (broadcastReceiver != null) {
                    try {
                        this.f29236j.unregisterReceiver(broadcastReceiver);
                    } catch (IllegalArgumentException unused) {
                    }
                    this.f29243q = null;
                }
                this.f29231e.m27331b();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public C29016e m24278s() {
        return this.f29237k.m88178b();
    }

    /* JADX INFO: renamed from: u */
    public AbstractC1615p0 m24279u() {
        RealTimeActivityService realTimeActivityService = this.f29239m;
        if (realTimeActivityService == null || realTimeActivityService.m24231f() == null) {
            return null;
        }
        return this.f29239m.m24231f().m88232H();
    }
}
