package com.whoop.data.repositories;

import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import bh.InterfaceC3242e;
import c93.InterfaceC4351m;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.whoop.data.remote.AppConfigurationRepository;
import ha0.InterfaceC17048a;
import ha0.InterfaceC17052e;
import hc3.AbstractC17182o;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import od1.C27856s;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tm0.InterfaceC33949a;
import tr2.InterfaceC34116n;
import wm0.C37378a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010 R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010!R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\"R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, m65681d2 = {"Lcom/whoop/data/repositories/CachedDataLanguageRefresher;", "", "Lod1/s;", "sportMgr", "Ltm0/a;", "cacheNuke", "Lwm0/a;", "scopeCoordinator", "Lha0/a;", "activitiesDao", "Lha0/e;", "recentActivitiesDao", "Lbh/e;", "coilImageLoader", "Lcom/bumptech/glide/b;", "glide", "Lcom/whoop/data/remote/AppConfigurationRepository;", "appConfigurationRepository", "Lq83/j;", "ioContext", "mainContext", "<init>", "(Lod1/s;Ltm0/a;Lwm0/a;Lha0/a;Lha0/e;Lbh/e;Lcom/bumptech/glide/b;Lcom/whoop/data/remote/AppConfigurationRepository;Lq83/j;Lq83/j;)V", "Ll83/a0;", "refreshForLanguageChange", "(Lq83/d;)Ljava/lang/Object;", "Lod1/s;", "Ltm0/a;", "Lwm0/a;", "Lha0/a;", "Lha0/e;", "Lbh/e;", "Lcom/bumptech/glide/b;", "Lcom/whoop/data/remote/AppConfigurationRepository;", "Lq83/j;", "Ltr2/n;", "logger", "Ltr2/n;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class CachedDataLanguageRefresher {
    private final InterfaceC17048a activitiesDao;
    private final AppConfigurationRepository appConfigurationRepository;
    private final InterfaceC33949a cacheNuke;
    private final InterfaceC3242e coilImageLoader;
    private final ComponentCallbacks2C4960b glide;
    private final InterfaceC30063j ioContext;
    private final InterfaceC34116n logger;
    private final InterfaceC30063j mainContext;
    private final InterfaceC17052e recentActivitiesDao;
    private final C37378a scopeCoordinator;
    private final C27856s sportMgr;

    /* JADX INFO: renamed from: com.whoop.data.repositories.CachedDataLanguageRefresher$refreshForLanguageChange$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.CachedDataLanguageRefresher", m100430f = "CachedDataLanguageRefresher.kt", m100431l = {40, 69}, m100432m = "refreshForLanguageChange", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65471 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C65471(InterfaceC30057d<? super C65471> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CachedDataLanguageRefresher.this.refreshForLanguageChange(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.CachedDataLanguageRefresher$refreshForLanguageChange$2 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.CachedDataLanguageRefresher$refreshForLanguageChange$2", m100430f = "CachedDataLanguageRefresher.kt", m100431l = {47, 53, 54, 55, 58, 62}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C65482 extends AbstractC32275i implements InterfaceC4351m {
        private /* synthetic */ Object L$0;
        int label;

        public C65482(InterfaceC30057d<? super C65482> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C65482 c65482 = CachedDataLanguageRefresher.this.new C65482(interfaceC30057d);
            c65482.L$0 = obj;
            return c65482;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C65482) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0084  */
        /* JADX WARN: Code duplicated, block: B:31:0x0098  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
        
            if (r9.refresh("language_change", r8) == r1) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00b0, code lost:
        
            if (r9.mo48127c(r8) == r1) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00c2, code lost:
        
            if (r9.mo48150c(r8) == r1) goto L37;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 350
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.repositories.CachedDataLanguageRefresher.C65482.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.CachedDataLanguageRefresher$refreshForLanguageChange$3 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.CachedDataLanguageRefresher$refreshForLanguageChange$3", m100430f = "CachedDataLanguageRefresher.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C65493 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C65493(InterfaceC30057d<? super C65493> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return CachedDataLanguageRefresher.this.new C65493(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C65493) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            CachedDataLanguageRefresher.this.glide.m15531b();
            return C23454a0.f92919a;
        }
    }

    public CachedDataLanguageRefresher(C27856s sportMgr, InterfaceC33949a cacheNuke, C37378a scopeCoordinator, InterfaceC17048a activitiesDao, InterfaceC17052e recentActivitiesDao, InterfaceC3242e coilImageLoader, ComponentCallbacks2C4960b glide, AppConfigurationRepository appConfigurationRepository, InterfaceC30063j ioContext, InterfaceC30063j mainContext) {
        AbstractC22676k.m65750j(sportMgr, "sportMgr");
        AbstractC22676k.m65750j(cacheNuke, "cacheNuke");
        AbstractC22676k.m65750j(scopeCoordinator, "scopeCoordinator");
        AbstractC22676k.m65750j(activitiesDao, "activitiesDao");
        AbstractC22676k.m65750j(recentActivitiesDao, "recentActivitiesDao");
        AbstractC22676k.m65750j(coilImageLoader, "coilImageLoader");
        AbstractC22676k.m65750j(glide, "glide");
        AbstractC22676k.m65750j(appConfigurationRepository, "appConfigurationRepository");
        AbstractC22676k.m65750j(ioContext, "ioContext");
        AbstractC22676k.m65750j(mainContext, "mainContext");
        this.sportMgr = sportMgr;
        this.cacheNuke = cacheNuke;
        this.scopeCoordinator = scopeCoordinator;
        this.activitiesDao = activitiesDao;
        this.recentActivitiesDao = recentActivitiesDao;
        this.coilImageLoader = coilImageLoader;
        this.glide = glide;
        this.appConfigurationRepository = appConfigurationRepository;
        this.ioContext = ioContext;
        this.mainContext = mainContext;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("CachedDataLanguageRefresher");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (bc3.AbstractC3006f0.m8705K(r7, r2, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refreshForLanguageChange(q83.InterfaceC30057d<? super l83.C23454a0> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.whoop.data.repositories.CachedDataLanguageRefresher.C65471
            if (r0 == 0) goto L13
            r0 = r7
            com.whoop.data.repositories.CachedDataLanguageRefresher$refreshForLanguageChange$1 r0 = (com.whoop.data.repositories.CachedDataLanguageRefresher.C65471) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.whoop.data.repositories.CachedDataLanguageRefresher$refreshForLanguageChange$1 r0 = new com.whoop.data.repositories.CachedDataLanguageRefresher$refreshForLanguageChange$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            p505ts.AbstractC34132o.m107864I(r7)
            goto L5a
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            p505ts.AbstractC34132o.m107864I(r7)
            goto L4a
        L37:
            p505ts.AbstractC34132o.m107864I(r7)
            q83.j r7 = r6.ioContext
            com.whoop.data.repositories.CachedDataLanguageRefresher$refreshForLanguageChange$2 r2 = new com.whoop.data.repositories.CachedDataLanguageRefresher$refreshForLanguageChange$2
            r2.<init>(r3)
            r0.label = r5
            java.lang.Object r7 = bc3.AbstractC3006f0.m8705K(r7, r2, r0)
            if (r7 != r1) goto L4a
            goto L59
        L4a:
            q83.j r7 = r6.mainContext
            com.whoop.data.repositories.CachedDataLanguageRefresher$refreshForLanguageChange$3 r2 = new com.whoop.data.repositories.CachedDataLanguageRefresher$refreshForLanguageChange$3
            r2.<init>(r3)
            r0.label = r4
            java.lang.Object r7 = bc3.AbstractC3006f0.m8705K(r7, r2, r0)
            if (r7 != r1) goto L5a
        L59:
            return r1
        L5a:
            l83.a0 r7 = l83.C23454a0.f92919a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.repositories.CachedDataLanguageRefresher.refreshForLanguageChange(q83.d):java.lang.Object");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CachedDataLanguageRefresher(C27856s c27856s, InterfaceC33949a interfaceC33949a, C37378a c37378a, InterfaceC17048a interfaceC17048a, InterfaceC17052e interfaceC17052e, InterfaceC3242e interfaceC3242e, ComponentCallbacks2C4960b componentCallbacks2C4960b, AppConfigurationRepository appConfigurationRepository, InterfaceC30063j interfaceC30063j, InterfaceC30063j interfaceC30063j2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        InterfaceC30063j interfaceC30063j3;
        InterfaceC30063j interfaceC30063jMo8825s;
        if ((i13 & 256) != 0) {
            C22365e c22365e = AbstractC3050q0.f12077a;
            interfaceC30063j3 = ExecutorC22364d.f87316w;
        } else {
            interfaceC30063j3 = interfaceC30063j;
        }
        if ((i13 & 512) != 0) {
            C22365e c22365e2 = AbstractC3050q0.f12077a;
            interfaceC30063jMo8825s = AbstractC17182o.f65999a.mo8825s();
        } else {
            interfaceC30063jMo8825s = interfaceC30063j2;
        }
        this(c27856s, interfaceC33949a, c37378a, interfaceC17048a, interfaceC17052e, interfaceC3242e, componentCallbacks2C4960b, appConfigurationRepository, interfaceC30063j3, interfaceC30063jMo8825s);
    }
}
