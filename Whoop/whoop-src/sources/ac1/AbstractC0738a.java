package ac1;

import com.whoop.design.models.items.graph.plot.FinalMarkerPlotLineModel;
import o61.C27602a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ac1.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotLineModel;", "Lo61/a;", "a", "(Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotLineModel;)Lo61/a;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC0738a {
    /* JADX INFO: renamed from: a */
    public static final C27602a m1793a(FinalMarkerPlotLineModel finalMarkerPlotLineModel) {
        AbstractC22676k.m65750j(finalMarkerPlotLineModel, "<this>");
        String position = finalMarkerPlotLineModel.getPosition();
        if (position == null) {
            position = "END";
        }
        String style = finalMarkerPlotLineModel.getStyle();
        if (style == null) {
            style = "STANDARD";
        }
        return new C27602a(position, style);
    }
}
