package o92;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c12.C3850a;
import c12.C3853d;
import c93.InterfaceC4351m;
import com.whoop.data.remote.domain.dto.PushNotificationMetricType;
import com.whoop.data.repositories.NotificationRepository;
import com.whoop.p069ui.AbstractC10538f;
import com.whoop.service.push.InvalidPushDataException;
import hi0.AbstractC17312j;
import java.util.List;
import l83.C23454a0;
import m92.AbstractC25318a;
import m92.AbstractC25319b;
import m92.C25323f;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wm0.C37378a;

/* JADX INFO: renamed from: o92.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m65681d2 = {"Lo92/a;", "Lm92/a;", "Lo92/s;", "pushContext", "Lwm0/a;", "scopeCoordinator", "<init>", "(Lo92/s;Lwm0/a;)V", "Lm92/f;", "dataMap", "Landroid/content/Context;", "context", "Ll83/a0;", "a", "(Lm92/f;Landroid/content/Context;)V", "I", "Lwm0/a;", "", "J", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "logTag", "K", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27691a extends AbstractC25318a {

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: L */
    public static final int f111470L = 8;

    /* JADX INFO: renamed from: M */
    public static final C3853d f111471M;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final C37378a scopeCoordinator;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: o92.a$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u0014\u0010\u0016\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\r¨\u0006\u0017"}, m65681d2 = {"Lo92/a$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/app/NotificationManager;", "manager", "Ll83/a0;", "a", "(Landroid/content/Context;Landroid/app/NotificationManager;)V", "", "CHANNEL_ID", "Ljava/lang/String;", "Lc12/d;", "SETTINGS", "Lc12/d;", "NOTIFICATION_TYPE", "KEY_ID", "ACTIVITY_V2_ID", "KEY_CYCLE_DAYS", "BODY", "TITLE", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m83711a(Context context, NotificationManager manager) {
            C27691a.f111471M.m11806e(manager, context);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: o92.a$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.push.notifications.ActivityProcessedPushNotification$perform$1", m100430f = "ActivityProcessedPushNotification.kt", m100431l = {54, 56}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C25323f f111474E;

        /* JADX INFO: renamed from: w */
        Object f111475w;

        /* JADX INFO: renamed from: x */
        int f111476x;

        /* JADX INFO: renamed from: y */
        int f111477y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C25323f c25323f, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f111474E = c25323f;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C27691a.this.new b(this.f111474E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
        
            if (r1.sendPushNotificationMetric(r4, r6, r5) == r0) goto L17;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r5.f111477y
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L21
                if (r1 == r4) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r0 = r5.f111475w
                java.lang.String r0 = (java.lang.String) r0
                p505ts.AbstractC34132o.m107864I(r6)
                goto L51
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1d:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L33
            L21:
                p505ts.AbstractC34132o.m107864I(r6)
                o92.a r6 = o92.C27691a.this
                wm0.a r6 = o92.C27691a.m83710D(r6)
                r5.f111477y = r4
                java.lang.Object r6 = wm0.C37378a.m119655c(r6, r3, r5, r4, r3)
                if (r6 != r0) goto L33
                goto L50
            L33:
                m92.f r6 = r5.f111474E
                java.lang.String r6 = r6.m74370d()
                if (r6 == 0) goto L51
                o92.a r1 = o92.C27691a.this
                com.whoop.data.repositories.NotificationRepository r1 = o92.C27691a.m83708B(r1)
                com.whoop.data.remote.domain.dto.PushNotificationMetricType r4 = com.whoop.data.remote.domain.dto.PushNotificationMetricType.FailedToOpen
                r5.f111475w = r3
                r3 = 0
                r5.f111476x = r3
                r5.f111477y = r2
                java.lang.Object r6 = r1.sendPushNotificationMetric(r4, r6, r5)
                if (r6 != r0) goto L51
            L50:
                return r0
            L51:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o92.C27691a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: o92.a$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.push.notifications.ActivityProcessedPushNotification$perform$2", m100430f = "ActivityProcessedPushNotification.kt", m100431l = {64, 77}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ int f111479E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ Context f111480F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ String f111481G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ String f111482H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ String f111483I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ C25323f f111484J;

        /* JADX INFO: renamed from: w */
        Object f111485w;

        /* JADX INFO: renamed from: x */
        int f111486x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ NotificationCompat.Builder f111488z;

        /* JADX INFO: renamed from: o92.a$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.service.push.notifications.ActivityProcessedPushNotification$perform$2$1", m100430f = "ActivityProcessedPushNotification.kt", m100431l = {73}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ C27691a f111489E;

            /* JADX INFO: renamed from: w */
            Object f111490w;

            /* JADX INFO: renamed from: x */
            int f111491x;

            /* JADX INFO: renamed from: y */
            int f111492y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C25323f f111493z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C25323f c25323f, C27691a c27691a, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f111493z = c25323f;
                this.f111489E = c27691a;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f111493z, this.f111489E, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f111492y;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    String strM74370d = this.f111493z.m74370d();
                    if (strM74370d != null) {
                        NotificationRepository notificationRepository = this.f111489E.getNotificationRepository();
                        PushNotificationMetricType pushNotificationMetricType = PushNotificationMetricType.FailedToOpen;
                        this.f111490w = null;
                        this.f111491x = 0;
                        this.f111492y = 1;
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

        /* JADX INFO: renamed from: o92.a$c$b */
        @InterfaceC32271e(m100429c = "com.whoop.service.push.notifications.ActivityProcessedPushNotification$perform$2$workoutIntent$1", m100430f = "ActivityProcessedPushNotification.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Landroid/app/PendingIntent;", "<anonymous>", "(Lbc3/c0;)Landroid/app/PendingIntent;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f111494w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C27691a f111495x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ Context f111496y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ String f111497z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C27691a c27691a, Context context, String str, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f111495x = c27691a;
                this.f111496y = context;
                this.f111497z = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f111495x, this.f111496y, this.f111497z, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super PendingIntent> interfaceC30057d) {
                return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f111494w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return this.f111495x.m74339z(this.f111496y, this.f111497z);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(NotificationCompat.Builder builder, int i13, Context context, String str, String str2, String str3, C25323f c25323f, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f111488z = builder;
            this.f111479E = i13;
            this.f111480F = context;
            this.f111481G = str;
            this.f111482H = str2;
            this.f111483I = str3;
            this.f111484J = c25323f;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C27691a.this.new c(this.f111488z, this.f111479E, this.f111480F, this.f111481G, this.f111482H, this.f111483I, this.f111484J, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
        
            if (wm0.C37378a.m119655c(r11, null, r10, 1, null) == r0) goto L19;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r10.f111486x
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L21
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r0 = r10.f111485w
                android.app.PendingIntent r0 = (android.app.PendingIntent) r0
                p505ts.AbstractC34132o.m107864I(r11)
                goto L7a
            L15:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1d:
                p505ts.AbstractC34132o.m107864I(r11)
                goto L3a
            L21:
                p505ts.AbstractC34132o.m107864I(r11)
                o92.a$c$b r11 = new o92.a$c$b
                o92.a r1 = o92.C27691a.this
                android.content.Context r5 = r10.f111480F
                java.lang.String r6 = r10.f111483I
                r11.<init>(r1, r5, r6, r4)
                r10.f111486x = r3
                r5 = 3000(0xbb8, double:1.482E-320)
                java.lang.Object r11 = bc3.AbstractC3028k2.m8750d(r5, r11, r10)
                if (r11 != r0) goto L3a
                goto L79
            L3a:
                android.app.PendingIntent r11 = (android.app.PendingIntent) r11
                if (r11 == 0) goto L56
                o92.a r1 = o92.C27691a.this
                tr2.n r1 = o92.C27691a.m83707A(r1)
                r5 = 0
                qr2.a$a[] r5 = new qr2.AbstractC30556a.a[r5]
                java.lang.String r6 = "got workout deep dive intent"
                r1.mo85228t(r6, r5)
                androidx.core.app.NotificationCompat$Builder r1 = r10.f111488z
                androidx.core.app.NotificationCompat$Builder r11 = r1.setContentIntent(r11)
                p715kotlin.jvm.internal.AbstractC22676k.m65747g(r11)
                goto L69
            L56:
                o92.a r11 = o92.C27691a.this
                bc3.c0 r11 = o92.C27691a.m83709C(r11)
                o92.a$c$a r1 = new o92.a$c$a
                m92.f r5 = r10.f111484J
                o92.a r6 = o92.C27691a.this
                r1.<init>(r5, r6, r4)
                r5 = 3
                bc3.AbstractC3006f0.m8732z(r11, r4, r4, r1, r5)
            L69:
                o92.a r11 = o92.C27691a.this
                wm0.a r11 = o92.C27691a.m83710D(r11)
                r10.f111485w = r4
                r10.f111486x = r2
                java.lang.Object r11 = wm0.C37378a.m119655c(r11, r4, r10, r3, r4)
                if (r11 != r0) goto L7a
            L79:
                return r0
            L7a:
                o92.a r1 = o92.C27691a.this
                int r2 = r10.f111479E
                androidx.core.app.NotificationCompat$Builder r11 = r10.f111488z
                android.app.Notification r3 = r11.build()
                java.lang.String r11 = "build(...)"
                p715kotlin.jvm.internal.AbstractC22676k.m65749i(r3, r11)
                android.content.Context r4 = r10.f111480F
                java.lang.String r5 = r10.f111481G
                java.lang.String r6 = r10.f111482H
                r8 = 32
                r9 = 0
                r7 = 0
                m92.AbstractC25319b.m74344y(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                l83.a0 r11 = l83.C23454a0.f92919a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: o92.C27691a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        C3853d c3853dM11807f = AbstractC25319b.INSTANCE.m74357a("01000_ActivityProcessed", AbstractC17312j.f67002m).m11807f(AbstractC17312j.f66999l);
        AbstractC22676k.m65749i(c3853dM11807f, "setChannelDescriptionResId(...)");
        f111471M = c3853dM11807f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27691a(C27721s pushContext, C37378a scopeCoordinator) {
        super(pushContext);
        AbstractC22676k.m65750j(pushContext, "pushContext");
        AbstractC22676k.m65750j(scopeCoordinator, "scopeCoordinator");
        this.scopeCoordinator = scopeCoordinator;
        this.logTag = "ActivityProcessedPushNotification";
    }

    @Override // m92.InterfaceC25322e
    /* JADX INFO: renamed from: a */
    public void mo24524a(C25323f dataMap, Context context) throws InvalidPushDataException {
        AbstractC22676k.m65750j(dataMap, "dataMap");
        AbstractC22676k.m65750j(context, "context");
        String strM74353r = m74353r(dataMap, "activityId");
        String strM74368b = dataMap.m74368b("title");
        if (strM74368b == null) {
            strM74368b = context.getString(AbstractC17312j.f66975d, context.getString(AbstractC17312j.f66916B));
            AbstractC22676k.m65749i(strM74368b, "getString(...)");
        }
        String str = strM74368b;
        String strM74368b2 = dataMap.m74368b("body");
        if (strM74368b2 == null) {
            strM74368b2 = context.getString(AbstractC17312j.f66972c, context.getString(AbstractC17312j.f66916B));
            AbstractC22676k.m65749i(strM74368b2, "getString(...)");
        }
        String str2 = strM74368b2;
        int iM11798a = C3850a.f15766a.m11798a(strM74353r);
        NotificationCompat.Builder style = m74346d(context, Integer.valueOf(iM11798a)).setContentTitle(str).setContentText(str2).setStyle(new NotificationCompat.BigTextStyle().setBigContentTitle(str).bigText(str2));
        AbstractC22676k.m65749i(style, "setStyle(...)");
        f111471M.m11805a(style);
        List<String> listM74355v = m74355v(dataMap, "cycleDays");
        if (((listM74355v == null || !(listM74355v.isEmpty() ^ true)) ? null : AbstractC10538f.m27188m(listM74355v.get(0))) != null) {
            m74350l().mo85216g("Prefetching cycle and workout data", new AbstractC30556a.a[0]);
            AbstractC3006f0.m8732z(getScope(), null, null, new c(style, iM11798a, context, str, str2, strM74353r, dataMap, null), 3);
            return;
        }
        m74354u(new InvalidPushDataException(dataMap, "Can't find cycle days, aborting cycle refresh and prefetch"));
        AbstractC3006f0.m8732z(getScope(), null, null, new b(dataMap, null), 3);
        Notification notificationBuild = style.build();
        AbstractC22676k.m65749i(notificationBuild, "build(...)");
        AbstractC25319b.m74344y(this, iM11798a, notificationBuild, context, str, str2, null, 32, null);
    }

    @Override // m92.AbstractC25319b
    /* JADX INFO: renamed from: n, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }
}
