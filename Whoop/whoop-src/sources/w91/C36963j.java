package w91;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.design.models.items.SegmentControllerModel;
import com.whoop.design.models.items.SegmentedContentModel;
import com.whoop.design.models.items.SelectableCellListModel;
import com.whoop.design.models.items.SelectableCellModel;
import com.whoop.design.models.items.SelectionWidgetModel;
import com.whoop.design.models.items.ShippingProgressBarModel;
import com.whoop.design.models.items.ShoppingTileCarouselModel;
import com.whoop.design.models.items.SingleSelectModel;
import com.whoop.design.models.items.SleepPlannerCardModel;
import com.whoop.design.models.items.Spacing;
import com.whoop.design.models.items.SpacingInsets;
import com.whoop.design.models.items.SpecificationTableModel;
import com.whoop.design.models.items.SplitColumnModel;
import com.whoop.design.models.items.StartTurnButtonStyleModel;

/* JADX INFO: renamed from: w91.j */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C36963j implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f158131w;

    public /* synthetic */ C36963j(int i13) {
        this.f158131w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f158131w) {
            case 0:
                return SegmentControllerModel._childSerializers$_anonymous_();
            case 1:
                return SegmentedContentModel._childSerializers$_anonymous_();
            case 2:
                return SegmentedContentModel._childSerializers$_anonymous_$0();
            case 3:
                return SelectableCellListModel._childSerializers$_anonymous_();
            case 4:
                return SelectableCellListModel._childSerializers$_anonymous_$0();
            case 5:
                return SelectableCellListModel._childSerializers$_anonymous_$1();
            case 6:
                return SelectableCellModel._childSerializers$_anonymous_();
            case 7:
                return SelectableCellModel._childSerializers$_anonymous_$0();
            case 8:
                return SelectableCellModel._childSerializers$_anonymous_$1();
            case 9:
                return SelectableCellModel._childSerializers$_anonymous_$2();
            case 10:
                return SelectionWidgetModel._childSerializers$_anonymous_();
            case 11:
                return SelectionWidgetModel._childSerializers$_anonymous_$0();
            case 12:
                return SelectionWidgetModel._childSerializers$_anonymous_$1();
            case 13:
                return ShippingProgressBarModel._childSerializers$_anonymous_();
            case 14:
                return ShippingProgressBarModel._childSerializers$_anonymous_$0();
            case 15:
                return ShoppingTileCarouselModel._childSerializers$_anonymous_();
            case 16:
                return SingleSelectModel._childSerializers$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return SleepPlannerCardModel._childSerializers$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return Spacing._init_$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return SpacingInsets._childSerializers$_anonymous_();
            case 20:
                return SpacingInsets._childSerializers$_anonymous_$0();
            case 21:
                return SpacingInsets._childSerializers$_anonymous_$1();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return SpacingInsets._childSerializers$_anonymous_$2();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return SpecificationTableModel._childSerializers$_anonymous_();
            case 24:
                return SplitColumnModel._childSerializers$_anonymous_();
            case 25:
                return SplitColumnModel._childSerializers$_anonymous_$0();
            case 26:
                return SplitColumnModel._childSerializers$_anonymous_$1();
            case 27:
                return StartTurnButtonStyleModel._childSerializers$_anonymous_();
            case 28:
                return StartTurnButtonStyleModel._childSerializers$_anonymous_$0();
            default:
                return StartTurnButtonStyleModel._childSerializers$_anonymous_$1();
        }
    }
}
