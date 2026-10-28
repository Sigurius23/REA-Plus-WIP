package pl2;

import androidx.core.app.NotificationCompat;
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
import ol2.AbstractC28019b;
import ol2.C28020c;
import ol2.C28021d;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p728ql2.AbstractC30475b;
import p728ql2.C30476c;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: pl2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020 0\n8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Lpl2/a;", "Landroidx/lifecycle/w1;", "Lol2/d;", "interactor", "Lpl2/b;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lol2/d;Lpl2/b;Lbc3/c0;)V", "Lec3/l;", "Lol2/b;", "Lol2/c;", "interact", "(Lec3/l;)Lec3/l;", "Lql2/b;", "o", "(Lql2/b;)Lol2/b;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "n", "(Lql2/b;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lol2/d;", "x", "Lpl2/b;", "y", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "Lql2/c;", "E", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29351a extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C28021d interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C29352b reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: pl2.a$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.training.locationsettings.presentation.LocationSettingsViewModel$sendViewEvent$1", m100430f = "LocationSettingsViewModel.kt", m100431l = {34}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f118966w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC30475b f118968y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC30475b abstractC30475b, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f118968y = abstractC30475b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C29351a.this.new a(this.f118968y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f118966w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C29351a.this.eventFlow;
                AbstractC30475b abstractC30475b = this.f118968y;
                this.f118966w = 1;
                if (interfaceC13072o1.emit(abstractC30475b, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: pl2.a$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f118969w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C29351a f118970x;

        /* JADX INFO: renamed from: pl2.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f118971w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C29351a f118972x;

            /* JADX INFO: renamed from: pl2.a$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.training.locationsettings.presentation.LocationSettingsViewModel$special$$inlined$map$1$2", m100430f = "LocationSettingsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42171a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f118973E;

                /* JADX INFO: renamed from: F */
                Object f118974F;

                /* JADX INFO: renamed from: G */
                Object f118975G;

                /* JADX INFO: renamed from: H */
                int f118976H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f118977w;

                /* JADX INFO: renamed from: x */
                int f118978x;

                /* JADX INFO: renamed from: y */
                Object f118979y;

                public C42171a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f118977w = obj;
                    this.f118978x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C29351a c29351a) {
                this.f118971w = interfaceC13062m;
                this.f118972x = c29351a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42171a c42171a;
                if (interfaceC30057d instanceof C42171a) {
                    c42171a = (C42171a) interfaceC30057d;
                    int i13 = c42171a.f118978x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42171a.f118978x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42171a = new C42171a(interfaceC30057d);
                    }
                } else {
                    c42171a = new C42171a(interfaceC30057d);
                }
                Object obj2 = c42171a.f118977w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42171a.f118978x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f118971w;
                    AbstractC28019b abstractC28019bM89457o = this.f118972x.m89457o((AbstractC30475b) obj);
                    c42171a.f118979y = null;
                    c42171a.f118973E = null;
                    c42171a.f118974F = null;
                    c42171a.f118975G = null;
                    c42171a.f118976H = 0;
                    c42171a.f118978x = 1;
                    if (interfaceC13062m.emit(abstractC28019bM89457o, c42171a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C29351a c29351a) {
            this.f118969w = interfaceC13058l;
            this.f118970x = c29351a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f118969w.collect(new a(interfaceC13062m, this.f118970x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: pl2.a$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f118981w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C29351a f118982x;

        /* JADX INFO: renamed from: pl2.a$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f118983w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C29351a f118984x;

            /* JADX INFO: renamed from: pl2.a$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.training.locationsettings.presentation.LocationSettingsViewModel$special$$inlined$map$2$2", m100430f = "LocationSettingsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42172a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f118985E;

                /* JADX INFO: renamed from: F */
                Object f118986F;

                /* JADX INFO: renamed from: G */
                Object f118987G;

                /* JADX INFO: renamed from: H */
                int f118988H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f118989w;

                /* JADX INFO: renamed from: x */
                int f118990x;

                /* JADX INFO: renamed from: y */
                Object f118991y;

                public C42172a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f118989w = obj;
                    this.f118990x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C29351a c29351a) {
                this.f118983w = interfaceC13062m;
                this.f118984x = c29351a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42172a c42172a;
                if (interfaceC30057d instanceof C42172a) {
                    c42172a = (C42172a) interfaceC30057d;
                    int i13 = c42172a.f118990x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42172a.f118990x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42172a = new C42172a(interfaceC30057d);
                    }
                } else {
                    c42172a = new C42172a(interfaceC30057d);
                }
                Object obj2 = c42172a.f118989w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42172a.f118990x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f118983w;
                    C30476c c30476cM89459a = this.f118984x.reducer.m89459a((C28020c) obj);
                    c42172a.f118991y = null;
                    c42172a.f118985E = null;
                    c42172a.f118986F = null;
                    c42172a.f118987G = null;
                    c42172a.f118988H = 0;
                    c42172a.f118990x = 1;
                    if (interfaceC13062m.emit(c30476cM89459a, c42172a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C29351a c29351a) {
            this.f118981w = interfaceC13058l;
            this.f118982x = c29351a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f118981w.collect(new a(interfaceC13062m, this.f118982x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29351a(C28021d interactor, C29352b reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(new c(interact(new b(c13096w1M36592b, this)), this), coroutineScope, C13105z1.f45288a, 1);
    }

    private final InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return this.interactor.interact(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final AbstractC28019b m89457o(AbstractC30475b abstractC30475b) {
        if (abstractC30475b instanceof AbstractC30475b.c) {
            return AbstractC28019b.d.f113041a;
        }
        if (abstractC30475b instanceof AbstractC30475b.a) {
            return new AbstractC28019b.b(((AbstractC30475b.a) abstractC30475b).getIsGranted());
        }
        if (abstractC30475b instanceof AbstractC30475b.d) {
            return AbstractC28019b.e.f113042a;
        }
        if (abstractC30475b instanceof AbstractC30475b.b) {
            return AbstractC28019b.c.f113040a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final void m89458n(AbstractC30475b event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C29351a(C28021d c28021d, C29352b c29352b, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c28021d, c29352b, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
