package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.CompactTrendModel;
import com.whoop.design.models.items.NoDataGraphModel;
import com.whoop.design.models.items.SegmentControllerModel;
import com.whoop.design.models.items.graph.GraphLegendModel;
import com.whoop.design.util.AbstractC8693b;
import i11.C17863f;
import j71.C21395c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import l83.C23454a0;
import m83.AbstractC25267u;
import o51.C27538d;
import o51.C27539e;
import o51.C27540f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import vb1.AbstractC35869b;

/* JADX INFO: renamed from: lb1.m0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\"\u001a\u0010\n\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/design/models/items/SegmentControllerModel;", "model", "Lo51/f;", "f", "(Lcom/whoop/design/models/items/SegmentControllerModel;)Lo51/f;", "Llb1/y0;", "a", "Llb1/y0;", "e", "()Llb1/y0;", "compactTrendMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23671m0 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93860a = Function1.m68251a(new C23644i0(9));

    /* JADX INFO: renamed from: lb1.m0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93861w;

        public a(Function1 function1) {
            this.f93861w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93861w.invoke((CompactTrendModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m69064c(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(CompactTrendModel.class), new a(new C23644i0(10)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C27538d m69065d(CompactTrendModel model) {
        AbstractC22676k.m65750j(model, "model");
        C27540f c27540fM69067f = m69067f(model.getSegmentController());
        C17863f c17863fM69613f = AbstractC23731w0.m69613f(model.getWeekDatePicker());
        C17863f c17863fM69613f2 = AbstractC23731w0.m69613f(model.getMonthDatePicker());
        C17863f c17863fM69613f3 = AbstractC23731w0.m69613f(model.getSixMonthDatePicker());
        C21395c c21395cM113874t = AbstractC35869b.m113874t(model.getWeekGraph());
        C21395c c21395cM113874t2 = AbstractC35869b.m113874t(model.getMonthGraph());
        C21395c c21395cM113874t3 = AbstractC35869b.m113874t(model.getSixMonthGraph());
        NoDataGraphModel noDataGraph = model.getNoDataGraph();
        ArrayList arrayList = null;
        C27539e c27539e = noDataGraph != null ? new C27539e(AbstractC8693b.m21278l(noDataGraph.getTitle()), AbstractC8693b.m21278l(noDataGraph.getSubtitle()), new AbstractC22403o.c(noDataGraph.getImage(), 0, 0, 0, 14, null)) : null;
        List<GraphLegendModel> graphLegends = model.getGraphLegends();
        if (graphLegends != null) {
            List<GraphLegendModel> list = graphLegends;
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(AbstractC35869b.m113853A((GraphLegendModel) it.next(), null, 1, null));
            }
            arrayList = arrayList2;
        }
        return new C27538d(c27540fM69067f, c17863fM69613f, c17863fM69613f2, c17863fM69613f3, c21395cM113874t, c21395cM113874t2, c21395cM113874t3, c27539e, arrayList);
    }

    /* JADX INFO: renamed from: e */
    public static final C23743y0 m69066e() {
        return f93860a;
    }

    /* JADX INFO: renamed from: f */
    private static final C27540f m69067f(SegmentControllerModel segmentControllerModel) {
        return new C27540f(segmentControllerModel.getInitialIndex(), segmentControllerModel.getElementNames());
    }
}
