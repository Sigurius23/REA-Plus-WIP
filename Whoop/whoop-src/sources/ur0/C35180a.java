package ur0;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.communitymoments.domain.models.MenuAnchorButtonModel;
import com.whoop.communitymoments.domain.models.MenuAnchorButtonStyle;
import com.whoop.communitymoments.domain.models.MomentCaptionBarModel;
import com.whoop.communitymoments.domain.models.MomentCardFillMode;
import com.whoop.communitymoments.domain.models.MomentCardModel;
import com.whoop.communitymoments.domain.models.MomentCompactScoreGaugeModel;
import com.whoop.communitymoments.domain.models.MomentContainerModel;
import com.whoop.communitymoments.domain.models.MomentStackModel;
import com.whoop.labrador.feature.registration.domain.models.LabradorRegistrationResponse;
import com.whoop.labrador.feature.registration.domain.models.RegulatoryInformationResponse;
import com.whoop.weeklyplan.weeklyplan.domain.models.AddGoalCard;
import com.whoop.weeklyplan.weeklyplan.domain.models.BannerCalloutTile;
import com.whoop.weeklyplan.weeklyplan.domain.models.ButtonInfo;
import com.whoop.weeklyplan.weeklyplan.domain.models.CurrentPlanTile;
import com.whoop.weeklyplan.weeklyplan.domain.models.GoalSection;
import com.whoop.weeklyplan.weeklyplan.domain.models.GoalSectionStyle;
import com.whoop.weeklyplan.weeklyplan.domain.models.GradientStyle;
import com.whoop.weeklyplan.weeklyplan.domain.models.LoggedRecoveries;
import com.whoop.weeklyplan.weeklyplan.domain.models.MetaData;
import com.whoop.weeklyplan.weeklyplan.domain.models.NewSummary;

/* JADX INFO: renamed from: ur0.a */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C35180a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f149294w;

    public /* synthetic */ C35180a(int i13) {
        this.f149294w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f149294w) {
            case 0:
                return MenuAnchorButtonModel._childSerializers$_anonymous_();
            case 1:
                return MenuAnchorButtonModel._childSerializers$_anonymous_$0();
            case 2:
                return MenuAnchorButtonStyle._init_$_anonymous_();
            case 3:
                return MomentCaptionBarModel._childSerializers$_anonymous_();
            case 4:
                return MomentCaptionBarModel._childSerializers$_anonymous_$0();
            case 5:
                return MomentCardFillMode._init_$_anonymous_();
            case 6:
                return MomentCardModel._childSerializers$_anonymous_();
            case 7:
                return MomentCardModel.Footer._childSerializers$_anonymous_();
            case 8:
                return MomentCardModel.Footer._childSerializers$_anonymous_$0();
            case 9:
                return MomentCompactScoreGaugeModel._childSerializers$_anonymous_();
            case 10:
                return MomentContainerModel._childSerializers$_anonymous_();
            case 11:
                return MomentContainerModel._childSerializers$_anonymous_$0();
            case 12:
                return MomentContainerModel._childSerializers$_anonymous_$1();
            case 13:
                return MomentContainerModel._childSerializers$_anonymous_$2();
            case 14:
                return MomentStackModel._childSerializers$_anonymous_();
            case 15:
                return LabradorRegistrationResponse._childSerializers$_anonymous_();
            case 16:
                return RegulatoryInformationResponse._childSerializers$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AddGoalCard._childSerializers$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return BannerCalloutTile._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ButtonInfo._childSerializers$_anonymous_();
            case 20:
                return CurrentPlanTile._childSerializers$_anonymous_();
            case 21:
                return GoalSection._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return GoalSection._childSerializers$_anonymous_$0();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return GoalSection._childSerializers$_anonymous_$1();
            case 24:
                return GoalSection._childSerializers$_anonymous_$2();
            case 25:
                return GoalSectionStyle._init_$_anonymous_();
            case 26:
                return GradientStyle._init_$_anonymous_();
            case 27:
                return LoggedRecoveries._childSerializers$_anonymous_();
            case 28:
                return MetaData._childSerializers$_anonymous_();
            default:
                return NewSummary._childSerializers$_anonymous_();
        }
    }
}
