package io.getstream.chat.android.p226ui.common.helper.internal;

import android.webkit.MimeTypeMap;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.p226ui.common.state.messages.composer.AttachmentMetaData;
import p715kotlin.Metadata;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m65681d2 = {"getTitleWithExtension", "", "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;", "stream-chat-android-ui-common_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class StorageHelperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String getTitleWithExtension(AttachmentMetaData attachmentMetaData) {
        String mimeType;
        String title = attachmentMetaData.getTitle();
        String strM125860F0 = title != null ? AbstractC39414r.m125860F0('.', title, title) : null;
        String title2 = attachmentMetaData.getTitle();
        String strM125926K = title2 != null ? AbstractC39421y.m125926K(AbstractC39421y.m125926K(AbstractC39421y.m125926K(title2, " ", "_", false), "(", "_", false), ")", "_", false) : null;
        if ((strM125860F0 != null && strM125860F0.length() != 0) || (mimeType = attachmentMetaData.getMimeType()) == null || mimeType.length() == 0) {
            return strM125926K == null ? "" : strM125926K;
        }
        return AbstractC18489d0.m53370k(strM125926K, ".", MimeTypeMap.getSingleton().getExtensionFromMimeType(attachmentMetaData.getMimeType()));
    }
}
