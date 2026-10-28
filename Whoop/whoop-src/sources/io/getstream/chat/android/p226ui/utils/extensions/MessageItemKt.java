package io.getstream.chat.android.p226ui.utils.extensions;

import io.getstream.chat.android.client.utils.message.MessageUtils;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.p226ui.common.state.messages.list.MessagePosition;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0001¨\u0006\u0005"}, m65681d2 = {"isBottomPosition", "", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;", "isNotBottomPosition", "isErrorOrFailed", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageItemKt {
    @InternalStreamChatApi
    public static final boolean isBottomPosition(MessageListItem.MessageItem messageItem) {
        AbstractC22676k.m65750j(messageItem, "<this>");
        return MessagePosition.BOTTOM == messageItem.getPosition() || MessagePosition.NONE == messageItem.getPosition();
    }

    @InternalStreamChatApi
    public static final boolean isErrorOrFailed(MessageListItem.MessageItem messageItem) {
        AbstractC22676k.m65750j(messageItem, "<this>");
        return messageItem.isMine() && MessageUtils.isErrorOrFailed(messageItem.getMessage());
    }

    @InternalStreamChatApi
    public static final boolean isNotBottomPosition(MessageListItem.MessageItem messageItem) {
        AbstractC22676k.m65750j(messageItem, "<this>");
        return !isBottomPosition(messageItem);
    }
}
