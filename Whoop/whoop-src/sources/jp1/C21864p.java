package jp1;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.impacts.details.domain.requests.BehaviorDetailsFooter;
import com.whoop.impacts.details.domain.requests.BehaviorDetailsHeader;
import com.whoop.impacts.details.domain.requests.BehaviorDetailsResponse;
import com.whoop.impacts.details.domain.requests.BehaviorDetailsSection;
import com.whoop.impacts.details.domain.requests.BehaviorDetailsSubHeader;
import com.whoop.impacts.details.domain.requests.JournalTrendsMiniArchResponse;
import com.whoop.impacts.details.domain.requests.JournalTrendsSectionModel;
import com.whoop.impacts.details.domain.requests.MetaData;
import com.whoop.weightlifting.data.domain.CompletedSetData;
import com.whoop.weightlifting.data.domain.WeightliftingExercise;
import com.whoop.weightlifting.data.domain.WorkoutExercise;
import com.whoop.weightlifting.data.domain.WorkoutGroup;
import com.whoop.weightlifting.data.domain.WorkoutTemplate;
import com.whoop.whattoexpect.domain.models.CtaLocation;
import com.whoop.whattoexpect.domain.models.CurrentProgressSteps;
import com.whoop.whattoexpect.domain.models.WhatToExpectEntryPointResponse;
import com.whoop.whattoexpect.domain.models.WhatToExpectResponse;
import jp2.AbstractC21883n;

/* JADX INFO: renamed from: jp1.p */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C21864p implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f84443w;

    public /* synthetic */ C21864p(int i13) {
        this.f84443w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f84443w) {
            case 0:
                return AbstractC21865q.m61950f();
            case 1:
                return AbstractC21865q.m61951g();
            case 2:
                return AbstractC21866r.m61964k();
            case 3:
                return AbstractC21869u.m61992v();
            case 4:
                return AbstractC21869u.m61990t();
            case 5:
                return AbstractC21883n.m62081s();
            case 6:
                return BehaviorDetailsFooter._childSerializers$_anonymous_();
            case 7:
                return BehaviorDetailsHeader._childSerializers$_anonymous_();
            case 8:
                return BehaviorDetailsResponse._childSerializers$_anonymous_();
            case 9:
                return BehaviorDetailsResponse._childSerializers$_anonymous_$0();
            case 10:
                return BehaviorDetailsSection._childSerializers$_anonymous_();
            case 11:
                return BehaviorDetailsSubHeader._childSerializers$_anonymous_();
            case 12:
                return JournalTrendsMiniArchResponse._childSerializers$_anonymous_();
            case 13:
                return JournalTrendsSectionModel._childSerializers$_anonymous_();
            case 14:
                return MetaData._childSerializers$_anonymous_();
            case 15:
                return CompletedSetData._childSerializers$_anonymous_();
            case 16:
                return CompletedSetData._childSerializers$_anonymous_$0();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return WeightliftingExercise._childSerializers$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return WeightliftingExercise._childSerializers$_anonymous_$0();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return WeightliftingExercise._childSerializers$_anonymous_$1();
            case 20:
                return WeightliftingExercise._childSerializers$_anonymous_$2();
            case 21:
                return WeightliftingExercise._childSerializers$_anonymous_$3();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return WeightliftingExercise._childSerializers$_anonymous_$4();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return WorkoutExercise._childSerializers$_anonymous_();
            case 24:
                return WorkoutGroup._childSerializers$_anonymous_();
            case 25:
                return WorkoutTemplate._childSerializers$_anonymous_();
            case 26:
                return CtaLocation._init_$_anonymous_();
            case 27:
                return CurrentProgressSteps._childSerializers$_anonymous_();
            case 28:
                return WhatToExpectEntryPointResponse._childSerializers$_anonymous_();
            default:
                return WhatToExpectResponse._childSerializers$_anonymous_();
        }
    }
}
