package p716lb1;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.models.ComparisonBarsGraphModel;
import com.whoop.design.models.cards.CompactButtonCardModel;
import com.whoop.design.models.cards.ContentBlockCardModel;
import com.whoop.design.models.cards.ContentBlockListCardModel;
import com.whoop.design.models.items.ArchMiniCommunityFollowerLookupModel;
import com.whoop.design.models.items.ArrowStatModel;
import com.whoop.design.models.items.CommunityFollowerModel;
import com.whoop.design.models.items.CommunityTeamTileModel;
import com.whoop.design.models.items.CompactTrendModel;
import com.whoop.design.models.items.ComparisonTableModel;
import com.whoop.design.models.items.DataHighlightModel;
import com.whoop.design.models.items.DateSelectorModel;
import com.whoop.design.models.items.DesignItemGridModel;
import com.whoop.design.models.items.DetailsMetricTileModel;
import com.whoop.design.models.items.FollowerRequestModel;
import com.whoop.design.models.items.MembershipComparisonTableModel;
import com.whoop.design.models.items.StrainBreakDownModel;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lb1.i0 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C23644i0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f93795w;

    public /* synthetic */ C23644i0(int i13) {
        this.f93795w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f93795w) {
            case 0:
                return AbstractC23651j0.m68910d((ArchMiniCommunityFollowerLookupModel) obj);
            case 1:
                return AbstractC23658k0.m68955i((C23749z0) obj);
            case 2:
                return AbstractC23658k0.m68953g((C23749z0) obj);
            case 3:
                return AbstractC23658k0.m68957k((C23749z0) obj);
            case 4:
                return AbstractC23658k0.m68956j((CommunityFollowerModel) obj);
            case 5:
                return AbstractC23658k0.m68954h((FollowerRequestModel) obj);
            case 6:
                return AbstractC23658k0.m68958l((CommunityTeamTileModel) obj);
            case 7:
                return AbstractC23665l0.m69010c((C23749z0) obj);
            case 8:
                return AbstractC23665l0.m69011d((CompactButtonCardModel) obj);
            case 9:
                return AbstractC23671m0.m69064c((C23749z0) obj);
            case 10:
                return AbstractC23671m0.m69065d((CompactTrendModel) obj);
            case 11:
                return AbstractC23677n0.m69109f((C23749z0) obj);
            case 12:
                return AbstractC23677n0.m69110g((StrainBreakDownModel) obj);
            case 13:
                return AbstractC23677n0.m69111h((MembershipComparisonTableModel) obj);
            case 14:
                return AbstractC23677n0.m69118o((ComparisonTableModel) obj);
            case 15:
                return AbstractC23689p0.m69215d((C23749z0) obj);
            case 16:
                return AbstractC23689p0.m69216e((ContentBlockCardModel) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC23695q0.m69264d((C23749z0) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC23695q0.m69265e((ContentBlockListCardModel) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC23719u0.m69452d((C23749z0) obj);
            case 20:
                return AbstractC23719u0.m69453e((DataHighlightModel) obj);
            case 21:
                return AbstractC23731w0.m69610c((C23749z0) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC23731w0.m69611d((DateSelectorModel) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC23737x0.m69638e((C23749z0) obj);
            case 24:
                return AbstractC23737x0.m69639f((DesignItemGridModel) obj);
            case 25:
                return AbstractC23610d1.m68632f((C23749z0) obj);
            case 26:
                return AbstractC23610d1.m68633g((ArrowStatModel) obj);
            case 27:
                return AbstractC23610d1.m68634h((ComparisonBarsGraphModel) obj);
            case 28:
                return AbstractC23610d1.m68635i((DetailsMetricTileModel) obj);
            default:
                return AbstractC23624f1.m68740c((C23749z0) obj);
        }
    }
}
