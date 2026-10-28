package mq2;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.navigation.models.ApiRequest;
import com.whoop.navigation.models.GenericHttpMethod;
import com.whoop.weeklyplan.api.ChallengeLandingCustomPlanCard;
import com.whoop.weeklyplan.api.ChallengeLandingLoadingState;
import com.whoop.weeklyplan.api.ChallengeLandingResponse;
import com.whoop.weightlifting.feature.exerciserecords.domain.models.ArchMiniExerciseRecords;
import com.whoop.weightlifting.feature.exerciserecords.domain.models.ArchMiniExerciseRecordsModel;
import com.whoop.weightlifting.feature.exerciserecords.domain.models.ExerciseRecordsResponse;
import mt0.C25936f;
import mt2.AbstractC25944e;
import n31.AbstractC26223h;
import n50.C26293d;
import n92.C26480b;
import p077d0.AbstractC11348f;
import p077d0.C11344e;
import p330n1.C26115o;
import p335n6.AbstractC26391h;
import p390p1.AbstractC28683x;
import p390p1.C28674u2;
import p515u6.C34548a;

/* JADX INFO: renamed from: mq2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C25888a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f102156w;

    public /* synthetic */ C25888a(int i13) {
        this.f102156w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        Object obj = null;
        switch (this.f102156w) {
            case 0:
                return Long.valueOf(C25889b.m76544b());
            case 1:
                return AbstractC25890c.m76552b();
            case 2:
                return Long.valueOf(AbstractC25894g.m76585g());
            case 3:
                return ChallengeLandingCustomPlanCard._childSerializers$_anonymous_();
            case 4:
                return ChallengeLandingLoadingState._childSerializers$_anonymous_();
            case 5:
                return ChallengeLandingResponse._childSerializers$_anonymous_();
            case 6:
                return ChallengeLandingResponse._childSerializers$_anonymous_$0();
            case 7:
                return ChallengeLandingResponse._childSerializers$_anonymous_$1();
            case 8:
                return C25936f.m76730z();
            case 9:
                return AbstractC25944e.m76777u();
            case 10:
                return AbstractC25944e.m76778v();
            case 11:
                return ArchMiniExerciseRecords._childSerializers$_anonymous_();
            case 12:
                return ArchMiniExerciseRecordsModel._init_$_anonymous_();
            case 13:
                return ExerciseRecordsResponse._childSerializers$_anonymous_();
            case 14:
                return AbstractC28683x.m87272z(Boolean.FALSE);
            case 15:
                return AbstractC28683x.m87272z(Boolean.FALSE);
            case 16:
                return AbstractC28683x.m87272z(Boolean.FALSE);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC28683x.m87272z(Boolean.FALSE);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ApiRequest._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return GenericHttpMethod._init_$_anonymous_();
            case 20:
                return new C26115o(new C11344e(Float.valueOf(0.0f), AbstractC11348f.f36367i, obj, 12));
            case 21:
                return AbstractC26223h.m77886m();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C26293d.m78001E();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C26293d.m78029z();
            case 24:
                throw new IllegalStateException("No default size");
            case 25:
                throw new IllegalStateException("No default context");
            case 26:
                C28674u2 c28674u2 = AbstractC26391h.f104840a;
                return null;
            case 27:
                throw new IllegalStateException("No default glance id");
            case 28:
                C28674u2 c28674u3 = AbstractC26391h.f104840a;
                return C34548a.f145311B;
            default:
                return C26480b.m78498q();
        }
    }
}
