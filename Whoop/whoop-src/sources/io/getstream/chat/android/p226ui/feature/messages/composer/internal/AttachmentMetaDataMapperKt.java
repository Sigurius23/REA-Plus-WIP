package io.getstream.chat.android.p226ui.feature.messages.composer.internal;

import android.content.Context;
import android.net.Uri;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.common.helper.internal.AttachmentStorageHelper;
import io.getstream.chat.android.p226ui.common.helper.internal.StorageHelper;
import io.getstream.chat.android.p226ui.common.state.messages.composer.AttachmentMetaData;
import java.io.File;
import java.util.Map;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, m65681d2 = {"toAttachment", "Lio/getstream/chat/android/models/Attachment;", "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;", "context", "Landroid/content/Context;", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AttachmentMetaDataMapperKt {
    public static final Attachment toAttachment(AttachmentMetaData attachmentMetaData, Context context) {
        String str;
        AbstractC22676k.m65750j(attachmentMetaData, "<this>");
        AbstractC22676k.m65750j(context, "context");
        File cachedFileFromUri = new StorageHelper().getCachedFileFromUri(context, attachmentMetaData);
        if (cachedFileFromUri == null && attachmentMetaData.getUri() != null) {
            return null;
        }
        Uri uri = attachmentMetaData.getUri();
        Map mapM95645u = uri != null ? AbstractC31061c.m95645u(AttachmentStorageHelper.EXTRA_SOURCE_URI, uri.toString()) : C25272z.f99163w;
        String type = attachmentMetaData.getType();
        String title = attachmentMetaData.getTitle();
        if (title != null) {
            str = title;
        } else {
            String name = cachedFileFromUri != null ? cachedFileFromUri.getName() : null;
            if (name == null) {
                title = "";
                str = title;
            } else {
                str = name;
            }
        }
        return new Attachment(null, null, null, null, null, null, null, attachmentMetaData.getMimeType(), (int) attachmentMetaData.getSize(), attachmentMetaData.getTitle(), null, type, null, str, null, null, null, cachedFileFromUri, null, mapM95645u, 382079, null);
    }
}
