package w70;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.activation.feature.orderconfirmation.domain.models.OrderConfirmationResponse;
import com.whoop.design.models.items.AchievementProgressCardModel;
import com.whoop.design.models.items.ActionButtonStyle;
import com.whoop.design.models.items.ActivityTileSelectionStateModel;
import com.whoop.design.models.items.AdditionalInfoTextModel;
import com.whoop.design.models.items.AiChatTalkTextButtonModel;
import com.whoop.design.models.items.AiChatTalkTextEmptyStateModel;
import com.whoop.design.models.items.AiChatTalkTextModel;
import com.whoop.design.models.items.AiWeeklyPlanSuggestionModel;
import com.whoop.design.models.items.AiWeeklyPlanSuggestionStyleModel;
import com.whoop.design.models.items.AlertTileModel;
import com.whoop.design.models.items.AnimatedSequenceModel;
import com.whoop.design.models.items.AnimatedSequenceStepModel;
import com.whoop.design.models.items.AnswerCount;
import com.whoop.design.models.items.AppointmentCardIconButtonModel;
import com.whoop.design.models.items.AppointmentCardModel;
import com.whoop.design.models.items.ArchMiniFilteredListModel;
import com.whoop.design.models.items.ArticleTileCarouselModel;
import w71.AbstractC36907z;
import w80.AbstractC36941b;

/* JADX INFO: renamed from: w70.a */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C36870a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f157708w;

    public /* synthetic */ C36870a(int i13) {
        this.f157708w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f157708w) {
            case 0:
                return OrderConfirmationResponse._childSerializers$_anonymous_();
            case 1:
                return OrderConfirmationResponse._childSerializers$_anonymous_$0();
            case 2:
                return OrderConfirmationResponse._childSerializers$_anonymous_$1();
            case 3:
                return AbstractC36907z.m118522e();
            case 4:
                return AbstractC36941b.m118557B();
            case 5:
                return AchievementProgressCardModel._childSerializers$_anonymous_();
            case 6:
                return ActionButtonStyle._init_$_anonymous_();
            case 7:
                return ActivityTileSelectionStateModel._childSerializers$_anonymous_();
            case 8:
                return AdditionalInfoTextModel._childSerializers$_anonymous_();
            case 9:
                return AiChatTalkTextButtonModel._childSerializers$_anonymous_();
            case 10:
                return AiChatTalkTextEmptyStateModel._childSerializers$_anonymous_();
            case 11:
                return AiChatTalkTextEmptyStateModel._childSerializers$_anonymous_$0();
            case 12:
                return AiChatTalkTextModel._childSerializers$_anonymous_();
            case 13:
                return AiChatTalkTextModel._childSerializers$_anonymous_$0();
            case 14:
                return AiWeeklyPlanSuggestionModel._childSerializers$_anonymous_();
            case 15:
                return AiWeeklyPlanSuggestionModel._childSerializers$_anonymous_$0();
            case 16:
                return AiWeeklyPlanSuggestionStyleModel._init_$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AlertTileModel._childSerializers$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AnimatedSequenceModel._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AnimatedSequenceModel._childSerializers$_anonymous_$0();
            case 20:
                return AnimatedSequenceStepModel._childSerializers$_anonymous_();
            case 21:
                return AnswerCount._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AppointmentCardIconButtonModel._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AppointmentCardIconButtonModel._childSerializers$_anonymous_$0();
            case 24:
                return AppointmentCardModel._childSerializers$_anonymous_();
            case 25:
                return AppointmentCardModel._childSerializers$_anonymous_$0();
            case 26:
                return ArchMiniFilteredListModel._childSerializers$_anonymous_();
            case 27:
                return ArticleTileCarouselModel._childSerializers$_anonymous_();
            case 28:
                return ArticleTileCarouselModel._childSerializers$_anonymous_$0();
            default:
                return ArticleTileCarouselModel._childSerializers$_anonymous_$1();
        }
    }
}
