package ac1;

import com.whoop.design.models.items.graph.plot.FinalMarkerPlotPointModel;
import com.whoop.design.models.items.graph.plot.MarkerTheme;
import o61.C27606e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ac1.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotPointModel;", "Lo61/e;", "a", "(Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotPointModel;)Lo61/e;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC0740c {
    /* JADX INFO: renamed from: a */
    public static final C27606e m1795a(FinalMarkerPlotPointModel finalMarkerPlotPointModel) {
        AbstractC22676k.m65750j(finalMarkerPlotPointModel, "<this>");
        float positionY = finalMarkerPlotPointModel.getPositionY();
        String style = finalMarkerPlotPointModel.getStyle();
        if (style == null) {
            style = "STANDARD";
        }
        MarkerTheme theme = finalMarkerPlotPointModel.getTheme();
        return new C27606e(positionY, style, theme != null ? theme.getMarkerColor() : null);
    }
}
