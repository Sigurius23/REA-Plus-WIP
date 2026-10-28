package w91;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.design.models.items.FooterModel;
import com.whoop.design.models.items.GlowModel;
import com.whoop.design.models.items.GoalProgressCardModel;
import com.whoop.design.models.items.GoalSettingsTileModel;
import com.whoop.design.models.items.GoalTileModel;
import com.whoop.design.models.items.GoalTrackerIndicatorModel;
import com.whoop.design.models.items.GroupedItemsPanelModel;
import com.whoop.design.models.items.GroupedTogglesModel;
import com.whoop.design.models.items.HeaderItemsCardModel;
import com.whoop.design.models.items.HealthMonitorCardModel;
import com.whoop.design.models.items.HeartRateZone;
import com.whoop.design.models.items.HistoryListItemExpandedContentModel;
import com.whoop.design.models.items.HistoryListItemModel;
import com.whoop.design.models.items.HorizontalDividedListItem;
import com.whoop.design.models.items.HorizontalDividedListItemDialogInfo;
import com.whoop.design.models.items.HorizontalDividedListModel;
import com.whoop.design.models.items.HorizontalMetricTileModel;

/* JADX INFO: renamed from: w91.e */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C36958e implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f158126w;

    public /* synthetic */ C36958e(int i13) {
        this.f158126w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f158126w) {
            case 0:
                return FooterModel._childSerializers$_anonymous_();
            case 1:
                return GlowModel._childSerializers$_anonymous_();
            case 2:
                return GoalProgressCardModel._childSerializers$_anonymous_();
            case 3:
                return GoalProgressCardModel._childSerializers$_anonymous_$0();
            case 4:
                return GoalProgressCardModel._childSerializers$_anonymous_$1();
            case 5:
                return GoalSettingsTileModel._childSerializers$_anonymous_();
            case 6:
                return GoalTileModel._childSerializers$_anonymous_();
            case 7:
                return GoalTileModel._childSerializers$_anonymous_$0();
            case 8:
                return GoalTileModel._childSerializers$_anonymous_$1();
            case 9:
                return GoalTileModel._childSerializers$_anonymous_$2();
            case 10:
                return GoalTrackerIndicatorModel._childSerializers$_anonymous_();
            case 11:
                return GoalTrackerIndicatorModel._childSerializers$_anonymous_$0();
            case 12:
                return GroupedItemsPanelModel._childSerializers$_anonymous_();
            case 13:
                return GroupedTogglesModel._childSerializers$_anonymous_();
            case 14:
                return HeaderItemsCardModel._childSerializers$_anonymous_();
            case 15:
                return HeaderItemsCardModel._childSerializers$_anonymous_$0();
            case 16:
                return HealthMonitorCardModel._childSerializers$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return HealthMonitorCardModel._childSerializers$_anonymous_$0();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return HeartRateZone._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return HeartRateZone._childSerializers$_anonymous_$0();
            case 20:
                return HistoryListItemExpandedContentModel._childSerializers$_anonymous_();
            case 21:
                return HistoryListItemModel._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return HistoryListItemModel._childSerializers$_anonymous_$0();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return HorizontalDividedListItem._childSerializers$_anonymous_();
            case 24:
                return HorizontalDividedListItem._childSerializers$_anonymous_$0();
            case 25:
                return HorizontalDividedListItemDialogInfo._childSerializers$_anonymous_();
            case 26:
                return HorizontalDividedListItemDialogInfo._childSerializers$_anonymous_$0();
            case 27:
                return HorizontalDividedListItemDialogInfo._childSerializers$_anonymous_$1();
            case 28:
                return HorizontalDividedListModel._childSerializers$_anonymous_();
            default:
                return HorizontalMetricTileModel._childSerializers$_anonymous_();
        }
    }
}
