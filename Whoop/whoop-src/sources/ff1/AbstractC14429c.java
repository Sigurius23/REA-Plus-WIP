package ff1;

import com.whoop.design.models.items.SegmentControllerModel;
import f41.C14068f;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import o51.C27540f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;

/* JADX INFO: renamed from: ff1.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\"\u001a\u0010\n\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/design/models/items/SegmentControllerModel;", "model", "Lo51/f;", "g", "(Lcom/whoop/design/models/items/SegmentControllerModel;)Lo51/f;", "Ljb1/a;", "a", "Ljb1/a;", "d", "()Ljb1/a;", "itemReducer", "exercise-progress-mini-arch_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14429c {

    /* JADX INFO: renamed from: a */
    private static final C21535a f52655a = AbstractC21537c.m60554d(new C14068f(16));

    /* JADX INFO: renamed from: d */
    public static final C21535a m41155d() {
        return f52655a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m41156e(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C14068f(17));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m41157f(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        AbstractC14427a.m41140b(addModelMapper);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C27540f m41158g(SegmentControllerModel segmentControllerModel) {
        return new C27540f(segmentControllerModel.getInitialIndex(), segmentControllerModel.getElementNames());
    }
}
