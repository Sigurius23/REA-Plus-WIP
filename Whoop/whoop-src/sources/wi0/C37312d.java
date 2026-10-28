package wi0;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.health.monitor.medical.domain.model.HeartHealthBffModel;
import com.whoop.health.monitor.medical.domain.model.LabradorEnabledCardModel;
import com.whoop.health.monitor.medical.domain.model.LabradorResultModel;
import com.whoop.health.monitor.medical.domain.model.SamdCardHeaderModel;
import com.whoop.health.monitor.medical.domain.model.ShepherdDetectionModel;
import com.whoop.health.monitor.medical.domain.model.ShepherdMenuItemModel;
import com.whoop.health.monitor.medical.domain.model.ShepherdReadingModel;
import com.whoop.trends.data.model.AddManualMeasurementButton;
import com.whoop.trends.data.model.BreakDownBarDtoV3;
import com.whoop.trends.data.model.CardioFitnessLevelModel;
import com.whoop.trends.data.model.IntegrationsUpsellButtonDtoV3;
import com.whoop.trends.data.model.LegendItemDtoV3;
import com.whoop.trends.data.model.ManualMeasurementModelV2;
import com.whoop.trends.data.model.MeasurementContent;
import com.whoop.trends.data.model.MeasurementSection;
import com.whoop.trends.data.model.MeasurementSections;
import com.whoop.trends.data.model.MetaData;
import com.whoop.trends.data.model.MeterModel;
import com.whoop.trends.data.model.MetricsTrendKey;
import com.whoop.trends.data.model.NavigationItemV3;
import com.whoop.trends.data.model.NavigationSectionV3;
import com.whoop.trends.data.model.Record;

/* JADX INFO: renamed from: wi0.d */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C37312d implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f159532w;

    public /* synthetic */ C37312d(int i13) {
        this.f159532w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f159532w) {
            case 0:
                return AbstractC37313e.m119493C();
            case 1:
                return AbstractC37313e.m119494D();
            case 2:
                return AbstractC37313e.m119525u();
            case 3:
                return HeartHealthBffModel._childSerializers$_anonymous_();
            case 4:
                return LabradorEnabledCardModel._childSerializers$_anonymous_();
            case 5:
                return LabradorResultModel._childSerializers$_anonymous_();
            case 6:
                return LabradorResultModel._childSerializers$_anonymous_$0();
            case 7:
                return LabradorResultModel._childSerializers$_anonymous_$1();
            case 8:
                return LabradorResultModel._childSerializers$_anonymous_$2();
            case 9:
                return SamdCardHeaderModel._childSerializers$_anonymous_();
            case 10:
                return ShepherdDetectionModel._childSerializers$_anonymous_();
            case 11:
                return ShepherdMenuItemModel._childSerializers$_anonymous_();
            case 12:
                return ShepherdReadingModel._childSerializers$_anonymous_();
            case 13:
                return ShepherdReadingModel._childSerializers$_anonymous_$0();
            case 14:
                return AddManualMeasurementButton._childSerializers$_anonymous_();
            case 15:
                return BreakDownBarDtoV3._childSerializers$_anonymous_();
            case 16:
                return BreakDownBarDtoV3._childSerializers$_anonymous_$0();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return CardioFitnessLevelModel._childSerializers$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return IntegrationsUpsellButtonDtoV3._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return LegendItemDtoV3._childSerializers$_anonymous_();
            case 20:
                return ManualMeasurementModelV2._childSerializers$_anonymous_();
            case 21:
                return MeasurementContent._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return MeasurementSection._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return MeasurementSections._childSerializers$_anonymous_();
            case 24:
                return MetaData._childSerializers$_anonymous_();
            case 25:
                return MeterModel._childSerializers$_anonymous_();
            case 26:
                return MetricsTrendKey._init_$_anonymous_();
            case 27:
                return NavigationItemV3._childSerializers$_anonymous_();
            case 28:
                return NavigationSectionV3._childSerializers$_anonymous_();
            default:
                return Record._childSerializers$_anonymous_();
        }
    }
}
