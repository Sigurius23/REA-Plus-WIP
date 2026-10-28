package wb1;

import com.whoop.design.models.items.graph.plane.annotations.GraphAnnotationLabelAlignment;
import com.whoop.design.models.items.graph.plane.annotations.GraphAnnotationModel;
import com.whoop.design.util.AbstractC8693b;
import j61.C21369c;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wb1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"", "Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationModel;", "annotations", "Lj61/c;", "a", "(Ljava/util/List;)Ljava/util/List;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37040a {
    /* JADX INFO: renamed from: a */
    public static final List<C21369c> m118903a(List<GraphAnnotationModel> annotations) {
        AbstractC22676k.m65750j(annotations, "annotations");
        List<GraphAnnotationModel> list = annotations;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (GraphAnnotationModel graphAnnotationModel : list) {
            arrayList.add(new C21369c((float) graphAnnotationModel.getXPosition(), (float) graphAnnotationModel.getYPosition(), (float) graphAnnotationModel.getWidth(), (float) graphAnnotationModel.getHeight(), AbstractC37043d.m118914a(graphAnnotationModel.getStyle()), graphAnnotationModel.getDimension(), graphAnnotationModel.getType(), graphAnnotationModel.getAlignment() == GraphAnnotationLabelAlignment.LEFT ? AbstractC8693b.m21278l(graphAnnotationModel.getLabel()) : AbstractC8693b.m21267a(), graphAnnotationModel.getAlignment() == GraphAnnotationLabelAlignment.RIGHT ? AbstractC8693b.m21278l(graphAnnotationModel.getLabel()) : AbstractC8693b.m21267a(), AbstractC8693b.m21278l(graphAnnotationModel.getSubLabel()), graphAnnotationModel.getLabelStyle(), false, 0.0f, 6144, null));
        }
        return arrayList;
    }
}
