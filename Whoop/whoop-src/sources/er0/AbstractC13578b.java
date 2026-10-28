package er0;

import com.whoop.communityfollowercontainer.domain.model.CommunityFilterBottomSheetModel;
import com.whoop.communityfollowercontainer.domain.model.OptionSection;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.DesignSystemModelKt;
import com.whoop.design.models.items.FlowRowModel;
import com.whoop.design.models.items.TagBackgroundStyle;
import com.whoop.design.models.items.TagModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.C21535a;
import m83.AbstractC25265s;
import m83.C25271y;
import p715kotlin.Metadata;
import v01.C35499a;
import v01.C35502d;

/* JADX INFO: renamed from: er0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/communityfollowercontainer/domain/model/CommunityFilterBottomSheetModel;", "Ljb1/a;", "designItemReducer", "Lv01/a;", "c", "(Lcom/whoop/communityfollowercontainer/domain/model/CommunityFilterBottomSheetModel;Ljb1/a;)Lv01/a;", "Lcom/whoop/communityfollowercontainer/domain/model/OptionSection;", "", "Lv01/d;", "b", "(Lcom/whoop/communityfollowercontainer/domain/model/OptionSection;)Ljava/util/List;", "community-follower-container-arch-mini_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13578b {
    /* JADX INFO: renamed from: b */
    private static final List<C35502d> m38321b(OptionSection optionSection) {
        List<DesignSystemModel> items = optionSection != null ? optionSection.getItems() : null;
        C25271y c25271y = C25271y.f99162w;
        if (items == null) {
            items = c25271y;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            DesignSystemModel designSystemModelUnwrap = DesignSystemModelKt.unwrap((DesignSystemModel) it.next());
            FlowRowModel flowRowModel = designSystemModelUnwrap instanceof FlowRowModel ? (FlowRowModel) designSystemModelUnwrap : null;
            if (flowRowModel != null) {
                arrayList.add(flowRowModel);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            List<DesignSystemModel> items2 = ((FlowRowModel) it3.next()).getItems();
            if (items2 == null) {
                items2 = c25271y;
            }
            AbstractC25265s.m74141p0(arrayList2, items2);
        }
        ArrayList<TagModel> arrayList3 = new ArrayList();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            DesignSystemModel designSystemModelUnwrap2 = DesignSystemModelKt.unwrap((DesignSystemModel) it4.next());
            TagModel tagModel = designSystemModelUnwrap2 instanceof TagModel ? (TagModel) designSystemModelUnwrap2 : null;
            if (tagModel != null) {
                arrayList3.add(tagModel);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (TagModel tagModel2 : arrayList3) {
            String value = tagModel2.getValue();
            C35502d c35502d = value == null ? null : new C35502d(AbstractC8693b.m21278l(tagModel2.getTitle()), value, tagModel2.getTagStyle() == TagBackgroundStyle.SELECTED);
            if (c35502d != null) {
                arrayList4.add(c35502d);
            }
        }
        return arrayList4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C35499a m38322c(CommunityFilterBottomSheetModel communityFilterBottomSheetModel, C21535a c21535a) {
        TextResource textResourceM21267a;
        TextResource textResourceM21267a2;
        String title;
        String title2;
        OptionSection filters = communityFilterBottomSheetModel.getFilters();
        if (filters == null || (title2 = filters.getTitle()) == null || (textResourceM21267a = AbstractC8693b.m21278l(title2)) == null) {
            textResourceM21267a = AbstractC8693b.m21267a();
        }
        TextResource textResource = textResourceM21267a;
        List<C35502d> listM38321b = m38321b(communityFilterBottomSheetModel.getFilters());
        OptionSection sorts = communityFilterBottomSheetModel.getSorts();
        if (sorts == null || (title = sorts.getTitle()) == null || (textResourceM21267a2 = AbstractC8693b.m21278l(title)) == null) {
            textResourceM21267a2 = AbstractC8693b.m21267a();
        }
        TextResource textResource2 = textResourceM21267a2;
        List<C35502d> listM38321b2 = m38321b(communityFilterBottomSheetModel.getSorts());
        DesignSystemModel cta = communityFilterBottomSheetModel.getCta();
        return new C35499a(textResource, listM38321b, textResource2, listM38321b2, cta != null ? c21535a.m60542i(cta) : null);
    }
}
