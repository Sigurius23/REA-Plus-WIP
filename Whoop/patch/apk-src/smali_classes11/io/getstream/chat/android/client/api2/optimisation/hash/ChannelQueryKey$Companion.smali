.class public final Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey$Companion;",
        "",
        "<init>",
        "()V",
        "from",
        "Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;",
        "channelType",
        "",
        "channelId",
        "query",
        "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
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
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final from(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;
    .locals 9

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "query"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;

    new-instance v1, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelRequest;

    invoke-virtual {p3}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->getState()Z

    move-result v2

    invoke-virtual {p3}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->getWatch()Z

    move-result v3

    invoke-virtual {p3}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->getPresence()Z

    move-result v4

    invoke-virtual {p3}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->getMessages()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {p3}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->getWatchers()Ljava/util/Map;

    move-result-object v6

    invoke-virtual {p3}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->getMembers()Ljava/util/Map;

    move-result-object v7

    invoke-virtual {p3}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->getData()Ljava/util/Map;

    move-result-object v8

    invoke-direct/range {v1 .. v8}, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelRequest;-><init>(ZZZLjava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V

    invoke-direct {v0, p1, p2, v1}, Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/QueryChannelRequest;)V

    return-object v0
.end method
