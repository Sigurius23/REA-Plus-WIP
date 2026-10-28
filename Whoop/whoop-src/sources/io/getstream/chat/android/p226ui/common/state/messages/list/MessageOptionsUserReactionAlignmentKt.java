package io.getstream.chat.android.p226ui.common.state.messages.list;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u0006"}, m65681d2 = {"getUserReactionAlignment", "Lio/getstream/chat/android/ui/common/state/messages/list/MessageOptionsUserReactionAlignment;", "", "isStartAlignment", "", "isMine", "stream-chat-android-ui-common_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageOptionsUserReactionAlignmentKt {
    /* JADX WARN: Code duplicated, block: B:10:0x0017 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x0018  */
    public static final MessageOptionsUserReactionAlignment getUserReactionAlignment(int i13) {
        for (MessageOptionsUserReactionAlignment messageOptionsUserReactionAlignment : MessageOptionsUserReactionAlignment.values()) {
            if (messageOptionsUserReactionAlignment.getValue() == i13) {
                if (messageOptionsUserReactionAlignment != null) {
                    return messageOptionsUserReactionAlignment;
                }
                throw new IllegalStateException("No such alignment");
            }
        }
        messageOptionsUserReactionAlignment = null;
        if (messageOptionsUserReactionAlignment != null) {
            return messageOptionsUserReactionAlignment;
        }
        throw new IllegalStateException("No such alignment");
    }

    @InternalStreamChatApi
    public static final boolean isStartAlignment(MessageOptionsUserReactionAlignment messageOptionsUserReactionAlignment, boolean z4) {
        AbstractC22676k.m65750j(messageOptionsUserReactionAlignment, "<this>");
        if (messageOptionsUserReactionAlignment == MessageOptionsUserReactionAlignment.START) {
            return true;
        }
        if (z4 || messageOptionsUserReactionAlignment != MessageOptionsUserReactionAlignment.BY_USER) {
            return z4 && messageOptionsUserReactionAlignment == MessageOptionsUserReactionAlignment.BY_USER_INVERTED;
        }
        return true;
    }
}
