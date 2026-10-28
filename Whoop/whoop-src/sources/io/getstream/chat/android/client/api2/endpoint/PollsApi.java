package io.getstream.chat.android.client.api2.endpoint;

import io.getstream.chat.android.client.api.AuthenticatedApi;
import io.getstream.chat.android.client.api2.model.requests.CreatePollRequest;
import io.getstream.chat.android.client.api2.model.requests.PartialUpdatePollRequest;
import io.getstream.chat.android.client.api2.model.requests.PollVoteRequest;
import io.getstream.chat.android.client.api2.model.requests.QueryPollVotesRequest;
import io.getstream.chat.android.client.api2.model.requests.QueryPollsRequest;
import io.getstream.chat.android.client.api2.model.requests.UpdatePollRequest;
import io.getstream.chat.android.client.api2.model.requests.UpstreamOptionDto;
import io.getstream.chat.android.client.api2.model.response.CompletableResponse;
import io.getstream.chat.android.client.api2.model.response.PollOptionResponse;
import io.getstream.chat.android.client.api2.model.response.PollResponse;
import io.getstream.chat.android.client.api2.model.response.PollVoteResponse;
import io.getstream.chat.android.client.api2.model.response.QueryPollVotesResponse;
import io.getstream.chat.android.client.api2.model.response.QueryPollsResponse;
import io.getstream.chat.android.client.call.RetrofitCall;
import p715kotlin.Metadata;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37271b;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37283n;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37285p;
import wg3.InterfaceC37288s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\bH'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\fH'J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u000b\u001a\u00020\fH'J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u000fH'J\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u0012H'J\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u0012H'J\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0015\u001a\u00020\fH'J\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u0018H'J\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u001bH'J,\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00032\b\b\u0001\u0010\u001e\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u001f\u001a\u00020 H'J,\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00032\b\b\u0001\u0010\u001e\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\"\u001a\u00020\fH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006#À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/endpoint/PollsApi;", "", "createPoll", "Lio/getstream/chat/android/client/call/RetrofitCall;", "Lio/getstream/chat/android/client/api2/model/response/PollResponse;", "body", "Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;", "updatePoll", "Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;", "deletePoll", "Lio/getstream/chat/android/client/api2/model/response/CompletableResponse;", "pollId", "", "getPoll", "partialUpdatePoll", "Lio/getstream/chat/android/client/api2/model/requests/PartialUpdatePollRequest;", "createPollOption", "Lio/getstream/chat/android/client/api2/model/response/PollOptionResponse;", "Lio/getstream/chat/android/client/api2/model/requests/UpstreamOptionDto;", "updatePollOption", "deletePollOption", "optionId", "queryPollVotes", "Lio/getstream/chat/android/client/api2/model/response/QueryPollVotesResponse;", "Lio/getstream/chat/android/client/api2/model/requests/QueryPollVotesRequest;", "queryPolls", "Lio/getstream/chat/android/client/api2/model/response/QueryPollsResponse;", "Lio/getstream/chat/android/client/api2/model/requests/QueryPollsRequest;", "castPollVote", "Lio/getstream/chat/android/client/api2/model/response/PollVoteResponse;", "messageId", "pollVoteRequest", "Lio/getstream/chat/android/client/api2/model/requests/PollVoteRequest;", "removePollVote", "voteId", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
@AuthenticatedApi
public interface PollsApi {
    @InterfaceC37284o("/messages/{message_id}/polls/{poll_id}/vote")
    RetrofitCall<PollVoteResponse> castPollVote(@InterfaceC37288s("message_id") String messageId, @InterfaceC37288s("poll_id") String pollId, @InterfaceC37270a PollVoteRequest pollVoteRequest);

    @InterfaceC37284o("/polls")
    RetrofitCall<PollResponse> createPoll(@InterfaceC37270a CreatePollRequest body);

    @InterfaceC37284o("/polls/{poll_id}/options")
    RetrofitCall<PollOptionResponse> createPollOption(@InterfaceC37288s("poll_id") String pollId, @InterfaceC37270a UpstreamOptionDto body);

    @InterfaceC37271b("/polls/{poll_id}")
    RetrofitCall<CompletableResponse> deletePoll(@InterfaceC37288s("poll_id") String pollId);

    @InterfaceC37271b("/polls/{poll_id}/options/{option_id}")
    RetrofitCall<CompletableResponse> deletePollOption(@InterfaceC37288s("poll_id") String pollId, @InterfaceC37288s("option_id") String optionId);

    @InterfaceC37275f("/polls/{poll_id}")
    RetrofitCall<PollResponse> getPoll(@InterfaceC37288s("poll_id") String pollId);

    @InterfaceC37283n("/polls/{poll_id}")
    RetrofitCall<PollResponse> partialUpdatePoll(@InterfaceC37288s("poll_id") String pollId, @InterfaceC37270a PartialUpdatePollRequest body);

    @InterfaceC37284o("/polls/{poll_id}/votes")
    RetrofitCall<QueryPollVotesResponse> queryPollVotes(@InterfaceC37288s("poll_id") String pollId, @InterfaceC37270a QueryPollVotesRequest body);

    @InterfaceC37284o("/polls/query")
    RetrofitCall<QueryPollsResponse> queryPolls(@InterfaceC37270a QueryPollsRequest body);

    @InterfaceC37271b("/messages/{message_id}/polls/{poll_id}/vote/{vote_id}")
    RetrofitCall<PollVoteResponse> removePollVote(@InterfaceC37288s("message_id") String messageId, @InterfaceC37288s("poll_id") String pollId, @InterfaceC37288s("vote_id") String voteId);

    @InterfaceC37285p("/polls")
    RetrofitCall<PollResponse> updatePoll(@InterfaceC37270a UpdatePollRequest body);

    @InterfaceC37285p("/polls/{poll_id}/options")
    RetrofitCall<PollOptionResponse> updatePollOption(@InterfaceC37288s("poll_id") String pollId, @InterfaceC37270a UpstreamOptionDto body);
}
