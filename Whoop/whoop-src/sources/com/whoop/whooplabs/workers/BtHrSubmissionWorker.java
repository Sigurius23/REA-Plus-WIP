package com.whoop.whooplabs.workers;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.work.WorkerParameters;
import c12.C3853d;
import c12.EnumC3851b;
import c12.InterfaceC3852c;
import c93.InterfaceC4339a;
import com.whoop.metrics.worker.BaseReportingWorker;
import com.whoop.whooplabs.C10823a;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import of3.InterfaceC27903a;
import oz2.InterfaceC28499a;
import p218ic.AbstractC18386u;
import p218ic.C18370m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import uv0.AbstractC35282b;
import vf3.InterfaceC35951a;
import yw2.AbstractC39833e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0010\u0010\rR\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010%¨\u0006)"}, m65681d2 = {"Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker;", "Lcom/whoop/metrics/worker/BaseReportingWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroid/app/Notification;", "k", "()Landroid/app/Notification;", "Lic/u;", "doWork", "(Lq83/d;)Ljava/lang/Object;", "j", "Lic/m;", "getForegroundInfo", "", "y", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "uniqueWorkName", "Lcom/whoop/whooplabs/a;", "z", "Ll83/h;", "m", "()Lcom/whoop/whooplabs/a;", "dwlServiceConnector", "Loz2/a;", "E", "l", "()Loz2/a;", "btHrPeriodicCheckScheduler", "Lc12/c;", "F", "n", "()Lc12/c;", "notificationInitializer", "G", "a", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class BtHrSubmissionWorker extends BaseReportingWorker {

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: H */
    public static final int f33345H = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h btHrPeriodicCheckScheduler;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h notificationInitializer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final String uniqueWorkName;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h dwlServiceConnector;

    /* JADX INFO: renamed from: com.whoop.whooplabs.workers.BtHrSubmissionWorker$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$a;", "", "<init>", "()V", "Lc12/d;", "b", "()Lc12/d;", "Landroid/content/Context;", "context", "Landroid/app/NotificationManager;", "manager", "Ll83/a0;", "c", "(Landroid/content/Context;Landroid/app/NotificationManager;)V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public final C3853d m28628b() {
            return new C3853d(EnumC3851b.LOW, "06625_WhoopLabs", AbstractC39833e.f171737v);
        }

        /* JADX INFO: renamed from: c */
        public final void m28629c(Context context, NotificationManager manager) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(manager, "manager");
            m28628b().m11806e(manager, context);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplabs.workers.BtHrSubmissionWorker$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.workers.BtHrSubmissionWorker", m100430f = "BtHrSubmissionWorker.kt", m100431l = {50, 51}, m100432m = "doWork", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10857b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f33350w;

        /* JADX INFO: renamed from: y */
        int f33352y;

        public C10857b(InterfaceC30057d<? super C10857b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f33350w = obj;
            this.f33352y |= Integer.MIN_VALUE;
            return BtHrSubmissionWorker.this.doWork(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplabs.workers.BtHrSubmissionWorker$c */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10858c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f33353w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f33354x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f33355y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10858c(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f33353w = interfaceC27903a;
            this.f33354x = interfaceC35951a;
            this.f33355y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [com.whoop.whooplabs.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C10823a invoke() {
            InterfaceC27903a interfaceC27903a = this.f33353w;
            InterfaceC35951a interfaceC35951a = this.f33354x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f33355y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C10823a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplabs.workers.BtHrSubmissionWorker$d */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10859d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f33356w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f33357x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f33358y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10859d(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f33356w = interfaceC27903a;
            this.f33357x = interfaceC35951a;
            this.f33358y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, oz2.a] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC28499a invoke() {
            InterfaceC27903a interfaceC27903a = this.f33356w;
            InterfaceC35951a interfaceC35951a = this.f33357x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f33358y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC28499a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplabs.workers.BtHrSubmissionWorker$e */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10860e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f33359w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f33360x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f33361y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10860e(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f33359w = interfaceC27903a;
            this.f33360x = interfaceC35951a;
            this.f33361y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [c12.c, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC3852c invoke() {
            InterfaceC27903a interfaceC27903a = this.f33359w;
            InterfaceC35951a interfaceC35951a = this.f33360x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f33361y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC3852c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplabs.workers.BtHrSubmissionWorker$f */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.workers.BtHrSubmissionWorker", m100430f = "BtHrSubmissionWorker.kt", m100431l = {58, 59}, m100432m = "work", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10861f extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f33362w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f33363x;

        /* JADX INFO: renamed from: z */
        int f33365z;

        public C10861f(InterfaceC30057d<? super C10861f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f33363x = obj;
            this.f33365z |= Integer.MIN_VALUE;
            return BtHrSubmissionWorker.this.mo18568j(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BtHrSubmissionWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(params, "params");
        this.uniqueWorkName = "DWL_BTHR_UPLOAD";
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.dwlServiceConnector = AbstractC30060g.m92087G(enumC23463i, new C10858c(this, null, null));
        this.btHrPeriodicCheckScheduler = AbstractC30060g.m92087G(enumC23463i, new C10859d(this, null, null));
        this.notificationInitializer = AbstractC30060g.m92087G(enumC23463i, new C10860e(this, null, null));
    }

    /* JADX INFO: renamed from: k */
    private final Notification m28623k() {
        InterfaceC3852c interfaceC3852cM28626n = m28626n();
        Context applicationContext = getApplicationContext();
        AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
        NotificationCompat.Builder ongoing = interfaceC3852cM28626n.mo11800a(applicationContext).setContentTitle(getApplicationContext().getString(AbstractC39833e.f171740y)).setContentText(getApplicationContext().getString(AbstractC39833e.f171739x)).setSmallIcon(AbstractC35282b.f150162a).setCategory(NotificationCompat.CATEGORY_STATUS).setOngoing(true);
        INSTANCE.m28628b().m11805a(ongoing);
        Notification notificationBuild = ongoing.build();
        AbstractC22676k.m65749i(notificationBuild, "build(...)");
        return notificationBuild;
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC28499a m28624l() {
        return (InterfaceC28499a) this.btHrPeriodicCheckScheduler.getValue();
    }

    /* JADX INFO: renamed from: m */
    private final C10823a m28625m() {
        return (C10823a) this.dwlServiceConnector.getValue();
    }

    /* JADX INFO: renamed from: n */
    private final InterfaceC3852c m28626n() {
        return (InterfaceC3852c) this.notificationInitializer.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.whoop.metrics.worker.BaseReportingWorker, androidx.work.CoroutineWorker
    public Object doWork(InterfaceC30057d<? super AbstractC18386u> interfaceC30057d) {
        C10857b c10857b;
        if (interfaceC30057d instanceof C10857b) {
            c10857b = (C10857b) interfaceC30057d;
            int i13 = c10857b.f33352y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c10857b.f33352y = i13 - Integer.MIN_VALUE;
            } else {
                c10857b = new C10857b(interfaceC30057d);
            }
        } else {
            c10857b = new C10857b(interfaceC30057d);
        }
        Object obj = c10857b.f33350w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c10857b.f33352y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c10857b.f33352y = 1;
            if (m22896g(c10857b) != obj2) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        AbstractC34132o.m107864I(obj);
        c10857b.f33352y = 2;
        Object objDoWork = super.doWork(c10857b);
        return objDoWork == obj2 ? obj2 : objDoWork;
    }

    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getUniqueWorkName() {
        return this.uniqueWorkName;
    }

    @Override // androidx.work.CoroutineWorker
    public Object getForegroundInfo(InterfaceC30057d<? super C18370m> interfaceC30057d) {
        return Build.VERSION.SDK_INT >= 29 ? new C18370m(109, m28623k(), 17) : new C18370m(109, m28623k());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (r9 == r1) goto L21;
     */
    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo18568j(q83.InterfaceC30057d<? super p218ic.AbstractC18386u> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.whoop.whooplabs.workers.BtHrSubmissionWorker.C10861f
            if (r0 == 0) goto L13
            r0 = r9
            com.whoop.whooplabs.workers.BtHrSubmissionWorker$f r0 = (com.whoop.whooplabs.workers.BtHrSubmissionWorker.C10861f) r0
            int r1 = r0.f33365z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33365z = r1
            goto L18
        L13:
            com.whoop.whooplabs.workers.BtHrSubmissionWorker$f r0 = new com.whoop.whooplabs.workers.BtHrSubmissionWorker$f
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f33363x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f33365z
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r0 = r0.f33362w
            com.whoop.whooplabs.WhoopLabsService r0 = (com.whoop.whooplabs.WhoopLabsService) r0
            p505ts.AbstractC34132o.m107864I(r9)
            goto L6b
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            p505ts.AbstractC34132o.m107864I(r9)
            goto L5e
        L3c:
            p505ts.AbstractC34132o.m107864I(r9)
            tr2.n r9 = r8.m22895c()
            java.lang.String r2 = "Started work"
            qr2.a$a[] r7 = new qr2.AbstractC30556a.a[r6]
            r9.mo85216g(r2, r7)
            oz2.a r9 = r8.m28624l()
            r9.mo86812b()
            com.whoop.whooplabs.a r9 = r8.m28625m()
            r0.f33365z = r5
            java.lang.Object r9 = r9.m28485c(r3, r0)
            if (r9 != r1) goto L5e
            goto L6a
        L5e:
            com.whoop.whooplabs.WhoopLabsService r9 = (com.whoop.whooplabs.WhoopLabsService) r9
            r0.f33362w = r3
            r0.f33365z = r4
            java.lang.Object r9 = r9.m28470l(r0)
            if (r9 != r1) goto L6b
        L6a:
            return r1
        L6b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L83
            tr2.n r9 = r8.m22895c()
            java.lang.String r0 = "Finished uploading data"
            qr2.a$a[] r1 = new qr2.AbstractC30556a.a[r6]
            r9.mo85216g(r0, r1)
            ic.t r9 = p218ic.AbstractC18386u.m52885b()
            return r9
        L83:
            tr2.n r9 = r8.m22895c()
            java.lang.String r0 = "Error uploading data"
            qr2.a$a[] r1 = new qr2.AbstractC30556a.a[r6]
            r9.mo85216g(r0, r1)
            ic.r r9 = new ic.r
            r9.<init>()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.whooplabs.workers.BtHrSubmissionWorker.mo18568j(q83.d):java.lang.Object");
    }
}
