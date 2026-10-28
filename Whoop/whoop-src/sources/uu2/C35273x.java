package uu2;

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
import vu2.AbstractC36520a;
import vu2.C36522c;
import vu2.C36523d;

/* JADX INFO: renamed from: uu2.x */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020 0\n8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Luu2/x;", "Landroidx/lifecycle/w1;", "Lvu2/d;", "interactor", "Luu2/z;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lvu2/d;Luu2/z;Lbc3/c0;)V", "Lec3/l;", "Lvu2/a;", "Lvu2/c;", "interact", "(Lec3/l;)Lec3/l;", "Luu2/p$g;", "o", "(Luu2/p$g;)Lvu2/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "n", "(Luu2/p$g;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lvu2/d;", "x", "Luu2/z;", "y", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "Luu2/y;", "E", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35273x extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C36523d interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C35275z reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: uu2.x$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.details.ExerciseDetailsV2ViewModel$sendEvent$1", m100430f = "ExerciseDetailsV2ViewModel.kt", m100431l = {35}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f150123w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC35265p.g f150125y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC35265p.g gVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f150125y = gVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C35273x.this.new a(this.f150125y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f150123w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C35273x.this.eventFlow;
                InterfaceC35265p.g gVar = this.f150125y;
                this.f150123w = 1;
                if (interfaceC13072o1.emit(gVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: uu2.x$b */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f150126w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C35273x f150127x;

        /* JADX INFO: renamed from: uu2.x$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f150128w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C35273x f150129x;

            /* JADX INFO: renamed from: uu2.x$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.details.ExerciseDetailsV2ViewModel$special$$inlined$map$1$2", m100430f = "ExerciseDetailsV2ViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42513a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f150130E;

                /* JADX INFO: renamed from: F */
                Object f150131F;

                /* JADX INFO: renamed from: G */
                Object f150132G;

                /* JADX INFO: renamed from: H */
                int f150133H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f150134w;

                /* JADX INFO: renamed from: x */
                int f150135x;

                /* JADX INFO: renamed from: y */
                Object f150136y;

                public C42513a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f150134w = obj;
                    this.f150135x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C35273x c35273x) {
                this.f150128w = interfaceC13062m;
                this.f150129x = c35273x;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42513a c42513a;
                if (interfaceC30057d instanceof C42513a) {
                    c42513a = (C42513a) interfaceC30057d;
                    int i13 = c42513a.f150135x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42513a.f150135x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42513a = new C42513a(interfaceC30057d);
                    }
                } else {
                    c42513a = new C42513a(interfaceC30057d);
                }
                Object obj2 = c42513a.f150134w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42513a.f150135x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f150128w;
                    C35274y c35274yM111933a = this.f150129x.reducer.m111933a((C36522c) obj);
                    c42513a.f150136y = null;
                    c42513a.f150130E = null;
                    c42513a.f150131F = null;
                    c42513a.f150132G = null;
                    c42513a.f150133H = 0;
                    c42513a.f150135x = 1;
                    if (interfaceC13062m.emit(c35274yM111933a, c42513a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C35273x c35273x) {
            this.f150126w = interfaceC13058l;
            this.f150127x = c35273x;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f150126w.collect(new a(interfaceC13062m, this.f150127x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: uu2.x$c */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f150138w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C35273x f150139x;

        /* JADX INFO: renamed from: uu2.x$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f150140w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C35273x f150141x;

            /* JADX INFO: renamed from: uu2.x$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.details.ExerciseDetailsV2ViewModel$special$$inlined$mapNotNull$1$2", m100430f = "ExerciseDetailsV2ViewModel.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42514a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f150142E;

                /* JADX INFO: renamed from: F */
                Object f150143F;

                /* JADX INFO: renamed from: G */
                Object f150144G;

                /* JADX INFO: renamed from: H */
                Object f150145H;

                /* JADX INFO: renamed from: I */
                int f150146I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f150147w;

                /* JADX INFO: renamed from: x */
                int f150148x;

                /* JADX INFO: renamed from: y */
                Object f150149y;

                public C42514a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f150147w = obj;
                    this.f150148x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C35273x c35273x) {
                this.f150140w = interfaceC13062m;
                this.f150141x = c35273x;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42514a c42514a;
                if (interfaceC30057d instanceof C42514a) {
                    c42514a = (C42514a) interfaceC30057d;
                    int i13 = c42514a.f150148x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42514a.f150148x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42514a = new C42514a(interfaceC30057d);
                    }
                } else {
                    c42514a = new C42514a(interfaceC30057d);
                }
                Object obj2 = c42514a.f150147w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42514a.f150148x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f150140w;
                    AbstractC36520a abstractC36520aM111926o = this.f150141x.m111926o((InterfaceC35265p.g) obj);
                    if (abstractC36520aM111926o != null) {
                        c42514a.f150149y = null;
                        c42514a.f150142E = null;
                        c42514a.f150143F = null;
                        c42514a.f150144G = null;
                        c42514a.f150145H = null;
                        c42514a.f150146I = 0;
                        c42514a.f150148x = 1;
                        if (interfaceC13062m.emit(abstractC36520aM111926o, c42514a) == enumC31071a) {
                            return enumC31071a;
                        }
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

        public c(InterfaceC13058l interfaceC13058l, C35273x c35273x) {
            this.f150138w = interfaceC13058l;
            this.f150139x = c35273x;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f150138w.collect(new a(interfaceC13062m, this.f150139x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35273x(C36523d interactor, C35275z reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(new b(interact(new c(c13096w1M36592b, this)), this), coroutineScope, C13105z1.f45288a, 1);
    }

    private final InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return this.interactor.interact(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final AbstractC36520a m111926o(InterfaceC35265p.g gVar) {
        if (gVar instanceof InterfaceC35265p.d) {
            InterfaceC35265p.d dVar = (InterfaceC35265p.d) gVar;
            return new AbstractC36520a.b(dVar.getExerciseId(), dVar.getEntryPointType(), dVar.getAnalyticsEntryPoint());
        }
        if (gVar instanceof InterfaceC35265p.b) {
            return new AbstractC36520a.a(((InterfaceC35265p.b) gVar).getExerciseId());
        }
        if (gVar instanceof InterfaceC35265p.f) {
            return new AbstractC36520a.c(((InterfaceC35265p.f) gVar).getAction());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final void m111927n(InterfaceC35265p.g event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C35273x(C36523d c36523d, C35275z c35275z, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c36523d, c35275z, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
