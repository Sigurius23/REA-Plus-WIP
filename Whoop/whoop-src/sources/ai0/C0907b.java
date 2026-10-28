package ai0;

import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bi0.C3283a;
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
import yh0.AbstractC39535a;
import yh0.AbstractC39536b;
import yh0.C39537c;

/* JADX INFO: renamed from: ai0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m65681d2 = {"Lai0/b;", "Landroidx/lifecycle/w1;", "Lyh0/c;", "interactor", "Lbi0/a;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lyh0/c;Lbi0/a;Lbc3/c0;)V", "Lec3/l;", "Lyh0/a;", "Lyh0/b;", "j", "(Lec3/l;Lyh0/c;)Lec3/l;", "Lai0/a;", "viewEvent", "Ll83/a0;", "l", "(Lai0/a;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "Lec3/o1;", "x", "Lec3/o1;", "eventFlow", "y", "Lec3/l;", "domainState", "Lai0/c;", "z", "getViewState", "()Lec3/l;", "viewState", "amoeba_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0907b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: ai0.b$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.amoeba.debug.presentation.AmoebaDebugViewModel$sendViewEvent$1", m100430f = "AmoebaDebugViewModel.kt", m100431l = {42}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f3309w;

        /* JADX INFO: renamed from: x */
        int f3310x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC0906a f3311y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C0907b f3312z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC0906a abstractC0906a, C0907b c0907b, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f3311y = abstractC0906a;
            this.f3312z = c0907b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f3311y, this.f3312z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object dVar;
            Object eVar;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f3310x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC0906a abstractC0906a = this.f3311y;
                if (abstractC0906a instanceof AbstractC0906a.a) {
                    dVar = new AbstractC39535a.a();
                } else {
                    if (abstractC0906a instanceof AbstractC0906a.c) {
                        eVar = new AbstractC39535a.c(((AbstractC0906a.c) abstractC0906a).getPaceOfAgingAnimationScore());
                    } else if (abstractC0906a instanceof AbstractC0906a.e) {
                        eVar = new AbstractC39535a.e(((AbstractC0906a.e) abstractC0906a).getYearsDifferenceAnimationScore());
                    } else if (abstractC0906a instanceof AbstractC0906a.b) {
                        dVar = new AbstractC39535a.b();
                    } else {
                        if (!(abstractC0906a instanceof AbstractC0906a.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        dVar = new AbstractC39535a.d();
                    }
                    dVar = eVar;
                }
                InterfaceC13072o1 interfaceC13072o1 = this.f3312z.eventFlow;
                this.f3309w = null;
                this.f3310x = 1;
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

    /* JADX INFO: renamed from: ai0.b$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f3313w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C3283a f3314x;

        /* JADX INFO: renamed from: ai0.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f3315w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C3283a f3316x;

            /* JADX INFO: renamed from: ai0.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.amoeba.debug.presentation.AmoebaDebugViewModel$special$$inlined$map$1$2", m100430f = "AmoebaDebugViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41275a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f3317E;

                /* JADX INFO: renamed from: F */
                Object f3318F;

                /* JADX INFO: renamed from: G */
                Object f3319G;

                /* JADX INFO: renamed from: H */
                int f3320H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f3321w;

                /* JADX INFO: renamed from: x */
                int f3322x;

                /* JADX INFO: renamed from: y */
                Object f3323y;

                public C41275a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f3321w = obj;
                    this.f3322x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C3283a c3283a) {
                this.f3315w = interfaceC13062m;
                this.f3316x = c3283a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41275a c41275a;
                if (interfaceC30057d instanceof C41275a) {
                    c41275a = (C41275a) interfaceC30057d;
                    int i13 = c41275a.f3322x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41275a.f3322x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41275a = new C41275a(interfaceC30057d);
                    }
                } else {
                    c41275a = new C41275a(interfaceC30057d);
                }
                Object obj2 = c41275a.f3321w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41275a.f3322x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f3315w;
                    AbstractC0908c abstractC0908cM9554d = this.f3316x.m9554d((AbstractC39536b) obj);
                    c41275a.f3323y = null;
                    c41275a.f3317E = null;
                    c41275a.f3318F = null;
                    c41275a.f3319G = null;
                    c41275a.f3320H = 0;
                    c41275a.f3322x = 1;
                    if (interfaceC13062m.emit(abstractC0908cM9554d, c41275a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C3283a c3283a) {
            this.f3313w = interfaceC13058l;
            this.f3314x = c3283a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f3313w.collect(new a(interfaceC13062m, this.f3314x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0907b(C39537c interactor, C3283a reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM2236j = m2236j(c13096w1M36592b, interactor);
        this.domainState = interfaceC13058lM2236j;
        this.viewState = new b(AbstractC13091v.m36586L(interfaceC13058lM2236j, coroutineScope, C13105z1.f45288a, 0), reducer);
    }

    /* JADX INFO: renamed from: j */
    private final InterfaceC13058l m2236j(InterfaceC13058l interfaceC13058l, C39537c c39537c) {
        return c39537c.m126294c(interfaceC13058l);
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: l */
    public final void m2237l(AbstractC0906a viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(viewEvent, this, null), 3);
    }

    public /* synthetic */ C0907b(C39537c c39537c, C3283a c3283a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c39537c, c3283a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
