package io.getstream.chat.android.p226ui.common.state.messages.list;

import io.getstream.chat.android.models.User;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/list/TypingItemState;", "Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;", "typingUsers", "", "Lio/getstream/chat/android/models/User;", "<init>", "(Ljava/util/List;)V", "getTypingUsers", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class TypingItemState extends MessageListItemState {
    public static final int $stable = 8;
    private final List<User> typingUsers;

    public TypingItemState(List<User> typingUsers) {
        AbstractC22676k.m65750j(typingUsers, "typingUsers");
        this.typingUsers = typingUsers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TypingItemState copy$default(TypingItemState typingItemState, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = typingItemState.typingUsers;
        }
        return typingItemState.copy(list);
    }

    public final List<User> component1() {
        return this.typingUsers;
    }

    public final TypingItemState copy(List<User> typingUsers) {
        AbstractC22676k.m65750j(typingUsers, "typingUsers");
        return new TypingItemState(typingUsers);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TypingItemState) && AbstractC22676k.m65745e(this.typingUsers, ((TypingItemState) other).typingUsers);
    }

    public final List<User> getTypingUsers() {
        return this.typingUsers;
    }

    public final int hashCode() {
        return this.typingUsers.hashCode();
    }

    public final String toString() {
        return AbstractC33745d.m106654m("TypingItemState(typingUsers=", ")", this.typingUsers);
    }
}
