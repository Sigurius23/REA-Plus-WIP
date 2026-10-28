package com.whoop.core.details.network.model;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.design.models.ActivityTileSelectionState;
import com.whoop.design.models.BarsModel;
import com.whoop.design.models.BreakDownBarModel;
import com.whoop.design.models.ComparisonBarsGraphModel;
import com.whoop.design.models.ContentType;

/* JADX INFO: renamed from: com.whoop.core.details.network.model.a */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C6451a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f25284w;

    public /* synthetic */ C6451a(int i13) {
        this.f25284w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f25284w) {
            case 0:
                return CoreDetailsModel._childSerializers$_anonymous_$2();
            case 1:
                return CoreDetailsModel._childSerializers$_anonymous_$3();
            case 2:
                return CoreDetailsModel._childSerializers$_anonymous_$4();
            case 3:
                return CoreDetailsModel._childSerializers$_anonymous_$5();
            case 4:
                return CoreDetailsModel._childSerializers$_anonymous_$6();
            case 5:
                return CoreDetailsModel._childSerializers$_anonymous_$7();
            case 6:
                return DetailsEditComponent._childSerializers$_anonymous_();
            case 7:
                return DetailsEditComponent._childSerializers$_anonymous_$0();
            case 8:
                return ExerciseCardGroupModel._childSerializers$_anonymous_();
            case 9:
                return ExerciseSummaryCarouselModel._childSerializers$_anonymous_();
            case 10:
                return ExerciseSummaryModel._childSerializers$_anonymous_();
            case 11:
                return GraphTitleBar._childSerializers$_anonymous_();
            case 12:
                return GraphTitleBar._childSerializers$_anonymous_$0();
            case 13:
                return ItemModel._childSerializers$_anonymous_();
            case 14:
                return ItemModel._childSerializers$_anonymous_$0();
            case 15:
                return MenuOptionsItem._childSerializers$_anonymous_();
            case 16:
                return MenuOptionsItem._childSerializers$_anonymous_$0();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return MetaData._childSerializers$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return SingleScoreType._init_$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return SupplementalData._childSerializers$_anonymous_();
            case 20:
                return SupplementalData._childSerializers$_anonymous_$0();
            case 21:
                return SupplementalData._childSerializers$_anonymous_$1();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return WeightliftingCardioDetails._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ActivityTileSelectionState._init_$_anonymous_();
            case 24:
                return BarsModel._childSerializers$_anonymous_();
            case 25:
                return BreakDownBarModel._childSerializers$_anonymous_();
            case 26:
                return BreakDownBarModel._childSerializers$_anonymous_$0();
            case 27:
                return ComparisonBarsGraphModel._childSerializers$_anonymous_();
            case 28:
                return ComparisonBarsGraphModel._childSerializers$_anonymous_$0();
            default:
                return ContentType._init_$_anonymous_();
        }
    }
}
