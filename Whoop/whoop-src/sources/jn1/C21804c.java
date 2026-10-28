package jn1;

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
import en1.AbstractC13365b;
import en1.AbstractC13366c;
import en1.C13367d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kn1.C22598a;
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

/* JADX INFO: renamed from: jn1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\n8\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\"¨\u0006$"}, m65681d2 = {"Ljn1/c;", "Landroidx/lifecycle/w1;", "Len1/d;", "interactor", "Lkn1/a;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Len1/d;Lkn1/a;Lbc3/c0;)V", "Lec3/l;", "Len1/b;", "Len1/c;", "l", "(Lec3/l;Len1/d;)Lec3/l;", "Ljn1/b;", "viewEvent", "o", "(Ljn1/b;)Len1/b;", "Ll83/a0;", "n", "(Ljn1/b;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "Lec3/o1;", "x", "Lec3/o1;", "eventFlow", "y", "Lec3/l;", "domainState", "Ljn1/d;", "z", "getViewState", "()Lec3/l;", "viewState", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21804c extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: jn1.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.homecustomization.presentation.legacy.HomeCustomizationViewModel$sendViewEvent$1", m100430f = "HomeCustomizationViewModel.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f84019w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC21803b f84021y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC21803b abstractC21803b, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f84021y = abstractC21803b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C21804c.this.new a(this.f84021y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f84019w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C21804c.this.eventFlow;
                AbstractC21803b abstractC21803b = this.f84021y;
                this.f84019w = 1;
                if (interfaceC13072o1.emit(abstractC21803b, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: jn1.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f84022w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C21804c f84023x;

        /* JADX INFO: renamed from: jn1.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f84024w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C21804c f84025x;

            /* JADX INFO: renamed from: jn1.c$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.homecustomization.presentation.legacy.HomeCustomizationViewModel$special$$inlined$map$1$2", m100430f = "HomeCustomizationViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41855a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f84026E;

                /* JADX INFO: renamed from: F */
                Object f84027F;

                /* JADX INFO: renamed from: G */
                Object f84028G;

                /* JADX INFO: renamed from: H */
                int f84029H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f84030w;

                /* JADX INFO: renamed from: x */
                int f84031x;

                /* JADX INFO: renamed from: y */
                Object f84032y;

                public C41855a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f84030w = obj;
                    this.f84031x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C21804c c21804c) {
                this.f84024w = interfaceC13062m;
                this.f84025x = c21804c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41855a c41855a;
                if (interfaceC30057d instanceof C41855a) {
                    c41855a = (C41855a) interfaceC30057d;
                    int i13 = c41855a.f84031x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41855a.f84031x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41855a = new C41855a(interfaceC30057d);
                    }
                } else {
                    c41855a = new C41855a(interfaceC30057d);
                }
                Object obj2 = c41855a.f84030w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41855a.f84031x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f84024w;
                    AbstractC13365b abstractC13365bM61717o = this.f84025x.m61717o((AbstractC21803b) obj);
                    c41855a.f84032y = null;
                    c41855a.f84026E = null;
                    c41855a.f84027F = null;
                    c41855a.f84028G = null;
                    c41855a.f84029H = 0;
                    c41855a.f84031x = 1;
                    if (interfaceC13062m.emit(abstractC13365bM61717o, c41855a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C21804c c21804c) {
            this.f84022w = interfaceC13058l;
            this.f84023x = c21804c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f84022w.collect(new a(interfaceC13062m, this.f84023x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: jn1.c$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f84034w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22598a f84035x;

        /* JADX INFO: renamed from: jn1.c$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f84036w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22598a f84037x;

            /* JADX INFO: renamed from: jn1.c$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.homecustomization.presentation.legacy.HomeCustomizationViewModel$special$$inlined$map$2$2", m100430f = "HomeCustomizationViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41856a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f84038E;

                /* JADX INFO: renamed from: F */
                Object f84039F;

                /* JADX INFO: renamed from: G */
                Object f84040G;

                /* JADX INFO: renamed from: H */
                int f84041H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f84042w;

                /* JADX INFO: renamed from: x */
                int f84043x;

                /* JADX INFO: renamed from: y */
                Object f84044y;

                public C41856a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f84042w = obj;
                    this.f84043x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C22598a c22598a) {
                this.f84036w = interfaceC13062m;
                this.f84037x = c22598a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41856a c41856a;
                if (interfaceC30057d instanceof C41856a) {
                    c41856a = (C41856a) interfaceC30057d;
                    int i13 = c41856a.f84043x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41856a.f84043x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41856a = new C41856a(interfaceC30057d);
                    }
                } else {
                    c41856a = new C41856a(interfaceC30057d);
                }
                Object obj2 = c41856a.f84042w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41856a.f84043x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f84036w;
                    AbstractC21805d abstractC21805dM65532b = this.f84037x.m65532b((AbstractC13366c) obj);
                    c41856a.f84044y = null;
                    c41856a.f84038E = null;
                    c41856a.f84039F = null;
                    c41856a.f84040G = null;
                    c41856a.f84041H = 0;
                    c41856a.f84043x = 1;
                    if (interfaceC13062m.emit(abstractC21805dM65532b, c41856a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C22598a c22598a) {
            this.f84034w = interfaceC13058l;
            this.f84035x = c22598a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f84034w.collect(new a(interfaceC13062m, this.f84035x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21804c(C13367d interactor, C22598a reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM61716l = m61716l(new b(c13096w1M36592b, this), interactor);
        this.domainState = interfaceC13058lM61716l;
        this.viewState = AbstractC13091v.m36586L(new c(interfaceC13058lM61716l, reducer), coroutineScope, C13105z1.f45288a, 1);
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC13058l m61716l(InterfaceC13058l interfaceC13058l, C13367d c13367d) {
        return c13367d.interact(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final AbstractC13365b m61717o(AbstractC21803b viewEvent) {
        if (viewEvent instanceof AbstractC21803b.b) {
            return new AbstractC13365b.b(((AbstractC21803b.b) viewEvent).getIsFirstTimeFetch());
        }
        if (viewEvent instanceof AbstractC21803b.e) {
            AbstractC21803b.e eVar = (AbstractC21803b.e) viewEvent;
            return new AbstractC13365b.g(eVar.getFromIndex(), eVar.getToIndex());
        }
        if (viewEvent instanceof AbstractC21803b.a) {
            return new AbstractC13365b.a(((AbstractC21803b.a) viewEvent).getIndex());
        }
        if (viewEvent instanceof AbstractC21803b.d) {
            return new AbstractC13365b.f(((AbstractC21803b.d) viewEvent).getIndex());
        }
        if (viewEvent instanceof AbstractC21803b.f) {
            AbstractC21803b.f fVar = (AbstractC21803b.f) viewEvent;
            return new AbstractC13365b.d(fVar.getIndex(), fVar.getIsToggle());
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC21803b.c.f84009a)) {
            return AbstractC13365b.c.f46720a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final void m61718n(AbstractC21803b viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(viewEvent, null), 3);
    }

    public /* synthetic */ C21804c(C13367d c13367d, C22598a c22598a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c13367d, c22598a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
