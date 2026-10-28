package xb1;

import com.whoop.design.models.items.graph.plot.GraphPlotLabelModel;
import com.whoop.design.util.AbstractC8693b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import u61.C34555d;

/* JADX INFO: renamed from: xb1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;", "graphPlotLabelModel", "Lu61/d;", "a", "(Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;)Lu61/d;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38162a {
    /* JADX INFO: renamed from: a */
    public static final C34555d m122236a(GraphPlotLabelModel graphPlotLabelModel) {
        AbstractC22676k.m65750j(graphPlotLabelModel, "graphPlotLabelModel");
        return new C34555d(AbstractC8693b.m21278l(graphPlotLabelModel.getLabel()), AbstractC38163b.m122237a(graphPlotLabelModel.getLabelStyle()), graphPlotLabelModel.getShowBackgroundGradient(), graphPlotLabelModel.getRenderedBelow());
    }
}
