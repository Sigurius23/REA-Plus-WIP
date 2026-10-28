package com.whoop.workmanager;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import androidx.work.WorkerParameters;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.metrics.worker.BaseReportingWorker;
import fi0.C14519e;
import fi0.EnumC14518d;
import fi0.InterfaceC14517c;
import java.time.Duration;
import java.util.List;
import l83.C23465k;
import live.hms.video.utils.HMSConstantsKt;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import od1.C27858u;
import ov2.C28402f;
import p031b9.AbstractC2875y;
import p218ic.AbstractC18377p0;
import p218ic.AbstractC18386u;
import p218ic.C18365j0;
import p218ic.C18367k0;
import p218ic.C18380r;
import p218ic.EnumC18366k;
import p218ic.InterfaceC18355e0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s03.C32053b;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import vf3.C35953c;
import xf3.C38266c;
import z82.InterfaceC40188b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/workmanager/PushNotificationPermissionStatusWorker;", "Lcom/whoop/metrics/worker/BaseReportingWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Ll83/a0;", "n", "()V", "", "l", "(Landroid/content/Context;)Ljava/lang/String;", "Lic/u;", "j", "(Lq83/d;)Ljava/lang/Object;", "y", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "uniqueWorkName", "z", "a", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class PushNotificationPermissionStatusWorker extends BaseReportingWorker {

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final String uniqueWorkName;

    /* JADX INFO: renamed from: com.whoop.workmanager.PushNotificationPermissionStatusWorker$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/workmanager/PushNotificationPermissionStatusWorker$a;", "", "<init>", "()V", "Lic/k0;", "a", "()Lic/k0;", "Lic/p0;", "workManager", "Lic/e0;", "b", "(Lic/p0;)Lic/e0;", "", "CHECK_PUSH_NOTIF_PERMISSION_CHANGE", "Ljava/lang/String;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        private final C18367k0 m28976a() {
            Duration durationOfDays = Duration.ofDays(1L);
            AbstractC22676k.m65749i(durationOfDays, "ofDays(...)");
            return (C18367k0) new C18365j0(PushNotificationPermissionStatusWorker.class, durationOfDays).m52878b();
        }

        /* JADX INFO: renamed from: b */
        public final InterfaceC18355e0 m28977b(AbstractC18377p0 workManager) {
            AbstractC22676k.m65750j(workManager, "workManager");
            return workManager.mo52875d("CheckPushNotifPermissionChange", EnumC18366k.f71499w, m28976a());
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.workmanager.PushNotificationPermissionStatusWorker$b */
    @InterfaceC32271e(m100429c = "com.whoop.workmanager.PushNotificationPermissionStatusWorker", m100430f = "PushNotificationPermissionStatusWorker.kt", m100431l = {32}, m100432m = "work", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10922b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f33766w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f33767x;

        /* JADX INFO: renamed from: z */
        int f33769z;

        public C10922b(InterfaceC30057d<? super C10922b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f33767x = obj;
            this.f33769z |= Integer.MIN_VALUE;
            return PushNotificationPermissionStatusWorker.this.mo18568j(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushNotificationPermissionStatusWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(workerParameters, "workerParameters");
        this.uniqueWorkName = "PushNotificationPermissionStatusWorker";
    }

    /* JADX INFO: renamed from: l */
    private final String m28973l(Context context) {
        Object systemService = context.getSystemService("notification");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        List<NotificationChannel> notificationChannels = ((NotificationManager) systemService).getNotificationChannels();
        AbstractC22676k.m65747g(notificationChannels);
        return AbstractC25265s.m74110N0(notificationChannels, ",", null, null, new C28402f(13), 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final CharSequence m28974m(NotificationChannel notificationChannel) {
        String str;
        String str2 = notificationChannel.getSound() != null ? "enabled" : "disabled";
        String str3 = notificationChannel.canShowBadge() ? "enabled" : "disabled";
        int importance = notificationChannel.getImportance();
        if (importance == 0) {
            str = "none";
        } else if (importance == 1) {
            str = "min";
        } else if (importance == 2) {
            str = "low";
        } else if (importance != 3) {
            str = importance != 4 ? "unknown" : "high";
        } else {
            str = HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY;
        }
        String id4 = notificationChannel.getId();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(id4);
        sb4.append(":{sound:");
        sb4.append(str2);
        sb4.append(",badge:");
        sb4.append(str3);
        return AbstractC2875y.m8304q(sb4, ",importance:", str, "}");
    }

    /* JADX INFO: renamed from: n */
    private final void m28975n() {
        C38266c c38266c = getKoin().f106046a.f159364d;
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        if (((FeatureFlagChecker) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null)).isFeatureEnabled(FeatureFlagRepositoryKt.NOTIFICATION_UNSUB_MONITORING)) {
            InterfaceC14517c interfaceC14517c = (InterfaceC14517c) getKoin().f106046a.f159364d.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14517c.class), null);
            C32053b c32053b = (C32053b) getKoin().f106046a.f159364d.m122602a(null, c22673i0.getOrCreateKotlinClass(C32053b.class), null);
            Context applicationContext = getApplicationContext();
            AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
            boolean zM99629a = c32053b.m99629a(applicationContext);
            C23465k c23465k = new C23465k("screen_name", "launch_screen");
            C23465k c23465k2 = new C23465k("pn_permission_setting", zM99629a ? "enabled" : "disabled");
            Context applicationContext2 = getApplicationContext();
            AbstractC22676k.m65749i(applicationContext2, "getApplicationContext(...)");
            interfaceC14517c.mo41422d("notification_permissions", "os_notification_status", null, "Push Notification", null, AbstractC25247g0.m73990Y(c23465k, c23465k2, new C23465k("channel_details", m28973l(applicationContext2))));
        }
    }

    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getUniqueWorkName() {
        return this.uniqueWorkName;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: j */
    public Object mo18568j(InterfaceC30057d<? super AbstractC18386u> interfaceC30057d) {
        C10922b c10922b;
        if (interfaceC30057d instanceof C10922b) {
            c10922b = (C10922b) interfaceC30057d;
            int i13 = c10922b.f33769z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c10922b.f33769z = i13 - Integer.MIN_VALUE;
            } else {
                c10922b = new C10922b(interfaceC30057d);
            }
        } else {
            c10922b = new C10922b(interfaceC30057d);
        }
        Object objM41434d = c10922b.f33767x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c10922b.f33769z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM41434d);
            m28975n();
            C14519e c14519e = (C14519e) getKoin().f106046a.f159364d.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C14519e.class), null);
            c10922b.f33766w = null;
            c10922b.f33769z = 1;
            objM41434d = c14519e.m41434d(c10922b);
            if (objM41434d == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM41434d);
        }
        if (((EnumC14518d) objM41434d) == null) {
            return AbstractC18386u.m52885b();
        }
        C35953c c35953c = new C35953c("userContext");
        C38266c c38266c = getKoin().f106046a.f159364d;
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        if (!((C27858u) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C27858u.class), c35953c)).m84058i()) {
            return new C18380r();
        }
        ((InterfaceC40188b) getKoin().f106046a.f159364d.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC40188b.class), null)).mo41427j(true);
        return AbstractC18386u.m52885b();
    }
}
