package io.getstream.chat.android.client.api2.endpoint;

import com.mapbox.maps.MapboxMap;
import io.getstream.chat.android.client.api.AuthenticatedApi;
import io.getstream.chat.android.client.api2.model.requests.PartialUpdateMessageRequest;
import io.getstream.chat.android.client.api2.model.requests.QueryDraftMessagesRequest;
import io.getstream.chat.android.client.api2.model.requests.QueryDraftsRequest;
import io.getstream.chat.android.client.api2.model.requests.QueryReactionsRequest;
import io.getstream.chat.android.client.api2.model.requests.ReactionRequest;
import io.getstream.chat.android.client.api2.model.requests.SendActionRequest;
import io.getstream.chat.android.client.api2.model.requests.SendMessageRequest;
import io.getstream.chat.android.client.api2.model.requests.UpdateMessageRequest;
import io.getstream.chat.android.client.api2.model.response.CompletableResponse;
import io.getstream.chat.android.client.api2.model.response.DraftMessageResponse;
import io.getstream.chat.android.client.api2.model.response.MessageResponse;
import io.getstream.chat.android.client.api2.model.response.MessagesResponse;
import io.getstream.chat.android.client.api2.model.response.QueryDraftMessagesResponse;
import io.getstream.chat.android.client.api2.model.response.QueryReactionsResponse;
import io.getstream.chat.android.client.api2.model.response.ReactionResponse;
import io.getstream.chat.android.client.api2.model.response.ReactionsResponse;
import io.getstream.chat.android.client.api2.model.response.TranslateMessageRequest;
import io.getstream.chat.android.client.call.RetrofitCall;
import p715kotlin.Metadata;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37271b;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37285p;
import wg3.InterfaceC37288s;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH'J,\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH'J.\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0006H'J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u0012H'J\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u0015H'J\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u0006H'J\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0019H'J\"\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u001bH'J5\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u00062\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u001eH'¢\u0006\u0002\u0010 J\"\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\"H'J\"\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020%H'J\"\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u00062\b\b\u0001\u0010'\u001a\u00020\u0006H'J,\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u00062\b\b\u0001\u0010*\u001a\u00020+2\b\b\u0001\u0010,\u001a\u00020+H'J\"\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u00062\b\b\u0001\u0010\u0014\u001a\u00020/H'J\"\u00100\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u000201H'J\"\u00102\u001a\b\u0012\u0004\u0012\u0002030\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u00062\b\b\u0001\u0010,\u001a\u00020+H'J.\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010,\u001a\u00020+2\n\b\u0001\u00105\u001a\u0004\u0018\u00010\u0006H'J,\u00106\u001a\b\u0012\u0004\u0012\u0002030\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u00062\b\b\u0001\u0010,\u001a\u00020+2\b\b\u0001\u00107\u001a\u00020\u0006H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00068À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/endpoint/MessageApi;", "", "sendMessage", "Lio/getstream/chat/android/client/call/RetrofitCall;", "Lio/getstream/chat/android/client/api2/model/response/MessageResponse;", "channelType", "", "channelId", "message", "Lio/getstream/chat/android/client/api2/model/requests/SendMessageRequest;", "createDraftMessage", "Lio/getstream/chat/android/client/api2/model/response/DraftMessageResponse;", "deleteDraftMessage", "Lio/getstream/chat/android/client/api2/model/response/CompletableResponse;", "parentId", "queryDraftMessages", "Lio/getstream/chat/android/client/api2/model/response/QueryDraftMessagesResponse;", "request", "Lio/getstream/chat/android/client/api2/model/requests/QueryDraftMessagesRequest;", "queryDrafts", "body", "Lio/getstream/chat/android/client/api2/model/requests/QueryDraftsRequest;", "getMessage", "messageId", "updateMessage", "Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;", "partialUpdateMessage", "Lio/getstream/chat/android/client/api2/model/requests/PartialUpdateMessageRequest;", "deleteMessage", "hard", "", "deleteForMe", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lio/getstream/chat/android/client/call/RetrofitCall;", "sendAction", "Lio/getstream/chat/android/client/api2/model/requests/SendActionRequest;", "sendReaction", "Lio/getstream/chat/android/client/api2/model/response/ReactionResponse;", "Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;", "deleteReaction", "reactionType", "getReactions", "Lio/getstream/chat/android/client/api2/model/response/ReactionsResponse;", MapboxMap.QFE_OFFSET, "", MapboxMap.QFE_LIMIT, "queryReactions", "Lio/getstream/chat/android/client/api2/model/response/QueryReactionsResponse;", "Lio/getstream/chat/android/client/api2/model/requests/QueryReactionsRequest;", "translate", "Lio/getstream/chat/android/client/api2/model/response/TranslateMessageRequest;", "getReplies", "Lio/getstream/chat/android/client/api2/model/response/MessagesResponse;", "getNewerReplies", "lastId", "getRepliesMore", "firstId", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
@AuthenticatedApi
public interface MessageApi {
    @InterfaceC37284o("/channels/{type}/{id}/draft")
    RetrofitCall<DraftMessageResponse> createDraftMessage(@InterfaceC37288s("type") String channelType, @InterfaceC37288s("id") String channelId, @InterfaceC37270a SendMessageRequest message);

    @InterfaceC37271b("/channels/{type}/{id}/draft")
    RetrofitCall<CompletableResponse> deleteDraftMessage(@InterfaceC37288s("type") String channelType, @InterfaceC37288s("id") String channelId, @InterfaceC37289t("parent_id") String parentId);

    @InterfaceC37271b("/messages/{id}")
    RetrofitCall<MessageResponse> deleteMessage(@InterfaceC37288s("id") String messageId, @InterfaceC37289t("hard") Boolean hard, @InterfaceC37289t("delete_for_me") Boolean deleteForMe);

    @InterfaceC37271b("/messages/{id}/reaction/{type}")
    RetrofitCall<MessageResponse> deleteReaction(@InterfaceC37288s("id") String messageId, @InterfaceC37288s("type") String reactionType);

    @InterfaceC37275f("/messages/{id}")
    RetrofitCall<MessageResponse> getMessage(@InterfaceC37288s("id") String messageId);

    @InterfaceC37275f("/messages/{parent_id}/replies?sort=[{\"field\":\"created_at\",\"direction\":1}]")
    RetrofitCall<MessagesResponse> getNewerReplies(@InterfaceC37288s("parent_id") String parentId, @InterfaceC37289t(MapboxMap.QFE_LIMIT) int limit, @InterfaceC37289t("id_gt") String lastId);

    @InterfaceC37275f("/messages/{id}/reactions")
    RetrofitCall<ReactionsResponse> getReactions(@InterfaceC37288s("id") String messageId, @InterfaceC37289t(MapboxMap.QFE_OFFSET) int offset, @InterfaceC37289t(MapboxMap.QFE_LIMIT) int limit);

    @InterfaceC37275f("/messages/{parent_id}/replies")
    RetrofitCall<MessagesResponse> getReplies(@InterfaceC37288s("parent_id") String messageId, @InterfaceC37289t(MapboxMap.QFE_LIMIT) int limit);

    @InterfaceC37275f("/messages/{parent_id}/replies")
    RetrofitCall<MessagesResponse> getRepliesMore(@InterfaceC37288s("parent_id") String messageId, @InterfaceC37289t(MapboxMap.QFE_LIMIT) int limit, @InterfaceC37289t("id_lt") String firstId);

    @InterfaceC37285p("/messages/{id}")
    RetrofitCall<MessageResponse> partialUpdateMessage(@InterfaceC37288s("id") String messageId, @InterfaceC37270a PartialUpdateMessageRequest body);

    @InterfaceC37284o("/drafts/query")
    RetrofitCall<QueryDraftMessagesResponse> queryDraftMessages(@InterfaceC37270a QueryDraftMessagesRequest request);

    @InterfaceC37284o("/drafts/query")
    RetrofitCall<QueryDraftMessagesResponse> queryDrafts(@InterfaceC37270a QueryDraftsRequest body);

    @InterfaceC37284o("/messages/{id}/reactions")
    RetrofitCall<QueryReactionsResponse> queryReactions(@InterfaceC37288s("id") String messageId, @InterfaceC37270a QueryReactionsRequest body);

    @InterfaceC37284o("/messages/{id}/action")
    RetrofitCall<MessageResponse> sendAction(@InterfaceC37288s("id") String messageId, @InterfaceC37270a SendActionRequest request);

    @InterfaceC37284o("/channels/{type}/{id}/message")
    RetrofitCall<MessageResponse> sendMessage(@InterfaceC37288s("type") String channelType, @InterfaceC37288s("id") String channelId, @InterfaceC37270a SendMessageRequest message);

    @InterfaceC37284o("/messages/{id}/reaction")
    RetrofitCall<ReactionResponse> sendReaction(@InterfaceC37288s("id") String messageId, @InterfaceC37270a ReactionRequest request);

    @InterfaceC37284o("/messages/{messageId}/translate")
    RetrofitCall<MessageResponse> translate(@InterfaceC37288s("messageId") String messageId, @InterfaceC37270a TranslateMessageRequest request);

    @InterfaceC37284o("/messages/{id}")
    RetrofitCall<MessageResponse> updateMessage(@InterfaceC37288s("id") String messageId, @InterfaceC37270a UpdateMessageRequest message);
}
