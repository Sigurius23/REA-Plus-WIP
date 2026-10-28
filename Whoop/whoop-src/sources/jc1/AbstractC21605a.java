package jc1;

import com.whoop.design.models.items.graph.plane.axis.label.AxisLabelModel;
import com.whoop.design.models.items.graph.plot.XLabelPlotModel;
import com.whoop.design.models.items.graph.plot.XPlotZoomBucketsModel;
import g61.EnumC15531d;
import g71.C15546d;
import j71.AbstractC21394b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb1.AbstractC37044e;
import wb1.EnumC37042c;

/* JADX INFO: renamed from: jc1.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/XLabelPlotModel;", "model", "Lj71/b$m;", "a", "(Lcom/whoop/design/models/items/graph/plot/XLabelPlotModel;)Lj71/b$m;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21605a {
    /* JADX INFO: renamed from: a */
    public static final AbstractC21394b.m m60764a(XLabelPlotModel model) {
        AbstractC22676k.m65750j(model, "model");
        List<XPlotZoomBucketsModel> zoomBuckets = model.getZoomBuckets();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(zoomBuckets, 10));
        for (XPlotZoomBucketsModel xPlotZoomBucketsModel : zoomBuckets) {
            double zoomThreshold = xPlotZoomBucketsModel.getZoomThreshold();
            List<AxisLabelModel> axisLabels = xPlotZoomBucketsModel.getAxisLabels();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(axisLabels, 10));
            Iterator<T> it = axisLabels.iterator();
            while (it.hasNext()) {
                arrayList2.add(AbstractC37044e.m118922c((AxisLabelModel) it.next(), EnumC37042c.BOTTOM_X, EnumC15531d.STANDARD, null, 8, null));
            }
            arrayList.add(new C15546d(zoomThreshold, arrayList2));
        }
        String id4 = model.getId();
        Boolean hideWhileScrubbing = model.getHideWhileScrubbing();
        boolean zBooleanValue = hideWhileScrubbing != null ? hideWhileScrubbing.booleanValue() : false;
        Boolean skipScrubbing = model.getSkipScrubbing();
        return new AbstractC21394b.m(arrayList, id4, skipScrubbing != null ? skipScrubbing.booleanValue() : false, zBooleanValue);
    }
}
