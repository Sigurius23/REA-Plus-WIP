package nt2;

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
import it2.C20931a;
import jt2.AbstractC21950l;
import jt2.C21948j;
import jt2.C21949k;
import l83.C23454a0;
import od1.AbstractC27845h;
import or2.C28180m;
import ot2.AbstractC28344m;
import ot2.C28345n;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: nt2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, m65681d2 = {"Lnt2/c;", "Landroidx/lifecycle/w1;", "Lbc3/c0;", "coroutineScope", "Ljt2/k;", "combiner", "Lot2/n;", "reducer", "Lit2/a;", "screenArgs", "<init>", "(Lbc3/c0;Ljt2/k;Lot2/n;Lit2/a;)V", "Lnt2/a;", "viewEvent", "Ll83/a0;", "n", "(Lnt2/a;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "x", "Lot2/n;", "y", "Lit2/a;", "Lec3/o1;", "Ljt2/l;", "z", "Lec3/o1;", "eventFlow", "Lec3/l;", "Lot2/m;", "E", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27133c extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C28345n reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C20931a screenArgs;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: nt2.c$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.hubandspoke.presentation.HubAndSpokeViewModel$sendViewEvent$1", m100430f = "HubAndSpokeViewModel.kt", m100431l = {35}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f108521w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC27131a f108523y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC27131a abstractC27131a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f108523y = abstractC27131a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C27133c.this.new a(this.f108523y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f108521w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C27133c.this.eventFlow;
                AbstractC21950l abstractC21950lM81591a = AbstractC27132b.m81591a(this.f108523y, C27133c.this.screenArgs.getPlanName());
                this.f108521w = 1;
                if (interfaceC13072o1.emit(abstractC21950lM81591a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: nt2.c$b */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f108524w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C27133c f108525x;

        /* JADX INFO: renamed from: nt2.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f108526w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C27133c f108527x;

            /* JADX INFO: renamed from: nt2.c$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.hubandspoke.presentation.HubAndSpokeViewModel$special$$inlined$map$1$2", m100430f = "HubAndSpokeViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42092a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f108528E;

                /* JADX INFO: renamed from: F */
                Object f108529F;

                /* JADX INFO: renamed from: G */
                Object f108530G;

                /* JADX INFO: renamed from: H */
                int f108531H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f108532w;

                /* JADX INFO: renamed from: x */
                int f108533x;

                /* JADX INFO: renamed from: y */
                Object f108534y;

                public C42092a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f108532w = obj;
                    this.f108533x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C27133c c27133c) {
                this.f108526w = interfaceC13062m;
                this.f108527x = c27133c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42092a c42092a;
                if (interfaceC30057d instanceof C42092a) {
                    c42092a = (C42092a) interfaceC30057d;
                    int i13 = c42092a.f108533x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42092a.f108533x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42092a = new C42092a(interfaceC30057d);
                    }
                } else {
                    c42092a = new C42092a(interfaceC30057d);
                }
                Object obj2 = c42092a.f108532w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42092a.f108533x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f108526w;
                    C21948j c21948j = (C21948j) obj;
                    AbstractC28344m abstractC28344mM85974b = this.f108527x.reducer.m85974b(c21948j.getDomainState(), c21948j.getAccumulatedStateForVS());
                    c42092a.f108534y = null;
                    c42092a.f108528E = null;
                    c42092a.f108529F = null;
                    c42092a.f108530G = null;
                    c42092a.f108531H = 0;
                    c42092a.f108533x = 1;
                    if (interfaceC13062m.emit(abstractC28344mM85974b, c42092a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C27133c c27133c) {
            this.f108524w = interfaceC13058l;
            this.f108525x = c27133c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f108524w.collect(new a(interfaceC13062m, this.f108525x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27133c(InterfaceC2994c0 coroutineScope, C21949k combiner, C28345n reducer, C20931a screenArgs) {
        super(coroutineScope);
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(combiner, "combiner");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(screenArgs, "screenArgs");
        this.coroutineScope = coroutineScope;
        this.reducer = reducer;
        this.screenArgs = screenArgs;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(new b(AbstractC27845h.m83945a(c13096w1M36592b, combiner), this), coroutineScope, C13105z1.f45288a, 1);
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final void m81595n(AbstractC27131a viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(viewEvent, null), 3);
    }

    public /* synthetic */ C27133c(InterfaceC2994c0 interfaceC2994c0, C21949k c21949k, C28345n c28345n, C20931a c20931a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0, c21949k, c28345n, c20931a);
    }
}
