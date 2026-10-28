package io.getstream.chat.android.p226ui.common.state.messages.composer;

import io.getstream.chat.android.client.utils.attachment.AttachmentUtilsKt;
import io.getstream.chat.android.models.AppSettings;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.common.utils.extensions.StringKt;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25260n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0014J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0014H\u0002J\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0014H\u0002J\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0014H\u0002J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006 "}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator;", "", "appSettings", "Lio/getstream/chat/android/models/AppSettings;", "maxAttachmentCount", "", "canSendLinks", "", "maxMessageLength", "<init>", "(Lio/getstream/chat/android/models/AppSettings;IZI)V", "getCanSendLinks", "()Z", "setCanSendLinks", "(Z)V", "getMaxMessageLength", "()I", "setMaxMessageLength", "(I)V", "validateMessage", "", "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;", "message", "", "attachments", "Lio/getstream/chat/android/models/Attachment;", "validateMessageLength", "validateAttachmentCount", "validateImageAttachmentSize", "validateFileAttachmentSize", "validateCanSendLinks", "Companion", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageValidator {
    public static final int $stable = 8;
    private static final int DEFAULT_MESSAGE_LENGTH = 5000;
    private final AppSettings appSettings;
    private boolean canSendLinks;
    private final int maxAttachmentCount;
    private int maxMessageLength;

    public MessageValidator(AppSettings appSettings, int i13, boolean z4, int i14) {
        AbstractC22676k.m65750j(appSettings, "appSettings");
        this.appSettings = appSettings;
        this.maxAttachmentCount = i13;
        this.canSendLinks = z4;
        this.maxMessageLength = i14;
    }

    private final ValidationError validateAttachmentCount(List<Attachment> attachments) {
        Integer numValueOf = Integer.valueOf(attachments.size());
        if (numValueOf.intValue() <= this.maxAttachmentCount) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return new ValidationError.AttachmentCountExceeded(numValueOf.intValue(), this.maxAttachmentCount);
        }
        return null;
    }

    private final ValidationError validateCanSendLinks(String message) {
        ValidationError.ContainsLinksWhenNotAllowed containsLinksWhenNotAllowed = ValidationError.ContainsLinksWhenNotAllowed.INSTANCE;
        if (this.canSendLinks || !StringKt.containsLinks(message)) {
            return null;
        }
        return containsLinksWhenNotAllowed;
    }

    private final ValidationError validateFileAttachmentSize(List<Attachment> attachments) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : attachments) {
            if (!AttachmentUtilsKt.isImage((Attachment) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((Attachment) obj2).getFileSize() > this.appSettings.getApp().getFileUploadConfig().getSizeLimitInBytes()) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        if (arrayList2 != null) {
            return new ValidationError.AttachmentSizeExceeded(arrayList2, this.appSettings.getApp().getFileUploadConfig().getSizeLimitInBytes());
        }
        return null;
    }

    private final ValidationError validateImageAttachmentSize(List<Attachment> attachments) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : attachments) {
            if (AttachmentUtilsKt.isImage((Attachment) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((Attachment) obj2).getFileSize() > this.appSettings.getApp().getImageUploadConfig().getSizeLimitInBytes()) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        if (arrayList2 != null) {
            return new ValidationError.AttachmentSizeExceeded(arrayList2, this.appSettings.getApp().getImageUploadConfig().getSizeLimitInBytes());
        }
        return null;
    }

    private final ValidationError validateMessageLength(String message) {
        Integer numValueOf = Integer.valueOf(message.length());
        if (numValueOf.intValue() <= this.maxMessageLength) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return new ValidationError.MessageLengthExceeded(numValueOf.intValue(), this.maxMessageLength);
        }
        return null;
    }

    public final boolean getCanSendLinks() {
        return this.canSendLinks;
    }

    public final int getMaxMessageLength() {
        return this.maxMessageLength;
    }

    public final void setCanSendLinks(boolean z4) {
        this.canSendLinks = z4;
    }

    public final void setMaxMessageLength(int i13) {
        this.maxMessageLength = i13;
    }

    public final List<ValidationError> validateMessage(String message, List<Attachment> attachments) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(attachments, "attachments");
        return AbstractC25260n.m74077r0(new ValidationError[]{validateMessageLength(message), validateAttachmentCount(attachments), validateImageAttachmentSize(attachments), validateFileAttachmentSize(attachments), validateCanSendLinks(message)});
    }

    public /* synthetic */ MessageValidator(AppSettings appSettings, int i13, boolean z4, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(appSettings, i13, (i15 & 4) != 0 ? true : z4, (i15 & 8) != 0 ? 5000 : i14);
    }
}
