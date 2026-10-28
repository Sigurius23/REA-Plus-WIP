package op0;

import c93.InterfaceC4351m;
import com.whoop.coaching.sleepcoach.data.network.api.SleepCoachOnboardingApi;
import com.whoop.data.onboarding.FeatureEducationType;
import com.whoop.data.remote.commons.Resource;
import com.whoop.data.remote.domain.dto.sleepcoach.SleepCoachOnBoardingResponseDto;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.educationModels.CompleteFeatureEducationBody;
import com.whoop.educationModels.FeatureEducationDto;
import com.whoop.onboarding.story.domain.network.FeatureEducationApi;
import hj0.AbstractC17355n;
import in2.InterfaceC18732d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u92.C34660d;

/* JADX INFO: renamed from: op0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0086@¢\u0006\u0004\b\u001f\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, m65681d2 = {"Lop0/d;", "Lhj0/n;", "Lrr2/c;", "crashReporter", "Lin2/d;", "dispatcherFactory", "Lcom/whoop/coaching/sleepcoach/data/network/api/SleepCoachOnboardingApi;", "sleepCoachOnboardingApi", "Lcom/whoop/onboarding/story/domain/network/FeatureEducationApi;", "featureEducationApi", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lu92/d;", "prefsStore", "<init>", "(Lrr2/c;Lin2/d;Lcom/whoop/coaching/sleepcoach/data/network/api/SleepCoachOnboardingApi;Lcom/whoop/onboarding/story/domain/network/FeatureEducationApi;Lcom/whoop/data/repositories/FeatureFlagChecker;Lu92/d;)V", "Lcom/whoop/data/onboarding/FeatureEducationType;", "featureEducationType", "Ll83/a0;", "i", "(Lcom/whoop/data/onboarding/FeatureEducationType;Lq83/d;)Ljava/lang/Object;", "", "g", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/remote/domain/dto/sleepcoach/SleepCoachOnBoardingRequestDto;", "sleepCoachOnBoardingRequestDto", "Lpg3/v0;", "j", "(Lcom/whoop/data/remote/domain/dto/sleepcoach/SleepCoachOnBoardingRequestDto;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/remote/commons/Resource;", "Lcom/whoop/data/remote/domain/dto/sleepcoach/SleepCoachOnBoardingResponseDto;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "a", "Lcom/whoop/coaching/sleepcoach/data/network/api/SleepCoachOnboardingApi;", "getSleepCoachOnboardingApi", "()Lcom/whoop/coaching/sleepcoach/data/network/api/SleepCoachOnboardingApi;", "b", "Lcom/whoop/onboarding/story/domain/network/FeatureEducationApi;", "f", "()Lcom/whoop/onboarding/story/domain/network/FeatureEducationApi;", "c", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "getFeatureFlagChecker", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "d", "Lu92/d;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28086d extends AbstractC17355n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final SleepCoachOnboardingApi sleepCoachOnboardingApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureEducationApi featureEducationApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C34660d prefsStore;

    /* JADX INFO: renamed from: op0.d$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.wizard.onboarding.SleepCoachOnBoardingRepository", m100430f = "SleepCoachOnBoardingRepository.kt", m100431l = {33}, m100432m = "getSleepCoachOnboardingStatus", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f113577w;

        /* JADX INFO: renamed from: y */
        int f113579y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f113577w = obj;
            this.f113579y |= Integer.MIN_VALUE;
            return C28086d.this.m84856g(this);
        }
    }

    /* JADX INFO: renamed from: op0.d$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.wizard.onboarding.SleepCoachOnBoardingRepository", m100430f = "SleepCoachOnBoardingRepository.kt", m100431l = {66}, m100432m = "getSleepCoachOnboardingStatusOfAll", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f113580w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f113581x;

        /* JADX INFO: renamed from: z */
        int f113583z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f113581x = obj;
            this.f113583z |= Integer.MIN_VALUE;
            return C28086d.this.m84857h(this);
        }
    }

    /* JADX INFO: renamed from: op0.d$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.wizard.onboarding.SleepCoachOnBoardingRepository", m100430f = "SleepCoachOnBoardingRepository.kt", m100431l = {58, 60}, m100432m = "markFeatureEducationAsComplete", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f113584w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f113585x;

        /* JADX INFO: renamed from: z */
        int f113587z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f113585x = obj;
            this.f113587z |= Integer.MIN_VALUE;
            return C28086d.this.m84854i(null, this);
        }
    }

    /* JADX INFO: renamed from: op0.d$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.wizard.onboarding.SleepCoachOnBoardingRepository$markFeatureEducationAsComplete$2", m100430f = "SleepCoachOnBoardingRepository.kt", m100431l = {59}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/educationModels/FeatureEducationDto;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f113588w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ FeatureEducationType f113590y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(FeatureEducationType featureEducationType, InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f113590y = featureEducationType;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C28086d.this.new d(this.f113590y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f113588w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            FeatureEducationApi featureEducationApi = C28086d.this.getFeatureEducationApi();
            String strName = this.f113590y.name();
            this.f113588w = 1;
            Object featureEducation = featureEducationApi.getFeatureEducation(strName, this);
            return featureEducation == enumC31071a ? enumC31071a : featureEducation;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super FeatureEducationDto> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: op0.d$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.wizard.onboarding.SleepCoachOnBoardingRepository$markFeatureEducationAsComplete$3", m100430f = "SleepCoachOnBoardingRepository.kt", m100431l = {61}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lcom/whoop/educationModels/FeatureEducationDto;", "featureEducation", "Lpg3/v0;", "Ll83/a0;", "<anonymous>", "(Lcom/whoop/educationModels/FeatureEducationDto;)Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f113591w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f113592x;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = C28086d.this.new e(interfaceC30057d);
            eVar.f113592x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FeatureEducationDto featureEducationDto, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((e) create(featureEducationDto, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            FeatureEducationDto featureEducationDto = (FeatureEducationDto) this.f113592x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f113591w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            FeatureEducationApi featureEducationApi = C28086d.this.getFeatureEducationApi();
            CompleteFeatureEducationBody completeFeatureEducationBody = new CompleteFeatureEducationBody(featureEducationDto.getStoryId(), true);
            this.f113592x = null;
            this.f113591w = 1;
            Object objCompleteFeatureEducation = featureEducationApi.completeFeatureEducation(completeFeatureEducationBody, this);
            return objCompleteFeatureEducation == enumC31071a ? enumC31071a : objCompleteFeatureEducation;
        }
    }

    /* JADX INFO: renamed from: op0.d$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.wizard.onboarding.SleepCoachOnBoardingRepository", m100430f = "SleepCoachOnBoardingRepository.kt", m100431l = {42, 44}, m100432m = "postSleepCoachOnboardingStatus", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f113594w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f113595x;

        /* JADX INFO: renamed from: z */
        int f113597z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f113595x = obj;
            this.f113597z |= Integer.MIN_VALUE;
            return C28086d.this.m84858j(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28086d(InterfaceC31766c crashReporter, InterfaceC18732d dispatcherFactory, SleepCoachOnboardingApi sleepCoachOnboardingApi, FeatureEducationApi featureEducationApi, FeatureFlagChecker featureFlagChecker, C34660d prefsStore) {
        super(InterfaceC34116n.INSTANCE.m107848a("SleepCoachOnBoardingRepository"), crashReporter, dispatcherFactory);
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(dispatcherFactory, "dispatcherFactory");
        AbstractC22676k.m65750j(sleepCoachOnboardingApi, "sleepCoachOnboardingApi");
        AbstractC22676k.m65750j(featureEducationApi, "featureEducationApi");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(prefsStore, "prefsStore");
        this.sleepCoachOnboardingApi = sleepCoachOnboardingApi;
        this.featureEducationApi = featureEducationApi;
        this.featureFlagChecker = featureFlagChecker;
        this.prefsStore = prefsStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0098, code lost:
    
        if (u02.AbstractC34386b.m108736a(r1, r2, r3, r4, r5, r6) == r0) goto L22;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m84854i(com.whoop.data.onboarding.FeatureEducationType r10, q83.InterfaceC30057d<? super l83.C23454a0> r11) throws java.lang.Exception {
        /*
            r9 = this;
            boolean r0 = r11 instanceof op0.C28086d.c
            if (r0 == 0) goto L14
            r0 = r11
            op0.d$c r0 = (op0.C28086d.c) r0
            int r1 = r0.f113587z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f113587z = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            op0.d$c r0 = new op0.d$c
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f113585x
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f113587z
            r7 = 2
            r2 = 1
            r8 = 0
            if (r1 == 0) goto L41
            if (r1 == r2) goto L39
            if (r1 != r7) goto L31
            java.lang.Object r10 = r6.f113584w
            com.whoop.data.onboarding.FeatureEducationType r10 = (com.whoop.data.onboarding.FeatureEducationType) r10
            p505ts.AbstractC34132o.m107864I(r11)
            goto L9b
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            java.lang.Object r10 = r6.f113584w
            com.whoop.data.onboarding.FeatureEducationType r10 = (com.whoop.data.onboarding.FeatureEducationType) r10
            p505ts.AbstractC34132o.m107864I(r11)
            goto L6d
        L41:
            p505ts.AbstractC34132o.m107864I(r11)
            u02.a$a r1 = u02.InterfaceC34385a.INSTANCE
            r11 = r2
            tr2.n r2 = r9.getLogger()
            rr2.c r3 = r9.getCrashReporter()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Failed to fetch feature education for "
            r4.<init>(r5)
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            op0.d$d r5 = new op0.d$d
            r5.<init>(r10, r8)
            r6.f113584w = r10
            r6.f113587z = r11
            java.lang.Object r11 = r1.m108730a(r2, r3, r4, r5, r6)
            if (r11 != r0) goto L6d
            goto L9a
        L6d:
            r1 = r11
            u02.a r1 = (u02.InterfaceC34385a) r1
            tr2.n r2 = r9.getLogger()
            rr2.c r3 = r9.getCrashReporter()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r4 = "failed to mark education path "
            r11.<init>(r4)
            r11.append(r10)
            java.lang.String r10 = " with storyId "
            r11.append(r10)
            java.lang.String r4 = r11.toString()
            op0.d$e r5 = new op0.d$e
            r5.<init>(r8)
            r6.f113584w = r8
            r6.f113587z = r7
            java.lang.Object r10 = u02.AbstractC34386b.m108736a(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto L9b
        L9a:
            return r0
        L9b:
            l83.a0 r10 = l83.C23454a0.f92919a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: op0.C28086d.m84854i(com.whoop.data.onboarding.FeatureEducationType, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final FeatureEducationApi getFeatureEducationApi() {
        return this.featureEducationApi;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m84856g(InterfaceC30057d<? super String> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f113579y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f113579y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object sleepCoachOnBoardingStatus = aVar.f113577w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f113579y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(sleepCoachOnBoardingStatus);
                SleepCoachOnboardingApi sleepCoachOnboardingApi = this.sleepCoachOnboardingApi;
                aVar.f113579y = 1;
                sleepCoachOnBoardingStatus = sleepCoachOnboardingApi.getSleepCoachOnBoardingStatus(aVar);
                if (sleepCoachOnBoardingStatus == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(sleepCoachOnBoardingStatus);
            }
            return (String) sleepCoachOnBoardingStatus;
        } catch (Exception e5) {
            logRetrofitSuspendException(e5, "Failed to fetch sleep coach onboarding status");
            return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m84857h(InterfaceC30057d<? super Resource<SleepCoachOnBoardingResponseDto>> interfaceC30057d) {
        b bVar;
        Resource.Companion companion;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f113583z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f113583z = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object obj = bVar.f113581x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f113583z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                Resource.Companion companion2 = Resource.INSTANCE;
                SleepCoachOnboardingApi sleepCoachOnboardingApi = this.sleepCoachOnboardingApi;
                bVar.f113580w = companion2;
                bVar.f113583z = 1;
                Object allSleepCoachOnBoardingStatus = sleepCoachOnboardingApi.getAllSleepCoachOnBoardingStatus(bVar);
                if (allSleepCoachOnBoardingStatus == enumC31071a) {
                    return enumC31071a;
                }
                companion = companion2;
                obj = allSleepCoachOnBoardingStatus;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                companion = (Resource.Companion) bVar.f113580w;
                AbstractC34132o.m107864I(obj);
            }
            return companion.success(obj);
        } catch (Exception e5) {
            logRetrofitSuspendException(e5, "Failed to fetch sleep coach onboarding status");
            return Resource.Companion.error$default(Resource.INSTANCE, "", null, null, null, 14, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        if (r8 == r1) goto L32;
     */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m84858j(com.whoop.data.remote.domain.dto.sleepcoach.SleepCoachOnBoardingRequestDto r7, q83.InterfaceC30057d<? super pg3.C29218v0<l83.C23454a0>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof op0.C28086d.f
            if (r0 == 0) goto L13
            r0 = r8
            op0.d$f r0 = (op0.C28086d.f) r0
            int r1 = r0.f113597z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f113597z = r1
            goto L18
        L13:
            op0.d$f r0 = new op0.d$f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f113595x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f113597z
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r7 = r0.f113594w
            com.whoop.data.remote.domain.dto.sleepcoach.SleepCoachOnBoardingRequestDto r7 = (com.whoop.data.remote.domain.dto.sleepcoach.SleepCoachOnBoardingRequestDto) r7
            p505ts.AbstractC34132o.m107864I(r8)     // Catch: java.lang.Exception -> L2f
            goto L7b
        L2f:
            r7 = move-exception
            goto L7e
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            java.lang.Object r7 = r0.f113594w
            com.whoop.data.remote.domain.dto.sleepcoach.SleepCoachOnBoardingRequestDto r7 = (com.whoop.data.remote.domain.dto.sleepcoach.SleepCoachOnBoardingRequestDto) r7
            p505ts.AbstractC34132o.m107864I(r8)     // Catch: java.lang.Exception -> L2f
            goto L6e
        L41:
            p505ts.AbstractC34132o.m107864I(r8)
            com.whoop.data.repositories.FeatureFlagChecker r8 = r6.featureFlagChecker     // Catch: java.lang.Exception -> L2f
            com.whoop.data.repositories.OnboardingFeatureFlag r2 = com.whoop.data.repositories.OnboardingFeatureFlag.HOME_XP     // Catch: java.lang.Exception -> L2f
            boolean r8 = r8.isFeatureEnabled(r2)     // Catch: java.lang.Exception -> L2f
            if (r8 == 0) goto L6e
            java.lang.String r8 = r7.getSleepCoachFeatureName()     // Catch: java.lang.Exception -> L2f
            java.lang.String r2 = "SLEEP_COACH"
            boolean r8 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r8, r2)     // Catch: java.lang.Exception -> L2f
            if (r8 == 0) goto L6e
            u92.d r8 = r6.prefsStore     // Catch: java.lang.Exception -> L2f
            java.lang.String r2 = "PLAN_MY_SLEEP_COMPLETED"
            r8.m109538q(r2, r5)     // Catch: java.lang.Exception -> L2f
            com.whoop.data.onboarding.FeatureEducationType r8 = com.whoop.data.onboarding.FeatureEducationType.SLEEP_PLANNER_SCREEN     // Catch: java.lang.Exception -> L2f
            r0.f113594w = r7     // Catch: java.lang.Exception -> L2f
            r0.f113597z = r5     // Catch: java.lang.Exception -> L2f
            java.lang.Object r8 = r6.m84854i(r8, r0)     // Catch: java.lang.Exception -> L2f
            if (r8 != r1) goto L6e
            goto L7a
        L6e:
            com.whoop.coaching.sleepcoach.data.network.api.SleepCoachOnboardingApi r8 = r6.sleepCoachOnboardingApi     // Catch: java.lang.Exception -> L2f
            r0.f113594w = r3     // Catch: java.lang.Exception -> L2f
            r0.f113597z = r4     // Catch: java.lang.Exception -> L2f
            java.lang.Object r8 = r8.updateSleepCoachOnBoardingStatus(r7, r0)     // Catch: java.lang.Exception -> L2f
            if (r8 != r1) goto L7b
        L7a:
            return r1
        L7b:
            pg3.v0 r8 = (pg3.C29218v0) r8     // Catch: java.lang.Exception -> L2f
            return r8
        L7e:
            java.lang.String r8 = "Failed to update sleep coach onboarding status"
            r6.logRetrofitSuspendException(r7, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: op0.C28086d.m84858j(com.whoop.data.remote.domain.dto.sleepcoach.SleepCoachOnBoardingRequestDto, q83.d):java.lang.Object");
    }
}
