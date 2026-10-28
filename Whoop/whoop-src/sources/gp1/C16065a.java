package gp1;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.core.details.network.model.sleep.ActivityDisplayType;
import com.whoop.core.details.network.model.sleep.SleepDetailsKeyMetricTileType;
import com.whoop.core.details.network.model.sleep.SleepDetailsMetricModalsModel;
import com.whoop.core.details.network.model.sleep.SleepDetailsModel;
import com.whoop.core.details.network.model.sleep.SleepMetricBreakdownModel;
import com.whoop.core.details.network.model.sleep.SleepMetricTrendType;
import com.whoop.core.details.network.model.sleep.SleepMetricTypeModel;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalTextInputScreen;
import com.whoop.hormonalinsights.postpartum.domain.models.MultiSelectOption;
import com.whoop.hormonalinsights.postpartum.domain.models.PostPartumRequest;
import com.whoop.hormonalinsights.postpartum.domain.models.PostPartumResponse;
import com.whoop.membership.extensions.domain.models.Cta;
import gp2.AbstractC16071f;
import gv1.AbstractC16237k;
import p707gt1.AbstractC16198l;
import p707gt1.AbstractC16200n;
import p707gt1.Function0;

/* JADX INFO: renamed from: gp1.a */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C16065a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f60759w;

    public /* synthetic */ C16065a(int i13) {
        this.f60759w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f60759w) {
            case 0:
                return HormonalTextInputScreen._childSerializers$_anonymous_();
            case 1:
                return HormonalTextInputScreen._childSerializers$_anonymous_$0();
            case 2:
                return MultiSelectOption._childSerializers$_anonymous_();
            case 3:
                return PostPartumRequest._childSerializers$_anonymous_();
            case 4:
                return PostPartumRequest._childSerializers$_anonymous_$0();
            case 5:
                return PostPartumResponse._childSerializers$_anonymous_();
            case 6:
                return PostPartumResponse._childSerializers$_anonymous_$0();
            case 7:
                return AbstractC16071f.m45412l();
            case 8:
                return Function0.m45773d();
            case 9:
                return AbstractC16198l.m45780C();
            case 10:
                return AbstractC16198l.m45781D();
            case 11:
                return AbstractC16198l.m45782E();
            case 12:
                return AbstractC16198l.m45809z();
            case 13:
                return AbstractC16198l.m45778A();
            case 14:
                return AbstractC16200n.m45844z();
            case 15:
                return AbstractC16200n.m45811B();
            case 16:
                return AbstractC16200n.m45812C();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC16237k.m46003f();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ActivityDisplayType._init_$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return SleepDetailsKeyMetricTileType._init_$_anonymous_();
            case 20:
                return SleepDetailsMetricModalsModel._childSerializers$_anonymous_();
            case 21:
                return SleepDetailsMetricModalsModel._childSerializers$_anonymous_$0();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return SleepDetailsModel._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return SleepDetailsModel._childSerializers$_anonymous_$0();
            case 24:
                return SleepDetailsModel._childSerializers$_anonymous_$1();
            case 25:
                return SleepMetricBreakdownModel._childSerializers$_anonymous_();
            case 26:
                return SleepMetricBreakdownModel._childSerializers$_anonymous_$0();
            case 27:
                return SleepMetricTrendType._init_$_anonymous_();
            case 28:
                return SleepMetricTypeModel._init_$_anonymous_();
            default:
                return Cta._childSerializers$_anonymous_();
        }
    }
}
