package wb1;

import com.whoop.design.models.items.graph.plane.GraphPlaneModel;
import com.whoop.design.models.items.graph.plane.button.GraphButtons;
import com.whoop.design.util.AbstractC8693b;
import g61.C15529b;
import g61.C15534g;
import j61.C21369c;
import j61.C21372f;
import j61.C21373g;
import j61.C21374h;
import java.util.List;
import p181h2.C16618c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wb1.i */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;", "graphPlaneModel", "", "hasScrubbableData", "Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;", "graphButtons", "Lj61/h;", "a", "(Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;ZLcom/whoop/design/models/items/graph/plane/button/GraphButtons;)Lj61/h;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37048i {
    /* JADX INFO: renamed from: a */
    public static final C21374h m118933a(GraphPlaneModel graphPlaneModel, boolean z4, GraphButtons graphButtons) {
        AbstractC22676k.m65750j(graphPlaneModel, "graphPlaneModel");
        C21373g c21373g = new C21373g(AbstractC8693b.m21278l(graphPlaneModel.getAccessibilityInfo().getLabel()), null, null, null, 14, null);
        C15529b c15529bM118924a = AbstractC37045f.m118924a(graphPlaneModel.getEndYAxis(), EnumC37042c.END_Y);
        C15529b c15529bM118924a2 = AbstractC37045f.m118924a(graphPlaneModel.getStartYAxis(), EnumC37042c.START_Y);
        C15529b c15529bM118924a3 = AbstractC37045f.m118924a(graphPlaneModel.getBottomXAxis(), EnumC37042c.BOTTOM_X);
        C15529b c15529bM118924a4 = AbstractC37045f.m118924a(graphPlaneModel.getTopXAxis(), EnumC37042c.TOP_X);
        C15534g c15534gM118927a = AbstractC37046g.m118927a(graphButtons);
        C16618c c16618c = new C16618c(0.075f, 0.04f, 0.075f, 0.04f);
        List<C21372f> listM118929b = AbstractC37047h.m118929b(graphPlaneModel.getLines());
        List<C21369c> listM118903a = AbstractC37040a.m118903a(graphPlaneModel.getAnnotations());
        if (c15529bM118924a3 == null) {
            c15529bM118924a3 = new C15529b(0.0f, null, 0.0f, null, null, false, null, null, 255, null);
        }
        return new C21374h(c15529bM118924a2, c15529bM118924a, c15529bM118924a3, c15529bM118924a4, c16618c, listM118929b, listM118903a, c21373g, z4, false, c15534gM118927a, 0L, 0.0f, 6656, null);
    }
}
