package p716lb1;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.models.items.BarGraphContainerModel;
import com.whoop.design.models.items.HeaderModel;
import com.whoop.design.models.items.TimedContentModel;
import com.whoop.design.models.items.TimerMetaDataModel;
import com.whoop.design.models.items.ToggleDesignModel;
import com.whoop.design.models.items.TrendBarModel;
import com.whoop.design.models.items.UnlockTrendsCardModel;
import com.whoop.design.models.items.UpsellCardCalloutModel;
import com.whoop.design.models.items.VerticalSpacerModel;
import com.whoop.design.models.items.ZoneBarModel;
import com.whoop.design.models.items.activityrecommendation.ActivityRecommendationTileModel;
import com.whoop.design.models.items.graph.ZoomableGraphModel;
import com.whoop.design.models.items.heightweight.HeightWeightModel;
import com.whoop.design.models.tiles.OfferBannerModel;
import lc1.AbstractC23829a;
import mb1.AbstractC25382a;
import mc1.AbstractC25418c;
import p715kotlin.jvm.functions.Function1;
import p720m91.AbstractC25303l;
import p720m91.C25308q;

/* JADX INFO: renamed from: lb1.z4 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C23753z4 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f94101w;

    public /* synthetic */ C23753z4(int i13) {
        this.f94101w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f94101w) {
            case 0:
                return AbstractC23593a5.m68319M0((HeaderModel) obj);
            case 1:
                return AbstractC23600b5.m68551e((C23749z0) obj);
            case 2:
                return AbstractC23600b5.m68552f((TimedContentModel) obj);
            case 3:
                return AbstractC23607c5.m68606e((C23749z0) obj);
            case 4:
                return AbstractC23607c5.m68607f((TimerMetaDataModel) obj);
            case 5:
                return AbstractC23607c5.m68608g((OfferBannerModel) obj);
            case 6:
                return AbstractC23614d5.m68676d((C23749z0) obj);
            case 7:
                return AbstractC23614d5.m68677e((ToggleDesignModel) obj);
            case 8:
                return AbstractC23621e5.m68723f((C23749z0) obj);
            case 9:
                return AbstractC23621e5.m68724g((TrendBarModel) obj);
            case 10:
                return AbstractC23635g5.m68812d((C23749z0) obj);
            case 11:
                return AbstractC23635g5.m68813e((UnlockTrendsCardModel) obj);
            case 12:
                return AbstractC23642h5.m68853e((C23749z0) obj);
            case 13:
                return AbstractC23642h5.m68854f((UpsellCardCalloutModel) obj);
            case 14:
                return AbstractC23649i5.m68892e((C23749z0) obj);
            case 15:
                return AbstractC23649i5.m68893f((VerticalSpacerModel) obj);
            case 16:
                return AbstractC23656j5.m68935e((C23749z0) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC23656j5.m68936f((ZoneBarModel) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC23663k5.m68997f((C23749z0) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC23663k5.m68998g((ZoomableGraphModel) obj);
            case 20:
                return AbstractC23829a.m70021d((C23749z0) obj);
            case 21:
                return AbstractC23829a.m70022e((HeightWeightModel) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC25303l.m74293t(obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return p720m91.Function1.m74305f((C25308q) obj);
            case 24:
                return p720m91.Function1.m74313n((C25308q) obj);
            case 25:
                return p720m91.Function1.m74310k((C25308q) obj);
            case 26:
                return AbstractC25382a.m74427d((C23749z0) obj);
            case 27:
                return AbstractC25382a.m74428e((ActivityRecommendationTileModel) obj);
            case 28:
                return AbstractC25418c.m74614g((C23749z0) obj);
            default:
                return AbstractC25418c.m74615h((BarGraphContainerModel) obj);
        }
    }
}
