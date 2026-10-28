package io.getstream.chat.android.p226ui.common.images.resizing;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, m65681d2 = {"applyStreamCdnImageResizingIfEnabled", "", "streamCdnImageResizing", "Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;", "stream-chat-android-ui-common_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class StringExtensionsKt {
    @InternalStreamChatApi
    public static final String applyStreamCdnImageResizingIfEnabled(String str, StreamCdnImageResizing streamCdnImageResizing) {
        AbstractC22676k.m65750j(str, "<this>");
        AbstractC22676k.m65750j(streamCdnImageResizing, "streamCdnImageResizing");
        if (!streamCdnImageResizing.getImageResizingEnabled()) {
            return str;
        }
        return io.getstream.chat.android.client.extensions.StringExtensionsKt.createResizedStreamCdnImageUrl(str, streamCdnImageResizing.getResizedHeightPercentage(), streamCdnImageResizing.getResizedWidthPercentage(), streamCdnImageResizing.getResizeMode(), streamCdnImageResizing.getCropMode());
    }
}
