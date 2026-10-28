package io.getstream.chat.android.client.api2.mapping;

import io.getstream.chat.android.client.api.models.UploadFileResponse;
import io.getstream.chat.android.models.UploadedFile;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m65681d2 = {"toUploadedFile", "Lio/getstream/chat/android/models/UploadedFile;", "Lio/getstream/chat/android/client/api/models/UploadFileResponse;", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class UploadFileResponseMappingKt {
    public static final UploadedFile toUploadedFile(UploadFileResponse uploadFileResponse) {
        AbstractC22676k.m65750j(uploadFileResponse, "<this>");
        return new UploadedFile(uploadFileResponse.getFile(), uploadFileResponse.getThumb_url(), null, 4, null);
    }
}
