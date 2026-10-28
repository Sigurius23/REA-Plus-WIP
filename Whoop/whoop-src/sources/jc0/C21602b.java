package jc0;

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
import gc0.AbstractC15704a;
import gc0.AbstractC15706c;
import gc0.C15705b;
import gc0.C15707d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kc0.C22349a;
import l83.C23454a0;
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

/* JADX INFO: renamed from: jc0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020#0\n8\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010&R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020(0\n8\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b*\u0010&R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020,0\n8\u0006¢\u0006\f\n\u0004\b-\u0010!\u001a\u0004\b.\u0010&¨\u00060"}, m65681d2 = {"Ljc0/b;", "Landroidx/lifecycle/w1;", "Lgc0/d;", "interactor", "Lkc0/a;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lgc0/d;Lkc0/a;Lbc3/c0;)V", "Lec3/l;", "Lgc0/a;", "Lgc0/c;", "interact", "(Lec3/l;)Lec3/l;", "Ljc0/a$h;", "q", "(Ljc0/a$h;)Lgc0/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "p", "(Ljc0/a$h;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lgc0/d;", "x", "Lkc0/a;", "y", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "E", "Lec3/l;", "domainState", "Ljc0/d;", "F", "getViewState", "()Lec3/l;", "viewState", "Ljc0/a$e;", "G", "n", "navigationEvents", "", "H", "o", "saveSuccessAnalyticsLabel", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21602b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l navigationEvents;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC13058l saveSuccessAnalyticsLabel;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C15707d interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C22349a reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: jc0.b$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.feature.hormonalcontext.presentation.HormonalContextViewModel$sendViewEvent$1", m100430f = "HormonalContextViewModel.kt", m100431l = {57}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f82842w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC21601a.h f82844y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC21601a.h hVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f82844y = hVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C21602b.this.new a(this.f82844y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f82842w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C21602b.this.eventFlow;
                InterfaceC21601a.h hVar = this.f82844y;
                this.f82842w = 1;
                if (interfaceC13072o1.emit(hVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: jc0.b$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f82845w;

        /* JADX INFO: renamed from: jc0.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f82846w;

            /* JADX INFO: renamed from: jc0.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.feature.hormonalcontext.presentation.HormonalContextViewModel$special$$inlined$filterIsInstance$1$2", m100430f = "HormonalContextViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41834a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f82848F;

                /* JADX INFO: renamed from: G */
                Object f82849G;

                /* JADX INFO: renamed from: H */
                int f82850H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f82851w;

                /* JADX INFO: renamed from: x */
                int f82852x;

                /* JADX INFO: renamed from: y */
                Object f82853y;

                /* JADX INFO: renamed from: z */
                Object f82854z;

                public C41834a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f82851w = obj;
                    this.f82852x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f82846w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41834a c41834a;
                if (interfaceC30057d instanceof C41834a) {
                    c41834a = (C41834a) interfaceC30057d;
                    int i13 = c41834a.f82852x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41834a.f82852x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41834a = new C41834a(interfaceC30057d);
                    }
                } else {
                    c41834a = new C41834a(interfaceC30057d);
                }
                Object obj2 = c41834a.f82851w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41834a.f82852x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f82846w;
                    if (obj instanceof AbstractC15706c.d) {
                        c41834a.f82853y = null;
                        c41834a.f82854z = null;
                        c41834a.f82848F = null;
                        c41834a.f82849G = null;
                        c41834a.f82850H = 0;
                        c41834a.f82852x = 1;
                        if (interfaceC13062m.emit(obj, c41834a) == enumC31071a) {
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
            this.f82845w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f82845w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: jc0.b$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f82855w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C21602b f82856x;

        /* JADX INFO: renamed from: jc0.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f82857w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C21602b f82858x;

            /* JADX INFO: renamed from: jc0.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.feature.hormonalcontext.presentation.HormonalContextViewModel$special$$inlined$map$1$2", m100430f = "HormonalContextViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41835a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f82859E;

                /* JADX INFO: renamed from: F */
                Object f82860F;

                /* JADX INFO: renamed from: G */
                Object f82861G;

                /* JADX INFO: renamed from: H */
                int f82862H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f82863w;

                /* JADX INFO: renamed from: x */
                int f82864x;

                /* JADX INFO: renamed from: y */
                Object f82865y;

                public C41835a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f82863w = obj;
                    this.f82864x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C21602b c21602b) {
                this.f82857w = interfaceC13062m;
                this.f82858x = c21602b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41835a c41835a;
                if (interfaceC30057d instanceof C41835a) {
                    c41835a = (C41835a) interfaceC30057d;
                    int i13 = c41835a.f82864x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41835a.f82864x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41835a = new C41835a(interfaceC30057d);
                    }
                } else {
                    c41835a = new C41835a(interfaceC30057d);
                }
                Object obj2 = c41835a.f82863w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41835a.f82864x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f82857w;
                    AbstractC15704a abstractC15704aM60730q = this.f82858x.m60730q((InterfaceC21601a.h) obj);
                    c41835a.f82865y = null;
                    c41835a.f82859E = null;
                    c41835a.f82860F = null;
                    c41835a.f82861G = null;
                    c41835a.f82862H = 0;
                    c41835a.f82864x = 1;
                    if (interfaceC13062m.emit(abstractC15704aM60730q, c41835a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C21602b c21602b) {
            this.f82855w = interfaceC13058l;
            this.f82856x = c21602b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f82855w.collect(new a(interfaceC13062m, this.f82856x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: jc0.b$d */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f82867w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C21602b f82868x;

        /* JADX INFO: renamed from: jc0.b$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f82869w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C21602b f82870x;

            /* JADX INFO: renamed from: jc0.b$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.feature.hormonalcontext.presentation.HormonalContextViewModel$special$$inlined$map$2$2", m100430f = "HormonalContextViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41836a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f82871E;

                /* JADX INFO: renamed from: F */
                Object f82872F;

                /* JADX INFO: renamed from: G */
                Object f82873G;

                /* JADX INFO: renamed from: H */
                int f82874H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f82875w;

                /* JADX INFO: renamed from: x */
                int f82876x;

                /* JADX INFO: renamed from: y */
                Object f82877y;

                public C41836a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f82875w = obj;
                    this.f82876x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C21602b c21602b) {
                this.f82869w = interfaceC13062m;
                this.f82870x = c21602b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41836a c41836a;
                if (interfaceC30057d instanceof C41836a) {
                    c41836a = (C41836a) interfaceC30057d;
                    int i13 = c41836a.f82876x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41836a.f82876x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41836a = new C41836a(interfaceC30057d);
                    }
                } else {
                    c41836a = new C41836a(interfaceC30057d);
                }
                Object obj2 = c41836a.f82875w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41836a.f82876x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f82869w;
                    C21604d c21604dM64231e = this.f82870x.reducer.m64231e((AbstractC15706c) obj);
                    c41836a.f82877y = null;
                    c41836a.f82871E = null;
                    c41836a.f82872F = null;
                    c41836a.f82873G = null;
                    c41836a.f82874H = 0;
                    c41836a.f82876x = 1;
                    if (interfaceC13062m.emit(c21604dM64231e, c41836a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l, C21602b c21602b) {
            this.f82867w = interfaceC13058l;
            this.f82868x = c21602b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f82867w.collect(new a(interfaceC13062m, this.f82868x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: jc0.b$e */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f82879w;

        /* JADX INFO: renamed from: jc0.b$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f82880w;

            /* JADX INFO: renamed from: jc0.b$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.feature.hormonalcontext.presentation.HormonalContextViewModel$special$$inlined$map$3$2", m100430f = "HormonalContextViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41837a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f82881E;

                /* JADX INFO: renamed from: F */
                Object f82882F;

                /* JADX INFO: renamed from: G */
                Object f82883G;

                /* JADX INFO: renamed from: H */
                int f82884H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f82885w;

                /* JADX INFO: renamed from: x */
                int f82886x;

                /* JADX INFO: renamed from: y */
                Object f82887y;

                public C41837a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f82885w = obj;
                    this.f82886x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f82880w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41837a c41837a;
                if (interfaceC30057d instanceof C41837a) {
                    c41837a = (C41837a) interfaceC30057d;
                    int i13 = c41837a.f82886x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41837a.f82886x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41837a = new C41837a(interfaceC30057d);
                    }
                } else {
                    c41837a = new C41837a(interfaceC30057d);
                }
                Object obj2 = c41837a.f82885w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41837a.f82886x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f82880w;
                    String strM60735b = AbstractC21603c.m60735b(((AbstractC15706c.d) obj).getProgressResult().m44227b());
                    c41837a.f82887y = null;
                    c41837a.f82881E = null;
                    c41837a.f82882F = null;
                    c41837a.f82883G = null;
                    c41837a.f82884H = 0;
                    c41837a.f82886x = 1;
                    if (interfaceC13062m.emit(strM60735b, c41837a) == enumC31071a) {
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
            this.f82879w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f82879w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: jc0.b$f */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f82889w;

        /* JADX INFO: renamed from: jc0.b$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f82890w;

            /* JADX INFO: renamed from: jc0.b$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.feature.hormonalcontext.presentation.HormonalContextViewModel$special$$inlined$mapNotNull$1$2", m100430f = "HormonalContextViewModel.kt", m100431l = {57}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41838a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f82891E;

                /* JADX INFO: renamed from: F */
                Object f82892F;

                /* JADX INFO: renamed from: G */
                Object f82893G;

                /* JADX INFO: renamed from: H */
                Object f82894H;

                /* JADX INFO: renamed from: I */
                int f82895I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f82896w;

                /* JADX INFO: renamed from: x */
                int f82897x;

                /* JADX INFO: renamed from: y */
                Object f82898y;

                public C41838a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f82896w = obj;
                    this.f82897x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f82890w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41838a c41838a;
                if (interfaceC30057d instanceof C41838a) {
                    c41838a = (C41838a) interfaceC30057d;
                    int i13 = c41838a.f82897x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41838a.f82897x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41838a = new C41838a(interfaceC30057d);
                    }
                } else {
                    c41838a = new C41838a(interfaceC30057d);
                }
                Object obj2 = c41838a.f82896w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41838a.f82897x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f82890w;
                    AbstractC15706c abstractC15706c = (AbstractC15706c) obj;
                    InterfaceC21601a.c cVar = ((abstractC15706c instanceof AbstractC15706c.f) && ((AbstractC15706c.f) abstractC15706c).getShouldExit()) ? InterfaceC21601a.c.f82827a : null;
                    if (cVar != null) {
                        c41838a.f82898y = null;
                        c41838a.f82891E = null;
                        c41838a.f82892F = null;
                        c41838a.f82893G = null;
                        c41838a.f82894H = null;
                        c41838a.f82895I = 0;
                        c41838a.f82897x = 1;
                        if (interfaceC13062m.emit(cVar, c41838a) == enumC31071a) {
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
            this.f82889w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f82889w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21602b(C15707d interactor, C22349a reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lInteract = interact(new c(c13096w1M36592b, this));
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lInteract, coroutineScope, c13021b2, 1);
        this.domainState = c13078q1M36586L;
        this.viewState = AbstractC13091v.m36586L(new d(c13078q1M36586L, this), coroutineScope, c13021b2, 1);
        this.navigationEvents = AbstractC13091v.m36586L(new f(c13078q1M36586L), coroutineScope, c13021b2, 0);
        this.saveSuccessAnalyticsLabel = AbstractC13091v.m36586L(new e(new b(c13078q1M36586L)), coroutineScope, c13021b2, 0);
    }

    private final InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return this.interactor.interact(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final AbstractC15704a m60730q(InterfaceC21601a.h hVar) {
        if (hVar instanceof InterfaceC21601a.d) {
            return new AbstractC15704a.c(((InterfaceC21601a.d) hVar).getTestId());
        }
        if (AbstractC22676k.m65745e(hVar, InterfaceC21601a.g.f82833a)) {
            return AbstractC15704a.d.f59034a;
        }
        if (hVar instanceof InterfaceC21601a.f) {
            InterfaceC21601a.f fVar = (InterfaceC21601a.f) hVar;
            return new AbstractC15704a.b(fVar.getNextScreenId(), new C15705b(fVar.getTestId(), fVar.getSelectedValue(), null, null, null, fVar.getSource(), 28, null));
        }
        if (hVar instanceof InterfaceC21601a.b) {
            return AbstractC15704a.a.f59030a;
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

    /* JADX INFO: renamed from: o, reason: from getter */
    public final InterfaceC13058l getSaveSuccessAnalyticsLabel() {
        return this.saveSuccessAnalyticsLabel;
    }

    /* JADX INFO: renamed from: p */
    public final void m60733p(InterfaceC21601a.h event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C21602b(C15707d c15707d, C22349a c22349a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c15707d, c22349a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
