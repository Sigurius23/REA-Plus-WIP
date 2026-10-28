package ve;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.data.remote.domain.dto.BehaviorTrackerDestinationDto;
import com.whoop.data.remote.domain.dto.BehaviourTrackerHistoryResponseDto;
import com.whoop.educationModels.EducationVideoTypeDto;
import com.whoop.educationModels.FeatureEducationButtonDto;
import com.whoop.educationModels.FeatureEducationDto;
import com.whoop.educationModels.FeatureEducationParagraphDto;
import com.whoop.educationModels.FeatureEducationScreenDto;
import com.whoop.educationModels.FeatureEducationVideoDto;
import com.whoop.educationModels.OperatingSystem;
import com.whoop.educationModels.PodcastPicker;
import com.whoop.educationModels.PodcastPlayer;
import com.whoop.educationModels.StickyButton;
import com.whoop.journal.interactors.p062v2.calendar.JournalCalendar;
import p741vn1.Function0;
import vl0.AbstractC36101d;
import vm1.AbstractC36154a;
import vo1.AbstractC36229d;
import vo1.AbstractC36233h;
import vo1.AbstractC36243r;
import vp1.AbstractC36272h;

/* JADX INFO: renamed from: ve.a */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C35916a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f152975w;

    public /* synthetic */ C35916a(int i13) {
        this.f152975w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f152975w) {
            case 0:
                return "refreshing credentials cache";
            case 1:
                return EducationVideoTypeDto._init_$_anonymous_();
            case 2:
                return FeatureEducationButtonDto._childSerializers$_anonymous_();
            case 3:
                return FeatureEducationButtonDto._childSerializers$_anonymous_$0();
            case 4:
                return FeatureEducationDto._childSerializers$_anonymous_();
            case 5:
                return FeatureEducationDto._childSerializers$_anonymous_$0();
            case 6:
                return FeatureEducationParagraphDto._childSerializers$_anonymous_();
            case 7:
                return FeatureEducationScreenDto._childSerializers$_anonymous_();
            case 8:
                return FeatureEducationScreenDto._childSerializers$_anonymous_$0();
            case 9:
                return FeatureEducationScreenDto._childSerializers$_anonymous_$1();
            case 10:
                return FeatureEducationVideoDto._childSerializers$_anonymous_();
            case 11:
                return OperatingSystem._init_$_anonymous_();
            case 12:
                return PodcastPicker._childSerializers$_anonymous_();
            case 13:
                return PodcastPlayer._childSerializers$_anonymous_();
            case 14:
                return StickyButton._childSerializers$_anonymous_();
            case 15:
                return AbstractC36101d.m114727p();
            case 16:
                return AbstractC36154a.m115003e();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return Function0.m115218d();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC36229d.m115423w();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC36229d.m115385E();
            case 20:
                return AbstractC36233h.m115476d();
            case 21:
                return AbstractC36243r.m115489F0();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC36243r.m115530g0();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC36272h.m115802X0();
            case 24:
                return AbstractC36272h.m115764K1();
            case 25:
                return AbstractC36272h.m115767L1();
            case 26:
                return AbstractC36272h.m115867p0();
            case 27:
                return JournalCalendar._childSerializers$_anonymous_();
            case 28:
                return BehaviorTrackerDestinationDto._childSerializers$_anonymous_();
            default:
                return BehaviourTrackerHistoryResponseDto._childSerializers$_anonymous_();
        }
    }
}
