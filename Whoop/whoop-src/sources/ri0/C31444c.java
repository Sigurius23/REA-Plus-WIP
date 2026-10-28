package ri0;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.archv2.feature.domain.AbstractC5995c;
import com.whoop.archv2.feature.domain.C5998f;
import com.whoop.archv2.feature.domain.C5999g;
import com.whoop.data.repositories.FeatureFlagChecker;
import dp0.InterfaceC12251g;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13054k;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ep0.C13398d;
import ep0.C13404j;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import l83.C23465k;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import re1.C31314a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import si0.C32541g;

/* JADX INFO: renamed from: ri0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e*\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u000f*\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00130&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020-0\u000e8\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010\u001bR\u001d\u00104\u001a\b\u0012\u0004\u0012\u0002010\u000e8\u0006¢\u0006\f\n\u0004\b2\u0010+\u001a\u0004\b3\u0010\u001b¨\u00065"}, m65681d2 = {"Lri0/c;", "Landroidx/lifecycle/w1;", "Lcom/whoop/archv2/feature/domain/g;", "interactor", "Lsi0/g;", "reducer", "Ldp0/g;", "globalCoachManager", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lbc3/c0;", "coroutineScope", "<init>", "(Lcom/whoop/archv2/feature/domain/g;Lsi0/g;Ldp0/g;Lcom/whoop/data/repositories/FeatureFlagChecker;Lbc3/c0;)V", "Lec3/l;", "Lcom/whoop/archv2/feature/domain/c;", "Lcom/whoop/archv2/feature/domain/f;", "interact", "(Lec3/l;)Lec3/l;", "Lri0/b$w;", "t", "(Lri0/b$w;)Lcom/whoop/archv2/feature/domain/c;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "r", "(Lri0/b$w;)V", "o", "()Lec3/l;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lcom/whoop/archv2/feature/domain/g;", "x", "Lsi0/g;", "y", "Ldp0/g;", "z", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "E", "Lbc3/c0;", "Lec3/o1;", "F", "Lec3/o1;", "eventFlow", "G", "Lec3/l;", "domainState", "Lri0/e;", "H", "getViewState", "viewState", "Lri0/b$n;", "I", "q", "navigationEvents", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31444c extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC13058l navigationEvents;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C5999g interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C32541g reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC12251g globalCoachManager;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: ri0.c$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f129387w;

        /* JADX INFO: renamed from: ri0.c$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42264a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f129388w;

            /* JADX INFO: renamed from: ri0.c$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.presentation.GenericViewModel$coachDismissRefreshEvents$$inlined$filter$1$2", m100430f = "GenericViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42265a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f129390F;

                /* JADX INFO: renamed from: G */
                Object f129391G;

                /* JADX INFO: renamed from: H */
                int f129392H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f129393w;

                /* JADX INFO: renamed from: x */
                int f129394x;

                /* JADX INFO: renamed from: y */
                Object f129395y;

                /* JADX INFO: renamed from: z */
                Object f129396z;

                public C42265a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f129393w = obj;
                    this.f129394x |= Integer.MIN_VALUE;
                    return C42264a.this.emit(null, this);
                }
            }

            public C42264a(InterfaceC13062m interfaceC13062m) {
                this.f129388w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42265a c42265a;
                if (interfaceC30057d instanceof C42265a) {
                    c42265a = (C42265a) interfaceC30057d;
                    int i13 = c42265a.f129394x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42265a.f129394x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42265a = new C42265a(interfaceC30057d);
                    }
                } else {
                    c42265a = new C42265a(interfaceC30057d);
                }
                Object obj2 = c42265a.f129393w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42265a.f129394x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f129388w;
                    C23465k c23465k = (C23465k) obj;
                    boolean zBooleanValue = ((Boolean) c23465k.f92937w).booleanValue();
                    C13404j c13404j = (C13404j) c23465k.f92938x;
                    if (!zBooleanValue && AbstractC31445d.m96809a(c13404j)) {
                        c42265a.f129395y = null;
                        c42265a.f129396z = null;
                        c42265a.f129390F = null;
                        c42265a.f129391G = null;
                        c42265a.f129392H = 0;
                        c42265a.f129394x = 1;
                        if (interfaceC13062m.emit(obj, c42265a) == enumC31071a) {
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

        public a(InterfaceC13058l interfaceC13058l) {
            this.f129387w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f129387w.collect(new C42264a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ri0.c$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f129397w;

        /* JADX INFO: renamed from: ri0.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f129398w;

            /* JADX INFO: renamed from: ri0.c$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.presentation.GenericViewModel$coachDismissRefreshEvents$$inlined$map$1$2", m100430f = "GenericViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42266a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f129399E;

                /* JADX INFO: renamed from: F */
                Object f129400F;

                /* JADX INFO: renamed from: G */
                Object f129401G;

                /* JADX INFO: renamed from: H */
                int f129402H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f129403w;

                /* JADX INFO: renamed from: x */
                int f129404x;

                /* JADX INFO: renamed from: y */
                Object f129405y;

                public C42266a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f129403w = obj;
                    this.f129404x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f129398w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42266a c42266a;
                if (interfaceC30057d instanceof C42266a) {
                    c42266a = (C42266a) interfaceC30057d;
                    int i13 = c42266a.f129404x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42266a.f129404x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42266a = new C42266a(interfaceC30057d);
                    }
                } else {
                    c42266a = new C42266a(interfaceC30057d);
                }
                Object obj2 = c42266a.f129403w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42266a.f129404x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f129398w;
                    C13398d c13398d = (C13398d) obj;
                    C23465k c23465k = new C23465k(Boolean.valueOf(c13398d.getIsBottomSheetVisible()), c13398d.getCurrentScreenContext());
                    c42266a.f129405y = null;
                    c42266a.f129399E = null;
                    c42266a.f129400F = null;
                    c42266a.f129401G = null;
                    c42266a.f129402H = 0;
                    c42266a.f129404x = 1;
                    if (interfaceC13062m.emit(c23465k, c42266a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l) {
            this.f129397w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f129397w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ri0.c$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f129407w;

        /* JADX INFO: renamed from: ri0.c$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f129408w;

            /* JADX INFO: renamed from: ri0.c$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.presentation.GenericViewModel$coachDismissRefreshEvents$$inlined$map$2$2", m100430f = "GenericViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42267a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f129409E;

                /* JADX INFO: renamed from: F */
                Object f129410F;

                /* JADX INFO: renamed from: G */
                Object f129411G;

                /* JADX INFO: renamed from: H */
                int f129412H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f129413w;

                /* JADX INFO: renamed from: x */
                int f129414x;

                /* JADX INFO: renamed from: y */
                Object f129415y;

                public C42267a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f129413w = obj;
                    this.f129414x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f129408w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42267a c42267a;
                if (interfaceC30057d instanceof C42267a) {
                    c42267a = (C42267a) interfaceC30057d;
                    int i13 = c42267a.f129414x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42267a.f129414x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42267a = new C42267a(interfaceC30057d);
                    }
                } else {
                    c42267a = new C42267a(interfaceC30057d);
                }
                Object obj2 = c42267a.f129413w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42267a.f129414x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f129408w;
                    InterfaceC31443b.u uVar = new InterfaceC31443b.u(false, null, null, 7, null);
                    c42267a.f129415y = null;
                    c42267a.f129409E = null;
                    c42267a.f129410F = null;
                    c42267a.f129411G = null;
                    c42267a.f129412H = 0;
                    c42267a.f129414x = 1;
                    if (interfaceC13062m.emit(uVar, c42267a) == enumC31071a) {
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
            this.f129407w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f129407w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ri0.c$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.presentation.GenericViewModel$sendViewEvent$1", m100430f = "GenericViewModel.kt", m100431l = {54}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f129417w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC31443b.w f129419y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC31443b.w wVar, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f129419y = wVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31444c.this.new d(this.f129419y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f129417w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C31444c.this.eventFlow;
                InterfaceC31443b.w wVar = this.f129419y;
                this.f129417w = 1;
                if (interfaceC13072o1.emit(wVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ri0.c$e */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f129420w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C31444c f129421x;

        /* JADX INFO: renamed from: ri0.c$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f129422w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C31444c f129423x;

            /* JADX INFO: renamed from: ri0.c$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.presentation.GenericViewModel$special$$inlined$map$1$2", m100430f = "GenericViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42268a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f129424E;

                /* JADX INFO: renamed from: F */
                Object f129425F;

                /* JADX INFO: renamed from: G */
                Object f129426G;

                /* JADX INFO: renamed from: H */
                int f129427H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f129428w;

                /* JADX INFO: renamed from: x */
                int f129429x;

                /* JADX INFO: renamed from: y */
                Object f129430y;

                public C42268a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f129428w = obj;
                    this.f129429x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C31444c c31444c) {
                this.f129422w = interfaceC13062m;
                this.f129423x = c31444c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42268a c42268a;
                if (interfaceC30057d instanceof C42268a) {
                    c42268a = (C42268a) interfaceC30057d;
                    int i13 = c42268a.f129429x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42268a.f129429x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42268a = new C42268a(interfaceC30057d);
                    }
                } else {
                    c42268a = new C42268a(interfaceC30057d);
                }
                Object obj2 = c42268a.f129428w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42268a.f129429x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f129422w;
                    AbstractC5995c abstractC5995cM96805t = this.f129423x.m96805t((InterfaceC31443b.w) obj);
                    c42268a.f129430y = null;
                    c42268a.f129424E = null;
                    c42268a.f129425F = null;
                    c42268a.f129426G = null;
                    c42268a.f129427H = 0;
                    c42268a.f129429x = 1;
                    if (interfaceC13062m.emit(abstractC5995cM96805t, c42268a) == enumC31071a) {
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

        public e(InterfaceC13058l interfaceC13058l, C31444c c31444c) {
            this.f129420w = interfaceC13058l;
            this.f129421x = c31444c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f129420w.collect(new a(interfaceC13062m, this.f129421x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ri0.c$f */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f129432w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C31444c f129433x;

        /* JADX INFO: renamed from: ri0.c$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f129434w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C31444c f129435x;

            /* JADX INFO: renamed from: ri0.c$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.presentation.GenericViewModel$special$$inlined$map$2$2", m100430f = "GenericViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42269a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f129436E;

                /* JADX INFO: renamed from: F */
                Object f129437F;

                /* JADX INFO: renamed from: G */
                Object f129438G;

                /* JADX INFO: renamed from: H */
                int f129439H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f129440w;

                /* JADX INFO: renamed from: x */
                int f129441x;

                /* JADX INFO: renamed from: y */
                Object f129442y;

                public C42269a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f129440w = obj;
                    this.f129441x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C31444c c31444c) {
                this.f129434w = interfaceC13062m;
                this.f129435x = c31444c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42269a c42269a;
                if (interfaceC30057d instanceof C42269a) {
                    c42269a = (C42269a) interfaceC30057d;
                    int i13 = c42269a.f129441x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42269a.f129441x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42269a = new C42269a(interfaceC30057d);
                    }
                } else {
                    c42269a = new C42269a(interfaceC30057d);
                }
                Object obj2 = c42269a.f129440w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42269a.f129441x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f129434w;
                    C31446e c31446eM101568a = this.f129435x.reducer.m101568a((C5998f) obj);
                    c42269a.f129442y = null;
                    c42269a.f129436E = null;
                    c42269a.f129437F = null;
                    c42269a.f129438G = null;
                    c42269a.f129439H = 0;
                    c42269a.f129441x = 1;
                    if (interfaceC13062m.emit(c31446eM101568a, c42269a) == enumC31071a) {
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

        public f(InterfaceC13058l interfaceC13058l, C31444c c31444c) {
            this.f129432w = interfaceC13058l;
            this.f129433x = c31444c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f129432w.collect(new a(interfaceC13062m, this.f129433x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ri0.c$g */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f129444w;

        /* JADX INFO: renamed from: ri0.c$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f129445w;

            /* JADX INFO: renamed from: ri0.c$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.presentation.GenericViewModel$special$$inlined$mapNotNull$1$2", m100430f = "GenericViewModel.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42270a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f129446E;

                /* JADX INFO: renamed from: F */
                Object f129447F;

                /* JADX INFO: renamed from: G */
                Object f129448G;

                /* JADX INFO: renamed from: H */
                Object f129449H;

                /* JADX INFO: renamed from: I */
                int f129450I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f129451w;

                /* JADX INFO: renamed from: x */
                int f129452x;

                /* JADX INFO: renamed from: y */
                Object f129453y;

                public C42270a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f129451w = obj;
                    this.f129452x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f129445w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42270a c42270a;
                if (interfaceC30057d instanceof C42270a) {
                    c42270a = (C42270a) interfaceC30057d;
                    int i13 = c42270a.f129452x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42270a.f129452x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42270a = new C42270a(interfaceC30057d);
                    }
                } else {
                    c42270a = new C42270a(interfaceC30057d);
                }
                Object obj2 = c42270a.f129451w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42270a.f129452x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f129445w;
                    InterfaceC31443b interfaceC31443bM17902f = ((C5998f) obj).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
                    InterfaceC31443b.n nVar = interfaceC31443bM17902f instanceof InterfaceC31443b.n ? (InterfaceC31443b.n) interfaceC31443bM17902f : null;
                    if (nVar != null) {
                        c42270a.f129453y = null;
                        c42270a.f129446E = null;
                        c42270a.f129447F = null;
                        c42270a.f129448G = null;
                        c42270a.f129449H = null;
                        c42270a.f129450I = 0;
                        c42270a.f129452x = 1;
                        if (interfaceC13062m.emit(nVar, c42270a) == enumC31071a) {
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
            this.f129444w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f129444w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31444c(C5999g interactor, C32541g reducer, InterfaceC12251g globalCoachManager, FeatureFlagChecker featureFlagChecker, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(globalCoachManager, "globalCoachManager");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.globalCoachManager = globalCoachManager;
        this.featureFlagChecker = featureFlagChecker;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lInteract = interact(new e(c13096w1M36592b, this));
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lInteract, coroutineScope, c13021b2, 1);
        this.domainState = c13078q1M36586L;
        this.viewState = AbstractC13091v.m36586L(new f(c13078q1M36586L, this), coroutineScope, c13021b2, 1);
        this.navigationEvents = AbstractC13091v.m36586L(new g(c13078q1M36586L), coroutineScope, c13021b2, 0);
    }

    private final InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return this.interactor.interact(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final boolean m96804p(C23465k old, C23465k c23465k) {
        AbstractC22676k.m65750j(old, "old");
        AbstractC22676k.m65750j(c23465k, "new");
        return ((Boolean) old.f92937w).booleanValue() == ((Boolean) c23465k.f92937w).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final AbstractC5995c m96805t(InterfaceC31443b.w wVar) {
        if (wVar instanceof InterfaceC31443b.i) {
            InterfaceC31443b.i iVar = (InterfaceC31443b.i) wVar;
            return new AbstractC5995c.d(iVar.getApiRequest(), iVar.getCallerOnStartInteraction(), iVar.getGenericTopItems());
        }
        if (wVar instanceof InterfaceC31443b.u) {
            InterfaceC31443b.u uVar = (InterfaceC31443b.u) wVar;
            return new AbstractC5995c.n(uVar.getManualRefresh(), uVar.getRefreshScope(), uVar.getReloadAction());
        }
        if (wVar instanceof InterfaceC31443b.p) {
            return new AbstractC5995c.j(((InterfaceC31443b.p) wVar).getAction());
        }
        if (wVar instanceof InterfaceC31443b.r) {
            return new AbstractC5995c.k(((InterfaceC31443b.r) wVar).getInteraction());
        }
        if (wVar instanceof InterfaceC31443b.s) {
            return new AbstractC5995c.l(((InterfaceC31443b.s) wVar).getModal());
        }
        if (wVar instanceof InterfaceC31443b.t) {
            return new AbstractC5995c.m(((InterfaceC31443b.t) wVar).getModal());
        }
        if (wVar instanceof InterfaceC31443b.f) {
            return AbstractC5995c.c.f23695a;
        }
        if (wVar instanceof InterfaceC31443b.e) {
            return AbstractC5995c.b.f23694a;
        }
        if (wVar instanceof InterfaceC31443b.d) {
            return AbstractC5995c.a.f23693a;
        }
        if (wVar instanceof InterfaceC31443b.m) {
            InterfaceC31443b.m mVar = (InterfaceC31443b.m) wVar;
            return new AbstractC5995c.g(mVar.getPick(), mVar.getUri());
        }
        if (wVar instanceof InterfaceC31443b.o) {
            return AbstractC5995c.h.f23706a;
        }
        if (wVar instanceof InterfaceC31443b.l) {
            return new AbstractC5995c.f(((InterfaceC31443b.l) wVar).getPick());
        }
        if (wVar instanceof InterfaceC31443b.k) {
            return new AbstractC5995c.e(((InterfaceC31443b.k) wVar).getRequest());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: o */
    public final InterfaceC13058l m96806o() {
        if (!this.featureFlagChecker.isFeatureEnabled("arch-v2-refresh-on-coach-dismiss")) {
            return C13054k.f45116w;
        }
        return new c(new a(AbstractC13091v.m36612v(AbstractC13091v.m36609s(new C31314a(1), new b(this.globalCoachManager.getState())), 1)));
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final InterfaceC13058l getNavigationEvents() {
        return this.navigationEvents;
    }

    /* JADX INFO: renamed from: r */
    public final void m96808r(InterfaceC31443b.w event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new d(event, null), 3);
    }

    public /* synthetic */ C31444c(C5999g c5999g, C32541g c32541g, InterfaceC12251g interfaceC12251g, FeatureFlagChecker featureFlagChecker, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c5999g, c32541g, interfaceC12251g, featureFlagChecker, (i13 & 16) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
