package com.whoop.service.push;

import android.app.NotificationManager;
import android.content.ComponentCallbacks;
import android.content.Context;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.C3004e2;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3061u;
import bl2.C3374c;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.iterable.iterableapi.C5341k;
import com.iterable.iterableapi.IterableFirebaseMessagingService;
import com.whoop.data.remote.domain.dto.PushNotificationMetricType;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.NotificationRepository;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import java.util.Map;
import java.util.concurrent.CancellationException;
import jy1.C22047a;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import l83.C23465k;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lq0.C24656d;
import m83.AbstractC25247g0;
import m83.C25271y;
import m92.C25323f;
import m92.C25327j;
import p002a0.C0021f1;
import p098dt.AbstractC12350b;
import p479s4.AbstractC32122c;
import p505ts.AbstractC34132o;
import p692zt.C41112p;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 /2\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u0003R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00061"}, m65681d2 = {"Lcom/whoop/service/push/PushService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "Lzt/p;", "remoteMessage", "Ll83/a0;", "s", "(Lzt/p;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "", "token", "j", "(Ljava/lang/String;)V", "onDestroy", "Lcom/whoop/service/push/b;", "H", "Ll83/h;", "r", "()Lcom/whoop/service/push/b;", "pushNotificationFactory", "Lcom/whoop/data/repositories/NotificationRepository;", "I", "q", "()Lcom/whoop/data/repositories/NotificationRepository;", "notificationRepository", "Liy1/c;", "J", "p", "()Liy1/c;", "metricWriter", "Lcom/whoop/service/push/c;", "K", "Lcom/whoop/service/push/c;", "pushServiceReporter", "Lbc3/u;", "L", "Lbc3/u;", "job", "Lbc3/c0;", "M", "Lbc3/c0;", "scope", "Ltr2/n;", "N", "Ltr2/n;", "logger", "O", "a", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class PushService extends FirebaseMessagingService {

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: P */
    public static final int f29461P = 8;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC23462h pushNotificationFactory;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC23462h notificationRepository;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC23462h metricWriter;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final C9986c pushServiceReporter;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC3061u job;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: com.whoop.service.push.PushService$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Lcom/whoop/service/push/PushService$a;", "", "<init>", "()V", "", "notificationType", "", "b", "(Ljava/lang/String;)Z", "Landroid/content/Context;", "context", "Landroid/app/NotificationManager;", "manager", "Ll83/a0;", "a", "(Landroid/content/Context;Landroid/app/NotificationManager;)V", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "c", "(Lcom/whoop/data/repositories/FeatureFlagChecker;Landroid/app/NotificationManager;)V", "IN_APP_UPDATE_NOTIFICATION", "Ljava/lang/String;", "IN_APP_REMOVE_NOTIFICATION", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m24506a(Context context, NotificationManager manager) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(manager, "manager");
            C9985b.INSTANCE.m24512a(context, manager);
        }

        /* JADX INFO: renamed from: b */
        public final boolean m24507b(String notificationType) {
            return notificationType == null || notificationType.equalsIgnoreCase("inAppUpdate") || notificationType.equalsIgnoreCase("InAppRemove");
        }

        /* JADX INFO: renamed from: c */
        public final void m24508c(FeatureFlagChecker featureFlagChecker, NotificationManager manager) {
            AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
            AbstractC22676k.m65750j(manager, "manager");
            if (!featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.LABRADOR_NOTIFICATION_FEATURE_ANDROID)) {
                manager.deleteNotificationChannel("06680_Labrador");
            }
            if (featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.SHEPHERD_NOTIFICATION_FEATURE_ANDROID)) {
                return;
            }
            manager.deleteNotificationChannel("06675_ANF");
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.push.PushService$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.push.PushService$handleMessage$1", m100430f = "PushService.kt", m100431l = {62}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9980b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ PushService f29469E;

        /* JADX INFO: renamed from: w */
        Object f29470w;

        /* JADX INFO: renamed from: x */
        int f29471x;

        /* JADX INFO: renamed from: y */
        int f29472y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C25323f f29473z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9980b(C25323f c25323f, PushService pushService, InterfaceC30057d<? super C9980b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f29473z = c25323f;
            this.f29469E = pushService;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C9980b(this.f29473z, this.f29469E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C9980b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f29472y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                String strM74370d = this.f29473z.m74370d();
                if (strM74370d != null) {
                    NotificationRepository notificationRepositoryM24500q = this.f29469E.m24500q();
                    PushNotificationMetricType pushNotificationMetricType = PushNotificationMetricType.Delivered;
                    this.f29470w = null;
                    this.f29471x = 0;
                    this.f29472y = 1;
                    if (notificationRepositoryM24500q.sendPushNotificationMetric(pushNotificationMetricType, strM74370d, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.service.push.PushService$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9981c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f29474w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f29475x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f29476y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9981c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f29474w = componentCallbacks;
            this.f29475x = interfaceC35951a;
            this.f29476y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.service.push.b, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C9985b invoke() {
            ComponentCallbacks componentCallbacks = this.f29474w;
            InterfaceC35951a interfaceC35951a = this.f29475x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f29476y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9985b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.push.PushService$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9982d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f29477w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f29478x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f29479y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9982d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f29477w = componentCallbacks;
            this.f29478x = interfaceC35951a;
            this.f29479y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.NotificationRepository, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final NotificationRepository invoke() {
            ComponentCallbacks componentCallbacks = this.f29477w;
            InterfaceC35951a interfaceC35951a = this.f29478x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f29479y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(NotificationRepository.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.push.PushService$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9983e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f29480w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f29481x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f29482y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9983e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f29480w = componentCallbacks;
            this.f29481x = interfaceC35951a;
            this.f29482y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [iy1.c, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21030c invoke() {
            ComponentCallbacks componentCallbacks = this.f29480w;
            InterfaceC35951a interfaceC35951a = this.f29481x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f29482y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21030c.class), interfaceC35951a);
        }
    }

    public PushService() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.pushNotificationFactory = AbstractC30060g.m92087G(enumC23463i, new C9981c(this, null, null));
        this.notificationRepository = AbstractC30060g.m92087G(enumC23463i, new C9982d(this, null, null));
        this.metricWriter = AbstractC30060g.m92087G(enumC23463i, new C9983e(this, null, null));
        this.pushServiceReporter = new C9986c();
        C3004e2 c3004e2M8710d = AbstractC3006f0.m8710d();
        this.job = c3004e2M8710d;
        C22365e c22365e = AbstractC3050q0.f12077a;
        this.scope = AbstractC3006f0.m8708b(ExecutorC22364d.f87316w.plus(c3004e2M8710d));
        this.logger = InterfaceC34116n.INSTANCE.m107848a("PushService");
    }

    /* JADX INFO: renamed from: p */
    private final InterfaceC21030c m24499p() {
        return (InterfaceC21030c) this.metricWriter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final NotificationRepository m24500q() {
        return (NotificationRepository) this.notificationRepository.getValue();
    }

    /* JADX INFO: renamed from: r */
    private final C9985b m24501r() {
        return (C9985b) this.pushNotificationFactory.getValue();
    }

    /* JADX INFO: renamed from: s */
    private final void m24502s(C41112p remoteMessage) {
        Boolean bool;
        boolean z4;
        Map mapM133446f = remoteMessage.m133446f();
        AbstractC22676k.m65749i(mapM133446f, "getData(...)");
        String strM133445b = remoteMessage.m133445b();
        if (strM133445b == null) {
            strM133445b = "";
        }
        C25323f c25323f = new C25323f(AbstractC25247g0.m73995d0(mapM133446f, AbstractC25247g0.m73989X(new C23465k("collapse_key", strM133445b))));
        String strM74369c = c25323f.m74369c();
        Boolean boolValueOf = null;
        AbstractC3006f0.m8732z(this.scope, null, null, new C9980b(c25323f, this, null), 3);
        if (INSTANCE.m24507b(strM74369c)) {
            this.logger.mo85228t("Processing Iterable in-app message", new AbstractC30556a.a[0]);
            IterableFirebaseMessagingService.m16402m(this, remoteMessage);
        } else if (strM74369c != null) {
            this.logger.mo85219j("Processing FCM data push: ".concat(strM74369c), new AbstractC30556a.a[0]);
            try {
                Context contextForLanguage = AbstractC32122c.getContextForLanguage(this);
                AbstractC22676k.m65749i(contextForLanguage, "getContextForLanguage(...)");
                boolValueOf = Boolean.valueOf(m24501r().m24511b(strM74369c, c25323f, contextForLanguage));
            } catch (InvalidPushDataException e5) {
                this.logger.mo85213c("Error processing push", e5, new AbstractC30556a.a[0]);
                bool = null;
                z4 = true;
            }
        } else {
            boolean z13 = remoteMessage.m133447h() != null;
            Object objM133446f = remoteMessage.m133446f();
            AbstractC22676k.m65749i(objM133446f, "getData(...)");
            boolean z14 = !((C0021f1) objM133446f).isEmpty();
            this.logger.mo85222m("Received an unknown Firebase cloud message hasNotification=" + z13 + " hasData=" + z14, new AbstractC30556a.a[0]);
        }
        z4 = false;
        bool = boolValueOf;
        this.pushServiceReporter.m24513a(m24499p(), c25323f, strM74369c, remoteMessage, z4, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m24503t(PushService pushService, C41112p c41112p, boolean z4) {
        if (z4) {
            pushService.m24502s(c41112p);
        } else {
            pushService.m24499p().mo58701b(new C22047a(0, "push.receivedwhileunregistered", null, C25271y.f99162w, null, 21, null));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final void m24504u(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final void m24505v(PushService pushService, Throwable th3) {
        AbstractC22676k.m65750j(th3, "<unused var>");
        pushService.m24499p().mo58701b(new C22047a(0, "push.failedregistrationcheck", null, C25271y.f99162w, null, 21, null));
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* JADX INFO: renamed from: h */
    public void mo16397h(C41112p remoteMessage) {
        AbstractC22676k.m65750j(remoteMessage, "remoteMessage");
        ((C25327j) AbstractC29125c.m88492A(this).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25327j.class), null)).m74407s().m122686d(new C3374c(new C24656d(9, this, remoteMessage), 6), new C3374c(this, 7));
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* JADX INFO: renamed from: j */
    public void mo16399j(String token) {
        AbstractC22676k.m65750j(token, "token");
        ((C25327j) AbstractC29125c.m88492A(this).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25327j.class), null)).m74406D();
        AbstractC12350b.m34593n("itblFCMMessagingService", "New Firebase Token generated: " + IterableFirebaseMessagingService.m16401l());
        C5341k.f21742r.m16490k();
    }

    @Override // p692zt.AbstractServiceC41104h, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.job.cancel((CancellationException) null);
    }
}
