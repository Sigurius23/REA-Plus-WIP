package w91;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.design.models.items.StartTurnButtonStyleModel;
import com.whoop.design.models.items.StatusTileModel;
import com.whoop.design.models.items.StepperComponentModel;
import com.whoop.design.models.items.StreaksContainer;
import com.whoop.design.models.items.TagModel;
import com.whoop.design.models.items.TagSelectorModel;
import com.whoop.design.models.items.TestimonialsModel;
import com.whoop.design.models.items.TextInputModel;
import com.whoop.design.models.items.TickLabelModel;
import com.whoop.design.models.items.TickMarkStateModel;
import com.whoop.design.models.items.TimedContentModel;
import com.whoop.design.models.items.ToggleDesignModel;
import com.whoop.design.models.items.TogglesModel;
import com.whoop.design.models.items.TrackedBehaviorModel;
import com.whoop.design.models.items.TrendBarModel;
import com.whoop.design.models.items.TrendGraphLineModel;
import com.whoop.design.models.items.TrendIconsLegendModel;
import com.whoop.design.models.items.TriLabelSliderModel;
import com.whoop.design.models.items.UnlockedImpactOnRecoveryModel;

/* JADX INFO: renamed from: w91.k */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C36964k implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f158132w;

    public /* synthetic */ C36964k(int i13) {
        this.f158132w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f158132w) {
            case 0:
                return StartTurnButtonStyleModel._childSerializers$_anonymous_$2();
            case 1:
                return StatusTileModel._childSerializers$_anonymous_();
            case 2:
                return StepperComponentModel._childSerializers$_anonymous_();
            case 3:
                return StreaksContainer._childSerializers$_anonymous_();
            case 4:
                return TagModel._childSerializers$_anonymous_();
            case 5:
                return TagModel._childSerializers$_anonymous_$0();
            case 6:
                return TagModel._childSerializers$_anonymous_$1();
            case 7:
                return TagModel._childSerializers$_anonymous_$2();
            case 8:
                return TagModel._childSerializers$_anonymous_$3();
            case 9:
                return TagSelectorModel._childSerializers$_anonymous_();
            case 10:
                return TagSelectorModel._childSerializers$_anonymous_$0();
            case 11:
                return TestimonialsModel._childSerializers$_anonymous_();
            case 12:
                return TextInputModel._childSerializers$_anonymous_();
            case 13:
                return TextInputModel._childSerializers$_anonymous_$0();
            case 14:
                return TickLabelModel._childSerializers$_anonymous_();
            case 15:
                return TickLabelModel._childSerializers$_anonymous_$0();
            case 16:
                return TickMarkStateModel._childSerializers$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return TimedContentModel._childSerializers$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ToggleDesignModel._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ToggleDesignModel._childSerializers$_anonymous_$0();
            case 20:
                return TogglesModel._childSerializers$_anonymous_();
            case 21:
                return TogglesModel._childSerializers$_anonymous_$0();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return TrackedBehaviorModel._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return TrackedBehaviorModel._childSerializers$_anonymous_$0();
            case 24:
                return TrackedBehaviorModel._childSerializers$_anonymous_$1();
            case 25:
                return TrendBarModel._childSerializers$_anonymous_();
            case 26:
                return TrendGraphLineModel._childSerializers$_anonymous_();
            case 27:
                return TrendIconsLegendModel._childSerializers$_anonymous_();
            case 28:
                return TriLabelSliderModel._childSerializers$_anonymous_();
            default:
                return UnlockedImpactOnRecoveryModel._childSerializers$_anonymous_();
        }
    }
}
