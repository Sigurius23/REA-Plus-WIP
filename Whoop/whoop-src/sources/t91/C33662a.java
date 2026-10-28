package t91;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.advancedlabs.domain.models.AdvanceLabsStickyModel;
import com.whoop.advancedlabs.domain.models.AdvancedLabsAllRecordingBottomSheet;
import com.whoop.advancedlabs.domain.models.AdvancedLabsPaginatedRecordings;
import com.whoop.advancedlabs.domain.models.AdvancedLabsPaginatedTestHistory;
import com.whoop.advancedlabs.domain.models.AdvancedLabsRecordingSection;
import com.whoop.advancedlabs.domain.models.AdvancedLabsResponse;
import com.whoop.advancedlabs.domain.models.AdvancedLabsSectionModel;
import com.whoop.advancedlabs.domain.models.AdvancedLabsTestHistorySection;
import com.whoop.advancedlabs.domain.models.AppointmentSummaryModel;
import com.whoop.advancedlabs.domain.models.BiomarkerDetailsHeader;
import com.whoop.advancedlabs.domain.models.BiomarkerDetailsResponse;
import com.whoop.advancedlabs.domain.models.BiomarkerSummaryResponse;
import com.whoop.advancedlabs.domain.models.BiomarkerTrendSegmentModel;
import com.whoop.advancedlabs.domain.models.BiomarkersListFilterData;
import com.whoop.advancedlabs.domain.models.BiomarkersListSortData;
import com.whoop.advancedlabs.domain.models.ButtonModel;
import com.whoop.advancedlabs.domain.models.ChecklistCardModel;
import com.whoop.advancedlabs.domain.models.ChecklistStepModel;
import com.whoop.advancedlabs.domain.models.ClinicalInsightsResponse;
import com.whoop.advancedlabs.domain.models.ClinicalReportCardBodyModel;
import com.whoop.advancedlabs.domain.models.ClinicalReportCardItemModel;
import com.whoop.design.models.cards.TextWithDesignItemCardModel;
import com.whoop.design.models.cards.TrailingIconModel;
import com.whoop.design.models.items.graph.plot.trend.TrendSegmentStyle;

/* JADX INFO: renamed from: t91.a */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C33662a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f140479w;

    public /* synthetic */ C33662a(int i13) {
        this.f140479w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f140479w) {
            case 0:
                return TextWithDesignItemCardModel._childSerializers$_anonymous_$0();
            case 1:
                return TextWithDesignItemCardModel._childSerializers$_anonymous_$1();
            case 2:
                return TextWithDesignItemCardModel._childSerializers$_anonymous_$2();
            case 3:
                return TrailingIconModel._childSerializers$_anonymous_();
            case 4:
                return TrailingIconModel._childSerializers$_anonymous_$0();
            case 5:
                return TrailingIconModel._childSerializers$_anonymous_$1();
            case 6:
                return TrendSegmentStyle._init_$_anonymous_();
            case 7:
                return AdvanceLabsStickyModel._childSerializers$_anonymous_();
            case 8:
                return AdvancedLabsAllRecordingBottomSheet._childSerializers$_anonymous_();
            case 9:
                return AdvancedLabsPaginatedRecordings._childSerializers$_anonymous_();
            case 10:
                return AdvancedLabsPaginatedTestHistory._childSerializers$_anonymous_();
            case 11:
                return AdvancedLabsRecordingSection._childSerializers$_anonymous_();
            case 12:
                return AdvancedLabsResponse._childSerializers$_anonymous_();
            case 13:
                return AdvancedLabsResponse._childSerializers$_anonymous_$0();
            case 14:
                return AdvancedLabsSectionModel._childSerializers$_anonymous_();
            case 15:
                return AdvancedLabsTestHistorySection._childSerializers$_anonymous_();
            case 16:
                return AppointmentSummaryModel._childSerializers$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return BiomarkerDetailsHeader._childSerializers$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return BiomarkerDetailsResponse._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return BiomarkerSummaryResponse._childSerializers$_anonymous_();
            case 20:
                return BiomarkerTrendSegmentModel._childSerializers$_anonymous_();
            case 21:
                return BiomarkersListFilterData._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return BiomarkersListSortData._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ButtonModel._childSerializers$_anonymous_();
            case 24:
                return ChecklistCardModel._childSerializers$_anonymous_();
            case 25:
                return ChecklistStepModel._childSerializers$_anonymous_();
            case 26:
                return ChecklistStepModel._childSerializers$_anonymous_$0();
            case 27:
                return ClinicalInsightsResponse._childSerializers$_anonymous_();
            case 28:
                return ClinicalReportCardBodyModel._childSerializers$_anonymous_();
            default:
                return ClinicalReportCardItemModel._childSerializers$_anonymous_();
        }
    }
}
