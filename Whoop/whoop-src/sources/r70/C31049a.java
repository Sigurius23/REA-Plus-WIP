package r70;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.activation.domain.models.steps.DeidentifiedStepModel;
import com.whoop.activation.domain.models.steps.DeviceEducationStepModel;
import com.whoop.activation.domain.models.steps.EnterEmailStepModel;
import com.whoop.activation.domain.models.steps.EnterYourPasswordStepModel;
import com.whoop.activation.domain.models.steps.FamilyPlanBlockStepModel;
import com.whoop.activation.domain.models.steps.FinalizedUpcycleDetails;
import com.whoop.activation.domain.models.steps.GenderDialogInformation;
import com.whoop.activation.domain.models.steps.GenderStepModel;
import com.whoop.activation.domain.models.steps.GiftStepModel;
import com.whoop.activation.domain.models.steps.HealthConnectStepModel;
import com.whoop.activation.domain.models.steps.HeightAndWeightStepModel;
import com.whoop.activation.domain.models.steps.HeroWithFooterCtaStepModel;
import com.whoop.activation.domain.models.steps.JoinTeamStepModel;
import com.whoop.activation.domain.models.steps.NameInformationStepModel;
import com.whoop.activation.domain.models.steps.NotificationsStepModel;
import com.whoop.activation.domain.models.steps.OrderDetails;
import com.whoop.activation.domain.models.steps.PaymentMethodStepModel;
import com.whoop.activation.domain.models.steps.PaymentOptions;
import com.whoop.activation.domain.models.steps.PlanOption;

/* JADX INFO: renamed from: r70.a */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C31049a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f128032w;

    public /* synthetic */ C31049a(int i13) {
        this.f128032w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f128032w) {
            case 0:
                return DeidentifiedStepModel._childSerializers$_anonymous_();
            case 1:
                return DeviceEducationStepModel._childSerializers$_anonymous_();
            case 2:
                return DeviceEducationStepModel._childSerializers$_anonymous_$0();
            case 3:
                return EnterEmailStepModel._childSerializers$_anonymous_();
            case 4:
                return EnterEmailStepModel._childSerializers$_anonymous_$0();
            case 5:
                return EnterYourPasswordStepModel._childSerializers$_anonymous_();
            case 6:
                return EnterYourPasswordStepModel._childSerializers$_anonymous_$0();
            case 7:
                return FamilyPlanBlockStepModel._childSerializers$_anonymous_();
            case 8:
                return FinalizedUpcycleDetails._childSerializers$_anonymous_();
            case 9:
                return FinalizedUpcycleDetails._childSerializers$_anonymous_$0();
            case 10:
                return GenderDialogInformation._childSerializers$_anonymous_();
            case 11:
                return GenderStepModel._childSerializers$_anonymous_();
            case 12:
                return GenderStepModel._childSerializers$_anonymous_$0();
            case 13:
                return GiftStepModel._childSerializers$_anonymous_();
            case 14:
                return HealthConnectStepModel._childSerializers$_anonymous_();
            case 15:
                return HeightAndWeightStepModel._childSerializers$_anonymous_();
            case 16:
                return HeroWithFooterCtaStepModel._childSerializers$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return HeroWithFooterCtaStepModel._childSerializers$_anonymous_$0();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return JoinTeamStepModel._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return NameInformationStepModel._childSerializers$_anonymous_();
            case 20:
                return NameInformationStepModel._childSerializers$_anonymous_$0();
            case 21:
                return NotificationsStepModel._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return NotificationsStepModel._childSerializers$_anonymous_$0();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return OrderDetails._childSerializers$_anonymous_();
            case 24:
                return PaymentMethodStepModel._childSerializers$_anonymous_();
            case 25:
                return PaymentMethodStepModel._childSerializers$_anonymous_$0();
            case 26:
                return PaymentMethodStepModel._childSerializers$_anonymous_$1();
            case 27:
                return PaymentOptions._childSerializers$_anonymous_();
            case 28:
                return PaymentOptions._childSerializers$_anonymous_$0();
            default:
                return PlanOption._childSerializers$_anonymous_();
        }
    }
}
