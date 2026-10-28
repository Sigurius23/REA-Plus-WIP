package dd0;

import com.whoop.advancedlabs.domain.AdvancedLabsApi;
import com.whoop.advancedlabs.multiconsentscreen.domain.models.ConsentAction;
import com.whoop.advancedlabs.multiconsentscreen.domain.models.MultiConsentRequest;
import com.whoop.advancedlabs.multiconsentscreen.domain.models.MultiConsentResponse;
import com.whoop.navigation.C9598e;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
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

/* JADX INFO: renamed from: dd0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, m65681d2 = {"Ldd0/c;", "", "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Ltr2/n;)V", "Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentResponse;", "response", "Ldd0/b;", "d", "(Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentResponse;)Ldd0/b;", "Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/ConsentAction;", "consentAction", "", "testType", "e", "(Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/ConsentAction;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentRequest;", "request", "Lcom/whoop/navigation/e;", "finalNavigationAction", "g", "(Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentRequest;Lcom/whoop/navigation/e;Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "Ldd0/a;", "upstream", "f", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;", "b", "Ltr2/n;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11946c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AdvancedLabsApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: dd0.c$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.multiconsentscreen.domain.MultiConsentInteractor", m100430f = "MultiConsentInteractor.kt", m100431l = {52}, m100432m = "fetchData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f39066E;

        /* JADX INFO: renamed from: w */
        Object f39067w;

        /* JADX INFO: renamed from: x */
        Object f39068x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f39069y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f39069y = obj;
            this.f39066E |= Integer.MIN_VALUE;
            return C11946c.this.m32275e(null, null, this);
        }
    }

    /* JADX INFO: renamed from: dd0.c$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.multiconsentscreen.domain.MultiConsentInteractor$fetchData$response$1", m100430f = "MultiConsentInteractor.kt", m100431l = {53}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f39071w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ ConsentAction f39073y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f39074z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ConsentAction consentAction, String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f39073y = consentAction;
            this.f39074z = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C11946c.this.new b(this.f39073y, this.f39074z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f39071w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            AdvancedLabsApi advancedLabsApi = C11946c.this.api;
            ConsentAction consentAction = this.f39073y;
            String str = this.f39074z;
            this.f39071w = 1;
            Object multiConsent = advancedLabsApi.getMultiConsent(consentAction, str, this);
            return multiConsent == enumC31071a ? enumC31071a : multiConsent;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super MultiConsentResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: dd0.c$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f39075w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C11946c f39076x;

        /* JADX INFO: renamed from: dd0.c$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f39077w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C11946c f39078x;

            /* JADX INFO: renamed from: dd0.c$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.multiconsentscreen.domain.MultiConsentInteractor$interact$$inlined$map$1$2", m100430f = "MultiConsentInteractor.kt", m100431l = {53, 56, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41462a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f39079E;

                /* JADX INFO: renamed from: F */
                Object f39080F;

                /* JADX INFO: renamed from: G */
                Object f39081G;

                /* JADX INFO: renamed from: H */
                Object f39082H;

                /* JADX INFO: renamed from: I */
                Object f39083I;

                /* JADX INFO: renamed from: J */
                Object f39084J;

                /* JADX INFO: renamed from: K */
                int f39085K;

                /* JADX INFO: renamed from: L */
                int f39086L;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f39087w;

                /* JADX INFO: renamed from: x */
                int f39088x;

                /* JADX INFO: renamed from: y */
                Object f39089y;

                public C41462a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f39087w = obj;
                    this.f39088x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C11946c c11946c) {
                this.f39077w = interfaceC13062m;
                this.f39078x = c11946c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0089, code lost:
            
                if (r10 == r1) goto L41;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x008d, code lost:
            
                r9 = 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x00b8, code lost:
            
                if (r10 == r1) goto L41;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00ff, code lost:
            
                if (r2.emit(r10, r0) == r1) goto L41;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r9, q83.InterfaceC30057d r10) {
                /*
                    Method dump skipped, instruction units count: 267
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: dd0.C11946c.c.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public c(InterfaceC13058l interfaceC13058l, C11946c c11946c) {
            this.f39075w = interfaceC13058l;
            this.f39076x = c11946c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f39075w.collect(new a(interfaceC13062m, this.f39076x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: dd0.c$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.multiconsentscreen.domain.MultiConsentInteractor", m100430f = "MultiConsentInteractor.kt", m100431l = {62}, m100432m = "submitConsent", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f39091E;

        /* JADX INFO: renamed from: w */
        Object f39092w;

        /* JADX INFO: renamed from: x */
        Object f39093x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f39094y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f39094y = obj;
            this.f39091E |= Integer.MIN_VALUE;
            return C11946c.this.m32276g(null, null, this);
        }
    }

    /* JADX INFO: renamed from: dd0.c$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.multiconsentscreen.domain.MultiConsentInteractor$submitConsent$response$1", m100430f = "MultiConsentInteractor.kt", m100431l = {63}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f39096w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ MultiConsentRequest f39098y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(MultiConsentRequest multiConsentRequest, InterfaceC30057d<? super e> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f39098y = multiConsentRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C11946c.this.new e(this.f39098y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f39096w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AdvancedLabsApi advancedLabsApi = C11946c.this.api;
                MultiConsentRequest multiConsentRequest = this.f39098y;
                this.f39096w = 1;
                if (advancedLabsApi.submitMultiConsent(multiConsentRequest, this) == enumC31071a) {
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
            return ((e) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C11946c(AdvancedLabsApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: d */
    private final AbstractC11945b m32274d(MultiConsentResponse response) {
        if (response != null && !response.getConsentModels().isEmpty()) {
            return new AbstractC11945b.f(response);
        }
        return AbstractC11945b.d.f39061a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: e */
    public final Object m32275e(ConsentAction consentAction, String str, InterfaceC30057d<? super AbstractC11945b> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f39066E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f39066E = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f39069y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f39066E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(consentAction, str, null);
            aVar2.f39067w = null;
            aVar2.f39068x = null;
            aVar2.f39066E = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, bVar, aVar2, 6, null);
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
            return m32274d((MultiConsentResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return AbstractC11945b.d.f39061a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: g */
    public final Object m32276g(MultiConsentRequest multiConsentRequest, C9598e c9598e, InterfaceC30057d<? super AbstractC11945b> interfaceC30057d) {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f39091E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f39091E = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        d dVar2 = dVar;
        Object objM108729b = dVar2.f39094y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar2.f39091E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            e eVar = new e(multiConsentRequest, null);
            dVar2.f39092w = null;
            dVar2.f39093x = c9598e;
            dVar2.f39091E = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, eVar, dVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c9598e = (C9598e) dVar2.f39093x;
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new AbstractC11945b.b(c9598e);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return new AbstractC11945b.c(((InterfaceC34385a.b) interfaceC34385a).getErrorMessage());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC13058l m32277f(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new c(upstream, this);
    }

    public /* synthetic */ C11946c(AdvancedLabsApi advancedLabsApi, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(advancedLabsApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("MultiConsentInteractor") : interfaceC34116n);
    }
}
