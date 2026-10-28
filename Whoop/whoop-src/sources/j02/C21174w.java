package j02;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.addactivity.network.model.Activity;
import com.whoop.addactivity.network.model.RecentActivity;
import com.whoop.addactivity.network.model.ScoreType;
import com.whoop.design.models.items.graph.plane.axis.GraphAxisModel;
import com.whoop.design.models.items.graph.plane.axis.label.AxisLabelModel;
import com.whoop.design.models.items.graph.plane.line.GraphLineModel;
import com.whoop.metrics.domain.models.MetricDto;
import com.whoop.metrics.domain.models.MetricsBody;
import com.whoop.navigation.DrawerPresentation;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.navigation.SleepPlannerScreenModel;
import com.whoop.navigation.StreaksExplainerModel;
import js1.AbstractC21921l;
import kd1.AbstractC22402n;
import kd1.AbstractC22404p;
import p291l0.C22969j0;
import p323m8.AbstractC25218a;
import p390p1.C28596b0;
import p714k80.AbstractC22280i;
import p716lb1.AbstractC23630g0;
import p716lb1.AbstractC23672m1;
import p716lb1.AbstractC23678n1;
import p716lb1.AbstractC23744y1;
import p716lb1.AbstractC23752z3;
import p720m91.AbstractC25303l;

/* JADX INFO: renamed from: j02.w */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C21174w implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f80707w;

    public /* synthetic */ C21174w(int i13) {
        this.f80707w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f80707w) {
            case 0:
                return DrawerPresentation._init_$_anonymous_();
            case 1:
                return NavigationScreenModel.None._init_$_anonymous_();
            case 2:
                return SleepPlannerScreenModel._init_$_anonymous_();
            case 3:
                return StreaksExplainerModel._init_$_anonymous_();
            case 4:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 5:
                return GraphAxisModel._childSerializers$_anonymous_();
            case 6:
                return GraphAxisModel._childSerializers$_anonymous_$0();
            case 7:
                return GraphAxisModel._childSerializers$_anonymous_$1();
            case 8:
                return AbstractC21921l.m62374D();
            case 9:
                return AbstractC22280i.m64007e();
            case 10:
                return Activity._childSerializers$_anonymous_();
            case 11:
                return RecentActivity._childSerializers$_anonymous_();
            case 12:
                return ScoreType._init_$_anonymous_();
            case 13:
                return AxisLabelModel._childSerializers$_anonymous_();
            case 14:
                return AxisLabelModel._childSerializers$_anonymous_$0();
            case 15:
                return AbstractC22402n.m64485b();
            case 16:
                return Boolean.valueOf(AbstractC22404p.m64495d());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C22969j0(0);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC23630g0.m68774f();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC23672m1.m69074f();
            case 20:
                return AbstractC23678n1.m69133f();
            case 21:
                return AbstractC23744y1.m69700h();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC23752z3.m69796h();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return MetricDto._childSerializers$_anonymous_();
            case 24:
                return MetricsBody._childSerializers$_anonymous_();
            case 25:
                return Long.valueOf(System.currentTimeMillis());
            case 26:
                C28596b0 c28596b0 = AbstractC25218a.f99032a;
                return null;
            case 27:
                return AbstractC25303l.m74270A();
            case 28:
                return GraphLineModel._childSerializers$_anonymous_();
            default:
                return GraphLineModel._childSerializers$_anonymous_$0();
        }
    }
}
