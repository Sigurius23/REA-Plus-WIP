package io.getstream.chat.android.client.api2.endpoint;

import io.getstream.chat.android.client.api.AuthenticatedApi;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.api2.UrlQueryPayload;
import io.getstream.chat.android.client.api2.model.dto.DownstreamLocationDto;
import io.getstream.chat.android.client.api2.model.requests.BlockUserRequest;
import io.getstream.chat.android.client.api2.model.requests.PartialUpdateUsersRequest;
import io.getstream.chat.android.client.api2.model.requests.QueryUsersRequest;
import io.getstream.chat.android.client.api2.model.requests.UnblockUserRequest;
import io.getstream.chat.android.client.api2.model.requests.UpdateLiveLocationRequest;
import io.getstream.chat.android.client.api2.model.requests.UpdateUsersRequest;
import io.getstream.chat.android.client.api2.model.response.BlockUserResponse;
import io.getstream.chat.android.client.api2.model.response.LiveLocationsResponse;
import io.getstream.chat.android.client.api2.model.response.QueryBlockedUsersResponse;
import io.getstream.chat.android.client.api2.model.response.UnblockUserResponse;
import io.getstream.chat.android.client.api2.model.response.UpdateUsersResponse;
import io.getstream.chat.android.client.api2.model.response.UsersResponse;
import io.getstream.chat.android.client.call.RetrofitCall;
import p715kotlin.Metadata;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37283n;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37285p;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u000bH'J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u000eH'J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003H'J\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0012H'J\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0015\u001a\u00020\u0016H'J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003H'J\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u001bH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001cÀ\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/endpoint/UserApi;", "", "updateUsers", "Lio/getstream/chat/android/client/call/RetrofitCall;", "Lio/getstream/chat/android/client/api2/model/response/UpdateUsersResponse;", "connectionId", "", "body", "Lio/getstream/chat/android/client/api2/model/requests/UpdateUsersRequest;", "blockUser", "Lio/getstream/chat/android/client/api2/model/response/BlockUserResponse;", "Lio/getstream/chat/android/client/api2/model/requests/BlockUserRequest;", "unblockUser", "Lio/getstream/chat/android/client/api2/model/response/UnblockUserResponse;", "Lio/getstream/chat/android/client/api2/model/requests/UnblockUserRequest;", "queryBlockedUsers", "Lio/getstream/chat/android/client/api2/model/response/QueryBlockedUsersResponse;", "partialUpdateUsers", "Lio/getstream/chat/android/client/api2/model/requests/PartialUpdateUsersRequest;", "queryUsers", "Lio/getstream/chat/android/client/api2/model/response/UsersResponse;", "payload", "Lio/getstream/chat/android/client/api2/model/requests/QueryUsersRequest;", "liveLocations", "Lio/getstream/chat/android/client/api2/model/response/LiveLocationsResponse;", "updateLiveLocation", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;", "Lio/getstream/chat/android/client/api2/model/requests/UpdateLiveLocationRequest;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
@AuthenticatedApi
public interface UserApi {
    @InterfaceC37284o("/users/block")
    RetrofitCall<BlockUserResponse> blockUser(@InterfaceC37270a BlockUserRequest body);

    @InterfaceC37275f("/users/live_locations")
    RetrofitCall<LiveLocationsResponse> liveLocations();

    @InterfaceC37283n("/users")
    RetrofitCall<UpdateUsersResponse> partialUpdateUsers(@InterfaceC37289t(QueryParams.CONNECTION_ID) String connectionId, @InterfaceC37270a PartialUpdateUsersRequest body);

    @InterfaceC37275f("/users/block")
    RetrofitCall<QueryBlockedUsersResponse> queryBlockedUsers();

    @InterfaceC37275f("/users")
    RetrofitCall<UsersResponse> queryUsers(@InterfaceC37289t(QueryParams.CONNECTION_ID) String connectionId, @UrlQueryPayload @InterfaceC37289t("payload") QueryUsersRequest payload);

    @InterfaceC37284o("/users/unblock")
    RetrofitCall<UnblockUserResponse> unblockUser(@InterfaceC37270a UnblockUserRequest body);

    @InterfaceC37285p("/users/live_locations")
    RetrofitCall<DownstreamLocationDto> updateLiveLocation(@InterfaceC37270a UpdateLiveLocationRequest body);

    @InterfaceC37284o("/users")
    RetrofitCall<UpdateUsersResponse> updateUsers(@InterfaceC37289t(QueryParams.CONNECTION_ID) String connectionId, @InterfaceC37270a UpdateUsersRequest body);
}
