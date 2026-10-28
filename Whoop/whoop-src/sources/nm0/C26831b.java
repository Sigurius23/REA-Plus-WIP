package nm0;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import ec3.C13015a0;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Set;
import l83.C23454a0;
import m83.AbstractC25260n;
import ne3.C26624l;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sr2.AbstractC32943y;
import u02.AbstractC34391g;
import u02.C34387c;
import u02.C34392h;
import u82.InterfaceC34640a;
import vm0.InterfaceC36149g;
import xm0.C38458b;
import xm0.InterfaceC38457a;

/* JADX INFO: renamed from: nm0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u0000  2\u00020\u0001:\u0001'BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011BG\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0014JQ\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001f0\u0017\"\u0004\b\u0000\u0010\u0015\"\u0004\b\u0001\u0010\u00162\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00172\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0002¢\u0006\u0004\b \u0010!JY\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001f0\u0017\"\u0004\b\u0000\u0010\u0015\"\u0004\b\u0001\u0010\u00162\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"0\u00172\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0000¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, m65681d2 = {"Lnm0/b;", "", "Lxm0/b;", "cacheUpdater", "Lnm0/a;", "apiClientRequester", "Lsr2/y;", "urlProvider", "Lvm0/g;", "cacheReporter", "Lq83/j;", "ioDispatcher", "Lu82/a;", "bffCacheDeserializer", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lxm0/b;Lnm0/a;Lsr2/y;Lvm0/g;Lq83/j;Lu82/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lu02/c;", "apiClient", "(Lxm0/b;Lu02/c;Lsr2/y;Lvm0/g;Lq83/j;Lu82/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "RequestBodyT", "ResponseT", "Lec3/l;", "Lu02/g;", "Lne3/l;", "apiResponseBytesFlow", "Ls63/a;", "responseTypeInfo", "Lnm0/c;", "request", "Lxm0/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lec3/l;Ls63/a;Lnm0/c;)Lec3/l;", "Lz02/a;", "requestFlow", "requestBodyTypeInfo", "i", "(Lec3/l;Ls63/a;Ls63/a;Lnm0/c;)Lec3/l;", "a", "Lxm0/b;", "b", "Lnm0/a;", "c", "Lsr2/y;", "d", "Lvm0/g;", "e", "Lq83/j;", "f", "Lu82/a;", "g", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26831b {

    /* JADX INFO: renamed from: i */
    private static final Set<Integer> f107001i = AbstractC25260n.m74059b1(new Integer[]{400, 401, 403, 404, 410});

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C38458b cacheUpdater;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C26830a apiClientRequester;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC32943y urlProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC36149g cacheReporter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC30063j ioDispatcher;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34640a bffCacheDeserializer;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: nm0.b$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f107009w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C26831b f107010x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C26832c f107011y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C32236a f107012z;

        /* JADX INFO: renamed from: nm0.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f107013w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C26831b f107014x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C26832c f107015y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C32236a f107016z;

            /* JADX INFO: renamed from: nm0.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.cache.api.ApiStream$mapRawApiBytesToTypedApiStreamResult$$inlined$map$1$2", m100430f = "ApiStream.kt", m100431l = {57, 69, 77, 87, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42065a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f107017E;

                /* JADX INFO: renamed from: F */
                Object f107018F;

                /* JADX INFO: renamed from: G */
                Object f107019G;

                /* JADX INFO: renamed from: H */
                Object f107020H;

                /* JADX INFO: renamed from: I */
                Object f107021I;

                /* JADX INFO: renamed from: J */
                Object f107022J;

                /* JADX INFO: renamed from: K */
                Object f107023K;

                /* JADX INFO: renamed from: L */
                Object f107024L;

                /* JADX INFO: renamed from: M */
                int f107025M;

                /* JADX INFO: renamed from: N */
                int f107026N;

                /* JADX INFO: renamed from: O */
                int f107027O;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f107028w;

                /* JADX INFO: renamed from: x */
                int f107029x;

                /* JADX INFO: renamed from: y */
                Object f107030y;

                public C42065a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f107028w = obj;
                    this.f107029x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C26831b c26831b, C26832c c26832c, C32236a c32236a) {
                this.f107013w = interfaceC13062m;
                this.f107014x = c26831b;
                this.f107015y = c26832c;
                this.f107016z = c32236a;
            }

            /* JADX WARN: Code duplicated, block: B:62:0x01cf A[Catch: Exception -> 0x01ca, TRY_LEAVE, TryCatch #1 {Exception -> 0x01ca, blocks: (B:54:0x01ac, B:56:0x01bb, B:62:0x01cf), top: B:89:0x01ac }] */
            /* JADX WARN: Code duplicated, block: B:65:0x01fc  */
            /* JADX WARN: Code duplicated, block: B:70:0x022d  */
            /* JADX WARN: Code duplicated, block: B:74:0x0259  */
            /* JADX WARN: Code duplicated, block: B:78:0x0263  */
            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Code duplicated, block: B:89:0x01ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code restructure failed: missing block: B:81:0x0285, code lost:
            
                if (r0.emit(r7, r2) == r3) goto L82;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r17, q83.InterfaceC30057d r18) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 657
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: nm0.C26831b.b.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public b(InterfaceC13058l interfaceC13058l, C26831b c26831b, C26832c c26832c, C32236a c32236a) {
            this.f107009w = interfaceC13058l;
            this.f107010x = c26831b;
            this.f107011y = c26832c;
            this.f107012z = c32236a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f107009w.collect(new a(interfaceC13062m, this.f107010x, this.f107011y, this.f107012z), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: nm0.b$c */
    @InterfaceC32271e(m100429c = "com.whoop.cache.api.ApiStream$mapRawApiBytesToTypedApiStreamResult$1$data$1", m100430f = "ApiStream.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, m65681d2 = {"ResponseT", "Lbc3/c0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f107032w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC34391g<C26624l> f107034y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C32236a f107035z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC34391g<C26624l> abstractC34391g, C32236a c32236a, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f107034y = abstractC34391g;
            this.f107035z = c32236a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C26831b.this.new c(this.f107034y, this.f107035z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super ResponseT> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f107032w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return C26831b.this.bffCacheDeserializer.mo109477a(((C26624l) ((C34392h) this.f107034y).m108758a()).m79265s(), this.f107035z.f133489b);
        }
    }

    /* JADX INFO: renamed from: nm0.b$d */
    @InterfaceC32271e(m100429c = "com.whoop.cache.api.ApiStream$mapRawApiBytesToTypedApiStreamResult$2", m100430f = "ApiStream.kt", m100431l = {102}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"ResponseT", "Lec3/m;", "Lxm0/a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f107036w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f107037x;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(interfaceC30057d);
            dVar.f107037x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f107037x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f107036w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC38457a.b bVar = new InterfaceC38457a.b(0, 1, null);
                this.f107037x = null;
                this.f107036w = 1;
                if (interfaceC13062m.emit(bVar, this) == enumC31071a) {
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

    public C26831b(C38458b cacheUpdater, C26830a apiClientRequester, AbstractC32943y urlProvider, InterfaceC36149g cacheReporter, InterfaceC30063j ioDispatcher, InterfaceC34640a bffCacheDeserializer, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(cacheUpdater, "cacheUpdater");
        AbstractC22676k.m65750j(apiClientRequester, "apiClientRequester");
        AbstractC22676k.m65750j(urlProvider, "urlProvider");
        AbstractC22676k.m65750j(cacheReporter, "cacheReporter");
        AbstractC22676k.m65750j(ioDispatcher, "ioDispatcher");
        AbstractC22676k.m65750j(bffCacheDeserializer, "bffCacheDeserializer");
        this.cacheUpdater = cacheUpdater;
        this.apiClientRequester = apiClientRequester;
        this.urlProvider = urlProvider;
        this.cacheReporter = cacheReporter;
        this.ioDispatcher = ioDispatcher;
        this.bffCacheDeserializer = bffCacheDeserializer;
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: renamed from: h */
    private final <RequestBodyT, ResponseT> InterfaceC13058l m80072h(InterfaceC13058l apiResponseBytesFlow, C32236a responseTypeInfo, C26832c<RequestBodyT> request) {
        return new C13015a0(new d(null), new b(apiResponseBytesFlow, this, request, responseTypeInfo));
    }

    /* JADX INFO: renamed from: i */
    public final <RequestBodyT, ResponseT> InterfaceC13058l m80073i(InterfaceC13058l requestFlow, C32236a requestBodyTypeInfo, C32236a responseTypeInfo, C26832c<RequestBodyT> request) {
        AbstractC22676k.m65750j(requestFlow, "requestFlow");
        AbstractC22676k.m65750j(requestBodyTypeInfo, "requestBodyTypeInfo");
        AbstractC22676k.m65750j(responseTypeInfo, "responseTypeInfo");
        AbstractC22676k.m65750j(request, "request");
        return m80072h(this.apiClientRequester.m80064a(requestFlow, requestBodyTypeInfo), responseTypeInfo, request);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26831b(C38458b cacheUpdater, C34387c apiClient, AbstractC32943y urlProvider, InterfaceC36149g cacheReporter, InterfaceC30063j ioDispatcher, InterfaceC34640a bffCacheDeserializer, FeatureFlagChecker featureFlagChecker) {
        this(cacheUpdater, new C26830a(apiClient), urlProvider, cacheReporter, ioDispatcher, bffCacheDeserializer, featureFlagChecker);
        AbstractC22676k.m65750j(cacheUpdater, "cacheUpdater");
        AbstractC22676k.m65750j(apiClient, "apiClient");
        AbstractC22676k.m65750j(urlProvider, "urlProvider");
        AbstractC22676k.m65750j(cacheReporter, "cacheReporter");
        AbstractC22676k.m65750j(ioDispatcher, "ioDispatcher");
        AbstractC22676k.m65750j(bffCacheDeserializer, "bffCacheDeserializer");
    }
}
