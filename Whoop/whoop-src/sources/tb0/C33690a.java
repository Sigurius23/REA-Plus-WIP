package tb0;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.advancedlabs.domain.models.CollectionMethodTileModel;
import com.whoop.advancedlabs.domain.models.ConsentResponse;
import com.whoop.advancedlabs.domain.models.EditBiomarkerItem;
import com.whoop.advancedlabs.domain.models.EditBiomarkersResponse;
import com.whoop.advancedlabs.domain.models.HealthspanImpactCardModel;
import com.whoop.advancedlabs.domain.models.LabsTestItemModel;
import com.whoop.advancedlabs.domain.models.LabsTestListCalloutModel;
import com.whoop.advancedlabs.domain.models.LabsTestSelectionItemModel;
import com.whoop.advancedlabs.domain.models.LabsTestSelectionModel;
import com.whoop.advancedlabs.domain.models.MetaData;
import com.whoop.advancedlabs.domain.models.NavigationButtonModel;
import com.whoop.advancedlabs.domain.models.PanelUpsellDrawerModel;
import com.whoop.advancedlabs.domain.models.PrimaryButtonModel;
import com.whoop.advancedlabs.domain.models.PromotionalBiomarkerPieChartModel;
import com.whoop.advancedlabs.domain.models.RafReceiverResponse;
import com.whoop.advancedlabs.domain.models.SchedulePillModel;
import com.whoop.advancedlabs.domain.models.SchedulePrimerFooterModel;
import com.whoop.advancedlabs.domain.models.SchedulePrimerResponse;
import com.whoop.advancedlabs.domain.models.SchedulingButton;
import com.whoop.advancedlabs.domain.models.SchedulingDatePickerModel;
import com.whoop.advancedlabs.domain.models.SchedulingResponse;
import com.whoop.advancedlabs.domain.models.SchedulingStep;
import com.whoop.advancedlabs.domain.models.SchedulingStepScreenModel;
import com.whoop.advancedlabs.domain.models.SchedulingTileModel;
import com.whoop.advancedlabs.domain.models.SearchableBiomarkersListModel;

/* JADX INFO: renamed from: tb0.a */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C33690a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f140747w;

    public /* synthetic */ C33690a(int i13) {
        this.f140747w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f140747w) {
            case 0:
                return CollectionMethodTileModel._childSerializers$_anonymous_();
            case 1:
                return CollectionMethodTileModel._childSerializers$_anonymous_$0();
            case 2:
                return ConsentResponse._childSerializers$_anonymous_();
            case 3:
                return EditBiomarkerItem._childSerializers$_anonymous_();
            case 4:
                return EditBiomarkerItem._childSerializers$_anonymous_$0();
            case 5:
                return EditBiomarkerItem._childSerializers$_anonymous_$1();
            case 6:
                return EditBiomarkersResponse._childSerializers$_anonymous_();
            case 7:
                return HealthspanImpactCardModel._childSerializers$_anonymous_();
            case 8:
                return LabsTestItemModel._childSerializers$_anonymous_();
            case 9:
                return LabsTestListCalloutModel._childSerializers$_anonymous_();
            case 10:
                return LabsTestListCalloutModel._childSerializers$_anonymous_$0();
            case 11:
                return LabsTestSelectionItemModel._childSerializers$_anonymous_();
            case 12:
                return LabsTestSelectionModel._childSerializers$_anonymous_();
            case 13:
                return MetaData._childSerializers$_anonymous_();
            case 14:
                return NavigationButtonModel._childSerializers$_anonymous_();
            case 15:
                return PanelUpsellDrawerModel._childSerializers$_anonymous_();
            case 16:
                return PrimaryButtonModel._childSerializers$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return PromotionalBiomarkerPieChartModel._childSerializers$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return RafReceiverResponse._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return RafReceiverResponse._childSerializers$_anonymous_$0();
            case 20:
                return SchedulePillModel._childSerializers$_anonymous_();
            case 21:
                return SchedulePrimerFooterModel._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return SchedulePrimerResponse._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return SchedulingButton._childSerializers$_anonymous_();
            case 24:
                return SchedulingDatePickerModel._childSerializers$_anonymous_();
            case 25:
                return SchedulingResponse._childSerializers$_anonymous_();
            case 26:
                return SchedulingStep._childSerializers$_anonymous_();
            case 27:
                return SchedulingStepScreenModel._childSerializers$_anonymous_();
            case 28:
                return SchedulingTileModel._childSerializers$_anonymous_();
            default:
                return SearchableBiomarkersListModel._childSerializers$_anonymous_();
        }
    }
}
