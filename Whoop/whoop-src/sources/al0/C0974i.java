package al0;

import am2.AbstractC1035o0;
import am2.AbstractC1046w;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.hormonalinsights.onboarding.domain.models.FeatureToggleScreen;
import com.whoop.hormonalinsights.onboarding.domain.models.InformationScreen;
import com.whoop.hormonalinsights.onboarding.domain.models.MciDateInputScreen;
import com.whoop.hormonalinsights.onboarding.domain.models.MciIntegrationScreen;
import com.whoop.hormonalinsights.onboarding.domain.models.MciOnboardingRequest;
import com.whoop.hormonalinsights.onboarding.domain.models.MciOnboardingResponse;
import com.whoop.hormonalinsights.onboarding.domain.models.TextNumberPickerScreen;
import com.whoop.universalcheckout.features.cart.domain.CartAddIntent;
import com.whoop.user.journey.model.UnknownUserJourneyStep;
import com.whoop.user.journey.model.UserJourneyContentModel;
import com.whoop.user.journey.model.UserJourneyContentModelV2;
import com.whoop.user.journey.model.UserJourneySection;
import kotlin.Function0;

/* JADX INFO: renamed from: al0.i */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C0974i implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f3589w;

    public /* synthetic */ C0974i(int i13) {
        this.f3589w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f3589w) {
            case 0:
                return C0975j.m2548W1();
            case 1:
                return C0975j.m2642t2();
            case 2:
                return AbstractC1046w.m3011W();
            case 3:
                return AbstractC1035o0.m2848T0();
            case 4:
                return CartAddIntent.Pack._childSerializers$_anonymous_();
            case 5:
                return FeatureToggleScreen._childSerializers$_anonymous_();
            case 6:
                return FeatureToggleScreen._childSerializers$_anonymous_$0();
            case 7:
                return InformationScreen._childSerializers$_anonymous_();
            case 8:
                return InformationScreen._childSerializers$_anonymous_$0();
            case 9:
                return MciDateInputScreen._childSerializers$_anonymous_();
            case 10:
                return MciDateInputScreen._childSerializers$_anonymous_$0();
            case 11:
                return MciDateInputScreen._childSerializers$_anonymous_$1();
            case 12:
                return MciIntegrationScreen._childSerializers$_anonymous_();
            case 13:
                return MciOnboardingRequest._childSerializers$_anonymous_();
            case 14:
                return MciOnboardingRequest._childSerializers$_anonymous_$0();
            case 15:
                return MciOnboardingRequest._childSerializers$_anonymous_$1();
            case 16:
                return MciOnboardingRequest._childSerializers$_anonymous_$2();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return MciOnboardingRequest._childSerializers$_anonymous_$3();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return MciOnboardingRequest._childSerializers$_anonymous_$4();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return MciOnboardingResponse._childSerializers$_anonymous_();
            case 20:
                return MciOnboardingResponse._childSerializers$_anonymous_$0();
            case 21:
                return TextNumberPickerScreen._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return TextNumberPickerScreen._childSerializers$_anonymous_$0();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return UnknownUserJourneyStep._init_$_anonymous_();
            case 24:
                return UserJourneyContentModel._childSerializers$_anonymous_();
            case 25:
                return UserJourneyContentModelV2._childSerializers$_anonymous_();
            case 26:
                return UserJourneySection._childSerializers$_anonymous_();
            case 27:
                return Function0.m6117i();
            case 28:
                return Function0.m6118j();
            default:
                return Function0.m6119k();
        }
    }
}
