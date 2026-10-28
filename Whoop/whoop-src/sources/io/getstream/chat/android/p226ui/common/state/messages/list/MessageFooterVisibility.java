package io.getstream.chat.android.p226ui.common.state.messages.list;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;", "", "<init>", "()V", "Never", "LastInGroup", "Always", "Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility$Always;", "Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility$LastInGroup;", "Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility$Never;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class MessageFooterVisibility {
    public static final int $stable = 0;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility$Always;", "Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;", "<init>", "()V", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Always extends MessageFooterVisibility {
        public static final int $stable = 0;
        public static final Always INSTANCE = new Always();

        private Always() {
        }

        public final String toString() {
            return "Always";
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility$LastInGroup;", "Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;", "<init>", "()V", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class LastInGroup extends MessageFooterVisibility {
        public static final int $stable = 0;
        public static final LastInGroup INSTANCE = new LastInGroup();

        private LastInGroup() {
        }

        public final String toString() {
            return "LastInGroup";
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility$Never;", "Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;", "<init>", "()V", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Never extends MessageFooterVisibility {
        public static final int $stable = 0;
        public static final Never INSTANCE = new Never();

        private Never() {
        }

        public final String toString() {
            return "Never";
        }
    }

    private MessageFooterVisibility() {
    }

    public MessageFooterVisibility(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
