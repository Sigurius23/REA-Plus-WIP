.class public interface abstract Lio/getstream/chat/android/client/api2/endpoint/ModerationApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/client/api/AuthenticatedApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008a\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\nH\'J\u0018\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\nH\'J\u0018\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u000eH\'J$\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00032\u0014\u0008\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010H\'J\u0018\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0013H\'J6\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00032\u0008\u0008\u0001\u0010\u0015\u001a\u00020\u00112\u0008\u0008\u0001\u0010\u0016\u001a\u00020\u00112\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u00112\u0008\u0008\u0001\u0010\u0018\u001a\u00020\u0019H\'J\u0018\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u00032\u0008\u0008\u0001\u0010\u001c\u001a\u00020\u001dH\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u001e\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/endpoint/ModerationApi;",
        "",
        "muteUser",
        "Lio/getstream/chat/android/client/call/RetrofitCall;",
        "Lio/getstream/chat/android/client/api2/model/response/MuteUserResponse;",
        "body",
        "Lio/getstream/chat/android/client/api2/model/requests/MuteUserRequest;",
        "unmuteUser",
        "Lio/getstream/chat/android/client/api2/model/response/CompletableResponse;",
        "muteChannel",
        "Lio/getstream/chat/android/client/api2/model/requests/MuteChannelRequest;",
        "unmuteChannel",
        "flag",
        "Lio/getstream/chat/android/client/api2/model/response/FlagResponse;",
        "Lio/getstream/chat/android/client/api2/model/requests/FlagRequest;",
        "unflag",
        "",
        "",
        "banUser",
        "Lio/getstream/chat/android/client/api2/model/requests/BanUserRequest;",
        "unbanUser",
        "targetUserId",
        "channelType",
        "channelId",
        "shadow",
        "",
        "queryBannedUsers",
        "Lio/getstream/chat/android/client/api2/model/response/QueryBannedUsersResponse;",
        "payload",
        "Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;",
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
.method public abstract banUser(Lio/getstream/chat/android/client/api2/model/requests/BanUserRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Lio/getstream/chat/android/client/api2/model/requests/BanUserRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api2/model/requests/BanUserRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/CompletableResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/moderation/ban"
    .end annotation
.end method

.method public abstract flag(Lio/getstream/chat/android/client/api2/model/requests/FlagRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Lio/getstream/chat/android/client/api2/model/requests/FlagRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api2/model/requests/FlagRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/FlagResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/moderation/flag"
    .end annotation
.end method

.method public abstract muteChannel(Lio/getstream/chat/android/client/api2/model/requests/MuteChannelRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Lio/getstream/chat/android/client/api2/model/requests/MuteChannelRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api2/model/requests/MuteChannelRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/CompletableResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/moderation/mute/channel"
    .end annotation
.end method

.method public abstract muteUser(Lio/getstream/chat/android/client/api2/model/requests/MuteUserRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Lio/getstream/chat/android/client/api2/model/requests/MuteUserRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api2/model/requests/MuteUserRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/MuteUserResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/moderation/mute"
    .end annotation
.end method

.method public abstract queryBannedUsers(Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;
        .annotation runtime Lio/getstream/chat/android/client/api2/UrlQueryPayload;
        .end annotation

        .annotation runtime Lwg3/t;
            value = "payload"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/QueryBannedUsersResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "/query_banned_users"
    .end annotation
.end method

.method public abstract unbanUser(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "target_user_id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "type"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "id"
        .end annotation
    .end param
    .param p4    # Z
        .annotation runtime Lwg3/t;
            value = "shadow"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z)",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/CompletableResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/b;
        value = "/moderation/ban"
    .end annotation
.end method

.method public abstract unflag(Ljava/util/Map;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/util/Map;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/FlagResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/moderation/unflag"
    .end annotation
.end method

.method public abstract unmuteChannel(Lio/getstream/chat/android/client/api2/model/requests/MuteChannelRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Lio/getstream/chat/android/client/api2/model/requests/MuteChannelRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api2/model/requests/MuteChannelRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/CompletableResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/moderation/unmute/channel"
    .end annotation
.end method

.method public abstract unmuteUser(Lio/getstream/chat/android/client/api2/model/requests/MuteUserRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Lio/getstream/chat/android/client/api2/model/requests/MuteUserRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api2/model/requests/MuteUserRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/CompletableResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/moderation/unmute"
    .end annotation
.end method
