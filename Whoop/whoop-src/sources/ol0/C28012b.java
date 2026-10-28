package ol0;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import dl0.AbstractC12163b;
import dl0.C12164c;
import dl0.C12165d;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import ih0.InterfaceC18484b;
import l83.C23454a0;
import ld1.AbstractC23864c;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rg0.C31383d;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: ol0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R \u00100\u001a\b\u0012\u0004\u0012\u00020\u00020+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00061"}, m65681d2 = {"Lol0/b;", "Lld1/c;", "Lol0/c;", "Lol0/a;", "Ldl0/d;", "interactor", "Lol0/d;", "reducer", "Lrg0/d;", "formWidgetAnalyticsHelper", "Lbc3/c0;", "coroutineScope", "<init>", "(Ldl0/d;Lol0/d;Lrg0/d;Lbc3/c0;)V", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "o", "(Lol0/a;)V", "Lih0/b;", "", "fingerprint", "", "isChatV2", "n", "(Lih0/b;Ljava/lang/String;Z)V", "x", "Ldl0/d;", "y", "Lol0/d;", "z", "Lrg0/d;", "E", "Lbc3/c0;", "Lec3/o1;", "Ldl0/b;", "F", "Lec3/o1;", "selectionEventFlow", "Lec3/t1;", "Ldl0/c;", "G", "Lec3/t1;", "widgetState", "Lec3/l;", "H", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28012b extends AbstractC23864c<C28013c, InterfaceC28011a> {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13072o1 selectionEventFlow;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13087t1 widgetState;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C12165d interactor;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C28014d reducer;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C31383d formWidgetAnalyticsHelper;

    /* JADX INFO: renamed from: ol0.b$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.presentation.chatminiarchwidget.ChatMiniArchWidgetViewModel$sendViewEvent$1", m100430f = "ChatMiniArchWidgetViewModel.kt", m100431l = {38}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f112956w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28011a f112957x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C28012b f112958y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC28011a interfaceC28011a, C28012b c28012b, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f112957x = interfaceC28011a;
            this.f112958y = c28012b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f112957x, this.f112958y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f112956w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!(this.f112957x instanceof InterfaceC28011a.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC13072o1 interfaceC13072o1 = this.f112958y.selectionEventFlow;
                AbstractC12163b.a aVar = new AbstractC12163b.a(((InterfaceC28011a.a) this.f112957x).getPath());
                this.f112956w = 1;
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

    /* JADX INFO: renamed from: ol0.b$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f112959w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C28012b f112960x;

        /* JADX INFO: renamed from: ol0.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f112961w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C28012b f112962x;

            /* JADX INFO: renamed from: ol0.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.bot.presentation.chatminiarchwidget.ChatMiniArchWidgetViewModel$special$$inlined$map$1$2", m100430f = "ChatMiniArchWidgetViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42124a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f112963E;

                /* JADX INFO: renamed from: F */
                Object f112964F;

                /* JADX INFO: renamed from: G */
                Object f112965G;

                /* JADX INFO: renamed from: H */
                int f112966H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f112967w;

                /* JADX INFO: renamed from: x */
                int f112968x;

                /* JADX INFO: renamed from: y */
                Object f112969y;

                public C42124a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f112967w = obj;
                    this.f112968x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C28012b c28012b) {
                this.f112961w = interfaceC13062m;
                this.f112962x = c28012b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42124a c42124a;
                if (interfaceC30057d instanceof C42124a) {
                    c42124a = (C42124a) interfaceC30057d;
                    int i13 = c42124a.f112968x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42124a.f112968x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42124a = new C42124a(interfaceC30057d);
                    }
                } else {
                    c42124a = new C42124a(interfaceC30057d);
                }
                Object obj2 = c42124a.f112967w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42124a.f112968x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f112961w;
                    C28013c c28013cM84486a = this.f112962x.reducer.m84486a((C12164c) obj);
                    c42124a.f112969y = null;
                    c42124a.f112963E = null;
                    c42124a.f112964F = null;
                    c42124a.f112965G = null;
                    c42124a.f112966H = 0;
                    c42124a.f112968x = 1;
                    if (interfaceC13062m.emit(c28013cM84486a, c42124a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C28012b c28012b) {
            this.f112959w = interfaceC13058l;
            this.f112960x = c28012b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f112959w.collect(new a(interfaceC13062m, this.f112960x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28012b(C12165d interactor, C28014d reducer, C31383d formWidgetAnalyticsHelper, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(formWidgetAnalyticsHelper, "formWidgetAnalyticsHelper");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.formWidgetAnalyticsHelper = formWidgetAnalyticsHelper;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.selectionEventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lInteract = interactor.interact(c13096w1M36592b);
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lInteract, coroutineScope, c13021b2, 1);
        this.widgetState = c13078q1M36586L;
        this.viewState = AbstractC13091v.m36586L(new b(c13078q1M36586L, this), coroutineScope, c13021b2, 1);
    }

    @Override // ld1.AbstractC23864c
    public InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final void m84477n(InterfaceC18484b event, String fingerprint, boolean isChatV2) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(fingerprint, "fingerprint");
        this.formWidgetAnalyticsHelper.m96641b(event, fingerprint, isChatV2);
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo1216g(InterfaceC28011a event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, this, null), 3);
    }

    public /* synthetic */ C28012b(C12165d c12165d, C28014d c28014d, C31383d c31383d, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12165d, c28014d, c31383d, (i13 & 8) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
