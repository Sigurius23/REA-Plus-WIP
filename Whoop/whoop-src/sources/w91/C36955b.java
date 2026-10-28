package w91;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.design.models.items.CoachingTileModel;
import com.whoop.design.models.items.ColumnModel;
import com.whoop.design.models.items.CommunityFollowerModel;
import com.whoop.design.models.items.CommunityTeamTileModel;
import com.whoop.design.models.items.CompactTrendModel;
import com.whoop.design.models.items.ComparisonTableCell;
import com.whoop.design.models.items.ComparisonTableModel;
import com.whoop.design.models.items.ContextCardModel;
import com.whoop.design.models.items.ContributorSectionModel;
import com.whoop.design.models.items.ContributorTileFooter;
import com.whoop.design.models.items.ContributorTileMetricModel;
import com.whoop.design.models.items.ContributorTileModel;
import com.whoop.design.models.items.CountrySelectorModel;
import com.whoop.design.models.items.CrossAxisAlignment;
import com.whoop.design.models.items.CtaTileModel;
import com.whoop.design.models.items.CurrentPlanTileModel;
import com.whoop.design.models.items.CustomizeBottomSheetModel;
import com.whoop.design.models.items.CustomizeBottomSheetSelectorModel;

/* JADX INFO: renamed from: w91.b */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C36955b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f158123w;

    public /* synthetic */ C36955b(int i13) {
        this.f158123w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f158123w) {
            case 0:
                return CoachingTileModel._childSerializers$_anonymous_();
            case 1:
                return CoachingTileModel._childSerializers$_anonymous_$0();
            case 2:
                return ColumnModel._childSerializers$_anonymous_();
            case 3:
                return ColumnModel._childSerializers$_anonymous_$0();
            case 4:
                return CommunityFollowerModel._childSerializers$_anonymous_();
            case 5:
                return CommunityFollowerModel._childSerializers$_anonymous_$0();
            case 6:
                return CommunityTeamTileModel._childSerializers$_anonymous_();
            case 7:
                return CompactTrendModel._childSerializers$_anonymous_();
            case 8:
                return ComparisonTableCell._childSerializers$_anonymous_();
            case 9:
                return ComparisonTableModel._childSerializers$_anonymous_();
            case 10:
                return ComparisonTableModel._childSerializers$_anonymous_$0();
            case 11:
                return ContextCardModel._childSerializers$_anonymous_();
            case 12:
                return ContextCardModel._childSerializers$_anonymous_$0();
            case 13:
                return ContributorSectionModel._childSerializers$_anonymous_();
            case 14:
                return ContributorTileFooter._childSerializers$_anonymous_();
            case 15:
                return ContributorTileMetricModel._childSerializers$_anonymous_();
            case 16:
                return ContributorTileMetricModel._childSerializers$_anonymous_$0();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return ContributorTileMetricModel._childSerializers$_anonymous_$1();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ContributorTileModel._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ContributorTileModel._childSerializers$_anonymous_$0();
            case 20:
                return ContributorTileModel._childSerializers$_anonymous_$1();
            case 21:
                return CountrySelectorModel._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return CrossAxisAlignment._init_$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return CtaTileModel._childSerializers$_anonymous_();
            case 24:
                return CtaTileModel._childSerializers$_anonymous_$0();
            case 25:
                return CurrentPlanTileModel._childSerializers$_anonymous_();
            case 26:
                return CustomizeBottomSheetModel._childSerializers$_anonymous_();
            case 27:
                return CustomizeBottomSheetSelectorModel._childSerializers$_anonymous_();
            case 28:
                return CustomizeBottomSheetSelectorModel._childSerializers$_anonymous_$0();
            default:
                return CustomizeBottomSheetSelectorModel._childSerializers$_anonymous_$1();
        }
    }
}
