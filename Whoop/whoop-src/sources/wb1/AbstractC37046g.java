package wb1;

import com.whoop.design.models.items.graph.plane.button.GraphButton;
import com.whoop.design.models.items.graph.plane.button.GraphButtons;
import g61.C15532e;
import g61.C15534g;
import g61.EnumC15528a;
import gz0.AbstractC16315n0;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wb1.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;", "graphButtons", "Lg61/g;", "a", "(Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;)Lg61/g;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37046g {
    /* JADX INFO: renamed from: a */
    public static final C15534g m118927a(GraphButtons graphButtons) {
        EnumC15528a enumC15528a;
        ArrayList arrayList = null;
        if (graphButtons == null) {
            return null;
        }
        GraphButton previousButton = graphButtons.getPreviousButton();
        Integer numValueOf = previousButton != null ? Integer.valueOf(AbstractC16315n0.m46381f(previousButton.getIcon(), null, 1, null)) : null;
        GraphButton nextButton = graphButtons.getNextButton();
        Integer numValueOf2 = nextButton != null ? Integer.valueOf(AbstractC16315n0.m46381f(nextButton.getIcon(), null, 1, null)) : null;
        List<GraphButton> graphPlaneButtons = graphButtons.getGraphPlaneButtons();
        if (graphPlaneButtons != null) {
            List<GraphButton> list = graphPlaneButtons;
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            for (GraphButton graphButton : list) {
                EnumC15528a[] enumC15528aArrValues = EnumC15528a.values();
                int length = enumC15528aArrValues.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        enumC15528a = null;
                        break;
                    }
                    enumC15528a = enumC15528aArrValues[i13];
                    if (AbstractC22676k.m65745e(enumC15528a.name(), graphButton.getId())) {
                        break;
                    }
                    i13++;
                }
                if (enumC15528a == null) {
                    enumC15528a = EnumC15528a.UNKNOWN;
                }
                arrayList2.add(new C15532e(enumC15528a, Integer.valueOf(AbstractC16315n0.m46381f(graphButton.getIcon(), null, 1, null)), graphButton.getPositionX(), graphButton.getPositionY()));
            }
            arrayList = arrayList2;
        }
        return new C15534g(numValueOf, numValueOf2, arrayList);
    }
}
