package io.getstream.chat.android.p226ui.common.state.messages.list;

import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.common.feature.messages.list.MessageListController;
import java.util.List;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u00103\u001a\u00020\u0010HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0011\u00106\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u0017HÆ\u0003J\u0097\u0001\u00107\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u0017HÆ\u0001J\u0013\u00108\u001a\u00020\u00062\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020\u0010HÖ\u0001J\t\u0010;\u001a\u00020\u000eHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001dR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001dR\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0019\u0010\u0015\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u0017¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006<"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;", "", "messageItems", "", "Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;", "endOfNewMessagesReached", "", "endOfOldMessagesReached", "isLoading", "isLoadingNewerMessages", "isLoadingOlderMessages", "currentUser", "Lio/getstream/chat/android/models/User;", "parentMessageId", "", "unreadCount", "", "newMessageState", "Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;", "selectedMessageState", "Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;", "unreadLabel", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;", "Lio/getstream/chat/android/ui/common/state/messages/list/UnreadLabel;", "<init>", "(Ljava/util/List;ZZZZZLio/getstream/chat/android/models/User;Ljava/lang/String;ILio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;)V", "getMessageItems", "()Ljava/util/List;", "getEndOfNewMessagesReached", "()Z", "getEndOfOldMessagesReached", "getCurrentUser", "()Lio/getstream/chat/android/models/User;", "getParentMessageId", "()Ljava/lang/String;", "getUnreadCount", "()I", "getNewMessageState", "()Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;", "getSelectedMessageState", "()Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;", "getUnreadLabel", "()Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "toString", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MessageListState {
    public static final int $stable = 8;
    private final User currentUser;
    private final boolean endOfNewMessagesReached;
    private final boolean endOfOldMessagesReached;
    private final boolean isLoading;
    private final boolean isLoadingNewerMessages;
    private final boolean isLoadingOlderMessages;
    private final List<MessageListItemState> messageItems;
    private final NewMessageState newMessageState;
    private final String parentMessageId;
    private final SelectedMessageState selectedMessageState;
    private final int unreadCount;
    private final MessageListController.UnreadLabel unreadLabel;

    public MessageListState() {
        this(null, false, false, false, false, false, null, null, 0, null, null, null, 4095, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessageListState copy$default(MessageListState messageListState, List list, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, User user, String str, int i13, NewMessageState newMessageState, SelectedMessageState selectedMessageState, MessageListController.UnreadLabel unreadLabel, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            list = messageListState.messageItems;
        }
        if ((i14 & 2) != 0) {
            z4 = messageListState.endOfNewMessagesReached;
        }
        if ((i14 & 4) != 0) {
            z13 = messageListState.endOfOldMessagesReached;
        }
        if ((i14 & 8) != 0) {
            z14 = messageListState.isLoading;
        }
        if ((i14 & 16) != 0) {
            z15 = messageListState.isLoadingNewerMessages;
        }
        if ((i14 & 32) != 0) {
            z16 = messageListState.isLoadingOlderMessages;
        }
        if ((i14 & 64) != 0) {
            user = messageListState.currentUser;
        }
        if ((i14 & 128) != 0) {
            str = messageListState.parentMessageId;
        }
        if ((i14 & 256) != 0) {
            i13 = messageListState.unreadCount;
        }
        if ((i14 & 512) != 0) {
            newMessageState = messageListState.newMessageState;
        }
        if ((i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            selectedMessageState = messageListState.selectedMessageState;
        }
        if ((i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            unreadLabel = messageListState.unreadLabel;
        }
        SelectedMessageState selectedMessageState2 = selectedMessageState;
        MessageListController.UnreadLabel unreadLabel2 = unreadLabel;
        int i15 = i13;
        NewMessageState newMessageState2 = newMessageState;
        User user2 = user;
        String str2 = str;
        boolean z17 = z15;
        boolean z18 = z16;
        return messageListState.copy(list, z4, z13, z14, z17, z18, user2, str2, i15, newMessageState2, selectedMessageState2, unreadLabel2);
    }

    public final List<MessageListItemState> component1() {
        return this.messageItems;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final NewMessageState getNewMessageState() {
        return this.newMessageState;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final SelectedMessageState getSelectedMessageState() {
        return this.selectedMessageState;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final MessageListController.UnreadLabel getUnreadLabel() {
        return this.unreadLabel;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getEndOfNewMessagesReached() {
        return this.endOfNewMessagesReached;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getEndOfOldMessagesReached() {
        return this.endOfOldMessagesReached;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsLoadingNewerMessages() {
        return this.isLoadingNewerMessages;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsLoadingOlderMessages() {
        return this.isLoadingOlderMessages;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final User getCurrentUser() {
        return this.currentUser;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getParentMessageId() {
        return this.parentMessageId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getUnreadCount() {
        return this.unreadCount;
    }

    public final MessageListState copy(List<? extends MessageListItemState> messageItems, boolean endOfNewMessagesReached, boolean endOfOldMessagesReached, boolean isLoading, boolean isLoadingNewerMessages, boolean isLoadingOlderMessages, User currentUser, String parentMessageId, int unreadCount, NewMessageState newMessageState, SelectedMessageState selectedMessageState, MessageListController.UnreadLabel unreadLabel) {
        AbstractC22676k.m65750j(messageItems, "messageItems");
        return new MessageListState(messageItems, endOfNewMessagesReached, endOfOldMessagesReached, isLoading, isLoadingNewerMessages, isLoadingOlderMessages, currentUser, parentMessageId, unreadCount, newMessageState, selectedMessageState, unreadLabel);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageListState)) {
            return false;
        }
        MessageListState messageListState = (MessageListState) other;
        return AbstractC22676k.m65745e(this.messageItems, messageListState.messageItems) && this.endOfNewMessagesReached == messageListState.endOfNewMessagesReached && this.endOfOldMessagesReached == messageListState.endOfOldMessagesReached && this.isLoading == messageListState.isLoading && this.isLoadingNewerMessages == messageListState.isLoadingNewerMessages && this.isLoadingOlderMessages == messageListState.isLoadingOlderMessages && AbstractC22676k.m65745e(this.currentUser, messageListState.currentUser) && AbstractC22676k.m65745e(this.parentMessageId, messageListState.parentMessageId) && this.unreadCount == messageListState.unreadCount && AbstractC22676k.m65745e(this.newMessageState, messageListState.newMessageState) && AbstractC22676k.m65745e(this.selectedMessageState, messageListState.selectedMessageState) && AbstractC22676k.m65745e(this.unreadLabel, messageListState.unreadLabel);
    }

    public final User getCurrentUser() {
        return this.currentUser;
    }

    public final boolean getEndOfNewMessagesReached() {
        return this.endOfNewMessagesReached;
    }

    public final boolean getEndOfOldMessagesReached() {
        return this.endOfOldMessagesReached;
    }

    public final List<MessageListItemState> getMessageItems() {
        return this.messageItems;
    }

    public final NewMessageState getNewMessageState() {
        return this.newMessageState;
    }

    public final String getParentMessageId() {
        return this.parentMessageId;
    }

    public final SelectedMessageState getSelectedMessageState() {
        return this.selectedMessageState;
    }

    public final int getUnreadCount() {
        return this.unreadCount;
    }

    public final MessageListController.UnreadLabel getUnreadLabel() {
        return this.unreadLabel;
    }

    public final int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.messageItems.hashCode() * 31, 31, this.endOfNewMessagesReached), 31, this.endOfOldMessagesReached), 31, this.isLoading), 31, this.isLoadingNewerMessages), 31, this.isLoadingOlderMessages);
        User user = this.currentUser;
        int iHashCode = (iM8289b + (user == null ? 0 : user.hashCode())) * 31;
        String str = this.parentMessageId;
        int iM30448b = AbstractC11266d.m30448b(this.unreadCount, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        NewMessageState newMessageState = this.newMessageState;
        int iHashCode2 = (iM30448b + (newMessageState == null ? 0 : newMessageState.hashCode())) * 31;
        SelectedMessageState selectedMessageState = this.selectedMessageState;
        int iHashCode3 = (iHashCode2 + (selectedMessageState == null ? 0 : selectedMessageState.hashCode())) * 31;
        MessageListController.UnreadLabel unreadLabel = this.unreadLabel;
        return iHashCode3 + (unreadLabel != null ? unreadLabel.hashCode() : 0);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isLoadingNewerMessages() {
        return this.isLoadingNewerMessages;
    }

    public final boolean isLoadingOlderMessages() {
        return this.isLoadingOlderMessages;
    }

    public final String toString() {
        List<MessageListItemState> list = this.messageItems;
        boolean z4 = this.endOfNewMessagesReached;
        boolean z13 = this.endOfOldMessagesReached;
        boolean z14 = this.isLoading;
        boolean z15 = this.isLoadingNewerMessages;
        boolean z16 = this.isLoadingOlderMessages;
        User user = this.currentUser;
        String str = this.parentMessageId;
        int i13 = this.unreadCount;
        NewMessageState newMessageState = this.newMessageState;
        SelectedMessageState selectedMessageState = this.selectedMessageState;
        MessageListController.UnreadLabel unreadLabel = this.unreadLabel;
        StringBuilder sb4 = new StringBuilder("MessageListState(messageItems=");
        sb4.append(list);
        sb4.append(", endOfNewMessagesReached=");
        sb4.append(z4);
        sb4.append(", endOfOldMessagesReached=");
        AbstractC38963t7.m124392v(sb4, z13, ", isLoading=", z14, ", isLoadingNewerMessages=");
        AbstractC38963t7.m124392v(sb4, z15, ", isLoadingOlderMessages=", z16, ", currentUser=");
        sb4.append(user);
        sb4.append(", parentMessageId=");
        sb4.append(str);
        sb4.append(", unreadCount=");
        sb4.append(i13);
        sb4.append(", newMessageState=");
        sb4.append(newMessageState);
        sb4.append(", selectedMessageState=");
        sb4.append(selectedMessageState);
        sb4.append(", unreadLabel=");
        sb4.append(unreadLabel);
        sb4.append(")");
        return sb4.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessageListState(List<? extends MessageListItemState> messageItems, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, User user, String str, int i13, NewMessageState newMessageState, SelectedMessageState selectedMessageState, MessageListController.UnreadLabel unreadLabel) {
        AbstractC22676k.m65750j(messageItems, "messageItems");
        this.messageItems = messageItems;
        this.endOfNewMessagesReached = z4;
        this.endOfOldMessagesReached = z13;
        this.isLoading = z14;
        this.isLoadingNewerMessages = z15;
        this.isLoadingOlderMessages = z16;
        this.currentUser = user;
        this.parentMessageId = str;
        this.unreadCount = i13;
        this.newMessageState = newMessageState;
        this.selectedMessageState = selectedMessageState;
        this.unreadLabel = unreadLabel;
    }

    public /* synthetic */ MessageListState(List list, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, User user, String str, int i13, NewMessageState newMessageState, SelectedMessageState selectedMessageState, MessageListController.UnreadLabel unreadLabel, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? C25271y.f99162w : list, (i14 & 2) != 0 ? true : z4, (i14 & 4) != 0 ? false : z13, (i14 & 8) != 0 ? false : z14, (i14 & 16) != 0 ? false : z15, (i14 & 32) != 0 ? false : z16, (i14 & 64) != 0 ? new User(null, null, null, null, null, null, null, null, null, false, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, 33554431, null) : user, (i14 & 128) != 0 ? null : str, (i14 & 256) == 0 ? i13 : 0, (i14 & 512) != 0 ? null : newMessageState, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : selectedMessageState, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : unreadLabel);
    }
}
