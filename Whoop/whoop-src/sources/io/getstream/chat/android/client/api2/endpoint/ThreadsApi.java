package io.getstream.chat.android.client.api2.endpoint;

import io.getstream.chat.android.client.api.AuthenticatedApi;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.api2.model.requests.PartialUpdateThreadRequest;
import io.getstream.chat.android.client.api2.model.requests.QueryThreadsRequest;
import io.getstream.chat.android.client.api2.model.response.QueryThreadsResponse;
import io.getstream.chat.android.client.api2.model.response.ThreadInfoResponse;
import io.getstream.chat.android.client.api2.model.response.ThreadResponse;
import io.getstream.chat.android.client.call.RetrofitCall;
import java.util.Map;
import p715kotlin.Metadata;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37283n;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37288s;
import wg3.InterfaceC37289t;
import wg3.InterfaceC37290u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH'J8\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0014\b\u0001\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\rH'J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u0011H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/endpoint/ThreadsApi;", "", "queryThreads", "Lio/getstream/chat/android/client/call/RetrofitCall;", "Lio/getstream/chat/android/client/api2/model/response/QueryThreadsResponse;", "connectionId", "", "request", "Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;", "getThread", "Lio/getstream/chat/android/client/api2/model/response/ThreadResponse;", "messageId", "options", "", "partialUpdateThread", "Lio/getstream/chat/android/client/api2/model/response/ThreadInfoResponse;", "body", "Lio/getstream/chat/android/client/api2/model/requests/PartialUpdateThreadRequest;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
@AuthenticatedApi
public interface ThreadsApi {
    @InterfaceC37275f("/threads/{message_id}")
    RetrofitCall<ThreadResponse> getThread(@InterfaceC37288s("message_id") String messageId, @InterfaceC37289t(QueryParams.CONNECTION_ID) String connectionId, @InterfaceC37290u Map<String, String> options);

    @InterfaceC37283n("/threads/{message_id}")
    RetrofitCall<ThreadInfoResponse> partialUpdateThread(@InterfaceC37288s("message_id") String messageId, @InterfaceC37270a PartialUpdateThreadRequest body);

    @InterfaceC37284o("/threads")
    RetrofitCall<QueryThreadsResponse> queryThreads(@InterfaceC37289t(QueryParams.CONNECTION_ID) String connectionId, @InterfaceC37270a QueryThreadsRequest request);
}
