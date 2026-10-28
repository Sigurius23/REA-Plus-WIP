package p716lb1;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.models.cards.CardContainerModel;
import com.whoop.design.models.cards.GraphDescriptionCardModel;
import com.whoop.design.models.cards.HeroImageCardModel;
import com.whoop.design.models.cards.HeroWithFooterCtaModel;
import com.whoop.design.models.cards.ImageAndButtonCardModel;
import com.whoop.design.models.cards.LeftAlignedImageCardModel;
import com.whoop.design.models.cards.VowCardModel;
import com.whoop.design.models.celebration.CelebrationMediaModel;
import com.whoop.design.models.celebration.CelebrationMediaWithCaptionModel;
import com.whoop.design.models.celebration.CelebrationOverlayModel;
import com.whoop.design.models.items.AiChatEntryModel;
import com.whoop.design.models.items.ArchMiniCommunityFollowerModel;
import com.whoop.design.models.items.ButtonCellModel;
import com.whoop.design.models.items.ChallengeProgressGaugeModel;
import com.whoop.design.models.items.CheckboxModel;
import com.whoop.design.models.items.ColumnModel;
import com.whoop.design.models.items.PricingSelectionCardModel;
import com.whoop.design.models.items.ToggleCardButtonModel;
import com.whoop.design.models.items.UpsellCardFeaturesModel;
import com.whoop.design.models.items.UpsellCardSmallModel;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lb1.v */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C23724v implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f94018w;

    public /* synthetic */ C23724v(int i13) {
        this.f94018w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f94018w) {
            case 0:
                return AbstractC23730w.m69600f((ToggleCardButtonModel) obj);
            case 1:
                return AbstractC23736x.m69629c((C23749z0) obj);
            case 2:
                return AbstractC23736x.m69630d((ButtonCellModel) obj);
            case 3:
                return AbstractC23742y.m69684e((C23749z0) obj);
            case 4:
                return AbstractC23742y.m69685f((CardContainerModel) obj);
            case 5:
                return AbstractC23748z.m69743n((C23749z0) obj);
            case 6:
                return AbstractC23748z.m69744o((ImageAndButtonCardModel) obj);
            case 7:
                return AbstractC23748z.m69745p((LeftAlignedImageCardModel) obj);
            case 8:
                return AbstractC23748z.m69746q((HeroImageCardModel) obj);
            case 9:
                return AbstractC23748z.m69747r((HeroWithFooterCtaModel) obj);
            case 10:
                return AbstractC23748z.m69748s((GraphDescriptionCardModel) obj);
            case 11:
                return AbstractC23748z.m69749t((UpsellCardSmallModel) obj);
            case 12:
                return AbstractC23748z.m69750u((UpsellCardFeaturesModel) obj);
            case 13:
                return AbstractC23748z.m69751v((PricingSelectionCardModel) obj);
            case 14:
                return AbstractC23588a0.m68240h((C23749z0) obj);
            case 15:
                return AbstractC23588a0.m68241i((CelebrationMediaModel) obj);
            case 16:
                return AbstractC23588a0.m68242j((CelebrationMediaWithCaptionModel) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC23588a0.m68243k((CelebrationOverlayModel) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC23595b0.m68515d((C23749z0) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC23595b0.m68516e((ChallengeProgressGaugeModel) obj);
            case 20:
                return AbstractC23602c0.m68567e((C23749z0) obj);
            case 21:
                return AbstractC23602c0.m68568f((AiChatEntryModel) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC23602c0.m68569g((VowCardModel) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC23609d0.m68619c((C23749z0) obj);
            case 24:
                return AbstractC23609d0.m68620d((CheckboxModel) obj);
            case 25:
                return AbstractC23630g0.m68772d((C23749z0) obj);
            case 26:
                return AbstractC23630g0.m68773e((ColumnModel) obj);
            case 27:
                return AbstractC23637h0.m68823c((C23749z0) obj);
            case 28:
                return AbstractC23637h0.m68824d((ArchMiniCommunityFollowerModel) obj);
            default:
                return AbstractC23651j0.m68909c((C23749z0) obj);
        }
    }
}
