.class public interface abstract Lio/getstream/chat/android/client/api2/endpoint/UserApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/client/api/AuthenticatedApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008a\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0008H\'J\u0018\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00032\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u000bH\'J\u0018\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00032\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u000eH\'J\u000e\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u0003H\'J\"\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0012H\'J\"\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0015\u001a\u00020\u0016H\'J\u000e\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0003H\'J\u0018\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00032\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u001bH\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u001c\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/endpoint/UserApi;",
        "",
        "updateUsers",
        "Lio/getstream/chat/android/client/call/RetrofitCall;",
        "Lio/getstream/chat/android/client/api2/model/response/UpdateUsersResponse;",
        "connectionId",
        "",
        "body",
        "Lio/getstream/chat/android/client/api2/model/requests/UpdateUsersRequest;",
        "blockUser",
        "Lio/getstream/chat/android/client/api2/model/response/BlockUserResponse;",
        "Lio/getstream/chat/android/client/api2/model/requests/BlockUserRequest;",
        "unblockUser",
        "Lio/getstream/chat/android/client/api2/model/response/UnblockUserResponse;",
        "Lio/getstream/chat/android/client/api2/model/requests/UnblockUserRequest;",
        "queryBlockedUsers",
        "Lio/getstream/chat/android/client/api2/model/response/QueryBlockedUsersResponse;",
        "partialUpdateUsers",
        "Lio/getstream/chat/android/client/api2/model/requests/PartialUpdateUsersRequest;",
        "queryUsers",
        "Lio/getstream/chat/android/client/api2/model/response/UsersResponse;",
        "payload",
        "Lio/getstream/chat/android/client/api2/model/requests/QueryUsersRequest;",
        "liveLocations",
        "Lio/getstream/chat/android/client/api2/model/response/LiveLocationsResponse;",
        "updateLiveLocation",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;",
        "Lio/getstream/chat/android/client/api2/model/requests/UpdateLiveLocationRequest;",
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
.method public abstract blockUser(Lio/getstream/chat/android/client/api2/model/requests/BlockUserRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Lio/getstream/chat/android/client/api2/model/requests/BlockUserRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api2/model/requests/BlockUserRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/BlockUserResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/users/block"
    .end annotation
.end method

.method public abstract liveLocations()Lio/getstream/chat/android/client/call/RetrofitCall;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/LiveLocationsResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "/users/live_locations"
    .end annotation
.end method

.method public abstract partialUpdateUsers(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/PartialUpdateUsersRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "connection_id"
        .end annotation
    .end param
    .param p2    # Lio/getstream/chat/android/client/api2/model/requests/PartialUpdateUsersRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/requests/PartialUpdateUsersRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/UpdateUsersResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/n;
        value = "/users"
    .end annotation
.end method

.method public abstract queryBlockedUsers()Lio/getstream/chat/android/client/call/RetrofitCall;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/QueryBlockedUsersResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "/users/block"
    .end annotation
.end method

.method public abstract queryUsers(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/QueryUsersRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "connection_id"
        .end annotation
    .end param
    .param p2    # Lio/getstream/chat/android/client/api2/model/requests/QueryUsersRequest;
        .annotation runtime Lio/getstream/chat/android/client/api2/UrlQueryPayload;
        .end annotation

        .annotation runtime Lwg3/t;
            value = "payload"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/requests/QueryUsersRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/UsersResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "/users"
    .end annotation
.end method

.method public abstract unblockUser(Lio/getstream/chat/android/client/api2/model/requests/UnblockUserRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Lio/getstream/chat/android/client/api2/model/requests/UnblockUserRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api2/model/requests/UnblockUserRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/UnblockUserResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/users/unblock"
    .end annotation
.end method

.method public abstract updateLiveLocation(Lio/getstream/chat/android/client/api2/model/requests/UpdateLiveLocationRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Lio/getstream/chat/android/client/api2/model/requests/UpdateLiveLocationRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api2/model/requests/UpdateLiveLocationRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "/users/live_locations"
    .end annotation
.end method

.method public abstract updateUsers(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/UpdateUsersRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "connection_id"
        .end annotation
    .end param
    .param p2    # Lio/getstream/chat/android/client/api2/model/requests/UpdateUsersRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/requests/UpdateUsersRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/UpdateUsersResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/users"
    .end annotation
.end method
