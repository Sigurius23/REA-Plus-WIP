package cj1;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import dj1.C12088a;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13021b2;
import ec3.C13045h2;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13075p1;
import ec3.InterfaceC13087t1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import od1.AbstractC27845h;
import or2.C28180m;
import os0.InterfaceC28306b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rg1.C31388d;
import ri1.C31452a;
import ri1.C31453b;
import ri1.C31456e;
import ri1.C31457f;
import ri1.C31459h;
import ri1.C31461j;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sl1.C32705d;
import yg2.C39530e;

/* JADX INFO: renamed from: cj1.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u001f¢\u0006\u0004\b \u0010!R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00108\u001a\b\u0012\u0004\u0012\u000205048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020:098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u000200098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010<R\u001d\u0010D\u001a\b\u0012\u0004\u0012\u00020@098\u0006¢\u0006\f\n\u0004\bA\u0010<\u001a\u0004\bB\u0010C¨\u0006E"}, m65681d2 = {"Lcj1/h;", "Landroidx/lifecycle/w1;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lri1/j;", "interactor", "Lsl1/d;", "strapDomainInteractor", "Ldj1/a;", "reducer", "Lcj1/f;", "combiner", "Lyg2/e;", "liveHrStateCombiner", "Lrg1/d;", "fwApiInteractor", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lbc3/c0;", "coroutineScope", "<init>", "(Lri1/j;Lsl1/d;Ldj1/a;Lcj1/f;Lyg2/e;Lrg1/d;Lcom/whoop/data/repositories/FeatureFlagChecker;Lbc3/c0;)V", "Lcj1/g$h;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "n", "(Lcj1/g$h;Lq83/d;)Ljava/lang/Object;", "Landroidx/lifecycle/g0;", "owner", "onStop", "(Landroidx/lifecycle/g0;)V", "onStart", "Lcj1/g$p;", "o", "(Lcj1/g$p;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lyg2/e;", "x", "Lrg1/d;", "y", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "z", "Lbc3/c0;", "Lec3/o1;", "Lcj1/g$i;", "E", "Lec3/o1;", "healthTabContentEventFlow", "Lec3/t1;", "Lri1/h;", "F", "Lec3/t1;", "healthTabContentDomainResult", "Lec3/p1;", "Lcj1/g$d;", "G", "Lec3/p1;", "connectivityTileEventFlow", "Lec3/l;", "Lsl1/b;", "H", "Lec3/l;", "connectivityTileDomainResult", "I", "domainFlow", "Lcj1/i;", "J", "getViewState", "()Lec3/l;", "viewState", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4752h extends AbstractC1637w1 implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13072o1 healthTabContentEventFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13087t1 healthTabContentDomainResult;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13075p1 connectivityTileEventFlow;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC13058l connectivityTileDomainResult;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC13058l domainFlow;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C39530e liveHrStateCombiner;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C31388d fwApiInteractor;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: cj1.h$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.health.presentation.HealthTabViewModel$connectivityTileDomainResult$2", m100430f = "HealthTabViewModel.kt", m100431l = {67}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Los0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f19510w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f19511x;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f19511x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f19511x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f19510w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC28306b.a aVar = InterfaceC28306b.a.f114123a;
                this.f19511x = null;
                this.f19510w = 1;
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

    /* JADX INFO: renamed from: cj1.h$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.health.presentation.HealthTabViewModel$sendViewEvent$1", m100430f = "HealthTabViewModel.kt", m100431l = {83, 84, 85}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f19512w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC4751g.p f19513x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C4752h f19514y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC4751g.p pVar, C4752h c4752h, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f19513x = pVar;
            this.f19514y = c4752h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f19513x, this.f19514y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x005e A[RETURN] */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f19512w;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC4751g.p pVar = this.f19513x;
                if (pVar instanceof InterfaceC4751g.h) {
                    this.f19512w = 1;
                    if (this.f19514y.m14958n((InterfaceC4751g.h) pVar, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else if (pVar instanceof InterfaceC4751g.d) {
                    InterfaceC13075p1 interfaceC13075p1 = this.f19514y.connectivityTileEventFlow;
                    InterfaceC4751g.p pVar2 = this.f19513x;
                    this.f19512w = 2;
                    ((C13045h2) interfaceC13075p1).emit(pVar2, this);
                    if (c23454a0 == enumC31071a) {
                        return enumC31071a;
                    }
                } else if (pVar instanceof InterfaceC4751g.i) {
                    InterfaceC13072o1 interfaceC13072o1 = this.f19514y.healthTabContentEventFlow;
                    InterfaceC4751g.p pVar3 = this.f19513x;
                    this.f19512w = 3;
                    if (interfaceC13072o1.emit(pVar3, this) == enumC31071a) {
                        return enumC31071a;
                    }
                }
            } else {
                if (i13 != 1 && i13 != 2 && i13 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: cj1.h$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f19515w;

        /* JADX INFO: renamed from: cj1.h$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f19516w;

            /* JADX INFO: renamed from: cj1.h$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.health.presentation.HealthTabViewModel$special$$inlined$map$1$2", m100430f = "HealthTabViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41352a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f19517E;

                /* JADX INFO: renamed from: F */
                Object f19518F;

                /* JADX INFO: renamed from: G */
                Object f19519G;

                /* JADX INFO: renamed from: H */
                int f19520H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f19521w;

                /* JADX INFO: renamed from: x */
                int f19522x;

                /* JADX INFO: renamed from: y */
                Object f19523y;

                public C41352a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f19521w = obj;
                    this.f19522x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f19516w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41352a c41352a;
                Object c31453b;
                if (interfaceC30057d instanceof C41352a) {
                    c41352a = (C41352a) interfaceC30057d;
                    int i13 = c41352a.f19522x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41352a.f19522x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41352a = new C41352a(interfaceC30057d);
                    }
                } else {
                    c41352a = new C41352a(interfaceC30057d);
                }
                Object obj2 = c41352a.f19521w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41352a.f19522x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f19516w;
                    InterfaceC4751g.i iVar = (InterfaceC4751g.i) obj;
                    if (iVar instanceof InterfaceC4751g.m) {
                        c31453b = new C31457f(((InterfaceC4751g.m) iVar).getManualRefresh(), null, 2, null);
                    } else if (iVar instanceof InterfaceC4751g.j) {
                        c31453b = C31456e.f129506a;
                    } else if (iVar instanceof InterfaceC4751g.e) {
                        c31453b = C31452a.f129503a;
                    } else {
                        if (!(iVar instanceof InterfaceC4751g.f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c31453b = new C31453b(((InterfaceC4751g.f) iVar).getId());
                    }
                    c41352a.f19523y = null;
                    c41352a.f19517E = null;
                    c41352a.f19518F = null;
                    c41352a.f19519G = null;
                    c41352a.f19520H = 0;
                    c41352a.f19522x = 1;
                    if (interfaceC13062m.emit(c31453b, c41352a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l) {
            this.f19515w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f19515w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: cj1.h$d */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f19525w;

        /* JADX INFO: renamed from: cj1.h$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f19526w;

            /* JADX INFO: renamed from: cj1.h$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.health.presentation.HealthTabViewModel$special$$inlined$map$2$2", m100430f = "HealthTabViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41353a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f19527E;

                /* JADX INFO: renamed from: F */
                Object f19528F;

                /* JADX INFO: renamed from: G */
                Object f19529G;

                /* JADX INFO: renamed from: H */
                int f19530H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f19531w;

                /* JADX INFO: renamed from: x */
                int f19532x;

                /* JADX INFO: renamed from: y */
                Object f19533y;

                public C41353a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f19531w = obj;
                    this.f19532x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f19526w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41353a c41353a;
                Object obj2;
                if (interfaceC30057d instanceof C41353a) {
                    c41353a = (C41353a) interfaceC30057d;
                    int i13 = c41353a.f19532x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41353a.f19532x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41353a = new C41353a(interfaceC30057d);
                    }
                } else {
                    c41353a = new C41353a(interfaceC30057d);
                }
                Object obj3 = c41353a.f19531w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41353a.f19532x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj3);
                    InterfaceC13062m interfaceC13062m = this.f19526w;
                    InterfaceC4751g.d dVar = (InterfaceC4751g.d) obj;
                    if (AbstractC22676k.m65745e(dVar, InterfaceC4751g.d.a.f19484a)) {
                        obj2 = InterfaceC28306b.a.f114123a;
                    } else {
                        if (!AbstractC22676k.m65745e(dVar, InterfaceC4751g.d.b.f19485a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        obj2 = InterfaceC28306b.b.f114124a;
                    }
                    c41353a.f19533y = null;
                    c41353a.f19527E = null;
                    c41353a.f19528F = null;
                    c41353a.f19529G = null;
                    c41353a.f19530H = 0;
                    c41353a.f19532x = 1;
                    if (interfaceC13062m.emit(obj2, c41353a) == enumC31071a) {
                        return enumC31071a;
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

        public d(InterfaceC13058l interfaceC13058l) {
            this.f19525w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f19525w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: cj1.h$e */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f19535w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12088a f19536x;

        /* JADX INFO: renamed from: cj1.h$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f19537w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C12088a f19538x;

            /* JADX INFO: renamed from: cj1.h$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.health.presentation.HealthTabViewModel$special$$inlined$map$3$2", m100430f = "HealthTabViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41354a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f19539E;

                /* JADX INFO: renamed from: F */
                Object f19540F;

                /* JADX INFO: renamed from: G */
                Object f19541G;

                /* JADX INFO: renamed from: H */
                int f19542H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f19543w;

                /* JADX INFO: renamed from: x */
                int f19544x;

                /* JADX INFO: renamed from: y */
                Object f19545y;

                public C41354a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f19543w = obj;
                    this.f19544x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C12088a c12088a) {
                this.f19537w = interfaceC13062m;
                this.f19538x = c12088a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41354a c41354a;
                if (interfaceC30057d instanceof C41354a) {
                    c41354a = (C41354a) interfaceC30057d;
                    int i13 = c41354a.f19544x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41354a.f19544x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41354a = new C41354a(interfaceC30057d);
                    }
                } else {
                    c41354a = new C41354a(interfaceC30057d);
                }
                Object obj2 = c41354a.f19543w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41354a.f19544x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f19537w;
                    C4753i c4753iM33354c = this.f19538x.m33354c((C31459h) obj);
                    c41354a.f19545y = null;
                    c41354a.f19539E = null;
                    c41354a.f19540F = null;
                    c41354a.f19541G = null;
                    c41354a.f19542H = 0;
                    c41354a.f19544x = 1;
                    if (interfaceC13062m.emit(c4753iM33354c, c41354a) == enumC31071a) {
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

        public e(InterfaceC13058l interfaceC13058l, C12088a c12088a) {
            this.f19535w = interfaceC13058l;
            this.f19536x = c12088a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f19535w.collect(new a(interfaceC13062m, this.f19536x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4752h(C31461j interactor, C32705d strapDomainInteractor, C12088a reducer, C4750f combiner, C39530e liveHrStateCombiner, C31388d fwApiInteractor, FeatureFlagChecker featureFlagChecker, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(strapDomainInteractor, "strapDomainInteractor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(combiner, "combiner");
        AbstractC22676k.m65750j(liveHrStateCombiner, "liveHrStateCombiner");
        AbstractC22676k.m65750j(fwApiInteractor, "fwApiInteractor");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.liveHrStateCombiner = liveHrStateCombiner;
        this.fwApiInteractor = fwApiInteractor;
        this.featureFlagChecker = featureFlagChecker;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.healthTabContentEventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM83945a = AbstractC27845h.m83945a(new c(c13096w1M36592b), interactor);
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lM83945a, coroutineScope, c13021b2, 1);
        this.healthTabContentDomainResult = c13078q1M36586L;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(InterfaceC4751g.d.b.f19485a);
        this.connectivityTileEventFlow = c13045h2M36593c;
        InterfaceC13058l interfaceC13058lM83945a2 = AbstractC27845h.m83945a(new C13015a0(new a(null), new d(c13045h2M36593c)), strapDomainInteractor);
        this.connectivityTileDomainResult = interfaceC13058lM83945a2;
        InterfaceC13058l interfaceC13058lM14941a = combiner.m14941a(interfaceC13058lM83945a2, c13078q1M36586L, liveHrStateCombiner.getLiveHrCombinedFlow());
        this.domainFlow = interfaceC13058lM14941a;
        this.viewState = AbstractC13091v.m36586L(new e(interfaceC13058lM14941a, reducer), coroutineScope, c13021b2, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final Object m14958n(InterfaceC4751g.h hVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        boolean zM65745e = AbstractC22676k.m65745e(hVar, InterfaceC4751g.h.a.f19489a);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (zM65745e) {
            Object objM96654b = this.fwApiInteractor.m96654b(interfaceC30057d);
            return objM96654b == EnumC31071a.f128113w ? objM96654b : c23454a0;
        }
        if (AbstractC22676k.m65745e(hVar, InterfaceC4751g.h.c.f19491a)) {
            Object objM96656d = this.fwApiInteractor.m96656d(interfaceC30057d);
            return objM96656d == EnumC31071a.f128113w ? objM96656d : c23454a0;
        }
        if (!AbstractC22676k.m65745e(hVar, InterfaceC4751g.h.b.f19490a)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objM96655c = this.fwApiInteractor.m96655c(interfaceC30057d);
        return objM96655c == EnumC31071a.f128113w ? objM96655c : c23454a0;
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: o */
    public final void m14959o(InterfaceC4751g.p event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new b(event, this, null), 3);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onCreate(InterfaceC1585g0 interfaceC1585g0) {
        super.onCreate(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onDestroy(InterfaceC1585g0 interfaceC1585g0) {
        super.onDestroy(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onPause(InterfaceC1585g0 interfaceC1585g0) {
        super.onPause(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onResume(InterfaceC1585g0 interfaceC1585g0) {
        super.onResume(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        if (this.featureFlagChecker.isFeatureEnabled("health-tab-no-hr")) {
            return;
        }
        C39530e.m126276t(this.liveHrStateCombiner, true, null, null, 6, null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        C39530e.m126276t(this.liveHrStateCombiner, false, null, null, 6, null);
    }

    public /* synthetic */ C4752h(C31461j c31461j, C32705d c32705d, C12088a c12088a, C4750f c4750f, C39530e c39530e, C31388d c31388d, FeatureFlagChecker featureFlagChecker, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c31461j, c32705d, c12088a, c4750f, c39530e, c31388d, featureFlagChecker, (i13 & 128) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
