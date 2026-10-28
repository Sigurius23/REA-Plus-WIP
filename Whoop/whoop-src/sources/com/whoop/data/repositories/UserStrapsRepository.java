package com.whoop.data.repositories;

import a11.C0129g;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.local.prefs.PreferenceHelper;
import com.whoop.data.local.prefs.SharedPreferenceConstants;
import com.whoop.data.onboarding.C6529c;
import com.whoop.data.remote.RemoteDataSource;
import com.whoop.data.remote.domain.dto.growth.UserStrapsDto;
import com.whoop.data.remote.domain.response.growth.StrapGeneration;
import com.whoop.data.remote.domain.response.growth.StrapGenerationStatus;
import com.whoop.data.remote.domain.response.growth.UserStraps;
import com.whoop.data.remote.domain.response.growth.UserStrapsKt;
import com.whoop.domain.model.WhoopStrapInfo;
import com.whoop.service.network.MembershipV2Api;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13075p1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import l83.C23470p;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import od1.C27858u;
import p007a6.C0438l0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import td1.EnumC33707e;
import td1.InterfaceC33704b;
import tr2.InterfaceC34116n;
import w02.AbstractC36685b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u001d\u0010\u0018J\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00122\b\b\u0002\u0010\"\u001a\u00020\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010*R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001d\u00104\u001a\b\u0012\u0004\u0012\u000200038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001a\u0010;\u001a\u00020\u00168FX\u0087\u0004¢\u0006\f\u0012\u0004\b:\u0010\u0014\u001a\u0004\b8\u00109R\u0016\u0010?\u001a\u0004\u0018\u00010<8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0011\u0010A\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b@\u00109¨\u0006C²\u0006\f\u0010B\u001a\u00020\u00168\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/data/repositories/UserStrapsRepository;", "", "Lod1/u;", "userContext", "Ltd1/b;", "whoopStrap", "Lcom/whoop/data/remote/RemoteDataSource;", "remoteDataSource", "Lcom/whoop/service/network/MembershipV2Api;", "membershipV2Api", "Lbc3/c0;", "coroutineScope", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "preferenceHelper", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "featureFlagRepository", "<init>", "(Lod1/u;Ltd1/b;Lcom/whoop/data/remote/RemoteDataSource;Lcom/whoop/service/network/MembershipV2Api;Lbc3/c0;Lcom/whoop/data/local/prefs/PreferenceHelper;Lcom/whoop/data/repositories/FeatureFlagRepository;)V", "Ll83/a0;", "retrieveCachedStrapGenerationStatus", "()V", "observeUserAndStrapUpdates", "", "recordUserStrap", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/domain/model/WhoopStrapInfo;", "strapInfo", "shouldRecordStrap", "(Lcom/whoop/domain/model/WhoopStrapInfo;)Z", "fetchUserStraps", "Lcom/whoop/data/remote/domain/response/growth/UserStraps;", "userStraps", "updateStrapGenerationStatus", "(Lcom/whoop/data/remote/domain/response/growth/UserStraps;)V", "mustFetch", "updateUserStrapsData", "(Z)V", "Lod1/u;", "Ltd1/b;", "Lcom/whoop/data/remote/RemoteDataSource;", "Lcom/whoop/service/network/MembershipV2Api;", "Lbc3/c0;", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "Ltr2/n;", "logger", "Ltr2/n;", "Lec3/p1;", "Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;", "_strapGenerationStatus", "Lec3/p1;", "Lec3/f2;", "strapGenerationStatus", "Lec3/f2;", "getStrapGenerationStatus", "()Lec3/f2;", "getUsingHarvard", "()Z", "getUsingHarvard$annotations", "usingHarvard", "", "getLastRecordedStrapSerial", "()Ljava/lang/String;", "lastRecordedStrapSerial", "getUsingCopley", "usingCopley", "previouslyUsedOlderGen", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class UserStrapsRepository {
    private final InterfaceC13075p1 _strapGenerationStatus;
    private final InterfaceC2994c0 coroutineScope;
    private final FeatureFlagRepository featureFlagRepository;
    private final InterfaceC34116n logger;
    private final MembershipV2Api membershipV2Api;
    private final PreferenceHelper preferenceHelper;
    private final RemoteDataSource remoteDataSource;
    private final InterfaceC13037f2 strapGenerationStatus;
    private final C27858u userContext;
    private final InterfaceC33704b whoopStrap;

    /* JADX INFO: renamed from: com.whoop.data.repositories.UserStrapsRepository$fetchUserStraps$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.UserStrapsRepository", m100430f = "UserStrapsRepository.kt", m100431l = {150}, m100432m = "fetchUserStraps", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C66511 extends AbstractC32269c {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C66511(InterfaceC30057d<? super C66511> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserStrapsRepository.this.fetchUserStraps(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.UserStrapsRepository$recordUserStrap$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.UserStrapsRepository", m100430f = "UserStrapsRepository.kt", m100431l = {134, 136}, m100432m = "recordUserStrap", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C66521 extends AbstractC32269c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C66521(InterfaceC30057d<? super C66521> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserStrapsRepository.this.recordUserStrap(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.UserStrapsRepository$updateUserStrapsData$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.UserStrapsRepository$updateUserStrapsData$1", m100430f = "UserStrapsRepository.kt", m100431l = {116, 120}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C66531 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ boolean $mustFetch;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C66531(boolean z4, InterfaceC30057d<? super C66531> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$mustFetch = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return UserStrapsRepository.this.new C66531(this.$mustFetch, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C66531) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
        
            if (r1.fetchUserStraps(r5) == r0) goto L19;
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
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r6)
                goto L59
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L2a
            L1c:
                p505ts.AbstractC34132o.m107864I(r6)
                com.whoop.data.repositories.UserStrapsRepository r6 = com.whoop.data.repositories.UserStrapsRepository.this
                r5.label = r3
                java.lang.Object r6 = com.whoop.data.repositories.UserStrapsRepository.access$recordUserStrap(r6, r5)
                if (r6 != r0) goto L2a
                goto L58
            L2a:
                com.whoop.data.repositories.UserStrapsRepository r1 = com.whoop.data.repositories.UserStrapsRepository.this
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r3 = r6.booleanValue()
                tr2.n r1 = com.whoop.data.repositories.UserStrapsRepository.access$getLogger$p(r1)
                java.lang.String r4 = "Strap saved in Strap History Table - "
                java.lang.String r3 = p000.AbstractC11266d.m30462p(r4, r3)
                r4 = 0
                qr2.a$a[] r4 = new qr2.AbstractC30556a.a[r4]
                r1.mo85219j(r3, r4)
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L4c
                boolean r1 = r5.$mustFetch
                if (r1 == 0) goto L59
            L4c:
                com.whoop.data.repositories.UserStrapsRepository r1 = com.whoop.data.repositories.UserStrapsRepository.this
                r5.Z$0 = r6
                r5.label = r2
                java.lang.Object r6 = com.whoop.data.repositories.UserStrapsRepository.access$fetchUserStraps(r1, r5)
                if (r6 != r0) goto L59
            L58:
                return r0
            L59:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.repositories.UserStrapsRepository.C66531.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public UserStrapsRepository(C27858u userContext, InterfaceC33704b whoopStrap, RemoteDataSource remoteDataSource, MembershipV2Api membershipV2Api, InterfaceC2994c0 coroutineScope, PreferenceHelper preferenceHelper, FeatureFlagRepository featureFlagRepository) {
        AbstractC22676k.m65750j(userContext, "userContext");
        AbstractC22676k.m65750j(whoopStrap, "whoopStrap");
        AbstractC22676k.m65750j(remoteDataSource, "remoteDataSource");
        AbstractC22676k.m65750j(membershipV2Api, "membershipV2Api");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(preferenceHelper, "preferenceHelper");
        AbstractC22676k.m65750j(featureFlagRepository, "featureFlagRepository");
        this.userContext = userContext;
        this.whoopStrap = whoopStrap;
        this.remoteDataSource = remoteDataSource;
        this.membershipV2Api = membershipV2Api;
        this.coroutineScope = coroutineScope;
        this.preferenceHelper = preferenceHelper;
        this.featureFlagRepository = featureFlagRepository;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("UserStrapsRepository");
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(StrapGenerationStatus.COPLEY_NO_HARVARD);
        this._strapGenerationStatus = c13045h2M36593c;
        this.strapGenerationStatus = AbstractC13091v.m36598h(c13045h2M36593c);
        retrieveCachedStrapGenerationStatus();
        observeUserAndStrapUpdates();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object fetchUserStraps(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C66511 c66511;
        Object objM107888l;
        if (interfaceC30057d instanceof C66511) {
            c66511 = (C66511) interfaceC30057d;
            int i13 = c66511.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c66511.label = i13 - Integer.MIN_VALUE;
            } else {
                c66511 = new C66511(interfaceC30057d);
            }
        } else {
            c66511 = new C66511(interfaceC30057d);
        }
        Object objFetchUserStraps = c66511.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c66511.label;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objFetchUserStraps);
                MembershipV2Api membershipV2Api = this.membershipV2Api;
                c66511.L$0 = null;
                c66511.I$0 = 0;
                c66511.label = 1;
                objFetchUserStraps = membershipV2Api.fetchUserStraps(c66511);
                if (objFetchUserStraps == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objFetchUserStraps);
            }
            objM107888l = UserStrapsKt.toDomainModel((UserStrapsDto) objFetchUserStraps);
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        if (!(objM107888l instanceof C23467m)) {
            updateStrapGenerationStatus((UserStraps) objM107888l);
        }
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            AbstractC36685b.m117760b(thM68037a, "Error fetching user straps", this.logger, null, 8, null);
        }
        return C23454a0.f92919a;
    }

    private final String getLastRecordedStrapSerial() {
        return this.preferenceHelper.getNullableStringFromMainPrefs(SharedPreferenceConstants.KEY_LAST_RECORDED_STRAP_SERIAL);
    }

    @InterfaceC23457c
    public static /* synthetic */ void getUsingHarvard$annotations() {
    }

    private final void observeUserAndStrapUpdates() {
        final int i13 = 0;
        this.userContext.m84059j().m122678n(new C6656c(new C0129g(29), 1)).m122661K(new C6529c(new Function1(this) { // from class: com.whoop.data.repositories.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ UserStrapsRepository f25450x;

            {
                this.f25450x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        return UserStrapsRepository.observeUserAndStrapUpdates$lambda$2(this.f25450x, (C27858u.a) obj);
                    default:
                        return UserStrapsRepository.observeUserAndStrapUpdates$lambda$6(this.f25450x, (EnumC33707e) obj);
                }
            }
        }, 8));
        final int i14 = 1;
        this.whoopStrap.mo106496i().m122678n(new C6656c(new C6659f(0), 2)).m122661K(new C6529c(new Function1(this) { // from class: com.whoop.data.repositories.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ UserStrapsRepository f25450x;

            {
                this.f25450x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        return UserStrapsRepository.observeUserAndStrapUpdates$lambda$2(this.f25450x, (C27858u.a) obj);
                    default:
                        return UserStrapsRepository.observeUserAndStrapUpdates$lambda$6(this.f25450x, (EnumC33707e) obj);
                }
            }
        }, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean observeUserAndStrapUpdates$lambda$0(C27858u.a aVar) {
        return Boolean.valueOf(aVar.m84069d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean observeUserAndStrapUpdates$lambda$1(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 observeUserAndStrapUpdates$lambda$2(UserStrapsRepository userStrapsRepository, C27858u.a aVar) {
        updateUserStrapsData$default(userStrapsRepository, false, 1, null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean observeUserAndStrapUpdates$lambda$4(EnumC33707e enumC33707e) {
        return Boolean.valueOf(enumC33707e.isReady());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean observeUserAndStrapUpdates$lambda$5(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 observeUserAndStrapUpdates$lambda$6(UserStrapsRepository userStrapsRepository, EnumC33707e enumC33707e) {
        userStrapsRepository.updateUserStrapsData(false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a4, code lost:
    
        if (r13 == r0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object recordUserStrap(q83.InterfaceC30057d<? super java.lang.Boolean> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.whoop.data.repositories.UserStrapsRepository.C66521
            if (r0 == 0) goto L14
            r0 = r13
            com.whoop.data.repositories.UserStrapsRepository$recordUserStrap$1 r0 = (com.whoop.data.repositories.UserStrapsRepository.C66521) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.whoop.data.repositories.UserStrapsRepository$recordUserStrap$1 r0 = new com.whoop.data.repositories.UserStrapsRepository$recordUserStrap$1
            r0.<init>(r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.result
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.label
            r9 = 2
            r2 = 1
            r10 = 0
            if (r1 == 0) goto L4c
            if (r1 == r2) goto L3e
            if (r1 != r9) goto L36
            java.lang.Object r0 = r6.L$1
            com.whoop.data.remote.domain.request.RecordUserStrapRequestBody r0 = (com.whoop.data.remote.domain.request.RecordUserStrapRequestBody) r0
            java.lang.Object r0 = r6.L$0
            com.whoop.domain.model.WhoopStrapInfo r0 = (com.whoop.domain.model.WhoopStrapInfo) r0
            p505ts.AbstractC34132o.m107864I(r13)
            goto La7
        L36:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L3e:
            int r1 = r6.I$0
            java.lang.Object r2 = r6.L$1
            com.whoop.data.remote.domain.request.RecordUserStrapRequestBody r2 = (com.whoop.data.remote.domain.request.RecordUserStrapRequestBody) r2
            java.lang.Object r2 = r6.L$0
            com.whoop.domain.model.WhoopStrapInfo r2 = (com.whoop.domain.model.WhoopStrapInfo) r2
            p505ts.AbstractC34132o.m107864I(r13)
            goto L91
        L4c:
            p505ts.AbstractC34132o.m107864I(r13)
            td1.b r13 = r12.whoopStrap
            com.whoop.domain.model.WhoopStrapInfo r13 = r13.mo106493f()
            if (r13 == 0) goto Laa
            boolean r1 = r12.shouldRecordStrap(r13)
            if (r1 == 0) goto L5e
            goto L5f
        L5e:
            r13 = r10
        L5f:
            if (r13 == 0) goto Laa
            com.whoop.data.remote.domain.request.RecordUserStrapRequestBody r1 = new com.whoop.data.remote.domain.request.RecordUserStrapRequestBody
            java.lang.String r3 = r13.getSerialNumber()
            java.lang.String r4 = r13.getCpuId()
            r1.<init>(r3, r4)
            r3 = r1
            u02.a$a r1 = u02.InterfaceC34385a.INSTANCE
            r4 = r2
            tr2.n r2 = r12.logger
            com.whoop.data.repositories.UserStrapsRepository$recordUserStrap$response$2$1 r5 = new com.whoop.data.repositories.UserStrapsRepository$recordUserStrap$response$2$1
            r5.<init>(r12, r3, r10)
            r6.L$0 = r13
            r6.L$1 = r10
            r11 = 0
            r6.I$0 = r11
            r6.label = r4
            r3 = 0
            java.lang.String r4 = "Error recording user strap"
            r7 = 2
            r8 = 0
            java.lang.Object r1 = u02.InterfaceC34385a.Companion.m108729b(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r1 != r0) goto L8e
            goto La6
        L8e:
            r2 = r13
            r13 = r1
            r1 = r11
        L91:
            u02.a r13 = (u02.InterfaceC34385a) r13
            com.whoop.data.repositories.UserStrapsRepository$recordUserStrap$response$2$2 r3 = new com.whoop.data.repositories.UserStrapsRepository$recordUserStrap$response$2$2
            r3.<init>(r12, r2, r10)
            r6.L$0 = r10
            r6.L$1 = r10
            r6.I$0 = r1
            r6.label = r9
            java.lang.Object r13 = u02.AbstractC34386b.m108742g(r13, r3, r6)
            if (r13 != r0) goto La7
        La6:
            return r0
        La7:
            r10 = r13
            u02.a r10 = (u02.InterfaceC34385a) r10
        Laa:
            boolean r13 = r10 instanceof u02.InterfaceC34385a.c
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.repositories.UserStrapsRepository.recordUserStrap(q83.d):java.lang.Object");
    }

    private final void retrieveCachedStrapGenerationStatus() {
        StrapGenerationStatus strapGenerationStatus;
        String nullableStringFromMainPrefs = this.preferenceHelper.getNullableStringFromMainPrefs(SharedPreferenceConstants.KEY_STRAP_GENERATION_STATUS);
        StrapGenerationStatus[] strapGenerationStatusArrValues = StrapGenerationStatus.values();
        int length = strapGenerationStatusArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                strapGenerationStatus = null;
                break;
            }
            strapGenerationStatus = strapGenerationStatusArrValues[i13];
            if (AbstractC22676k.m65745e(strapGenerationStatus.getSerializedValue(), nullableStringFromMainPrefs)) {
                break;
            } else {
                i13++;
            }
        }
        if (strapGenerationStatus != null) {
            C13045h2 c13045h2 = (C13045h2) this._strapGenerationStatus;
            c13045h2.getClass();
            c13045h2.m36571k(null, strapGenerationStatus);
        }
    }

    private final boolean shouldRecordStrap(WhoopStrapInfo strapInfo) {
        return this.whoopStrap.mo106484A().isReady() && strapInfo.getIsSerialNumberValid() && !AbstractC22676k.m65745e(getLastRecordedStrapSerial(), strapInfo.getSerialNumber()) && !this.featureFlagRepository.isFeatureEnabled(OnboardingFeatureFlag.PAIRING_FIRST_MEMBERSHIP_ADJUSTMENT);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0062  */
    /* JADX WARN: Code duplicated, block: B:30:0x0067  */
    /* JADX WARN: Code duplicated, block: B:33:0x006c  */
    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    private final void updateStrapGenerationStatus(UserStraps userStraps) {
        StrapGenerationStatus strapGenerationStatus;
        UserStraps.Strap orderedStrap;
        StrapGeneration generation;
        UserStraps.Strap lastSeenStrap = userStraps.getLastSeenStrap();
        boolean z4 = (lastSeenStrap != null ? lastSeenStrap.getGeneration() : null) == StrapGeneration.HARVARD;
        C23470p c23470pM92088H = AbstractC30060g.m92088H(new C0438l0(userStraps, 5));
        if (z4) {
            strapGenerationStatus = updateStrapGenerationStatus$lambda$1(c23470pM92088H) ? StrapGenerationStatus.UPGRADED_HARVARD : StrapGenerationStatus.NEW_HARVARD;
        } else {
            List<UserStraps.Strap> previousStraps = userStraps.getPreviousStraps();
            if ((previousStraps instanceof Collection) && previousStraps.isEmpty()) {
                orderedStrap = userStraps.getOrderedStrap();
                if (orderedStrap != null) {
                    generation = orderedStrap.getGeneration();
                } else {
                    generation = null;
                }
                if (generation == StrapGeneration.HARVARD) {
                    strapGenerationStatus = StrapGenerationStatus.COPLEY_AWAITING_HARVARD;
                } else {
                    strapGenerationStatus = StrapGenerationStatus.COPLEY_NO_HARVARD;
                }
            } else {
                Iterator<T> it = previousStraps.iterator();
                while (it.hasNext()) {
                    if (((UserStraps.Strap) it.next()).getGeneration() == StrapGeneration.HARVARD) {
                        strapGenerationStatus = StrapGenerationStatus.DOWNGRADED_COPLEY;
                    }
                }
                orderedStrap = userStraps.getOrderedStrap();
                if (orderedStrap != null) {
                    generation = orderedStrap.getGeneration();
                } else {
                    generation = null;
                }
                if (generation == StrapGeneration.HARVARD) {
                    strapGenerationStatus = StrapGenerationStatus.COPLEY_AWAITING_HARVARD;
                } else {
                    strapGenerationStatus = StrapGenerationStatus.COPLEY_NO_HARVARD;
                }
            }
        }
        this.preferenceHelper.putStringValueIntoMainPrefs(SharedPreferenceConstants.KEY_STRAP_GENERATION_STATUS, strapGenerationStatus.getSerializedValue());
        C13045h2 c13045h2 = (C13045h2) this._strapGenerationStatus;
        c13045h2.getClass();
        c13045h2.m36571k(null, strapGenerationStatus);
        this.logger.mo85216g("Strap generation status set to: " + strapGenerationStatus, new AbstractC30556a.a[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean updateStrapGenerationStatus$lambda$0(UserStraps userStraps) {
        List<UserStraps.Strap> previousStraps = userStraps.getPreviousStraps();
        if ((previousStraps instanceof Collection) && previousStraps.isEmpty()) {
            return false;
        }
        Iterator<T> it = previousStraps.iterator();
        while (it.hasNext()) {
            if (((UserStraps.Strap) it.next()).getGeneration() == StrapGeneration.KENMORE) {
                return true;
            }
        }
        return false;
    }

    private static final boolean updateStrapGenerationStatus$lambda$1(InterfaceC23462h interfaceC23462h) {
        return ((Boolean) interfaceC23462h.getValue()).booleanValue();
    }

    public static /* synthetic */ void updateUserStrapsData$default(UserStrapsRepository userStrapsRepository, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = true;
        }
        userStrapsRepository.updateUserStrapsData(z4);
    }

    public final InterfaceC13037f2 getStrapGenerationStatus() {
        return this.strapGenerationStatus;
    }

    public final boolean getUsingCopley() {
        return ((StrapGenerationStatus) this.strapGenerationStatus.getValue()).getUsingCopley();
    }

    public final boolean getUsingHarvard() {
        return ((StrapGenerationStatus) this.strapGenerationStatus.getValue()).getUsingHarvard();
    }

    public final void updateUserStrapsData(boolean mustFetch) {
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new C66531(mustFetch, null), 3);
    }
}
