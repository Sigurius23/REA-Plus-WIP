package wl2;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.coacheverywhere.onboarding.model.CoachOnboardingHighlightID;
import com.whoop.coacheverywhere.onboarding.model.CoachOnboardingResponse;
import com.whoop.coacheverywhere.onboarding.model.CoachOnboardingStepID;
import com.whoop.coacheverywhere.onboarding.model.CoachOnboardingStepModel;
import com.whoop.trends.data.model.Sections;
import com.whoop.trends.data.model.SegmentControllerDtoV3;
import com.whoop.trends.data.model.SegmentalAnalysisEmptyStateModel;
import com.whoop.trends.data.model.SegmentalAnalysisHeaderModel;
import com.whoop.trends.data.model.SegmentalAnalysisModel;
import com.whoop.trends.data.model.SegmentalAnalysisSegmentModel;
import com.whoop.trends.data.model.SegmentalAnalysisTrendStatModel;
import com.whoop.trends.data.model.TimeSegmentDtoV3;
import com.whoop.trends.data.model.TrendMetricDtoV3;
import com.whoop.trends.data.model.TrendsDtoV3;
import com.whoop.trends.data.model.TrendsMenuItemDtoV3;
import wo1.AbstractC37457k0;
import wo1.AbstractC37464o;
import wo1.AbstractC37469r;
import wr0.AbstractC37552s;

/* JADX INFO: renamed from: wl2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C37358a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f159829w;

    public /* synthetic */ C37358a(int i13) {
        this.f159829w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f159829w) {
            case 0:
                return Sections._childSerializers$_anonymous_();
            case 1:
                return SegmentControllerDtoV3._childSerializers$_anonymous_();
            case 2:
                return SegmentalAnalysisEmptyStateModel._childSerializers$_anonymous_();
            case 3:
                return SegmentalAnalysisHeaderModel._childSerializers$_anonymous_();
            case 4:
                return SegmentalAnalysisModel._childSerializers$_anonymous_();
            case 5:
                return SegmentalAnalysisSegmentModel._childSerializers$_anonymous_();
            case 6:
                return SegmentalAnalysisSegmentModel._childSerializers$_anonymous_$0();
            case 7:
                return SegmentalAnalysisTrendStatModel._childSerializers$_anonymous_();
            case 8:
                return TimeSegmentDtoV3._childSerializers$_anonymous_();
            case 9:
                return TimeSegmentDtoV3._childSerializers$_anonymous_$0();
            case 10:
                return TrendMetricDtoV3._childSerializers$_anonymous_();
            case 11:
                return TrendMetricDtoV3._childSerializers$_anonymous_$0();
            case 12:
                return TrendMetricDtoV3._childSerializers$_anonymous_$1();
            case 13:
                return TrendsDtoV3._childSerializers$_anonymous_();
            case 14:
                return TrendsDtoV3._childSerializers$_anonymous_$0();
            case 15:
                return TrendsDtoV3._childSerializers$_anonymous_$1();
            case 16:
                return TrendsDtoV3._childSerializers$_anonymous_$2();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return TrendsDtoV3._childSerializers$_anonymous_$3();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return TrendsDtoV3._childSerializers$_anonymous_$4();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return TrendsMenuItemDtoV3._childSerializers$_anonymous_();
            case 20:
                return CoachOnboardingHighlightID._init_$_anonymous_();
            case 21:
                return CoachOnboardingResponse._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return CoachOnboardingStepID._init_$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return CoachOnboardingStepModel._childSerializers$_anonymous_();
            case 24:
                return CoachOnboardingStepModel._childSerializers$_anonymous_$0();
            case 25:
                return CoachOnboardingStepModel._childSerializers$_anonymous_$1();
            case 26:
                return AbstractC37464o.m120051l();
            case 27:
                return AbstractC37469r.m120106h();
            case 28:
                return AbstractC37457k0.m119997j();
            default:
                return AbstractC37552s.m120463p();
        }
    }
}
