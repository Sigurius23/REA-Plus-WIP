package oe1;

import androidx.core.app.NotificationCompat;
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
import ke1.AbstractC22418a;
import ke1.C22420c;
import l83.C23454a0;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pe1.C29116b;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: oe1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\f*\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\f*\b\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\r*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00140$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00110\f8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, m65681d2 = {"Loe1/d;", "Landroidx/lifecycle/w1;", "Lke1/c;", "interactor", "Lpe1/b;", "reducer", "Loe1/b;", "analyticsHelper", "Lbc3/c0;", "coroutineScope", "<init>", "(Lke1/c;Lpe1/b;Loe1/b;Lbc3/c0;)V", "Lec3/l;", "Lke1/a;", "Lke1/b;", "l", "(Lec3/l;Lke1/c;)Lec3/l;", "Loe1/e;", "o", "(Lec3/l;Lpe1/b;)Lec3/l;", "Loe1/c;", "q", "(Loe1/c;)Lke1/a;", "viewEvent", "Lbc3/k1;", "p", "(Loe1/c;)Lbc3/k1;", "Loe1/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "n", "(Loe1/a;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Loe1/b;", "x", "Lbc3/c0;", "Lec3/o1;", "y", "Lec3/o1;", "eventFlow", "z", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "education_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27874d extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C27872b analyticsHelper;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: oe1.d$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.education.presentation.EducationViewModel$sendViewEvent$1", m100430f = "EducationViewModel.kt", m100431l = {41}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f112393w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC27873c f112395y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC27873c abstractC27873c, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f112395y = abstractC27873c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C27874d.this.new a(this.f112395y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f112393w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C27874d.this.eventFlow;
                AbstractC27873c abstractC27873c = this.f112395y;
                this.f112393w = 1;
                if (interfaceC13072o1.emit(abstractC27873c, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: oe1.d$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f112396w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C27874d f112397x;

        /* JADX INFO: renamed from: oe1.d$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f112398w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C27874d f112399x;

            /* JADX INFO: renamed from: oe1.d$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.education.presentation.EducationViewModel$special$$inlined$map$1$2", m100430f = "EducationViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42120a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f112400E;

                /* JADX INFO: renamed from: F */
                Object f112401F;

                /* JADX INFO: renamed from: G */
                Object f112402G;

                /* JADX INFO: renamed from: H */
                int f112403H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f112404w;

                /* JADX INFO: renamed from: x */
                int f112405x;

                /* JADX INFO: renamed from: y */
                Object f112406y;

                public C42120a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f112404w = obj;
                    this.f112405x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C27874d c27874d) {
                this.f112398w = interfaceC13062m;
                this.f112399x = c27874d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42120a c42120a;
                if (interfaceC30057d instanceof C42120a) {
                    c42120a = (C42120a) interfaceC30057d;
                    int i13 = c42120a.f112405x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42120a.f112405x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42120a = new C42120a(interfaceC30057d);
                    }
                } else {
                    c42120a = new C42120a(interfaceC30057d);
                }
                Object obj2 = c42120a.f112404w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42120a.f112405x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f112398w;
                    AbstractC22418a abstractC22418aM84140q = this.f112399x.m84140q((AbstractC27873c) obj);
                    c42120a.f112406y = null;
                    c42120a.f112400E = null;
                    c42120a.f112401F = null;
                    c42120a.f112402G = null;
                    c42120a.f112403H = 0;
                    c42120a.f112405x = 1;
                    if (interfaceC13062m.emit(abstractC22418aM84140q, c42120a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C27874d c27874d) {
            this.f112396w = interfaceC13058l;
            this.f112397x = c27874d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f112396w.collect(new a(interfaceC13062m, this.f112397x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27874d(C22420c interactor, C29116b reducer, C27872b analyticsHelper, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.analyticsHelper = analyticsHelper;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(m84139o(m84138l(new b(c13096w1M36592b, this), interactor), reducer), coroutineScope, C13105z1.f45288a, 1);
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC13058l m84138l(InterfaceC13058l interfaceC13058l, C22420c c22420c) {
        return c22420c.m64562f(interfaceC13058l);
    }

    /* JADX INFO: renamed from: o */
    private final InterfaceC13058l m84139o(InterfaceC13058l interfaceC13058l, C29116b c29116b) {
        return c29116b.m88477a(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final AbstractC22418a m84140q(AbstractC27873c abstractC27873c) {
        if (abstractC27873c instanceof AbstractC27873c.a) {
            return new AbstractC22418a.a(((AbstractC27873c.a) abstractC27873c).getFeatureEducationPath());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final void m84141n(InterfaceC27871a event) {
        AbstractC22676k.m65750j(event, "event");
        this.analyticsHelper.m84134a(event);
    }

    /* JADX INFO: renamed from: p */
    public final InterfaceC3027k1 m84142p(AbstractC27873c viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        return AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(viewEvent, null), 3);
    }

    public /* synthetic */ C27874d(C22420c c22420c, C29116b c29116b, C27872b c27872b, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c22420c, c29116b, c27872b, (i13 & 8) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
