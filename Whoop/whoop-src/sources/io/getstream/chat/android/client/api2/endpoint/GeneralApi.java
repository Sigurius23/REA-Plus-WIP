package io.getstream.chat.android.client.api2.endpoint;

import io.getstream.chat.android.client.api.AuthenticatedApi;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.api2.UrlQueryPayload;
import io.getstream.chat.android.client.api2.model.dto.UnreadDto;
import io.getstream.chat.android.client.api2.model.requests.QueryMembersRequest;
import io.getstream.chat.android.client.api2.model.requests.SearchMessagesRequest;
import io.getstream.chat.android.client.api2.model.requests.SyncHistoryRequest;
import io.getstream.chat.android.client.api2.model.response.QueryMembersResponse;
import io.getstream.chat.android.client.api2.model.response.SearchMessagesResponse;
import io.getstream.chat.android.client.api2.model.response.SyncHistoryResponse;
import io.getstream.chat.android.client.call.RetrofitCall;
import p715kotlin.Metadata;
import ud3.AbstractC34799a1;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37282m;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\b\b\u0001\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0012H'¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0002H'¢\u0006\u0004\b\u0017\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/endpoint/GeneralApi;", "", "Lio/getstream/chat/android/client/call/RetrofitCall;", "Lud3/a1;", "warmUp", "()Lio/getstream/chat/android/client/call/RetrofitCall;", "Lio/getstream/chat/android/client/api2/model/requests/SyncHistoryRequest;", "body", "", "connectionId", "Lio/getstream/chat/android/client/api2/model/response/SyncHistoryResponse;", "getSyncHistory", "(Lio/getstream/chat/android/client/api2/model/requests/SyncHistoryRequest;Ljava/lang/String;)Lio/getstream/chat/android/client/call/RetrofitCall;", "Lio/getstream/chat/android/client/api2/model/requests/SearchMessagesRequest;", "payload", "Lio/getstream/chat/android/client/api2/model/response/SearchMessagesResponse;", "searchMessages", "(Lio/getstream/chat/android/client/api2/model/requests/SearchMessagesRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;", "Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;", "Lio/getstream/chat/android/client/api2/model/response/QueryMembersResponse;", "queryMembers", "(Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;", "Lio/getstream/chat/android/client/api2/model/dto/UnreadDto;", "getUnreadCounts", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
@AuthenticatedApi
public interface GeneralApi {
    @InterfaceC37284o("/sync")
    RetrofitCall<SyncHistoryResponse> getSyncHistory(@InterfaceC37270a SyncHistoryRequest body, @InterfaceC37289t(QueryParams.CONNECTION_ID) String connectionId);

    @InterfaceC37275f("/unread")
    RetrofitCall<UnreadDto> getUnreadCounts();

    @InterfaceC37275f("/members")
    RetrofitCall<QueryMembersResponse> queryMembers(@UrlQueryPayload @InterfaceC37289t("payload") QueryMembersRequest payload);

    @InterfaceC37275f("/search")
    RetrofitCall<SearchMessagesResponse> searchMessages(@UrlQueryPayload @InterfaceC37289t("payload") SearchMessagesRequest payload);

    @InterfaceC37282m("/connect")
    RetrofitCall<AbstractC34799a1> warmUp();
}
