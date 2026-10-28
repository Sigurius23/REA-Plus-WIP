package p716lb1;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.models.ImpactMagnitudeTileModel;
import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.MarkdownTextModel;
import com.whoop.design.models.TitleSubTitleModel;
import com.whoop.design.models.items.AlertTileModel;
import com.whoop.design.models.items.AnnotatedTextModel;
import com.whoop.design.models.items.ArticleTileCarouselModel;
import com.whoop.design.models.items.ArticleTileModel;
import com.whoop.design.models.items.BehaviorCountTileModel;
import com.whoop.design.models.items.CollapsableHeaderModel;
import com.whoop.design.models.items.CtaTileModel;
import com.whoop.design.models.items.CurrentPlanTileModel;
import com.whoop.design.models.items.GoalSettingsTileModel;
import com.whoop.design.models.items.ImageAndIconModel;
import com.whoop.design.models.items.ImpactTileModel;
import com.whoop.design.models.items.InsufficientImpactTileModel;
import com.whoop.design.models.items.LockedImpactOnRecoveryModel;
import com.whoop.design.models.items.LogoNavModel;
import com.whoop.design.models.items.MetricEducationModel;
import com.whoop.design.models.items.SpecificationTableModel;
import com.whoop.design.models.items.SplitColumnModel;
import com.whoop.design.models.items.SuggestionBubbleModel;
import com.whoop.design.models.items.TagModel;
import com.whoop.design.models.items.TagSelectorModel;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lb1.m4 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C23675m4 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f93870w;

    public /* synthetic */ C23675m4(int i13) {
        this.f93870w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f93870w) {
            case 0:
                return AbstractC23681n4.m69169g((SpecificationTableModel) obj);
            case 1:
                return AbstractC23687o4.m69202e((C23749z0) obj);
            case 2:
                return AbstractC23687o4.m69203f((SplitColumnModel) obj);
            case 3:
                return AbstractC23693p4.m69246e((C23749z0) obj);
            case 4:
                return AbstractC23693p4.m69247f((SuggestionBubbleModel) obj);
            case 5:
                return AbstractC23699q4.m69315e((C23749z0) obj);
            case 6:
                return AbstractC23699q4.m69316f((TagModel) obj);
            case 7:
                return AbstractC23705r4.m69361d((C23749z0) obj);
            case 8:
                return AbstractC23705r4.m69362e((TagSelectorModel) obj);
            case 9:
                return AbstractC23723u4.m69559i((C23749z0) obj);
            case 10:
                return AbstractC23723u4.m69560j((AnnotatedTextModel) obj);
            case 11:
                return AbstractC23723u4.m69561k((TitleSubTitleModel) obj);
            case 12:
                return AbstractC23723u4.m69562l((MarkdownTextModel) obj);
            case 13:
                return AbstractC23593a5.m68286A0((C23749z0) obj);
            case 14:
                return AbstractC23593a5.m68321N0((CollapsableHeaderModel) obj);
            case 15:
                return AbstractC23593a5.m68323O0((CtaTileModel) obj);
            case 16:
                return AbstractC23593a5.m68292C0((ArticleTileCarouselModel) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC23593a5.m68327Q0((CurrentPlanTileModel) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC23593a5.m68329R0((BehaviorCountTileModel) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC23593a5.m68331S0((GoalSettingsTileModel) obj);
            case 20:
                return AbstractC23593a5.m68333T0((ImageAndIconModel) obj);
            case 21:
                return AbstractC23593a5.m68335U0((LogoNavModel) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC23593a5.m68337V0((ImpactMagnitudeTileModel) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC23593a5.m68339W0((ImpactTileModel) obj);
            case 24:
                return AbstractC23593a5.m68289B0((AlertTileModel) obj);
            case 25:
                return AbstractC23593a5.m68343Y0((InfoCalloutTileModel) obj);
            case 26:
                return AbstractC23593a5.m68345Z0((InsufficientImpactTileModel) obj);
            case 27:
                return AbstractC23593a5.m68351b1((MetricEducationModel) obj);
            case 28:
                return AbstractC23593a5.m68325P0((ArticleTileModel) obj);
            default:
                return AbstractC23593a5.m68357d1((LockedImpactOnRecoveryModel) obj);
        }
    }
}
