package com.whoop.service.push.notifications;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c12.C3853d;
import c93.InterfaceC4351m;
import com.whoop.data.remote.domain.dto.PushNotificationMetricType;
import com.whoop.data.repositories.NotificationRepository;
import com.whoop.p069ui.home.redesign.view.MainActivity;
import com.whoop.service.push.InvalidPushDataException;
import hi0.AbstractC17312j;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import l83.C23454a0;
import m92.AbstractC25319b;
import m92.AbstractC25320c;
import m92.C25323f;
import m92.C25324g;
import o92.C27721s;
import org.json.JSONException;
import org.json.JSONObject;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: com.whoop.service.push.notifications.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m65681d2 = {"Lcom/whoop/service/push/notifications/h;", "Lm92/b;", "Lo92/s;", "pushContext", "<init>", "(Lo92/s;)V", "Lm92/f;", "dataMap", "Landroid/content/Context;", "context", "Landroid/app/PendingIntent;", "B", "(Lm92/f;Landroid/content/Context;)Landroid/app/PendingIntent;", "Ll83/a0;", "C", "(Lm92/f;)V", "a", "(Lm92/f;Landroid/content/Context;)V", "", "I", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "logTag", "J", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C9996h extends AbstractC25319b {

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: K */
    public static final int f29596K = 8;

    /* JADX INFO: renamed from: L */
    private static final C3853d f29597L = AbstractC25319b.INSTANCE.m74357a("06800_GpsInsights", AbstractC17312j.f67036y0);

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: com.whoop.service.push.notifications.h$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\r¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/service/push/notifications/h$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/app/NotificationManager;", "manager", "Ll83/a0;", "a", "(Landroid/content/Context;Landroid/app/NotificationManager;)V", "", "CHANNEL_ID", "Ljava/lang/String;", "Lc12/d;", "SETTINGS", "Lc12/d;", "NOTIFICATION_TYPE", "NOTIFICATION_TITLE_KEY", "NOTIFICATION_BODY_KEY", "META_DATA_KEY", "DESTINATION_KEY", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m24564a(Context context, NotificationManager manager) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(manager, "manager");
            C9996h.f29597L.m11806e(manager, context);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.push.notifications.h$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.push.notifications.GpsInsightsPushNotification$sendPushNotificationMetric$1", m100430f = "GpsInsightsPushNotification.kt", m100431l = {AttachmentConstants.MAX_UPLOAD_SIZE_IN_MB}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C9996h f29599E;

        /* JADX INFO: renamed from: w */
        Object f29600w;

        /* JADX INFO: renamed from: x */
        int f29601x;

        /* JADX INFO: renamed from: y */
        int f29602y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C25323f f29603z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C25323f c25323f, C9996h c9996h, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f29603z = c25323f;
            this.f29599E = c9996h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f29603z, this.f29599E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f29602y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                String strM74370d = this.f29603z.m74370d();
                if (strM74370d != null) {
                    NotificationRepository notificationRepository = this.f29599E.getNotificationRepository();
                    PushNotificationMetricType pushNotificationMetricType = PushNotificationMetricType.FailedToDisplay;
                    this.f29600w = null;
                    this.f29601x = 0;
                    this.f29602y = 1;
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
    public C9996h(C27721s pushContext) {
        super(pushContext);
        AbstractC22676k.m65750j(pushContext, "pushContext");
        this.logTag = "GpsInsightsPushNotification";
    }

    /* JADX INFO: renamed from: B */
    private final PendingIntent m24561B(C25323f dataMap, Context context) throws JSONException, InvalidPushDataException {
        String strM74368b = dataMap.m74368b("meta_data");
        if (strM74368b == null) {
            throw new InvalidPushDataException(dataMap, "meta_data is missing");
        }
        String string = new JSONObject(strM74368b).getJSONObject("destination").toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        Uri uriM74371a = C25324g.f99321a.m74371a(string);
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.setData(uriM74371a);
        PendingIntent activity = PendingIntent.getActivity(context, 120, intent, 201326592);
        AbstractC22676k.m65749i(activity, "getActivity(...)");
        return activity;
    }

    /* JADX INFO: renamed from: C */
    private final void m24562C(C25323f dataMap) {
        AbstractC3006f0.m8732z(getScope(), null, null, new b(dataMap, this, null), 3);
    }

    @Override // m92.InterfaceC25322e
    /* JADX INFO: renamed from: a */
    public void mo24524a(C25323f dataMap, Context context) throws InvalidPushDataException {
        AbstractC22676k.m65750j(dataMap, "dataMap");
        AbstractC22676k.m65750j(context, "context");
        try {
            String strM74364g = AbstractC25320c.m74364g(dataMap);
            if (!AbstractC22676k.m65745e(strM74364g, "TimezoneChangeSleepInsight")) {
                m24562C(dataMap);
                throw new InvalidPushDataException(dataMap, "Unrecognized notification type sent to GpsInsightsPushNotification");
            }
            String strM74353r = m74353r(dataMap, "title");
            String strM74353r2 = m74353r(dataMap, "body");
            PendingIntent pendingIntentM24561B = m24561B(dataMap, context);
            NotificationCompat.Builder deleteIntent = m74346d(context, 120).setContentIntent(pendingIntentM24561B).setContentTitle(strM74353r).setContentText(strM74353r2).setStyle(new NotificationCompat.BigTextStyle().setBigContentTitle(strM74353r).bigText(strM74353r2)).setDeleteIntent(NotificationDismissedReceiver.Companion.m24516b(NotificationDismissedReceiver.INSTANCE, context, strM74364g, 134217728, 0, 8, null));
            AbstractC22676k.m65749i(deleteIntent, "setDeleteIntent(...)");
            f29597L.m11805a(deleteIntent);
            Notification notificationBuild = deleteIntent.build();
            AbstractC22676k.m65749i(notificationBuild, "build(...)");
            AbstractC25319b.m74344y(this, 120, notificationBuild, context, strM74353r, strM74353r2, null, 32, null);
        } catch (Exception e5) {
            m74350l().mo85230v("GPS Insights notification failed", e5, new AbstractC30556a.a[0]);
            m24562C(dataMap);
            throw new InvalidPushDataException(dataMap, "Unable to parse pushDataMap within GpsInsightsPushNotification");
        }
    }

    @Override // m92.AbstractC25319b
    /* JADX INFO: renamed from: n, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }
}
