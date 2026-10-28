package o92;

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
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.NotificationRepository;
import com.whoop.service.push.InvalidPushDataException;
import e93.AbstractC12889b;
import hi0.AbstractC17307e;
import hi0.AbstractC17312j;
import l83.C23454a0;
import l83.C23465k;
import m92.AbstractC25318a;
import m92.AbstractC25319b;
import m92.C25323f;
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
import wm0.C37378a;

/* JADX INFO: renamed from: o92.l */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m65681d2 = {"Lo92/l;", "Lm92/a;", "Lo92/s;", "pushContext", "Lwm0/a;", "scopeCoordinator", "<init>", "(Lo92/s;Lwm0/a;)V", "Lm92/f;", "dataMap", "Ll83/a0;", "D", "(Lm92/f;)V", "Landroid/content/Context;", "context", "a", "(Lm92/f;Landroid/content/Context;)V", "I", "Lwm0/a;", "", "J", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "logTag", "K", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27713l extends AbstractC25318a {

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: L */
    public static final int f111657L = 8;

    /* JADX INFO: renamed from: M */
    private static final C3853d f111658M = AbstractC25319b.INSTANCE.m74357a("06680_Labrador", AbstractC17312j.f67011p);

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final C37378a scopeCoordinator;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: o92.l$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lo92/l$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/app/NotificationManager;", "manager", "Ll83/a0;", "a", "(Landroid/content/Context;Landroid/app/NotificationManager;)V", "", "KEY_ID", "Ljava/lang/String;", "BODY", "TITLE", "NOTIFICATION_TYPE", "CHANNEL_ID", "Lc12/d;", "SETTINGS", "Lc12/d;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m83767a(Context context, NotificationManager manager) {
            C27713l.f111658M.m11806e(manager, context);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: o92.l$b */
    @InterfaceC32271e(m100429c = "com.whoop.service.push.notifications.LabradorReportPushNotification$perform$1", m100430f = "LabradorReportPushNotification.kt", m100431l = {33}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f111661w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C27713l.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f111661w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C37378a c37378a = C27713l.this.scopeCoordinator;
                this.f111661w = 1;
                if (C37378a.m119655c(c37378a, null, this, 1, null) == enumC31071a) {
                    return enumC31071a;
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

    /* JADX INFO: renamed from: o92.l$c */
    @InterfaceC32271e(m100429c = "com.whoop.service.push.notifications.LabradorReportPushNotification$sendPushNotificationMetric$1", m100430f = "LabradorReportPushNotification.kt", m100431l = {92}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C27713l f111663E;

        /* JADX INFO: renamed from: w */
        Object f111664w;

        /* JADX INFO: renamed from: x */
        int f111665x;

        /* JADX INFO: renamed from: y */
        int f111666y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C25323f f111667z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C25323f c25323f, C27713l c27713l, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f111667z = c25323f;
            this.f111663E = c27713l;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f111667z, this.f111663E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f111666y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                String strM74370d = this.f111667z.m74370d();
                if (strM74370d != null) {
                    NotificationRepository notificationRepository = this.f111663E.getNotificationRepository();
                    PushNotificationMetricType pushNotificationMetricType = PushNotificationMetricType.FailedToDisplay;
                    this.f111664w = null;
                    this.f111665x = 0;
                    this.f111666y = 1;
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
    public C27713l(C27721s pushContext, C37378a scopeCoordinator) {
        super(pushContext);
        AbstractC22676k.m65750j(pushContext, "pushContext");
        AbstractC22676k.m65750j(scopeCoordinator, "scopeCoordinator");
        this.scopeCoordinator = scopeCoordinator;
        this.logTag = "LabradorReportPushNotification";
    }

    /* JADX INFO: renamed from: D */
    private final void m83766D(C25323f dataMap) {
        AbstractC3006f0.m8732z(getScope(), null, null, new c(dataMap, this, null), 3);
    }

    @Override // m92.InterfaceC25322e
    /* JADX INFO: renamed from: a */
    public void mo24524a(C25323f dataMap, Context context) throws Exception {
        AbstractC22676k.m65750j(dataMap, "dataMap");
        AbstractC22676k.m65750j(context, "context");
        try {
            String strM74353r = m74353r(dataMap, "report_id");
            AbstractC3006f0.m8732z(getScope(), null, null, new b(null), 3);
            if (!getFeatureFlagChecker().isFeatureEnabled(FeatureFlagRepositoryKt.LABRADOR_NOTIFICATION_FEATURE_ANDROID)) {
                m83766D(dataMap);
                throw new InvalidPushDataException(dataMap, "Unrecognized notification type");
            }
            INSTANCE.m83767a(context, (NotificationManager) context.getSystemService(NotificationManager.class));
            String strM74368b = dataMap.m74368b("title");
            String str = strM74368b == null ? "" : strM74368b;
            String strM74368b2 = dataMap.m74368b("body");
            String str2 = strM74368b2 == null ? "" : strM74368b2;
            NotificationCompat.Builder contentText = m74346d(context, 112).setContentTitle(str).setContentText(str2);
            AbstractC22676k.m65749i(contentText, "setContentText(...)");
            C27691a.f111471M.m11805a(contentText);
            Bundle bundleM36273g = AbstractC12889b.m36273g(new C23465k("id", strM74353r));
            C12966j0 c12966j0M74345c = m74345c(context);
            C12966j0.m36442f(c12966j0M74345c, AbstractC17307e.f66652S2);
            c12966j0M74345c.m36447e(bundleM36273g);
            PendingIntent pendingIntentM36444b = c12966j0M74345c.m36444b();
            m74350l().mo85228t("got labrador intent", new AbstractC30556a.a[0]);
            contentText.setContentIntent(pendingIntentM36444b).setStyle(new NotificationCompat.BigTextStyle().setBigContentTitle(str).bigText(str2));
            Notification notificationBuild = contentText.build();
            AbstractC22676k.m65749i(notificationBuild, "build(...)");
            AbstractC25319b.m74344y(this, 112, notificationBuild, context, str, str2, null, 32, null);
        } catch (Exception e5) {
            m83766D(dataMap);
            throw e5;
        }
    }

    @Override // m92.AbstractC25319b
    /* JADX INFO: renamed from: n, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }
}
