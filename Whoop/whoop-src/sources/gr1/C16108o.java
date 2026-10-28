package gr1;

import androidx.lifecycle.AbstractC1637w1;
import ar1.C1929b;
import ar1.InterfaceC1928a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import cr1.C11083c;
import cr1.InterfaceC11081a;
import cr1.InterfaceC11082b;
import dc3.C11923h;
import dc3.InterfaceC11927l;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13021b2;
import ec3.C13060l1;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import fr1.InterfaceC14714c;
import hr1.C17580f;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import ir1.EnumC20861b;
import l83.C23454a0;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qw2.AbstractC30694b;
import qw2.C30695c;
import qw2.C30698f;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: gr1.o */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0010*\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b!\u0010\u0019J\u0015\u0010\"\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\"\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010'R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00110(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020,0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010*R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00105\u001a\b\u0012\u0004\u0012\u000202018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00108\u001a\b\u0012\u0004\u0012\u0002060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00100R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u0002090\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00100R\u001d\u0010?\u001a\b\u0012\u0004\u0012\u0002090\u00108\u0006¢\u0006\f\n\u0004\b<\u00100\u001a\u0004\b=\u0010>R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001c0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00108\u0006¢\u0006\f\n\u0004\bD\u00100\u001a\u0004\bE\u0010>R(\u0010K\u001a\u0004\u0018\u00010\n2\b\u0010G\u001a\u0004\u0018\u00010\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bH\u0010&\u001a\u0004\bI\u0010J¨\u0006L"}, m65681d2 = {"Lgr1/o;", "Landroidx/lifecycle/w1;", "Lcr1/c;", "interactor", "Lhr1/f;", "reducer", "Lar1/b;", "analyticsHelper", "Lqw2/c;", "actionInteractor", "", "source", "Lbc3/c0;", "coroutineScope", "<init>", "(Lcr1/c;Lhr1/f;Lar1/b;Lqw2/c;Ljava/lang/String;Lbc3/c0;)V", "Lec3/l;", "Lcr1/a;", "Lcr1/b;", "v", "(Lec3/l;Lcr1/c;)Lec3/l;", "Lgr1/n;", "viewEvent", "Ll83/a0;", "B", "(Lgr1/n;)V", "Lcr1/b$g;", "domainState", "Lfr1/c;", "y", "(Lcr1/b$g;)Lfr1/c;", "z", "(Lgr1/n;)Lcr1/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "A", "Lar1/b;", "x", "Lqw2/c;", "Ljava/lang/String;", "Lbc3/c0;", "Lec3/o1;", "E", "Lec3/o1;", "eventFlow", "Lqw2/a;", "F", "actionFlow", "G", "Lec3/l;", "Lec3/t1;", "Lqw2/b;", "H", "Lec3/t1;", "actionStateFlow", "", "I", "isActionLoading", "Lgr1/q;", "J", "accumulatedViewState", "K", "getViewState", "()Lec3/l;", "viewState", "Ldc3/l;", "L", "Ldc3/l;", "navigationChannel", "M", "u", "navigationState", "value", "N", "t", "()Ljava/lang/String;", "currentIntegrationId", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C16108o extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13072o1 actionFlow;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC13087t1 actionStateFlow;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC13058l isActionLoading;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC13058l accumulatedViewState;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC11927l navigationChannel;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final InterfaceC13058l navigationState;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private String currentIntegrationId;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C1929b analyticsHelper;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C30695c actionInteractor;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final String source;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: gr1.o$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.integrations.presentation.IntegrationsViewModel$1", m100430f = "IntegrationsViewModel.kt", m100431l = {108}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f61133w;

        /* JADX INFO: renamed from: gr1.o$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41665a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C16108o f61135w;

            public C41665a(C16108o c16108o) {
                this.f61135w = c16108o;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(InterfaceC11082b.g gVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (gVar instanceof InterfaceC11082b.c) {
                    this.f61135w.currentIntegrationId = null;
                }
                Object objMo32219t = this.f61135w.navigationChannel.mo32219t(this.f61135w.m45620y(gVar), interfaceC30057d);
                return objMo32219t == EnumC31071a.f128113w ? objMo32219t : C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: gr1.o$a$b */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f61136w;

            /* JADX INFO: renamed from: gr1.o$a$b$a, reason: collision with other inner class name */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41666a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f61137w;

                /* JADX INFO: renamed from: gr1.o$a$b$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.integrations.presentation.IntegrationsViewModel$1$invokeSuspend$$inlined$filterIsInstance$1$2", m100430f = "IntegrationsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C41667a extends AbstractC32269c {

                    /* JADX INFO: renamed from: F */
                    Object f61139F;

                    /* JADX INFO: renamed from: G */
                    Object f61140G;

                    /* JADX INFO: renamed from: H */
                    int f61141H;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f61142w;

                    /* JADX INFO: renamed from: x */
                    int f61143x;

                    /* JADX INFO: renamed from: y */
                    Object f61144y;

                    /* JADX INFO: renamed from: z */
                    Object f61145z;

                    public C41667a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f61142w = obj;
                        this.f61143x |= Integer.MIN_VALUE;
                        return C41666a.this.emit(null, this);
                    }
                }

                public C41666a(InterfaceC13062m interfaceC13062m) {
                    this.f61137w = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C41667a c41667a;
                    if (interfaceC30057d instanceof C41667a) {
                        c41667a = (C41667a) interfaceC30057d;
                        int i13 = c41667a.f61143x;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c41667a.f61143x = i13 - Integer.MIN_VALUE;
                        } else {
                            c41667a = new C41667a(interfaceC30057d);
                        }
                    } else {
                        c41667a = new C41667a(interfaceC30057d);
                    }
                    Object obj2 = c41667a.f61142w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c41667a.f61143x;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.f61137w;
                        if (obj instanceof InterfaceC11082b.g) {
                            c41667a.f61144y = null;
                            c41667a.f61145z = null;
                            c41667a.f61139F = null;
                            c41667a.f61140G = null;
                            c41667a.f61141H = 0;
                            c41667a.f61143x = 1;
                            if (interfaceC13062m.emit(obj, c41667a) == enumC31071a) {
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

            public b(InterfaceC13058l interfaceC13058l) {
                this.f61136w = interfaceC13058l;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f61136w.collect(new C41666a(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C16108o.this.new a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f61133w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                b bVar = new b(C16108o.this.domainState);
                C41665a c41665a = new C41665a(C16108o.this);
                this.f61133w = 1;
                if (bVar.collect(c41665a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: gr1.o$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f61146a;

        static {
            int[] iArr = new int[EnumC20861b.values().length];
            try {
                iArr[EnumC20861b.HEALTH_CONNECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC20861b.STRAVA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f61146a = iArr;
        }
    }

    /* JADX INFO: renamed from: gr1.o$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.integrations.presentation.IntegrationsViewModel$accumulatedViewState$2", m100430f = "IntegrationsViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lgr1/q;", "prevState", "Lcr1/b;", "result", "<anonymous>", "(Lgr1/q;Lcr1/b;)Lgr1/q;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f61147w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f61148x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f61149y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C17580f f61150z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C17580f c17580f, InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f61150z = c17580f;
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C16110q c16110q, InterfaceC11082b interfaceC11082b, InterfaceC30057d<? super C16110q> interfaceC30057d) {
            c cVar = new c(this.f61150z, interfaceC30057d);
            cVar.f61148x = c16110q;
            cVar.f61149y = interfaceC11082b;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C16110q c16110q = (C16110q) this.f61148x;
            InterfaceC11082b interfaceC11082b = (InterfaceC11082b) this.f61149y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f61147w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C16110q c16110qM50060a = this.f61150z.m50060a(interfaceC11082b);
            if (!(interfaceC11082b instanceof InterfaceC11082b.h) && !(interfaceC11082b instanceof InterfaceC11082b.i) && !(interfaceC11082b instanceof InterfaceC11082b.j) && !(interfaceC11082b instanceof InterfaceC11082b.e)) {
                return c16110qM50060a;
            }
            C16095b detailsScreen = c16110qM50060a.getDetailsScreen();
            if (detailsScreen == null) {
                detailsScreen = c16110q.getDetailsScreen();
            }
            C16095b c16095b = detailsScreen;
            C16096c detailsV2Screen = c16110qM50060a.getDetailsV2Screen();
            if (detailsV2Screen == null) {
                detailsV2Screen = c16110q.getDetailsV2Screen();
            }
            return C16110q.m45631b(c16110qM50060a, null, false, null, null, c16095b, detailsV2Screen, null, false, 207, null);
        }
    }

    /* JADX INFO: renamed from: gr1.o$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.integrations.presentation.IntegrationsViewModel$isActionLoading$2", m100430f = "IntegrationsViewModel.kt", m100431l = {61}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f61151w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f61152x;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(interfaceC30057d);
            dVar.f61152x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f61152x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f61151w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                Boolean bool = Boolean.FALSE;
                this.f61152x = null;
                this.f61151w = 1;
                if (interfaceC13062m.emit(bool, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: gr1.o$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.integrations.presentation.IntegrationsViewModel$sendViewEvent$1", m100430f = "IntegrationsViewModel.kt", m100431l = {138, 141}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC16107n f61153E;

        /* JADX INFO: renamed from: w */
        Object f61154w;

        /* JADX INFO: renamed from: x */
        int f61155x;

        /* JADX INFO: renamed from: y */
        int f61156y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC16107n interfaceC16107n, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f61153E = interfaceC16107n;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C16108o.this.new e(this.f61153E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f61156y;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 != 0) {
                if (i13 == 1) {
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            }
            AbstractC34132o.m107864I(obj);
            C16108o.this.m45619w(this.f61153E);
            InterfaceC16107n interfaceC16107n = this.f61153E;
            if (!(interfaceC16107n instanceof InterfaceC16107n.l)) {
                InterfaceC11081a interfaceC11081aM45621z = C16108o.this.m45621z(interfaceC16107n);
                if (interfaceC11081aM45621z != null) {
                    InterfaceC13072o1 interfaceC13072o1 = C16108o.this.eventFlow;
                    this.f61154w = null;
                    this.f61155x = 0;
                    this.f61156y = 2;
                    if (interfaceC13072o1.emit(interfaceC11081aM45621z, this) == enumC31071a) {
                    }
                }
                return c23454a0;
            }
            InterfaceC13072o1 interfaceC13072o2 = C16108o.this.actionFlow;
            C30698f c30698f = new C30698f(((InterfaceC16107n.l) this.f61153E).getAction());
            this.f61156y = 1;
            if (interfaceC13072o2.emit(c30698f, this) != enumC31071a) {
                return c23454a0;
            }
            return enumC31071a;
        }
    }

    /* JADX INFO: renamed from: gr1.o$f */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f61158w;

        /* JADX INFO: renamed from: gr1.o$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f61159w;

            /* JADX INFO: renamed from: gr1.o$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.integrations.presentation.IntegrationsViewModel$special$$inlined$filterIsInstance$1$2", m100430f = "IntegrationsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41668a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f61161F;

                /* JADX INFO: renamed from: G */
                Object f61162G;

                /* JADX INFO: renamed from: H */
                int f61163H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f61164w;

                /* JADX INFO: renamed from: x */
                int f61165x;

                /* JADX INFO: renamed from: y */
                Object f61166y;

                /* JADX INFO: renamed from: z */
                Object f61167z;

                public C41668a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f61164w = obj;
                    this.f61165x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f61159w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41668a c41668a;
                if (interfaceC30057d instanceof C41668a) {
                    c41668a = (C41668a) interfaceC30057d;
                    int i13 = c41668a.f61165x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41668a.f61165x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41668a = new C41668a(interfaceC30057d);
                    }
                } else {
                    c41668a = new C41668a(interfaceC30057d);
                }
                Object obj2 = c41668a.f61164w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41668a.f61165x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f61159w;
                    if (obj instanceof AbstractC30694b.d) {
                        c41668a.f61166y = null;
                        c41668a.f61167z = null;
                        c41668a.f61161F = null;
                        c41668a.f61162G = null;
                        c41668a.f61163H = 0;
                        c41668a.f61165x = 1;
                        if (interfaceC13062m.emit(obj, c41668a) == enumC31071a) {
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
            this.f61158w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f61158w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: gr1.o$g */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f61168w;

        /* JADX INFO: renamed from: gr1.o$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f61169w;

            /* JADX INFO: renamed from: gr1.o$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.integrations.presentation.IntegrationsViewModel$special$$inlined$filterNot$1$2", m100430f = "IntegrationsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41669a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f61171F;

                /* JADX INFO: renamed from: G */
                Object f61172G;

                /* JADX INFO: renamed from: H */
                int f61173H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f61174w;

                /* JADX INFO: renamed from: x */
                int f61175x;

                /* JADX INFO: renamed from: y */
                Object f61176y;

                /* JADX INFO: renamed from: z */
                Object f61177z;

                public C41669a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f61174w = obj;
                    this.f61175x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f61169w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41669a c41669a;
                if (interfaceC30057d instanceof C41669a) {
                    c41669a = (C41669a) interfaceC30057d;
                    int i13 = c41669a.f61175x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41669a.f61175x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41669a = new C41669a(interfaceC30057d);
                    }
                } else {
                    c41669a = new C41669a(interfaceC30057d);
                }
                Object obj2 = c41669a.f61174w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41669a.f61175x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f61169w;
                    if (!(((InterfaceC11082b) obj) instanceof InterfaceC11082b.c)) {
                        c41669a.f61176y = null;
                        c41669a.f61177z = null;
                        c41669a.f61171F = null;
                        c41669a.f61172G = null;
                        c41669a.f61173H = 0;
                        c41669a.f61175x = 1;
                        if (interfaceC13062m.emit(obj, c41669a) == enumC31071a) {
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

        public g(InterfaceC13058l interfaceC13058l) {
            this.f61168w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f61168w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: gr1.o$h */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f61178w;

        /* JADX INFO: renamed from: gr1.o$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f61179w;

            /* JADX INFO: renamed from: gr1.o$h$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.integrations.presentation.IntegrationsViewModel$special$$inlined$map$1$2", m100430f = "IntegrationsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41670a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f61180E;

                /* JADX INFO: renamed from: F */
                Object f61181F;

                /* JADX INFO: renamed from: G */
                Object f61182G;

                /* JADX INFO: renamed from: H */
                int f61183H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f61184w;

                /* JADX INFO: renamed from: x */
                int f61185x;

                /* JADX INFO: renamed from: y */
                Object f61186y;

                public C41670a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f61184w = obj;
                    this.f61185x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f61179w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41670a c41670a;
                if (interfaceC30057d instanceof C41670a) {
                    c41670a = (C41670a) interfaceC30057d;
                    int i13 = c41670a.f61185x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41670a.f61185x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41670a = new C41670a(interfaceC30057d);
                    }
                } else {
                    c41670a = new C41670a(interfaceC30057d);
                }
                Object obj2 = c41670a.f61184w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41670a.f61185x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f61179w;
                    Boolean boolValueOf = Boolean.valueOf(((AbstractC30694b) obj) instanceof AbstractC30694b.c);
                    c41670a.f61186y = null;
                    c41670a.f61180E = null;
                    c41670a.f61181F = null;
                    c41670a.f61182G = null;
                    c41670a.f61183H = 0;
                    c41670a.f61185x = 1;
                    if (interfaceC13062m.emit(boolValueOf, c41670a) == enumC31071a) {
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

        public h(InterfaceC13058l interfaceC13058l) {
            this.f61178w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f61178w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: gr1.o$i */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f61188w;

        /* JADX INFO: renamed from: gr1.o$i$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f61189w;

            /* JADX INFO: renamed from: gr1.o$i$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.integrations.presentation.IntegrationsViewModel$special$$inlined$map$2$2", m100430f = "IntegrationsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41671a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f61190E;

                /* JADX INFO: renamed from: F */
                Object f61191F;

                /* JADX INFO: renamed from: G */
                Object f61192G;

                /* JADX INFO: renamed from: H */
                int f61193H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f61194w;

                /* JADX INFO: renamed from: x */
                int f61195x;

                /* JADX INFO: renamed from: y */
                Object f61196y;

                public C41671a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f61194w = obj;
                    this.f61195x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f61189w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41671a c41671a;
                if (interfaceC30057d instanceof C41671a) {
                    c41671a = (C41671a) interfaceC30057d;
                    int i13 = c41671a.f61195x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41671a.f61195x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41671a = new C41671a(interfaceC30057d);
                    }
                } else {
                    c41671a = new C41671a(interfaceC30057d);
                }
                Object obj2 = c41671a.f61194w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41671a.f61195x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f61189w;
                    InterfaceC14714c.g gVar = new InterfaceC14714c.g(((AbstractC30694b.d) obj).getDestination());
                    c41671a.f61196y = null;
                    c41671a.f61190E = null;
                    c41671a.f61191F = null;
                    c41671a.f61192G = null;
                    c41671a.f61193H = 0;
                    c41671a.f61195x = 1;
                    if (interfaceC13062m.emit(gVar, c41671a) == enumC31071a) {
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
            this.f61188w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f61188w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: gr1.o$j */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.integrations.presentation.IntegrationsViewModel$viewState$1", m100430f = "IntegrationsViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lgr1/q;", "state", "", "loading", "<anonymous>", "(Lgr1/q;Z)Lgr1/q;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f61198w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f61199x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ boolean f61200y;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        /* JADX INFO: renamed from: f */
        public final Object m45627f(C16110q c16110q, boolean z4, InterfaceC30057d<? super C16110q> interfaceC30057d) {
            j jVar = new j(interfaceC30057d);
            jVar.f61199x = c16110q;
            jVar.f61200y = z4;
            return jVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m45627f((C16110q) obj, ((Boolean) obj2).booleanValue(), (InterfaceC30057d) obj3);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C16110q c16110q = (C16110q) this.f61199x;
            boolean z4 = this.f61200y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f61198w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return AbstractC16109p.m45630c(c16110q, z4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16108o(C11083c interactor, C17580f reducer, C1929b analyticsHelper, C30695c actionInteractor, String str, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(actionInteractor, "actionInteractor");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.analyticsHelper = analyticsHelper;
        this.actionInteractor = actionInteractor;
        this.source = str;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        C13096w1 c13096w1M36592b2 = AbstractC13091v.m36592b(0, 0, null, 7);
        this.actionFlow = c13096w1M36592b2;
        InterfaceC13058l interfaceC13058lM45618v = m45618v(c13096w1M36592b, interactor);
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lM45618v, coroutineScope, c13021b2, 1);
        this.domainState = c13078q1M36586L;
        C13078q1 c13078q1M36586L2 = AbstractC13091v.m36586L(actionInteractor.interact(c13096w1M36592b2), coroutineScope, c13021b2, 0);
        this.actionStateFlow = c13078q1M36586L2;
        C13015a0 c13015a0 = new C13015a0(new d(null), new h(c13078q1M36586L2));
        this.isActionLoading = c13015a0;
        C13078q1 c13078q1M36586L3 = AbstractC13091v.m36586L(AbstractC13091v.m36612v(new C13060l1(new C16110q(null, false, null, null, null, null, null, false, 255, null), new g(c13078q1M36586L), new c(reducer, null)), 1), coroutineScope, c13021b2, 1);
        this.accumulatedViewState = c13078q1M36586L3;
        this.viewState = new C13060l1(c13078q1M36586L3, c13015a0, new j(null), 1);
        C11923h c11923hM92111d = AbstractC30060g.m92111d(-2, 6, null);
        this.navigationChannel = c11923hM92111d;
        this.navigationState = AbstractC13091v.m36584J(AbstractC13091v.m36585K(c11923hM92111d), new i(new f(c13078q1M36586L2)));
        AbstractC3006f0.m8732z(coroutineScope, null, null, new a(null), 3);
    }

    /* JADX INFO: renamed from: B */
    private final void m45609B(InterfaceC16107n viewEvent) {
        if (viewEvent instanceof InterfaceC16107n.e) {
            this.currentIntegrationId = ((InterfaceC16107n.e) viewEvent).getIntegrationId();
        } else if (viewEvent instanceof InterfaceC16107n.f) {
            this.currentIntegrationId = ((InterfaceC16107n.f) viewEvent).getIntegrationId();
        } else if (AbstractC22676k.m65745e(viewEvent, InterfaceC16107n.h.f61108a)) {
            this.currentIntegrationId = null;
        }
    }

    /* JADX INFO: renamed from: v */
    private final InterfaceC13058l m45618v(InterfaceC13058l interfaceC13058l, C11083c c11083c) {
        return c11083c.m29912r(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public final void m45619w(InterfaceC16107n viewEvent) {
        if (viewEvent instanceof InterfaceC16107n.e) {
            this.analyticsHelper.m5911a(new InterfaceC1928a.f(((InterfaceC16107n.e) viewEvent).getAnalyticsEventsKey()));
            return;
        }
        if (viewEvent instanceof InterfaceC16107n.a) {
            InterfaceC16107n.a aVar = (InterfaceC16107n.a) viewEvent;
            this.analyticsHelper.m5911a(new InterfaceC1928a.a(aVar.getAnalyticsEventsKey()));
            if (AbstractC22676k.m65745e(aVar.getAnalyticsEventsKey(), "healthex")) {
                this.analyticsHelper.m5911a(new InterfaceC1928a.d(this.source));
                return;
            }
            return;
        }
        if (viewEvent instanceof InterfaceC16107n.d) {
            this.analyticsHelper.m5911a(new InterfaceC1928a.b(((InterfaceC16107n.d) viewEvent).getAnalyticsEventsKey()));
            return;
        }
        if (viewEvent instanceof InterfaceC16107n.c) {
            this.analyticsHelper.m5911a(new InterfaceC1928a.c(((InterfaceC16107n.c) viewEvent).getAnalyticsEventsKey()));
            return;
        }
        if (!(viewEvent instanceof InterfaceC16107n.k)) {
            if ((viewEvent instanceof InterfaceC16107n.o) && AbstractC22676k.m65745e(((InterfaceC16107n.o) viewEvent).getIntegrationId(), "healthex")) {
                this.analyticsHelper.m5911a(new InterfaceC1928a.e(this.source));
                return;
            }
            return;
        }
        InterfaceC16107n.k kVar = (InterfaceC16107n.k) viewEvent;
        if (AbstractC22676k.m65745e(kVar.getIntegrationId(), "healthex") && kVar.getIsManualRefresh()) {
            this.analyticsHelper.m5911a(new InterfaceC1928a.e(this.source));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public final InterfaceC14714c m45620y(InterfaceC11082b.g domainState) {
        if ((domainState instanceof InterfaceC11082b.b) || (domainState instanceof InterfaceC11082b.d)) {
            return InterfaceC14714c.e.f54408a;
        }
        if (!(domainState instanceof InterfaceC11082b.c)) {
            throw new NoWhenBranchMatchedException();
        }
        int i13 = b.f61146a[((InterfaceC11082b.c) domainState).getIntegration().ordinal()];
        if (i13 == 1) {
            return new InterfaceC14714c.d(null, 1, null);
        }
        if (i13 == 2) {
            return InterfaceC14714c.i.f54416a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public final InterfaceC11081a m45621z(InterfaceC16107n viewEvent) {
        if (viewEvent instanceof InterfaceC16107n.e) {
            return new InterfaceC11081a.c(((InterfaceC16107n.e) viewEvent).getIntegrationId());
        }
        if (viewEvent instanceof InterfaceC16107n.f) {
            return new InterfaceC11081a.c(((InterfaceC16107n.f) viewEvent).getIntegrationId());
        }
        if (viewEvent instanceof InterfaceC16107n.h) {
            return InterfaceC11081a.e.f35047a;
        }
        if (viewEvent instanceof InterfaceC16107n.g) {
            return new InterfaceC11081a.d(((InterfaceC16107n.g) viewEvent).getIntegrationId());
        }
        if (viewEvent instanceof InterfaceC16107n.c) {
            return new InterfaceC11081a.b(((InterfaceC16107n.c) viewEvent).getIntegrationId());
        }
        if (viewEvent instanceof InterfaceC16107n.b) {
            InterfaceC16107n.b bVar = (InterfaceC16107n.b) viewEvent;
            return new InterfaceC11081a.a(bVar.getIntegrationId(), bVar.getIntegrationIdFor3P());
        }
        if (viewEvent instanceof InterfaceC16107n.n) {
            return new InterfaceC11081a.c(((InterfaceC16107n.n) viewEvent).getIntegrationId());
        }
        if (viewEvent instanceof InterfaceC16107n.i) {
            return new InterfaceC11081a.c(((InterfaceC16107n.i) viewEvent).getIntegrationId());
        }
        if (viewEvent instanceof InterfaceC16107n.j) {
            return new InterfaceC11081a.f(((InterfaceC16107n.j) viewEvent).getIntegrationId());
        }
        if (viewEvent instanceof InterfaceC16107n.o) {
            return new InterfaceC11081a.g(((InterfaceC16107n.o) viewEvent).getIntegrationId());
        }
        if (viewEvent instanceof InterfaceC16107n.k) {
            return new InterfaceC11081a.c(((InterfaceC16107n.k) viewEvent).getIntegrationId());
        }
        if (!(viewEvent instanceof InterfaceC16107n.m)) {
            return null;
        }
        InterfaceC16107n.m mVar = (InterfaceC16107n.m) viewEvent;
        return new InterfaceC11081a.h(mVar.getIntegrationId(), mVar.getType(), mVar.getIsEnabled());
    }

    /* JADX INFO: renamed from: A */
    public final void m45622A(InterfaceC16107n viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        m45609B(viewEvent);
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new e(viewEvent, null), 3);
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getCurrentIntegrationId() {
        return this.currentIntegrationId;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final InterfaceC13058l getNavigationState() {
        return this.navigationState;
    }

    public /* synthetic */ C16108o(C11083c c11083c, C17580f c17580f, C1929b c1929b, C30695c c30695c, String str, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c11083c, c17580f, c1929b, c30695c, (i13 & 16) != 0 ? null : str, (i13 & 32) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
