package kd0;

import androidx.core.app.NotificationCompat;
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
import md0.C25449d;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qw2.AbstractC30694b;
import qw2.C30695c;
import qw2.InterfaceC30693a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sb0.AbstractC32341b;
import sb0.C32342c;
import sb0.C32343d;
import vw2.AbstractC36547b;
import vw2.InterfaceC36546a;

/* JADX INFO: renamed from: kd0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\f*\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\f*\b\u0012\u0004\u0012\u00020\u00110\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u0015\u0010\u0014\u001a\u0004\u0018\u00010\r*\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u0004\u0018\u00010\r*\u00020\u0016H\u0000¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00160)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00110)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00120/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001d\u00108\u001a\b\u0012\u0004\u0012\u0002030\f8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001d\u0010<\u001a\b\u0012\u0004\u0012\u0002090\f8\u0006¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b;\u00107¨\u0006="}, m65681d2 = {"Lkd0/b;", "Landroidx/lifecycle/w1;", "Lsb0/d;", "interactor", "Lmd0/d;", "reducer", "Lbc3/c0;", "coroutineScope", "Lqw2/c;", "actionInteractor", "<init>", "(Lsb0/d;Lmd0/d;Lbc3/c0;Lqw2/c;)V", "Lec3/l;", "Lsb0/b;", "Lsb0/c;", "interact", "(Lec3/l;)Lec3/l;", "Lqw2/a;", "Lqw2/b;", "p", "t", "(Lqw2/b;)Lsb0/b;", "Lkd0/a$f1;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "r", "(Lkd0/a$f1;)V", "Lvw2/a;", "actionViewEvent", "q", "(Lvw2/a;)V", "u", "(Lkd0/a$f1;)Lsb0/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lsb0/d;", "x", "Lmd0/d;", "y", "Lbc3/c0;", "z", "Lqw2/c;", "Lec3/o1;", "E", "Lec3/o1;", "eventFlow", "F", "actionFlow", "Lec3/t1;", "G", "Lec3/t1;", "actionStateFlow", "Lkd0/c;", "H", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "Lkd0/a$a0;", "I", "o", "navigationEvents", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22382b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13072o1 actionFlow;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13087t1 actionStateFlow;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC13058l navigationEvents;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C32343d interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C25449d reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C30695c actionInteractor;

    /* JADX INFO: renamed from: kd0.b$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.presentation.AdvancedLabsViewModel$sendAction$1", m100430f = "AdvancedLabsViewModel.kt", m100431l = {60}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C22382b f87470E;

        /* JADX INFO: renamed from: w */
        Object f87471w;

        /* JADX INFO: renamed from: x */
        int f87472x;

        /* JADX INFO: renamed from: y */
        int f87473y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC36546a f87474z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC36546a interfaceC36546a, C22382b c22382b, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f87474z = interfaceC36546a;
            this.f87470E = c22382b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f87474z, this.f87470E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f87473y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC30693a interfaceC30693aM117178a = AbstractC36547b.m117178a(this.f87474z);
                if (interfaceC30693aM117178a != null) {
                    InterfaceC13072o1 interfaceC13072o1 = this.f87470E.actionFlow;
                    this.f87471w = null;
                    this.f87472x = 0;
                    this.f87473y = 1;
                    if (interfaceC13072o1.emit(interfaceC30693aM117178a, this) == enumC31071a) {
                        return enumC31071a;
                    }
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

    /* JADX INFO: renamed from: kd0.b$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.presentation.AdvancedLabsViewModel$sendViewEvent$1", m100430f = "AdvancedLabsViewModel.kt", m100431l = {54}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f87475w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC22381a.f1 f87477y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC22381a.f1 f1Var, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f87477y = f1Var;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C22382b.this.new b(this.f87477y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f87475w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C22382b.this.eventFlow;
                InterfaceC22381a.f1 f1Var = this.f87477y;
                this.f87475w = 1;
                if (interfaceC13072o1.emit(f1Var, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: kd0.b$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f87478w;

        /* JADX INFO: renamed from: kd0.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f87479w;

            /* JADX INFO: renamed from: kd0.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.presentation.AdvancedLabsViewModel$special$$inlined$filterIsInstance$1$2", m100430f = "AdvancedLabsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41885a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f87481F;

                /* JADX INFO: renamed from: G */
                Object f87482G;

                /* JADX INFO: renamed from: H */
                int f87483H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f87484w;

                /* JADX INFO: renamed from: x */
                int f87485x;

                /* JADX INFO: renamed from: y */
                Object f87486y;

                /* JADX INFO: renamed from: z */
                Object f87487z;

                public C41885a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f87484w = obj;
                    this.f87485x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f87479w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41885a c41885a;
                if (interfaceC30057d instanceof C41885a) {
                    c41885a = (C41885a) interfaceC30057d;
                    int i13 = c41885a.f87485x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41885a.f87485x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41885a = new C41885a(interfaceC30057d);
                    }
                } else {
                    c41885a = new C41885a(interfaceC30057d);
                }
                Object obj2 = c41885a.f87484w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41885a.f87485x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f87479w;
                    if (obj instanceof AbstractC30694b.d) {
                        c41885a.f87486y = null;
                        c41885a.f87487z = null;
                        c41885a.f87481F = null;
                        c41885a.f87482G = null;
                        c41885a.f87483H = 0;
                        c41885a.f87485x = 1;
                        if (interfaceC13062m.emit(obj, c41885a) == enumC31071a) {
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
            this.f87478w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f87478w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: kd0.b$d */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f87488w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22382b f87489x;

        /* JADX INFO: renamed from: kd0.b$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f87490w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22382b f87491x;

            /* JADX INFO: renamed from: kd0.b$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.presentation.AdvancedLabsViewModel$special$$inlined$map$1$2", m100430f = "AdvancedLabsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41886a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f87492E;

                /* JADX INFO: renamed from: F */
                Object f87493F;

                /* JADX INFO: renamed from: G */
                Object f87494G;

                /* JADX INFO: renamed from: H */
                int f87495H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f87496w;

                /* JADX INFO: renamed from: x */
                int f87497x;

                /* JADX INFO: renamed from: y */
                Object f87498y;

                public C41886a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f87496w = obj;
                    this.f87497x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C22382b c22382b) {
                this.f87490w = interfaceC13062m;
                this.f87491x = c22382b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41886a c41886a;
                if (interfaceC30057d instanceof C41886a) {
                    c41886a = (C41886a) interfaceC30057d;
                    int i13 = c41886a.f87497x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41886a.f87497x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41886a = new C41886a(interfaceC30057d);
                    }
                } else {
                    c41886a = new C41886a(interfaceC30057d);
                }
                Object obj2 = c41886a.f87496w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41886a.f87497x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f87490w;
                    C22383c c22383cM74802c = this.f87491x.reducer.m74802c((C32342c) obj);
                    c41886a.f87498y = null;
                    c41886a.f87492E = null;
                    c41886a.f87493F = null;
                    c41886a.f87494G = null;
                    c41886a.f87495H = 0;
                    c41886a.f87497x = 1;
                    if (interfaceC13062m.emit(c22383cM74802c, c41886a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l, C22382b c22382b) {
            this.f87488w = interfaceC13058l;
            this.f87489x = c22382b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f87488w.collect(new a(interfaceC13062m, this.f87489x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: kd0.b$e */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f87500w;

        /* JADX INFO: renamed from: kd0.b$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f87501w;

            /* JADX INFO: renamed from: kd0.b$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.presentation.AdvancedLabsViewModel$special$$inlined$map$2$2", m100430f = "AdvancedLabsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41887a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f87502E;

                /* JADX INFO: renamed from: F */
                Object f87503F;

                /* JADX INFO: renamed from: G */
                Object f87504G;

                /* JADX INFO: renamed from: H */
                int f87505H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f87506w;

                /* JADX INFO: renamed from: x */
                int f87507x;

                /* JADX INFO: renamed from: y */
                Object f87508y;

                public C41887a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f87506w = obj;
                    this.f87507x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f87501w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41887a c41887a;
                if (interfaceC30057d instanceof C41887a) {
                    c41887a = (C41887a) interfaceC30057d;
                    int i13 = c41887a.f87507x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41887a.f87507x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41887a = new C41887a(interfaceC30057d);
                    }
                } else {
                    c41887a = new C41887a(interfaceC30057d);
                }
                Object obj2 = c41887a.f87506w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41887a.f87507x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f87501w;
                    InterfaceC22381a.j jVar = new InterfaceC22381a.j(((AbstractC30694b.d) obj).getDestination());
                    c41887a.f87508y = null;
                    c41887a.f87502E = null;
                    c41887a.f87503F = null;
                    c41887a.f87504G = null;
                    c41887a.f87505H = 0;
                    c41887a.f87507x = 1;
                    if (interfaceC13062m.emit(jVar, c41887a) == enumC31071a) {
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

        public e(InterfaceC13058l interfaceC13058l) {
            this.f87500w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f87500w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: kd0.b$f */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f87510w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22382b f87511x;

        /* JADX INFO: renamed from: kd0.b$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f87512w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22382b f87513x;

            /* JADX INFO: renamed from: kd0.b$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.presentation.AdvancedLabsViewModel$special$$inlined$mapNotNull$1$2", m100430f = "AdvancedLabsViewModel.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41888a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f87514E;

                /* JADX INFO: renamed from: F */
                Object f87515F;

                /* JADX INFO: renamed from: G */
                Object f87516G;

                /* JADX INFO: renamed from: H */
                Object f87517H;

                /* JADX INFO: renamed from: I */
                int f87518I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f87519w;

                /* JADX INFO: renamed from: x */
                int f87520x;

                /* JADX INFO: renamed from: y */
                Object f87521y;

                public C41888a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f87519w = obj;
                    this.f87520x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C22382b c22382b) {
                this.f87512w = interfaceC13062m;
                this.f87513x = c22382b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41888a c41888a;
                if (interfaceC30057d instanceof C41888a) {
                    c41888a = (C41888a) interfaceC30057d;
                    int i13 = c41888a.f87520x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41888a.f87520x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41888a = new C41888a(interfaceC30057d);
                    }
                } else {
                    c41888a = new C41888a(interfaceC30057d);
                }
                Object obj2 = c41888a.f87519w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41888a.f87520x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f87512w;
                    AbstractC32341b abstractC32341bM64358u = this.f87513x.m64358u((InterfaceC22381a.f1) obj);
                    if (abstractC32341bM64358u != null) {
                        c41888a.f87521y = null;
                        c41888a.f87514E = null;
                        c41888a.f87515F = null;
                        c41888a.f87516G = null;
                        c41888a.f87517H = null;
                        c41888a.f87518I = 0;
                        c41888a.f87520x = 1;
                        if (interfaceC13062m.emit(abstractC32341bM64358u, c41888a) == enumC31071a) {
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

        public f(InterfaceC13058l interfaceC13058l, C22382b c22382b) {
            this.f87510w = interfaceC13058l;
            this.f87511x = c22382b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f87510w.collect(new a(interfaceC13062m, this.f87511x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: kd0.b$g */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f87523w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22382b f87524x;

        /* JADX INFO: renamed from: kd0.b$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f87525w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22382b f87526x;

            /* JADX INFO: renamed from: kd0.b$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.presentation.AdvancedLabsViewModel$special$$inlined$mapNotNull$2$2", m100430f = "AdvancedLabsViewModel.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41889a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f87527E;

                /* JADX INFO: renamed from: F */
                Object f87528F;

                /* JADX INFO: renamed from: G */
                Object f87529G;

                /* JADX INFO: renamed from: H */
                Object f87530H;

                /* JADX INFO: renamed from: I */
                int f87531I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f87532w;

                /* JADX INFO: renamed from: x */
                int f87533x;

                /* JADX INFO: renamed from: y */
                Object f87534y;

                public C41889a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f87532w = obj;
                    this.f87533x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C22382b c22382b) {
                this.f87525w = interfaceC13062m;
                this.f87526x = c22382b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41889a c41889a;
                if (interfaceC30057d instanceof C41889a) {
                    c41889a = (C41889a) interfaceC30057d;
                    int i13 = c41889a.f87533x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41889a.f87533x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41889a = new C41889a(interfaceC30057d);
                    }
                } else {
                    c41889a = new C41889a(interfaceC30057d);
                }
                Object obj2 = c41889a.f87532w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41889a.f87533x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f87525w;
                    AbstractC32341b abstractC32341bM64354t = this.f87526x.m64354t((AbstractC30694b) obj);
                    if (abstractC32341bM64354t != null) {
                        c41889a.f87534y = null;
                        c41889a.f87527E = null;
                        c41889a.f87528F = null;
                        c41889a.f87529G = null;
                        c41889a.f87530H = null;
                        c41889a.f87531I = 0;
                        c41889a.f87533x = 1;
                        if (interfaceC13062m.emit(abstractC32341bM64354t, c41889a) == enumC31071a) {
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

        public g(InterfaceC13058l interfaceC13058l, C22382b c22382b) {
            this.f87523w = interfaceC13058l;
            this.f87524x = c22382b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f87523w.collect(new a(interfaceC13062m, this.f87524x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22382b(C32343d interactor, C25449d reducer, InterfaceC2994c0 coroutineScope, C30695c actionInteractor) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(actionInteractor, "actionInteractor");
        this.interactor = interactor;
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        this.actionInteractor = actionInteractor;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        C13096w1 c13096w1M36592b2 = AbstractC13091v.m36592b(0, 0, null, 7);
        this.actionFlow = c13096w1M36592b2;
        InterfaceC13058l interfaceC13058lM64353p = m64353p(c13096w1M36592b2);
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lM64353p, coroutineScope, c13021b2, 0);
        this.actionStateFlow = c13078q1M36586L;
        this.viewState = AbstractC13091v.m36586L(new d(interact(AbstractC13091v.m36584J(new f(c13096w1M36592b, this), new g(c13078q1M36586L, this))), this), coroutineScope, c13021b2, 1);
        this.navigationEvents = new e(new c(c13078q1M36586L));
    }

    private final InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return this.interactor.interact(interfaceC13058l);
    }

    /* JADX INFO: renamed from: p */
    private final InterfaceC13058l m64353p(InterfaceC13058l interfaceC13058l) {
        return this.actionInteractor.interact(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final AbstractC32341b m64354t(AbstractC30694b abstractC30694b) {
        if (abstractC30694b instanceof AbstractC30694b.f) {
            return AbstractC32341b.b.f133852a;
        }
        if (abstractC30694b instanceof AbstractC30694b.i) {
            return AbstractC32341b.c.f133853a;
        }
        if (abstractC30694b instanceof AbstractC30694b.a) {
            return new AbstractC32341b.d(((AbstractC30694b.a) abstractC30694b).getMessage());
        }
        return null;
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final InterfaceC13058l getNavigationEvents() {
        return this.navigationEvents;
    }

    /* JADX INFO: renamed from: q */
    public final void m64356q(InterfaceC36546a actionViewEvent) {
        AbstractC22676k.m65750j(actionViewEvent, "actionViewEvent");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(actionViewEvent, this, null), 3);
    }

    /* JADX INFO: renamed from: r */
    public final void m64357r(InterfaceC22381a.f1 event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new b(event, null), 3);
    }

    /* JADX INFO: renamed from: u */
    public final AbstractC32341b m64358u(InterfaceC22381a.f1 f1Var) {
        AbstractC22676k.m65750j(f1Var, "<this>");
        if (f1Var instanceof InterfaceC22381a.k0) {
            return AbstractC32341b.a.f133851a;
        }
        if (f1Var instanceof InterfaceC22381a.o0) {
            return new AbstractC32341b.e(((InterfaceC22381a.o0) f1Var).getSelectedSegmentId());
        }
        if ((f1Var instanceof InterfaceC22381a.p0) || (f1Var instanceof InterfaceC22381a.j0) || (f1Var instanceof InterfaceC22381a.r)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public /* synthetic */ C22382b(C32343d c32343d, C25449d c25449d, InterfaceC2994c0 interfaceC2994c0, C30695c c30695c, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c32343d, c25449d, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0, c30695c);
    }
}
