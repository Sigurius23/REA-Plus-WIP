package dv2;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ch.C4588i;
import cv2.C11155h;
import cv2.InterfaceC11151d;
import cv2.InterfaceC11154g;
import du2.AbstractC12378b;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import fi0.InterfaceC14515a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: dv2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020*0)8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001f\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000)8\u0006¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.¨\u00064"}, m65681d2 = {"Ldv2/d;", "Landroidx/lifecycle/w1;", "Lcv2/h;", "interactor", "Ldv2/f;", "viewStateReducer", "Ldv2/c;", "navigationReducer", "Lfi0/a;", "analytics", "Lbc3/c0;", "coroutineScope", "<init>", "(Lcv2/h;Ldv2/f;Ldv2/c;Lfi0/a;Lbc3/c0;)V", "Ldv2/b$p;", "Lcv2/d;", "p", "(Ldv2/b$p;)Lcv2/d;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "o", "(Ldv2/b$p;)V", "", "action", "category", "label", "n", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lfi0/a;", "x", "Lbc3/c0;", "Lec3/o1;", "y", "Lec3/o1;", "eventFlow", "Lec3/t1;", "Lcv2/g;", "z", "Lec3/t1;", "domainState", "Lec3/l;", "Ldv2/e;", "E", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "Ldv2/b$k;", "F", "l", "navigationEvents", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12393d extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l navigationEvents;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13087t1 domainState;

    /* JADX INFO: renamed from: dv2.d$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a extends C22672i implements Function3 {
        public a(Object obj) {
            super(3, 0, C11155h.class, obj, "interact", "interact(Lcom/whoop/weightlifting/feature/builder/select/domain/SelectExercisesDomainState;Lcom/whoop/weightlifting/feature/builder/select/domain/SelectExercisesDomainAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC11154g interfaceC11154g, InterfaceC11151d interfaceC11151d, InterfaceC30057d<? super InterfaceC11154g> interfaceC30057d) {
            return ((C11155h) this.receiver).m30192i(interfaceC11154g, interfaceC11151d, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: dv2.d$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.select.presentation.SelectExercisesViewModel$sendEvent$1", m100430f = "SelectExercisesViewModel.kt", m100431l = {60}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f41924w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC12391b.p f41926y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC12391b.p pVar, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f41926y = pVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C12393d.this.new b(this.f41926y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f41924w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C12393d.this.eventFlow;
                InterfaceC12391b.p pVar = this.f41926y;
                this.f41924w = 1;
                if (interfaceC13072o1.emit(pVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: dv2.d$c */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f41927w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12393d f41928x;

        /* JADX INFO: renamed from: dv2.d$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f41929w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C12393d f41930x;

            /* JADX INFO: renamed from: dv2.d$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.select.presentation.SelectExercisesViewModel$special$$inlined$map$1$2", m100430f = "SelectExercisesViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41495a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f41931E;

                /* JADX INFO: renamed from: F */
                Object f41932F;

                /* JADX INFO: renamed from: G */
                Object f41933G;

                /* JADX INFO: renamed from: H */
                int f41934H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f41935w;

                /* JADX INFO: renamed from: x */
                int f41936x;

                /* JADX INFO: renamed from: y */
                Object f41937y;

                public C41495a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f41935w = obj;
                    this.f41936x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C12393d c12393d) {
                this.f41929w = interfaceC13062m;
                this.f41930x = c12393d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41495a c41495a;
                if (interfaceC30057d instanceof C41495a) {
                    c41495a = (C41495a) interfaceC30057d;
                    int i13 = c41495a.f41936x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41495a.f41936x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41495a = new C41495a(interfaceC30057d);
                    }
                } else {
                    c41495a = new C41495a(interfaceC30057d);
                }
                Object obj2 = c41495a.f41935w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41495a.f41936x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f41929w;
                    InterfaceC11151d interfaceC11151dM34804p = this.f41930x.m34804p((InterfaceC12391b.p) obj);
                    c41495a.f41937y = null;
                    c41495a.f41931E = null;
                    c41495a.f41932F = null;
                    c41495a.f41933G = null;
                    c41495a.f41934H = 0;
                    c41495a.f41936x = 1;
                    if (interfaceC13062m.emit(interfaceC11151dM34804p, c41495a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C12393d c12393d) {
            this.f41927w = interfaceC13058l;
            this.f41928x = c12393d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f41927w.collect(new a(interfaceC13062m, this.f41928x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: dv2.d$d */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f41939w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12395f f41940x;

        /* JADX INFO: renamed from: dv2.d$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f41941w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C12395f f41942x;

            /* JADX INFO: renamed from: dv2.d$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.select.presentation.SelectExercisesViewModel$special$$inlined$map$2$2", m100430f = "SelectExercisesViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41496a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f41943E;

                /* JADX INFO: renamed from: F */
                Object f41944F;

                /* JADX INFO: renamed from: G */
                Object f41945G;

                /* JADX INFO: renamed from: H */
                int f41946H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f41947w;

                /* JADX INFO: renamed from: x */
                int f41948x;

                /* JADX INFO: renamed from: y */
                Object f41949y;

                public C41496a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f41947w = obj;
                    this.f41948x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C12395f c12395f) {
                this.f41941w = interfaceC13062m;
                this.f41942x = c12395f;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41496a c41496a;
                if (interfaceC30057d instanceof C41496a) {
                    c41496a = (C41496a) interfaceC30057d;
                    int i13 = c41496a.f41948x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41496a.f41948x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41496a = new C41496a(interfaceC30057d);
                    }
                } else {
                    c41496a = new C41496a(interfaceC30057d);
                }
                Object obj2 = c41496a.f41947w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41496a.f41948x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f41941w;
                    InterfaceC12394e interfaceC12394eM34831f = this.f41942x.m34831f((InterfaceC11154g) obj);
                    c41496a.f41949y = null;
                    c41496a.f41943E = null;
                    c41496a.f41944F = null;
                    c41496a.f41945G = null;
                    c41496a.f41946H = 0;
                    c41496a.f41948x = 1;
                    if (interfaceC13062m.emit(interfaceC12394eM34831f, c41496a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l, C12395f c12395f) {
            this.f41939w = interfaceC13058l;
            this.f41940x = c12395f;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f41939w.collect(new a(interfaceC13062m, this.f41940x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: dv2.d$e */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f41951w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12392c f41952x;

        /* JADX INFO: renamed from: dv2.d$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f41953w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C12392c f41954x;

            /* JADX INFO: renamed from: dv2.d$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.select.presentation.SelectExercisesViewModel$special$$inlined$map$3$2", m100430f = "SelectExercisesViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41497a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f41955E;

                /* JADX INFO: renamed from: F */
                Object f41956F;

                /* JADX INFO: renamed from: G */
                Object f41957G;

                /* JADX INFO: renamed from: H */
                int f41958H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f41959w;

                /* JADX INFO: renamed from: x */
                int f41960x;

                /* JADX INFO: renamed from: y */
                Object f41961y;

                public C41497a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f41959w = obj;
                    this.f41960x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C12392c c12392c) {
                this.f41953w = interfaceC13062m;
                this.f41954x = c12392c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41497a c41497a;
                if (interfaceC30057d instanceof C41497a) {
                    c41497a = (C41497a) interfaceC30057d;
                    int i13 = c41497a.f41960x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41497a.f41960x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41497a = new C41497a(interfaceC30057d);
                    }
                } else {
                    c41497a = new C41497a(interfaceC30057d);
                }
                Object obj2 = c41497a.f41959w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41497a.f41960x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f41953w;
                    InterfaceC12391b.k kVarM34801a = this.f41954x.m34801a((InterfaceC11154g) obj);
                    c41497a.f41961y = null;
                    c41497a.f41955E = null;
                    c41497a.f41956F = null;
                    c41497a.f41957G = null;
                    c41497a.f41958H = 0;
                    c41497a.f41960x = 1;
                    if (interfaceC13062m.emit(kVarM34801a, c41497a) == enumC31071a) {
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

        public e(InterfaceC13058l interfaceC13058l, C12392c c12392c) {
            this.f41951w = interfaceC13058l;
            this.f41952x = c12392c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f41951w.collect(new a(interfaceC13062m, this.f41952x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12393d(C11155h interactor, C12395f viewStateReducer, C12392c navigationReducer, InterfaceC14515a analytics, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(viewStateReducer, "viewStateReducer");
        AbstractC22676k.m65750j(navigationReducer, "navigationReducer");
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.analytics = analytics;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(new C13060l1(InterfaceC11154g.b.f35703a, new C4588i(new c(c13096w1M36592b, this), 2), new a(interactor)), coroutineScope, C13105z1.f45288a, 1);
        this.domainState = c13078q1M36586L;
        this.viewState = new d(c13078q1M36586L, viewStateReducer);
        this.navigationEvents = new e(c13078q1M36586L, navigationReducer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final InterfaceC11151d m34804p(InterfaceC12391b.p pVar) {
        if (pVar instanceof InterfaceC12391b.i) {
            return new InterfaceC11151d.e(((InterfaceC12391b.i) pVar).getIsLinkingWorkout());
        }
        if (pVar instanceof InterfaceC12391b.e) {
            return new InterfaceC11151d.f(((InterfaceC12391b.e) pVar).getExerciseId());
        }
        if (pVar instanceof InterfaceC12391b.n) {
            return new InterfaceC11151d.g(((InterfaceC12391b.n) pVar).getQuery());
        }
        if (pVar instanceof InterfaceC12391b.a) {
            return InterfaceC11151d.a.f35685a;
        }
        if (pVar instanceof InterfaceC12391b.o) {
            return InterfaceC11151d.b.f35686a;
        }
        if (pVar instanceof InterfaceC12391b.g) {
            return new InterfaceC11151d.d(((InterfaceC12391b.g) pVar).m34794a());
        }
        if (pVar instanceof InterfaceC12391b.c) {
            return new InterfaceC11151d.c(((InterfaceC12391b.c) pVar).getDeselectedFilter());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final InterfaceC13058l getNavigationEvents() {
        return this.navigationEvents;
    }

    /* JADX INFO: renamed from: n */
    public final void m34806n(String action, String category, String label) {
        AbstractC22676k.m65750j(action, "action");
        AbstractC22676k.m65750j(category, "category");
        AbstractC22676k.m65750j(label, "label");
        AbstractC12378b.m34744n(this.analytics, action, category, label, null, 8, null);
    }

    /* JADX INFO: renamed from: o */
    public final void m34807o(InterfaceC12391b.p event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new b(event, null), 3);
    }

    public /* synthetic */ C12393d(C11155h c11155h, C12395f c12395f, C12392c c12392c, InterfaceC14515a interfaceC14515a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c11155h, c12395f, c12392c, interfaceC14515a, (i13 & 16) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
