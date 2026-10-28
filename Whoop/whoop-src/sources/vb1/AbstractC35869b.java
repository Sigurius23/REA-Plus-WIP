package vb1;

import com.whoop.data.remote.domain.dto.CircularProgressStyle;
import com.whoop.data.remote.domain.response.journal.CircularProgressIndicator;
import com.whoop.data.remote.domain.response.journal.CurrentProgressPercentage;
import com.whoop.data.remote.domain.response.journal.CurrentProgressSteps;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.CheckmarkStyle;
import com.whoop.design.models.items.HorizontalImpactBarLabeledModel;
import com.whoop.design.models.items.ImpactBarSegmentModel;
import com.whoop.design.models.items.ImpactBarSegmentTypicalMarker;
import com.whoop.design.models.items.UnlockTrendsCardModel;
import com.whoop.design.models.items.graph.ChartBackgroundStyle;
import com.whoop.design.models.items.graph.GraphCardCtaModel;
import com.whoop.design.models.items.graph.GraphLegendModel;
import com.whoop.design.models.items.graph.GraphLegendTheme;
import com.whoop.design.models.items.graph.GraphModel;
import com.whoop.design.models.items.graph.GraphingCardModel;
import com.whoop.design.models.items.graph.GraphingCardTheme;
import com.whoop.design.models.items.graph.LegendShape;
import com.whoop.design.models.items.graph.PlanProgressStatusModel;
import com.whoop.design.models.items.graph.StressGraphingCardModel;
import com.whoop.design.models.items.graph.StressGraphingCardSize;
import com.whoop.design.models.items.graph.plot.BandPlotModel;
import com.whoop.design.models.items.graph.plot.BarPlotModel;
import com.whoop.design.models.items.graph.plot.CenterScrubBandPlotModel;
import com.whoop.design.models.items.graph.plot.GraphPlot;
import com.whoop.design.models.items.graph.plot.LinePlotModel;
import com.whoop.design.models.items.graph.plot.band.BandDataPointModel;
import com.whoop.design.models.items.graph.plot.band.BandSegmentModel;
import com.whoop.design.models.items.graph.plot.bar.BarGroupModel;
import com.whoop.design.models.items.graph.plot.bar.BarModel;
import com.whoop.design.models.items.graph.plot.line.LineDataPointModel;
import com.whoop.design.models.items.graph.plot.line.LineSegmentModel;
import com.whoop.design.models.items.graph.stress.StressStateKt;
import com.whoop.design.util.AbstractC8692a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.util.TrendKey;
import gb1.AbstractC15693u;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import j61.C21374h;
import j71.C21395c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import k71.C22245c0;
import k71.C22246d;
import k71.C22256m;
import k71.C22259p;
import k71.EnumC22244c;
import kd1.EnumC22400l;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import n21.EnumC26195i;
import no.nordicsemi.android.dfu.DfuBaseService;
import p01.C28582b;
import p01.EnumC28588h;
import p181h2.C16618c;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.C22673i0;
import p716lb1.C23639h2;
import p716lb1.C23732w1;
import p716lb1.C23743y0;
import p716lb1.C23749z0;
import p716lb1.Function1;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import p81.C28971c;
import to1.C34015h;
import wb1.AbstractC37048i;
import x11.C37829c;
import x81.C38072d;
import xb1.AbstractC38164c;
import y11.C39064q;
import y11.C39065r;
import y11.C39067t;
import y71.C39274g;

/* JADX INFO: renamed from: vb1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a!\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\f\u0010\u000b\u001a\u001d\u0010\u0011\u001a\u00020\u0010*\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0019\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020$0#H\u0002¢\u0006\u0004\b&\u0010'\"\u001a\u0010-\u001a\u00020(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0014\u00100\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/GraphingCardModel;", "model", "Ljb1/a;", "reducer", "Lk71/p;", "y", "(Lcom/whoop/design/models/items/graph/GraphingCardModel;Ljb1/a;)Lk71/p;", "", "horizontalPosition", "", "k", "(Ljava/lang/Double;)F", "j", "Lcom/whoop/design/models/items/graph/GraphLegendModel;", "Ly81/f;", "legendTextColor", "Lk71/d;", "z", "(Lcom/whoop/design/models/items/graph/GraphLegendModel;Ly81/f;)Lk71/d;", "", "style", "Li91/a;", "v", "(Ljava/lang/String;)Li91/a;", "Ln21/i;", "x", "(Ljava/lang/String;)Ln21/i;", "Lm91/u;", "B", "(Lm91/u;)Lm91/u;", "Lcom/whoop/design/models/items/graph/GraphModel;", "graphModel", "Lj71/c;", "t", "(Lcom/whoop/design/models/items/graph/GraphModel;)Lj71/c;", "", "Lcom/whoop/design/models/items/graph/plot/GraphPlot;", "", "u", "(Ljava/util/List;)Z", "Llb1/y0;", "a", "Llb1/y0;", "l", "()Llb1/y0;", "graphMapper", "m", "()Ljb1/a;", "stressGraphReducer", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35869b {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f152702a = Function1.m68251a(new C34015h(26));

    /* JADX INFO: renamed from: vb1.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements p715kotlin.jvm.functions.Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            C21395c c21395c = (C21395c) it;
            C21374h plane = c21395c.getPlane();
            return C21395c.m60092b(c21395c, plane.m59985a((8187 & 1) != 0 ? plane.startVerticalAxis : null, (8187 & 2) != 0 ? plane.endVerticalAxis : null, (8187 & 4) != 0 ? plane.bottomHorizontalAxis : null, (8187 & 8) != 0 ? plane.topHorizontalAxis : null, (8187 & 16) != 0 ? plane.insets : new C16618c(-0.01f, 0.04f, 0.025f, 0.075f), (8187 & 32) != 0 ? plane.lines : null, (8187 & 64) != 0 ? plane.graphAnnotations : null, (8187 & 128) != 0 ? plane.accessibilityState : null, (8187 & 256) != 0 ? plane.scrubberEnabled : false, (8187 & 512) != 0 ? plane.clickable : false, (8187 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? plane.buttons : null, (8187 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? plane.longPressTimeoutMillis : 0L, (8187 & 4096) != 0 ? plane.horizontalGridLinePadding : 0.0f), null, null, null, 14, null);
        }
    }

    /* JADX INFO: renamed from: vb1.b$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b extends C22672i implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f152703w = new b();

        public b() {
            super(1, AbstractC35869b.class, "graphModelToGraphState", "graphModelToGraphState(Lcom/whoop/design/models/items/graph/GraphModel;)Lcom/whoop/design/atomic/organism/graph/state/GraphState;", 1);
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C21395c invoke(GraphModel p13) {
            AbstractC22676k.m65750j(p13, "p0");
            return AbstractC35869b.m113874t(p13);
        }
    }

    /* JADX INFO: renamed from: vb1.b$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f152704w;

        public c(p715kotlin.jvm.functions.Function1 function1) {
            this.f152704w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f152704w.invoke((GraphModel) it);
        }
    }

    /* JADX INFO: renamed from: vb1.b$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f152705w;

        public d(p715kotlin.jvm.functions.Function1 function1) {
            this.f152705w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f152705w.invoke((GraphingCardModel) it);
        }
    }

    /* JADX INFO: renamed from: vb1.b$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f152706w;

        public e(p715kotlin.jvm.functions.Function1 function1) {
            this.f152706w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f152706w.invoke((GraphCardCtaModel) it);
        }
    }

    /* JADX INFO: renamed from: vb1.b$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f152707w;

        public f(p715kotlin.jvm.functions.Function1 function1) {
            this.f152707w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f152707w.invoke((StressGraphingCardModel) it);
        }
    }

    /* JADX INFO: renamed from: vb1.b$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f152708w;

        public g(p715kotlin.jvm.functions.Function1 function1) {
            this.f152708w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f152708w.invoke((HorizontalImpactBarLabeledModel) it);
        }
    }

    /* JADX INFO: renamed from: vb1.b$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f152709w;

        public h(p715kotlin.jvm.functions.Function1 function1) {
            this.f152709w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f152709w.invoke((ImpactBarSegmentModel) it);
        }
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ C22246d m113853A(GraphLegendModel graphLegendModel, EnumC39333f enumC39333f, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC39333f = null;
        }
        return m113880z(graphLegendModel, enumC39333f);
    }

    /* JADX INFO: renamed from: B */
    private static final InterfaceC25312u m113854B(InterfaceC25312u interfaceC25312u) {
        C21395c c21395c = interfaceC25312u instanceof C21395c ? (C21395c) interfaceC25312u : null;
        if (c21395c == null) {
            return interfaceC25312u;
        }
        C21374h plane = c21395c.getPlane();
        return C21395c.m60092b(c21395c, plane.m59985a((8187 & 1) != 0 ? plane.startVerticalAxis : null, (8187 & 2) != 0 ? plane.endVerticalAxis : null, (8187 & 4) != 0 ? plane.bottomHorizontalAxis : null, (8187 & 8) != 0 ? plane.topHorizontalAxis : null, (8187 & 16) != 0 ? plane.insets : C16618c.f63938e, (8187 & 32) != 0 ? plane.lines : null, (8187 & 64) != 0 ? plane.graphAnnotations : null, (8187 & 128) != 0 ? plane.accessibilityState : null, (8187 & 256) != 0 ? plane.scrubberEnabled : false, (8187 & 512) != 0 ? plane.clickable : false, (8187 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? plane.buttons : null, (8187 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? plane.longPressTimeoutMillis : 0L, (8187 & 4096) != 0 ? plane.horizontalGridLinePadding : 0.0f), null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m113863i(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60546a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21395c.class), new a());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    public static final float m113864j(Double d3) {
        if (d3 != null) {
            double dDoubleValue = d3.doubleValue();
            if (dDoubleValue > 0.5d) {
                return (float) dDoubleValue;
            }
        }
        return 0.5f;
    }

    /* JADX INFO: renamed from: k */
    public static final float m113865k(Double d3) {
        if (d3 != null) {
            double dDoubleValue = d3.doubleValue();
            if (dDoubleValue < 0.5d) {
                return (float) dDoubleValue;
            }
        }
        return 0.5f;
    }

    /* JADX INFO: renamed from: l */
    public static final C23743y0 m113866l() {
        return f152702a;
    }

    /* JADX INFO: renamed from: m */
    public static final C21535a m113867m() {
        return AbstractC21537c.m60554d(new C35868a(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m113868n(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        b bVar = b.f152703w;
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(GraphModel.class), new c(bVar));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(GraphingCardModel.class), new d(new C23732w1(designModelMapper, 1)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(GraphCardCtaModel.class), new e(new C34015h(27)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(StressGraphingCardModel.class), new f(new C34015h(28)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(HorizontalImpactBarLabeledModel.class), new g(new C34015h(29)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ImpactBarSegmentModel.class), new h(new C35868a(0)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:115:0x022a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d8  */
    /* JADX INFO: renamed from: o */
    public static final C22256m m113869o(C23749z0 c23749z0, GraphingCardModel model) {
        ArrayList arrayList;
        String strConcat;
        C39274g c39274g;
        EnumC22244c enumC22244c;
        C28582b c28582b;
        C28971c c28971c;
        String strName;
        TrendKey trendKey;
        AbstractC22676k.m65750j(model, "model");
        C21535a c21535aM60555e = AbstractC21537c.m60555e(null, 1, null);
        List<GraphLegendModel> graphLegends = model.getGraphLegends();
        if (graphLegends != null) {
            List<GraphLegendModel> list = graphLegends;
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(m113853A((GraphLegendModel) it.next(), null, 1, null));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        C22246d c22246d = arrayList != null ? (C22246d) AbstractC25265s.m74102I0(0, arrayList) : null;
        C22246d c22246d2 = arrayList != null ? (C22246d) AbstractC25265s.m74102I0(1, arrayList) : null;
        GraphingCardTheme theme = model.getTheme();
        boolean z4 = (theme != null ? theme.getBackgroundStyle() : null) == ChartBackgroundStyle.TRANSPARENT;
        InterfaceC25312u interfaceC25312uM60544l = c21535aM60555e.m60544l(model.getGraph());
        if (interfaceC25312uM60544l == null) {
            interfaceC25312uM60544l = m113874t(model.getGraph());
        }
        if (z4) {
            interfaceC25312uM60544l = m113854B(interfaceC25312uM60544l);
        }
        InterfaceC25312u interfaceC25312u = interfaceC25312uM60544l;
        Object destination = model.getDestination();
        if (destination == null) {
            String trendsCta = model.getTrendsCta();
            if (trendsCta != null) {
                Object obj = TrendKey.NONE;
                TrendKey[] trendKeyArrValues = TrendKey.values();
                int length = trendKeyArrValues.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        trendKey = null;
                        break;
                    }
                    trendKey = trendKeyArrValues[i13];
                    if (AbstractC22676k.m65745e(trendKey.name(), trendsCta)) {
                        break;
                    }
                    i13++;
                }
                if (trendKey != null) {
                    obj = trendKey;
                }
                destination = obj;
            } else {
                destination = null;
            }
            if (destination == null) {
                destination = TrendKey.NONE;
            }
        }
        Object obj2 = destination;
        String id4 = model.getId();
        if (id4 == null) {
            id4 = "";
        }
        String str = id4;
        String strM21265c = AbstractC8692a.m21265c(model.getTitle());
        if (strM21265c == null) {
            strConcat = null;
        } else {
            if (strM21265c.length() <= 0) {
                strM21265c = null;
            }
            if (strM21265c != null) {
                strConcat = "DeepDiveWeeklyTrends_".concat(strM21265c);
            } else {
                strConcat = null;
            }
        }
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitle());
        GraphingCardTheme theme2 = model.getTheme();
        boolean z13 = (theme2 != null ? theme2.getBackgroundStyle() : null) == ChartBackgroundStyle.AI_GRADIENT;
        GraphingCardTheme theme3 = model.getTheme();
        boolean zM65745e = theme3 != null ? AbstractC22676k.m65745e(theme3.getPreserveLabelCasing(), Boolean.TRUE) : false;
        String icon = model.getIcon();
        if (icon != null) {
            Integer numM46376a = AbstractC16315n0.m46376a(icon);
            c39274g = new C39274g(numM46376a != null ? numM46376a.intValue() : C38072d.f163053a.m121951d().getActivities().getOther(), null, 2, null);
        } else {
            c39274g = null;
        }
        EnumC16313m0 endIcon = model.getEndIcon();
        CheckmarkStyle checkmarkStyle = model.getCheckmarkStyle();
        if (checkmarkStyle != null && (strName = checkmarkStyle.name()) != null) {
            EnumC22244c[] enumC22244cArrValues = EnumC22244c.values();
            int length2 = enumC22244cArrValues.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length2) {
                    enumC22244c = null;
                    break;
                }
                enumC22244c = enumC22244cArrValues[i14];
                if (AbstractC22676k.m65745e(enumC22244c.name(), strName)) {
                    break;
                }
                i14++;
            }
        } else {
            enumC22244c = null;
            break;
        }
        String progressDisplay = model.getProgressDisplay();
        TextResource textResourceM21278l2 = progressDisplay != null ? AbstractC8693b.m21278l(progressDisplay) : null;
        String sevenDayVow = model.getSevenDayVow();
        TextResource textResourceM21278l3 = sevenDayVow != null ? AbstractC8693b.m21278l(sevenDayVow) : null;
        C22259p c22259pM113879y = m113879y(model, c21535aM60555e);
        CircularProgressIndicator circularProgressIndicator = model.getCircularProgressIndicator();
        if (circularProgressIndicator == null) {
            c28582b = null;
        } else {
            CurrentProgressSteps currentProgressSteps = circularProgressIndicator.getCurrentProgressSteps();
            if (currentProgressSteps != null) {
                c28582b = new C28582b(currentProgressSteps.getTotalSteps(), currentProgressSteps.getCurrentStep(), 0.0f, currentProgressSteps.getTextDisplay(), null, null, Boolean.valueOf(currentProgressSteps.getStyle() == CircularProgressStyle.WEEKLY_PLAN_COMPLETE), null, null, null, null, null, 0.0f, 0.0f, 0.0f, false, false, 0L, EnumC28588h.STEPS, null, 786356, null);
            } else {
                CurrentProgressPercentage currentProgressPercentage = circularProgressIndicator.getCurrentProgressPercentage();
                if (currentProgressPercentage != null) {
                    c28582b = new C28582b(0, 0, (float) (currentProgressPercentage.getPercentage() / ((double) 100)), currentProgressPercentage.getTextDisplay(), null, null, Boolean.valueOf(currentProgressPercentage.getStyle() == CircularProgressStyle.WEEKLY_PLAN_COMPLETE), null, null, null, null, null, 0.0f, 0.0f, 0.0f, false, false, 0L, EnumC28588h.PERCENTAGE, null, 786355, null);
                } else {
                    c28582b = null;
                }
            }
        }
        C9598e destination2 = model.getDestination();
        UnlockTrendsCardModel unlockTrendsCard = model.getUnlockTrendsCard();
        if (unlockTrendsCard != null) {
            InterfaceC25312u interfaceC25312uM60541h = c21535aM60555e.m60541h(unlockTrendsCard);
            c28971c = interfaceC25312uM60541h instanceof C28971c ? (C28971c) interfaceC25312uM60541h : null;
        } else {
            c28971c = null;
        }
        List<DesignSystemModel> subItems = model.getSubItems();
        return new C22256m(obj2, str, strConcat, textResourceM21278l, c22246d, c22246d2, arrayList, interfaceC25312u, null, z13, z4, zM65745e, c39274g, endIcon, enumC22244c, textResourceM21278l2, textResourceM21278l3, c22259pM113879y, c28582b, destination2, c28971c, null, subItems != null ? c21535aM60555e.m60540g(subItems) : null, 2097408, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C37829c m113870p(GraphCardCtaModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C37829c(model.getTrendKey(), model.getCtaMessage(), model.getButtonLabel());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C22245c0 m113871q(StressGraphingCardModel model) {
        TextResource textResourceM21267a;
        TextResource textResourceM21267a2;
        TextResource textResourceM21267a3;
        EnumC22400l enumC22400l;
        AbstractC22676k.m65750j(model, "model");
        C21535a c21535aM60555e = AbstractC21537c.m60555e(null, 1, null);
        String title = model.getTitle();
        if (title == null || (textResourceM21267a = AbstractC8693b.m21278l(title)) == null) {
            textResourceM21267a = AbstractC8693b.m21267a();
        }
        TextResource textResource = textResourceM21267a;
        InterfaceC39332e whoopColor = StressStateKt.toWhoopColor(model.getStressGraphState());
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getStressGraphLabel());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getStressGraphScore());
        String lastUpdatedText = model.getLastUpdatedText();
        if (lastUpdatedText == null || (textResourceM21267a2 = AbstractC8693b.m21278l(lastUpdatedText)) == null) {
            textResourceM21267a2 = AbstractC8693b.m21267a();
        }
        TextResource textResource2 = textResourceM21267a2;
        InterfaceC25312u interfaceC25312uM60541h = m113867m().m60541h(model.getGraph());
        String stressGraphVowDisplay = model.getStressGraphVowDisplay();
        if (stressGraphVowDisplay == null || (textResourceM21267a3 = AbstractC8693b.m21278l(stressGraphVowDisplay)) == null) {
            textResourceM21267a3 = AbstractC8693b.m21267a();
        }
        TextResource textResource3 = textResourceM21267a3;
        int i13 = 0;
        boolean z4 = model.getSize() == StressGraphingCardSize.COMPACT;
        String icon = model.getIcon();
        C39274g c39274g = icon != null ? new C39274g(AbstractC16315n0.m46381f(icon, null, 1, null), null, 2, null) : null;
        String cta = model.getCta();
        if (cta == null) {
            cta = "";
        }
        EnumC22400l[] enumC22400lArrValues = EnumC22400l.values();
        int length = enumC22400lArrValues.length;
        while (true) {
            if (i13 >= length) {
                enumC22400l = null;
                break;
            }
            EnumC22400l enumC22400l2 = enumC22400lArrValues[i13];
            if (AbstractC22676k.m65745e(enumC22400l2.name(), cta)) {
                enumC22400l = enumC22400l2;
                break;
            }
            i13++;
        }
        List<DesignSystemModel> subItems = model.getSubItems();
        return new C22245c0(null, null, textResource, textResourceM21278l, whoopColor, textResourceM21278l2, textResource2, 1.9318181f, interfaceC25312uM60541h, textResource3, z4, c39274g, enumC22400l, subItems != null ? c21535aM60555e.m60540g(subItems) : null, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C39064q m113872r(HorizontalImpactBarLabeledModel model) {
        AbstractC22676k.m65750j(model, "model");
        C21535a c21535aM60555e = AbstractC21537c.m60555e(null, 1, null);
        String labelDisplay = model.getLabelDisplay();
        EnumC39333f enumC39333fM68833d = C23639h2.f93783a.m68833d(model.getImpactBarSegment().getImpactStyle());
        InterfaceC25312u interfaceC25312uM60544l = c21535aM60555e.m60544l(model.getImpactBarSegment());
        return new C39064q(labelDisplay, enumC39333fM68833d, interfaceC25312uM60544l instanceof C39065r ? (C39065r) interfaceC25312uM60544l : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C39065r m113873s(ImpactBarSegmentModel model) {
        AbstractC22676k.m65750j(model, "model");
        float fM113865k = m113865k(model.getHorizontalPosition());
        float fM113864j = m113864j(model.getHorizontalPosition());
        EnumC39333f enumC39333fM68831b = C23639h2.f93783a.m68831b(model.getImpactStyle());
        TextResource markerTextDisplay = model.getMarkerTextDisplay();
        ImpactBarSegmentTypicalMarker segmentMarker = model.getSegmentMarker();
        return new C39065r(0.5f, null, fM113865k, fM113864j, enumC39333fM68831b, markerTextDisplay, segmentMarker != null ? new C39067t(Float.valueOf((float) segmentMarker.getMarkerPosition()), segmentMarker.getMarkerLabelDisplay(), segmentMarker.getMarkerSublabelDisplay()) : null, 2, null);
    }

    /* JADX INFO: renamed from: t */
    public static final C21395c m113874t(GraphModel graphModel) {
        AbstractC22676k.m65750j(graphModel, "graphModel");
        return new C21395c(AbstractC37048i.m118933a(graphModel.getPlane(), m113875u(graphModel.getPlots()), graphModel.getGraphButtons()), AbstractC38164c.m122259a(graphModel.getPlots()), graphModel.getLayoutDirection(), null, 8, null);
    }

    /* JADX INFO: renamed from: u */
    private static final boolean m113875u(List<? extends GraphPlot> list) {
        List<? extends GraphPlot> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (GraphPlot graphPlot : list2) {
            if (graphPlot instanceof BarPlotModel) {
                BarPlotModel barPlotModel = (BarPlotModel) graphPlot;
                List<BarGroupModel> barGroups = barPlotModel.getBarGroups();
                if (!(barGroups instanceof Collection) || !barGroups.isEmpty()) {
                    Iterator<T> it = barGroups.iterator();
                    while (it.hasNext()) {
                        if (((BarGroupModel) it.next()).getDataScrubberDetails() != null) {
                            return true;
                        }
                    }
                }
                List<BarGroupModel> barGroups2 = barPlotModel.getBarGroups();
                if (!(barGroups2 instanceof Collection) || !barGroups2.isEmpty()) {
                    Iterator<T> it3 = barGroups2.iterator();
                    while (it3.hasNext()) {
                        List<BarModel> bars = ((BarGroupModel) it3.next()).getBars();
                        if (!(bars instanceof Collection) || !bars.isEmpty()) {
                            Iterator<T> it4 = bars.iterator();
                            while (it4.hasNext()) {
                                if (((BarModel) it4.next()).getDataScrubberDetails() != null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            } else if (graphPlot instanceof BandPlotModel) {
                List<BandSegmentModel> segments = ((BandPlotModel) graphPlot).getSegments();
                if (!(segments instanceof Collection) || !segments.isEmpty()) {
                    Iterator<T> it5 = segments.iterator();
                    while (it5.hasNext()) {
                        List<BandDataPointModel> points = ((BandSegmentModel) it5.next()).getPoints();
                        if (!(points instanceof Collection) || !points.isEmpty()) {
                            Iterator<T> it6 = points.iterator();
                            while (it6.hasNext()) {
                                if (((BandDataPointModel) it6.next()).getDataScrubberDetails() != null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            } else if (graphPlot instanceof CenterScrubBandPlotModel) {
                List<BandSegmentModel> segments2 = ((CenterScrubBandPlotModel) graphPlot).getSegments();
                if (!(segments2 instanceof Collection) || !segments2.isEmpty()) {
                    Iterator<T> it7 = segments2.iterator();
                    while (it7.hasNext()) {
                        List<BandDataPointModel> points2 = ((BandSegmentModel) it7.next()).getPoints();
                        if (!(points2 instanceof Collection) || !points2.isEmpty()) {
                            Iterator<T> it8 = points2.iterator();
                            while (it8.hasNext()) {
                                if (((BandDataPointModel) it8.next()).getDataScrubberDetails() != null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            } else if (graphPlot instanceof LinePlotModel) {
                List<LineSegmentModel> segments3 = ((LinePlotModel) graphPlot).getSegments();
                if (!(segments3 instanceof Collection) || !segments3.isEmpty()) {
                    Iterator<T> it9 = segments3.iterator();
                    while (it9.hasNext()) {
                        List<LineDataPointModel> points3 = ((LineSegmentModel) it9.next()).getPoints();
                        if (!(points3 instanceof Collection) || !points3.isEmpty()) {
                            Iterator<T> it10 = points3.iterator();
                            while (it10.hasNext()) {
                                if (((LineDataPointModel) it10.next()).getDataScrubberDetails() != null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0187, code lost:
    
        if (r1.equals("SAGE") == false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01a2, code lost:
    
        if (r1.equals("STRESS_LOW") == false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01ce, code lost:
    
        if (r1.equals("LOW_STRESS") == false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01d8, code lost:
    
        return i91.AbstractC18249c.m52575m(p745y81.EnumC39333f.RECOVERY);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01f0, code lost:
    
        if (r1.equals("CUFF_READING") == false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01fa, code lost:
    
        return i91.AbstractC18249c.m52575m(p745y81.EnumC39333f.WHITE_70);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0212, code lost:
    
        if (r1.equals("MEDIUM_STRESS") == false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x021c, code lost:
    
        return i91.AbstractC18249c.m52575m(p745y81.EnumC39333f.ACCENT_POSITIVE_TREND);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0234, code lost:
    
        if (r1.equals("BODY_COMPOSITION_FAT") == false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x023e, code lost:
    
        if (r1.equals("STRESS_HIGH") == false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0248, code lost:
    
        return i91.AbstractC18249c.m52575m(p745y81.EnumC39333f.ACCENT_NEGATIVE_TREND);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x024f, code lost:
    
        if (r1.equals("BODY_FAT") == false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0258, code lost:
    
        return i91.AbstractC18249c.m52575m(p745y81.EnumC39333f.STRAIN_ZONE_4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c6, code lost:
    
        if (r1.equals("BODY_COMPOSITION_LEAN") == false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d0, code lost:
    
        if (r1.equals("STRESS_MEDIUM") == false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00da, code lost:
    
        if (r1.equals("LEAN_BODY_MASS") == false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e4, code lost:
    
        return i91.AbstractC18249c.m52575m(p745y81.EnumC39333f.SLEEP_LIGHT_SLEEP);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00eb, code lost:
    
        if (r1.equals("SAGE_MANUAL_ENTRY") == false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0139, code lost:
    
        if (r1.equals("HIGH_STRESS") == false) goto L204;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final i91.AbstractC18247a m113876v(java.lang.String r1) {
        /*
            Method dump skipped, instruction units count: 872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vb1.AbstractC35869b.m113876v(java.lang.String):i91.a");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final AbstractC17911t m113877w(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        C17909s c17909s = AbstractC17911t.f69612b;
        C23465k c23465k = new C23465k(Float.valueOf(0.0f), new C17919x(brushBackground.getAccentNegativeTrend()));
        Float fValueOf = Float.valueOf(0.5f);
        return AbstractC15693u.m44157d(c17909s, new C23465k[]{c23465k, new C23465k(fValueOf, new C17919x(brushBackground.getAccentNegativeTrend())), new C23465k(fValueOf, new C17919x(brushBackground.getAccentPositiveTrend())), new C23465k(Float.valueOf(1.0f), new C17919x(brushBackground.getAccentPositiveTrend()))}, 0, 315.0f, false, 10, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0134, code lost:
    
        if (r1.equals("STRESS_HIGH") == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0139, code lost:
    
        return n21.EnumC26195i.SQUARE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0140, code lost:
    
        if (r1.equals("LUTEAL_PHASE") == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r1.equals("ZONE_4") == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0161, code lost:
    
        if (r1.equals("FOLLICULAR_PHASE") == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0168, code lost:
    
        return n21.EnumC26195i.CAPSULE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if (r1.equals("ZONE_3") == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r1.equals("ZONE_2") == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (r1.equals("ZONE_1") == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        return n21.EnumC26195i.SQUARE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        if (r1.equals("WHOOP_AGE") == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
    
        if (r1.equals("BIOMARKER_SUFFICIENT") == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006d, code lost:
    
        if (r1.equals("STRESS_MEDIUM") == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0077, code lost:
    
        if (r1.equals("SAGE_MANUAL_ENTRY") == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0081, code lost:
    
        if (r1.equals("MENSTRUAL_PHASE") == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008b, code lost:
    
        if (r1.equals("OVULATORY_PHASE") == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0095, code lost:
    
        if (r1.equals("BIOMARKER_NEGATIVE") == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ac, code lost:
    
        if (r1.equals("HIGH_STRESS") == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b6, code lost:
    
        if (r1.equals("BIOMARKER_POSITIVE") == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c0, code lost:
    
        if (r1.equals("REM_SLEEP") == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ca, code lost:
    
        if (r1.equals("DEEP_SLEEP") == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e1, code lost:
    
        if (r1.equals("STRESS_LOW") == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00eb, code lost:
    
        if (r1.equals("SLEEP_HOURS") == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f5, code lost:
    
        if (r1.equals("BIOMARKER_NEUTRAL") == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r1.equals("ZONE_5") == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00fb, code lost:
    
        return n21.EnumC26195i.CAPSULE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0102, code lost:
    
        if (r1.equals("LOW_STRESS") == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x010b, code lost:
    
        if (r1.equals("CUFF_READING") == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0110, code lost:
    
        return n21.EnumC26195i.THIN_CAPSULE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0117, code lost:
    
        if (r1.equals("CHRONOLOGICAL_AGE") != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x011b, code lost:
    
        return n21.EnumC26195i.SQUARE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0122, code lost:
    
        if (r1.equals("MEDIUM_STRESS") == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x012b, code lost:
    
        if (r1.equals("EXPECTED_TREND") == false) goto L120;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final n21.EnumC26195i m113878x(java.lang.String r1) {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vb1.AbstractC35869b.m113878x(java.lang.String):n21.i");
    }

    /* JADX INFO: renamed from: y */
    private static final C22259p m113879y(GraphingCardModel graphingCardModel, C21535a c21535a) {
        PlanProgressStatusModel planProgressStatus = graphingCardModel.getPlanProgressStatus();
        if (planProgressStatus != null) {
            return new C22259p(AbstractC8693b.m21278l(planProgressStatus.getTitle()), AbstractC8693b.m21278l(planProgressStatus.getSubtitle()), c21535a.m60541h(planProgressStatus.getProgressBreakdown()));
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    public static final C22246d m113880z(GraphLegendModel graphLegendModel, EnumC39333f enumC39333f) {
        AbstractC18247a abstractC18247aM113876v;
        EnumC26195i enumC26195iM113878x;
        LegendShape shape;
        EnumC39333f fillColor;
        AbstractC22676k.m65750j(graphLegendModel, "<this>");
        GraphLegendTheme theme = graphLegendModel.getTheme();
        if (theme == null || (fillColor = theme.getFillColor()) == null || (abstractC18247aM113876v = AbstractC18249c.m52575m(fillColor)) == null) {
            abstractC18247aM113876v = m113876v(graphLegendModel.getGraphLegendStyle());
        }
        AbstractC18247a abstractC18247a = abstractC18247aM113876v;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(graphLegendModel.getLegendText());
        AbstractC18247a abstractC18247aM52575m = enumC39333f != null ? AbstractC18249c.m52575m(enumC39333f) : m113876v(graphLegendModel.getGraphLegendStyle());
        GraphLegendTheme theme2 = graphLegendModel.getTheme();
        if (theme2 == null || (shape = theme2.getShape()) == null || (enumC26195iM113878x = AbstractC35870c.m113889a(shape)) == null) {
            enumC26195iM113878x = m113878x(graphLegendModel.getGraphLegendStyle());
        }
        return new C22246d(abstractC18247a, textResourceM21278l, abstractC18247aM52575m, enumC26195iM113878x, AbstractC16315n0.m46377b(graphLegendModel.getIcon()));
    }
}
