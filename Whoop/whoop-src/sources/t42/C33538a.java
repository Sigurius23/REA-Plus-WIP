package t42;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.design.models.cards.AdvancedLabsSubscriptionCardModel;
import com.whoop.design.models.cards.ButtonCardModel;
import com.whoop.design.models.cards.CardContainerModel;
import com.whoop.design.models.cards.ContentBlockListCardModel;
import com.whoop.design.models.cards.FertilityCardModel;
import com.whoop.design.models.cards.Footer;
import com.whoop.design.models.cards.GraphDescriptionCardModel;
import com.whoop.design.models.cards.HeaderContentModel;
import com.whoop.design.models.cards.HeroImageCardModel;
import com.whoop.design.models.cards.HeroWithFooterCtaModel;
import com.whoop.design.models.cards.ImageAndButtonCardModel;
import com.whoop.design.models.cards.MenstrualCycleInsightsCardModel;
import com.whoop.design.models.cards.ProductTestCardModel;
import com.whoop.design.models.cards.TextAndImageCardModel;
import com.whoop.design.models.cards.TextWithDesignItemCardModel;
import com.whoop.profile.domain.models.components.StreakTileModel;

/* JADX INFO: renamed from: t42.a */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C33538a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f139997w;

    public /* synthetic */ C33538a(int i13) {
        this.f139997w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f139997w) {
            case 0:
                return StreakTileModel._childSerializers$_anonymous_();
            case 1:
                return AdvancedLabsSubscriptionCardModel._childSerializers$_anonymous_();
            case 2:
                return ButtonCardModel._childSerializers$_anonymous_();
            case 3:
                return ButtonCardModel._childSerializers$_anonymous_$0();
            case 4:
                return ButtonCardModel._childSerializers$_anonymous_$1();
            case 5:
                return ButtonCardModel._childSerializers$_anonymous_$2();
            case 6:
                return ButtonCardModel._childSerializers$_anonymous_$3();
            case 7:
                return CardContainerModel._childSerializers$_anonymous_();
            case 8:
                return CardContainerModel._childSerializers$_anonymous_$0();
            case 9:
                return ContentBlockListCardModel._childSerializers$_anonymous_();
            case 10:
                return FertilityCardModel._childSerializers$_anonymous_();
            case 11:
                return FertilityCardModel._childSerializers$_anonymous_$0();
            case 12:
                return Footer._childSerializers$_anonymous_();
            case 13:
                return GraphDescriptionCardModel._childSerializers$_anonymous_();
            case 14:
                return GraphDescriptionCardModel._childSerializers$_anonymous_$0();
            case 15:
                return GraphDescriptionCardModel._childSerializers$_anonymous_$1();
            case 16:
                return HeaderContentModel._childSerializers$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return HeaderContentModel._childSerializers$_anonymous_$0();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return HeroImageCardModel._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return HeroImageCardModel._childSerializers$_anonymous_$0();
            case 20:
                return HeroWithFooterCtaModel._childSerializers$_anonymous_();
            case 21:
                return ImageAndButtonCardModel._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return MenstrualCycleInsightsCardModel._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return MenstrualCycleInsightsCardModel._childSerializers$_anonymous_$0();
            case 24:
                return ProductTestCardModel._childSerializers$_anonymous_();
            case 25:
                return ProductTestCardModel._childSerializers$_anonymous_$0();
            case 26:
                return ProductTestCardModel._childSerializers$_anonymous_$1();
            case 27:
                return ProductTestCardModel._childSerializers$_anonymous_$2();
            case 28:
                return TextAndImageCardModel._childSerializers$_anonymous_();
            default:
                return TextWithDesignItemCardModel._childSerializers$_anonymous_();
        }
    }
}
