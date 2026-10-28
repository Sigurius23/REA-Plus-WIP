package io.getstream.chat.android.client.api;

import io.getstream.chat.android.client.api.models.CompletableResponse;
import io.getstream.chat.android.client.api.models.UploadFileResponse;
import io.getstream.chat.android.client.call.RetrofitCall;
import io.getstream.chat.android.client.utils.ProgressCallback;
import p715kotlin.Metadata;
import ud3.C34820i0;
import wg3.InterfaceC37271b;
import wg3.InterfaceC37281l;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37286q;
import wg3.InterfaceC37288s;
import wg3.InterfaceC37289t;
import wg3.InterfaceC37293x;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\ba\u0018\u00002\u00020\u0001J?\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\b\r\u0010\fJ3\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0002H'¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0002H'¢\u0006\u0004\b\u0012\u0010\u0011J+\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\b\b\u0001\u0010\u000e\u001a\u00020\u0002H'¢\u0006\u0004\b\u0010\u0010\u0015J+\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\b\u0016\u0010\u0014J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\b\b\u0001\u0010\u000e\u001a\u00020\u0002H'¢\u0006\u0004\b\u0012\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/api/RetrofitCdnApi;", "", "", "channelType", "channelId", "Lud3/i0;", "file", "Lio/getstream/chat/android/client/utils/ProgressCallback;", "progressCallback", "Lio/getstream/chat/android/client/call/RetrofitCall;", "Lio/getstream/chat/android/client/api/models/UploadFileResponse;", "sendImage", "(Ljava/lang/String;Ljava/lang/String;Lud3/i0;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lio/getstream/chat/android/client/call/RetrofitCall;", "sendFile", QueryParams.URL, "Lio/getstream/chat/android/client/api/models/CompletableResponse;", "deleteFile", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/call/RetrofitCall;", "deleteImage", "uploadFile", "(Lud3/i0;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lio/getstream/chat/android/client/call/RetrofitCall;", "(Ljava/lang/String;)Lio/getstream/chat/android/client/call/RetrofitCall;", "uploadImage", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
@AuthenticatedApi
public interface RetrofitCdnApi {
    @InterfaceC37271b("/uploads/file")
    RetrofitCall<CompletableResponse> deleteFile(@InterfaceC37289t(QueryParams.URL) String url);

    @InterfaceC37271b("/channels/{type}/{id}/file")
    RetrofitCall<CompletableResponse> deleteFile(@InterfaceC37288s("type") String channelType, @InterfaceC37288s("id") String channelId, @InterfaceC37289t(QueryParams.URL) String url);

    @InterfaceC37271b("/uploads/image")
    RetrofitCall<CompletableResponse> deleteImage(@InterfaceC37289t(QueryParams.URL) String url);

    @InterfaceC37271b("/channels/{type}/{id}/image")
    RetrofitCall<CompletableResponse> deleteImage(@InterfaceC37288s("type") String channelType, @InterfaceC37288s("id") String channelId, @InterfaceC37289t(QueryParams.URL) String url);

    @InterfaceC37284o("/channels/{type}/{id}/file")
    @InterfaceC37281l
    RetrofitCall<UploadFileResponse> sendFile(@InterfaceC37288s("type") String channelType, @InterfaceC37288s("id") String channelId, @InterfaceC37286q C34820i0 file, @InterfaceC37293x ProgressCallback progressCallback);

    @InterfaceC37284o("/channels/{type}/{id}/image")
    @InterfaceC37281l
    RetrofitCall<UploadFileResponse> sendImage(@InterfaceC37288s("type") String channelType, @InterfaceC37288s("id") String channelId, @InterfaceC37286q C34820i0 file, @InterfaceC37293x ProgressCallback progressCallback);

    @InterfaceC37284o("/uploads/file")
    @InterfaceC37281l
    RetrofitCall<UploadFileResponse> uploadFile(@InterfaceC37286q C34820i0 file, @InterfaceC37293x ProgressCallback progressCallback);

    @InterfaceC37284o("/uploads/image")
    @InterfaceC37281l
    RetrofitCall<UploadFileResponse> uploadImage(@InterfaceC37286q C34820i0 file, @InterfaceC37293x ProgressCallback progressCallback);
}
