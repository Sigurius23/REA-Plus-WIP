package tp1;

import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import ec3.AbstractC13091v;
import ec3.C13042h;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import eo1.AbstractC13379a;
import eo1.C13380b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import od1.AbstractC27845h;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qp1.AbstractC30532a;
import qp1.AbstractC30535d;
import qp1.AbstractC30536e;
import qp1.C30533b;
import qp1.C30534c;
import qp1.C30537f;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import up1.C35151a;

/* JADX INFO: renamed from: tp1.n */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0012*\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b$\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00170-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00104\u001a\b\u0012\u0004\u0012\u0002010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00107\u001a\b\u0012\u0004\u0012\u0002050\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00103R\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00140\u00128\u0006¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b9\u0010:¨\u0006<"}, m65681d2 = {"Ltp1/n;", "Landroidx/lifecycle/w1;", "Lqp1/f;", "hormonalSettingsInteractor", "Leo1/b;", "fertilitySettingsInteractor", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lqp1/c;", "combiner", "Lup1/a;", "reducer", "Lbc3/c0;", "coroutineScope", "Ltr2/n;", "logger", "<init>", "(Lqp1/f;Leo1/b;Lcom/whoop/data/repositories/FeatureFlagChecker;Lqp1/c;Lup1/a;Lbc3/c0;Ltr2/n;)V", "Lec3/l;", "Lqp1/b;", "Ltp1/o;", "n", "(Lec3/l;Lup1/a;)Lec3/l;", "Ltp1/m;", "viewEvent", "Ll83/a0;", "o", "(Ltp1/m;)V", "", "l", "(Ltp1/m;)Z", "j", "Lqp1/d;", "q", "(Ltp1/m;)Lqp1/d;", "Leo1/a;", "p", "(Ltp1/m;)Leo1/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "x", "Ltr2/n;", "y", "Z", "useCombiner", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "Lqp1/e;", "E", "Lec3/l;", "hormonalDomainState", "Lqp1/a;", "F", "fertilityDomainState", "G", "getViewState", "()Lec3/l;", "viewState", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34074n extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l hormonalDomainState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l fertilityDomainState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final boolean useCombiner;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: tp1.n$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.presentation.HormonalSettingsViewModel$sendViewEvent$1", m100430f = "HormonalSettingsViewModel.kt", m100431l = {69}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f142827w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC34073m f142829y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC34073m abstractC34073m, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f142829y = abstractC34073m;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C34074n.this.new a(this.f142829y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f142827w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C34074n.this.eventFlow;
                AbstractC34073m abstractC34073m = this.f142829y;
                this.f142827w = 1;
                if (interfaceC13072o1.emit(abstractC34073m, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: tp1.n$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f142830w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C34074n f142831x;

        /* JADX INFO: renamed from: tp1.n$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f142832w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C34074n f142833x;

            /* JADX INFO: renamed from: tp1.n$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.presentation.HormonalSettingsViewModel$special$$inlined$filter$1$2", m100430f = "HormonalSettingsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42408a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f142835F;

                /* JADX INFO: renamed from: G */
                Object f142836G;

                /* JADX INFO: renamed from: H */
                int f142837H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f142838w;

                /* JADX INFO: renamed from: x */
                int f142839x;

                /* JADX INFO: renamed from: y */
                Object f142840y;

                /* JADX INFO: renamed from: z */
                Object f142841z;

                public C42408a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f142838w = obj;
                    this.f142839x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C34074n c34074n) {
                this.f142832w = interfaceC13062m;
                this.f142833x = c34074n;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42408a c42408a;
                if (interfaceC30057d instanceof C42408a) {
                    c42408a = (C42408a) interfaceC30057d;
                    int i13 = c42408a.f142839x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42408a.f142839x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42408a = new C42408a(interfaceC30057d);
                    }
                } else {
                    c42408a = new C42408a(interfaceC30057d);
                }
                Object obj2 = c42408a.f142838w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42408a.f142839x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f142832w;
                    if (this.f142833x.m107725l((AbstractC34073m) obj)) {
                        c42408a.f142840y = null;
                        c42408a.f142841z = null;
                        c42408a.f142835F = null;
                        c42408a.f142836G = null;
                        c42408a.f142837H = 0;
                        c42408a.f142839x = 1;
                        if (interfaceC13062m.emit(obj, c42408a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C34074n c34074n) {
            this.f142830w = interfaceC13058l;
            this.f142831x = c34074n;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f142830w.collect(new a(interfaceC13062m, this.f142831x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: tp1.n$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f142842w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C34074n f142843x;

        /* JADX INFO: renamed from: tp1.n$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f142844w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C34074n f142845x;

            /* JADX INFO: renamed from: tp1.n$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.presentation.HormonalSettingsViewModel$special$$inlined$filter$2$2", m100430f = "HormonalSettingsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42409a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f142847F;

                /* JADX INFO: renamed from: G */
                Object f142848G;

                /* JADX INFO: renamed from: H */
                int f142849H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f142850w;

                /* JADX INFO: renamed from: x */
                int f142851x;

                /* JADX INFO: renamed from: y */
                Object f142852y;

                /* JADX INFO: renamed from: z */
                Object f142853z;

                public C42409a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f142850w = obj;
                    this.f142851x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C34074n c34074n) {
                this.f142844w = interfaceC13062m;
                this.f142845x = c34074n;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42409a c42409a;
                if (interfaceC30057d instanceof C42409a) {
                    c42409a = (C42409a) interfaceC30057d;
                    int i13 = c42409a.f142851x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42409a.f142851x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42409a = new C42409a(interfaceC30057d);
                    }
                } else {
                    c42409a = new C42409a(interfaceC30057d);
                }
                Object obj2 = c42409a.f142850w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42409a.f142851x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f142844w;
                    if (this.f142845x.m107724j((AbstractC34073m) obj)) {
                        c42409a.f142852y = null;
                        c42409a.f142853z = null;
                        c42409a.f142847F = null;
                        c42409a.f142848G = null;
                        c42409a.f142849H = 0;
                        c42409a.f142851x = 1;
                        if (interfaceC13062m.emit(obj, c42409a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C34074n c34074n) {
            this.f142842w = interfaceC13058l;
            this.f142843x = c34074n;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f142842w.collect(new a(interfaceC13062m, this.f142843x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: tp1.n$d */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f142854w;

        /* JADX INFO: renamed from: tp1.n$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f142855w;

            /* JADX INFO: renamed from: tp1.n$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.presentation.HormonalSettingsViewModel$special$$inlined$filter$3$2", m100430f = "HormonalSettingsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42410a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f142857F;

                /* JADX INFO: renamed from: G */
                Object f142858G;

                /* JADX INFO: renamed from: H */
                int f142859H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f142860w;

                /* JADX INFO: renamed from: x */
                int f142861x;

                /* JADX INFO: renamed from: y */
                Object f142862y;

                /* JADX INFO: renamed from: z */
                Object f142863z;

                public C42410a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f142860w = obj;
                    this.f142861x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f142855w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42410a c42410a;
                if (interfaceC30057d instanceof C42410a) {
                    c42410a = (C42410a) interfaceC30057d;
                    int i13 = c42410a.f142861x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42410a.f142861x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42410a = new C42410a(interfaceC30057d);
                    }
                } else {
                    c42410a = new C42410a(interfaceC30057d);
                }
                Object obj2 = c42410a.f142860w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42410a.f142861x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f142855w;
                    if (((AbstractC34073m) obj) instanceof AbstractC34073m.b) {
                        c42410a.f142862y = null;
                        c42410a.f142863z = null;
                        c42410a.f142857F = null;
                        c42410a.f142858G = null;
                        c42410a.f142859H = 0;
                        c42410a.f142861x = 1;
                        if (interfaceC13062m.emit(obj, c42410a) == enumC31071a) {
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
            this.f142854w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f142854w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: tp1.n$e */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f142864w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C34074n f142865x;

        /* JADX INFO: renamed from: tp1.n$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f142866w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C34074n f142867x;

            /* JADX INFO: renamed from: tp1.n$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.presentation.HormonalSettingsViewModel$special$$inlined$map$1$2", m100430f = "HormonalSettingsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42411a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f142868E;

                /* JADX INFO: renamed from: F */
                Object f142869F;

                /* JADX INFO: renamed from: G */
                Object f142870G;

                /* JADX INFO: renamed from: H */
                int f142871H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f142872w;

                /* JADX INFO: renamed from: x */
                int f142873x;

                /* JADX INFO: renamed from: y */
                Object f142874y;

                public C42411a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f142872w = obj;
                    this.f142873x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C34074n c34074n) {
                this.f142866w = interfaceC13062m;
                this.f142867x = c34074n;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42411a c42411a;
                if (interfaceC30057d instanceof C42411a) {
                    c42411a = (C42411a) interfaceC30057d;
                    int i13 = c42411a.f142873x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42411a.f142873x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42411a = new C42411a(interfaceC30057d);
                    }
                } else {
                    c42411a = new C42411a(interfaceC30057d);
                }
                Object obj2 = c42411a.f142872w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42411a.f142873x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f142866w;
                    AbstractC30535d abstractC30535dM107728q = this.f142867x.m107728q((AbstractC34073m) obj);
                    c42411a.f142874y = null;
                    c42411a.f142868E = null;
                    c42411a.f142869F = null;
                    c42411a.f142870G = null;
                    c42411a.f142871H = 0;
                    c42411a.f142873x = 1;
                    if (interfaceC13062m.emit(abstractC30535dM107728q, c42411a) == enumC31071a) {
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

        public e(InterfaceC13058l interfaceC13058l, C34074n c34074n) {
            this.f142864w = interfaceC13058l;
            this.f142865x = c34074n;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f142864w.collect(new a(interfaceC13062m, this.f142865x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: tp1.n$f */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f142876w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C34074n f142877x;

        /* JADX INFO: renamed from: tp1.n$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f142878w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C34074n f142879x;

            /* JADX INFO: renamed from: tp1.n$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.presentation.HormonalSettingsViewModel$special$$inlined$map$2$2", m100430f = "HormonalSettingsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42412a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f142880E;

                /* JADX INFO: renamed from: F */
                Object f142881F;

                /* JADX INFO: renamed from: G */
                Object f142882G;

                /* JADX INFO: renamed from: H */
                int f142883H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f142884w;

                /* JADX INFO: renamed from: x */
                int f142885x;

                /* JADX INFO: renamed from: y */
                Object f142886y;

                public C42412a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f142884w = obj;
                    this.f142885x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C34074n c34074n) {
                this.f142878w = interfaceC13062m;
                this.f142879x = c34074n;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42412a c42412a;
                if (interfaceC30057d instanceof C42412a) {
                    c42412a = (C42412a) interfaceC30057d;
                    int i13 = c42412a.f142885x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42412a.f142885x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42412a = new C42412a(interfaceC30057d);
                    }
                } else {
                    c42412a = new C42412a(interfaceC30057d);
                }
                Object obj2 = c42412a.f142884w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42412a.f142885x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f142878w;
                    AbstractC13379a abstractC13379aM107727p = this.f142879x.m107727p((AbstractC34073m) obj);
                    c42412a.f142886y = null;
                    c42412a.f142880E = null;
                    c42412a.f142881F = null;
                    c42412a.f142882G = null;
                    c42412a.f142883H = 0;
                    c42412a.f142885x = 1;
                    if (interfaceC13062m.emit(abstractC13379aM107727p, c42412a) == enumC31071a) {
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

        public f(InterfaceC13058l interfaceC13058l, C34074n c34074n) {
            this.f142876w = interfaceC13058l;
            this.f142877x = c34074n;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f142876w.collect(new a(interfaceC13062m, this.f142877x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: tp1.n$g */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f142888w;

        /* JADX INFO: renamed from: tp1.n$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f142889w;

            /* JADX INFO: renamed from: tp1.n$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.presentation.HormonalSettingsViewModel$special$$inlined$map$3$2", m100430f = "HormonalSettingsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42413a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f142890E;

                /* JADX INFO: renamed from: F */
                Object f142891F;

                /* JADX INFO: renamed from: G */
                Object f142892G;

                /* JADX INFO: renamed from: H */
                int f142893H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f142894w;

                /* JADX INFO: renamed from: x */
                int f142895x;

                /* JADX INFO: renamed from: y */
                Object f142896y;

                public C42413a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f142894w = obj;
                    this.f142895x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f142889w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42413a c42413a;
                if (interfaceC30057d instanceof C42413a) {
                    c42413a = (C42413a) interfaceC30057d;
                    int i13 = c42413a.f142895x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42413a.f142895x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42413a = new C42413a(interfaceC30057d);
                    }
                } else {
                    c42413a = new C42413a(interfaceC30057d);
                }
                Object obj2 = c42413a.f142894w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42413a.f142895x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f142889w;
                    AbstractC30532a.a aVar = AbstractC30532a.a.f125540a;
                    c42413a.f142896y = null;
                    c42413a.f142890E = null;
                    c42413a.f142891F = null;
                    c42413a.f142892G = null;
                    c42413a.f142893H = 0;
                    c42413a.f142895x = 1;
                    if (interfaceC13062m.emit(aVar, c42413a) == enumC31071a) {
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

        public g(InterfaceC13058l interfaceC13058l) {
            this.f142888w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f142888w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: tp1.n$h */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f142898w;

        /* JADX INFO: renamed from: tp1.n$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f142899w;

            /* JADX INFO: renamed from: tp1.n$h$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.presentation.HormonalSettingsViewModel$special$$inlined$map$4$2", m100430f = "HormonalSettingsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42414a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f142900E;

                /* JADX INFO: renamed from: F */
                Object f142901F;

                /* JADX INFO: renamed from: G */
                Object f142902G;

                /* JADX INFO: renamed from: H */
                int f142903H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f142904w;

                /* JADX INFO: renamed from: x */
                int f142905x;

                /* JADX INFO: renamed from: y */
                Object f142906y;

                public C42414a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f142904w = obj;
                    this.f142905x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f142899w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42414a c42414a;
                if (interfaceC30057d instanceof C42414a) {
                    c42414a = (C42414a) interfaceC30057d;
                    int i13 = c42414a.f142905x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42414a.f142905x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42414a = new C42414a(interfaceC30057d);
                    }
                } else {
                    c42414a = new C42414a(interfaceC30057d);
                }
                Object obj2 = c42414a.f142904w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42414a.f142905x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f142899w;
                    C30533b c30533b = new C30533b((AbstractC30536e) obj, null);
                    c42414a.f142906y = null;
                    c42414a.f142900E = null;
                    c42414a.f142901F = null;
                    c42414a.f142902G = null;
                    c42414a.f142903H = 0;
                    c42414a.f142905x = 1;
                    if (interfaceC13062m.emit(c30533b, c42414a) == enumC31071a) {
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
            this.f142898w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f142898w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34074n(C30537f hormonalSettingsInteractor, C13380b fertilitySettingsInteractor, FeatureFlagChecker featureFlagChecker, C30534c combiner, C35151a reducer, InterfaceC2994c0 coroutineScope, InterfaceC34116n logger) {
        super(coroutineScope);
        AbstractC22676k.m65750j(hormonalSettingsInteractor, "hormonalSettingsInteractor");
        AbstractC22676k.m65750j(fertilitySettingsInteractor, "fertilitySettingsInteractor");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(combiner, "combiner");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(logger, "logger");
        this.coroutineScope = coroutineScope;
        this.logger = logger;
        boolean zIsFeatureEnabled = featureFlagChecker.isFeatureEnabled("fertility-insights");
        this.useCombiner = zIsFeatureEnabled;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(AbstractC27845h.m83945a(new e(new b(c13096w1M36592b, this), this), hormonalSettingsInteractor), coroutineScope, C13105z1.f45288a, 0);
        this.hormonalDomainState = c13078q1M36586L;
        C13042h c13042hM36584J = AbstractC13091v.m36584J(AbstractC27845h.m83945a(new f(new c(c13096w1M36592b, this), this), fertilitySettingsInteractor), new g(new d(c13096w1M36592b)));
        this.fertilityDomainState = c13042hM36584J;
        this.viewState = m107723n(zIsFeatureEnabled ? combiner.m93597a(c13078q1M36586L, c13042hM36584J) : new h(c13078q1M36586L), reducer);
    }

    /* JADX INFO: renamed from: n */
    private final InterfaceC13058l m107723n(InterfaceC13058l interfaceC13058l, C35151a c35151a) {
        return c35151a.m111202b(interfaceC13058l);
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m107724j(AbstractC34073m viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        if ((viewEvent instanceof AbstractC34073m.c) || (viewEvent instanceof AbstractC34073m.d)) {
            return true;
        }
        if ((viewEvent instanceof AbstractC34073m.b) || (viewEvent instanceof AbstractC34073m.h) || (viewEvent instanceof AbstractC34073m.e) || (viewEvent instanceof AbstractC34073m.f) || (viewEvent instanceof AbstractC34073m.g) || (viewEvent instanceof AbstractC34073m.i) || viewEvent.equals(AbstractC34073m.a.f142811a)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: l */
    public final boolean m107725l(AbstractC34073m viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        if ((viewEvent instanceof AbstractC34073m.b) || (viewEvent instanceof AbstractC34073m.h) || (viewEvent instanceof AbstractC34073m.e) || (viewEvent instanceof AbstractC34073m.f) || (viewEvent instanceof AbstractC34073m.g) || (viewEvent instanceof AbstractC34073m.i) || viewEvent.equals(AbstractC34073m.a.f142811a)) {
            return true;
        }
        if ((viewEvent instanceof AbstractC34073m.c) || (viewEvent instanceof AbstractC34073m.d)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: o */
    public final void m107726o(AbstractC34073m viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        if (this.useCombiner || !m107724j(viewEvent)) {
            AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(viewEvent, null), 3);
            return;
        }
        this.logger.mo85226q("Fertility event " + viewEvent + " dropped - fertility-insights flag is off", new AbstractC30556a.a[0]);
    }

    /* JADX INFO: renamed from: p */
    public final AbstractC13379a m107727p(AbstractC34073m viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        if (viewEvent instanceof AbstractC34073m.c) {
            return new AbstractC13379a.a(((AbstractC34073m.c) viewEvent).getEnabled());
        }
        if (viewEvent instanceof AbstractC34073m.d) {
            return new AbstractC13379a.b(((AbstractC34073m.d) viewEvent).getReason());
        }
        if (!(viewEvent instanceof AbstractC34073m.b) && !(viewEvent instanceof AbstractC34073m.h) && !(viewEvent instanceof AbstractC34073m.e) && !(viewEvent instanceof AbstractC34073m.f) && !(viewEvent instanceof AbstractC34073m.g) && !(viewEvent instanceof AbstractC34073m.i) && !viewEvent.equals(AbstractC34073m.a.f142811a)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException(viewEvent + " is not a fertility view event");
    }

    /* JADX INFO: renamed from: q */
    public final AbstractC30535d m107728q(AbstractC34073m viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        if (viewEvent instanceof AbstractC34073m.b) {
            return AbstractC30535d.b.f125553a;
        }
        if (viewEvent instanceof AbstractC34073m.h) {
            return new AbstractC30535d.f(((AbstractC34073m.h) viewEvent).getDueDate());
        }
        if (viewEvent instanceof AbstractC34073m.e) {
            return new AbstractC30535d.c(((AbstractC34073m.e) viewEvent).getMode());
        }
        if (viewEvent instanceof AbstractC34073m.f) {
            return new AbstractC30535d.d(((AbstractC34073m.f) viewEvent).getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String());
        }
        if (viewEvent instanceof AbstractC34073m.g) {
            return new AbstractC30535d.e(((AbstractC34073m.g) viewEvent).getEnabled());
        }
        if (viewEvent instanceof AbstractC34073m.i) {
            return new AbstractC30535d.g(((AbstractC34073m.i) viewEvent).m107721a());
        }
        if (viewEvent.equals(AbstractC34073m.a.f142811a)) {
            return AbstractC30535d.a.f125552a;
        }
        if (!(viewEvent instanceof AbstractC34073m.c) && !(viewEvent instanceof AbstractC34073m.d)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException(viewEvent + " is not a hormonal view event");
    }

    public /* synthetic */ C34074n(C30537f c30537f, C13380b c13380b, FeatureFlagChecker featureFlagChecker, C30534c c30534c, C35151a c35151a, InterfaceC2994c0 interfaceC2994c0, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c30537f, c13380b, featureFlagChecker, c30534c, c35151a, (i13 & 32) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0, (i13 & 64) != 0 ? InterfaceC34116n.INSTANCE.m107848a("HormonalSettingsViewModel") : interfaceC34116n);
    }
}
