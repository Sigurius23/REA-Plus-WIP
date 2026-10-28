package lo1;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import e51.AbstractC12732h;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ho1.C17537a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io1.AbstractC20744e;
import io1.C20745f;
import io1.C20746g;
import l83.C23454a0;
import m83.AbstractC25265s;
import mo1.C25746a;
import n01.C26089f;
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
import w71.AbstractC36877d;

/* JADX INFO: renamed from: lo1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\f*\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u0004\u0018\u00010\r*\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00110$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020(0\f8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, m65681d2 = {"Llo1/b;", "Landroidx/lifecycle/w1;", "Lio1/g;", "interactor", "Lmo1/a;", "reducer", "Lho1/a;", "analyticsHelper", "Lbc3/c0;", "coroutineScope", "<init>", "(Lio1/g;Lmo1/a;Lho1/a;Lbc3/c0;)V", "Lec3/l;", "Lio1/e;", "Lio1/f;", "interact", "(Lec3/l;)Lec3/l;", "Llo1/a$k;", "p", "(Llo1/a$k;)Lio1/e;", "", "anchorSelectorEvent", "n", "(Ljava/lang/Object;)Lio1/e;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "o", "(Llo1/a$k;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lio1/g;", "x", "Lmo1/a;", "y", "Lho1/a;", "z", "Lbc3/c0;", "Lec3/o1;", "E", "Lec3/o1;", "eventFlow", "Llo1/c;", "F", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24617b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C20746g interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C25746a reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C17537a analyticsHelper;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: lo1.b$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.logsymptoms.presentation.LogSymptomsViewModel$sendViewEvent$1", m100430f = "LogSymptomsViewModel.kt", m100431l = {44}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f96268w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC24616a.k f96270y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC24616a.k kVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f96270y = kVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C24617b.this.new a(this.f96270y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f96268w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C24617b.this.eventFlow;
                InterfaceC24616a.k kVar = this.f96270y;
                this.f96268w = 1;
                if (interfaceC13072o1.emit(kVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: lo1.b$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f96271w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C24617b f96272x;

        /* JADX INFO: renamed from: lo1.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f96273w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C24617b f96274x;

            /* JADX INFO: renamed from: lo1.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.logsymptoms.presentation.LogSymptomsViewModel$special$$inlined$map$1$2", m100430f = "LogSymptomsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41965a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f96275E;

                /* JADX INFO: renamed from: F */
                Object f96276F;

                /* JADX INFO: renamed from: G */
                Object f96277G;

                /* JADX INFO: renamed from: H */
                int f96278H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f96279w;

                /* JADX INFO: renamed from: x */
                int f96280x;

                /* JADX INFO: renamed from: y */
                Object f96281y;

                public C41965a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f96279w = obj;
                    this.f96280x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C24617b c24617b) {
                this.f96273w = interfaceC13062m;
                this.f96274x = c24617b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41965a c41965a;
                if (interfaceC30057d instanceof C41965a) {
                    c41965a = (C41965a) interfaceC30057d;
                    int i13 = c41965a.f96280x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41965a.f96280x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41965a = new C41965a(interfaceC30057d);
                    }
                } else {
                    c41965a = new C41965a(interfaceC30057d);
                }
                Object obj2 = c41965a.f96279w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41965a.f96280x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f96273w;
                    C24618c c24618cM75962d = this.f96274x.reducer.m75962d((C20745f) obj);
                    c41965a.f96281y = null;
                    c41965a.f96275E = null;
                    c41965a.f96276F = null;
                    c41965a.f96277G = null;
                    c41965a.f96278H = 0;
                    c41965a.f96280x = 1;
                    if (interfaceC13062m.emit(c24618cM75962d, c41965a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C24617b c24617b) {
            this.f96271w = interfaceC13058l;
            this.f96272x = c24617b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f96271w.collect(new a(interfaceC13062m, this.f96272x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: lo1.b$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f96283w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C24617b f96284x;

        /* JADX INFO: renamed from: lo1.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f96285w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C24617b f96286x;

            /* JADX INFO: renamed from: lo1.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.logsymptoms.presentation.LogSymptomsViewModel$special$$inlined$mapNotNull$1$2", m100430f = "LogSymptomsViewModel.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41966a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f96287E;

                /* JADX INFO: renamed from: F */
                Object f96288F;

                /* JADX INFO: renamed from: G */
                Object f96289G;

                /* JADX INFO: renamed from: H */
                Object f96290H;

                /* JADX INFO: renamed from: I */
                int f96291I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f96292w;

                /* JADX INFO: renamed from: x */
                int f96293x;

                /* JADX INFO: renamed from: y */
                Object f96294y;

                public C41966a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f96292w = obj;
                    this.f96293x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C24617b c24617b) {
                this.f96285w = interfaceC13062m;
                this.f96286x = c24617b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41966a c41966a;
                if (interfaceC30057d instanceof C41966a) {
                    c41966a = (C41966a) interfaceC30057d;
                    int i13 = c41966a.f96293x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41966a.f96293x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41966a = new C41966a(interfaceC30057d);
                    }
                } else {
                    c41966a = new C41966a(interfaceC30057d);
                }
                Object obj2 = c41966a.f96292w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41966a.f96293x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f96285w;
                    AbstractC20744e abstractC20744eM71916p = this.f96286x.m71916p((InterfaceC24616a.k) obj);
                    if (abstractC20744eM71916p != null) {
                        c41966a.f96294y = null;
                        c41966a.f96287E = null;
                        c41966a.f96288F = null;
                        c41966a.f96289G = null;
                        c41966a.f96290H = null;
                        c41966a.f96291I = 0;
                        c41966a.f96293x = 1;
                        if (interfaceC13062m.emit(abstractC20744eM71916p, c41966a) == enumC31071a) {
                            return enumC31071a;
                        }
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

        public c(InterfaceC13058l interfaceC13058l, C24617b c24617b) {
            this.f96283w = interfaceC13058l;
            this.f96284x = c24617b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f96283w.collect(new a(interfaceC13062m, this.f96284x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24617b(C20746g interactor, C25746a reducer, C17537a analyticsHelper, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.analyticsHelper = analyticsHelper;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(new b(interact(new c(c13096w1M36592b, this)), this), coroutineScope, C13105z1.f45288a, 1);
    }

    private final InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return this.interactor.interact(interfaceC13058l);
    }

    /* JADX INFO: renamed from: n */
    private final AbstractC20744e m71915n(Object anchorSelectorEvent) {
        if (anchorSelectorEvent instanceof AbstractC12732h.b) {
            this.analyticsHelper.m49840f(new InterfaceC24616a.j(((AbstractC12732h.b) anchorSelectorEvent).getTagId()));
            return null;
        }
        if (anchorSelectorEvent instanceof AbstractC12732h.a) {
            Object obj = ((AbstractC12732h.a) anchorSelectorEvent).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
            if (obj instanceof C26089f) {
                C26089f c26089f = (C26089f) obj;
                String listId = c26089f.getListId();
                String str = (String) AbstractC25265s.m74100H0(c26089f.m77610b());
                if (AbstractC22676k.m65745e(listId, "menstruation")) {
                    return new AbstractC20744e.f(str);
                }
                if (AbstractC22676k.m65745e(listId, "cervical_mucus")) {
                    return new AbstractC20744e.d(str);
                }
            } else {
                if (obj instanceof AbstractC36877d.k) {
                    AbstractC36877d.k kVar = (AbstractC36877d.k) obj;
                    return new AbstractC20744e.g(kVar.getQuestionId(), AbstractC22676k.m65745e(kVar.getBoolean(), Boolean.TRUE));
                }
                if (obj instanceof AbstractC36877d.e) {
                    AbstractC36877d.e eVar = (AbstractC36877d.e) obj;
                    return new AbstractC20744e.g(eVar.getQuestionId(), eVar.getIsChecked());
                }
                if (obj instanceof AbstractC36877d.a) {
                    AbstractC36877d.a aVar = (AbstractC36877d.a) obj;
                    return new AbstractC20744e.e(aVar.getQuestionId(), aVar.getNumber());
                }
                if (obj instanceof AbstractC36877d.c) {
                    AbstractC36877d.c cVar = (AbstractC36877d.c) obj;
                    return new AbstractC20744e.e(cVar.getQuestionId(), cVar.getNumber());
                }
                if (obj instanceof AbstractC36877d.i) {
                    AbstractC36877d.i iVar = (AbstractC36877d.i) obj;
                    return new AbstractC20744e.h(iVar.getQuestionId(), iVar.getTime());
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final AbstractC20744e m71916p(InterfaceC24616a.k kVar) {
        if (kVar instanceof InterfaceC24616a.g) {
            return new AbstractC20744e.b(((InterfaceC24616a.g) kVar).getRequestDate());
        }
        if (kVar instanceof InterfaceC24616a.h) {
            return AbstractC20744e.c.f77848a;
        }
        if (kVar instanceof InterfaceC24616a.b) {
            return m71915n(((InterfaceC24616a.b) kVar).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: o */
    public final void m71917o(InterfaceC24616a.k event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C24617b(C20746g c20746g, C25746a c25746a, C17537a c17537a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c20746g, c25746a, c17537a, (i13 & 8) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
