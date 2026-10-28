package vt1;

import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
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
import tt1.C34162c;
import tt1.InterfaceC34160a;

/* JADX INFO: renamed from: vt1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n*\b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000f0\n8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, m65681d2 = {"Lvt1/b;", "Landroidx/lifecycle/w1;", "Ltt1/c;", "interactor", "Lvt1/d;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Ltt1/c;Lvt1/d;Lbc3/c0;)V", "Lec3/l;", "Ltt1/a;", "Ltt1/b;", "l", "(Lec3/l;Ltt1/c;)Lec3/l;", "Lvt1/c;", "o", "(Lec3/l;Lvt1/d;)Lec3/l;", "Lvt1/a$d;", "viewEvent", "Ltt1/a$a;", "n", "(Lvt1/a$d;)Ltt1/a$a;", "Lbc3/k1;", "p", "(Lvt1/a$d;)Lbc3/k1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "Lec3/o1;", "x", "Lec3/o1;", "eventFlow", "Lec3/t1;", "y", "Lec3/t1;", "domainState", "z", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36488b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13087t1 domainState;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: vt1.b$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.registration.presentation.LabradorRegistrationViewModel$sendViewEvent$1", m100430f = "LabradorRegistrationViewModel.kt", m100431l = {40}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f155864w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC36487a.d f155866y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC36487a.d dVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f155866y = dVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C36488b.this.new a(this.f155866y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f155864w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C36488b.this.eventFlow;
                InterfaceC36487a.d dVar = this.f155866y;
                this.f155864w = 1;
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

    /* JADX INFO: renamed from: vt1.b$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f155867w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C36488b f155868x;

        /* JADX INFO: renamed from: vt1.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f155869w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C36488b f155870x;

            /* JADX INFO: renamed from: vt1.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.registration.presentation.LabradorRegistrationViewModel$special$$inlined$map$1$2", m100430f = "LabradorRegistrationViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42564a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f155871E;

                /* JADX INFO: renamed from: F */
                Object f155872F;

                /* JADX INFO: renamed from: G */
                Object f155873G;

                /* JADX INFO: renamed from: H */
                int f155874H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f155875w;

                /* JADX INFO: renamed from: x */
                int f155876x;

                /* JADX INFO: renamed from: y */
                Object f155877y;

                public C42564a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f155875w = obj;
                    this.f155876x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C36488b c36488b) {
                this.f155869w = interfaceC13062m;
                this.f155870x = c36488b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42564a c42564a;
                if (interfaceC30057d instanceof C42564a) {
                    c42564a = (C42564a) interfaceC30057d;
                    int i13 = c42564a.f155876x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42564a.f155876x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42564a = new C42564a(interfaceC30057d);
                    }
                } else {
                    c42564a = new C42564a(interfaceC30057d);
                }
                Object obj2 = c42564a.f155875w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42564a.f155876x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f155869w;
                    InterfaceC34160a.a aVarM116928n = this.f155870x.m116928n((InterfaceC36487a.d) obj);
                    c42564a.f155877y = null;
                    c42564a.f155871E = null;
                    c42564a.f155872F = null;
                    c42564a.f155873G = null;
                    c42564a.f155874H = 0;
                    c42564a.f155876x = 1;
                    if (interfaceC13062m.emit(aVarM116928n, c42564a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C36488b c36488b) {
            this.f155867w = interfaceC13058l;
            this.f155868x = c36488b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f155867w.collect(new a(interfaceC13062m, this.f155868x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36488b(C34162c interactor, C36490d reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(m116927l(new b(c13096w1M36592b, this), interactor), coroutineScope, C13105z1.f45288a, 1);
        this.domainState = c13078q1M36586L;
        this.viewState = m116929o(c13078q1M36586L, reducer);
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC13058l m116927l(InterfaceC13058l interfaceC13058l, C34162c c34162c) {
        return c34162c.m107950d(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final InterfaceC34160a.a m116928n(InterfaceC36487a.d viewEvent) {
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC36487a.b.f155859a)) {
            return InterfaceC34160a.a.f143186a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: o */
    private final InterfaceC13058l m116929o(InterfaceC13058l interfaceC13058l, C36490d c36490d) {
        return c36490d.m116946b(interfaceC13058l);
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: p */
    public final InterfaceC3027k1 m116930p(InterfaceC36487a.d viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        return AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(viewEvent, null), 3);
    }

    public /* synthetic */ C36488b(C34162c c34162c, C36490d c36490d, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c34162c, c36490d, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
