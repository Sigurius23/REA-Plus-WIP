package o52;

import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1640x1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.remote.domain.dto.CycleMetadataResponseDto;
import com.whoop.data.remote.domain.dto.OptimalStrainMapping;
import com.whoop.data.remote.domain.dto.StrainDataDto;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.IncreaseAlertnessId;
import com.whoop.data.repositories.IncreaseRelaxationId;
import com.whoop.data.repositories.StartActivityRepository;
import com.whoop.domain.model.StrainRecoveryMapping;
import com.whoop.domain.model.User;
import com.whoop.entitlements.Entitlement;
import com.whoop.service.network.model.Sport;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import hj0.AbstractC17356o;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.List;
import js0.AbstractC21909c;
import js0.C21908b;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import od1.C27840c;
import or2.C28180m;
import or2.C28199s0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p92.C29021j;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import we1.InterfaceC37217a;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;
import z92.InterfaceC40205a;

/* JADX INFO: renamed from: o52.s0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u0014¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u0014¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0018¢\u0006\u0004\b+\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00108\u001a\u00020!8\u0016X\u0096D¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020:098\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006@"}, m65681d2 = {"Lo52/s0;", "Lhj0/o;", "Lcom/whoop/data/repositories/StartActivityRepository;", "startActivityRepository", "Ljs0/c;", "configRepo", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lz92/a;", "userInfoAccessor", "Lwe1/a;", "entitlementChecker", "Lod1/c;", "currentCycleInteractor", "Lbc3/c0;", "coroutineScope", "<init>", "(Lcom/whoop/data/repositories/StartActivityRepository;Ljs0/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Lz92/a;Lwe1/a;Lod1/c;Lbc3/c0;)V", "Lp92/j;", "strainRecoveryMapper", "", "hasRecovery", "Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;", "cycleMetadata", "Ll83/a0;", "A", "(Lp92/j;Ljava/lang/Boolean;Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;)V", "E", "()V", "Lcom/whoop/service/network/model/Sport;", "sport", "F", "(Lcom/whoop/service/network/model/Sport;)Z", "", "B", "(Lcom/whoop/service/network/model/Sport;)Ljava/lang/String;", "enabledTrackRoute", "H", "(Z)V", "D", "()Z", "G", "(Lq83/d;)Ljava/lang/Object;", "init", "Lcom/whoop/data/repositories/StartActivityRepository;", "Ljs0/c;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Lz92/a;", "I", "Lwe1/a;", "J", "Lod1/c;", "K", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "logTag", "Landroidx/lifecycle/p0;", "Lo52/t0;", "L", "Landroidx/lifecycle/p0;", "C", "()Landroidx/lifecycle/p0;", "startActivityViewModelEvent", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27578s0 extends AbstractC17356o {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final StartActivityRepository startActivityRepository;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final AbstractC21909c configRepo;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC40205a userInfoAccessor;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC37217a entitlementChecker;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final C27840c currentCycleInteractor;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final AbstractC1615p0 startActivityViewModelEvent;

    /* JADX INFO: renamed from: o52.s0$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.realtime.presentation.StartActivityViewModel$init$1", m100430f = "StartActivityViewModel.kt", m100431l = {76}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f111030w;

        /* JADX INFO: renamed from: o52.s0$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42112a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C27578s0 f111032w;

            public C42112a(C27578s0 c27578s0) {
                this.f111032w = c27578s0;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(CycleMetadataResponseDto cycleMetadataResponseDto, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (cycleMetadataResponseDto != null) {
                    C27578s0 c27578s0 = this.f111032w;
                    boolean z4 = cycleMetadataResponseDto.getCycleMetadata().getSleep() != null;
                    StrainDataDto strain = cycleMetadataResponseDto.getCycleMetadata().getStrain();
                    List<OptimalStrainMapping> optimalStrainMapping = strain != null ? strain.getOptimalStrainMapping() : null;
                    List<OptimalStrainMapping> list = optimalStrainMapping;
                    if (list == null || list.isEmpty()) {
                        c27578s0.m83272E();
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (OptimalStrainMapping optimalStrainMapping2 : optimalStrainMapping) {
                            Integer recovery = optimalStrainMapping2.getRecovery();
                            Double lowerOptimalStrain = optimalStrainMapping2.getLowerOptimalStrain();
                            Double optimalStrain = optimalStrainMapping2.getOptimalStrain();
                            Double upperOptimalStrain = optimalStrainMapping2.getUpperOptimalStrain();
                            StrainRecoveryMapping strainRecoveryMapping = (recovery == null || lowerOptimalStrain == null || optimalStrain == null || upperOptimalStrain == null) ? null : new StrainRecoveryMapping(recovery.intValue(), lowerOptimalStrain.doubleValue(), optimalStrain.doubleValue(), upperOptimalStrain.doubleValue());
                            if (strainRecoveryMapping != null) {
                                arrayList.add(strainRecoveryMapping);
                            }
                        }
                        C29021j c29021j = new C29021j(arrayList);
                        if (!c29021j.m88258d()) {
                            c27578s0.m83271A(c29021j, Boolean.valueOf(z4), cycleMetadataResponseDto);
                        }
                    }
                } else {
                    this.f111032w.m83272E();
                }
                return C23454a0.f92919a;
            }
        }

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C27578s0.this.new a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f111030w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM83933d = C27578s0.this.currentCycleInteractor.getCycleDataFlow();
                C42112a c42112a = new C42112a(C27578s0.this);
                this.f111030w = 1;
                if (interfaceC13058lM83933d.collect(c42112a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: o52.s0$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.realtime.presentation.StartActivityViewModel", m100430f = "StartActivityViewModel.kt", m100431l = {69}, m100432m = "regionAllowsGpsFeature", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f111033w;

        /* JADX INFO: renamed from: y */
        int f111035y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f111033w = obj;
            this.f111035y |= Integer.MIN_VALUE;
            return C27578s0.this.m83280G(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27578s0(StartActivityRepository startActivityRepository, AbstractC21909c configRepo, FeatureFlagChecker featureFlagChecker, InterfaceC40205a userInfoAccessor, InterfaceC37217a entitlementChecker, C27840c currentCycleInteractor, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(startActivityRepository, "startActivityRepository");
        AbstractC22676k.m65750j(configRepo, "configRepo");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(userInfoAccessor, "userInfoAccessor");
        AbstractC22676k.m65750j(entitlementChecker, "entitlementChecker");
        AbstractC22676k.m65750j(currentCycleInteractor, "currentCycleInteractor");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.startActivityRepository = startActivityRepository;
        this.configRepo = configRepo;
        this.featureFlagChecker = featureFlagChecker;
        this.userInfoAccessor = userInfoAccessor;
        this.entitlementChecker = entitlementChecker;
        this.currentCycleInteractor = currentCycleInteractor;
        this.logTag = "StartActivityViewModel";
        this.startActivityViewModelEvent = new C28199s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public final void m83271A(C29021j strainRecoveryMapper, Boolean hasRecovery, CycleMetadataResponseDto cycleMetadata) {
        if (AbstractC22676k.m65745e(hasRecovery, Boolean.FALSE)) {
            if (strainRecoveryMapper.m88258d()) {
                m49138t(this.startActivityViewModelEvent, new C27580t0(null, EnumC27584v0.NO_RECOVERY_AND_STRAIN_PENDING, cycleMetadata));
                return;
            } else {
                m49138t(this.startActivityViewModelEvent, new C27580t0(strainRecoveryMapper, EnumC27584v0.NO_RECOVERY_AND_STRAIN_NOT_PENDING, cycleMetadata));
                return;
            }
        }
        if (strainRecoveryMapper.m88258d()) {
            m49138t(this.startActivityViewModelEvent, new C27580t0(null, EnumC27584v0.RECOVERY_AND_STRAIN_PENDING, cycleMetadata));
        } else {
            m49138t(this.startActivityViewModelEvent, new C27580t0(strainRecoveryMapper, EnumC27584v0.RECOVERY_AND_NO_STRAIN_PENDING, cycleMetadata));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public final void m83272E() {
        m49138t(this.startActivityViewModelEvent, new C27580t0(null, EnumC27584v0.STRAIN_COACH_STATUS_ERROR, null, 4, null));
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:7:0x003d  */
    /* JADX INFO: renamed from: B */
    public final String m83276B(Sport sport) {
        Object objM125868N0;
        Object objM125868N1;
        AbstractC21909c abstractC21909c = this.configRepo;
        IncreaseRelaxationId increaseRelaxationId = IncreaseRelaxationId.INSTANCE;
        C21908b configurations = abstractC21909c.getConfigurations();
        String name = increaseRelaxationId.getName();
        Object defaultValue = increaseRelaxationId.getDefaultValue();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Integer.class);
        Class cls = Integer.TYPE;
        boolean zM65745e = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls));
        Class cls2 = Boolean.TYPE;
        Class cls3 = Double.TYPE;
        Class cls4 = Float.TYPE;
        Class cls5 = Long.TYPE;
        if (zM65745e) {
            String str = (String) configurations.get(name);
            if (str != null) {
                objM125868N0 = AbstractC39421y.m125932Q(str);
            } else {
                objM125868N0 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
            String str2 = (String) configurations.get(name);
            if (str2 != null) {
                objM125868N0 = AbstractC39421y.m125933R(str2);
            } else {
                objM125868N0 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
            String str3 = (String) configurations.get(name);
            if (str3 != null) {
                objM125868N0 = AbstractC39420x.m125915y(str3);
            } else {
                objM125868N0 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls3))) {
            String str4 = (String) configurations.get(name);
            if (str4 != null) {
                objM125868N0 = AbstractC39420x.m125914x(str4);
            } else {
                objM125868N0 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
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
        C23465k c23465k = new C23465k((Integer) defaultValue, "increase_relaxation");
        AbstractC21909c abstractC21909c2 = this.configRepo;
        IncreaseAlertnessId increaseAlertnessId = IncreaseAlertnessId.INSTANCE;
        C21908b configurations2 = abstractC21909c2.getConfigurations();
        String name2 = increaseAlertnessId.getName();
        Object defaultValue2 = increaseAlertnessId.getDefaultValue();
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(Integer.class);
        if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i0.getOrCreateKotlinClass(cls))) {
            String str6 = (String) configurations2.get(name2);
            if (str6 != null) {
                objM125868N1 = AbstractC39421y.m125932Q(str6);
            } else {
                objM125868N1 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i0.getOrCreateKotlinClass(cls5))) {
            String str7 = (String) configurations2.get(name2);
            if (str7 != null) {
                objM125868N1 = AbstractC39421y.m125933R(str7);
            } else {
                objM125868N1 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i0.getOrCreateKotlinClass(cls4))) {
            String str8 = (String) configurations2.get(name2);
            if (str8 != null) {
                objM125868N1 = AbstractC39420x.m125915y(str8);
            } else {
                objM125868N1 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i0.getOrCreateKotlinClass(cls3))) {
            String str9 = (String) configurations2.get(name2);
            if (str9 != null) {
                objM125868N1 = AbstractC39420x.m125914x(str9);
            } else {
                objM125868N1 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i0.getOrCreateKotlinClass(cls2))) {
            String str10 = (String) configurations2.get(name2);
            if (str10 != null) {
                objM125868N1 = AbstractC39414r.m125868N0(str10);
            } else {
                objM125868N1 = null;
            }
        } else {
            objM125868N1 = AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations2.get(name2) : defaultValue2;
        }
        if (objM125868N1 != null) {
            defaultValue2 = objM125868N1;
        }
        if (defaultValue2 != null) {
            return (String) AbstractC25247g0.m73990Y(c23465k, new C23465k((Integer) defaultValue2, "increase_alertness")).get(sport != null ? Integer.valueOf(sport.getId()) : null);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final AbstractC1615p0 getStartActivityViewModelEvent() {
        return this.startActivityViewModelEvent;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m83278D() {
        return this.startActivityRepository.getTrackRoute();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:9:0x0047  */
    /* JADX INFO: renamed from: F */
    public final boolean m83279F(Sport sport) {
        Object objM125868N0;
        Object objM125868N1;
        if (!this.entitlementChecker.mo119272b(Entitlement.STRESS_MONITOR)) {
            return false;
        }
        AbstractC21909c abstractC21909c = this.configRepo;
        IncreaseRelaxationId increaseRelaxationId = IncreaseRelaxationId.INSTANCE;
        C21908b configurations = abstractC21909c.getConfigurations();
        String name = increaseRelaxationId.getName();
        Object defaultValue = increaseRelaxationId.getDefaultValue();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Integer.class);
        Class cls = Integer.TYPE;
        boolean zM65745e = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls));
        Class cls2 = Boolean.TYPE;
        Class cls3 = Double.TYPE;
        Class cls4 = Float.TYPE;
        Class cls5 = Long.TYPE;
        if (zM65745e) {
            String str = (String) configurations.get(name);
            if (str != null) {
                objM125868N0 = AbstractC39421y.m125932Q(str);
            } else {
                objM125868N0 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
            String str2 = (String) configurations.get(name);
            if (str2 != null) {
                objM125868N0 = AbstractC39421y.m125933R(str2);
            } else {
                objM125868N0 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
            String str3 = (String) configurations.get(name);
            if (str3 != null) {
                objM125868N0 = AbstractC39420x.m125915y(str3);
            } else {
                objM125868N0 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls3))) {
            String str4 = (String) configurations.get(name);
            if (str4 != null) {
                objM125868N0 = AbstractC39420x.m125914x(str4);
            } else {
                objM125868N0 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
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
        Integer num = (Integer) defaultValue;
        AbstractC21909c abstractC21909c2 = this.configRepo;
        IncreaseAlertnessId increaseAlertnessId = IncreaseAlertnessId.INSTANCE;
        C21908b configurations2 = abstractC21909c2.getConfigurations();
        String name2 = increaseAlertnessId.getName();
        Object defaultValue2 = increaseAlertnessId.getDefaultValue();
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(Integer.class);
        if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i0.getOrCreateKotlinClass(cls))) {
            String str6 = (String) configurations2.get(name2);
            if (str6 != null) {
                objM125868N1 = AbstractC39421y.m125932Q(str6);
            } else {
                objM125868N1 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i0.getOrCreateKotlinClass(cls5))) {
            String str7 = (String) configurations2.get(name2);
            if (str7 != null) {
                objM125868N1 = AbstractC39421y.m125933R(str7);
            } else {
                objM125868N1 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i0.getOrCreateKotlinClass(cls4))) {
            String str8 = (String) configurations2.get(name2);
            if (str8 != null) {
                objM125868N1 = AbstractC39420x.m125915y(str8);
            } else {
                objM125868N1 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i0.getOrCreateKotlinClass(cls3))) {
            String str9 = (String) configurations2.get(name2);
            if (str9 != null) {
                objM125868N1 = AbstractC39420x.m125914x(str9);
            } else {
                objM125868N1 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i0.getOrCreateKotlinClass(cls2))) {
            String str10 = (String) configurations2.get(name2);
            if (str10 != null) {
                objM125868N1 = AbstractC39414r.m125868N0(str10);
            } else {
                objM125868N1 = null;
            }
        } else {
            objM125868N1 = AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations2.get(name2) : defaultValue2;
        }
        if (objM125868N1 != null) {
            defaultValue2 = objM125868N1;
        }
        if (defaultValue2 != null) {
            return AbstractC25265s.m74155w0(AbstractC37056f.m118959K(num, (Integer) defaultValue2), sport != null ? Integer.valueOf(sport.getId()) : null);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: G */
    public final Object m83280G(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f111035y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f111035y = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objMo129089c = bVar.f111033w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f111035y;
        boolean z4 = true;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo129089c);
            InterfaceC40205a interfaceC40205a = this.userInfoAccessor;
            bVar.f111035y = 1;
            objMo129089c = interfaceC40205a.mo129089c(bVar);
            if (objMo129089c == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo129089c);
        }
        User user = (User) objMo129089c;
        String country = user != null ? user.getCountry() : null;
        if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.DISABLE_GPS_SOUTH_KOREA)) {
            for (String str : AbstractC27582u0.f111043a) {
                if (AbstractC39421y.m125921F(str, country, true)) {
                    z4 = false;
                    break;
                }
            }
        }
        return Boolean.valueOf(z4);
    }

    /* JADX INFO: renamed from: H */
    public final void m83281H(boolean enabledTrackRoute) {
        this.startActivityRepository.setTrackRoute(enabledTrackRoute);
    }

    public final void init() {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new a(null), 3);
    }

    @Override // hj0.AbstractC17356o
    /* JADX INFO: renamed from: o, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }

    public /* synthetic */ C27578s0(StartActivityRepository startActivityRepository, AbstractC21909c abstractC21909c, FeatureFlagChecker featureFlagChecker, InterfaceC40205a interfaceC40205a, InterfaceC37217a interfaceC37217a, C27840c c27840c, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(startActivityRepository, abstractC21909c, featureFlagChecker, interfaceC40205a, interfaceC37217a, c27840c, (i13 & 64) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
