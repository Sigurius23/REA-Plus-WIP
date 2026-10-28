package uq1;

import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
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
import rq1.AbstractC31709a;
import rq1.AbstractC31710b;
import rq1.C31711c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vq1.C36283a;

/* JADX INFO: renamed from: uq1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\n8\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\"¨\u0006$"}, m65681d2 = {"Luq1/b;", "Landroidx/lifecycle/w1;", "Lbc3/c0;", "coroutineScope", "Lrq1/c;", "interactor", "Lvq1/a;", "reducer", "<init>", "(Lbc3/c0;Lrq1/c;Lvq1/a;)V", "Lec3/l;", "Lrq1/a;", "Lrq1/b;", "l", "(Lec3/l;Lrq1/c;)Lec3/l;", "Luq1/a;", "viewEvent", "Lbc3/k1;", "n", "(Luq1/a;)Lbc3/k1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "x", "Lvq1/a;", "Lec3/o1;", "y", "Lec3/o1;", "eventFlow", "z", "Lec3/l;", "domainState", "Luq1/c;", "E", "getViewState", "()Lec3/l;", "viewState", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35162b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C36283a reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: uq1.b$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.impacts.impacts.presentation.BehaviorImpactViewModel$sendViewEvent$1", m100430f = "BehaviorImpactViewModel.kt", m100431l = {39}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f149239w;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C35162b.this.new a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f149239w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C35162b.this.eventFlow;
                AbstractC31709a.a aVar = AbstractC31709a.a.f131342a;
                this.f149239w = 1;
                if (interfaceC13072o1.emit(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: uq1.b$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f149241w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C35162b f149242x;

        /* JADX INFO: renamed from: uq1.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f149243w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C35162b f149244x;

            /* JADX INFO: renamed from: uq1.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.impacts.impacts.presentation.BehaviorImpactViewModel$special$$inlined$map$1$2", m100430f = "BehaviorImpactViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42490a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f149245E;

                /* JADX INFO: renamed from: F */
                Object f149246F;

                /* JADX INFO: renamed from: G */
                Object f149247G;

                /* JADX INFO: renamed from: H */
                int f149248H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f149249w;

                /* JADX INFO: renamed from: x */
                int f149250x;

                /* JADX INFO: renamed from: y */
                Object f149251y;

                public C42490a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f149249w = obj;
                    this.f149250x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C35162b c35162b) {
                this.f149243w = interfaceC13062m;
                this.f149244x = c35162b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42490a c42490a;
                if (interfaceC30057d instanceof C42490a) {
                    c42490a = (C42490a) interfaceC30057d;
                    int i13 = c42490a.f149250x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42490a.f149250x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42490a = new C42490a(interfaceC30057d);
                    }
                } else {
                    c42490a = new C42490a(interfaceC30057d);
                }
                Object obj2 = c42490a.f149249w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42490a.f149250x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f149243w;
                    AbstractC35163c abstractC35163cM115975c = this.f149244x.reducer.m115975c((AbstractC31710b) obj);
                    c42490a.f149251y = null;
                    c42490a.f149245E = null;
                    c42490a.f149246F = null;
                    c42490a.f149247G = null;
                    c42490a.f149248H = 0;
                    c42490a.f149250x = 1;
                    if (interfaceC13062m.emit(abstractC35163cM115975c, c42490a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C35162b c35162b) {
            this.f149241w = interfaceC13058l;
            this.f149242x = c35162b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f149241w.collect(new a(interfaceC13062m, this.f149242x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35162b(InterfaceC2994c0 coroutineScope, C31711c interactor, C36283a reducer) {
        super(coroutineScope);
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        this.coroutineScope = coroutineScope;
        this.reducer = reducer;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM111270l = m111270l(c13096w1M36592b, interactor);
        this.domainState = interfaceC13058lM111270l;
        this.viewState = new b(AbstractC13091v.m36586L(interfaceC13058lM111270l, coroutineScope, C13105z1.f45288a, 0), this);
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC13058l m111270l(InterfaceC13058l interfaceC13058l, C31711c c31711c) {
        return c31711c.interact(interfaceC13058l);
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final InterfaceC3027k1 m111271n(AbstractC35161a viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        if (viewEvent.equals(AbstractC35161a.a.f149233a)) {
            return AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(null), 3);
        }
        throw new NoWhenBranchMatchedException();
    }

    public /* synthetic */ C35162b(InterfaceC2994c0 interfaceC2994c0, C31711c c31711c, C36283a c36283a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0, c31711c, c36283a);
    }
}
