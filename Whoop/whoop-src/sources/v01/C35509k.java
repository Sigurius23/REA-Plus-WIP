package v01;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.navigation.C9598e;
import com.whoop.profile.view.components.ContextHubTileKt;
import com.whoop.profile.view.components.ReferralsTileKt;
import com.whoop.profile.view.components.StreaksTileKt;
import jb1.C21536b;
import kd0.InterfaceC22381a;
import p209i3.InterfaceC18044z;
import p715kotlin.jvm.functions.Function1;
import p745y81.C39336i;
import se0.AbstractC32419a;
import v11.AbstractC35551i;
import v21.AbstractC35584b;
import v31.AbstractC35610f;
import v41.AbstractC35661d0;
import v41.AbstractC35667g0;
import v41.AbstractC35672j;
import v51.AbstractC35703b;
import v60.AbstractC35735b;
import v71.AbstractC35761b;
import v71.AbstractC35767h;
import v80.AbstractC35794b;
import v81.AbstractC35798c;
import vb1.AbstractC35869b;
import ve0.AbstractC35927e;
import w71.C36901t;
import w71.C36906y;

/* JADX INFO: renamed from: v01.k */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C35509k implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f151120w;

    public /* synthetic */ C35509k(int i13) {
        this.f151120w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f151120w) {
            case 0:
                return AbstractC35510l.m112653q(obj);
            case 1:
                return AbstractC35551i.m112736q(obj);
            case 2:
                return AbstractC35584b.m112781h(obj);
            case 3:
                return AbstractC35610f.m112816m(obj);
            case 4:
                return AbstractC35672j.m112985e(obj);
            case 5:
                return AbstractC35661d0.m112932z(((Boolean) obj).booleanValue());
            case 6:
                return AbstractC35661d0.m112890F(((Float) obj).floatValue());
            case 7:
                return AbstractC35661d0.m112895K(((Float) obj).floatValue());
            case 8:
                return AbstractC35667g0.m112971m((C36906y) obj);
            case 9:
                return AbstractC35667g0.m112972n((C36901t) obj);
            case 10:
                return AbstractC35667g0.m112967i((C36906y) obj);
            case 11:
                return AbstractC35667g0.m112968j((C36901t) obj);
            case 12:
                return ContextHubTileKt.ContextHubTile$lambda$0$0(obj);
            case 13:
                return ReferralsTileKt.ReferralsTile$lambda$0$0(obj);
            case 14:
                return StreaksTileKt.StreaksTile$lambda$0$0(obj);
            case 15:
                return AbstractC35703b.m113154i(obj);
            case 16:
                return AbstractC35735b.m113198d((C21536b) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC35761b.m113304e((C9598e) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC35767h.m113350r((C9598e) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC35767h.m113351s(obj);
            case 20:
                return AbstractC35767h.m113352t(obj);
            case 21:
                return AbstractC35794b.m113468m(obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC35794b.m113470o((InterfaceC18044z) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC35798c.m113507k(obj);
            case 24:
                return AbstractC35798c.m113508l(((Integer) obj).intValue());
            case 25:
                return AbstractC35869b.m113877w((C39336i) obj);
            case 26:
                return AbstractC35927e.m114118Q((AbstractC32419a) obj);
            case 27:
                return AbstractC35927e.m114133c0(obj);
            case 28:
                return AbstractC35927e.m114107F(obj);
            default:
                return AbstractC35927e.m114119R((InterfaceC22381a.c) obj);
        }
    }
}
