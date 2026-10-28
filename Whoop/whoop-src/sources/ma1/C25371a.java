package ma1;

import androidx.health.platform.client.proto.C1533u;
import be.C3154g;
import c93.InterfaceC4339a;
import com.whoop.cache.api.prefetch.PrefetchEntry;
import com.whoop.cache.api.prefetch.PrefetchList;
import com.whoop.design.models.items.graph.plane.line.GraphLineModel;
import com.whoop.design.models.items.graph.plot.GraphPlotLabelModel;
import com.whoop.design.models.items.graph.plot.LinePlotModel;
import com.whoop.design.models.items.graph.plot.OverlayPlotModel;
import com.whoop.design.models.items.graph.plot.UnknownPlotModel;
import com.whoop.design.models.items.graph.plot.line.LineDataPointModel;
import com.whoop.design.models.items.graph.plot.line.LineSegmentModel;
import com.whoop.design.models.items.graph.plot.overlay.OverlayBar;
import com.whoop.design.models.items.graph.plot.overlay.OverlayGroupModel;
import com.whoop.design.models.items.graph.plot.overlay.OverlayLabel;
import com.whoop.homenotificationscenter.domain.models.HomeNotificationsCenterResponse;
import com.whoop.service.rearchitect.C10015c;
import com.whoop.util.TrendKey;
import md0.AbstractC25448c;
import nd1.C26583i;
import ny0.AbstractC27282u;
import or2.C28169i0;
import p390p1.AbstractC28659r;
import p715kotlin.KotlinNothingValueException;
import pc1.AbstractC29069c;
import pl0.AbstractC29345c;
import q82.C30053a;
import qc1.AbstractC30218b;

/* JADX INFO: renamed from: ma1.a */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C25371a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f99453w;

    public /* synthetic */ C25371a(int i13) {
        this.f99453w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f99453w) {
            case 0:
                return GraphLineModel._childSerializers$_anonymous_$1();
            case 1:
                return AbstractC25448c.m74752u0();
            case 2:
                return new C3154g();
            case 3:
                return GraphPlotLabelModel._childSerializers$_anonymous_();
            case 4:
                return LinePlotModel._childSerializers$_anonymous_();
            case 5:
                return LinePlotModel._childSerializers$_anonymous_$0();
            case 6:
                return OverlayPlotModel._childSerializers$_anonymous_();
            case 7:
                return UnknownPlotModel._init_$_anonymous_();
            case 8:
                return C26583i.m78960a1();
            case 9:
                return AbstractC27282u.m82296l();
            case 10:
                return PrefetchEntry._childSerializers$_anonymous_();
            case 11:
                return PrefetchList._childSerializers$_anonymous_();
            case 12:
                return C28169i0.m85277h();
            case 13:
                return TrendKey._init_$_anonymous_();
            case 14:
                AbstractC28659r.m87193d("Unexpected call to default provider");
                throw new KotlinNothingValueException();
            case 15:
                return AbstractC29069c.m88372h();
            case 16:
                return AbstractC29345c.m89392x();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C30053a.m92079h();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C10015c.c.m24765h();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return LineDataPointModel._childSerializers$_anonymous_();
            case 20:
                return LineSegmentModel._childSerializers$_anonymous_();
            case 21:
                return LineSegmentModel._childSerializers$_anonymous_$0();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC30218b.m92477h();
            case 24:
                return OverlayBar._childSerializers$_anonymous_();
            case 25:
                return OverlayGroupModel._childSerializers$_anonymous_();
            case 26:
                return OverlayLabel._childSerializers$_anonymous_();
            case 27:
                return OverlayLabel._childSerializers$_anonymous_$0();
            case 28:
                return OverlayLabel._childSerializers$_anonymous_$1();
            default:
                return HomeNotificationsCenterResponse._childSerializers$_anonymous_();
        }
    }
}
