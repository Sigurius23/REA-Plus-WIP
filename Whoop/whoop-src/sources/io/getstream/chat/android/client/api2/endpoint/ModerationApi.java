package io.getstream.chat.android.client.api2.endpoint;

import com.whoop.profile.domain.ProfileApiKt;
import io.getstream.chat.android.client.api.AuthenticatedApi;
import io.getstream.chat.android.client.api2.UrlQueryPayload;
import io.getstream.chat.android.client.api2.model.requests.BanUserRequest;
import io.getstream.chat.android.client.api2.model.requests.FlagRequest;
import io.getstream.chat.android.client.api2.model.requests.MuteChannelRequest;
import io.getstream.chat.android.client.api2.model.requests.MuteUserRequest;
import io.getstream.chat.android.client.api2.model.requests.QueryBannedUsersRequest;
import io.getstream.chat.android.client.api2.model.response.CompletableResponse;
import io.getstream.chat.android.client.api2.model.response.FlagResponse;
import io.getstream.chat.android.client.api2.model.response.MuteUserResponse;
import io.getstream.chat.android.client.api2.model.response.QueryBannedUsersResponse;
import io.getstream.chat.android.client.call.RetrofitCall;
import java.util.Map;
import p715kotlin.Metadata;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37271b;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\nH'J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\nH'J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u000eH'J$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010H'J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0013H'J6\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u00112\b\b\u0001\u0010\u0016\u001a\u00020\u00112\b\b\u0001\u0010\u0017\u001a\u00020\u00112\b\b\u0001\u0010\u0018\u001a\u00020\u0019H'J\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00032\b\b\u0001\u0010\u001c\u001a\u00020\u001dH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001eÀ\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/endpoint/ModerationApi;", "", "muteUser", "Lio/getstream/chat/android/client/call/RetrofitCall;", "Lio/getstream/chat/android/client/api2/model/response/MuteUserResponse;", "body", "Lio/getstream/chat/android/client/api2/model/requests/MuteUserRequest;", "unmuteUser", "Lio/getstream/chat/android/client/api2/model/response/CompletableResponse;", "muteChannel", "Lio/getstream/chat/android/client/api2/model/requests/MuteChannelRequest;", "unmuteChannel", "flag", "Lio/getstream/chat/android/client/api2/model/response/FlagResponse;", "Lio/getstream/chat/android/client/api2/model/requests/FlagRequest;", "unflag", "", "", "banUser", "Lio/getstream/chat/android/client/api2/model/requests/BanUserRequest;", "unbanUser", ProfileApiKt.TARGET_USER_ID_PARAM, "channelType", "channelId", "shadow", "", "queryBannedUsers", "Lio/getstream/chat/android/client/api2/model/response/QueryBannedUsersResponse;", "payload", "Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
@AuthenticatedApi
public interface ModerationApi {
    @InterfaceC37284o("/moderation/ban")
    RetrofitCall<CompletableResponse> banUser(@InterfaceC37270a BanUserRequest body);

    @InterfaceC37284o("/moderation/flag")
    RetrofitCall<FlagResponse> flag(@InterfaceC37270a FlagRequest body);

    @InterfaceC37284o("/moderation/mute/channel")
    RetrofitCall<CompletableResponse> muteChannel(@InterfaceC37270a MuteChannelRequest body);

    @InterfaceC37284o("/moderation/mute")
    RetrofitCall<MuteUserResponse> muteUser(@InterfaceC37270a MuteUserRequest body);

    @InterfaceC37275f("/query_banned_users")
    RetrofitCall<QueryBannedUsersResponse> queryBannedUsers(@UrlQueryPayload @InterfaceC37289t("payload") QueryBannedUsersRequest payload);

    @InterfaceC37271b("/moderation/ban")
    RetrofitCall<CompletableResponse> unbanUser(@InterfaceC37289t("target_user_id") String targetUserId, @InterfaceC37289t("type") String channelType, @InterfaceC37289t("id") String channelId, @InterfaceC37289t("shadow") boolean shadow);

    @InterfaceC37284o("/moderation/unflag")
    RetrofitCall<FlagResponse> unflag(@InterfaceC37270a Map<String, String> body);

    @InterfaceC37284o("/moderation/unmute/channel")
    RetrofitCall<CompletableResponse> unmuteChannel(@InterfaceC37270a MuteChannelRequest body);

    @InterfaceC37284o("/moderation/unmute")
    RetrofitCall<CompletableResponse> unmuteUser(@InterfaceC37270a MuteUserRequest body);
}
