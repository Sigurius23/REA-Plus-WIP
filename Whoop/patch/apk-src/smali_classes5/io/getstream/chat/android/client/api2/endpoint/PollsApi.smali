.class public interface abstract Lio/getstream/chat/android/client/api2/endpoint/PollsApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/client/api/AuthenticatedApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008a\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0008H\'J\u0018\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00032\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u000cH\'J\u0018\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u000cH\'J\"\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u000fH\'J\"\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00032\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0012H\'J\"\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00032\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0012H\'J\"\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00032\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0001\u0010\u0015\u001a\u00020\u000cH\'J\"\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00032\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0018H\'J\u0018\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u001bH\'J,\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u00032\u0008\u0008\u0001\u0010\u001e\u001a\u00020\u000c2\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0001\u0010\u001f\u001a\u00020 H\'J,\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u00032\u0008\u0008\u0001\u0010\u001e\u001a\u00020\u000c2\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0001\u0010\"\u001a\u00020\u000cH\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006#\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/endpoint/PollsApi;",
        "",
        "createPoll",
        "Lio/getstream/chat/android/client/call/RetrofitCall;",
        "Lio/getstream/chat/android/client/api2/model/response/PollResponse;",
        "body",
        "Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;",
        "updatePoll",
        "Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;",
        "deletePoll",
        "Lio/getstream/chat/android/client/api2/model/response/CompletableResponse;",
        "pollId",
        "",
        "getPoll",
        "partialUpdatePoll",
        "Lio/getstream/chat/android/client/api2/model/requests/PartialUpdatePollRequest;",
        "createPollOption",
        "Lio/getstream/chat/android/client/api2/model/response/PollOptionResponse;",
        "Lio/getstream/chat/android/client/api2/model/requests/UpstreamOptionDto;",
        "updatePollOption",
        "deletePollOption",
        "optionId",
        "queryPollVotes",
        "Lio/getstream/chat/android/client/api2/model/response/QueryPollVotesResponse;",
        "Lio/getstream/chat/android/client/api2/model/requests/QueryPollVotesRequest;",
        "queryPolls",
        "Lio/getstream/chat/android/client/api2/model/response/QueryPollsResponse;",
        "Lio/getstream/chat/android/client/api2/model/requests/QueryPollsRequest;",
        "castPollVote",
        "Lio/getstream/chat/android/client/api2/model/response/PollVoteResponse;",
        "messageId",
        "pollVoteRequest",
        "Lio/getstream/chat/android/client/api2/model/requests/PollVoteRequest;",
        "removePollVote",
        "voteId",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract castPollVote(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/PollVoteRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "message_id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "poll_id"
        .end annotation
    .end param
    .param p3    # Lio/getstream/chat/android/client/api2/model/requests/PollVoteRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/requests/PollVoteRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/PollVoteResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/messages/{message_id}/polls/{poll_id}/vote"
    .end annotation
.end method

.method public abstract createPoll(Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/PollResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/polls"
    .end annotation
.end method

.method public abstract createPollOption(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/UpstreamOptionDto;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "poll_id"
        .end annotation
    .end param
    .param p2    # Lio/getstream/chat/android/client/api2/model/requests/UpstreamOptionDto;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/requests/UpstreamOptionDto;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/PollOptionResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/polls/{poll_id}/options"
    .end annotation
.end method

.method public abstract deletePoll(Ljava/lang/String;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "poll_id"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/CompletableResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/b;
        value = "/polls/{poll_id}"
    .end annotation
.end method

.method public abstract deletePollOption(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "poll_id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "option_id"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/CompletableResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/b;
        value = "/polls/{poll_id}/options/{option_id}"
    .end annotation
.end method

.method public abstract getPoll(Ljava/lang/String;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "poll_id"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/PollResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "/polls/{poll_id}"
    .end annotation
.end method

.method public abstract partialUpdatePoll(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/PartialUpdatePollRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "poll_id"
        .end annotation
    .end param
    .param p2    # Lio/getstream/chat/android/client/api2/model/requests/PartialUpdatePollRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/requests/PartialUpdatePollRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/PollResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/n;
        value = "/polls/{poll_id}"
    .end annotation
.end method

.method public abstract queryPollVotes(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/QueryPollVotesRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "poll_id"
        .end annotation
    .end param
    .param p2    # Lio/getstream/chat/android/client/api2/model/requests/QueryPollVotesRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/requests/QueryPollVotesRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/QueryPollVotesResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/polls/{poll_id}/votes"
    .end annotation
.end method

.method public abstract queryPolls(Lio/getstream/chat/android/client/api2/model/requests/QueryPollsRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Lio/getstream/chat/android/client/api2/model/requests/QueryPollsRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api2/model/requests/QueryPollsRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/QueryPollsResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/polls/query"
    .end annotation
.end method

.method public abstract removePollVote(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "message_id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "poll_id"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "vote_id"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/PollVoteResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/b;
        value = "/messages/{message_id}/polls/{poll_id}/vote/{vote_id}"
    .end annotation
.end method

.method public abstract updatePoll(Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/PollResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "/polls"
    .end annotation
.end method

.method public abstract updatePollOption(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/UpstreamOptionDto;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "poll_id"
        .end annotation
    .end param
    .param p2    # Lio/getstream/chat/android/client/api2/model/requests/UpstreamOptionDto;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/requests/UpstreamOptionDto;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/PollOptionResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "/polls/{poll_id}/options"
    .end annotation
.end method
