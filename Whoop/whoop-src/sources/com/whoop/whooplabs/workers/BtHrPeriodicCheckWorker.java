package com.whoop.whooplabs.workers;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.work.WorkerParameters;
import bc3.AbstractC3028k2;
import bc3.InterfaceC2994c0;
import c12.C3853d;
import c12.EnumC3851b;
import c12.InterfaceC3852c;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.metrics.worker.BaseReportingWorker;
import com.whoop.whooplabs.C10823a;
import j93.InterfaceC21461d;
import js0.AbstractC21907a;
import js0.AbstractC21909c;
import js0.C21908b;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import of3.InterfaceC27903a;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p218ic.AbstractC18386u;
import p218ic.C18370m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uv0.AbstractC35282b;
import vf3.InterfaceC35951a;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;
import yw2.AbstractC39833e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 /2\u00020\u0001:\u000201B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u000f\u0010\rR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0096D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0012\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0012\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00062"}, m65681d2 = {"Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;", "Lcom/whoop/metrics/worker/BaseReportingWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroid/app/Notification;", "n", "()Landroid/app/Notification;", "Lic/u;", "j", "(Lq83/d;)Ljava/lang/Object;", "Lic/m;", "getForegroundInfo", "Ljs0/c;", "y", "Ll83/h;", "o", "()Ljs0/c;", "configRepo", "", "z", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "uniqueWorkName", "Lc12/c;", "E", "r", "()Lc12/c;", "notificationInitializer", "Lcom/whoop/whooplabs/a;", "F", "p", "()Lcom/whoop/whooplabs/a;", "dwlService", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "G", "q", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lkotlin/time/Duration;", "H", "J", "workerTimeout", "I", "a", "b", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class BtHrPeriodicCheckWorker extends BaseReportingWorker {

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: J */
    public static final int f33317J = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h notificationInitializer;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h dwlService;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final long workerTimeout;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h configRepo;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final String uniqueWorkName;

    /* JADX INFO: renamed from: com.whoop.whooplabs.workers.BtHrPeriodicCheckWorker$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$a;", "Ljs0/a;", "", "<init>", "()V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10848a extends AbstractC21907a<Long> {

        /* JADX INFO: renamed from: a */
        public static final C10848a f33324a = new C10848a();

        /* JADX INFO: renamed from: b */
        public static final int f33325b = 8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private C10848a() {
            super("DWL_BTHR_WORKER_TIMEOUT", Long.valueOf(Duration.m134273getInWholeMillisecondsimpl(DurationKt.toDuration(8, DurationUnit.MINUTES))));
            Duration.Companion companion = Duration.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplabs.workers.BtHrPeriodicCheckWorker$b, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$b;", "", "<init>", "()V", "Lc12/d;", "b", "()Lc12/d;", "Landroid/content/Context;", "context", "Landroid/app/NotificationManager;", "manager", "Ll83/a0;", "c", "(Landroid/content/Context;Landroid/app/NotificationManager;)V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public final C3853d m28621b() {
            return new C3853d(EnumC3851b.MEDIUM, "06625_WhoopLabs", AbstractC39833e.f171737v);
        }

        /* JADX INFO: renamed from: c */
        public final void m28622c(Context context, NotificationManager manager) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(manager, "manager");
            m28621b().m11806e(manager, context);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplabs.workers.BtHrPeriodicCheckWorker$c */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10850c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f33326w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f33327x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f33328y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10850c(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f33326w = interfaceC27903a;
            this.f33327x = interfaceC35951a;
            this.f33328y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, js0.c] */
        @Override // c93.InterfaceC4339a
        public final AbstractC21909c invoke() {
            InterfaceC27903a interfaceC27903a = this.f33326w;
            InterfaceC35951a interfaceC35951a = this.f33327x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f33328y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC21909c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplabs.workers.BtHrPeriodicCheckWorker$d */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10851d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f33329w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f33330x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f33331y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10851d(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f33329w = interfaceC27903a;
            this.f33330x = interfaceC35951a;
            this.f33331y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [c12.c, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC3852c invoke() {
            InterfaceC27903a interfaceC27903a = this.f33329w;
            InterfaceC35951a interfaceC35951a = this.f33330x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f33331y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC3852c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplabs.workers.BtHrPeriodicCheckWorker$e */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10852e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f33332w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f33333x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f33334y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10852e(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f33332w = interfaceC27903a;
            this.f33333x = interfaceC35951a;
            this.f33334y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [com.whoop.whooplabs.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C10823a invoke() {
            InterfaceC27903a interfaceC27903a = this.f33332w;
            InterfaceC35951a interfaceC35951a = this.f33333x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f33334y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C10823a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplabs.workers.BtHrPeriodicCheckWorker$f */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10853f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f33335w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f33336x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f33337y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10853f(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f33335w = interfaceC27903a;
            this.f33336x = interfaceC35951a;
            this.f33337y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            InterfaceC27903a interfaceC27903a = this.f33335w;
            InterfaceC35951a interfaceC35951a = this.f33336x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f33337y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplabs.workers.BtHrPeriodicCheckWorker$g */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.workers.BtHrPeriodicCheckWorker", m100430f = "BtHrPeriodicCheckWorker.kt", m100431l = {48}, m100432m = "work", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10854g extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f33338w;

        /* JADX INFO: renamed from: y */
        int f33340y;

        public C10854g(InterfaceC30057d<? super C10854g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f33338w = obj;
            this.f33340y |= Integer.MIN_VALUE;
            return BtHrPeriodicCheckWorker.this.mo18568j(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplabs.workers.BtHrPeriodicCheckWorker$h */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.workers.BtHrPeriodicCheckWorker$work$completed$1", m100430f = "BtHrPeriodicCheckWorker.kt", m100431l = {49, 52, 55}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10855h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f33341w;

        /* JADX INFO: renamed from: x */
        int f33342x;

        public C10855h(InterfaceC30057d<? super C10855h> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return BtHrPeriodicCheckWorker.this.new C10855h(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10855h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
        
            if (r7.m28467D(r6) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
        
            if (r7.m28466B(r6) == r0) goto L22;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r6.f33342x
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L25
                if (r1 == r4) goto L21
                if (r1 == r3) goto L19
                if (r1 != r2) goto L11
                goto L19
            L11:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L19:
                java.lang.Object r0 = r6.f33341w
                com.whoop.whooplabs.WhoopLabsService r0 = (com.whoop.whooplabs.WhoopLabsService) r0
                p505ts.AbstractC34132o.m107864I(r7)
                goto L78
            L21:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L37
            L25:
                p505ts.AbstractC34132o.m107864I(r7)
                com.whoop.whooplabs.workers.BtHrPeriodicCheckWorker r7 = com.whoop.whooplabs.workers.BtHrPeriodicCheckWorker.this
                com.whoop.whooplabs.a r7 = com.whoop.whooplabs.workers.BtHrPeriodicCheckWorker.m28612k(r7)
                r6.f33342x = r4
                java.lang.Object r7 = r7.m28485c(r5, r6)
                if (r7 != r0) goto L37
                goto L77
            L37:
                com.whoop.whooplabs.WhoopLabsService r7 = (com.whoop.whooplabs.WhoopLabsService) r7
                com.whoop.whooplabs.workers.BtHrPeriodicCheckWorker r1 = com.whoop.whooplabs.workers.BtHrPeriodicCheckWorker.this
                com.whoop.data.repositories.FeatureFlagChecker r1 = com.whoop.whooplabs.workers.BtHrPeriodicCheckWorker.m28613l(r1)
                java.lang.String r4 = "dwl-android-bthr-periodic-upload"
                boolean r1 = r1.isFeatureEnabled(r4)
                r4 = 0
                if (r1 == 0) goto L60
                com.whoop.whooplabs.workers.BtHrPeriodicCheckWorker r1 = com.whoop.whooplabs.workers.BtHrPeriodicCheckWorker.this
                tr2.n r1 = com.whoop.whooplabs.workers.BtHrPeriodicCheckWorker.m28614m(r1)
                java.lang.String r2 = "Periodic BTHR upload enabled, uploading partial HR data"
                qr2.a$a[] r4 = new qr2.AbstractC30556a.a[r4]
                r1.mo85216g(r2, r4)
                r6.f33341w = r5
                r6.f33342x = r3
                java.lang.Object r7 = r7.m28467D(r6)
                if (r7 != r0) goto L78
                goto L77
            L60:
                com.whoop.whooplabs.workers.BtHrPeriodicCheckWorker r1 = com.whoop.whooplabs.workers.BtHrPeriodicCheckWorker.this
                tr2.n r1 = com.whoop.whooplabs.workers.BtHrPeriodicCheckWorker.m28614m(r1)
                java.lang.String r3 = "Periodic BTHR upload disabled, checking for end of collection and stale HR data"
                qr2.a$a[] r4 = new qr2.AbstractC30556a.a[r4]
                r1.mo85216g(r3, r4)
                r6.f33341w = r5
                r6.f33342x = r2
                java.lang.Object r7 = r7.m28466B(r6)
                if (r7 != r0) goto L78
            L77:
                return r0
            L78:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.whooplabs.workers.BtHrPeriodicCheckWorker.C10855h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BtHrPeriodicCheckWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(params, "params");
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        Object objM125868N0 = null;
        this.configRepo = AbstractC30060g.m92087G(enumC23463i, new C10850c(this, null, null));
        this.uniqueWorkName = "DWL_BTHR_PERIODIC_CHECK";
        this.notificationInitializer = AbstractC30060g.m92087G(enumC23463i, new C10851d(this, null, null));
        this.dwlService = AbstractC30060g.m92087G(enumC23463i, new C10852e(this, null, null));
        this.featureFlagChecker = AbstractC30060g.m92087G(enumC23463i, new C10853f(this, null, null));
        AbstractC21909c abstractC21909cM28616o = m28616o();
        C10848a c10848a = C10848a.f33324a;
        C21908b configurations = abstractC21909cM28616o.getConfigurations();
        String name = c10848a.getName();
        Object defaultValue = c10848a.getDefaultValue();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Long.class);
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
        defaultValue = objM125868N0 != null ? objM125868N0 : defaultValue;
        if (defaultValue == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }
        this.workerTimeout = DurationKt.toDuration(((Long) defaultValue).longValue(), DurationUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: n */
    private final Notification m28615n() {
        InterfaceC3852c interfaceC3852cM28619r = m28619r();
        Context applicationContext = getApplicationContext();
        AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
        NotificationCompat.Builder ongoing = interfaceC3852cM28619r.mo11800a(applicationContext).setContentTitle(getApplicationContext().getString(AbstractC39833e.f171740y)).setContentText(getApplicationContext().getString(AbstractC39833e.f171739x)).setSmallIcon(AbstractC35282b.f150162a).setCategory(NotificationCompat.CATEGORY_STATUS).setOngoing(true);
        INSTANCE.m28621b().m11805a(ongoing);
        Notification notificationBuild = ongoing.build();
        AbstractC22676k.m65749i(notificationBuild, "build(...)");
        return notificationBuild;
    }

    /* JADX INFO: renamed from: o */
    private final AbstractC21909c m28616o() {
        return (AbstractC21909c) this.configRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final C10823a m28617p() {
        return (C10823a) this.dwlService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final FeatureFlagChecker m28618q() {
        return (FeatureFlagChecker) this.featureFlagChecker.getValue();
    }

    /* JADX INFO: renamed from: r */
    private final InterfaceC3852c m28619r() {
        return (InterfaceC3852c) this.notificationInitializer.getValue();
    }

    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getUniqueWorkName() {
        return this.uniqueWorkName;
    }

    @Override // androidx.work.CoroutineWorker
    public Object getForegroundInfo(InterfaceC30057d<? super C18370m> interfaceC30057d) {
        return Build.VERSION.SDK_INT >= 29 ? new C18370m(109, m28615n(), 17) : new C18370m(109, m28615n());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: j */
    public Object mo18568j(InterfaceC30057d<? super AbstractC18386u> interfaceC30057d) {
        C10854g c10854g;
        if (interfaceC30057d instanceof C10854g) {
            c10854g = (C10854g) interfaceC30057d;
            int i13 = c10854g.f33340y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c10854g.f33340y = i13 - Integer.MIN_VALUE;
            } else {
                c10854g = new C10854g(interfaceC30057d);
            }
        } else {
            c10854g = new C10854g(interfaceC30057d);
        }
        Object objM8751e = c10854g.f33338w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c10854g.f33340y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8751e);
            m22895c().mo85216g(AbstractC11895b.m31996o("Starting ", getUniqueWorkName(), " worker"), new AbstractC30556a.a[0]);
            long j7 = this.workerTimeout;
            C10855h c10855h = new C10855h(null);
            c10854g.f33340y = 1;
            objM8751e = AbstractC3028k2.m8751e(j7, c10855h, c10854g);
            if (objM8751e == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM8751e);
        }
        if (((C23454a0) objM8751e) == null) {
            m22895c().mo85222m(AbstractC2875y.m8299l(getUniqueWorkName(), " timeout, will retry on next scheduled run"), new AbstractC30556a.a[0]);
        }
        return AbstractC18386u.m52885b();
    }
}
