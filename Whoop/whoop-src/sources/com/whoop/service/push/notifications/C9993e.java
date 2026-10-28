package com.whoop.service.push.notifications;

import android.app.NotificationManager;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.InterfaceC2994c0;
import c12.C3853d;
import c12.C3854e;
import c12.EnumC3851b;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.DorsetLearnMoreUrl;
import com.whoop.data.repositories.DorsetNotificationCoolOffMinutes;
import com.whoop.data.repositories.FeatureFlagChecker;
import e93.AbstractC12889b;
import ec3.AbstractC13091v;
import et0.InterfaceC13596a;
import hi0.AbstractC17307e;
import hi0.AbstractC17309g;
import hi0.AbstractC17312j;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21461d;
import java.time.Clock;
import java.time.Instant;
import js0.AbstractC21909c;
import js0.C21908b;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import p114eb.C12966j0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import uu0.C35234a;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: com.whoop.service.push.notifications.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 62\u00020\u0001:\u00017BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00068"}, m65681d2 = {"Lcom/whoop/service/push/notifications/e;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroid/content/Context;", "context", "Let0/a;", "dorsetDetectionMonitor", "Ljs0/c;", "configRepo", "Luu0/a;", "analyticsHelper", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lbc3/c0;", "backgroundScope", "Ljava/time/Clock;", "clock", "Ltr2/n;", "log", "<init>", "(Landroid/content/Context;Let0/a;Ljs0/c;Luu0/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Lbc3/c0;Ljava/time/Clock;Ltr2/n;)V", "", "l", "(Lq83/d;)Ljava/lang/Object;", "Landroidx/lifecycle/g0;", "owner", "Ll83/a0;", "onCreate", "(Landroidx/lifecycle/g0;)V", "j", "()V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Landroid/content/Context;", "x", "Let0/a;", "y", "Ljs0/c;", "z", "Luu0/a;", "E", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "F", "Lbc3/c0;", "G", "Ljava/time/Clock;", "H", "Ltr2/n;", "Lmc3/a;", "I", "Lmc3/a;", "coolOffMutex", "Ljava/time/Instant;", "J", "Ljava/time/Instant;", "lastNotifiedAt", "K", "a", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C9993e implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: L */
    public static final int f29550L = 8;

    /* JADX INFO: renamed from: M */
    private static final long f29551M;

    /* JADX INFO: renamed from: N */
    private static final long f29552N;

    /* JADX INFO: renamed from: O */
    public static final C3853d f29553O;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC2994c0 backgroundScope;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC34116n log;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC25435a coolOffMutex;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private Instant lastNotifiedAt;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC13596a dorsetDetectionMonitor;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final AbstractC21909c configRepo;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C35234a analyticsHelper;

    /* JADX INFO: renamed from: com.whoop.service.push.notifications.e$b */
    @InterfaceC32271e(m100429c = "com.whoop.service.push.notifications.DorsetDetectedNotification$onCreate$1", m100430f = "DorsetDetectedNotification.kt", m100431l = {65, HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"", "detected", "Ll83/a0;", "<anonymous>", "(Z)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        long f29564w;

        /* JADX INFO: renamed from: x */
        int f29565x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ boolean f29566y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = C9993e.this.new b(interfaceC30057d);
            bVar.f29566y = ((Boolean) obj).booleanValue();
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (InterfaceC30057d<? super C23454a0>) obj2);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x008b  */
        /* JADX WARN: Code duplicated, block: B:30:0x009b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:32:? A[LOOP:0: B:22:0x007d->B:32:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
        
            if (r10 == r1) goto L26;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                boolean r0 = r9.f29566y
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r9.f29565x
                l83.a0 r3 = l83.C23454a0.f92919a
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L22
                if (r2 == r5) goto L1e
                if (r2 != r4) goto L16
                long r5 = r9.f29564w
                p505ts.AbstractC34132o.m107864I(r10)
                goto L7d
            L16:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1e:
                p505ts.AbstractC34132o.m107864I(r10)
                goto L42
            L22:
                p505ts.AbstractC34132o.m107864I(r10)
                if (r0 == 0) goto Lac
                com.whoop.service.push.notifications.e r10 = com.whoop.service.push.notifications.C9993e.this
                com.whoop.data.repositories.FeatureFlagChecker r10 = com.whoop.service.push.notifications.C9993e.m24541c(r10)
                java.lang.String r2 = "droid-dorset-detection-notification"
                boolean r10 = r10.isFeatureEnabled(r2)
                if (r10 == 0) goto Lac
                com.whoop.service.push.notifications.e r10 = com.whoop.service.push.notifications.C9993e.this
                r9.f29566y = r0
                r9.f29565x = r5
                java.lang.Object r10 = com.whoop.service.push.notifications.C9993e.m24545g(r10, r9)
                if (r10 != r1) goto L42
                goto L9b
            L42:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 != 0) goto L59
                com.whoop.service.push.notifications.e r10 = com.whoop.service.push.notifications.C9993e.this
                tr2.n r10 = com.whoop.service.push.notifications.C9993e.m24542d(r10)
                r0 = 0
                qr2.a$a[] r0 = new qr2.AbstractC30556a.a[r0]
                java.lang.String r1 = "Session started within cool-off period — suppressing notifications."
                r10.mo85216g(r1, r0)
                return r3
            L59:
                com.whoop.service.push.notifications.e r10 = com.whoop.service.push.notifications.C9993e.this
                r10.m24547j()
                com.whoop.service.push.notifications.e r10 = com.whoop.service.push.notifications.C9993e.this
                uu0.a r10 = com.whoop.service.push.notifications.C9993e.m24539a(r10)
                uu0.a$b r2 = uu0.C35234a.b.INITIAL
                r10.m111612a(r2)
                com.whoop.service.push.notifications.e r10 = com.whoop.service.push.notifications.C9993e.this
                java.time.Clock r10 = com.whoop.service.push.notifications.C9993e.m24540b(r10)
                long r5 = r10.millis()
                long r7 = com.whoop.service.push.notifications.C9993e.m24544f()
                long r7 = p715kotlin.time.Duration.m134273getInWholeMillisecondsimpl(r7)
                long r7 = r7 + r5
                r5 = r7
            L7d:
                com.whoop.service.push.notifications.e r10 = com.whoop.service.push.notifications.C9993e.this
                java.time.Clock r10 = com.whoop.service.push.notifications.C9993e.m24540b(r10)
                long r7 = r10.millis()
                int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r10 >= 0) goto L9c
                long r7 = com.whoop.service.push.notifications.C9993e.m24543e()
                r9.f29566y = r0
                r9.f29564w = r5
                r9.f29565x = r4
                java.lang.Object r10 = bc3.AbstractC3034m0.m8783c(r7, r9)
                if (r10 != r1) goto L7d
            L9b:
                return r1
            L9c:
                com.whoop.service.push.notifications.e r10 = com.whoop.service.push.notifications.C9993e.this
                r10.m24547j()
                com.whoop.service.push.notifications.e r10 = com.whoop.service.push.notifications.C9993e.this
                uu0.a r10 = com.whoop.service.push.notifications.C9993e.m24539a(r10)
                uu0.a$b r0 = uu0.C35234a.b.REMINDER
                r10.m111612a(r0)
            Lac:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.service.push.notifications.C9993e.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(Boolean.valueOf(z4), interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.push.notifications.e$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.push.notifications.DorsetDetectedNotification", m100430f = "DorsetDetectedNotification.kt", m100431l = {151}, m100432m = "tryStartNotifiedSession", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f29568E;

        /* JADX INFO: renamed from: w */
        Object f29569w;

        /* JADX INFO: renamed from: x */
        int f29570x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f29571y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f29571y = obj;
            this.f29568E |= Integer.MIN_VALUE;
            return C9993e.this.m24546l(this);
        }
    }

    static {
        Duration.Companion companion = Duration.INSTANCE;
        DurationUnit durationUnit = DurationUnit.MINUTES;
        f29551M = DurationKt.toDuration(30, durationUnit);
        f29552N = DurationKt.toDuration(1, durationUnit);
        f29553O = new C3853d(EnumC3851b.MAX, "07800_DorsetDetection", AbstractC17312j.f66950S).m11813l(true).m11811j(true);
    }

    public C9993e(Context context, InterfaceC13596a dorsetDetectionMonitor, AbstractC21909c configRepo, C35234a analyticsHelper, FeatureFlagChecker featureFlagChecker, InterfaceC2994c0 backgroundScope, Clock clock, InterfaceC34116n log) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(dorsetDetectionMonitor, "dorsetDetectionMonitor");
        AbstractC22676k.m65750j(configRepo, "configRepo");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(backgroundScope, "backgroundScope");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(log, "log");
        this.context = context;
        this.dorsetDetectionMonitor = dorsetDetectionMonitor;
        this.configRepo = configRepo;
        this.analyticsHelper = analyticsHelper;
        this.featureFlagChecker = featureFlagChecker;
        this.backgroundScope = backgroundScope;
        this.clock = clock;
        this.log = log;
        this.coolOffMutex = AbstractC25438d.m74669a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX WARN: Code duplicated, block: B:60:0x013c A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:19:0x0048, B:21:0x0076, B:23:0x007e, B:55:0x0106, B:57:0x0114, B:61:0x013f, B:60:0x013c, B:64:0x0147, B:65:0x014e, B:27:0x008a, B:29:0x0096, B:31:0x009e, B:32:0x00a3, B:34:0x00af, B:36:0x00b7, B:37:0x00bc, B:39:0x00c8, B:41:0x00d0, B:42:0x00d5, B:44:0x00e1, B:46:0x00e9, B:47:0x00ee, B:49:0x00fa), top: B:68:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public final Object m24546l(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        c cVar;
        InterfaceC25435a interfaceC25435a;
        Object objM125868N0;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f29568E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f29568E = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object obj = cVar.f29571y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f29568E;
        boolean z4 = false;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC25435a interfaceC25435a2 = this.coolOffMutex;
            cVar.f29569w = interfaceC25435a2;
            cVar.f29570x = 0;
            cVar.f29568E = 1;
            if (interfaceC25435a2.mo68211b(cVar) == enumC31071a) {
                return enumC31071a;
            }
            interfaceC25435a = interfaceC25435a2;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC25435a = (InterfaceC25435a) cVar.f29569w;
            AbstractC34132o.m107864I(obj);
        }
        try {
            Instant instant = this.lastNotifiedAt;
            Instant instant2 = this.clock.instant();
            Duration.Companion companion = Duration.INSTANCE;
            AbstractC21909c abstractC21909c = this.configRepo;
            DorsetNotificationCoolOffMinutes dorsetNotificationCoolOffMinutes = DorsetNotificationCoolOffMinutes.INSTANCE;
            C21908b configurations = abstractC21909c.getConfigurations();
            String name = dorsetNotificationCoolOffMinutes.getName();
            Object defaultValue = dorsetNotificationCoolOffMinutes.getDefaultValue();
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Integer.class);
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                String str = (String) configurations.get(name);
                if (str != null) {
                    objM125868N0 = AbstractC39421y.m125932Q(str);
                } else {
                    objM125868N0 = null;
                }
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                String str2 = (String) configurations.get(name);
                if (str2 != null) {
                    objM125868N0 = AbstractC39421y.m125933R(str2);
                } else {
                    objM125868N0 = null;
                }
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                String str3 = (String) configurations.get(name);
                if (str3 != null) {
                    objM125868N0 = AbstractC39420x.m125915y(str3);
                } else {
                    objM125868N0 = null;
                }
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                String str4 = (String) configurations.get(name);
                if (str4 != null) {
                    objM125868N0 = AbstractC39420x.m125914x(str4);
                } else {
                    objM125868N0 = null;
                }
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Boolean.TYPE))) {
                String str5 = (String) configurations.get(name);
                if (str5 != null) {
                    objM125868N0 = AbstractC39414r.m125868N0(str5);
                } else {
                    objM125868N0 = null;
                }
            } else {
                objM125868N0 = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations.get(name) : defaultValue;
            }
            if (objM125868N0 != null) {
                defaultValue = objM125868N0;
            }
            if (defaultValue == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
            long duration = DurationKt.toDuration(((Integer) defaultValue).intValue(), DurationUnit.MINUTES);
            if (instant != null) {
                java.time.Duration durationBetween = java.time.Duration.between(instant, instant2);
                AbstractC22676k.m65749i(durationBetween, "between(...)");
                if (Duration.m134261compareToLRDsOJo(Duration.m134291plusLRDsOJo(DurationKt.toDuration(durationBetween.getSeconds(), DurationUnit.SECONDS), DurationKt.toDuration(durationBetween.getNano(), DurationUnit.NANOSECONDS)), duration) >= 0) {
                    this.lastNotifiedAt = instant2;
                    z4 = true;
                }
            } else {
                this.lastNotifiedAt = instant2;
                z4 = true;
            }
            Boolean boolValueOf = Boolean.valueOf(z4);
            interfaceC25435a.mo68214i(null);
            return boolValueOf;
        } catch (Throwable th3) {
            interfaceC25435a.mo68214i(null);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m24547j() {
        Object systemService = this.context.getSystemService("notification");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        C3853d c3853d = f29553O;
        c3853d.m11806e(notificationManager, this.context);
        String string = this.context.getString(AbstractC17312j.f66952T);
        AbstractC22676k.m65749i(string, "getString(...)");
        String string2 = this.context.getString(AbstractC17312j.f66948R);
        AbstractC22676k.m65749i(string2, "getString(...)");
        NotificationCompat.Builder builderMo11800a = C3854e.f15775a.mo11800a(this.context);
        builderMo11800a.setPriority(3);
        NotificationCompat.Builder contentText = builderMo11800a.setAutoCancel(true).setContentTitle(string).setContentText(string2);
        AbstractC22676k.m65749i(contentText, "setContentText(...)");
        c3853d.m11805a(contentText);
        C12966j0 c12966j0 = new C12966j0(this.context);
        c12966j0.m36448g(AbstractC17309g.f66902a);
        C12966j0.m36442f(c12966j0, AbstractC17307e.f66556C2);
        AbstractC21909c abstractC21909c = this.configRepo;
        DorsetLearnMoreUrl dorsetLearnMoreUrl = DorsetLearnMoreUrl.INSTANCE;
        C21908b configurations = abstractC21909c.getConfigurations();
        String name = dorsetLearnMoreUrl.getName();
        Object defaultValue = dorsetLearnMoreUrl.getDefaultValue();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(String.class);
        Object objM125868N0 = null;
        if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
            String str = (String) configurations.get(name);
            if (str != null) {
                objM125868N0 = AbstractC39421y.m125932Q(str);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
            String str2 = (String) configurations.get(name);
            if (str2 != null) {
                objM125868N0 = AbstractC39421y.m125933R(str2);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
            String str3 = (String) configurations.get(name);
            if (str3 != null) {
                objM125868N0 = AbstractC39420x.m125915y(str3);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
            String str4 = (String) configurations.get(name);
            if (str4 != null) {
                objM125868N0 = AbstractC39420x.m125914x(str4);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Boolean.TYPE))) {
            String str5 = (String) configurations.get(name);
            if (str5 != null) {
                objM125868N0 = AbstractC39414r.m125868N0(str5);
            }
        } else {
            objM125868N0 = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations.get(name) : defaultValue;
        }
        if (objM125868N0 != null) {
            defaultValue = objM125868N0;
        }
        if (defaultValue == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        c12966j0.m36447e(AbstractC12889b.m36273g(new C23465k(QueryParams.URL, (String) defaultValue)));
        contentText.setContentIntent(NotificationClickedReceiver.Companion.m24514b(NotificationClickedReceiver.INSTANCE, this.context, "dorset_detection", c12966j0.m36444b(), 125, 0, 16, null));
        this.log.mo85216g("Showing dorset notification", new AbstractC30556a.a[0]);
        notificationManager.notify(125, contentText.build());
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        AbstractC13091v.m36582H(AbstractC13091v.m36583I(new b(null), this.dorsetDetectionMonitor.getIsDetected()), this.backgroundScope);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onDestroy(InterfaceC1585g0 interfaceC1585g0) {
        super.onDestroy(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onPause(InterfaceC1585g0 interfaceC1585g0) {
        super.onPause(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onResume(InterfaceC1585g0 interfaceC1585g0) {
        super.onResume(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStart(InterfaceC1585g0 interfaceC1585g0) {
        super.onStart(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStop(InterfaceC1585g0 interfaceC1585g0) {
        super.onStop(interfaceC1585g0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C9993e(Context context, InterfaceC13596a interfaceC13596a, AbstractC21909c abstractC21909c, C35234a c35234a, FeatureFlagChecker featureFlagChecker, InterfaceC2994c0 interfaceC2994c0, Clock clock, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        Clock clock2;
        if ((i13 & 64) != 0) {
            Clock clockSystemUTC = Clock.systemUTC();
            AbstractC22676k.m65749i(clockSystemUTC, "systemUTC(...)");
            clock2 = clockSystemUTC;
        } else {
            clock2 = clock;
        }
        this(context, interfaceC13596a, abstractC21909c, c35234a, featureFlagChecker, interfaceC2994c0, clock2, (i13 & 128) != 0 ? InterfaceC34116n.INSTANCE.m107848a("DorsetDetectedNotification") : interfaceC34116n);
    }
}
