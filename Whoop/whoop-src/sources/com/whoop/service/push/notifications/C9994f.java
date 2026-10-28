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
import com.whoop.data.repositories.NotificationRepository;
import d92.C11819b;
import hi0.AbstractC17307e;
import hi0.AbstractC17312j;
import l83.C23454a0;
import m92.AbstractC25319b;
import m92.AbstractC25320c;
import m92.C25321d;
import m92.C25323f;
import o92.AbstractC27697d;
import o92.C27721s;
import org.json.JSONObject;
import p114eb.C12966j0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import we1.InterfaceC37217a;
import yp0.InterfaceC39700a;

/* JADX INFO: renamed from: com.whoop.service.push.notifications.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001\u0015B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006%"}, m65681d2 = {"Lcom/whoop/service/push/notifications/f;", "Lm92/b;", "Lo92/s;", "pushContext", "Lwe1/a;", "entitlementChecker", "Lyp0/a;", "communityAccessChecker", "<init>", "(Lo92/s;Lwe1/a;Lyp0/a;)V", "Landroid/content/Context;", "context", "", "sendingUserId", "receivingUserId", "Landroid/app/PendingIntent;", "B", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/app/PendingIntent;", "Lm92/f;", "dataMap", "Ll83/a0;", "a", "(Lm92/f;Landroid/content/Context;)V", "I", "Lwe1/a;", "J", "Lyp0/a;", "K", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "logTag", "", "C", "()Z", "isBeDrivenCommunityEnabled", "L", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C9994f extends AbstractC25319b {

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: M */
    public static final int f29574M = 8;

    /* JADX INFO: renamed from: N */
    private static final C3853d f29575N;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC37217a entitlementChecker;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC39700a communityAccessChecker;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: com.whoop.service.push.notifications.f$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\r¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/service/push/notifications/f$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/app/NotificationManager;", "manager", "Ll83/a0;", "a", "(Landroid/content/Context;Landroid/app/NotificationManager;)V", "", "CHANNEL_ID", "Ljava/lang/String;", "TITLE_KEY", "BODY_KEY", "NOTIFICATION_TYPE", "ACTION_OPEN_ACCEPTED_PUSH", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m24552a(Context context, NotificationManager manager) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(manager, "manager");
            C9994f.f29575N.m11806e(manager, context);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.push.notifications.f$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.push.notifications.FollowerInviteAcceptedPushNotification$perform$1", m100430f = "FollowerInviteAcceptedPushNotification.kt", m100431l = {82}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C9994f f29579E;

        /* JADX INFO: renamed from: w */
        Object f29580w;

        /* JADX INFO: renamed from: x */
        int f29581x;

        /* JADX INFO: renamed from: y */
        int f29582y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C25323f f29583z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C25323f c25323f, C9994f c9994f, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f29583z = c25323f;
            this.f29579E = c9994f;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f29583z, this.f29579E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f29582y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                String strM74370d = this.f29583z.m74370d();
                if (strM74370d != null) {
                    NotificationRepository notificationRepository = this.f29579E.getNotificationRepository();
                    PushNotificationMetricType pushNotificationMetricType = PushNotificationMetricType.FailedToDisplay;
                    this.f29580w = null;
                    this.f29581x = 0;
                    this.f29582y = 1;
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

    static {
        C3853d c3853dM11807f = AbstractC25319b.INSTANCE.m74357a("06550_Communities", AbstractC17312j.f67034x0).m11807f(AbstractC17312j.f67032w0);
        AbstractC22676k.m65749i(c3853dM11807f, "setChannelDescriptionResId(...)");
        f29575N = c3853dM11807f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9994f(C27721s pushContext, InterfaceC37217a entitlementChecker, InterfaceC39700a communityAccessChecker) {
        super(pushContext);
        AbstractC22676k.m65750j(pushContext, "pushContext");
        AbstractC22676k.m65750j(entitlementChecker, "entitlementChecker");
        AbstractC22676k.m65750j(communityAccessChecker, "communityAccessChecker");
        this.entitlementChecker = entitlementChecker;
        this.communityAccessChecker = communityAccessChecker;
        this.logTag = "FollowerInviteAcceptedPushNotification";
    }

    /* JADX INFO: renamed from: B */
    private final PendingIntent m24549B(Context context, String sendingUserId, String receivingUserId) {
        String string = new JSONObject().put("path", "followers-service/v1/followers-home").put("method", "GET").toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        Bundle bundle = new Bundle();
        bundle.putString("request", string);
        bundle.putString("selectedTab", "COMMUNITY");
        bundle.putString("onStartInteraction", AbstractC27697d.m83721a("open_accepted_push", sendingUserId, receivingUserId));
        C12966j0 c12966j0M74345c = m74345c(context);
        C12966j0.m36442f(c12966j0M74345c, AbstractC17307e.f66745g5);
        c12966j0M74345c.m36447e(bundle);
        return c12966j0M74345c.m36444b();
    }

    /* JADX INFO: renamed from: C */
    private final boolean m24550C() {
        return C25321d.f99318a.m74366a(getFeatureFlagChecker(), this.entitlementChecker);
    }

    @Override // m92.InterfaceC25322e
    /* JADX INFO: renamed from: a */
    public void mo24524a(C25323f dataMap, Context context) {
        PendingIntent pendingIntentM36444b;
        AbstractC22676k.m65750j(dataMap, "dataMap");
        AbstractC22676k.m65750j(context, "context");
        try {
            String strM74364g = AbstractC25320c.m74364g(dataMap);
            String strM74353r = m74353r(dataMap, "title");
            String strM74353r2 = m74353r(dataMap, "body");
            if (this.communityAccessChecker.mo31687a()) {
                pendingIntentM36444b = C11819b.f38415a.m31689b(m74345c(context));
            } else if (m24550C()) {
                pendingIntentM36444b = m24549B(context, dataMap.m74368b("sending_user_id"), dataMap.m74368b("receiving_user_id"));
            } else {
                C12966j0 c12966j0M74345c = m74345c(context);
                C12966j0.m36442f(c12966j0M74345c, AbstractC17307e.f66562D2);
                pendingIntentM36444b = c12966j0M74345c.m36444b();
            }
            NotificationCompat.Builder deleteIntent = m74346d(context, 121).setContentIntent(pendingIntentM36444b).setContentTitle(strM74353r).setContentText(strM74353r2).setStyle(new NotificationCompat.BigTextStyle().setBigContentTitle(strM74353r).bigText(strM74353r2)).setDeleteIntent(NotificationDismissedReceiver.Companion.m24516b(NotificationDismissedReceiver.INSTANCE, context, strM74364g, 134217728, 0, 8, null));
            AbstractC22676k.m65749i(deleteIntent, "setDeleteIntent(...)");
            f29575N.m11805a(deleteIntent);
            Notification notificationBuild = deleteIntent.build();
            AbstractC22676k.m65749i(notificationBuild, "build(...)");
            try {
                AbstractC25319b.m74344y(this, 121, notificationBuild, context, strM74353r, strM74353r2, null, 32, null);
            } catch (Exception unused) {
                AbstractC3006f0.m8732z(getScope(), null, null, new b(dataMap, this, null), 3);
            }
        } catch (Exception unused2) {
        }
    }

    @Override // m92.AbstractC25319b
    /* JADX INFO: renamed from: n, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }
}
