package ef1;

import af1.C0808b;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import cf1.AbstractC4542b;
import cf1.C4543c;
import cf1.C4544d;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ff1.C14428b;
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
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: ef1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\f*\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u0004\u0018\u00010\r*\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00140'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00110+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020/0\f8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00065"}, m65681d2 = {"Lef1/b;", "Landroidx/lifecycle/w1;", "Lcf1/d;", "interactor", "Lff1/b;", "reducer", "Laf1/b;", "analyticsHelper", "Lbc3/c0;", "coroutineScope", "<init>", "(Lcf1/d;Lff1/b;Laf1/b;Lbc3/c0;)V", "Lec3/l;", "Lcf1/b;", "Lcf1/c;", "interact", "(Lec3/l;)Lec3/l;", "Lef1/a$g;", "q", "(Lef1/a$g;)Lcf1/b;", "", "path", "n", "(Ljava/lang/String;)Lcf1/b;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "p", "(Lef1/a$g;)V", "Lef1/a$a;", "o", "(Lef1/a$a;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lcf1/d;", "x", "Lff1/b;", "y", "Laf1/b;", "z", "Lbc3/c0;", "", "E", "Ljava/util/Set;", "loadedPaths", "Lec3/o1;", "F", "Lec3/o1;", "eventFlow", "Lef1/c;", "G", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "exercise-progress-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13146b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final Set<String> loadedPaths;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C4544d interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C14428b reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C0808b analyticsHelper;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: ef1.b$a */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.exerciseprogressminiarch.presentation.ExerciseProgressViewModel$sendViewEvent$1", m100430f = "ExerciseProgressViewModel.kt", m100431l = {37}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f45486w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC13145a.g f45488y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC13145a.g gVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f45488y = gVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C13146b.this.new a(this.f45488y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f45486w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C13146b.this.eventFlow;
                InterfaceC13145a.g gVar = this.f45488y;
                this.f45486w = 1;
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

    /* JADX INFO: renamed from: ef1.b$b */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f45489w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13146b f45490x;

        /* JADX INFO: renamed from: ef1.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f45491w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C13146b f45492x;

            /* JADX INFO: renamed from: ef1.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.exerciseprogressminiarch.presentation.ExerciseProgressViewModel$special$$inlined$map$1$2", m100430f = "ExerciseProgressViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41524a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f45493E;

                /* JADX INFO: renamed from: F */
                Object f45494F;

                /* JADX INFO: renamed from: G */
                Object f45495G;

                /* JADX INFO: renamed from: H */
                int f45496H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f45497w;

                /* JADX INFO: renamed from: x */
                int f45498x;

                /* JADX INFO: renamed from: y */
                Object f45499y;

                public C41524a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f45497w = obj;
                    this.f45498x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C13146b c13146b) {
                this.f45491w = interfaceC13062m;
                this.f45492x = c13146b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41524a c41524a;
                if (interfaceC30057d instanceof C41524a) {
                    c41524a = (C41524a) interfaceC30057d;
                    int i13 = c41524a.f45498x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41524a.f45498x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41524a = new C41524a(interfaceC30057d);
                    }
                } else {
                    c41524a = new C41524a(interfaceC30057d);
                }
                Object obj2 = c41524a.f45497w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41524a.f45498x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f45491w;
                    C13147c c13147cM41149d = this.f45492x.reducer.m41149d((C4543c) obj);
                    c41524a.f45499y = null;
                    c41524a.f45493E = null;
                    c41524a.f45494F = null;
                    c41524a.f45495G = null;
                    c41524a.f45496H = 0;
                    c41524a.f45498x = 1;
                    if (interfaceC13062m.emit(c13147cM41149d, c41524a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C13146b c13146b) {
            this.f45489w = interfaceC13058l;
            this.f45490x = c13146b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f45489w.collect(new a(interfaceC13062m, this.f45490x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ef1.b$c */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f45501w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13146b f45502x;

        /* JADX INFO: renamed from: ef1.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f45503w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C13146b f45504x;

            /* JADX INFO: renamed from: ef1.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.exerciseprogressminiarch.presentation.ExerciseProgressViewModel$special$$inlined$mapNotNull$1$2", m100430f = "ExerciseProgressViewModel.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41525a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f45505E;

                /* JADX INFO: renamed from: F */
                Object f45506F;

                /* JADX INFO: renamed from: G */
                Object f45507G;

                /* JADX INFO: renamed from: H */
                Object f45508H;

                /* JADX INFO: renamed from: I */
                int f45509I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f45510w;

                /* JADX INFO: renamed from: x */
                int f45511x;

                /* JADX INFO: renamed from: y */
                Object f45512y;

                public C41525a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f45510w = obj;
                    this.f45511x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C13146b c13146b) {
                this.f45503w = interfaceC13062m;
                this.f45504x = c13146b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41525a c41525a;
                if (interfaceC30057d instanceof C41525a) {
                    c41525a = (C41525a) interfaceC30057d;
                    int i13 = c41525a.f45511x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41525a.f45511x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41525a = new C41525a(interfaceC30057d);
                    }
                } else {
                    c41525a = new C41525a(interfaceC30057d);
                }
                Object obj2 = c41525a.f45510w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41525a.f45511x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f45503w;
                    AbstractC4542b abstractC4542bM36800q = this.f45504x.m36800q((InterfaceC13145a.g) obj);
                    if (abstractC4542bM36800q != null) {
                        c41525a.f45512y = null;
                        c41525a.f45505E = null;
                        c41525a.f45506F = null;
                        c41525a.f45507G = null;
                        c41525a.f45508H = null;
                        c41525a.f45509I = 0;
                        c41525a.f45511x = 1;
                        if (interfaceC13062m.emit(abstractC4542bM36800q, c41525a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C13146b c13146b) {
            this.f45501w = interfaceC13058l;
            this.f45502x = c13146b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f45501w.collect(new a(interfaceC13062m, this.f45502x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13146b(C4544d interactor, C14428b reducer, C0808b analyticsHelper, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.analyticsHelper = analyticsHelper;
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
    private final AbstractC4542b m36799n(String path) {
        if (this.loadedPaths.contains(path)) {
            return null;
        }
        this.loadedPaths.add(path);
        return new AbstractC4542b.c(path, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final AbstractC4542b m36800q(InterfaceC13145a.g gVar) {
        if (gVar instanceof InterfaceC13145a.e) {
            return m36799n(((InterfaceC13145a.e) gVar).getPath());
        }
        if (gVar instanceof InterfaceC13145a.f) {
            return new AbstractC4542b.c(((InterfaceC13145a.f) gVar).getPath(), null, 2, null);
        }
        if (gVar instanceof InterfaceC13145a.b) {
            InterfaceC13145a.b bVar = (InterfaceC13145a.b) gVar;
            return new AbstractC4542b.a(bVar.getPath(), bVar.getNewDate(), null, 4, null);
        }
        if (gVar instanceof InterfaceC13145a.c) {
            return new AbstractC4542b.b(((InterfaceC13145a.c) gVar).getIndex());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: o */
    public final void m36801o(InterfaceC13145a.a event) {
        AbstractC22676k.m65750j(event, "event");
        this.analyticsHelper.m1966a(event);
    }

    /* JADX INFO: renamed from: p */
    public final void m36802p(InterfaceC13145a.g event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C13146b(C4544d c4544d, C14428b c14428b, C0808b c0808b, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c4544d, c14428b, c0808b, (i13 & 8) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
