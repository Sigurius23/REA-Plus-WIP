package io.getstream.chat.android.p226ui.common.utils.extensions;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.p226ui.common.state.messages.list.MessageFooterVisibility;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\u0007"}, m65681d2 = {"shouldShowMessageFooter", "", "Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;", "message", "Lio/getstream/chat/android/models/Message;", "isLastMessageInGroup", "nextMessage", "stream-chat-android-ui-common_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageFooterVisibilityKt {
    @InternalStreamChatApi
    public static final boolean shouldShowMessageFooter(MessageFooterVisibility messageFooterVisibility, Message message, boolean z4, Message message2) {
        AbstractC22676k.m65750j(messageFooterVisibility, "<this>");
        AbstractC22676k.m65750j(message, "message");
        if ((message2 == null && !messageFooterVisibility.equals(MessageFooterVisibility.Never.INSTANCE)) || messageFooterVisibility.equals(MessageFooterVisibility.Always.INSTANCE)) {
            return true;
        }
        if (messageFooterVisibility.equals(MessageFooterVisibility.LastInGroup.INSTANCE)) {
            return z4;
        }
        if (messageFooterVisibility.equals(MessageFooterVisibility.Never.INSTANCE)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
