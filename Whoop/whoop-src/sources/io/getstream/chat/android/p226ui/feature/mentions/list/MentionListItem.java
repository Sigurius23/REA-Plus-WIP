package io.getstream.chat.android.p226ui.feature.mentions.list;

import io.getstream.chat.android.p226ui.common.model.MessageResult;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/mentions/list/MentionListItem;", "", "id", "", "getId", "()J", "MessageItem", "LoadingItem", "Lio/getstream/chat/android/ui/feature/mentions/list/MentionListItem$LoadingItem;", "Lio/getstream/chat/android/ui/feature/mentions/list/MentionListItem$MessageItem;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface MentionListItem {

    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/mentions/list/MentionListItem$LoadingItem;", "Lio/getstream/chat/android/ui/feature/mentions/list/MentionListItem;", "<init>", "()V", "id", "", "getId", "()J", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class LoadingItem implements MentionListItem {
        public static final LoadingItem INSTANCE = new LoadingItem();
        private static final long id = Long.MIN_VALUE;

        private LoadingItem() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof LoadingItem);
        }

        @Override // io.getstream.chat.android.p226ui.feature.mentions.list.MentionListItem
        public final long getId() {
            return id;
        }

        public final int hashCode() {
            return 1206895252;
        }

        public final String toString() {
            return "LoadingItem";
        }
    }

    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/mentions/list/MentionListItem$MessageItem;", "Lio/getstream/chat/android/ui/feature/mentions/list/MentionListItem;", "message", "Lio/getstream/chat/android/ui/common/model/MessageResult;", "<init>", "(Lio/getstream/chat/android/ui/common/model/MessageResult;)V", "getMessage", "()Lio/getstream/chat/android/ui/common/model/MessageResult;", "id", "", "getId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class MessageItem implements MentionListItem {
        private final long id;
        private final MessageResult message;

        public MessageItem(MessageResult message) {
            AbstractC22676k.m65750j(message, "message");
            this.message = message;
            this.id = message.getMessage().identifierHash();
        }

        public static /* synthetic */ MessageItem copy$default(MessageItem messageItem, MessageResult messageResult, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                messageResult = messageItem.message;
            }
            return messageItem.copy(messageResult);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final MessageResult getMessage() {
            return this.message;
        }

        public final MessageItem copy(MessageResult message) {
            AbstractC22676k.m65750j(message, "message");
            return new MessageItem(message);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MessageItem) && AbstractC22676k.m65745e(this.message, ((MessageItem) other).message);
        }

        @Override // io.getstream.chat.android.p226ui.feature.mentions.list.MentionListItem
        public final long getId() {
            return this.id;
        }

        public final MessageResult getMessage() {
            return this.message;
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final String toString() {
            return "MessageItem(message=" + this.message + ")";
        }
    }

    long getId();
}
