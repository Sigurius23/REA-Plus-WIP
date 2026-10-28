package nm0;

import c93.InterfaceC4351m;
import ec3.C13015a0;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sr2.AbstractC32943y;
import wm0.C37378a;
import ym0.C39648a;
import z02.InterfaceC39944a;

/* JADX INFO: renamed from: nm0.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJE\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00160\u0015\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, m65681d2 = {"Lnm0/f;", "Lnm0/e;", "Lym0/a;", "cacheStream", "Lnm0/b;", "apiStream", "Lnm0/d;", "cacheResultCombiner", "Lwm0/a;", "scopeCoordinator", "Lsr2/y;", "urlProvider", "<init>", "(Lym0/a;Lnm0/b;Lnm0/d;Lwm0/a;Lsr2/y;)V", "RequestBodyT", "ResponseT", "Lnm0/c;", "request", "Ls63/a;", "requestBodyTypeInfo", "responseTypeInfo", "Lec3/l;", "Lpm0/a;", "a", "(Lnm0/c;Ls63/a;Ls63/a;)Lec3/l;", "Lym0/a;", "b", "Lnm0/b;", "c", "Lnm0/d;", "d", "Lwm0/a;", "e", "Lsr2/y;", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26835f implements InterfaceC26834e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C39648a cacheStream;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C26831b apiStream;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C26833d cacheResultCombiner;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C37378a scopeCoordinator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC32943y urlProvider;

    /* JADX INFO: renamed from: nm0.f$a */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f107082w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C26832c f107083x;

        /* JADX INFO: renamed from: nm0.f$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42067a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f107084w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C26832c f107085x;

            /* JADX INFO: renamed from: nm0.f$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes7.dex */
            @InterfaceC32271e(m100429c = "com.whoop.cache.api.RealCachedApiSource$makeRequest$$inlined$filter$1$2", m100430f = "RealCachedApiSource.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42068a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f107087F;

                /* JADX INFO: renamed from: G */
                Object f107088G;

                /* JADX INFO: renamed from: H */
                int f107089H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f107090w;

                /* JADX INFO: renamed from: x */
                int f107091x;

                /* JADX INFO: renamed from: y */
                Object f107092y;

                /* JADX INFO: renamed from: z */
                Object f107093z;

                public C42068a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f107090w = obj;
                    this.f107091x |= Integer.MIN_VALUE;
                    return C42067a.this.emit(null, this);
                }
            }

            public C42067a(InterfaceC13062m interfaceC13062m, C26832c c26832c) {
                this.f107084w = interfaceC13062m;
                this.f107085x = c26832c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42068a c42068a;
                if (interfaceC30057d instanceof C42068a) {
                    c42068a = (C42068a) interfaceC30057d;
                    int i13 = c42068a.f107091x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42068a.f107091x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42068a = new C42068a(interfaceC30057d);
                    }
                } else {
                    c42068a = new C42068a(interfaceC30057d);
                }
                Object obj2 = c42068a.f107090w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42068a.f107091x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f107084w;
                    if (this.f107085x.m80075b().contains((String) obj)) {
                        c42068a.f107092y = null;
                        c42068a.f107093z = null;
                        c42068a.f107087F = null;
                        c42068a.f107088G = null;
                        c42068a.f107089H = 0;
                        c42068a.f107091x = 1;
                        if (interfaceC13062m.emit(obj, c42068a) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public a(InterfaceC13058l interfaceC13058l, C26832c c26832c) {
            this.f107082w = interfaceC13058l;
            this.f107083x = c26832c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f107082w.collect(new C42067a(interfaceC13062m, this.f107083x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: nm0.f$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f107094w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C26832c f107095x;

        /* JADX INFO: renamed from: nm0.f$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f107096w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C26832c f107097x;

            /* JADX INFO: renamed from: nm0.f$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes7.dex */
            @InterfaceC32271e(m100429c = "com.whoop.cache.api.RealCachedApiSource$makeRequest$$inlined$map$1$2", m100430f = "RealCachedApiSource.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42069a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f107098E;

                /* JADX INFO: renamed from: F */
                Object f107099F;

                /* JADX INFO: renamed from: G */
                Object f107100G;

                /* JADX INFO: renamed from: H */
                int f107101H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f107102w;

                /* JADX INFO: renamed from: x */
                int f107103x;

                /* JADX INFO: renamed from: y */
                Object f107104y;

                public C42069a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f107102w = obj;
                    this.f107103x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C26832c c26832c) {
                this.f107096w = interfaceC13062m;
                this.f107097x = c26832c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42069a c42069a;
                if (interfaceC30057d instanceof C42069a) {
                    c42069a = (C42069a) interfaceC30057d;
                    int i13 = c42069a.f107103x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42069a.f107103x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42069a = new C42069a(interfaceC30057d);
                    }
                } else {
                    c42069a = new C42069a(interfaceC30057d);
                }
                Object obj2 = c42069a.f107102w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42069a.f107103x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f107096w;
                    InterfaceC39944a interfaceC39944aM80074a = this.f107097x.m80074a();
                    c42069a.f107104y = null;
                    c42069a.f107098E = null;
                    c42069a.f107099F = null;
                    c42069a.f107100G = null;
                    c42069a.f107101H = 0;
                    c42069a.f107103x = 1;
                    if (interfaceC13062m.emit(interfaceC39944aM80074a, c42069a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public b(InterfaceC13058l interfaceC13058l, C26832c c26832c) {
            this.f107094w = interfaceC13058l;
            this.f107095x = c26832c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f107094w.collect(new a(interfaceC13062m, this.f107095x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: nm0.f$c */
    @InterfaceC32271e(m100429c = "com.whoop.cache.api.RealCachedApiSource$makeRequest$scopedRequestFlow$3", m100430f = "RealCachedApiSource.kt", m100431l = {26}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"RequestBodyT", "Lec3/m;", "Lz02/a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f107106w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f107107x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C26832c<RequestBodyT> f107108y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C26832c<RequestBodyT> c26832c, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f107108y = c26832c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f107108y, interfaceC30057d);
            cVar.f107107x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f107107x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f107106w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC39944a interfaceC39944aM80074a = this.f107108y.m80074a();
                this.f107107x = null;
                this.f107106w = 1;
                if (interfaceC13062m.emit(interfaceC39944aM80074a, this) == enumC31071a) {
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

    public C26835f(C39648a cacheStream, C26831b apiStream, C26833d cacheResultCombiner, C37378a scopeCoordinator, AbstractC32943y urlProvider) {
        AbstractC22676k.m65750j(cacheStream, "cacheStream");
        AbstractC22676k.m65750j(apiStream, "apiStream");
        AbstractC22676k.m65750j(cacheResultCombiner, "cacheResultCombiner");
        AbstractC22676k.m65750j(scopeCoordinator, "scopeCoordinator");
        AbstractC22676k.m65750j(urlProvider, "urlProvider");
        this.cacheStream = cacheStream;
        this.apiStream = apiStream;
        this.cacheResultCombiner = cacheResultCombiner;
        this.scopeCoordinator = scopeCoordinator;
        this.urlProvider = urlProvider;
    }

    @Override // nm0.InterfaceC26834e
    /* JADX INFO: renamed from: a */
    public <RequestBodyT, ResponseT> InterfaceC13058l mo80083a(C26832c<RequestBodyT> request, C32236a requestBodyTypeInfo, C32236a responseTypeInfo) {
        AbstractC22676k.m65750j(request, "request");
        AbstractC22676k.m65750j(requestBodyTypeInfo, "requestBodyTypeInfo");
        AbstractC22676k.m65750j(responseTypeInfo, "responseTypeInfo");
        return this.cacheResultCombiner.m80082c(responseTypeInfo, this.apiStream.m80073i(new C13015a0(new c(request, null), new b(new a(this.scopeCoordinator.getScopeUpdateEvents(), request), request)), requestBodyTypeInfo, responseTypeInfo, request), this.cacheStream.m126765c(request.m80077d(this.urlProvider)));
    }
}
