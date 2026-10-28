package io.getstream.chat.android.p226ui.model;

import ih0.AbstractC18489d0;
import io.getstream.chat.android.p226ui.common.state.messages.list.NewMessageState;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import java.util.List;
import m83.AbstractC25265s;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÀ\u0003¢\u0006\u0002\b\u001eJM\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006$"}, m65681d2 = {"Lio/getstream/chat/android/ui/model/MessageListItemWrapper;", "", "items", "", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;", "hasNewMessages", "", "isTyping", "isThread", "endOfNewMessagesReached", "newMessageState", "Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;", "<init>", "(Ljava/util/List;ZZZZLio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;)V", "getItems", "()Ljava/util/List;", "getHasNewMessages", "()Z", "getEndOfNewMessagesReached", "getNewMessageState$stream_chat_android_ui_components_release", "()Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;", "toString", "", "stringify", "component1", "component2", "component3", "component4", "component5", "component6", "component6$stream_chat_android_ui_components_release", "copy", "equals", "other", "hashCode", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MessageListItemWrapper {
    private final boolean endOfNewMessagesReached;
    private final boolean hasNewMessages;
    private final boolean isThread;
    private final boolean isTyping;
    private final List<MessageListItem> items;
    private final NewMessageState newMessageState;

    public MessageListItemWrapper() {
        this(null, false, false, false, false, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessageListItemWrapper copy$default(MessageListItemWrapper messageListItemWrapper, List list, boolean z4, boolean z13, boolean z14, boolean z15, NewMessageState newMessageState, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = messageListItemWrapper.items;
        }
        if ((i13 & 2) != 0) {
            z4 = messageListItemWrapper.hasNewMessages;
        }
        if ((i13 & 4) != 0) {
            z13 = messageListItemWrapper.isTyping;
        }
        if ((i13 & 8) != 0) {
            z14 = messageListItemWrapper.isThread;
        }
        if ((i13 & 16) != 0) {
            z15 = messageListItemWrapper.endOfNewMessagesReached;
        }
        if ((i13 & 32) != 0) {
            newMessageState = messageListItemWrapper.newMessageState;
        }
        boolean z16 = z15;
        NewMessageState newMessageState2 = newMessageState;
        return messageListItemWrapper.copy(list, z4, z13, z14, z16, newMessageState2);
    }

    private final String stringify() {
        boolean z4 = this.endOfNewMessagesReached;
        boolean z13 = this.hasNewMessages;
        NewMessageState newMessageState = this.newMessageState;
        int size = this.items.size();
        MessageListItem messageListItem = (MessageListItem) AbstractC25265s.m74100H0(this.items);
        String strStringify = messageListItem != null ? messageListItem.stringify() : null;
        boolean z14 = this.isTyping;
        boolean z15 = this.isThread;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("MessageListItemWrapper(endOfNewMessagesReached=", ", hasNewMessages=", ", newMessageState=", z4, z13);
        sbM32002u.append(newMessageState);
        sbM32002u.append(", items=");
        sbM32002u.append(size);
        sbM32002u.append(", first: ");
        AbstractC38963t7.m124390t(sbM32002u, strStringify, ", isTyping=", z14, ", isThread=");
        return AbstractC18489d0.m53372m(sbM32002u, z15, ")");
    }

    public final List<MessageListItem> component1() {
        return this.items;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHasNewMessages() {
        return this.hasNewMessages;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsTyping() {
        return this.isTyping;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsThread() {
        return this.isThread;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getEndOfNewMessagesReached() {
        return this.endOfNewMessagesReached;
    }

    /* JADX INFO: renamed from: component6$stream_chat_android_ui_components_release, reason: from getter */
    public final NewMessageState getNewMessageState() {
        return this.newMessageState;
    }

    public final MessageListItemWrapper copy(List<? extends MessageListItem> items, boolean hasNewMessages, boolean isTyping, boolean isThread, boolean endOfNewMessagesReached, NewMessageState newMessageState) {
        AbstractC22676k.m65750j(items, "items");
        return new MessageListItemWrapper(items, hasNewMessages, isTyping, isThread, endOfNewMessagesReached, newMessageState);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageListItemWrapper)) {
            return false;
        }
        MessageListItemWrapper messageListItemWrapper = (MessageListItemWrapper) other;
        return AbstractC22676k.m65745e(this.items, messageListItemWrapper.items) && this.hasNewMessages == messageListItemWrapper.hasNewMessages && this.isTyping == messageListItemWrapper.isTyping && this.isThread == messageListItemWrapper.isThread && this.endOfNewMessagesReached == messageListItemWrapper.endOfNewMessagesReached && AbstractC22676k.m65745e(this.newMessageState, messageListItemWrapper.newMessageState);
    }

    public final boolean getEndOfNewMessagesReached() {
        return this.endOfNewMessagesReached;
    }

    public final boolean getHasNewMessages() {
        return this.hasNewMessages;
    }

    public final List<MessageListItem> getItems() {
        return this.items;
    }

    public final NewMessageState getNewMessageState$stream_chat_android_ui_components_release() {
        return this.newMessageState;
    }

    public final int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.items.hashCode() * 31, 31, this.hasNewMessages), 31, this.isTyping), 31, this.isThread), 31, this.endOfNewMessagesReached);
        NewMessageState newMessageState = this.newMessageState;
        return iM8289b + (newMessageState == null ? 0 : newMessageState.hashCode());
    }

    public final boolean isThread() {
        return this.isThread;
    }

    public final boolean isTyping() {
        return this.isTyping;
    }

    public final String toString() {
        return stringify();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessageListItemWrapper(List<? extends MessageListItem> items, boolean z4, boolean z13, boolean z14, boolean z15, NewMessageState newMessageState) {
        AbstractC22676k.m65750j(items, "items");
        this.items = items;
        this.hasNewMessages = z4;
        this.isTyping = z13;
        this.isThread = z14;
        this.endOfNewMessagesReached = z15;
        this.newMessageState = newMessageState;
    }

    public /* synthetic */ MessageListItemWrapper(List list, boolean z4, boolean z13, boolean z14, boolean z15, NewMessageState newMessageState, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25271y.f99162w : list, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? false : z14, (i13 & 16) != 0 ? true : z15, (i13 & 32) != 0 ? null : newMessageState);
    }
}
