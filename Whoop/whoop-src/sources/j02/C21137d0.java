package j02;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.navigation.IntegrationsDisclaimerScreenModel;
import com.whoop.navigation.LabradorAboutScreenModel;
import com.whoop.navigation.LabradorDeviceLocationModel;
import com.whoop.navigation.LabradorOnboardingModel;
import com.whoop.navigation.LabradorRegistrationModel;
import com.whoop.navigation.LabradorResultsModel;
import com.whoop.navigation.LanguageSettingsScreenModel;
import com.whoop.navigation.LegacyProCheckoutScreenModel;
import com.whoop.navigation.MembershipAdjustmentCheckoutScreenModel;
import com.whoop.navigation.MembershipAndBillingScreenModel;
import com.whoop.navigation.MembershipManagementScreenModel;
import com.whoop.navigation.MenuScreenModel;
import com.whoop.navigation.MyAccountScreenModel;
import com.whoop.navigation.PairDeviceScreenModel;
import com.whoop.navigation.PopUpToModel;
import com.whoop.navigation.PrivacyScreenModel;
import com.whoop.navigation.ReactivationUpsellScreenModel;
import com.whoop.navigation.ReferAFriendScreenModel;
import com.whoop.navigation.ReturnsScreenModel;
import com.whoop.navigation.SageOnboardingScreenModel;
import com.whoop.navigation.SanguineWaitlistBiomarkersScreenModel;
import com.whoop.navigation.ShepherdAboutModel;
import com.whoop.navigation.ShepherdHistoryModel;
import com.whoop.navigation.ShepherdOnboardingModel;
import com.whoop.navigation.ShepherdRegistrationModel;
import com.whoop.navigation.ShepherdSettingsModel;
import com.whoop.navigation.StartActivityScreenModel;
import com.whoop.navigation.UniversalBuyNowScreenModel;
import com.whoop.navigation.UniversalCheckoutPayload;
import com.whoop.navigation.UpcycleLandingScreenModel;

/* JADX INFO: renamed from: j02.d0 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C21137d0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f80211w;

    public /* synthetic */ C21137d0(int i13) {
        this.f80211w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f80211w) {
            case 0:
                return IntegrationsDisclaimerScreenModel._init_$_anonymous_();
            case 1:
                return LabradorAboutScreenModel._init_$_anonymous_();
            case 2:
                return LabradorDeviceLocationModel._init_$_anonymous_();
            case 3:
                return LabradorOnboardingModel._init_$_anonymous_();
            case 4:
                return LabradorRegistrationModel._init_$_anonymous_();
            case 5:
                return LabradorResultsModel._init_$_anonymous_();
            case 6:
                return LanguageSettingsScreenModel._init_$_anonymous_();
            case 7:
                return LegacyProCheckoutScreenModel._init_$_anonymous_();
            case 8:
                return MembershipAdjustmentCheckoutScreenModel._childSerializers$_anonymous_();
            case 9:
                return MembershipAndBillingScreenModel._init_$_anonymous_();
            case 10:
                return MembershipManagementScreenModel._init_$_anonymous_();
            case 11:
                return MenuScreenModel._init_$_anonymous_();
            case 12:
                return MyAccountScreenModel._init_$_anonymous_();
            case 13:
                return PairDeviceScreenModel._childSerializers$_anonymous_();
            case 14:
                return PopUpToModel._childSerializers$_anonymous_();
            case 15:
                return PrivacyScreenModel._init_$_anonymous_();
            case 16:
                return ReactivationUpsellScreenModel._init_$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return ReferAFriendScreenModel._childSerializers$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ReturnsScreenModel._init_$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return SageOnboardingScreenModel._init_$_anonymous_();
            case 20:
                return SanguineWaitlistBiomarkersScreenModel._init_$_anonymous_();
            case 21:
                return ShepherdAboutModel._init_$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ShepherdHistoryModel._init_$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ShepherdOnboardingModel._init_$_anonymous_();
            case 24:
                return ShepherdRegistrationModel._init_$_anonymous_();
            case 25:
                return ShepherdSettingsModel._init_$_anonymous_();
            case 26:
                return StartActivityScreenModel._init_$_anonymous_();
            case 27:
                return UniversalBuyNowScreenModel._childSerializers$_anonymous_();
            case 28:
                return UniversalCheckoutPayload._childSerializers$_anonymous_();
            default:
                return UpcycleLandingScreenModel._init_$_anonymous_();
        }
    }
}
