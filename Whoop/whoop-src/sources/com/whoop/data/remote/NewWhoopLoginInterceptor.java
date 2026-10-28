package com.whoop.data.remote;

import com.whoop.data.repositories.FeatureFlagRepository;
import com.whoop.domain.model.AuthMaterial;
import com.whoop.domain.model.Session;
import com.whoop.domain.model.User;
import js0.AbstractC21909c;
import l83.C23454a0;
import od1.C27847j;
import od1.C27853p;
import od1.InterfaceC27837a0;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import we1.C37223g;
import y92.C39352a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010%\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020\u001d2\n\u0010!\u001a\u00060\u001fj\u0002` 2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J0\u0010)\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020'H\u0086@¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010/R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00100R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00101R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00102¨\u00063"}, m65681d2 = {"Lcom/whoop/data/remote/NewWhoopLoginInterceptor;", "", "Lrr2/c;", "crashReporter", "Lod1/j;", "pendingUserSessionRepository", "Ljs0/c;", "configurationRepository", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "featureFlagRepository", "Lwe1/g;", "entitlementsRepository", "Lcom/whoop/data/remote/AppConfigurationRepository;", "appConfigurationRepository", "Ly92/a;", "authManager", "Ltr2/n;", "logger", "<init>", "(Lrr2/c;Lod1/j;Ljs0/c;Lcom/whoop/data/repositories/FeatureFlagRepository;Lwe1/g;Lcom/whoop/data/remote/AppConfigurationRepository;Ly92/a;Ltr2/n;)V", "Lcom/whoop/domain/model/Session;", "session", "Ll83/a0;", "setPendingUserSessionCredentials", "(Lcom/whoop/domain/model/Session;)V", "Lod1/p;", "sessionMgr", "onSuccess", "(Lcom/whoop/domain/model/Session;Lod1/p;Lq83/d;)Ljava/lang/Object;", "Lod1/a0;", "userSessionManager", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "", "id", "", "onFailure", "(Lod1/a0;Ljava/lang/Exception;I)Ljava/lang/Void;", "", "fromCreation", "interceptSuspend", "(Lcom/whoop/domain/model/Session;Lod1/p;Lod1/a0;ZLq83/d;)Ljava/lang/Object;", "Lrr2/c;", "Lod1/j;", "Ljs0/c;", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "Lwe1/g;", "Lcom/whoop/data/remote/AppConfigurationRepository;", "Ly92/a;", "Ltr2/n;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class NewWhoopLoginInterceptor {
    private final AppConfigurationRepository appConfigurationRepository;
    private final C39352a authManager;
    private final AbstractC21909c configurationRepository;
    private final InterfaceC31766c crashReporter;
    private final C37223g entitlementsRepository;
    private final FeatureFlagRepository featureFlagRepository;
    private final InterfaceC34116n logger;
    private final C27847j pendingUserSessionRepository;

    /* JADX INFO: renamed from: com.whoop.data.remote.NewWhoopLoginInterceptor$interceptSuspend$1 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.remote.NewWhoopLoginInterceptor", m100430f = "NewWhoopLoginInterceptor.kt", m100431l = {34, 35, 36, 37, 39}, m100432m = "interceptSuspend", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65311 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        boolean Z$1;
        boolean Z$2;
        boolean Z$3;
        boolean Z$4;
        int label;
        /* synthetic */ Object result;

        public C65311(InterfaceC30057d<? super C65311> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NewWhoopLoginInterceptor.this.interceptSuspend(null, null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.remote.NewWhoopLoginInterceptor$onSuccess$1 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.remote.NewWhoopLoginInterceptor", m100430f = "NewWhoopLoginInterceptor.kt", m100431l = {63, 64}, m100432m = "onSuccess", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65321 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C65321(InterfaceC30057d<? super C65321> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NewWhoopLoginInterceptor.this.onSuccess(null, null, this);
        }
    }

    public NewWhoopLoginInterceptor(InterfaceC31766c crashReporter, C27847j pendingUserSessionRepository, AbstractC21909c configurationRepository, FeatureFlagRepository featureFlagRepository, C37223g entitlementsRepository, AppConfigurationRepository appConfigurationRepository, C39352a authManager, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(pendingUserSessionRepository, "pendingUserSessionRepository");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        AbstractC22676k.m65750j(featureFlagRepository, "featureFlagRepository");
        AbstractC22676k.m65750j(entitlementsRepository, "entitlementsRepository");
        AbstractC22676k.m65750j(appConfigurationRepository, "appConfigurationRepository");
        AbstractC22676k.m65750j(authManager, "authManager");
        AbstractC22676k.m65750j(logger, "logger");
        this.crashReporter = crashReporter;
        this.pendingUserSessionRepository = pendingUserSessionRepository;
        this.configurationRepository = configurationRepository;
        this.featureFlagRepository = featureFlagRepository;
        this.entitlementsRepository = entitlementsRepository;
        this.appConfigurationRepository = appConfigurationRepository;
        this.authManager = authManager;
        this.logger = logger;
    }

    private final Void onFailure(InterfaceC27837a0 userSessionManager, Exception exception, int id4) throws Exception {
        this.logger.mo85222m(AbstractC2875y.m8296i(id4, "User ", " signed in, but failed to get all required info"), new AbstractC30556a.a[0]);
        this.crashReporter.mo98631p(exception);
        userSessionManager.mo83918h();
        this.pendingUserSessionRepository.m83955d();
        throw exception;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object onSuccess(Session session, C27853p c27853p, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C65321 c65321;
        Session session2;
        C27853p c27853p2;
        if (interfaceC30057d instanceof C65321) {
            c65321 = (C65321) interfaceC30057d;
            int i13 = c65321.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c65321.label = i13 - Integer.MIN_VALUE;
            } else {
                c65321 = new C65321(interfaceC30057d);
            }
        } else {
            c65321 = new C65321(interfaceC30057d);
        }
        Object obj = c65321.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c65321.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C39352a c39352a = this.authManager;
            AuthMaterial authMaterial = session.getAuthToken().toAuthMaterial();
            c65321.L$0 = session;
            c65321.L$1 = c27853p;
            c65321.label = 1;
            if (c39352a.m125480c(authMaterial, c65321) != enumC31071a) {
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            c27853p = (C27853p) c65321.L$1;
            session = (Session) c65321.L$0;
            AbstractC34132o.m107864I(obj);
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c27853p2 = (C27853p) c65321.L$1;
            session2 = (Session) c65321.L$0;
            AbstractC34132o.m107864I(obj);
        }
        c27853p2.m84000b(session2);
        this.crashReporter.mo98625d(String.valueOf(session2.getUser().getId()));
        this.pendingUserSessionRepository.m83955d();
        this.logger.mo85216g(AbstractC2875y.m8295h(session2.getUser().getId(), "Successfully fetched all required info for signing in user "), new AbstractC30556a.a[0]);
        return C23454a0.f92919a;
        C39352a c39352a2 = this.authManager;
        User user = session.getUser();
        c65321.L$0 = session;
        c65321.L$1 = c27853p;
        c65321.label = 2;
        if (c39352a2.m125482e(user, c65321) != enumC31071a) {
            C27853p c27853p3 = c27853p;
            session2 = session;
            c27853p2 = c27853p3;
            c27853p2.m84000b(session2);
            this.crashReporter.mo98625d(String.valueOf(session2.getUser().getId()));
            this.pendingUserSessionRepository.m83955d();
            this.logger.mo85216g(AbstractC2875y.m8295h(session2.getUser().getId(), "Successfully fetched all required info for signing in user "), new AbstractC30556a.a[0]);
            return C23454a0.f92919a;
        }
        return enumC31071a;
    }

    private final void setPendingUserSessionCredentials(Session session) {
        int id4 = session.getUser().getId();
        String accessToken = session.getAuthToken().getAccessToken();
        this.pendingUserSessionRepository.m83958g(id4);
        this.pendingUserSessionRepository.m83956e(accessToken);
        this.pendingUserSessionRepository.m83957f(session.getAuthToken().toAuthMaterial());
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:37:0x010a  */
    /* JADX WARN: Code duplicated, block: B:40:0x011a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0132  */
    /* JADX WARN: Code duplicated, block: B:47:0x0143 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:57:0x016c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0173  */
    /* JADX WARN: Code duplicated, block: B:61:0x017a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0181  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0160, code lost:
    
        if (onSuccess(r11, r10, r2) == r3) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object interceptSuspend(com.whoop.domain.model.Session r18, od1.C27853p r19, od1.InterfaceC27837a0 r20, boolean r21, q83.InterfaceC30057d<? super l83.C23454a0> r22) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.remote.NewWhoopLoginInterceptor.interceptSuspend(com.whoop.domain.model.Session, od1.p, od1.a0, boolean, q83.d):java.lang.Object");
    }

    public /* synthetic */ NewWhoopLoginInterceptor(InterfaceC31766c interfaceC31766c, C27847j c27847j, AbstractC21909c abstractC21909c, FeatureFlagRepository featureFlagRepository, C37223g c37223g, AppConfigurationRepository appConfigurationRepository, C39352a c39352a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC31766c, c27847j, abstractC21909c, featureFlagRepository, c37223g, appConfigurationRepository, c39352a, (i13 & 128) != 0 ? InterfaceC34116n.INSTANCE.m107848a("NewWhoopLoginInterceptor") : interfaceC34116n);
    }
}
