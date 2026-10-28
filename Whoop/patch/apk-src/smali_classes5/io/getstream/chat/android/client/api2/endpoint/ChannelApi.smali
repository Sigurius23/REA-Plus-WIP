.class public interface abstract Lio/getstream/chat/android/client/api2/endpoint/ChannelApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/client/api/AuthenticatedApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ae\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008a\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0008H\'J,\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00032\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u000cH\'J$\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00032\u0014\u0008\u0003\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0010H\'J,\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00032\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0013\u001a\u00020\u0014H\'J,\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00032\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0013\u001a\u00020\u0016H\'J,\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00032\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0013\u001a\u00020\u0018H\'J\"\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00032\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u0006H\'J,\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00032\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0013\u001a\u00020\u001bH\'J,\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00032\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0013\u001a\u00020\u001dH\'J,\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00032\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0013\u001a\u00020\u001fH\'J,\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\n0\u00032\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0013\u001a\u00020!H\'J,\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00032\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0013\u001a\u00020#H\'J6\u0010$\u001a\u0008\u0012\u0004\u0012\u00020%0\u00032\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u00062\u0008\u0008\u0001\u0010&\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0013\u001a\u00020\'H\'J,\u0010(\u001a\u0008\u0012\u0004\u0012\u00020)0\u00032\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0007\u001a\u00020*H\'J,\u0010+\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00032\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0013\u001a\u00020,H\'J,\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00032\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0013\u001a\u00020.H\'J6\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00032\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u000cH\'J,\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00032\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0007\u001a\u000200H\'J,\u00101\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00032\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0007\u001a\u000202H\'J8\u00103\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00032\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u00062\u0014\u0008\u0001\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0010H\'JB\u00104\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00032\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u00062\u0014\u0008\u0001\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0010H\'J,\u00105\u001a\u0008\u0012\u0004\u0012\u0002060\u00032\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u00062\u0008\u0008\u0001\u00107\u001a\u000208H\'J\u0018\u00109\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00032\u0008\u0008\u0001\u0010\u0007\u001a\u00020:H\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006;\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/endpoint/ChannelApi;",
        "",
        "queryChannels",
        "Lio/getstream/chat/android/client/call/RetrofitCall;",
        "Lio/getstream/chat/android/client/api2/model/response/QueryChannelsResponse;",
        "connectionId",
        "",
        "request",
        "Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;",
        "queryChannel",
        "Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;",
        "channelType",
        "Lio/getstream/chat/android/client/api2/model/requests/QueryChannelRequest;",
        "markAllRead",
        "Lio/getstream/chat/android/client/api2/model/response/CompletableResponse;",
        "map",
        "",
        "updateChannel",
        "channelId",
        "body",
        "Lio/getstream/chat/android/client/api2/model/requests/UpdateChannelRequest;",
        "updateChannelPartial",
        "Lio/getstream/chat/android/client/api2/model/requests/UpdateChannelPartialRequest;",
        "updateCooldown",
        "Lio/getstream/chat/android/client/api2/model/requests/UpdateCooldownRequest;",
        "deleteChannel",
        "acceptInvite",
        "Lio/getstream/chat/android/client/api2/model/requests/AcceptInviteRequest;",
        "rejectInvite",
        "Lio/getstream/chat/android/client/api2/model/requests/RejectInviteRequest;",
        "addMembers",
        "Lio/getstream/chat/android/client/api2/model/requests/AddMembersRequest;",
        "removeMembers",
        "Lio/getstream/chat/android/client/api2/model/requests/RemoveMembersRequest;",
        "inviteMembers",
        "Lio/getstream/chat/android/client/api2/model/requests/InviteMembersRequest;",
        "partialUpdateMember",
        "Lio/getstream/chat/android/client/api2/model/requests/UpdateMemberPartialResponse;",
        "userId",
        "Lio/getstream/chat/android/client/api2/model/requests/UpdateMemberPartialRequest;",
        "sendEvent",
        "Lio/getstream/chat/android/client/api2/model/response/EventResponse;",
        "Lio/getstream/chat/android/client/api2/model/requests/SendEventRequest;",
        "hideChannel",
        "Lio/getstream/chat/android/client/api2/model/requests/HideChannelRequest;",
        "truncateChannel",
        "Lio/getstream/chat/android/client/api2/model/requests/TruncateChannelRequest;",
        "markRead",
        "Lio/getstream/chat/android/client/api2/model/requests/MarkReadRequest;",
        "markUnread",
        "Lio/getstream/chat/android/client/api2/model/requests/MarkUnreadRequest;",
        "showChannel",
        "stopWatching",
        "getPinnedMessages",
        "Lio/getstream/chat/android/client/api2/model/response/MessagesResponse;",
        "payload",
        "Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;",
        "markDelivered",
        "Lio/getstream/chat/android/client/api2/model/requests/MarkDeliveredRequest;",
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


# direct methods
.method public static synthetic markAllRead$default(Lio/getstream/chat/android/client/api2/endpoint/ChannelApi;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, Lm83/z;->w:Lm83/z;

    :cond_0
    invoke-interface {p0, p1}, Lio/getstream/chat/android/client/api2/endpoint/ChannelApi;->markAllRead(Ljava/util/Map;)Lio/getstream/chat/android/client/call/RetrofitCall;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: markAllRead"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract acceptInvite(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/AcceptInviteRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "type"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
        .end annotation
    .end param
    .param p3    # Lio/getstream/chat/android/client/api2/model/requests/AcceptInviteRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/requests/AcceptInviteRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/channels/{type}/{id}"
    .end annotation
.end method

.method public abstract addMembers(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/AddMembersRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "type"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
        .end annotation
    .end param
    .param p3    # Lio/getstream/chat/android/client/api2/model/requests/AddMembersRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/requests/AddMembersRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/channels/{type}/{id}"
    .end annotation
.end method

.method public abstract deleteChannel(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "type"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/b;
        value = "/channels/{type}/{id}"
    .end annotation
.end method

.method public abstract getPinnedMessages(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "type"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
        .end annotation
    .end param
    .param p3    # Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;
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
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/MessagesResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "/channels/{type}/{id}/pinned_messages"
    .end annotation
.end method

.method public abstract hideChannel(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/HideChannelRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "type"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
        .end annotation
    .end param
    .param p3    # Lio/getstream/chat/android/client/api2/model/requests/HideChannelRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/requests/HideChannelRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/CompletableResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/channels/{type}/{id}/hide"
    .end annotation
.end method

.method public abstract inviteMembers(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/InviteMembersRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "type"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
        .end annotation
    .end param
    .param p3    # Lio/getstream/chat/android/client/api2/model/requests/InviteMembersRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/requests/InviteMembersRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/channels/{type}/{id}"
    .end annotation
.end method

.method public abstract markAllRead(Ljava/util/Map;)Lio/getstream/chat/android/client/call/RetrofitCall;
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
            "Lio/getstream/chat/android/client/api2/model/response/CompletableResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/channels/read"
    .end annotation
.end method

.method public abstract markDelivered(Lio/getstream/chat/android/client/api2/model/requests/MarkDeliveredRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Lio/getstream/chat/android/client/api2/model/requests/MarkDeliveredRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api2/model/requests/MarkDeliveredRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/CompletableResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/channels/delivered"
    .end annotation
.end method

.method public abstract markRead(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/MarkReadRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "type"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
        .end annotation
    .end param
    .param p3    # Lio/getstream/chat/android/client/api2/model/requests/MarkReadRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/requests/MarkReadRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/CompletableResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/channels/{type}/{id}/read"
    .end annotation
.end method

.method public abstract markUnread(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/MarkUnreadRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "type"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
        .end annotation
    .end param
    .param p3    # Lio/getstream/chat/android/client/api2/model/requests/MarkUnreadRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/requests/MarkUnreadRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/CompletableResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/channels/{type}/{id}/unread"
    .end annotation
.end method

.method public abstract partialUpdateMember(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/UpdateMemberPartialRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "type"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "user_id"
        .end annotation
    .end param
    .param p4    # Lio/getstream/chat/android/client/api2/model/requests/UpdateMemberPartialRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/requests/UpdateMemberPartialRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/requests/UpdateMemberPartialResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/n;
        value = "/channels/{type}/{id}/member/{user_id}"
    .end annotation
.end method

.method public abstract queryChannel(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/QueryChannelRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "type"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "connection_id"
        .end annotation
    .end param
    .param p3    # Lio/getstream/chat/android/client/api2/model/requests/QueryChannelRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/requests/QueryChannelRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/channels/{type}/query"
    .end annotation
.end method

.method public abstract queryChannel(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/QueryChannelRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "type"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "connection_id"
        .end annotation
    .end param
    .param p4    # Lio/getstream/chat/android/client/api2/model/requests/QueryChannelRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/requests/QueryChannelRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/channels/{type}/{id}/query"
    .end annotation
.end method

.method public abstract queryChannels(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "connection_id"
        .end annotation
    .end param
    .param p2    # Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/QueryChannelsResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/channels"
    .end annotation
.end method

.method public abstract rejectInvite(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/RejectInviteRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "type"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
        .end annotation
    .end param
    .param p3    # Lio/getstream/chat/android/client/api2/model/requests/RejectInviteRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/requests/RejectInviteRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/channels/{type}/{id}"
    .end annotation
.end method

.method public abstract removeMembers(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/RemoveMembersRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "type"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
        .end annotation
    .end param
    .param p3    # Lio/getstream/chat/android/client/api2/model/requests/RemoveMembersRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/requests/RemoveMembersRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/channels/{type}/{id}"
    .end annotation
.end method

.method public abstract sendEvent(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/SendEventRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "type"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
        .end annotation
    .end param
    .param p3    # Lio/getstream/chat/android/client/api2/model/requests/SendEventRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/requests/SendEventRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/EventResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/channels/{type}/{id}/event"
    .end annotation
.end method

.method public abstract showChannel(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "type"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
        .end annotation
    .end param
    .param p3    # Ljava/util/Map;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/CompletableResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/channels/{type}/{id}/show"
    .end annotation
.end method

.method public abstract stopWatching(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "type"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "connection_id"
        .end annotation
    .end param
    .param p4    # Ljava/util/Map;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/CompletableResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/channels/{type}/{id}/stop-watching"
    .end annotation
.end method

.method public abstract truncateChannel(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/TruncateChannelRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "type"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
        .end annotation
    .end param
    .param p3    # Lio/getstream/chat/android/client/api2/model/requests/TruncateChannelRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/requests/TruncateChannelRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/channels/{type}/{id}/truncate"
    .end annotation
.end method

.method public abstract updateChannel(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/UpdateChannelRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "type"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
        .end annotation
    .end param
    .param p3    # Lio/getstream/chat/android/client/api2/model/requests/UpdateChannelRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/requests/UpdateChannelRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/channels/{type}/{id}"
    .end annotation
.end method

.method public abstract updateChannelPartial(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/UpdateChannelPartialRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "type"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
        .end annotation
    .end param
    .param p3    # Lio/getstream/chat/android/client/api2/model/requests/UpdateChannelPartialRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/requests/UpdateChannelPartialRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/n;
        value = "/channels/{type}/{id}"
    .end annotation
.end method

.method public abstract updateCooldown(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/UpdateCooldownRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "type"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
        .end annotation
    .end param
    .param p3    # Lio/getstream/chat/android/client/api2/model/requests/UpdateCooldownRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/requests/UpdateCooldownRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/n;
        value = "/channels/{type}/{id}"
    .end annotation
.end method
