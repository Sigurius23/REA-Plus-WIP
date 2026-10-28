package et2;

import com.mapbox.common.HttpHeaders;
import com.whoop.weeklyplan.api.WeeklyPlanApi;
import com.whoop.weeklyplan.api.WeeklyPlanHomeTileGetRequest;
import com.whoop.weeklyplan.hometile.domain.api.WeeklyPlanHometileResponse;
import ct2.AbstractC11109a;
import ct2.AbstractC11110b;
import ct2.C11111c;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import java.time.LocalDate;
import l83.C23454a0;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import or2.AbstractC28157e0;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: et2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Let2/a;", "Lod1/g;", "Lct2/a;", "Lct2/b;", "Lcom/whoop/weeklyplan/api/WeeklyPlanApi;", "api", "Lnm0/e;", "cachedApiSource", "Lct2/c;", "refreshHook", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/weeklyplan/api/WeeklyPlanApi;Lnm0/e;Lct2/c;Ltr2/n;)V", "Ljava/time/LocalDate;", HttpHeaders.DATE, "Lec3/l;", "d", "(Ljava/time/LocalDate;)Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/weeklyplan/api/WeeklyPlanApi;", "b", "Lnm0/e;", "c", "Lct2/c;", "Ltr2/n;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13599a implements InterfaceC27844g<AbstractC11109a, AbstractC11110b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final WeeklyPlanApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C11111c refreshHook;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: et2.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.hometile.domain.interactor.WeeklyPlanHomeTileApiInteractor$getDataFromCache$$inlined$cacheAPI$1", m100430f = "WeeklyPlanHomeTileApiInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f48075w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f48076x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f48077y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f48078z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f48078z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f48078z);
            aVar.f48076x = interfaceC13062m;
            aVar.f48077y = c26832c;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f48075w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f48076x;
                C26832c c26832c = (C26832c) this.f48077y;
                InterfaceC26834e interfaceC26834e = this.f48078z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(WeeklyPlanHometileResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(WeeklyPlanHometileResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f48076x = null;
                this.f48077y = null;
                this.f48075w = 1;
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

    /* JADX INFO: renamed from: et2.a$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f48079w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ LocalDate f48080x;

        /* JADX INFO: renamed from: et2.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f48081w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ LocalDate f48082x;

            /* JADX INFO: renamed from: et2.a$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.hometile.domain.interactor.WeeklyPlanHomeTileApiInteractor$getDataFromCache$$inlined$map$1$2", m100430f = "WeeklyPlanHomeTileApiInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41569a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f48083E;

                /* JADX INFO: renamed from: F */
                Object f48084F;

                /* JADX INFO: renamed from: G */
                Object f48085G;

                /* JADX INFO: renamed from: H */
                int f48086H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f48087w;

                /* JADX INFO: renamed from: x */
                int f48088x;

                /* JADX INFO: renamed from: y */
                Object f48089y;

                public C41569a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f48087w = obj;
                    this.f48088x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, LocalDate localDate) {
                this.f48081w = interfaceC13062m;
                this.f48082x = localDate;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41569a c41569a;
                Object aVar;
                AbstractC11110b.c cVar;
                if (interfaceC30057d instanceof C41569a) {
                    c41569a = (C41569a) interfaceC30057d;
                    int i13 = c41569a.f48088x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41569a.f48088x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41569a = new C41569a(interfaceC30057d);
                    }
                } else {
                    c41569a = new C41569a(interfaceC30057d);
                }
                Object obj2 = c41569a.f48087w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41569a.f48088x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f48081w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        aVar = AbstractC11110b.b.f35314a;
                    } else {
                        if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                            cVar = new AbstractC11110b.c((WeeklyPlanHometileResponse) ((InterfaceC29354a.a.C42173a) interfaceC29354a).getData());
                        } else if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                            cVar = new AbstractC11110b.c((WeeklyPlanHometileResponse) ((InterfaceC29354a.a.b) interfaceC29354a).getData());
                        } else {
                            aVar = new AbstractC11110b.a(this.f48082x);
                        }
                        aVar = cVar;
                    }
                    c41569a.f48089y = null;
                    c41569a.f48083E = null;
                    c41569a.f48084F = null;
                    c41569a.f48085G = null;
                    c41569a.f48086H = 0;
                    c41569a.f48088x = 1;
                    if (interfaceC13062m.emit(aVar, c41569a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, LocalDate localDate) {
            this.f48079w = interfaceC13058l;
            this.f48080x = localDate;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f48079w.collect(new a(interfaceC13062m, this.f48080x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: et2.a$c */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.hometile.domain.interactor.WeeklyPlanHomeTileApiInteractor$interact$$inlined$flatMapLatest$1", m100430f = "WeeklyPlanHomeTileApiInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f48091w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f48092x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f48093y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C13599a f48094z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, C13599a c13599a) {
            super(3, interfaceC30057d);
            this.f48094z = c13599a;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC11109a abstractC11109a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f48094z);
            cVar.f48092x = interfaceC13062m;
            cVar.f48093y = abstractC11109a;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l interfaceC13058lM38424d;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f48091w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f48092x;
                AbstractC11109a abstractC11109a = (AbstractC11109a) this.f48093y;
                if (AbstractC22676k.m65745e(abstractC11109a, AbstractC11109a.b.f35312a)) {
                    interfaceC13058lM38424d = new C0456u(AbstractC11110b.b.f35314a, 1);
                } else {
                    if (!(abstractC11109a instanceof AbstractC11109a.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC13058lM38424d = this.f48094z.m38424d(((AbstractC11109a.a) abstractC11109a).getCom.mapbox.common.HttpHeaders.DATE java.lang.String());
                }
                this.f48092x = null;
                this.f48093y = null;
                this.f48091w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM38424d, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC11109a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    public C13599a(WeeklyPlanApi api, InterfaceC26834e cachedApiSource, C11111c refreshHook, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(refreshHook, "refreshHook");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.cachedApiSource = cachedApiSource;
        this.refreshHook = refreshHook;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final InterfaceC13058l m38424d(LocalDate date) {
        String string = date.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return new b(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new WeeklyPlanHomeTileGetRequest(string), 1), null, null, 3, null), new a(null, this.cachedApiSource)), date);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(AbstractC28157e0.m85207a(upstream, this.refreshHook.getRefreshEvents()), new c(null, this));
    }
}
