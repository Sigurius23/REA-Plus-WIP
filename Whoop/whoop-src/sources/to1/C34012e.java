package to1;

import ad3.AbstractC0757c;
import androidx.core.app.FrameMetricsAggregator;
import com.mapbox.common.HttpHeaders;
import com.whoop.coacheverywherecommon.models.AbstractC6219a;
import com.whoop.coacheverywherecommon.models.AiContextMetadata;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.calendar.CalendarDateModel;
import com.whoop.design.models.items.CyclePhaseStyle;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.JournalToggleStyle;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.JournalToggleType;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.LogPeriodBottomSheet;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.LogPeriodToggle;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.MenstrualCycleInsightsResponse;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.MetaData;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.SymptomsScreenResponse;
import com.whoop.hormonalinsights.pregnancyinsights.domain.models.SegmentControlDisplay;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import h91.C17027b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.C21535a;
import l83.C23454a0;
import m83.AbstractC25267u;
import np1.C27033k;
import oo1.AbstractC28060f;
import oo1.AbstractC28062h;
import oo1.C28057c;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22656a;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p716lb1.AbstractC23707s0;
import p745y81.EnumC39333f;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import so1.AbstractC32807c0;
import so1.C32823k0;
import so1.C32824l;
import so1.C32833q;
import so1.C32836t;

/* JADX INFO: renamed from: to1.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002,*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J[\u0010\u0019\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\b2\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J'\u0010#\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u0016H\u0002¢\u0006\u0004\b#\u0010$J!\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001d0%2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, m65681d2 = {"Lto1/e;", "", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lad3/c;", "json", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;Lad3/c;)V", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualCycleInsightsResponse;", "response", "Lh91/b;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "Lcom/whoop/design/domain/calendar/CalendarDomainState;", "calendarDomainState", "", HttpHeaders.DATE, "", "index", "Loo1/h$a;", "graphLocalState", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;", "symptomsScreenResponse", "", "isPolling", "Lso1/c0$f;", "g", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualCycleInsightsResponse;Lh91/b;Ljava/lang/String;Ljava/lang/Integer;Loo1/h$a;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;Z)Lso1/c0$f;", "Lto1/e$a;", "accumulatedState", "Lso1/c0;", "nextViewState", "c", "(Lto1/e$a;Lso1/c0;)Lto1/e$a;", "previousPollingStateChangeCount", "hasStateChanged", "d", "(IZZ)I", "Lec3/l;", "Loo1/c;", "upstream", "e", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "b", "Lad3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34012e {

    /* JADX INFO: renamed from: d */
    public static final int f142542d = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC0757c json;

    /* JADX INFO: renamed from: to1.e$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f142547a;

        static {
            int[] iArr = new int[JournalToggleStyle.values().length];
            try {
                iArr[JournalToggleStyle.OVULATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JournalToggleStyle.MENSTRUATING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f142547a = iArr;
        }
    }

    /* JADX INFO: renamed from: to1.e$d */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f142548w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C34012e f142549x;

        /* JADX INFO: renamed from: to1.e$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f142550w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C34012e f142551x;

            /* JADX INFO: renamed from: to1.e$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.presentation.reducers.MciOverviewViewStateReducer$reduce$$inlined$mapNotNull$1$2", m100430f = "MciOverviewViewStateReducer.kt", m100431l = {77}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42405a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f142552E;

                /* JADX INFO: renamed from: F */
                Object f142553F;

                /* JADX INFO: renamed from: G */
                Object f142554G;

                /* JADX INFO: renamed from: H */
                Object f142555H;

                /* JADX INFO: renamed from: I */
                int f142556I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f142557w;

                /* JADX INFO: renamed from: x */
                int f142558x;

                /* JADX INFO: renamed from: y */
                Object f142559y;

                public C42405a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f142557w = obj;
                    this.f142558x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C34012e c34012e) {
                this.f142550w = interfaceC13062m;
                this.f142551x = c34012e;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42405a c42405a;
                Object objM107511h;
                if (interfaceC30057d instanceof C42405a) {
                    c42405a = (C42405a) interfaceC30057d;
                    int i13 = c42405a.f142558x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42405a.f142558x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42405a = new C42405a(interfaceC30057d);
                    }
                } else {
                    c42405a = new C42405a(interfaceC30057d);
                }
                Object obj2 = c42405a.f142557w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42405a.f142558x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f142550w;
                    C28057c c28057c = (C28057c) obj;
                    AbstractC28060f domainResult = c28057c.getDomainResult();
                    AbstractC28062h localState = c28057c.getLocalState();
                    AbstractC22676k.m65748h(localState, "null cannot be cast to non-null type com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewLocalStateAction.GraphSwitch");
                    AbstractC28062h.a aVar = (AbstractC28062h.a) localState;
                    if (domainResult instanceof AbstractC28060f.b) {
                        objM107511h = AbstractC32807c0.b.f136650b;
                    } else if (domainResult instanceof AbstractC28060f.a) {
                        objM107511h = new AbstractC32807c0.a(((AbstractC28060f.a) domainResult).getCom.mapbox.common.HttpHeaders.DATE java.lang.String());
                    } else if (domainResult instanceof AbstractC28060f.e) {
                        objM107511h = new AbstractC32807c0.d(((AbstractC28060f.e) domainResult).getCom.mapbox.common.HttpHeaders.DATE java.lang.String());
                    } else if (AbstractC22676k.m65745e(domainResult, AbstractC28060f.d.f113298a)) {
                        objM107511h = AbstractC32807c0.c.f136651b;
                    } else if (AbstractC22676k.m65745e(domainResult, AbstractC28060f.f.f113300a)) {
                        objM107511h = AbstractC32807c0.e.f136653b;
                    } else if (domainResult instanceof AbstractC28060f.g) {
                        AbstractC28060f.g gVar = (AbstractC28060f.g) domainResult;
                        objM107511h = this.f142551x.m107510g(gVar.getResponse(), gVar.m84763c(), gVar.getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), new Integer(gVar.getIndex()), aVar, gVar.getSymptomsScreenResponse(), gVar.getIsPollingActive());
                    } else if (domainResult instanceof AbstractC28060f.h) {
                        AbstractC28060f.h hVar = (AbstractC28060f.h) domainResult;
                        objM107511h = C34012e.m107511h(this.f142551x, hVar.getResponse(), hVar.m84769a(), hVar.getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), new Integer(hVar.getIndex()), aVar, null, hVar.getIsPollingActive(), 32, null);
                    } else {
                        if (!(domainResult instanceof AbstractC28060f.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objM107511h = null;
                    }
                    if (objM107511h != null) {
                        c42405a.f142559y = null;
                        c42405a.f142552E = null;
                        c42405a.f142553F = null;
                        c42405a.f142554G = null;
                        c42405a.f142555H = null;
                        c42405a.f142556I = 0;
                        c42405a.f142558x = 1;
                        if (interfaceC13062m.emit(objM107511h, c42405a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l, C34012e c34012e) {
            this.f142548w = interfaceC13058l;
            this.f142549x = c34012e;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f142548w.collect(new a(interfaceC13062m, this.f142549x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: to1.e$e */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f142561w;

        /* JADX INFO: renamed from: to1.e$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f142562w;

            /* JADX INFO: renamed from: to1.e$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.presentation.reducers.MciOverviewViewStateReducer$reduce$$inlined$mapNotNull$2$2", m100430f = "MciOverviewViewStateReducer.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42406a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f142563E;

                /* JADX INFO: renamed from: F */
                Object f142564F;

                /* JADX INFO: renamed from: G */
                Object f142565G;

                /* JADX INFO: renamed from: H */
                Object f142566H;

                /* JADX INFO: renamed from: I */
                int f142567I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f142568w;

                /* JADX INFO: renamed from: x */
                int f142569x;

                /* JADX INFO: renamed from: y */
                Object f142570y;

                public C42406a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f142568w = obj;
                    this.f142569x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f142562w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42406a c42406a;
                if (interfaceC30057d instanceof C42406a) {
                    c42406a = (C42406a) interfaceC30057d;
                    int i13 = c42406a.f142569x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42406a.f142569x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42406a = new C42406a(interfaceC30057d);
                    }
                } else {
                    c42406a = new C42406a(interfaceC30057d);
                }
                Object obj2 = c42406a.f142568w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42406a.f142569x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f142562w;
                    AbstractC32807c0 viewState = ((a) obj).getViewState();
                    if (viewState != null) {
                        c42406a.f142570y = null;
                        c42406a.f142563E = null;
                        c42406a.f142564F = null;
                        c42406a.f142565G = null;
                        c42406a.f142566H = null;
                        c42406a.f142567I = 0;
                        c42406a.f142569x = 1;
                        if (interfaceC13062m.emit(viewState, c42406a) == enumC31071a) {
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

        public e(InterfaceC13058l interfaceC13058l) {
            this.f142561w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f142561w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: to1.e$f */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class f extends C22656a implements Function3 {
        public f(Object obj) {
            super(3, 4, C34012e.class, obj, "accumulate", "accumulate(Lcom/whoop/hormonalinsights/menstrualcycleinsights/presentation/reducers/MciOverviewViewStateReducer$AccumulatedState;Lcom/whoop/hormonalinsights/menstrualcycleinsights/presentation/MciOverviewViewState;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/presentation/reducers/MciOverviewViewStateReducer$AccumulatedState;");
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a aVar, AbstractC32807c0 abstractC32807c0, InterfaceC30057d<? super a> interfaceC30057d) {
            return C34012e.m107509f((C34012e) this.receiver, aVar, abstractC32807c0, interfaceC30057d);
        }
    }

    public C34012e(FeatureFlagChecker featureFlagChecker, AbstractC0757c json) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(json, "json");
        this.featureFlagChecker = featureFlagChecker;
        this.json = json;
    }

    /* JADX INFO: renamed from: c */
    private final a m107507c(a accumulatedState, AbstractC32807c0 nextViewState) {
        if (!(nextViewState instanceof AbstractC32807c0.f)) {
            return accumulatedState.m107513a(nextViewState, 0);
        }
        AbstractC32807c0 viewState = accumulatedState.getViewState();
        AbstractC32807c0.f fVar = (AbstractC32807c0.f) nextViewState;
        int iM107508d = m107508d(accumulatedState.getPollingStateChangeCount(), fVar.getIsUpdatingPredictions(), (viewState instanceof AbstractC32807c0.f) && !AbstractC22676k.m65745e(AbstractC32807c0.f.m102927c((AbstractC32807c0.f) viewState, null, null, null, null, null, null, null, null, false, true, FrameMetricsAggregator.EVERY_DURATION, null), AbstractC32807c0.f.m102927c((AbstractC32807c0.f) nextViewState, null, null, null, null, null, null, null, null, false, true, FrameMetricsAggregator.EVERY_DURATION, null)));
        return accumulatedState.m107513a(AbstractC32807c0.f.m102927c(fVar, null, null, null, null, null, null, null, null, false, iM107508d >= 3, FrameMetricsAggregator.EVERY_DURATION, null), iM107508d);
    }

    /* JADX INFO: renamed from: d */
    private final int m107508d(int previousPollingStateChangeCount, boolean isPolling, boolean hasStateChanged) {
        if (isPolling) {
            return hasStateChanged ? previousPollingStateChangeCount + 1 : previousPollingStateChangeCount;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ Object m107509f(C34012e c34012e, a aVar, AbstractC32807c0 abstractC32807c0, InterfaceC30057d interfaceC30057d) {
        return c34012e.m107507c(aVar, abstractC32807c0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final AbstractC32807c0.f m107510g(MenstrualCycleInsightsResponse response, C17027b<CalendarDateModel> calendarDomainState, String date, Integer index, AbstractC28062h.a graphLocalState, SymptomsScreenResponse symptomsScreenResponse, boolean isPolling) {
        C32833q c32833q;
        CyclePhaseStyle cyclePhaseStyle;
        CyclePhaseStyle cyclePhaseStyle2;
        C32823k0 c32823k0;
        AiContextMetadata aiContextMetadata;
        JournalToggleStyle journalToggleStyle;
        EnumC39333f enumC39333f;
        JournalToggleType journalToggleType;
        boolean zIsFeatureEnabled = this.featureFlagChecker.isFeatureEnabled("hormonal-insights-updates");
        C21535a c21535aM107533P = AbstractC34019l.m107533P(this.json, calendarDomainState, index, graphLocalState, zIsFeatureEnabled, zIsFeatureEnabled, false, 64, null);
        ArrayList arrayListM74164j0 = AbstractC25267u.m74164j0(calendarDomainState.m48077e().values());
        List<DesignSystemModel> tiles = response.getTiles();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(tiles, 10));
        Iterator<T> it = tiles.iterator();
        while (it.hasNext()) {
            arrayList.add(c21535aM107533P.m60544l((DesignSystemModel) it.next()));
        }
        LogPeriodBottomSheet logPeriodBottomSheet = response.getLogPeriodBottomSheet();
        if (logPeriodBottomSheet != null) {
            TextResource textResourceM21278l = AbstractC8693b.m21278l(logPeriodBottomSheet.getTitleDisplay());
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(logPeriodBottomSheet.getButtonTitle());
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l(logPeriodBottomSheet.getSecondaryButtonTitle());
            List<LogPeriodToggle> toggles = logPeriodBottomSheet.getToggles();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(toggles, 10));
            for (LogPeriodToggle logPeriodToggle : toggles) {
                String selectedStyle = logPeriodToggle.getSelectedStyle();
                JournalToggleStyle journalToggleStyle2 = JournalToggleStyle.OVULATING;
                JournalToggleStyle[] journalToggleStyleArrValues = JournalToggleStyle.values();
                int length = journalToggleStyleArrValues.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        journalToggleStyle = null;
                        break;
                    }
                    journalToggleStyle = journalToggleStyleArrValues[i13];
                    if (AbstractC22676k.m65745e(journalToggleStyle.name(), selectedStyle)) {
                        break;
                    }
                    i13++;
                }
                if (journalToggleStyle != null) {
                    journalToggleStyle2 = journalToggleStyle;
                }
                TextResource textResourceM21278l4 = AbstractC8693b.m21278l(logPeriodToggle.getToggleDisplay());
                int i14 = c.f142547a[journalToggleStyle2.ordinal()];
                if (i14 == 1) {
                    enumC39333f = EnumC39333f.SURFACE_MCI_OVULATORY;
                } else {
                    if (i14 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    enumC39333f = EnumC39333f.SURFACE_MCI_MENSTRUAL;
                }
                String string = logPeriodToggle.getToggleType().toString();
                JournalToggleType journalToggleType2 = JournalToggleType.OVULATION;
                JournalToggleType[] journalToggleTypeArrValues = JournalToggleType.values();
                int length2 = journalToggleTypeArrValues.length;
                int i15 = 0;
                while (true) {
                    if (i15 >= length2) {
                        journalToggleType = null;
                        break;
                    }
                    journalToggleType = journalToggleTypeArrValues[i15];
                    int i16 = i15;
                    if (AbstractC22676k.m65745e(journalToggleType.name(), string)) {
                        break;
                    }
                    i15 = i16 + 1;
                }
                if (journalToggleType != null) {
                    journalToggleType2 = journalToggleType;
                }
                arrayList2.add(new C32836t(textResourceM21278l4, enumC39333f, journalToggleType2, logPeriodToggle.getToggled()));
            }
            c32833q = new C32833q(date, textResourceM21278l, textResourceM21278l2, textResourceM21278l3, arrayList2);
        } else {
            c32833q = null;
        }
        String style = response.getStyle();
        CyclePhaseStyle cyclePhaseStyle3 = CyclePhaseStyle.MENSTRUAL;
        CyclePhaseStyle[] cyclePhaseStyleArrValues = CyclePhaseStyle.values();
        int length3 = cyclePhaseStyleArrValues.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length3) {
                cyclePhaseStyle = null;
                break;
            }
            cyclePhaseStyle = cyclePhaseStyleArrValues[i17];
            if (AbstractC22676k.m65745e(cyclePhaseStyle.name(), style)) {
                break;
            }
            i17++;
        }
        CyclePhaseStyle cyclePhaseStyle4 = cyclePhaseStyle == null ? cyclePhaseStyle3 : cyclePhaseStyle;
        String style2 = response.getStyle();
        CyclePhaseStyle[] cyclePhaseStyleArrValues2 = CyclePhaseStyle.values();
        int length4 = cyclePhaseStyleArrValues2.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length4) {
                cyclePhaseStyle2 = null;
                break;
            }
            cyclePhaseStyle2 = cyclePhaseStyleArrValues2[i18];
            if (AbstractC22676k.m65745e(cyclePhaseStyle2.name(), style2)) {
                break;
            }
            i18++;
        }
        EnumC39333f enumC39333fM69376a = AbstractC23707s0.m69376a(cyclePhaseStyle2);
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l(response.getNavigationTitle());
        C32824l c32824lM107501a = AbstractC34013f.m107517a(arrayListM74164j0, date) ? AbstractC34010c.m107501a(response.getEditingHiddenCycleModal()) : null;
        if (symptomsScreenResponse != null) {
            TextResource textResourceM21278l6 = AbstractC8693b.m21278l(symptomsScreenResponse.getNavigationTitle());
            List<SegmentControlDisplay> segmentedControlDisplays = symptomsScreenResponse.getSegmentedControlDisplays();
            ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(segmentedControlDisplays, 10));
            for (SegmentControlDisplay segmentControlDisplay : segmentedControlDisplays) {
                arrayList3.add(new C27033k(segmentControlDisplay.getNameDisplay(), segmentControlDisplay.getId()));
            }
            List<DesignSystemModel> tiles2 = symptomsScreenResponse.getCurrentCycleSegment().getTiles();
            ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(tiles2, 10));
            Iterator<T> it3 = tiles2.iterator();
            while (it3.hasNext()) {
                arrayList4.add(c21535aM107533P.m60541h((DesignSystemModel) it3.next()));
            }
            List<DesignSystemModel> tiles3 = symptomsScreenResponse.getLastThreeCyclesSegment().getTiles();
            ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(tiles3, 10));
            Iterator<T> it4 = tiles3.iterator();
            while (it4.hasNext()) {
                arrayList5.add(c21535aM107533P.m60541h((DesignSystemModel) it4.next()));
            }
            c32823k0 = new C32823k0(textResourceM21278l6, arrayList3, arrayList4, arrayList5);
        } else {
            c32823k0 = null;
        }
        MetaData metadata = response.getMetadata();
        return new AbstractC32807c0.f((metadata == null || (aiContextMetadata = metadata.getAiContextMetadata()) == null) ? null : AbstractC6219a.m18523a(aiContextMetadata), arrayList, c32833q, cyclePhaseStyle4, enumC39333fM69376a, textResourceM21278l5, c32824lM107501a, c32823k0, isPolling, false, 512, null);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ AbstractC32807c0.f m107511h(C34012e c34012e, MenstrualCycleInsightsResponse menstrualCycleInsightsResponse, C17027b c17027b, String str, Integer num, AbstractC28062h.a aVar, SymptomsScreenResponse symptomsScreenResponse, boolean z4, int i13, Object obj) {
        if ((i13 & 32) != 0) {
            symptomsScreenResponse = null;
        }
        return c34012e.m107510g(menstrualCycleInsightsResponse, c17027b, str, num, aVar, symptomsScreenResponse, z4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final InterfaceC13058l m107512e(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new e(new C13060l1(new a(null, 0, 3, 0 == true ? 1 : 0), new d(upstream, this), new f(this)));
    }

    /* JADX INFO: renamed from: to1.e$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u0018"}, m65681d2 = {"Lto1/e$a;", "", "Lso1/c0;", "viewState", "", "pollingStateChangeCount", "<init>", "(Lso1/c0;I)V", "a", "(Lso1/c0;I)Lto1/e$a;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lso1/c0;", "c", "()Lso1/c0;", "b", "I", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC32807c0 viewState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int pollingStateChangeCount;

        public a(AbstractC32807c0 abstractC32807c0, int i13) {
            this.viewState = abstractC32807c0;
            this.pollingStateChangeCount = i13;
        }

        /* JADX INFO: renamed from: a */
        public final a m107513a(AbstractC32807c0 viewState, int pollingStateChangeCount) {
            return new a(viewState, pollingStateChangeCount);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getPollingStateChangeCount() {
            return this.pollingStateChangeCount;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final AbstractC32807c0 getViewState() {
            return this.viewState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.viewState, aVar.viewState) && this.pollingStateChangeCount == aVar.pollingStateChangeCount;
        }

        public int hashCode() {
            AbstractC32807c0 abstractC32807c0 = this.viewState;
            return Integer.hashCode(this.pollingStateChangeCount) + ((abstractC32807c0 == null ? 0 : abstractC32807c0.hashCode()) * 31);
        }

        public String toString() {
            return "AccumulatedState(viewState=" + this.viewState + ", pollingStateChangeCount=" + this.pollingStateChangeCount + ")";
        }

        public /* synthetic */ a(AbstractC32807c0 abstractC32807c0, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this((i14 & 1) != 0 ? null : abstractC32807c0, (i14 & 2) != 0 ? 0 : i13);
        }
    }
}
