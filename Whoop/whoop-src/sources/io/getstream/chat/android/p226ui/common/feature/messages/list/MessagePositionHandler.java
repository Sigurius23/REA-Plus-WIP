package io.getstream.chat.android.p226ui.common.feature.messages.list;

import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.extensions.MessageExtensionsKt;
import io.getstream.chat.android.client.extensions.internal.MessageKt;
import io.getstream.chat.android.client.utils.message.MessageUtils;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.common.state.messages.list.MessagePosition;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \f2\u00020\u0001:\u0001\fJ<\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH&¨\u0006\rÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;", "", "handleMessagePosition", "Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;", "previousMessage", "Lio/getstream/chat/android/models/Message;", "message", "nextMessage", "isAfterDateSeparator", "", "isBeforeDateSeparator", "isInThread", "Companion", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface MessagePositionHandler {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005H\u0007J\u0016\u0010\t\u001a\u00020\n*\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J \u0010\u000e\u001a\u00020\n*\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler$Companion;", "", "<init>", "()V", "DEFAULT_MAX_GROUP_TIME_MILLIS", "", "defaultHandler", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;", "maxGroupTimeMillis", "isValidMessageFromUser", "", "Lio/getstream/chat/android/models/Message;", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "exceedsMaxTimeDifference", "other", "maxMillis", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final long DEFAULT_MAX_GROUP_TIME_MILLIS = 60000;

        private Companion() {
        }

        public static MessagePositionHandler defaultHandler$default(Companion companion, long j7, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                j7 = 60000;
            }
            companion.getClass();
            return new C19592h(j7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:9:0x001d  */
        public static final MessagePosition defaultHandler$lambda$0(long j7, Message message, Message message2, Message message3, boolean z4, boolean z13, boolean z14) {
            boolean z15;
            AbstractC22676k.m65750j(message2, "message");
            boolean z16 = false;
            if (z4) {
                z15 = false;
            } else {
                Companion companion = $$INSTANCE;
                if (!companion.isValidMessageFromUser(message, message2.getUser()) || companion.exceedsMaxTimeDifference(message2, message, j7)) {
                    z15 = false;
                } else {
                    z15 = true;
                }
            }
            if (!z13) {
                Companion companion2 = $$INSTANCE;
                if (companion2.isValidMessageFromUser(message3, message2.getUser()) && !companion2.exceedsMaxTimeDifference(message3, message2, j7)) {
                    z16 = true;
                }
            }
            if (z16 && !z15) {
                return MessagePosition.TOP;
            }
            if (z16 && z15) {
                return MessagePosition.MIDDLE;
            }
            return z15 ? MessagePosition.BOTTOM : MessagePosition.NONE;
        }

        private final boolean exceedsMaxTimeDifference(Message message, Message message2, long j7) {
            return (message == null || message2 == null || Math.abs(MessageExtensionsKt.getCreatedAtOrDefault(message, MessageKt.getNEVER()).getTime() - MessageExtensionsKt.getCreatedAtOrDefault(message2, MessageKt.getNEVER()).getTime()) <= j7) ? false : true;
        }

        private final boolean isValidMessageFromUser(Message message, User user) {
            return (message == null || MessageUtils.isSystem(message) || MessageUtils.isError(message) || !AbstractC22676k.m65745e(message.getUser().getId(), user.getId())) ? false : true;
        }

        @InternalStreamChatApi
        public final MessagePositionHandler defaultHandler(long maxGroupTimeMillis) {
            return new C19592h(maxGroupTimeMillis);
        }
    }

    MessagePosition handleMessagePosition(Message previousMessage, Message message, Message nextMessage, boolean isAfterDateSeparator, boolean isBeforeDateSeparator, boolean isInThread);
}
