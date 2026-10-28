package sr2;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.molecule.InformationItemStyle;
import com.whoop.membership.familyPlan.domain.model.items.ComparisonElementType;
import com.whoop.membership.familyPlan.domain.model.items.ComparisonRowElement;
import com.whoop.membership.familyPlan.domain.model.items.ComparisonTableModel;
import com.whoop.profile.domain.models.components.ContextHubTileModel;
import com.whoop.profile.domain.models.components.ReferralsTileModel;
import com.whoop.profile.domain.models.components.ReferredListModel;
import p390p1.AbstractC28683x;
import p736sz0.AbstractC33207p;
import p736sz0.AbstractC33208p0;
import p736sz0.C33211q0;
import p736sz0.Function0;
import sv2.AbstractC33042e;
import sx1.AbstractC33074j;
import sy2.AbstractC33108k;
import sy2.AbstractC33110m;
import sy2.AbstractC33113p;
import t11.AbstractC33305e;
import t21.AbstractC33349g;

/* JADX INFO: renamed from: sr2.v */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C32940v implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f137229w;

    public /* synthetic */ C32940v(int i13) {
        this.f137229w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f137229w) {
            case 0:
                return C32941w.m103954V();
            case 1:
                return C32919a0.m103405b0();
            case 2:
                return AbstractC33042e.m104472R0();
            case 3:
                return ComparisonElementType._init_$_anonymous_();
            case 4:
                return ComparisonRowElement._childSerializers$_anonymous_();
            case 5:
                return ComparisonTableModel._childSerializers$_anonymous_();
            case 6:
                return ComparisonTableModel._childSerializers$_anonymous_$0();
            case 7:
                return AbstractC33074j.m104745N();
            case 8:
                return AbstractC33074j.m104746O();
            case 9:
                return AbstractC33074j.m104747P();
            case 10:
                return AbstractC33074j.m104748Q();
            case 11:
                return AbstractC33074j.m104775x();
            case 12:
                return AbstractC33108k.m104921t();
            case 13:
                return AbstractC33110m.m104935j();
            case 14:
                return AbstractC33113p.m104971y();
            case 15:
                return AbstractC33207p.m105302f();
            case 16:
                return InformationItemStyle._init_$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return Function0.m105275q();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return Function0.m105276r();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return Function0.m105268j();
            case 20:
                return Function0.m105269k();
            case 21:
                return Function0.m105272n();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC33208p0.h.m105312e();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C33211q0.m105331b();
            case 24:
                return AbstractC33305e.m105624L();
            case 25:
                return AbstractC28683x.m87272z(Boolean.FALSE);
            case 26:
                return AbstractC33349g.m105732I();
            case 27:
                return ContextHubTileModel._childSerializers$_anonymous_();
            case 28:
                return ReferralsTileModel._childSerializers$_anonymous_();
            default:
                return ReferredListModel._childSerializers$_anonymous_();
        }
    }
}
