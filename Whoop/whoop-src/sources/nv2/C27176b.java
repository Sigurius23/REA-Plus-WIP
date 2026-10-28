package nv2;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.weightlifting.feature.exerciserecords.domain.ExerciseRecordsDomainAction;
import com.whoop.weightlifting.feature.exerciserecords.domain.ExerciseRecordsDomainState;
import com.whoop.weightlifting.feature.exerciserecords.domain.ExerciseRecordsInteractor;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import java.util.LinkedHashSet;
import java.util.Set;
import l83.C23454a0;
import ld1.AbstractC23864c;
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

/* JADX INFO: renamed from: nv2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\f*\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u0004\u0018\u00010\r*\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00130!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R \u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, m65681d2 = {"Lnv2/b;", "Lld1/c;", "Lnv2/c;", "Lnv2/a$d;", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor;", "interactor", "Lnv2/d;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor;Lnv2/d;Lbc3/c0;)V", "Lec3/l;", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainAction;", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;", "interact", "(Lec3/l;)Lec3/l;", "q", "(Lnv2/a$d;)Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainAction;", "", "path", "o", "(Ljava/lang/String;)Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainAction;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "p", "(Lnv2/a$d;)V", "x", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor;", "y", "Lnv2/d;", "z", "Lbc3/c0;", "", "E", "Ljava/util/Set;", "loadedPaths", "Lec3/o1;", "F", "Lec3/o1;", "eventFlow", "G", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27176b extends AbstractC23864c<C27177c, InterfaceC27175a.d> {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final Set<String> loadedPaths;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final ExerciseRecordsInteractor interactor;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C27178d reducer;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: nv2.b$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.exerciserecords.presentation.ExerciseRecordsViewModel$sendViewEvent$1", m100430f = "ExerciseRecordsViewModel.kt", m100431l = {35}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f108746w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC27175a.d f108748y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC27175a.d dVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f108748y = dVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C27176b.this.new a(this.f108748y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f108746w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C27176b.this.eventFlow;
                InterfaceC27175a.d dVar = this.f108748y;
                this.f108746w = 1;
                if (interfaceC13072o1.emit(dVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: nv2.b$b */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f108749w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C27176b f108750x;

        /* JADX INFO: renamed from: nv2.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f108751w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C27176b f108752x;

            /* JADX INFO: renamed from: nv2.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.exerciserecords.presentation.ExerciseRecordsViewModel$special$$inlined$map$1$2", m100430f = "ExerciseRecordsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42101a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f108753E;

                /* JADX INFO: renamed from: F */
                Object f108754F;

                /* JADX INFO: renamed from: G */
                Object f108755G;

                /* JADX INFO: renamed from: H */
                int f108756H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f108757w;

                /* JADX INFO: renamed from: x */
                int f108758x;

                /* JADX INFO: renamed from: y */
                Object f108759y;

                public C42101a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f108757w = obj;
                    this.f108758x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C27176b c27176b) {
                this.f108751w = interfaceC13062m;
                this.f108752x = c27176b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42101a c42101a;
                if (interfaceC30057d instanceof C42101a) {
                    c42101a = (C42101a) interfaceC30057d;
                    int i13 = c42101a.f108758x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42101a.f108758x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42101a = new C42101a(interfaceC30057d);
                    }
                } else {
                    c42101a = new C42101a(interfaceC30057d);
                }
                Object obj2 = c42101a.f108757w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42101a.f108758x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f108751w;
                    C27177c c27177cM81759a = this.f108752x.reducer.m81759a((ExerciseRecordsDomainState) obj);
                    c42101a.f108759y = null;
                    c42101a.f108753E = null;
                    c42101a.f108754F = null;
                    c42101a.f108755G = null;
                    c42101a.f108756H = 0;
                    c42101a.f108758x = 1;
                    if (interfaceC13062m.emit(c27177cM81759a, c42101a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C27176b c27176b) {
            this.f108749w = interfaceC13058l;
            this.f108750x = c27176b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f108749w.collect(new a(interfaceC13062m, this.f108750x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: nv2.b$c */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f108761w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C27176b f108762x;

        /* JADX INFO: renamed from: nv2.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f108763w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C27176b f108764x;

            /* JADX INFO: renamed from: nv2.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.exerciserecords.presentation.ExerciseRecordsViewModel$special$$inlined$mapNotNull$1$2", m100430f = "ExerciseRecordsViewModel.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42102a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f108765E;

                /* JADX INFO: renamed from: F */
                Object f108766F;

                /* JADX INFO: renamed from: G */
                Object f108767G;

                /* JADX INFO: renamed from: H */
                Object f108768H;

                /* JADX INFO: renamed from: I */
                int f108769I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f108770w;

                /* JADX INFO: renamed from: x */
                int f108771x;

                /* JADX INFO: renamed from: y */
                Object f108772y;

                public C42102a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f108770w = obj;
                    this.f108771x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C27176b c27176b) {
                this.f108763w = interfaceC13062m;
                this.f108764x = c27176b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42102a c42102a;
                if (interfaceC30057d instanceof C42102a) {
                    c42102a = (C42102a) interfaceC30057d;
                    int i13 = c42102a.f108771x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42102a.f108771x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42102a = new C42102a(interfaceC30057d);
                    }
                } else {
                    c42102a = new C42102a(interfaceC30057d);
                }
                Object obj2 = c42102a.f108770w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42102a.f108771x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f108763w;
                    ExerciseRecordsDomainAction exerciseRecordsDomainActionM81748q = this.f108764x.m81748q((InterfaceC27175a.d) obj);
                    if (exerciseRecordsDomainActionM81748q != null) {
                        c42102a.f108772y = null;
                        c42102a.f108765E = null;
                        c42102a.f108766F = null;
                        c42102a.f108767G = null;
                        c42102a.f108768H = null;
                        c42102a.f108769I = 0;
                        c42102a.f108771x = 1;
                        if (interfaceC13062m.emit(exerciseRecordsDomainActionM81748q, c42102a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C27176b c27176b) {
            this.f108761w = interfaceC13058l;
            this.f108762x = c27176b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f108761w.collect(new a(interfaceC13062m, this.f108762x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27176b(ExerciseRecordsInteractor interactor, C27178d reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        this.loadedPaths = new LinkedHashSet();
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(new b(interact(new c(c13096w1M36592b, this)), this), coroutineScope, C13105z1.f45288a, 1);
    }

    private final InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return this.interactor.interact(interfaceC13058l);
    }

    /* JADX INFO: renamed from: o */
    private final ExerciseRecordsDomainAction m81747o(String path) {
        if (this.loadedPaths.contains(path)) {
            return null;
        }
        this.loadedPaths.add(path);
        return new ExerciseRecordsDomainAction.LoadInitial(path);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final ExerciseRecordsDomainAction m81748q(InterfaceC27175a.d dVar) {
        if (dVar instanceof InterfaceC27175a.a) {
            return m81747o(((InterfaceC27175a.a) dVar).getPath());
        }
        if (dVar instanceof InterfaceC27175a.b) {
            return new ExerciseRecordsDomainAction.LoadInitial(((InterfaceC27175a.b) dVar).getPath());
        }
        if (!(dVar instanceof InterfaceC27175a.c)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC27175a.c cVar = (InterfaceC27175a.c) dVar;
        return new ExerciseRecordsDomainAction.LoadMore(cVar.getPath(), cVar.getNextStartDate());
    }

    @Override // ld1.AbstractC23864c
    public InterfaceC13058l getViewState() {
        return this.viewState;
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo1216g(InterfaceC27175a.d event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C27176b(ExerciseRecordsInteractor exerciseRecordsInteractor, C27178d c27178d, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(exerciseRecordsInteractor, c27178d, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
