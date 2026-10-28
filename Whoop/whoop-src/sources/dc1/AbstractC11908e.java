package dc1;

import com.whoop.design.models.items.graph.plot.DiagonalPoints;
import com.whoop.design.models.items.graph.plot.LinePlotModel;
import com.whoop.design.models.items.graph.plot.line.LinePlotStyle;
import com.whoop.design.models.items.graph.plot.line.LinePlotTheme;
import com.whoop.design.models.items.graph.plot.line.LineSegmentModel;
import j71.AbstractC21394b;
import java.util.List;
import l83.C23465k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import u61.C34552a;

/* JADX INFO: renamed from: dc1.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/LinePlotModel;", "plot", "Lj71/b$g;", "a", "(Lcom/whoop/design/models/items/graph/plot/LinePlotModel;)Lj71/b$g;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11908e {
    /* JADX INFO: renamed from: a */
    public static final AbstractC21394b.g m32104a(LinePlotModel plot) {
        AbstractC22676k.m65750j(plot, "plot");
        List<LineSegmentModel> segments = plot.getSegments();
        LinePlotStyle style = plot.getStyle();
        LinePlotTheme theme = plot.getTheme();
        DiagonalPoints diagonalPoints = plot.getDiagonalPoints();
        C23465k c23465k = diagonalPoints != null ? new C23465k(Float.valueOf(diagonalPoints.getStartX()), Float.valueOf(diagonalPoints.getStartY())) : null;
        DiagonalPoints diagonalPoints2 = plot.getDiagonalPoints();
        List<C34552a> listM32105a = AbstractC11909f.m32105a(segments, style, theme, c23465k, diagonalPoints2 != null ? new C23465k(Float.valueOf(diagonalPoints2.getEndX()), Float.valueOf(diagonalPoints2.getEndY())) : null);
        String id4 = plot.getId();
        Boolean hideWhileScrubbing = plot.getHideWhileScrubbing();
        boolean zBooleanValue = hideWhileScrubbing != null ? hideWhileScrubbing.booleanValue() : false;
        Boolean skipScrubbing = plot.getSkipScrubbing();
        return new AbstractC21394b.g(listM32105a, id4, skipScrubbing != null ? skipScrubbing.booleanValue() : false, null, null, zBooleanValue, 24, null);
    }
}
