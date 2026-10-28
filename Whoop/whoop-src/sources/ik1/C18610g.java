package ik1;

import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.healthspan.domain.AbstractC8802a;
import com.whoop.healthspan.domain.C8803b;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jk1.C21758c;
import l83.C23454a0;
import od1.AbstractC27845h;
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

/* JADX INFO: renamed from: ik1.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f*\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f8\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\"¨\u0006$"}, m65681d2 = {"Lik1/g;", "Landroidx/lifecycle/w1;", "Lcom/whoop/healthspan/domain/b;", "interactor", "Ljk1/c;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lcom/whoop/healthspan/domain/b;Ljk1/c;Lbc3/c0;)V", "Lik1/f;", "viewEvent", "Lcom/whoop/healthspan/domain/a;", "o", "(Lik1/f;)Lcom/whoop/healthspan/domain/a;", "Lec3/l;", "Lcom/whoop/healthspan/domain/HealthspanDomainResult;", "Lik1/h;", "l", "(Lec3/l;Ljk1/c;)Lec3/l;", "Ll83/a0;", "n", "(Lik1/f;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "Lec3/o1;", "x", "Lec3/o1;", "eventFlow", "y", "Lec3/l;", "domainState", "z", "getViewState", "()Lec3/l;", "viewState", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18610g extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: ik1.g$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthspan.presentation.HealthspanViewModel$sendViewEvent$1", m100430f = "HealthspanViewModel.kt", m100431l = {35}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f72750w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC18609f f72752y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC18609f abstractC18609f, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f72752y = abstractC18609f;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C18610g.this.new a(this.f72752y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f72750w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C18610g.this.eventFlow;
                AbstractC18609f abstractC18609f = this.f72752y;
                this.f72750w = 1;
                if (interfaceC13072o1.emit(abstractC18609f, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ik1.g$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f72753w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C18610g f72754x;

        /* JADX INFO: renamed from: ik1.g$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f72755w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C18610g f72756x;

            /* JADX INFO: renamed from: ik1.g$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.healthspan.presentation.HealthspanViewModel$special$$inlined$map$1$2", m100430f = "HealthspanViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41749a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f72757E;

                /* JADX INFO: renamed from: F */
                Object f72758F;

                /* JADX INFO: renamed from: G */
                Object f72759G;

                /* JADX INFO: renamed from: H */
                int f72760H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f72761w;

                /* JADX INFO: renamed from: x */
                int f72762x;

                /* JADX INFO: renamed from: y */
                Object f72763y;

                public C41749a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f72761w = obj;
                    this.f72762x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C18610g c18610g) {
                this.f72755w = interfaceC13062m;
                this.f72756x = c18610g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41749a c41749a;
                if (interfaceC30057d instanceof C41749a) {
                    c41749a = (C41749a) interfaceC30057d;
                    int i13 = c41749a.f72762x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41749a.f72762x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41749a = new C41749a(interfaceC30057d);
                    }
                } else {
                    c41749a = new C41749a(interfaceC30057d);
                }
                Object obj2 = c41749a.f72761w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41749a.f72762x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f72755w;
                    AbstractC8802a abstractC8802aM53859o = this.f72756x.m53859o((AbstractC18609f) obj);
                    c41749a.f72763y = null;
                    c41749a.f72757E = null;
                    c41749a.f72758F = null;
                    c41749a.f72759G = null;
                    c41749a.f72760H = 0;
                    c41749a.f72762x = 1;
                    if (interfaceC13062m.emit(abstractC8802aM53859o, c41749a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C18610g c18610g) {
            this.f72753w = interfaceC13058l;
            this.f72754x = c18610g;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f72753w.collect(new a(interfaceC13062m, this.f72754x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18610g(C8803b interactor, C21758c reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM83945a = AbstractC27845h.m83945a(new b(c13096w1M36592b, this), interactor);
        this.domainState = interfaceC13058lM83945a;
        this.viewState = AbstractC13091v.m36586L(m53858l(interfaceC13058lM83945a, reducer), coroutineScope, C13105z1.f45288a, 1);
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC13058l m53858l(InterfaceC13058l interfaceC13058l, C21758c c21758c) {
        return c21758c.m61444o(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final AbstractC8802a m53859o(AbstractC18609f viewEvent) {
        if (viewEvent instanceof AbstractC18609f.d) {
            return new AbstractC8802a.d(((AbstractC18609f.d) viewEvent).getCom.mapbox.common.HttpHeaders.DATE java.lang.String());
        }
        if (viewEvent instanceof AbstractC18609f.f) {
            return new AbstractC8802a.f(((AbstractC18609f.f) viewEvent).getStep());
        }
        if (viewEvent instanceof AbstractC18609f.a) {
            return new AbstractC8802a.a(((AbstractC18609f.a) viewEvent).getCom.mapbox.common.HttpHeaders.DATE java.lang.String());
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC18609f.b.f72739a)) {
            return AbstractC8802a.b.f26242a;
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC18609f.c.f72740a)) {
            return AbstractC8802a.c.f26243a;
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC18609f.e.f72742a)) {
            return AbstractC8802a.e.f26245a;
        }
        if (!(viewEvent instanceof AbstractC18609f.g)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC18609f.g gVar = (AbstractC18609f.g) viewEvent;
        return new AbstractC8802a.g(gVar.getId(), gVar.getIsExpanded());
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final void m53860n(AbstractC18609f viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(viewEvent, null), 3);
    }

    public /* synthetic */ C18610g(C8803b c8803b, C21758c c21758c, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c8803b, c21758c, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
