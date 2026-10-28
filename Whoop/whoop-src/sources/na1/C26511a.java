package na1;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.design.models.items.graph.plot.BandPlotModel;
import com.whoop.design.models.items.graph.plot.BarPlotModel;
import com.whoop.design.models.items.graph.plot.CenterScrubBandPlotModel;
import com.whoop.design.models.items.graph.plot.GridLinePlotModel;
import com.whoop.design.models.items.graph.plot.IconGroupModel;
import com.whoop.design.models.items.graph.plot.IconPlotModel;
import com.whoop.design.models.items.graph.plot.MarkerTheme;
import com.whoop.design.models.items.graph.plot.ProgressPlotModel;
import com.whoop.design.models.items.graph.plot.TrendPlotModel;
import com.whoop.design.models.items.graph.plot.VerticalMarkerPlotModel;
import com.whoop.design.models.items.graph.plot.XLabelPlotModel;
import com.whoop.design.models.items.graph.plot.XPlotZoomBucketsModel;
import com.whoop.firmwareUpdateService.data.models.DesiredDeviceFirmwareConfig;
import com.whoop.firmwareUpdateService.data.models.DownloadFwFilePayload;
import com.whoop.firmwareUpdateService.data.models.ReportFwUpdateResultPayload;
import com.whoop.trackactivity.domain.models.LiveActivityHrzTargetSection;
import com.whoop.trackactivity.domain.models.TrackSessionMiniArchModel;
import nd1.C26575a;
import nd1.C26583i;
import nf0.C26659b;
import nh0.AbstractC26718b;
import no0.AbstractC26958l0;

/* JADX INFO: renamed from: na1.a */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C26511a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f105417w;

    public /* synthetic */ C26511a(int i13) {
        this.f105417w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f105417w) {
            case 0:
                return BandPlotModel._childSerializers$_anonymous_();
            case 1:
                return BandPlotModel._childSerializers$_anonymous_$0();
            case 2:
                return BarPlotModel._childSerializers$_anonymous_();
            case 3:
                return CenterScrubBandPlotModel._childSerializers$_anonymous_();
            case 4:
                return CenterScrubBandPlotModel._childSerializers$_anonymous_$0();
            case 5:
                return GridLinePlotModel._childSerializers$_anonymous_();
            case 6:
                return GridLinePlotModel._childSerializers$_anonymous_$0();
            case 7:
                return IconGroupModel._childSerializers$_anonymous_();
            case 8:
                return IconPlotModel._childSerializers$_anonymous_();
            case 9:
                return MarkerTheme._childSerializers$_anonymous_();
            case 10:
                return ProgressPlotModel._childSerializers$_anonymous_();
            case 11:
                return TrendPlotModel._childSerializers$_anonymous_();
            case 12:
                return TrendPlotModel._childSerializers$_anonymous_$0();
            case 13:
                return VerticalMarkerPlotModel._childSerializers$_anonymous_();
            case 14:
                return XLabelPlotModel._childSerializers$_anonymous_();
            case 15:
                return XPlotZoomBucketsModel._childSerializers$_anonymous_();
            case 16:
                return C26575a.m78749A();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C26583i.m78972d1();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C26659b.m79325a0();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C26659b.m79309L();
            case 20:
                return C26659b.m79303F();
            case 21:
                return DesiredDeviceFirmwareConfig._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return DownloadFwFilePayload._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return DownloadFwFilePayload._childSerializers$_anonymous_$0();
            case 24:
                return ReportFwUpdateResultPayload._childSerializers$_anonymous_();
            case 25:
                return AbstractC26718b.m79434i();
            case 26:
                return LiveActivityHrzTargetSection._childSerializers$_anonymous_();
            case 27:
                return TrackSessionMiniArchModel._childSerializers$_anonymous_();
            case 28:
                return TrackSessionMiniArchModel._childSerializers$_anonymous_$0();
            default:
                return AbstractC26958l0.m80662o0();
        }
    }
}
