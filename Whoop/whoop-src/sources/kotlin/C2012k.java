package kotlin;

import androidx.health.platform.client.proto.C1533u;
import az1.AbstractC2162c;
import az1.AbstractC2166g;
import az1.AbstractC2167h;
import az1.AbstractC2173n;
import az2.C2174a;
import c93.InterfaceC4339a;
import com.whoop.data.remote.domain.request.JournalTrackerInput;
import com.whoop.data.remote.domain.request.JournalTrackerRequest;
import com.whoop.data.remote.domain.request.PartialEntryTrackerInput;
import com.whoop.data.remote.domain.request.PartialJournalEntryRequest;
import com.whoop.data.remote.domain.request.UserState;
import com.whoop.data.remote.domain.request.UserStateRequestBody;
import com.whoop.deepdive.domain.models.DeepDiveHeaderModel;
import com.whoop.deepdive.domain.models.DeepDiveModels;
import com.whoop.deepdive.domain.models.DeepDiveSectionModel;
import com.whoop.limitedtimeoffer.domain.models.LimitedTimeOfferModels;
import com.whoop.limitedtimeoffer.domain.models.LimitedTimeOfferSectionModel;
import com.whoop.limitedtimeoffer.domain.models.LtoStickyModel;
import com.whoop.limitedtimeoffer.domain.models.TimerPillModel;
import com.whoop.weightlifting.feature.onerepmax.measuremententry.models.MeasurementEntryItemModel;
import p698au1.AbstractC2060e;
import p698au1.AbstractC2072q;

/* JADX INFO: renamed from: at2.k */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C2012k implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7986w;

    public /* synthetic */ C2012k(int i13) {
        this.f7986w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f7986w) {
            case 0:
                return AbstractC2016m.m6281u0();
            case 1:
                return AbstractC2060e.m6487e();
            case 2:
                return AbstractC2072q.m6521G();
            case 3:
                return LimitedTimeOfferModels._childSerializers$_anonymous_();
            case 4:
                return LimitedTimeOfferModels._childSerializers$_anonymous_$0();
            case 5:
                return LimitedTimeOfferSectionModel._childSerializers$_anonymous_();
            case 6:
                return LtoStickyModel._childSerializers$_anonymous_();
            case 7:
                return TimerPillModel._childSerializers$_anonymous_();
            case 8:
                return MeasurementEntryItemModel._childSerializers$_anonymous_();
            case 9:
                return MeasurementEntryItemModel._childSerializers$_anonymous_$0();
            case 10:
                return MeasurementEntryItemModel._childSerializers$_anonymous_$1();
            case 11:
                return JournalTrackerInput._childSerializers$_anonymous_();
            case 12:
                return JournalTrackerRequest._childSerializers$_anonymous_();
            case 13:
                return PartialEntryTrackerInput._childSerializers$_anonymous_();
            case 14:
                return PartialJournalEntryRequest._childSerializers$_anonymous_();
            case 15:
                return UserState._init_$_anonymous_();
            case 16:
                return UserStateRequestBody._childSerializers$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return DeepDiveHeaderModel._childSerializers$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return DeepDiveHeaderModel._childSerializers$_anonymous_$0();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return DeepDiveModels._childSerializers$_anonymous_();
            case 20:
                return DeepDiveSectionModel._childSerializers$_anonymous_();
            case 21:
                return AbstractC2162c.m6733h();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC2162c.m6735j();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC2166g.m6761q();
            case 24:
                return AbstractC2166g.m6740C();
            case 25:
                return AbstractC2166g.m6768x();
            case 26:
                return AbstractC2167h.m6782k();
            case 27:
                return AbstractC2167h.m6786o();
            case 28:
                return AbstractC2173n.m6798D();
            default:
                return C2174a.m6849o();
        }
    }
}
