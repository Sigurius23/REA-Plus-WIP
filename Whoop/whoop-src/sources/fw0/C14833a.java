package fw0;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.stripe.android.uicore.elements.AddressFieldConfiguration;
import com.whoop.core.details.network.model.recoveryv2.RecoveryDetailsModel;
import com.whoop.design.models.items.graph.GraphCardCtaModel;
import com.whoop.design.models.items.graph.GraphLegendTheme;
import com.whoop.widget.model.LockedContentButtonStyle;
import com.whoop.widget.model.WidgetLockedContent;
import com.whoop.widget.model.WidgetModel;
import com.whoop.widget.model.WidgetStatistic;
import com.whoop.widget.model.WidgetStressResponse;
import com.whoop.widget.model.WidgetStressState;
import com.whoop.widget.model.WidgetType;
import g00.AbstractC14936g;
import g11.AbstractC15219c;
import g32.AbstractC15311k;
import g81.AbstractC15572b;
import p163g1.AbstractC15018g5;
import p163g1.C15071l5;
import p390p1.AbstractC28683x;
import p390p1.C28674u2;
import p490t0.AbstractC33253j;

/* JADX INFO: renamed from: fw0.a */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C14833a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f55101w;

    public /* synthetic */ C14833a(int i13) {
        this.f55101w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f55101w) {
            case 0:
                return RecoveryDetailsModel._childSerializers$_anonymous_$1();
            case 1:
                return RecoveryDetailsModel._childSerializers$_anonymous_$2();
            case 2:
                return RecoveryDetailsModel._childSerializers$_anonymous_$3();
            case 3:
                return RecoveryDetailsModel._childSerializers$_anonymous_$4();
            case 4:
                return RecoveryDetailsModel._childSerializers$_anonymous_$5();
            case 5:
                C28674u2 c28674u2 = AbstractC14936g.f55704a;
                return null;
            case 6:
                throw new IllegalStateException("No Typography provided");
            case 7:
                throw new IllegalStateException("No Colors provided");
            case 8:
                throw new IllegalStateException("No Shapes provided");
            case 9:
                return LockedContentButtonStyle._init_$_anonymous_();
            case 10:
                return WidgetLockedContent._childSerializers$_anonymous_();
            case 11:
                return WidgetModel._childSerializers$_anonymous_();
            case 12:
                return WidgetStatistic._childSerializers$_anonymous_();
            case 13:
                return WidgetStressResponse._childSerializers$_anonymous_();
            case 14:
                return WidgetStressState._init_$_anonymous_();
            case 15:
                return WidgetType._init_$_anonymous_();
            case 16:
                C28674u2 c28674u3 = AbstractC15018g5.f56197a;
                return null;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                float f13 = 4;
                return new C15071l5(AbstractC33253j.m105489e(f13), AbstractC33253j.m105489e(f13), AbstractC33253j.m105489e(0));
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC15219c.m43238E();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC15311k.m43497z();
            case 20:
                return AbstractC15311k.m43455A();
            case 21:
                return AbstractC15311k.m43492u();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC15311k.m43466L();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AddressFieldConfiguration._init_$_anonymous_();
            case 24:
                return AbstractC28683x.m87272z(Boolean.FALSE);
            case 25:
                return AbstractC28683x.m87272z(Boolean.FALSE);
            case 26:
                return Boolean.valueOf(AbstractC15572b.m43860d());
            case 27:
                return GraphCardCtaModel._childSerializers$_anonymous_();
            case 28:
                return GraphLegendTheme._childSerializers$_anonymous_();
            default:
                return GraphLegendTheme._childSerializers$_anonymous_$0();
        }
    }
}
