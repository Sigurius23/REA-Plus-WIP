package cp0;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.universalcheckout.features.receipt.domain.models.ReceiptOrderResponse;
import com.whoop.universalcheckout.features.receipt.domain.models.ReceiptSectionModel;
import com.whoop.user.journey.model.yearinreview.ComparisonRow;
import com.whoop.user.journey.model.yearinreview.ContentSection;
import com.whoop.user.journey.model.yearinreview.DonutChartStep;
import com.whoop.user.journey.model.yearinreview.FinaleStep;

/* JADX INFO: renamed from: cp0.m */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C10977m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f34171w;

    public /* synthetic */ C10977m(int i13) {
        this.f34171w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f34171w) {
            case 0:
                return AbstractC10986p.m29300H();
            case 1:
                return AbstractC10986p.m29301I();
            case 2:
                return AbstractC10986p.m29304L();
            case 3:
                return AbstractC10986p.m29295C();
            case 4:
                return AbstractC10986p.m29333y();
            case 5:
                return AbstractC10986p.m29331w();
            case 6:
                return AbstractC10986p.m29297E();
            case 7:
                return AbstractC10995s.m29367o();
            case 8:
                return Boolean.valueOf(AbstractC10969j0.m29144U0());
            case 9:
                return AbstractC10969j0.m29142T0();
            case 10:
                return AbstractC10969j0.m29146V0();
            case 11:
                return AbstractC11009x0.m29455U();
            case 12:
                return AbstractC11009x0.m29492i0();
            case 13:
                return AbstractC11009x0.m29510o0();
            case 14:
                return AbstractC11009x0.m29424E0();
            case 15:
                return AbstractC11009x0.m29471b0();
            case 16:
                return AbstractC11009x0.m29453T();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC11009x0.m29450R0();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC11009x0.m29475c1();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC10979m1.m29263o();
            case 20:
                return ReceiptOrderResponse._childSerializers$_anonymous_();
            case 21:
                return ReceiptOrderResponse._childSerializers$_anonymous_$0();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ReceiptSectionModel._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ComparisonRow._childSerializers$_anonymous_();
            case 24:
                return ContentSection._childSerializers$_anonymous_();
            case 25:
                return ContentSection._childSerializers$_anonymous_$0();
            case 26:
                return DonutChartStep._childSerializers$_anonymous_();
            case 27:
                return DonutChartStep._childSerializers$_anonymous_$0();
            case 28:
                return FinaleStep._childSerializers$_anonymous_();
            default:
                return FinaleStep._childSerializers$_anonymous_$0();
        }
    }
}
