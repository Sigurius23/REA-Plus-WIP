package wc1;

import com.whoop.data.remote.domain.response.journal.CircularProgressIndicator;
import com.whoop.design.models.items.CheckmarkStyle;
import com.whoop.design.models.items.UnlockTrendsCardModel;
import com.whoop.design.models.items.graph.ChartBackgroundStyle;
import com.whoop.design.models.items.graph.GraphLegendModel;
import com.whoop.design.models.items.graph.GraphLegendTheme;
import com.whoop.design.models.items.graph.GraphModel;
import com.whoop.design.models.items.graph.GraphingCardModel;
import com.whoop.design.models.items.graph.GraphingCardTheme;
import com.whoop.design.models.items.graph.LayoutDirection;
import com.whoop.design.models.items.graph.LegendShape;
import com.whoop.design.models.items.graph.PlanProgressStatusModel;
import com.whoop.design.models.items.graph.plane.GraphAccessibilityModel;
import com.whoop.design.models.items.graph.plane.GraphPlaneModel;
import com.whoop.design.models.items.graph.plane.axis.GraphAxisModel;
import com.whoop.design.models.items.graph.plane.axis.GraphAxisTheme;
import com.whoop.design.models.items.graph.plane.axis.label.AxisLabelModel;
import com.whoop.design.models.items.graph.plane.axis.label.AxisLabelStyle;
import com.whoop.design.models.items.graph.plane.button.GraphButtons;
import com.whoop.design.models.items.graph.plot.BarPlotModel;
import com.whoop.design.models.items.graph.plot.DiagonalPoints;
import com.whoop.design.models.items.graph.plot.GraphPlotLabelModel;
import com.whoop.design.models.items.graph.plot.LinePlotModel;
import com.whoop.design.models.items.graph.plot.bar.BarGroupModel;
import com.whoop.design.models.items.graph.plot.bar.BarModel;
import com.whoop.design.models.items.graph.plot.bar.BarStyle;
import com.whoop.design.models.items.graph.plot.bar.BarTheme;
import com.whoop.design.models.items.graph.plot.bar.BarWidth;
import com.whoop.design.models.items.graph.plot.line.DashPattern;
import com.whoop.design.models.items.graph.plot.line.FillOpacity;
import com.whoop.design.models.items.graph.plot.line.LineDataPointModel;
import com.whoop.design.models.items.graph.plot.line.LinePlotStyle;
import com.whoop.design.models.items.graph.plot.line.LinePlotTheme;
import com.whoop.design.models.items.graph.plot.line.LinePointStyle;
import com.whoop.design.models.items.graph.plot.line.LinePointTheme;
import com.whoop.design.models.items.graph.plot.line.LineSegmentModel;
import com.whoop.design.models.items.graph.plot.line.LineWidth;
import com.whoop.design.models.items.graph.plot.line.PointShape;
import com.whoop.design.models.items.graph.plot.line.PointSize;
import com.whoop.design.models.items.graph.plot.line.PointVisibility;
import com.whoop.design.models.items.graph.plot.scrubber.DataScrubberDetailsModel;
import com.whoop.navigation.C9598e;
import com.whoop.service.network.model.UserSessionDto;
import g61.EnumC15530c;
import g61.EnumC15531d;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25267u;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: wc1.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\tJ+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001d\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001f\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\"\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001cR\u0017\u0010$\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b#\u0010\u001c¨\u0006%"}, m65681d2 = {"Lwc1/b;", "", "<init>", "()V", "", "withTheme", "", "Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;", "b", "(Z)Ljava/util/List;", "Lcom/whoop/design/models/items/graph/plot/line/LineSegmentModel;", "i", "(Z)Lcom/whoop/design/models/items/graph/plot/line/LineSegmentModel;", "Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;", "a", "(Z)Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;", "Lcom/whoop/design/models/items/graph/GraphLegendModel;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "", "title", "withPlotTheme", "Lcom/whoop/design/models/items/graph/GraphingCardTheme;", "cardTheme", "Lcom/whoop/design/models/items/graph/GraphingCardModel;", "c", "(Ljava/lang/String;ZLcom/whoop/design/models/items/graph/GraphingCardTheme;)Lcom/whoop/design/models/items/graph/GraphingCardModel;", "Lcom/whoop/design/models/items/graph/GraphingCardModel;", "f", "()Lcom/whoop/design/models/items/graph/GraphingCardModel;", "baseline", "g", "plotTheme", "d", "e", "aiGradientCard", "getSegmentMerge", "segmentMerge", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37134b {

    /* JADX INFO: renamed from: a */
    public static final C37134b f158869a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final GraphingCardModel baseline;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final GraphingCardModel plotTheme;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final GraphingCardModel aiGradientCard;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final GraphingCardModel segmentMerge;

    /* JADX INFO: renamed from: f */
    public static final int f158874f;

    static {
        C37134b c37134b = new C37134b();
        f158869a = c37134b;
        baseline = m119056d(c37134b, "No Overrides", false, null, 4, null);
        plotTheme = m119056d(c37134b, "Plot Overrides", true, null, 4, null);
        aiGradientCard = c37134b.m119055c("AI Gradient + Mixed Case", true, new GraphingCardTheme(ChartBackgroundStyle.AI_GRADIENT, Boolean.TRUE));
        int i13 = 0;
        GraphPlaneModel graphPlaneModel = new GraphPlaneModel((List) null, (List) null, (GraphAccessibilityModel) null, c37134b.m119053a(false), (GraphAxisModel) null, c37134b.m119053a(false), (GraphAxisModel) null, 87, (DefaultConstructorMarker) null);
        List listM118959K = AbstractC37056f.m118959K(Double.valueOf(0.1d), Double.valueOf(0.5d), Double.valueOf(0.3d), Double.valueOf(0.8d), Double.valueOf(0.55d));
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM118959K, 10));
        for (Object obj : listM118959K) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            arrayList.add(new LineDataPointModel(true, ((double) i14) / 6.0d, ((Number) obj).doubleValue(), LinePointStyle.STRAIN, (String) null, (DataScrubberDetailsModel) null, (GraphPlotLabelModel) null, (LinePointTheme) null, 240, (DefaultConstructorMarker) null));
            i13 = i14;
        }
        segmentMerge = new GraphingCardModel(new GraphModel(graphPlaneModel, AbstractC37056f.m118958J(new LinePlotModel(AbstractC37056f.m118958J(new LineSegmentModel(arrayList, (LinePlotStyle) null, new LinePlotTheme(EnumC39333f.STRAIN, (LineWidth) null, (DashPattern) null, (EnumC39333f) null, (FillOpacity) null, 30, (DefaultConstructorMarker) null), 2, (DefaultConstructorMarker) null)), LinePlotStyle.STRAIN, (DiagonalPoints) null, "line", (Boolean) null, (Boolean) null, new LinePlotTheme((EnumC39333f) null, (LineWidth) null, (DashPattern) null, EnumC39333f.RECOVERY, FillOpacity.MEDIUM, 7, (DefaultConstructorMarker) null), 52, (DefaultConstructorMarker) null)), (String) null, (GraphButtons) null, (LayoutDirection) null, 28, (DefaultConstructorMarker) null), (String) null, "Segment Merge", (String) null, (EnumC16313m0) null, (String) null, (String) null, (String) null, (String) null, (CheckmarkStyle) null, (List) null, (C9598e) null, (PlanProgressStatusModel) null, (CircularProgressIndicator) null, (UnlockTrendsCardModel) null, (List) null, (GraphingCardTheme) null, 131066, (DefaultConstructorMarker) null);
        f158874f = 8;
    }

    private C37134b() {
    }

    /* JADX INFO: renamed from: a */
    private final GraphAxisModel m119053a(boolean withTheme) {
        return new GraphAxisModel((EnumC15531d) null, (EnumC15530c) null, AbstractC37056f.m118959K(new AxisLabelModel(UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE, 0.0d, (String) null, (AxisLabelStyle) null, (EnumC16313m0) null, 28, (DefaultConstructorMarker) null), new AxisLabelModel("50", 0.5d, (String) null, (AxisLabelStyle) null, (EnumC16313m0) null, 28, (DefaultConstructorMarker) null), new AxisLabelModel("100", 1.0d, (String) null, (AxisLabelStyle) null, (EnumC16313m0) null, 28, (DefaultConstructorMarker) null)), 0.0d, (String) null, false, withTheme ? new GraphAxisTheme(EnumC39333f.RECOVERY, EnumC39333f.RECOVERY_HIGH_RECOVERY) : null, 59, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: b */
    private final List<BarGroupModel> m119054b(boolean withTheme) {
        List listM118959K = AbstractC37056f.m118959K(Double.valueOf(0.9d), Double.valueOf(0.25d), Double.valueOf(0.6d), Double.valueOf(1.0d), Double.valueOf(0.5d));
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM118959K, 10));
        int i13 = 0;
        for (Object obj : listM118959K) {
            int i14 = i13 + 1;
            BarTheme barTheme = null;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            double dDoubleValue = ((Number) obj).doubleValue();
            double d3 = ((double) i14) / 6.0d;
            BarStyle barStyle = BarStyle.STRAIN;
            if (withTheme) {
                barTheme = new BarTheme(EnumC39333f.RECOVERY, BarWidth.NARROW);
            }
            arrayList.add(new BarGroupModel(d3, 0.075d, AbstractC37056f.m118958J(new BarModel(0.0d, dDoubleValue, barStyle, (DataScrubberDetailsModel) null, barTheme, 8, (DefaultConstructorMarker) null)), (DataScrubberDetailsModel) null, AbstractC2875y.m8295h(i14, "Day "), (GraphPlotLabelModel) null, (GraphPlotLabelModel) null, 104, (DefaultConstructorMarker) null));
            i13 = i14;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    private final GraphingCardModel m119055c(String title, boolean withPlotTheme, GraphingCardTheme cardTheme) {
        return new GraphingCardModel(new GraphModel(new GraphPlaneModel((List) null, (List) null, (GraphAccessibilityModel) null, m119053a(withPlotTheme), (GraphAxisModel) null, m119053a(withPlotTheme), (GraphAxisModel) null, 87, (DefaultConstructorMarker) null), AbstractC37056f.m118959K(new BarPlotModel(m119054b(withPlotTheme), "bars", (Boolean) null, (Boolean) null, 12, (DefaultConstructorMarker) null), new LinePlotModel(AbstractC37056f.m118958J(m119058i(withPlotTheme)), LinePlotStyle.STRAIN, (DiagonalPoints) null, "line", (Boolean) null, (Boolean) null, withPlotTheme ? new LinePlotTheme(EnumC39333f.RECOVERY, (LineWidth) null, DashPattern.DASHED, (EnumC39333f) null, (FillOpacity) null, 26, (DefaultConstructorMarker) null) : null, 52, (DefaultConstructorMarker) null)), (String) null, (GraphButtons) null, (LayoutDirection) null, 28, (DefaultConstructorMarker) null), (String) null, title, (String) null, (EnumC16313m0) null, (String) null, (String) null, (String) null, (String) null, (CheckmarkStyle) null, m119057h(withPlotTheme), (C9598e) null, (PlanProgressStatusModel) null, (CircularProgressIndicator) null, (UnlockTrendsCardModel) null, (List) null, cardTheme, 64506, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ GraphingCardModel m119056d(C37134b c37134b, String str, boolean z4, GraphingCardTheme graphingCardTheme, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            graphingCardTheme = null;
        }
        return c37134b.m119055c(str, z4, graphingCardTheme);
    }

    /* JADX INFO: renamed from: h */
    private final List<GraphLegendModel> m119057h(boolean withTheme) {
        return AbstractC37056f.m118958J(new GraphLegendModel("STRAIN", "Strain", null, withTheme ? new GraphLegendTheme((EnumC39333f) null, EnumC39333f.RECOVERY, LegendShape.CAPSULE, 1, (DefaultConstructorMarker) null) : null));
    }

    /* JADX INFO: renamed from: i */
    private final LineSegmentModel m119058i(boolean withTheme) {
        List listM118959K = AbstractC37056f.m118959K(Double.valueOf(0.1d), Double.valueOf(0.5d), Double.valueOf(0.3d), Double.valueOf(0.8d), Double.valueOf(0.55d));
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM118959K, 10));
        int i13 = 0;
        for (Object obj : listM118959K) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            arrayList.add(new LineDataPointModel(true, ((double) i14) / 6.0d, ((Number) obj).doubleValue(), LinePointStyle.STRAIN, (String) null, (DataScrubberDetailsModel) null, (GraphPlotLabelModel) null, withTheme ? new LinePointTheme(EnumC39333f.RECOVERY, PointSize.LARGE, PointShape.DIAMOND, (PointVisibility) null, 8, (DefaultConstructorMarker) null) : null, 112, (DefaultConstructorMarker) null));
            i13 = i14;
        }
        return new LineSegmentModel(arrayList, (LinePlotStyle) null, (LinePlotTheme) null, 6, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: e */
    public final GraphingCardModel m119059e() {
        return aiGradientCard;
    }

    /* JADX INFO: renamed from: f */
    public final GraphingCardModel m119060f() {
        return baseline;
    }

    /* JADX INFO: renamed from: g */
    public final GraphingCardModel m119061g() {
        return plotTheme;
    }
}
