package com.whoop.service.push.notifications;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c12.C3853d;
import c93.InterfaceC4351m;
import com.whoop.data.remote.domain.dto.PushNotificationMetricType;
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
import o92.C27721s;
import p114eb.C12966j0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: com.whoop.service.push.notifications.n */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/service/push/notifications/n;", "Lm92/b;", "Lo92/s;", "pushContext", "<init>", "(Lo92/s;)V", "Lm92/f;", "dataMap", "Landroid/content/Context;", "context", "Ll83/a0;", "a", "(Lm92/f;Landroid/content/Context;)V", "", "I", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "logTag", "J", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C10002n extends AbstractC25319b {

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: K */
    public static final int f29709K = 8;

    /* JADX INFO: renamed from: L */
    public static final C3853d f29710L = AbstractC25319b.INSTANCE.m74357a("06625_WhoopLabs", AbstractC17312j.f66927G0);

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: com.whoop.service.push.notifications.n$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u0014\u0010\u0016\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\r¨\u0006\u0017"}, m65681d2 = {"Lcom/whoop/service/push/notifications/n$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/app/NotificationManager;", "manager", "Ll83/a0;", "a", "(Landroid/content/Context;Landroid/app/NotificationManager;)V", "", "CHANNEL_ID", "Ljava/lang/String;", "Lc12/d;", "SETTINGS", "Lc12/d;", "NOTIFICATION_BODY_KEY", "NOTIFICATION_TITLE_KEY", "NOTIFICATION_CAMPAIGN_KEY", "NOTIFICATION_SESSION_KEY", "NOTIFICATION_TYPE", "NOTIFICATION_TYPE_THANK_YOU", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m24602a(Context context, NotificationManager manager) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(manager, "manager");
            C10002n.f29710L.m11806e(manager, context);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.push.notifications.n$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.push.notifications.WhoopLabsPushNotification$perform$2", m100430f = "WhoopLabsPushNotification.kt", m100431l = {88}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C10002n f29712E;

        /* JADX INFO: renamed from: w */
        Object f29713w;

        /* JADX INFO: renamed from: x */
        int f29714x;

        /* JADX INFO: renamed from: y */
        int f29715y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C25323f f29716z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C25323f c25323f, C10002n c10002n, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f29716z = c25323f;
            this.f29712E = c10002n;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f29716z, this.f29712E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f29715y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                String strM74370d = this.f29716z.m74370d();
                if (strM74370d != null) {
                    NotificationRepository notificationRepository = this.f29712E.getNotificationRepository();
                    PushNotificationMetricType pushNotificationMetricType = PushNotificationMetricType.FailedToDisplay;
                    this.f29713w = null;
                    this.f29714x = 0;
                    this.f29715y = 1;
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

    /* JADX INFO: renamed from: com.whoop.service.push.notifications.n$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.push.notifications.WhoopLabsPushNotification$perform$3", m100430f = "WhoopLabsPushNotification.kt", m100431l = {96}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C10002n f29717E;

        /* JADX INFO: renamed from: w */
        Object f29718w;

        /* JADX INFO: renamed from: x */
        int f29719x;

        /* JADX INFO: renamed from: y */
        int f29720y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C25323f f29721z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C25323f c25323f, C10002n c10002n, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f29721z = c25323f;
            this.f29717E = c10002n;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f29721z, this.f29717E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f29720y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                String strM74370d = this.f29721z.m74370d();
                if (strM74370d != null) {
                    NotificationRepository notificationRepository = this.f29717E.getNotificationRepository();
                    PushNotificationMetricType pushNotificationMetricType = PushNotificationMetricType.FailedToDisplay;
                    this.f29718w = null;
                    this.f29719x = 0;
                    this.f29720y = 1;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10002n(C27721s pushContext) {
        super(pushContext);
        AbstractC22676k.m65750j(pushContext, "pushContext");
        this.logTag = "WhoopLabsPushNotification";
    }

    @Override // m92.InterfaceC25322e
    /* JADX INFO: renamed from: a */
    public void mo24524a(C25323f dataMap, Context context) throws InvalidPushDataException {
        AbstractC22676k.m65750j(dataMap, "dataMap");
        AbstractC22676k.m65750j(context, "context");
        String strM74364g = AbstractC25320c.m74364g(dataMap);
        if (!AbstractC22676k.m65745e(strM74364g, "whoop_labs") && !AbstractC22676k.m65745e(strM74364g, "Study Completed")) {
            AbstractC3006f0.m8732z(getScope(), null, null, new c(dataMap, this, null), 3);
            throw new InvalidPushDataException(dataMap, "Unrecognized notification type sent to WhoopLabsPushNotification");
        }
        try {
            String strM74368b = dataMap.m74368b("title");
            if (strM74368b == null) {
                strM74368b = context.getString(AbstractC17312j.f66927G0);
                AbstractC22676k.m65749i(strM74368b, "getString(...)");
            }
            String str = strM74368b;
            String strM74353r = m74353r(dataMap, "body");
            String strM74368b2 = dataMap.m74368b("campaignId");
            Integer numM125932Q = strM74368b2 != null ? AbstractC39421y.m125932Q(strM74368b2) : null;
            String strM74368b3 = dataMap.m74368b("sessionId");
            int i13 = AbstractC17307e.f66787m5;
            PendingIntent pendingIntentM24516b = NotificationDismissedReceiver.Companion.m24516b(NotificationDismissedReceiver.INSTANCE, context, strM74364g, 134217728, 0, 8, null);
            C12966j0 c12966j0M74345c = m74345c(context);
            C12966j0.m36442f(c12966j0M74345c, i13);
            if (numM125932Q != null) {
                c12966j0M74345c.m36447e(AbstractC12889b.m36273g(new C23465k("campaignId", numM125932Q), new C23465k("sessionId", strM74368b3)));
            }
            NotificationCompat.Builder style = m74346d(context, 109).setContentIntent(c12966j0M74345c.m36444b()).setContentTitle(str).setContentText(strM74353r).setDeleteIntent(pendingIntentM24516b).setStyle(new NotificationCompat.BigTextStyle().setBigContentTitle(str).bigText(strM74353r));
            AbstractC22676k.m65749i(style, "setStyle(...)");
            f29710L.m11805a(style);
            Notification notificationBuild = style.build();
            AbstractC22676k.m65749i(notificationBuild, "build(...)");
            AbstractC25319b.m74344y(this, 109, notificationBuild, context, str, strM74353r, null, 32, null);
        } catch (Exception unused) {
            AbstractC3006f0.m8732z(getScope(), null, null, new b(dataMap, this, null), 3);
            throw new InvalidPushDataException(dataMap, "Unable to parse pushDataMap within WhoopLabsPushNotification");
        }
    }

    @Override // m92.AbstractC25319b
    /* JADX INFO: renamed from: n, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }
}
