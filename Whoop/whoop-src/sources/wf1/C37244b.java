package wf1;

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
import tf1.AbstractC33763b;
import tf1.C33764c;
import tf1.C33765d;
import xf1.C38261a;

/* JADX INFO: renamed from: wf1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020 0\n8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Lwf1/b;", "Landroidx/lifecycle/w1;", "Ltf1/d;", "interactor", "Lxf1/a;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Ltf1/d;Lxf1/a;Lbc3/c0;)V", "Lec3/l;", "Ltf1/b;", "Ltf1/c;", "interact", "(Lec3/l;)Lec3/l;", "Lwf1/a$l;", "o", "(Lwf1/a$l;)Ltf1/b;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "n", "(Lwf1/a$l;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ltf1/d;", "x", "Lxf1/a;", "y", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "Lwf1/c;", "E", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "feedback-survey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37244b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C33765d interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C38261a reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: wf1.b$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.feedbacksurvey.presentation.FeedbackSurveyViewModel$sendViewEvent$1", m100430f = "FeedbackSurveyViewModel.kt", m100431l = {33}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f159315w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC37243a.l f159317y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC37243a.l lVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f159317y = lVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C37244b.this.new a(this.f159317y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f159315w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C37244b.this.eventFlow;
                InterfaceC37243a.l lVar = this.f159317y;
                this.f159315w = 1;
                if (interfaceC13072o1.emit(lVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: wf1.b$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f159318w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C37244b f159319x;

        /* JADX INFO: renamed from: wf1.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f159320w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C37244b f159321x;

            /* JADX INFO: renamed from: wf1.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.feedbacksurvey.presentation.FeedbackSurveyViewModel$special$$inlined$map$1$2", m100430f = "FeedbackSurveyViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42589a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f159322E;

                /* JADX INFO: renamed from: F */
                Object f159323F;

                /* JADX INFO: renamed from: G */
                Object f159324G;

                /* JADX INFO: renamed from: H */
                int f159325H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f159326w;

                /* JADX INFO: renamed from: x */
                int f159327x;

                /* JADX INFO: renamed from: y */
                Object f159328y;

                public C42589a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f159326w = obj;
                    this.f159327x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C37244b c37244b) {
                this.f159320w = interfaceC13062m;
                this.f159321x = c37244b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42589a c42589a;
                if (interfaceC30057d instanceof C42589a) {
                    c42589a = (C42589a) interfaceC30057d;
                    int i13 = c42589a.f159327x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42589a.f159327x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42589a = new C42589a(interfaceC30057d);
                    }
                } else {
                    c42589a = new C42589a(interfaceC30057d);
                }
                Object obj2 = c42589a.f159326w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42589a.f159327x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f159320w;
                    AbstractC33763b abstractC33763bM119366o = this.f159321x.m119366o((InterfaceC37243a.l) obj);
                    c42589a.f159328y = null;
                    c42589a.f159322E = null;
                    c42589a.f159323F = null;
                    c42589a.f159324G = null;
                    c42589a.f159325H = 0;
                    c42589a.f159327x = 1;
                    if (interfaceC13062m.emit(abstractC33763bM119366o, c42589a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C37244b c37244b) {
            this.f159318w = interfaceC13058l;
            this.f159319x = c37244b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f159318w.collect(new a(interfaceC13062m, this.f159319x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: wf1.b$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f159330w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C37244b f159331x;

        /* JADX INFO: renamed from: wf1.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f159332w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C37244b f159333x;

            /* JADX INFO: renamed from: wf1.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.feedbacksurvey.presentation.FeedbackSurveyViewModel$special$$inlined$map$2$2", m100430f = "FeedbackSurveyViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42590a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f159334E;

                /* JADX INFO: renamed from: F */
                Object f159335F;

                /* JADX INFO: renamed from: G */
                Object f159336G;

                /* JADX INFO: renamed from: H */
                int f159337H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f159338w;

                /* JADX INFO: renamed from: x */
                int f159339x;

                /* JADX INFO: renamed from: y */
                Object f159340y;

                public C42590a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f159338w = obj;
                    this.f159339x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C37244b c37244b) {
                this.f159332w = interfaceC13062m;
                this.f159333x = c37244b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42590a c42590a;
                if (interfaceC30057d instanceof C42590a) {
                    c42590a = (C42590a) interfaceC30057d;
                    int i13 = c42590a.f159339x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42590a.f159339x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42590a = new C42590a(interfaceC30057d);
                    }
                } else {
                    c42590a = new C42590a(interfaceC30057d);
                }
                Object obj2 = c42590a.f159338w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42590a.f159339x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f159332w;
                    C37245c c37245cM122596b = this.f159333x.reducer.m122596b((C33764c) obj);
                    c42590a.f159340y = null;
                    c42590a.f159334E = null;
                    c42590a.f159335F = null;
                    c42590a.f159336G = null;
                    c42590a.f159337H = 0;
                    c42590a.f159339x = 1;
                    if (interfaceC13062m.emit(c37245cM122596b, c42590a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C37244b c37244b) {
            this.f159330w = interfaceC13058l;
            this.f159331x = c37244b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f159330w.collect(new a(interfaceC13062m, this.f159331x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37244b(C33765d interactor, C38261a reducer, InterfaceC2994c0 coroutineScope) {
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
    public final AbstractC33763b m119366o(InterfaceC37243a.l lVar) {
        if (lVar instanceof InterfaceC37243a.i) {
            return AbstractC33763b.b.f141282a;
        }
        if (lVar instanceof InterfaceC37243a.d) {
            return AbstractC33763b.a.f141281a;
        }
        if (lVar instanceof InterfaceC37243a.j) {
            return new AbstractC33763b.c(((InterfaceC37243a.j) lVar).getDetails());
        }
        if (lVar instanceof InterfaceC37243a.k) {
            return new AbstractC33763b.d(((InterfaceC37243a.k) lVar).getReason());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final void m119367n(InterfaceC37243a.l event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C37244b(C33765d c33765d, C38261a c38261a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c33765d, c38261a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
