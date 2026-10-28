package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.RewardItemModel;
import com.whoop.design.models.items.TagModel;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import h81.C17010c;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p736sz0.C33169c0;

/* JADX INFO: renamed from: lb1.y3 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"Llb1/y0;", "a", "Llb1/y0;", "c", "()Llb1/y0;", "rewardItemMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23746y3 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f94076a = Function1.m68251a(new C23654j3(29));

    /* JADX INFO: renamed from: lb1.y3$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94077w;

        public a(Function1 function1) {
            this.f94077w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94077w.invoke((RewardItemModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23743y0 m69714c() {
        return f94076a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m69715d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(RewardItemModel.class), new a(new C23740x3(0)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C17010c m69716e(RewardItemModel model) {
        AbstractC22676k.m65750j(model, "model");
        String imageUrl = model.getImageUrl();
        AbstractC22403o abstractC22403oM64503l = imageUrl != null ? AbstractC22404p.m64503l(imageUrl) : null;
        String icon = model.getIcon();
        EnumC16313m0 enumC16313m0M46377b = icon != null ? AbstractC16315n0.m46377b(icon) : null;
        C33169c0 c33169c0M69556f = AbstractC23723u4.m69556f(model.getTitle());
        C33169c0 c33169c0M69556f2 = AbstractC23723u4.m69556f(model.getSubtitle());
        TagModel tag = model.getTag();
        return new C17010c(abstractC22403oM64503l, enumC16313m0M46377b, c33169c0M69556f, c33169c0M69556f2, tag != null ? AbstractC23699q4.m69314d(tag) : null);
    }
}
