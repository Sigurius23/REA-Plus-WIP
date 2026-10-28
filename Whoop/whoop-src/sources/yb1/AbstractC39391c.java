package yb1;

import com.whoop.design.models.items.graph.plot.BandPlotModel;
import com.whoop.design.models.items.graph.plot.CenterScrubBandPlotModel;
import j71.AbstractC21394b;
import j71.EnumC21393a;
import java.util.List;
import l61.C23379d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: yb1.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/BandPlotModel;", "plot", "Lj71/b$a;", "a", "(Lcom/whoop/design/models/items/graph/plot/BandPlotModel;)Lj71/b$a;", "Lcom/whoop/design/models/items/graph/plot/CenterScrubBandPlotModel;", "b", "(Lcom/whoop/design/models/items/graph/plot/CenterScrubBandPlotModel;)Lj71/b$a;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39391c {
    /* JADX INFO: renamed from: a */
    public static final AbstractC21394b.a m125807a(BandPlotModel plot) {
        AbstractC22676k.m65750j(plot, "plot");
        List<C23379d> listM125809a = AbstractC39392d.m125809a(plot.getSegments(), plot.getStyle());
        EnumC21393a enumC21393a = EnumC21393a.TWO_DOTS;
        String id4 = plot.getId();
        Boolean hideWhileScrubbing = plot.getHideWhileScrubbing();
        boolean zBooleanValue = hideWhileScrubbing != null ? hideWhileScrubbing.booleanValue() : false;
        Boolean skipScrubbing = plot.getSkipScrubbing();
        return new AbstractC21394b.a(listM125809a, enumC21393a, id4, skipScrubbing != null ? skipScrubbing.booleanValue() : false, zBooleanValue);
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC21394b.a m125808b(CenterScrubBandPlotModel plot) {
        AbstractC22676k.m65750j(plot, "plot");
        List<C23379d> listM125809a = AbstractC39392d.m125809a(plot.getSegments(), plot.getStyle());
        EnumC21393a enumC21393a = EnumC21393a.CENTER_DOT;
        String id4 = plot.getId();
        Boolean hideWhileScrubbing = plot.getHideWhileScrubbing();
        boolean zBooleanValue = hideWhileScrubbing != null ? hideWhileScrubbing.booleanValue() : false;
        Boolean skipScrubbing = plot.getSkipScrubbing();
        return new AbstractC21394b.a(listM125809a, enumC21393a, id4, skipScrubbing != null ? skipScrubbing.booleanValue() : false, zBooleanValue);
    }
}
