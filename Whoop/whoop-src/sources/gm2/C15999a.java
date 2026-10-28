package gm2;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.clinicianintheloop.api.HealthIntakeResponse;
import com.whoop.clinicianintheloop.api.HealthIntakeResponseItem;
import com.whoop.clinicianintheloop.api.InformationScreen;
import com.whoop.clinicianintheloop.api.PersonalIntakeSubmitError;
import com.whoop.clinicianintheloop.api.SaveHealthIntakeRequest;
import com.whoop.clinicianintheloop.api.SaveVideoSchedulingFormRequest;
import com.whoop.clinicianintheloop.api.SaveVideoSchedulingIntakeRequest;
import com.whoop.clinicianintheloop.api.SchedulingConfirmationResponse;
import com.whoop.clinicianintheloop.api.TextEntryScreen;
import com.whoop.clinicianintheloop.api.VideoSchedulePillModel;
import com.whoop.clinicianintheloop.api.VideoScheduleSection;
import com.whoop.clinicianintheloop.api.VideoSchedulingDatePicker;
import com.whoop.clinicianintheloop.api.VideoSchedulingIntakeMultiSelectResponseBody;
import com.whoop.clinicianintheloop.api.VideoSchedulingIntakeResponse;
import com.whoop.homecustomization.domain.models.CustomizeOverviewDomainBody;
import com.whoop.homecustomization.domain.models.CustomizeOverviewResponse;
import com.whoop.homecustomization.domain.models.MetricsSection;
import com.whoop.hormonalinsights.postpartum.domain.models.CongratulationsScreen;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalDateInputScreen;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalMultiSelectScreen;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalNumberPickerScreen;
import com.whoop.trendsminiarch.domain.models.TrendsMiniArchSectionModel;

/* JADX INFO: renamed from: gm2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C15999a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f60554w;

    public /* synthetic */ C15999a(int i13) {
        this.f60554w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f60554w) {
            case 0:
                return TrendsMiniArchSectionModel._childSerializers$_anonymous_();
            case 1:
                return CustomizeOverviewDomainBody._childSerializers$_anonymous_();
            case 2:
                return CustomizeOverviewDomainBody._childSerializers$_anonymous_$0();
            case 3:
                return CustomizeOverviewResponse._childSerializers$_anonymous_();
            case 4:
                return CustomizeOverviewResponse._childSerializers$_anonymous_$0();
            case 5:
                return MetricsSection._childSerializers$_anonymous_();
            case 6:
                return HealthIntakeResponse.TextEntryHealthIntakeResponse._childSerializers$_anonymous_();
            case 7:
                return HealthIntakeResponseItem._childSerializers$_anonymous_();
            case 8:
                return InformationScreen._childSerializers$_anonymous_();
            case 9:
                return PersonalIntakeSubmitError._childSerializers$_anonymous_();
            case 10:
                return SaveHealthIntakeRequest._childSerializers$_anonymous_();
            case 11:
                return SaveVideoSchedulingFormRequest._childSerializers$_anonymous_();
            case 12:
                return SaveVideoSchedulingIntakeRequest._childSerializers$_anonymous_();
            case 13:
                return SchedulingConfirmationResponse._childSerializers$_anonymous_();
            case 14:
                return SchedulingConfirmationResponse._childSerializers$_anonymous_$0();
            case 15:
                return TextEntryScreen._childSerializers$_anonymous_();
            case 16:
                return VideoSchedulePillModel._childSerializers$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return VideoSchedulePillModel._childSerializers$_anonymous_$0();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return VideoSchedulePillModel._childSerializers$_anonymous_$1();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return VideoScheduleSection._childSerializers$_anonymous_();
            case 20:
                return VideoSchedulingDatePicker._childSerializers$_anonymous_();
            case 21:
                return VideoSchedulingIntakeMultiSelectResponseBody._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return VideoSchedulingIntakeResponse._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return CongratulationsScreen._childSerializers$_anonymous_();
            case 24:
                return HormonalDateInputScreen._childSerializers$_anonymous_();
            case 25:
                return HormonalDateInputScreen._childSerializers$_anonymous_$0();
            case 26:
                return HormonalMultiSelectScreen._childSerializers$_anonymous_();
            case 27:
                return HormonalMultiSelectScreen._childSerializers$_anonymous_$0();
            case 28:
                return HormonalMultiSelectScreen._childSerializers$_anonymous_$1();
            default:
                return HormonalNumberPickerScreen._childSerializers$_anonymous_();
        }
    }
}
