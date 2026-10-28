package w91;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.design.models.items.NavigationBarModel;
import com.whoop.design.models.items.NavigationBarStyle;
import com.whoop.design.models.items.NavigationButtonModel;
import com.whoop.design.models.items.NotableStatsModel;
import com.whoop.design.models.items.NumberedListModel;
import com.whoop.design.models.items.NumericInputSliderModel;
import com.whoop.design.models.items.OptionCommitPanelModel;
import com.whoop.design.models.items.PaceOfAgingMeterModel;
import com.whoop.design.models.items.PerksListModel;
import com.whoop.design.models.items.PhaseModel;
import com.whoop.design.models.items.PieChartModel;
import com.whoop.design.models.items.PlanTileModel;
import com.whoop.design.models.items.PregnancyProgressBarModel;
import com.whoop.design.models.items.PregnancyProgressLabelModel;
import com.whoop.design.models.items.PregnancyTilePlot;
import com.whoop.design.models.items.PricingSelectionCardModel;
import com.whoop.design.models.items.ProductCollectionModel;

/* JADX INFO: renamed from: w91.h */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C36961h implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f158129w;

    public /* synthetic */ C36961h(int i13) {
        this.f158129w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f158129w) {
            case 0:
                return NavigationBarModel._childSerializers$_anonymous_();
            case 1:
                return NavigationBarModel._childSerializers$_anonymous_$0();
            case 2:
                return NavigationBarModel._childSerializers$_anonymous_$1();
            case 3:
                return NavigationBarStyle._init_$_anonymous_();
            case 4:
                return NavigationButtonModel._childSerializers$_anonymous_();
            case 5:
                return NavigationButtonModel._childSerializers$_anonymous_$0();
            case 6:
                return NavigationButtonModel._childSerializers$_anonymous_$1();
            case 7:
                return NavigationButtonModel._childSerializers$_anonymous_$2();
            case 8:
                return NotableStatsModel._childSerializers$_anonymous_();
            case 9:
                return NumberedListModel._childSerializers$_anonymous_();
            case 10:
                return NumericInputSliderModel._childSerializers$_anonymous_();
            case 11:
                return NumericInputSliderModel._childSerializers$_anonymous_$0();
            case 12:
                return NumericInputSliderModel.EndLabel._childSerializers$_anonymous_();
            case 13:
                return NumericInputSliderModel.StartLabel._childSerializers$_anonymous_();
            case 14:
                return OptionCommitPanelModel._childSerializers$_anonymous_();
            case 15:
                return OptionCommitPanelModel._childSerializers$_anonymous_$0();
            case 16:
                return PaceOfAgingMeterModel._childSerializers$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return PerksListModel._childSerializers$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return PhaseModel._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return PieChartModel._childSerializers$_anonymous_();
            case 20:
                return PlanTileModel._childSerializers$_anonymous_();
            case 21:
                return PlanTileModel._childSerializers$_anonymous_$0();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return PregnancyProgressBarModel._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return PregnancyProgressLabelModel._childSerializers$_anonymous_();
            case 24:
                return PregnancyTilePlot._childSerializers$_anonymous_();
            case 25:
                return PregnancyTilePlot._childSerializers$_anonymous_$0();
            case 26:
                return PricingSelectionCardModel._childSerializers$_anonymous_();
            case 27:
                return PricingSelectionCardModel._childSerializers$_anonymous_$0();
            case 28:
                return PricingSelectionCardModel._childSerializers$_anonymous_$1();
            default:
                return ProductCollectionModel._childSerializers$_anonymous_();
        }
    }
}
