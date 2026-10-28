package com.whoop.service.push.notifications;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c12.C3853d;
import c93.InterfaceC4351m;
import com.whoop.data.remote.domain.dto.PushNotificationMetricType;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.NotificationRepository;
import com.whoop.domain.model.User;
import com.whoop.domain.model.teams.Team;
import com.whoop.domain.model.teams.TeamType;
import com.whoop.profile.domain.ProfileApiKt;
import com.whoop.service.push.InvalidPushDataException;
import cq0.C11059g;
import d92.C11819b;
import hi0.AbstractC17312j;
import l83.C23454a0;
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
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import xp0.AbstractC38499a0;
import xp0.C38508f;
import yb3.AbstractC39414r;
import yp0.InterfaceC39700a;

/* JADX INFO: renamed from: com.whoop.service.push.notifications.l */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001\u0016B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\"\u001a\u00020\u001d8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, m65681d2 = {"Lcom/whoop/service/push/notifications/l;", "Lm92/b;", "Lo92/s;", "pushContext", "Lcq0/g;", "teamsRepository", "Lod1/u;", "userContext", "Lyp0/a;", "communityAccessChecker", "<init>", "(Lo92/s;Lcq0/g;Lod1/u;Lyp0/a;)V", "", "teamId", "Lcom/whoop/domain/model/teams/Team;", "I", "(ILq83/d;)Ljava/lang/Object;", "Lm92/f;", "dataMap", "Landroid/content/Context;", "context", "Ll83/a0;", "a", "(Lm92/f;Landroid/content/Context;)V", "Lcq0/g;", "J", "Lod1/u;", "K", "Lyp0/a;", "", "L", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "logTag", "M", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C10000l extends AbstractC25319b {

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: N */
    public static final int f29652N = 8;

    /* JADX INFO: renamed from: O */
    private static final C3853d f29653O = AbstractC25319b.INSTANCE.m74357a("06600_TeamChat", AbstractC17312j.f66923E0);

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final C11059g teamsRepository;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final C27858u userContext;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC39700a communityAccessChecker;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: com.whoop.service.push.notifications.l$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u0014\u0010\u0017\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\r¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/service/push/notifications/l$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/app/NotificationManager;", "manager", "Ll83/a0;", "a", "(Landroid/content/Context;Landroid/app/NotificationManager;)V", "", "CHANNEL_ID", "Ljava/lang/String;", "Lc12/d;", "SETTINGS", "Lc12/d;", "TEAM_CHAT_NOTIFICATION", "KEY_COMMUNITY_ID", "KEY_PARENT_MESSAGE_ID", "KEY_TITLE", "KEY_BODY", "", "CHAT_PILLAR", "I", "TEAM_CHAT_INTENT", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m24590a(Context context, NotificationManager manager) {
            AbstractC22676k.m65750j(context, "context");
            C10000l.f29653O.m11806e(manager, context);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.push.notifications.l$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.push.notifications.TeamChatNotification$perform$1", m100430f = "TeamChatNotification.kt", m100431l = {69}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ Context f29658E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ String f29659F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ String f29660G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ int f29661H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ String f29662I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ String f29663J;

        /* JADX INFO: renamed from: K */
        final /* synthetic */ C25323f f29664K;

        /* JADX INFO: renamed from: w */
        boolean f29665w;

        /* JADX INFO: renamed from: x */
        int f29666x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Integer f29668z;

        /* JADX INFO: renamed from: com.whoop.service.push.notifications.l$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.service.push.notifications.TeamChatNotification$perform$1$1", m100430f = "TeamChatNotification.kt", m100431l = {87}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ C10000l f29669E;

            /* JADX INFO: renamed from: w */
            Object f29670w;

            /* JADX INFO: renamed from: x */
            int f29671x;

            /* JADX INFO: renamed from: y */
            int f29672y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C25323f f29673z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C25323f c25323f, C10000l c10000l, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f29673z = c25323f;
                this.f29669E = c10000l;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f29673z, this.f29669E, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f29672y;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    String strM74370d = this.f29673z.m74370d();
                    if (strM74370d != null) {
                        NotificationRepository notificationRepository = this.f29669E.getNotificationRepository();
                        PushNotificationMetricType pushNotificationMetricType = PushNotificationMetricType.FailedToDisplay;
                        this.f29670w = null;
                        this.f29671x = 0;
                        this.f29672y = 1;
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
        public b(Integer num, Context context, String str, String str2, int i13, String str3, String str4, C25323f c25323f, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f29668z = num;
            this.f29658E = context;
            this.f29659F = str;
            this.f29660G = str2;
            this.f29661H = i13;
            this.f29662I = str3;
            this.f29663J = str4;
            this.f29664K = c25323f;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C10000l.this.new b(this.f29668z, this.f29658E, this.f29659F, this.f29660G, this.f29661H, this.f29662I, this.f29663J, this.f29664K, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            boolean z4;
            PendingIntent pendingIntentM36444b;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f29666x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                boolean zMo31687a = C10000l.this.communityAccessChecker.mo31687a();
                C10000l c10000l = C10000l.this;
                int iIntValue = this.f29668z.intValue();
                this.f29665w = zMo31687a;
                this.f29666x = 1;
                Object objM24588I = c10000l.m24588I(iIntValue, this);
                if (objM24588I == enumC31071a) {
                    return enumC31071a;
                }
                z4 = zMo31687a;
                obj = objM24588I;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z4 = this.f29665w;
                AbstractC34132o.m107864I(obj);
            }
            Team team = (Team) obj;
            if (z4) {
                pendingIntentM36444b = C11819b.f38415a.m31689b(C10000l.this.m74345c(this.f29658E));
            } else if (team != null) {
                C12966j0 c12966j0M74345c = C10000l.this.m74345c(this.f29658E);
                C12966j0.m36442f(c12966j0M74345c, AbstractC38499a0.f165068G0);
                c12966j0M74345c.m36447e(new C38508f.a(1, "DAILY").m123414d(team).m123412b(this.f29659F).m123411a().m123410j());
                pendingIntentM36444b = c12966j0M74345c.m36444b();
            } else {
                pendingIntentM36444b = null;
            }
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (pendingIntentM36444b == null) {
                AbstractC3006f0.m8732z(C10000l.this.getScope(), null, null, new a(this.f29664K, C10000l.this, null), 3);
                return c23454a0;
            }
            NotificationCompat.Builder deleteIntent = C10000l.this.m74346d(this.f29658E, new Integer(this.f29661H)).setContentIntent(pendingIntentM36444b).setContentTitle(this.f29662I).setContentText(this.f29663J).setStyle(new NotificationCompat.BigTextStyle().setBigContentTitle(this.f29662I).bigText(this.f29663J)).setDeleteIntent(NotificationDismissedReceiver.Companion.m24516b(NotificationDismissedReceiver.INSTANCE, this.f29658E, this.f29660G, 134217728, 0, 8, null));
            AbstractC22676k.m65749i(deleteIntent, "setDeleteIntent(...)");
            C10000l.f29653O.m11805a(deleteIntent);
            C10000l c10000l2 = C10000l.this;
            Notification notificationBuild = deleteIntent.build();
            AbstractC22676k.m65749i(notificationBuild, "build(...)");
            c10000l2.m74356w(102, notificationBuild, this.f29658E, String.valueOf(System.currentTimeMillis()), this.f29662I, this.f29663J);
            if (!z4 && !C10000l.this.getFeatureFlagChecker().isFeatureEnabled(FeatureFlagRepositoryKt.REMOVE_TEAM_CHAT_IMPLICIT_BROADCAST)) {
                this.f29658E.sendBroadcast(new Intent("teamChatIntent"));
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.push.notifications.l$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.push.notifications.TeamChatNotification$perform$2", m100430f = "TeamChatNotification.kt", m100431l = {113}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C10000l f29674E;

        /* JADX INFO: renamed from: w */
        Object f29675w;

        /* JADX INFO: renamed from: x */
        int f29676x;

        /* JADX INFO: renamed from: y */
        int f29677y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C25323f f29678z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C25323f c25323f, C10000l c10000l, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f29678z = c25323f;
            this.f29674E = c10000l;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f29678z, this.f29674E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f29677y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                String strM74370d = this.f29678z.m74370d();
                if (strM74370d != null) {
                    NotificationRepository notificationRepository = this.f29674E.getNotificationRepository();
                    PushNotificationMetricType pushNotificationMetricType = PushNotificationMetricType.FailedToDisplay;
                    this.f29675w = null;
                    this.f29676x = 0;
                    this.f29677y = 1;
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
    public C10000l(C27721s pushContext, C11059g teamsRepository, C27858u userContext, InterfaceC39700a communityAccessChecker) {
        super(pushContext);
        AbstractC22676k.m65750j(pushContext, "pushContext");
        AbstractC22676k.m65750j(teamsRepository, "teamsRepository");
        AbstractC22676k.m65750j(userContext, "userContext");
        AbstractC22676k.m65750j(communityAccessChecker, "communityAccessChecker");
        this.teamsRepository = teamsRepository;
        this.userContext = userContext;
        this.communityAccessChecker = communityAccessChecker;
        this.logTag = "TeamChatNotification";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public final Object m24588I(int i13, InterfaceC30057d<? super Team> interfaceC30057d) {
        User userM84055f = this.userContext.m84055f();
        if (userM84055f == null) {
            return null;
        }
        Object objM29819w = this.teamsRepository.m29819w(i13, userM84055f.getId(), TeamType.COMMUNITY, interfaceC30057d);
        return objM29819w == EnumC31071a.f128113w ? objM29819w : (Team) objM29819w;
    }

    @Override // m92.InterfaceC25322e
    /* JADX INFO: renamed from: a */
    public void mo24524a(C25323f dataMap, Context context) {
        AbstractC22676k.m65750j(dataMap, "dataMap");
        AbstractC22676k.m65750j(context, "context");
        String strM74364g = AbstractC25320c.m74364g(dataMap);
        try {
            if (!AbstractC22676k.m65745e(strM74364g, "teamChat")) {
                throw new InvalidPushDataException(dataMap, "Unrecognized notification type sent to team chat");
            }
            Integer numValueOf = Integer.valueOf(Integer.parseInt(AbstractC39414r.m125869O0(m74353r(dataMap, ProfileApiKt.COMMUNITY_ID_PARAM)).toString()));
            String strM74353r = m74353r(dataMap, "title");
            String strM74353r2 = m74353r(dataMap, "body");
            AbstractC3006f0.m8732z(getScope(), null, null, new b(numValueOf, context, m74353r(dataMap, "parentMessageId"), strM74364g, 102, strM74353r, strM74353r2, dataMap, null), 3);
        } catch (Exception e5) {
            AbstractC3006f0.m8732z(getScope(), null, null, new c(dataMap, this, null), 3);
            m74350l().mo85230v("Exception occurred while showing the team chat notification", e5, new AbstractC30556a.a[0]);
        }
    }

    @Override // m92.AbstractC25319b
    /* JADX INFO: renamed from: n, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }
}
