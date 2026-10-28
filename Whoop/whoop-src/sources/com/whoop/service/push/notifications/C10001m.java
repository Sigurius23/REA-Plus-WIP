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
import com.whoop.domain.model.User;
import com.whoop.domain.model.teams.Team;
import com.whoop.domain.model.teams.TeamType;
import com.whoop.service.push.InvalidPushDataException;
import cq0.C11059g;
import d92.C11819b;
import hi0.AbstractC17312j;
import l83.C23454a0;
import m92.AbstractC25318a;
import m92.AbstractC25319b;
import m92.AbstractC25320c;
import m92.C25323f;
import o92.C27721s;
import od1.C27858u;
import p114eb.C12966j0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import xp0.AbstractC38499a0;
import xp0.C38508f;
import yp0.InterfaceC39700a;

/* JADX INFO: renamed from: com.whoop.service.push.notifications.m */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001\u0016B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010#\u001a\u00020\u001e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u001e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b$\u0010 R\u0014\u0010'\u001a\u00020\u001e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b&\u0010 R\u0014\u0010)\u001a\u00020\u001e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b(\u0010 ¨\u0006+"}, m65681d2 = {"Lcom/whoop/service/push/notifications/m;", "Lm92/a;", "Lo92/s;", "pushContext", "Lcq0/g;", "teamsRepository", "Lod1/u;", "userContext", "Lyp0/a;", "communityAccessChecker", "<init>", "(Lo92/s;Lcq0/g;Lod1/u;Lyp0/a;)V", "", "teamId", "Lcom/whoop/domain/model/teams/Team;", "H", "(ILq83/d;)Ljava/lang/Object;", "Lm92/f;", "dataMap", "Landroid/content/Context;", "context", "Ll83/a0;", "a", "(Lm92/f;Landroid/content/Context;)V", "I", "Lcq0/g;", "J", "Lod1/u;", "K", "Lyp0/a;", "", "L", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "logTag", "M", "communityIdKey", "N", "communityTitleKey", "O", "communityBodyKey", "P", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C10001m extends AbstractC25318a {

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: Q */
    public static final int f29680Q = 8;

    /* JADX INFO: renamed from: R */
    private static final C3853d f29681R;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final C11059g teamsRepository;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final C27858u userContext;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC39700a communityAccessChecker;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final String communityIdKey;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final String communityTitleKey;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final String communityBodyKey;

    /* JADX INFO: renamed from: com.whoop.service.push.notifications.m$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/service/push/notifications/m$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/app/NotificationManager;", "manager", "Ll83/a0;", "b", "(Landroid/content/Context;Landroid/app/NotificationManager;)V", "Lc12/d;", "SETTINGS", "Lc12/d;", "a", "()Lc12/d;", "", "CHANNEL_ID", "Ljava/lang/String;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C3853d m24599a() {
            return C10001m.f29681R;
        }

        /* JADX INFO: renamed from: b */
        public final void m24600b(Context context, NotificationManager manager) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(manager, "manager");
            m24599a().m11806e(manager, context);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.push.notifications.m$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.push.notifications.TeamOwnershipPushNotification$perform$1", m100430f = "TeamOwnershipPushNotification.kt", m100431l = {68}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C25323f f29689E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ int f29690F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ String f29691G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ String f29692H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ PendingIntent f29693I;

        /* JADX INFO: renamed from: w */
        int f29694w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f29696y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Context f29697z;

        /* JADX INFO: renamed from: com.whoop.service.push.notifications.m$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.service.push.notifications.TeamOwnershipPushNotification$perform$1$clickIntent$1", m100430f = "TeamOwnershipPushNotification.kt", m100431l = {83}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ C10001m f29698E;

            /* JADX INFO: renamed from: w */
            Object f29699w;

            /* JADX INFO: renamed from: x */
            int f29700x;

            /* JADX INFO: renamed from: y */
            int f29701y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C25323f f29702z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C25323f c25323f, C10001m c10001m, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f29702z = c25323f;
                this.f29698E = c10001m;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f29702z, this.f29698E, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f29701y;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    String strM74370d = this.f29702z.m74370d();
                    if (strM74370d != null) {
                        NotificationRepository notificationRepository = this.f29698E.getNotificationRepository();
                        PushNotificationMetricType pushNotificationMetricType = PushNotificationMetricType.FailedToOpen;
                        this.f29699w = null;
                        this.f29700x = 0;
                        this.f29701y = 1;
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
        public b(int i13, Context context, C25323f c25323f, int i14, String str, String str2, PendingIntent pendingIntent, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f29696y = i13;
            this.f29697z = context;
            this.f29689E = c25323f;
            this.f29690F = i14;
            this.f29691G = str;
            this.f29692H = str2;
            this.f29693I = pendingIntent;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C10001m.this.new b(this.f29696y, this.f29697z, this.f29689E, this.f29690F, this.f29691G, this.f29692H, this.f29693I, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            PendingIntent pendingIntentM36444b;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f29694w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C10001m c10001m = C10001m.this;
                int i14 = this.f29696y;
                this.f29694w = 1;
                obj = c10001m.m24598H(i14, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            Team team = (Team) obj;
            if (C10001m.this.communityAccessChecker.mo31687a()) {
                pendingIntentM36444b = C11819b.f38415a.m31689b(C10001m.this.m74345c(this.f29697z));
            } else if (team != null) {
                C12966j0 c12966j0M74345c = C10001m.this.m74345c(this.f29697z);
                C12966j0.m36442f(c12966j0M74345c, AbstractC38499a0.f165068G0);
                c12966j0M74345c.m36447e(new C38508f.a(0, "DAILY").m123414d(team).m123413c(this.f29689E.m74370d()).m123411a().m123410j());
                pendingIntentM36444b = c12966j0M74345c.m36444b();
            } else {
                AbstractC3006f0.m8732z(C10001m.this.getScope(), null, null, new a(this.f29689E, C10001m.this, null), 3);
                C12966j0 c12966j0M74345c2 = C10001m.this.m74345c(this.f29697z);
                C12966j0.m36442f(c12966j0M74345c2, AbstractC38499a0.f165077H0);
                pendingIntentM36444b = c12966j0M74345c2.m36444b();
            }
            NotificationCompat.Builder deleteIntent = C10001m.this.m74346d(this.f29697z, new Integer(this.f29690F)).setContentIntent(pendingIntentM36444b).setContentTitle(this.f29691G).setContentText(this.f29692H).setStyle(new NotificationCompat.BigTextStyle().setBigContentTitle(this.f29691G).bigText(this.f29692H)).setDeleteIntent(this.f29693I);
            AbstractC22676k.m65749i(deleteIntent, "setDeleteIntent(...)");
            C10001m.INSTANCE.m24599a().m11805a(deleteIntent);
            C10001m c10001m2 = C10001m.this;
            int i15 = this.f29690F;
            Notification notificationBuild = deleteIntent.build();
            AbstractC22676k.m65749i(notificationBuild, "build(...)");
            AbstractC25319b.m74344y(c10001m2, i15, notificationBuild, this.f29697z, this.f29691G, this.f29692H, null, 32, null);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.push.notifications.m$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.push.notifications.TeamOwnershipPushNotification$perform$2", m100430f = "TeamOwnershipPushNotification.kt", m100431l = {107}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C10001m f29703E;

        /* JADX INFO: renamed from: w */
        Object f29704w;

        /* JADX INFO: renamed from: x */
        int f29705x;

        /* JADX INFO: renamed from: y */
        int f29706y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C25323f f29707z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C25323f c25323f, C10001m c10001m, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f29707z = c25323f;
            this.f29703E = c10001m;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f29707z, this.f29703E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f29706y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                String strM74370d = this.f29707z.m74370d();
                if (strM74370d != null) {
                    NotificationRepository notificationRepository = this.f29703E.getNotificationRepository();
                    PushNotificationMetricType pushNotificationMetricType = PushNotificationMetricType.FailedToDisplay;
                    this.f29704w = null;
                    this.f29705x = 0;
                    this.f29706y = 1;
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
        f29681R = c3853dM11807f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10001m(C27721s pushContext, C11059g teamsRepository, C27858u userContext, InterfaceC39700a communityAccessChecker) {
        super(pushContext);
        AbstractC22676k.m65750j(pushContext, "pushContext");
        AbstractC22676k.m65750j(teamsRepository, "teamsRepository");
        AbstractC22676k.m65750j(userContext, "userContext");
        AbstractC22676k.m65750j(communityAccessChecker, "communityAccessChecker");
        this.teamsRepository = teamsRepository;
        this.userContext = userContext;
        this.communityAccessChecker = communityAccessChecker;
        this.logTag = "TeamOwnershipPushNotification";
        this.communityIdKey = "community_id";
        this.communityTitleKey = "title";
        this.communityBodyKey = "body";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public final Object m24598H(int i13, InterfaceC30057d<? super Team> interfaceC30057d) {
        User userM84055f = this.userContext.m84055f();
        if (userM84055f == null) {
            return null;
        }
        Object objM29819w = this.teamsRepository.m29819w(i13, userM84055f.getId(), TeamType.COMMUNITY, interfaceC30057d);
        return objM29819w == EnumC31071a.f128113w ? objM29819w : (Team) objM29819w;
    }

    @Override // m92.InterfaceC25322e
    /* JADX INFO: renamed from: a */
    public void mo24524a(C25323f dataMap, Context context) throws InvalidPushDataException {
        AbstractC22676k.m65750j(dataMap, "dataMap");
        AbstractC22676k.m65750j(context, "context");
        String strM74364g = AbstractC25320c.m74364g(dataMap);
        if (!"CommunityOwnershipTransfer".equalsIgnoreCase(strM74364g)) {
            AbstractC3006f0.m8732z(getScope(), null, null, new c(dataMap, this, null), 3);
            throw new InvalidPushDataException(dataMap, "Unrecognized notification type sent to TeamOwnershipPushNotification");
        }
        AbstractC3006f0.m8732z(getScope(), null, null, new b(m74349j(dataMap, this.communityIdKey), context, dataMap, 90, m74353r(dataMap, this.communityTitleKey), m74353r(dataMap, this.communityBodyKey), NotificationDismissedReceiver.Companion.m24516b(NotificationDismissedReceiver.INSTANCE, context, strM74364g, 0, 0, 12, null), null), 3);
    }

    @Override // m92.AbstractC25319b
    /* JADX INFO: renamed from: n, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }
}
