package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.FabItemModel;
import com.whoop.design.models.items.FabMenuModel;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import vy0.C36570d0;
import vy0.C36598z;

/* JADX INFO: renamed from: lb1.p1 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/design/models/items/FabMenuModel;", "model", "Lvy0/d0;", "f", "(Lcom/whoop/design/models/items/FabMenuModel;)Lvy0/d0;", "Llb1/y0;", "a", "Llb1/y0;", "e", "()Llb1/y0;", "fabMenuMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23690p1 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93905a = Function1.m68251a(new C23617e1(15));

    /* JADX INFO: renamed from: lb1.p1$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93906w;

        public a(Function1 function1) {
            this.f93906w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93906w.invoke((FabMenuModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m69221c(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(FabMenuModel.class), new a(new C23617e1(16)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C36570d0 m69222d(FabMenuModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69224f(model);
    }

    /* JADX INFO: renamed from: e */
    public static final C23743y0 m69223e() {
        return f93905a;
    }

    /* JADX INFO: renamed from: f */
    public static final C36570d0 m69224f(FabMenuModel model) {
        AbstractC22676k.m65750j(model, "model");
        List<FabItemModel> elements = model.getElements();
        ArrayList<FabItemModel> arrayList = new ArrayList();
        for (Object obj : elements) {
            if (!AbstractC22676k.m65745e(((FabItemModel) obj).isVisible(), Boolean.FALSE)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        for (FabItemModel fabItemModel : arrayList) {
            arrayList2.add(new C36598z(fabItemModel.getTitle(), fabItemModel.getInteraction(), AbstractC16315n0.m46378c(fabItemModel.getIcon(), EnumC16313m0.ADD)));
        }
        return new C36570d0(arrayList2);
    }
}
