package ic1;

import com.whoop.design.models.items.graph.plot.VerticalMarkerModel;
import com.whoop.design.models.items.graph.plot.VerticalMarkerPlotModel;
import f71.C14224e;
import f71.EnumC14225f;
import j71.AbstractC21394b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ic1.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/VerticalMarkerPlotModel;", "model", "Lj71/b$l;", "a", "(Lcom/whoop/design/models/items/graph/plot/VerticalMarkerPlotModel;)Lj71/b$l;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18395a {
    /* JADX INFO: renamed from: a */
    public static final AbstractC21394b.l m52895a(VerticalMarkerPlotModel model) {
        EnumC14225f enumC14225f;
        AbstractC22676k.m65750j(model, "model");
        List<VerticalMarkerModel> verticalMarkers = model.getVerticalMarkers();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(verticalMarkers, 10));
        Iterator<T> it = verticalMarkers.iterator();
        while (true) {
            int i13 = 0;
            if (!it.hasNext()) {
                break;
            }
            VerticalMarkerModel verticalMarkerModel = (VerticalMarkerModel) it.next();
            String markerType = verticalMarkerModel.getMarkerType();
            EnumC14225f enumC14225f2 = EnumC14225f.STRAIN;
            EnumC14225f[] enumC14225fArrValues = EnumC14225f.values();
            int length = enumC14225fArrValues.length;
            while (true) {
                if (i13 >= length) {
                    enumC14225f = null;
                    break;
                }
                enumC14225f = enumC14225fArrValues[i13];
                if (AbstractC22676k.m65745e(enumC14225f.name(), markerType)) {
                    break;
                }
                i13++;
            }
            if (enumC14225f != null) {
                enumC14225f2 = enumC14225f;
            }
            arrayList.add(new C14224e(verticalMarkerModel.getXpercent(), enumC14225f2, verticalMarkerModel.getLabel(), verticalMarkerModel.getSubLabel()));
        }
        String id4 = model.getId();
        Boolean hideWhileScrubbing = model.getHideWhileScrubbing();
        boolean zBooleanValue = hideWhileScrubbing != null ? hideWhileScrubbing.booleanValue() : false;
        Boolean skipScrubbing = model.getSkipScrubbing();
        return new AbstractC21394b.l(arrayList, id4, skipScrubbing != null ? skipScrubbing.booleanValue() : false, zBooleanValue);
    }
}
