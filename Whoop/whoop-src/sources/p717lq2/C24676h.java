package p717lq2;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.communityhighlights.domain.models.HighlightCardBadgeModel;
import com.whoop.communityhighlights.domain.models.HighlightCardLabelModel;
import com.whoop.labrador.feature.eligibility.domain.model.LabradorEligibilityResponse;
import com.whoop.labrador.feature.eligibility.domain.model.SupportedRegionPicker;
import com.whoop.weeklyplan.hubandspoke.domain.models.BehaviorsAndActivities;
import com.whoop.weeklyplan.hubandspoke.domain.models.MetricCardModel;
import com.whoop.weeklyplan.hubandspoke.domain.models.MetricPlanTileModel;
import com.whoop.weeklyplan.hubandspoke.domain.models.MetricTrendStyle;

/* JADX INFO: renamed from: lq2.h */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C24676h implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f96501w;

    public /* synthetic */ C24676h(int i13) {
        this.f96501w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f96501w) {
            case 0:
                return AbstractC24677i.m72087l();
            case 1:
                return AbstractC24677i.m72083h();
            case 2:
                return AbstractC24680l.m72090A();
            case 3:
                return AbstractC24680l.m72122w();
            case 4:
                return AbstractC24680l.m72123x();
            case 5:
                return AbstractC24680l.m72114o();
            case 6:
                return AbstractC24680l.m72115p();
            case 7:
                return AbstractC24686r.m72231n0();
            case 8:
                return AbstractC24686r.m72197T();
            case 9:
                return AbstractC24686r.m72198U();
            case 10:
                return AbstractC24686r.m72215f0();
            case 11:
                return AbstractC24686r.m72217g0();
            case 12:
                return AbstractC24686r.m72219h0();
            case 13:
                return AbstractC24686r.m72187J();
            case 14:
                return AbstractC24686r.m72233o0();
            case 15:
                return AbstractC24686r.m72235p0();
            case 16:
                return AbstractC24686r.m72237q0();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC24686r.m72239r0();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC24686r.m72241s0();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return HighlightCardBadgeModel._childSerializers$_anonymous_();
            case 20:
                return HighlightCardLabelModel._childSerializers$_anonymous_();
            case 21:
                return LabradorEligibilityResponse._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return LabradorEligibilityResponse._childSerializers$_anonymous_$0();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return SupportedRegionPicker._childSerializers$_anonymous_();
            case 24:
                return BehaviorsAndActivities._childSerializers$_anonymous_();
            case 25:
                return BehaviorsAndActivities._childSerializers$_anonymous_$0();
            case 26:
                return BehaviorsAndActivities._childSerializers$_anonymous_$1();
            case 27:
                return MetricCardModel._childSerializers$_anonymous_();
            case 28:
                return MetricPlanTileModel._childSerializers$_anonymous_();
            default:
                return MetricTrendStyle._init_$_anonymous_();
        }
    }
}
