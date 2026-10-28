package xa1;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.advancedlabs.testupload.domain.models.ButtonModel;
import com.whoop.advancedlabs.testupload.domain.models.TestUploadInfoTileModel;
import com.whoop.advancedlabs.testupload.domain.models.TestUploadScreen;
import com.whoop.advancedlabsjoin.feature.purchaseaddons.domain.models.AdvanceLabsPurchaseAddOnsStickyModel;
import com.whoop.advancedlabsjoin.feature.purchaseaddons.domain.models.PurchaseAddOnsModels;
import com.whoop.advancedlabsjoin.feature.purchaseaddons.domain.models.PurchaseAddOnsSectionModel;
import com.whoop.design.models.items.nestedbff.NestedBFFRequestModel;
import com.whoop.design.models.items.nestedbff.NestedBFFResponse;
import com.whoop.design.models.items.nestedbff.NestedBFFSection;
import com.whoop.p057ai.chat.models.AIConversation;
import com.whoop.p057ai.chat.models.AIMessage;
import com.whoop.p057ai.chat.models.AITurn;
import com.whoop.p057ai.chat.models.AiChatHistoryResponse;
import com.whoop.p057ai.chat.models.AiConversationHistorySection;
import com.whoop.p057ai.chat.models.Attachment;
import com.whoop.p057ai.chat.models.AttachmentType;
import com.whoop.p057ai.chat.models.ChatAttachmentCarouselModel;
import com.whoop.p057ai.chat.models.CoachVersionTag;
import com.whoop.p057ai.chat.models.ContextDetailsHeaderModel;
import com.whoop.p057ai.chat.models.HealthSnapshotTileModel;
import com.whoop.p057ai.chat.models.TurnFeedback;
import com.whoop.p057ai.chat.models.TurnFeedbackResponse;
import com.whoop.sms.common.data.SmsPhoneNumberResponse;
import xh0.AbstractC38307c;
import xi2.AbstractC38328f;

/* JADX INFO: renamed from: xa1.a */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C38138a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f163252w;

    public /* synthetic */ C38138a(int i13) {
        this.f163252w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f163252w) {
            case 0:
                return NestedBFFRequestModel._childSerializers$_anonymous_();
            case 1:
                return NestedBFFRequestModel._childSerializers$_anonymous_$0();
            case 2:
                return NestedBFFResponse._childSerializers$_anonymous_();
            case 3:
                return NestedBFFSection._childSerializers$_anonymous_();
            case 4:
                return ButtonModel._childSerializers$_anonymous_();
            case 5:
                return TestUploadInfoTileModel._childSerializers$_anonymous_();
            case 6:
                return TestUploadScreen._childSerializers$_anonymous_();
            case 7:
                return AdvanceLabsPurchaseAddOnsStickyModel._childSerializers$_anonymous_();
            case 8:
                return PurchaseAddOnsModels._childSerializers$_anonymous_();
            case 9:
                return PurchaseAddOnsModels._childSerializers$_anonymous_$0();
            case 10:
                return PurchaseAddOnsSectionModel._childSerializers$_anonymous_();
            case 11:
                return SmsPhoneNumberResponse._childSerializers$_anonymous_();
            case 12:
                return AIConversation._childSerializers$_anonymous_();
            case 13:
                return AIConversation._childSerializers$_anonymous_$0();
            case 14:
                return AIMessage._childSerializers$_anonymous_();
            case 15:
                return AITurn._childSerializers$_anonymous_();
            case 16:
                return AITurn._childSerializers$_anonymous_$0();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AiChatHistoryResponse._childSerializers$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AiConversationHistorySection._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return Attachment._childSerializers$_anonymous_();
            case 20:
                return AttachmentType._init_$_anonymous_();
            case 21:
                return ChatAttachmentCarouselModel._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return CoachVersionTag._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ContextDetailsHeaderModel._childSerializers$_anonymous_();
            case 24:
                return HealthSnapshotTileModel._childSerializers$_anonymous_();
            case 25:
                return TurnFeedback._childSerializers$_anonymous_();
            case 26:
                return TurnFeedbackResponse._childSerializers$_anonymous_();
            case 27:
                return TurnFeedbackResponse._childSerializers$_anonymous_$0();
            case 28:
                return AbstractC38307c.m122728u();
            default:
                return AbstractC38328f.m122862H();
        }
    }
}
