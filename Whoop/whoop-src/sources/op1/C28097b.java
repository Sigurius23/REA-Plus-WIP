package op1;

import ad3.AbstractC0757c;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.DateSelectorModel;
import com.whoop.design.models.items.WhoopCoachVowModel;
import com.whoop.design.models.items.graph.GraphLegendModel;
import com.whoop.design.models.items.graph.GraphModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.MciTileSectionModel;
import com.whoop.hormonalinsights.pregnancyinsights.domain.models.BottomSheet;
import com.whoop.hormonalinsights.pregnancyinsights.domain.models.Button;
import com.whoop.hormonalinsights.pregnancyinsights.domain.models.DeletePregnancyDialog;
import com.whoop.hormonalinsights.pregnancyinsights.domain.models.PregnancyCongratulationsHeader;
import com.whoop.hormonalinsights.pregnancyinsights.domain.models.PregnancyDisclaimer;
import com.whoop.hormonalinsights.pregnancyinsights.domain.models.PregnancyHeader;
import com.whoop.hormonalinsights.pregnancyinsights.domain.models.PregnancyInsightsGraphModel;
import com.whoop.hormonalinsights.pregnancyinsights.domain.models.PregnancyInsightsHeaderButton;
import com.whoop.hormonalinsights.pregnancyinsights.domain.models.PregnancyInsightsResponse;
import com.whoop.hormonalinsights.pregnancyinsights.domain.models.SegmentControlDisplay;
import com.whoop.hormonalinsights.pregnancyinsights.domain.models.TrimesterStyle;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import gz0.EnumC16313m0;
import h51.C16934f;
import j61.C21374h;
import j71.C21395c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import kp1.AbstractC22755d;
import kp1.AbstractC22757f;
import kp1.C22752a;
import l83.C23454a0;
import m81.C25232g;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import np1.AbstractC27032j;
import np1.C27023a;
import np1.C27024b;
import np1.C27025c;
import np1.C27026d;
import np1.C27027e;
import np1.C27028f;
import np1.C27029g;
import np1.C27033k;
import o72.C27644e;
import p181h2.C16618c;
import p208i2.C17919x;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import q83.InterfaceC30057d;
import r21.C30885c;
import r83.EnumC31071a;
import s01.C32048d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import wo1.C37439b0;

/* JADX INFO: renamed from: op1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lop1/b;", "", "Lad3/c;", "json", "<init>", "(Lad3/c;)V", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;", "response", "Lkp1/f$a;", "state", "Lnp1/j;", "k", "(Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;Lkp1/f$a;)Lnp1/j;", "Lec3/l;", "Lkp1/a;", "upstream", "f", "(Lec3/l;)Lec3/l;", "a", "Lad3/c;", "Ljb1/a;", "b", "Ljb1/a;", "getReducer", "()Ljb1/a;", "reducer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28097b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC0757c json;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C21535a reducer;

    /* JADX INFO: renamed from: op1.b$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f113629a;

        static {
            int[] iArr = new int[TrimesterStyle.values().length];
            try {
                iArr[TrimesterStyle.FIRST_TRIMESTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrimesterStyle.SECOND_TRIMESTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TrimesterStyle.THIRD_TRIMESTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TrimesterStyle.POST_PARTUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f113629a = iArr;
        }
    }

    /* JADX INFO: renamed from: op1.b$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f113630w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C28097b f113631x;

        /* JADX INFO: renamed from: op1.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f113632w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C28097b f113633x;

            /* JADX INFO: renamed from: op1.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.pregnancyinsights.presentation.reducers.PregnancyInsightsViewStateReducer$reduce$$inlined$map$1$2", m100430f = "PregnancyInsightsViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42141a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f113634E;

                /* JADX INFO: renamed from: F */
                Object f113635F;

                /* JADX INFO: renamed from: G */
                Object f113636G;

                /* JADX INFO: renamed from: H */
                int f113637H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f113638w;

                /* JADX INFO: renamed from: x */
                int f113639x;

                /* JADX INFO: renamed from: y */
                Object f113640y;

                public C42141a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f113638w = obj;
                    this.f113639x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C28097b c28097b) {
                this.f113632w = interfaceC13062m;
                this.f113633x = c28097b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42141a c42141a;
                Object eVar;
                if (interfaceC30057d instanceof C42141a) {
                    c42141a = (C42141a) interfaceC30057d;
                    int i13 = c42141a.f113639x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42141a.f113639x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42141a = new C42141a(interfaceC30057d);
                    }
                } else {
                    c42141a = new C42141a(interfaceC30057d);
                }
                Object obj2 = c42141a.f113638w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42141a.f113639x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f113632w;
                    C22752a c22752a = (C22752a) obj;
                    AbstractC22755d domainResult = c22752a.getDomainResult();
                    AbstractC22757f localState = c22752a.getLocalState();
                    AbstractC22676k.m65748h(localState, "null cannot be cast to non-null type com.whoop.hormonalinsights.pregnancyinsights.domain.PregnancyInsightsLocalStateAction.GraphSwitch");
                    AbstractC22757f.a aVar = (AbstractC22757f.a) localState;
                    if (domainResult instanceof AbstractC22755d.d) {
                        eVar = new AbstractC27032j.d(((AbstractC22755d.d) domainResult).getCom.mapbox.common.HttpHeaders.DATE java.lang.String());
                    } else if (AbstractC22676k.m65745e(domainResult, AbstractC22755d.f.f89502a)) {
                        eVar = AbstractC27032j.f.f107832a;
                    } else if (domainResult instanceof AbstractC22755d.g) {
                        eVar = this.f113633x.m84891k(((AbstractC22755d.g) domainResult).getResult(), aVar);
                    } else if (AbstractC22676k.m65745e(domainResult, AbstractC22755d.c.f89497a)) {
                        eVar = AbstractC27032j.c.f107829a;
                    } else if (AbstractC22676k.m65745e(domainResult, AbstractC22755d.b.f89496a)) {
                        eVar = AbstractC27032j.b.f107828a;
                    } else if (domainResult instanceof AbstractC22755d.a) {
                        eVar = new AbstractC27032j.a(((AbstractC22755d.a) domainResult).getId());
                    } else if (domainResult instanceof AbstractC22755d.h) {
                        eVar = this.f113633x.m84891k(((AbstractC22755d.h) domainResult).getResult(), aVar);
                    } else {
                        if (!(domainResult instanceof AbstractC22755d.e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        eVar = new AbstractC27032j.e(((AbstractC22755d.e) domainResult).getId());
                    }
                    c42141a.f113640y = null;
                    c42141a.f113634E = null;
                    c42141a.f113635F = null;
                    c42141a.f113636G = null;
                    c42141a.f113637H = 0;
                    c42141a.f113639x = 1;
                    if (interfaceC13062m.emit(eVar, c42141a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C28097b c28097b) {
            this.f113630w = interfaceC13058l;
            this.f113631x = c28097b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f113630w.collect(new a(interfaceC13062m, this.f113631x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: op1.b$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            C21395c c21395c = (C21395c) it;
            C21374h plane = c21395c.getPlane();
            return C21395c.m60092b(c21395c, plane.m59985a((8187 & 1) != 0 ? plane.startVerticalAxis : null, (8187 & 2) != 0 ? plane.endVerticalAxis : null, (8187 & 4) != 0 ? plane.bottomHorizontalAxis : null, (8187 & 8) != 0 ? plane.topHorizontalAxis : null, (8187 & 16) != 0 ? plane.insets : new C16618c(0.02f, 0.04f, 0.02f, 0.04f), (8187 & 32) != 0 ? plane.lines : null, (8187 & 64) != 0 ? plane.graphAnnotations : null, (8187 & 128) != 0 ? plane.accessibilityState : null, (8187 & 256) != 0 ? plane.scrubberEnabled : false, (8187 & 512) != 0 ? plane.clickable : false, (8187 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? plane.buttons : null, (8187 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? plane.longPressTimeoutMillis : 0L, (8187 & 4096) != 0 ? plane.horizontalGridLinePadding : 0.0f), null, null, null, 14, null);
        }
    }

    /* JADX INFO: renamed from: op1.b$d */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            return C16934f.m47677b((C16934f) it, null, null, null, null, null, null, false, false, null, null, null, null, false, 8063, null);
        }
    }

    /* JADX INFO: renamed from: op1.b$e */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f113642w;

        public e(Function1 function1) {
            this.f113642w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f113642w.invoke((PregnancyDisclaimer) it);
        }
    }

    /* JADX INFO: renamed from: op1.b$f */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f113643w;

        public f(Function1 function1) {
            this.f113643w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f113643w.invoke((MciTileSectionModel) it);
        }
    }

    /* JADX INFO: renamed from: op1.b$g */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f113644w = new g();

        /* JADX INFO: renamed from: a */
        public final long m84897a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSleepLightSleep();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m84897a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: op1.b$h */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f113645w = new h();

        /* JADX INFO: renamed from: a */
        public final long m84898a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSleepRemSleep();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m84898a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: op1.b$i */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final i f113646w = new i();

        /* JADX INFO: renamed from: a */
        public final long m84899a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrainZone3();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m84899a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: op1.b$j */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final j f113647w = new j();

        /* JADX INFO: renamed from: a */
        public final long m84900a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m84900a((C39336i) obj));
        }
    }

    public C28097b(AbstractC0757c json) {
        AbstractC22676k.m65750j(json, "json");
        this.json = json;
        this.reducer = AbstractC21537c.m60554d(new C28096a(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m84887g(C28097b c28097b, C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C28096a(c28097b, 1));
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        designItemReducer.m60546a(c22673i0.getOrCreateKotlinClass(C21395c.class), new c());
        designItemReducer.m60546a(c22673i0.getOrCreateKotlinClass(C16934f.class), new d());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m84888h(C28097b c28097b, C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        C27644e c27644e = new C27644e(17);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(PregnancyDisclaimer.class), new e(c27644e));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(MciTileSectionModel.class), new f(new C28096a(c28097b, 2)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C30885c m84889i(PregnancyDisclaimer model) {
        AbstractC22676k.m65750j(model, "model");
        return new C30885c(AbstractC8693b.m21278l(model.getTitleDisplay()), AbstractC8693b.m21278l(model.getContentDisplay()), null, null, false, null, null, 124, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C37439b0 m84890j(C28097b c28097b, MciTileSectionModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C37439b0(model.getTitle(), model.getSubtitle(), AbstractC28099d.m84909i(c28097b.json).m60540g(model.getItems()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final AbstractC27032j m84891k(PregnancyInsightsResponse response, AbstractC22757f.a state) {
        C27025c c27025c;
        C27027e c27027e;
        C27024b c27024b;
        InterfaceC39332e interfaceC39332eM125323a;
        ArrayList arrayList;
        ArrayList arrayList2;
        GraphModel graph;
        C27025c c27025c2;
        String trimesterId = state.getTrimesterId();
        if (trimesterId == null) {
            trimesterId = response.getSegmentedControlDisplayId().name();
        }
        String str = trimesterId;
        String trendId = state.getTrendId();
        if (trendId == null) {
            trendId = response.getSelectedButtonId();
        }
        String str2 = trendId;
        String pregnancyId = response.getPregnancyId();
        String navigationTitle = response.getNavigationTitle();
        if (navigationTitle == null) {
            PregnancyHeader header = response.getHeader();
            navigationTitle = header != null ? header.getTitle() : null;
            if (navigationTitle == null) {
                navigationTitle = "";
            }
        }
        TextResource textResourceM21278l = AbstractC8693b.m21278l(navigationTitle);
        DateSelectorModel datePicker = response.getDatePicker();
        if (datePicker != null) {
            String nextDateTime = datePicker.getNextDateTime();
            if (nextDateTime == null) {
                nextDateTime = "";
            }
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(datePicker.getCurrentDateRange());
            String prevDateTime = datePicker.getPrevDateTime();
            if (prevDateTime == null) {
                prevDateTime = "";
            }
            c27025c = new C27025c(nextDateTime, prevDateTime, textResourceM21278l2);
        } else {
            c27025c = null;
        }
        PregnancyHeader header2 = response.getHeader();
        if (header2 != null) {
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l(header2.getCurrentWeek());
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l(header2.getTrimesterDisplay());
            TextResource textResourceM21278l5 = AbstractC8693b.m21278l(header2.getWeeksRemainingDisplay());
            EnumC16313m0 enumC16313m0ValueOf = EnumC16313m0.valueOf(header2.getPregnancyIcon());
            DateSelectorModel datePicker2 = header2.getDatePicker();
            if (datePicker2 != null) {
                String nextDateTime2 = datePicker2.getNextDateTime();
                if (nextDateTime2 == null) {
                    nextDateTime2 = "";
                }
                TextResource textResourceM21278l6 = AbstractC8693b.m21278l(datePicker2.getCurrentDateRange());
                String prevDateTime2 = datePicker2.getPrevDateTime();
                c27025c2 = new C27025c(nextDateTime2, prevDateTime2 != null ? prevDateTime2 : "", textResourceM21278l6);
            } else {
                c27025c2 = null;
            }
            PregnancyInsightsHeaderButton haveYouDelivered = header2.getHaveYouDelivered();
            c27027e = new C27027e(textResourceM21278l3, c27025c2, textResourceM21278l4, textResourceM21278l5, enumC16313m0ValueOf, haveYouDelivered != null ? AbstractC28099d.m84914n(haveYouDelivered) : null, new C27028f(AbstractC8693b.m21278l(response.getHaveYouDeliveredDialog().getTitle()), AbstractC8693b.m21278l(response.getHaveYouDeliveredDialog().getMessage()), AbstractC8693b.m21278l(response.getHaveYouDeliveredDialog().getPrimaryText()), AbstractC8693b.m21278l(response.getHaveYouDeliveredDialog().getSecondaryText())));
        } else {
            c27027e = null;
        }
        PregnancyCongratulationsHeader congratulationsHeader = response.getCongratulationsHeader();
        if (congratulationsHeader != null) {
            TextResource textResourceM21278l7 = AbstractC8693b.m21278l(congratulationsHeader.getHeaderTitle());
            TextResource textResourceM21278l8 = AbstractC8693b.m21278l(congratulationsHeader.getHeaderSubtitle());
            PregnancyInsightsHeaderButton cycleReturned = congratulationsHeader.getCycleReturned();
            c27024b = new C27024b(textResourceM21278l7, textResourceM21278l8, cycleReturned != null ? AbstractC28099d.m84914n(cycleReturned) : null);
        } else {
            c27024b = null;
        }
        int i13 = a.f113629a[response.getStyle().ordinal()];
        if (i13 == 1) {
            interfaceC39332eM125323a = p745y81.Function1.m125323a(g.f113644w);
        } else if (i13 == 2) {
            interfaceC39332eM125323a = p745y81.Function1.m125323a(h.f113645w);
        } else if (i13 == 3) {
            interfaceC39332eM125323a = p745y81.Function1.m125323a(i.f113646w);
        } else {
            if (i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            interfaceC39332eM125323a = p745y81.Function1.m125323a(j.f113647w);
        }
        InterfaceC39332e interfaceC39332e = interfaceC39332eM125323a;
        List<Button> buttons = response.getButtons();
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(buttons, 10));
        for (Button button : buttons) {
            arrayList3.add(new C25232g(button.getButtonId(), EnumC16313m0.valueOf(button.getIcon()), AbstractC8693b.m21278l(button.getLabel()), null, 8, null));
        }
        List<SegmentControlDisplay> segmentedControlDisplays = response.getSegmentedControlDisplays();
        if (segmentedControlDisplays != null) {
            List<SegmentControlDisplay> list = segmentedControlDisplays;
            ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            for (SegmentControlDisplay segmentControlDisplay : list) {
                arrayList4.add(new C27033k(segmentControlDisplay.getNameDisplay(), segmentControlDisplay.getId()));
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        PregnancyInsightsGraphModel pregnancyInsightsGraphModelM84907g = AbstractC28099d.m84907g(response, str, str2);
        InterfaceC25312u interfaceC25312uM60541h = (pregnancyInsightsGraphModelM84907g == null || (graph = pregnancyInsightsGraphModelM84907g.getGraph()) == null) ? null : this.reducer.m60541h(graph);
        C21395c c21395c = interfaceC25312uM60541h instanceof C21395c ? (C21395c) interfaceC25312uM60541h : null;
        WhoopCoachVowModel whoopCoachVowModelM84908h = AbstractC28099d.m84908h(response, str, str2);
        InterfaceC25312u interfaceC25312uM60541h2 = whoopCoachVowModelM84908h != null ? this.reducer.m60541h(whoopCoachVowModelM84908h) : null;
        C32048d c32048d = interfaceC25312uM60541h2 instanceof C32048d ? (C32048d) interfaceC25312uM60541h2 : null;
        List<InterfaceC25312u> listM60540g = this.reducer.m60540g(response.getBelowGraphContent());
        PregnancyInsightsGraphModel pregnancyInsightsGraphModelM84907g2 = AbstractC28099d.m84907g(response, str, str2);
        if (pregnancyInsightsGraphModelM84907g2 != null) {
            List<GraphLegendModel> graphLegends = pregnancyInsightsGraphModelM84907g2.getGraphLegends();
            ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(graphLegends, 10));
            Iterator<T> it = graphLegends.iterator();
            while (it.hasNext()) {
                arrayList5.add(AbstractC8693b.m21278l(((GraphLegendModel) it.next()).getLegendText()));
            }
            arrayList2 = arrayList5;
        } else {
            arrayList2 = null;
        }
        BottomSheet bottomSheet = response.getBottomSheet();
        C27023a c27023a = bottomSheet != null ? new C27023a(AbstractC8693b.m21278l(bottomSheet.getTitle()), AbstractC8693b.m21278l(bottomSheet.getEditMethodDisplay()), AbstractC8693b.m21278l(bottomSheet.getEditDateDisplay()), AbstractC8693b.m21278l(bottomSheet.getEditNameDisplay()), AbstractC8693b.m21278l(bottomSheet.getEditWeightDisplay()), AbstractC8693b.m21278l(bottomSheet.getDeleteDisplay()), bottomSheet.getAllowEdit()) : null;
        DeletePregnancyDialog deletePregnancyDialog = response.getDeletePregnancyDialog();
        return new AbstractC27032j.g(new C27029g(pregnancyId, textResourceM21278l, c27025c, c27027e, c27024b, interfaceC39332e, arrayList3, str2, arrayList, str, c21395c, c32048d, listM60540g, arrayList2, c27023a, deletePregnancyDialog != null ? new C27026d(AbstractC8693b.m21278l(deletePregnancyDialog.getTitle()), AbstractC8693b.m21278l(deletePregnancyDialog.getMessage()), AbstractC8693b.m21278l(deletePregnancyDialog.getPrimaryText()), AbstractC8693b.m21278l(deletePregnancyDialog.getSecondaryText())) : null));
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC13058l m84892f(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new b(upstream, this);
    }
}
