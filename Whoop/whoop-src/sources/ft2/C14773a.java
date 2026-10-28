package ft2;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ct2.AbstractC11109a;
import ct2.AbstractC11110b;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import et2.C13599a;
import gt2.AbstractC16204b;
import gt2.AbstractC16205c;
import gt2.C16206d;
import l83.C23454a0;
import ld1.AbstractC23864c;
import od1.AbstractC27845h;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: ft2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, m65681d2 = {"Lft2/a;", "Lld1/c;", "Lgt2/c;", "Lgt2/b;", "Let2/a;", "apiInteractor", "Lgt2/d;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Let2/a;Lgt2/d;Lbc3/c0;)V", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "n", "(Lgt2/b;)V", "x", "Let2/a;", "y", "Lgt2/d;", "z", "Lbc3/c0;", "Lec3/o1;", "E", "Lec3/o1;", "eventFlow", "Lec3/l;", "Lct2/b;", "F", "Lec3/l;", "domainState", "Lec3/f2;", "G", "Lec3/f2;", "getViewState", "()Lec3/f2;", "viewState", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14773a extends AbstractC23864c<AbstractC16205c, AbstractC16204b> {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13037f2 viewState;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C13599a apiInteractor;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C16206d reducer;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: ft2.a$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.hometile.presentation.WeeklyPlanHomeTileViewModel$sendViewEvent$1", m100430f = "WeeklyPlanHomeTileViewModel.kt", m100431l = {40}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f54762w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC16204b f54764y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC16204b abstractC16204b, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f54764y = abstractC16204b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C14773a.this.new a(this.f54764y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f54762w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C14773a.this.eventFlow;
                AbstractC16204b abstractC16204b = this.f54764y;
                this.f54762w = 1;
                if (interfaceC13072o1.emit(abstractC16204b, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ft2.a$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f54765w;

        /* JADX INFO: renamed from: ft2.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f54766w;

            /* JADX INFO: renamed from: ft2.a$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes11.dex */
            @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.hometile.presentation.WeeklyPlanHomeTileViewModel$special$$inlined$map$1$2", m100430f = "WeeklyPlanHomeTileViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41611a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f54767E;

                /* JADX INFO: renamed from: F */
                Object f54768F;

                /* JADX INFO: renamed from: G */
                Object f54769G;

                /* JADX INFO: renamed from: H */
                int f54770H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f54771w;

                /* JADX INFO: renamed from: x */
                int f54772x;

                /* JADX INFO: renamed from: y */
                Object f54773y;

                public C41611a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f54771w = obj;
                    this.f54772x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f54766w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41611a c41611a;
                if (interfaceC30057d instanceof C41611a) {
                    c41611a = (C41611a) interfaceC30057d;
                    int i13 = c41611a.f54772x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41611a.f54772x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41611a = new C41611a(interfaceC30057d);
                    }
                } else {
                    c41611a = new C41611a(interfaceC30057d);
                }
                Object obj2 = c41611a.f54771w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41611a.f54772x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f54766w;
                    AbstractC11109a abstractC11109aM45872a = ((AbstractC16204b) obj).m45872a();
                    c41611a.f54773y = null;
                    c41611a.f54767E = null;
                    c41611a.f54768F = null;
                    c41611a.f54769G = null;
                    c41611a.f54770H = 0;
                    c41611a.f54772x = 1;
                    if (interfaceC13062m.emit(abstractC11109aM45872a, c41611a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l) {
            this.f54765w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f54765w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ft2.a$c */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f54775w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C14773a f54776x;

        /* JADX INFO: renamed from: ft2.a$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f54777w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C14773a f54778x;

            /* JADX INFO: renamed from: ft2.a$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.hometile.presentation.WeeklyPlanHomeTileViewModel$special$$inlined$map$2$2", m100430f = "WeeklyPlanHomeTileViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41612a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f54779E;

                /* JADX INFO: renamed from: F */
                Object f54780F;

                /* JADX INFO: renamed from: G */
                Object f54781G;

                /* JADX INFO: renamed from: H */
                int f54782H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f54783w;

                /* JADX INFO: renamed from: x */
                int f54784x;

                /* JADX INFO: renamed from: y */
                Object f54785y;

                public C41612a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f54783w = obj;
                    this.f54784x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C14773a c14773a) {
                this.f54777w = interfaceC13062m;
                this.f54778x = c14773a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41612a c41612a;
                if (interfaceC30057d instanceof C41612a) {
                    c41612a = (C41612a) interfaceC30057d;
                    int i13 = c41612a.f54784x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41612a.f54784x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41612a = new C41612a(interfaceC30057d);
                    }
                } else {
                    c41612a = new C41612a(interfaceC30057d);
                }
                Object obj2 = c41612a.f54783w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41612a.f54784x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f54777w;
                    AbstractC16205c abstractC16205cM45878a = this.f54778x.reducer.m45878a((AbstractC11110b) obj);
                    c41612a.f54785y = null;
                    c41612a.f54779E = null;
                    c41612a.f54780F = null;
                    c41612a.f54781G = null;
                    c41612a.f54782H = 0;
                    c41612a.f54784x = 1;
                    if (interfaceC13062m.emit(abstractC16205cM45878a, c41612a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C14773a c14773a) {
            this.f54775w = interfaceC13058l;
            this.f54776x = c14773a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f54775w.collect(new a(interfaceC13062m, this.f54776x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14773a(C13599a apiInteractor, C16206d reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(apiInteractor, "apiInteractor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.apiInteractor = apiInteractor;
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM83945a = AbstractC27845h.m83945a(new b(c13096w1M36592b), apiInteractor);
        this.domainState = interfaceC13058lM83945a;
        this.viewState = AbstractC13091v.m36587M(new c(interfaceC13058lM83945a, this), coroutineScope, C13105z1.f45288a, AbstractC16205c.b.f61543b);
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1216g(AbstractC16204b event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    @Override // ld1.AbstractC23864c
    public InterfaceC13037f2 getViewState() {
        return this.viewState;
    }

    public /* synthetic */ C14773a(C13599a c13599a, C16206d c16206d, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c13599a, c16206d, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
