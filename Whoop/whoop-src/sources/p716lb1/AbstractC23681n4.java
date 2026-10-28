package p716lb1;

import com.whoop.design.atomic.molecule.InformationItemStyle;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.InformationItemModel;
import com.whoop.design.models.items.SpecificationTableModel;
import gz0.AbstractC16315n0;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p736sz0.C33176e1;
import p736sz0.C33230x;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: lb1.n4 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/design/models/items/SpecificationTableModel;", "Lsz0/e1;", "e", "(Lcom/whoop/design/models/items/SpecificationTableModel;)Lsz0/e1;", "Lcom/whoop/design/models/items/InformationItemModel;", "", "index", "Lsz0/x;", "d", "(Lcom/whoop/design/models/items/InformationItemModel;I)Lsz0/x;", "Llb1/y0;", "a", "Llb1/y0;", "c", "()Llb1/y0;", "specificationTableMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23681n4 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93890a = Function1.m68251a(new C23740x3(29));

    /* JADX INFO: renamed from: lb1.n4$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93891w;

        public a(Function1 function1) {
            this.f93891w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93891w.invoke((SpecificationTableModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23743y0 m69165c() {
        return f93890a;
    }

    /* JADX INFO: renamed from: d */
    public static final C33230x m69166d(InformationItemModel informationItemModel, int i13) {
        AbstractC22676k.m65750j(informationItemModel, "<this>");
        String strM73373f = AbstractC25012a.m73373f(i13, informationItemModel.getTitle(), "_");
        String title = informationItemModel.getTitle();
        String description = informationItemModel.getDescription();
        String icon = informationItemModel.getIcon();
        InformationItemStyle informationItemStyle = null;
        Integer numM46376a = icon != null ? AbstractC16315n0.m46376a(icon) : null;
        String style = informationItemModel.getStyle();
        InformationItemStyle informationItemStyle2 = InformationItemStyle.INLINE;
        for (InformationItemStyle informationItemStyle3 : InformationItemStyle.values()) {
            if (AbstractC22676k.m65745e(informationItemStyle3.name(), style)) {
                informationItemStyle = informationItemStyle3;
                break;
            }
        }
        return new C33230x(title, description, numM46376a, informationItemStyle == null ? informationItemStyle2 : informationItemStyle, strM73373f, informationItemModel.getDescriptionColor());
    }

    /* JADX INFO: renamed from: e */
    public static final C33176e1 m69167e(SpecificationTableModel specificationTableModel) {
        AbstractC22676k.m65750j(specificationTableModel, "<this>");
        List<InformationItemModel> items = specificationTableModel.getItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
        int i13 = 0;
        for (Object obj : items) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            arrayList.add(m69166d((InformationItemModel) obj, i13));
            i13 = i14;
        }
        return new C33176e1(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m69168f(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(SpecificationTableModel.class), new a(new C23675m4(0)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C33176e1 m69169g(SpecificationTableModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69167e(model);
    }
}
