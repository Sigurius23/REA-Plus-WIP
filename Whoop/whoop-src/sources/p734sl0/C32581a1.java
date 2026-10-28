package p734sl0;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.impacts.impacts.domain.requests.BehaviorImpactResponse;
import com.whoop.impacts.impacts.domain.requests.MetaData;
import com.whoop.universalcheckout.features.buynow.domain.BuyNowRequest;
import sn2.C32779e;
import sr2.C32924f;
import sr2.C32932n;

/* JADX INFO: renamed from: sl0.a1 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C32581a1 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f134974w;

    public /* synthetic */ C32581a1(int i13) {
        this.f134974w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f134974w) {
            case 0:
                return AbstractC32591c1.m101657l();
            case 1:
                return AbstractC32621i1.m101862g();
            case 2:
                return AbstractC32621i1.m101863h();
            case 3:
                return AbstractC32656p1.m102144p();
            case 4:
                return AbstractC32688w1.m102572f();
            case 5:
                return AbstractC32688w1.m102573g();
            case 6:
                return AbstractC32700z1.m102619f();
            case 7:
                return AbstractC32597d2.m101713v();
            case 8:
                return AbstractC32597d2.m101714w();
            case 9:
                return AbstractC32597d2.m101691T();
            case 10:
                return AbstractC32597d2.m101717z();
            case 11:
                return Function2.m102170j();
            case 12:
                return Function2.m102172l();
            case 13:
                return AbstractC32667r2.m102248e();
            case 14:
                return AbstractC32681u2.m102483s();
            case 15:
                return AbstractC32681u2.m102484t();
            case 16:
                return AbstractC32697y2.m102592e();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC32613g3.m101773C();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC32613g3.m101772B();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C32779e.m102814b();
            case 20:
                return BuyNowRequest._childSerializers$_anonymous_();
            case 21:
                return BehaviorImpactResponse._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return MetaData._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C32924f.m103743y4();
            case 24:
                return Long.valueOf(C32924f.m103512K4());
            case 25:
                return C32924f.m103518L4();
            case 26:
                return C32924f.m103593Z3();
            case 27:
                return C32932n.m103831S();
            case 28:
                return C32932n.m103864m0();
            default:
                return C32932n.m103852g0();
        }
    }
}
