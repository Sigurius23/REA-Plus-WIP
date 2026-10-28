.class public interface abstract Lio/getstream/chat/android/client/api2/endpoint/GeneralApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/client/api/AuthenticatedApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008a\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\'\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J)\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00022\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0001\u0010\t\u001a\u00020\u0008H\'\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u00022\u0008\u0008\u0001\u0010\u000e\u001a\u00020\rH\'\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00022\u0008\u0008\u0001\u0010\u000e\u001a\u00020\u0012H\'\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0002H\'\u00a2\u0006\u0004\u0008\u0017\u0010\u0005\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0018\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/endpoint/GeneralApi;",
        "",
        "Lio/getstream/chat/android/client/call/RetrofitCall;",
        "Lud3/a1;",
        "warmUp",
        "()Lio/getstream/chat/android/client/call/RetrofitCall;",
        "Lio/getstream/chat/android/client/api2/model/requests/SyncHistoryRequest;",
        "body",
        "",
        "connectionId",
        "Lio/getstream/chat/android/client/api2/model/response/SyncHistoryResponse;",
        "getSyncHistory",
        "(Lio/getstream/chat/android/client/api2/model/requests/SyncHistoryRequest;Ljava/lang/String;)Lio/getstream/chat/android/client/call/RetrofitCall;",
        "Lio/getstream/chat/android/client/api2/model/requests/SearchMessagesRequest;",
        "payload",
        "Lio/getstream/chat/android/client/api2/model/response/SearchMessagesResponse;",
        "searchMessages",
        "(Lio/getstream/chat/android/client/api2/model/requests/SearchMessagesRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;",
        "Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;",
        "Lio/getstream/chat/android/client/api2/model/response/QueryMembersResponse;",
        "queryMembers",
        "(Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;",
        "Lio/getstream/chat/android/client/api2/model/dto/UnreadDto;",
        "getUnreadCounts",
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
.method public abstract getSyncHistory(Lio/getstream/chat/android/client/api2/model/requests/SyncHistoryRequest;Ljava/lang/String;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Lio/getstream/chat/android/client/api2/model/requests/SyncHistoryRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "connection_id"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api2/model/requests/SyncHistoryRequest;",
            "Ljava/lang/String;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/SyncHistoryResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/sync"
    .end annotation
.end method

.method public abstract getUnreadCounts()Lio/getstream/chat/android/client/call/RetrofitCall;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/dto/UnreadDto;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "/unread"
    .end annotation
.end method

.method public abstract queryMembers(Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;
        .annotation runtime Lio/getstream/chat/android/client/api2/UrlQueryPayload;
        .end annotation

        .annotation runtime Lwg3/t;
            value = "payload"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/QueryMembersResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "/members"
    .end annotation
.end method

.method public abstract searchMessages(Lio/getstream/chat/android/client/api2/model/requests/SearchMessagesRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Lio/getstream/chat/android/client/api2/model/requests/SearchMessagesRequest;
        .annotation runtime Lio/getstream/chat/android/client/api2/UrlQueryPayload;
        .end annotation

        .annotation runtime Lwg3/t;
            value = "payload"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api2/model/requests/SearchMessagesRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/SearchMessagesResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "/search"
    .end annotation
.end method

.method public abstract warmUp()Lio/getstream/chat/android/client/call/RetrofitCall;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lud3/a1;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/m;
        value = "/connect"
    .end annotation
.end method
