package yb1;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.health.monitor.medical.domain.model.HeartHealthProfileIneligibleModel;
import com.whoop.health.monitor.medical.domain.model.HeartScreenerIntroModel;
import com.whoop.health.monitor.medical.domain.model.HorizontalDividerModel;
import com.whoop.health.monitor.medical.domain.model.LabradorEnabledCardModel;
import com.whoop.health.monitor.medical.domain.model.LabradorResultModel;
import com.whoop.health.monitor.medical.domain.model.NewFeatureTagModel;
import com.whoop.health.monitor.medical.domain.model.OnboardingCardModel;
import com.whoop.health.monitor.medical.domain.model.ShepherdDetectionModel;
import com.whoop.health.monitor.medical.domain.model.ShepherdMenuItemModel;
import com.whoop.health.monitor.medical.domain.model.ShepherdTileModel;
import jb1.C21536b;
import p715kotlin.jvm.functions.Function1;
import p716lb1.C23749z0;
import p720m91.C25308q;
import p745y81.C39336i;
import tk2.InterfaceC33892j;
import wf1.InterfaceC37243a;
import xc2.InterfaceC38191b;
import yc2.AbstractC39436c;
import yf1.AbstractC39518g;
import yf1.AbstractC39519h;
import yi1.AbstractC39572f;
import yk1.AbstractC39600b;
import yk2.AbstractC39612l;

/* JADX INFO: renamed from: yb1.a */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C39389a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f169488w;

    public /* synthetic */ C39389a(int i13) {
        this.f169488w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f169488w) {
            case 0:
                return AbstractC39390b.m125783q((C39336i) obj);
            case 1:
                return AbstractC39390b.m125784r((C39336i) obj);
            case 2:
                return AbstractC39390b.m125785s((C39336i) obj);
            case 3:
                return AbstractC39390b.m125786t((C39336i) obj);
            case 4:
                return AbstractC39390b.m125787u((C39336i) obj);
            case 5:
                return AbstractC39436c.m125958H((InterfaceC38191b) obj);
            case 6:
                return AbstractC39436c.m125987u((InterfaceC38191b) obj);
            case 7:
                return AbstractC39436c.m125951A((InterfaceC38191b) obj);
            case 8:
                return AbstractC39518g.m126215t(obj);
            case 9:
                return AbstractC39518g.m126216u((C25308q) obj);
            case 10:
                return AbstractC39519h.m126228k((InterfaceC37243a) obj);
            case 11:
                return AbstractC39572f.m126383D((C21536b) obj);
            case 12:
                return AbstractC39572f.m126416x((ShepherdDetectionModel) obj);
            case 13:
                return AbstractC39572f.m126417y((LabradorEnabledCardModel) obj);
            case 14:
                return AbstractC39572f.m126418z((HorizontalDividerModel) obj);
            case 15:
                return AbstractC39572f.m126380A((HeartScreenerIntroModel) obj);
            case 16:
                return AbstractC39572f.m126381B((NewFeatureTagModel) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC39572f.m126382C((ShepherdMenuItemModel) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC39572f.m126391L((ShepherdTileModel) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC39572f.m126392M((ShepherdMenuItemModel) obj);
            case 20:
                return AbstractC39572f.m126389J((C21536b) obj);
            case 21:
                return AbstractC39572f.m126412t((C21536b) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC39572f.m126384E((C23749z0) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC39572f.m126390K((C23749z0) obj);
            case 24:
                return AbstractC39572f.m126385F((LabradorResultModel) obj);
            case 25:
                return AbstractC39572f.m126386G((ShepherdMenuItemModel) obj);
            case 26:
                return AbstractC39572f.m126414v((HeartHealthProfileIneligibleModel) obj);
            case 27:
                return AbstractC39572f.m126415w((OnboardingCardModel) obj);
            case 28:
                return AbstractC39600b.m126486d((C21536b) obj);
            default:
                return AbstractC39612l.m126526Y((InterfaceC33892j) obj);
        }
    }
}
