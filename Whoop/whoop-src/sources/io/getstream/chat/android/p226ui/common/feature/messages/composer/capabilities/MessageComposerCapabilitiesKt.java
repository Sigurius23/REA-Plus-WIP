package io.getstream.chat.android.p226ui.common.feature.messages.composer.capabilities;

import io.getstream.chat.android.models.ChannelCapabilities;
import io.getstream.chat.android.p226ui.common.state.messages.MessageMode;
import io.getstream.chat.android.p226ui.common.state.messages.composer.MessageComposerState;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0004"}, m65681d2 = {"canSendMessage", "", "Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;", "canUploadFile", "stream-chat-android-ui-common_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageComposerCapabilitiesKt {
    public static final boolean canSendMessage(MessageComposerState messageComposerState) {
        AbstractC22676k.m65750j(messageComposerState, "<this>");
        boolean zContains = messageComposerState.getOwnCapabilities().contains(ChannelCapabilities.SEND_MESSAGE);
        boolean zContains2 = messageComposerState.getOwnCapabilities().contains(ChannelCapabilities.SEND_REPLY);
        if (messageComposerState.getMessageMode() instanceof MessageMode.MessageThread) {
            zContains = zContains2;
        }
        return messageComposerState.getSendEnabled() && zContains;
    }

    public static final boolean canUploadFile(MessageComposerState messageComposerState) {
        AbstractC22676k.m65750j(messageComposerState, "<this>");
        return messageComposerState.getOwnCapabilities().contains(ChannelCapabilities.UPLOAD_FILE);
    }
}
