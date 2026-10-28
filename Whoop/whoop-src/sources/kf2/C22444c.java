package kf2;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1640x1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import hj0.AbstractC17356o;
import i92.AbstractC18263h;
import i92.InterfaceC18260e;
import l83.C23454a0;
import li0.AbstractC24099a;
import nf2.AbstractC26668a;
import or2.C28180m;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import we2.AbstractC37232a;
import we2.C37233b;
import ze2.AbstractC40594f;
import ze2.C40596h;
import ze2.InterfaceC40595g;

/* JADX INFO: renamed from: kf2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010&\u001a\u00020!8\u0016X\u0096D¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020,0+8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00062"}, m65681d2 = {"Lkf2/c;", "Lhj0/o;", "Lze2/h;", "interactor", "Lkf2/e;", "reducer", "Li92/e;", "networkMonitor", "Lwe2/b;", "analyticInteractor", "Lbc3/c0;", "coroutineScope", "<init>", "(Lze2/h;Lkf2/e;Li92/e;Lwe2/b;Lbc3/c0;)V", "Lnf2/a;", "viewEvent", "Lze2/f;", "B", "(Lnf2/a;)Lze2/f;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "D", "(Lnf2/a;)V", "Lwe2/a;", "analyticEvent", "C", "(Lwe2/a;)V", "E", "Lze2/h;", "F", "Lkf2/e;", "G", "Lwe2/b;", "", "H", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "logTag", "Lec3/o1;", "I", "Lec3/o1;", "eventFlow", "Lec3/l;", "Lkf2/d;", "J", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22444c extends AbstractC17356o {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C40596h interactor;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C22446e reducer;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C37233b analyticInteractor;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: kf2.c$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.presentation.scheduleList.SleepScheduleListViewModel$sendSleepScheduleListViewEvent$1", m100430f = "SleepScheduleListViewModel.kt", m100431l = {51}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f87824w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC26668a f87826y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC26668a abstractC26668a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f87826y = abstractC26668a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C22444c.this.new a(this.f87826y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f87824w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C22444c.this.eventFlow;
                AbstractC26668a abstractC26668a = this.f87826y;
                this.f87824w = 1;
                if (interfaceC13072o1.emit(abstractC26668a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: kf2.c$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.presentation.scheduleList.SleepScheduleListViewModel$special$$inlined$flatMapLatest$1", m100430f = "SleepScheduleListViewModel.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f87827w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f87828x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f87829y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C22444c f87830z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC30057d interfaceC30057d, C22444c c22444c) {
            super(3, interfaceC30057d);
            this.f87830z = c22444c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC40594f abstractC40594f, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d, this.f87830z);
            bVar.f87828x = interfaceC13062m;
            bVar.f87829y = abstractC40594f;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f87827w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f87828x;
                InterfaceC13058l interfaceC13058lM131670l = this.f87830z.interactor.m131670l(new C0456u((AbstractC40594f) this.f87829y, 1));
                this.f87828x = null;
                this.f87829y = null;
                this.f87827w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM131670l, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC40594f) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: kf2.c$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f87831w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22444c f87832x;

        /* JADX INFO: renamed from: kf2.c$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f87833w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22444c f87834x;

            /* JADX INFO: renamed from: kf2.c$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.presentation.scheduleList.SleepScheduleListViewModel$special$$inlined$map$1$2", m100430f = "SleepScheduleListViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41893a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f87835E;

                /* JADX INFO: renamed from: F */
                Object f87836F;

                /* JADX INFO: renamed from: G */
                Object f87837G;

                /* JADX INFO: renamed from: H */
                int f87838H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f87839w;

                /* JADX INFO: renamed from: x */
                int f87840x;

                /* JADX INFO: renamed from: y */
                Object f87841y;

                public C41893a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f87839w = obj;
                    this.f87840x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C22444c c22444c) {
                this.f87833w = interfaceC13062m;
                this.f87834x = c22444c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41893a c41893a;
                if (interfaceC30057d instanceof C41893a) {
                    c41893a = (C41893a) interfaceC30057d;
                    int i13 = c41893a.f87840x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41893a.f87840x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41893a = new C41893a(interfaceC30057d);
                    }
                } else {
                    c41893a = new C41893a(interfaceC30057d);
                }
                Object obj2 = c41893a.f87839w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41893a.f87840x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f87833w;
                    AbstractC40594f abstractC40594fM64775B = this.f87834x.m64775B((AbstractC26668a) obj);
                    c41893a.f87841y = null;
                    c41893a.f87835E = null;
                    c41893a.f87836F = null;
                    c41893a.f87837G = null;
                    c41893a.f87838H = 0;
                    c41893a.f87840x = 1;
                    if (interfaceC13062m.emit(abstractC40594fM64775B, c41893a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C22444c c22444c) {
            this.f87831w = interfaceC13058l;
            this.f87832x = c22444c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f87831w.collect(new a(interfaceC13062m, this.f87832x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: kf2.c$d */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f87843w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22444c f87844x;

        /* JADX INFO: renamed from: kf2.c$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f87845w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22444c f87846x;

            /* JADX INFO: renamed from: kf2.c$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.presentation.scheduleList.SleepScheduleListViewModel$special$$inlined$map$2$2", m100430f = "SleepScheduleListViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41894a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f87847E;

                /* JADX INFO: renamed from: F */
                Object f87848F;

                /* JADX INFO: renamed from: G */
                Object f87849G;

                /* JADX INFO: renamed from: H */
                int f87850H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f87851w;

                /* JADX INFO: renamed from: x */
                int f87852x;

                /* JADX INFO: renamed from: y */
                Object f87853y;

                public C41894a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f87851w = obj;
                    this.f87852x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C22444c c22444c) {
                this.f87845w = interfaceC13062m;
                this.f87846x = c22444c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41894a c41894a;
                if (interfaceC30057d instanceof C41894a) {
                    c41894a = (C41894a) interfaceC30057d;
                    int i13 = c41894a.f87852x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41894a.f87852x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41894a = new C41894a(interfaceC30057d);
                    }
                } else {
                    c41894a = new C41894a(interfaceC30057d);
                }
                Object obj2 = c41894a.f87851w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41894a.f87852x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f87845w;
                    AbstractC22445d abstractC22445dM64802k = this.f87846x.reducer.m64802k((InterfaceC40595g) obj);
                    c41894a.f87853y = null;
                    c41894a.f87847E = null;
                    c41894a.f87848F = null;
                    c41894a.f87849G = null;
                    c41894a.f87850H = 0;
                    c41894a.f87852x = 1;
                    if (interfaceC13062m.emit(abstractC22445dM64802k, c41894a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l, C22444c c22444c) {
            this.f87843w = interfaceC13058l;
            this.f87844x = c22444c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f87843w.collect(new a(interfaceC13062m, this.f87844x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: kf2.c$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.presentation.scheduleList.SleepScheduleListViewModel$viewState$3", m100430f = "SleepScheduleListViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lze2/g;", "domainState", "Li92/h;", "network", "<anonymous>", "(Lze2/g;Li92/h;)Lze2/g;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f87855w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f87856x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f87857y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC40595g interfaceC40595g, AbstractC18263h abstractC18263h, InterfaceC30057d<? super InterfaceC40595g> interfaceC30057d) {
            e eVar = new e(interfaceC30057d);
            eVar.f87856x = interfaceC40595g;
            eVar.f87857y = abstractC18263h;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC40595g interfaceC40595g = (InterfaceC40595g) this.f87856x;
            AbstractC18263h abstractC18263h = (AbstractC18263h) this.f87857y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f87855w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return !abstractC18263h.m52614a() ? InterfaceC40595g.b.f174902a : interfaceC40595g;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22444c(C40596h interactor, C22446e reducer, InterfaceC18260e networkMonitor, C37233b analyticInteractor, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(networkMonitor, "networkMonitor");
        AbstractC22676k.m65750j(analyticInteractor, "analyticInteractor");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.analyticInteractor = analyticInteractor;
        this.logTag = "SleepScheduleListViewModel";
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = new d(AbstractC13091v.m36586L(new C13060l1(AbstractC13091v.m36590P(new c(AbstractC24099a.m71009a(c13096w1M36592b, AbstractC26668a.c.f106044a), this), new b(null, this)), networkMonitor.getNetworkFlow(), new e(null), 1), AbstractC1640x1.m5043b(this), C13105z1.f45288a, 1), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public final AbstractC40594f m64775B(AbstractC26668a viewEvent) {
        if (AbstractC22676k.m65745e(viewEvent, AbstractC26668a.c.f106044a)) {
            return AbstractC40594f.c.f174899a;
        }
        if (viewEvent instanceof AbstractC26668a.b) {
            return new AbstractC40594f.b(((AbstractC26668a.b) viewEvent).getScheduleWithId());
        }
        if (viewEvent instanceof AbstractC26668a.d) {
            return new AbstractC40594f.d(((AbstractC26668a.d) viewEvent).getIsScheduleEnabled());
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC26668a.a.f106042a)) {
            return AbstractC40594f.a.f174897a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: C */
    public final void m64779C(AbstractC37232a analyticEvent) {
        AbstractC22676k.m65750j(analyticEvent, "analyticEvent");
        this.analyticInteractor.m119333c(analyticEvent);
    }

    /* JADX INFO: renamed from: D */
    public final void m64780D(AbstractC26668a event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new a(event, null), 3);
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    @Override // hj0.AbstractC17356o
    /* JADX INFO: renamed from: o, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }

    public /* synthetic */ C22444c(C40596h c40596h, C22446e c22446e, InterfaceC18260e interfaceC18260e, C37233b c37233b, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c40596h, c22446e, interfaceC18260e, c37233b, (i13 & 16) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
