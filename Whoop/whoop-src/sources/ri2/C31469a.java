package ri2;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.common.network.model.ActivityOverlapError;
import com.whoop.common.network.model.StrapGenerationSupportInfo;
import com.whoop.hormonalinsights.settings.domain.models.HormonalInsightsBottomSheet;
import com.whoop.hormonalinsights.settings.domain.models.HormonalInsightsGoalsDrawer;
import com.whoop.hormonalinsights.settings.domain.models.HormonalInsightsMenuItemModel;
import com.whoop.hormonalinsights.settings.domain.models.HormonalInsightsSettingsResponse;
import com.whoop.hormonalinsights.settings.domain.models.HormonalInsightsUpsell;
import com.whoop.hormonalinsights.settings.domain.models.PreviousPregnanciesModel;
import com.whoop.membership.familyPlan.domain.model.FamilyPlanCreationBody;
import com.whoop.membership.familyPlan.domain.model.FamilyPlanScreenResponse;
import com.whoop.membership.familyPlan.domain.model.InviteFamilyMemberResponse;
import com.whoop.membership.familyPlan.domain.model.InviteMemberErrorResponse;
import com.whoop.membership.familyPlan.domain.model.RemoveFamilyMemberDialogResponse;
import com.whoop.streaks.domain.models.HorizontalTrackerModel;
import com.whoop.streaks.domain.models.StreaksResponse;
import rm1.AbstractC31594h;
import rm1.AbstractC31600n;
import ro1.AbstractC31634f;
import rq2.AbstractC31714a0;
import rq2.AbstractC31718c0;
import rq2.AbstractC31729i;
import rq2.AbstractC31733k;
import rs2.AbstractC31797c;
import rx0.AbstractC31900e;

/* JADX INFO: renamed from: ri2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C31469a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f129667w;

    public /* synthetic */ C31469a(int i13) {
        this.f129667w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f129667w) {
            case 0:
                return HorizontalTrackerModel._childSerializers$_anonymous_();
            case 1:
                return StreaksResponse._childSerializers$_anonymous_();
            case 2:
                return StreaksResponse._childSerializers$_anonymous_$0();
            case 3:
                return AbstractC31594h.m97435p();
            case 4:
                return AbstractC31594h.m97411N();
            case 5:
                return AbstractC31600n.m97543i();
            case 6:
                return AbstractC31600n.m97547m();
            case 7:
                return AbstractC31634f.m97750m();
            case 8:
                return ActivityOverlapError._childSerializers$_anonymous_();
            case 9:
                return StrapGenerationSupportInfo._childSerializers$_anonymous_();
            case 10:
                return HormonalInsightsBottomSheet._childSerializers$_anonymous_();
            case 11:
                return HormonalInsightsGoalsDrawer._childSerializers$_anonymous_();
            case 12:
                return HormonalInsightsMenuItemModel._childSerializers$_anonymous_();
            case 13:
                return HormonalInsightsSettingsResponse._childSerializers$_anonymous_();
            case 14:
                return HormonalInsightsSettingsResponse._childSerializers$_anonymous_$0();
            case 15:
                return HormonalInsightsSettingsResponse._childSerializers$_anonymous_$1();
            case 16:
                return HormonalInsightsUpsell._childSerializers$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return PreviousPregnanciesModel._childSerializers$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC31729i.m98462i();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC31733k.m98486h();
            case 20:
                return AbstractC31714a0.m98388g();
            case 21:
                return AbstractC31718c0.m98412s();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC31797c.m98782q();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return FamilyPlanCreationBody._childSerializers$_anonymous_();
            case 24:
                return FamilyPlanScreenResponse._childSerializers$_anonymous_();
            case 25:
                return InviteFamilyMemberResponse._childSerializers$_anonymous_();
            case 26:
                return InviteMemberErrorResponse._childSerializers$_anonymous_();
            case 27:
                return InviteMemberErrorResponse._childSerializers$_anonymous_$0();
            case 28:
                return RemoveFamilyMemberDialogResponse._childSerializers$_anonymous_();
            default:
                return AbstractC31900e.m99158f();
        }
    }
}
