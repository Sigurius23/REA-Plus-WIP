.class public final Lio/getstream/chat/android/client/api/models/WatchChannelRequest;
.super Lio/getstream/chat/android/client/api/models/QueryChannelRequest;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006H\u0016J\u0018\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000bH\u0016J\u0018\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016J \u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016\u00a8\u0006\u0012"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api/models/WatchChannelRequest;",
        "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
        "<init>",
        "()V",
        "withData",
        "data",
        "",
        "",
        "",
        "withMembers",
        "limit",
        "",
        "offset",
        "withWatchers",
        "withMessages",
        "direction",
        "Lio/getstream/chat/android/client/api/models/Pagination;",
        "messageId",
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
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;-><init>()V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->setWatch(Z)V

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->setPresence(Z)V

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->setState(Z)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic withData(Ljava/util/Map;)Lio/getstream/chat/android/client/api/models/QueryChannelRequest;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/api/models/WatchChannelRequest;->withData(Ljava/util/Map;)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;

    return-object p0
.end method

.method public final withData(Ljava/util/Map;)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/getstream/chat/android/client/api/models/WatchChannelRequest;"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-super {p0, p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->withData(Ljava/util/Map;)Lio/getstream/chat/android/client/api/models/QueryChannelRequest;

    return-object p0
.end method

.method public final withMembers(II)Lio/getstream/chat/android/client/api/models/QueryChannelRequest;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->withMembers(II)Lio/getstream/chat/android/client/api/models/QueryChannelRequest;

    return-object p0
.end method

.method public final withMembers(II)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;
    .locals 0

    .line 2
    invoke-super {p0, p1, p2}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->withMembers(II)Lio/getstream/chat/android/client/api/models/QueryChannelRequest;

    return-object p0
.end method

.method public final withMessages(I)Lio/getstream/chat/android/client/api/models/QueryChannelRequest;
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->withMessages(I)Lio/getstream/chat/android/client/api/models/QueryChannelRequest;

    return-object p0
.end method

.method public final bridge synthetic withMessages(Lio/getstream/chat/android/client/api/models/Pagination;Ljava/lang/String;I)Lio/getstream/chat/android/client/api/models/QueryChannelRequest;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/client/api/models/WatchChannelRequest;->withMessages(Lio/getstream/chat/android/client/api/models/Pagination;Ljava/lang/String;I)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;

    return-object p0
.end method

.method public final withMessages(I)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;
    .locals 0

    .line 3
    invoke-super {p0, p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->withMessages(I)Lio/getstream/chat/android/client/api/models/QueryChannelRequest;

    return-object p0
.end method

.method public final withMessages(Lio/getstream/chat/android/client/api/models/Pagination;Ljava/lang/String;I)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;
    .locals 1

    const-string v0, "direction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-super {p0, p1, p2, p3}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->withMessages(Lio/getstream/chat/android/client/api/models/Pagination;Ljava/lang/String;I)Lio/getstream/chat/android/client/api/models/QueryChannelRequest;

    return-object p0
.end method

.method public final withWatchers(II)Lio/getstream/chat/android/client/api/models/QueryChannelRequest;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->withWatchers(II)Lio/getstream/chat/android/client/api/models/QueryChannelRequest;

    return-object p0
.end method

.method public final withWatchers(II)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;
    .locals 0

    .line 2
    invoke-super {p0, p1, p2}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->withWatchers(II)Lio/getstream/chat/android/client/api/models/QueryChannelRequest;

    return-object p0
.end method
