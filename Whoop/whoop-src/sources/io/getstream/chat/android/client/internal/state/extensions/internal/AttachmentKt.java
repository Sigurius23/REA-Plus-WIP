package io.getstream.chat.android.client.internal.state.extensions.internal;

import io.getstream.chat.android.models.Attachment;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m65681d2 = {"parseAttachmentNameFromUrl", "", "Lio/getstream/chat/android/models/Attachment;", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AttachmentKt {
    public static final String parseAttachmentNameFromUrl(Attachment attachment) {
        String assetUrl;
        AbstractC22676k.m65750j(attachment, "<this>");
        if (AbstractC22676k.m65745e(attachment.getType(), "image")) {
            assetUrl = attachment.getImageUrl();
            if (assetUrl == null && (assetUrl = attachment.getAssetUrl()) == null) {
                assetUrl = attachment.getThumbUrl();
            }
        } else {
            assetUrl = attachment.getAssetUrl();
            if (assetUrl == null && (assetUrl = attachment.getImageUrl()) == null) {
                assetUrl = attachment.getThumbUrl();
            }
        }
        if (assetUrl == null) {
            return null;
        }
        String strM125861G0 = AbstractC39414r.m125861G0(assetUrl, "/", "");
        if (AbstractC39414r.m125890i0(strM125861G0)) {
            strM125861G0 = null;
        }
        if (strM125861G0 != null) {
            return AbstractC39414r.m125863I0(strM125861G0, "?");
        }
        return null;
    }
}
