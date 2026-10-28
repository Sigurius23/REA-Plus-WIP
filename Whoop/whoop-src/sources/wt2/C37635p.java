package wt2;

import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import ge3.AbstractC15751g;
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
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import t83.InterfaceC33616a;
import tt2.AbstractC34163a;
import tt2.AbstractC34164b;
import tt2.AbstractC34171i;
import tt2.AbstractC34172j;
import tt2.C34165c;
import tt2.C34169g;
import tt2.C34170h;
import tt2.C34173k;
import xt2.C38650d;

/* JADX INFO: renamed from: wt2.p */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001<B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0010*\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J'\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0010*\b\u0012\u0004\u0012\u00020!0\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020%2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b&\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00150,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00120\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00107\u001a\b\u0012\u0004\u0012\u000204038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00020\"0\u00108\u0006¢\u0006\f\n\u0004\b8\u00101\u001a\u0004\b9\u0010:¨\u0006="}, m65681d2 = {"Lwt2/p;", "Landroidx/lifecycle/w1;", "Ltt2/k;", "interactor", "Ltt2/c;", "presetInteractor", "Lxt2/d;", "viewStateReducer", "Ltt2/h;", "combiner", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lbc3/c0;", "coroutineScope", "<init>", "(Ltt2/k;Ltt2/c;Lxt2/d;Ltt2/h;Lcom/whoop/data/repositories/FeatureFlagChecker;Lbc3/c0;)V", "Lec3/l;", "Ltt2/i;", "Ltt2/j;", "p", "(Lec3/l;Ltt2/k;)Lec3/l;", "Lwt2/o;", "viewEvent", "t", "(Lwt2/o;)Ltt2/i;", "Ltt2/a;", "u", "(Lwt2/o;)Ltt2/a;", "Lwt2/p$a;", "viewEventType", "", "o", "(Lwt2/o;Lwt2/p$a;)Z", "Ltt2/g;", "Lwt2/q;", "q", "(Lec3/l;Lxt2/d;)Lec3/l;", "Lbc3/k1;", "r", "(Lwt2/o;)Lbc3/k1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lcom/whoop/data/repositories/FeatureFlagChecker;", "x", "Lbc3/c0;", "Lec3/o1;", "y", "Lec3/o1;", "eventFlow", "z", "Lec3/l;", "domainState", "Lec3/t1;", "Ltt2/b;", "E", "Lec3/t1;", "presetDomainState", "F", "getViewState", "()Lec3/l;", "viewState", "a", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37635p extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13087t1 presetDomainState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: wt2.p$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m65681d2 = {"Lwt2/p$a;", "", "<init>", "(Ljava/lang/String;I)V", "MAIN", "PRESET", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum a {
        MAIN,
        PRESET;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: wt2.p$b */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f161098a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.PRESET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f161098a = iArr;
        }
    }

    /* JADX INFO: renamed from: wt2.p$c */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.weeklyplan.presentation.WeeklyPlanViewModel$sendViewEvent$1", m100430f = "WeeklyPlanViewModel.kt", m100431l = {55}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f161099w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC37634o f161101y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC37634o abstractC37634o, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f161101y = abstractC37634o;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C37635p.this.new c(this.f161101y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f161099w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C37635p.this.eventFlow;
                AbstractC37634o abstractC37634o = this.f161101y;
                this.f161099w = 1;
                if (interfaceC13072o1.emit(abstractC37634o, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: wt2.p$d */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f161102w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C37635p f161103x;

        /* JADX INFO: renamed from: wt2.p$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f161104w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C37635p f161105x;

            /* JADX INFO: renamed from: wt2.p$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.weeklyplan.presentation.WeeklyPlanViewModel$special$$inlined$filter$1$2", m100430f = "WeeklyPlanViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42607a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f161107F;

                /* JADX INFO: renamed from: G */
                Object f161108G;

                /* JADX INFO: renamed from: H */
                int f161109H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f161110w;

                /* JADX INFO: renamed from: x */
                int f161111x;

                /* JADX INFO: renamed from: y */
                Object f161112y;

                /* JADX INFO: renamed from: z */
                Object f161113z;

                public C42607a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f161110w = obj;
                    this.f161111x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C37635p c37635p) {
                this.f161104w = interfaceC13062m;
                this.f161105x = c37635p;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42607a c42607a;
                if (interfaceC30057d instanceof C42607a) {
                    c42607a = (C42607a) interfaceC30057d;
                    int i13 = c42607a.f161111x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42607a.f161111x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42607a = new C42607a(interfaceC30057d);
                    }
                } else {
                    c42607a = new C42607a(interfaceC30057d);
                }
                Object obj2 = c42607a.f161110w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42607a.f161111x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f161104w;
                    if (this.f161105x.m120947o((AbstractC37634o) obj, a.MAIN)) {
                        c42607a.f161112y = null;
                        c42607a.f161113z = null;
                        c42607a.f161107F = null;
                        c42607a.f161108G = null;
                        c42607a.f161109H = 0;
                        c42607a.f161111x = 1;
                        if (interfaceC13062m.emit(obj, c42607a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l, C37635p c37635p) {
            this.f161102w = interfaceC13058l;
            this.f161103x = c37635p;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f161102w.collect(new a(interfaceC13062m, this.f161103x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: wt2.p$e */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f161114w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C37635p f161115x;

        /* JADX INFO: renamed from: wt2.p$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f161116w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C37635p f161117x;

            /* JADX INFO: renamed from: wt2.p$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.weeklyplan.presentation.WeeklyPlanViewModel$special$$inlined$filter$2$2", m100430f = "WeeklyPlanViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42608a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f161119F;

                /* JADX INFO: renamed from: G */
                Object f161120G;

                /* JADX INFO: renamed from: H */
                int f161121H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f161122w;

                /* JADX INFO: renamed from: x */
                int f161123x;

                /* JADX INFO: renamed from: y */
                Object f161124y;

                /* JADX INFO: renamed from: z */
                Object f161125z;

                public C42608a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f161122w = obj;
                    this.f161123x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C37635p c37635p) {
                this.f161116w = interfaceC13062m;
                this.f161117x = c37635p;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42608a c42608a;
                if (interfaceC30057d instanceof C42608a) {
                    c42608a = (C42608a) interfaceC30057d;
                    int i13 = c42608a.f161123x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42608a.f161123x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42608a = new C42608a(interfaceC30057d);
                    }
                } else {
                    c42608a = new C42608a(interfaceC30057d);
                }
                Object obj2 = c42608a.f161122w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42608a.f161123x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f161116w;
                    if (this.f161117x.m120947o((AbstractC37634o) obj, a.PRESET)) {
                        c42608a.f161124y = null;
                        c42608a.f161125z = null;
                        c42608a.f161119F = null;
                        c42608a.f161120G = null;
                        c42608a.f161121H = 0;
                        c42608a.f161123x = 1;
                        if (interfaceC13062m.emit(obj, c42608a) == enumC31071a) {
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

        public e(InterfaceC13058l interfaceC13058l, C37635p c37635p) {
            this.f161114w = interfaceC13058l;
            this.f161115x = c37635p;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f161114w.collect(new a(interfaceC13062m, this.f161115x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: wt2.p$f */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f161126w;

        /* JADX INFO: renamed from: wt2.p$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f161127w;

            /* JADX INFO: renamed from: wt2.p$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.weeklyplan.presentation.WeeklyPlanViewModel$special$$inlined$filter$3$2", m100430f = "WeeklyPlanViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42609a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f161129F;

                /* JADX INFO: renamed from: G */
                Object f161130G;

                /* JADX INFO: renamed from: H */
                int f161131H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f161132w;

                /* JADX INFO: renamed from: x */
                int f161133x;

                /* JADX INFO: renamed from: y */
                Object f161134y;

                /* JADX INFO: renamed from: z */
                Object f161135z;

                public C42609a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f161132w = obj;
                    this.f161133x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f161127w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42609a c42609a;
                if (interfaceC30057d instanceof C42609a) {
                    c42609a = (C42609a) interfaceC30057d;
                    int i13 = c42609a.f161133x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42609a.f161133x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42609a = new C42609a(interfaceC30057d);
                    }
                } else {
                    c42609a = new C42609a(interfaceC30057d);
                }
                Object obj2 = c42609a.f161132w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42609a.f161133x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f161127w;
                    C34169g c34169g = (C34169g) obj;
                    if (!(c34169g.m107980d() instanceof AbstractC34172j.a) || (c34169g.m107979c() instanceof AbstractC34164b.c) || (c34169g.m107979c() instanceof AbstractC34164b.b)) {
                        c42609a.f161134y = null;
                        c42609a.f161135z = null;
                        c42609a.f161129F = null;
                        c42609a.f161130G = null;
                        c42609a.f161131H = 0;
                        c42609a.f161133x = 1;
                        if (interfaceC13062m.emit(obj, c42609a) == enumC31071a) {
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
            this.f161126w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f161126w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: wt2.p$g */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f161136w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C37635p f161137x;

        /* JADX INFO: renamed from: wt2.p$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f161138w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C37635p f161139x;

            /* JADX INFO: renamed from: wt2.p$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.weeklyplan.presentation.WeeklyPlanViewModel$special$$inlined$map$1$2", m100430f = "WeeklyPlanViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42610a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f161140E;

                /* JADX INFO: renamed from: F */
                Object f161141F;

                /* JADX INFO: renamed from: G */
                Object f161142G;

                /* JADX INFO: renamed from: H */
                int f161143H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f161144w;

                /* JADX INFO: renamed from: x */
                int f161145x;

                /* JADX INFO: renamed from: y */
                Object f161146y;

                public C42610a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f161144w = obj;
                    this.f161145x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C37635p c37635p) {
                this.f161138w = interfaceC13062m;
                this.f161139x = c37635p;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42610a c42610a;
                if (interfaceC30057d instanceof C42610a) {
                    c42610a = (C42610a) interfaceC30057d;
                    int i13 = c42610a.f161145x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42610a.f161145x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42610a = new C42610a(interfaceC30057d);
                    }
                } else {
                    c42610a = new C42610a(interfaceC30057d);
                }
                Object obj2 = c42610a.f161144w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42610a.f161145x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f161138w;
                    AbstractC34171i abstractC34171iM120950t = this.f161139x.m120950t((AbstractC37634o) obj);
                    c42610a.f161146y = null;
                    c42610a.f161140E = null;
                    c42610a.f161141F = null;
                    c42610a.f161142G = null;
                    c42610a.f161143H = 0;
                    c42610a.f161145x = 1;
                    if (interfaceC13062m.emit(abstractC34171iM120950t, c42610a) == enumC31071a) {
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

        public g(InterfaceC13058l interfaceC13058l, C37635p c37635p) {
            this.f161136w = interfaceC13058l;
            this.f161137x = c37635p;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f161136w.collect(new a(interfaceC13062m, this.f161137x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: wt2.p$h */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f161148w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C37635p f161149x;

        /* JADX INFO: renamed from: wt2.p$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f161150w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C37635p f161151x;

            /* JADX INFO: renamed from: wt2.p$h$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.weeklyplan.presentation.WeeklyPlanViewModel$special$$inlined$map$2$2", m100430f = "WeeklyPlanViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42611a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f161152E;

                /* JADX INFO: renamed from: F */
                Object f161153F;

                /* JADX INFO: renamed from: G */
                Object f161154G;

                /* JADX INFO: renamed from: H */
                int f161155H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f161156w;

                /* JADX INFO: renamed from: x */
                int f161157x;

                /* JADX INFO: renamed from: y */
                Object f161158y;

                public C42611a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f161156w = obj;
                    this.f161157x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C37635p c37635p) {
                this.f161150w = interfaceC13062m;
                this.f161151x = c37635p;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42611a c42611a;
                if (interfaceC30057d instanceof C42611a) {
                    c42611a = (C42611a) interfaceC30057d;
                    int i13 = c42611a.f161157x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42611a.f161157x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42611a = new C42611a(interfaceC30057d);
                    }
                } else {
                    c42611a = new C42611a(interfaceC30057d);
                }
                Object obj2 = c42611a.f161156w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42611a.f161157x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f161150w;
                    AbstractC34163a abstractC34163aM120951u = this.f161151x.m120951u((AbstractC37634o) obj);
                    c42611a.f161158y = null;
                    c42611a.f161152E = null;
                    c42611a.f161153F = null;
                    c42611a.f161154G = null;
                    c42611a.f161155H = 0;
                    c42611a.f161157x = 1;
                    if (interfaceC13062m.emit(abstractC34163aM120951u, c42611a) == enumC31071a) {
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

        public h(InterfaceC13058l interfaceC13058l, C37635p c37635p) {
            this.f161148w = interfaceC13058l;
            this.f161149x = c37635p;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f161148w.collect(new a(interfaceC13062m, this.f161149x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37635p(C34173k interactor, C34165c presetInteractor, C38650d viewStateReducer, C34170h combiner, FeatureFlagChecker featureFlagChecker, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(presetInteractor, "presetInteractor");
        AbstractC22676k.m65750j(viewStateReducer, "viewStateReducer");
        AbstractC22676k.m65750j(combiner, "combiner");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.featureFlagChecker = featureFlagChecker;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM120948p = m120948p(new g(new d(c13096w1M36592b, this), this), interactor);
        C13021b2 c13021b2 = C13105z1.f45288a;
        InterfaceC13058l interfaceC13058lM36586L = AbstractC13091v.m36586L(interfaceC13058lM120948p, coroutineScope, c13021b2, 1);
        this.domainState = interfaceC13058lM36586L;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(AbstractC27845h.m83945a(new h(new e(c13096w1M36592b, this), this), presetInteractor), coroutineScope, c13021b2, 1);
        this.presetDomainState = c13078q1M36586L;
        this.viewState = m120949q(new f(combiner.m107981a(interfaceC13058lM36586L, c13078q1M36586L)), viewStateReducer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final boolean m120947o(AbstractC37634o viewEvent, a viewEventType) {
        int i13 = b.f161098a[viewEventType.ordinal()];
        if (i13 == 1) {
            return ((viewEvent instanceof AbstractC37634o.b) || (viewEvent instanceof AbstractC37634o.a)) ? false : true;
        }
        if (i13 == 2) {
            return (viewEvent instanceof AbstractC37634o.b) || (viewEvent instanceof AbstractC37634o.c) || (viewEvent instanceof AbstractC37634o.a);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: p */
    private final InterfaceC13058l m120948p(InterfaceC13058l interfaceC13058l, C34173k c34173k) {
        return c34173k.interact(interfaceC13058l);
    }

    /* JADX INFO: renamed from: q */
    private final InterfaceC13058l m120949q(InterfaceC13058l interfaceC13058l, C38650d c38650d) {
        return c38650d.m123902f(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final AbstractC34171i m120950t(AbstractC37634o viewEvent) {
        if (viewEvent instanceof AbstractC37634o.c) {
            AbstractC37634o.c cVar = (AbstractC37634o.c) viewEvent;
            return new AbstractC34171i.a(cVar.getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), cVar.getSource());
        }
        throw new IllegalArgumentException("invalid viewEvent " + viewEvent + ", cannot be mapped to a domain action.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public final AbstractC34163a m120951u(AbstractC37634o viewEvent) {
        if (viewEvent instanceof AbstractC37634o.c) {
            return this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_API_FIX) ? AbstractC34163a.a.f143200a : AbstractC34163a.c.f143202a;
        }
        if (viewEvent instanceof AbstractC37634o.b) {
            return AbstractC34163a.c.f143202a;
        }
        if (viewEvent instanceof AbstractC37634o.a) {
            return new AbstractC34163a.b(((AbstractC37634o.a) viewEvent).getPlanId());
        }
        throw new IllegalArgumentException("invalid viewEvent " + viewEvent + ", cannot be mapped to a preset action.");
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: r */
    public final InterfaceC3027k1 m120952r(AbstractC37634o viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        return AbstractC3006f0.m8732z(this.coroutineScope, null, null, new c(viewEvent, null), 3);
    }

    public /* synthetic */ C37635p(C34173k c34173k, C34165c c34165c, C38650d c38650d, C34170h c34170h, FeatureFlagChecker featureFlagChecker, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c34173k, c34165c, c38650d, c34170h, featureFlagChecker, (i13 & 32) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
