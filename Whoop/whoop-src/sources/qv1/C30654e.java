package qv1;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.activation.domain.models.steps.ActivationFlowCreatePasswordStep;
import com.whoop.activation.domain.models.steps.BillingFrequencyStepModel;
import com.whoop.activation.domain.models.steps.BirthdayStepModel;
import com.whoop.activation.domain.models.steps.CheckYourEmailStepModel;
import com.whoop.activation.domain.models.steps.CommitmentPlan;
import com.whoop.activation.domain.models.steps.ConsentsModel;
import com.whoop.activation.domain.models.steps.CountrySelectionStepModel;
import com.whoop.activation.domain.models.steps.CreatePasswordStepModel;
import com.whoop.activation.domain.models.steps.CreateYourAccountStepModel;
import com.whoop.membership.comunityraf.CommunityRafModel;
import com.whoop.membership.comunityraf.RafItem;
import com.whoop.profile.domain.edit.models.CountryOption;
import com.whoop.profile.domain.edit.models.EditProfileResponse;
import com.whoop.profile.domain.edit.models.ProfileLockField;
import com.whoop.profile.domain.edit.models.UpdateProfileRequest;
import com.whoop.realtime.presentation.views.StrainCoachGoalPicker;
import qx2.C30761a;
import qy0.AbstractC30773f;
import r21.AbstractC30888f;
import r41.AbstractC30924h;

/* JADX INFO: renamed from: qv1.e */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C30654e implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f126100w;

    public /* synthetic */ C30654e(int i13) {
        this.f126100w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f126100w) {
            case 0:
                return CommunityRafModel._childSerializers$_anonymous_();
            case 1:
                return RafItem._childSerializers$_anonymous_();
            case 2:
                return C30761a.m94504p();
            case 3:
                return AbstractC30773f.m94549w();
            case 4:
                return AbstractC30888f.m94954g();
            case 5:
                return AbstractC30924h.m95060A();
            case 6:
                return AbstractC30924h.m95095u();
            case 7:
                return AbstractC30924h.m95097w();
            case 8:
                return CountryOption._childSerializers$_anonymous_();
            case 9:
                return EditProfileResponse._childSerializers$_anonymous_();
            case 10:
                return EditProfileResponse._childSerializers$_anonymous_$0();
            case 11:
                return EditProfileResponse._childSerializers$_anonymous_$1();
            case 12:
                return EditProfileResponse._childSerializers$_anonymous_$2();
            case 13:
                return ProfileLockField._init_$_anonymous_();
            case 14:
                return UpdateProfileRequest._childSerializers$_anonymous_();
            case 15:
                return UpdateProfileRequest._childSerializers$_anonymous_$0();
            case 16:
                return StrainCoachGoalPicker.m24187D();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return ActivationFlowCreatePasswordStep._childSerializers$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ActivationFlowCreatePasswordStep._childSerializers$_anonymous_$0();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return BillingFrequencyStepModel._childSerializers$_anonymous_();
            case 20:
                return BillingFrequencyStepModel._childSerializers$_anonymous_$0();
            case 21:
                return BirthdayStepModel._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return CheckYourEmailStepModel._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return CommitmentPlan._childSerializers$_anonymous_();
            case 24:
                return ConsentsModel._childSerializers$_anonymous_();
            case 25:
                return CountrySelectionStepModel._childSerializers$_anonymous_();
            case 26:
                return CreatePasswordStepModel._childSerializers$_anonymous_();
            case 27:
                return CreatePasswordStepModel._childSerializers$_anonymous_$0();
            case 28:
                return CreateYourAccountStepModel._childSerializers$_anonymous_();
            default:
                return CreateYourAccountStepModel._childSerializers$_anonymous_$0();
        }
    }
}
