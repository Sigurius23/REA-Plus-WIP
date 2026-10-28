.class public Lio/getstream/chat/android/client/api/models/QueryChannelRequest;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/api/models/ChannelRequest;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/api/models/QueryChannelRequest$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/api/models/ChannelRequest<",
        "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u001d\n\u0002\u0010%\n\u0002\u0008\u000b\u0008\u0016\u0018\u0000 J2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001JB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J#\u0010\u0008\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\r\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\'\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u0018J\r\u0010\u001b\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u0018J\r\u0010\u001c\u001a\u00020\n\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\n\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\r\u0010\u001f\u001a\u00020\n\u00a2\u0006\u0004\u0008\u001f\u0010\u001dJ\r\u0010 \u001a\u00020\n\u00a2\u0006\u0004\u0008 \u0010\u001dJ\r\u0010!\u001a\u00020\n\u00a2\u0006\u0004\u0008!\u0010\u001dJ\u001b\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0005\u0018\u00010\"\u00a2\u0006\u0004\u0008#\u0010$J\u001a\u0010&\u001a\u00020\u00162\u0008\u0010%\u001a\u0004\u0018\u00010\u0006H\u0096\u0002\u00a2\u0006\u0004\u0008&\u0010\'J\u000f\u0010(\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008(\u0010\u001dJ\u000f\u0010)\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008)\u0010*R\"\u0010+\u001a\u00020\u00168\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008+\u0010,\u001a\u0004\u0008-\u0010\u0018\"\u0004\u0008.\u0010/R\"\u00100\u001a\u00020\u00168\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u00080\u0010,\u001a\u0004\u00081\u0010\u0018\"\u0004\u00082\u0010/R\"\u00103\u001a\u00020\u00168\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u00083\u0010,\u001a\u0004\u00084\u0010\u0018\"\u0004\u00085\u0010/R(\u00106\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u00086\u0010,\u0012\u0004\u00089\u0010\u0003\u001a\u0004\u00087\u0010\u0018\"\u0004\u00088\u0010/R(\u0010:\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008:\u0010,\u0012\u0004\u0008<\u0010\u0003\u001a\u0004\u0008:\u0010\u0018\"\u0004\u0008;\u0010/R(\u0010=\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008=\u0010,\u0012\u0004\u0008?\u0010\u0003\u001a\u0004\u0008=\u0010\u0018\"\u0004\u0008>\u0010/R#\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060@8\u0006\u00a2\u0006\u000c\n\u0004\u0008A\u0010B\u001a\u0004\u0008C\u0010DR#\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060@8\u0006\u00a2\u0006\u000c\n\u0004\u0008E\u0010B\u001a\u0004\u0008F\u0010DR#\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060@8\u0006\u00a2\u0006\u000c\n\u0004\u0008G\u0010B\u001a\u0004\u0008H\u0010DR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060@8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010B\u001a\u0004\u0008I\u0010D\u00a8\u0006K"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
        "Lio/getstream/chat/android/client/api/models/ChannelRequest;",
        "<init>",
        "()V",
        "",
        "",
        "",
        "data",
        "withData",
        "(Ljava/util/Map;)Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
        "",
        "limit",
        "offset",
        "withMembers",
        "(II)Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
        "withWatchers",
        "withMessages",
        "(I)Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
        "Lio/getstream/chat/android/client/api/models/Pagination;",
        "direction",
        "messageId",
        "(Lio/getstream/chat/android/client/api/models/Pagination;Ljava/lang/String;I)Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
        "",
        "isFilteringNewerMessages",
        "()Z",
        "filteringOlderMessages",
        "isFilteringAroundIdMessages",
        "isFilteringMessages",
        "watchersOffset",
        "()I",
        "membersOffset",
        "messagesLimit",
        "watchersLimit",
        "membersLimit",
        "Ll83/k;",
        "pagination",
        "()Ll83/k;",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "hashCode",
        "toString",
        "()Ljava/lang/String;",
        "state",
        "Z",
        "getState",
        "setState",
        "(Z)V",
        "watch",
        "getWatch",
        "setWatch",
        "presence",
        "getPresence",
        "setPresence",
        "shouldRefresh",
        "getShouldRefresh",
        "setShouldRefresh",
        "getShouldRefresh$annotations",
        "isWatchChannel",
        "setWatchChannel",
        "isWatchChannel$annotations",
        "isNotificationUpdate",
        "setNotificationUpdate",
        "isNotificationUpdate$annotations",
        "",
        "messages",
        "Ljava/util/Map;",
        "getMessages",
        "()Ljava/util/Map;",
        "watchers",
        "getWatchers",
        "members",
        "getMembers",
        "getData",
        "Companion",
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


# static fields
.field public static final Companion:Lio/getstream/chat/android/client/api/models/QueryChannelRequest$Companion;

.field private static final KEY_LIMIT:Ljava/lang/String; = "limit"

.field public static final KEY_MEMBERS:Ljava/lang/String; = "members"

.field private static final KEY_OFFSET:Ljava/lang/String; = "offset"


# instance fields
.field private final data:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private isNotificationUpdate:Z

.field private isWatchChannel:Z

.field private final members:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final messages:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private presence:Z

.field private shouldRefresh:Z

.field private state:Z

.field private watch:Z

.field private final watchers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->Companion:Lio/getstream/chat/android/client/api/models/QueryChannelRequest$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->messages:Ljava/util/Map;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->watchers:Ljava/util/Map;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->members:Ljava/util/Map;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->data:Ljava/util/Map;

    return-void
.end method

.method public static synthetic getShouldRefresh$annotations()V
    .locals 0
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    return-void
.end method

.method public static synthetic isNotificationUpdate$annotations()V
    .locals 0
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    return-void
.end method

.method public static synthetic isWatchChannel$annotations()V
    .locals 0
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->state:Z

    check-cast p1, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->state:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->watch:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->watch:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->presence:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->presence:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->shouldRefresh:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->shouldRefresh:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->messages:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->messages:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->watchers:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->watchers:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->members:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->members:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->data:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->data:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->isNotificationUpdate:Z

    iget-boolean p1, p1, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->isNotificationUpdate:Z

    if-eq v1, p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final filteringOlderMessages()Z
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->messages:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->messages:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    sget-object v2, Lio/getstream/chat/android/client/api/models/Pagination;->LESS_THAN:Lio/getstream/chat/android/client/api/models/Pagination;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/api/models/Pagination;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    sget-object v2, Lio/getstream/chat/android/client/api/models/Pagination;->LESS_THAN_OR_EQUAL:Lio/getstream/chat/android/client/api/models/Pagination;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/api/models/Pagination;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    return v1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final getData()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->data:Ljava/util/Map;

    return-object v0
.end method

.method public final getMembers()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->members:Ljava/util/Map;

    return-object v0
.end method

.method public final getMessages()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->messages:Ljava/util/Map;

    return-object v0
.end method

.method public final getPresence()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->presence:Z

    return v0
.end method

.method public final getShouldRefresh()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->shouldRefresh:Z

    return v0
.end method

.method public final getState()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->state:Z

    return v0
.end method

.method public final getWatch()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->watch:Z

    return v0
.end method

.method public final getWatchers()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->watchers:Ljava/util/Map;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->state:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->watch:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->presence:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->shouldRefresh:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->messages:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->watchers:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->members:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->data:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-boolean v1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->isNotificationUpdate:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isFilteringAroundIdMessages()Z
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->messages:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->messages:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    sget-object v1, Lio/getstream/chat/android/client/api/models/Pagination;->AROUND_ID:Lio/getstream/chat/android/client/api/models/Pagination;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/api/models/Pagination;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final isFilteringMessages()Z
    .locals 5

    invoke-static {}, Lio/getstream/chat/android/client/api/models/Pagination;->values()[Lio/getstream/chat/android/client/api/models/Pagination;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v0, v3

    invoke-virtual {v4}, Lio/getstream/chat/android/client/api/models/Pagination;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->messages:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v1, v0}, Lm83/s;->K0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final isFilteringNewerMessages()Z
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->messages:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->messages:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    sget-object v2, Lio/getstream/chat/android/client/api/models/Pagination;->GREATER_THAN:Lio/getstream/chat/android/client/api/models/Pagination;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/api/models/Pagination;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    sget-object v2, Lio/getstream/chat/android/client/api/models/Pagination;->GREATER_THAN_OR_EQUAL:Lio/getstream/chat/android/client/api/models/Pagination;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/api/models/Pagination;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    return v1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final isNotificationUpdate()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->isNotificationUpdate:Z

    return v0
.end method

.method public final isWatchChannel()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->isWatchChannel:Z

    return v0
.end method

.method public final membersLimit()I
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->messages:Ljava/util/Map;

    const-string v1, "limit"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Integer;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final membersOffset()I
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->watchers:Ljava/util/Map;

    const-string v1, "offset"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Integer;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final messagesLimit()I
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->messages:Ljava/util/Map;

    const-string v1, "limit"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Integer;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final pagination()Ll83/k;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ll83/k;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->messages:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->messages:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {}, Lio/getstream/chat/android/client/api/models/Pagination;->values()[Lio/getstream/chat/android/client/api/models/Pagination;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    aget-object v5, v2, v4

    invoke-virtual {v5}, Lio/getstream/chat/android/client/api/models/Pagination;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    move-object v5, v1

    :goto_1
    if-eqz v5, :cond_5

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->messages:Ljava/util/Map;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/api/models/Pagination;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/lang/String;

    if-eqz v2, :cond_3

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    :cond_3
    if-nez v1, :cond_4

    const-string v1, ""

    :cond_4
    new-instance v0, Ll83/k;

    invoke-direct {v0, v5, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :cond_5
    return-object v1
.end method

.method public final setNotificationUpdate(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->isNotificationUpdate:Z

    return-void
.end method

.method public final setPresence(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->presence:Z

    return-void
.end method

.method public final setShouldRefresh(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->shouldRefresh:Z

    return-void
.end method

.method public final setState(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->state:Z

    return-void
.end method

.method public final setWatch(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->watch:Z

    return-void
.end method

.method public final setWatchChannel(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->isWatchChannel:Z

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 13

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->state:Z

    iget-boolean v1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->watch:Z

    iget-boolean v2, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->presence:Z

    iget-boolean v3, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->shouldRefresh:Z

    iget-boolean v4, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->isWatchChannel:Z

    iget-boolean v5, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->isNotificationUpdate:Z

    iget-object v6, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->messages:Ljava/util/Map;

    iget-object v7, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->watchers:Ljava/util/Map;

    iget-object v8, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->members:Ljava/util/Map;

    iget-object v9, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->data:Ljava/util/Map;

    const-string v10, ", watch="

    const-string v11, ", presence="

    const-string v12, "QueryChannelRequest(state="

    invoke-static {v12, v10, v11, v0, v1}, Ldc/b;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", shouldRefresh="

    const-string v10, ", isWatchChannel="

    invoke-static {v0, v2, v1, v3, v10}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", isNotificationUpdate="

    const-string v2, ", messages="

    invoke-static {v0, v4, v1, v5, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", watchers="

    const-string v2, ", members="

    invoke-static {v0, v6, v1, v7, v2}, Lc13/a;->x(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    const-string v1, ", data="

    const-string v2, ")"

    invoke-static {v0, v8, v1, v9, v2}, Lr;->n(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final watchersLimit()I
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->watchers:Ljava/util/Map;

    const-string v1, "limit"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Integer;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final watchersOffset()I
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->watchers:Ljava/util/Map;

    const-string v1, "offset"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Integer;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public withData(Ljava/util/Map;)Lio/getstream/chat/android/client/api/models/QueryChannelRequest;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->data:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-object p0
.end method

.method public withMembers(II)Lio/getstream/chat/android/client/api/models/QueryChannelRequest;
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->state:Z

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "limit"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "offset"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->members:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-object p0
.end method

.method public withMessages(I)Lio/getstream/chat/android/client/api/models/QueryChannelRequest;
    .locals 2

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->state:Z

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 3
    const-string v1, "limit"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    iget-object p1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->messages:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-object p0
.end method

.method public withMessages(Lio/getstream/chat/android/client/api/models/Pagination;Ljava/lang/String;I)Lio/getstream/chat/android/client/api/models/QueryChannelRequest;
    .locals 2

    const-string v0, "direction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->state:Z

    .line 6
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    const-string v1, "limit"

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {v0, v1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/Pagination;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    iget-object p1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->messages:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-object p0
.end method

.method public withWatchers(II)Lio/getstream/chat/android/client/api/models/QueryChannelRequest;
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->state:Z

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "limit"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "offset"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->watchers:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-object p0
.end method
