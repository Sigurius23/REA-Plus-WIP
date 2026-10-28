package io.getstream.chat.android.p226ui.common.state.channels.actions;

import c93.InterfaceC4339a;
import io.getstream.chat.android.models.Channel;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001aÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/channels/actions/ChannelAction;", "", "Lio/getstream/chat/android/models/Channel;", "getChannel", "()Lio/getstream/chat/android/models/Channel;", "channel", "", "getIcon", "()I", "icon", "", "getLabel", "()Ljava/lang/String;", "label", "Lio/getstream/chat/android/ui/common/state/channels/actions/ConfirmationPopup;", "getConfirmationPopup", "()Lio/getstream/chat/android/ui/common/state/channels/actions/ConfirmationPopup;", "confirmationPopup", "", "isDestructive", "()Z", "Lkotlin/Function0;", "Ll83/a0;", "getOnAction", "()Lc93/a;", "onAction", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ChannelAction {

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static ConfirmationPopup getConfirmationPopup(ChannelAction channelAction) {
            channelAction.getClass();
            return null;
        }

        @Deprecated
        public static boolean isDestructive(ChannelAction channelAction) {
            channelAction.getClass();
            return false;
        }
    }

    static /* synthetic */ ConfirmationPopup access$getConfirmationPopup$jd(ChannelAction channelAction) {
        channelAction.getClass();
        return null;
    }

    static /* synthetic */ boolean access$isDestructive$jd(ChannelAction channelAction) {
        channelAction.getClass();
        return false;
    }

    Channel getChannel();

    default ConfirmationPopup getConfirmationPopup() {
        return null;
    }

    int getIcon();

    String getLabel();

    InterfaceC4339a getOnAction();

    default boolean isDestructive() {
        return false;
    }
}
