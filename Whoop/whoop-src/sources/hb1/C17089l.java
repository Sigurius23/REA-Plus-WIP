package hb1;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.advancedlabs.feature.hormonalcontext.domain.models.HormonalContextResponse;
import com.whoop.advancedlabs.feature.hormonalcontext.domain.models.SingleSelectScreenContent;
import com.whoop.communityfollowerlookup.domain.model.CommunityFollowerLookupResponse;
import com.whoop.membership.management.domain.models.items.ConfirmModalModel;
import com.whoop.membership.management.domain.models.items.CtaModel;
import com.whoop.membership.management.domain.models.items.CtaWithNullableDestinationModel;
import com.whoop.membership.management.domain.models.items.MembershipCardModel;
import com.whoop.membership.management.domain.models.items.MembershipCheckoutCardModel;
import com.whoop.membership.management.domain.models.items.MembershipCheckoutRadioOptionModel;
import com.whoop.membership.management.domain.models.items.MembershipFeaturesCardModel;
import com.whoop.p069ui.teams.LeadersEntryDto;
import com.whoop.strava.domain.models.StravaBffSettingsResponse;
import com.whoop.strava.domain.models.StravaUserSettingsInformationRequest;
import com.whoop.stress.domain.StressInterventionSessionData;
import hf2.C17238b;
import hk0.C17375j;
import hv2.AbstractC17687i;
import hy0.AbstractC17726b1;
import hy0.AbstractC17770n;
import i11.AbstractC17862e;
import i21.AbstractC17995e;
import i21.AbstractC17999i;
import i21.AbstractC18005o;
import p709he2.AbstractC17218d;

/* JADX INFO: renamed from: hb1.l */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C17089l implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f65657w;

    public /* synthetic */ C17089l(int i13) {
        this.f65657w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f65657w) {
            case 0:
                return AbstractC17090m.m48223J();
            case 1:
                return AbstractC17090m.m48224K();
            case 2:
                return HormonalContextResponse._childSerializers$_anonymous_();
            case 3:
                return SingleSelectScreenContent._childSerializers$_anonymous_();
            case 4:
                return AbstractC17218d.m48683f();
            case 5:
                return AbstractC17218d.m48684g();
            case 6:
                return C17238b.m48762N();
            case 7:
                return StravaBffSettingsResponse._childSerializers$_anonymous_();
            case 8:
                return StravaBffSettingsResponse._childSerializers$_anonymous_$0();
            case 9:
                return StravaUserSettingsInformationRequest._childSerializers$_anonymous_();
            case 10:
                return StressInterventionSessionData._childSerializers$_anonymous_();
            case 11:
                return C17375j.m49192h0();
            case 12:
                return LeadersEntryDto._childSerializers$_anonymous_();
            case 13:
                return CommunityFollowerLookupResponse._childSerializers$_anonymous_();
            case 14:
                return AbstractC17687i.m50481X();
            case 15:
                return ConfirmModalModel._childSerializers$_anonymous_();
            case 16:
                return CtaModel._childSerializers$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return CtaWithNullableDestinationModel._childSerializers$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return MembershipCardModel._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return MembershipCheckoutCardModel._childSerializers$_anonymous_();
            case 20:
                return MembershipCheckoutRadioOptionModel._childSerializers$_anonymous_();
            case 21:
                return MembershipCheckoutRadioOptionModel._childSerializers$_anonymous_$0();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return MembershipFeaturesCardModel._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC17770n.m50977E();
            case 24:
                return AbstractC17726b1.m50793k();
            case 25:
                throw new IllegalStateException("No ImageLoader provided");
            case 26:
                return AbstractC17862e.m51354m();
            case 27:
                return AbstractC17995e.m51617f();
            case 28:
                return AbstractC17999i.m51636m();
            default:
                return AbstractC18005o.m51688f();
        }
    }
}
