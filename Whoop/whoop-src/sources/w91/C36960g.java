package w91;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.design.models.items.JournalEntryWidgetModel;
import com.whoop.design.models.items.JournalEntrypointModel;
import com.whoop.design.models.items.JournalQuestionSliderModel;
import com.whoop.design.models.items.KeyMetricCarouselModel;
import com.whoop.design.models.items.KeyMetricTileModel;
import com.whoop.design.models.items.LabeledProgressBarModel;
import com.whoop.design.models.items.LabeledProgressBarStyle;
import com.whoop.design.models.items.LockedImpactOnRecoveryModel;
import com.whoop.design.models.items.MainAxisAlignment;
import com.whoop.design.models.items.MapModel;
import com.whoop.design.models.items.MembershipComparisonTableModel;
import com.whoop.design.models.items.MenuItemModel;
import com.whoop.design.models.items.MetricEducationModel;
import com.whoop.design.models.items.MilestoneCardModel;
import com.whoop.design.models.items.MiniCalloutModel;
import com.whoop.design.models.items.MultiSelectModel;
import com.whoop.design.models.items.MultiWheelPickerModel;
import com.whoop.design.models.items.MultiWheelPickerWheel;
import com.whoop.design.models.items.MultipleButtonContainerModel;
import com.whoop.design.models.items.NavigationBarFixedHeader;

/* JADX INFO: renamed from: w91.g */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C36960g implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f158128w;

    public /* synthetic */ C36960g(int i13) {
        this.f158128w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f158128w) {
            case 0:
                return JournalEntryWidgetModel._childSerializers$_anonymous_$2();
            case 1:
                return JournalEntryWidgetModel._childSerializers$_anonymous_$3();
            case 2:
                return JournalEntrypointModel._childSerializers$_anonymous_();
            case 3:
                return JournalEntrypointModel._childSerializers$_anonymous_$0();
            case 4:
                return JournalQuestionSliderModel._childSerializers$_anonymous_();
            case 5:
                return KeyMetricCarouselModel._childSerializers$_anonymous_();
            case 6:
                return KeyMetricTileModel._childSerializers$_anonymous_();
            case 7:
                return LabeledProgressBarModel._childSerializers$_anonymous_();
            case 8:
                return LabeledProgressBarStyle._init_$_anonymous_();
            case 9:
                return LockedImpactOnRecoveryModel._childSerializers$_anonymous_();
            case 10:
                return MainAxisAlignment._init_$_anonymous_();
            case 11:
                return MapModel._childSerializers$_anonymous_();
            case 12:
                return MapModel._childSerializers$_anonymous_$0();
            case 13:
                return MapModel._childSerializers$_anonymous_$1();
            case 14:
                return MembershipComparisonTableModel._childSerializers$_anonymous_();
            case 15:
                return MembershipComparisonTableModel._childSerializers$_anonymous_$0();
            case 16:
                return MenuItemModel._childSerializers$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return MenuItemModel._childSerializers$_anonymous_$0();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return MetricEducationModel._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return MilestoneCardModel._childSerializers$_anonymous_();
            case 20:
                return MiniCalloutModel._childSerializers$_anonymous_();
            case 21:
                return MiniCalloutModel._childSerializers$_anonymous_$0();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return MiniCalloutModel._childSerializers$_anonymous_$1();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return MultiSelectModel._childSerializers$_anonymous_();
            case 24:
                return MultiWheelPickerModel._childSerializers$_anonymous_();
            case 25:
                return MultiWheelPickerModel._childSerializers$_anonymous_$0();
            case 26:
                return MultiWheelPickerWheel._childSerializers$_anonymous_();
            case 27:
                return MultipleButtonContainerModel._childSerializers$_anonymous_();
            case 28:
                return NavigationBarFixedHeader._childSerializers$_anonymous_();
            default:
                return NavigationBarFixedHeader._childSerializers$_anonymous_$0();
        }
    }
}
