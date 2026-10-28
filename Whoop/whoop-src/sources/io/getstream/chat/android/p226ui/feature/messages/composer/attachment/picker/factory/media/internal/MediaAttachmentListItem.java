package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.media.internal;

import io.getstream.chat.android.p226ui.common.state.messages.composer.AttachmentMetaData;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentListItem;", "", "MediaAttachmentItem", "AddMoreItem", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentListItem$AddMoreItem;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentListItem$MediaAttachmentItem;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface MediaAttachmentListItem {

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentListItem$AddMoreItem;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentListItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class AddMoreItem implements MediaAttachmentListItem {
        public static final AddMoreItem INSTANCE = new AddMoreItem();

        private AddMoreItem() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof AddMoreItem);
        }

        public final int hashCode() {
            return -981203826;
        }

        public final String toString() {
            return "AddMoreItem";
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentListItem$MediaAttachmentItem;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentListItem;", "attachment", "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;", "<init>", "(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)V", "getAttachment", "()Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class MediaAttachmentItem implements MediaAttachmentListItem {
        private final AttachmentMetaData attachment;

        public MediaAttachmentItem(AttachmentMetaData attachment) {
            AbstractC22676k.m65750j(attachment, "attachment");
            this.attachment = attachment;
        }

        public static /* synthetic */ MediaAttachmentItem copy$default(MediaAttachmentItem mediaAttachmentItem, AttachmentMetaData attachmentMetaData, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                attachmentMetaData = mediaAttachmentItem.attachment;
            }
            return mediaAttachmentItem.copy(attachmentMetaData);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AttachmentMetaData getAttachment() {
            return this.attachment;
        }

        public final MediaAttachmentItem copy(AttachmentMetaData attachment) {
            AbstractC22676k.m65750j(attachment, "attachment");
            return new MediaAttachmentItem(attachment);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MediaAttachmentItem) && AbstractC22676k.m65745e(this.attachment, ((MediaAttachmentItem) other).attachment);
        }

        public final AttachmentMetaData getAttachment() {
            return this.attachment;
        }

        public final int hashCode() {
            return this.attachment.hashCode();
        }

        public final String toString() {
            return "MediaAttachmentItem(attachment=" + this.attachment + ")";
        }
    }
}
