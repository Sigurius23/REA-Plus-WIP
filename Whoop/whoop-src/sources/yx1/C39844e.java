package yx1;

import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
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
import wx1.AbstractC37683a;
import wx1.C37685c;
import wx1.InterfaceC37684b;
import zx1.C41207a;

/* JADX INFO: renamed from: yx1.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020 0\n8\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010#¨\u0006%"}, m65681d2 = {"Lyx1/e;", "Landroidx/lifecycle/w1;", "Lwx1/c;", "interactor", "Lzx1/a;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lwx1/c;Lzx1/a;Lbc3/c0;)V", "Lec3/l;", "Lwx1/a;", "Lwx1/b;", "l", "(Lec3/l;Lwx1/c;)Lec3/l;", "Lyx1/d;", "Lwx1/a$a;", "o", "(Lyx1/d;)Lwx1/a$a;", "viewEvent", "Ll83/a0;", "n", "(Lyx1/d;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "Lec3/o1;", "x", "Lec3/o1;", "eventFlow", "y", "Lec3/l;", "domainState", "Lyx1/f;", "z", "getViewState", "()Lec3/l;", "viewState", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39844e extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: yx1.e$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.returns.presentation.ReturnsViewModel$sendViewEvent$1", m100430f = "ReturnsViewModel.kt", m100431l = {34}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f172052w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC39843d f172054y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC39843d interfaceC39843d, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f172054y = interfaceC39843d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C39844e.this.new a(this.f172054y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f172052w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C39844e.this.eventFlow;
                InterfaceC39843d interfaceC39843d = this.f172054y;
                this.f172052w = 1;
                if (interfaceC13072o1.emit(interfaceC39843d, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: yx1.e$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f172055w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C39844e f172056x;

        /* JADX INFO: renamed from: yx1.e$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f172057w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C39844e f172058x;

            /* JADX INFO: renamed from: yx1.e$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.membership.returns.presentation.ReturnsViewModel$special$$inlined$map$1$2", m100430f = "ReturnsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42714a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f172059E;

                /* JADX INFO: renamed from: F */
                Object f172060F;

                /* JADX INFO: renamed from: G */
                Object f172061G;

                /* JADX INFO: renamed from: H */
                int f172062H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f172063w;

                /* JADX INFO: renamed from: x */
                int f172064x;

                /* JADX INFO: renamed from: y */
                Object f172065y;

                public C42714a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f172063w = obj;
                    this.f172064x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C39844e c39844e) {
                this.f172057w = interfaceC13062m;
                this.f172058x = c39844e;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42714a c42714a;
                if (interfaceC30057d instanceof C42714a) {
                    c42714a = (C42714a) interfaceC30057d;
                    int i13 = c42714a.f172064x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42714a.f172064x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42714a = new C42714a(interfaceC30057d);
                    }
                } else {
                    c42714a = new C42714a(interfaceC30057d);
                }
                Object obj2 = c42714a.f172063w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42714a.f172064x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f172057w;
                    AbstractC37683a.a aVarM127917o = this.f172058x.m127917o((InterfaceC39843d) obj);
                    c42714a.f172065y = null;
                    c42714a.f172059E = null;
                    c42714a.f172060F = null;
                    c42714a.f172061G = null;
                    c42714a.f172062H = 0;
                    c42714a.f172064x = 1;
                    if (interfaceC13062m.emit(aVarM127917o, c42714a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C39844e c39844e) {
            this.f172055w = interfaceC13058l;
            this.f172056x = c39844e;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f172055w.collect(new a(interfaceC13062m, this.f172056x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: yx1.e$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f172067w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C41207a f172068x;

        /* JADX INFO: renamed from: yx1.e$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f172069w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C41207a f172070x;

            /* JADX INFO: renamed from: yx1.e$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.membership.returns.presentation.ReturnsViewModel$special$$inlined$map$2$2", m100430f = "ReturnsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42715a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f172071E;

                /* JADX INFO: renamed from: F */
                Object f172072F;

                /* JADX INFO: renamed from: G */
                Object f172073G;

                /* JADX INFO: renamed from: H */
                int f172074H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f172075w;

                /* JADX INFO: renamed from: x */
                int f172076x;

                /* JADX INFO: renamed from: y */
                Object f172077y;

                public C42715a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f172075w = obj;
                    this.f172076x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C41207a c41207a) {
                this.f172069w = interfaceC13062m;
                this.f172070x = c41207a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42715a c42715a;
                if (interfaceC30057d instanceof C42715a) {
                    c42715a = (C42715a) interfaceC30057d;
                    int i13 = c42715a.f172076x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42715a.f172076x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42715a = new C42715a(interfaceC30057d);
                    }
                } else {
                    c42715a = new C42715a(interfaceC30057d);
                }
                Object obj2 = c42715a.f172075w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42715a.f172076x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f172069w;
                    C39845f c39845fM133862a = this.f172070x.m133862a((InterfaceC37684b) obj);
                    c42715a.f172077y = null;
                    c42715a.f172071E = null;
                    c42715a.f172072F = null;
                    c42715a.f172073G = null;
                    c42715a.f172074H = 0;
                    c42715a.f172076x = 1;
                    if (interfaceC13062m.emit(c39845fM133862a, c42715a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C41207a c41207a) {
            this.f172067w = interfaceC13058l;
            this.f172068x = c41207a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f172067w.collect(new a(interfaceC13062m, this.f172068x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39844e(C37685c interactor, C41207a reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM127916l = m127916l(new b(c13096w1M36592b, this), interactor);
        this.domainState = interfaceC13058lM127916l;
        this.viewState = new c(AbstractC13091v.m36586L(interfaceC13058lM127916l, coroutineScope, C13105z1.f45288a, 0), reducer);
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC13058l m127916l(InterfaceC13058l interfaceC13058l, C37685c c37685c) {
        return c37685c.m121106c(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final AbstractC37683a.a m127917o(InterfaceC39843d interfaceC39843d) {
        if (interfaceC39843d instanceof InterfaceC39843d.a) {
            return new AbstractC37683a.a();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final void m127918n(InterfaceC39843d viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(viewEvent, null), 3);
    }

    public /* synthetic */ C39844e(C37685c c37685c, C41207a c41207a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c37685c, c41207a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
