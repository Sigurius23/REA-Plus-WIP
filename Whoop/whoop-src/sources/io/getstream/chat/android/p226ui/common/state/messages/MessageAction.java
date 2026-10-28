package io.getstream.chat.android.p226ui.common.state.messages;

import io.getstream.chat.android.models.Message;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u000f\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/MessageAction;", "", "<init>", "()V", "message", "Lio/getstream/chat/android/models/Message;", "getMessage", "()Lio/getstream/chat/android/models/Message;", "Lio/getstream/chat/android/ui/common/state/messages/BlockUser;", "Lio/getstream/chat/android/ui/common/state/messages/Copy;", "Lio/getstream/chat/android/ui/common/state/messages/CustomAction;", "Lio/getstream/chat/android/ui/common/state/messages/Delete;", "Lio/getstream/chat/android/ui/common/state/messages/Edit;", "Lio/getstream/chat/android/ui/common/state/messages/Flag;", "Lio/getstream/chat/android/ui/common/state/messages/MarkAsUnread;", "Lio/getstream/chat/android/ui/common/state/messages/MuteUser;", "Lio/getstream/chat/android/ui/common/state/messages/Pin;", "Lio/getstream/chat/android/ui/common/state/messages/React;", "Lio/getstream/chat/android/ui/common/state/messages/Reply;", "Lio/getstream/chat/android/ui/common/state/messages/Resend;", "Lio/getstream/chat/android/ui/common/state/messages/ThreadReply;", "Lio/getstream/chat/android/ui/common/state/messages/UnblockUser;", "Lio/getstream/chat/android/ui/common/state/messages/UnmuteUser;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class MessageAction {
    public static final int $stable = 0;

    private MessageAction() {
    }

    public abstract Message getMessage();

    public MessageAction(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
