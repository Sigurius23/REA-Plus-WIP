package df2;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.bot.domain.chatminiarchwidget.CommitSelectionRequestBody;
import com.whoop.gps.foreground.network.dto.ForegroundGpsRouteSummaryDto;
import com.whoop.sleep.coach.data.network.model.sleepScheduleComponent.RepeatDaysDto;
import com.whoop.sleep.coach.data.network.model.sleepScheduleComponent.ScheduleDayDto;
import com.whoop.sleep.coach.data.network.model.sleepScheduleComponent.SleepGoalDto;
import com.whoop.sleep.coach.data.network.model.sleepScheduleComponent.SleepGoalTypeDto;
import com.whoop.sleep.coach.data.network.model.sleepScheduleComponent.SleepGoalValueDto;
import com.whoop.sleep.coach.data.network.model.sleepScheduleComponent.WakeModeDto;
import com.whoop.training.data.network.response.hrsettings.HrSettingsResponse;
import com.whoop.training.data.network.response.hrsettings.HrSettingsZonesResponse;
import com.whoop.training.data.network.response.hrsettings.ManualHeartRateZonesForm;
import dn0.AbstractC12208h;
import dn0.AbstractC12216p;
import do0.AbstractC12228b;
import do0.AbstractC12230d;
import do0.AbstractC12232f;
import p118ei.C13215b;
import p704dk2.AbstractC12121h;
import p704dk2.AbstractC12123j;
import p704dk2.AbstractC12124k;
import p704dk2.Function0;
import ud3.C34826l0;

/* JADX INFO: renamed from: df2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C12000a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f39587w;

    public /* synthetic */ C12000a(int i13) {
        this.f39587w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f39587w) {
            case 0:
                return RepeatDaysDto._childSerializers$_anonymous_();
            case 1:
                return RepeatDaysDto._childSerializers$_anonymous_$0();
            case 2:
                return ScheduleDayDto._childSerializers$_anonymous_();
            case 3:
                return SleepGoalDto._childSerializers$_anonymous_();
            case 4:
                return SleepGoalDto._childSerializers$_anonymous_$0();
            case 5:
                return SleepGoalTypeDto._childSerializers$_anonymous_();
            case 6:
                return SleepGoalValueDto._init_$_anonymous_();
            case 7:
                return WakeModeDto._childSerializers$_anonymous_();
            case 8:
                return new C13215b(new C34826l0());
            case 9:
                return ForegroundGpsRouteSummaryDto._childSerializers$_anonymous_();
            case 10:
                return Function0.m33504g();
            case 11:
                return Function0.m33505h();
            case 12:
                return AbstractC12121h.m33519j();
            case 13:
                return AbstractC12121h.m33524o();
            case 14:
                return AbstractC12123j.m33560t();
            case 15:
                return AbstractC12124k.m33571e();
            case 16:
                return CommitSelectionRequestBody._childSerializers$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return HrSettingsResponse._childSerializers$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return HrSettingsResponse._childSerializers$_anonymous_$0();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return HrSettingsZonesResponse._childSerializers$_anonymous_();
            case 20:
                return ManualHeartRateZonesForm._childSerializers$_anonymous_();
            case 21:
                return AbstractC12208h.m33839o();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC12208h.m33842r();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC12216p.m33887N();
            case 24:
                return AbstractC12228b.m33981n();
            case 25:
                return AbstractC12230d.m34006m();
            case 26:
                return AbstractC12230d.m34009p();
            case 27:
                return AbstractC12230d.m34010q();
            case 28:
                return AbstractC12230d.m34013t();
            default:
                return AbstractC12232f.m34020f();
        }
    }
}
