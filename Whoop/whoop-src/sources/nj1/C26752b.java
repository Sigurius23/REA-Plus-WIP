package nj1;

import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13052j1;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import hj1.C17364a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kj1.AbstractC22514a;
import kj1.C22516c;
import kj1.InterfaceC22515b;
import l83.C23454a0;
import mj1.AbstractC25618a;
import oj1.C27979a;
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

/* JADX INFO: renamed from: nj1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\f*\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020-0\f8\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u00100R\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020\u00170\f8\u0006¢\u0006\f\n\u0004\b2\u0010,\u001a\u0004\b3\u00100¨\u00065"}, m65681d2 = {"Lnj1/b;", "Landroidx/lifecycle/w1;", "Lkj1/c;", "interactor", "Loj1/a;", "reducer", "Lbc3/c0;", "scope", "Lhj1/a;", "analyticsHelper", "<init>", "(Lkj1/c;Loj1/a;Lbc3/c0;Lhj1/a;)V", "Lec3/l;", "Lkj1/a;", "Lkj1/b;", "q", "(Lec3/l;Lkj1/c;)Lec3/l;", "Lnj1/a;", "viewEvent", "u", "(Lnj1/a;)Lkj1/a;", "Lkj1/b$b;", "domainState", "Lmj1/a;", "t", "(Lkj1/b$b;)Lmj1/a;", "domainAction", "Ll83/a0;", "r", "(Lkj1/a;)V", "Lbc3/k1;", "v", "(Lnj1/a;)Lbc3/k1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "getScope", "()Lbc3/c0;", "x", "Lhj1/a;", "Lec3/o1;", "y", "Lec3/o1;", "eventFlow", "z", "Lec3/l;", "Lnj1/c;", "E", "getViewState", "()Lec3/l;", "viewState", "F", "p", "navigationEvents", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26752b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l navigationEvents;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C17364a analyticsHelper;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: nj1.b$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthconnect.presentation.HealthConnectViewModel$domainState$1", m100430f = "HealthConnectViewModel.kt", m100431l = {34}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lnj1/a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f106404w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f106405x;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f106405x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f106405x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f106404w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC26751a.a aVar = AbstractC26751a.a.f106395a;
                this.f106405x = null;
                this.f106404w = 1;
                if (interfaceC13062m.emit(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: nj1.b$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthconnect.presentation.HealthConnectViewModel$domainState$3", m100430f = "HealthConnectViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lkj1/a;", "it", "Ll83/a0;", "<anonymous>", "(Lkj1/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f106406w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f106407x;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = C26752b.this.new b(interfaceC30057d);
            bVar.f106407x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC22514a abstractC22514a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(abstractC22514a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC22514a abstractC22514a = (AbstractC22514a) this.f106407x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f106406w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C26752b.this.m79632r(abstractC22514a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: nj1.b$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthconnect.presentation.HealthConnectViewModel$sendViewEvent$1", m100430f = "HealthConnectViewModel.kt", m100431l = {52}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f106409w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC26751a f106411y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC26751a abstractC26751a, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f106411y = abstractC26751a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C26752b.this.new c(this.f106411y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f106409w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C26752b.this.eventFlow;
                AbstractC26751a abstractC26751a = this.f106411y;
                this.f106409w = 1;
                if (interfaceC13072o1.emit(abstractC26751a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: nj1.b$d */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f106412w;

        /* JADX INFO: renamed from: nj1.b$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f106413w;

            /* JADX INFO: renamed from: nj1.b$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.healthconnect.presentation.HealthConnectViewModel$special$$inlined$filter$1$2", m100430f = "HealthConnectViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42057a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f106415F;

                /* JADX INFO: renamed from: G */
                Object f106416G;

                /* JADX INFO: renamed from: H */
                int f106417H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f106418w;

                /* JADX INFO: renamed from: x */
                int f106419x;

                /* JADX INFO: renamed from: y */
                Object f106420y;

                /* JADX INFO: renamed from: z */
                Object f106421z;

                public C42057a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f106418w = obj;
                    this.f106419x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f106413w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42057a c42057a;
                if (interfaceC30057d instanceof C42057a) {
                    c42057a = (C42057a) interfaceC30057d;
                    int i13 = c42057a.f106419x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42057a.f106419x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42057a = new C42057a(interfaceC30057d);
                    }
                } else {
                    c42057a = new C42057a(interfaceC30057d);
                }
                Object obj2 = c42057a.f106418w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42057a.f106419x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f106413w;
                    if (((InterfaceC22515b) obj) instanceof InterfaceC22515b.b) {
                        c42057a.f106420y = null;
                        c42057a.f106421z = null;
                        c42057a.f106415F = null;
                        c42057a.f106416G = null;
                        c42057a.f106417H = 0;
                        c42057a.f106419x = 1;
                        if (interfaceC13062m.emit(obj, c42057a) == enumC31071a) {
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
            this.f106412w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f106412w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: nj1.b$e */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f106422w;

        /* JADX INFO: renamed from: nj1.b$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f106423w;

            /* JADX INFO: renamed from: nj1.b$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.healthconnect.presentation.HealthConnectViewModel$special$$inlined$filterNot$1$2", m100430f = "HealthConnectViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42058a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f106425F;

                /* JADX INFO: renamed from: G */
                Object f106426G;

                /* JADX INFO: renamed from: H */
                int f106427H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f106428w;

                /* JADX INFO: renamed from: x */
                int f106429x;

                /* JADX INFO: renamed from: y */
                Object f106430y;

                /* JADX INFO: renamed from: z */
                Object f106431z;

                public C42058a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f106428w = obj;
                    this.f106429x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f106423w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42058a c42058a;
                if (interfaceC30057d instanceof C42058a) {
                    c42058a = (C42058a) interfaceC30057d;
                    int i13 = c42058a.f106429x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42058a.f106429x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42058a = new C42058a(interfaceC30057d);
                    }
                } else {
                    c42058a = new C42058a(interfaceC30057d);
                }
                Object obj2 = c42058a.f106428w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42058a.f106429x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f106423w;
                    if (!(((InterfaceC22515b) obj) instanceof InterfaceC22515b.b)) {
                        c42058a.f106430y = null;
                        c42058a.f106431z = null;
                        c42058a.f106425F = null;
                        c42058a.f106426G = null;
                        c42058a.f106427H = 0;
                        c42058a.f106429x = 1;
                        if (interfaceC13062m.emit(obj, c42058a) == enumC31071a) {
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
            this.f106422w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f106422w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: nj1.b$f */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f106432w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C26752b f106433x;

        /* JADX INFO: renamed from: nj1.b$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f106434w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C26752b f106435x;

            /* JADX INFO: renamed from: nj1.b$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.healthconnect.presentation.HealthConnectViewModel$special$$inlined$map$1$2", m100430f = "HealthConnectViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42059a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f106436E;

                /* JADX INFO: renamed from: F */
                Object f106437F;

                /* JADX INFO: renamed from: G */
                Object f106438G;

                /* JADX INFO: renamed from: H */
                int f106439H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f106440w;

                /* JADX INFO: renamed from: x */
                int f106441x;

                /* JADX INFO: renamed from: y */
                Object f106442y;

                public C42059a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f106440w = obj;
                    this.f106441x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C26752b c26752b) {
                this.f106434w = interfaceC13062m;
                this.f106435x = c26752b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42059a c42059a;
                if (interfaceC30057d instanceof C42059a) {
                    c42059a = (C42059a) interfaceC30057d;
                    int i13 = c42059a.f106441x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42059a.f106441x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42059a = new C42059a(interfaceC30057d);
                    }
                } else {
                    c42059a = new C42059a(interfaceC30057d);
                }
                Object obj2 = c42059a.f106440w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42059a.f106441x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f106434w;
                    AbstractC22514a abstractC22514aM79634u = this.f106435x.m79634u((AbstractC26751a) obj);
                    c42059a.f106442y = null;
                    c42059a.f106436E = null;
                    c42059a.f106437F = null;
                    c42059a.f106438G = null;
                    c42059a.f106439H = 0;
                    c42059a.f106441x = 1;
                    if (interfaceC13062m.emit(abstractC22514aM79634u, c42059a) == enumC31071a) {
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

        public f(InterfaceC13058l interfaceC13058l, C26752b c26752b) {
            this.f106432w = interfaceC13058l;
            this.f106433x = c26752b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f106432w.collect(new a(interfaceC13062m, this.f106433x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: nj1.b$g */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f106444w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C27979a f106445x;

        /* JADX INFO: renamed from: nj1.b$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f106446w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C27979a f106447x;

            /* JADX INFO: renamed from: nj1.b$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.healthconnect.presentation.HealthConnectViewModel$special$$inlined$map$2$2", m100430f = "HealthConnectViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42060a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f106448E;

                /* JADX INFO: renamed from: F */
                Object f106449F;

                /* JADX INFO: renamed from: G */
                Object f106450G;

                /* JADX INFO: renamed from: H */
                int f106451H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f106452w;

                /* JADX INFO: renamed from: x */
                int f106453x;

                /* JADX INFO: renamed from: y */
                Object f106454y;

                public C42060a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f106452w = obj;
                    this.f106453x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C27979a c27979a) {
                this.f106446w = interfaceC13062m;
                this.f106447x = c27979a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42060a c42060a;
                if (interfaceC30057d instanceof C42060a) {
                    c42060a = (C42060a) interfaceC30057d;
                    int i13 = c42060a.f106453x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42060a.f106453x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42060a = new C42060a(interfaceC30057d);
                    }
                } else {
                    c42060a = new C42060a(interfaceC30057d);
                }
                Object obj2 = c42060a.f106452w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42060a.f106453x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f106446w;
                    AbstractC26753c abstractC26753cM84398a = this.f106447x.m84398a((InterfaceC22515b) obj);
                    c42060a.f106454y = null;
                    c42060a.f106448E = null;
                    c42060a.f106449F = null;
                    c42060a.f106450G = null;
                    c42060a.f106451H = 0;
                    c42060a.f106453x = 1;
                    if (interfaceC13062m.emit(abstractC26753cM84398a, c42060a) == enumC31071a) {
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

        public g(InterfaceC13058l interfaceC13058l, C27979a c27979a) {
            this.f106444w = interfaceC13058l;
            this.f106445x = c27979a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f106444w.collect(new a(interfaceC13062m, this.f106445x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: nj1.b$h */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f106456w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C26752b f106457x;

        /* JADX INFO: renamed from: nj1.b$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f106458w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C26752b f106459x;

            /* JADX INFO: renamed from: nj1.b$h$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.healthconnect.presentation.HealthConnectViewModel$special$$inlined$map$3$2", m100430f = "HealthConnectViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42061a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f106460E;

                /* JADX INFO: renamed from: F */
                Object f106461F;

                /* JADX INFO: renamed from: G */
                Object f106462G;

                /* JADX INFO: renamed from: H */
                int f106463H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f106464w;

                /* JADX INFO: renamed from: x */
                int f106465x;

                /* JADX INFO: renamed from: y */
                Object f106466y;

                public C42061a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f106464w = obj;
                    this.f106465x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C26752b c26752b) {
                this.f106458w = interfaceC13062m;
                this.f106459x = c26752b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42061a c42061a;
                if (interfaceC30057d instanceof C42061a) {
                    c42061a = (C42061a) interfaceC30057d;
                    int i13 = c42061a.f106465x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42061a.f106465x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42061a = new C42061a(interfaceC30057d);
                    }
                } else {
                    c42061a = new C42061a(interfaceC30057d);
                }
                Object obj2 = c42061a.f106464w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42061a.f106465x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f106458w;
                    InterfaceC22515b interfaceC22515b = (InterfaceC22515b) obj;
                    C26752b c26752b = this.f106459x;
                    AbstractC22676k.m65748h(interfaceC22515b, "null cannot be cast to non-null type com.whoop.healthconnect.domain.HealthConnectDomainState.HealthConnectNavigationState");
                    AbstractC25618a abstractC25618aM79633t = c26752b.m79633t((InterfaceC22515b.b) interfaceC22515b);
                    c42061a.f106466y = null;
                    c42061a.f106460E = null;
                    c42061a.f106461F = null;
                    c42061a.f106462G = null;
                    c42061a.f106463H = 0;
                    c42061a.f106465x = 1;
                    if (interfaceC13062m.emit(abstractC25618aM79633t, c42061a) == enumC31071a) {
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

        public h(InterfaceC13058l interfaceC13058l, C26752b c26752b) {
            this.f106456w = interfaceC13058l;
            this.f106457x = c26752b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f106456w.collect(new a(interfaceC13062m, this.f106457x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: nj1.b$i */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthconnect.presentation.HealthConnectViewModel$viewState$3", m100430f = "HealthConnectViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lnj1/c;", "it", "Ll83/a0;", "<anonymous>", "(Lnj1/c;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f106468w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f106469x;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            i iVar = C26752b.this.new i(interfaceC30057d);
            iVar.f106469x = obj;
            return iVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC26753c abstractC26753c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(abstractC26753c, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC26753c abstractC26753c = (AbstractC26753c) this.f106469x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f106468w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC26753c instanceof AbstractC26753c.b) {
                C26752b.this.analyticsHelper.m49171f("Settings");
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26752b(C22516c interactor, C27979a reducer, InterfaceC2994c0 scope, C17364a analyticsHelper) {
        super(scope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        this.scope = scope;
        this.analyticsHelper = analyticsHelper;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(m79631q(new C13052j1(new f(new C13015a0(new a(null), c13096w1M36592b), this), new b(null), 0), interactor), scope, C13105z1.f45288a, 1);
        this.domainState = c13078q1M36586L;
        this.viewState = new C13052j1(new g(new e(c13078q1M36586L), reducer), new i(null), 0);
        this.navigationEvents = new h(new d(c13078q1M36586L), this);
    }

    /* JADX INFO: renamed from: q */
    private final InterfaceC13058l m79631q(InterfaceC13058l interfaceC13058l, C22516c c22516c) {
        return c22516c.m65022e(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final void m79632r(AbstractC22514a domainAction) {
        if (AbstractC22676k.m65745e(domainAction, AbstractC22514a.b.f88239a)) {
            this.analyticsHelper.m49168c("Settings");
        } else if (AbstractC22676k.m65745e(domainAction, AbstractC22514a.c.f88240a)) {
            this.analyticsHelper.m49167b("Settings");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final AbstractC25618a m79633t(InterfaceC22515b.b domainState) {
        if (AbstractC22676k.m65745e(domainState, InterfaceC22515b.e.f88245a)) {
            return AbstractC25618a.d.f100498a;
        }
        if (AbstractC22676k.m65745e(domainState, InterfaceC22515b.f.f88246a)) {
            return AbstractC25618a.c.f100497a;
        }
        if (AbstractC22676k.m65745e(domainState, InterfaceC22515b.c.f88243a)) {
            return AbstractC25618a.b.f100496a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public final AbstractC22514a m79634u(AbstractC26751a viewEvent) {
        if (viewEvent instanceof AbstractC26751a.a) {
            return AbstractC22514a.a.f88238a;
        }
        if (viewEvent instanceof AbstractC26751a.b) {
            return AbstractC22514a.b.f88239a;
        }
        if (viewEvent instanceof AbstractC26751a.c) {
            return AbstractC22514a.c.f88240a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final InterfaceC13058l getNavigationEvents() {
        return this.navigationEvents;
    }

    /* JADX INFO: renamed from: v */
    public final InterfaceC3027k1 m79636v(AbstractC26751a viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        return AbstractC3006f0.m8732z(this.scope, null, null, new c(viewEvent, null), 3);
    }

    public /* synthetic */ C26752b(C22516c c22516c, C27979a c27979a, InterfaceC2994c0 interfaceC2994c0, C17364a c17364a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c22516c, c27979a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0, c17364a);
    }
}
