package io.getstream.video.android.core.notifications.internal.service;

import a30.C0332w0;
import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;
import androidx.core.app.NotificationManagerCompat;
import androidx.fragment.app.RunnableC1319m;
import androidx.room.AbstractC1772c1;
import b23.C2343i;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.AbstractC3076z;
import bc3.C2986a0;
import c53.C4256b;
import e43.AbstractC12721m;
import e43.C12715g;
import ec3.C13045h2;
import g43.AbstractC15473j;
import g43.InterfaceC15478o;
import g73.C15556d;
import gm.C15990r;
import h43.C16853b;
import hc3.C17171d;
import i43.C18087b;
import io.getstream.video.android.model.StreamCallId;
import io.sentry.internal.debugmeta.C20378c;
import j43.C21318b;
import j43.C21323g;
import j43.EnumC21320d;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l43.C23335a;
import l83.C23470p;
import m43.C25056b;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p550vd.AbstractC35902e;
import p619xl.C38445a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import q83.InterfaceC30057d;
import t23.C33359a3;
import t23.C33366b4;
import t23.C33368c0;
import t23.C33390g0;
import t23.C33403i3;
import t23.C33450s0;
import t23.C33487z2;
import t23.EnumC33393g3;
import t23.InterfaceC33377d3;
import t23.InterfaceC33408j3;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m65681d2 = {"Lio/getstream/video/android/core/notifications/internal/service/CallService;", "Landroid/app/Service;", "<init>", "()V", "g73/d", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public class CallService extends Service {

    /* JADX INFO: renamed from: I */
    public static final C23470p f74912I = AbstractC1772c1.m5382S(new C15556d(10), "CallService");

    /* JADX INFO: renamed from: J */
    public static final C4256b f74913J = new C4256b(C2986a0.f11990w, 1);

    /* JADX INFO: renamed from: E */
    public final C38445a f74914E;

    /* JADX INFO: renamed from: F */
    public final C17171d f74915F;

    /* JADX INFO: renamed from: G */
    public final C15990r f74916G;

    /* JADX INFO: renamed from: H */
    public final C21323g f74917H;

    /* JADX INFO: renamed from: w */
    public final C23470p f74918w = AbstractC1772c1.m5382S(this, "CallService");

    /* JADX INFO: renamed from: x */
    public final C20378c f74919x = new C20378c(28, (byte) 0);

    /* JADX INFO: renamed from: y */
    public final C21323g f74920y = new C21323g(2);

    /* JADX INFO: renamed from: z */
    public final C38445a f74921z;

    public CallService() {
        C38445a c38445a = new C38445a(18);
        this.f74921z = c38445a;
        this.f74914E = new C38445a(12);
        C22365e c22365e = AbstractC3050q0.f12077a;
        C17171d c17171dM8708b = AbstractC3006f0.m8708b(AbstractC3076z.limitedParallelism$default(ExecutorC22364d.f87316w, 1, null, 2, null).plus(f74913J).plus(AbstractC3006f0.m8710d()));
        this.f74915F = c17171dM8708b;
        this.f74916G = new C15990r(c38445a, c17171dM8708b);
        this.f74917H = new C21323g(1);
    }

    /* JADX INFO: renamed from: a */
    public final C2345k m55781a() {
        return (C2345k) this.f74918w.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final void m55782b() {
        Object value;
        C25056b c25056bM73534a;
        C18087b c18087b;
        C16853b c16853b;
        C12715g c12715g;
        C2345k c2345kM55781a = m55781a();
        InterfaceC2339e interfaceC2339e = c2345kM55781a.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, c2345kM55781a.f9273a)) {
            c2345kM55781a.f9274b.log(enumC2341g, c2345kM55781a.f9273a, AbstractC2875y.m8295h(hashCode(), "[internalStopServiceGracefully] hashcode: "), null);
        }
        stopForeground(1);
        StreamCallId streamCallIdM123182s = this.f74921z.m123182s();
        if (streamCallIdM123182s != null) {
            C15990r c15990r = this.f74916G;
            c15990r.getClass();
            NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(this);
            AbstractC22676k.m65749i(notificationManagerCompatFrom, "from(...)");
            C2345k c2345k = (C2345k) ((C23470p) c15990r.f60514z).getValue();
            if (c2345k.f9275c.isLoggable(enumC2341g, c2345k.f9273a)) {
                c2345k.f9274b.log(enumC2341g, c2345k.f9273a, AbstractC2875y.m8295h(streamCallIdM123182s.hashCode(), "[cancelNotifications], notificationId via hashcode: "), null);
            }
            notificationManagerCompatFrom.cancel(streamCallIdM123182s.hashCode());
            Integer num = ((C25056b) ((C13045h2) ((C38445a) c15990r.f60512x).f164637y).getValue()).f98185b;
            if (num != null) {
                int iIntValue = num.intValue();
                C2345k c2345k2 = (C2345k) ((C23470p) c15990r.f60514z).getValue();
                if (c2345k2.f9275c.isLoggable(enumC2341g, c2345k2.f9273a)) {
                    c2345k2.f9274b.log(enumC2341g, c2345k2.f9273a, AbstractC2875y.m8295h(iIntValue, "[cancelNotifications], notificationId from stateController: "), null);
                }
                notificationManagerCompatFrom.cancel(iIntValue);
            }
            try {
                InterfaceC33408j3.f139483t.getClass();
                InterfaceC33408j3 interfaceC33408j3 = C33403i3.f139477b;
                C33366b4 c33366b4 = interfaceC33408j3 instanceof C33366b4 ? (C33366b4) interfaceC33408j3 : null;
                InterfaceC15478o interfaceC15478o = (c33366b4 == null || (c16853b = c33366b4.f139235H) == null || (c12715g = c16853b.f64767x) == null) ? null : c12715g.f43505c;
                AbstractC15473j abstractC15473j = interfaceC15478o instanceof AbstractC15473j ? (AbstractC15473j) interfaceC15478o : null;
                if (abstractC15473j != null) {
                    abstractC15473j.getClass();
                    try {
                        abstractC15473j.f58117I.m43663a(streamCallIdM123182s);
                    } catch (Exception e5) {
                        C2343i c2343i = C2343i.f9269a;
                        InterfaceC2339e interfaceC2339e2 = C2343i.f9272d;
                        EnumC2341g enumC2341g2 = EnumC2341g.ERROR;
                        if (interfaceC2339e2.isLoggable(enumC2341g2, "SafeCall")) {
                            C2343i.f9271c.log(enumC2341g2, "SafeCall", AbstractC11266d.m30461o("Exception occurred: ", e5.getMessage()), e5);
                        }
                    }
                }
            } catch (Exception e13) {
                C2343i c2343i2 = C2343i.f9269a;
                InterfaceC2339e interfaceC2339e3 = C2343i.f9272d;
                EnumC2341g enumC2341g3 = EnumC2341g.ERROR;
                if (interfaceC2339e3.isLoggable(enumC2341g3, "SafeCall")) {
                    C2343i.f9271c.log(enumC2341g3, "SafeCall", AbstractC11266d.m30461o("Exception occurred: ", e13.getMessage()), e13);
                }
            }
        }
        C38445a c38445a = this.f74921z;
        c38445a.getClass();
        C13045h2 c13045h2 = (C13045h2) c38445a.f164636x;
        do {
            value = c13045h2.getValue();
            c25056bM73534a = (C25056b) value;
            if (c25056bM73534a.f98188e) {
                c18087b = c25056bM73534a.f98187d;
                c25056bM73534a = C25056b.m73534a(c25056bM73534a, null, null, null, null, false, null, 39);
            } else {
                c18087b = null;
            }
        } while (!c13045h2.m36569i(value, c25056bM73534a));
        if (c18087b != null) {
            try {
                unregisterReceiver(c18087b);
            } catch (Exception unused) {
            }
        }
        C0332w0 c0332w0 = ((C25056b) ((C13045h2) this.f74921z.f164637y).getValue()).f98186c;
        if (c0332w0 != null) {
            c0332w0.m846I();
        }
        AbstractC3006f0.m8714h(this.f74915F, null);
        stopSelf();
    }

    /* JADX INFO: renamed from: c */
    public final void m55783c(C33368c0 c33368c0) {
        String str = c33368c0.f139308v;
        C2345k c2345kM55781a = m55781a();
        InterfaceC2339e interfaceC2339e = c2345kM55781a.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str2 = c2345kM55781a.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
            c2345kM55781a.f9274b.log(enumC2341g, str2, AbstractC11266d.m30461o("[removeIncomingCall] call_cid:", str), null);
        }
        StreamCallId streamCallIdM123182s = this.f74921z.m123182s();
        if (AbstractC22676k.m65745e(streamCallIdM123182s != null ? streamCallIdM123182s.getCid() : null, str)) {
            m55785e(null);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m55784d(C33368c0 c33368c0, StreamCallId streamCallId, Notification notification, AbstractC12721m abstractC12721m, String str) {
        int iIntValue;
        C33450s0 c33450s0 = c33368c0.f139302p;
        Integer num = (Integer) c33450s0.f139687y0.getValue();
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            Integer numValueOf = abstractC12721m != null ? Integer.valueOf(streamCallId.getNotificationId(abstractC12721m)) : null;
            iIntValue = numValueOf != null ? numValueOf.intValue() : streamCallId.hashCode();
        }
        C2345k c2345kM55781a = m55781a();
        InterfaceC2339e interfaceC2339e = c2345kM55781a.f9275c;
        String str2 = c2345kM55781a.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
            c2345kM55781a.f9274b.log(enumC2341g, str2, "[startForegroundForCall] trigger=" + str + ", call.state.notificationId=" + c33450s0.f139687y0.getValue() + ", notificationId=" + iIntValue + ", hashcode=" + hashCode(), null);
        }
        c33450s0.m105867i(iIntValue, notification);
        Context baseContext = getBaseContext();
        AbstractC22676k.m65749i(baseContext, "getBaseContext(...)");
        AbstractC35902e.m113965g0(this, iIntValue, notification, str, this.f74919x.m56592u(baseContext, str));
        EnumC21320d enumC21320d = EnumC21320d.f81527w;
    }

    /* JADX INFO: renamed from: e */
    public final void m55785e(String str) {
        if (str != null) {
            C2345k c2345kM55781a = m55781a();
            InterfaceC2339e interfaceC2339e = c2345kM55781a.f9275c;
            String str2 = c2345kM55781a.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.WARN;
            if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
                c2345kM55781a.f9274b.log(enumC2341g, str2, "[stopServiceGracefully] source: ".concat(str), null);
            }
        }
        Long l7 = ((C25056b) ((C13045h2) this.f74921z.f164637y).getValue()).f98189f;
        if (l7 != null) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - l7.longValue());
            C2345k c2345kM55781a2 = m55781a();
            InterfaceC2339e interfaceC2339e2 = c2345kM55781a2.f9275c;
            String str3 = c2345kM55781a2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str3)) {
                c2345kM55781a2.f9274b.log(enumC2341g2, str3, AbstractC11895b.m31994m(seconds, "[stopServiceGracefully] differenceInSeconds: "), null);
            }
            if (seconds >= 2) {
                m55782b();
                return;
            }
            C21318b c21318b = new C21318b(this, 2);
            C38445a c38445a = this.f74914E;
            Handler handler = (Handler) c38445a.f164636x;
            RunnableC1319m runnableC1319m = (RunnableC1319m) c38445a.f164637y;
            if (runnableC1319m != null) {
                handler.removeCallbacks(runnableC1319m);
            }
            RunnableC1319m runnableC1319m2 = new RunnableC1319m(c21318b, 25);
            c38445a.f164637y = runnableC1319m2;
            handler.postDelayed(runnableC1319m2, 2L);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        Object value;
        super.onCreate();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C13045h2 c13045h2 = (C13045h2) this.f74921z.f164636x;
        do {
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, C25056b.m73534a((C25056b) value, null, null, null, null, false, Long.valueOf(jElapsedRealtime), 31)));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Ringtone ringtone;
        C2345k c2345kM55781a = m55781a();
        InterfaceC2339e interfaceC2339e = c2345kM55781a.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, c2345kM55781a.f9273a)) {
            InterfaceC2344j interfaceC2344j = c2345kM55781a.f9274b;
            String str = c2345kM55781a.f9273a;
            int iHashCode = hashCode();
            StreamCallId streamCallIdM123182s = this.f74921z.m123182s();
            interfaceC2344j.log(enumC2341g, str, AbstractC11266d.m30456j(iHashCode, "[onDestroy], hashcode: ", ", call_cid: ", streamCallIdM123182s != null ? streamCallIdM123182s.getCid() : null), null);
        }
        C0332w0 c0332w0 = ((C25056b) ((C13045h2) this.f74921z.f164637y).getValue()).f98186c;
        if (c0332w0 != null) {
            synchronized (c0332w0) {
                try {
                    C2345k c2345kM862r = c0332w0.m862r();
                    if (c2345kM862r.f9275c.isLoggable(enumC2341g, c2345kM862r.f9273a)) {
                        c2345kM862r.f9274b.log(enumC2341g, c2345kM862r.f9273a, "[cleanAudioResources] Cleaning audio resources", null);
                    }
                    Ringtone ringtone2 = (Ringtone) c0332w0.f1165F;
                    if (ringtone2 != null && ringtone2.isPlaying() && (ringtone = (Ringtone) c0332w0.f1165F) != null) {
                        ringtone.stop();
                    }
                    c0332w0.f1165F = null;
                    ((MediaPlayer) ((C23470p) c0332w0.f1170z).getValue()).release();
                    c0332w0.f1164E = null;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        C38445a c38445a = this.f74914E;
        RunnableC1319m runnableC1319m = (RunnableC1319m) c38445a.f164637y;
        if (runnableC1319m != null) {
            ((Handler) c38445a.f164636x).removeCallbacks(runnableC1319m);
        }
        c38445a.f164637y = null;
        AbstractC3006f0.m8714h(this.f74915F, null);
        super.onDestroy();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 27901. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // android.app.Service
    public final int onStartCommand(android.content.Intent r35, int r36, int r37) {
        /*
            Method dump skipped, instruction units count: 2790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.video.android.core.notifications.internal.service.CallService.onStartCommand(android.content.Intent, int, int):int");
    }

    /* JADX WARN: Type inference failed for: r3v14, types: [c93.a, kotlin.jvm.internal.m] */
    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        C2345k c2345kM55781a = m55781a();
        InterfaceC2339e interfaceC2339e = c2345kM55781a.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.WARN;
        InterfaceC30057d interfaceC30057d = null;
        if (interfaceC2339e.isLoggable(enumC2341g, c2345kM55781a.f9273a)) {
            c2345kM55781a.f9274b.log(enumC2341g, c2345kM55781a.f9273a, "[onTaskRemoved]", null);
        }
        C21323g c21323g = this.f74920y;
        C17171d scope = this.f74915F;
        StreamCallId streamCallIdM123182s = this.f74921z.m123182s();
        c21323g.getClass();
        AbstractC22676k.m65750j(scope, "scope");
        if (streamCallIdM123182s != null) {
            InterfaceC33408j3.f139483t.getClass();
            InterfaceC33408j3 interfaceC33408j3 = C33403i3.f139477b;
            if (interfaceC33408j3 != null) {
                C33368c0 c33368c0M105796n = ((C33366b4) interfaceC33408j3).m105796n(streamCallIdM123182s.getType(), streamCallIdM123182s.getId());
                InterfaceC33377d3 interfaceC33377d3 = (InterfaceC33377d3) c33368c0M105796n.f139302p.f139618G.getValue();
                if (interfaceC33377d3 instanceof C33359a3) {
                    AbstractC3006f0.m8732z(scope, null, null, new C23335a(c33368c0M105796n, c21323g, interfaceC30057d, 0), 3);
                } else if (interfaceC33377d3 instanceof C33487z2) {
                    int size = ((List) ((AbstractC22680m) c33368c0M105796n.f139302p.f139684x.f104635y).invoke()).size();
                    C2345k c2345kM59853c = c21323g.m59853c();
                    InterfaceC2339e interfaceC2339e2 = c2345kM59853c.f9275c;
                    EnumC2341g enumC2341g2 = EnumC2341g.INFO;
                    if (interfaceC2339e2.isLoggable(enumC2341g2, c2345kM59853c.f9273a)) {
                        c2345kM59853c.f9274b.log(enumC2341g2, c2345kM59853c.f9273a, AbstractC2875y.m8295h(size, "[handleIncomingCallTaskRemoved] Total members: "), null);
                    }
                    if (size == 2) {
                        AbstractC3006f0.m8732z(scope, null, null, new C23335a(c33368c0M105796n, c21323g, interfaceC30057d, 1), 3);
                    } else {
                        c33368c0M105796n.m105823p(new C33390g0(EnumC33393g3.TASK_REMOVED, "App removed from recents for (incoming call)"));
                        C2345k c2345kM59853c2 = c21323g.m59853c();
                        if (c2345kM59853c2.f9275c.isLoggable(enumC2341g2, c2345kM59853c2.f9273a)) {
                            c2345kM59853c2.f9274b.log(enumC2341g2, c2345kM59853c2.f9273a, "[handleIncomingCallTaskRemoved] Ended incoming call for me", null);
                        }
                    }
                } else {
                    c33368c0M105796n.m105823p(new C33390g0(EnumC33393g3.TASK_REMOVED, "App removed from recents for ringing state: " + interfaceC33377d3));
                    C2345k c2345kM59853c3 = c21323g.m59853c();
                    InterfaceC2339e interfaceC2339e3 = c2345kM59853c3.f9275c;
                    EnumC2341g enumC2341g3 = EnumC2341g.INFO;
                    if (interfaceC2339e3.isLoggable(enumC2341g3, c2345kM59853c3.f9273a)) {
                        c2345kM59853c3.f9274b.log(enumC2341g3, c2345kM59853c3.f9273a, "[onTaskRemoved] Ended ongoing call for me", null);
                    }
                }
            }
        }
        m55785e(null);
    }

    @Override // android.app.Service
    public final void onTimeout(int i13) {
        super.onTimeout(i13);
        C2345k c2345kM55781a = m55781a();
        InterfaceC2339e interfaceC2339e = c2345kM55781a.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.WARN;
        String str = c2345kM55781a.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM55781a.f9274b.log(enumC2341g, str, "[onTimeout] Timeout received from the system, service will stop.", null);
        }
        m55785e(null);
    }
}
