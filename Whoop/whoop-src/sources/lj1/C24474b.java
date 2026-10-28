package lj1;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.bot.models.history.ConversationHistory;
import com.whoop.bot.models.history.ConversationHistoryItem;
import com.whoop.bot.models.history.ConversationHistorySection;
import com.whoop.healthconnect.domain.models.HealthConnectEventsResponse;
import com.whoop.healthconnect.domain.models.HealthConnectExerciseSessionRequestBody;
import com.whoop.healthconnect.domain.models.HealthConnectHeartRateModel;
import com.whoop.healthconnect.domain.models.HealthConnectNutritionRequestBody;
import com.whoop.healthconnect.domain.models.HealthConnectSleepSessionModel;
import com.whoop.hormonalinsights.pregnancyinsights.domain.models.GenericSymptomsScreenResponse;
import com.whoop.hormonalinsights.pregnancyinsights.domain.models.PregnancyInsightsGraphModel;
import com.whoop.hormonalinsights.pregnancyinsights.domain.models.PregnancyInsightsHeaderButton;
import com.whoop.hormonalinsights.pregnancyinsights.domain.models.PregnancyInsightsResponse;
import com.whoop.universalcheckout.features.shippingaddress.domain.models.DropdownLookup;
import com.whoop.universalcheckout.features.shippingaddress.domain.models.ShippingAddressModels;
import lk2.C24497d;
import ln1.AbstractC24539q;
import ln1.AbstractC24540r;
import p717lq2.AbstractC24677i;

/* JADX INFO: renamed from: lj1.b */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C24474b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f95460w;

    public /* synthetic */ C24474b(int i13) {
        this.f95460w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f95460w) {
            case 0:
                return HealthConnectEventsResponse._childSerializers$_anonymous_$0();
            case 1:
                return HealthConnectEventsResponse._childSerializers$_anonymous_$1();
            case 2:
                return HealthConnectExerciseSessionRequestBody._childSerializers$_anonymous_();
            case 3:
                return HealthConnectExerciseSessionRequestBody._childSerializers$_anonymous_$0();
            case 4:
                return HealthConnectHeartRateModel._childSerializers$_anonymous_();
            case 5:
                return HealthConnectNutritionRequestBody._childSerializers$_anonymous_();
            case 6:
                return HealthConnectNutritionRequestBody._childSerializers$_anonymous_$0();
            case 7:
                return HealthConnectSleepSessionModel._childSerializers$_anonymous_();
            case 8:
                return C24497d.m71295H();
            case 9:
                return ConversationHistory._childSerializers$_anonymous_();
            case 10:
                return ConversationHistoryItem._childSerializers$_anonymous_();
            case 11:
                return ConversationHistorySection._childSerializers$_anonymous_();
            case 12:
                return AbstractC24539q.m71501L();
            case 13:
                return AbstractC24540r.m71554g();
            case 14:
                return GenericSymptomsScreenResponse._childSerializers$_anonymous_();
            case 15:
                return GenericSymptomsScreenResponse._childSerializers$_anonymous_$0();
            case 16:
                return PregnancyInsightsGraphModel._childSerializers$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return PregnancyInsightsHeaderButton._childSerializers$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return PregnancyInsightsResponse._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return PregnancyInsightsResponse._childSerializers$_anonymous_$0();
            case 20:
                return PregnancyInsightsResponse._childSerializers$_anonymous_$1();
            case 21:
                return PregnancyInsightsResponse._childSerializers$_anonymous_$2();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return PregnancyInsightsResponse._childSerializers$_anonymous_$3();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return PregnancyInsightsResponse._childSerializers$_anonymous_$4();
            case 24:
                return PregnancyInsightsResponse._childSerializers$_anonymous_$5();
            case 25:
                return PregnancyInsightsResponse._childSerializers$_anonymous_$6();
            case 26:
                return PregnancyInsightsResponse._childSerializers$_anonymous_$7();
            case 27:
                return DropdownLookup._childSerializers$_anonymous_();
            case 28:
                return ShippingAddressModels._childSerializers$_anonymous_();
            default:
                return AbstractC24677i.m72086k();
        }
    }
}
