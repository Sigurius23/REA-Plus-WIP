package io.getstream.chat.android.p226ui.common.state.messages;

import io.getstream.chat.android.client.api.state.ThreadState;
import io.getstream.chat.android.models.Message;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/MessageMode;", "", "<init>", "()V", "Normal", "MessageThread", "Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;", "Lio/getstream/chat/android/ui/common/state/messages/MessageMode$Normal;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class MessageMode {
    public static final int $stable = 0;

    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;", "Lio/getstream/chat/android/ui/common/state/messages/MessageMode;", "parentMessage", "Lio/getstream/chat/android/models/Message;", "threadState", "Lio/getstream/chat/android/client/api/state/ThreadState;", "<init>", "(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/api/state/ThreadState;)V", "getParentMessage", "()Lio/getstream/chat/android/models/Message;", "getThreadState", "()Lio/getstream/chat/android/client/api/state/ThreadState;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class MessageThread extends MessageMode {
        public static final int $stable = 8;
        private final Message parentMessage;
        private final ThreadState threadState;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public MessageThread(Message parentMessage) {
            this(parentMessage, null, 2, 0 == true ? 1 : 0);
            AbstractC22676k.m65750j(parentMessage, "parentMessage");
        }

        public static /* synthetic */ MessageThread copy$default(MessageThread messageThread, Message message, ThreadState threadState, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                message = messageThread.parentMessage;
            }
            if ((i13 & 2) != 0) {
                threadState = messageThread.threadState;
            }
            return messageThread.copy(message, threadState);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Message getParentMessage() {
            return this.parentMessage;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ThreadState getThreadState() {
            return this.threadState;
        }

        public final MessageThread copy(Message parentMessage, ThreadState threadState) {
            AbstractC22676k.m65750j(parentMessage, "parentMessage");
            return new MessageThread(parentMessage, threadState);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MessageThread)) {
                return false;
            }
            MessageThread messageThread = (MessageThread) other;
            return AbstractC22676k.m65745e(this.parentMessage, messageThread.parentMessage) && AbstractC22676k.m65745e(this.threadState, messageThread.threadState);
        }

        public final Message getParentMessage() {
            return this.parentMessage;
        }

        public final ThreadState getThreadState() {
            return this.threadState;
        }

        public final int hashCode() {
            int iHashCode = this.parentMessage.hashCode() * 31;
            ThreadState threadState = this.threadState;
            return iHashCode + (threadState == null ? 0 : threadState.hashCode());
        }

        public final String toString() {
            return "MessageThread(parentMessage=" + this.parentMessage + ", threadState=" + this.threadState + ")";
        }

        public MessageThread(Message parentMessage, ThreadState threadState) {
            AbstractC22676k.m65750j(parentMessage, "parentMessage");
            this.parentMessage = parentMessage;
            this.threadState = threadState;
        }

        public /* synthetic */ MessageThread(Message message, ThreadState threadState, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(message, (i13 & 2) != 0 ? null : threadState);
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/MessageMode$Normal;", "Lio/getstream/chat/android/ui/common/state/messages/MessageMode;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class Normal extends MessageMode {
        public static final int $stable = 0;
        public static final Normal INSTANCE = new Normal();

        private Normal() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof Normal);
        }

        public final int hashCode() {
            return 30099954;
        }

        public final String toString() {
            return "Normal";
        }
    }

    private MessageMode() {
    }

    public MessageMode(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
