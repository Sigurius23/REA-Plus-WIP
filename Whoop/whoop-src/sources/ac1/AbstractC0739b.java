package ac1;

import com.whoop.design.models.items.graph.plot.FinalMarkerPlotModel;
import com.whoop.design.models.items.graph.plot.FinalMarkerPlotPointModel;
import j71.AbstractC21394b;
import o61.C27602a;
import o61.C27606e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ac1.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotModel;", "plot", "Lj71/b$e;", "a", "(Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotModel;)Lj71/b$e;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC0739b {
    /* JADX INFO: renamed from: a */
    public static final AbstractC21394b.e m1794a(FinalMarkerPlotModel plot) {
        AbstractC22676k.m65750j(plot, "plot");
        String id4 = plot.getId();
        if (id4 == null) {
            id4 = "stress_final_marker";
        }
        String str = id4;
        C27602a c27602aM1793a = AbstractC0738a.m1793a(plot.getMarkerLine());
        FinalMarkerPlotPointModel markerPoint = plot.getMarkerPoint();
        C27606e c27606eM1795a = markerPoint != null ? AbstractC0740c.m1795a(markerPoint) : null;
        Boolean hideWhileScrubbing = plot.getHideWhileScrubbing();
        boolean zBooleanValue = hideWhileScrubbing != null ? hideWhileScrubbing.booleanValue() : false;
        Boolean skipScrubbing = plot.getSkipScrubbing();
        return new AbstractC21394b.e(c27602aM1793a, c27606eM1795a, str, skipScrubbing != null ? skipScrubbing.booleanValue() : false, zBooleanValue);
    }
}
