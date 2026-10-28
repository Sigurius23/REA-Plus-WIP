package ws2;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.weeklyplan.api.WeeklyPlanApi;
import com.whoop.weeklyplan.customizeplan.domain.api.ConfirmTarget;
import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import com.whoop.weeklyplan.customizeplan.domain.api.WeeklyPlanCustomizationResponse;
import com.whoop.weeklyplan.customizeplan.domain.api.WeeklyPlanCustomizationResponseKotlinx;
import com.whoop.weeklyplan.customizeplan.domain.api.WeeklyPlanCustomizationResponseMapper;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import java.util.List;
import l83.C23454a0;
import ls2.AbstractC24716a;
import ls2.C24717b;
import od1.InterfaceC27844g;
import or2.AbstractC28190p0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import wm0.C37378a;

/* JADX INFO: renamed from: ws2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ \u0010\u0011\u001a\u00020\u00032\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, m65681d2 = {"Lws2/b;", "Lod1/g;", "Lws2/a;", "Lws2/e;", "Lcom/whoop/weeklyplan/api/WeeklyPlanApi;", "api", "Ltr2/n;", "logger", "Lls2/b;", "analytics", "Lwm0/a;", "scopeCoordinator", "<init>", "(Lcom/whoop/weeklyplan/api/WeeklyPlanApi;Ltr2/n;Lls2/b;Lwm0/a;)V", "", "", "screens", "k", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "id", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;", "customizationMetric", "source", "l", "(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "goalType", "j", "(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/weeklyplan/api/WeeklyPlanApi;", "b", "Ltr2/n;", "c", "Lls2/b;", "d", "Lwm0/a;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37610b implements InterfaceC27844g<AbstractC37609a, AbstractC37613e> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final WeeklyPlanApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C24717b analytics;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C37378a scopeCoordinator;

    /* JADX INFO: renamed from: ws2.b$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.customizeplan.domain.CustomizePlanApiInteractor$deleteTargetMetric$2", m100430f = "CustomizePlanApiInteractor.kt", m100431l = {119}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lws2/e;", "<anonymous>", "(Lbc3/c0;)Lws2/e;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f160852E;

        /* JADX INFO: renamed from: w */
        int f160853w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ TargetGoalType f160855y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f160856z;

        /* JADX INFO: renamed from: ws2.b$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.customizeplan.domain.CustomizePlanApiInteractor$deleteTargetMetric$2$response$1", m100430f = "CustomizePlanApiInteractor.kt", m100431l = {131, 139, 146}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", ""}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42602a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ String f160857E;

            /* JADX INFO: renamed from: w */
            int f160858w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ TargetGoalType f160859x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C37610b f160860y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ String f160861z;

            /* JADX INFO: renamed from: ws2.b$a$a$a, reason: collision with other inner class name */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final /* synthetic */ class C42603a {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ int[] f160862a;

                static {
                    int[] iArr = new int[TargetGoalType.values().length];
                    try {
                        iArr[TargetGoalType.SLEEP_PERFORMANCE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[TargetGoalType.SLEEP_CONSISTENCY.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[TargetGoalType.SLEEP_HOURS.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[TargetGoalType.STRAIN.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[TargetGoalType.STEPS.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[TargetGoalType.WEIGHT.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[TargetGoalType.HR_ZONES_ONE_TO_THREE.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[TargetGoalType.HR_ZONES_FOUR_TO_FIVE.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[TargetGoalType.STRENGTH_TRAINING_TIME.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[TargetGoalType.ACTIVITIES.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[TargetGoalType.BEHAVIORS.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    f160862a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42602a(TargetGoalType targetGoalType, C37610b c37610b, String str, String str2, InterfaceC30057d<? super C42602a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f160859x = targetGoalType;
                this.f160860y = c37610b;
                this.f160861z = str;
                this.f160857E = str2;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new C42602a(this.f160859x, this.f160860y, this.f160861z, this.f160857E, interfaceC30057d);
            }

            /* JADX WARN: Code duplicated, block: B:29:0x00a8 A[RETURN] */
            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f160858w;
                if (i13 != 0) {
                    if (i13 == 1) {
                        AbstractC34132o.m107864I(obj);
                        return obj;
                    }
                    if (i13 == 2) {
                        AbstractC34132o.m107864I(obj);
                        return obj;
                    }
                    if (i13 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                switch (C42603a.f160862a[this.f160859x.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        this.f160860y.analytics.m72377q(new AbstractC24716a.c(this.f160859x, "Skip", this.f160861z));
                        WeeklyPlanApi weeklyPlanApi = this.f160860y.api;
                        String str = this.f160857E;
                        String screen = this.f160859x.getScreen();
                        this.f160858w = 1;
                        Object objDeleteStrainOrSleepGoalV2 = weeklyPlanApi.deleteStrainOrSleepGoalV2(str, screen, this);
                        if (objDeleteStrainOrSleepGoalV2 == enumC31071a) {
                            return enumC31071a;
                        }
                        return objDeleteStrainOrSleepGoalV2;
                    case 10:
                        this.f160860y.analytics.m72377q(new AbstractC24716a.c(TargetGoalType.ACTIVITIES, "Skip", this.f160861z));
                        WeeklyPlanApi weeklyPlanApi2 = this.f160860y.api;
                        String str2 = this.f160857E;
                        this.f160858w = 2;
                        Object objDeleteActivityGoalV2 = weeklyPlanApi2.deleteActivityGoalV2(str2, this);
                        if (objDeleteActivityGoalV2 == enumC31071a) {
                            return enumC31071a;
                        }
                        return objDeleteActivityGoalV2;
                    case 11:
                        this.f160860y.analytics.m72377q(new AbstractC24716a.c(TargetGoalType.BEHAVIORS, "Skip", this.f160861z));
                        WeeklyPlanApi weeklyPlanApi3 = this.f160860y.api;
                        String str3 = this.f160857E;
                        this.f160858w = 3;
                        Object objDeleteBehaviorGoalV2 = weeklyPlanApi3.deleteBehaviorGoalV2(str3, this);
                        if (objDeleteBehaviorGoalV2 == enumC31071a) {
                            return enumC31071a;
                        }
                        return objDeleteBehaviorGoalV2;
                    default:
                        return C23454a0.f92919a;
                }
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<Object> interfaceC30057d) {
                return ((C42602a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TargetGoalType targetGoalType, String str, String str2, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f160855y = targetGoalType;
            this.f160856z = str;
            this.f160852E = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C37610b.this.new a(this.f160855y, this.f160856z, this.f160852E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC37613e> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            a aVar;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f160853w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                InterfaceC34116n interfaceC34116n = C37610b.this.logger;
                C42602a c42602a = new C42602a(this.f160855y, C37610b.this, this.f160852E, this.f160856z, null);
                this.f160853w = 1;
                aVar = this;
                obj = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, c42602a, aVar, 6, null);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                aVar = this;
            }
            InterfaceC34385a interfaceC34385a = (InterfaceC34385a) obj;
            if (interfaceC34385a instanceof InterfaceC34385a.c) {
                return AbstractC37613e.g.f160913a;
            }
            if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            C37610b.this.analytics.m72377q(new AbstractC24716a.c(aVar.f160855y, "Fail to Save", null, 4, null));
            return new AbstractC37613e.c(aVar.f160856z, aVar.f160855y);
        }
    }

    /* JADX INFO: renamed from: ws2.b$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.customizeplan.domain.CustomizePlanApiInteractor", m100430f = "CustomizePlanApiInteractor.kt", m100431l = {54}, m100432m = "getCustomizationFlow", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f160863w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f160864x;

        /* JADX INFO: renamed from: z */
        int f160866z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f160864x = obj;
            this.f160866z |= Integer.MIN_VALUE;
            return C37610b.this.m120745k(null, this);
        }
    }

    /* JADX INFO: renamed from: ws2.b$c */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.customizeplan.domain.CustomizePlanApiInteractor$getCustomizationFlow$response$1", m100430f = "CustomizePlanApiInteractor.kt", m100431l = {55}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        Object f160867w;

        /* JADX INFO: renamed from: x */
        int f160868x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ List<String> f160870z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<String> list, InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f160870z = list;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C37610b.this.new c(this.f160870z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            WeeklyPlanCustomizationResponseMapper weeklyPlanCustomizationResponseMapper;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f160868x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                WeeklyPlanCustomizationResponseMapper weeklyPlanCustomizationResponseMapper2 = WeeklyPlanCustomizationResponseMapper.INSTANCE;
                WeeklyPlanApi weeklyPlanApi = C37610b.this.api;
                List<String> list = this.f160870z;
                this.f160867w = weeklyPlanCustomizationResponseMapper2;
                this.f160868x = 1;
                Object objCustomizeWeeklyPlanKotlinx = weeklyPlanApi.customizeWeeklyPlanKotlinx(list, this);
                if (objCustomizeWeeklyPlanKotlinx == enumC31071a) {
                    return enumC31071a;
                }
                weeklyPlanCustomizationResponseMapper = weeklyPlanCustomizationResponseMapper2;
                obj = objCustomizeWeeklyPlanKotlinx;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                weeklyPlanCustomizationResponseMapper = (WeeklyPlanCustomizationResponseMapper) this.f160867w;
                AbstractC34132o.m107864I(obj);
            }
            return weeklyPlanCustomizationResponseMapper.mapKotlinxToGson((WeeklyPlanCustomizationResponseKotlinx) obj);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super WeeklyPlanCustomizationResponse> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ws2.b$d */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.customizeplan.domain.CustomizePlanApiInteractor$interact$$inlined$flatMapLatest$1", m100430f = "CustomizePlanApiInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f160871w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f160872x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f160873y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C37610b f160874z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC30057d interfaceC30057d, C37610b c37610b) {
            super(3, interfaceC30057d);
            this.f160874z = c37610b;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC37609a abstractC37609a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = new d(interfaceC30057d, this.f160874z);
            dVar.f160872x = interfaceC13062m;
            dVar.f160873y = abstractC37609a;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f160871w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f160872x;
                C13084s1 c13084s1 = new C13084s1(new e((AbstractC37609a) this.f160873y, this.f160874z, null));
                this.f160872x = null;
                this.f160873y = null;
                this.f160871w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13084s1, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC37609a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: ws2.b$e */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.customizeplan.domain.CustomizePlanApiInteractor$interact$1$1", m100430f = "CustomizePlanApiInteractor.kt", m100431l = {35, 35, 38, 39, 39, 43, 44, 44}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lws2/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C37610b f160875E;

        /* JADX INFO: renamed from: w */
        Object f160876w;

        /* JADX INFO: renamed from: x */
        int f160877x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f160878y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC37609a f160879z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractC37609a abstractC37609a, C37610b c37610b, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f160879z = abstractC37609a;
            this.f160875E = c37610b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = new e(this.f160879z, this.f160875E, interfaceC30057d);
            eVar.f160878y = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00a6 A[PHI: r0 r8
          0x00a6: PHI (r0v5 ec3.m) = (r0v1 ec3.m), (r0v7 ec3.m) binds: [B:26:0x00a3, B:8:0x0022] A[DONT_GENERATE, DONT_INLINE]
          0x00a6: PHI (r8v15 java.lang.Object) = (r8v14 java.lang.Object), (r8v0 java.lang.Object) binds: [B:26:0x00a3, B:8:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:39:0x00ee A[PHI: r0 r8
          0x00ee: PHI (r0v8 ec3.m) = (r0v1 ec3.m), (r0v10 ec3.m) binds: [B:37:0x00eb, B:6:0x0014] A[DONT_GENERATE, DONT_INLINE]
          0x00ee: PHI (r8v20 java.lang.Object) = (r8v18 java.lang.Object), (r8v0 java.lang.Object) binds: [B:37:0x00eb, B:6:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
        
            if (r0.emit(r8, r7) == r1) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00b1, code lost:
        
            if (r0.emit(r8, r7) == r1) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00fa, code lost:
        
            if (r0.emit(r8, r7) == r1) goto L41;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 284
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ws2.C37610b.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ws2.b$f */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.customizeplan.domain.CustomizePlanApiInteractor$updateTargetMetric$2", m100430f = "CustomizePlanApiInteractor.kt", m100431l = {67, 105}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lws2/e;", "<anonymous>", "(Lbc3/c0;)Lws2/e;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f160880E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ String f160881F;

        /* JADX INFO: renamed from: w */
        Object f160882w;

        /* JADX INFO: renamed from: x */
        int f160883x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ ConfirmTarget f160885z;

        /* JADX INFO: renamed from: ws2.b$f$a */
        @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.customizeplan.domain.CustomizePlanApiInteractor$updateTargetMetric$2$response$1", m100430f = "CustomizePlanApiInteractor.kt", m100431l = {71, 83, 93}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ String f160886E;

            /* JADX INFO: renamed from: w */
            int f160887w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ ConfirmTarget f160888x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C37610b f160889y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ String f160890z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ConfirmTarget confirmTarget, C37610b c37610b, String str, String str2, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f160888x = confirmTarget;
                this.f160889y = c37610b;
                this.f160890z = str;
                this.f160886E = str2;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f160888x, this.f160889y, this.f160890z, this.f160886E, interfaceC30057d);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0073, code lost:
            
                if (r9 == r0) goto L30;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x00aa, code lost:
            
                if (r9 == r0) goto L30;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x00e1, code lost:
            
                if (r9 == r0) goto L30;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    Method dump skipped, instruction units count: 237
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ws2.C37610b.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ConfirmTarget confirmTarget, String str, String str2, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f160885z = confirmTarget;
            this.f160880E = str;
            this.f160881F = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C37610b.this.new f(this.f160885z, this.f160880E, this.f160881F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC37613e> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
        
            if (r12.m119657b(com.whoop.data.repositories.SmartAlarmTriggerRepository.SMART_ALARM_REFRESH, r11) == r0) goto L23;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r11.f160883x
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r11.f160882w
                u02.a r0 = (u02.InterfaceC34385a) r0
                p505ts.AbstractC34132o.m107864I(r12)
                r8 = r11
                goto L81
            L16:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1e:
                p505ts.AbstractC34132o.m107864I(r12)
                r8 = r11
                goto L4b
            L23:
                p505ts.AbstractC34132o.m107864I(r12)
                r12 = r3
                u02.a$a r3 = u02.InterfaceC34385a.INSTANCE
                ws2.b r1 = ws2.C37610b.this
                tr2.n r4 = ws2.C37610b.m120741g(r1)
                ws2.b$f$a r5 = new ws2.b$f$a
                com.whoop.weeklyplan.customizeplan.domain.api.ConfirmTarget r6 = r11.f160885z
                ws2.b r7 = ws2.C37610b.this
                java.lang.String r8 = r11.f160881F
                java.lang.String r9 = r11.f160880E
                r10 = 0
                r5.<init>(r6, r7, r8, r9, r10)
                r11.f160883x = r12
                r7 = r5
                r5 = 0
                r6 = 0
                r9 = 6
                r8 = r11
                java.lang.Object r12 = u02.InterfaceC34385a.Companion.m108729b(r3, r4, r5, r6, r7, r8, r9, r10)
                if (r12 != r0) goto L4b
                goto L80
            L4b:
                u02.a r12 = (u02.InterfaceC34385a) r12
                boolean r1 = r12 instanceof u02.InterfaceC34385a.c
                if (r1 == 0) goto L84
                com.whoop.weeklyplan.customizeplan.domain.api.ConfirmTarget r12 = r8.f160885z
                boolean r1 = r12 instanceof com.whoop.weeklyplan.customizeplan.domain.api.ConfirmTarget.ConfirmMetricTarget
                if (r1 == 0) goto L81
                com.whoop.weeklyplan.customizeplan.domain.api.ConfirmTarget$ConfirmMetricTarget r12 = (com.whoop.weeklyplan.customizeplan.domain.api.ConfirmTarget.ConfirmMetricTarget) r12
                com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType r12 = r12.getType()
                com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType r1 = com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType.SLEEP_PERFORMANCE
                if (r12 == r1) goto L6d
                com.whoop.weeklyplan.customizeplan.domain.api.ConfirmTarget r12 = r8.f160885z
                com.whoop.weeklyplan.customizeplan.domain.api.ConfirmTarget$ConfirmMetricTarget r12 = (com.whoop.weeklyplan.customizeplan.domain.api.ConfirmTarget.ConfirmMetricTarget) r12
                com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType r12 = r12.getType()
                com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType r1 = com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType.SLEEP_HOURS
                if (r12 != r1) goto L81
            L6d:
                ws2.b r12 = ws2.C37610b.this
                wm0.a r12 = ws2.C37610b.m120742h(r12)
                r1 = 0
                r8.f160882w = r1
                r8.f160883x = r2
                java.lang.String r1 = "SmartAlarmRefresh"
                java.lang.Object r12 = r12.m119657b(r1, r11)
                if (r12 != r0) goto L81
            L80:
                return r0
            L81:
                ws2.e$k r12 = ws2.AbstractC37613e.k.f160918a
                return r12
            L84:
                boolean r12 = r12 instanceof u02.InterfaceC34385a.b
                if (r12 == 0) goto L92
                ws2.e$j r12 = new ws2.e$j
                java.lang.String r0 = r8.f160880E
                com.whoop.weeklyplan.customizeplan.domain.api.ConfirmTarget r1 = r8.f160885z
                r12.<init>(r0, r1)
                return r12
            L92:
                kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
                r12.<init>()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: ws2.C37610b.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C37610b(WeeklyPlanApi api, InterfaceC34116n logger, C24717b analytics, C37378a scopeCoordinator) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(scopeCoordinator, "scopeCoordinator");
        this.api = api;
        this.logger = logger;
        this.analytics = analytics;
        this.scopeCoordinator = scopeCoordinator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final Object m120744j(String str, TargetGoalType targetGoalType, String str2, InterfaceC30057d<? super AbstractC37613e> interfaceC30057d) {
        return AbstractC28190p0.m85321a(1000L, new a(targetGoalType, str, str2, null), interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: k */
    public final Object m120745k(List<String> list, InterfaceC30057d<? super AbstractC37613e> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f160866z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f160866z = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        b bVar2 = bVar;
        Object objM108729b = bVar2.f160864x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar2.f160866z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            c cVar = new c(list, null);
            bVar2.f160863w = list;
            bVar2.f160866z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, cVar, bVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) bVar2.f160863w;
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new AbstractC37613e.m((WeeklyPlanCustomizationResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return new AbstractC37613e.e(((InterfaceC34385a.b) interfaceC34385a).getErrorMessage(), list);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final Object m120746l(String str, ConfirmTarget confirmTarget, String str2, InterfaceC30057d<? super AbstractC37613e> interfaceC30057d) {
        return AbstractC28190p0.m85321a(1000L, new f(confirmTarget, str, str2, null), interfaceC30057d);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new d(null, this));
    }
}
