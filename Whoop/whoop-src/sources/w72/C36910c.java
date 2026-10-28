package w72;

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
import t72.AbstractC33582a;
import t72.C33584c;
import y72.C39286b;

/* JADX INFO: renamed from: w72.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e*\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e8\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010(¨\u0006*"}, m65681d2 = {"Lw72/c;", "Landroidx/lifecycle/w1;", "Lt72/c;", "interactor", "Ly72/b;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lt72/c;Ly72/b;Lbc3/c0;)V", "Lw72/b;", "Lt72/a;", "o", "(Lw72/b;)Lt72/a;", "Lec3/l;", "Lt72/b;", "Lw72/d;", "l", "(Lec3/l;Ly72/b;)Lec3/l;", "interact", "(Lec3/l;)Lec3/l;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "n", "(Lw72/b;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lt72/c;", "x", "Ly72/b;", "y", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "E", "Lec3/l;", "domainState", "F", "getViewState", "()Lec3/l;", "viewState", "sanguine_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36910c extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C33584c interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C39286b reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: w72.c$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sanguine.presentation.SanguineWaitlistBiomarkerListViewModel$sendViewEvent$1", m100430f = "SanguineWaitlistBiomarkerListViewModel.kt", m100431l = {35}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f157906w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC36909b f157908y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC36909b interfaceC36909b, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f157908y = interfaceC36909b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C36910c.this.new a(this.f157908y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f157906w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C36910c.this.eventFlow;
                InterfaceC36909b interfaceC36909b = this.f157908y;
                this.f157906w = 1;
                if (interfaceC13072o1.emit(interfaceC36909b, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: w72.c$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f157909w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C36910c f157910x;

        /* JADX INFO: renamed from: w72.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f157911w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C36910c f157912x;

            /* JADX INFO: renamed from: w72.c$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.sanguine.presentation.SanguineWaitlistBiomarkerListViewModel$special$$inlined$map$1$2", m100430f = "SanguineWaitlistBiomarkerListViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42578a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f157913E;

                /* JADX INFO: renamed from: F */
                Object f157914F;

                /* JADX INFO: renamed from: G */
                Object f157915G;

                /* JADX INFO: renamed from: H */
                int f157916H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f157917w;

                /* JADX INFO: renamed from: x */
                int f157918x;

                /* JADX INFO: renamed from: y */
                Object f157919y;

                public C42578a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f157917w = obj;
                    this.f157918x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C36910c c36910c) {
                this.f157911w = interfaceC13062m;
                this.f157912x = c36910c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42578a c42578a;
                if (interfaceC30057d instanceof C42578a) {
                    c42578a = (C42578a) interfaceC30057d;
                    int i13 = c42578a.f157918x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42578a.f157918x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42578a = new C42578a(interfaceC30057d);
                    }
                } else {
                    c42578a = new C42578a(interfaceC30057d);
                }
                Object obj2 = c42578a.f157917w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42578a.f157918x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f157911w;
                    AbstractC33582a abstractC33582aM118529o = this.f157912x.m118529o((InterfaceC36909b) obj);
                    c42578a.f157919y = null;
                    c42578a.f157913E = null;
                    c42578a.f157914F = null;
                    c42578a.f157915G = null;
                    c42578a.f157916H = 0;
                    c42578a.f157918x = 1;
                    if (interfaceC13062m.emit(abstractC33582aM118529o, c42578a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C36910c c36910c) {
            this.f157909w = interfaceC13058l;
            this.f157910x = c36910c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f157909w.collect(new a(interfaceC13062m, this.f157910x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36910c(C33584c interactor, C39286b reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interact(new b(c13096w1M36592b, this)), coroutineScope, C13105z1.f45288a, 1);
        this.domainState = c13078q1M36586L;
        this.viewState = m118528l(c13078q1M36586L, reducer);
    }

    private final InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return this.interactor.interact(interfaceC13058l);
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC13058l m118528l(InterfaceC13058l interfaceC13058l, C39286b c39286b) {
        return c39286b.m125262b(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final AbstractC33582a m118529o(InterfaceC36909b interfaceC36909b) {
        if (interfaceC36909b instanceof InterfaceC36909b.a) {
            return AbstractC33582a.a.f140099a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final void m118530n(InterfaceC36909b event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C36910c(C33584c c33584c, C39286b c39286b, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c33584c, c39286b, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
