package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.HorizontalScrollContainerModel;
import com.whoop.design.util.AbstractC8693b;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r71.C31053c;

/* JADX INFO: renamed from: lb1.b2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u001a\u0010\n\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/design/models/items/HorizontalScrollContainerModel;", "model", "Lr71/c;", "e", "(Lcom/whoop/design/models/items/HorizontalScrollContainerModel;)Lr71/c;", "Llb1/y0;", "a", "Llb1/y0;", "d", "()Llb1/y0;", "horizontalScrollContainerMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23597b2 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93680a = Function1.m68251a(new C23714t1(9));

    /* JADX INFO: renamed from: lb1.b2$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93681w;

        public a(Function1 function1) {
            this.f93681w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93681w.invoke((HorizontalScrollContainerModel) it);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C23743y0 m68527d() {
        return f93680a;
    }

    /* JADX INFO: renamed from: e */
    public static final C31053c m68528e(HorizontalScrollContainerModel model) {
        AbstractC22676k.m65750j(model, "model");
        C21535a c21535aM60554d = AbstractC21537c.m60554d(new C23670m(23));
        String id4 = model.getId();
        String title = model.getTitle();
        return new C31053c(id4, title != null ? AbstractC8693b.m21278l(title) : null, c21535aM60554d.m60545m(model.getItems()), model.getAccessibilityLabel(), model.getScrollBehavior(), model.getPagingIndicatorEnabled(), null, 64, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m68529f(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(HorizontalScrollContainerModel.class), new a(new C23714t1(10)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C31053c m68530g(HorizontalScrollContainerModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68528e(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m68531h(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60548c(C23596b1.f93677a.m68522a());
        return C23454a0.f92919a;
    }
}
