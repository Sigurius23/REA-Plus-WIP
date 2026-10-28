package io.getstream.chat.android.client.api2.endpoint;

import io.getstream.chat.android.client.api.AnonymousApi;
import io.getstream.chat.android.client.call.RetrofitCall;
import p715kotlin.Metadata;
import ud3.AbstractC34799a1;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37292w;
import wg3.InterfaceC37294y;

/* JADX INFO: loaded from: classes5.dex */
@AnonymousApi
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/endpoint/FileDownloadApi;", "", "", "fileUrl", "Lio/getstream/chat/android/client/call/RetrofitCall;", "Lud3/a1;", "downloadFile", "(Ljava/lang/String;)Lio/getstream/chat/android/client/call/RetrofitCall;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface FileDownloadApi {
    @InterfaceC37275f
    @InterfaceC37292w
    RetrofitCall<AbstractC34799a1> downloadFile(@InterfaceC37294y String fileUrl);
}
