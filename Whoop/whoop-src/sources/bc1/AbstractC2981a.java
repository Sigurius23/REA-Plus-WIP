package bc1;

import com.whoop.design.models.items.graph.plot.GridLinePlotModel;
import j71.AbstractC21394b;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: bc1.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/GridLinePlotModel;", "model", "Lj71/b$h;", "a", "(Lcom/whoop/design/models/items/graph/plot/GridLinePlotModel;)Lj71/b$h;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2981a {
    /* JADX INFO: renamed from: a */
    public static final AbstractC21394b.h m8667a(GridLinePlotModel model) {
        AbstractC22676k.m65750j(model, "model");
        List<Float> horizontalLines = model.getHorizontalLines();
        List<Float> verticalLines = model.getVerticalLines();
        String id4 = model.getId();
        Boolean hideWhileScrubbing = model.getHideWhileScrubbing();
        boolean zBooleanValue = hideWhileScrubbing != null ? hideWhileScrubbing.booleanValue() : false;
        Boolean skipScrubbing = model.getSkipScrubbing();
        return new AbstractC21394b.h(horizontalLines, verticalLines, null, 0.0f, id4, skipScrubbing != null ? skipScrubbing.booleanValue() : false, zBooleanValue, 12, null);
    }
}
