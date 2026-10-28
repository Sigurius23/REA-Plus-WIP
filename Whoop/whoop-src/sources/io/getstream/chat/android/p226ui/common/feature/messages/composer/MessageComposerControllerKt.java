package io.getstream.chat.android.p226ui.common.feature.messages.composer;

import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.common.helper.internal.AttachmentStorageHelper;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0004"}, m65681d2 = {"sourceUriString", "", "Lio/getstream/chat/android/models/Attachment;", "attachmentKey", "stream-chat-android-ui-common_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageComposerControllerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String attachmentKey(Attachment attachment) {
        String strSourceUriString = sourceUriString(attachment);
        if (strSourceUriString != null) {
            return strSourceUriString;
        }
        String name = attachment.getName();
        if (name == null) {
            name = "";
        }
        String mimeType = attachment.getMimeType();
        String str = mimeType != null ? mimeType : "";
        int fileSize = attachment.getFileSize();
        StringBuilder sbM32001t = AbstractC11895b.m32001t("fallback:", name, ":", str, ":");
        sbM32001t.append(fileSize);
        return sbM32001t.toString();
    }

    private static final String sourceUriString(Attachment attachment) {
        Object obj = attachment.getExtraData().get(AttachmentStorageHelper.EXTRA_SOURCE_URI);
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }
}
