package ue2;

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
import se2.C32426d;
import se2.InterfaceC32424b;
import se2.InterfaceC32425c;
import te2.InterfaceC33753b;

/* JADX INFO: renamed from: ue2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e*\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m65681d2 = {"Lue2/c;", "Landroidx/lifecycle/w1;", "Lue2/b;", "reducer", "Lse2/d;", "interactor", "Lbc3/c0;", "coroutineScope", "<init>", "(Lue2/b;Lse2/d;Lbc3/c0;)V", "Lte2/b$b;", "Lse2/b;", "l", "(Lte2/b$b;)Lse2/b;", "Lec3/l;", "Lse2/c;", "Lue2/a;", "n", "(Lec3/l;Lue2/b;)Lec3/l;", "viewEvent", "Ll83/a0;", "o", "(Lte2/b$b;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "Lec3/o1;", "x", "Lec3/o1;", "eventFlow", "y", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34863c extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: ue2.c$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f146836w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C34862b f146837x;

        /* JADX INFO: renamed from: ue2.c$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42460a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f146838w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C34862b f146839x;

            /* JADX INFO: renamed from: ue2.c$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.alarmWarning.presentation.TurnoffAlarmWarningViewModel$reduce$$inlined$map$1$2", m100430f = "TurnoffAlarmWarningViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42461a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f146840E;

                /* JADX INFO: renamed from: F */
                Object f146841F;

                /* JADX INFO: renamed from: G */
                Object f146842G;

                /* JADX INFO: renamed from: H */
                int f146843H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f146844w;

                /* JADX INFO: renamed from: x */
                int f146845x;

                /* JADX INFO: renamed from: y */
                Object f146846y;

                public C42461a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f146844w = obj;
                    this.f146845x |= Integer.MIN_VALUE;
                    return C42460a.this.emit(null, this);
                }
            }

            public C42460a(InterfaceC13062m interfaceC13062m, C34862b c34862b) {
                this.f146838w = interfaceC13062m;
                this.f146839x = c34862b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42461a c42461a;
                if (interfaceC30057d instanceof C42461a) {
                    c42461a = (C42461a) interfaceC30057d;
                    int i13 = c42461a.f146845x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42461a.f146845x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42461a = new C42461a(interfaceC30057d);
                    }
                } else {
                    c42461a = new C42461a(interfaceC30057d);
                }
                Object obj2 = c42461a.f146844w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42461a.f146845x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f146838w;
                    InterfaceC34861a interfaceC34861aM109959a = this.f146839x.m109959a((InterfaceC32425c) obj);
                    c42461a.f146846y = null;
                    c42461a.f146840E = null;
                    c42461a.f146841F = null;
                    c42461a.f146842G = null;
                    c42461a.f146843H = 0;
                    c42461a.f146845x = 1;
                    if (interfaceC13062m.emit(interfaceC34861aM109959a, c42461a) == enumC31071a) {
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

        public a(InterfaceC13058l interfaceC13058l, C34862b c34862b) {
            this.f146836w = interfaceC13058l;
            this.f146837x = c34862b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f146836w.collect(new C42460a(interfaceC13062m, this.f146837x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ue2.c$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.alarmWarning.presentation.TurnoffAlarmWarningViewModel$sendViewEvent$1", m100430f = "TurnoffAlarmWarningViewModel.kt", m100431l = {44}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f146848w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC33753b.b f146850y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC33753b.b bVar, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f146850y = bVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C34863c.this.new b(this.f146850y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f146848w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C34863c.this.eventFlow;
                InterfaceC33753b.b bVar = this.f146850y;
                this.f146848w = 1;
                if (interfaceC13072o1.emit(bVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ue2.c$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f146851w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C34863c f146852x;

        /* JADX INFO: renamed from: ue2.c$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f146853w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C34863c f146854x;

            /* JADX INFO: renamed from: ue2.c$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.alarmWarning.presentation.TurnoffAlarmWarningViewModel$special$$inlined$map$1$2", m100430f = "TurnoffAlarmWarningViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42462a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f146855E;

                /* JADX INFO: renamed from: F */
                Object f146856F;

                /* JADX INFO: renamed from: G */
                Object f146857G;

                /* JADX INFO: renamed from: H */
                int f146858H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f146859w;

                /* JADX INFO: renamed from: x */
                int f146860x;

                /* JADX INFO: renamed from: y */
                Object f146861y;

                public C42462a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f146859w = obj;
                    this.f146860x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C34863c c34863c) {
                this.f146853w = interfaceC13062m;
                this.f146854x = c34863c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42462a c42462a;
                if (interfaceC30057d instanceof C42462a) {
                    c42462a = (C42462a) interfaceC30057d;
                    int i13 = c42462a.f146860x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42462a.f146860x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42462a = new C42462a(interfaceC30057d);
                    }
                } else {
                    c42462a = new C42462a(interfaceC30057d);
                }
                Object obj2 = c42462a.f146859w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42462a.f146860x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f146853w;
                    InterfaceC32424b interfaceC32424bM109962l = this.f146854x.m109962l((InterfaceC33753b.b) obj);
                    c42462a.f146861y = null;
                    c42462a.f146855E = null;
                    c42462a.f146856F = null;
                    c42462a.f146857G = null;
                    c42462a.f146858H = 0;
                    c42462a.f146860x = 1;
                    if (interfaceC13062m.emit(interfaceC32424bM109962l, c42462a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C34863c c34863c) {
            this.f146851w = interfaceC13058l;
            this.f146852x = c34863c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f146851w.collect(new a(interfaceC13062m, this.f146852x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34863c(C34862b reducer, C32426d interactor, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(m109963n(AbstractC27845h.m83945a(new c(c13096w1M36592b, this), interactor), reducer), coroutineScope, C13105z1.f45288a, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final InterfaceC32424b m109962l(InterfaceC33753b.b bVar) {
        if (AbstractC22676k.m65745e(bVar, InterfaceC33753b.b.c.f141248a)) {
            return InterfaceC32424b.c.f134187a;
        }
        if (bVar instanceof InterfaceC33753b.b.C42385b) {
            return new InterfaceC32424b.b(((InterfaceC33753b.b.C42385b) bVar).getNotificationId());
        }
        if (AbstractC22676k.m65745e(bVar, InterfaceC33753b.b.a.f141246a)) {
            return InterfaceC32424b.a.f134185a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: n */
    private final InterfaceC13058l m109963n(InterfaceC13058l interfaceC13058l, C34862b c34862b) {
        return new a(interfaceC13058l, c34862b);
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: o */
    public final void m109964o(InterfaceC33753b.b viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new b(viewEvent, null), 3);
    }

    public /* synthetic */ C34863c(C34862b c34862b, C32426d c32426d, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c34862b, c32426d, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
