package q41;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.access.measurementprogress.models.MeasurementReadingModel;
import com.whoop.activation.domain.models.AccountTransitionLegacyAfterActivationResponse;
import com.whoop.activation.domain.models.ActivationBody;
import com.whoop.activation.domain.models.ActivationFlowActivateResponse;
import com.whoop.activation.domain.models.ActivationFlowBff;
import com.whoop.activation.domain.models.ActivationFlowConsent;
import com.whoop.activation.domain.models.ActivationFlowConsentsResponse;
import com.whoop.activation.domain.models.ActivationFlowCountry;
import com.whoop.activation.domain.models.ActivationFlowCreateAccountResponse;
import com.whoop.activation.domain.models.ActivationFlowDeviceEducationResponse;
import com.whoop.activation.domain.models.AfterActivationFinalScreensResponse;
import com.whoop.activation.domain.models.AlAfterActivationResponse;
import com.whoop.activation.domain.models.AlPermissionsBody;
import com.whoop.activation.domain.models.AlPermissionsResponse;
import com.whoop.design.atomic.molecule.trilabelslider.TriLabelSliderBarStyle;
import com.whoop.profile.p067di.ProfileModule;
import q60.C29996a;

/* JADX INFO: renamed from: q41.a */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C29968a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f122393w;

    public /* synthetic */ C29968a(int i13) {
        this.f122393w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f122393w) {
            case 0:
                return TriLabelSliderBarStyle._init_$_anonymous_();
            case 1:
                return ProfileModule.define$lambda$0$7$0();
            case 2:
                return MeasurementReadingModel._childSerializers$_anonymous_();
            case 3:
                return C29996a.m91766x();
            case 4:
                return AccountTransitionLegacyAfterActivationResponse._childSerializers$_anonymous_();
            case 5:
                return AccountTransitionLegacyAfterActivationResponse._childSerializers$_anonymous_$0();
            case 6:
                return AccountTransitionLegacyAfterActivationResponse._childSerializers$_anonymous_$1();
            case 7:
                return ActivationBody._childSerializers$_anonymous_();
            case 8:
                return ActivationFlowActivateResponse._childSerializers$_anonymous_();
            case 9:
                return ActivationFlowActivateResponse._childSerializers$_anonymous_$0();
            case 10:
                return ActivationFlowActivateResponse._childSerializers$_anonymous_$1();
            case 11:
                return ActivationFlowBff._childSerializers$_anonymous_();
            case 12:
                return ActivationFlowBff._childSerializers$_anonymous_$0();
            case 13:
                return ActivationFlowBff._childSerializers$_anonymous_$1();
            case 14:
                return ActivationFlowConsent._childSerializers$_anonymous_();
            case 15:
                return ActivationFlowConsent._childSerializers$_anonymous_$0();
            case 16:
                return ActivationFlowConsentsResponse._childSerializers$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return ActivationFlowCountry._childSerializers$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ActivationFlowCreateAccountResponse._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ActivationFlowDeviceEducationResponse._childSerializers$_anonymous_();
            case 20:
                return AfterActivationFinalScreensResponse._childSerializers$_anonymous_();
            case 21:
                return AfterActivationFinalScreensResponse._childSerializers$_anonymous_$0();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AfterActivationFinalScreensResponse._childSerializers$_anonymous_$1();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AlAfterActivationResponse._childSerializers$_anonymous_();
            case 24:
                return AlAfterActivationResponse._childSerializers$_anonymous_$0();
            case 25:
                return AlAfterActivationResponse._childSerializers$_anonymous_$1();
            case 26:
                return AlPermissionsBody._childSerializers$_anonymous_();
            case 27:
                return AlPermissionsResponse._childSerializers$_anonymous_();
            case 28:
                return AlPermissionsResponse._childSerializers$_anonymous_$0();
            default:
                return AlPermissionsResponse._childSerializers$_anonymous_$1();
        }
    }
}
