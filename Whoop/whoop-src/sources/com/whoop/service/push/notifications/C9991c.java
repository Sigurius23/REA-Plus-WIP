package com.whoop.service.push.notifications;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.remote.domain.dto.PushNotificationMetricType;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.NotificationRepository;
import com.whoop.p069ui.home.redesign.view.MainActivity;
import iy1.InterfaceC21030c;
import jy1.C22047a;
import l83.C23454a0;
import m92.AbstractC25319b;
import m92.AbstractC25320c;
import m92.C25323f;
import o92.C27721s;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: com.whoop.service.push.notifications.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, m65681d2 = {"Lcom/whoop/service/push/notifications/c;", "Lm92/b;", "Lo92/s;", "pushContext", "Liy1/c;", "metricWriter", "<init>", "(Lo92/s;Liy1/c;)V", "Landroid/content/Context;", "context", "", "channelId", "channelName", "Ll83/a0;", "B", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "deeplink", "sourceId", "Landroid/app/PendingIntent;", "A", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/app/PendingIntent;", "Lm92/f;", "dataMap", "C", "(Lm92/f;)V", "a", "(Lm92/f;Landroid/content/Context;)V", "I", "Liy1/c;", "J", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "logTag", "K", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C9991c extends AbstractC25319b {

    /* JADX INFO: renamed from: L */
    public static final int f29532L = 8;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: com.whoop.service.push.notifications.c$b */
    @InterfaceC32271e(m100429c = "com.whoop.service.push.notifications.ArchV2GenericNotification$sendFailedMetric$1", m100430f = "ArchV2GenericNotification.kt", m100431l = {210}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C9991c f29535E;

        /* JADX INFO: renamed from: w */
        Object f29536w;

        /* JADX INFO: renamed from: x */
        int f29537x;

        /* JADX INFO: renamed from: y */
        int f29538y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C25323f f29539z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C25323f c25323f, C9991c c9991c, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f29539z = c25323f;
            this.f29535E = c9991c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f29539z, this.f29535E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f29538y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                String strM74370d = this.f29539z.m74370d();
                if (strM74370d != null) {
                    NotificationRepository notificationRepository = this.f29535E.getNotificationRepository();
                    PushNotificationMetricType pushNotificationMetricType = PushNotificationMetricType.FailedToDisplay;
                    this.f29536w = null;
                    this.f29537x = 0;
                    this.f29538y = 1;
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
    public C9991c(C27721s pushContext, InterfaceC21030c metricWriter) {
        super(pushContext);
        AbstractC22676k.m65750j(pushContext, "pushContext");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        this.metricWriter = metricWriter;
        this.logTag = "ArchV2GenericNotification";
    }

    /* JADX INFO: renamed from: A */
    private final PendingIntent m24531A(Context context, String deeplink, String sourceId, String channelId) {
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(deeplink));
        intent.setFlags(335544320);
        intent.putExtra("push_source_id", sourceId);
        intent.putExtra("push_type", "GENERIC");
        intent.putExtra("push_channel_id", channelId);
        PendingIntent activity = PendingIntent.getActivity(context, sourceId.hashCode(), intent, 201326592);
        AbstractC22676k.m65749i(activity, "getActivity(...)");
        return activity;
    }

    /* JADX INFO: renamed from: B */
    private final void m24532B(Context context, String channelId, String channelName) {
        NotificationChannel notificationChannel = new NotificationChannel(channelId, channelName, 4);
        notificationChannel.enableVibration(true);
        notificationChannel.enableLights(true);
        notificationChannel.setShowBadge(true);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
    }

    /* JADX INFO: renamed from: C */
    private final void m24533C(C25323f dataMap) {
        AbstractC3006f0.m8732z(getScope(), null, null, new b(dataMap, this, null), 3);
    }

    @Override // m92.InterfaceC25322e
    /* JADX INFO: renamed from: a */
    public void mo24524a(C25323f dataMap, Context context) {
        C9991c c9991c;
        AbstractC22676k.m65750j(dataMap, "dataMap");
        AbstractC22676k.m65750j(context, "context");
        if (!getFeatureFlagChecker().isFeatureEnabled(FeatureFlagRepositoryKt.GENERIC_PUSH_NOTIFICATIONS_ENABLED)) {
            getCrashReporter().mo98631p(new IllegalStateException("Generic push dropped: generic-push-notifications-enabled is off"));
            return;
        }
        try {
            String strM74364g = AbstractC25320c.m74364g(dataMap);
            String strM74353r = m74353r(dataMap, "title");
            String strM74353r2 = m74353r(dataMap, "body");
            String strM74353r3 = m74353r(dataMap, "source_id");
            String strM74353r4 = m74353r(dataMap, "deep_link");
            String strM74353r5 = m74353r(dataMap, "channel_id");
            m24532B(context, strM74353r5, m74353r(dataMap, "channel_name"));
            NotificationCompat.Builder defaults = AbstractC25319b.m74341e(this, context, null, 2, null).setContentTitle(strM74353r).setContentText(strM74353r2).setStyle(new NotificationCompat.BigTextStyle().setBigContentTitle(strM74353r).bigText(strM74353r2)).setContentIntent(m24531A(context, strM74353r4, strM74353r3, strM74353r5)).setDeleteIntent(NotificationDismissedReceiver.INSTANCE.m24517a(context, strM74364g + ":" + strM74353r3, 134217728, strM74353r3.hashCode())).setChannelId(strM74353r5).setPriority(1).setDefaults(7);
            AbstractC22676k.m65749i(defaults, "setDefaults(...)");
            Notification notificationBuild = defaults.build();
            AbstractC22676k.m65749i(notificationBuild, "build(...)");
            c9991c = this;
            try {
                c9991c.m74356w(126, notificationBuild, context, strM74353r, strM74353r2, strM74353r3);
            } catch (Exception unused) {
                String strM74368b = dataMap.m74368b("source_id");
                if (strM74368b == null) {
                    strM74368b = "unknown";
                }
                String strM74368b2 = dataMap.m74368b("channel_id");
                m74350l().mo85216g(AbstractC2875y.m8300m("Push Notification with [id=", strM74368b, "] [type=GENERIC] [channel_id=", strM74368b2 != null ? strM74368b2 : "unknown", "] failed to open - Failed to parse notification payload"), new AbstractC30556a.a[0]);
                c9991c.metricWriter.mo58701b(new C22047a(0, "push.processing_error", null, AbstractC37056f.m118958J("notification_type:GENERIC"), null, 21, null));
                m24533C(dataMap);
            }
        } catch (Exception unused2) {
            c9991c = this;
        }
    }

    @Override // m92.AbstractC25319b
    /* JADX INFO: renamed from: n, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }
}
