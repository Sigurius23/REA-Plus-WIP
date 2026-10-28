package p716lb1;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.Segment;
import com.whoop.design.models.items.SegmentedContentModel;
import com.whoop.design.reducer.mapper.MissingModelMappingException;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.whoopaction.domain.models.Action;
import java.util.ArrayList;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import m83.AbstractC25267u;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q31.C29943a;
import q31.C29948f;

/* JADX INFO: renamed from: lb1.f4 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/design/models/items/SegmentedContentModel;", "Lq31/f;", "g", "(Lcom/whoop/design/models/items/SegmentedContentModel;)Lq31/f;", "Llb1/y0;", "a", "Llb1/y0;", "d", "()Llb1/y0;", "segmentedContentMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23627f4 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93756a = Function1.m68251a(new C23740x3(17));

    /* JADX INFO: renamed from: lb1.f4$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93757w;

        public a(Function1 function1) {
            this.f93757w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93757w.invoke((SegmentedContentModel) it);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C23743y0 m68751d() {
        return f93756a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m68752e(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(SegmentedContentModel.class), new a(new C23740x3(18)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C29948f m68753f(SegmentedContentModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68754g(model);
    }

    /* JADX INFO: renamed from: g */
    public static final C29948f m68754g(SegmentedContentModel segmentedContentModel) {
        List<InterfaceC25312u> listM60540g;
        AbstractC22676k.m65750j(segmentedContentModel, "<this>");
        C21535a c21535aM60554d = AbstractC21537c.m60554d(new C23751z2(11));
        String id4 = segmentedContentModel.getId();
        TextResource.C8691e c8691eM21279m = AbstractC8693b.m21279m(segmentedContentModel.getTitle());
        int initiallySelectedSegmentIndex = segmentedContentModel.getInitiallySelectedSegmentIndex();
        boolean transparentBackground = segmentedContentModel.getTransparentBackground();
        List<Segment> segments = segmentedContentModel.getSegments();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(segments, 10));
        for (Segment segment : segments) {
            String id5 = segment.getId();
            String segmentControlTitle = segment.getSegmentControlTitle();
            String segmentControlSubtitle = segment.getSegmentControlSubtitle();
            Action action = segment.getAction();
            AnalyticEventModel analyticEvent = segment.getAnalyticEvent();
            try {
                listM60540g = c21535aM60554d.m60540g(segment.getItems());
            } catch (MissingModelMappingException unused) {
                listM60540g = C25271y.f99162w;
            }
            arrayList.add(new C29943a(id5, segmentControlTitle, segmentControlSubtitle, listM60540g, action, analyticEvent));
        }
        return new C29948f(id4, c8691eM21279m, initiallySelectedSegmentIndex, arrayList, transparentBackground);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m68755h(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }
}
