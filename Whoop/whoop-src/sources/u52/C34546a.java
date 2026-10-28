package u52;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.recommendationtile.domain.C9914e;
import com.whoop.recommendationtile.domain.C9915f;
import com.whoop.recommendationtile.domain.InterfaceC9913d;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import i31.AbstractC18051f;
import i31.C18049d;
import i31.C18052g;
import i31.InterfaceC18050e;
import l83.C23454a0;
import od1.AbstractC27845h;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import v52.C35705a;

/* JADX INFO: renamed from: u52.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, m65681d2 = {"Lu52/a;", "Li31/f;", "Li31/g;", "seed", "Lcom/whoop/recommendationtile/domain/f;", "interactor", "Lv52/a;", "reducer", "Lor2/m;", "coroutineScope", "<init>", "(Li31/g;Lcom/whoop/recommendationtile/domain/f;Lv52/a;Lor2/m;)V", "Li31/e;", "Lcom/whoop/recommendationtile/domain/d;", "p", "(Li31/e;)Lcom/whoop/recommendationtile/domain/d;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "o", "(Li31/e;)V", "x", "Lv52/a;", "y", "Lor2/m;", "Lec3/o1;", "z", "Lec3/o1;", "recommendationTileHeaderViewEventFlow", "Lec3/f2;", "Li31/d;", "E", "Lec3/f2;", "getViewState", "()Lec3/f2;", "viewState", "recommendation-tile-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34546a extends AbstractC18051f {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13037f2 viewState;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C35705a reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C28180m coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 recommendationTileHeaderViewEventFlow;

    /* JADX INFO: renamed from: u52.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.recommendationtile.presentation.RecommendationTileHeaderViewModelImpl$sendViewEvent$1", m100430f = "RecommendationTileHeaderViewModelImpl.kt", m100431l = {35}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f145253w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC18050e f145255y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC18050e interfaceC18050e, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f145255y = interfaceC18050e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C34546a.this.new a(this.f145255y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f145253w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C34546a.this.recommendationTileHeaderViewEventFlow;
                InterfaceC18050e interfaceC18050e = this.f145255y;
                this.f145253w = 1;
                if (interfaceC13072o1.emit(interfaceC18050e, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: u52.a$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f145256w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C34546a f145257x;

        /* JADX INFO: renamed from: u52.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f145258w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C34546a f145259x;

            /* JADX INFO: renamed from: u52.a$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.recommendationtile.presentation.RecommendationTileHeaderViewModelImpl$special$$inlined$map$1$2", m100430f = "RecommendationTileHeaderViewModelImpl.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42445a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f145260E;

                /* JADX INFO: renamed from: F */
                Object f145261F;

                /* JADX INFO: renamed from: G */
                Object f145262G;

                /* JADX INFO: renamed from: H */
                int f145263H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f145264w;

                /* JADX INFO: renamed from: x */
                int f145265x;

                /* JADX INFO: renamed from: y */
                Object f145266y;

                public C42445a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f145264w = obj;
                    this.f145265x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C34546a c34546a) {
                this.f145258w = interfaceC13062m;
                this.f145259x = c34546a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42445a c42445a;
                if (interfaceC30057d instanceof C42445a) {
                    c42445a = (C42445a) interfaceC30057d;
                    int i13 = c42445a.f145265x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42445a.f145265x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42445a = new C42445a(interfaceC30057d);
                    }
                } else {
                    c42445a = new C42445a(interfaceC30057d);
                }
                Object obj2 = c42445a.f145264w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42445a.f145265x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f145258w;
                    InterfaceC9913d interfaceC9913dM109185p = this.f145259x.m109185p((InterfaceC18050e) obj);
                    c42445a.f145266y = null;
                    c42445a.f145260E = null;
                    c42445a.f145261F = null;
                    c42445a.f145262G = null;
                    c42445a.f145263H = 0;
                    c42445a.f145265x = 1;
                    if (interfaceC13062m.emit(interfaceC9913dM109185p, c42445a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C34546a c34546a) {
            this.f145256w = interfaceC13058l;
            this.f145257x = c34546a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f145256w.collect(new a(interfaceC13062m, this.f145257x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: u52.a$c */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f145268w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C34546a f145269x;

        /* JADX INFO: renamed from: u52.a$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f145270w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C34546a f145271x;

            /* JADX INFO: renamed from: u52.a$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.recommendationtile.presentation.RecommendationTileHeaderViewModelImpl$special$$inlined$map$2$2", m100430f = "RecommendationTileHeaderViewModelImpl.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42446a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f145272E;

                /* JADX INFO: renamed from: F */
                Object f145273F;

                /* JADX INFO: renamed from: G */
                Object f145274G;

                /* JADX INFO: renamed from: H */
                int f145275H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f145276w;

                /* JADX INFO: renamed from: x */
                int f145277x;

                /* JADX INFO: renamed from: y */
                Object f145278y;

                public C42446a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f145276w = obj;
                    this.f145277x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C34546a c34546a) {
                this.f145270w = interfaceC13062m;
                this.f145271x = c34546a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42446a c42446a;
                if (interfaceC30057d instanceof C42446a) {
                    c42446a = (C42446a) interfaceC30057d;
                    int i13 = c42446a.f145277x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42446a.f145277x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42446a = new C42446a(interfaceC30057d);
                    }
                } else {
                    c42446a = new C42446a(interfaceC30057d);
                }
                Object obj2 = c42446a.f145276w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42446a.f145277x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f145270w;
                    C18049d c18049dM113179a = this.f145271x.reducer.m113179a((C9914e) obj);
                    c42446a.f145278y = null;
                    c42446a.f145272E = null;
                    c42446a.f145273F = null;
                    c42446a.f145274G = null;
                    c42446a.f145275H = 0;
                    c42446a.f145277x = 1;
                    if (interfaceC13062m.emit(c18049dM113179a, c42446a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C34546a c34546a) {
            this.f145268w = interfaceC13058l;
            this.f145269x = c34546a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f145268w.collect(new a(interfaceC13062m, this.f145269x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34546a(C18052g seed, C9915f interactor, C35705a reducer, C28180m coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(seed, "seed");
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 1, null, 5);
        this.recommendationTileHeaderViewEventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36587M(new c(AbstractC27845h.m83945a(new b(c13096w1M36592b, this), interactor), this), coroutineScope, C13105z1.f45288a, new C18049d(seed, false, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final InterfaceC9913d m109185p(InterfaceC18050e interfaceC18050e) {
        if (interfaceC18050e instanceof InterfaceC18050e.a) {
            return new InterfaceC9913d.a(((InterfaceC18050e.a) interfaceC18050e).getAction());
        }
        if (interfaceC18050e instanceof InterfaceC18050e.b) {
            return InterfaceC9913d.b.f29267a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo1216g(InterfaceC18050e event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    @Override // ld1.AbstractC23864c
    public InterfaceC13037f2 getViewState() {
        return this.viewState;
    }

    public /* synthetic */ C34546a(C18052g c18052g, C9915f c9915f, C35705a c35705a, C28180m c28180m, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c18052g, c9915f, c35705a, (i13 & 8) != 0 ? new C28180m(null, 1, null) : c28180m);
    }
}
