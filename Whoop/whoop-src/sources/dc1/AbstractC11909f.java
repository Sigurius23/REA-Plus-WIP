package dc1;

import com.whoop.design.models.items.graph.plot.GraphPlotLabelModel;
import com.whoop.design.models.items.graph.plot.line.DashPattern;
import com.whoop.design.models.items.graph.plot.line.FillOpacity;
import com.whoop.design.models.items.graph.plot.line.LineDataPointModel;
import com.whoop.design.models.items.graph.plot.line.LinePlotStyle;
import com.whoop.design.models.items.graph.plot.line.LinePlotTheme;
import com.whoop.design.models.items.graph.plot.line.LineSegmentModel;
import com.whoop.design.models.items.graph.plot.line.LineWidth;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gc1.AbstractC15709a;
import java.util.ArrayList;
import java.util.List;
import k61.C22228a;
import l83.C23465k;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import u61.C34552a;
import u61.C34554c;
import u61.C34555d;
import u61.C34556e;
import xb1.AbstractC38162a;

/* JADX INFO: renamed from: dc1.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ag\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u000f\u001a\u00020\u0005*\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"", "Lcom/whoop/design/models/items/graph/plot/line/LineSegmentModel;", "segments", "Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;", "backupPlotStyle", "Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;", "plotTheme", "Ll83/k;", "", "startPoint", "endPoint", "Lu61/a;", "a", "(Ljava/util/List;Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;Ll83/k;Ll83/k;)Ljava/util/List;", "base", "b", "(Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;)Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11909f {
    /* JADX INFO: renamed from: a */
    public static final List<C34552a> m32105a(List<LineSegmentModel> segments, LinePlotStyle backupPlotStyle, LinePlotTheme linePlotTheme, C23465k c23465k, C23465k c23465k2) {
        LinePlotTheme linePlotThemeM32106b;
        TextResource textResourceM21267a;
        AbstractC22676k.m65750j(segments, "segments");
        AbstractC22676k.m65750j(backupPlotStyle, "backupPlotStyle");
        List<LineSegmentModel> list = segments;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (LineSegmentModel lineSegmentModel : list) {
            LinePlotTheme theme = lineSegmentModel.getTheme();
            if (theme == null || (linePlotThemeM32106b = m32106b(theme, linePlotTheme)) == null) {
                linePlotThemeM32106b = linePlotTheme;
            }
            List<LineDataPointModel> points = lineSegmentModel.getPoints();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(points, 10));
            for (LineDataPointModel lineDataPointModel : points) {
                String accessibilityLabel = lineDataPointModel.getAccessibilityLabel();
                if (accessibilityLabel == null || (textResourceM21267a = AbstractC8693b.m21278l(accessibilityLabel)) == null) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                }
                TextResource textResource = textResourceM21267a;
                C34555d c34555dM122236a = null;
                C34554c c34554cM32153b = !lineDataPointModel.getVisible() ? null : AbstractC11912i.m32153b(lineDataPointModel.getStyle(), lineDataPointModel.getTheme());
                GraphPlotLabelModel graphLabel = lineDataPointModel.getGraphLabel();
                if (graphLabel != null) {
                    c34555dM122236a = AbstractC38162a.m122236a(graphLabel);
                }
                arrayList2.add(new C34556e((float) lineDataPointModel.getPositionX(), (float) lineDataPointModel.getPositionY(), textResource, c34554cM32153b, c34555dM122236a, AbstractC15709a.m44228a(lineDataPointModel.getDataScrubberDetails())));
            }
            LinePlotStyle style = lineSegmentModel.getStyle();
            if (style == null) {
                style = backupPlotStyle;
            }
            C22228a c22228aM32069X = AbstractC11907d.m32069X(style, linePlotThemeM32106b);
            LinePlotStyle style2 = lineSegmentModel.getStyle();
            if (style2 == null) {
                style2 = backupPlotStyle;
            }
            arrayList.add(new C34552a(arrayList2, c22228aM32069X, AbstractC11910g.m32114h(style2, linePlotThemeM32106b, c23465k, c23465k2), null, 8, null));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    private static final LinePlotTheme m32106b(LinePlotTheme linePlotTheme, LinePlotTheme linePlotTheme2) {
        if (linePlotTheme2 == null) {
            return linePlotTheme;
        }
        EnumC39333f strokeColor = linePlotTheme.getStrokeColor();
        if (strokeColor == null) {
            strokeColor = linePlotTheme2.getStrokeColor();
        }
        LineWidth strokeWidth = linePlotTheme.getStrokeWidth();
        if (strokeWidth == null) {
            strokeWidth = linePlotTheme2.getStrokeWidth();
        }
        DashPattern dashPattern = linePlotTheme.getDashPattern();
        if (dashPattern == null) {
            dashPattern = linePlotTheme2.getDashPattern();
        }
        EnumC39333f fillColor = linePlotTheme.getFillColor();
        if (fillColor == null) {
            fillColor = linePlotTheme2.getFillColor();
        }
        FillOpacity fillOpacity = linePlotTheme.getFillOpacity();
        if (fillOpacity == null) {
            fillOpacity = linePlotTheme2.getFillOpacity();
        }
        return new LinePlotTheme(strokeColor, strokeWidth, dashPattern, fillColor, fillOpacity);
    }
}
