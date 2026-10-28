package xb1;

import ac1.AbstractC0739b;
import bc1.AbstractC2981a;
import cc1.AbstractC4411a;
import com.whoop.design.models.items.graph.plot.BandPlotModel;
import com.whoop.design.models.items.graph.plot.BarPlotModel;
import com.whoop.design.models.items.graph.plot.CalibratingPlotModel;
import com.whoop.design.models.items.graph.plot.CenterScrubBandPlotModel;
import com.whoop.design.models.items.graph.plot.EmptyPlotModel;
import com.whoop.design.models.items.graph.plot.FinalMarkerPlotModel;
import com.whoop.design.models.items.graph.plot.GraphPlot;
import com.whoop.design.models.items.graph.plot.GridLinePlotModel;
import com.whoop.design.models.items.graph.plot.IconPlotModel;
import com.whoop.design.models.items.graph.plot.LinePlotModel;
import com.whoop.design.models.items.graph.plot.OverlayPlotModel;
import com.whoop.design.models.items.graph.plot.ProgressPlotModel;
import com.whoop.design.models.items.graph.plot.TrendPlotModel;
import com.whoop.design.models.items.graph.plot.UnknownPlotModel;
import com.whoop.design.models.items.graph.plot.VerticalMarkerPlotModel;
import com.whoop.design.models.items.graph.plot.XLabelPlotModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import dc1.AbstractC11908e;
import ec1.AbstractC13009a;
import fc1.AbstractC14366b;
import gy0.AbstractC16277f;
import hc1.AbstractC17152b;
import ic1.AbstractC18395a;
import j71.AbstractC21394b;
import java.util.ArrayList;
import java.util.List;
import jc1.AbstractC21605a;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb1.AbstractC39391c;
import zb1.AbstractC40257a;

/* JADX INFO: renamed from: xb1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006¨\u0006\b"}, m65681d2 = {"", "Lcom/whoop/design/models/items/graph/plot/GraphPlot;", "graphPlotEntries", "Lj71/b;", "a", "(Ljava/util/List;)Ljava/util/List;", "Lj71/b;", "unknownPlot", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38164c {

    /* JADX INFO: renamed from: a */
    private static final AbstractC21394b f163448a = new AbstractC21394b.b(null, "unknown", true, false, 9, null);

    /* JADX INFO: renamed from: a */
    public static final List<AbstractC21394b> m122259a(List<? extends GraphPlot> graphPlotEntries) {
        AbstractC21394b abstractC21394bM60764a;
        TextResource textResourceM21277k;
        TextResource textResourceM21267a;
        AbstractC21394b dVar;
        TextResource textResourceM21277k2;
        AbstractC22676k.m65750j(graphPlotEntries, "graphPlotEntries");
        List<? extends GraphPlot> list = graphPlotEntries;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (GraphPlot graphPlot : list) {
            if (AbstractC22676k.m65745e(graphPlot, UnknownPlotModel.INSTANCE)) {
                abstractC21394bM60764a = f163448a;
            } else if (graphPlot instanceof BandPlotModel) {
                abstractC21394bM60764a = AbstractC39391c.m125807a((BandPlotModel) graphPlot);
            } else if (graphPlot instanceof BarPlotModel) {
                abstractC21394bM60764a = AbstractC40257a.m129266a((BarPlotModel) graphPlot);
            } else {
                if (graphPlot instanceof CalibratingPlotModel) {
                    CalibratingPlotModel calibratingPlotModel = (CalibratingPlotModel) graphPlot;
                    String id4 = calibratingPlotModel.getId();
                    String title = calibratingPlotModel.getTitle();
                    if (title == null || (textResourceM21277k2 = AbstractC8693b.m21278l(title)) == null) {
                        textResourceM21277k2 = AbstractC8693b.m21277k(AbstractC16277f.f62237G);
                    }
                    TextResource textResource = textResourceM21277k2;
                    Boolean hideWhileScrubbing = calibratingPlotModel.getHideWhileScrubbing();
                    boolean zBooleanValue = hideWhileScrubbing != null ? hideWhileScrubbing.booleanValue() : false;
                    Boolean skipScrubbing = calibratingPlotModel.getSkipScrubbing();
                    dVar = new AbstractC21394b.c(id4, textResource, null, skipScrubbing != null ? skipScrubbing.booleanValue() : false, zBooleanValue, 4, null);
                } else if (graphPlot instanceof CenterScrubBandPlotModel) {
                    abstractC21394bM60764a = AbstractC39391c.m125808b((CenterScrubBandPlotModel) graphPlot);
                } else if (graphPlot instanceof EmptyPlotModel) {
                    EmptyPlotModel emptyPlotModel = (EmptyPlotModel) graphPlot;
                    String id5 = emptyPlotModel.getId();
                    String title2 = emptyPlotModel.getTitle();
                    if (title2 == null || (textResourceM21277k = AbstractC8693b.m21278l(title2)) == null) {
                        textResourceM21277k = AbstractC8693b.m21277k(AbstractC16277f.f62356n1);
                    }
                    TextResource textResource2 = textResourceM21277k;
                    String subtitle = emptyPlotModel.getSubtitle();
                    if (subtitle == null || (textResourceM21267a = AbstractC8693b.m21278l(subtitle)) == null) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    }
                    TextResource textResource3 = textResourceM21267a;
                    Boolean hideWhileScrubbing2 = emptyPlotModel.getHideWhileScrubbing();
                    boolean zBooleanValue2 = hideWhileScrubbing2 != null ? hideWhileScrubbing2.booleanValue() : false;
                    Boolean skipScrubbing2 = emptyPlotModel.getSkipScrubbing();
                    dVar = new AbstractC21394b.d(id5, textResource2, textResource3, 0.0f, skipScrubbing2 != null ? skipScrubbing2.booleanValue() : false, zBooleanValue2, 8, null);
                } else if (graphPlot instanceof GridLinePlotModel) {
                    abstractC21394bM60764a = AbstractC2981a.m8667a((GridLinePlotModel) graphPlot);
                } else if (graphPlot instanceof FinalMarkerPlotModel) {
                    abstractC21394bM60764a = AbstractC0739b.m1794a((FinalMarkerPlotModel) graphPlot);
                } else if (graphPlot instanceof IconPlotModel) {
                    abstractC21394bM60764a = AbstractC4411a.m13837a((IconPlotModel) graphPlot);
                } else if (graphPlot instanceof LinePlotModel) {
                    abstractC21394bM60764a = AbstractC11908e.m32104a((LinePlotModel) graphPlot);
                } else if (graphPlot instanceof OverlayPlotModel) {
                    abstractC21394bM60764a = AbstractC13009a.m36541c((OverlayPlotModel) graphPlot);
                } else if (graphPlot instanceof ProgressPlotModel) {
                    abstractC21394bM60764a = AbstractC14366b.m41012a((ProgressPlotModel) graphPlot);
                } else if (graphPlot instanceof TrendPlotModel) {
                    abstractC21394bM60764a = AbstractC17152b.m48405a((TrendPlotModel) graphPlot);
                } else if (graphPlot instanceof VerticalMarkerPlotModel) {
                    abstractC21394bM60764a = AbstractC18395a.m52895a((VerticalMarkerPlotModel) graphPlot);
                } else {
                    if (!(graphPlot instanceof XLabelPlotModel)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    abstractC21394bM60764a = AbstractC21605a.m60764a((XLabelPlotModel) graphPlot);
                }
                abstractC21394bM60764a = dVar;
            }
            arrayList.add(abstractC21394bM60764a);
        }
        return arrayList;
    }
}
