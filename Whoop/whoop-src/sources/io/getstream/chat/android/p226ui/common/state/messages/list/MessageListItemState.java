package io.getstream.chat.android.p226ui.common.state.messages.list;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;", "", "<init>", "()V", "id", "", "getId$annotations", "getId", "()Ljava/lang/String;", "Lio/getstream/chat/android/ui/common/state/messages/list/DateSeparatorItemState;", "Lio/getstream/chat/android/ui/common/state/messages/list/EmptyThreadPlaceholderItemState;", "Lio/getstream/chat/android/ui/common/state/messages/list/HasMessageListItemState;", "Lio/getstream/chat/android/ui/common/state/messages/list/StartOfTheChannelItemState;", "Lio/getstream/chat/android/ui/common/state/messages/list/ThreadDateSeparatorItemState;", "Lio/getstream/chat/android/ui/common/state/messages/list/TypingItemState;", "Lio/getstream/chat/android/ui/common/state/messages/list/UnreadSeparatorItemState;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class MessageListItemState {
    public static final int $stable = 0;

    private MessageListItemState() {
    }

    @InternalStreamChatApi
    public static /* synthetic */ void getId$annotations() {
    }

    public final String getId() {
        if (this instanceof HasMessageListItemState) {
            return ((HasMessageListItemState) this).getMessage().getId();
        }
        if (this instanceof DateSeparatorItemState) {
            return AbstractC11895b.m31994m(((DateSeparatorItemState) this).getDate().getTime(), "date-separator-");
        }
        if (this instanceof ThreadDateSeparatorItemState) {
            return AbstractC11895b.m31994m(((ThreadDateSeparatorItemState) this).getDate().getTime(), "thread-date-separator-");
        }
        if (this instanceof TypingItemState) {
            return "typing-indicator";
        }
        if (this instanceof EmptyThreadPlaceholderItemState) {
            return "empty-thread-placeholder";
        }
        if (this instanceof UnreadSeparatorItemState) {
            return "unread-separator";
        }
        if (this instanceof StartOfTheChannelItemState) {
            return "start-of-the-channel";
        }
        throw new NoWhenBranchMatchedException();
    }

    public MessageListItemState(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
