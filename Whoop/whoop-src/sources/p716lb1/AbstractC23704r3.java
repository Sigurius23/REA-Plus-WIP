package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.cards.ProductTestCardModel;
import com.whoop.design.models.cards.TrailingIconModel;
import f01.C13889p1;
import f01.C13895r1;
import gz0.EnumC16313m0;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import kd1.AbstractC22403o;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lb1.r3 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\"\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/design/models/cards/ProductTestCardModel;", "Lf01/p1;", "f", "(Lcom/whoop/design/models/cards/ProductTestCardModel;)Lf01/p1;", "Lcom/whoop/design/models/cards/TrailingIconModel;", "Lf01/r1;", "g", "(Lcom/whoop/design/models/cards/TrailingIconModel;)Lf01/r1;", "Llb1/y0;", "a", "Llb1/y0;", "c", "()Llb1/y0;", "productTestCardMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23704r3 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93949a = Function1.m68251a(new C23654j3(17));

    /* JADX INFO: renamed from: lb1.r3$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93950w;

        public a(Function1 function1) {
            this.f93950w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93950w.invoke((ProductTestCardModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23743y0 m69352c() {
        return f93949a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m69353d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ProductTestCardModel.class), new a(new C23654j3(18)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C13889p1 m69354e(ProductTestCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69355f(model);
    }

    /* JADX INFO: renamed from: f */
    public static final C13889p1 m69355f(ProductTestCardModel productTestCardModel) {
        AbstractC22676k.m65750j(productTestCardModel, "<this>");
        C21535a c21535aM60555e = AbstractC21537c.m60555e(null, 1, null);
        String id4 = productTestCardModel.getId();
        AbstractC22403o.c cVar = new AbstractC22403o.c(productTestCardModel.getImageUrl(), 0, 0, 0, 14, null);
        List<DesignSystemModel> items = productTestCardModel.getItems();
        return new C13889p1(id4, cVar, items != null ? c21535aM60555e.m60540g(items) : null, m69356g(productTestCardModel.getTrailingIcon()), productTestCardModel.getDestination(), productTestCardModel.getModal());
    }

    /* JADX INFO: renamed from: g */
    private static final C13895r1 m69356g(TrailingIconModel trailingIconModel) {
        EnumC16313m0 enumC16313m0;
        String icon = trailingIconModel.getIcon();
        EnumC16313m0 enumC16313m1 = EnumC16313m0.ARROW_FORWARD;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC16313m0 = null;
                break;
            }
            enumC16313m0 = enumC16313m0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC16313m0.name(), icon)) {
                break;
            }
            i13++;
        }
        EnumC16313m0 enumC16313m2 = enumC16313m0 == null ? enumC16313m1 : enumC16313m0;
        boolean z4 = enumC16313m2 == EnumC16313m0.CHECKMARK;
        return new C13895r1(enumC16313m2, (!z4 || trailingIconModel.getDeselectAction() == null) ? trailingIconModel.getAction() : trailingIconModel.getDeselectAction(), trailingIconModel.getDestination(), trailingIconModel.getAnalyticEvent(), !z4);
    }
}
