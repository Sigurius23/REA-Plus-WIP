package p716lb1;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.models.items.FaqListModel;
import com.whoop.design.models.items.GroupedItemsPanelModel;
import com.whoop.design.models.items.HorizontalScrollContainerModel;
import com.whoop.design.models.items.IconMarkdownCalloutModel;
import com.whoop.design.models.items.ImageCardPickerModel;
import com.whoop.design.models.items.ImageUrlModel;
import com.whoop.design.models.items.ImpactCardModel;
import com.whoop.design.models.items.ImpactModel;
import com.whoop.design.models.items.InsightsItemListModel;
import com.whoop.design.models.items.InsightsItemModel;
import com.whoop.design.models.items.IntegrationUpsellModel;
import com.whoop.design.models.items.JournalEntrypointModel;
import com.whoop.design.models.items.PerksListModel;
import com.whoop.design.models.items.ScoreGaugeRowModel;
import com.whoop.design.models.items.ShoppingTileCarouselModel;
import com.whoop.design.models.items.ShoppingTileModel;
import com.whoop.design.models.items.TestimonialsModel;
import com.whoop.design.models.items.TrendIconsLegendModel;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lb1.t1 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C23714t1 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f93971w;

    public /* synthetic */ C23714t1(int i13) {
        this.f93971w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f93971w) {
            case 0:
                return AbstractC23720u1.m69475o((ScoreGaugeRowModel) obj);
            case 1:
                return AbstractC23738x1.m69647d((C23749z0) obj);
            case 2:
                return AbstractC23744y1.m69698f((C23749z0) obj);
            case 3:
                return AbstractC23744y1.m69699g((GroupedItemsPanelModel) obj);
            case 4:
                return AbstractC23750z1.m69777k((C23749z0) obj);
            case 5:
                return AbstractC23750z1.m69778l((PerksListModel) obj);
            case 6:
                return AbstractC23750z1.m69779m((FaqListModel) obj);
            case 7:
                return AbstractC23750z1.m69780n((ShoppingTileCarouselModel) obj);
            case 8:
                return AbstractC23750z1.m69783q((ShoppingTileModel) obj);
            case 9:
                return AbstractC23597b2.m68529f((C23749z0) obj);
            case 10:
                return AbstractC23597b2.m68530g((HorizontalScrollContainerModel) obj);
            case 11:
                return AbstractC23604c2.m68578d((C23749z0) obj);
            case 12:
                return AbstractC23604c2.m68579e((IconMarkdownCalloutModel) obj);
            case 13:
                return AbstractC23618e2.m68694e((C23749z0) obj);
            case 14:
                return AbstractC23618e2.m68695f((ImageUrlModel) obj);
            case 15:
                return AbstractC23618e2.m68696g((ImageCardPickerModel) obj);
            case 16:
                return AbstractC23632g2.m68792e((C23749z0) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC23632g2.m68793f((ImpactModel) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC23660k2.m68979g((C23749z0) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC23660k2.m68980h((InsightsItemModel) obj);
            case 20:
                return AbstractC23660k2.m68981i((InsightsItemListModel) obj);
            case 21:
                return AbstractC23667l2.m69027e((C23749z0) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC23667l2.m69028f((IntegrationUpsellModel) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC23685o2.m69188d((C23749z0) obj);
            case 24:
                return AbstractC23685o2.m69189e((JournalEntrypointModel) obj);
            case 25:
                return AbstractC23691p2.m69229d((C23749z0) obj);
            case 26:
                return AbstractC23691p2.m69230e((TrendIconsLegendModel) obj);
            case 27:
                return AbstractC23709s2.m69391i((C23749z0) obj);
            case 28:
                return AbstractC23709s2.m69392j((ImpactCardModel) obj);
            default:
                return AbstractC23709s2.m69394l((TestimonialsModel) obj);
        }
    }
}
