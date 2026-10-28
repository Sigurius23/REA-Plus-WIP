package mc2;

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

/* JADX INFO: renamed from: mc2.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020!0 8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, m65681d2 = {"Lmc2/f;", "Landroidx/lifecycle/w1;", "Lmc2/c;", "interactor", "Lmc2/g;", "viewStateReducer", "Lbc3/c0;", "scope", "<init>", "(Lmc2/c;Lmc2/g;Lbc3/c0;)V", "Lec3/l;", "Lmc2/a$a;", "Lmc2/b;", "interact", "(Lec3/l;)Lec3/l;", "Lmc2/e;", "o", "(Lmc2/e;)Lmc2/a$a;", "action", "Ll83/a0;", "p", "(Lmc2/e;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lmc2/c;", "x", "Lmc2/g;", "y", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "Lec3/t1;", "Lmc2/m;", "E", "Lec3/t1;", "n", "()Lec3/t1;", "viewState", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25427f extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13087t1 viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C25424c interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C25428g viewStateReducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: mc2.f$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.referafriendmenu.RafMenuViewModel$sendEvent$1", m100430f = "RafMenuViewModel.kt", m100431l = {29}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f99575w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC25426e f99577y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC25426e abstractC25426e, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f99577y = abstractC25426e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C25427f.this.new a(this.f99577y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f99575w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C25427f.this.eventFlow;
                AbstractC25426e abstractC25426e = this.f99577y;
                this.f99575w = 1;
                if (interfaceC13072o1.emit(abstractC25426e, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: mc2.f$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f99578w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C25427f f99579x;

        /* JADX INFO: renamed from: mc2.f$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f99580w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C25427f f99581x;

            /* JADX INFO: renamed from: mc2.f$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.settings.referafriendmenu.RafMenuViewModel$special$$inlined$map$1$2", m100430f = "RafMenuViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41992a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f99582E;

                /* JADX INFO: renamed from: F */
                Object f99583F;

                /* JADX INFO: renamed from: G */
                Object f99584G;

                /* JADX INFO: renamed from: H */
                int f99585H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f99586w;

                /* JADX INFO: renamed from: x */
                int f99587x;

                /* JADX INFO: renamed from: y */
                Object f99588y;

                public C41992a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f99586w = obj;
                    this.f99587x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C25427f c25427f) {
                this.f99580w = interfaceC13062m;
                this.f99581x = c25427f;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41992a c41992a;
                if (interfaceC30057d instanceof C41992a) {
                    c41992a = (C41992a) interfaceC30057d;
                    int i13 = c41992a.f99587x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41992a.f99587x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41992a = new C41992a(interfaceC30057d);
                    }
                } else {
                    c41992a = new C41992a(interfaceC30057d);
                }
                Object obj2 = c41992a.f99586w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41992a.f99587x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f99580w;
                    AbstractC25422a.a aVarM74640o = this.f99581x.m74640o((AbstractC25426e) obj);
                    c41992a.f99588y = null;
                    c41992a.f99582E = null;
                    c41992a.f99583F = null;
                    c41992a.f99584G = null;
                    c41992a.f99585H = 0;
                    c41992a.f99587x = 1;
                    if (interfaceC13062m.emit(aVarM74640o, c41992a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C25427f c25427f) {
            this.f99578w = interfaceC13058l;
            this.f99579x = c25427f;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f99578w.collect(new a(interfaceC13062m, this.f99579x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mc2.f$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f99590w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C25427f f99591x;

        /* JADX INFO: renamed from: mc2.f$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f99592w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C25427f f99593x;

            /* JADX INFO: renamed from: mc2.f$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.settings.referafriendmenu.RafMenuViewModel$special$$inlined$map$2$2", m100430f = "RafMenuViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41993a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f99594E;

                /* JADX INFO: renamed from: F */
                Object f99595F;

                /* JADX INFO: renamed from: G */
                Object f99596G;

                /* JADX INFO: renamed from: H */
                int f99597H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f99598w;

                /* JADX INFO: renamed from: x */
                int f99599x;

                /* JADX INFO: renamed from: y */
                Object f99600y;

                public C41993a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f99598w = obj;
                    this.f99599x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C25427f c25427f) {
                this.f99592w = interfaceC13062m;
                this.f99593x = c25427f;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41993a c41993a;
                if (interfaceC30057d instanceof C41993a) {
                    c41993a = (C41993a) interfaceC30057d;
                    int i13 = c41993a.f99599x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41993a.f99599x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41993a = new C41993a(interfaceC30057d);
                    }
                } else {
                    c41993a = new C41993a(interfaceC30057d);
                }
                Object obj2 = c41993a.f99598w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41993a.f99599x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f99592w;
                    C25434m c25434mM74643a = this.f99593x.viewStateReducer.m74643a((AbstractC25423b) obj);
                    c41993a.f99600y = null;
                    c41993a.f99594E = null;
                    c41993a.f99595F = null;
                    c41993a.f99596G = null;
                    c41993a.f99597H = 0;
                    c41993a.f99599x = 1;
                    if (interfaceC13062m.emit(c25434mM74643a, c41993a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C25427f c25427f) {
            this.f99590w = interfaceC13058l;
            this.f99591x = c25427f;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f99590w.collect(new a(interfaceC13062m, this.f99591x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25427f(C25424c interactor, C25428g viewStateReducer, InterfaceC2994c0 scope) {
        super(scope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(viewStateReducer, "viewStateReducer");
        AbstractC22676k.m65750j(scope, "scope");
        this.interactor = interactor;
        this.viewStateReducer = viewStateReducer;
        this.scope = scope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(new c(interact(new b(c13096w1M36592b, this)), this), scope, C13105z1.f45288a, 1);
    }

    private final InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return this.interactor.interact(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final AbstractC25422a.a m74640o(AbstractC25426e abstractC25426e) {
        if (abstractC25426e instanceof AbstractC25426e.a) {
            return AbstractC25422a.a.f99532a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final InterfaceC13087t1 getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: p */
    public final void m74642p(AbstractC25426e action) {
        AbstractC22676k.m65750j(action, "action");
        AbstractC3006f0.m8732z(this.scope, null, null, new a(action, null), 3);
    }

    public /* synthetic */ C25427f(C25424c c25424c, C25428g c25428g, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c25424c, c25428g, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
