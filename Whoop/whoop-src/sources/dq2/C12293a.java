package dq2;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.integrations.domain.models.IntegrationSectionModel;
import com.whoop.integrations.domain.models.IntegrationTabDisplayType;
import com.whoop.integrations.domain.models.IntegrationTabModel;
import com.whoop.integrations.domain.models.IntegrationsDetailsComponentsModel;
import com.whoop.integrations.domain.models.IntegrationsDisclaimerModel;
import com.whoop.integrations.domain.models.IntegrationsDiscoveryComponentsModel;
import com.whoop.integrations.domain.models.IntegrationsPrivacyControlsRequest;
import com.whoop.user.journey.model.yearinreview.chronologicalsection.InsightValueListModel;
import com.whoop.user.journey.model.yearinreview.chronologicalsection.YearInReviewCardModel;
import com.whoop.weeklyplan.hometile.domain.api.TextDisplayOption;
import com.whoop.whooplabs.data.remote.domain.dto.bff.BottomSheetOption;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignDetailsScreenResponse;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignExtendedDetailsResponse;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignListScreenResponse;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignScheduleScreenResponse;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignScheduleSection;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignScreeningResponse;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignSectionResponse;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignSectionResponseV2;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignStepConfigResponse;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignStepResponse;

/* JADX INFO: renamed from: dq2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C12293a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f41166w;

    public /* synthetic */ C12293a(int i13) {
        this.f41166w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f41166w) {
            case 0:
                return InsightValueListModel._childSerializers$_anonymous_();
            case 1:
                return YearInReviewCardModel._childSerializers$_anonymous_();
            case 2:
                return IntegrationSectionModel._childSerializers$_anonymous_();
            case 3:
                return IntegrationTabDisplayType._init_$_anonymous_();
            case 4:
                return IntegrationTabModel._childSerializers$_anonymous_();
            case 5:
                return IntegrationsDetailsComponentsModel._childSerializers$_anonymous_();
            case 6:
                return IntegrationsDetailsComponentsModel._childSerializers$_anonymous_$0();
            case 7:
                return IntegrationsDetailsComponentsModel._childSerializers$_anonymous_$1();
            case 8:
                return IntegrationsDisclaimerModel._childSerializers$_anonymous_();
            case 9:
                return IntegrationsDisclaimerModel._childSerializers$_anonymous_$0();
            case 10:
                return IntegrationsDisclaimerModel._childSerializers$_anonymous_$1();
            case 11:
                return IntegrationsDiscoveryComponentsModel._childSerializers$_anonymous_();
            case 12:
                return IntegrationsPrivacyControlsRequest._childSerializers$_anonymous_();
            case 13:
                return TextDisplayOption._childSerializers$_anonymous_();
            case 14:
                return BottomSheetOption._init_$_anonymous_();
            case 15:
                return CampaignDetailsScreenResponse._childSerializers$_anonymous_();
            case 16:
                return CampaignDetailsScreenResponse._childSerializers$_anonymous_$0();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return CampaignDetailsScreenResponse._childSerializers$_anonymous_$1();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return CampaignExtendedDetailsResponse._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return CampaignExtendedDetailsResponse._childSerializers$_anonymous_$0();
            case 20:
                return CampaignListScreenResponse._childSerializers$_anonymous_();
            case 21:
                return CampaignListScreenResponse._childSerializers$_anonymous_$0();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return CampaignScheduleScreenResponse._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return CampaignScheduleSection._childSerializers$_anonymous_();
            case 24:
                return CampaignScreeningResponse._childSerializers$_anonymous_();
            case 25:
                return CampaignSectionResponse._childSerializers$_anonymous_();
            case 26:
                return CampaignSectionResponseV2._childSerializers$_anonymous_();
            case 27:
                return CampaignStepConfigResponse._childSerializers$_anonymous_();
            case 28:
                return CampaignStepConfigResponse._childSerializers$_anonymous_$0();
            default:
                return CampaignStepResponse._childSerializers$_anonymous_();
        }
    }
}
