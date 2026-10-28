.class public interface abstract Lio/getstream/chat/android/client/api2/endpoint/ThreadsApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/client/api/AuthenticatedApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008a\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0008H\'J8\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00032\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u00062\u0014\u0008\u0001\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\rH\'J\"\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u00032\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u0011H\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0012\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/endpoint/ThreadsApi;",
        "",
        "queryThreads",
        "Lio/getstream/chat/android/client/call/RetrofitCall;",
        "Lio/getstream/chat/android/client/api2/model/response/QueryThreadsResponse;",
        "connectionId",
        "",
        "request",
        "Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;",
        "getThread",
        "Lio/getstream/chat/android/client/api2/model/response/ThreadResponse;",
        "messageId",
        "options",
        "",
        "partialUpdateThread",
        "Lio/getstream/chat/android/client/api2/model/response/ThreadInfoResponse;",
        "body",
        "Lio/getstream/chat/android/client/api2/model/requests/PartialUpdateThreadRequest;",
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
.method public abstract getThread(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "message_id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "connection_id"
        .end annotation
    .end param
    .param p3    # Ljava/util/Map;
        .annotation runtime Lwg3/u;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/ThreadResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "/threads/{message_id}"
    .end annotation
.end method

.method public abstract partialUpdateThread(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/PartialUpdateThreadRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "message_id"
        .end annotation
    .end param
    .param p2    # Lio/getstream/chat/android/client/api2/model/requests/PartialUpdateThreadRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/requests/PartialUpdateThreadRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/ThreadInfoResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/n;
        value = "/threads/{message_id}"
    .end annotation
.end method

.method public abstract queryThreads(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "connection_id"
        .end annotation
    .end param
    .param p2    # Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/QueryThreadsResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/threads"
    .end annotation
.end method
