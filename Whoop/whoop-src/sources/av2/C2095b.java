package av2;

import androidx.lifecycle.AbstractC1640x1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13060l1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import hj0.AbstractC17356o;
import l83.C23454a0;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import zu2.C41156c;
import zu2.C41157d;
import zu2.InterfaceC41155b;

/* JADX INFO: renamed from: av2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, m65681d2 = {"Lav2/b;", "Lhj0/o;", "Lzu2/d;", "interactor", "Lav2/f;", "viewStateReducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lzu2/d;Lav2/f;Lbc3/c0;)V", "Lav2/a$g;", "Lzu2/b;", "B", "(Lav2/a$g;)Lzu2/b;", "viewEvent", "Ll83/a0;", "A", "(Lav2/a$g;)V", "", "E", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "logTag", "Lec3/o1;", "F", "Lec3/o1;", "eventFlow", "Lec3/t1;", "Lav2/e;", "G", "Lec3/t1;", "z", "()Lec3/t1;", "viewState", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C2095b extends AbstractC17356o {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13087t1 viewState;

    /* JADX INFO: renamed from: av2.b$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.name.presentation.InputWorkoutNameViewModel$sendViewEvent$1", m100430f = "InputWorkoutNameViewModel.kt", m100431l = {44}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f8294w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC2094a.g f8296y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2094a.g gVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f8296y = gVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C2095b.this.new a(this.f8296y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f8294w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C2095b.this.eventFlow;
                InterfaceC2094a.g gVar = this.f8296y;
                this.f8294w = 1;
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

    /* JADX INFO: renamed from: av2.b$b */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f8297w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C2095b f8298x;

        /* JADX INFO: renamed from: av2.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f8299w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C2095b f8300x;

            /* JADX INFO: renamed from: av2.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.name.presentation.InputWorkoutNameViewModel$special$$inlined$map$1$2", m100430f = "InputWorkoutNameViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41292a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f8301E;

                /* JADX INFO: renamed from: F */
                Object f8302F;

                /* JADX INFO: renamed from: G */
                Object f8303G;

                /* JADX INFO: renamed from: H */
                int f8304H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f8305w;

                /* JADX INFO: renamed from: x */
                int f8306x;

                /* JADX INFO: renamed from: y */
                Object f8307y;

                public C41292a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f8305w = obj;
                    this.f8306x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C2095b c2095b) {
                this.f8299w = interfaceC13062m;
                this.f8300x = c2095b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41292a c41292a;
                if (interfaceC30057d instanceof C41292a) {
                    c41292a = (C41292a) interfaceC30057d;
                    int i13 = c41292a.f8306x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41292a.f8306x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41292a = new C41292a(interfaceC30057d);
                    }
                } else {
                    c41292a = new C41292a(interfaceC30057d);
                }
                Object obj2 = c41292a.f8305w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41292a.f8306x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f8299w;
                    InterfaceC41155b interfaceC41155bM6618B = this.f8300x.m6618B((InterfaceC2094a.g) obj);
                    c41292a.f8307y = null;
                    c41292a.f8301E = null;
                    c41292a.f8302F = null;
                    c41292a.f8303G = null;
                    c41292a.f8304H = 0;
                    c41292a.f8306x = 1;
                    if (interfaceC13062m.emit(interfaceC41155bM6618B, c41292a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C2095b c2095b) {
            this.f8297w = interfaceC13058l;
            this.f8298x = c2095b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f8297w.collect(new a(interfaceC13062m, this.f8298x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: av2.b$c */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f8309w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C2099f f8310x;

        /* JADX INFO: renamed from: av2.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f8311w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C2099f f8312x;

            /* JADX INFO: renamed from: av2.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.name.presentation.InputWorkoutNameViewModel$special$$inlined$map$2$2", m100430f = "InputWorkoutNameViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41293a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f8313E;

                /* JADX INFO: renamed from: F */
                Object f8314F;

                /* JADX INFO: renamed from: G */
                Object f8315G;

                /* JADX INFO: renamed from: H */
                int f8316H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f8317w;

                /* JADX INFO: renamed from: x */
                int f8318x;

                /* JADX INFO: renamed from: y */
                Object f8319y;

                public C41293a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f8317w = obj;
                    this.f8318x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C2099f c2099f) {
                this.f8311w = interfaceC13062m;
                this.f8312x = c2099f;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41293a c41293a;
                if (interfaceC30057d instanceof C41293a) {
                    c41293a = (C41293a) interfaceC30057d;
                    int i13 = c41293a.f8318x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41293a.f8318x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41293a = new C41293a(interfaceC30057d);
                    }
                } else {
                    c41293a = new C41293a(interfaceC30057d);
                }
                Object obj2 = c41293a.f8317w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41293a.f8318x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f8311w;
                    InterfaceC2098e interfaceC2098eM6632a = this.f8312x.m6632a((C41156c) obj);
                    c41293a.f8319y = null;
                    c41293a.f8313E = null;
                    c41293a.f8314F = null;
                    c41293a.f8315G = null;
                    c41293a.f8316H = 0;
                    c41293a.f8318x = 1;
                    if (interfaceC13062m.emit(interfaceC2098eM6632a, c41293a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C2099f c2099f) {
            this.f8309w = interfaceC13058l;
            this.f8310x = c2099f;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f8309w.collect(new a(interfaceC13062m, this.f8310x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: av2.b$d */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.name.presentation.InputWorkoutNameViewModel$viewState$2", m100430f = "InputWorkoutNameViewModel.kt", m100431l = {30}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lzu2/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f8321w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f8322x;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(interfaceC30057d);
            dVar.f8322x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f8322x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f8321w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC41155b.b bVar = InterfaceC41155b.b.f177537a;
                this.f8322x = null;
                this.f8321w = 1;
                if (interfaceC13062m.emit(bVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: av2.b$e */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class e extends C22672i implements Function3 {
        public e(Object obj) {
            super(3, 0, C41157d.class, obj, "interact", "interact(Lcom/whoop/weightlifting/feature/builder/name/domain/InputWorkoutNameDomainState;Lcom/whoop/weightlifting/feature/builder/name/domain/InputWorkoutNameDomainAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C41156c c41156c, InterfaceC41155b interfaceC41155b, InterfaceC30057d<? super C41156c> interfaceC30057d) {
            return ((C41157d) this.receiver).m133709k(c41156c, interfaceC41155b, interfaceC30057d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2095b(C41157d interactor, C2099f viewStateReducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(viewStateReducer, "viewStateReducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.logTag = "InputWorkoutNameViewModel";
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(new c(new C13060l1(C41156c.INSTANCE.m133698a(), new C13015a0(new d(null), new b(c13096w1M36592b, this)), new e(interactor)), viewStateReducer), AbstractC1640x1.m5043b(this), C13105z1.f45288a, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public final InterfaceC41155b m6618B(InterfaceC2094a.g gVar) {
        if (gVar instanceof InterfaceC2094a.d) {
            return new InterfaceC41155b.d(((InterfaceC2094a.d) gVar).getNewName());
        }
        if (gVar instanceof InterfaceC2094a.e) {
            return InterfaceC41155b.c.f177538a;
        }
        if (gVar instanceof InterfaceC2094a.f) {
            return InterfaceC41155b.e.f177540a;
        }
        if (gVar instanceof InterfaceC2094a.c) {
            return InterfaceC41155b.a.f177536a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: A */
    public final void m6621A(InterfaceC2094a.g viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new a(viewEvent, null), 3);
    }

    @Override // hj0.AbstractC17356o
    /* JADX INFO: renamed from: o, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final InterfaceC13087t1 getViewState() {
        return this.viewState;
    }

    public /* synthetic */ C2095b(C41157d c41157d, C2099f c2099f, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c41157d, c2099f, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
