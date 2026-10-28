package hc1;

import c71.C4282a;
import com.whoop.design.models.items.graph.plot.TrendPlotModel;
import com.whoop.design.models.items.graph.plot.trend.TrendSegmentModel;
import com.whoop.design.models.items.graph.plot.trend.TrendSegmentStyle;
import com.whoop.design.util.AbstractC8693b;
import j71.AbstractC21394b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hc1.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;", "graphPlot", "Lj71/b$k;", "a", "(Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;)Lj71/b$k;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17152b {
    /* JADX INFO: renamed from: a */
    public static final AbstractC21394b.k m48405a(TrendPlotModel graphPlot) {
        TrendSegmentStyle trendSegmentStyle;
        AbstractC22676k.m65750j(graphPlot, "graphPlot");
        List<TrendSegmentModel> segments = graphPlot.getSegments();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(segments, 10));
        Iterator<T> it = segments.iterator();
        while (true) {
            int i13 = 0;
            if (!it.hasNext()) {
                break;
            }
            TrendSegmentModel trendSegmentModel = (TrendSegmentModel) it.next();
            String style = trendSegmentModel.getStyle();
            TrendSegmentStyle trendSegmentStyle2 = TrendSegmentStyle.NONE;
            TrendSegmentStyle[] trendSegmentStyleArrValues = TrendSegmentStyle.values();
            int length = trendSegmentStyleArrValues.length;
            while (true) {
                if (i13 >= length) {
                    trendSegmentStyle = null;
                    break;
                }
                trendSegmentStyle = trendSegmentStyleArrValues[i13];
                if (AbstractC22676k.m65745e(trendSegmentStyle.name(), style)) {
                    break;
                }
                i13++;
            }
            TrendSegmentStyle trendSegmentStyle3 = trendSegmentStyle == null ? trendSegmentStyle2 : trendSegmentStyle;
            arrayList.add(new C4282a(AbstractC8693b.m21278l(trendSegmentModel.getTopLabel()), AbstractC8693b.m21278l(trendSegmentModel.getBottomLabel()), AbstractC17151a.m48387b(trendSegmentStyle3, graphPlot.getStyle(), true, false, 8, null), AbstractC17151a.m48387b(trendSegmentStyle3, graphPlot.getStyle(), false, true, 4, null), AbstractC17151a.m48387b(trendSegmentStyle3, graphPlot.getStyle(), false, false, 12, null), (float) trendSegmentModel.getPositionX(), (float) trendSegmentModel.getPositionY(), (float) trendSegmentModel.getWidthPercent(), 0.01f, AbstractC8693b.m21267a()));
        }
        String id4 = graphPlot.getId();
        Boolean skipScrubbing = graphPlot.getSkipScrubbing();
        return new AbstractC21394b.k(arrayList, id4, skipScrubbing != null ? skipScrubbing.booleanValue() : false);
    }
}
