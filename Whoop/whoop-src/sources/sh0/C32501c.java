package sh0;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.aiinsights.domain.AiInsightsApi;
import com.whoop.aiinsights.domain.models.AiInsightsResponse;
import com.whoop.data.repositories.FeatureFlagChecker;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import ph0.C29234b;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import wm0.C37378a;

/* JADX INFO: renamed from: sh0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, m65681d2 = {"Lsh0/c;", "Lod1/g;", "Lsh0/a;", "Lsh0/b;", "Lcom/whoop/aiinsights/domain/AiInsightsApi;", "api", "Ltr2/n;", "logger", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lwm0/a;", "scopeCoordinator", "Lph0/b;", "screenArgs", "<init>", "(Lcom/whoop/aiinsights/domain/AiInsightsApi;Ltr2/n;Lcom/whoop/data/repositories/FeatureFlagChecker;Lwm0/a;Lph0/b;)V", "Lec3/l;", "i", "()Lec3/l;", "Lsh0/a$b;", "action", "j", "(Lsh0/a$b;)Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/aiinsights/domain/AiInsightsApi;", "b", "Ltr2/n;", "c", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "d", "Lwm0/a;", "e", "Lph0/b;", "ai-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32501c implements InterfaceC27844g<InterfaceC32499a, AbstractC32500b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AiInsightsApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C37378a scopeCoordinator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C29234b screenArgs;

    /* JADX INFO: renamed from: sh0.c$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.aiinsights.domain.AiInsightsInteractor$deleteRecommendation$1", m100430f = "AiInsightsInteractor.kt", m100431l = {39, 40, 48, 49, 45}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lsh0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f134566w;

        /* JADX INFO: renamed from: x */
        Object f134567x;

        /* JADX INFO: renamed from: y */
        int f134568y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f134569z;

        /* JADX INFO: renamed from: sh0.c$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.aiinsights.domain.AiInsightsInteractor$deleteRecommendation$1$1", m100430f = "AiInsightsInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lsh0/b$b;", "<anonymous>", "(Lbc3/c0;)Lsh0/b$b;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C42321a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f134570w;

            public C42321a(InterfaceC30057d<? super C42321a> interfaceC30057d) {
                super(2, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new C42321a(interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC32500b.b> interfaceC30057d) {
                return ((C42321a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f134570w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return AbstractC32500b.b.f134555a;
            }
        }

        /* JADX INFO: renamed from: sh0.c$a$b */
        @InterfaceC32271e(m100429c = "com.whoop.aiinsights.domain.AiInsightsInteractor$deleteRecommendation$1$response$1", m100430f = "AiInsightsInteractor.kt", m100431l = {41}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f134571w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C32501c f134572x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C32501c c32501c, InterfaceC30057d<? super b> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f134572x = c32501c;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f134572x, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f134571w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                AiInsightsApi aiInsightsApi = this.f134572x.api;
                String sourceId = this.f134572x.screenArgs.getSourceId();
                this.f134571w = 1;
                Object objDeleteActivityRecommendation = aiInsightsApi.deleteActivityRecommendation(sourceId, this);
                return objDeleteActivityRecommendation == enumC31071a ? enumC31071a : objDeleteActivityRecommendation;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
                return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C32501c.this.new a(interfaceC30057d);
            aVar.f134569z = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0088  */
        /* JADX WARN: Code duplicated, block: B:27:0x009f A[PHI: r8
          0x009f: PHI (r8v2 ec3.m) = (r8v1 ec3.m), (r8v6 ec3.m) binds: [B:25:0x009c, B:13:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:31:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:33:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:39:0x00f4  */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00b2, code lost:
        
            if (r0 == r9) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00ee, code lost:
        
            if (r8.emit(r0, r14) == r9) goto L36;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 250
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: sh0.C32501c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: sh0.c$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.aiinsights.domain.AiInsightsInteractor$interact$$inlined$flatMapLatest$1", m100430f = "AiInsightsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f134573w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f134574x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f134575y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C32501c f134576z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC30057d interfaceC30057d, C32501c c32501c) {
            super(3, interfaceC30057d);
            this.f134576z = c32501c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC32499a interfaceC32499a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d, this.f134576z);
            bVar.f134574x = interfaceC13062m;
            bVar.f134575y = interfaceC32499a;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l interfaceC13058lM101482i;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f134573w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f134574x;
                InterfaceC32499a interfaceC32499a = (InterfaceC32499a) this.f134575y;
                if (interfaceC32499a instanceof InterfaceC32499a.b) {
                    interfaceC13058lM101482i = this.f134576z.m101483j((InterfaceC32499a.b) interfaceC32499a);
                } else {
                    if (!(interfaceC32499a instanceof InterfaceC32499a.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC13058lM101482i = this.f134576z.m101482i();
                }
                this.f134574x = null;
                this.f134575y = null;
                this.f134573w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM101482i, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (InterfaceC32499a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: sh0.c$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.aiinsights.domain.AiInsightsInteractor$loadData$1", m100430f = "AiInsightsInteractor.kt", m100431l = {62, 63, 72, 69}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lsh0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC32499a.b f134578F;

        /* JADX INFO: renamed from: w */
        Object f134579w;

        /* JADX INFO: renamed from: x */
        Object f134580x;

        /* JADX INFO: renamed from: y */
        int f134581y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f134582z;

        /* JADX INFO: renamed from: sh0.c$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.aiinsights.domain.AiInsightsInteractor$loadData$1$1", m100430f = "AiInsightsInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lsh0/b$f;", "<anonymous>", "(Lbc3/c0;)Lsh0/b$f;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f134583w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC34385a<AiInsightsResponse> f134584x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC34385a<AiInsightsResponse> interfaceC34385a, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f134584x = interfaceC34385a;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f134584x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC32500b.f> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f134583w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return new AbstractC32500b.f((AiInsightsResponse) ((InterfaceC34385a.c) this.f134584x).m108735a());
            }
        }

        /* JADX INFO: renamed from: sh0.c$c$b */
        @InterfaceC32271e(m100429c = "com.whoop.aiinsights.domain.AiInsightsInteractor$loadData$1$response$1", m100430f = "AiInsightsInteractor.kt", m100431l = {64}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f134585w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C32501c f134586x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC32499a.b f134587y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C32501c c32501c, InterfaceC32499a.b bVar, InterfaceC30057d<? super b> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f134586x = c32501c;
                this.f134587y = bVar;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f134586x, this.f134587y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f134585w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                AiInsightsApi aiInsightsApi = this.f134586x.api;
                String sourceContextType = this.f134587y.getSourceContextType();
                String sourceId = this.f134587y.getSourceId();
                this.f134585w = 1;
                Object aiInsights = aiInsightsApi.getAiInsights(sourceContextType, sourceId, this);
                return aiInsights == enumC31071a ? enumC31071a : aiInsights;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super AiInsightsResponse> interfaceC30057d) {
                return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC32499a.b bVar, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f134578F = bVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C32501c.this.new c(this.f134578F, interfaceC30057d);
            cVar.f134582z = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0079  */
        /* JADX WARN: Code duplicated, block: B:26:0x0092  */
        /* JADX WARN: Code duplicated, block: B:28:0x0096  */
        /* JADX WARN: Code duplicated, block: B:34:0x00ce  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x008c, code lost:
        
            if (r0 == r9) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00c8, code lost:
        
            if (r8.emit(r0, r13) == r9) goto L31;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 212
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: sh0.C32501c.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C32501c(AiInsightsApi api, InterfaceC34116n logger, FeatureFlagChecker featureFlagChecker, C37378a scopeCoordinator, C29234b screenArgs) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(scopeCoordinator, "scopeCoordinator");
        AbstractC22676k.m65750j(screenArgs, "screenArgs");
        this.api = api;
        this.logger = logger;
        this.featureFlagChecker = featureFlagChecker;
        this.scopeCoordinator = scopeCoordinator;
        this.screenArgs = screenArgs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final InterfaceC13058l m101482i() {
        return new C13084s1(new a(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final InterfaceC13058l m101483j(InterfaceC32499a.b action) {
        return new C13084s1(new c(action, null));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new b(null, this));
    }
}
