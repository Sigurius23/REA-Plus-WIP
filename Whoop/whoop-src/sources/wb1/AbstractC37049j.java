package wb1;

import com.whoop.design.models.items.graph.ScrollableGraphPlaneModel;
import com.whoop.design.util.AbstractC8693b;
import h71.C16994k;
import j61.C21373g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wb1.j */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;", "graphPlaneModel", "", "hasScrubbableData", "Lh71/k;", "a", "(Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;Z)Lh71/k;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37049j {
    /* JADX INFO: renamed from: a */
    public static final C16994k m118934a(ScrollableGraphPlaneModel graphPlaneModel, boolean z4) {
        AbstractC22676k.m65750j(graphPlaneModel, "graphPlaneModel");
        return new C16994k(AbstractC37045f.m118926c(graphPlaneModel.getStartYaxis(), EnumC37042c.START_Y, Float.valueOf(0.05f)), null, new C21373g(AbstractC8693b.m21278l(graphPlaneModel.getAccessibilityInfo().getLabel()), null, null, null, 14, null), z4, false, false, 50, null);
    }
}
