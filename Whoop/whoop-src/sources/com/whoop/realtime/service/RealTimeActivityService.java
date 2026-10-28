package com.whoop.realtime.service;

import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.util.TypedValue;
import androidx.core.app.NotificationCompat;
import c12.C3853d;
import c12.EnumC3851b;
import c12.InterfaceC3852c;
import com.whoop.realtime.presentation.RealTimeRecordActivity;
import ge3.AbstractC15751g;
import iy1.InterfaceC21030c;
import java.util.List;
import jy1.C22047a;
import k52.AbstractC22205a;
import k52.AbstractC22207c;
import k52.AbstractC22210f;
import k52.AbstractC22211g;
import lh3.C24079b;
import live.hms.video.error.ErrorCodes;
import lm2.C24518d;
import p479s4.AbstractC32122c;
import p92.C29016e;
import p92.C29019h;
import p92.C29020i;
import q63.AbstractC30007c;
import qr2.AbstractC30556a;
import s51.C32209f;
import s51.C32219p;
import s52.C32223d;
import tr2.InterfaceC34116n;
import uf3.C34911a;

/* JADX INFO: loaded from: classes4.dex */
public class RealTimeActivityService extends Service {

    /* JADX INFO: renamed from: E */
    public static String f29220E = "RealTimeActivityService";

    /* JADX INFO: renamed from: F */
    private static final C3853d f29221F = new C3853d(EnumC3851b.HIGH, "06000_RealTimeActivities", AbstractC22210f.f86452W).m11812k(false).m11813l(false).m11811j(false);

    /* JADX INFO: renamed from: x */
    private C29019h f29223x;

    /* JADX INFO: renamed from: y */
    private C24079b f29224y;

    /* JADX INFO: renamed from: w */
    private final C29020i f29222w = (C29020i) AbstractC15751g.m44472y(C29020i.class, null, new C32223d(0));

    /* JADX INFO: renamed from: z */
    private final InterfaceC34116n f29225z = InterfaceC34116n.m107846d(f29220E);

    /* JADX INFO: renamed from: com.whoop.realtime.service.RealTimeActivityService$a */
    public class BinderC9905a extends Binder {
        public BinderC9905a() {
        }

        /* JADX INFO: renamed from: a */
        public RealTimeActivityService m24234a() {
            return RealTimeActivityService.this;
        }
    }

    /* JADX INFO: renamed from: g */
    private boolean m24221g(C29016e c29016e) {
        if (c29016e.m88173f()) {
            return checkSelfPermission("android.permission.FOREGROUND_SERVICE_LOCATION") == 0 && checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0;
        }
        return checkSelfPermission("android.permission.FOREGROUND_SERVICE_CONNECTED_DEVICE") == 0 && checkSelfPermission("android.permission.BLUETOOTH_CONNECT") == 0;
    }

    /* JADX INFO: renamed from: h */
    public static void m24222h(Context context, NotificationManager notificationManager) {
        f29221F.m11806e(notificationManager, context);
    }

    /* JADX INFO: renamed from: i */
    private boolean m24223i() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ActivityManager activityManager = (ActivityManager) getSystemService("activity");
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return false;
        }
        String packageName = getPackageName();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.processName.equals(packageName) && runningAppProcessInfo.importance == 100) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ C34911a m24224j() {
        return AbstractC15751g.m44431K(54);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ C34911a m24225k() {
        return AbstractC15751g.m44431K(55);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ C34911a m24226l(C29016e c29016e) {
        return AbstractC15751g.m44431K(this, c29016e.m88169b());
    }

    /* JADX INFO: renamed from: m */
    private void m24227m(String str) {
        try {
            ((InterfaceC21030c) AbstractC15751g.m44472y(InterfaceC21030c.class, null, null)).mo58701b(new C22047a(0, "realtime_service_start_failure", null, AbstractC30007c.m91848r("reason:" + str), null));
        } catch (Exception unused) {
            this.f29225z.mo85228t("Failed to log metric: realtime_service_start_failure", new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: renamed from: n */
    private int m24228n(C29016e c29016e) {
        return c29016e.m88173f() ? 8 : 16;
    }

    /* JADX INFO: renamed from: d */
    public void m24229d(C24079b c24079b) {
        this.f29225z.mo85216g("STRAINCOACH RealTimeActivityService connect straincontroller subject", new AbstractC30556a.a[0]);
        this.f29224y = c24079b;
        if (this.f29223x != null) {
            this.f29225z.mo85216g("STRAINCOACH RealTimeActivityService emit strainController!", new AbstractC30556a.a[0]);
            this.f29224y.onNext(this.f29223x);
        }
    }

    /* JADX INFO: renamed from: e */
    public Notification m24230e(C29016e c29016e) {
        C29020i c29020i = (C29020i) AbstractC15751g.m44472y(C29020i.class, null, new C32219p(1));
        Intent intentMo23852f = RealTimeRecordActivity.m23762F0(this, c29020i).m23855u(c29016e.m88168a()).m23857w(c29016e.m88172e()).m23851A(c29016e.m88171d()).m23854s().mo23852f();
        Context contextForLanguage = AbstractC32122c.getContextForLanguage(this);
        String strMo71415h = c29016e.m88168a().mo71415h(contextForLanguage);
        NotificationCompat.Builder ongoing = ((InterfaceC3852c) AbstractC15751g.m44472y(InterfaceC3852c.class, null, null)).mo11800a(this).setContentIntent(PendingIntent.getActivity(this, 20, intentMo23852f, 67108864)).setContentTitle(contextForLanguage.getString(AbstractC22210f.f86514s, strMo71415h)).setContentText(contextForLanguage.getString(AbstractC22210f.f86511r, strMo71415h)).addAction(new NotificationCompat.Action(AbstractC22207c.f86264e, contextForLanguage.getString(AbstractC22210f.f86502o), PendingIntent.getActivity(this, 23, RealTimeRecordActivity.m23762F0(this, c29020i).m23855u(c29016e.m88168a()).m23857w(c29016e.m88172e()).m23851A(c29016e.m88171d()).m23854s().m23853r().mo23852f(), 67108864))).setOnlyAlertOnce(true).setOngoing(true);
        f29221F.m11805a(ongoing);
        if (c29016e.m88168a() instanceof C24518d) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = getTheme();
            theme.applyStyle(AbstractC22211g.f86542e, true);
            theme.resolveAttribute(AbstractC22205a.f86241a, typedValue, true);
            ongoing.setLights(typedValue.data, 800, ErrorCodes.TracksErrors.cGenericTrack);
        }
        return ongoing.build();
    }

    /* JADX INFO: renamed from: f */
    public C29019h m24231f() {
        return this.f29223x;
    }

    /* JADX INFO: renamed from: o */
    public void m24232o(C29016e c29016e) {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 34) {
            if (!m24221g(c29016e)) {
                m24227m("missing_permissions");
                InterfaceC34116n.m107846d("RealTimeActivityService").mo85222m("Cannot start service: missing required permissions", new AbstractC30556a.a[0]);
                return;
            } else if (!m24223i()) {
                m24227m("app_not_in_foreground");
                InterfaceC34116n.m107846d("RealTimeActivityService").mo85222m("Cannot start service: app is not in foreground", new AbstractC30556a.a[0]);
                return;
            }
        }
        startForegroundService(new Intent(this, (Class<?>) RealTimeActivityService.class));
        if (i13 >= 29) {
            startForeground(20, m24230e(c29016e), m24228n(c29016e));
        } else {
            startForeground(20, m24230e(c29016e));
        }
        if (c29016e.m88168a() instanceof C24518d) {
            if (this.f29223x == null) {
                C29019h c29019h = (C29019h) AbstractC15751g.m44472y(C29019h.class, null, new C32209f(3, this, c29016e));
                this.f29223x = c29019h;
                c29019h.m88245c0();
                if (this.f29224y != null) {
                    this.f29225z.mo85216g("STRAINCOACH RealTimeActivityService emit strainController on startup!", new AbstractC30556a.a[0]);
                    this.f29224y.onNext(this.f29223x);
                }
            }
            this.f29222w.m88251a();
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return new BinderC9905a();
    }

    /* JADX INFO: renamed from: p */
    public void m24233p() {
        this.f29222w.m88252b();
        C29019h c29019h = this.f29223x;
        if (c29019h != null) {
            c29019h.m88246h0();
        }
        stopForeground(true);
        stopSelf();
        this.f29225z.mo85216g("STRAINCOACH RealTimeActivityService stopping", new AbstractC30556a.a[0]);
    }
}
