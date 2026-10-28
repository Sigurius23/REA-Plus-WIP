package io.getstream.chat.android.p226ui.common.feature.channel.attachments;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewAction;", "", "LoadMoreRequested", "Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewAction$LoadMoreRequested;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ChannelAttachmentsViewAction {

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewAction$LoadMoreRequested;", "Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class LoadMoreRequested implements ChannelAttachmentsViewAction {
        public static final int $stable = 0;
        public static final LoadMoreRequested INSTANCE = new LoadMoreRequested();

        private LoadMoreRequested() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof LoadMoreRequested);
        }

        public final int hashCode() {
            return 121175308;
        }

        public final String toString() {
            return "LoadMoreRequested";
        }
    }
}
