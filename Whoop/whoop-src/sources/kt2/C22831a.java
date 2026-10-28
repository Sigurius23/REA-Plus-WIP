package kt2;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.weeklyplan.hubandspoke.domain.api.InitialSelection;
import com.whoop.weeklyplan.hubandspoke.domain.api.InitialSelectionKotlinx;
import com.whoop.weeklyplan.hubandspoke.domain.api.MetaData;
import com.whoop.weeklyplan.hubandspoke.domain.api.MetaDataKotlinx;
import com.whoop.weeklyplan.hubandspoke.domain.api.MetricDetail;
import com.whoop.weeklyplan.hubandspoke.domain.api.MetricDetailKotlinx;
import com.whoop.weeklyplan.hubandspoke.domain.api.MetricScreen;
import com.whoop.weeklyplan.hubandspoke.domain.api.MetricScreenKotlinx;
import com.whoop.weeklyplan.hubandspoke.domain.api.PlanSelections;
import com.whoop.weeklyplan.hubandspoke.domain.api.TargetGoal;
import com.whoop.weightlifting.data.dto.CustomExerciseDto;
import com.whoop.weightlifting.data.dto.ExerciseData;
import com.whoop.weightlifting.data.dto.ExerciseDetailsModel;
import com.whoop.weightlifting.data.dto.FilterOptionsDto;
import com.whoop.weightlifting.data.dto.LinkWorkoutScreenContentModel;
import com.whoop.weightlifting.data.dto.MyWorkoutsEmptyState;
import com.whoop.weightlifting.data.dto.PrebuiltTemplateDetailsHeader;

/* JADX INFO: renamed from: kt2.a */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C22831a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f89987w;

    public /* synthetic */ C22831a(int i13) {
        this.f89987w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f89987w) {
            case 0:
                return InitialSelection._childSerializers$_anonymous_();
            case 1:
                return InitialSelection._childSerializers$_anonymous_$0();
            case 2:
                return InitialSelection._childSerializers$_anonymous_$1();
            case 3:
                return InitialSelectionKotlinx._childSerializers$_anonymous_();
            case 4:
                return InitialSelectionKotlinx._childSerializers$_anonymous_$0();
            case 5:
                return InitialSelectionKotlinx._childSerializers$_anonymous_$1();
            case 6:
                return MetaData._childSerializers$_anonymous_();
            case 7:
                return MetaDataKotlinx._childSerializers$_anonymous_();
            case 8:
                return MetricDetail._childSerializers$_anonymous_();
            case 9:
                return MetricDetailKotlinx._childSerializers$_anonymous_();
            case 10:
                return MetricScreen._childSerializers$_anonymous_();
            case 11:
                return MetricScreenKotlinx._childSerializers$_anonymous_();
            case 12:
                return PlanSelections._childSerializers$_anonymous_();
            case 13:
                return PlanSelections._childSerializers$_anonymous_$0();
            case 14:
                return PlanSelections._childSerializers$_anonymous_$1();
            case 15:
                return TargetGoal._childSerializers$_anonymous_();
            case 16:
                return CustomExerciseDto._childSerializers$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return CustomExerciseDto._childSerializers$_anonymous_$0();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ExerciseData._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ExerciseDetailsModel._childSerializers$_anonymous_();
            case 20:
                return FilterOptionsDto._childSerializers$_anonymous_();
            case 21:
                return FilterOptionsDto._childSerializers$_anonymous_$0();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return FilterOptionsDto._childSerializers$_anonymous_$1();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return LinkWorkoutScreenContentModel._childSerializers$_anonymous_();
            case 24:
                return LinkWorkoutScreenContentModel._childSerializers$_anonymous_$0();
            case 25:
                return LinkWorkoutScreenContentModel._childSerializers$_anonymous_$1();
            case 26:
                return LinkWorkoutScreenContentModel._childSerializers$_anonymous_$2();
            case 27:
                return com.whoop.weightlifting.data.dto.MetaData._childSerializers$_anonymous_();
            case 28:
                return MyWorkoutsEmptyState._childSerializers$_anonymous_();
            default:
                return PrebuiltTemplateDetailsHeader._childSerializers$_anonymous_();
        }
    }
}
