package h00;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.access.careupdateentrypointtile.models.CareUpdateEntrypointTileModel;
import com.whoop.privacyconsent.api.AccountDataSharingResponse;
import com.whoop.privacyconsent.api.DataSharingResponse;
import com.whoop.sage.onboarding.domain.models.SageManualMeasurementRequest;
import com.whoop.sage.onboarding.domain.models.SageManualReadingInputScreen;
import com.whoop.sage.onboarding.domain.models.SageOnboardingGuidelinesAcknowledgeScreen;
import com.whoop.sage.onboarding.domain.models.SageOnboardingInfoCheckboxScreen;
import com.whoop.sage.onboarding.domain.models.SageOnboardingInformationScreen;
import com.whoop.sage.onboarding.domain.models.SageOnboardingRequest;
import com.whoop.sage.onboarding.domain.models.SageOnboardingResponse;
import com.whoop.sage.onboarding.domain.models.SageOnboardingSelectionScreen;
import h01.AbstractC16557x;
import h31.AbstractC16827t;
import h51.AbstractC16932d;
import h60.AbstractC16977f;
import hb1.AbstractC17090m;
import java.util.UUID;
import l83.C23454a0;
import p390p1.C28596b0;

/* JADX INFO: renamed from: h00.d0 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C16497d0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63396w;

    public /* synthetic */ C16497d0(int i13) {
        this.f63396w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f63396w) {
            case 0:
                C28596b0 c28596b0 = AbstractC16501f0.f63424a;
                return null;
            case 1:
                float f13 = AbstractC16517n0.f63506a;
                return C23454a0.f92919a;
            case 2:
                return AbstractC16557x.m46851f();
            case 3:
                return UUID.randomUUID().toString();
            case 4:
                return "PaymentSheet.FlowController must be created in the context of an Activity";
            case 5:
                return UUID.randomUUID().toString();
            case 6:
                return "PaymentSheet must be created in the context of an Activity";
            case 7:
                return AbstractC16827t.m47423e();
            case 8:
                return AccountDataSharingResponse._childSerializers$_anonymous_();
            case 9:
                return DataSharingResponse._childSerializers$_anonymous_();
            case 10:
                return CareUpdateEntrypointTileModel._childSerializers$_anonymous_();
            case 11:
                return AbstractC16932d.m47654r();
            case 12:
                return AbstractC16932d.m47660x();
            case 13:
                return AbstractC16977f.m47758h();
            case 14:
                return SageManualMeasurementRequest._childSerializers$_anonymous_();
            case 15:
                return SageManualReadingInputScreen._childSerializers$_anonymous_();
            case 16:
                return SageManualReadingInputScreen._childSerializers$_anonymous_$0();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return SageOnboardingGuidelinesAcknowledgeScreen._childSerializers$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return SageOnboardingGuidelinesAcknowledgeScreen._childSerializers$_anonymous_$0();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return SageOnboardingGuidelinesAcknowledgeScreen._childSerializers$_anonymous_$1();
            case 20:
                return SageOnboardingInfoCheckboxScreen._childSerializers$_anonymous_();
            case 21:
                return SageOnboardingInfoCheckboxScreen._childSerializers$_anonymous_$0();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return SageOnboardingInformationScreen._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return SageOnboardingRequest._childSerializers$_anonymous_();
            case 24:
                return SageOnboardingRequest._childSerializers$_anonymous_$0();
            case 25:
                return SageOnboardingResponse._childSerializers$_anonymous_();
            case 26:
                return SageOnboardingResponse._childSerializers$_anonymous_$0();
            case 27:
                return SageOnboardingSelectionScreen._childSerializers$_anonymous_();
            case 28:
                return SageOnboardingSelectionScreen._childSerializers$_anonymous_$0();
            default:
                return AbstractC17090m.m48219F();
        }
    }
}
