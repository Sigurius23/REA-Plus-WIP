package gv2;

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
import fv2.AbstractC14817b;
import fv2.C14818c;
import fv2.C14819d;
import hv2.C17689k;
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

/* JADX INFO: renamed from: gv2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020 0\n8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Lgv2/b;", "Landroidx/lifecycle/w1;", "Lfv2/d;", "interactor", "Lgv2/c;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lfv2/d;Lgv2/c;Lbc3/c0;)V", "Lec3/l;", "Lfv2/b;", "Lfv2/c;", "interact", "(Lec3/l;)Lec3/l;", "Lgv2/a$q;", "o", "(Lgv2/a$q;)Lfv2/b;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "n", "(Lgv2/a$q;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lfv2/d;", "x", "Lgv2/c;", "y", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "Lhv2/k;", "E", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C16244b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C14819d interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C16245c reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: gv2.b$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.customexercise.presentation.CustomExerciseViewModel$sendViewEvent$1", m100430f = "CustomExerciseViewModel.kt", m100431l = {34}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f61723w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC16243a.q f61725y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC16243a.q qVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f61725y = qVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C16244b.this.new a(this.f61725y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f61723w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C16244b.this.eventFlow;
                InterfaceC16243a.q qVar = this.f61725y;
                this.f61723w = 1;
                if (interfaceC13072o1.emit(qVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: gv2.b$b */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f61726w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C16244b f61727x;

        /* JADX INFO: renamed from: gv2.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f61728w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C16244b f61729x;

            /* JADX INFO: renamed from: gv2.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.customexercise.presentation.CustomExerciseViewModel$special$$inlined$map$1$2", m100430f = "CustomExerciseViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41676a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f61730E;

                /* JADX INFO: renamed from: F */
                Object f61731F;

                /* JADX INFO: renamed from: G */
                Object f61732G;

                /* JADX INFO: renamed from: H */
                int f61733H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f61734w;

                /* JADX INFO: renamed from: x */
                int f61735x;

                /* JADX INFO: renamed from: y */
                Object f61736y;

                public C41676a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f61734w = obj;
                    this.f61735x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C16244b c16244b) {
                this.f61728w = interfaceC13062m;
                this.f61729x = c16244b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41676a c41676a;
                if (interfaceC30057d instanceof C41676a) {
                    c41676a = (C41676a) interfaceC30057d;
                    int i13 = c41676a.f61735x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41676a.f61735x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41676a = new C41676a(interfaceC30057d);
                    }
                } else {
                    c41676a = new C41676a(interfaceC30057d);
                }
                Object obj2 = c41676a.f61734w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41676a.f61735x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f61728w;
                    AbstractC14817b abstractC14817bM46038o = this.f61729x.m46038o((InterfaceC16243a.q) obj);
                    c41676a.f61736y = null;
                    c41676a.f61730E = null;
                    c41676a.f61731F = null;
                    c41676a.f61732G = null;
                    c41676a.f61733H = 0;
                    c41676a.f61735x = 1;
                    if (interfaceC13062m.emit(abstractC14817bM46038o, c41676a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C16244b c16244b) {
            this.f61726w = interfaceC13058l;
            this.f61727x = c16244b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f61726w.collect(new a(interfaceC13062m, this.f61727x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: gv2.b$c */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f61738w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C16244b f61739x;

        /* JADX INFO: renamed from: gv2.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f61740w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C16244b f61741x;

            /* JADX INFO: renamed from: gv2.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.customexercise.presentation.CustomExerciseViewModel$special$$inlined$map$2$2", m100430f = "CustomExerciseViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41677a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f61742E;

                /* JADX INFO: renamed from: F */
                Object f61743F;

                /* JADX INFO: renamed from: G */
                Object f61744G;

                /* JADX INFO: renamed from: H */
                int f61745H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f61746w;

                /* JADX INFO: renamed from: x */
                int f61747x;

                /* JADX INFO: renamed from: y */
                Object f61748y;

                public C41677a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f61746w = obj;
                    this.f61747x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C16244b c16244b) {
                this.f61740w = interfaceC13062m;
                this.f61741x = c16244b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41677a c41677a;
                if (interfaceC30057d instanceof C41677a) {
                    c41677a = (C41677a) interfaceC30057d;
                    int i13 = c41677a.f61747x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41677a.f61747x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41677a = new C41677a(interfaceC30057d);
                    }
                } else {
                    c41677a = new C41677a(interfaceC30057d);
                }
                Object obj2 = c41677a.f61746w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41677a.f61747x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f61740w;
                    C17689k c17689kM46053e = this.f61741x.reducer.m46053e((C14818c) obj);
                    c41677a.f61748y = null;
                    c41677a.f61742E = null;
                    c41677a.f61743F = null;
                    c41677a.f61744G = null;
                    c41677a.f61745H = 0;
                    c41677a.f61747x = 1;
                    if (interfaceC13062m.emit(c17689kM46053e, c41677a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C16244b c16244b) {
            this.f61738w = interfaceC13058l;
            this.f61739x = c16244b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f61738w.collect(new a(interfaceC13062m, this.f61739x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16244b(C14819d interactor, C16245c reducer, InterfaceC2994c0 coroutineScope) {
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
    public final AbstractC14817b m46038o(InterfaceC16243a.q qVar) {
        if (qVar instanceof InterfaceC16243a.l) {
            return new AbstractC14817b.f(((InterfaceC16243a.l) qVar).getExerciseId());
        }
        if (qVar instanceof InterfaceC16243a.a) {
            return new AbstractC14817b.a(((InterfaceC16243a.a) qVar).getLinkedExerciseId());
        }
        if (qVar instanceof InterfaceC16243a.d) {
            return new AbstractC14817b.d(((InterfaceC16243a.d) qVar).getNewName());
        }
        if (qVar instanceof InterfaceC16243a.c) {
            return new AbstractC14817b.c(((InterfaceC16243a.c) qVar).getNewDescription());
        }
        if (qVar instanceof InterfaceC16243a.p) {
            return AbstractC14817b.j.f55024a;
        }
        if (qVar instanceof InterfaceC16243a.n) {
            return new AbstractC14817b.h(((InterfaceC16243a.n) qVar).getEquipment());
        }
        if (qVar instanceof InterfaceC16243a.o) {
            return new AbstractC14817b.i(((InterfaceC16243a.o) qVar).getMuscleGroup());
        }
        if (qVar instanceof InterfaceC16243a.m) {
            return AbstractC14817b.g.f55021a;
        }
        if (qVar instanceof InterfaceC16243a.k) {
            return AbstractC14817b.e.f55019a;
        }
        if (qVar instanceof InterfaceC16243a.b) {
            return AbstractC14817b.b.f55016a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final void m46039n(InterfaceC16243a.q event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C16244b(C14819d c14819d, C16245c c16245c, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c14819d, c16245c, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
