package bo2;

import androidx.health.platform.client.proto.C1533u;
import bs1.AbstractC3583c0;
import bv2.AbstractC3676c;
import by2.C3701a;
import c41.AbstractC4097q0;
import c41.AbstractC4134v2;
import c41.AbstractC4158z;
import c41.AbstractC4163z4;
import c93.InterfaceC4339a;
import com.whoop.community.data.network.DataWidgetDto;
import com.whoop.data.remote.domain.response.EnabledLanguagesResponse;
import com.whoop.design.models.items.datepicker.DatePickerModel;
import com.whoop.universalcheckout.features.cart.domain.models.CartResponse;
import com.whoop.universalcheckout.features.cart.domain.models.CartSection;
import com.whoop.user.journey.model.weekinreview.ChatBox;
import com.whoop.user.journey.model.weekinreview.ColoredText;
import com.whoop.user.journey.model.weekinreview.PastSevenDaysStep;
import com.whoop.user.journey.model.weekinreview.WirPillarIntroStep;
import com.whoop.user.journey.model.weekinreview.WirWrapUpRecommendationsStep;
import com.whoop.whooplabs.data.domain.SurveyProvider;

/* JADX INFO: renamed from: bo2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C3509a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f13981w;

    public /* synthetic */ C3509a(int i13) {
        this.f13981w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f13981w) {
            case 0:
                return CartResponse._childSerializers$_anonymous_();
            case 1:
                return CartSection._childSerializers$_anonymous_();
            case 2:
                return DataWidgetDto._childSerializers$_anonymous_();
            case 3:
                return ChatBox._childSerializers$_anonymous_();
            case 4:
                return ColoredText._childSerializers$_anonymous_();
            case 5:
                return PastSevenDaysStep._childSerializers$_anonymous_();
            case 6:
                return WirPillarIntroStep._childSerializers$_anonymous_();
            case 7:
                return WirWrapUpRecommendationsStep._childSerializers$_anonymous_();
            case 8:
                return AbstractC3583c0.m10743C1();
            case 9:
                return AbstractC3583c0.m10860l2();
            case 10:
                return AbstractC3583c0.m10776N1();
            case 11:
                return AbstractC3583c0.m10819b1();
            case 12:
                return AbstractC3676c.m11383s();
            case 13:
                return EnabledLanguagesResponse._childSerializers$_anonymous_();
            case 14:
                return SurveyProvider._init_$_anonymous_();
            case 15:
                return C3701a.m11523o();
            case 16:
                return AbstractC4158z.m12976e();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC4097q0.m12602q();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC4134v2.m12813n();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC4163z4.m13007l();
            case 20:
                return AbstractC4163z4.m13008m();
            case 21:
                return AbstractC4163z4.m13009n();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC4163z4.m13010o();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC4163z4.m13011p();
            case 24:
                return AbstractC4163z4.m13012q();
            case 25:
                return AbstractC4163z4.m13013r();
            case 26:
                return AbstractC4163z4.m13014s();
            case 27:
                return AbstractC4163z4.m13015t();
            case 28:
                return AbstractC4163z4.m13016u();
            default:
                return DatePickerModel._childSerializers$_anonymous_();
        }
    }
}
