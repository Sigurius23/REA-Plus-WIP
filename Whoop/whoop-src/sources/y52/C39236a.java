package y52;

import a12.AbstractC0142b;
import a12.C0141a;
import com.whoop.recoveryimpacts.api.GetRecoveryImpactsRequest;
import com.whoop.recoveryimpacts.domain.model.RecoveryImpactsResponse;
import ec3.AbstractC13091v;
import ec3.C13060l1;
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

/* JADX INFO: renamed from: y52.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Ly52/a;", "Lod1/g;", "Ly52/c;", "Ly52/e;", "Lnm0/e;", "cachedApiSource", "<init>", "(Lnm0/e;)V", "La12/a;", "parsedPath", "Lec3/l;", "d", "(La12/a;)Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "recovery-impacts-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39236a implements InterfaceC27844g<AbstractC39238c, C39240e> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: y52.a$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.recoveryimpacts.domain.RecoveryImpactsApiInteractor$fetchData$$inlined$cacheAPI$1", m100430f = "RecoveryImpactsApiInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f168697w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f168698x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f168699y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f168700z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f168700z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f168700z);
            aVar.f168698x = interfaceC13062m;
            aVar.f168699y = c26832c;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f168697w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f168698x;
                C26832c c26832c = (C26832c) this.f168699y;
                InterfaceC26834e interfaceC26834e = this.f168700z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(RecoveryImpactsResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(RecoveryImpactsResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f168698x = null;
                this.f168699y = null;
                this.f168697w = 1;
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

    /* JADX INFO: renamed from: y52.a$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f168701w;

        /* JADX INFO: renamed from: y52.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f168702w;

            /* JADX INFO: renamed from: y52.a$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.recoveryimpacts.domain.RecoveryImpactsApiInteractor$fetchData$$inlined$map$1$2", m100430f = "RecoveryImpactsApiInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42677a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f168703E;

                /* JADX INFO: renamed from: F */
                Object f168704F;

                /* JADX INFO: renamed from: G */
                Object f168705G;

                /* JADX INFO: renamed from: H */
                int f168706H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f168707w;

                /* JADX INFO: renamed from: x */
                int f168708x;

                /* JADX INFO: renamed from: y */
                Object f168709y;

                public C42677a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f168707w = obj;
                    this.f168708x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f168702w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42677a c42677a;
                C39240e c39240e;
                C39240e c39240e2;
                if (interfaceC30057d instanceof C42677a) {
                    c42677a = (C42677a) interfaceC30057d;
                    int i13 = c42677a.f168708x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42677a.f168708x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42677a = new C42677a(interfaceC30057d);
                    }
                } else {
                    c42677a = new C42677a(interfaceC30057d);
                }
                Object obj2 = c42677a.f168707w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42677a.f168708x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f168702w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        c39240e = new C39240e(InterfaceC39239d.b.f168735a, null, 2, null);
                    } else {
                        if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                            c39240e2 = new C39240e(InterfaceC39239d.c.f168736a, (RecoveryImpactsResponse) ((InterfaceC29354a.a.C42173a) interfaceC29354a).getData());
                        } else if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                            c39240e2 = new C39240e(InterfaceC39239d.c.f168736a, (RecoveryImpactsResponse) ((InterfaceC29354a.a.b) interfaceC29354a).getData());
                        } else {
                            c39240e = new C39240e(InterfaceC39239d.a.f168734a, null, 2, null);
                        }
                        c39240e = c39240e2;
                    }
                    c42677a.f168709y = null;
                    c42677a.f168703E = null;
                    c42677a.f168704F = null;
                    c42677a.f168705G = null;
                    c42677a.f168706H = 0;
                    c42677a.f168708x = 1;
                    if (interfaceC13062m.emit(c39240e, c42677a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l) {
            this.f168701w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f168701w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: y52.a$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.recoveryimpacts.domain.RecoveryImpactsApiInteractor$interact$$inlined$flatMapLatest$1", m100430f = "RecoveryImpactsApiInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f168711w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f168712x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f168713y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C39236a f168714z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, C39236a c39236a) {
            super(3, interfaceC30057d);
            this.f168714z = c39236a;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC39238c abstractC39238c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f168714z);
            cVar.f168712x = interfaceC13062m;
            cVar.f168713y = abstractC39238c;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f168711w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f168712x;
                AbstractC39238c abstractC39238c = (AbstractC39238c) this.f168713y;
                if (!(abstractC39238c instanceof AbstractC39238c.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                e eVar = new e(this.f168714z.m125018d(AbstractC0142b.m360e(((AbstractC39238c.a) abstractC39238c).getPath())), abstractC39238c);
                this.f168712x = null;
                this.f168713y = null;
                this.f168711w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, eVar, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC39238c) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: y52.a$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.recoveryimpacts.domain.RecoveryImpactsApiInteractor$interact$2", m100430f = "RecoveryImpactsApiInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ly52/e;", "previousState", "Ly52/b$a;", "action", "<anonymous>", "(Ly52/e;Ly52/b$a;)Ly52/e;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f168715w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f168716x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f168717y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C39240e c39240e, AbstractC39237b.a aVar, InterfaceC30057d<? super C39240e> interfaceC30057d) {
            d dVar = new d(interfaceC30057d);
            dVar.f168716x = c39240e;
            dVar.f168717y = aVar;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C39240e c39240e = (C39240e) this.f168716x;
            AbstractC39237b.a aVar = (AbstractC39237b.a) this.f168717y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f168715w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return (aVar.getShowLoading() || !AbstractC22676k.m65745e(aVar.getDomainState().getResult(), InterfaceC39239d.b.f168735a)) ? aVar.getDomainState() : c39240e;
        }
    }

    /* JADX INFO: renamed from: y52.a$e */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f168718w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC39238c f168719x;

        /* JADX INFO: renamed from: y52.a$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f168720w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ AbstractC39238c f168721x;

            /* JADX INFO: renamed from: y52.a$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.recoveryimpacts.domain.RecoveryImpactsApiInteractor$interact$lambda$0$$inlined$map$1$2", m100430f = "RecoveryImpactsApiInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42678a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f168722E;

                /* JADX INFO: renamed from: F */
                Object f168723F;

                /* JADX INFO: renamed from: G */
                Object f168724G;

                /* JADX INFO: renamed from: H */
                int f168725H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f168726w;

                /* JADX INFO: renamed from: x */
                int f168727x;

                /* JADX INFO: renamed from: y */
                Object f168728y;

                public C42678a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f168726w = obj;
                    this.f168727x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, AbstractC39238c abstractC39238c) {
                this.f168720w = interfaceC13062m;
                this.f168721x = abstractC39238c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42678a c42678a;
                if (interfaceC30057d instanceof C42678a) {
                    c42678a = (C42678a) interfaceC30057d;
                    int i13 = c42678a.f168727x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42678a.f168727x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42678a = new C42678a(interfaceC30057d);
                    }
                } else {
                    c42678a = new C42678a(interfaceC30057d);
                }
                Object obj2 = c42678a.f168726w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42678a.f168727x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f168720w;
                    AbstractC39237b.a aVar = new AbstractC39237b.a((C39240e) obj, ((AbstractC39238c.a) this.f168721x).getShowLoading());
                    c42678a.f168728y = null;
                    c42678a.f168722E = null;
                    c42678a.f168723F = null;
                    c42678a.f168724G = null;
                    c42678a.f168725H = 0;
                    c42678a.f168727x = 1;
                    if (interfaceC13062m.emit(aVar, c42678a) == enumC31071a) {
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

        public e(InterfaceC13058l interfaceC13058l, AbstractC39238c abstractC39238c) {
            this.f168718w = interfaceC13058l;
            this.f168719x = abstractC39238c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f168718w.collect(new a(interfaceC13062m, this.f168719x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C39236a(InterfaceC26834e cachedApiSource) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        this.cachedApiSource = cachedApiSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final InterfaceC13058l m125018d(C0141a parsedPath) {
        return new b(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new GetRecoveryImpactsRequest(parsedPath.getBasePath(), parsedPath.m354b()), 1), null, null, 3, null), new a(null, this.cachedApiSource)));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36610t(new C13060l1(new C39240e(InterfaceC39239d.b.f168735a, null, 2, null), AbstractC13091v.m36590P(upstream, new c(null, this)), new d(null)));
    }
}
