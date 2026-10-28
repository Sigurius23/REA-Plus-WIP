package com.whoop.service.push.notifications;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
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
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import we1.InterfaceC37217a;
import yp0.InterfaceC39700a;

/* JADX INFO: renamed from: com.whoop.service.push.notifications.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001\u001aB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ=\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010$\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006*"}, m65681d2 = {"Lcom/whoop/service/push/notifications/g;", "Lm92/b;", "Lo92/s;", "pushContext", "Lwe1/a;", "entitlementChecker", "Lyp0/a;", "communityAccessChecker", "<init>", "(Lo92/s;Lwe1/a;Lyp0/a;)V", "Landroid/content/Context;", "context", "", "inviteId", "", "sourceId", "sendingUserId", "receivingUserId", "Landroid/app/PendingIntent;", "B", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/app/PendingIntent;", "C", "(Landroid/content/Context;)Landroid/app/PendingIntent;", "Lm92/f;", "dataMap", "Ll83/a0;", "a", "(Lm92/f;Landroid/content/Context;)V", "I", "Lwe1/a;", "J", "Lyp0/a;", "K", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "logTag", "", "D", "()Z", "isBeDrivenCommunityEnabled", "L", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C9995g extends AbstractC25319b {

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: M */
    public static final int f29585M = 8;

    /* JADX INFO: renamed from: N */
    private static final C3853d f29586N;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC37217a entitlementChecker;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC39700a communityAccessChecker;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: com.whoop.service.push.notifications.g$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012R\u0014\u0010\u0018\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0012¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/service/push/notifications/g$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/app/NotificationManager;", "manager", "Ll83/a0;", "b", "(Landroid/content/Context;Landroid/app/NotificationManager;)V", "Lc12/d;", "SETTINGS", "Lc12/d;", "a", "()Lc12/d;", "", "CHANNEL_ID", "Ljava/lang/String;", "NOTIFICATION_TYPE", "COMMUNITY_TITLE_KEY", "COMMUNITY_BODY_KEY", "INVITE_ID_KEY", "QUERY_INVITE_ID", "QUERY_SOURCE_ID", "ACTION_OPEN_COMMUNITY_REQUEST_PUSH", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C3853d m24558a() {
            return C9995g.f29586N;
        }

        /* JADX INFO: renamed from: b */
        public final void m24559b(Context context, NotificationManager manager) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(manager, "manager");
            m24558a().m11806e(manager, context);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.push.notifications.g$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.push.notifications.FollowerInvitePushNotification$perform$1", m100430f = "FollowerInvitePushNotification.kt", m100431l = {95}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C9995g f29590E;

        /* JADX INFO: renamed from: w */
        Object f29591w;

        /* JADX INFO: renamed from: x */
        int f29592x;

        /* JADX INFO: renamed from: y */
        int f29593y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C25323f f29594z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C25323f c25323f, C9995g c9995g, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f29594z = c25323f;
            this.f29590E = c9995g;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f29594z, this.f29590E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f29593y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                String strM74370d = this.f29594z.m74370d();
                if (strM74370d != null) {
                    NotificationRepository notificationRepository = this.f29590E.getNotificationRepository();
                    PushNotificationMetricType pushNotificationMetricType = PushNotificationMetricType.FailedToDisplay;
                    this.f29591w = null;
                    this.f29592x = 0;
                    this.f29593y = 1;
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
        f29586N = c3853dM11807f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9995g(C27721s pushContext, InterfaceC37217a entitlementChecker, InterfaceC39700a communityAccessChecker) {
        super(pushContext);
        AbstractC22676k.m65750j(pushContext, "pushContext");
        AbstractC22676k.m65750j(entitlementChecker, "entitlementChecker");
        AbstractC22676k.m65750j(communityAccessChecker, "communityAccessChecker");
        this.entitlementChecker = entitlementChecker;
        this.communityAccessChecker = communityAccessChecker;
        this.logTag = "FollowerInvitePushNotification";
    }

    /* JADX INFO: renamed from: B */
    private final PendingIntent m24554B(Context context, int inviteId, String sourceId, String sendingUserId, String receivingUserId) {
        StringBuilder sb4 = new StringBuilder("followers-service/v1/followers-home");
        sb4.append("?inviteId=" + inviteId);
        if (sourceId != null) {
            sb4.append("&sourceId=" + Uri.encode(sourceId));
        }
        String string = new JSONObject().put("path", sb4.toString()).put("method", "GET").toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        Bundle bundle = new Bundle();
        bundle.putString("request", string);
        bundle.putString("selectedTab", "COMMUNITY");
        bundle.putString("onStartInteraction", AbstractC27697d.m83721a("open_community_request_push", sendingUserId, receivingUserId));
        C12966j0 c12966j0M74345c = m74345c(context);
        C12966j0.m36442f(c12966j0M74345c, AbstractC17307e.f66745g5);
        c12966j0M74345c.m36447e(bundle);
        return c12966j0M74345c.m36444b();
    }

    /* JADX INFO: renamed from: C */
    private final PendingIntent m24555C(Context context) {
        C12966j0 c12966j0M74345c = m74345c(context);
        C12966j0.m36442f(c12966j0M74345c, AbstractC17307e.f66562D2);
        return c12966j0M74345c.m36444b();
    }

    /* JADX INFO: renamed from: D */
    private final boolean m24556D() {
        return C25321d.f99318a.m74366a(getFeatureFlagChecker(), this.entitlementChecker);
    }

    @Override // m92.InterfaceC25322e
    /* JADX INFO: renamed from: a */
    public void mo24524a(C25323f dataMap, Context context) {
        PendingIntent pendingIntentM24554B;
        AbstractC22676k.m65750j(dataMap, "dataMap");
        AbstractC22676k.m65750j(context, "context");
        try {
            String strM74364g = AbstractC25320c.m74364g(dataMap);
            String strM74353r = m74353r(dataMap, "title");
            String strM74353r2 = m74353r(dataMap, "body");
            int iM74349j = m74349j(dataMap, "invite_id");
            if (this.communityAccessChecker.mo31687a()) {
                pendingIntentM24554B = C11819b.f38415a.m31689b(m74345c(context));
            } else {
                pendingIntentM24554B = m24556D() ? m24554B(context, iM74349j, dataMap.m74370d(), dataMap.m74368b("sending_user_id"), dataMap.m74368b("receiving_user_id")) : m24555C(context);
            }
            NotificationCompat.Builder deleteIntent = m74346d(context, 124).setContentIntent(pendingIntentM24554B).setContentTitle(strM74353r).setContentText(strM74353r2).setStyle(new NotificationCompat.BigTextStyle().setBigContentTitle(strM74353r).bigText(strM74353r2)).setDeleteIntent(NotificationDismissedReceiver.Companion.m24516b(NotificationDismissedReceiver.INSTANCE, context, strM74364g, 134217728, 0, 8, null));
            AbstractC22676k.m65749i(deleteIntent, "setDeleteIntent(...)");
            f29586N.m11805a(deleteIntent);
            Notification notificationBuild = deleteIntent.build();
            AbstractC22676k.m65749i(notificationBuild, "build(...)");
            AbstractC25319b.m74344y(this, 124, notificationBuild, context, strM74353r, strM74353r2, null, 32, null);
        } catch (Exception e5) {
            m74350l().mo85230v("Failed to build or show FollowerInvite notification", e5, new AbstractC30556a.a[0]);
            AbstractC3006f0.m8732z(getScope(), null, null, new b(dataMap, this, null), 3);
        }
    }

    @Override // m92.AbstractC25319b
    /* JADX INFO: renamed from: n, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }
}
