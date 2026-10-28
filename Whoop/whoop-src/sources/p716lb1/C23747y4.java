package p716lb1;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.models.items.ActivityModel;
import com.whoop.design.models.items.ContributorTileModel;
import com.whoop.design.models.items.GlassTileModel;
import com.whoop.design.models.items.HeaderItemsCardModel;
import com.whoop.design.models.items.HealthMonitorCardModel;
import com.whoop.design.models.items.HealthMonitorModel;
import com.whoop.design.models.items.HeartRateZone;
import com.whoop.design.models.items.HorizontalMetricTileModel;
import com.whoop.design.models.items.ItemsCardModel;
import com.whoop.design.models.items.KeyStatisticModel;
import com.whoop.design.models.items.ListItemTileModel;
import com.whoop.design.models.items.MenuItemModel;
import com.whoop.design.models.items.MetricStatusTileModel;
import com.whoop.design.models.items.MiniMonitorCardModel;
import com.whoop.design.models.items.PlanTileModel;
import com.whoop.design.models.items.ProfileInfoTileListModel;
import com.whoop.design.models.items.ProfileInfoTileModel;
import com.whoop.design.models.items.SleepPlannerAlarmCardModel;
import com.whoop.design.models.items.SleepPlannerCardModel;
import com.whoop.design.models.items.SplitContainerCardModel;
import com.whoop.design.models.items.StatusTileModel;
import com.whoop.design.models.items.StepperComponentModel;
import com.whoop.design.models.items.SupportActionTileModel;
import com.whoop.design.models.items.TitleTileModel;
import com.whoop.design.models.items.UnlockedImpactOnRecoveryModel;
import com.whoop.design.models.items.VowCtaModel;
import com.whoop.design.models.items.VowModel;
import com.whoop.design.models.items.WhoopCoachVowModel;
import jb1.C21536b;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lb1.y4 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C23747y4 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f94078w;

    public /* synthetic */ C23747y4(int i13) {
        this.f94078w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f94078w) {
            case 0:
                return AbstractC23593a5.m68360e1((UnlockedImpactOnRecoveryModel) obj);
            case 1:
                return AbstractC23593a5.m68366g1((ListItemTileModel) obj);
            case 2:
                return AbstractC23593a5.m68369h1((TitleTileModel) obj);
            case 3:
                return AbstractC23593a5.m68372i1((HeaderItemsCardModel) obj);
            case 4:
                return AbstractC23593a5.m68375j1((ItemsCardModel) obj);
            case 5:
                return AbstractC23593a5.m68301F0((HealthMonitorCardModel) obj);
            case 6:
                return AbstractC23593a5.m68378k1((PlanTileModel) obj);
            case 7:
                return AbstractC23593a5.m68381l1((HeartRateZone) obj);
            case 8:
                return AbstractC23593a5.m68384m1((ProfileInfoTileModel) obj);
            case 9:
                return AbstractC23593a5.m68390o1((ProfileInfoTileListModel) obj);
            case 10:
                return AbstractC23593a5.m68354c1((GlassTileModel) obj);
            case 11:
                return AbstractC23593a5.m68399r1((SplitContainerCardModel) obj);
            case 12:
                return AbstractC23593a5.m68405t1((MiniMonitorCardModel) obj);
            case 13:
                return AbstractC23593a5.m68408u1((MenuItemModel) obj);
            case 14:
                return AbstractC23593a5.m68411v1((ContributorTileModel) obj);
            case 15:
                return AbstractC23593a5.m68417x1((StepperComponentModel) obj);
            case 16:
                return AbstractC23593a5.m68304G0((HealthMonitorModel) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC23593a5.m68396q1((VowModel) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC23593a5.m68420y1((SleepPlannerCardModel) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC23593a5.m68423z1((SleepPlannerAlarmCardModel) obj);
            case 20:
                return AbstractC23593a5.m68287A1((VowCtaModel) obj);
            case 21:
                return AbstractC23593a5.m68290B1((WhoopCoachVowModel) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC23593a5.m68293C1((ActivityModel) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC23593a5.m68387n1((C21536b) obj);
            case 24:
                return AbstractC23593a5.m68393p1((C21536b) obj);
            case 25:
                return AbstractC23593a5.m68307H0((HorizontalMetricTileModel) obj);
            case 26:
                return AbstractC23593a5.m68310I0((SupportActionTileModel) obj);
            case 27:
                return AbstractC23593a5.m68313J0((StatusTileModel) obj);
            case 28:
                return AbstractC23593a5.m68315K0((MetricStatusTileModel) obj);
            default:
                return AbstractC23593a5.m68317L0((KeyStatisticModel) obj);
        }
    }
}
