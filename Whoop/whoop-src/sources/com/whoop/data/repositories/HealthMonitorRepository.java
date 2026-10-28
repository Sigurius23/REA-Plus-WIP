package com.whoop.data.repositories;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.remote.api.FileDownloaderApi;
import com.whoop.service.network.HealthMonitorUsersApiMigrations;
import com.whoop.service.network.UsersApi;
import in2.InterfaceC18732d;
import io.getstream.chat.android.client.api.QueryParams;
import l83.C23454a0;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import ud3.AbstractC34799a1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001a0\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0086@¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010'R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010(¨\u0006)"}, m65681d2 = {"Lcom/whoop/data/repositories/HealthMonitorRepository;", "", "Lcom/whoop/service/network/UsersApi;", "remoteService", "Lcom/whoop/service/network/HealthMonitorUsersApiMigrations;", "healthMonitorUsersApiMigrations", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ltr2/n;", "logger", "Lrr2/c;", "crashReporter", "Lcom/whoop/data/remote/api/FileDownloaderApi;", "fileDownloaderApi", "Lin2/d;", "dispatcherFactory", "<init>", "(Lcom/whoop/service/network/UsersApi;Lcom/whoop/service/network/HealthMonitorUsersApiMigrations;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;Lrr2/c;Lcom/whoop/data/remote/api/FileDownloaderApi;Lin2/d;)V", "", "useNewApi", "()Z", "useMigratedApi", "", "getHealthReportUrl", "(ZLq83/d;)Ljava/lang/Object;", QueryParams.URL, "Lud3/a1;", "downloadHealthReportFromUrl", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "", "amountOfTries", "Lcom/whoop/data/remote/commons/Resource;", "getHealthReport", "(ILq83/d;)Ljava/lang/Object;", "Lcom/whoop/service/network/UsersApi;", "Lcom/whoop/service/network/HealthMonitorUsersApiMigrations;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Ltr2/n;", "Lrr2/c;", "Lcom/whoop/data/remote/api/FileDownloaderApi;", "Lin2/d;", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class HealthMonitorRepository {
    public static final int $stable = 8;
    private final InterfaceC31766c crashReporter;
    private final InterfaceC18732d dispatcherFactory;
    private final FeatureFlagChecker featureFlagChecker;
    private final FileDownloaderApi fileDownloaderApi;
    private final HealthMonitorUsersApiMigrations healthMonitorUsersApiMigrations;
    private final InterfaceC34116n logger;
    private final UsersApi remoteService;

    /* JADX INFO: renamed from: com.whoop.data.repositories.HealthMonitorRepository$downloadHealthReportFromUrl$2 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.HealthMonitorRepository$downloadHealthReportFromUrl$2", m100430f = "HealthMonitorRepository.kt", m100431l = {HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lud3/a1;", "<anonymous>", "(Lbc3/c0;)Lud3/a1;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C65672 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C65672(String str, InterfaceC30057d<? super C65672> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$url = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return HealthMonitorRepository.this.new C65672(this.$url, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC34799a1> interfaceC30057d) {
            return ((C65672) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            FileDownloaderApi fileDownloaderApi = HealthMonitorRepository.this.fileDownloaderApi;
            String str = this.$url;
            this.label = 1;
            Object objDownloadFile = fileDownloaderApi.downloadFile(str, this);
            return objDownloadFile == enumC31071a ? enumC31071a : objDownloadFile;
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.HealthMonitorRepository$getHealthReport$1 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.HealthMonitorRepository", m100430f = "HealthMonitorRepository.kt", m100431l = {42, 44, 46, 48, 59}, m100432m = "getHealthReport", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65681 extends AbstractC32269c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C65681(InterfaceC30057d<? super C65681> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthMonitorRepository.this.getHealthReport(0, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.HealthMonitorRepository$getHealthReportUrl$1 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.HealthMonitorRepository", m100430f = "HealthMonitorRepository.kt", m100431l = {67, 69}, m100432m = "getHealthReportUrl", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65691 extends AbstractC32269c {
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C65691(InterfaceC30057d<? super C65691> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthMonitorRepository.this.getHealthReportUrl(false, this);
        }
    }

    public HealthMonitorRepository(UsersApi remoteService, HealthMonitorUsersApiMigrations healthMonitorUsersApiMigrations, FeatureFlagChecker featureFlagChecker, InterfaceC34116n logger, InterfaceC31766c crashReporter, FileDownloaderApi fileDownloaderApi, InterfaceC18732d dispatcherFactory) {
        AbstractC22676k.m65750j(remoteService, "remoteService");
        AbstractC22676k.m65750j(healthMonitorUsersApiMigrations, "healthMonitorUsersApiMigrations");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(fileDownloaderApi, "fileDownloaderApi");
        AbstractC22676k.m65750j(dispatcherFactory, "dispatcherFactory");
        this.remoteService = remoteService;
        this.healthMonitorUsersApiMigrations = healthMonitorUsersApiMigrations;
        this.featureFlagChecker = featureFlagChecker;
        this.logger = logger;
        this.crashReporter = crashReporter;
        this.fileDownloaderApi = fileDownloaderApi;
        this.dispatcherFactory = dispatcherFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object downloadHealthReportFromUrl(String str, InterfaceC30057d<? super AbstractC34799a1> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new C65672(str, null), interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r8 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        if (r8 == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getHealthReportUrl(boolean r7, q83.InterfaceC30057d<? super java.lang.String> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.whoop.data.repositories.HealthMonitorRepository.C65691
            if (r0 == 0) goto L13
            r0 = r8
            com.whoop.data.repositories.HealthMonitorRepository$getHealthReportUrl$1 r0 = (com.whoop.data.repositories.HealthMonitorRepository.C65691) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.whoop.data.repositories.HealthMonitorRepository$getHealthReportUrl$1 r0 = new com.whoop.data.repositories.HealthMonitorRepository$getHealthReportUrl$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            p505ts.AbstractC34132o.m107864I(r8)
            goto L64
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            p505ts.AbstractC34132o.m107864I(r8)
            goto L49
        L37:
            p505ts.AbstractC34132o.m107864I(r8)
            if (r7 == 0) goto L57
            com.whoop.service.network.HealthMonitorUsersApiMigrations r8 = r6.healthMonitorUsersApiMigrations
            r0.Z$0 = r7
            r0.label = r5
            java.lang.Object r8 = r8.getHealthReportUrl(r0)
            if (r8 != r1) goto L49
            goto L63
        L49:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L56
            java.lang.CharSequence r7 = yb3.AbstractC39414r.m125869O0(r8)
            java.lang.String r7 = r7.toString()
            return r7
        L56:
            return r3
        L57:
            com.whoop.service.network.UsersApi r8 = r6.remoteService
            r0.Z$0 = r7
            r0.label = r4
            java.lang.Object r8 = r8.getHealthReportUrl(r0)
            if (r8 != r1) goto L64
        L63:
            return r1
        L64:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L71
            java.lang.CharSequence r7 = yb3.AbstractC39414r.m125869O0(r8)
            java.lang.String r7 = r7.toString()
            return r7
        L71:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.repositories.HealthMonitorRepository.getHealthReportUrl(boolean, q83.d):java.lang.Object");
    }

    private final boolean useNewApi() {
        return this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.KT_SERIALIZATION_HEALTH_MONITOR_USERS_API);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0163 -> B:16:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
        jadx.core.utils.exceptions.JadxRuntimeException: PHI empty after try-catch fix!
        	at jadx.core.dex.visitors.ssa.SSATransform.fixPhiInTryCatch(SSATransform.java:222)
        	at jadx.core.dex.visitors.ssa.SSATransform.fixLastAssignInTry(SSATransform.java:202)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:58)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:44)
        */
    public final java.lang.Object getHealthReport(
    /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
        jadx.core.utils.exceptions.JadxRuntimeException: PHI empty after try-catch fix!
        	at jadx.core.dex.visitors.ssa.SSATransform.fixPhiInTryCatch(SSATransform.java:222)
        	at jadx.core.dex.visitors.ssa.SSATransform.fixLastAssignInTry(SSATransform.java:202)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:58)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r23v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
}
