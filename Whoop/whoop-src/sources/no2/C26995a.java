package no2;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.labfileupload.domain.models.ExternalDataUploadMetadata;
import com.whoop.labfileupload.domain.models.ExternalDataUploadResponse;
import com.whoop.labfileupload.domain.models.ExternalDataUploadSource;
import com.whoop.universalcheckout.features.checkout.domain.models.items.CheckoutFooterModel;
import com.whoop.universalcheckout.features.checkout.domain.models.items.CheckoutInfoModel;
import com.whoop.universalcheckout.features.checkout.domain.models.items.OrderDetailsModel;
import com.whoop.universalcheckout.features.checkout.domain.models.items.OrderDetailsSummaryCtaModel;
import com.whoop.universalcheckout.features.checkout.domain.models.items.OrderItemDetailsModel;
import com.whoop.universalcheckout.features.checkout.domain.models.items.PaymentMethodMenuTileModel;
import com.whoop.universalcheckout.features.checkout.domain.models.items.PaymentMethodTileModel;
import com.whoop.universalcheckout.features.checkout.domain.models.items.PreviewTileContent;
import com.whoop.universalcheckout.features.checkout.domain.models.items.PromoCodeInputModel;
import com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkout;
import com.whoop.weightlifting.feature.active.activeworkout.domain.CurrentSetState;
import com.whoop.weightlifting.feature.active.activeworkout.domain.WorkoutAnalytics;
import nq2.AbstractC27065h;
import nr2.AbstractC27079a;

/* JADX INFO: renamed from: no2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C26995a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f107675w;

    public /* synthetic */ C26995a(int i13) {
        this.f107675w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f107675w) {
            case 0:
                return CheckoutFooterModel._childSerializers$_anonymous_();
            case 1:
                return CheckoutInfoModel._childSerializers$_anonymous_();
            case 2:
                return OrderDetailsModel._childSerializers$_anonymous_();
            case 3:
                return OrderDetailsSummaryCtaModel._childSerializers$_anonymous_();
            case 4:
                return OrderItemDetailsModel._childSerializers$_anonymous_();
            case 5:
                return PaymentMethodMenuTileModel._childSerializers$_anonymous_();
            case 6:
                return PaymentMethodMenuTileModel._childSerializers$_anonymous_$0();
            case 7:
                return PaymentMethodTileModel._childSerializers$_anonymous_();
            case 8:
                return PreviewTileContent._childSerializers$_anonymous_();
            case 9:
                return PromoCodeInputModel._childSerializers$_anonymous_();
            case 10:
                return AbstractC27065h.m81352g();
            case 11:
                return AbstractC27079a.m81448f();
            case 12:
                return ExternalDataUploadMetadata._childSerializers$_anonymous_();
            case 13:
                return ExternalDataUploadResponse._childSerializers$_anonymous_();
            case 14:
                return ExternalDataUploadSource._init_$_anonymous_();
            case 15:
                return ActiveWorkout._childSerializers$_anonymous_();
            case 16:
                return ActiveWorkout._childSerializers$_anonymous_$0();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return ActiveWorkout._childSerializers$_anonymous_$1();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ActiveWorkout._childSerializers$_anonymous_$2();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ActiveWorkout._childSerializers$_anonymous_$3();
            case 20:
                return ActiveWorkout._childSerializers$_anonymous_$4();
            case 21:
                return ActiveWorkout._childSerializers$_anonymous_$5();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ActiveWorkout._childSerializers$_anonymous_$6();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ActiveWorkout._childSerializers$_anonymous_$7();
            case 24:
                return CurrentSetState.Active._childSerializers$_anonymous_();
            case 25:
                return CurrentSetState.Cooldown._childSerializers$_anonymous_();
            case 26:
                return CurrentSetState.Rest._childSerializers$_anonymous_();
            case 27:
                return CurrentSetState.Warmup._childSerializers$_anonymous_();
            case 28:
                return WorkoutAnalytics._childSerializers$_anonymous_();
            default:
                return WorkoutAnalytics._childSerializers$_anonymous_$0();
        }
    }
}
