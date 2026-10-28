package vw0;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.activation.feature.orderconfirmation.domain.models.OrderConfirmationCta;
import com.whoop.data.remote.domain.dto.CircularProgressStyle;
import com.whoop.data.remote.domain.dto.CurrentProgressStepsDto;
import com.whoop.data.remote.domain.dto.DayOfWeekType;
import com.whoop.data.remote.domain.dto.JournalEntryDto;
import com.whoop.data.remote.domain.dto.JournalMagnitudeDto;
import com.whoop.data.remote.domain.dto.JournalsBehaviorsListResponseDto;
import com.whoop.data.remote.domain.dto.PostModalViewedDto;
import com.whoop.data.remote.domain.dto.PushNotificationMetricBody;
import com.whoop.data.remote.domain.dto.PushNotificationMetricType;
import com.whoop.data.remote.domain.dto.SetSmartAlarmDto;
import com.whoop.data.remote.domain.dto.SmartAlarmUserInfoDto;
import com.whoop.data.remote.domain.dto.StrainDataDto;
import com.whoop.data.remote.domain.dto.UserSelectedJournalBehaviorResponseDto;
import com.whoop.pregnancy.api.PregnancyDTO;
import com.whoop.pregnancy.api.PreviousPregnanciesSectionDto;
import p743vy1.Function1;
import vx2.C36560a;
import vy0.AbstractC36568c0;
import vy0.AbstractC36588p;
import w41.AbstractC36800a;
import w41.AbstractC36811k;
import w60.C36860h;

/* JADX INFO: renamed from: vw0.a */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C36541a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f156462w;

    public /* synthetic */ C36541a(int i13) {
        this.f156462w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f156462w) {
            case 0:
                return CircularProgressStyle._init_$_anonymous_();
            case 1:
                return CurrentProgressStepsDto._childSerializers$_anonymous_();
            case 2:
                return DayOfWeekType._init_$_anonymous_();
            case 3:
                return JournalEntryDto._childSerializers$_anonymous_();
            case 4:
                return JournalMagnitudeDto._childSerializers$_anonymous_();
            case 5:
                return JournalsBehaviorsListResponseDto._childSerializers$_anonymous_();
            case 6:
                return PostModalViewedDto._childSerializers$_anonymous_();
            case 7:
                return PushNotificationMetricBody._childSerializers$_anonymous_();
            case 8:
                return PushNotificationMetricType._init_$_anonymous_();
            case 9:
                return SetSmartAlarmDto._childSerializers$_anonymous_();
            case 10:
                return SmartAlarmUserInfoDto._childSerializers$_anonymous_();
            case 11:
                return SmartAlarmUserInfoDto._childSerializers$_anonymous_$0();
            case 12:
                return StrainDataDto._childSerializers$_anonymous_();
            case 13:
                return UserSelectedJournalBehaviorResponseDto._childSerializers$_anonymous_();
            case 14:
                return C36560a.m117284o();
            case 15:
                return AbstractC36588p.m117421W();
            case 16:
                return AbstractC36588p.m117425Y();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC36588p.m117382C0();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC36588p.m117384D0();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC36588p.m117386E0();
            case 20:
                return AbstractC36588p.m117390G0();
            case 21:
                return AbstractC36568c0.m117293A();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return Function1.m117560q();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return PregnancyDTO._childSerializers$_anonymous_();
            case 24:
                return PreviousPregnanciesSectionDto._childSerializers$_anonymous_();
            case 25:
                return AbstractC36800a.m117932l();
            case 26:
                return AbstractC36811k.m117979F();
            case 27:
                return AbstractC36811k.m117978E();
            case 28:
                return C36860h.m118212f();
            default:
                return OrderConfirmationCta._childSerializers$_anonymous_();
        }
    }
}
