package zo1;

import bm.C3383g;
import com.mapbox.common.logger.LogPriority;
import com.whoop.hormonalinsights.api.DismissBody;
import com.whoop.hormonalinsights.api.EnablePregnancyCoachingBody;
import com.whoop.hormonalinsights.api.HormonalInsightsApi;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.MciPregnancyDueDateSavedScreenDto;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.MciPregnancyOnboardingDto;
import com.whoop.hormonalinsights.onboarding.domain.models.MciOnboardingRequest;
import com.whoop.hormonalinsights.onboarding.domain.models.MciOnboardingResponse;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import m83.AbstractC25265s;
import m83.C25271y;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: zo1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\"\u0010\u0018\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0017\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010 \u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b \u0010!J \u0010$\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020\u00032\u0006\u0010#\u001a\u00020(2\u0006\u0010\u0017\u001a\u00020\u0003H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H\u0002¢\u0006\u0004\b+\u0010'J7\u00102\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\u001c2\b\u0010.\u001a\u0004\u0018\u00010-2\b\u0010/\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u00101\u001a\u0004\u0018\u000100H\u0002¢\u0006\u0004\b2\u00103J7\u00107\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001042\u000e\u00105\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001042\u000e\u00106\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u000104H\u0002¢\u0006\u0004\b7\u00108J#\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0003092\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000209H\u0016¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006C"}, m65681d2 = {"Lzo1/d;", "Lod1/g;", "Lzo1/a;", "Lzo1/c;", "Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;", "api", "Ltr2/n;", "logger", "Lzo1/e;", "helper", "<init>", "(Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;Ltr2/n;Lzo1/e;)V", "", "isInitialScreen", "s", "(ZLq83/d;)Ljava/lang/Object;", "o", "(Lq83/d;)Ljava/lang/Object;", "", "dueDate", "z", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "feature", "previousState", "p", "(Ljava/lang/String;Lzo1/c;Lq83/d;)Ljava/lang/Object;", "u", "(Lzo1/c;Lq83/d;)Ljava/lang/Object;", "Lzo1/b;", "saveRequest", "Lzo1/f;", "progressResult", "t", "(Lzo1/b;Lzo1/f;Lq83/d;)Ljava/lang/Object;", "Lzo1/a$c;", "action", "r", "(Lzo1/a$c;Lzo1/c;Lq83/d;)Ljava/lang/Object;", "q", "(Lzo1/c;)Lzo1/c;", "Lzo1/a$h;", "y", "(Lzo1/a$h;Lzo1/c;)Lzo1/c;", "x", "previousData", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "currentScreen", "content", "Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingResponse;", "response", "v", "(Lzo1/b;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lzo1/b;Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingResponse;)Lzo1/b;", "", "initialDays", "finalDays", "n", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;", "b", "Ltr2/n;", "c", "Lzo1/e;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40927d implements InterfaceC27844g<AbstractC40924a, AbstractC40926c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final HormonalInsightsApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C40928e helper;

    /* JADX INFO: renamed from: zo1.d$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f176540a;

        static {
            int[] iArr = new int[HormonalScreenId.values().length];
            try {
                iArr[HormonalScreenId.MENSTRUAL_CYCLE_LAST_PERIOD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HormonalScreenId.MENSTRUAL_CYCLE_PERIOD_LENGTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HormonalScreenId.MENSTRUAL_CYCLE_SYMPTOMS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HormonalScreenId.MENSTRUAL_CYCLE_GOALS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HormonalScreenId.MENSTRUAL_CYCLE_CONTRACEPTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HormonalScreenId.MENSTRUAL_CYCLE_MOTIVATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HormonalScreenId.FERTILITY_FEATURE_TOGGLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f176540a = iArr;
        }
    }

    /* JADX INFO: renamed from: zo1.d$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.onboarding.domain.MciOnboardingInteractor", m100430f = "MciOnboardingInteractor.kt", m100431l = {61}, m100432m = "dismissHormonalInsights", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f176541w;

        /* JADX INFO: renamed from: y */
        int f176543y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f176541w = obj;
            this.f176543y |= Integer.MIN_VALUE;
            return C40927d.this.m132773o(this);
        }
    }

    /* JADX INFO: renamed from: zo1.d$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.onboarding.domain.MciOnboardingInteractor$dismissHormonalInsights$response$1", m100430f = "MciOnboardingInteractor.kt", m100431l = {62}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f176544w;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C40927d.this.new c(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f176544w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            HormonalInsightsApi hormonalInsightsApi = C40927d.this.api;
            DismissBody dismissBody = new DismissBody("HORMONAL_INSIGHTS");
            this.f176544w = 1;
            Object objDismissRequest = hormonalInsightsApi.dismissRequest(dismissBody, this);
            return objDismissRequest == enumC31071a ? enumC31071a : objDismissRequest;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: zo1.d$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.onboarding.domain.MciOnboardingInteractor", m100430f = "MciOnboardingInteractor.kt", m100431l = {98}, m100432m = "fetchData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f176546E;

        /* JADX INFO: renamed from: w */
        Object f176547w;

        /* JADX INFO: renamed from: x */
        Object f176548x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f176549y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f176549y = obj;
            this.f176546E |= Integer.MIN_VALUE;
            return C40927d.this.m132774p(null, null, this);
        }
    }

    /* JADX INFO: renamed from: zo1.d$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.onboarding.domain.MciOnboardingInteractor$fetchData$response$1", m100430f = "MciOnboardingInteractor.kt", m100431l = {LogPriority.NONE}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f176551w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f176553y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, InterfaceC30057d<? super e> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f176553y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C40927d.this.new e(this.f176553y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f176551w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            HormonalInsightsApi hormonalInsightsApi = C40927d.this.api;
            String str = this.f176553y;
            this.f176551w = 1;
            Object hormonalOnboarding = hormonalInsightsApi.getHormonalOnboarding(str, this);
            return hormonalOnboarding == enumC31071a ? enumC31071a : hormonalOnboarding;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super MciOnboardingResponse> interfaceC30057d) {
            return ((e) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: zo1.d$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.onboarding.domain.MciOnboardingInteractor$interact$$inlined$flatMapLatest$1", m100430f = "MciOnboardingInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f176554w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f176555x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f176556y;

        public f(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC40924a abstractC40924a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            f fVar = new f(interfaceC30057d);
            fVar.f176555x = interfaceC13062m;
            fVar.f176556y = abstractC40924a;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f176554w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f176555x;
                AbstractC40924a abstractC40924a = (AbstractC40924a) this.f176556y;
                InterfaceC13058l c3383g = ((abstractC40924a instanceof AbstractC40924a.f) || ((abstractC40924a instanceof AbstractC40924a.c) && ((AbstractC40924a.c) abstractC40924a).getNextScreen() == null) || (abstractC40924a instanceof AbstractC40924a.b)) ? new C3383g(new AbstractC40924a[]{AbstractC40924a.g.f176510a, abstractC40924a}, 3) : new C0456u(abstractC40924a, 1);
                this.f176555x = null;
                this.f176556y = null;
                this.f176554w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c3383g, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC40924a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: zo1.d$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.onboarding.domain.MciOnboardingInteractor$interact$2", m100430f = "MciOnboardingInteractor.kt", m100431l = {34, 35, 38, 40, 41, 42}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lzo1/c;", "previousState", "Lzo1/a;", "action", "<anonymous>", "(Lzo1/c;Lzo1/a;)Lzo1/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f176557w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f176558x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f176559y;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC40926c abstractC40926c, AbstractC40924a abstractC40924a, InterfaceC30057d<? super AbstractC40926c> interfaceC30057d) {
            g gVar = C40927d.this.new g(interfaceC30057d);
            gVar.f176558x = abstractC40926c;
            gVar.f176559y = abstractC40924a;
            return gVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
        
            if (r5 == r2) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
        
            if (r5 == r2) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00a0, code lost:
        
            if (r5 == r2) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00cc, code lost:
        
            if (r5 == r2) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00e9, code lost:
        
            if (r5 == r2) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0104, code lost:
        
            if (r5 == r2) goto L63;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                Method dump skipped, instruction units count: 290
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: zo1.C40927d.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: zo1.d$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.onboarding.domain.MciOnboardingInteractor", m100430f = "MciOnboardingInteractor.kt", m100431l = {48}, m100432m = "loadPregnancyOnboarding", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        boolean f176561w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f176562x;

        /* JADX INFO: renamed from: z */
        int f176564z;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f176562x = obj;
            this.f176564z |= Integer.MIN_VALUE;
            return C40927d.this.m132777s(false, this);
        }
    }

    /* JADX INFO: renamed from: zo1.d$i */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.onboarding.domain.MciOnboardingInteractor$loadPregnancyOnboarding$response$1", m100430f = "MciOnboardingInteractor.kt", m100431l = {49}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyOnboardingDto;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f176565w;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C40927d.this.new i(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f176565w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            HormonalInsightsApi hormonalInsightsApi = C40927d.this.api;
            this.f176565w = 1;
            Object mciPregnancyOnboarding = hormonalInsightsApi.getMciPregnancyOnboarding(this);
            return mciPregnancyOnboarding == enumC31071a ? enumC31071a : mciPregnancyOnboarding;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super MciPregnancyOnboardingDto> interfaceC30057d) {
            return ((i) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: zo1.d$j */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.onboarding.domain.MciOnboardingInteractor", m100430f = "MciOnboardingInteractor.kt", m100431l = {138}, m100432m = "performSave", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f176568F;

        /* JADX INFO: renamed from: w */
        Object f176569w;

        /* JADX INFO: renamed from: x */
        Object f176570x;

        /* JADX INFO: renamed from: y */
        Object f176571y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f176572z;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f176572z = obj;
            this.f176568F |= Integer.MIN_VALUE;
            return C40927d.this.m132778t(null, null, this);
        }
    }

    /* JADX INFO: renamed from: zo1.d$k */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.onboarding.domain.MciOnboardingInteractor$performSave$response$1", m100430f = "MciOnboardingInteractor.kt", m100431l = {139}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f176573w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ MciOnboardingRequest f176575y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(MciOnboardingRequest mciOnboardingRequest, InterfaceC30057d<? super k> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f176575y = mciOnboardingRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C40927d.this.new k(this.f176575y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f176573w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            HormonalInsightsApi hormonalInsightsApi = C40927d.this.api;
            MciOnboardingRequest mciOnboardingRequest = this.f176575y;
            this.f176573w = 1;
            Object objSaveMciSurvey = hormonalInsightsApi.saveMciSurvey(mciOnboardingRequest, this);
            return objSaveMciSurvey == enumC31071a ? enumC31071a : objSaveMciSurvey;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((k) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: zo1.d$l */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.onboarding.domain.MciOnboardingInteractor", m100430f = "MciOnboardingInteractor.kt", m100431l = {HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE, 82}, m100432m = "updateDueDate", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f176576E;

        /* JADX INFO: renamed from: w */
        Object f176577w;

        /* JADX INFO: renamed from: x */
        Object f176578x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f176579y;

        public l(InterfaceC30057d<? super l> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f176579y = obj;
            this.f176576E |= Integer.MIN_VALUE;
            return C40927d.this.m132784z(null, this);
        }
    }

    /* JADX INFO: renamed from: zo1.d$m */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.onboarding.domain.MciOnboardingInteractor$updateDueDate$dueDateSavedResponse$1", m100430f = "MciOnboardingInteractor.kt", m100431l = {83}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyDueDateSavedScreenDto;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f176581w;

        public m(InterfaceC30057d<? super m> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C40927d.this.new m(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f176581w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            HormonalInsightsApi hormonalInsightsApi = C40927d.this.api;
            this.f176581w = 1;
            Object mciPregnancyDueDateSavedScreen = hormonalInsightsApi.getMciPregnancyDueDateSavedScreen(this);
            return mciPregnancyDueDateSavedScreen == enumC31071a ? enumC31071a : mciPregnancyDueDateSavedScreen;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super MciPregnancyDueDateSavedScreenDto> interfaceC30057d) {
            return ((m) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: zo1.d$n */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.onboarding.domain.MciOnboardingInteractor$updateDueDate$updateDueDateResponse$1", m100430f = "MciOnboardingInteractor.kt", m100431l = {76}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class n extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f176583w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f176585y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str, InterfaceC30057d<? super n> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f176585y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C40927d.this.new n(this.f176585y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f176583w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                HormonalInsightsApi hormonalInsightsApi = C40927d.this.api;
                EnablePregnancyCoachingBody enablePregnancyCoachingBody = new EnablePregnancyCoachingBody(this.f176585y);
                this.f176583w = 1;
                if (hormonalInsightsApi.updateDueDate(enablePregnancyCoachingBody, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((n) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C40927d(HormonalInsightsApi api, InterfaceC34116n logger, C40928e helper) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(helper, "helper");
        this.api = api;
        this.logger = logger;
        this.helper = helper;
    }

    /* JADX INFO: renamed from: n */
    private final List<String> m132772n(List<String> initialDays, List<String> finalDays) {
        if (initialDays == null) {
            return null;
        }
        return finalDays == null ? initialDays : AbstractC25265s.m74093D1(AbstractC12350b.m34605z(AbstractC25265s.m74103I1(initialDays), AbstractC25265s.m74103I1(finalDays)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: o */
    public final Object m132773o(InterfaceC30057d<? super AbstractC40926c> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f176543y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f176543y = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        b bVar2 = bVar;
        Object objM108729b = bVar2.f176541w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar2.f176543y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            c cVar = new c(null);
            bVar2.f176543y = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, cVar, bVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return AbstractC40926c.a.f176520a;
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return new AbstractC40926c.d(null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: p */
    public final Object m132774p(String str, AbstractC40926c abstractC40926c, InterfaceC30057d<? super AbstractC40926c> interfaceC30057d) {
        d dVar;
        AbstractC40926c abstractC40926c2;
        String str2 = str;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f176546E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f176546E = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        d dVar2 = dVar;
        Object objM108729b = dVar2.f176549y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar2.f176546E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            e eVar = new e(str2, null);
            dVar2.f176547w = str2;
            abstractC40926c2 = abstractC40926c;
            dVar2.f176548x = abstractC40926c2;
            dVar2.f176546E = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, eVar, dVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC40926c abstractC40926c3 = (AbstractC40926c) dVar2.f176548x;
            String str3 = (String) dVar2.f176547w;
            AbstractC34132o.m107864I(objM108729b);
            abstractC40926c2 = abstractC40926c3;
            str2 = str3;
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            InterfaceC34385a.c cVar = (InterfaceC34385a.c) interfaceC34385a;
            boolean z4 = abstractC40926c2 instanceof AbstractC40926c.k;
            return new AbstractC40926c.k((MciOnboardingResponse) cVar.m108735a(), z4 ? ((AbstractC40926c.k) abstractC40926c2).getProgressResult() : new C40929f(((MciOnboardingResponse) cVar.m108735a()).getInitialScreen(), C25271y.f99162w), z4 ? ((AbstractC40926c.k) abstractC40926c2).getSaveRequest() : new C40925b(null, null, null, null, null, null, null, 127, null), false, 8, null);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return new AbstractC40926c.d(str2);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final AbstractC40926c m132775q(AbstractC40926c previousState) {
        AbstractC22676k.m65748h(previousState, "null cannot be cast to non-null type com.whoop.hormonalinsights.onboarding.domain.MciOnboardingDomainResult.Success");
        AbstractC40926c.k kVar = (AbstractC40926c.k) previousState;
        if (kVar.getProgressResult().m132789b().isEmpty()) {
            return AbstractC40926c.k.m132755b(kVar, null, null, null, true, 7, null);
        }
        HormonalScreenId hormonalScreenId = (HormonalScreenId) AbstractC25265s.m74112P0(kVar.getProgressResult().m132789b());
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(kVar.getProgressResult().m132789b());
        arrayListM74097F1.remove(AbstractC37056f.m118951C(arrayListM74097F1));
        return AbstractC40926c.k.m132755b(kVar, null, new C40929f(hormonalScreenId, arrayListM74097F1), null, false, 13, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final Object m132776r(AbstractC40924a.c cVar, AbstractC40926c abstractC40926c, InterfaceC30057d<? super AbstractC40926c> interfaceC30057d) {
        C40929f progressResult;
        C40925b saveRequest;
        boolean z4 = abstractC40926c instanceof AbstractC40926c.k;
        AbstractC40926c.k kVar = z4 ? (AbstractC40926c.k) abstractC40926c : null;
        if (kVar == null || (progressResult = kVar.getProgressResult()) == null) {
            AbstractC22676k.m65748h(abstractC40926c, "null cannot be cast to non-null type com.whoop.hormonalinsights.onboarding.domain.MciOnboardingDomainResult.Saving");
            progressResult = ((AbstractC40926c.j) abstractC40926c).getProgressResult();
        }
        AbstractC40926c.k kVar2 = z4 ? (AbstractC40926c.k) abstractC40926c : null;
        if (kVar2 == null || (saveRequest = kVar2.getSaveRequest()) == null) {
            AbstractC22676k.m65748h(abstractC40926c, "null cannot be cast to non-null type com.whoop.hormonalinsights.onboarding.domain.MciOnboardingDomainResult.Saving");
            saveRequest = ((AbstractC40926c.j) abstractC40926c).getSaveRequest();
        }
        HormonalScreenId currentScreen = progressResult.getCurrentScreen();
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(progressResult.m132789b());
        arrayListM74097F1.add(currentScreen);
        C40925b content = cVar.getContent();
        AbstractC40926c.k kVar3 = z4 ? (AbstractC40926c.k) abstractC40926c : null;
        C40925b c40925bM132780v = m132780v(saveRequest, currentScreen, content, kVar3 != null ? kVar3.getResponse() : null);
        if (cVar.getNextScreen() == null) {
            return m132778t(c40925bM132780v, progressResult, interfaceC30057d);
        }
        AbstractC22676k.m65748h(abstractC40926c, "null cannot be cast to non-null type com.whoop.hormonalinsights.onboarding.domain.MciOnboardingDomainResult.Success");
        return AbstractC40926c.k.m132755b((AbstractC40926c.k) abstractC40926c, null, new C40929f(cVar.getNextScreen(), arrayListM74097F1), c40925bM132780v, false, 9, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: s */
    public final Object m132777s(boolean z4, InterfaceC30057d<? super AbstractC40926c> interfaceC30057d) {
        h hVar;
        if (interfaceC30057d instanceof h) {
            hVar = (h) interfaceC30057d;
            int i13 = hVar.f176564z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                hVar.f176564z = i13 - Integer.MIN_VALUE;
            } else {
                hVar = new h(interfaceC30057d);
            }
        } else {
            hVar = new h(interfaceC30057d);
        }
        h hVar2 = hVar;
        Object objM108729b = hVar2.f176562x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = hVar2.f176564z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            i iVar = new i(null);
            hVar2.f176561w = z4;
            hVar2.f176564z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, iVar, hVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z4 = hVar2.f176561w;
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new AbstractC40926c.f((MciPregnancyOnboardingDto) ((InterfaceC34385a.c) interfaceC34385a).m108735a(), z4);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return new AbstractC40926c.g(z4);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: t */
    public final Object m132778t(C40925b c40925b, C40929f c40929f, InterfaceC30057d<? super AbstractC40926c> interfaceC30057d) {
        j jVar;
        if (interfaceC30057d instanceof j) {
            jVar = (j) interfaceC30057d;
            int i13 = jVar.f176568F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                jVar.f176568F = i13 - Integer.MIN_VALUE;
            } else {
                jVar = new j(interfaceC30057d);
            }
        } else {
            jVar = new j(interfaceC30057d);
        }
        j jVar2 = jVar;
        Object objM108729b = jVar2.f176572z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = jVar2.f176568F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            MciOnboardingRequest mciOnboardingRequestM132786a = this.helper.m132786a(c40925b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            k kVar = new k(mciOnboardingRequestM132786a, null);
            jVar2.f176569w = c40925b;
            jVar2.f176570x = c40929f;
            jVar2.f176571y = null;
            jVar2.f176568F = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, kVar, jVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c40929f = (C40929f) jVar2.f176570x;
            c40925b = (C40925b) jVar2.f176569w;
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return AbstractC40926c.i.f176530a;
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return new AbstractC40926c.h(c40929f, c40925b);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public final Object m132779u(AbstractC40926c abstractC40926c, InterfaceC30057d<? super AbstractC40926c> interfaceC30057d) {
        AbstractC22676k.m65748h(abstractC40926c, "null cannot be cast to non-null type com.whoop.hormonalinsights.onboarding.domain.MciOnboardingDomainResult.Saving");
        AbstractC40926c.j jVar = (AbstractC40926c.j) abstractC40926c;
        return m132778t(jVar.getSaveRequest(), jVar.getProgressResult(), interfaceC30057d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [zo1.d] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.whoop.hormonalinsights.onboarding.domain.models.ContraceptionType] */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.whoop.hormonalinsights.onboarding.domain.models.MciInterest] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.List] */
    /* JADX INFO: renamed from: v */
    private final C40925b m132780v(C40925b previousData, HormonalScreenId currentScreen, C40925b content, MciOnboardingResponse response) {
        List<String> listM132742g;
        Object objM74159y0 = null;
        switch (currentScreen == null ? -1 : a.f176540a[currentScreen.ordinal()]) {
            case 1:
                if (content != null && (listM132742g = content.m132742g()) != null) {
                    objM74159y0 = AbstractC25265s.m74159y0(listM132742g);
                }
                ?? r10 = objM74159y0;
                return C40925b.m132736b(previousData, r10, m132772n(this.helper.m132787b(response), r10), null, null, null, null, null, 124, null);
            case 2:
                return C40925b.m132736b(previousData, null, null, content != null ? content.getCycleLength() : null, null, null, null, null, 123, null);
            case 3:
                return C40925b.m132736b(previousData, null, null, null, null, null, content != null ? content.m132744i() : null, null, 95, null);
            case 4:
                return C40925b.m132736b(previousData, null, null, null, null, null, null, content != null ? content.m132740e() : null, 63, null);
            case 5:
                return C40925b.m132736b(previousData, null, null, null, null, content != null ? content.getContraceptionType() : null, null, null, 111, null);
            case 6:
                return C40925b.m132736b(previousData, null, null, null, content != null ? content.getInterest() : null, null, null, null, 119, null);
            default:
                return previousData;
        }
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ C40925b m132781w(C40927d c40927d, C40925b c40925b, HormonalScreenId hormonalScreenId, C40925b c40925b2, MciOnboardingResponse mciOnboardingResponse, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            mciOnboardingResponse = null;
        }
        return c40927d.m132780v(c40925b, hormonalScreenId, c40925b2, mciOnboardingResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public final AbstractC40926c m132782x(AbstractC40926c previousState) {
        C40925b saveRequest;
        C40929f progressResult;
        boolean z4 = previousState instanceof AbstractC40926c.k;
        AbstractC40926c.k kVar = z4 ? (AbstractC40926c.k) previousState : null;
        if (kVar == null || (saveRequest = kVar.getSaveRequest()) == null) {
            AbstractC22676k.m65748h(previousState, "null cannot be cast to non-null type com.whoop.hormonalinsights.onboarding.domain.MciOnboardingDomainResult.SaveError");
            saveRequest = ((AbstractC40926c.h) previousState).getSaveRequest();
        }
        AbstractC40926c.k kVar2 = z4 ? (AbstractC40926c.k) previousState : null;
        if (kVar2 == null || (progressResult = kVar2.getProgressResult()) == null) {
            AbstractC22676k.m65748h(previousState, "null cannot be cast to non-null type com.whoop.hormonalinsights.onboarding.domain.MciOnboardingDomainResult.SaveError");
            progressResult = ((AbstractC40926c.h) previousState).getProgressResult();
        }
        return new AbstractC40926c.j(progressResult, saveRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public final AbstractC40926c m132783y(AbstractC40924a.h action, AbstractC40926c previousState) {
        AbstractC22676k.m65748h(previousState, "null cannot be cast to non-null type com.whoop.hormonalinsights.onboarding.domain.MciOnboardingDomainResult.Success");
        AbstractC40926c.k kVar = (AbstractC40926c.k) previousState;
        HormonalScreenId currentScreen = kVar.getProgressResult().getCurrentScreen();
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(kVar.getProgressResult().m132789b());
        arrayListM74097F1.add(currentScreen);
        return AbstractC40926c.k.m132755b(kVar, null, new C40929f(action.getNextScreen(), arrayListM74097F1), m132781w(this, kVar.getSaveRequest(), currentScreen, null, null, 8, null), false, 9, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
    
        if (r13 == r0) goto L24;
     */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m132784z(java.lang.String r12, q83.InterfaceC30057d<? super zo1.AbstractC40926c> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof zo1.C40927d.l
            if (r0 == 0) goto L14
            r0 = r13
            zo1.d$l r0 = (zo1.C40927d.l) r0
            int r1 = r0.f176576E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f176576E = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            zo1.d$l r0 = new zo1.d$l
            r0.<init>(r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.f176579y
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f176576E
            r9 = 2
            r2 = 1
            r10 = 0
            if (r1 == 0) goto L45
            if (r1 == r2) goto L3d
            if (r1 != r9) goto L35
            java.lang.Object r12 = r6.f176578x
            u02.a r12 = (u02.InterfaceC34385a) r12
            java.lang.Object r12 = r6.f176577w
            java.lang.String r12 = (java.lang.String) r12
            p505ts.AbstractC34132o.m107864I(r13)
            goto L81
        L35:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3d:
            java.lang.Object r12 = r6.f176577w
            java.lang.String r12 = (java.lang.String) r12
            p505ts.AbstractC34132o.m107864I(r13)
            goto L61
        L45:
            p505ts.AbstractC34132o.m107864I(r13)
            u02.a$a r1 = u02.InterfaceC34385a.INSTANCE
            r13 = r2
            tr2.n r2 = r11.logger
            zo1.d$n r5 = new zo1.d$n
            r5.<init>(r12, r10)
            r6.f176577w = r12
            r6.f176576E = r13
            r3 = 0
            r4 = 0
            r7 = 6
            r8 = 0
            java.lang.Object r13 = u02.InterfaceC34385a.Companion.m108729b(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r13 != r0) goto L61
            goto L80
        L61:
            u02.a r13 = (u02.InterfaceC34385a) r13
            boolean r1 = r13 instanceof u02.InterfaceC34385a.c
            if (r1 == 0) goto La5
            u02.a$a r1 = u02.InterfaceC34385a.INSTANCE
            tr2.n r2 = r11.logger
            zo1.d$m r5 = new zo1.d$m
            r5.<init>(r10)
            r6.f176577w = r12
            r6.f176578x = r10
            r6.f176576E = r9
            r3 = 0
            r4 = 0
            r7 = 6
            r8 = 0
            java.lang.Object r13 = u02.InterfaceC34385a.Companion.m108729b(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r13 != r0) goto L81
        L80:
            return r0
        L81:
            u02.a r13 = (u02.InterfaceC34385a) r13
            boolean r0 = r13 instanceof u02.InterfaceC34385a.c
            if (r0 == 0) goto L95
            zo1.c$c r12 = new zo1.c$c
            u02.a$c r13 = (u02.InterfaceC34385a.c) r13
            java.lang.Object r13 = r13.m108735a()
            com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.MciPregnancyDueDateSavedScreenDto r13 = (com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.MciPregnancyDueDateSavedScreenDto) r13
            r12.<init>(r13)
            return r12
        L95:
            boolean r13 = r13 instanceof u02.InterfaceC34385a.b
            if (r13 == 0) goto L9f
            zo1.c$b r13 = new zo1.c$b
            r13.<init>(r12)
            return r13
        L9f:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        La5:
            boolean r13 = r13 instanceof u02.InterfaceC34385a.b
            if (r13 == 0) goto Laf
            zo1.c$b r13 = new zo1.c$b
            r13.<init>(r12)
            return r13
        Laf:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: zo1.C40927d.m132784z(java.lang.String, q83.d):java.lang.Object");
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(AbstractC40926c.e.f176524a, AbstractC13091v.m36590P(upstream, new f(null)), new g(null));
    }

    public /* synthetic */ C40927d(HormonalInsightsApi hormonalInsightsApi, InterfaceC34116n interfaceC34116n, C40928e c40928e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(hormonalInsightsApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("MciOnboardingInteractor") : interfaceC34116n, (i13 & 4) != 0 ? new C40928e() : c40928e);
    }
}
