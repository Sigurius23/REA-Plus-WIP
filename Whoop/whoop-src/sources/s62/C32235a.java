package s62;

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
import ec3.InterfaceC13087t1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j62.AbstractC21376a;
import j62.C21377b;
import j62.C21379d;
import l83.C23454a0;
import m62.EnumC25117h;
import m62.InterfaceC25116g;
import m62.InterfaceC25119j;
import n62.C26408a;
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

/* JADX INFO: renamed from: s62.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, m65681d2 = {"Ls62/a;", "Landroidx/lifecycle/w1;", "Lj62/d;", "interactor", "Ln62/a;", "viewStateReducer", "Lbc3/c0;", "scope", "<init>", "(Lj62/d;Ln62/a;Lbc3/c0;)V", "Lm62/j;", "Lj62/a;", "p", "(Lm62/j;)Lj62/a;", "action", "Ll83/a0;", "o", "(Lm62/j;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lj62/d;", "x", "Ln62/a;", "y", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "Lec3/t1;", "Lm62/g;", "E", "Lec3/t1;", "n", "()Lec3/t1;", "viewState", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32235a extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13087t1 viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C21379d interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C26408a viewStateReducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: s62.a$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f133460a;

        static {
            int[] iArr = new int[EnumC25117h.values().length];
            try {
                iArr[EnumC25117h.PROMOTION_REWARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC25117h.PROMOTION_TERMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f133460a = iArr;
        }
    }

    /* JADX INFO: renamed from: s62.a$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.referafriend.viewmodel.ReferAFriendViewModel$sendEvent$1", m100430f = "ReferAFriendViewModel.kt", m100431l = {34}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f133461w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC25119j f133463y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC25119j interfaceC25119j, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f133463y = interfaceC25119j;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C32235a.this.new b(this.f133463y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f133461w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C32235a.this.eventFlow;
                InterfaceC25119j interfaceC25119j = this.f133463y;
                this.f133461w = 1;
                if (interfaceC13072o1.emit(interfaceC25119j, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: s62.a$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f133464w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C32235a f133465x;

        /* JADX INFO: renamed from: s62.a$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f133466w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C32235a f133467x;

            /* JADX INFO: renamed from: s62.a$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.referafriend.viewmodel.ReferAFriendViewModel$special$$inlined$map$1$2", m100430f = "ReferAFriendViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42313a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f133468E;

                /* JADX INFO: renamed from: F */
                Object f133469F;

                /* JADX INFO: renamed from: G */
                Object f133470G;

                /* JADX INFO: renamed from: H */
                int f133471H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f133472w;

                /* JADX INFO: renamed from: x */
                int f133473x;

                /* JADX INFO: renamed from: y */
                Object f133474y;

                public C42313a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f133472w = obj;
                    this.f133473x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C32235a c32235a) {
                this.f133466w = interfaceC13062m;
                this.f133467x = c32235a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42313a c42313a;
                if (interfaceC30057d instanceof C42313a) {
                    c42313a = (C42313a) interfaceC30057d;
                    int i13 = c42313a.f133473x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42313a.f133473x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42313a = new C42313a(interfaceC30057d);
                    }
                } else {
                    c42313a = new C42313a(interfaceC30057d);
                }
                Object obj2 = c42313a.f133472w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42313a.f133473x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f133466w;
                    AbstractC21376a abstractC21376aM100284p = this.f133467x.m100284p((InterfaceC25119j) obj);
                    c42313a.f133474y = null;
                    c42313a.f133468E = null;
                    c42313a.f133469F = null;
                    c42313a.f133470G = null;
                    c42313a.f133471H = 0;
                    c42313a.f133473x = 1;
                    if (interfaceC13062m.emit(abstractC21376aM100284p, c42313a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C32235a c32235a) {
            this.f133464w = interfaceC13058l;
            this.f133465x = c32235a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f133464w.collect(new a(interfaceC13062m, this.f133465x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: s62.a$d */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f133476w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C32235a f133477x;

        /* JADX INFO: renamed from: s62.a$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f133478w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C32235a f133479x;

            /* JADX INFO: renamed from: s62.a$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.referafriend.viewmodel.ReferAFriendViewModel$special$$inlined$map$2$2", m100430f = "ReferAFriendViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42314a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f133480E;

                /* JADX INFO: renamed from: F */
                Object f133481F;

                /* JADX INFO: renamed from: G */
                Object f133482G;

                /* JADX INFO: renamed from: H */
                int f133483H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f133484w;

                /* JADX INFO: renamed from: x */
                int f133485x;

                /* JADX INFO: renamed from: y */
                Object f133486y;

                public C42314a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f133484w = obj;
                    this.f133485x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C32235a c32235a) {
                this.f133478w = interfaceC13062m;
                this.f133479x = c32235a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42314a c42314a;
                if (interfaceC30057d instanceof C42314a) {
                    c42314a = (C42314a) interfaceC30057d;
                    int i13 = c42314a.f133485x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42314a.f133485x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42314a = new C42314a(interfaceC30057d);
                    }
                } else {
                    c42314a = new C42314a(interfaceC30057d);
                }
                Object obj2 = c42314a.f133484w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42314a.f133485x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f133478w;
                    InterfaceC25116g interfaceC25116gM78138d = this.f133479x.viewStateReducer.m78138d((C21377b) obj);
                    c42314a.f133486y = null;
                    c42314a.f133480E = null;
                    c42314a.f133481F = null;
                    c42314a.f133482G = null;
                    c42314a.f133483H = 0;
                    c42314a.f133485x = 1;
                    if (interfaceC13062m.emit(interfaceC25116gM78138d, c42314a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l, C32235a c32235a) {
            this.f133476w = interfaceC13058l;
            this.f133477x = c32235a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f133476w.collect(new a(interfaceC13062m, this.f133477x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32235a(C21379d interactor, C26408a viewStateReducer, InterfaceC2994c0 scope) {
        super(scope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(viewStateReducer, "viewStateReducer");
        AbstractC22676k.m65750j(scope, "scope");
        this.interactor = interactor;
        this.viewStateReducer = viewStateReducer;
        this.scope = scope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(new d(AbstractC27845h.m83945a(new c(c13096w1M36592b, this), interactor), this), scope, C13105z1.f45288a, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final AbstractC21376a m100284p(InterfaceC25119j interfaceC25119j) {
        if (interfaceC25119j instanceof InterfaceC25119j.c) {
            return new AbstractC21376a.c(((InterfaceC25119j.c) interfaceC25119j).getSource());
        }
        if (interfaceC25119j instanceof InterfaceC25119j.d) {
            int i13 = a.f133460a[((InterfaceC25119j.d) interfaceC25119j).getModal().ordinal()];
            if (i13 == 1) {
                return AbstractC21376a.d.f81763a;
            }
            if (i13 == 2) {
                return AbstractC21376a.e.f81764a;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (AbstractC22676k.m65745e(interfaceC25119j, InterfaceC25119j.a.f98451a)) {
            return AbstractC21376a.a.f81760a;
        }
        if (AbstractC22676k.m65745e(interfaceC25119j, InterfaceC25119j.b.f98452a)) {
            return AbstractC21376a.b.f81761a;
        }
        if (AbstractC22676k.m65745e(interfaceC25119j, InterfaceC25119j.e.f98455a)) {
            return AbstractC21376a.f.f81765a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final InterfaceC13087t1 getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: o */
    public final void m100286o(InterfaceC25119j action) {
        AbstractC22676k.m65750j(action, "action");
        AbstractC3006f0.m8732z(this.scope, null, null, new b(action, null), 3);
    }

    public /* synthetic */ C32235a(C21379d c21379d, C26408a c26408a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c21379d, c26408a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
