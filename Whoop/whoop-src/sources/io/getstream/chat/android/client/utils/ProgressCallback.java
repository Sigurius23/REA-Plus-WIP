package io.getstream.chat.android.client.utils;

import io.getstream.chat.android.client.api.QueryParams;
import n23.AbstractC26202e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/utils/ProgressCallback;", "", "", QueryParams.URL, "Ll83/a0;", "onSuccess", "(Ljava/lang/String;)V", "Ln23/e;", "error", "onError", "(Ln23/e;)V", "", "bytesUploaded", "totalBytes", "onProgress", "(JJ)V", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ProgressCallback {
    default void onError(AbstractC26202e error) {
        AbstractC22676k.m65750j(error, "error");
    }

    default void onProgress(long bytesUploaded, long totalBytes) {
    }

    default void onSuccess(String url) {
    }
}
