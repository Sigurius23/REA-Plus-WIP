package ff1;

import cf1.C4543c;
import cf1.InterfaceC4541a;
import com.whoop.design.models.LegendItemModel;
import com.whoop.design.models.TimeSegmentModel;
import com.whoop.design.models.TrendMetricModel;
import com.whoop.design.models.items.NoDataGraphModel;
import com.whoop.design.models.items.SegmentControllerModel;
import com.whoop.design.models.items.WhoopCoachVowModel;
import com.whoop.design.models.items.graph.GraphModel;
import com.whoop.design.models.items.graph.plane.GraphPlaneModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.exerciseprogressminiarch.domain.models.ExerciseProgressModels;
import e31.C12612d;
import ef1.C13147c;
import ef1.InterfaceC13145a;
import i11.C17863f;
import i91.AbstractC18249c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j71.C21395c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import jb1.C21535a;
import k71.C22246d;
import kd1.AbstractC22403o;
import m83.AbstractC25267u;
import o51.C27539e;
import o51.C27540f;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.C22949e;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import s01.C32048d;
import v41.C35678m;
import vb1.AbstractC35869b;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: ff1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u0007*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\fJ\u001d\u0010!\u001a\u00020 *\u00020\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010#¨\u0006$"}, m65681d2 = {"Lff1/b;", "", "Ljb1/a;", "reducer", "<init>", "(Ljb1/a;)V", "Lcf1/a$b;", "Lef1/c;", "g", "(Lcf1/a$b;)Lef1/c;", "Lcf1/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcf1/c;)Lef1/c;", "Lcom/whoop/design/models/TimeSegmentModel;", "timeSegment", "Lef1/c$c;", "a", "(Lcom/whoop/design/models/TimeSegmentModel;)Lef1/c$c;", "Lcom/whoop/design/models/items/graph/GraphModel;", "graphModel", "", "b", "(Lcom/whoop/design/models/items/graph/GraphModel;)Z", "Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;", "plane", "c", "(Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;)Z", "domainResult", "d", "Lcom/whoop/design/models/LegendItemModel;", "Ly81/f;", "legendTextColor", "Lk71/d;", "e", "(Lcom/whoop/design/models/LegendItemModel;Ly81/f;)Lk71/d;", "Ljb1/a;", "exercise-progress-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14428b {

    /* JADX INFO: renamed from: b */
    public static final int f52652b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer;

    /* JADX INFO: renamed from: ff1.b$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f52654w = new a();

        /* JADX INFO: renamed from: a */
        public final long m41151a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m41151a((C39336i) obj));
        }
    }

    public C14428b(C21535a reducer) {
        AbstractC22676k.m65750j(reducer, "reducer");
        this.reducer = reducer;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00e8  */
    /* JADX INFO: renamed from: a */
    private final C13147c.c m41143a(TimeSegmentModel timeSegment) {
        boolean z4;
        C21395c c21395c;
        ArrayList arrayList;
        List<TrendMetricModel> metrics = timeSegment.getMetrics();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(metrics, 10));
        Iterator<T> it = metrics.iterator();
        boolean z13 = false;
        int i13 = 0;
        while (true) {
            C32048d c32048d = null;
            if (!it.hasNext()) {
                C22949e c22949e = AbstractC22977m.f90651b;
                TextResource textResourceM21278l = AbstractC8693b.m21278l(timeSegment.getDatePicker().getCurrentDateRange());
                String prevDateTime = timeSegment.getDatePicker().getPrevDateTime();
                if (prevDateTime != null) {
                    z4 = prevDateTime.length() > 0;
                } else {
                    z4 = false;
                }
                String nextDateTime = timeSegment.getDatePicker().getNextDateTime();
                if (nextDateTime != null && nextDateTime.length() > 0) {
                    z13 = true;
                }
                boolean z14 = z13;
                String prevDateTime2 = timeSegment.getDatePicker().getPrevDateTime();
                String str = prevDateTime2 == null ? "" : prevDateTime2;
                String nextDateTime2 = timeSegment.getDatePicker().getNextDateTime();
                C17863f c17863f = new C17863f(c22949e, textResourceM21278l, z4, str, z14, nextDateTime2 == null ? "" : nextDateTime2, null, null, null, null, 960, null);
                GraphModel graph = timeSegment.getGraph();
                AbstractC22676k.m65748h(graph, "null cannot be cast to non-null type com.whoop.design.models.items.graph.GraphModel");
                if (m41144b(graph)) {
                    c21395c = null;
                } else {
                    C21535a c21535a = this.reducer;
                    GraphModel graph2 = timeSegment.getGraph();
                    AbstractC22676k.m65748h(graph2, "null cannot be cast to non-null type com.whoop.design.models.items.graph.GraphModel");
                    InterfaceC25312u interfaceC25312uM60541h = c21535a.m60541h(graph2);
                    if (interfaceC25312uM60541h instanceof C21395c) {
                        c21395c = (C21395c) interfaceC25312uM60541h;
                    } else {
                        c21395c = null;
                    }
                }
                List<LegendItemModel> legend = timeSegment.getLegend();
                if (legend != null) {
                    List<LegendItemModel> list = legend;
                    ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                    Iterator<T> it3 = list.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(m41146f(this, (LegendItemModel) it3.next(), null, 1, null));
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                WhoopCoachVowModel whoopCoachVow = timeSegment.getWhoopCoachVow();
                if (whoopCoachVow != null) {
                    InterfaceC25312u interfaceC25312uM60541h2 = this.reducer.m60541h(whoopCoachVow);
                    if (interfaceC25312uM60541h2 instanceof C32048d) {
                        c32048d = (C32048d) interfaceC25312uM60541h2;
                    }
                }
                return new C13147c.c(arrayList2, c17863f, c21395c, arrayList, c32048d);
            }
            Object next = it.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            TrendMetricModel trendMetricModel = (TrendMetricModel) next;
            arrayList2.add(new C35678m(AbstractC8693b.m21278l(trendMetricModel.getMetricName()), AbstractC8693b.m21278l(trendMetricModel.getMetricValue()), AbstractC8693b.m21278l(trendMetricModel.getMetricUnits()), trendMetricModel.getTrendDirection(), trendMetricModel.getTrendStyle(), AbstractC8693b.m21278l(trendMetricModel.getTrendText()), p745y81.Function1.m125323a(a.f52654w), AbstractC8693b.m21267a(), null, null, 768, null));
            i13 = i14;
        }
    }

    /* JADX INFO: renamed from: b */
    private final boolean m41144b(GraphModel graphModel) {
        return graphModel.getPlots().isEmpty() && graphModel.getGraphTitleDisplay() == null && graphModel.getGraphButtons() == null && m41145c(graphModel.getPlane());
    }

    /* JADX INFO: renamed from: c */
    private final boolean m41145c(GraphPlaneModel plane) {
        return plane.getLines().isEmpty() && plane.getAnnotations().isEmpty() && plane.getStartYAxis() == null && plane.getEndYAxis() == null && plane.getBottomXAxis() == null && plane.getTopXAxis() == null && plane.getAccessibilityInfo().getLabel().length() == 0;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ C22246d m41146f(C14428b c14428b, LegendItemModel legendItemModel, EnumC39333f enumC39333f, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC39333f = null;
        }
        return c14428b.m41150e(legendItemModel, enumC39333f);
    }

    /* JADX INFO: renamed from: g */
    private final C13147c m41147g(InterfaceC4541a.b bVar) {
        if (bVar instanceof InterfaceC4541a.a) {
            return new C13147c(new C13147c.a(C12612d.f43056a.m35366a(), null, null, 6, null), null, 2, null);
        }
        if (!(bVar instanceof InterfaceC4541a.c)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC4541a.c cVar = (InterfaceC4541a.c) bVar;
        return new C13147c(C13147c.a.m36805b(new C13147c.a(C12612d.f43056a.m35368c(), null, null, 6, null), null, new InterfaceC13145a.f(cVar.getPath()), new InterfaceC13145a.f(cVar.getPath()), 1, null), null, 2, null);
    }

    /* JADX INFO: renamed from: h */
    private final C13147c m41148h(C4543c c4543c) {
        SegmentControllerModel segmentController;
        NoDataGraphModel noDataGraphState;
        SegmentControllerModel segmentController2;
        List<TimeSegmentModel> timeSegments;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ExerciseProgressModels response = c4543c.getResponse();
        if (response != null && (timeSegments = response.getTimeSegments()) != null) {
            int i13 = 0;
            for (Object obj : timeSegments) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                linkedHashMap.put(Integer.valueOf(i13), m41143a((TimeSegmentModel) obj));
                i13 = i14;
            }
        }
        ExerciseProgressModels response2 = c4543c.getResponse();
        C27540f c27540fM41158g = (response2 == null || (segmentController2 = response2.getSegmentController()) == null) ? null : AbstractC14429c.m41158g(segmentController2);
        ExerciseProgressModels response3 = c4543c.getResponse();
        C27539e c27539e = (response3 == null || (noDataGraphState = response3.getNoDataGraphState()) == null) ? null : new C27539e(AbstractC8693b.m21278l(noDataGraphState.getTitle()), AbstractC8693b.m21278l(noDataGraphState.getSubtitle()), new AbstractC22403o.c(noDataGraphState.getImage(), 0, 0, 0, 14, null));
        Integer selectedIndex = c4543c.getSelectedIndex();
        if (selectedIndex == null) {
            ExerciseProgressModels response4 = c4543c.getResponse();
            selectedIndex = (response4 == null || (segmentController = response4.getSegmentController()) == null) ? null : Integer.valueOf(segmentController.getInitialIndex());
        }
        return new C13147c(null, new C13147c.b(linkedHashMap, c27540fM41158g, c27539e, selectedIndex), 1, null);
    }

    /* JADX INFO: renamed from: d */
    public final C13147c m41149d(C4543c domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        return domainResult.getCurrentDialogType() instanceof InterfaceC4541a.b ? m41147g((InterfaceC4541a.b) domainResult.getCurrentDialogType()) : m41148h(domainResult);
    }

    /* JADX INFO: renamed from: e */
    public final C22246d m41150e(LegendItemModel legendItemModel, EnumC39333f enumC39333f) {
        AbstractC22676k.m65750j(legendItemModel, "<this>");
        return new C22246d(AbstractC35869b.m113876v(legendItemModel.getGraphLegendStyle()), AbstractC8693b.m21278l(legendItemModel.getText()), enumC39333f != null ? AbstractC18249c.m52575m(enumC39333f) : AbstractC18249c.m52575m(EnumC39333f.WHITE_70), AbstractC35869b.m113878x(legendItemModel.getGraphLegendStyle()), null, 16, null);
    }

    public /* synthetic */ C14428b(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC14429c.m41155d() : c21535a);
    }
}
