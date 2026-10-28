package qo1;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.community.presentation.share.selectteam.SelectTeamFragment;
import com.whoop.communityhighlightscontainer.domain.model.CommunityHighlightsContainerResponse;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.PhaseCoachingResponse;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.PhaseCoachingTileModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.PhaseInfo;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.PossibleSymptomsCardModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.SymptomsScreenResponse;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.SymptomsSegmentModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.TileWithTitleModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.TypicalCycleTileModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.UnhideOption;
import com.whoop.journal.api.SaveJournalBehaviorsResponse;
import com.whoop.labrador.feature.reading.domain.models.LabradorDetailsSymptomsAndNotesUpdateRequest;
import com.whoop.labrador.feature.reading.domain.models.LabradorReadingSymptomsUpdateRequest;
import qq2.AbstractC30553b;
import qs1.AbstractC30574a;
import qu2.AbstractC30640h;
import qu2.AbstractC30643k;

/* JADX INFO: renamed from: qo1.b */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C30527b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f125531w;

    public /* synthetic */ C30527b(int i13) {
        this.f125531w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f125531w) {
            case 0:
                return PhaseCoachingResponse._childSerializers$_anonymous_();
            case 1:
                return PhaseCoachingTileModel._childSerializers$_anonymous_();
            case 2:
                return PhaseCoachingTileModel._childSerializers$_anonymous_$0();
            case 3:
                return PhaseInfo._childSerializers$_anonymous_();
            case 4:
                return PhaseInfo._childSerializers$_anonymous_$0();
            case 5:
                return PhaseInfo._childSerializers$_anonymous_$1();
            case 6:
                return PhaseInfo._childSerializers$_anonymous_$2();
            case 7:
                return PossibleSymptomsCardModel._childSerializers$_anonymous_();
            case 8:
                return PossibleSymptomsCardModel._childSerializers$_anonymous_$0();
            case 9:
                return SymptomsScreenResponse._childSerializers$_anonymous_();
            case 10:
                return SymptomsSegmentModel._childSerializers$_anonymous_();
            case 11:
                return TileWithTitleModel._childSerializers$_anonymous_();
            case 12:
                return TypicalCycleTileModel._childSerializers$_anonymous_();
            case 13:
                return TypicalCycleTileModel._childSerializers$_anonymous_$0();
            case 14:
                return UnhideOption._childSerializers$_anonymous_();
            case 15:
                return SelectTeamFragment.m19398O();
            case 16:
                return AbstractC30553b.m93694g();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC30553b.m93700m();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return CommunityHighlightsContainerResponse._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return SaveJournalBehaviorsResponse._childSerializers$_anonymous_();
            case 20:
                return AbstractC30574a.m93748N();
            case 21:
                return AbstractC30574a.m93776z();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC30574a.m93741G();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return LabradorDetailsSymptomsAndNotesUpdateRequest._childSerializers$_anonymous_();
            case 24:
                return LabradorReadingSymptomsUpdateRequest._childSerializers$_anonymous_();
            case 25:
                return AbstractC30640h.m94149p0();
            case 26:
                return AbstractC30640h.m94159u0();
            case 27:
                return AbstractC30643k.m94191n();
            case 28:
                return AbstractC30643k.m94194q();
            default:
                return AbstractC30643k.m94186i();
        }
    }
}
