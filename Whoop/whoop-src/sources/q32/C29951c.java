package q32;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.personalrecords.miniarch.domain.PersonalRecordsDomainAction;
import com.whoop.personalrecords.miniarch.domain.PersonalRecordsDomainState;
import com.whoop.personalrecords.miniarch.domain.PersonalRecordsInteractor;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.LinkedHashSet;
import java.util.Set;
import l83.C23454a0;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r32.C30913b;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: q32.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000b*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00120 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020(0\n8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, m65681d2 = {"Lq32/c;", "Landroidx/lifecycle/w1;", "Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;", "interactor", "Lr32/b;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;Lr32/b;Lbc3/c0;)V", "Lec3/l;", "Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction;", "Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;", "interact", "(Lec3/l;)Lec3/l;", "Lq32/a$d;", "p", "(Lq32/a$d;)Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction;", "", "path", "n", "(Ljava/lang/String;)Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "o", "(Lq32/a$d;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;", "x", "Lr32/b;", "y", "Lbc3/c0;", "", "z", "Ljava/util/Set;", "loadedPaths", "Lec3/o1;", "E", "Lec3/o1;", "eventFlow", "Lq32/d;", "F", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "personal-records-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29951c extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final PersonalRecordsInteractor interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C30913b reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final Set<String> loadedPaths;

    /* JADX INFO: renamed from: q32.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.personalrecords.miniarch.presentation.PersonalRecordsViewModel$sendViewEvent$1", m100430f = "PersonalRecordsViewModel.kt", m100431l = {35}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f122310w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC29949a.d f122312y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC29949a.d dVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f122312y = dVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C29951c.this.new a(this.f122312y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f122310w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C29951c.this.eventFlow;
                InterfaceC29949a.d dVar = this.f122312y;
                this.f122310w = 1;
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

    /* JADX INFO: renamed from: q32.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f122313w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C29951c f122314x;

        /* JADX INFO: renamed from: q32.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f122315w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C29951c f122316x;

            /* JADX INFO: renamed from: q32.c$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.personalrecords.miniarch.presentation.PersonalRecordsViewModel$special$$inlined$map$1$2", m100430f = "PersonalRecordsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42207a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f122317E;

                /* JADX INFO: renamed from: F */
                Object f122318F;

                /* JADX INFO: renamed from: G */
                Object f122319G;

                /* JADX INFO: renamed from: H */
                int f122320H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f122321w;

                /* JADX INFO: renamed from: x */
                int f122322x;

                /* JADX INFO: renamed from: y */
                Object f122323y;

                public C42207a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f122321w = obj;
                    this.f122322x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C29951c c29951c) {
                this.f122315w = interfaceC13062m;
                this.f122316x = c29951c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42207a c42207a;
                if (interfaceC30057d instanceof C42207a) {
                    c42207a = (C42207a) interfaceC30057d;
                    int i13 = c42207a.f122322x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42207a.f122322x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42207a = new C42207a(interfaceC30057d);
                    }
                } else {
                    c42207a = new C42207a(interfaceC30057d);
                }
                Object obj2 = c42207a.f122321w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42207a.f122322x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f122315w;
                    C29952d c29952dM95044a = this.f122316x.reducer.m95044a((PersonalRecordsDomainState) obj);
                    c42207a.f122323y = null;
                    c42207a.f122317E = null;
                    c42207a.f122318F = null;
                    c42207a.f122319G = null;
                    c42207a.f122320H = 0;
                    c42207a.f122322x = 1;
                    if (interfaceC13062m.emit(c29952dM95044a, c42207a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C29951c c29951c) {
            this.f122313w = interfaceC13058l;
            this.f122314x = c29951c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f122313w.collect(new a(interfaceC13062m, this.f122314x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: q32.c$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f122325w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C29951c f122326x;

        /* JADX INFO: renamed from: q32.c$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f122327w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C29951c f122328x;

            /* JADX INFO: renamed from: q32.c$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.personalrecords.miniarch.presentation.PersonalRecordsViewModel$special$$inlined$mapNotNull$1$2", m100430f = "PersonalRecordsViewModel.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42208a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f122329E;

                /* JADX INFO: renamed from: F */
                Object f122330F;

                /* JADX INFO: renamed from: G */
                Object f122331G;

                /* JADX INFO: renamed from: H */
                Object f122332H;

                /* JADX INFO: renamed from: I */
                int f122333I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f122334w;

                /* JADX INFO: renamed from: x */
                int f122335x;

                /* JADX INFO: renamed from: y */
                Object f122336y;

                public C42208a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f122334w = obj;
                    this.f122335x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C29951c c29951c) {
                this.f122327w = interfaceC13062m;
                this.f122328x = c29951c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42208a c42208a;
                if (interfaceC30057d instanceof C42208a) {
                    c42208a = (C42208a) interfaceC30057d;
                    int i13 = c42208a.f122335x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42208a.f122335x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42208a = new C42208a(interfaceC30057d);
                    }
                } else {
                    c42208a = new C42208a(interfaceC30057d);
                }
                Object obj2 = c42208a.f122334w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42208a.f122335x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f122327w;
                    PersonalRecordsDomainAction personalRecordsDomainActionM91625p = this.f122328x.m91625p((InterfaceC29949a.d) obj);
                    if (personalRecordsDomainActionM91625p != null) {
                        c42208a.f122336y = null;
                        c42208a.f122329E = null;
                        c42208a.f122330F = null;
                        c42208a.f122331G = null;
                        c42208a.f122332H = null;
                        c42208a.f122333I = 0;
                        c42208a.f122335x = 1;
                        if (interfaceC13062m.emit(personalRecordsDomainActionM91625p, c42208a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C29951c c29951c) {
            this.f122325w = interfaceC13058l;
            this.f122326x = c29951c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f122325w.collect(new a(interfaceC13062m, this.f122326x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29951c(PersonalRecordsInteractor interactor, C30913b reducer, InterfaceC2994c0 coroutineScope) {
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

    /* JADX INFO: renamed from: n */
    private final PersonalRecordsDomainAction m91624n(String path) {
        if (this.loadedPaths.contains(path)) {
            return null;
        }
        this.loadedPaths.add(path);
        return new PersonalRecordsDomainAction.Refresh(path);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final PersonalRecordsDomainAction m91625p(InterfaceC29949a.d dVar) {
        if (dVar instanceof InterfaceC29949a.a) {
            return m91624n(((InterfaceC29949a.a) dVar).getPath());
        }
        if (dVar instanceof InterfaceC29949a.c) {
            return new PersonalRecordsDomainAction.Refresh(((InterfaceC29949a.c) dVar).getPath());
        }
        if (!(dVar instanceof InterfaceC29949a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC29949a.b bVar = (InterfaceC29949a.b) dVar;
        return new PersonalRecordsDomainAction.LoadMore(bVar.getStartDate(), bVar.getEndDate(), bVar.getNextExerciseOffset());
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: o */
    public final void m91626o(InterfaceC29949a.d event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C29951c(PersonalRecordsInteractor personalRecordsInteractor, C30913b c30913b, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(personalRecordsInteractor, c30913b, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
