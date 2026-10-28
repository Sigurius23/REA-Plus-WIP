package u52;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.recommendationtile.domain.C9912c;
import com.whoop.recommendationtile.domain.C9917h;
import com.whoop.recommendationtile.domain.InterfaceC9911b;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import h31.AbstractC16823p;
import h31.C16820m;
import h31.InterfaceC16822o;
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
import v52.C35706b;

/* JADX INFO: renamed from: u52.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m65681d2 = {"Lu52/b;", "Lh31/p;", "Lcom/whoop/recommendationtile/domain/h;", "interactor", "Lv52/b;", "reducer", "Lor2/m;", "coroutineScope", "<init>", "(Lcom/whoop/recommendationtile/domain/h;Lv52/b;Lor2/m;)V", "Lh31/o;", "Lcom/whoop/recommendationtile/domain/b;", "q", "(Lh31/o;)Lcom/whoop/recommendationtile/domain/b;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "p", "(Lh31/o;)V", "x", "Lv52/b;", "y", "Lor2/m;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "Lec3/t1;", "Lh31/m;", "E", "Lec3/t1;", "o", "()Lec3/t1;", "viewState", "recommendation-tile-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34547b extends AbstractC16823p {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13087t1 viewState;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C35706b reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C28180m coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: u52.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.recommendationtile.presentation.RecommendationTileViewModelImpl$sendViewEvent$1", m100430f = "RecommendationTileViewModelImpl.kt", m100431l = {31}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f145284w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC16822o f145286y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC16822o interfaceC16822o, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f145286y = interfaceC16822o;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C34547b.this.new a(this.f145286y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f145284w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C34547b.this.eventFlow;
                InterfaceC16822o interfaceC16822o = this.f145286y;
                this.f145284w = 1;
                if (interfaceC13072o1.emit(interfaceC16822o, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: u52.b$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f145287w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C34547b f145288x;

        /* JADX INFO: renamed from: u52.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f145289w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C34547b f145290x;

            /* JADX INFO: renamed from: u52.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.recommendationtile.presentation.RecommendationTileViewModelImpl$special$$inlined$map$1$2", m100430f = "RecommendationTileViewModelImpl.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42447a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f145291E;

                /* JADX INFO: renamed from: F */
                Object f145292F;

                /* JADX INFO: renamed from: G */
                Object f145293G;

                /* JADX INFO: renamed from: H */
                int f145294H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f145295w;

                /* JADX INFO: renamed from: x */
                int f145296x;

                /* JADX INFO: renamed from: y */
                Object f145297y;

                public C42447a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f145295w = obj;
                    this.f145296x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C34547b c34547b) {
                this.f145289w = interfaceC13062m;
                this.f145290x = c34547b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42447a c42447a;
                if (interfaceC30057d instanceof C42447a) {
                    c42447a = (C42447a) interfaceC30057d;
                    int i13 = c42447a.f145296x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42447a.f145296x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42447a = new C42447a(interfaceC30057d);
                    }
                } else {
                    c42447a = new C42447a(interfaceC30057d);
                }
                Object obj2 = c42447a.f145295w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42447a.f145296x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f145289w;
                    InterfaceC9911b interfaceC9911bM109190q = this.f145290x.m109190q((InterfaceC16822o) obj);
                    c42447a.f145297y = null;
                    c42447a.f145291E = null;
                    c42447a.f145292F = null;
                    c42447a.f145293G = null;
                    c42447a.f145294H = 0;
                    c42447a.f145296x = 1;
                    if (interfaceC13062m.emit(interfaceC9911bM109190q, c42447a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C34547b c34547b) {
            this.f145287w = interfaceC13058l;
            this.f145288x = c34547b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f145287w.collect(new a(interfaceC13062m, this.f145288x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: u52.b$c */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f145299w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C34547b f145300x;

        /* JADX INFO: renamed from: u52.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f145301w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C34547b f145302x;

            /* JADX INFO: renamed from: u52.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.recommendationtile.presentation.RecommendationTileViewModelImpl$special$$inlined$map$2$2", m100430f = "RecommendationTileViewModelImpl.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42448a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f145303E;

                /* JADX INFO: renamed from: F */
                Object f145304F;

                /* JADX INFO: renamed from: G */
                Object f145305G;

                /* JADX INFO: renamed from: H */
                int f145306H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f145307w;

                /* JADX INFO: renamed from: x */
                int f145308x;

                /* JADX INFO: renamed from: y */
                Object f145309y;

                public C42448a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f145307w = obj;
                    this.f145308x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C34547b c34547b) {
                this.f145301w = interfaceC13062m;
                this.f145302x = c34547b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42448a c42448a;
                if (interfaceC30057d instanceof C42448a) {
                    c42448a = (C42448a) interfaceC30057d;
                    int i13 = c42448a.f145308x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42448a.f145308x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42448a = new C42448a(interfaceC30057d);
                    }
                } else {
                    c42448a = new C42448a(interfaceC30057d);
                }
                Object obj2 = c42448a.f145307w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42448a.f145308x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f145301w;
                    C16820m c16820mM113180a = this.f145302x.reducer.m113180a((C9912c) obj);
                    c42448a.f145309y = null;
                    c42448a.f145303E = null;
                    c42448a.f145304F = null;
                    c42448a.f145305G = null;
                    c42448a.f145306H = 0;
                    c42448a.f145308x = 1;
                    if (interfaceC13062m.emit(c16820mM113180a, c42448a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C34547b c34547b) {
            this.f145299w = interfaceC13058l;
            this.f145300x = c34547b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f145299w.collect(new a(interfaceC13062m, this.f145300x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34547b(C9917h interactor, C35706b reducer, C28180m coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 1, null, 5);
        this.eventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(new c(AbstractC27845h.m83945a(new b(c13096w1M36592b, this), interactor), this), coroutineScope, C13105z1.f45288a, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final InterfaceC9911b m109190q(InterfaceC16822o interfaceC16822o) {
        if (interfaceC16822o instanceof InterfaceC16822o.e) {
            return new InterfaceC9911b.e(((InterfaceC16822o.e) interfaceC16822o).getTile());
        }
        if (interfaceC16822o instanceof InterfaceC16822o.b) {
            return new InterfaceC9911b.b(((InterfaceC16822o.b) interfaceC16822o).getAction());
        }
        if (interfaceC16822o instanceof InterfaceC16822o.d) {
            return InterfaceC9911b.d.f29251a;
        }
        if (interfaceC16822o instanceof InterfaceC16822o.c) {
            return InterfaceC9911b.c.f29250a;
        }
        if (interfaceC16822o instanceof InterfaceC16822o.a) {
            return InterfaceC9911b.a.f29247a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: o, reason: from getter */
    public InterfaceC13087t1 getViewState() {
        return this.viewState;
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo1216g(InterfaceC16822o event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C34547b(C9917h c9917h, C35706b c35706b, C28180m c28180m, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c9917h, c35706b, (i13 & 4) != 0 ? new C28180m(null, 1, null) : c28180m);
    }
}
