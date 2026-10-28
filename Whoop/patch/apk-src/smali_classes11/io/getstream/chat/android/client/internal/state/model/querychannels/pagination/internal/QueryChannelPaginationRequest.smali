.class public final Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;
.super Lio/getstream/chat/android/client/api/models/QueryChannelRequest;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0016\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0006\u0010&\u001a\u00020\'J\u0006\u0010(\u001a\u00020\'J\r\u0010)\u001a\u00020*H\u0000\u00a2\u0006\u0002\u0008+J\u000e\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\'R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\u0005R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R \u0010\u0015\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0007\"\u0004\u0008\u0019\u0010\u0005R \u0010\u001a\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008\u001b\u0010\u0017\u001a\u0004\u0008\u001c\u0010\u0007\"\u0004\u0008\u001d\u0010\u0005R \u0010\u001e\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008\u001f\u0010\u0017\u001a\u0004\u0008 \u0010\u0007\"\u0004\u0008!\u0010\u0005R \u0010\"\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008#\u0010\u0017\u001a\u0004\u0008$\u0010\u0007\"\u0004\u0008%\u0010\u0005\u00a8\u0006/"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;",
        "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
        "messageLimit",
        "",
        "<init>",
        "(I)V",
        "getMessageLimit",
        "()I",
        "setMessageLimit",
        "messageFilterDirection",
        "Lio/getstream/chat/android/client/api/models/Pagination;",
        "getMessageFilterDirection",
        "()Lio/getstream/chat/android/client/api/models/Pagination;",
        "setMessageFilterDirection",
        "(Lio/getstream/chat/android/client/api/models/Pagination;)V",
        "messageFilterValue",
        "",
        "getMessageFilterValue",
        "()Ljava/lang/String;",
        "setMessageFilterValue",
        "(Ljava/lang/String;)V",
        "memberLimit",
        "getMemberLimit$annotations",
        "()V",
        "getMemberLimit",
        "setMemberLimit",
        "memberOffset",
        "getMemberOffset$annotations",
        "getMemberOffset",
        "setMemberOffset",
        "watcherLimit",
        "getWatcherLimit$annotations",
        "getWatcherLimit",
        "setWatcherLimit",
        "watcherOffset",
        "getWatcherOffset$annotations",
        "getWatcherOffset",
        "setWatcherOffset",
        "hasFilter",
        "",
        "isFirstPage",
        "toAnyChannelPaginationRequest",
        "Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;",
        "toAnyChannelPaginationRequest$stream_chat_android_client_release",
        "toWatchChannelRequest",
        "Lio/getstream/chat/android/client/api/models/WatchChannelRequest;",
        "userPresence",
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


# instance fields
.field private memberLimit:I

.field private memberOffset:I

.field private messageFilterDirection:Lio/getstream/chat/android/client/api/models/Pagination;

.field private messageFilterValue:Ljava/lang/String;

.field private messageLimit:I

.field private watcherLimit:I

.field private watcherOffset:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;-><init>()V

    iput p1, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->messageLimit:I

    .line 3
    const-string p1, ""

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->messageFilterValue:Ljava/lang/String;

    const/16 p1, 0x1e

    .line 4
    iput p1, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->memberLimit:I

    .line 5
    iput p1, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->watcherLimit:I

    return-void
.end method

.method public synthetic constructor <init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/16 p1, 0x1e

    .line 6
    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;-><init>(I)V

    return-void
.end method

.method public static synthetic getMemberLimit$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getMemberOffset$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getWatcherLimit$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getWatcherOffset$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final getMemberLimit()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->memberLimit:I

    return v0
.end method

.method public final getMemberOffset()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->memberOffset:I

    return v0
.end method

.method public final getMessageFilterDirection()Lio/getstream/chat/android/client/api/models/Pagination;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->messageFilterDirection:Lio/getstream/chat/android/client/api/models/Pagination;

    return-object v0
.end method

.method public final getMessageFilterValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->messageFilterValue:Ljava/lang/String;

    return-object v0
.end method

.method public final getMessageLimit()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->messageLimit:I

    return v0
.end method

.method public final getWatcherLimit()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->watcherLimit:I

    return v0
.end method

.method public final getWatcherOffset()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->watcherOffset:I

    return v0
.end method

.method public final hasFilter()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->messageFilterDirection:Lio/getstream/chat/android/client/api/models/Pagination;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isFirstPage()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->messageFilterDirection:Lio/getstream/chat/android/client/api/models/Pagination;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final setMemberLimit(I)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->memberLimit:I

    return-void
.end method

.method public final setMemberOffset(I)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->memberOffset:I

    return-void
.end method

.method public final setMessageFilterDirection(Lio/getstream/chat/android/client/api/models/Pagination;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->messageFilterDirection:Lio/getstream/chat/android/client/api/models/Pagination;

    return-void
.end method

.method public final setMessageFilterValue(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->messageFilterValue:Ljava/lang/String;

    return-void
.end method

.method public final setMessageLimit(I)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->messageLimit:I

    return-void
.end method

.method public final setWatcherLimit(I)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->watcherLimit:I

    return-void
.end method

.method public final setWatcherOffset(I)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->watcherOffset:I

    return-void
.end method

.method public final toAnyChannelPaginationRequest$stream_chat_android_client_release()Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;
    .locals 4

    new-instance v0, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v1}, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget v1, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->messageLimit:I

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->setMessageLimit(I)V

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->messageFilterDirection:Lio/getstream/chat/android/client/api/models/Pagination;

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->setMessageFilterDirection(Lio/getstream/chat/android/client/api/models/Pagination;)V

    iget v1, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->memberLimit:I

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->setMemberLimit(I)V

    iget v1, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->memberOffset:I

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->setMemberOffset(I)V

    iget v1, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->watcherLimit:I

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->setWatcherLimit(I)V

    iget v1, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->watcherOffset:I

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->setWatcherOffset(I)V

    invoke-virtual {v0, v3}, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->setChannelLimit(I)V

    return-object v0
.end method

.method public final toWatchChannelRequest(Z)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;
    .locals 3

    new-instance v0, Lio/getstream/chat/android/client/api/models/WatchChannelRequest;

    invoke-direct {v0}, Lio/getstream/chat/android/client/api/models/WatchChannelRequest;-><init>()V

    iget v1, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->messageLimit:I

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/api/models/WatchChannelRequest;->withMessages(I)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->setPresence(Z)V

    :cond_0
    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->hasFilter()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->messageFilterDirection:Lio/getstream/chat/android/client/api/models/Pagination;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->messageFilterValue:Ljava/lang/String;

    iget v2, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->messageLimit:I

    invoke-virtual {v0, p1, v1, v2}, Lio/getstream/chat/android/client/api/models/WatchChannelRequest;->withMessages(Lio/getstream/chat/android/client/api/models/Pagination;Ljava/lang/String;I)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;

    :cond_1
    iget p1, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->memberLimit:I

    iget v1, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->memberOffset:I

    invoke-virtual {v0, p1, v1}, Lio/getstream/chat/android/client/api/models/WatchChannelRequest;->withMembers(II)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;

    iget p1, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->watcherLimit:I

    iget v1, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->watcherOffset:I

    invoke-virtual {v0, p1, v1}, Lio/getstream/chat/android/client/api/models/WatchChannelRequest;->withWatchers(II)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;

    return-object v0
.end method
