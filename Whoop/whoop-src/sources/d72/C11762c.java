package d72;

import com.mapbox.common.HttpHeaders;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.network.request.DismissUpsellCardRequest;
import com.whoop.sage.domain.SageApi;
import com.whoop.sage.domain.models.SageResponse;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import f63.AbstractC14155c;
import ge3.AbstractC15751g;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import l83.C23454a0;
import o51.AbstractC27535a;
import od1.InterfaceC27844g;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.C34387c;
import u02.InterfaceC34385a;
import z02.C39945b;

/* JADX INFO: renamed from: d72.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0010\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u001c\u0010\u0015J#\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, m65681d2 = {"Ld72/c;", "Lod1/g;", "Ld72/a;", "Ld72/b;", "Lcom/whoop/sage/domain/SageApi;", "api", "Lu02/c;", "apiClient", "Ltr2/n;", "logger", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lcom/whoop/sage/domain/SageApi;Lu02/c;Ltr2/n;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lo51/a$a;", "action", "l", "(Ld72/c;Lo51/a$a;Lq83/d;)Ljava/lang/Object;", "", "id", "j", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/sage/domain/models/SageResponse;", "response", "Ld72/b$f;", "i", "(Lcom/whoop/sage/domain/models/SageResponse;)Ld72/b$f;", HttpHeaders.DATE, "k", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/sage/domain/SageApi;", "b", "Lu02/c;", "c", "Ltr2/n;", "d", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11762c implements InterfaceC27844g<AbstractC11760a, AbstractC11761b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final SageApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C34387c apiClient;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: d72.c$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sage.domain.SageInteractor", m100430f = "SageInteractor.kt", m100431l = {56}, m100432m = "dismissUpsellCard", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f38050E;

        /* JADX INFO: renamed from: w */
        Object f38051w;

        /* JADX INFO: renamed from: x */
        Object f38052x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f38053y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f38053y = obj;
            this.f38050E |= Integer.MIN_VALUE;
            return C11762c.this.m31497j(null, this);
        }
    }

    /* JADX INFO: renamed from: d72.c$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sage.domain.SageInteractor$dismissUpsellCard$result$1", m100430f = "SageInteractor.kt", m100431l = {57}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Lf63/c;", "<anonymous>", "()Lf63/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f38055w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ DismissUpsellCardRequest f38057y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(DismissUpsellCardRequest dismissUpsellCardRequest, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f38057y = dismissUpsellCardRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C11762c.this.new b(this.f38057y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f38055w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C34387c c34387c = C11762c.this.apiClient;
            DismissUpsellCardRequest dismissUpsellCardRequest = this.f38057y;
            InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(DismissUpsellCardRequest.class);
            C32236a c32236aM44445Y = AbstractC15751g.m44445Y(AbstractC22671h0.f89337a.getOrCreateKotlinClass(DismissUpsellCardRequest.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d));
            this.f38055w = 1;
            Object objM108748d = c34387c.m108748d(dismissUpsellCardRequest, c32236aM44445Y, this);
            return objM108748d == enumC31071a ? enumC31071a : objM108748d;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super AbstractC14155c> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: d72.c$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sage.domain.SageInteractor", m100430f = "SageInteractor.kt", m100431l = {71}, m100432m = "fetchData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f38058w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f38059x;

        /* JADX INFO: renamed from: z */
        int f38061z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f38059x = obj;
            this.f38061z |= Integer.MIN_VALUE;
            return C11762c.this.m31498k(null, this);
        }
    }

    /* JADX INFO: renamed from: d72.c$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sage.domain.SageInteractor$fetchData$response$1", m100430f = "SageInteractor.kt", m100431l = {72}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/sage/domain/models/SageResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f38062w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f38064y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f38064y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C11762c.this.new d(this.f38064y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f38062w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            SageApi sageApi = C11762c.this.api;
            String str = this.f38064y;
            this.f38062w = 1;
            Object sage = sageApi.getSage(str, this);
            return sage == enumC31071a ? enumC31071a : sage;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super SageResponse> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: d72.c$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sage.domain.SageInteractor", m100430f = "SageInteractor.kt", m100431l = {43}, m100432m = "fetchNewDate", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f38065E;

        /* JADX INFO: renamed from: w */
        Object f38066w;

        /* JADX INFO: renamed from: x */
        Object f38067x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f38068y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f38068y = obj;
            this.f38065E |= Integer.MIN_VALUE;
            return C11762c.this.m31499l(null, null, this);
        }
    }

    /* JADX INFO: renamed from: d72.c$f */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f38070w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C11762c f38071x;

        /* JADX INFO: renamed from: d72.c$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f38072w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C11762c f38073x;

            /* JADX INFO: renamed from: d72.c$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.sage.domain.SageInteractor$interact$$inlined$map$1$2", m100430f = "SageInteractor.kt", m100431l = {54, 60, 64, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41456a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f38074E;

                /* JADX INFO: renamed from: F */
                Object f38075F;

                /* JADX INFO: renamed from: G */
                Object f38076G;

                /* JADX INFO: renamed from: H */
                Object f38077H;

                /* JADX INFO: renamed from: I */
                Object f38078I;

                /* JADX INFO: renamed from: J */
                Object f38079J;

                /* JADX INFO: renamed from: K */
                int f38080K;

                /* JADX INFO: renamed from: L */
                int f38081L;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f38082w;

                /* JADX INFO: renamed from: x */
                int f38083x;

                /* JADX INFO: renamed from: y */
                Object f38084y;

                public C41456a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f38082w = obj;
                    this.f38083x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C11762c c11762c) {
                this.f38072w = interfaceC13062m;
                this.f38073x = c11762c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x0096, code lost:
            
                if (r11 == r1) goto L47;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x009a, code lost:
            
                r10 = 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x00cf, code lost:
            
                if (r11 == r1) goto L47;
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x0100, code lost:
            
                if (r11 == r1) goto L47;
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x0119, code lost:
            
                if (r2.emit(r11, r0) == r1) goto L47;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r10, q83.InterfaceC30057d r11) {
                /*
                    Method dump skipped, instruction units count: 293
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: d72.C11762c.f.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public f(InterfaceC13058l interfaceC13058l, C11762c c11762c) {
            this.f38070w = interfaceC13058l;
            this.f38071x = c11762c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f38070w.collect(new a(interfaceC13062m, this.f38071x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C11762c(SageApi api, C34387c apiClient, InterfaceC34116n logger, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(apiClient, "apiClient");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.api = api;
        this.apiClient = apiClient;
        this.logger = logger;
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: renamed from: i */
    private final AbstractC11761b.f m31496i(SageResponse response) {
        return new AbstractC11761b.f(response);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: j */
    public final Object m31497j(String str, InterfaceC30057d<? super AbstractC11761b> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f38050E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f38050E = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f38053y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f38050E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            DismissUpsellCardRequest dismissUpsellCardRequest = new DismissUpsellCardRequest(new C39945b(str));
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            String strM30461o = AbstractC11266d.m30461o("Failed to dismiss upsell card with id ", str);
            b bVar = new b(dismissUpsellCardRequest, null);
            aVar2.f38051w = str;
            aVar2.f38052x = null;
            aVar2.f38050E = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, strM30461o, bVar, aVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) aVar2.f38051w;
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new AbstractC11761b.b(str);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return AbstractC11761b.e.f38044a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: k */
    public final Object m31498k(String str, InterfaceC30057d<? super AbstractC11761b> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f38061z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f38061z = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        c cVar2 = cVar;
        Object objM108729b = cVar2.f38059x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar2.f38061z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            d dVar = new d(str, null);
            cVar2.f38058w = null;
            cVar2.f38061z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, dVar, cVar2, 6, null);
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
            return m31496i((SageResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return AbstractC11761b.c.f38042a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public final Object m31499l(C11762c c11762c, AbstractC27535a.a aVar, InterfaceC30057d<? super AbstractC11761b> interfaceC30057d) {
        e eVar;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f38065E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f38065E = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object objM31498k = eVar.f38068y;
        Object obj = EnumC31071a.f128113w;
        int i14 = eVar.f38065E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM31498k);
            if (!c11762c.featureFlagChecker.isFeatureEnabled("sage-feature")) {
                return AbstractC11761b.c.f38042a;
            }
            String newDate = aVar.getNewDate();
            eVar.f38066w = null;
            eVar.f38067x = null;
            eVar.f38065E = 1;
            objM31498k = c11762c.m31498k(newDate, eVar);
            if (objM31498k == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM31498k);
        }
        AbstractC11761b abstractC11761b = (AbstractC11761b) objM31498k;
        return abstractC11761b instanceof AbstractC11761b.f ? new AbstractC11761b.a(((AbstractC11761b.f) abstractC11761b).getResponse()) : AbstractC11761b.c.f38042a;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new f(upstream, this);
    }

    public /* synthetic */ C11762c(SageApi sageApi, C34387c c34387c, InterfaceC34116n interfaceC34116n, FeatureFlagChecker featureFlagChecker, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(sageApi, c34387c, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("SageInteractor") : interfaceC34116n, featureFlagChecker);
    }
}
