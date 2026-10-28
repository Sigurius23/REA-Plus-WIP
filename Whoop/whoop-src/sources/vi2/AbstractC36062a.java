package vi2;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
import com.whoop.streaks.domain.models.HorizontalTrackerModel;
import com.whoop.streaks.domain.models.MilestoneHeader;
import com.whoop.streaks.domain.models.TrackedItem;
import java.util.ArrayList;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import kd1.AbstractC22403o;
import l83.C23454a0;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import ti2.C33854a;
import ti2.C33861h;
import u21.C34481a;
import ve0.C35926d;

/* JADX INFO: renamed from: vi2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"Ljb1/a;", "a", "Ljb1/a;", "e", "()Ljb1/a;", "streaksReducer", "streaks_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36062a {

    /* JADX INFO: renamed from: a */
    private static final C21535a f154001a = AbstractC21537c.m60554d(new C35926d(4));

    /* JADX INFO: renamed from: vi2.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f154002w;

        public a(Function1 function1) {
            this.f154002w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f154002w.invoke((HorizontalTrackerModel) it);
        }
    }

    /* JADX INFO: renamed from: vi2.a$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f154003w;

        public b(Function1 function1) {
            this.f154003w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f154003w.invoke((MilestoneHeader) it);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final C21535a m114512e() {
        return f154001a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m114513f(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C35926d(5));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m114514g(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        C35926d c35926d = new C35926d(6);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(HorizontalTrackerModel.class), new a(c35926d));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(MilestoneHeader.class), new b(new C35926d(7)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C33854a m114515h(HorizontalTrackerModel model) {
        AbstractC22676k.m65750j(model, "model");
        TextResource title = model.getTitle();
        List<TrackedItem> trackedItems = model.getTrackedItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(trackedItems, 10));
        for (TrackedItem trackedItem : trackedItems) {
            arrayList.add(new C33861h(trackedItem.getTitle(), AbstractC22676k.m65745e(trackedItem.getStyle(), "HIGHLIGHT") ? EnumC39333f.BRAND_WHITE : EnumC39333f.WHITE_50, new AbstractC22403o.c(trackedItem.getIconUrl(), 0, 0, 0, 14, null)));
        }
        return new C33854a(title, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C34481a m114516i(MilestoneHeader model) {
        AbstractC22676k.m65750j(model, "model");
        return new C34481a(model.getTitle());
    }
}
