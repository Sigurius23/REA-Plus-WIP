package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.graph.ZoomToggleModel;
import com.whoop.design.models.items.graph.ZoomableGraphModel;
import com.whoop.design.models.items.graph.ZoomableGraphZoomLevelModel;
import h71.C16994k;
import j71.AbstractC21394b;
import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import t81.C33599e;
import t81.C33612r;
import t81.C33613s;
import wb1.AbstractC37049j;
import xb1.AbstractC38164c;

/* JADX INFO: renamed from: lb1.k5 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\n\"\u001a\u0010\u0010\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;", "model", "", "scrollWidthMultiplier", "Lt81/s;", "d", "(Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;F)Lt81/s;", "Lcom/whoop/design/models/items/graph/ZoomToggleModel;", "Lt81/e;", "e", "(Lcom/whoop/design/models/items/graph/ZoomToggleModel;F)Lt81/e;", "Llb1/y0;", "a", "Llb1/y0;", "c", "()Llb1/y0;", "zoomableGraphModelMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23663k5 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93840a = Function1.m68251a(new C23753z4(18));

    /* JADX INFO: renamed from: lb1.k5$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93841w;

        public a(Function1 function1) {
            this.f93841w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93841w.invoke((ZoomableGraphModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23743y0 m68994c() {
        return f93840a;
    }

    /* JADX INFO: renamed from: d */
    private static final C33613s m68995d(ZoomableGraphZoomLevelModel zoomableGraphZoomLevelModel, float f13) {
        return new C33613s(zoomableGraphZoomLevelModel.getDefaultZoomLevel() * f13, zoomableGraphZoomLevelModel.getMinZoomLevel() * f13, zoomableGraphZoomLevelModel.getMaxZoomLevel() * f13);
    }

    /* JADX INFO: renamed from: e */
    private static final C33599e m68996e(ZoomToggleModel zoomToggleModel, float f13) {
        return new C33599e(zoomToggleModel.getZoomInLevel() * f13, zoomToggleModel.getZoomOutLevel() * f13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m68997f(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ZoomableGraphModel.class), new a(new C23753z4(19)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C33612r m68998g(ZoomableGraphModel model) {
        AbstractC22676k.m65750j(model, "model");
        List<AbstractC21394b> listM122259a = AbstractC38164c.m122259a(model.getPlots());
        C16994k c16994kM118934a = AbstractC37049j.m118934a(model.getPlane(), true);
        float scrollWidthMultiplier = (float) model.getScrollWidthMultiplier();
        return new C33612r(c16994kM118934a, null, listM122259a, 0L, null, scrollWidthMultiplier, m68995d(model.getZoomLevel(), scrollWidthMultiplier), m68996e(model.getZoomToggle(), scrollWidthMultiplier), false, null, null, null, null, 7962, null);
    }
}
