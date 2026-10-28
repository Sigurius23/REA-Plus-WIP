package p716lb1;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.models.cards.FertilityCardModel;
import com.whoop.design.models.cards.FertilityStatusItemModel;
import com.whoop.design.models.items.ArchMiniFilteredListModel;
import com.whoop.design.models.items.DividerModel;
import com.whoop.design.models.items.EndpointButtonModel;
import com.whoop.design.models.items.ExerciseBreakdownModel;
import com.whoop.design.models.items.ExerciseRecordHeaderModel;
import com.whoop.design.models.items.ExpandableCardModel;
import com.whoop.design.models.items.ExpandableContentModel;
import com.whoop.design.models.items.ExplainerGaugeModel;
import com.whoop.design.models.items.FabMenuModel;
import com.whoop.design.models.items.FileViewerModel;
import com.whoop.design.models.items.OverviewGaugeModel;
import com.whoop.design.models.items.RecoveryGaugeModel;
import com.whoop.design.models.items.ScoreGaugeModel;
import com.whoop.design.models.items.StrainGaugeModel;
import com.whoop.design.models.items.expandablestatisticlist.ExpandableStatisticListModel;
import com.whoop.design.models.tiles.EmptyTileModel;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lb1.e1 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C23617e1 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f93733w;

    public /* synthetic */ C23617e1(int i13) {
        this.f93733w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f93733w) {
            case 0:
                return AbstractC23624f1.m68741d((DividerModel) obj);
            case 1:
                return AbstractC23645i1.m68865d((C23749z0) obj);
            case 2:
                return AbstractC23645i1.m68866e((EmptyTileModel) obj);
            case 3:
                return AbstractC23652j1.m68915c((C23749z0) obj);
            case 4:
                return AbstractC23652j1.m68916d((EndpointButtonModel) obj);
            case 5:
                return AbstractC23659k1.m68968c((C23749z0) obj);
            case 6:
                return AbstractC23659k1.m68969d((ExerciseBreakdownModel) obj);
            case 7:
                return AbstractC23666l1.m69018c((C23749z0) obj);
            case 8:
                return AbstractC23666l1.m69019d((ExerciseRecordHeaderModel) obj);
            case 9:
                return AbstractC23672m1.m69072d((C23749z0) obj);
            case 10:
                return AbstractC23672m1.m69073e((ExpandableCardModel) obj);
            case 11:
                return AbstractC23678n1.m69131d((C23749z0) obj);
            case 12:
                return AbstractC23678n1.m69132e((ExpandableContentModel) obj);
            case 13:
                return AbstractC23684o1.m69177d((C23749z0) obj);
            case 14:
                return AbstractC23684o1.m69178e((ExpandableStatisticListModel) obj);
            case 15:
                return AbstractC23690p1.m69221c((C23749z0) obj);
            case 16:
                return AbstractC23690p1.m69222d((FabMenuModel) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC23696q1.m69274g((C23749z0) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC23696q1.m69275h((FertilityCardModel) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC23696q1.m69276i((FertilityStatusItemModel) obj);
            case 20:
                return AbstractC23702r1.m69338c((C23749z0) obj);
            case 21:
                return AbstractC23702r1.m69339d((FileViewerModel) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC23708s1.m69379c((C23749z0) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC23708s1.m69380d((ArchMiniFilteredListModel) obj);
            case 24:
                return AbstractC23720u1.m69469i((C23749z0) obj);
            case 25:
                return AbstractC23720u1.m69470j((OverviewGaugeModel) obj);
            case 26:
                return AbstractC23720u1.m69471k((RecoveryGaugeModel) obj);
            case 27:
                return AbstractC23720u1.m69472l((StrainGaugeModel) obj);
            case 28:
                return AbstractC23720u1.m69473m((ExplainerGaugeModel) obj);
            default:
                return AbstractC23720u1.m69474n((ScoreGaugeModel) obj);
        }
    }
}
