package dx2;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.stripe.android.uicore.address.FieldType;
import com.stripe.android.uicore.address.NameType;
import com.whoop.design.models.items.expandablestatisticlist.ExpandableStatisticListModel;
import com.whoop.milestonepill.domain.model.MilestonePillResponse;
import com.whoop.pairing.membershipAdjustment.domain.models.MembershipAdjustmentResponse;
import com.whoop.sage.domain.models.LockedContent;
import com.whoop.sage.domain.models.MetaData;
import com.whoop.sage.domain.models.SageBottomSheetModel;
import com.whoop.sage.domain.models.SageResponse;
import com.whoop.sage.domain.models.Section;
import com.whoop.sage.domain.models.StudyInsightsModel;
import com.whoop.sage.domain.models.UnlockedContent;
import com.whoop.settings.DebugFragment;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignStepResponse;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignStepsScreenResponse;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CancelScreenConfigResponse;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CompletedCampaignsScreenResponse;
import com.whoop.whooplabs.data.remote.domain.dto.bff.HomeImpactSectionResponse;
import com.whoop.whooplabs.data.remote.domain.dto.bff.HomeScreenResponse;
import com.whoop.whooplabs.data.remote.domain.dto.bff.InputType;
import com.whoop.whooplabs.data.remote.domain.dto.bff.OptionsConfigResponse;
import com.whoop.whooplabs.data.remote.domain.dto.bff.ScreeningQuestionDto;
import com.whoop.whooplabs.data.remote.domain.dto.bff.ScreeningSubmissionResponse;
import e31.AbstractC12610b;
import e31.C12611c;
import e61.AbstractC12766i;

/* JADX INFO: renamed from: dx2.a */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C12430a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f42357w;

    public /* synthetic */ C12430a(int i13) {
        this.f42357w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f42357w) {
            case 0:
                return CampaignStepResponse._childSerializers$_anonymous_$0();
            case 1:
                return CampaignStepsScreenResponse._childSerializers$_anonymous_();
            case 2:
                return CancelScreenConfigResponse._childSerializers$_anonymous_();
            case 3:
                return CompletedCampaignsScreenResponse._childSerializers$_anonymous_();
            case 4:
                return HomeImpactSectionResponse._childSerializers$_anonymous_();
            case 5:
                return HomeScreenResponse._childSerializers$_anonymous_();
            case 6:
                return HomeScreenResponse._childSerializers$_anonymous_$0();
            case 7:
                return InputType._init_$_anonymous_();
            case 8:
                return OptionsConfigResponse._childSerializers$_anonymous_();
            case 9:
                return OptionsConfigResponse._childSerializers$_anonymous_$0();
            case 10:
                return ScreeningQuestionDto._childSerializers$_anonymous_();
            case 11:
                return ScreeningSubmissionResponse._childSerializers$_anonymous_();
            case 12:
                return MilestonePillResponse._childSerializers$_anonymous_();
            case 13:
                return MembershipAdjustmentResponse._childSerializers$_anonymous_();
            case 14:
                return AbstractC12610b.m35350g();
            case 15:
                return AbstractC12610b.m35351h();
            case 16:
                return C12611c.m35357b();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return FieldType._init_$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return NameType._init_$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC12766i.m35754j();
            case 20:
                return LockedContent._childSerializers$_anonymous_();
            case 21:
                return MetaData._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return SageBottomSheetModel._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return SageResponse._childSerializers$_anonymous_();
            case 24:
                return Section._childSerializers$_anonymous_();
            case 25:
                return StudyInsightsModel._childSerializers$_anonymous_();
            case 26:
                return UnlockedContent._childSerializers$_anonymous_();
            case 27:
                return ExpandableStatisticListModel._childSerializers$_anonymous_();
            case 28:
                return ExpandableStatisticListModel._childSerializers$_anonymous_$0();
            default:
                return DebugFragment.m24974i2();
        }
    }
}
