package com.whoop.service.push.notifications;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c12.C3853d;
import c93.InterfaceC4351m;
import com.whoop.data.remote.domain.dto.PushNotificationMetricType;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.NotificationRepository;
import com.whoop.service.push.InvalidPushDataException;
import e93.AbstractC12889b;
import hi0.AbstractC17307e;
import hi0.AbstractC17312j;
import l83.C23454a0;
import l83.C23465k;
import m92.AbstractC25319b;
import m92.AbstractC25320c;
import m92.C25323f;
import o92.C27696c0;
import o92.C27698d0;
import o92.C27721s;
import p114eb.C12966j0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.C30064k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import x82.C38082i;
import z82.C40197k;

/* JADX INFO: renamed from: com.whoop.service.push.notifications.j */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0011B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096D¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, m65681d2 = {"Lcom/whoop/service/push/notifications/j;", "Lm92/b;", "Lo92/s;", "pushContext", "Lx82/i;", "batteryMonitor", "Lz82/k;", "analyticsManager", "Lo92/c0;", "bodyGetter", "<init>", "(Lo92/s;Lx82/i;Lz82/k;Lo92/c0;)V", "Lm92/f;", "dataMap", "Landroid/content/Context;", "context", "Ll83/a0;", "a", "(Lm92/f;Landroid/content/Context;)V", "I", "Lx82/i;", "J", "Lz82/k;", "K", "Lo92/c0;", "", "L", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "logTag", "M", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C9998j extends AbstractC25319b {

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: N */
    public static final int f29616N = 8;

    /* JADX INFO: renamed from: O */
    private static final C3853d f29617O = AbstractC25319b.INSTANCE.m74357a("02000_SleepCoach", AbstractC17312j.f67014q);

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final C38082i batteryMonitor;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final C40197k analyticsManager;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final C27696c0 bodyGetter;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: com.whoop.service.push.notifications.j$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\r¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/service/push/notifications/j$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/app/NotificationManager;", "manager", "Ll83/a0;", "a", "(Landroid/content/Context;Landroid/app/NotificationManager;)V", "", "CHANNEL_ID", "Ljava/lang/String;", "Lc12/d;", "SETTINGS", "Lc12/d;", "NOTIFICATION_TYPE", "KEY_TITLE", "KEY_BODY", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m24576a(Context context, NotificationManager manager) {
            C9998j.f29617O.m11806e(manager, context);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.push.notifications.j$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.push.notifications.SleepNeedPushNotification$perform$1", m100430f = "SleepNeedPushNotification.kt", m100431l = {73}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C9998j f29622E;

        /* JADX INFO: renamed from: w */
        Object f29623w;

        /* JADX INFO: renamed from: x */
        int f29624x;

        /* JADX INFO: renamed from: y */
        int f29625y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C25323f f29626z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C25323f c25323f, C9998j c9998j, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f29626z = c25323f;
            this.f29622E = c9998j;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f29626z, this.f29622E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f29625y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                String strM74370d = this.f29626z.m74370d();
                if (strM74370d != null) {
                    NotificationRepository notificationRepository = this.f29622E.getNotificationRepository();
                    PushNotificationMetricType pushNotificationMetricType = PushNotificationMetricType.FailedToDisplay;
                    this.f29623w = null;
                    this.f29624x = 0;
                    this.f29625y = 1;
                    if (notificationRepository.sendPushNotificationMetric(pushNotificationMetricType, strM74370d, this) == enumC31071a) {
                        return enumC31071a;
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.push.notifications.j$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.push.notifications.SleepNeedPushNotification$perform$result$1", m100430f = "SleepNeedPushNotification.kt", m100431l = {50}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lo92/d0;", "<anonymous>", "(Lbc3/c0;)Lo92/d0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f29627w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f29629y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Context f29630z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Context context, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f29629y = str;
            this.f29630z = context;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C9998j.this.new c(this.f29629y, this.f29630z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C27698d0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f29627w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C27696c0 c27696c0 = C9998j.this.bodyGetter;
            String str = this.f29629y;
            Context context = this.f29630z;
            this.f29627w = 1;
            Object objM83720a = c27696c0.m83720a(str, context, this);
            return objM83720a == enumC31071a ? enumC31071a : objM83720a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9998j(C27721s pushContext, C38082i batteryMonitor, C40197k analyticsManager, C27696c0 bodyGetter) {
        super(pushContext);
        AbstractC22676k.m65750j(pushContext, "pushContext");
        AbstractC22676k.m65750j(batteryMonitor, "batteryMonitor");
        AbstractC22676k.m65750j(analyticsManager, "analyticsManager");
        AbstractC22676k.m65750j(bodyGetter, "bodyGetter");
        this.batteryMonitor = batteryMonitor;
        this.analyticsManager = analyticsManager;
        this.bodyGetter = bodyGetter;
        this.logTag = "SleepNeedPushNotification";
    }

    @Override // m92.InterfaceC25322e
    /* JADX INFO: renamed from: a */
    public void mo24524a(C25323f dataMap, Context context) throws InvalidPushDataException {
        C27698d0 c27698d0;
        AbstractC22676k.m65750j(dataMap, "dataMap");
        AbstractC22676k.m65750j(context, "context");
        String strM74364g = AbstractC25320c.m74364g(dataMap);
        if (!AbstractC22676k.m65745e(strM74364g, "SleepCoachV2")) {
            AbstractC3006f0.m8732z(getScope(), null, null, new b(dataMap, this, null), 3);
            throw new InvalidPushDataException(dataMap, "Unrecognized notification type sent to SleepNeedPushNotification");
        }
        String strM74353r = m74353r(dataMap, "title");
        String strM74353r2 = m74353r(dataMap, "body");
        if (getFeatureFlagChecker().isFeatureEnabled(FeatureFlagRepositoryKt.BEDTIME_OFF_BODY_EXPERIMENT)) {
            c27698d0 = (C27698d0) AbstractC3006f0.m8699E(C30064k.f122676w, new c(strM74353r2, context, null));
        } else {
            c27698d0 = new C27698d0(strM74353r2, null, null);
        }
        String body = c27698d0.getBody();
        this.analyticsManager.m129081b(c27698d0.getStrapBodyStatus(), c27698d0.getExperimentVariant(), "bedtime-off-body-experiment");
        Bundle bundleM36273g = AbstractC12889b.m36273g(new C23465k("entryPoint", "Notification - Bedtime Recommendation"), new C23465k("clickType", ""), new C23465k("sourceId", dataMap.m74370d()));
        C12966j0 c12966j0M74345c = m74345c(context);
        C12966j0.m36442f(c12966j0M74345c, AbstractC17307e.f66856w4);
        c12966j0M74345c.m36447e(bundleM36273g);
        PendingIntent pendingIntentM36444b = c12966j0M74345c.m36444b();
        NotificationCompat.Builder deleteIntent = m74346d(context, 50).setContentIntent(pendingIntentM36444b).setContentTitle(strM74353r).setContentText(body).setDeleteIntent(NotificationDismissedReceiver.Companion.m24516b(NotificationDismissedReceiver.INSTANCE, context, strM74364g, 134217728, 0, 8, null));
        AbstractC22676k.m65749i(deleteIntent, "setDeleteIntent(...)");
        f29617O.m11805a(deleteIntent);
        deleteIntent.setStyle(new NotificationCompat.BigTextStyle().setBigContentTitle(strM74353r).bigText(body));
        Notification notificationBuild = deleteIntent.build();
        AbstractC22676k.m65749i(notificationBuild, "build(...)");
        AbstractC25319b.m74344y(this, 50, notificationBuild, context, strM74353r, body, null, 32, null);
        this.batteryMonitor.m122032r();
    }

    @Override // m92.AbstractC25319b
    /* JADX INFO: renamed from: n, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }
}
