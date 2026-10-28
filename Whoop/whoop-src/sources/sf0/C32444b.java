package sf0;

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
import pf0.AbstractC29146b;
import pf0.C29147c;
import pf0.C29148d;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tf0.C33760a;

/* JADX INFO: renamed from: sf0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020 0\n8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Lsf0/b;", "Landroidx/lifecycle/w1;", "Lpf0/d;", "interactor", "Ltf0/a;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lpf0/d;Ltf0/a;Lbc3/c0;)V", "Lec3/l;", "Lpf0/b;", "Lpf0/c;", "interact", "(Lec3/l;)Lec3/l;", "Lsf0/a$l;", "o", "(Lsf0/a$l;)Lpf0/b;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "n", "(Lsf0/a$l;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lpf0/d;", "x", "Ltf0/a;", "y", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "Lsf0/c;", "E", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32444b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C29148d interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C33760a reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: sf0.b$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabsjoin.feature.join.presentation.AdvancedLabsJoinViewModel$sendViewEvent$1", m100430f = "AdvancedLabsJoinViewModel.kt", m100431l = {33}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f134369w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC32443a.l f134371y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC32443a.l lVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f134371y = lVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C32444b.this.new a(this.f134371y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f134369w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C32444b.this.eventFlow;
                InterfaceC32443a.l lVar = this.f134371y;
                this.f134369w = 1;
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

    /* JADX INFO: renamed from: sf0.b$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f134372w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C32444b f134373x;

        /* JADX INFO: renamed from: sf0.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f134374w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C32444b f134375x;

            /* JADX INFO: renamed from: sf0.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabsjoin.feature.join.presentation.AdvancedLabsJoinViewModel$special$$inlined$map$1$2", m100430f = "AdvancedLabsJoinViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42319a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f134376E;

                /* JADX INFO: renamed from: F */
                Object f134377F;

                /* JADX INFO: renamed from: G */
                Object f134378G;

                /* JADX INFO: renamed from: H */
                int f134379H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f134380w;

                /* JADX INFO: renamed from: x */
                int f134381x;

                /* JADX INFO: renamed from: y */
                Object f134382y;

                public C42319a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f134380w = obj;
                    this.f134381x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C32444b c32444b) {
                this.f134374w = interfaceC13062m;
                this.f134375x = c32444b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42319a c42319a;
                if (interfaceC30057d instanceof C42319a) {
                    c42319a = (C42319a) interfaceC30057d;
                    int i13 = c42319a.f134381x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42319a.f134381x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42319a = new C42319a(interfaceC30057d);
                    }
                } else {
                    c42319a = new C42319a(interfaceC30057d);
                }
                Object obj2 = c42319a.f134380w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42319a.f134381x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f134374w;
                    AbstractC29146b abstractC29146bM101272o = this.f134375x.m101272o((InterfaceC32443a.l) obj);
                    c42319a.f134382y = null;
                    c42319a.f134376E = null;
                    c42319a.f134377F = null;
                    c42319a.f134378G = null;
                    c42319a.f134379H = 0;
                    c42319a.f134381x = 1;
                    if (interfaceC13062m.emit(abstractC29146bM101272o, c42319a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C32444b c32444b) {
            this.f134372w = interfaceC13058l;
            this.f134373x = c32444b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f134372w.collect(new a(interfaceC13062m, this.f134373x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sf0.b$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f134384w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C32444b f134385x;

        /* JADX INFO: renamed from: sf0.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f134386w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C32444b f134387x;

            /* JADX INFO: renamed from: sf0.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabsjoin.feature.join.presentation.AdvancedLabsJoinViewModel$special$$inlined$map$2$2", m100430f = "AdvancedLabsJoinViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42320a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f134388E;

                /* JADX INFO: renamed from: F */
                Object f134389F;

                /* JADX INFO: renamed from: G */
                Object f134390G;

                /* JADX INFO: renamed from: H */
                int f134391H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f134392w;

                /* JADX INFO: renamed from: x */
                int f134393x;

                /* JADX INFO: renamed from: y */
                Object f134394y;

                public C42320a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f134392w = obj;
                    this.f134393x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C32444b c32444b) {
                this.f134386w = interfaceC13062m;
                this.f134387x = c32444b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42320a c42320a;
                if (interfaceC30057d instanceof C42320a) {
                    c42320a = (C42320a) interfaceC30057d;
                    int i13 = c42320a.f134393x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42320a.f134393x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42320a = new C42320a(interfaceC30057d);
                    }
                } else {
                    c42320a = new C42320a(interfaceC30057d);
                }
                Object obj2 = c42320a.f134392w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42320a.f134393x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f134386w;
                    C32445c c32445cM106741i = this.f134387x.reducer.m106741i((C29147c) obj);
                    c42320a.f134394y = null;
                    c42320a.f134388E = null;
                    c42320a.f134389F = null;
                    c42320a.f134390G = null;
                    c42320a.f134391H = 0;
                    c42320a.f134393x = 1;
                    if (interfaceC13062m.emit(c32445cM106741i, c42320a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C32444b c32444b) {
            this.f134384w = interfaceC13058l;
            this.f134385x = c32444b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f134384w.collect(new a(interfaceC13062m, this.f134385x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32444b(C29148d interactor, C33760a reducer, InterfaceC2994c0 coroutineScope) {
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
    public final AbstractC29146b m101272o(InterfaceC32443a.l lVar) {
        if (lVar instanceof InterfaceC32443a.h) {
            InterfaceC32443a.h hVar = (InterfaceC32443a.h) lVar;
            return new AbstractC29146b.b(hVar.getSource(), hVar.getTestCount(), hVar.getInitiallySelectedSegmentId());
        }
        if (lVar instanceof InterfaceC32443a.i) {
            return new AbstractC29146b.c(((InterfaceC32443a.i) lVar).getSelectedSegmentId());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final void m101273n(InterfaceC32443a.l event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C32444b(C29148d c29148d, C33760a c33760a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c29148d, c33760a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
