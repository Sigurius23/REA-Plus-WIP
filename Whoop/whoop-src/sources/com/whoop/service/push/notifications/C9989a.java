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
import com.whoop.navigation.AppScreen;
import com.whoop.service.push.InvalidPushDataException;
import e93.AbstractC12889b;
import hi0.AbstractC17312j;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.media.tracks.HMSTrackSource;
import m92.AbstractC25319b;
import m92.AbstractC25320c;
import m92.C25323f;
import ma0.AbstractC25368b;
import o92.C27721s;
import org.json.JSONObject;
import p114eb.C12966j0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: com.whoop.service.push.notifications.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0096D¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/service/push/notifications/a;", "Lm92/b;", "Lo92/s;", "pushContext", "<init>", "(Lo92/s;)V", "Lm92/f;", "dataMap", "Landroid/content/Context;", "context", "Landroid/app/PendingIntent;", "B", "(Lm92/f;Landroid/content/Context;)Landroid/app/PendingIntent;", "D", "C", "(Landroid/content/Context;)Landroid/app/PendingIntent;", "Ll83/a0;", "E", "(Lm92/f;)V", "a", "(Lm92/f;Landroid/content/Context;)V", "", "I", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "logTag", "J", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C9989a extends AbstractC25319b {

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: K */
    public static final int f29516K = 8;

    /* JADX INFO: renamed from: L */
    private static final C3853d f29517L = AbstractC25319b.INSTANCE.m74357a("06700_AdvancedLabs", AbstractC17312j.f67030v0);

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: com.whoop.service.push.notifications.a$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u0014\u0010\u0016\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\rR\u0014\u0010\u0017\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\r¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/service/push/notifications/a$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/app/NotificationManager;", "manager", "Ll83/a0;", "a", "(Landroid/content/Context;Landroid/app/NotificationManager;)V", "", "CHANNEL_ID", "Ljava/lang/String;", "Lc12/d;", "SETTINGS", "Lc12/d;", "NOTIFICATION_TYPE", "NOTIFICATION_TITLE_KEY", "NOTIFICATION_BODY_KEY", "META_DATA_KEY", "NAVIGATION_KEY", "SCREEN_KEY", "PARAMETERS_KEY", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m24526a(Context context, NotificationManager manager) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(manager, "manager");
            C9989a.f29517L.m11806e(manager, context);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.push.notifications.a$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.push.notifications.AdvancedLabsUploadPushNotification$sendPushNotificationMetric$1", m100430f = "AdvancedLabsUploadPushNotification.kt", m100431l = {122}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C9989a f29519E;

        /* JADX INFO: renamed from: w */
        Object f29520w;

        /* JADX INFO: renamed from: x */
        int f29521x;

        /* JADX INFO: renamed from: y */
        int f29522y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C25323f f29523z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C25323f c25323f, C9989a c9989a, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f29523z = c25323f;
            this.f29519E = c9989a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f29523z, this.f29519E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f29522y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                String strM74370d = this.f29523z.m74370d();
                if (strM74370d != null) {
                    NotificationRepository notificationRepository = this.f29519E.getNotificationRepository();
                    PushNotificationMetricType pushNotificationMetricType = PushNotificationMetricType.FailedToDisplay;
                    this.f29520w = null;
                    this.f29521x = 0;
                    this.f29522y = 1;
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
    public C9989a(C27721s pushContext) {
        super(pushContext);
        AbstractC22676k.m65750j(pushContext, "pushContext");
        this.logTag = "AdvancedLabsUploadPushNotification";
    }

    /* JADX INFO: renamed from: B */
    private final PendingIntent m24519B(C25323f dataMap, Context context) {
        PendingIntent pendingIntentM24521D = m24521D(dataMap, context);
        return pendingIntentM24521D == null ? m24520C(context) : pendingIntentM24521D;
    }

    /* JADX INFO: renamed from: C */
    private final PendingIntent m24520C(Context context) {
        C12966j0 c12966j0M74345c = m74345c(context);
        C12966j0.m36442f(c12966j0M74345c, AbstractC25368b.f99428a);
        return c12966j0M74345c.m36444b();
    }

    /* JADX INFO: renamed from: D */
    private final PendingIntent m24521D(C25323f dataMap, Context context) {
        String strOptString;
        try {
            String strM74368b = dataMap.m74368b(NotificationCompat.CATEGORY_NAVIGATION);
            if (strM74368b != null) {
                JSONObject jSONObject = new JSONObject(strM74368b);
                String strOptString2 = jSONObject.optString(HMSTrackSource.SCREEN);
                if (AbstractC22676k.m65745e(strOptString2, AppScreen.C9280c0.f27514w.getName())) {
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("parameters");
                    if (jSONObjectOptJSONObject != null && (strOptString = jSONObjectOptJSONObject.optString("test_id")) != null) {
                        boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("is_ai_confirmation");
                        C12966j0 c12966j0M74345c = m74345c(context);
                        C12966j0.m36442f(c12966j0M74345c, AbstractC25368b.f99429b);
                        c12966j0M74345c.m36447e(AbstractC12889b.m36273g(new C23465k("test_id", strOptString), new C23465k("is_ai_confirmation", Boolean.valueOf(zOptBoolean))));
                        return c12966j0M74345c.m36444b();
                    }
                } else if (AbstractC22676k.m65745e(strOptString2, AppScreen.C9416t0.f27932w.getName())) {
                    C12966j0 c12966j0M74345c2 = m74345c(context);
                    C12966j0.m36442f(c12966j0M74345c2, AbstractC25368b.f99430c);
                    return c12966j0M74345c2.m36444b();
                }
            }
            return null;
        } catch (Exception e5) {
            m74350l().mo85213c("Failed to parse navigation from meta_data, falling back to Advanced Labs home", e5, new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: E */
    private final void m24522E(C25323f dataMap) {
        AbstractC3006f0.m8732z(getScope(), null, null, new b(dataMap, this, null), 3);
    }

    @Override // m92.InterfaceC25322e
    /* JADX INFO: renamed from: a */
    public void mo24524a(C25323f dataMap, Context context) throws InvalidPushDataException {
        AbstractC22676k.m65750j(dataMap, "dataMap");
        AbstractC22676k.m65750j(context, "context");
        try {
            String strM74364g = AbstractC25320c.m74364g(dataMap);
            if (!AbstractC22676k.m65745e(strM74364g, "BloodworkImageUploadReview")) {
                m24522E(dataMap);
                throw new InvalidPushDataException(dataMap, "Unrecognized notification type sent to AdvancedLabsUploadPushNotification");
            }
            String strM74353r = m74353r(dataMap, "title");
            String strM74353r2 = m74353r(dataMap, "body");
            PendingIntent pendingIntentM24519B = m24519B(dataMap, context);
            NotificationCompat.Builder deleteIntent = m74346d(context, 116).setContentIntent(pendingIntentM24519B).setContentTitle(strM74353r).setContentText(strM74353r2).setStyle(new NotificationCompat.BigTextStyle().setBigContentTitle(strM74353r).bigText(strM74353r2)).setDeleteIntent(NotificationDismissedReceiver.Companion.m24516b(NotificationDismissedReceiver.INSTANCE, context, strM74364g, 134217728, 0, 8, null));
            AbstractC22676k.m65749i(deleteIntent, "setDeleteIntent(...)");
            f29517L.m11805a(deleteIntent);
            Notification notificationBuild = deleteIntent.build();
            AbstractC22676k.m65749i(notificationBuild, "build(...)");
            AbstractC25319b.m74344y(this, 116, notificationBuild, context, strM74353r, strM74353r2, null, 32, null);
        } catch (Exception e5) {
            m74350l().mo85230v("Advanced Labs upload notification failed", e5, new AbstractC30556a.a[0]);
            m24522E(dataMap);
            throw new InvalidPushDataException(dataMap, "Unable to parse pushDataMap within AdvancedLabsUploadPushNotification");
        }
    }

    @Override // m92.AbstractC25319b
    /* JADX INFO: renamed from: n, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }
}
