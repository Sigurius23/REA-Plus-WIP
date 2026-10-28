package f70;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.activation.domain.ActivationApi;
import com.whoop.activation.domain.models.ActivationFlowDeviceEducationResponse;
import com.whoop.data.remote.api.FileDownloaderApi;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import e80.InterfaceC12814a;
import io.getstream.chat.android.client.api.QueryParams;
import iy1.InterfaceC21030c;
import java.time.Clock;
import l83.C23454a0;
import or2.AbstractC28190p0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import ud3.AbstractC34799a1;

/* JADX INFO: renamed from: f70.w */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u00122\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0082@¢\u0006\u0004\b\u0015\u0010\u0014J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001c\u0010\u001f\u001a\u00020\u00122\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0080@¢\u0006\u0004\b\u001f\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, m65681d2 = {"Lf70/w;", "", "Lcom/whoop/activation/domain/ActivationApi;", "activationApi", "Lcom/whoop/data/remote/api/FileDownloaderApi;", "fileDownloaderApi", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ljava/time/Clock;", "clock", "Liy1/c;", "metricWriter", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/activation/domain/ActivationApi;Lcom/whoop/data/remote/api/FileDownloaderApi;Lcom/whoop/data/repositories/FeatureFlagChecker;Ljava/time/Clock;Liy1/c;Ltr2/n;)V", "", "specifiedIndex", "Lf70/e;", "k", "(Ljava/lang/Integer;Lq83/d;)Ljava/lang/Object;", "j", "Le80/a;", "metric", "Ll83/a0;", "m", "(Le80/a;Lq83/d;)Ljava/lang/Object;", "", QueryParams.URL, "l", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "i", "a", "Lcom/whoop/activation/domain/ActivationApi;", "b", "Lcom/whoop/data/remote/api/FileDownloaderApi;", "c", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "d", "Ljava/time/Clock;", "e", "Liy1/c;", "f", "Ltr2/n;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14212w {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ActivationApi activationApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FileDownloaderApi fileDownloaderApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f70.w$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.DeviceEducationFetcher", m100430f = "DeviceEducationFetcher.kt", m100431l = {101, 114, 121}, m100432m = "fetchDeviceEducationV1", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f51726E;

        /* JADX INFO: renamed from: F */
        Object f51727F;

        /* JADX INFO: renamed from: G */
        Object f51728G;

        /* JADX INFO: renamed from: H */
        Object f51729H;

        /* JADX INFO: renamed from: I */
        Object f51730I;

        /* JADX INFO: renamed from: J */
        Object f51731J;

        /* JADX INFO: renamed from: K */
        Object f51732K;

        /* JADX INFO: renamed from: L */
        Object f51733L;

        /* JADX INFO: renamed from: M */
        long f51734M;

        /* JADX INFO: renamed from: N */
        long f51735N;

        /* JADX INFO: renamed from: O */
        int f51736O;

        /* JADX INFO: renamed from: P */
        int f51737P;

        /* JADX INFO: renamed from: Q */
        int f51738Q;

        /* JADX INFO: renamed from: R */
        int f51739R;

        /* JADX INFO: renamed from: S */
        /* synthetic */ Object f51740S;

        /* JADX INFO: renamed from: U */
        int f51742U;

        /* JADX INFO: renamed from: w */
        Object f51743w;

        /* JADX INFO: renamed from: x */
        Object f51744x;

        /* JADX INFO: renamed from: y */
        Object f51745y;

        /* JADX INFO: renamed from: z */
        Object f51746z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51740S = obj;
            this.f51742U |= Integer.MIN_VALUE;
            return C14212w.this.m40623j(null, this);
        }
    }

    /* JADX INFO: renamed from: f70.w$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.DeviceEducationFetcher$fetchDeviceEducationV1$response$1", m100430f = "DeviceEducationFetcher.kt", m100431l = {102}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/activation/domain/models/ActivationFlowDeviceEducationResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f51747w;

        /* JADX INFO: renamed from: f70.w$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.DeviceEducationFetcher$fetchDeviceEducationV1$response$1$1", m100430f = "DeviceEducationFetcher.kt", m100431l = {103}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/activation/domain/models/ActivationFlowDeviceEducationResponse;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/activation/domain/models/ActivationFlowDeviceEducationResponse;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f51749w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C14212w f51750x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C14212w c14212w, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f51750x = c14212w;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f51750x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super ActivationFlowDeviceEducationResponse> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f51749w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                ActivationApi activationApi = this.f51750x.activationApi;
                this.f51749w = 1;
                Object deviceEducation = activationApi.getDeviceEducation(this);
                return deviceEducation == enumC31071a ? enumC31071a : deviceEducation;
            }
        }

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14212w.this.new b(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f51747w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            a aVar = new a(C14212w.this, null);
            this.f51747w = 1;
            Object objM85321a = AbstractC28190p0.m85321a(1000L, aVar, this);
            return objM85321a == enumC31071a ? enumC31071a : objM85321a;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ActivationFlowDeviceEducationResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: f70.w$c */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.DeviceEducationFetcher", m100430f = "DeviceEducationFetcher.kt", m100431l = {44}, m100432m = "fetchDeviceEducationV2", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f51751E;

        /* JADX INFO: renamed from: w */
        Object f51752w;

        /* JADX INFO: renamed from: x */
        long f51753x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f51754y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51754y = obj;
            this.f51751E |= Integer.MIN_VALUE;
            return C14212w.this.m40624k(null, this);
        }
    }

    /* JADX INFO: renamed from: f70.w$d */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.DeviceEducationFetcher$fetchDeviceEducationV2$result$1", m100430f = "DeviceEducationFetcher.kt", m100431l = {45, 56, 63}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lf70/e$b;", "<anonymous>", "(Lbc3/c0;)Lf70/e$b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        Object f51756E;

        /* JADX INFO: renamed from: F */
        Object f51757F;

        /* JADX INFO: renamed from: G */
        Object f51758G;

        /* JADX INFO: renamed from: H */
        Object f51759H;

        /* JADX INFO: renamed from: I */
        Object f51760I;

        /* JADX INFO: renamed from: J */
        Object f51761J;

        /* JADX INFO: renamed from: K */
        Object f51762K;

        /* JADX INFO: renamed from: L */
        Object f51763L;

        /* JADX INFO: renamed from: M */
        int f51764M;

        /* JADX INFO: renamed from: N */
        int f51765N;

        /* JADX INFO: renamed from: O */
        int f51766O;

        /* JADX INFO: renamed from: P */
        int f51767P;

        /* JADX INFO: renamed from: Q */
        long f51768Q;

        /* JADX INFO: renamed from: R */
        int f51769R;

        /* JADX INFO: renamed from: T */
        final /* synthetic */ long f51771T;

        /* JADX INFO: renamed from: U */
        final /* synthetic */ Integer f51772U;

        /* JADX INFO: renamed from: w */
        Object f51773w;

        /* JADX INFO: renamed from: x */
        Object f51774x;

        /* JADX INFO: renamed from: y */
        Object f51775y;

        /* JADX INFO: renamed from: z */
        Object f51776z;

        /* JADX INFO: renamed from: f70.w$d$a */
        @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.DeviceEducationFetcher$fetchDeviceEducationV2$result$1$response$1", m100430f = "DeviceEducationFetcher.kt", m100431l = {46}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/activation/domain/models/ActivationFlowDeviceEducationResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f51777w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C14212w f51778x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C14212w c14212w, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f51778x = c14212w;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f51778x, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f51777w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                ActivationApi activationApi = this.f51778x.activationApi;
                this.f51777w = 1;
                Object deviceEducation = activationApi.getDeviceEducation(this);
                return deviceEducation == enumC31071a ? enumC31071a : deviceEducation;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super ActivationFlowDeviceEducationResponse> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j7, Integer num, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f51771T = j7;
            this.f51772U = num;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C14212w.this.new d(this.f51771T, this.f51772U, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC14176e.b> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x00df  */
        /* JADX WARN: Code duplicated, block: B:29:0x00eb  */
        /* JADX WARN: Code duplicated, block: B:32:0x0115  */
        /* JADX WARN: Code duplicated, block: B:36:0x0163  */
        /* JADX WARN: Code duplicated, block: B:39:0x01ae  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0115 -> B:33:0x011f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x014f -> B:35:0x0157). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r34) {
            /*
                Method dump skipped, instruction units count: 568
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: f70.C14212w.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: f70.w$e */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.DeviceEducationFetcher", m100430f = "DeviceEducationFetcher.kt", m100431l = {152}, m100432m = "getRawJsonString", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f51779w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f51780x;

        /* JADX INFO: renamed from: z */
        int f51782z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51780x = obj;
            this.f51782z |= Integer.MIN_VALUE;
            return C14212w.this.m40625l(null, this);
        }
    }

    /* JADX INFO: renamed from: f70.w$f */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.DeviceEducationFetcher$getRawJsonString$response$1", m100430f = "DeviceEducationFetcher.kt", m100431l = {153}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Lud3/a1;", "<anonymous>", "()Lud3/a1;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f51783w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f51785y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, InterfaceC30057d<? super f> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f51785y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14212w.this.new f(this.f51785y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f51783w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            FileDownloaderApi fileDownloaderApi = C14212w.this.fileDownloaderApi;
            String str = this.f51785y;
            this.f51783w = 1;
            Object objDownloadFile = fileDownloaderApi.downloadFile(str, this);
            return objDownloadFile == enumC31071a ? enumC31071a : objDownloadFile;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super AbstractC34799a1> interfaceC30057d) {
            return ((f) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C14212w(ActivationApi activationApi, FileDownloaderApi fileDownloaderApi, FeatureFlagChecker featureFlagChecker, Clock clock, InterfaceC21030c metricWriter, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(activationApi, "activationApi");
        AbstractC22676k.m65750j(fileDownloaderApi, "fileDownloaderApi");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(logger, "logger");
        this.activationApi = activationApi;
        this.fileDownloaderApi = fileDownloaderApi;
        this.featureFlagChecker = featureFlagChecker;
        this.clock = clock;
        this.metricWriter = metricWriter;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x010d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0119  */
    /* JADX WARN: Code duplicated, block: B:38:0x0147  */
    /* JADX WARN: Code duplicated, block: B:42:0x0199  */
    /* JADX WARN: Code duplicated, block: B:45:0x01da  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0147 -> B:39:0x0154). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0180 -> B:41:0x018b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: j */
    public final java.lang.Object m40623j(java.lang.Integer r41, q83.InterfaceC30057d<? super f70.InterfaceC14176e> r42) {
        /*
            Method dump skipped, instruction units count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f70.C14212w.m40623j(java.lang.Integer, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m40624k(Integer num, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f51751E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f51751E = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objM85321a = cVar.f51754y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f51751E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM85321a);
            long jMillis = this.clock.millis();
            d dVar = new d(jMillis, num, null);
            cVar.f51752w = null;
            cVar.f51753x = jMillis;
            cVar.f51751E = 1;
            objM85321a = AbstractC28190p0.m85321a(1000L, dVar, cVar);
            if (objM85321a == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM85321a);
        }
        return (InterfaceC14176e.b) objM85321a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: l */
    public final Object m40625l(String str, InterfaceC30057d<? super String> interfaceC30057d) {
        e eVar;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f51782z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f51782z = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        e eVar2 = eVar;
        Object objM108729b = eVar2.f51780x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar2.f51782z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            f fVar = new f(str, null);
            eVar2.f51779w = null;
            eVar2.f51782z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, fVar, eVar2, 6, null);
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
            try {
                return ((AbstractC34799a1) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).m109860m();
            } catch (Exception unused) {
                return null;
            }
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final Object m40626m(InterfaceC12814a interfaceC12814a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo58700a = this.metricWriter.mo58700a(interfaceC12814a.mo35878b(), interfaceC30057d);
        return objMo58700a == EnumC31071a.f128113w ? objMo58700a : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    public final Object m40627i(Integer num, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        return this.featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.FASTER_DEVICE_EDUCATION) ? m40624k(num, interfaceC30057d) : m40623j(num, interfaceC30057d);
    }

    public /* synthetic */ C14212w(ActivationApi activationApi, FileDownloaderApi fileDownloaderApi, FeatureFlagChecker featureFlagChecker, Clock clock, InterfaceC21030c interfaceC21030c, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(activationApi, fileDownloaderApi, featureFlagChecker, clock, interfaceC21030c, (i13 & 32) != 0 ? InterfaceC34116n.INSTANCE.m107848a("DeviceEducationFetcher") : interfaceC34116n);
    }
}
