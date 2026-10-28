package db2;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.exerciseprogressminiarch.domain.models.ArchMiniExerciseProgress;
import com.whoop.exerciseprogressminiarch.domain.models.ArchMiniExerciseProgressModel;
import com.whoop.exerciseprogressminiarch.domain.models.ExerciseProgressMiniArchModel;
import com.whoop.exerciseprogressminiarch.domain.models.ExerciseProgressMiniArchModelResponse;
import com.whoop.exerciseprogressminiarch.domain.models.ExerciseProgressModel;
import com.whoop.exerciseprogressminiarch.domain.models.ExerciseProgressModels;
import com.whoop.settings.banner.models.SettingsBannerDtoV2;
import com.whoop.settings.banner.models.SettingsBannerDtoV3;
import com.whoop.sleep.coach.data.network.model.sleepScheduleComponent.AlarmModeTypeDto;
import com.whoop.sleep.coach.data.network.model.sleepScheduleComponent.AlarmModeValue;
import com.whoop.sleep.coach.data.network.model.sleepScheduleComponent.CreateAlarmScheduleDto;
import com.whoop.sleep.coach.data.network.model.sleepScheduleComponent.DaySelectionStateDTO;
import com.whoop.sleep.coach.data.network.model.sleepScheduleComponent.NextStateDto;
import dc2.AbstractC11914a;
import dd1.C11951e;
import dd1.C11956j;
import dd1.C11958l;
import dd2.C11971a;

/* JADX INFO: renamed from: db2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C11888a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f38860w;

    public /* synthetic */ C11888a(int i13) {
        this.f38860w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f38860w) {
            case 0:
                return SettingsBannerDtoV2._childSerializers$_anonymous_();
            case 1:
                return SettingsBannerDtoV3._childSerializers$_anonymous_();
            case 2:
                return AbstractC11914a.m32184i();
            case 3:
                return C11951e.m32380o2();
            case 4:
                return C11951e.m32301K1();
            case 5:
                return C11951e.m32323V1();
            case 6:
                return C11951e.m32403y1();
            case 7:
                return C11951e.m32309O1();
            case 8:
                return C11951e.m32337b2();
            case 9:
                return C11956j.m32517M2();
            case 10:
                return C11956j.m32626x2();
            case 11:
                return C11956j.m32504I1();
            case 12:
                return C11956j.m32528Q1();
            case 13:
                return C11958l.m32747h1();
            case 14:
                return C11958l.m32691A1();
            case 15:
                return C11958l.m32693B1();
            case 16:
                return C11958l.m32731Z0();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C11971a.m32968o();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ArchMiniExerciseProgress._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ArchMiniExerciseProgressModel._init_$_anonymous_();
            case 20:
                return ExerciseProgressMiniArchModel._childSerializers$_anonymous_();
            case 21:
                return ExerciseProgressMiniArchModelResponse._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ExerciseProgressModel._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ExerciseProgressModels._childSerializers$_anonymous_();
            case 24:
                return AlarmModeTypeDto._childSerializers$_anonymous_();
            case 25:
                return AlarmModeTypeDto._childSerializers$_anonymous_$0();
            case 26:
                return AlarmModeValue._init_$_anonymous_();
            case 27:
                return CreateAlarmScheduleDto._childSerializers$_anonymous_();
            case 28:
                return DaySelectionStateDTO._init_$_anonymous_();
            default:
                return NextStateDto._init_$_anonymous_();
        }
    }
}
