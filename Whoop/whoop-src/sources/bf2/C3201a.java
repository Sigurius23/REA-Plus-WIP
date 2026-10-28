package bf2;

import androidx.health.platform.client.proto.C1533u;
import bg0.AbstractC3225g;
import bg0.C3220b;
import bi.InterfaceC3265c;
import bm0.AbstractC3409l;
import bm0.C3402e;
import bm2.AbstractC3436e0;
import c93.InterfaceC4339a;
import com.whoop.filteredlist.domain.model.FilteredListResponse;
import com.whoop.hormonalinsights.fertility.FertilitySettingsToggleModel;
import com.whoop.p069ui.main.LinkingActivity;
import com.whoop.sleep.coach.data.network.model.HarvardSleepAdviceDto;
import com.whoop.straphistorysync.sync.C10277e;
import com.whoop.strengthworkout.domain.models.StrengthWorkoutCustomExerciseBody;
import com.whoop.strengthworkout.domain.models.StrengthWorkoutExerciseHistoryResponse;
import com.whoop.strengthworkout.domain.models.StrengthWorkoutExerciseResponse;
import com.whoop.strengthworkout.domain.models.StrengthWorkoutExercisesResponse;
import com.whoop.strengthworkout.domain.models.StrengthWorkoutLibraryResponse;
import com.whoop.strengthworkout.domain.models.StrengthWorkoutModel;
import com.whoop.strengthworkout.domain.models.StrengthWorkoutSaveBody;
import com.whoop.strengthworkout.domain.models.StrengthWorkoutSaveExercise;
import com.whoop.strengthworkout.domain.models.StrengthWorkoutSaveGroup;
import com.whoop.strengthworkout.domain.models.StrengthWorkoutTemplateExercise;
import com.whoop.strengthworkout.domain.models.StrengthWorkoutTemplateGroup;
import com.whoop.strengthworkout.domain.models.StrengthWorkoutTemplateResponse;
import com.whoop.universalcheckout.features.cart.domain.models.AddPackToCartRequest;
import com.whoop.universalcheckout.features.cart.domain.models.CartIndicatorResponse;

/* JADX INFO: renamed from: bf2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C3201a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f12553w;

    public /* synthetic */ C3201a(int i13) {
        this.f12553w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f12553w) {
            case 0:
                return HarvardSleepAdviceDto._childSerializers$_anonymous_();
            case 1:
                return C3220b.m9263e();
            case 2:
                return AbstractC3225g.m9300l();
            case 3:
                return FilteredListResponse._childSerializers$_anonymous_();
            case 4:
                return FilteredListResponse._childSerializers$_anonymous_$0();
            case 5:
                return InterfaceC3265c.f12765a;
            case 6:
                return Long.valueOf(C10277e.m26267f());
            case 7:
                return StrengthWorkoutCustomExerciseBody._childSerializers$_anonymous_();
            case 8:
                return StrengthWorkoutCustomExerciseBody._childSerializers$_anonymous_$0();
            case 9:
                return StrengthWorkoutExerciseHistoryResponse._childSerializers$_anonymous_();
            case 10:
                return StrengthWorkoutExerciseResponse._childSerializers$_anonymous_();
            case 11:
                return StrengthWorkoutExercisesResponse._childSerializers$_anonymous_();
            case 12:
                return StrengthWorkoutLibraryResponse._childSerializers$_anonymous_();
            case 13:
                return StrengthWorkoutModel._childSerializers$_anonymous_();
            case 14:
                return StrengthWorkoutModel._childSerializers$_anonymous_$0();
            case 15:
                return StrengthWorkoutSaveBody._childSerializers$_anonymous_();
            case 16:
                return StrengthWorkoutSaveExercise._childSerializers$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return StrengthWorkoutSaveGroup._childSerializers$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return StrengthWorkoutTemplateExercise._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return StrengthWorkoutTemplateGroup._childSerializers$_anonymous_();
            case 20:
                return StrengthWorkoutTemplateResponse._childSerializers$_anonymous_();
            case 21:
                return C3402e.m9791d();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC3409l.m9805l();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC3436e0.m9926B0();
            case 24:
                return AbstractC3436e0.m10018u0();
            case 25:
                return AbstractC3436e0.m10026y0();
            case 26:
                return LinkingActivity.m27343J();
            case 27:
                return FertilitySettingsToggleModel._childSerializers$_anonymous_();
            case 28:
                return AddPackToCartRequest._childSerializers$_anonymous_();
            default:
                return CartIndicatorResponse._childSerializers$_anonymous_();
        }
    }
}
