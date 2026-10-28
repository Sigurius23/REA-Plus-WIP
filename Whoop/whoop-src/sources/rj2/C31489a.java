package rj2;

import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13052j1;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jj2.AbstractC21741a;
import kj2.AbstractC22521e;
import kj2.AbstractC22526j;
import kj2.C22522f;
import kj2.C22524h;
import kj2.C22527k;
import l83.C23454a0;
import mj2.C25622c;
import nj2.AbstractC26765l;
import nj2.AbstractC26768o;
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
import sx1.C33067c;
import sx1.C33069e;
import sx1.EnumC33066b;

/* JADX INFO: renamed from: rj2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018*\b\u0012\u0004\u0012\u00020\u00120\u00182\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ5\u0010\u001f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\u0004\u0018\u0001`\u001e0\u0018*\b\u0012\u0004\u0012\u00020\u00150\u00182\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 J'\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0018*\b\u0012\u0004\u0012\u00020!0\u00182\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020%2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b&\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010(R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00100+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R(\u00105\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\u0004\u0018\u0001`\u001e028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001d\u00109\u001a\b\u0012\u0004\u0012\u00020\"028\u0006¢\u0006\f\n\u0004\b6\u00104\u001a\u0004\b7\u00108R\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00020:0\u00188\u0006¢\u0006\f\n\u0004\b;\u00100\u001a\u0004\b<\u0010=R\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020?0\u00188\u0006¢\u0006\f\n\u0004\b@\u00100\u001a\u0004\bA\u0010=¨\u0006C"}, m65681d2 = {"Lrj2/a;", "Landroidx/lifecycle/w1;", "Lkj2/k;", "interactor", "Lkj2/f;", "calendarInteractor", "Lmj2/c;", "viewStateReducer", "Lkj2/h;", "combiner", "Lsx1/c;", "reactivationModalCoordinator", "Lbc3/c0;", "coroutineScope", "<init>", "(Lkj2/k;Lkj2/f;Lmj2/c;Lkj2/h;Lsx1/c;Lbc3/c0;)V", "Ljj2/a;", "viewEvent", "Lkj2/j;", "v", "(Ljj2/a;)Lkj2/j;", "Lkj2/e;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Ljj2/a;)Lkj2/e;", "Lec3/l;", "Lnj2/l;", "r", "(Lec3/l;Lkj2/k;)Lec3/l;", "Lh91/b;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "Lcom/whoop/design/domain/calendar/CalendarDomainState;", "q", "(Lec3/l;Lkj2/f;)Lec3/l;", "Lkj2/g;", "Lnj2/p;", "t", "(Lec3/l;Lmj2/c;)Lec3/l;", "Lbc3/k1;", "u", "(Ljj2/a;)Lbc3/k1;", "Lsx1/c;", "x", "Lbc3/c0;", "Lec3/o1;", "y", "Lec3/o1;", "eventFlow", "z", "Lec3/l;", "domainState", "Lec3/t1;", "E", "Lec3/t1;", "calendarDomainState", "F", "p", "()Lec3/t1;", "viewState", "Lnj2/o;", "G", "o", "()Lec3/l;", "navigationEvent", "", "H", "getReactivationModalNavigationFlow", "reactivationModalNavigationFlow", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31489a extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13087t1 calendarDomainState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13087t1 viewState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l navigationEvent;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC13058l reactivationModalNavigationFlow;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C33067c reactivationModalCoordinator;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: rj2.a$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.viewmodel.StressMonitorViewModel$reactivationModalNavigationFlow$3", m100430f = "StressMonitorViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"", "it", "Ll83/a0;", "<anonymous>", "(Z)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f129758w;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31489a.this.new a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (InterfaceC30057d<? super C23454a0>) obj2);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f129758w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C31489a.this.reactivationModalCoordinator.m104725f(EnumC33066b.COACHING_SCREEN, false);
            return C23454a0.f92919a;
        }

        public final Object invoke(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(Boolean.valueOf(z4), interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: rj2.a$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.viewmodel.StressMonitorViewModel$sendViewEvent$1", m100430f = "StressMonitorViewModel.kt", m100431l = {68}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f129760w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC21741a f129762y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC21741a abstractC21741a, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f129762y = abstractC21741a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31489a.this.new b(this.f129762y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f129760w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C31489a.this.eventFlow;
                AbstractC21741a abstractC21741a = this.f129762y;
                this.f129760w = 1;
                if (interfaceC13072o1.emit(abstractC21741a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: rj2.a$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f129763w;

        /* JADX INFO: renamed from: rj2.a$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f129764w;

            /* JADX INFO: renamed from: rj2.a$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.stress.viewmodel.StressMonitorViewModel$special$$inlined$filter$1$2", m100430f = "StressMonitorViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42273a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f129766F;

                /* JADX INFO: renamed from: G */
                Object f129767G;

                /* JADX INFO: renamed from: H */
                int f129768H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f129769w;

                /* JADX INFO: renamed from: x */
                int f129770x;

                /* JADX INFO: renamed from: y */
                Object f129771y;

                /* JADX INFO: renamed from: z */
                Object f129772z;

                public C42273a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f129769w = obj;
                    this.f129770x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f129764w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42273a c42273a;
                if (interfaceC30057d instanceof C42273a) {
                    c42273a = (C42273a) interfaceC30057d;
                    int i13 = c42273a.f129770x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42273a.f129770x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42273a = new C42273a(interfaceC30057d);
                    }
                } else {
                    c42273a = new C42273a(interfaceC30057d);
                }
                Object obj2 = c42273a.f129769w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42273a.f129770x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f129764w;
                    if (!(((AbstractC21741a) obj) instanceof AbstractC21741a.a)) {
                        c42273a.f129771y = null;
                        c42273a.f129772z = null;
                        c42273a.f129766F = null;
                        c42273a.f129767G = null;
                        c42273a.f129768H = 0;
                        c42273a.f129770x = 1;
                        if (interfaceC13062m.emit(obj, c42273a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l) {
            this.f129763w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f129763w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: rj2.a$d */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f129773w;

        /* JADX INFO: renamed from: rj2.a$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f129774w;

            /* JADX INFO: renamed from: rj2.a$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.stress.viewmodel.StressMonitorViewModel$special$$inlined$filter$2$2", m100430f = "StressMonitorViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42274a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f129776F;

                /* JADX INFO: renamed from: G */
                Object f129777G;

                /* JADX INFO: renamed from: H */
                int f129778H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f129779w;

                /* JADX INFO: renamed from: x */
                int f129780x;

                /* JADX INFO: renamed from: y */
                Object f129781y;

                /* JADX INFO: renamed from: z */
                Object f129782z;

                public C42274a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f129779w = obj;
                    this.f129780x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f129774w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42274a c42274a;
                if (interfaceC30057d instanceof C42274a) {
                    c42274a = (C42274a) interfaceC30057d;
                    int i13 = c42274a.f129780x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42274a.f129780x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42274a = new C42274a(interfaceC30057d);
                    }
                } else {
                    c42274a = new C42274a(interfaceC30057d);
                }
                Object obj2 = c42274a.f129779w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42274a.f129780x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f129774w;
                    AbstractC21741a abstractC21741a = (AbstractC21741a) obj;
                    if ((abstractC21741a instanceof AbstractC21741a.c) || (abstractC21741a instanceof AbstractC21741a.e) || (abstractC21741a instanceof AbstractC21741a.a)) {
                        c42274a.f129781y = null;
                        c42274a.f129782z = null;
                        c42274a.f129776F = null;
                        c42274a.f129777G = null;
                        c42274a.f129778H = 0;
                        c42274a.f129780x = 1;
                        if (interfaceC13062m.emit(obj, c42274a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l) {
            this.f129773w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f129773w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: rj2.a$e */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f129783w;

        /* JADX INFO: renamed from: rj2.a$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f129784w;

            /* JADX INFO: renamed from: rj2.a$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.stress.viewmodel.StressMonitorViewModel$special$$inlined$filter$3$2", m100430f = "StressMonitorViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42275a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f129786F;

                /* JADX INFO: renamed from: G */
                Object f129787G;

                /* JADX INFO: renamed from: H */
                int f129788H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f129789w;

                /* JADX INFO: renamed from: x */
                int f129790x;

                /* JADX INFO: renamed from: y */
                Object f129791y;

                /* JADX INFO: renamed from: z */
                Object f129792z;

                public C42275a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f129789w = obj;
                    this.f129790x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f129784w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42275a c42275a;
                if (interfaceC30057d instanceof C42275a) {
                    c42275a = (C42275a) interfaceC30057d;
                    int i13 = c42275a.f129790x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42275a.f129790x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42275a = new C42275a(interfaceC30057d);
                    }
                } else {
                    c42275a = new C42275a(interfaceC30057d);
                }
                Object obj2 = c42275a.f129789w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42275a.f129790x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f129784w;
                    AbstractC26765l abstractC26765l = (AbstractC26765l) obj;
                    if ((abstractC26765l instanceof AbstractC26765l.e) && ((AbstractC26765l.e) abstractC26765l).getShowOnboardingEducation()) {
                        c42275a.f129791y = null;
                        c42275a.f129792z = null;
                        c42275a.f129786F = null;
                        c42275a.f129787G = null;
                        c42275a.f129788H = 0;
                        c42275a.f129790x = 1;
                        if (interfaceC13062m.emit(obj, c42275a) == enumC31071a) {
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

        public e(InterfaceC13058l interfaceC13058l) {
            this.f129783w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f129783w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: rj2.a$f */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f129793w;

        /* JADX INFO: renamed from: rj2.a$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f129794w;

            /* JADX INFO: renamed from: rj2.a$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.stress.viewmodel.StressMonitorViewModel$special$$inlined$filter$4$2", m100430f = "StressMonitorViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42276a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f129796F;

                /* JADX INFO: renamed from: G */
                Object f129797G;

                /* JADX INFO: renamed from: H */
                int f129798H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f129799w;

                /* JADX INFO: renamed from: x */
                int f129800x;

                /* JADX INFO: renamed from: y */
                Object f129801y;

                /* JADX INFO: renamed from: z */
                Object f129802z;

                public C42276a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f129799w = obj;
                    this.f129800x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f129794w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42276a c42276a;
                if (interfaceC30057d instanceof C42276a) {
                    c42276a = (C42276a) interfaceC30057d;
                    int i13 = c42276a.f129800x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42276a.f129800x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42276a = new C42276a(interfaceC30057d);
                    }
                } else {
                    c42276a = new C42276a(interfaceC30057d);
                }
                Object obj2 = c42276a.f129799w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42276a.f129800x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f129794w;
                    if (((Boolean) obj).booleanValue()) {
                        c42276a.f129801y = null;
                        c42276a.f129802z = null;
                        c42276a.f129796F = null;
                        c42276a.f129797G = null;
                        c42276a.f129798H = 0;
                        c42276a.f129800x = 1;
                        if (interfaceC13062m.emit(obj, c42276a) == enumC31071a) {
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

        public f(InterfaceC13058l interfaceC13058l) {
            this.f129793w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f129793w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: rj2.a$g */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f129803w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C31489a f129804x;

        /* JADX INFO: renamed from: rj2.a$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f129805w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C31489a f129806x;

            /* JADX INFO: renamed from: rj2.a$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.stress.viewmodel.StressMonitorViewModel$special$$inlined$map$1$2", m100430f = "StressMonitorViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42277a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f129807E;

                /* JADX INFO: renamed from: F */
                Object f129808F;

                /* JADX INFO: renamed from: G */
                Object f129809G;

                /* JADX INFO: renamed from: H */
                int f129810H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f129811w;

                /* JADX INFO: renamed from: x */
                int f129812x;

                /* JADX INFO: renamed from: y */
                Object f129813y;

                public C42277a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f129811w = obj;
                    this.f129812x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C31489a c31489a) {
                this.f129805w = interfaceC13062m;
                this.f129806x = c31489a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42277a c42277a;
                if (interfaceC30057d instanceof C42277a) {
                    c42277a = (C42277a) interfaceC30057d;
                    int i13 = c42277a.f129812x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42277a.f129812x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42277a = new C42277a(interfaceC30057d);
                    }
                } else {
                    c42277a = new C42277a(interfaceC30057d);
                }
                Object obj2 = c42277a.f129811w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42277a.f129812x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f129805w;
                    AbstractC22526j abstractC22526jM96992v = this.f129806x.m96992v((AbstractC21741a) obj);
                    c42277a.f129813y = null;
                    c42277a.f129807E = null;
                    c42277a.f129808F = null;
                    c42277a.f129809G = null;
                    c42277a.f129810H = 0;
                    c42277a.f129812x = 1;
                    if (interfaceC13062m.emit(abstractC22526jM96992v, c42277a) == enumC31071a) {
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

        public g(InterfaceC13058l interfaceC13058l, C31489a c31489a) {
            this.f129803w = interfaceC13058l;
            this.f129804x = c31489a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f129803w.collect(new a(interfaceC13062m, this.f129804x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: rj2.a$h */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f129815w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C31489a f129816x;

        /* JADX INFO: renamed from: rj2.a$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f129817w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C31489a f129818x;

            /* JADX INFO: renamed from: rj2.a$h$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.stress.viewmodel.StressMonitorViewModel$special$$inlined$map$2$2", m100430f = "StressMonitorViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42278a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f129819E;

                /* JADX INFO: renamed from: F */
                Object f129820F;

                /* JADX INFO: renamed from: G */
                Object f129821G;

                /* JADX INFO: renamed from: H */
                int f129822H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f129823w;

                /* JADX INFO: renamed from: x */
                int f129824x;

                /* JADX INFO: renamed from: y */
                Object f129825y;

                public C42278a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f129823w = obj;
                    this.f129824x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C31489a c31489a) {
                this.f129817w = interfaceC13062m;
                this.f129818x = c31489a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42278a c42278a;
                if (interfaceC30057d instanceof C42278a) {
                    c42278a = (C42278a) interfaceC30057d;
                    int i13 = c42278a.f129824x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42278a.f129824x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42278a = new C42278a(interfaceC30057d);
                    }
                } else {
                    c42278a = new C42278a(interfaceC30057d);
                }
                Object obj2 = c42278a.f129823w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42278a.f129824x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f129817w;
                    AbstractC22521e abstractC22521eM96993w = this.f129818x.m96993w((AbstractC21741a) obj);
                    c42278a.f129825y = null;
                    c42278a.f129819E = null;
                    c42278a.f129820F = null;
                    c42278a.f129821G = null;
                    c42278a.f129822H = 0;
                    c42278a.f129824x = 1;
                    if (interfaceC13062m.emit(abstractC22521eM96993w, c42278a) == enumC31071a) {
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

        public h(InterfaceC13058l interfaceC13058l, C31489a c31489a) {
            this.f129815w = interfaceC13058l;
            this.f129816x = c31489a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f129815w.collect(new a(interfaceC13062m, this.f129816x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: rj2.a$i */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f129827w;

        /* JADX INFO: renamed from: rj2.a$i$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f129828w;

            /* JADX INFO: renamed from: rj2.a$i$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.stress.viewmodel.StressMonitorViewModel$special$$inlined$map$3$2", m100430f = "StressMonitorViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42279a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f129829E;

                /* JADX INFO: renamed from: F */
                Object f129830F;

                /* JADX INFO: renamed from: G */
                Object f129831G;

                /* JADX INFO: renamed from: H */
                int f129832H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f129833w;

                /* JADX INFO: renamed from: x */
                int f129834x;

                /* JADX INFO: renamed from: y */
                Object f129835y;

                public C42279a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f129833w = obj;
                    this.f129834x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f129828w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42279a c42279a;
                if (interfaceC30057d instanceof C42279a) {
                    c42279a = (C42279a) interfaceC30057d;
                    int i13 = c42279a.f129834x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42279a.f129834x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42279a = new C42279a(interfaceC30057d);
                    }
                } else {
                    c42279a = new C42279a(interfaceC30057d);
                }
                Object obj2 = c42279a.f129833w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42279a.f129834x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f129828w;
                    AbstractC26768o.a aVar = AbstractC26768o.a.f106589a;
                    c42279a.f129835y = null;
                    c42279a.f129829E = null;
                    c42279a.f129830F = null;
                    c42279a.f129831G = null;
                    c42279a.f129832H = 0;
                    c42279a.f129834x = 1;
                    if (interfaceC13062m.emit(aVar, c42279a) == enumC31071a) {
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

        public i(InterfaceC13058l interfaceC13058l) {
            this.f129827w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f129827w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: rj2.a$j */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f129837w;

        /* JADX INFO: renamed from: rj2.a$j$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f129838w;

            /* JADX INFO: renamed from: rj2.a$j$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.stress.viewmodel.StressMonitorViewModel$special$$inlined$map$4$2", m100430f = "StressMonitorViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42280a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f129839E;

                /* JADX INFO: renamed from: F */
                Object f129840F;

                /* JADX INFO: renamed from: G */
                Object f129841G;

                /* JADX INFO: renamed from: H */
                int f129842H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f129843w;

                /* JADX INFO: renamed from: x */
                int f129844x;

                /* JADX INFO: renamed from: y */
                Object f129845y;

                public C42280a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f129843w = obj;
                    this.f129844x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f129838w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42280a c42280a;
                if (interfaceC30057d instanceof C42280a) {
                    c42280a = (C42280a) interfaceC30057d;
                    int i13 = c42280a.f129844x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42280a.f129844x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42280a = new C42280a(interfaceC30057d);
                    }
                } else {
                    c42280a = new C42280a(interfaceC30057d);
                }
                Object obj2 = c42280a.f129843w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42280a.f129844x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f129838w;
                    C33069e c33069e = (C33069e) obj;
                    Boolean boolValueOf = Boolean.valueOf((c33069e.getModel() == null || c33069e.m104731d().contains(EnumC33066b.COACHING_SCREEN)) ? false : true);
                    c42280a.f129845y = null;
                    c42280a.f129839E = null;
                    c42280a.f129840F = null;
                    c42280a.f129841G = null;
                    c42280a.f129842H = 0;
                    c42280a.f129844x = 1;
                    if (interfaceC13062m.emit(boolValueOf, c42280a) == enumC31071a) {
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

        public j(InterfaceC13058l interfaceC13058l) {
            this.f129837w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f129837w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31489a(C22527k interactor, C22522f calendarInteractor, C25622c viewStateReducer, C22524h combiner, C33067c reactivationModalCoordinator, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(calendarInteractor, "calendarInteractor");
        AbstractC22676k.m65750j(viewStateReducer, "viewStateReducer");
        AbstractC22676k.m65750j(combiner, "combiner");
        AbstractC22676k.m65750j(reactivationModalCoordinator, "reactivationModalCoordinator");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.reactivationModalCoordinator = reactivationModalCoordinator;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM96990r = m96990r(new g(new c(AbstractC13091v.m36610t(c13096w1M36592b)), this), interactor);
        C13021b2 c13021b2 = C13105z1.f45288a;
        InterfaceC13058l interfaceC13058lM36586L = AbstractC13091v.m36586L(interfaceC13058lM96990r, coroutineScope, c13021b2, 1);
        this.domainState = interfaceC13058lM36586L;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(m96989q(new h(new d(AbstractC13091v.m36610t(c13096w1M36592b)), this), calendarInteractor), coroutineScope, c13021b2, 1);
        this.calendarDomainState = c13078q1M36586L;
        this.viewState = AbstractC13091v.m36586L(m96991t(combiner.m65056a(interfaceC13058lM36586L, c13078q1M36586L), viewStateReducer), coroutineScope, c13021b2, 1);
        this.navigationEvent = AbstractC13091v.m36586L(new i(new e(interfaceC13058lM36586L)), coroutineScope, c13021b2, 0);
        this.reactivationModalNavigationFlow = new C13052j1(new f(new j(reactivationModalCoordinator.getReactivationModalFlow())), new a(null), 0);
    }

    /* JADX INFO: renamed from: q */
    private final InterfaceC13058l m96989q(InterfaceC13058l interfaceC13058l, C22522f c22522f) {
        return c22522f.m65050k(interfaceC13058l);
    }

    /* JADX INFO: renamed from: r */
    private final InterfaceC13058l m96990r(InterfaceC13058l interfaceC13058l, C22527k c22527k) {
        return c22527k.m65095u(interfaceC13058l);
    }

    /* JADX INFO: renamed from: t */
    private final InterfaceC13058l m96991t(InterfaceC13058l interfaceC13058l, C25622c c25622c) {
        return c25622c.m75367k(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public final AbstractC22526j m96992v(AbstractC21741a viewEvent) {
        if (viewEvent instanceof AbstractC21741a.c) {
            return new AbstractC22526j.b(((AbstractC21741a.c) viewEvent).getSource());
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC21741a.b.f83600a)) {
            return AbstractC22526j.a.f88360a;
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC21741a.d.f83602a)) {
            return AbstractC22526j.c.f88362a;
        }
        if (viewEvent instanceof AbstractC21741a.g) {
            return new AbstractC22526j.f(((AbstractC21741a.g) viewEvent).getSourceId());
        }
        if (viewEvent instanceof AbstractC21741a.f) {
            return new AbstractC22526j.e(((AbstractC21741a.f) viewEvent).getIsCurrentTwelve());
        }
        if (viewEvent instanceof AbstractC21741a.e) {
            AbstractC21741a.e eVar = (AbstractC21741a.e) viewEvent;
            return new AbstractC22526j.d(eVar.getSource(), eVar.getSpecificDate());
        }
        throw new IllegalArgumentException("invalid viewEvent " + viewEvent + ", cannot be mapped to a domain action.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public final AbstractC22521e m96993w(AbstractC21741a viewEvent) {
        if (viewEvent instanceof AbstractC21741a.c) {
            return AbstractC22521e.b.f88286a;
        }
        if (viewEvent instanceof AbstractC21741a.e) {
            return new AbstractC22521e.c(((AbstractC21741a.e) viewEvent).getSpecificDate());
        }
        if (viewEvent instanceof AbstractC21741a.a) {
            return new AbstractC22521e.a(((AbstractC21741a.a) viewEvent).getCom.mapbox.maps.MapboxMap.QFE_OFFSET java.lang.String());
        }
        throw new IllegalArgumentException("invalid viewEvent " + viewEvent + ", cannot be mapped to an calendar action.");
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final InterfaceC13058l getNavigationEvent() {
        return this.navigationEvent;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final InterfaceC13087t1 getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: u */
    public final InterfaceC3027k1 m96996u(AbstractC21741a viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        return AbstractC3006f0.m8732z(this.coroutineScope, null, null, new b(viewEvent, null), 3);
    }

    public /* synthetic */ C31489a(C22527k c22527k, C22522f c22522f, C25622c c25622c, C22524h c22524h, C33067c c33067c, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c22527k, c22522f, c25622c, c22524h, c33067c, (i13 & 32) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
