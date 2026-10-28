package w91;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.design.models.items.CustomizeBottomSheetSelectorModel;
import com.whoop.design.models.items.DailyTickMarkPlotModel;
import com.whoop.design.models.items.DataHighlightModel;
import com.whoop.design.models.items.DatePillModel;
import com.whoop.design.models.items.DateStripEntryStatus;
import com.whoop.design.models.items.DateStripItemModel;
import com.whoop.design.models.items.DateStripModel;
import com.whoop.design.models.items.DayOptions;
import com.whoop.design.models.items.DesignItemGridModel;
import com.whoop.design.models.items.DesignItemGridVerticalAlignment;
import com.whoop.design.models.items.DetailsAnswers;
import com.whoop.design.models.items.DetailsMetricTileModel;
import com.whoop.design.models.items.DialogInfo;
import com.whoop.design.models.items.DynamicInformationalImageCardModel;
import com.whoop.design.models.items.EntryPointModel;
import com.whoop.design.models.items.ExerciseBreakdownModel;
import com.whoop.design.models.items.ExerciseBreakdownRow;
import com.whoop.design.models.items.ExpandableCardModel;

/* JADX INFO: renamed from: w91.c */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C36956c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f158124w;

    public /* synthetic */ C36956c(int i13) {
        this.f158124w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f158124w) {
            case 0:
                return CustomizeBottomSheetSelectorModel._childSerializers$_anonymous_$2();
            case 1:
                return CustomizeBottomSheetSelectorModel._childSerializers$_anonymous_$3();
            case 2:
                return DailyTickMarkPlotModel._childSerializers$_anonymous_();
            case 3:
                return DailyTickMarkPlotModel._childSerializers$_anonymous_$0();
            case 4:
                return DailyTickMarkPlotModel._childSerializers$_anonymous_$1();
            case 5:
                return DailyTickMarkPlotModel._childSerializers$_anonymous_$2();
            case 6:
                return DataHighlightModel._childSerializers$_anonymous_();
            case 7:
                return DatePillModel._childSerializers$_anonymous_();
            case 8:
                return DatePillModel._childSerializers$_anonymous_$0();
            case 9:
                return DatePillModel._childSerializers$_anonymous_$1();
            case 10:
                return DateStripEntryStatus._init_$_anonymous_();
            case 11:
                return DateStripItemModel._childSerializers$_anonymous_();
            case 12:
                return DateStripModel._childSerializers$_anonymous_();
            case 13:
                return DateStripModel._childSerializers$_anonymous_$0();
            case 14:
                return DateStripModel._childSerializers$_anonymous_$1();
            case 15:
                return DayOptions._childSerializers$_anonymous_();
            case 16:
                return DesignItemGridModel._childSerializers$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return DesignItemGridModel._childSerializers$_anonymous_$0();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return DesignItemGridVerticalAlignment._init_$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return DetailsAnswers._childSerializers$_anonymous_();
            case 20:
                return DetailsMetricTileModel._childSerializers$_anonymous_();
            case 21:
                return DialogInfo._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return DynamicInformationalImageCardModel._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return EntryPointModel._childSerializers$_anonymous_();
            case 24:
                return EntryPointModel._childSerializers$_anonymous_$0();
            case 25:
                return ExerciseBreakdownModel._childSerializers$_anonymous_();
            case 26:
                return ExerciseBreakdownModel._childSerializers$_anonymous_$0();
            case 27:
                return ExerciseBreakdownRow._childSerializers$_anonymous_();
            case 28:
                return ExpandableCardModel._childSerializers$_anonymous_();
            default:
                return ExpandableCardModel._childSerializers$_anonymous_$0();
        }
    }
}
