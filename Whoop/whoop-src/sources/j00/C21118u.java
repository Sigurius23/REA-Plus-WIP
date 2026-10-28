package j00;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.navigation.AdvancedLabsNativeSchedulingScreenModel;
import com.whoop.navigation.AdvancedLabsTestHistoryScreenModel;
import com.whoop.navigation.AdvancedLabsUploadTestScreenModel;
import com.whoop.navigation.AuthenticatedWebViewModel;
import com.whoop.navigation.CachePolicyModel;
import com.whoop.navigation.CartItem;
import com.whoop.navigation.CheckoutScreenModel;
import com.whoop.navigation.CoachSettingsScreenModel;
import com.whoop.navigation.CommunityFollowersScreenModel;
import com.whoop.navigation.CommunityTeamsHubScreenModel;
import com.whoop.navigation.ConnectivityNavigationScreenModel;
import com.whoop.navigation.CustomizeJournalScreenModel;
import com.whoop.navigation.CyclePatternHistoryScreenModel;
import com.whoop.navigation.DismissEventModel;
import com.whoop.navigation.EnterpriseProgramSettingsScreenModel;
import com.whoop.navigation.FamilyPlanScreenModel;
import com.whoop.navigation.FeatureSpecificAppScreen;
import com.whoop.navigation.GenericCachePolicy;
import com.whoop.navigation.GenericScreenModel;
import com.whoop.navigation.HealthReportScreenModel;
import com.whoop.navigation.HiddenMetricsModel;
import com.whoop.navigation.HormonalInsightsSettingsScreenModel;
import com.whoop.navigation.HrSettingsScreenModel;
import com.whoop.navigation.InitialSelectionModel;
import p390p1.AbstractC28683x;

/* JADX INFO: renamed from: j00.u */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C21118u implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f80140w;

    public /* synthetic */ C21118u(int i13) {
        this.f80140w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f80140w) {
            case 0:
                return AbstractC28683x.m87272z(Boolean.FALSE);
            case 1:
                return AbstractC28683x.m87272z(Boolean.FALSE);
            case 2:
                return AdvancedLabsNativeSchedulingScreenModel._init_$_anonymous_();
            case 3:
                return AdvancedLabsTestHistoryScreenModel._init_$_anonymous_();
            case 4:
                return AdvancedLabsUploadTestScreenModel._init_$_anonymous_();
            case 5:
                return AuthenticatedWebViewModel._childSerializers$_anonymous_();
            case 6:
                return AuthenticatedWebViewModel._childSerializers$_anonymous_$0();
            case 7:
                return CachePolicyModel._childSerializers$_anonymous_();
            case 8:
                return CartItem._childSerializers$_anonymous_();
            case 9:
                return CheckoutScreenModel._childSerializers$_anonymous_();
            case 10:
                return CoachSettingsScreenModel._init_$_anonymous_();
            case 11:
                return CommunityFollowersScreenModel._init_$_anonymous_();
            case 12:
                return CommunityTeamsHubScreenModel._init_$_anonymous_();
            case 13:
                return ConnectivityNavigationScreenModel._init_$_anonymous_();
            case 14:
                return CustomizeJournalScreenModel._init_$_anonymous_();
            case 15:
                return CyclePatternHistoryScreenModel._init_$_anonymous_();
            case 16:
                return DismissEventModel._childSerializers$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return EnterpriseProgramSettingsScreenModel._init_$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return FamilyPlanScreenModel._init_$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return FeatureSpecificAppScreen._childSerializers$_anonymous_();
            case 20:
                return GenericCachePolicy._childSerializers$_anonymous_();
            case 21:
                return GenericScreenModel._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return GenericScreenModel._childSerializers$_anonymous_$0();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return HealthReportScreenModel._init_$_anonymous_();
            case 24:
                return HiddenMetricsModel._init_$_anonymous_();
            case 25:
                return HormonalInsightsSettingsScreenModel._init_$_anonymous_();
            case 26:
                return HrSettingsScreenModel._init_$_anonymous_();
            case 27:
                return InitialSelectionModel._childSerializers$_anonymous_();
            case 28:
                return InitialSelectionModel._childSerializers$_anonymous_$0();
            default:
                return InitialSelectionModel._childSerializers$_anonymous_$1();
        }
    }
}
