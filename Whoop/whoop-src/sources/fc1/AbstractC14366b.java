package fc1;

import com.whoop.design.models.items.graph.plot.ProgressPlotModel;
import j71.AbstractC21394b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;
import z61.C40126c;

/* JADX INFO: renamed from: fc1.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;", "graphPlot", "Lj71/b$j;", "a", "(Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;)Lj71/b$j;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14366b {
    /* JADX INFO: renamed from: a */
    public static final AbstractC21394b.j m41012a(ProgressPlotModel graphPlot) {
        AbstractC22676k.m65750j(graphPlot, "graphPlot");
        InterfaceC39332e interfaceC39332eM41001a = AbstractC14365a.m41001a(graphPlot.getStyle());
        float rangeMin = (float) graphPlot.getRangeMin();
        float rangeMax = (float) graphPlot.getRangeMax();
        Double currentValue = graphPlot.getCurrentValue();
        C40126c c40126c = new C40126c(interfaceC39332eM41001a, rangeMin, rangeMax, currentValue != null ? Float.valueOf((float) currentValue.doubleValue()) : null, (float) graphPlot.getHeight(), (float) graphPlot.getYposition());
        String id4 = graphPlot.getId();
        Boolean hideWhileScrubbing = graphPlot.getHideWhileScrubbing();
        boolean zBooleanValue = hideWhileScrubbing != null ? hideWhileScrubbing.booleanValue() : false;
        Boolean skipScrubbing = graphPlot.getSkipScrubbing();
        return new AbstractC21394b.j(c40126c, id4, skipScrubbing != null ? skipScrubbing.booleanValue() : false, zBooleanValue);
    }
}
