package q70;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.activation.domain.models.AlProfileResponse;
import com.whoop.activation.domain.models.EmailDialogInfo;
import com.whoop.activation.domain.models.FooterAlignment;
import com.whoop.activation.domain.models.HwOnlyAfterActivationResponse;
import com.whoop.activation.domain.models.HwOnlyPermissionsResponse;
import com.whoop.activation.domain.models.HwOnlyProfileResponse;
import com.whoop.activation.domain.models.InAppJoinFlowCountryResponse;
import com.whoop.activation.domain.models.InAppJoinFlowResponse;
import com.whoop.activation.domain.models.MedicareAfterActivationResponse;
import com.whoop.activation.domain.models.MedicarePermissionsBody;
import com.whoop.activation.domain.models.MedicarePermissionsResponse;
import com.whoop.activation.domain.models.PostPairingEmailResponse;
import com.whoop.design.models.anchorSelector.AnchorSectionModel;
import com.whoop.design.models.anchorSelector.AnchorSelectorModel;

/* JADX INFO: renamed from: q70.a */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C30009a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f122518w;

    public /* synthetic */ C30009a(int i13) {
        this.f122518w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f122518w) {
            case 0:
                return AlProfileResponse._childSerializers$_anonymous_();
            case 1:
                return AlProfileResponse._childSerializers$_anonymous_$0();
            case 2:
                return AlProfileResponse._childSerializers$_anonymous_$1();
            case 3:
                return EmailDialogInfo._childSerializers$_anonymous_();
            case 4:
                return FooterAlignment._init_$_anonymous_();
            case 5:
                return HwOnlyAfterActivationResponse._childSerializers$_anonymous_();
            case 6:
                return HwOnlyAfterActivationResponse._childSerializers$_anonymous_$0();
            case 7:
                return HwOnlyAfterActivationResponse._childSerializers$_anonymous_$1();
            case 8:
                return HwOnlyPermissionsResponse._childSerializers$_anonymous_();
            case 9:
                return HwOnlyPermissionsResponse._childSerializers$_anonymous_$0();
            case 10:
                return HwOnlyPermissionsResponse._childSerializers$_anonymous_$1();
            case 11:
                return HwOnlyProfileResponse._childSerializers$_anonymous_();
            case 12:
                return HwOnlyProfileResponse._childSerializers$_anonymous_$0();
            case 13:
                return HwOnlyProfileResponse._childSerializers$_anonymous_$1();
            case 14:
                return InAppJoinFlowCountryResponse._childSerializers$_anonymous_();
            case 15:
                return InAppJoinFlowCountryResponse._childSerializers$_anonymous_$0();
            case 16:
                return InAppJoinFlowResponse._childSerializers$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return MedicareAfterActivationResponse._childSerializers$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return MedicareAfterActivationResponse._childSerializers$_anonymous_$0();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return MedicareAfterActivationResponse._childSerializers$_anonymous_$1();
            case 20:
                return MedicarePermissionsBody._childSerializers$_anonymous_();
            case 21:
                return MedicarePermissionsResponse._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return MedicarePermissionsResponse._childSerializers$_anonymous_$0();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return MedicarePermissionsResponse._childSerializers$_anonymous_$1();
            case 24:
                return PostPairingEmailResponse._childSerializers$_anonymous_();
            case 25:
                return AnchorSectionModel._childSerializers$_anonymous_();
            case 26:
                return AnchorSectionModel._childSerializers$_anonymous_$0();
            case 27:
                return AnchorSelectorModel._childSerializers$_anonymous_();
            case 28:
                return AnchorSelectorModel._childSerializers$_anonymous_$0();
            default:
                return AnchorSelectorModel._childSerializers$_anonymous_$1();
        }
    }
}
