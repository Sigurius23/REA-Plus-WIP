package io.getstream.chat.android.p226ui.common.state.messages.list;

import p031b9.AbstractC2875y;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/list/UnreadSeparatorItemState;", "Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;", "unreadCount", "", "<init>", "(I)V", "getUnreadCount", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class UnreadSeparatorItemState extends MessageListItemState {
    public static final int $stable = 0;
    private final int unreadCount;

    public UnreadSeparatorItemState(int i13) {
        this.unreadCount = i13;
    }

    public static UnreadSeparatorItemState copy$default(UnreadSeparatorItemState unreadSeparatorItemState, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = unreadSeparatorItemState.unreadCount;
        }
        unreadSeparatorItemState.getClass();
        return new UnreadSeparatorItemState(i13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getUnreadCount() {
        return this.unreadCount;
    }

    public final UnreadSeparatorItemState copy(int unreadCount) {
        return new UnreadSeparatorItemState(unreadCount);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UnreadSeparatorItemState) && this.unreadCount == ((UnreadSeparatorItemState) other).unreadCount;
    }

    public final int getUnreadCount() {
        return this.unreadCount;
    }

    public final int hashCode() {
        return Integer.hashCode(this.unreadCount);
    }

    public final String toString() {
        return AbstractC2875y.m8296i(this.unreadCount, "UnreadSeparatorItemState(unreadCount=", ")");
    }
}
