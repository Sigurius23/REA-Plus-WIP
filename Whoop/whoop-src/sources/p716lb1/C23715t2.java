package p716lb1;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.models.cards.MenstrualCycleInsightsCardModel;
import com.whoop.design.models.items.ContributorTileMetricModel;
import com.whoop.design.models.items.ExpandableListModel;
import com.whoop.design.models.items.FeatureListModel;
import com.whoop.design.models.items.FeedbackSurveyModel;
import com.whoop.design.models.items.FlowRowModel;
import com.whoop.design.models.items.HorizontalDividedListModel;
import com.whoop.design.models.items.HorizontalStatModel;
import com.whoop.design.models.items.InfoRowListModel;
import com.whoop.design.models.items.KeyMetricCarouselModel;
import com.whoop.design.models.items.KeyMetricTileModel;
import com.whoop.design.models.items.MapModel;
import com.whoop.design.models.items.MilestoneCardModel;
import com.whoop.design.models.items.MilestonePillWrapperModel;
import com.whoop.design.models.items.MilestoneProgressCardModel;
import com.whoop.design.models.items.MiniCalloutModel;
import com.whoop.design.models.items.MultiSelectModel;
import com.whoop.design.models.items.MultipleButtonContainerModel;
import com.whoop.design.models.items.NumberedListModel;
import com.whoop.design.models.items.WaitlistBiomarkerListPreviewModel;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lb1.t2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C23715t2 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f93972w;

    public /* synthetic */ C23715t2(int i13) {
        this.f93972w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f93972w) {
            case 0:
                return AbstractC23721u2.m69508l((C23749z0) obj);
            case 1:
                return AbstractC23721u2.m69509m((FeatureListModel) obj);
            case 2:
                return AbstractC23721u2.m69510n((ExpandableListModel) obj);
            case 3:
                return AbstractC23721u2.m69511o((NumberedListModel) obj);
            case 4:
                return AbstractC23721u2.m69512p((InfoRowListModel) obj);
            case 5:
                return AbstractC23721u2.m69513q((FlowRowModel) obj);
            case 6:
                return AbstractC23721u2.m69514r((WaitlistBiomarkerListPreviewModel) obj);
            case 7:
                return AbstractC23721u2.m69515s((FeedbackSurveyModel) obj);
            case 8:
                return AbstractC23721u2.m69516t((HorizontalDividedListModel) obj);
            case 9:
                return AbstractC23739x2.m69656e((C23749z0) obj);
            case 10:
                return AbstractC23739x2.m69657f((MapModel) obj);
            case 11:
                return AbstractC23745y2.m69709h((C23749z0) obj);
            case 12:
                return AbstractC23745y2.m69710i((MenstrualCycleInsightsCardModel) obj);
            case 13:
                return AbstractC23591a3.m68266h((C23749z0) obj);
            case 14:
                return AbstractC23591a3.m68267i((ContributorTileMetricModel) obj);
            case 15:
                return AbstractC23591a3.m68268j((KeyMetricCarouselModel) obj);
            case 16:
                return AbstractC23591a3.m68270l((KeyMetricTileModel) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC23591a3.m68271m((HorizontalStatModel) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC23598b3.m68537e((C23749z0) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC23598b3.m68538f((MilestoneCardModel) obj);
            case 20:
                return AbstractC23605c3.m68584d((C23749z0) obj);
            case 21:
                return AbstractC23605c3.m68585e((MilestonePillWrapperModel) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC23612d3.m68647e((C23749z0) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC23612d3.m68648f((MilestoneProgressCardModel) obj);
            case 24:
                return AbstractC23619e3.m68704d((C23749z0) obj);
            case 25:
                return AbstractC23619e3.m68705e((MiniCalloutModel) obj);
            case 26:
                return AbstractC23633g3.m68798d((C23749z0) obj);
            case 27:
                return AbstractC23633g3.m68799e((MultiSelectModel) obj);
            case 28:
                return AbstractC23647i3.m68878d((C23749z0) obj);
            default:
                return AbstractC23647i3.m68879e((MultipleButtonContainerModel) obj);
        }
    }
}
