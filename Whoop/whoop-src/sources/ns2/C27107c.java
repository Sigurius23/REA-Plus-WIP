package ns2;

import a12.AbstractC0142b;
import a12.C0141a;
import com.whoop.weeklyplan.challengelanding.aiplans.api.AiPlansGetRequest;
import com.whoop.weeklyplan.challengelanding.aiplans.domain.model.AiPlansResponse;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import l83.C23454a0;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
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

/* JADX INFO: renamed from: ns2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lns2/c;", "Lod1/g;", "Lns2/a;", "Lns2/b;", "Lnm0/e;", "cachedApiSource", "<init>", "(Lnm0/e;)V", "La12/a;", "parsedPath", "Lec3/l;", "d", "(La12/a;)Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27107c implements InterfaceC27844g<AbstractC27105a, AbstractC27106b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: ns2.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.challengelanding.aiplans.domain.AiPlansInteractor$fetchData$$inlined$cacheAPI$1", m100430f = "AiPlansInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f108332w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f108333x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f108334y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f108335z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f108335z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f108335z);
            aVar.f108333x = interfaceC13062m;
            aVar.f108334y = c26832c;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f108332w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f108333x;
                C26832c c26832c = (C26832c) this.f108334y;
                InterfaceC26834e interfaceC26834e = this.f108335z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(AiPlansResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(AiPlansResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f108333x = null;
                this.f108334y = null;
                this.f108332w = 1;
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

    /* JADX INFO: renamed from: ns2.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f108336w;

        /* JADX INFO: renamed from: ns2.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f108337w;

            /* JADX INFO: renamed from: ns2.c$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.challengelanding.aiplans.domain.AiPlansInteractor$fetchData$$inlined$map$1$2", m100430f = "AiPlansInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42087a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f108338E;

                /* JADX INFO: renamed from: F */
                Object f108339F;

                /* JADX INFO: renamed from: G */
                Object f108340G;

                /* JADX INFO: renamed from: H */
                int f108341H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f108342w;

                /* JADX INFO: renamed from: x */
                int f108343x;

                /* JADX INFO: renamed from: y */
                Object f108344y;

                public C42087a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f108342w = obj;
                    this.f108343x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f108337w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42087a c42087a;
                Object obj2;
                AbstractC27106b.c cVar;
                if (interfaceC30057d instanceof C42087a) {
                    c42087a = (C42087a) interfaceC30057d;
                    int i13 = c42087a.f108343x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42087a.f108343x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42087a = new C42087a(interfaceC30057d);
                    }
                } else {
                    c42087a = new C42087a(interfaceC30057d);
                }
                Object obj3 = c42087a.f108342w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42087a.f108343x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj3);
                    InterfaceC13062m interfaceC13062m = this.f108337w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        obj2 = AbstractC27106b.b.f108329a;
                    } else {
                        if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                            cVar = new AbstractC27106b.c((AiPlansResponse) ((InterfaceC29354a.a.C42173a) interfaceC29354a).getData());
                        } else if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                            cVar = new AbstractC27106b.c((AiPlansResponse) ((InterfaceC29354a.a.b) interfaceC29354a).getData());
                        } else {
                            obj2 = AbstractC27106b.a.f108328a;
                        }
                        obj2 = cVar;
                    }
                    c42087a.f108344y = null;
                    c42087a.f108338E = null;
                    c42087a.f108339F = null;
                    c42087a.f108340G = null;
                    c42087a.f108341H = 0;
                    c42087a.f108343x = 1;
                    if (interfaceC13062m.emit(obj2, c42087a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj3);
                }
                return C23454a0.f92919a;
            }
        }

        public b(InterfaceC13058l interfaceC13058l) {
            this.f108336w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f108336w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ns2.c$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.challengelanding.aiplans.domain.AiPlansInteractor$interact$$inlined$flatMapLatest$1", m100430f = "AiPlansInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f108346w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f108347x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f108348y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C27107c f108349z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, C27107c c27107c) {
            super(3, interfaceC30057d);
            this.f108349z = c27107c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC27105a abstractC27105a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f108349z);
            cVar.f108347x = interfaceC13062m;
            cVar.f108348y = abstractC27105a;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f108346w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f108347x;
                AbstractC27105a abstractC27105a = (AbstractC27105a) this.f108348y;
                if (!(abstractC27105a instanceof AbstractC27105a.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC13058l interfaceC13058lM81480d = this.f108349z.m81480d(AbstractC0142b.m360e(((AbstractC27105a.a) abstractC27105a).getPath()));
                this.f108347x = null;
                this.f108348y = null;
                this.f108346w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM81480d, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC27105a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    public C27107c(InterfaceC26834e cachedApiSource) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        this.cachedApiSource = cachedApiSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final InterfaceC13058l m81480d(C0141a parsedPath) {
        return new b(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new AiPlansGetRequest(parsedPath.getBasePath(), parsedPath.m354b()), 1), null, null, 3, null), new a(null, this.cachedApiSource)));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new c(null, this));
    }
}
