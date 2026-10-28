package ti2;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import ch.C4588i;
import ci2.InterfaceC4733b;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13021b2;
import ec3.C13060l1;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import gv1.C16229c;
import gv1.C16230d;
import gv1.C16231e;
import gv1.InterfaceC16239m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jk0.EnumC21747a;
import jk0.InterfaceC21750d;
import l83.C23454a0;
import od1.AbstractC27845h;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qi2.C30415c;
import qi2.InterfaceC30413a;
import qi2.InterfaceC30414b;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vi2.C36063b;

/* JADX INFO: renamed from: ti2.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00100 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020)0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010'R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020,0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010'R\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020/0$8\u0006¢\u0006\f\n\u0004\b0\u0010'\u001a\u0004\b1\u00102¨\u00064"}, m65681d2 = {"Lti2/f;", "Landroidx/lifecycle/w1;", "Lqi2/c;", "interactor", "Lvi2/b;", "reducer", "Lgv1/c;", "globalLottieTesterState", "Lgv1/d;", "localLottieTesterOverrideController", "Lbc3/c0;", "coroutineScope", "Lci2/b;", "whoopStrapProvider", "<init>", "(Lqi2/c;Lvi2/b;Lgv1/c;Lgv1/d;Lbc3/c0;Lci2/b;)V", "Lti2/e;", "Lqi2/a;", "o", "(Lti2/e;)Lqi2/a;", "viewEvent", "Ll83/a0;", "n", "(Lti2/e;)V", "Lgv1/m;", NotificationCompat.CATEGORY_EVENT, "l", "(Lgv1/m;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lgv1/d;", "x", "Lbc3/c0;", "Lec3/o1;", "y", "Lec3/o1;", "eventFlow", "Lec3/l;", "Lqi2/b;", "z", "Lec3/l;", "domainResult", "Ljk0/a;", "E", "strapBodyStatusFlow", "Lti2/d;", "F", "streaksLottieState", "Lti2/g;", "G", "getViewState", "()Lec3/l;", "viewState", "streaks_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33859f extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l strapBodyStatusFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l streaksLottieState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C16230d localLottieTesterOverrideController;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13058l domainResult;

    /* JADX INFO: renamed from: ti2.f$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.streaks.presentation.StreaksViewModel$domainResult$2", m100430f = "StreaksViewModel.kt", m100431l = {44}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lqi2/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f141805w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f141806x;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f141806x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f141806x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f141805w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC30414b.b bVar = InterfaceC30414b.b.f124815a;
                this.f141806x = null;
                this.f141805w = 1;
                if (interfaceC13062m.emit(bVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ti2.f$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.streaks.presentation.StreaksViewModel$sendViewEvent$1", m100430f = "StreaksViewModel.kt", m100431l = {89}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f141807w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC33858e f141809y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC33858e interfaceC33858e, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f141809y = interfaceC33858e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C33859f.this.new b(this.f141809y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f141807w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C33859f.this.eventFlow;
                InterfaceC33858e interfaceC33858e = this.f141809y;
                this.f141807w = 1;
                if (interfaceC13072o1.emit(interfaceC33858e, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ti2.f$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.streaks.presentation.StreaksViewModel$special$$inlined$flatMapLatest$1", m100430f = "StreaksViewModel.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f141810w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f141811x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f141812y;

        public c(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC21750d interfaceC21750d, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d);
            cVar.f141811x = interfaceC13062m;
            cVar.f141812y = interfaceC21750d;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f141810w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f141811x;
                InterfaceC13037f2 observeStrapIsOnBody = ((InterfaceC21750d) this.f141812y).mo24695J().getObserveStrapIsOnBody();
                this.f141811x = null;
                this.f141812y = null;
                this.f141810w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, observeStrapIsOnBody, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (InterfaceC21750d) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: ti2.f$d */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f141813w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C33859f f141814x;

        /* JADX INFO: renamed from: ti2.f$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f141815w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C33859f f141816x;

            /* JADX INFO: renamed from: ti2.f$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.streaks.presentation.StreaksViewModel$special$$inlined$map$1$2", m100430f = "StreaksViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42394a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f141817E;

                /* JADX INFO: renamed from: F */
                Object f141818F;

                /* JADX INFO: renamed from: G */
                Object f141819G;

                /* JADX INFO: renamed from: H */
                int f141820H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f141821w;

                /* JADX INFO: renamed from: x */
                int f141822x;

                /* JADX INFO: renamed from: y */
                Object f141823y;

                public C42394a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f141821w = obj;
                    this.f141822x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C33859f c33859f) {
                this.f141815w = interfaceC13062m;
                this.f141816x = c33859f;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42394a c42394a;
                if (interfaceC30057d instanceof C42394a) {
                    c42394a = (C42394a) interfaceC30057d;
                    int i13 = c42394a.f141822x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42394a.f141822x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42394a = new C42394a(interfaceC30057d);
                    }
                } else {
                    c42394a = new C42394a(interfaceC30057d);
                }
                Object obj2 = c42394a.f141821w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42394a.f141822x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f141815w;
                    InterfaceC30413a interfaceC30413aM107065o = this.f141816x.m107065o((InterfaceC33858e) obj);
                    c42394a.f141823y = null;
                    c42394a.f141817E = null;
                    c42394a.f141818F = null;
                    c42394a.f141819G = null;
                    c42394a.f141820H = 0;
                    c42394a.f141822x = 1;
                    if (interfaceC13062m.emit(interfaceC30413aM107065o, c42394a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l, C33859f c33859f) {
            this.f141813w = interfaceC13058l;
            this.f141814x = c33859f;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f141813w.collect(new a(interfaceC13062m, this.f141814x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ti2.f$e */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f141825w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C36063b f141826x;

        /* JADX INFO: renamed from: ti2.f$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f141827w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C36063b f141828x;

            /* JADX INFO: renamed from: ti2.f$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.streaks.presentation.StreaksViewModel$special$$inlined$map$2$2", m100430f = "StreaksViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42395a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f141829E;

                /* JADX INFO: renamed from: F */
                Object f141830F;

                /* JADX INFO: renamed from: G */
                Object f141831G;

                /* JADX INFO: renamed from: H */
                int f141832H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f141833w;

                /* JADX INFO: renamed from: x */
                int f141834x;

                /* JADX INFO: renamed from: y */
                Object f141835y;

                public C42395a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f141833w = obj;
                    this.f141834x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C36063b c36063b) {
                this.f141827w = interfaceC13062m;
                this.f141828x = c36063b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42395a c42395a;
                if (interfaceC30057d instanceof C42395a) {
                    c42395a = (C42395a) interfaceC30057d;
                    int i13 = c42395a.f141834x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42395a.f141834x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42395a = new C42395a(interfaceC30057d);
                    }
                } else {
                    c42395a = new C42395a(interfaceC30057d);
                }
                Object obj2 = c42395a.f141833w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42395a.f141834x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f141827w;
                    C33855b c33855b = (C33855b) obj;
                    C33860g c33860gM114531m = this.f141828x.m114531m(c33855b.getDomainResult(), c33855b.getBodyStatus(), c33855b.getStreaksLottieState());
                    c42395a.f141835y = null;
                    c42395a.f141829E = null;
                    c42395a.f141830F = null;
                    c42395a.f141831G = null;
                    c42395a.f141832H = 0;
                    c42395a.f141834x = 1;
                    if (interfaceC13062m.emit(c33860gM114531m, c42395a) == enumC31071a) {
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

        public e(InterfaceC13058l interfaceC13058l, C36063b c36063b) {
            this.f141825w = interfaceC13058l;
            this.f141826x = c36063b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f141825w.collect(new a(interfaceC13062m, this.f141826x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ti2.f$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.streaks.presentation.StreaksViewModel$strapBodyStatusFlow$2", m100430f = "StreaksViewModel.kt", m100431l = {52}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ljk0/a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f141837w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f141838x;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = new f(interfaceC30057d);
            fVar.f141838x = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f141838x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f141837w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                EnumC21747a enumC21747a = EnumC21747a.UNKNOWN;
                this.f141838x = null;
                this.f141837w = 1;
                if (interfaceC13062m.emit(enumC21747a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ti2.f$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.streaks.presentation.StreaksViewModel$streaksLottieState$1", m100430f = "StreaksViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"", "isEnabled", "Lgv1/e;", "localLottieState", "Lti2/d;", "<anonymous>", "(ZLgv1/e;)Lti2/d;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f141839w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ boolean f141840x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f141841y;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        /* JADX INFO: renamed from: f */
        public final Object m107068f(boolean z4, C16231e c16231e, InterfaceC30057d<? super C33857d> interfaceC30057d) {
            g gVar = new g(interfaceC30057d);
            gVar.f141840x = z4;
            gVar.f141841y = c16231e;
            return gVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m107068f(((Boolean) obj).booleanValue(), (C16231e) obj2, (InterfaceC30057d) obj3);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            boolean z4 = this.f141840x;
            C16231e c16231e = (C16231e) this.f141841y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f141839w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return new C33857d(z4, c16231e.getIsSelectLottieSheetVisible(), c16231e.getLottieSource());
        }
    }

    /* JADX INFO: renamed from: ti2.f$h */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.streaks.presentation.StreaksViewModel$viewState$1", m100430f = "StreaksViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m65681d2 = {"Lqi2/b;", "domainResult", "Ljk0/a;", "strapBodyStatus", "Lti2/d;", "lottieState", "Lti2/b;", "<anonymous>", "(Lqi2/b;Ljk0/a;Lti2/d;)Lti2/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        int f141842w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f141843x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f141844y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f141845z;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(4, interfaceC30057d);
        }

        @Override // c93.InterfaceC4352n
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC30414b interfaceC30414b, EnumC21747a enumC21747a, C33857d c33857d, InterfaceC30057d<? super C33855b> interfaceC30057d) {
            h hVar = new h(interfaceC30057d);
            hVar.f141843x = interfaceC30414b;
            hVar.f141844y = enumC21747a;
            hVar.f141845z = c33857d;
            return hVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC30414b interfaceC30414b = (InterfaceC30414b) this.f141843x;
            EnumC21747a enumC21747a = (EnumC21747a) this.f141844y;
            C33857d c33857d = (C33857d) this.f141845z;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f141842w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return new C33855b(interfaceC30414b, enumC21747a, c33857d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33859f(C30415c interactor, C36063b reducer, C16229c globalLottieTesterState, C16230d localLottieTesterOverrideController, InterfaceC2994c0 coroutineScope, InterfaceC4733b whoopStrapProvider) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(globalLottieTesterState, "globalLottieTesterState");
        AbstractC22676k.m65750j(localLottieTesterOverrideController, "localLottieTesterOverrideController");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        this.localLottieTesterOverrideController = localLottieTesterOverrideController;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        C13015a0 c13015a0 = new C13015a0(new a(null), AbstractC27845h.m83945a(new d(c13096w1M36592b, this), interactor));
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(c13015a0, coroutineScope, c13021b2, 1);
        this.domainResult = c13078q1M36586L;
        C13078q1 c13078q1M36586L2 = AbstractC13091v.m36586L(new C13015a0(new f(null), AbstractC13091v.m36590P(new C4588i(whoopStrapProvider.mo14818b(), 2), new c(null))), coroutineScope, c13021b2, 1);
        this.strapBodyStatusFlow = c13078q1M36586L2;
        C13060l1 c13060l1 = new C13060l1(globalLottieTesterState.getIsOverrideEnabled(), localLottieTesterOverrideController.getState(), new g(null), 1);
        this.streaksLottieState = c13060l1;
        this.viewState = AbstractC13091v.m36586L(new e(AbstractC13091v.m36606p(c13078q1M36586L, c13078q1M36586L2, c13060l1, new h(null)), reducer), coroutineScope, c13021b2, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final InterfaceC30413a m107065o(InterfaceC33858e interfaceC33858e) {
        if (interfaceC33858e instanceof InterfaceC33858e.a) {
            return InterfaceC30413a.a.f124811a;
        }
        if (interfaceC33858e instanceof InterfaceC33858e.b) {
            return InterfaceC30413a.b.f124812a;
        }
        if (interfaceC33858e instanceof InterfaceC33858e.c) {
            return InterfaceC30413a.c.f124813a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: l */
    public final void m107066l(InterfaceC16239m event) {
        AbstractC22676k.m65750j(event, "event");
        this.localLottieTesterOverrideController.m45940b(event);
    }

    /* JADX INFO: renamed from: n */
    public final void m107067n(InterfaceC33858e viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new b(viewEvent, null), 3);
    }

    public /* synthetic */ C33859f(C30415c c30415c, C36063b c36063b, C16229c c16229c, C16230d c16230d, InterfaceC2994c0 interfaceC2994c0, InterfaceC4733b interfaceC4733b, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c30415c, c36063b, c16229c, c16230d, (i13 & 16) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0, interfaceC4733b);
    }
}
