package p710im1;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.navigation.AiAction;
import com.whoop.navigation.AiCoachChatScreenModel;
import com.whoop.navigation.ChatEntrypointExperience;
import com.whoop.navigation.CoachScreenModel;
import com.whoop.navigation.CustomizeOverviewModel;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.parser2.adapters.internal.StreamDateFormatter;
import io.getstream.chat.android.p226ui.ChatUI;
import io.getstream.chat.android.p226ui.common.helper.DurationFormatter;
import io.getstream.chat.android.p226ui.common.helper.ReactionPushEmojiFactory;
import io.getstream.chat.android.p226ui.helper.MimeTypeIconProviderImpl;

/* JADX INFO: renamed from: im1.l0 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18681l0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73296w;

    public /* synthetic */ C18681l0(int i13) {
        this.f73296w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f73296w) {
            case 0:
                return AbstractC18697t0.m54282L0();
            case 1:
                return AbstractC18697t0.m54298T0();
            case 2:
                return AbstractC18697t0.m54343k1();
            case 3:
                return AbstractC18697t0.m54364r1();
            case 4:
                return ChatClient.anonUser_delegate$lambda$134();
            case 5:
                return ChatClient.Builder.internalBuild$lambda$21();
            case 6:
                return Long.valueOf(System.currentTimeMillis());
            case 7:
                return StreamDateFormatter.dateFormat_delegate$lambda$1();
            case 8:
                return StreamDateFormatter.dateFormatWithoutNanoseconds_delegate$lambda$3();
            case 9:
                return StreamDateFormatter.cache_delegate$lambda$4();
            case 10:
                return ChatUI.m54991d();
            case 11:
                return ChatUI.m54988a();
            case 12:
                ChatUI chatUI = ChatUI.INSTANCE;
                return DurationFormatter.INSTANCE.defaultFormatter();
            case 13:
                return ChatUI.m54992e();
            case 14:
                return ChatUI.attachmentFactoryManager_delegate$lambda$11();
            case 15:
                return ChatUI.attachmentPreviewFactoryManager_delegate$lambda$12();
            case 16:
                return ChatUI.quotedAttachmentFactoryManager_delegate$lambda$13();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return ChatUI.m54998k();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ChatUI.supportedReactions_delegate$lambda$3();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ChatUI chatUI2 = ChatUI.INSTANCE;
                return ReactionPushEmojiFactory.INSTANCE.defaultFactory();
            case 20:
                ChatUI chatUI3 = ChatUI.INSTANCE;
                return new MimeTypeIconProviderImpl();
            case 21:
                return ChatUI.channelNameFormatter_delegate$lambda$6();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ChatUI.messagePreviewFormatter_delegate$lambda$7();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AiAction._childSerializers$_anonymous_();
            case 24:
                return AiAction._childSerializers$_anonymous_$0();
            case 25:
                return AiAction._childSerializers$_anonymous_$1();
            case 26:
                return AiCoachChatScreenModel._childSerializers$_anonymous_();
            case 27:
                return ChatEntrypointExperience._init_$_anonymous_();
            case 28:
                return CoachScreenModel._childSerializers$_anonymous_();
            default:
                return CustomizeOverviewModel._init_$_anonymous_();
        }
    }
}
