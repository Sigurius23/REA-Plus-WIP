package md0;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.advancedlabs.domain.models.AdvancedLabsRecordData;
import com.whoop.advancedlabs.domain.models.AdvancedLabsRecordingSection;
import com.whoop.advancedlabs.domain.models.AdvancedLabsSectionModel;
import com.whoop.advancedlabs.domain.models.AppointmentInfoCardModel;
import com.whoop.advancedlabs.domain.models.AppointmentSummaryChecklistItemModel;
import com.whoop.advancedlabs.domain.models.BiomarkerTrendSegmentModel;
import com.whoop.advancedlabs.domain.models.CategoricalBiomarkerDetailsModel;
import com.whoop.advancedlabs.domain.models.ChecklistCardModel;
import com.whoop.advancedlabs.domain.models.ClinicalReportCardModel;
import com.whoop.advancedlabs.domain.models.CollectionMethodTileModel;
import com.whoop.advancedlabs.domain.models.HealthspanImpactCardModel;
import com.whoop.advancedlabs.domain.models.ImageSplitContainerModel;
import com.whoop.advancedlabs.domain.models.InsightsSectionHeaderModel;
import com.whoop.advancedlabs.domain.models.LabsTestItemModel;
import com.whoop.advancedlabs.domain.models.LabsTestListCalloutModel;
import com.whoop.advancedlabs.domain.models.LabsTestSelectionModel;
import com.whoop.advancedlabs.domain.models.PanelUpsellDrawerModel;
import com.whoop.advancedlabs.domain.models.PromotionalBiomarkerPieChartModel;
import com.whoop.advancedlabs.domain.models.RemainingTestsCalloutModel;
import com.whoop.advancedlabs.domain.models.SchedulingDatePickerModel;
import com.whoop.advancedlabs.domain.models.SchedulingTileModel;
import com.whoop.advancedlabs.domain.models.SearchableBiomarkersListModel;
import com.whoop.advancedlabs.domain.models.SpecializedPanelUpsellTileModel;
import com.whoop.advancedlabs.domain.models.TestTileModel;
import com.whoop.advancedlabs.domain.models.TitleSectionModel;
import com.whoop.advancedlabs.domain.models.WhatsIncludedCardModel;
import com.whoop.advancedlabs.testupload.domain.models.TestUploadInfoTileModel;
import jb1.C21536b;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: md0.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C25446a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f99644w;

    public /* synthetic */ C25446a(int i13) {
        this.f99644w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f99644w) {
            case 0:
                return AbstractC25448c.m74760y0((C21536b) obj);
            case 1:
                return AbstractC25448c.m74702R((ClinicalReportCardModel) obj);
            case 2:
                return AbstractC25448c.m74703S((LabsTestItemModel) obj);
            case 3:
                return AbstractC25448c.m74704T((LabsTestListCalloutModel) obj);
            case 4:
                return AbstractC25448c.m74705U((LabsTestSelectionModel) obj);
            case 5:
                return AbstractC25448c.m74706V((CategoricalBiomarkerDetailsModel) obj);
            case 6:
                return AbstractC25448c.m74707W((BiomarkerTrendSegmentModel) obj);
            case 7:
                return AbstractC25448c.m74708X((SearchableBiomarkersListModel) obj);
            case 8:
                return AbstractC25448c.m74709Y((AdvancedLabsRecordData) obj);
            case 9:
                return AbstractC25448c.m74699O((AppointmentInfoCardModel) obj);
            case 10:
                return AbstractC25448c.m74712a0((ChecklistCardModel) obj);
            case 11:
                return AbstractC25448c.m74742p0((C21536b) obj);
            case 12:
                return AbstractC25448c.m74714b0((ImageSplitContainerModel) obj);
            case 13:
                return AbstractC25448c.m74716c0((WhatsIncludedCardModel) obj);
            case 14:
                return AbstractC25448c.m74718d0((TestUploadInfoTileModel) obj);
            case 15:
                return AbstractC25448c.m74720e0((SchedulingTileModel) obj);
            case 16:
                return AbstractC25448c.m74722f0((PromotionalBiomarkerPieChartModel) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC25448c.m74724g0((SpecializedPanelUpsellTileModel) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC25448c.m74726h0((PanelUpsellDrawerModel) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC25448c.m74710Z((AppointmentSummaryChecklistItemModel) obj);
            case 20:
                return AbstractC25448c.m74728i0((RemainingTestsCalloutModel) obj);
            case 21:
                return AbstractC25448c.m74730j0((HealthspanImpactCardModel) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC25448c.m74756w0((C21536b) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC25448c.m74732k0((SchedulingDatePickerModel) obj);
            case 24:
                return AbstractC25448c.m74734l0((InsightsSectionHeaderModel) obj);
            case 25:
                return AbstractC25448c.m74736m0((TitleSectionModel) obj);
            case 26:
                return AbstractC25448c.m74738n0((TestTileModel) obj);
            case 27:
                return AbstractC25448c.m74740o0((CollectionMethodTileModel) obj);
            case 28:
                return AbstractC25448c.m74746r0((AdvancedLabsSectionModel) obj);
            default:
                return AbstractC25448c.m74748s0((AdvancedLabsRecordingSection) obj);
        }
    }
}
