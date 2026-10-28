package g02;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c02.AbstractC3810a;
import c02.AbstractC3811b;
import c02.C3812c;
import c93.InterfaceC4351m;
import e02.C12507c;
import e02.C12509e;
import e02.C12511g;
import e02.C12512h;
import e02.InterfaceC12510f;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
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

/* JADX INFO: renamed from: g02.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m65681d2 = {"Lg02/a;", "Landroidx/lifecycle/w1;", "Lc02/c;", "interactor", "Le02/h;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lc02/c;Le02/h;Lbc3/c0;)V", "Le02/f;", "Lc02/a;", "o", "(Le02/f;)Lc02/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "n", "(Le02/f;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Le02/h;", "x", "Lbc3/c0;", "Lec3/o1;", "y", "Lec3/o1;", "sizeGuideViewEventFlow", "Lec3/l;", "Le02/g;", "z", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14945a extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C12512h reducer;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13072o1 sizeGuideViewEventFlow;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: g02.a$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.nativestore.pdp.sizeguide.viewmodel.SizeGuideViewModel$sendViewEvent$1", m100430f = "SizeGuideViewModel.kt", m100431l = {35}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f55733w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC12510f f55735y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC12510f interfaceC12510f, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f55735y = interfaceC12510f;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C14945a.this.new a(this.f55735y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f55733w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C14945a.this.sizeGuideViewEventFlow;
                InterfaceC12510f interfaceC12510f = this.f55735y;
                this.f55733w = 1;
                if (interfaceC13072o1.emit(interfaceC12510f, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: g02.a$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f55736w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C14945a f55737x;

        /* JADX INFO: renamed from: g02.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f55738w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C14945a f55739x;

            /* JADX INFO: renamed from: g02.a$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.nativestore.pdp.sizeguide.viewmodel.SizeGuideViewModel$special$$inlined$map$1$2", m100430f = "SizeGuideViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41615a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f55740E;

                /* JADX INFO: renamed from: F */
                Object f55741F;

                /* JADX INFO: renamed from: G */
                Object f55742G;

                /* JADX INFO: renamed from: H */
                int f55743H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f55744w;

                /* JADX INFO: renamed from: x */
                int f55745x;

                /* JADX INFO: renamed from: y */
                Object f55746y;

                public C41615a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f55744w = obj;
                    this.f55745x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C14945a c14945a) {
                this.f55738w = interfaceC13062m;
                this.f55739x = c14945a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41615a c41615a;
                if (interfaceC30057d instanceof C41615a) {
                    c41615a = (C41615a) interfaceC30057d;
                    int i13 = c41615a.f55745x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41615a.f55745x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41615a = new C41615a(interfaceC30057d);
                    }
                } else {
                    c41615a = new C41615a(interfaceC30057d);
                }
                Object obj2 = c41615a.f55744w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41615a.f55745x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f55738w;
                    AbstractC3810a abstractC3810aM43064o = this.f55739x.m43064o((InterfaceC12510f) obj);
                    c41615a.f55746y = null;
                    c41615a.f55740E = null;
                    c41615a.f55741F = null;
                    c41615a.f55742G = null;
                    c41615a.f55743H = 0;
                    c41615a.f55745x = 1;
                    if (interfaceC13062m.emit(abstractC3810aM43064o, c41615a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C14945a c14945a) {
            this.f55736w = interfaceC13058l;
            this.f55737x = c14945a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f55736w.collect(new a(interfaceC13062m, this.f55737x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: g02.a$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f55748w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C14945a f55749x;

        /* JADX INFO: renamed from: g02.a$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f55750w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C14945a f55751x;

            /* JADX INFO: renamed from: g02.a$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.nativestore.pdp.sizeguide.viewmodel.SizeGuideViewModel$special$$inlined$map$2$2", m100430f = "SizeGuideViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41616a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f55752E;

                /* JADX INFO: renamed from: F */
                Object f55753F;

                /* JADX INFO: renamed from: G */
                Object f55754G;

                /* JADX INFO: renamed from: H */
                int f55755H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f55756w;

                /* JADX INFO: renamed from: x */
                int f55757x;

                /* JADX INFO: renamed from: y */
                Object f55758y;

                public C41616a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f55756w = obj;
                    this.f55757x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C14945a c14945a) {
                this.f55750w = interfaceC13062m;
                this.f55751x = c14945a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41616a c41616a;
                if (interfaceC30057d instanceof C41616a) {
                    c41616a = (C41616a) interfaceC30057d;
                    int i13 = c41616a.f55757x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41616a.f55757x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41616a = new C41616a(interfaceC30057d);
                    }
                } else {
                    c41616a = new C41616a(interfaceC30057d);
                }
                Object obj2 = c41616a.f55756w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41616a.f55757x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f55750w;
                    C12511g c12511gM35159d = this.f55751x.reducer.m35159d((AbstractC3811b) obj);
                    c41616a.f55758y = null;
                    c41616a.f55752E = null;
                    c41616a.f55753F = null;
                    c41616a.f55754G = null;
                    c41616a.f55755H = 0;
                    c41616a.f55757x = 1;
                    if (interfaceC13062m.emit(c12511gM35159d, c41616a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C14945a c14945a) {
            this.f55748w = interfaceC13058l;
            this.f55749x = c14945a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f55748w.collect(new a(interfaceC13062m, this.f55749x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14945a(C3812c interactor, C12512h reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.sizeGuideViewEventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(new c(AbstractC27845h.m83945a(new b(c13096w1M36592b, this), interactor), this), coroutineScope, C13105z1.f45288a, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final AbstractC3810a m43064o(InterfaceC12510f interfaceC12510f) {
        if (interfaceC12510f instanceof C12507c) {
            return new AbstractC3810a.a(((C12507c) interfaceC12510f).getKey());
        }
        if (interfaceC12510f instanceof C12509e) {
            return new AbstractC3810a.a(((C12509e) interfaceC12510f).getKey());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final void m43065n(InterfaceC12510f event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C14945a(C3812c c3812c, C12512h c12512h, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3812c, c12512h, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
