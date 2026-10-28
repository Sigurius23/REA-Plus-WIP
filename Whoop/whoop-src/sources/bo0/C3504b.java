package bo0;

import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import m83.AbstractC25265s;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p706eo0.C13377h;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import xn0.AbstractC38474b;
import xn0.C38473a;
import xn0.C38475c;
import yn0.InterfaceC39670b;

/* JADX INFO: renamed from: bo0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e*\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u000f*\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00130 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020(0\u000e8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020.0\u000e8\u0006¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u0010,¨\u00062"}, m65681d2 = {"Lbo0/b;", "Landroidx/lifecycle/w1;", "Leo0/h;", "screenArgs", "Lxn0/a;", "interactor", "Lbo0/d;", "reducer", "Lbc3/c0;", "coroutineScope", "Ltr2/n;", "logger", "<init>", "(Leo0/h;Lxn0/a;Lbo0/d;Lbc3/c0;Ltr2/n;)V", "Lec3/l;", "Lxn0/b;", "Lxn0/c;", "o", "(Lec3/l;Lxn0/a;)Lec3/l;", "Lbo0/a;", "q", "(Lbo0/a;)Lxn0/b;", "viewEvent", "Ll83/a0;", "p", "(Lbo0/a;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Leo0/h;", "x", "Lbc3/c0;", "y", "Ltr2/n;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "Lec3/t1;", "E", "Lec3/t1;", "domainState", "Lbo0/c;", "F", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "Lyn0/b;", "G", "n", "navigationEvents", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3504b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13087t1 domainState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l navigationEvents;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C13377h screenArgs;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: bo0.b$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.changepassword.presentation.reset.ResetPasswordViewModel$sendViewEvent$1", m100430f = "ResetPasswordViewModel.kt", m100431l = {59}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f13919w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC3503a f13921y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC3503a abstractC3503a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f13921y = abstractC3503a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C3504b.this.new a(this.f13921y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f13919w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C3504b.this.eventFlow;
                AbstractC3503a abstractC3503a = this.f13921y;
                this.f13919w = 1;
                if (interfaceC13072o1.emit(abstractC3503a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: bo0.b$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f13922w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C3504b f13923x;

        /* JADX INFO: renamed from: bo0.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f13924w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C3504b f13925x;

            /* JADX INFO: renamed from: bo0.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.changepassword.presentation.reset.ResetPasswordViewModel$special$$inlined$map$1$2", m100430f = "ResetPasswordViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41316a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f13926E;

                /* JADX INFO: renamed from: F */
                Object f13927F;

                /* JADX INFO: renamed from: G */
                Object f13928G;

                /* JADX INFO: renamed from: H */
                int f13929H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f13930w;

                /* JADX INFO: renamed from: x */
                int f13931x;

                /* JADX INFO: renamed from: y */
                Object f13932y;

                public C41316a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f13930w = obj;
                    this.f13931x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C3504b c3504b) {
                this.f13924w = interfaceC13062m;
                this.f13925x = c3504b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41316a c41316a;
                if (interfaceC30057d instanceof C41316a) {
                    c41316a = (C41316a) interfaceC30057d;
                    int i13 = c41316a.f13931x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41316a.f13931x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41316a = new C41316a(interfaceC30057d);
                    }
                } else {
                    c41316a = new C41316a(interfaceC30057d);
                }
                Object obj2 = c41316a.f13930w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41316a.f13931x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f13924w;
                    AbstractC38474b abstractC38474bM10338q = this.f13925x.m10338q((AbstractC3503a) obj);
                    c41316a.f13932y = null;
                    c41316a.f13926E = null;
                    c41316a.f13927F = null;
                    c41316a.f13928G = null;
                    c41316a.f13929H = 0;
                    c41316a.f13931x = 1;
                    if (interfaceC13062m.emit(abstractC38474bM10338q, c41316a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C3504b c3504b) {
            this.f13922w = interfaceC13058l;
            this.f13923x = c3504b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f13922w.collect(new a(interfaceC13062m, this.f13923x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: bo0.b$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f13934w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C3506d f13935x;

        /* JADX INFO: renamed from: bo0.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f13936w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C3506d f13937x;

            /* JADX INFO: renamed from: bo0.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.changepassword.presentation.reset.ResetPasswordViewModel$special$$inlined$map$2$2", m100430f = "ResetPasswordViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41317a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f13938E;

                /* JADX INFO: renamed from: F */
                Object f13939F;

                /* JADX INFO: renamed from: G */
                Object f13940G;

                /* JADX INFO: renamed from: H */
                int f13941H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f13942w;

                /* JADX INFO: renamed from: x */
                int f13943x;

                /* JADX INFO: renamed from: y */
                Object f13944y;

                public C41317a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f13942w = obj;
                    this.f13943x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C3506d c3506d) {
                this.f13936w = interfaceC13062m;
                this.f13937x = c3506d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41317a c41317a;
                if (interfaceC30057d instanceof C41317a) {
                    c41317a = (C41317a) interfaceC30057d;
                    int i13 = c41317a.f13943x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41317a.f13943x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41317a = new C41317a(interfaceC30057d);
                    }
                } else {
                    c41317a = new C41317a(interfaceC30057d);
                }
                Object obj2 = c41317a.f13942w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41317a.f13943x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f13936w;
                    C3505c c3505cM10353c = this.f13937x.m10353c((C38475c) obj);
                    c41317a.f13944y = null;
                    c41317a.f13938E = null;
                    c41317a.f13939F = null;
                    c41317a.f13940G = null;
                    c41317a.f13941H = 0;
                    c41317a.f13943x = 1;
                    if (interfaceC13062m.emit(c3505cM10353c, c41317a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C3506d c3506d) {
            this.f13934w = interfaceC13058l;
            this.f13935x = c3506d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f13934w.collect(new a(interfaceC13062m, this.f13935x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: bo0.b$d */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f13946w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C3504b f13947x;

        /* JADX INFO: renamed from: bo0.b$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f13948w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C3504b f13949x;

            /* JADX INFO: renamed from: bo0.b$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.changepassword.presentation.reset.ResetPasswordViewModel$special$$inlined$mapNotNull$1$2", m100430f = "ResetPasswordViewModel.kt", m100431l = {63}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41318a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f13950E;

                /* JADX INFO: renamed from: F */
                Object f13951F;

                /* JADX INFO: renamed from: G */
                Object f13952G;

                /* JADX INFO: renamed from: H */
                Object f13953H;

                /* JADX INFO: renamed from: I */
                int f13954I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f13955w;

                /* JADX INFO: renamed from: x */
                int f13956x;

                /* JADX INFO: renamed from: y */
                Object f13957y;

                public C41318a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f13955w = obj;
                    this.f13956x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C3504b c3504b) {
                this.f13948w = interfaceC13062m;
                this.f13949x = c3504b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41318a c41318a;
                Object obj2;
                if (interfaceC30057d instanceof C41318a) {
                    c41318a = (C41318a) interfaceC30057d;
                    int i13 = c41318a.f13956x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41318a.f13956x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41318a = new C41318a(interfaceC30057d);
                    }
                } else {
                    c41318a = new C41318a(interfaceC30057d);
                }
                Object obj3 = c41318a.f13955w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41318a.f13956x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj3);
                    InterfaceC13062m interfaceC13062m = this.f13948w;
                    C38475c c38475c = (C38475c) obj;
                    if (c38475c.getIsSuccess()) {
                        obj2 = InterfaceC39670b.d.f170723a;
                    } else if (c38475c.getNewLinkSent()) {
                        obj2 = InterfaceC39670b.c.f170722a;
                    } else if (c38475c.getShouldGoBack()) {
                        obj2 = this.f13949x.screenArgs.getIsExpired() ? InterfaceC39670b.b.f170721a : InterfaceC39670b.a.f170720a;
                    } else {
                        obj2 = null;
                    }
                    if (obj2 != null) {
                        c41318a.f13957y = null;
                        c41318a.f13950E = null;
                        c41318a.f13951F = null;
                        c41318a.f13952G = null;
                        c41318a.f13953H = null;
                        c41318a.f13954I = 0;
                        c41318a.f13956x = 1;
                        if (interfaceC13062m.emit(obj2, c41318a) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj3);
                }
                return C23454a0.f92919a;
            }
        }

        public d(InterfaceC13058l interfaceC13058l, C3504b c3504b) {
            this.f13946w = interfaceC13058l;
            this.f13947x = c3504b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f13946w.collect(new a(interfaceC13062m, this.f13947x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3504b(C13377h screenArgs, C38473a interactor, C3506d reducer, InterfaceC2994c0 coroutineScope, InterfaceC34116n logger) {
        super(coroutineScope);
        AbstractC22676k.m65750j(screenArgs, "screenArgs");
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(logger, "logger");
        this.screenArgs = screenArgs;
        this.coroutineScope = coroutineScope;
        this.logger = logger;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM10337o = m10337o(new b(c13096w1M36592b, this), interactor);
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lM10337o, coroutineScope, c13021b2, 1);
        this.domainState = c13078q1M36586L;
        this.viewState = new c(c13078q1M36586L, reducer);
        this.navigationEvents = AbstractC13091v.m36586L(new d(c13078q1M36586L, this), coroutineScope, c13021b2, 0);
    }

    /* JADX INFO: renamed from: o */
    private final InterfaceC13058l m10337o(InterfaceC13058l interfaceC13058l, C38473a c38473a) {
        return c38473a.interact(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final AbstractC38474b m10338q(AbstractC3503a abstractC3503a) {
        if (abstractC3503a instanceof AbstractC3503a.e) {
            return AbstractC38474b.e.f164822a;
        }
        if (abstractC3503a instanceof AbstractC3503a.g) {
            return new AbstractC38474b.h(((AbstractC3503a.g) abstractC3503a).getPassword());
        }
        if (abstractC3503a instanceof AbstractC3503a.h) {
            String resetToken = this.screenArgs.getResetToken();
            if (resetToken == null) {
                resetToken = "";
            }
            C38475c c38475c = (C38475c) AbstractC25265s.m74114R0(this.domainState.getReplayCache());
            String currentPassword = c38475c != null ? c38475c.getCurrentPassword() : null;
            return new AbstractC38474b.g(resetToken, currentPassword != null ? currentPassword : "");
        }
        if (abstractC3503a instanceof AbstractC3503a.c) {
            return AbstractC38474b.c.f164820a;
        }
        if (abstractC3503a instanceof AbstractC3503a.f) {
            String resetToken2 = this.screenArgs.getResetToken();
            return new AbstractC38474b.f(resetToken2 != null ? resetToken2 : "", this.screenArgs.getAndroidx.core.app.NotificationCompat.CATEGORY_EMAIL java.lang.String());
        }
        if (abstractC3503a instanceof AbstractC3503a.a) {
            return new AbstractC38474b.a(this.screenArgs.getIsExpired());
        }
        if (abstractC3503a instanceof AbstractC3503a.b) {
            return AbstractC38474b.b.f164819a;
        }
        if (abstractC3503a instanceof AbstractC3503a.d) {
            return AbstractC38474b.d.f164821a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final InterfaceC13058l getNavigationEvents() {
        return this.navigationEvents;
    }

    /* JADX INFO: renamed from: p */
    public final void m10340p(AbstractC3503a viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(viewEvent, null), 3);
    }

    public /* synthetic */ C3504b(C13377h c13377h, C38473a c38473a, C3506d c3506d, InterfaceC2994c0 interfaceC2994c0, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c13377h, c38473a, c3506d, (i13 & 8) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0, (i13 & 16) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ResetPasswordViewModel") : interfaceC34116n);
    }
}
