package io.getstream.chat.android.p226ui.common.state.messages.list;

import io.getstream.chat.android.models.ChannelUserRead;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.User;
import java.util.List;
import java.util.Set;
import m83.C25271y;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B£\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0007\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u00102\u001a\u00020\rHÆ\u0003J\t\u00103\u001a\u00020\u0007HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017HÆ\u0003J\t\u00109\u001a\u00020\u0007HÆ\u0003J§\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00072\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0007HÆ\u0001J\u0013\u0010;\u001a\u00020\u00072\b\u0010<\u001a\u0004\u0018\u00010=HÖ\u0003J\t\u0010>\u001a\u00020?HÖ\u0001J\t\u0010@\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u001fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001fR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0015\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0018\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u001f¨\u0006A"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;", "Lio/getstream/chat/android/ui/common/state/messages/list/HasMessageListItemState;", "message", "Lio/getstream/chat/android/models/Message;", "parentMessageId", "", "isMine", "", "isInThread", "showMessageFooter", "currentUser", "Lio/getstream/chat/android/models/User;", "groupPosition", "Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;", "isMessageRead", "isMessageDelivered", "focusState", "Lio/getstream/chat/android/ui/common/state/messages/list/MessageFocusState;", "messageReadBy", "", "Lio/getstream/chat/android/models/ChannelUserRead;", "showOriginalText", "ownCapabilities", "", "isPreviewMode", "<init>", "(Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZZZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;ZZLio/getstream/chat/android/ui/common/state/messages/list/MessageFocusState;Ljava/util/List;ZLjava/util/Set;Z)V", "getMessage", "()Lio/getstream/chat/android/models/Message;", "getParentMessageId", "()Ljava/lang/String;", "()Z", "getShowMessageFooter", "getCurrentUser", "()Lio/getstream/chat/android/models/User;", "getGroupPosition", "()Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;", "getFocusState", "()Lio/getstream/chat/android/ui/common/state/messages/list/MessageFocusState;", "getMessageReadBy", "()Ljava/util/List;", "getShowOriginalText", "getOwnCapabilities", "()Ljava/util/Set;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "", "hashCode", "", "toString", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MessageItemState extends HasMessageListItemState {
    public static final int $stable = 8;
    private final User currentUser;
    private final MessageFocusState focusState;
    private final MessagePosition groupPosition;
    private final boolean isInThread;
    private final boolean isMessageDelivered;
    private final boolean isMessageRead;
    private final boolean isMine;
    private final boolean isPreviewMode;
    private final Message message;
    private final List<ChannelUserRead> messageReadBy;
    private final Set<String> ownCapabilities;
    private final String parentMessageId;
    private final boolean showMessageFooter;
    private final boolean showOriginalText;

    public MessageItemState(Message message, String str, boolean z4, boolean z13, boolean z14, User user, MessagePosition groupPosition, boolean z15, boolean z16, MessageFocusState messageFocusState, List<ChannelUserRead> messageReadBy, boolean z17, Set<String> ownCapabilities, boolean z18) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(groupPosition, "groupPosition");
        AbstractC22676k.m65750j(messageReadBy, "messageReadBy");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        this.message = message;
        this.parentMessageId = str;
        this.isMine = z4;
        this.isInThread = z13;
        this.showMessageFooter = z14;
        this.currentUser = user;
        this.groupPosition = groupPosition;
        this.isMessageRead = z15;
        this.isMessageDelivered = z16;
        this.focusState = messageFocusState;
        this.messageReadBy = messageReadBy;
        this.showOriginalText = z17;
        this.ownCapabilities = ownCapabilities;
        this.isPreviewMode = z18;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Message getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final MessageFocusState getFocusState() {
        return this.focusState;
    }

    public final List<ChannelUserRead> component11() {
        return this.messageReadBy;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getShowOriginalText() {
        return this.showOriginalText;
    }

    public final Set<String> component13() {
        return this.ownCapabilities;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getIsPreviewMode() {
        return this.isPreviewMode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getParentMessageId() {
        return this.parentMessageId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsMine() {
        return this.isMine;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsInThread() {
        return this.isInThread;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getShowMessageFooter() {
        return this.showMessageFooter;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final User getCurrentUser() {
        return this.currentUser;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final MessagePosition getGroupPosition() {
        return this.groupPosition;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsMessageRead() {
        return this.isMessageRead;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsMessageDelivered() {
        return this.isMessageDelivered;
    }

    public final MessageItemState copy(Message message, String parentMessageId, boolean isMine, boolean isInThread, boolean showMessageFooter, User currentUser, MessagePosition groupPosition, boolean isMessageRead, boolean isMessageDelivered, MessageFocusState focusState, List<ChannelUserRead> messageReadBy, boolean showOriginalText, Set<String> ownCapabilities, boolean isPreviewMode) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(groupPosition, "groupPosition");
        AbstractC22676k.m65750j(messageReadBy, "messageReadBy");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        return new MessageItemState(message, parentMessageId, isMine, isInThread, showMessageFooter, currentUser, groupPosition, isMessageRead, isMessageDelivered, focusState, messageReadBy, showOriginalText, ownCapabilities, isPreviewMode);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageItemState)) {
            return false;
        }
        MessageItemState messageItemState = (MessageItemState) other;
        return AbstractC22676k.m65745e(this.message, messageItemState.message) && AbstractC22676k.m65745e(this.parentMessageId, messageItemState.parentMessageId) && this.isMine == messageItemState.isMine && this.isInThread == messageItemState.isInThread && this.showMessageFooter == messageItemState.showMessageFooter && AbstractC22676k.m65745e(this.currentUser, messageItemState.currentUser) && this.groupPosition == messageItemState.groupPosition && this.isMessageRead == messageItemState.isMessageRead && this.isMessageDelivered == messageItemState.isMessageDelivered && AbstractC22676k.m65745e(this.focusState, messageItemState.focusState) && AbstractC22676k.m65745e(this.messageReadBy, messageItemState.messageReadBy) && this.showOriginalText == messageItemState.showOriginalText && AbstractC22676k.m65745e(this.ownCapabilities, messageItemState.ownCapabilities) && this.isPreviewMode == messageItemState.isPreviewMode;
    }

    public final User getCurrentUser() {
        return this.currentUser;
    }

    public final MessageFocusState getFocusState() {
        return this.focusState;
    }

    public final MessagePosition getGroupPosition() {
        return this.groupPosition;
    }

    @Override // io.getstream.chat.android.p226ui.common.state.messages.list.HasMessageListItemState
    public final Message getMessage() {
        return this.message;
    }

    public final List<ChannelUserRead> getMessageReadBy() {
        return this.messageReadBy;
    }

    public final Set<String> getOwnCapabilities() {
        return this.ownCapabilities;
    }

    public final String getParentMessageId() {
        return this.parentMessageId;
    }

    public final boolean getShowMessageFooter() {
        return this.showMessageFooter;
    }

    public final boolean getShowOriginalText() {
        return this.showOriginalText;
    }

    public final int hashCode() {
        int iHashCode = this.message.hashCode() * 31;
        String str = this.parentMessageId;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isMine), 31, this.isInThread), 31, this.showMessageFooter);
        User user = this.currentUser;
        int iM8289b2 = AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.groupPosition.hashCode() + ((iM8289b + (user == null ? 0 : user.hashCode())) * 31)) * 31, 31, this.isMessageRead), 31, this.isMessageDelivered);
        MessageFocusState messageFocusState = this.focusState;
        return Boolean.hashCode(this.isPreviewMode) + AbstractC25012a.m73368a(this.ownCapabilities, AbstractC2875y.m8289b(AbstractC11895b.m31983b((iM8289b2 + (messageFocusState != null ? messageFocusState.hashCode() : 0)) * 31, 31, this.messageReadBy), 31, this.showOriginalText), 31);
    }

    public final boolean isInThread() {
        return this.isInThread;
    }

    public final boolean isMessageDelivered() {
        return this.isMessageDelivered;
    }

    public final boolean isMessageRead() {
        return this.isMessageRead;
    }

    public final boolean isMine() {
        return this.isMine;
    }

    public final boolean isPreviewMode() {
        return this.isPreviewMode;
    }

    public final String toString() {
        Message message = this.message;
        String str = this.parentMessageId;
        boolean z4 = this.isMine;
        boolean z13 = this.isInThread;
        boolean z14 = this.showMessageFooter;
        User user = this.currentUser;
        MessagePosition messagePosition = this.groupPosition;
        boolean z15 = this.isMessageRead;
        boolean z16 = this.isMessageDelivered;
        MessageFocusState messageFocusState = this.focusState;
        List<ChannelUserRead> list = this.messageReadBy;
        boolean z17 = this.showOriginalText;
        Set<String> set = this.ownCapabilities;
        boolean z18 = this.isPreviewMode;
        StringBuilder sb4 = new StringBuilder("MessageItemState(message=");
        sb4.append(message);
        sb4.append(", parentMessageId=");
        sb4.append(str);
        sb4.append(", isMine=");
        AbstractC38963t7.m124392v(sb4, z4, ", isInThread=", z13, ", showMessageFooter=");
        sb4.append(z14);
        sb4.append(", currentUser=");
        sb4.append(user);
        sb4.append(", groupPosition=");
        sb4.append(messagePosition);
        sb4.append(", isMessageRead=");
        sb4.append(z15);
        sb4.append(", isMessageDelivered=");
        sb4.append(z16);
        sb4.append(", focusState=");
        sb4.append(messageFocusState);
        sb4.append(", messageReadBy=");
        AbstractC26725a.m79512p(", showOriginalText=", ", ownCapabilities=", sb4, list, z17);
        sb4.append(set);
        sb4.append(", isPreviewMode=");
        sb4.append(z18);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ MessageItemState(Message message, String str, boolean z4, boolean z13, boolean z14, User user, MessagePosition messagePosition, boolean z15, boolean z16, MessageFocusState messageFocusState, List list, boolean z17, Set set, boolean z18, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new Message(null, null, null, null, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, null, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, false, -1, 65535, null) : message, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? false : z13, (i13 & 16) != 0 ? false : z14, (i13 & 32) != 0 ? null : user, (i13 & 64) != 0 ? MessagePosition.NONE : messagePosition, (i13 & 128) != 0 ? false : z15, (i13 & 256) != 0 ? false : z16, (i13 & 512) != 0 ? null : messageFocusState, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? C25271y.f99162w : list, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? false : z17, set, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? false : z18);
    }
}
