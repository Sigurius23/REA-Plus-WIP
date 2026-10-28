package hd2;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ed2.AbstractC13114a;
import ed2.C13115b;
import ed2.C13116c;
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

/* JADX INFO: renamed from: hd2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020'0\n8\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010*¨\u0006,"}, m65681d2 = {"Lhd2/c;", "Landroidx/lifecycle/w1;", "Led2/c;", "interactor", "Lhd2/e;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Led2/c;Lhd2/e;Lbc3/c0;)V", "Lec3/l;", "Led2/a;", "Led2/b;", "interact", "(Lec3/l;)Lec3/l;", "Lhd2/b;", "p", "(Lhd2/b;)Led2/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "o", "(Lhd2/b;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Led2/c;", "x", "Lhd2/e;", "y", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "", "E", "Ljava/lang/String;", "analyticsSource", "F", "Lec3/l;", "domainState", "Lhd2/d;", "G", "getViewState", "()Lec3/l;", "viewState", "share_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17201c extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private String analyticsSource;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C13116c interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C17203e reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: hd2.c$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.share.presentation.ShareViewModel$sendViewEvent$1", m100430f = "ShareViewModel.kt", m100431l = {37}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f66049w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC17200b f66051y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC17200b abstractC17200b, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f66051y = abstractC17200b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C17201c.this.new a(this.f66051y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f66049w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C17201c.this.eventFlow;
                AbstractC17200b abstractC17200b = this.f66051y;
                this.f66049w = 1;
                if (interfaceC13072o1.emit(abstractC17200b, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: hd2.c$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f66052w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C17201c f66053x;

        /* JADX INFO: renamed from: hd2.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f66054w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C17201c f66055x;

            /* JADX INFO: renamed from: hd2.c$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.share.presentation.ShareViewModel$special$$inlined$map$1$2", m100430f = "ShareViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41692a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f66056E;

                /* JADX INFO: renamed from: F */
                Object f66057F;

                /* JADX INFO: renamed from: G */
                Object f66058G;

                /* JADX INFO: renamed from: H */
                int f66059H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f66060w;

                /* JADX INFO: renamed from: x */
                int f66061x;

                /* JADX INFO: renamed from: y */
                Object f66062y;

                public C41692a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f66060w = obj;
                    this.f66061x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C17201c c17201c) {
                this.f66054w = interfaceC13062m;
                this.f66055x = c17201c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41692a c41692a;
                if (interfaceC30057d instanceof C41692a) {
                    c41692a = (C41692a) interfaceC30057d;
                    int i13 = c41692a.f66061x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41692a.f66061x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41692a = new C41692a(interfaceC30057d);
                    }
                } else {
                    c41692a = new C41692a(interfaceC30057d);
                }
                Object obj2 = c41692a.f66060w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41692a.f66061x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f66054w;
                    AbstractC13114a abstractC13114aM48577p = this.f66055x.m48577p((AbstractC17200b) obj);
                    c41692a.f66062y = null;
                    c41692a.f66056E = null;
                    c41692a.f66057F = null;
                    c41692a.f66058G = null;
                    c41692a.f66059H = 0;
                    c41692a.f66061x = 1;
                    if (interfaceC13062m.emit(abstractC13114aM48577p, c41692a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C17201c c17201c) {
            this.f66052w = interfaceC13058l;
            this.f66053x = c17201c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f66052w.collect(new a(interfaceC13062m, this.f66053x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: hd2.c$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f66064w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C17201c f66065x;

        /* JADX INFO: renamed from: hd2.c$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f66066w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C17201c f66067x;

            /* JADX INFO: renamed from: hd2.c$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.share.presentation.ShareViewModel$special$$inlined$map$2$2", m100430f = "ShareViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41693a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f66068E;

                /* JADX INFO: renamed from: F */
                Object f66069F;

                /* JADX INFO: renamed from: G */
                Object f66070G;

                /* JADX INFO: renamed from: H */
                int f66071H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f66072w;

                /* JADX INFO: renamed from: x */
                int f66073x;

                /* JADX INFO: renamed from: y */
                Object f66074y;

                public C41693a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f66072w = obj;
                    this.f66073x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C17201c c17201c) {
                this.f66066w = interfaceC13062m;
                this.f66067x = c17201c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41693a c41693a;
                if (interfaceC30057d instanceof C41693a) {
                    c41693a = (C41693a) interfaceC30057d;
                    int i13 = c41693a.f66073x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41693a.f66073x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41693a = new C41693a(interfaceC30057d);
                    }
                } else {
                    c41693a = new C41693a(interfaceC30057d);
                }
                Object obj2 = c41693a.f66072w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41693a.f66073x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f66066w;
                    C17202d c17202dM48594a = this.f66067x.reducer.m48594a((C13115b) obj, this.f66067x.analyticsSource);
                    c41693a.f66074y = null;
                    c41693a.f66068E = null;
                    c41693a.f66069F = null;
                    c41693a.f66070G = null;
                    c41693a.f66071H = 0;
                    c41693a.f66073x = 1;
                    if (interfaceC13062m.emit(c17202dM48594a, c41693a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C17201c c17201c) {
            this.f66064w = interfaceC13058l;
            this.f66065x = c17201c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f66064w.collect(new a(interfaceC13062m, this.f66065x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17201c(C13116c interactor, C17203e reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lInteract = interact(new b(c13096w1M36592b, this));
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lInteract, coroutineScope, c13021b2, 1);
        this.domainState = c13078q1M36586L;
        this.viewState = AbstractC13091v.m36586L(new c(c13078q1M36586L, this), coroutineScope, c13021b2, 1);
    }

    private final InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return this.interactor.interact(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final AbstractC13114a m48577p(AbstractC17200b abstractC17200b) {
        if (!(abstractC17200b instanceof AbstractC17200b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC17200b.a aVar = (AbstractC17200b.a) abstractC17200b;
        this.analyticsSource = aVar.getSource();
        return new AbstractC13114a.a(aVar.getPath());
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: o */
    public final void m48578o(AbstractC17200b event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C17201c(C13116c c13116c, C17203e c17203e, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c13116c, c17203e, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
