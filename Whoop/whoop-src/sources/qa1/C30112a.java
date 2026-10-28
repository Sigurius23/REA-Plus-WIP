package qa1;

import aa3.C0656u0;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.advancedlabsjoin.feature.join.domain.models.AdvanceLabsJoinStickyModel;
import com.whoop.advancedlabsjoin.feature.join.domain.models.AdvancedLabsJoinModels;
import com.whoop.advancedlabsjoin.feature.join.domain.models.AdvancedLabsJoinSectionModel;
import com.whoop.design.models.items.graph.plot.line.LinePlotTheme;
import com.whoop.design.models.items.graph.plot.line.LinePointTheme;
import com.whoop.startactivity.presession.domain.model.PreSessionRecentActivitiesRowModel;
import com.whoop.startactivity.presession.domain.model.PreSessionWidgetModel;
import p097ds.AbstractC12313p;
import p715kotlin.jvm.functions.Function1;
import q80.C30034f;
import qc3.C30223a0;
import qc3.C30226b0;
import qc3.C30232d0;
import qc3.C30235e0;
import qc3.C30241g0;
import qc3.C30251j1;
import qc3.C30254k1;
import qc3.C30268r;
import qc3.C30280x;
import qc3.C30282y;
import qc3.C30283y0;
import qc3.C30285z0;
import qc3.EnumC30263o0;
import qc3.InterfaceC30255l;
import qc3.InterfaceC30260n;
import qf1.AbstractC30320a;
import qm1.AbstractC30483e;
import sc3.C32389c;

/* JADX INFO: renamed from: qa1.a */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C30112a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f122943w;

    public /* synthetic */ C30112a(int i13) {
        this.f122943w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f122943w) {
            case 0:
                return LinePlotTheme._childSerializers$_anonymous_();
            case 1:
                return LinePlotTheme._childSerializers$_anonymous_$0();
            case 2:
                return LinePlotTheme._childSerializers$_anonymous_$1();
            case 3:
                return LinePlotTheme._childSerializers$_anonymous_$2();
            case 4:
                return LinePlotTheme._childSerializers$_anonymous_$3();
            case 5:
                return LinePointTheme._childSerializers$_anonymous_();
            case 6:
                return LinePointTheme._childSerializers$_anonymous_$0();
            case 7:
                return LinePointTheme._childSerializers$_anonymous_$1();
            case 8:
                return LinePointTheme._childSerializers$_anonymous_$2();
            case 9:
                C30280x c30280x = new C30280x(new C0656u0(7));
                InterfaceC30260n.m92520h(c30280x);
                AbstractC12313p.m34304v(c30280x, '-');
                InterfaceC30260n.m92519g(c30280x);
                AbstractC12313p.m34304v(c30280x, '-');
                InterfaceC30255l.m92517e(c30280x);
                return new C30282y(c30280x.build());
            case 10:
                C30280x c30280x2 = new C30280x(new C0656u0(7));
                InterfaceC30260n.m92520h(c30280x2);
                InterfaceC30260n.m92519g(c30280x2);
                InterfaceC30255l.m92517e(c30280x2);
                return new C30282y(c30280x2.build());
            case 11:
                C30034f c30034f = new C30034f(15);
                C30223a0 c30223a0 = new C30223a0(new C0656u0(7));
                c30034f.invoke(c30223a0);
                return new C30226b0(c30223a0.build());
            case 12:
                C0656u0 c0656u0 = new C0656u0(7);
                C30232d0 c30232d0 = new C30232d0(c0656u0);
                EnumC30263o0 enumC30263o0 = EnumC30263o0.f123804w;
                c0656u0.m1637f(new C32389c(new C30268r(enumC30263o0)));
                AbstractC12313p.m34304v(c30232d0, ':');
                c0656u0.m1637f(new C32389c(new C30241g0(enumC30263o0)));
                AbstractC12313p.m34299q(c30232d0, new Function1[]{new C30034f(18)}, new C30034f(19));
                return new C30235e0(c30232d0.build());
            case 13:
                C30283y0 c30283y0 = new C30283y0(new C0656u0(7));
                AbstractC12313p.m34299q(c30283y0, new Function1[]{new C30034f(23)}, new C30034f(24));
                return new C30285z0(c30283y0.build());
            case 14:
                C30283y0 c30283y1 = new C30283y0(new C0656u0(7));
                AbstractC12313p.m34299q(c30283y1, new Function1[]{new C30034f(25)}, new C30034f(26));
                return new C30285z0(c30283y1.build());
            case 15:
                C30283y0 c30283y2 = new C30283y0(new C0656u0(7));
                C30283y0.m92538j(c30283y2);
                C30283y0.m92539k(c30283y2);
                return new C30285z0(c30283y2.build());
            case 16:
                C30251j1 c30251j1 = new C30251j1(new C0656u0(7));
                InterfaceC30260n.m92520h(c30251j1);
                AbstractC12313p.m34304v(c30251j1, '-');
                InterfaceC30260n.m92519g(c30251j1);
                return new C30254k1(c30251j1.build());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AdvanceLabsJoinStickyModel._childSerializers$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AdvancedLabsJoinModels._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AdvancedLabsJoinModels._childSerializers$_anonymous_$0();
            case 20:
                return AdvancedLabsJoinModels._childSerializers$_anonymous_$1();
            case 21:
                return AdvancedLabsJoinSectionModel._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC30320a.m92664b();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return PreSessionRecentActivitiesRowModel._childSerializers$_anonymous_();
            case 24:
                return PreSessionWidgetModel._childSerializers$_anonymous_();
            case 25:
                return PreSessionWidgetModel._childSerializers$_anonymous_$0();
            case 26:
                return PreSessionWidgetModel._childSerializers$_anonymous_$1();
            case 27:
                return PreSessionWidgetModel._childSerializers$_anonymous_$2();
            case 28:
                return AbstractC30483e.m93335r();
            default:
                return AbstractC30483e.m93339v();
        }
    }
}
