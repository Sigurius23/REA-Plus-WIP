package com.whoop.service.push.notifications;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.remote.domain.dto.PushNotificationMetricType;
import com.whoop.data.repositories.NotificationRepository;
import com.whoop.entitlements.Entitlement;
import com.whoop.service.push.InvalidPushDataException;
import ej2.AbstractC13264a;
import hi0.AbstractC17307e;
import hi0.AbstractC17312j;
import l83.C23454a0;
import m92.AbstractC25319b;
import m92.AbstractC25320c;
import m92.C25323f;
import o92.C27710j0;
import o92.C27712k0;
import o92.C27721s;
import p114eb.C12966j0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pj2.C29306e;
import q83.C30064k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import we1.InterfaceC37217a;
import z82.C40197k;

/* JADX INFO: renamed from: com.whoop.service.push.notifications.k */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0011B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096D¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, m65681d2 = {"Lcom/whoop/service/push/notifications/k;", "Lm92/b;", "Lo92/s;", "pushContext", "Lz82/k;", "analyticsManager", "Lwe1/a;", "entitlementChecker", "Lo92/j0;", "titleGetter", "<init>", "(Lo92/s;Lz82/k;Lwe1/a;Lo92/j0;)V", "Lm92/f;", "dataMap", "Landroid/content/Context;", "context", "Ll83/a0;", "a", "(Lm92/f;Landroid/content/Context;)V", "I", "Lz82/k;", "J", "Lwe1/a;", "K", "Lo92/j0;", "", "L", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "logTag", "M", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C9999k extends AbstractC25319b {

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: N */
    public static final int f29632N = 8;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final C40197k analyticsManager;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC37217a entitlementChecker;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final C27710j0 titleGetter;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: com.whoop.service.push.notifications.k$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\r¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/service/push/notifications/k$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/app/NotificationManager;", "manager", "Ll83/a0;", "a", "(Landroid/content/Context;Landroid/app/NotificationManager;)V", "", "CHANNEL_ID", "Ljava/lang/String;", "NOTIFICATION_BODY_KEY", "NOTIFICATION_TITLE_KEY", "NOTIFICATION_TYPE", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m24579a(Context context, NotificationManager manager) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(manager, "manager");
            AbstractC25319b.INSTANCE.m74357a("06650_StressMonitor", AbstractC17312j.f66921D0).m11806e(manager, context);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.push.notifications.k$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.push.notifications.StressMonitorPushNotification$perform$1", m100430f = "StressMonitorPushNotification.kt", m100431l = {97}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C9999k f29637E;

        /* JADX INFO: renamed from: w */
        Object f29638w;

        /* JADX INFO: renamed from: x */
        int f29639x;

        /* JADX INFO: renamed from: y */
        int f29640y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C25323f f29641z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C25323f c25323f, C9999k c9999k, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f29641z = c25323f;
            this.f29637E = c9999k;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f29641z, this.f29637E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f29640y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                String strM74370d = this.f29641z.m74370d();
                if (strM74370d != null) {
                    NotificationRepository notificationRepository = this.f29637E.getNotificationRepository();
                    PushNotificationMetricType pushNotificationMetricType = PushNotificationMetricType.FailedToDisplay;
                    this.f29638w = null;
                    this.f29639x = 0;
                    this.f29640y = 1;
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

    /* JADX INFO: renamed from: com.whoop.service.push.notifications.k$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.push.notifications.StressMonitorPushNotification$perform$2", m100430f = "StressMonitorPushNotification.kt", m100431l = {105}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C9999k f29642E;

        /* JADX INFO: renamed from: w */
        Object f29643w;

        /* JADX INFO: renamed from: x */
        int f29644x;

        /* JADX INFO: renamed from: y */
        int f29645y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C25323f f29646z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C25323f c25323f, C9999k c9999k, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f29646z = c25323f;
            this.f29642E = c9999k;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f29646z, this.f29642E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f29645y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                String strM74370d = this.f29646z.m74370d();
                if (strM74370d != null) {
                    NotificationRepository notificationRepository = this.f29642E.getNotificationRepository();
                    PushNotificationMetricType pushNotificationMetricType = PushNotificationMetricType.FailedToDisplay;
                    this.f29643w = null;
                    this.f29644x = 0;
                    this.f29645y = 1;
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

    /* JADX INFO: renamed from: com.whoop.service.push.notifications.k$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.push.notifications.StressMonitorPushNotification$perform$result$1", m100430f = "StressMonitorPushNotification.kt", m100431l = {53}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lo92/k0;", "<anonymous>", "(Lbc3/c0;)Lo92/k0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f29647w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f29649y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Context f29650z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Context context, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f29649y = str;
            this.f29650z = context;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C9999k.this.new d(this.f29649y, this.f29650z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C27712k0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f29647w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C27710j0 c27710j0 = C9999k.this.titleGetter;
            String str = this.f29649y;
            Context context = this.f29650z;
            this.f29647w = 1;
            Object objM83759a = c27710j0.m83759a(str, context, this);
            return objM83759a == enumC31071a ? enumC31071a : objM83759a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9999k(C27721s pushContext, C40197k analyticsManager, InterfaceC37217a entitlementChecker, C27710j0 titleGetter) {
        super(pushContext);
        AbstractC22676k.m65750j(pushContext, "pushContext");
        AbstractC22676k.m65750j(analyticsManager, "analyticsManager");
        AbstractC22676k.m65750j(entitlementChecker, "entitlementChecker");
        AbstractC22676k.m65750j(titleGetter, "titleGetter");
        this.analyticsManager = analyticsManager;
        this.entitlementChecker = entitlementChecker;
        this.titleGetter = titleGetter;
        this.logTag = "StressMonitorPushNotification";
    }

    @Override // m92.InterfaceC25322e
    /* JADX INFO: renamed from: a */
    public void mo24524a(C25323f dataMap, Context context) throws InvalidPushDataException {
        PendingIntent pendingIntentM36444b;
        AbstractC22676k.m65750j(dataMap, "dataMap");
        AbstractC22676k.m65750j(context, "context");
        String strM74364g = AbstractC25320c.m74364g(dataMap);
        if (!AbstractC22676k.m65745e(strM74364g, "stress_monitor")) {
            AbstractC3006f0.m8732z(getScope(), null, null, new c(dataMap, this, null), 3);
            throw new InvalidPushDataException(dataMap, "Unrecognized notification type sent to StressMonitorPushNotification");
        }
        try {
            C27712k0 c27712k0 = (C27712k0) AbstractC3006f0.m8699E(C30064k.f122676w, new d(m74353r(dataMap, "title"), context, null));
            String strM74353r = m74353r(dataMap, "body");
            PendingIntent pendingIntentM24516b = NotificationDismissedReceiver.Companion.m24516b(NotificationDismissedReceiver.INSTANCE, context, strM74364g, 134217728, 0, 8, null);
            Bundle bundleM88963d = new C29306e.a().m88965b(dataMap.m74370d()).m88964a().m88963d();
            AbstractC22676k.m65749i(bundleM88963d, "toBundle(...)");
            if (this.entitlementChecker.mo119272b(Entitlement.STRESS_MONITOR)) {
                C12966j0 c12966j0M74345c = m74345c(context);
                C12966j0.m36442f(c12966j0M74345c, AbstractC13264a.f45927b);
                c12966j0M74345c.m36447e(bundleM88963d);
                pendingIntentM36444b = c12966j0M74345c.m36444b();
            } else {
                C12966j0 c12966j0M74345c2 = m74345c(context);
                C12966j0.m36442f(c12966j0M74345c2, AbstractC17307e.f66562D2);
                pendingIntentM36444b = c12966j0M74345c2.m36444b();
            }
            NotificationCompat.Builder style = m74346d(context, 104).setContentIntent(pendingIntentM36444b).setContentTitle(c27712k0.getTitle()).setContentText(strM74353r).setDeleteIntent(pendingIntentM24516b).setStyle(new NotificationCompat.BigTextStyle().setBigContentTitle(c27712k0.getTitle()).bigText(strM74353r));
            AbstractC22676k.m65749i(style, "setStyle(...)");
            this.analyticsManager.m129082c(c27712k0.getStrapBodyStatus(), c27712k0.getExperimentVariant(), "sleep-and-stress-pn-off-body-experiment");
            Notification notificationBuild = style.build();
            AbstractC22676k.m65749i(notificationBuild, "build(...)");
            AbstractC25319b.m74344y(this, 104, notificationBuild, context, c27712k0.getTitle(), strM74353r, null, 32, null);
        } catch (Exception unused) {
            AbstractC3006f0.m8732z(getScope(), null, null, new b(dataMap, this, null), 3);
            throw new InvalidPushDataException(dataMap, "Unable to parse pushDataMap within StressMonitorPushNotification");
        }
    }

    @Override // m92.AbstractC25319b
    /* JADX INFO: renamed from: n, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }
}
