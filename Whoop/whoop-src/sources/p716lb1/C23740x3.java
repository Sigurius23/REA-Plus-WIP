package p716lb1;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.models.items.ArchMiniSearchModel;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.CardIconButtonModel;
import com.whoop.design.models.items.RewardItemModel;
import com.whoop.design.models.items.RewardsSectionModel;
import com.whoop.design.models.items.SearchBarModel;
import com.whoop.design.models.items.SecondaryButtonModel;
import com.whoop.design.models.items.SectionModel;
import com.whoop.design.models.items.SegmentedContentModel;
import com.whoop.design.models.items.SelectableCellListModel;
import com.whoop.design.models.items.SelectableCellModel;
import com.whoop.design.models.items.SelectableChipModel;
import com.whoop.design.models.items.SelectionWidgetModel;
import com.whoop.design.models.items.SingleSelectModel;
import com.whoop.design.models.items.searchable.SearchableListModel;
import com.whoop.design.models.items.searchable.SearchableRowModel;
import com.whoop.design.models.items.searchable.SearchableSectionModel;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lb1.x3 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C23740x3 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f94058w;

    public /* synthetic */ C23740x3(int i13) {
        this.f94058w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f94058w) {
            case 0:
                return AbstractC23746y3.m69716e((RewardItemModel) obj);
            case 1:
                return AbstractC23752z3.m69794f((C23749z0) obj);
            case 2:
                return AbstractC23752z3.m69795g((RewardsSectionModel) obj);
            case 3:
                return AbstractC23592a4.m68282d((C23749z0) obj);
            case 4:
                return AbstractC23592a4.m68283e((ArchMiniSearchModel) obj);
            case 5:
                return AbstractC23599b4.m68543d((C23749z0) obj);
            case 6:
                return AbstractC23599b4.m68544e((SearchBarModel) obj);
            case 7:
                return AbstractC23606c4.m68592f((C23749z0) obj);
            case 8:
                return AbstractC23606c4.m68593g((SearchableRowModel) obj);
            case 9:
                return AbstractC23606c4.m68594h((SearchableSectionModel) obj);
            case 10:
                return AbstractC23606c4.m68595i((SearchableListModel) obj);
            case 11:
                return AbstractC23613d4.m68657g((C23749z0) obj);
            case 12:
                return AbstractC23613d4.m68658h((SecondaryButtonModel) obj);
            case 13:
                return AbstractC23613d4.m68659i((CardButtonModel) obj);
            case 14:
                return AbstractC23613d4.m68660j((CardIconButtonModel) obj);
            case 15:
                return AbstractC23620e4.m68712e((C23749z0) obj);
            case 16:
                return AbstractC23620e4.m68713f((SectionModel) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC23627f4.m68752e((C23749z0) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC23627f4.m68753f((SegmentedContentModel) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC23634g4.m68806f((C23749z0) obj);
            case 20:
                return AbstractC23634g4.m68807g((SelectableCellListModel) obj);
            case 21:
                return AbstractC23641h4.m68846e((C23749z0) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC23641h4.m68847f((SelectableCellModel) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC23648i4.m68885d((C23749z0) obj);
            case 24:
                return AbstractC23648i4.m68886e((SelectableChipModel) obj);
            case 25:
                return AbstractC23655j4.m68928d((C23749z0) obj);
            case 26:
                return AbstractC23655j4.m68929e((SelectionWidgetModel) obj);
            case 27:
                return AbstractC23669l4.m69059d((C23749z0) obj);
            case 28:
                return AbstractC23669l4.m69060e((SingleSelectModel) obj);
            default:
                return AbstractC23681n4.m69168f((C23749z0) obj);
        }
    }
}
