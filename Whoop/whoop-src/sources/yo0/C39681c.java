package yo0;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.activation.dayzero.model.DayZeroSplashResponse;
import com.whoop.data.remote.domain.dto.healthmonitor.HealthMonitorDto;
import com.whoop.data.remote.domain.dto.healthmonitor.HealthMonitorMetric;
import com.whoop.design.models.items.behaviordetails.BehaviorDetailsTileModel;
import com.whoop.membership.dunning.domain.models.CycleDataDunningBottomSheetCtaModel;
import com.whoop.membership.dunning.domain.models.CycleDataDunningBottomSheetModel;
import com.whoop.membership.dunning.domain.models.PaymentsOptionsDunningBottomSheetCtaModel;
import com.whoop.recoveryimpacts.domain.model.RecoveryImpactsResponse;
import com.whoop.recoveryimpacts.domain.model.RecoveryImpactsTileModel;
import yt2.AbstractC39772c;
import yt2.AbstractC39782m;
import yw1.AbstractC39822i;
import yw1.AbstractC39826m;
import z22.C40023b;
import z51.C40091b;
import z71.AbstractC40153l;
import z72.AbstractC40161g;
import z80.AbstractC40180a;

/* JADX INFO: renamed from: yo0.c */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C39681c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f170799w;

    public /* synthetic */ C39681c(int i13) {
        this.f170799w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f170799w) {
            case 0:
                return AbstractC39683e.m126956i0();
            case 1:
                return AbstractC39683e.m126960k0();
            case 2:
                return AbstractC39683e.m126919G();
            case 3:
                return AbstractC39683e.m126948e0();
            case 4:
                return AbstractC39687i.m127000d();
            case 5:
                return AbstractC39772c.m127344q();
            case 6:
                return AbstractC39772c.m127345r();
            case 7:
                return AbstractC39772c.m127351x();
            case 8:
                return AbstractC39772c.m127353z();
            case 9:
                return AbstractC39782m.m127428D();
            case 10:
                return CycleDataDunningBottomSheetCtaModel._childSerializers$_anonymous_();
            case 11:
                return CycleDataDunningBottomSheetModel._childSerializers$_anonymous_();
            case 12:
                return PaymentsOptionsDunningBottomSheetCtaModel._childSerializers$_anonymous_();
            case 13:
                return HealthMonitorDto._childSerializers$_anonymous_();
            case 14:
                return HealthMonitorMetric._childSerializers$_anonymous_();
            case 15:
                return AbstractC39822i.m127707p();
            case 16:
                return AbstractC39826m.m127741g();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return Long.valueOf(System.currentTimeMillis());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C40023b.m128293e();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C40091b.m128524f();
            case 20:
                return RecoveryImpactsResponse._childSerializers$_anonymous_();
            case 21:
                return RecoveryImpactsTileModel._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return RecoveryImpactsTileModel._childSerializers$_anonymous_$0();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return DayZeroSplashResponse._childSerializers$_anonymous_();
            case 24:
                return DayZeroSplashResponse._childSerializers$_anonymous_$0();
            case 25:
                return AbstractC40153l.m128739D();
            case 26:
                return AbstractC40153l.m128736A();
            case 27:
                return AbstractC40161g.m128840n0();
            case 28:
                return AbstractC40180a.m128904l();
            default:
                return BehaviorDetailsTileModel._childSerializers$_anonymous_();
        }
    }
}
