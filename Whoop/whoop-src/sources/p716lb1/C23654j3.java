package p716lb1;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.models.ProgressButtonModel;
import com.whoop.design.models.ProgressMeterModel;
import com.whoop.design.models.cards.ActionCardModel;
import com.whoop.design.models.cards.ProductTestCardModel;
import com.whoop.design.models.cards.TextAndImageCardModel;
import com.whoop.design.models.cards.TextOnlyCardModel;
import com.whoop.design.models.cards.TextWithDesignItemCardModel;
import com.whoop.design.models.cards.TextWithIllustrationCardModel;
import com.whoop.design.models.items.EntryPointModel;
import com.whoop.design.models.items.GoalProgressCardModel;
import com.whoop.design.models.items.LabeledProgressBarModel;
import com.whoop.design.models.items.OptionCommitPanelModel;
import com.whoop.design.models.items.OptionInfoModel;
import com.whoop.design.models.items.PaceOfAgingMeterModel;
import com.whoop.design.models.items.PieChartModel;
import com.whoop.design.models.items.ProgressBreakdownModel;
import com.whoop.design.models.items.ProgressMetricRowModel;
import com.whoop.design.models.items.nestedbff.NestedBFFItemModel;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lb1.j3 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C23654j3 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f93818w;

    public /* synthetic */ C23654j3(int i13) {
        this.f93818w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f93818w) {
            case 0:
                return AbstractC23661k3.m68988d((C23749z0) obj);
            case 1:
                return AbstractC23661k3.m68989e((NestedBFFItemModel) obj);
            case 2:
                return AbstractC23668l3.m69041l((C23749z0) obj);
            case 3:
                return AbstractC23668l3.m69042m((TextWithIllustrationCardModel) obj);
            case 4:
                return AbstractC23668l3.m69043n((TextWithDesignItemCardModel) obj);
            case 5:
                return AbstractC23668l3.m69045p((TextOnlyCardModel) obj);
            case 6:
                return AbstractC23668l3.m69046q((TextAndImageCardModel) obj);
            case 7:
                return AbstractC23668l3.m69047r((ActionCardModel) obj);
            case 8:
                return AbstractC23668l3.m69048s((EntryPointModel) obj);
            case 9:
                return AbstractC23680n3.m69156e((C23749z0) obj);
            case 10:
                return AbstractC23680n3.m69157f((OptionCommitPanelModel) obj);
            case 11:
                return AbstractC23686o3.m69195e((C23749z0) obj);
            case 12:
                return AbstractC23686o3.m69196f((OptionInfoModel) obj);
            case 13:
                return AbstractC23692p3.m69236e((C23749z0) obj);
            case 14:
                return AbstractC23692p3.m69237f((PaceOfAgingMeterModel) obj);
            case 15:
                return AbstractC23698q3.m69307d((C23749z0) obj);
            case 16:
                return AbstractC23698q3.m69308e((PieChartModel) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC23704r3.m69353d((C23749z0) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC23704r3.m69354e((ProductTestCardModel) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC23716t3.m69426d((C23749z0) obj);
            case 20:
                return AbstractC23716t3.m69427e((ProgressButtonModel) obj);
            case 21:
                return AbstractC23722u3.m69537g((C23749z0) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC23722u3.m69538h((LabeledProgressBarModel) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC23722u3.m69539i((ProgressBreakdownModel) obj);
            case 24:
                return AbstractC23722u3.m69540j((GoalProgressCardModel) obj);
            case 25:
                return AbstractC23728v3.m69590f((C23749z0) obj);
            case 26:
                return AbstractC23728v3.m69591g((ProgressMeterModel) obj);
            case 27:
                return AbstractC23734w3.m69622e((C23749z0) obj);
            case 28:
                return AbstractC23734w3.m69623f((ProgressMetricRowModel) obj);
            default:
                return AbstractC23746y3.m69715d((C23749z0) obj);
        }
    }
}
