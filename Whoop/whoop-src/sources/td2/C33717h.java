package td2;

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
import rd2.C31249c;
import rd2.InterfaceC31247a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: td2.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\f*\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\f*\b\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00140\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00110\f8\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010(¨\u0006*"}, m65681d2 = {"Ltd2/h;", "Landroidx/lifecycle/w1;", "Lrd2/c;", "interactor", "Ltd2/j;", "reducer", "", "historyDate", "Lbc3/c0;", "coroutineScope", "<init>", "(Lrd2/c;Ltd2/j;Ljava/lang/String;Lbc3/c0;)V", "Lec3/l;", "Lrd2/a;", "Lrd2/b;", "l", "(Lec3/l;Lrd2/c;)Lec3/l;", "Ltd2/i;", "o", "(Lec3/l;Ltd2/j;)Lec3/l;", "Ltd2/f$j;", "viewEvent", "n", "(Ltd2/f$j;)Lrd2/a;", "Lbc3/k1;", "p", "(Ltd2/f$j;)Lbc3/k1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "x", "Lbc3/c0;", "Lec3/o1;", "y", "Lec3/o1;", "eventFlow", "z", "Lec3/l;", "domainState", "E", "getViewState", "()Lec3/l;", "viewState", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33717h extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String historyDate;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: td2.h$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.detail.presentation.ShepherdHistoryDetailViewModel$sendViewEvent$1", m100430f = "ShepherdHistoryDetailViewModel.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f140983w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC33715f.j f140985y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC33715f.j jVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f140985y = jVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C33717h.this.new a(this.f140985y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f140983w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C33717h.this.eventFlow;
                InterfaceC33715f.j jVar = this.f140985y;
                this.f140983w = 1;
                if (interfaceC13072o1.emit(jVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: td2.h$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f140986w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C33717h f140987x;

        /* JADX INFO: renamed from: td2.h$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f140988w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C33717h f140989x;

            /* JADX INFO: renamed from: td2.h$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.detail.presentation.ShepherdHistoryDetailViewModel$special$$inlined$map$1$2", m100430f = "ShepherdHistoryDetailViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42376a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f140990E;

                /* JADX INFO: renamed from: F */
                Object f140991F;

                /* JADX INFO: renamed from: G */
                Object f140992G;

                /* JADX INFO: renamed from: H */
                int f140993H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f140994w;

                /* JADX INFO: renamed from: x */
                int f140995x;

                /* JADX INFO: renamed from: y */
                Object f140996y;

                public C42376a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f140994w = obj;
                    this.f140995x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C33717h c33717h) {
                this.f140988w = interfaceC13062m;
                this.f140989x = c33717h;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42376a c42376a;
                if (interfaceC30057d instanceof C42376a) {
                    c42376a = (C42376a) interfaceC30057d;
                    int i13 = c42376a.f140995x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42376a.f140995x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42376a = new C42376a(interfaceC30057d);
                    }
                } else {
                    c42376a = new C42376a(interfaceC30057d);
                }
                Object obj2 = c42376a.f140994w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42376a.f140995x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f140988w;
                    InterfaceC31247a interfaceC31247aM106557n = this.f140989x.m106557n((InterfaceC33715f.j) obj);
                    c42376a.f140996y = null;
                    c42376a.f140990E = null;
                    c42376a.f140991F = null;
                    c42376a.f140992G = null;
                    c42376a.f140993H = 0;
                    c42376a.f140995x = 1;
                    if (interfaceC13062m.emit(interfaceC31247aM106557n, c42376a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C33717h c33717h) {
            this.f140986w = interfaceC13058l;
            this.f140987x = c33717h;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f140986w.collect(new a(interfaceC13062m, this.f140987x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33717h(C31249c interactor, C33719j reducer, String str, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.historyDate = str;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(m106556l(new b(c13096w1M36592b, this), interactor), coroutineScope, C13105z1.f45288a, 1);
        this.domainState = c13078q1M36586L;
        this.viewState = m106558o(c13078q1M36586L, reducer);
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC13058l m106556l(InterfaceC13058l interfaceC13058l, C31249c c31249c) {
        return c31249c.m96269g(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final InterfaceC31247a m106557n(InterfaceC33715f.j viewEvent) {
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC33715f.e.f140969a)) {
            return new InterfaceC31247a.d(this.historyDate);
        }
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC33715f.d.f140968a)) {
            return InterfaceC31247a.c.f128711a;
        }
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC33715f.b.f140966a)) {
            return InterfaceC31247a.b.f128710a;
        }
        if (viewEvent instanceof InterfaceC33715f.g) {
            return new InterfaceC31247a.e(((InterfaceC33715f.g) viewEvent).getHistoryDate());
        }
        if (viewEvent instanceof InterfaceC33715f.a) {
            return new InterfaceC31247a.a(((InterfaceC33715f.a) viewEvent).getHistoryDate());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: o */
    private final InterfaceC13058l m106558o(InterfaceC13058l interfaceC13058l, C33719j c33719j) {
        return c33719j.m106592b(interfaceC13058l);
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: p */
    public final InterfaceC3027k1 m106559p(InterfaceC33715f.j viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        return AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(viewEvent, null), 3);
    }

    public /* synthetic */ C33717h(C31249c c31249c, C33719j c33719j, String str, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c31249c, c33719j, str, (i13 & 8) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
