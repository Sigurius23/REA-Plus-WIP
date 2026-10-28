package hm0;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.entitlements.Entitlement;
import dm0.C12176a;
import dp0.InterfaceC12251g;
import ec3.AbstractC13091v;
import ec3.C13052j1;
import ec3.C13084s1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import fm0.C14595b;
import fm0.C14596c;
import fm0.InterfaceC14594a;
import im0.C18654a;
import j02.C21138e;
import l83.C23454a0;
import ld1.AbstractC23864c;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22656a;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import we1.InterfaceC37217a;

/* JADX INFO: renamed from: hm0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BA\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00030-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R \u00106\u001a\b\u0012\u0004\u0012\u00020\u0002018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00067"}, m65681d2 = {"Lhm0/c;", "Lld1/c;", "Lhm0/d;", "Lhm0/a;", "Lfm0/c;", "interactor", "Lim0/a;", "reducer", "Lj02/e;", "tabEventPublisher", "Ldm0/a;", "analyticsHelper", "Ldp0/g;", "globalCoachManager", "Lwe1/a;", "entitlementChecker", "Lbc3/c0;", "coroutineScope", "<init>", "(Lfm0/c;Lim0/a;Lj02/e;Ldm0/a;Ldp0/g;Lwe1/a;Lbc3/c0;)V", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "o", "(Lhm0/a;)V", "q", "()V", "", "tabId", "p", "(Ljava/lang/String;)Ljava/lang/String;", "r", "x", "Lfm0/c;", "y", "Lim0/a;", "z", "Lj02/e;", "E", "Ldm0/a;", "F", "Ldp0/g;", "G", "Lwe1/a;", "H", "Lbc3/c0;", "Lec3/o1;", "I", "Lec3/o1;", "bottomNavViewEventFlow", "Lec3/f2;", "J", "Lec3/f2;", "getViewState", "()Lec3/f2;", "viewState", "bottom-navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17422c extends AbstractC23864c<C17423d, InterfaceC17420a> {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C12176a analyticsHelper;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC12251g globalCoachManager;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC37217a entitlementChecker;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC13072o1 bottomNavViewEventFlow;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC13037f2 viewState;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C14596c interactor;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C18654a reducer;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C21138e tabEventPublisher;

    /* JADX INFO: renamed from: hm0.c$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bottomnavigation.presentation.BottomNavViewModel$sendViewEvent$1", m100430f = "BottomNavViewModel.kt", m100431l = {54}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f67521w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC17420a f67523y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC17420a interfaceC17420a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f67523y = interfaceC17420a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C17422c.this.new a(this.f67523y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f67521w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C17422c.this.bottomNavViewEventFlow;
                InterfaceC17420a interfaceC17420a = this.f67523y;
                this.f67521w = 1;
                if (interfaceC13072o1.emit(interfaceC17420a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: hm0.c$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f67524w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C18654a f67525x;

        /* JADX INFO: renamed from: hm0.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f67526w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C18654a f67527x;

            /* JADX INFO: renamed from: hm0.c$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.bottomnavigation.presentation.BottomNavViewModel$special$$inlined$map$1$2", m100430f = "BottomNavViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41698a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f67528E;

                /* JADX INFO: renamed from: F */
                Object f67529F;

                /* JADX INFO: renamed from: G */
                Object f67530G;

                /* JADX INFO: renamed from: H */
                int f67531H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f67532w;

                /* JADX INFO: renamed from: x */
                int f67533x;

                /* JADX INFO: renamed from: y */
                Object f67534y;

                public C41698a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f67532w = obj;
                    this.f67533x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C18654a c18654a) {
                this.f67526w = interfaceC13062m;
                this.f67527x = c18654a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41698a c41698a;
                if (interfaceC30057d instanceof C41698a) {
                    c41698a = (C41698a) interfaceC30057d;
                    int i13 = c41698a.f67533x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41698a.f67533x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41698a = new C41698a(interfaceC30057d);
                    }
                } else {
                    c41698a = new C41698a(interfaceC30057d);
                }
                Object obj2 = c41698a.f67532w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41698a.f67533x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f67526w;
                    C17423d c17423dM54084a = this.f67527x.m54084a((C14595b) obj);
                    c41698a.f67534y = null;
                    c41698a.f67528E = null;
                    c41698a.f67529F = null;
                    c41698a.f67530G = null;
                    c41698a.f67531H = 0;
                    c41698a.f67533x = 1;
                    if (interfaceC13062m.emit(c17423dM54084a, c41698a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C18654a c18654a) {
            this.f67524w = interfaceC13058l;
            this.f67525x = c18654a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f67524w.collect(new a(interfaceC13062m, this.f67525x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: hm0.c$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f67536w;

        /* JADX INFO: renamed from: hm0.c$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f67537w;

            /* JADX INFO: renamed from: hm0.c$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.bottomnavigation.presentation.BottomNavViewModel$special$$inlined$mapNotNull$1$2", m100430f = "BottomNavViewModel.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41699a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f67538E;

                /* JADX INFO: renamed from: F */
                Object f67539F;

                /* JADX INFO: renamed from: G */
                Object f67540G;

                /* JADX INFO: renamed from: H */
                Object f67541H;

                /* JADX INFO: renamed from: I */
                int f67542I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f67543w;

                /* JADX INFO: renamed from: x */
                int f67544x;

                /* JADX INFO: renamed from: y */
                Object f67545y;

                public C41699a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f67543w = obj;
                    this.f67544x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f67537w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41699a c41699a;
                if (interfaceC30057d instanceof C41699a) {
                    c41699a = (C41699a) interfaceC30057d;
                    int i13 = c41699a.f67544x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41699a.f67544x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41699a = new C41699a(interfaceC30057d);
                    }
                } else {
                    c41699a = new C41699a(interfaceC30057d);
                }
                Object obj2 = c41699a.f67543w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41699a.f67544x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f67537w;
                    InterfaceC14594a interfaceC14594aM49438a = AbstractC17421b.m49438a((InterfaceC17420a) obj);
                    if (interfaceC14594aM49438a != null) {
                        c41699a.f67545y = null;
                        c41699a.f67538E = null;
                        c41699a.f67539F = null;
                        c41699a.f67540G = null;
                        c41699a.f67541H = null;
                        c41699a.f67542I = 0;
                        c41699a.f67544x = 1;
                        if (interfaceC13062m.emit(interfaceC14594aM49438a, c41699a) == enumC31071a) {
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
            this.f67536w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f67536w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: hm0.c$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bottomnavigation.presentation.BottomNavViewModel$special$$inlined$transform$1", m100430f = "BottomNavViewModel.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"R", "Lec3/m;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f67547w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f67548x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC13058l f67549y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C17422c f67550z;

        /* JADX INFO: renamed from: hm0.c$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f67551w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C17422c f67552x;

            public a(InterfaceC13062m interfaceC13062m, C17422c c17422c) {
                this.f67552x = c17422c;
                this.f67551w = interfaceC13062m;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ec3.InterfaceC13062m
            public final Object emit(T t14, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f67552x.analyticsHelper.m33680a((String) t14);
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC13058l interfaceC13058l, InterfaceC30057d interfaceC30057d, C17422c c17422c) {
            super(2, interfaceC30057d);
            this.f67549y = interfaceC13058l;
            this.f67550z = c17422c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(this.f67549y, interfaceC30057d, this.f67550z);
            dVar.f67548x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f67547w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f67548x;
                InterfaceC13058l interfaceC13058l = this.f67549y;
                a aVar = new a(interfaceC13062m, this.f67550z);
                this.f67548x = null;
                this.f67547w = 1;
                if (interfaceC13058l.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: hm0.c$e */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class e extends C22656a implements InterfaceC4351m {
        public e(Object obj) {
            super(2, 4, C17422c.class, obj, "handleSideEffect", "handleSideEffect(Lcom/whoop/bottomnavigation/presentation/BottomNavViewEvent;)V");
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17420a interfaceC17420a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return C17422c.m49445t((C17422c) this.receiver, interfaceC17420a, interfaceC30057d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17422c(C14596c interactor, C18654a reducer, C21138e tabEventPublisher, C12176a analyticsHelper, InterfaceC12251g globalCoachManager, InterfaceC37217a entitlementChecker, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(tabEventPublisher, "tabEventPublisher");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(globalCoachManager, "globalCoachManager");
        AbstractC22676k.m65750j(entitlementChecker, "entitlementChecker");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.tabEventPublisher = tabEventPublisher;
        this.analyticsHelper = analyticsHelper;
        this.globalCoachManager = globalCoachManager;
        this.entitlementChecker = entitlementChecker;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.bottomNavViewEventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36587M(AbstractC13091v.m36610t(new b(interactor.m41762h(AbstractC13091v.m36584J(new c(new C13052j1(c13096w1M36592b, new e(this), 0)), new C13084s1(new d(tabEventPublisher.getUnknownTabRequests(), null, this)))), reducer)), coroutineScope, C13105z1.f45288a, new C17423d(null, null, false, false, 15, null));
    }

    /* JADX INFO: renamed from: o */
    private final void m49442o(InterfaceC17420a event) {
        if (event instanceof InterfaceC17420a.a) {
            m49444q();
        }
    }

    /* JADX INFO: renamed from: p */
    private final String m49443p(String tabId) {
        if (tabId == null) {
            return null;
        }
        switch (tabId) {
            case "community":
                return "COMMUNITY";
            case "health":
                return "HEALTH";
            case "home":
                return "HOME";
            case "menu":
                return "SETTINGS";
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: q */
    private final void m49444q() {
        String selectedTabId = ((C17423d) getViewState().getValue()).getSelectedTabId();
        if (this.entitlementChecker.mo119272b(Entitlement.DEVICE)) {
            selectedTabId = m49443p(selectedTabId);
        }
        InterfaceC12251g.m34132f(this.globalCoachManager, 0L, selectedTabId, null, 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ Object m49445t(C17422c c17422c, InterfaceC17420a interfaceC17420a, InterfaceC30057d interfaceC30057d) {
        c17422c.m49442o(interfaceC17420a);
        return C23454a0.f92919a;
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void mo1216g(InterfaceC17420a event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    @Override // ld1.AbstractC23864c
    public InterfaceC13037f2 getViewState() {
        return this.viewState;
    }

    public /* synthetic */ C17422c(C14596c c14596c, C18654a c18654a, C21138e c21138e, C12176a c12176a, InterfaceC12251g interfaceC12251g, InterfaceC37217a interfaceC37217a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c14596c, c18654a, c21138e, c12176a, interfaceC12251g, interfaceC37217a, (i13 & 64) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
