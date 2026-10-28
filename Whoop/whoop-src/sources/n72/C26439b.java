package n72;

import androidx.compose.p018ui.Modifier;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.models.AppointmentButtonModel;
import com.whoop.design.models.items.hrzonesrow.HrZonesRowModel;
import com.whoop.p069ui.drawer.debug.DebugFeatureFlagSettingsFragment;
import com.whoop.sage.domain.models.StudyInsightsModel;
import h80.InterfaceC17002b;
import kb0.AbstractC22319a;
import kd0.InterfaceC22381a;
import l80.AbstractC23438o;
import lo0.C24603r0;
import lo0.InterfaceC24615z;
import n80.AbstractC26447a;
import nb0.AbstractC26536a;
import nc1.AbstractC26569a;
import nh0.AbstractC26718b;
import nk1.AbstractC26795a;
import nk1.AbstractC26797c;
import nm2.C26849e;
import no0.AbstractC26933a0;
import no0.AbstractC26939c0;
import no0.AbstractC26940c1;
import no0.AbstractC26948g0;
import no0.AbstractC26950h0;
import no0.AbstractC26952i0;
import no0.AbstractC26958l0;
import no0.AbstractC26962n0;
import no0.AbstractC26965p;
import no0.AbstractC26966p0;
import no0.AbstractC26979w;
import no0.AbstractC26980w0;
import p715kotlin.jvm.functions.Function1;
import p716lb1.C23749z0;
import ry0.C31909d;

/* JADX INFO: renamed from: n72.b */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C26439b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f105019w;

    public /* synthetic */ C26439b(int i13) {
        this.f105019w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f105019w) {
            case 0:
                return AbstractC26440c.m78274i((StudyInsightsModel) obj);
            case 1:
                return AbstractC26447a.m78307h((AbstractC23438o) obj);
            case 2:
                return AbstractC26447a.m78308i((InterfaceC4339a) obj);
            case 3:
                return AbstractC26447a.m78309j((InterfaceC17002b) obj);
            case 4:
                return AbstractC26536a.m78624o((InterfaceC22381a.c) obj);
            case 5:
                return AbstractC26536a.m78625p((AbstractC22319a) obj);
            case 6:
                return AbstractC26536a.m78619j((AbstractC22319a) obj);
            case 7:
                return AbstractC26569a.m78725d((C23749z0) obj);
            case 8:
                return AbstractC26569a.m78726e((HrZonesRowModel) obj);
            case 9:
                return AbstractC26718b.m79433h(obj);
            case 10:
                return AbstractC26797c.m79855l((AbstractC26795a) obj);
            case 11:
                return DebugFeatureFlagSettingsFragment.m26859U((C26849e) obj);
            case 12:
                return AbstractC26965p.m80742o((Modifier) obj);
            case 13:
                return AbstractC26979w.m80888y((AnalyticEventModel) obj);
            case 14:
                return AbstractC26979w.m80857Y((C24603r0) obj);
            case 15:
                return AbstractC26933a0.m80405j((InterfaceC24615z) obj);
            case 16:
                return AbstractC26939c0.m80453l((InterfaceC24615z) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC26948g0.m80492o((InterfaceC24615z) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return Integer.valueOf(AbstractC26948g0.m80502y(((Integer) obj).intValue()));
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return Integer.valueOf(AbstractC26948g0.m80503z(((Integer) obj).intValue()));
            case 20:
                return Integer.valueOf(AbstractC26948g0.m80476B(((Integer) obj).intValue()));
            case 21:
                return Integer.valueOf(AbstractC26948g0.m80477C(((Integer) obj).intValue()));
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC26950h0.m80515l((InterfaceC24615z) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC26952i0.m80557j((InterfaceC24615z) obj);
            case 24:
                return AbstractC26958l0.m80594G0((C31909d) obj);
            case 25:
                return AbstractC26958l0.m80599J((InterfaceC24615z) obj);
            case 26:
                return AbstractC26962n0.m80711m((InterfaceC24615z) obj);
            case 27:
                return AbstractC26966p0.m80755l((InterfaceC24615z) obj);
            case 28:
                return AbstractC26980w0.m80900f((AppointmentButtonModel) obj);
            default:
                return AbstractC26940c1.m80462e(obj);
        }
    }
}
