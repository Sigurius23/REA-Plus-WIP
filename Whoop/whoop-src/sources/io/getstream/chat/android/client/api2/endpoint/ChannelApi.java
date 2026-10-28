package io.getstream.chat.android.client.api2.endpoint;

import io.getstream.chat.android.client.api.AuthenticatedApi;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.api2.UrlQueryPayload;
import io.getstream.chat.android.client.api2.model.requests.AcceptInviteRequest;
import io.getstream.chat.android.client.api2.model.requests.AddMembersRequest;
import io.getstream.chat.android.client.api2.model.requests.HideChannelRequest;
import io.getstream.chat.android.client.api2.model.requests.InviteMembersRequest;
import io.getstream.chat.android.client.api2.model.requests.MarkDeliveredRequest;
import io.getstream.chat.android.client.api2.model.requests.MarkReadRequest;
import io.getstream.chat.android.client.api2.model.requests.MarkUnreadRequest;
import io.getstream.chat.android.client.api2.model.requests.PinnedMessagesRequest;
import io.getstream.chat.android.client.api2.model.requests.QueryChannelRequest;
import io.getstream.chat.android.client.api2.model.requests.QueryChannelsRequest;
import io.getstream.chat.android.client.api2.model.requests.RejectInviteRequest;
import io.getstream.chat.android.client.api2.model.requests.RemoveMembersRequest;
import io.getstream.chat.android.client.api2.model.requests.SendEventRequest;
import io.getstream.chat.android.client.api2.model.requests.TruncateChannelRequest;
import io.getstream.chat.android.client.api2.model.requests.UpdateChannelPartialRequest;
import io.getstream.chat.android.client.api2.model.requests.UpdateChannelRequest;
import io.getstream.chat.android.client.api2.model.requests.UpdateCooldownRequest;
import io.getstream.chat.android.client.api2.model.requests.UpdateMemberPartialRequest;
import io.getstream.chat.android.client.api2.model.requests.UpdateMemberPartialResponse;
import io.getstream.chat.android.client.api2.model.response.ChannelResponse;
import io.getstream.chat.android.client.api2.model.response.CompletableResponse;
import io.getstream.chat.android.client.api2.model.response.EventResponse;
import io.getstream.chat.android.client.api2.model.response.MessagesResponse;
import io.getstream.chat.android.client.api2.model.response.QueryChannelsResponse;
import io.getstream.chat.android.client.call.RetrofitCall;
import java.util.Map;
import m83.C25272z;
import p715kotlin.Metadata;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37271b;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37283n;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37288s;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH'J,\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\fH'J$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0014\b\u0003\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0010H'J,\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u0014H'J,\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u0016H'J,\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u0018H'J\"\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u0006H'J,\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u001bH'J,\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u001dH'J,\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u001fH'J,\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020!H'J,\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020#H'J6\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010&\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020'H'J,\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020*H'J,\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020,H'J,\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020.H'J6\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\fH'J,\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u000200H'J,\u00101\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u000202H'J8\u00103\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u00062\u0014\b\u0001\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0010H'JB\u00104\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0014\b\u0001\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0010H'J,\u00105\u001a\b\u0012\u0004\u0012\u0002060\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u00107\u001a\u000208H'J\u0018\u00109\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u0007\u001a\u00020:H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006;À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/endpoint/ChannelApi;", "", "queryChannels", "Lio/getstream/chat/android/client/call/RetrofitCall;", "Lio/getstream/chat/android/client/api2/model/response/QueryChannelsResponse;", "connectionId", "", "request", "Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;", "queryChannel", "Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;", "channelType", "Lio/getstream/chat/android/client/api2/model/requests/QueryChannelRequest;", "markAllRead", "Lio/getstream/chat/android/client/api2/model/response/CompletableResponse;", "map", "", "updateChannel", "channelId", "body", "Lio/getstream/chat/android/client/api2/model/requests/UpdateChannelRequest;", "updateChannelPartial", "Lio/getstream/chat/android/client/api2/model/requests/UpdateChannelPartialRequest;", "updateCooldown", "Lio/getstream/chat/android/client/api2/model/requests/UpdateCooldownRequest;", "deleteChannel", "acceptInvite", "Lio/getstream/chat/android/client/api2/model/requests/AcceptInviteRequest;", "rejectInvite", "Lio/getstream/chat/android/client/api2/model/requests/RejectInviteRequest;", "addMembers", "Lio/getstream/chat/android/client/api2/model/requests/AddMembersRequest;", "removeMembers", "Lio/getstream/chat/android/client/api2/model/requests/RemoveMembersRequest;", "inviteMembers", "Lio/getstream/chat/android/client/api2/model/requests/InviteMembersRequest;", "partialUpdateMember", "Lio/getstream/chat/android/client/api2/model/requests/UpdateMemberPartialResponse;", "userId", "Lio/getstream/chat/android/client/api2/model/requests/UpdateMemberPartialRequest;", "sendEvent", "Lio/getstream/chat/android/client/api2/model/response/EventResponse;", "Lio/getstream/chat/android/client/api2/model/requests/SendEventRequest;", "hideChannel", "Lio/getstream/chat/android/client/api2/model/requests/HideChannelRequest;", "truncateChannel", "Lio/getstream/chat/android/client/api2/model/requests/TruncateChannelRequest;", "markRead", "Lio/getstream/chat/android/client/api2/model/requests/MarkReadRequest;", "markUnread", "Lio/getstream/chat/android/client/api2/model/requests/MarkUnreadRequest;", "showChannel", "stopWatching", "getPinnedMessages", "Lio/getstream/chat/android/client/api2/model/response/MessagesResponse;", "payload", "Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;", "markDelivered", "Lio/getstream/chat/android/client/api2/model/requests/MarkDeliveredRequest;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
@AuthenticatedApi
public interface ChannelApi {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ RetrofitCall markAllRead$default(ChannelApi channelApi, Map map, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: markAllRead");
        }
        if ((i13 & 1) != 0) {
            map = C25272z.f99163w;
        }
        return channelApi.markAllRead(map);
    }

    @InterfaceC37284o("/channels/{type}/{id}")
    RetrofitCall<ChannelResponse> acceptInvite(@InterfaceC37288s("type") String channelType, @InterfaceC37288s("id") String channelId, @InterfaceC37270a AcceptInviteRequest body);

    @InterfaceC37284o("/channels/{type}/{id}")
    RetrofitCall<ChannelResponse> addMembers(@InterfaceC37288s("type") String channelType, @InterfaceC37288s("id") String channelId, @InterfaceC37270a AddMembersRequest body);

    @InterfaceC37271b("/channels/{type}/{id}")
    RetrofitCall<ChannelResponse> deleteChannel(@InterfaceC37288s("type") String channelType, @InterfaceC37288s("id") String channelId);

    @InterfaceC37275f("/channels/{type}/{id}/pinned_messages")
    RetrofitCall<MessagesResponse> getPinnedMessages(@InterfaceC37288s("type") String channelType, @InterfaceC37288s("id") String channelId, @UrlQueryPayload @InterfaceC37289t("payload") PinnedMessagesRequest payload);

    @InterfaceC37284o("/channels/{type}/{id}/hide")
    RetrofitCall<CompletableResponse> hideChannel(@InterfaceC37288s("type") String channelType, @InterfaceC37288s("id") String channelId, @InterfaceC37270a HideChannelRequest body);

    @InterfaceC37284o("/channels/{type}/{id}")
    RetrofitCall<ChannelResponse> inviteMembers(@InterfaceC37288s("type") String channelType, @InterfaceC37288s("id") String channelId, @InterfaceC37270a InviteMembersRequest body);

    @InterfaceC37284o("/channels/read")
    RetrofitCall<CompletableResponse> markAllRead(@InterfaceC37270a Map<String, String> map);

    @InterfaceC37284o("/channels/delivered")
    RetrofitCall<CompletableResponse> markDelivered(@InterfaceC37270a MarkDeliveredRequest request);

    @InterfaceC37284o("/channels/{type}/{id}/read")
    RetrofitCall<CompletableResponse> markRead(@InterfaceC37288s("type") String channelType, @InterfaceC37288s("id") String channelId, @InterfaceC37270a MarkReadRequest request);

    @InterfaceC37284o("/channels/{type}/{id}/unread")
    RetrofitCall<CompletableResponse> markUnread(@InterfaceC37288s("type") String channelType, @InterfaceC37288s("id") String channelId, @InterfaceC37270a MarkUnreadRequest request);

    @InterfaceC37283n("/channels/{type}/{id}/member/{user_id}")
    RetrofitCall<UpdateMemberPartialResponse> partialUpdateMember(@InterfaceC37288s("type") String channelType, @InterfaceC37288s("id") String channelId, @InterfaceC37288s("user_id") String userId, @InterfaceC37270a UpdateMemberPartialRequest body);

    @InterfaceC37284o("/channels/{type}/query")
    RetrofitCall<ChannelResponse> queryChannel(@InterfaceC37288s("type") String channelType, @InterfaceC37289t(QueryParams.CONNECTION_ID) String connectionId, @InterfaceC37270a QueryChannelRequest request);

    @InterfaceC37284o("/channels/{type}/{id}/query")
    RetrofitCall<ChannelResponse> queryChannel(@InterfaceC37288s("type") String channelType, @InterfaceC37288s("id") String channelId, @InterfaceC37289t(QueryParams.CONNECTION_ID) String connectionId, @InterfaceC37270a QueryChannelRequest request);

    @InterfaceC37284o("/channels")
    RetrofitCall<QueryChannelsResponse> queryChannels(@InterfaceC37289t(QueryParams.CONNECTION_ID) String connectionId, @InterfaceC37270a QueryChannelsRequest request);

    @InterfaceC37284o("/channels/{type}/{id}")
    RetrofitCall<ChannelResponse> rejectInvite(@InterfaceC37288s("type") String channelType, @InterfaceC37288s("id") String channelId, @InterfaceC37270a RejectInviteRequest body);

    @InterfaceC37284o("/channels/{type}/{id}")
    RetrofitCall<ChannelResponse> removeMembers(@InterfaceC37288s("type") String channelType, @InterfaceC37288s("id") String channelId, @InterfaceC37270a RemoveMembersRequest body);

    @InterfaceC37284o("/channels/{type}/{id}/event")
    RetrofitCall<EventResponse> sendEvent(@InterfaceC37288s("type") String channelType, @InterfaceC37288s("id") String channelId, @InterfaceC37270a SendEventRequest request);

    @InterfaceC37284o("/channels/{type}/{id}/show")
    RetrofitCall<CompletableResponse> showChannel(@InterfaceC37288s("type") String channelType, @InterfaceC37288s("id") String channelId, @InterfaceC37270a Map<Object, Object> body);

    @InterfaceC37284o("/channels/{type}/{id}/stop-watching")
    RetrofitCall<CompletableResponse> stopWatching(@InterfaceC37288s("type") String channelType, @InterfaceC37288s("id") String channelId, @InterfaceC37289t(QueryParams.CONNECTION_ID) String connectionId, @InterfaceC37270a Map<Object, Object> body);

    @InterfaceC37284o("/channels/{type}/{id}/truncate")
    RetrofitCall<ChannelResponse> truncateChannel(@InterfaceC37288s("type") String channelType, @InterfaceC37288s("id") String channelId, @InterfaceC37270a TruncateChannelRequest body);

    @InterfaceC37284o("/channels/{type}/{id}")
    RetrofitCall<ChannelResponse> updateChannel(@InterfaceC37288s("type") String channelType, @InterfaceC37288s("id") String channelId, @InterfaceC37270a UpdateChannelRequest body);

    @InterfaceC37283n("/channels/{type}/{id}")
    RetrofitCall<ChannelResponse> updateChannelPartial(@InterfaceC37288s("type") String channelType, @InterfaceC37288s("id") String channelId, @InterfaceC37270a UpdateChannelPartialRequest body);

    @InterfaceC37283n("/channels/{type}/{id}")
    RetrofitCall<ChannelResponse> updateCooldown(@InterfaceC37288s("type") String channelType, @InterfaceC37288s("id") String channelId, @InterfaceC37270a UpdateCooldownRequest body);
}
