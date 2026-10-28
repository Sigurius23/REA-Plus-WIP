package wb0;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
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
import ub0.AbstractC34738c;
import ub0.C34737b;
import ub0.C34740e;
import xb0.C38161a;

/* JADX INFO: renamed from: wb0.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e*\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e8\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010&¨\u0006("}, m65681d2 = {"Lwb0/h;", "Landroidx/lifecycle/w1;", "Lub0/e;", "interactor", "Lxb0/a;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lub0/e;Lxb0/a;Lbc3/c0;)V", "Lwb0/g;", "Lub0/c;", "o", "(Lwb0/g;)Lub0/c;", "Lec3/l;", "Lub0/d;", "Lwb0/i;", "l", "(Lec3/l;Lxb0/a;)Lec3/l;", "interact", "(Lec3/l;)Lec3/l;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "n", "(Lwb0/g;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lub0/e;", "x", "Lbc3/c0;", "Lec3/o1;", "y", "Lec3/o1;", "eventFlow", "z", "Lec3/l;", "domainState", "E", "getViewState", "()Lec3/l;", "viewState", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37037h extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C34740e interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: wb0.h$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.editbiomarkers.presentation.EditBiomarkersViewModel$sendViewEvent$1", m100430f = "EditBiomarkersViewModel.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f158469w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC37036g f158471y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC37036g abstractC37036g, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f158471y = abstractC37036g;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C37037h.this.new a(this.f158471y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f158469w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C37037h.this.eventFlow;
                AbstractC37036g abstractC37036g = this.f158471y;
                this.f158469w = 1;
                if (interfaceC13072o1.emit(abstractC37036g, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: wb0.h$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f158472w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C37037h f158473x;

        /* JADX INFO: renamed from: wb0.h$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f158474w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C37037h f158475x;

            /* JADX INFO: renamed from: wb0.h$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.editbiomarkers.presentation.EditBiomarkersViewModel$special$$inlined$map$1$2", m100430f = "EditBiomarkersViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42582a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f158476E;

                /* JADX INFO: renamed from: F */
                Object f158477F;

                /* JADX INFO: renamed from: G */
                Object f158478G;

                /* JADX INFO: renamed from: H */
                int f158479H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f158480w;

                /* JADX INFO: renamed from: x */
                int f158481x;

                /* JADX INFO: renamed from: y */
                Object f158482y;

                public C42582a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f158480w = obj;
                    this.f158481x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C37037h c37037h) {
                this.f158474w = interfaceC13062m;
                this.f158475x = c37037h;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42582a c42582a;
                if (interfaceC30057d instanceof C42582a) {
                    c42582a = (C42582a) interfaceC30057d;
                    int i13 = c42582a.f158481x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42582a.f158481x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42582a = new C42582a(interfaceC30057d);
                    }
                } else {
                    c42582a = new C42582a(interfaceC30057d);
                }
                Object obj2 = c42582a.f158480w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42582a.f158481x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f158474w;
                    AbstractC34738c abstractC34738cM118879o = this.f158475x.m118879o((AbstractC37036g) obj);
                    c42582a.f158482y = null;
                    c42582a.f158476E = null;
                    c42582a.f158477F = null;
                    c42582a.f158478G = null;
                    c42582a.f158479H = 0;
                    c42582a.f158481x = 1;
                    if (interfaceC13062m.emit(abstractC34738cM118879o, c42582a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C37037h c37037h) {
            this.f158472w = interfaceC13058l;
            this.f158473x = c37037h;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f158472w.collect(new a(interfaceC13062m, this.f158473x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37037h(C34740e interactor, C38161a reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interact(new b(c13096w1M36592b, this)), coroutineScope, C13105z1.f45288a, 1);
        this.domainState = c13078q1M36586L;
        this.viewState = m118878l(c13078q1M36586L, reducer);
    }

    private final InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return this.interactor.interact(interfaceC13058l);
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC13058l m118878l(InterfaceC13058l interfaceC13058l, C38161a c38161a) {
        return c38161a.m122235i(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final AbstractC34738c m118879o(AbstractC37036g abstractC37036g) {
        if (abstractC37036g instanceof AbstractC37036g.d) {
            AbstractC37036g.d dVar = (AbstractC37036g.d) abstractC37036g;
            return new AbstractC34738c.c(dVar.getTestId(), dVar.getIsAiConfirmation());
        }
        if (abstractC37036g instanceof AbstractC37036g.e) {
            List<C37035f> listM118872a = ((AbstractC37036g.e) abstractC37036g).m118872a();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM118872a, 10));
            for (C37035f c37035f : listM118872a) {
                arrayList.add(new C34737b(c37035f.getBiomarkerId(), c37035f.getIncluded(), c37035f.getValue(), c37035f.getUnit(), null, 16, null));
            }
            return new AbstractC34738c.e(arrayList);
        }
        if (abstractC37036g instanceof AbstractC37036g.b) {
            return new AbstractC34738c.d(((AbstractC37036g.b) abstractC37036g).getBiomarkerId());
        }
        if (abstractC37036g instanceof AbstractC37036g.f) {
            AbstractC37036g.f fVar = (AbstractC37036g.f) abstractC37036g;
            return new AbstractC34738c.f(fVar.getBiomarkerId(), fVar.getValue(), fVar.getUnit());
        }
        if (abstractC37036g instanceof AbstractC37036g.a) {
            return AbstractC34738c.a.f146284a;
        }
        if (abstractC37036g instanceof AbstractC37036g.c) {
            return new AbstractC34738c.b(((AbstractC37036g.c) abstractC37036g).getBiomarkerId());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final void m118880n(AbstractC37036g event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C37037h(C34740e c34740e, C38161a c38161a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c34740e, c38161a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
