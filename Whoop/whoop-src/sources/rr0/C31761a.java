package rr0;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import l83.C23454a0;
import nr0.AbstractC27068a;
import nr0.AbstractC27069b;
import nr0.C27070c;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pr0.AbstractC29486a;
import pr0.C29487b;
import pr0.C29488c;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sr0.C32908a;

/* JADX INFO: renamed from: rr0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Lrr0/a;", "Lnr0/b;", "Lpr0/c;", "interactor", "Lsr0/a;", "reducer", "Lor2/m;", "coroutineScope", "<init>", "(Lpr0/c;Lsr0/a;Lor2/m;)V", "Lnr0/a;", "Lpr0/a;", "p", "(Lnr0/a;)Lpr0/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "o", "(Lnr0/a;)V", "y", "Lsr0/a;", "z", "Lor2/m;", "Lec3/o1;", "E", "Lec3/o1;", "communityHighlightsContainerViewEventFlow", "Lec3/l;", "Lpr0/b;", "F", "Lec3/l;", "domainState", "Lec3/f2;", "Lnr0/c;", "G", "Lec3/f2;", "getViewState", "()Lec3/f2;", "viewState", "community-highlights-container-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31761a extends AbstractC27069b {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13072o1 communityHighlightsContainerViewEventFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13037f2 viewState;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C32908a reducer;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C28180m coroutineScope;

    /* JADX INFO: renamed from: rr0.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.communityhighlightscontainer.presentation.CommunityHighlightsContainerViewModelImpl$sendViewEvent$1", m100430f = "CommunityHighlightsContainerViewModelImpl.kt", m100431l = {38}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f131531w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC27068a f131533y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC27068a abstractC27068a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f131533y = abstractC27068a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31761a.this.new a(this.f131533y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f131531w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C31761a.this.communityHighlightsContainerViewEventFlow;
                AbstractC27068a abstractC27068a = this.f131533y;
                this.f131531w = 1;
                if (interfaceC13072o1.emit(abstractC27068a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: rr0.a$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f131534w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C31761a f131535x;

        /* JADX INFO: renamed from: rr0.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f131536w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C31761a f131537x;

            /* JADX INFO: renamed from: rr0.a$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.communityhighlightscontainer.presentation.CommunityHighlightsContainerViewModelImpl$special$$inlined$map$1$2", m100430f = "CommunityHighlightsContainerViewModelImpl.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42288a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f131538E;

                /* JADX INFO: renamed from: F */
                Object f131539F;

                /* JADX INFO: renamed from: G */
                Object f131540G;

                /* JADX INFO: renamed from: H */
                int f131541H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f131542w;

                /* JADX INFO: renamed from: x */
                int f131543x;

                /* JADX INFO: renamed from: y */
                Object f131544y;

                public C42288a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f131542w = obj;
                    this.f131543x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C31761a c31761a) {
                this.f131536w = interfaceC13062m;
                this.f131537x = c31761a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42288a c42288a;
                if (interfaceC30057d instanceof C42288a) {
                    c42288a = (C42288a) interfaceC30057d;
                    int i13 = c42288a.f131543x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42288a.f131543x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42288a = new C42288a(interfaceC30057d);
                    }
                } else {
                    c42288a = new C42288a(interfaceC30057d);
                }
                Object obj2 = c42288a.f131542w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42288a.f131543x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f131536w;
                    AbstractC29486a abstractC29486aM98583p = this.f131537x.m98583p((AbstractC27068a) obj);
                    c42288a.f131544y = null;
                    c42288a.f131538E = null;
                    c42288a.f131539F = null;
                    c42288a.f131540G = null;
                    c42288a.f131541H = 0;
                    c42288a.f131543x = 1;
                    if (interfaceC13062m.emit(abstractC29486aM98583p, c42288a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C31761a c31761a) {
            this.f131534w = interfaceC13058l;
            this.f131535x = c31761a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f131534w.collect(new a(interfaceC13062m, this.f131535x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: rr0.a$c */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f131546w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C31761a f131547x;

        /* JADX INFO: renamed from: rr0.a$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f131548w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C31761a f131549x;

            /* JADX INFO: renamed from: rr0.a$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.communityhighlightscontainer.presentation.CommunityHighlightsContainerViewModelImpl$special$$inlined$map$2$2", m100430f = "CommunityHighlightsContainerViewModelImpl.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42289a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f131550E;

                /* JADX INFO: renamed from: F */
                Object f131551F;

                /* JADX INFO: renamed from: G */
                Object f131552G;

                /* JADX INFO: renamed from: H */
                int f131553H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f131554w;

                /* JADX INFO: renamed from: x */
                int f131555x;

                /* JADX INFO: renamed from: y */
                Object f131556y;

                public C42289a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f131554w = obj;
                    this.f131555x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C31761a c31761a) {
                this.f131548w = interfaceC13062m;
                this.f131549x = c31761a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42289a c42289a;
                if (interfaceC30057d instanceof C42289a) {
                    c42289a = (C42289a) interfaceC30057d;
                    int i13 = c42289a.f131555x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42289a.f131555x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42289a = new C42289a(interfaceC30057d);
                    }
                } else {
                    c42289a = new C42289a(interfaceC30057d);
                }
                Object obj2 = c42289a.f131554w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42289a.f131555x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f131548w;
                    C27070c c27070cM103300a = this.f131549x.reducer.m103300a((C29487b) obj);
                    c42289a.f131556y = null;
                    c42289a.f131550E = null;
                    c42289a.f131551F = null;
                    c42289a.f131552G = null;
                    c42289a.f131553H = 0;
                    c42289a.f131555x = 1;
                    if (interfaceC13062m.emit(c27070cM103300a, c42289a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C31761a c31761a) {
            this.f131546w = interfaceC13058l;
            this.f131547x = c31761a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f131546w.collect(new a(interfaceC13062m, this.f131547x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31761a(C29488c interactor, C32908a reducer, C28180m coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.communityHighlightsContainerViewEventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM90095q = interactor.m90095q(new b(c13096w1M36592b, this));
        this.domainState = interfaceC13058lM90095q;
        this.viewState = AbstractC13091v.m36587M(new c(interfaceC13058lM90095q, this), coroutineScope, C13105z1.f45288a, new C27070c(true, false, false, null, null, null, null, null, 254, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final AbstractC29486a m98583p(AbstractC27068a abstractC27068a) {
        if (abstractC27068a instanceof AbstractC27068a.b) {
            return new AbstractC29486a.b(((AbstractC27068a.b) abstractC27068a).getPath());
        }
        if (abstractC27068a instanceof AbstractC27068a.c) {
            return new AbstractC29486a.c(((AbstractC27068a.c) abstractC27068a).getAction());
        }
        if (abstractC27068a instanceof AbstractC27068a.a) {
            return AbstractC29486a.a.f119745a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo1216g(AbstractC27068a event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    @Override // ld1.AbstractC23864c
    public InterfaceC13037f2 getViewState() {
        return this.viewState;
    }

    public /* synthetic */ C31761a(C29488c c29488c, C32908a c32908a, C28180m c28180m, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c29488c, c32908a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : c28180m);
    }
}
