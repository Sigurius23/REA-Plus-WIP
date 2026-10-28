package zn0;

import androidx.lifecycle.AbstractC1637w1;
import ao0.C1865a;
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
import vn0.AbstractC36192b;
import vn0.C36193c;
import vn0.C36194d;

/* JADX INFO: renamed from: zn0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\n8\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\"¨\u0006$"}, m65681d2 = {"Lzn0/b;", "Landroidx/lifecycle/w1;", "Lvn0/d;", "interactor", "Lao0/a;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lvn0/d;Lao0/a;Lbc3/c0;)V", "Lec3/l;", "Lvn0/b;", "Lvn0/c;", "l", "(Lec3/l;Lvn0/d;)Lec3/l;", "Lzn0/a;", "o", "(Lzn0/a;)Lvn0/b;", "viewEvent", "Ll83/a0;", "n", "(Lzn0/a;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "Lec3/o1;", "x", "Lec3/o1;", "eventFlow", "y", "Lec3/l;", "domainState", "Lzn0/c;", "z", "getViewState", "()Lec3/l;", "viewState", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40904b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: zn0.b$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.changepassword.presentation.ChangePasswordViewModel$sendViewEvent$1", m100430f = "ChangePasswordViewModel.kt", m100431l = {37}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f176269w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC40903a f176271y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC40903a abstractC40903a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f176271y = abstractC40903a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C40904b.this.new a(this.f176271y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f176269w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C40904b.this.eventFlow;
                AbstractC40903a abstractC40903a = this.f176271y;
                this.f176269w = 1;
                if (interfaceC13072o1.emit(abstractC40903a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: zn0.b$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f176272w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C40904b f176273x;

        /* JADX INFO: renamed from: zn0.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f176274w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C40904b f176275x;

            /* JADX INFO: renamed from: zn0.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.changepassword.presentation.ChangePasswordViewModel$special$$inlined$map$1$2", m100430f = "ChangePasswordViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42763a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f176276E;

                /* JADX INFO: renamed from: F */
                Object f176277F;

                /* JADX INFO: renamed from: G */
                Object f176278G;

                /* JADX INFO: renamed from: H */
                int f176279H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f176280w;

                /* JADX INFO: renamed from: x */
                int f176281x;

                /* JADX INFO: renamed from: y */
                Object f176282y;

                public C42763a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f176280w = obj;
                    this.f176281x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C40904b c40904b) {
                this.f176274w = interfaceC13062m;
                this.f176275x = c40904b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42763a c42763a;
                if (interfaceC30057d instanceof C42763a) {
                    c42763a = (C42763a) interfaceC30057d;
                    int i13 = c42763a.f176281x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42763a.f176281x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42763a = new C42763a(interfaceC30057d);
                    }
                } else {
                    c42763a = new C42763a(interfaceC30057d);
                }
                Object obj2 = c42763a.f176280w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42763a.f176281x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f176274w;
                    AbstractC36192b abstractC36192bM132570o = this.f176275x.m132570o((AbstractC40903a) obj);
                    c42763a.f176282y = null;
                    c42763a.f176276E = null;
                    c42763a.f176277F = null;
                    c42763a.f176278G = null;
                    c42763a.f176279H = 0;
                    c42763a.f176281x = 1;
                    if (interfaceC13062m.emit(abstractC36192bM132570o, c42763a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C40904b c40904b) {
            this.f176272w = interfaceC13058l;
            this.f176273x = c40904b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f176272w.collect(new a(interfaceC13062m, this.f176273x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zn0.b$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f176284w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C1865a f176285x;

        /* JADX INFO: renamed from: zn0.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f176286w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C1865a f176287x;

            /* JADX INFO: renamed from: zn0.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.changepassword.presentation.ChangePasswordViewModel$special$$inlined$map$2$2", m100430f = "ChangePasswordViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42764a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f176288E;

                /* JADX INFO: renamed from: F */
                Object f176289F;

                /* JADX INFO: renamed from: G */
                Object f176290G;

                /* JADX INFO: renamed from: H */
                int f176291H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f176292w;

                /* JADX INFO: renamed from: x */
                int f176293x;

                /* JADX INFO: renamed from: y */
                Object f176294y;

                public C42764a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f176292w = obj;
                    this.f176293x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C1865a c1865a) {
                this.f176286w = interfaceC13062m;
                this.f176287x = c1865a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42764a c42764a;
                if (interfaceC30057d instanceof C42764a) {
                    c42764a = (C42764a) interfaceC30057d;
                    int i13 = c42764a.f176293x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42764a.f176293x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42764a = new C42764a(interfaceC30057d);
                    }
                } else {
                    c42764a = new C42764a(interfaceC30057d);
                }
                Object obj2 = c42764a.f176292w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42764a.f176293x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f176286w;
                    C40905c c40905cM5531d = this.f176287x.m5531d((C36193c) obj);
                    c42764a.f176294y = null;
                    c42764a.f176288E = null;
                    c42764a.f176289F = null;
                    c42764a.f176290G = null;
                    c42764a.f176291H = 0;
                    c42764a.f176293x = 1;
                    if (interfaceC13062m.emit(c40905cM5531d, c42764a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C1865a c1865a) {
            this.f176284w = interfaceC13058l;
            this.f176285x = c1865a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f176284w.collect(new a(interfaceC13062m, this.f176285x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40904b(C36194d interactor, C1865a reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM132569l = m132569l(new b(c13096w1M36592b, this), interactor);
        this.domainState = interfaceC13058lM132569l;
        this.viewState = new c(AbstractC13091v.m36586L(interfaceC13058lM132569l, coroutineScope, C13105z1.f45288a, 1), reducer);
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC13058l m132569l(InterfaceC13058l interfaceC13058l, C36194d c36194d) {
        return c36194d.interact(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final AbstractC36192b m132570o(AbstractC40903a abstractC40903a) {
        if (abstractC40903a instanceof AbstractC40903a.e) {
            return AbstractC36192b.c.f154931a;
        }
        if (abstractC40903a instanceof AbstractC40903a.f) {
            return new AbstractC36192b.f(((AbstractC40903a.f) abstractC40903a).getPassword());
        }
        if (abstractC40903a instanceof AbstractC40903a.c) {
            return new AbstractC36192b.e(((AbstractC40903a.c) abstractC40903a).getPassword());
        }
        if (abstractC40903a instanceof AbstractC40903a.a) {
            AbstractC40903a.a aVar = (AbstractC40903a.a) abstractC40903a;
            return new AbstractC36192b.d(aVar.getOldPassword(), aVar.getNewPassword(), aVar.getConfirmPassword());
        }
        if (abstractC40903a instanceof AbstractC40903a.b) {
            return new AbstractC36192b.a(((AbstractC40903a.b) abstractC40903a).getIsVisible());
        }
        if (abstractC40903a instanceof AbstractC40903a.d) {
            return AbstractC36192b.b.f154930a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final void m132571n(AbstractC40903a viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(viewEvent, null), 3);
    }

    public /* synthetic */ C40904b(C36194d c36194d, C1865a c1865a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c36194d, c1865a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
