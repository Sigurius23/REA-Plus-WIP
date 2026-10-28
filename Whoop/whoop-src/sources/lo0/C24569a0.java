package lo0;

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
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io0.AbstractC20728o;
import io0.C20729p;
import io0.C20738y;
import l83.C23454a0;
import mo0.C25742e;
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

/* JADX INFO: renamed from: lo0.a0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020#0\n8\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010&R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020(0\n8\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b*\u0010&¨\u0006,"}, m65681d2 = {"Llo0/a0;", "Landroidx/lifecycle/w1;", "Lio0/p;", "interactor", "Lmo0/e;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lio0/p;Lmo0/e;Lbc3/c0;)V", "Lec3/l;", "Lio0/o;", "Lio0/y;", "interact", "(Lec3/l;)Lec3/l;", "Llo0/z$v;", "p", "(Llo0/z$v;)Lio0/o;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "o", "(Llo0/z$v;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lio0/p;", "x", "Lmo0/e;", "y", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "E", "Lec3/l;", "domainState", "Llo0/b0;", "F", "getViewState", "()Lec3/l;", "viewState", "Llo0/z$g;", "G", "n", "navigationEvents", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24569a0 extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l navigationEvents;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C20729p interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C25742e reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: lo0.a0$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.presentation.ClinicianVideoSchedulingIntakeViewModel$sendViewEvent$1", m100430f = "ClinicianVideoSchedulingIntakeViewModel.kt", m100431l = {42}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f95902w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC24615z.v f95904y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC24615z.v vVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f95904y = vVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C24569a0.this.new a(this.f95904y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f95902w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C24569a0.this.eventFlow;
                InterfaceC24615z.v vVar = this.f95904y;
                this.f95902w = 1;
                if (interfaceC13072o1.emit(vVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: lo0.a0$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f95905w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C24569a0 f95906x;

        /* JADX INFO: renamed from: lo0.a0$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f95907w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C24569a0 f95908x;

            /* JADX INFO: renamed from: lo0.a0$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.presentation.ClinicianVideoSchedulingIntakeViewModel$special$$inlined$map$1$2", m100430f = "ClinicianVideoSchedulingIntakeViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41957a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f95909E;

                /* JADX INFO: renamed from: F */
                Object f95910F;

                /* JADX INFO: renamed from: G */
                Object f95911G;

                /* JADX INFO: renamed from: H */
                int f95912H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f95913w;

                /* JADX INFO: renamed from: x */
                int f95914x;

                /* JADX INFO: renamed from: y */
                Object f95915y;

                public C41957a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f95913w = obj;
                    this.f95914x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C24569a0 c24569a0) {
                this.f95907w = interfaceC13062m;
                this.f95908x = c24569a0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41957a c41957a;
                if (interfaceC30057d instanceof C41957a) {
                    c41957a = (C41957a) interfaceC30057d;
                    int i13 = c41957a.f95914x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41957a.f95914x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41957a = new C41957a(interfaceC30057d);
                    }
                } else {
                    c41957a = new C41957a(interfaceC30057d);
                }
                Object obj2 = c41957a.f95913w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41957a.f95914x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f95907w;
                    AbstractC20728o abstractC20728oM71704p = this.f95908x.m71704p((InterfaceC24615z.v) obj);
                    c41957a.f95915y = null;
                    c41957a.f95909E = null;
                    c41957a.f95910F = null;
                    c41957a.f95911G = null;
                    c41957a.f95912H = 0;
                    c41957a.f95914x = 1;
                    if (interfaceC13062m.emit(abstractC20728oM71704p, c41957a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C24569a0 c24569a0) {
            this.f95905w = interfaceC13058l;
            this.f95906x = c24569a0;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f95905w.collect(new a(interfaceC13062m, this.f95906x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: lo0.a0$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f95917w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C24569a0 f95918x;

        /* JADX INFO: renamed from: lo0.a0$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f95919w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C24569a0 f95920x;

            /* JADX INFO: renamed from: lo0.a0$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.presentation.ClinicianVideoSchedulingIntakeViewModel$special$$inlined$map$2$2", m100430f = "ClinicianVideoSchedulingIntakeViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41958a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f95921E;

                /* JADX INFO: renamed from: F */
                Object f95922F;

                /* JADX INFO: renamed from: G */
                Object f95923G;

                /* JADX INFO: renamed from: H */
                int f95924H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f95925w;

                /* JADX INFO: renamed from: x */
                int f95926x;

                /* JADX INFO: renamed from: y */
                Object f95927y;

                public C41958a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f95925w = obj;
                    this.f95926x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C24569a0 c24569a0) {
                this.f95919w = interfaceC13062m;
                this.f95920x = c24569a0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41958a c41958a;
                if (interfaceC30057d instanceof C41958a) {
                    c41958a = (C41958a) interfaceC30057d;
                    int i13 = c41958a.f95926x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41958a.f95926x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41958a = new C41958a(interfaceC30057d);
                    }
                } else {
                    c41958a = new C41958a(interfaceC30057d);
                }
                Object obj2 = c41958a.f95925w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41958a.f95926x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f95919w;
                    C24571b0 c24571b0M75945c = this.f95920x.reducer.m75945c((C20738y) obj);
                    c41958a.f95927y = null;
                    c41958a.f95921E = null;
                    c41958a.f95922F = null;
                    c41958a.f95923G = null;
                    c41958a.f95924H = 0;
                    c41958a.f95926x = 1;
                    if (interfaceC13062m.emit(c24571b0M75945c, c41958a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C24569a0 c24569a0) {
            this.f95917w = interfaceC13058l;
            this.f95918x = c24569a0;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f95917w.collect(new a(interfaceC13062m, this.f95918x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: lo0.a0$d */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f95929w;

        /* JADX INFO: renamed from: lo0.a0$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f95930w;

            /* JADX INFO: renamed from: lo0.a0$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.presentation.ClinicianVideoSchedulingIntakeViewModel$special$$inlined$mapNotNull$1$2", m100430f = "ClinicianVideoSchedulingIntakeViewModel.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41959a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f95931E;

                /* JADX INFO: renamed from: F */
                Object f95932F;

                /* JADX INFO: renamed from: G */
                Object f95933G;

                /* JADX INFO: renamed from: H */
                Object f95934H;

                /* JADX INFO: renamed from: I */
                int f95935I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f95936w;

                /* JADX INFO: renamed from: x */
                int f95937x;

                /* JADX INFO: renamed from: y */
                Object f95938y;

                public C41959a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f95936w = obj;
                    this.f95937x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f95930w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41959a c41959a;
                if (interfaceC30057d instanceof C41959a) {
                    c41959a = (C41959a) interfaceC30057d;
                    int i13 = c41959a.f95937x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41959a.f95937x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41959a = new C41959a(interfaceC30057d);
                    }
                } else {
                    c41959a = new C41959a(interfaceC30057d);
                }
                Object obj2 = c41959a.f95936w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41959a.f95937x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f95930w;
                    InterfaceC24615z interfaceC24615z = ((C20738y) obj).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
                    InterfaceC24615z.g gVar = interfaceC24615z instanceof InterfaceC24615z.g ? (InterfaceC24615z.g) interfaceC24615z : null;
                    if (gVar != null) {
                        c41959a.f95938y = null;
                        c41959a.f95931E = null;
                        c41959a.f95932F = null;
                        c41959a.f95933G = null;
                        c41959a.f95934H = null;
                        c41959a.f95935I = 0;
                        c41959a.f95937x = 1;
                        if (interfaceC13062m.emit(gVar, c41959a) == enumC31071a) {
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
            this.f95929w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f95929w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24569a0(C20729p interactor, C25742e reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lInteract = interact(new b(c13096w1M36592b, this));
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lInteract, coroutineScope, c13021b2, 1);
        this.domainState = c13078q1M36586L;
        this.viewState = AbstractC13091v.m36586L(new c(c13078q1M36586L, this), coroutineScope, c13021b2, 1);
        this.navigationEvents = AbstractC13091v.m36586L(new d(c13078q1M36586L), coroutineScope, c13021b2, 0);
    }

    private final InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return this.interactor.interact(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final AbstractC20728o m71704p(InterfaceC24615z.v vVar) {
        if (vVar instanceof InterfaceC24615z.d) {
            InterfaceC24615z.d dVar = (InterfaceC24615z.d) vVar;
            return new AbstractC20728o.a(dVar.getAppointmentType(), dVar.getIntakeType(), dVar.getAppointmentId());
        }
        if (vVar instanceof InterfaceC24615z.n) {
            return AbstractC20728o.h.f77697a;
        }
        if (vVar instanceof InterfaceC24615z.o) {
            return AbstractC20728o.i.f77698a;
        }
        if (vVar instanceof InterfaceC24615z.m) {
            return AbstractC20728o.g.f77696a;
        }
        if (vVar instanceof InterfaceC24615z.k) {
            return new AbstractC20728o.e(((InterfaceC24615z.k) vVar).getStateId());
        }
        if (vVar instanceof InterfaceC24615z.l) {
            return new AbstractC20728o.f(((InterfaceC24615z.l) vVar).m71893a());
        }
        if (vVar instanceof InterfaceC24615z.r) {
            return new AbstractC20728o.l(((InterfaceC24615z.r) vVar).getText());
        }
        if (vVar instanceof InterfaceC24615z.s) {
            InterfaceC24615z.s sVar = (InterfaceC24615z.s) vVar;
            return new AbstractC20728o.m(sVar.getType(), sVar.getNewValue(), sVar.getValidate());
        }
        if (vVar instanceof InterfaceC24615z.u) {
            return new AbstractC20728o.o(((InterfaceC24615z.u) vVar).getType());
        }
        if (vVar instanceof InterfaceC24615z.t) {
            InterfaceC24615z.t tVar = (InterfaceC24615z.t) vVar;
            return new AbstractC20728o.n(tVar.getTextAreaId(), tVar.getText());
        }
        if (vVar instanceof InterfaceC24615z.q) {
            InterfaceC24615z.q qVar = (InterfaceC24615z.q) vVar;
            return new AbstractC20728o.k(qVar.getHeight(), qVar.getWeight(), qVar.getUnit());
        }
        if (vVar instanceof InterfaceC24615z.p) {
            return new AbstractC20728o.j(((InterfaceC24615z.p) vVar).getIsSelected());
        }
        if (vVar instanceof InterfaceC24615z.h) {
            InterfaceC24615z.h hVar = (InterfaceC24615z.h) vVar;
            return new AbstractC20728o.b(hVar.getIntakeResponses(), hVar.getUsState());
        }
        if (vVar instanceof InterfaceC24615z.j) {
            InterfaceC24615z.j jVar = (InterfaceC24615z.j) vVar;
            return new AbstractC20728o.d(jVar.getAppointmentType(), jVar.getResponses());
        }
        if (!(vVar instanceof InterfaceC24615z.i)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC24615z.i iVar = (InterfaceC24615z.i) vVar;
        return new AbstractC20728o.c(iVar.getAppointmentId(), iVar.m71889b());
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final InterfaceC13058l getNavigationEvents() {
        return this.navigationEvents;
    }

    /* JADX INFO: renamed from: o */
    public final void m71706o(InterfaceC24615z.v event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C24569a0(C20729p c20729p, C25742e c25742e, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c20729p, c25742e, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
