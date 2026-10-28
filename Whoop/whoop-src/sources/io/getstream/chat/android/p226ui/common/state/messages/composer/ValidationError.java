package io.getstream.chat.android.p226ui.common.state.messages.composer;

import io.getstream.chat.android.models.Attachment;
import java.util.List;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;", "", "<init>", "()V", "MessageLengthExceeded", "AttachmentSizeExceeded", "AttachmentCountExceeded", "ContainsLinksWhenNotAllowed", "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentCountExceeded;", "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentSizeExceeded;", "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$ContainsLinksWhenNotAllowed;", "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$MessageLengthExceeded;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class ValidationError {
    public static final int $stable = 0;

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentCountExceeded;", "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;", "attachmentCount", "", "maxAttachmentCount", "<init>", "(II)V", "getAttachmentCount", "()I", "getMaxAttachmentCount", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class AttachmentCountExceeded extends ValidationError {
        public static final int $stable = 0;
        private final int attachmentCount;
        private final int maxAttachmentCount;

        public AttachmentCountExceeded(int i13, int i14) {
            this.attachmentCount = i13;
            this.maxAttachmentCount = i14;
        }

        public static AttachmentCountExceeded copy$default(AttachmentCountExceeded attachmentCountExceeded, int i13, int i14, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                i13 = attachmentCountExceeded.attachmentCount;
            }
            if ((i15 & 2) != 0) {
                i14 = attachmentCountExceeded.maxAttachmentCount;
            }
            attachmentCountExceeded.getClass();
            return new AttachmentCountExceeded(i13, i14);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getAttachmentCount() {
            return this.attachmentCount;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getMaxAttachmentCount() {
            return this.maxAttachmentCount;
        }

        public final AttachmentCountExceeded copy(int attachmentCount, int maxAttachmentCount) {
            return new AttachmentCountExceeded(attachmentCount, maxAttachmentCount);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AttachmentCountExceeded)) {
                return false;
            }
            AttachmentCountExceeded attachmentCountExceeded = (AttachmentCountExceeded) other;
            return this.attachmentCount == attachmentCountExceeded.attachmentCount && this.maxAttachmentCount == attachmentCountExceeded.maxAttachmentCount;
        }

        public final int getAttachmentCount() {
            return this.attachmentCount;
        }

        public final int getMaxAttachmentCount() {
            return this.maxAttachmentCount;
        }

        public final int hashCode() {
            return Integer.hashCode(this.maxAttachmentCount) + (Integer.hashCode(this.attachmentCount) * 31);
        }

        public final String toString() {
            return AbstractC25012a.m73372e(this.attachmentCount, this.maxAttachmentCount, "AttachmentCountExceeded(attachmentCount=", ", maxAttachmentCount=", ")");
        }
    }

    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentSizeExceeded;", "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;", "attachments", "", "Lio/getstream/chat/android/models/Attachment;", "maxAttachmentSize", "", "<init>", "(Ljava/util/List;J)V", "getAttachments", "()Ljava/util/List;", "getMaxAttachmentSize", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class AttachmentSizeExceeded extends ValidationError {
        public static final int $stable = 8;
        private final List<Attachment> attachments;
        private final long maxAttachmentSize;

        public AttachmentSizeExceeded(List<Attachment> attachments, long j7) {
            AbstractC22676k.m65750j(attachments, "attachments");
            this.attachments = attachments;
            this.maxAttachmentSize = j7;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AttachmentSizeExceeded copy$default(AttachmentSizeExceeded attachmentSizeExceeded, List list, long j7, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                list = attachmentSizeExceeded.attachments;
            }
            if ((i13 & 2) != 0) {
                j7 = attachmentSizeExceeded.maxAttachmentSize;
            }
            return attachmentSizeExceeded.copy(list, j7);
        }

        public final List<Attachment> component1() {
            return this.attachments;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getMaxAttachmentSize() {
            return this.maxAttachmentSize;
        }

        public final AttachmentSizeExceeded copy(List<Attachment> attachments, long maxAttachmentSize) {
            AbstractC22676k.m65750j(attachments, "attachments");
            return new AttachmentSizeExceeded(attachments, maxAttachmentSize);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AttachmentSizeExceeded)) {
                return false;
            }
            AttachmentSizeExceeded attachmentSizeExceeded = (AttachmentSizeExceeded) other;
            return AbstractC22676k.m65745e(this.attachments, attachmentSizeExceeded.attachments) && this.maxAttachmentSize == attachmentSizeExceeded.maxAttachmentSize;
        }

        public final List<Attachment> getAttachments() {
            return this.attachments;
        }

        public final long getMaxAttachmentSize() {
            return this.maxAttachmentSize;
        }

        public final int hashCode() {
            return Long.hashCode(this.maxAttachmentSize) + (this.attachments.hashCode() * 31);
        }

        public final String toString() {
            return "AttachmentSizeExceeded(attachments=" + this.attachments + ", maxAttachmentSize=" + this.maxAttachmentSize + ")";
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$ContainsLinksWhenNotAllowed;", "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;", "<init>", "()V", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class ContainsLinksWhenNotAllowed extends ValidationError {
        public static final int $stable = 0;
        public static final ContainsLinksWhenNotAllowed INSTANCE = new ContainsLinksWhenNotAllowed();

        private ContainsLinksWhenNotAllowed() {
        }

        public final String toString() {
            return "ContainsLinksWhenNotAllowed";
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$MessageLengthExceeded;", "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;", "messageLength", "", "maxMessageLength", "<init>", "(II)V", "getMessageLength", "()I", "getMaxMessageLength", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class MessageLengthExceeded extends ValidationError {
        public static final int $stable = 0;
        private final int maxMessageLength;
        private final int messageLength;

        public MessageLengthExceeded(int i13, int i14) {
            this.messageLength = i13;
            this.maxMessageLength = i14;
        }

        public static MessageLengthExceeded copy$default(MessageLengthExceeded messageLengthExceeded, int i13, int i14, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                i13 = messageLengthExceeded.messageLength;
            }
            if ((i15 & 2) != 0) {
                i14 = messageLengthExceeded.maxMessageLength;
            }
            messageLengthExceeded.getClass();
            return new MessageLengthExceeded(i13, i14);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getMessageLength() {
            return this.messageLength;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getMaxMessageLength() {
            return this.maxMessageLength;
        }

        public final MessageLengthExceeded copy(int messageLength, int maxMessageLength) {
            return new MessageLengthExceeded(messageLength, maxMessageLength);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MessageLengthExceeded)) {
                return false;
            }
            MessageLengthExceeded messageLengthExceeded = (MessageLengthExceeded) other;
            return this.messageLength == messageLengthExceeded.messageLength && this.maxMessageLength == messageLengthExceeded.maxMessageLength;
        }

        public final int getMaxMessageLength() {
            return this.maxMessageLength;
        }

        public final int getMessageLength() {
            return this.messageLength;
        }

        public final int hashCode() {
            return Integer.hashCode(this.maxMessageLength) + (Integer.hashCode(this.messageLength) * 31);
        }

        public final String toString() {
            return AbstractC25012a.m73372e(this.messageLength, this.maxMessageLength, "MessageLengthExceeded(messageLength=", ", maxMessageLength=", ")");
        }
    }

    private ValidationError() {
    }

    public ValidationError(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
