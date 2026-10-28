package ri1;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.onboarding.FeatureEducationType;
import com.whoop.data.onboarding.OnboardingStatusDao;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.health.domain.DismissUpsellCardRequest;
import com.whoop.health.domain.GetHealthTabRequest;
import com.whoop.health.domain.models.CardSupplementalInfo;
import com.whoop.health.domain.models.DataVisualizationCardBodyModel;
import com.whoop.health.domain.models.DataVisualizationCardModel;
import com.whoop.health.domain.models.DismissUpsellCardRequestBody;
import com.whoop.health.domain.models.HealthTabResponse;
import com.whoop.health.domain.models.HeartScreenerUpdatedAtInfoModel;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.HeartScreenerModel;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import f63.AbstractC14155c;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import java.time.Instant;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import org.joda.time.DateTime;
import p000.AbstractC11266d;
import p007a6.C0456u;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qk1.C30443a;
import qk1.InterfaceC30444b;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import tr2.InterfaceC34116n;
import u02.C34387c;
import u02.InterfaceC34385a;
import we1.InterfaceC37217a;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: ri1.j */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BQ\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u001a\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010#\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020!H\u0082@¢\u0006\u0004\b#\u0010$J$\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020%0'2\u0006\u0010&\u001a\u00020%H\u0082@¢\u0006\u0004\b(\u0010)J.\u0010/\u001a\b\u0012\u0004\u0012\u00020-0,2\b\u0010+\u001a\u0004\u0018\u00010*2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,H\u0082@¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b1\u00102J\u0012\u00104\u001a\u0004\u0018\u000103H\u0082@¢\u0006\u0004\b4\u00102J\u0010\u00106\u001a\u000205H\u0082@¢\u0006\u0004\b6\u00102J#\u00108\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00020\u001eH\u0016¢\u0006\u0004\b8\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006L"}, m65681d2 = {"Lri1/j;", "Lod1/g;", "Lri1/d;", "Lri1/h;", "Lu02/c;", "apiClient", "Lnm0/e;", "cachedApiSource", "Lzr2/a;", "dateAndTimeProvider", "Ltr2/n;", "logger", "Lcom/whoop/data/onboarding/OnboardingStatusDao;", "onboardingStatusDao", "Lqk1/b;", "labradorDao", "Lri1/q;", "mapper", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lwe1/a;", "entitlementChecker", "<init>", "(Lu02/c;Lnm0/e;Lzr2/a;Ltr2/n;Lcom/whoop/data/onboarding/OnboardingStatusDao;Lqk1/b;Lri1/q;Lcom/whoop/data/repositories/FeatureFlagChecker;Lwe1/a;)V", "", "id", "p", "(Lri1/h;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "", "manualRefresh", "Lec3/l;", "v", "(Z)Lec3/l;", "Lcom/whoop/health/domain/models/HealthTabResponse;", "cachedResponse", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lcom/whoop/health/domain/models/HealthTabResponse;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;", "modelItem", "Ll83/k;", "r", "(Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;", "updatedAtInfo", "", "Lcom/whoop/design/models/DesignSystemModel;", "modelItems", "s", "(Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "t", "(Lq83/d;)Ljava/lang/Object;", "Lqk1/a;", "q", "Lcom/whoop/health/domain/models/DataVisualizationCardModel;", "u", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lu02/c;", "b", "Lnm0/e;", "c", "Lzr2/a;", "d", "Ltr2/n;", "e", "Lcom/whoop/data/onboarding/OnboardingStatusDao;", "f", "Lqk1/b;", "g", "Lri1/q;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lcom/whoop/data/repositories/FeatureFlagChecker;", "i", "Lwe1/a;", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31461j implements InterfaceC27844g<InterfaceC31455d, C31459h> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C34387c apiClient;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final OnboardingStatusDao onboardingStatusDao;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC30444b labradorDao;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C31468q mapper;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC37217a entitlementChecker;

    /* JADX INFO: renamed from: ri1.j$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.health.domain.HealthTabInteractor", m100430f = "HealthTabInteractor.kt", m100431l = {111}, m100432m = "dismissUpsellCard", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f129530F;

        /* JADX INFO: renamed from: w */
        Object f129531w;

        /* JADX INFO: renamed from: x */
        Object f129532x;

        /* JADX INFO: renamed from: y */
        Object f129533y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f129534z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f129534z = obj;
            this.f129530F |= Integer.MIN_VALUE;
            return C31461j.this.m96884p(null, null, this);
        }
    }

    /* JADX INFO: renamed from: ri1.j$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.health.domain.HealthTabInteractor$dismissUpsellCard$result$1", m100430f = "HealthTabInteractor.kt", m100431l = {112}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Lf63/c;", "<anonymous>", "()Lf63/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f129535w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ DismissUpsellCardRequest f129537y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(DismissUpsellCardRequest dismissUpsellCardRequest, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f129537y = dismissUpsellCardRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C31461j.this.new b(this.f129537y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f129535w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C34387c c34387c = C31461j.this.apiClient;
            DismissUpsellCardRequest dismissUpsellCardRequest = this.f129537y;
            InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(DismissUpsellCardRequest.class);
            C32236a c32236aM44445Y = AbstractC15751g.m44445Y(AbstractC22671h0.f89337a.getOrCreateKotlinClass(DismissUpsellCardRequest.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d));
            this.f129535w = 1;
            Object objM108748d = c34387c.m108748d(dismissUpsellCardRequest, c32236aM44445Y, this);
            return objM108748d == enumC31071a ? enumC31071a : objM108748d;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super AbstractC14155c> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ri1.j$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.health.domain.HealthTabInteractor", m100430f = "HealthTabInteractor.kt", m100431l = {275}, m100432m = "getLatestLocalReading", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f129538w;

        /* JADX INFO: renamed from: y */
        int f129540y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f129538w = obj;
            this.f129540y |= Integer.MIN_VALUE;
            return C31461j.this.m96885q(this);
        }
    }

    /* JADX INFO: renamed from: ri1.j$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.health.domain.HealthTabInteractor", m100430f = "HealthTabInteractor.kt", m100431l = {217}, m100432m = "getLatestReading", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f129541w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f129542x;

        /* JADX INFO: renamed from: z */
        int f129544z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f129542x = obj;
            this.f129544z |= Integer.MIN_VALUE;
            return C31461j.this.m96886r(null, this);
        }
    }

    /* JADX INFO: renamed from: ri1.j$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.health.domain.HealthTabInteractor", m100430f = "HealthTabInteractor.kt", m100431l = {232}, m100432m = "getLatestReading", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f129545E;

        /* JADX INFO: renamed from: w */
        Object f129546w;

        /* JADX INFO: renamed from: x */
        Object f129547x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f129548y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f129548y = obj;
            this.f129545E |= Integer.MIN_VALUE;
            return C31461j.this.m96887s(null, null, this);
        }
    }

    /* JADX INFO: renamed from: ri1.j$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.health.domain.HealthTabInteractor$getOfflineData$2", m100430f = "HealthTabInteractor.kt", m100431l = {257, 262}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lri1/h;", "<anonymous>", "(Lbc3/c0;)Lri1/h;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        private /* synthetic */ Object f129550E;

        /* JADX INFO: renamed from: w */
        Object f129552w;

        /* JADX INFO: renamed from: x */
        boolean f129553x;

        /* JADX INFO: renamed from: y */
        boolean f129554y;

        /* JADX INFO: renamed from: z */
        int f129555z;

        /* JADX INFO: renamed from: ri1.j$f$a */
        @InterfaceC32271e(m100429c = "com.whoop.health.domain.HealthTabInteractor$getOfflineData$2$labradorOnboardingCompletedDeferred$1", m100430f = "HealthTabInteractor.kt", m100431l = {247}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f129556w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C31461j f129557x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C31461j c31461j, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f129557x = c31461j;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f129557x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                boolean zBooleanValue;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f129556w;
                try {
                    if (i13 == 0) {
                        AbstractC34132o.m107864I(obj);
                        OnboardingStatusDao onboardingStatusDao = this.f129557x.onboardingStatusDao;
                        FeatureEducationType featureEducationType = FeatureEducationType.ECG_EDUCATION;
                        this.f129556w = 1;
                        obj = onboardingStatusDao.isCompleted(featureEducationType, this);
                        if (obj == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                    }
                    zBooleanValue = ((Boolean) obj).booleanValue();
                } catch (Exception e5) {
                    AbstractC3006f0.m8721o(getContext());
                    this.f129557x.logger.mo85218i("failed to determine if education completed for offline state", e5, new AbstractC30556a.a[0]);
                    zBooleanValue = false;
                }
                return Boolean.valueOf(zBooleanValue);
            }
        }

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = C31461j.this.new f(interfaceC30057d);
            fVar.f129550E = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C31459h> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0081, code lost:
        
            if (r15 == r1) goto L20;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = r14.f129550E
                bc3.c0 r0 = (bc3.InterfaceC2994c0) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r14.f129555z
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L2d
                if (r2 == r4) goto L21
                if (r2 != r3) goto L19
                java.lang.Object r0 = r14.f129552w
                bc3.i0 r0 = (bc3.InterfaceC3018i0) r0
                p505ts.AbstractC34132o.m107864I(r15)
                goto L84
            L19:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L21:
                boolean r0 = r14.f129554y
                boolean r2 = r14.f129553x
                java.lang.Object r4 = r14.f129552w
                bc3.i0 r4 = (bc3.InterfaceC3018i0) r4
                p505ts.AbstractC34132o.m107864I(r15)
                goto L69
            L2d:
                p505ts.AbstractC34132o.m107864I(r15)
                ri1.j$f$a r15 = new ri1.j$f$a
                ri1.j r2 = ri1.C31461j.this
                r15.<init>(r2, r5)
                r2 = 3
                bc3.j0 r15 = bc3.AbstractC3006f0.m8711e(r0, r5, r15, r2)
                ri1.j r0 = ri1.C31461j.this
                we1.a r0 = ri1.C31461j.m96873e(r0)
                com.whoop.entitlements.Entitlement r2 = com.whoop.entitlements.Entitlement.LABRADOR
                boolean r2 = r0.mo119272b(r2)
                ri1.j r0 = ri1.C31461j.this
                com.whoop.data.repositories.FeatureFlagChecker r0 = ri1.C31461j.m96874f(r0)
                java.lang.String r6 = "labrador-entrypoint-bff"
                boolean r0 = r0.isFeatureEnabled(r6)
                if (r2 == 0) goto Lac
                if (r0 == 0) goto Lac
                r14.f129550E = r5
                r14.f129552w = r5
                r14.f129553x = r2
                r14.f129554y = r0
                r14.f129555z = r4
                java.lang.Object r15 = r15.m8817m(r14)
                if (r15 != r1) goto L69
                goto L83
            L69:
                java.lang.Boolean r15 = (java.lang.Boolean) r15
                boolean r15 = r15.booleanValue()
                if (r15 == 0) goto Lac
                ri1.j r15 = ri1.C31461j.this
                r14.f129550E = r5
                r14.f129552w = r5
                r14.f129553x = r2
                r14.f129554y = r0
                r14.f129555z = r3
                java.lang.Object r15 = ri1.C31461j.m96880l(r15, r14)
                if (r15 != r1) goto L84
            L83:
                return r1
            L84:
                java.util.List r15 = wb3.AbstractC37056f.m118958J(r15)
                com.whoop.health.domain.models.HealthTabSectionModel r0 = new com.whoop.health.domain.models.HealthTabSectionModel
                java.lang.String r1 = "NORMAL"
                r0.<init>(r15, r1)
                java.util.List r3 = wb3.AbstractC37056f.m118958J(r0)
                com.whoop.health.domain.models.HealthTabResponse r2 = new com.whoop.health.domain.models.HealthTabResponse
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 14
                r8 = 0
                r2.<init>(r3, r4, r5, r6, r7, r8)
                ri1.h r4 = new ri1.h
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 61
                r12 = 0
                r6 = r2
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
                return r4
            Lac:
                ri1.h r5 = new ri1.h
                ri1.g$f r6 = ri1.InterfaceC31458g.f.f129512a
                r12 = 62
                r13 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: ri1.C31461j.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ri1.j$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.health.domain.HealthTabInteractor", m100430f = "HealthTabInteractor.kt", m100431l = {280}, m100432m = "getOfflineHeartScreener", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f129558w;

        /* JADX INFO: renamed from: y */
        int f129560y;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f129558w = obj;
            this.f129560y |= Integer.MIN_VALUE;
            return C31461j.this.m96889u(this);
        }
    }

    /* JADX INFO: renamed from: ri1.j$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.health.domain.HealthTabInteractor$interact$$inlined$flatMapLatest$1", m100430f = "HealthTabInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f129561w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f129562x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f129563y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C31461j f129564z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC30057d interfaceC30057d, C31461j c31461j) {
            super(3, interfaceC30057d);
            this.f129564z = c31461j;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC31455d interfaceC31455d, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            h hVar = new h(interfaceC30057d, this.f129564z);
            hVar.f129562x = interfaceC13062m;
            hVar.f129563y = interfaceC31455d;
            return hVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c13084s1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f129561w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f129562x;
                InterfaceC31455d interfaceC31455d = (InterfaceC31455d) this.f129563y;
                if (interfaceC31455d instanceof C31457f) {
                    c13084s1 = AbstractC13091v.m36590P(this.f129564z.m96890v(((C31457f) interfaceC31455d).getManualRefresh()), new k(null, interfaceC31455d));
                } else {
                    c13084s1 = interfaceC31455d instanceof C31453b ? new C13084s1(new i(interfaceC31455d, null)) : new C0456u(interfaceC31455d, 1);
                }
                this.f129562x = null;
                this.f129563y = null;
                this.f129561w = 1;
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
            return invoke((InterfaceC13062m) obj, (InterfaceC31455d) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: ri1.j$i */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.health.domain.HealthTabInteractor$interact$1$2", m100430f = "HealthTabInteractor.kt", m100431l = {91, 92}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lri1/d;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f129565w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f129566x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC31455d f129567y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC31455d interfaceC31455d, InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f129567y = interfaceC31455d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            i iVar = new i(this.f129567y, interfaceC30057d);
            iVar.f129566x = obj;
            return iVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
        
            if (r0.emit(r6, r5) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f129566x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r5.f129565w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r6)
                goto L3e
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L30
            L20:
                p505ts.AbstractC34132o.m107864I(r6)
                ri1.c r6 = ri1.C31454c.f129505a
                r5.f129566x = r0
                r5.f129565w = r4
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L30
                goto L3d
            L30:
                ri1.d r6 = r5.f129567y
                r2 = 0
                r5.f129566x = r2
                r5.f129565w = r3
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L3e
            L3d:
                return r1
            L3e:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ri1.C31461j.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ri1.j$j */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.health.domain.HealthTabInteractor$interact$2", m100430f = "HealthTabInteractor.kt", m100431l = {105}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lri1/h;", "previousState", "Lri1/d;", "action", "<anonymous>", "(Lri1/h;Lri1/d;)Lri1/h;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f129568w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f129569x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f129570y;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C31459h c31459h, InterfaceC31455d interfaceC31455d, InterfaceC30057d<? super C31459h> interfaceC30057d) {
            j jVar = C31461j.this.new j(interfaceC30057d);
            jVar.f129569x = c31459h;
            jVar.f129570y = interfaceC31455d;
            return jVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C31459h c31459h = (C31459h) this.f129569x;
            InterfaceC31455d interfaceC31455d = (InterfaceC31455d) this.f129570y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f129568w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (interfaceC31455d instanceof C31457f) {
                    C31459h domainState = ((C31457f) interfaceC31455d).getDomainState();
                    return domainState == null ? c31459h : domainState;
                }
                if (interfaceC31455d instanceof C31452a) {
                    return C31459h.m96861b(c31459h, null, null, false, false, null, null, 62, null);
                }
                if (interfaceC31455d instanceof C31456e) {
                    return C31459h.m96861b(c31459h, InterfaceC31458g.a.f129509a, null, false, false, null, null, 62, null);
                }
                if (interfaceC31455d instanceof C31454c) {
                    return C31459h.m96861b(c31459h, null, null, false, true, null, null, 51, null);
                }
                if (!(interfaceC31455d instanceof C31453b)) {
                    throw new NoWhenBranchMatchedException();
                }
                C31461j c31461j = C31461j.this;
                String id4 = ((C31453b) interfaceC31455d).getId();
                this.f129569x = null;
                this.f129570y = null;
                this.f129568w = 1;
                obj = c31461j.m96884p(c31459h, id4, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return (C31459h) obj;
        }
    }

    /* JADX INFO: renamed from: ri1.j$k */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.health.domain.HealthTabInteractor$interact$lambda$0$$inlined$flatMapLatest$1", m100430f = "HealthTabInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f129572w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f129573x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f129574y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC31455d f129575z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC30057d interfaceC30057d, InterfaceC31455d interfaceC31455d) {
            super(3, interfaceC30057d);
            this.f129575z = interfaceC31455d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C31459h c31459h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            k kVar = new k(interfaceC30057d, this.f129575z);
            kVar.f129573x = interfaceC13062m;
            kVar.f129574y = c31459h;
            return kVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f129572w;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f129573x;
                C31457f c31457f = new C31457f(((C31457f) this.f129575z).getManualRefresh(), (C31459h) this.f129574y);
                this.f129573x = null;
                this.f129574y = null;
                this.f129572w = 1;
                AbstractC13091v.m36615y(interfaceC13062m);
                Object objEmit = interfaceC13062m.emit(c31457f, this);
                if (objEmit != EnumC31071a.f128113w) {
                    objEmit = c23454a0;
                }
                if (objEmit != EnumC31071a.f128113w) {
                    objEmit = c23454a0;
                }
                if (objEmit == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return c23454a0;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (C31459h) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: ri1.j$l */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.health.domain.HealthTabInteractor$loadHealthTabFromCache$$inlined$cacheAPI$1", m100430f = "HealthTabInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class l extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f129576w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f129577x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f129578y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f129579z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f129579z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            l lVar = new l(interfaceC30057d, this.f129579z);
            lVar.f129577x = interfaceC13062m;
            lVar.f129578y = c26832c;
            return lVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f129576w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f129577x;
                C26832c c26832c = (C26832c) this.f129578y;
                InterfaceC26834e interfaceC26834e = this.f129579z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(HealthTabResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(HealthTabResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f129577x = null;
                this.f129578y = null;
                this.f129576w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo80083a, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (C26832c<C23454a0>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: ri1.j$m */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f129580w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f129581x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C31461j f129582y;

        /* JADX INFO: renamed from: ri1.j$m$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f129583w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ boolean f129584x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C31461j f129585y;

            /* JADX INFO: renamed from: ri1.j$m$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.health.domain.HealthTabInteractor$loadHealthTabFromCache$$inlined$map$1$2", m100430f = "HealthTabInteractor.kt", m100431l = {54, 55, 56, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42271a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f129586E;

                /* JADX INFO: renamed from: F */
                Object f129587F;

                /* JADX INFO: renamed from: G */
                Object f129588G;

                /* JADX INFO: renamed from: H */
                Object f129589H;

                /* JADX INFO: renamed from: I */
                Object f129590I;

                /* JADX INFO: renamed from: J */
                Object f129591J;

                /* JADX INFO: renamed from: K */
                int f129592K;

                /* JADX INFO: renamed from: L */
                int f129593L;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f129594w;

                /* JADX INFO: renamed from: x */
                int f129595x;

                /* JADX INFO: renamed from: y */
                Object f129596y;

                public C42271a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f129594w = obj;
                    this.f129595x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, boolean z4, C31461j c31461j) {
                this.f129583w = interfaceC13062m;
                this.f129584x = z4;
                this.f129585y = c31461j;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x00cb, code lost:
            
                if (r4 == r3) goto L44;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x00cf, code lost:
            
                r6 = r1;
                r1 = r4;
                r4 = 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x00fc, code lost:
            
                if (r4 == r3) goto L44;
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x011d, code lost:
            
                if (r4 == r3) goto L44;
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x0149, code lost:
            
                if (r1.emit(r12, r2) == r3) goto L44;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r22, q83.InterfaceC30057d r23) {
                /*
                    Method dump skipped, instruction units count: 335
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ri1.C31461j.m.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public m(InterfaceC13058l interfaceC13058l, boolean z4, C31461j c31461j) {
            this.f129580w = interfaceC13058l;
            this.f129581x = z4;
            this.f129582y = c31461j;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f129580w.collect(new a(interfaceC13062m, this.f129581x, this.f129582y), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ri1.j$n */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.health.domain.HealthTabInteractor", m100430f = "HealthTabInteractor.kt", m100431l = {153, 181}, m100432m = "updateBasedOnLatestProcessedTimestamp", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f129598E;

        /* JADX INFO: renamed from: F */
        Object f129599F;

        /* JADX INFO: renamed from: G */
        Object f129600G;

        /* JADX INFO: renamed from: H */
        Object f129601H;

        /* JADX INFO: renamed from: I */
        Object f129602I;

        /* JADX INFO: renamed from: J */
        Object f129603J;

        /* JADX INFO: renamed from: K */
        Object f129604K;

        /* JADX INFO: renamed from: L */
        Object f129605L;

        /* JADX INFO: renamed from: M */
        Object f129606M;

        /* JADX INFO: renamed from: N */
        Object f129607N;

        /* JADX INFO: renamed from: O */
        Object f129608O;

        /* JADX INFO: renamed from: P */
        Object f129609P;

        /* JADX INFO: renamed from: Q */
        Object f129610Q;

        /* JADX INFO: renamed from: R */
        Object f129611R;

        /* JADX INFO: renamed from: S */
        Object f129612S;

        /* JADX INFO: renamed from: T */
        Object f129613T;

        /* JADX INFO: renamed from: U */
        Object f129614U;

        /* JADX INFO: renamed from: V */
        Object f129615V;

        /* JADX INFO: renamed from: W */
        int f129616W;

        /* JADX INFO: renamed from: X */
        int f129617X;

        /* JADX INFO: renamed from: Y */
        int f129618Y;

        /* JADX INFO: renamed from: Z */
        int f129619Z;

        /* JADX INFO: renamed from: a0 */
        int f129620a0;

        /* JADX INFO: renamed from: b0 */
        int f129621b0;

        /* JADX INFO: renamed from: c0 */
        int f129622c0;

        /* JADX INFO: renamed from: d0 */
        int f129623d0;

        /* JADX INFO: renamed from: e0 */
        int f129624e0;

        /* JADX INFO: renamed from: f0 */
        /* synthetic */ Object f129625f0;

        /* JADX INFO: renamed from: h0 */
        int f129627h0;

        /* JADX INFO: renamed from: w */
        Object f129628w;

        /* JADX INFO: renamed from: x */
        Object f129629x;

        /* JADX INFO: renamed from: y */
        Object f129630y;

        /* JADX INFO: renamed from: z */
        Object f129631z;

        public n(InterfaceC30057d<? super n> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f129625f0 = obj;
            this.f129627h0 |= Integer.MIN_VALUE;
            return C31461j.this.m96891w(null, this);
        }
    }

    public C31461j(C34387c apiClient, InterfaceC26834e cachedApiSource, InterfaceC41070a dateAndTimeProvider, InterfaceC34116n logger, OnboardingStatusDao onboardingStatusDao, InterfaceC30444b labradorDao, C31468q mapper, FeatureFlagChecker featureFlagChecker, InterfaceC37217a entitlementChecker) {
        AbstractC22676k.m65750j(apiClient, "apiClient");
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(onboardingStatusDao, "onboardingStatusDao");
        AbstractC22676k.m65750j(labradorDao, "labradorDao");
        AbstractC22676k.m65750j(mapper, "mapper");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(entitlementChecker, "entitlementChecker");
        this.apiClient = apiClient;
        this.cachedApiSource = cachedApiSource;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.logger = logger;
        this.onboardingStatusDao = onboardingStatusDao;
        this.labradorDao = labradorDao;
        this.mapper = mapper;
        this.featureFlagChecker = featureFlagChecker;
        this.entitlementChecker = entitlementChecker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: p */
    public final Object m96884p(C31459h c31459h, String str, InterfaceC30057d<? super C31459h> interfaceC30057d) {
        a aVar;
        C31459h c31459h2;
        String str2 = str;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f129530F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f129530F = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object obj = aVar2.f129534z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f129530F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            DismissUpsellCardRequest dismissUpsellCardRequest = new DismissUpsellCardRequest(new DismissUpsellCardRequestBody(str2));
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            String strM30461o = AbstractC11266d.m30461o("Failed to dismiss upsell card with id ", str2);
            b bVar = new b(dismissUpsellCardRequest, null);
            aVar2.f129531w = c31459h;
            aVar2.f129532x = str2;
            aVar2.f129533y = null;
            aVar2.f129530F = 1;
            Object objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, strM30461o, bVar, aVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
            c31459h2 = c31459h;
            obj = objM108729b;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) aVar2.f129532x;
            C31459h c31459h3 = (C31459h) aVar2.f129531w;
            AbstractC34132o.m107864I(obj);
            c31459h2 = c31459h3;
        }
        if (!(((InterfaceC34385a) obj) instanceof InterfaceC34385a.c)) {
            return C31459h.m96861b(c31459h2, null, null, false, false, null, null, 55, null);
        }
        HealthTabResponse healthTabResponse = c31459h2.getHealthTabResponse();
        return C31459h.m96861b(c31459h2, null, healthTabResponse != null ? C31460i.f129519a.m96870a(healthTabResponse, str2) : null, false, false, null, null, 53, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: q */
    public final Object m96885q(InterfaceC30057d<? super C30443a> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f129540y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f129540y = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objMo93126b = cVar.f129538w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f129540y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo93126b);
            InterfaceC30444b interfaceC30444b = this.labradorDao;
            cVar.f129540y = 1;
            objMo93126b = interfaceC30444b.mo93126b(cVar);
            if (objMo93126b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo93126b);
        }
        return (C30443a) objMo93126b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: r */
    public final Object m96886r(DataVisualizationCardBodyModel dataVisualizationCardBodyModel, InterfaceC30057d<? super C23465k> interfaceC30057d) {
        d dVar;
        String trailingEcgTimestamp;
        DateTime dateTime;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f129544z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f129544z = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object objM96885q = dVar.f129542x;
        Object obj = EnumC31071a.f128113w;
        int i14 = dVar.f129544z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM96885q);
            dVar.f129541w = dataVisualizationCardBodyModel;
            dVar.f129544z = 1;
            objM96885q = m96885q(dVar);
            if (objM96885q == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dataVisualizationCardBodyModel = (DataVisualizationCardBodyModel) dVar.f129541w;
            AbstractC34132o.m107864I(objM96885q);
        }
        C30443a c30443a = (C30443a) objM96885q;
        if (c30443a == null) {
            return new C23465k(Boolean.FALSE, dataVisualizationCardBodyModel);
        }
        CardSupplementalInfo cardSupplementalInfo = dataVisualizationCardBodyModel.getCardSupplementalInfo();
        return Instant.ofEpochMilli(c30443a.getTimestamp()).isAfter(Instant.ofEpochMilli((cardSupplementalInfo == null || (trailingEcgTimestamp = cardSupplementalInfo.getTrailingEcgTimestamp()) == null || (dateTime = DateTime.parse(trailingEcgTimestamp)) == null) ? Long.MIN_VALUE : dateTime.getMillis())) ? new C23465k(Boolean.TRUE, this.mapper.m96919k(c30443a, false, dataVisualizationCardBodyModel)) : new C23465k(Boolean.FALSE, dataVisualizationCardBodyModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: s */
    public final Object m96887s(HeartScreenerUpdatedAtInfoModel heartScreenerUpdatedAtInfoModel, List<? extends DesignSystemModel> list, InterfaceC30057d<? super List<? extends DesignSystemModel>> interfaceC30057d) {
        e eVar;
        String labradorHighWaterMark;
        DateTime dateTime;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f129545E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f129545E = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object objM96885q = eVar.f129548y;
        Object obj = EnumC31071a.f128113w;
        int i14 = eVar.f129545E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM96885q);
            eVar.f129546w = heartScreenerUpdatedAtInfoModel;
            eVar.f129547x = list;
            eVar.f129545E = 1;
            objM96885q = m96885q(eVar);
            if (objM96885q == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) eVar.f129547x;
            heartScreenerUpdatedAtInfoModel = (HeartScreenerUpdatedAtInfoModel) eVar.f129546w;
            AbstractC34132o.m107864I(objM96885q);
        }
        C30443a c30443a = (C30443a) objM96885q;
        if (c30443a != null) {
            List<? extends DesignSystemModel> listM96920l = Instant.ofEpochMilli(c30443a.getTimestamp()).isAfter(Instant.ofEpochMilli((heartScreenerUpdatedAtInfoModel == null || (labradorHighWaterMark = heartScreenerUpdatedAtInfoModel.getLabradorHighWaterMark()) == null || (dateTime = DateTime.parse(labradorHighWaterMark)) == null) ? Long.MIN_VALUE : dateTime.getMillis())) ? this.mapper.m96920l(c30443a, heartScreenerUpdatedAtInfoModel) : list;
            if (listM96920l != null) {
                return listM96920l;
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final Object m96888t(InterfaceC30057d<? super C31459h> interfaceC30057d) {
        return AbstractC3006f0.m8719m(new f(null), interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: u */
    public final Object m96889u(InterfaceC30057d<? super DataVisualizationCardModel> interfaceC30057d) {
        g gVar;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f129560y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f129560y = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        Object objMo93126b = gVar.f129558w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = gVar.f129560y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo93126b);
            InterfaceC30444b interfaceC30444b = this.labradorDao;
            gVar.f129560y = 1;
            objMo93126b = interfaceC30444b.mo93126b(gVar);
            if (objMo93126b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo93126b);
        }
        C30443a c30443a = (C30443a) objMo93126b;
        return c30443a != null ? new DataVisualizationCardModel(AbstractC31462k.m96894b(), this.mapper.m96918a(c30443a, null), new C9598e(AppScreen.C9410s2.f27914w, new HeartScreenerModel((String) null, 1, (DefaultConstructorMarker) null), null, 4, null), (HeartScreenerUpdatedAtInfoModel) null, 8, (DefaultConstructorMarker) null) : new DataVisualizationCardModel(AbstractC31462k.m96894b(), AbstractC31462k.m96895c(), new C9598e(AppScreen.C9410s2.f27914w, new HeartScreenerModel((String) null, 1, (DefaultConstructorMarker) null), null, 4, null), (HeartScreenerUpdatedAtInfoModel) null, 8, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public final InterfaceC13058l m96890v(boolean manualRefresh) {
        return new m(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new GetHealthTabRequest(), 1), AbstractC12350b.m34570S("HealthTabRefreshScope"), null, 2, null), new l(null, this.cachedApiSource)), manualRefresh, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:29:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:32:0x022e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0258  */
    /* JADX WARN: Code duplicated, block: B:36:0x025d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0266  */
    /* JADX WARN: Code duplicated, block: B:41:0x0278  */
    /* JADX WARN: Code duplicated, block: B:44:0x0288  */
    /* JADX WARN: Code duplicated, block: B:45:0x029d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0144 -> B:20:0x0166). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x02f4 -> B:25:0x01b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0341 -> B:61:0x0360). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x03c0 -> B:66:0x03d0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x04b6 -> B:89:0x04b3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: w */
    public final java.lang.Object m96891w(com.whoop.health.domain.models.HealthTabResponse r43, q83.InterfaceC30057d<? super ri1.C31459h> r44) {
        /*
            Method dump skipped, instruction units count: 1316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ri1.C31461j.m96891w(com.whoop.health.domain.models.HealthTabResponse, q83.d):java.lang.Object");
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C31459h(InterfaceC31458g.c.f129510a, null, false, false, null, null, 62, null), AbstractC13091v.m36590P(upstream, new h(null, this)), new j(null));
    }

    public /* synthetic */ C31461j(C34387c c34387c, InterfaceC26834e interfaceC26834e, InterfaceC41070a interfaceC41070a, InterfaceC34116n interfaceC34116n, OnboardingStatusDao onboardingStatusDao, InterfaceC30444b interfaceC30444b, C31468q c31468q, FeatureFlagChecker featureFlagChecker, InterfaceC37217a interfaceC37217a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c34387c, interfaceC26834e, interfaceC41070a, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("HealthTabInteractor") : interfaceC34116n, onboardingStatusDao, interfaceC30444b, c31468q, featureFlagChecker, interfaceC37217a);
    }
}
