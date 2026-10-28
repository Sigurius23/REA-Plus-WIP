package p727py0;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.stripe.android.financialconnections.model.Balance;
import com.stripe.android.financialconnections.model.BalanceRefresh;
import com.stripe.android.financialconnections.model.OwnershipRefresh;
import q11.AbstractC29798h;
import q22.AbstractC29854d;

/* JADX INFO: renamed from: py0.c */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C29618c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f120963w;

    public /* synthetic */ C29618c(int i13) {
        this.f120963w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f120963w) {
            case 0:
                return AbstractC29619d.m90970R();
            case 1:
                return AbstractC29619d.m90957E();
            case 2:
                return AbstractC29619d.m90958F();
            case 3:
                return AbstractC29619d.m90959G();
            case 4:
                return AbstractC29619d.m90960H();
            case 5:
                return AbstractC29619d.m90972T();
            case 6:
                return AbstractC29619d.m90973U();
            case 7:
                return AbstractC29619d.m90974V();
            case 8:
                return AbstractC29619d.m90975W();
            case 9:
                return AbstractC29619d.m90963K();
            case 10:
                return AbstractC29619d.m90977Y();
            case 11:
                return AbstractC29619d.m90978Z();
            case 12:
                return AbstractC29619d.m90980a0();
            case 13:
                return AbstractC29619d.m90982b0();
            case 14:
                return AbstractC29619d.m90964L();
            case 15:
                return AbstractC29619d.m90965M();
            case 16:
                return AbstractC29619d.m91006z();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC29619d.m90953A();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC29619d.m90954B();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC29619d.m90955C();
            case 20:
                return AbstractC29619d.m90967O();
            case 21:
                return AbstractC29619d.m90968P();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return Balance.Type._init_$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return BalanceRefresh.BalanceRefreshStatus._init_$_anonymous_();
            case 24:
                return OwnershipRefresh.Status._init_$_anonymous_();
            case 25:
                return AbstractC29798h.m91285t();
            case 26:
                return AbstractC29854d.m91475z();
            case 27:
                return AbstractC29854d.m91434C();
            case 28:
                return AbstractC29854d.m91437F();
            default:
                return AbstractC29854d.m91441J();
        }
    }
}
