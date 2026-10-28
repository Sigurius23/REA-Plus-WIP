package sh2;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.health.domain.models.CardSupplementalInfo;
import com.whoop.health.domain.models.DataVisualizationCardModel;
import com.whoop.health.domain.models.EntryPointLockedCardModel;
import com.whoop.health.domain.models.HealthTabResponse;
import com.whoop.health.domain.models.HealthTabSectionModel;
import com.whoop.health.domain.models.HealthspanHeroMetricModel;
import com.whoop.health.domain.models.HorizontalRecordsTileModel;
import com.whoop.health.domain.models.ImageVisualizationCardBodyModel;
import com.whoop.health.domain.models.ImageVisualizationTrend;
import com.whoop.health.domain.models.MenstrualCycleInsightsCardModel;
import com.whoop.health.domain.models.ProgressBarDescriptionCardModel;
import com.whoop.health.domain.models.ProgressPlotDescription;
import com.whoop.health.domain.models.ScreenerStatusTileBodyModel;
import p734sl0.AbstractC32591c1;
import p734sl0.AbstractC32619i;
import p734sl0.AbstractC32650o0;
import p734sl0.AbstractC32654p;
import p734sl0.AbstractC32679u0;

/* JADX INFO: renamed from: sh2.d */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C32513d implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f134657w;

    public /* synthetic */ C32513d(int i13) {
        this.f134657w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f134657w) {
            case 0:
                return C32514e.m101520b();
            case 1:
                return CardSupplementalInfo._childSerializers$_anonymous_();
            case 2:
                return DataVisualizationCardModel._childSerializers$_anonymous_();
            case 3:
                return DataVisualizationCardModel._childSerializers$_anonymous_$0();
            case 4:
                return EntryPointLockedCardModel._childSerializers$_anonymous_();
            case 5:
                return HealthTabResponse._childSerializers$_anonymous_();
            case 6:
                return HealthTabSectionModel._childSerializers$_anonymous_();
            case 7:
                return HealthspanHeroMetricModel._childSerializers$_anonymous_();
            case 8:
                return HorizontalRecordsTileModel._childSerializers$_anonymous_();
            case 9:
                return ImageVisualizationCardBodyModel._childSerializers$_anonymous_();
            case 10:
                return ImageVisualizationTrend._childSerializers$_anonymous_();
            case 11:
                return MenstrualCycleInsightsCardModel._childSerializers$_anonymous_();
            case 12:
                return ProgressBarDescriptionCardModel._childSerializers$_anonymous_();
            case 13:
                return ProgressPlotDescription._childSerializers$_anonymous_();
            case 14:
                return ScreenerStatusTileBodyModel._childSerializers$_anonymous_();
            case 15:
                return AbstractC32619i.m101852x();
            case 16:
                return AbstractC32619i.m101853y();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC32619i.m101826R();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC32654p.m102107k();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC32650o0.m102053D();
            case 20:
                return AbstractC32679u0.m102359X();
            case 21:
                return AbstractC32679u0.m102387m0();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC32679u0.m102399s0();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC32679u0.m102413z0();
            case 24:
                return AbstractC32679u0.m102347L();
            case 25:
                return AbstractC32679u0.m102348M();
            case 26:
                return AbstractC32679u0.m102349N();
            case 27:
                return AbstractC32679u0.m102350O();
            case 28:
                return AbstractC32679u0.m102403u0();
            default:
                return AbstractC32591c1.m101656k();
        }
    }
}
