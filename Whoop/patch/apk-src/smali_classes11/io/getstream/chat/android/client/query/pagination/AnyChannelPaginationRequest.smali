.class public final Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0017\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\u0005R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R \u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019\"\u0004\u0008\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001d\u0010\u0007\"\u0004\u0008\u001e\u0010\u0005R\u001a\u0010\u001f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008 \u0010\u0007\"\u0004\u0008!\u0010\u0005R\u001a\u0010\"\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008#\u0010\u0007\"\u0004\u0008$\u0010\u0005R\u001a\u0010%\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008&\u0010\u0007\"\u0004\u0008\'\u0010\u0005R\u001a\u0010(\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008)\u0010\u0007\"\u0004\u0008*\u0010\u0005R\u001a\u0010+\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008,\u0010\u0007\"\u0004\u0008-\u0010\u0005\u00a8\u0006."
    }
    d2 = {
        "Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;",
        "",
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
        "sort",
        "Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "Lio/getstream/chat/android/models/Channel;",
        "getSort",
        "()Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "setSort",
        "(Lio/getstream/chat/android/models/querysort/QuerySorter;)V",
        "channelLimit",
        "getChannelLimit",
        "setChannelLimit",
        "channelOffset",
        "getChannelOffset",
        "setChannelOffset",
        "memberLimit",
        "getMemberLimit",
        "setMemberLimit",
        "memberOffset",
        "getMemberOffset",
        "setMemberOffset",
        "watcherLimit",
        "getWatcherLimit",
        "setWatcherLimit",
        "watcherOffset",
        "getWatcherOffset",
        "setWatcherOffset",
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
.field private channelLimit:I

.field private channelOffset:I

.field private memberLimit:I

.field private memberOffset:I

.field private messageFilterDirection:Lio/getstream/chat/android/client/api/models/Pagination;

.field private messageFilterValue:Ljava/lang/String;

.field private messageLimit:I

.field private sort:Lio/getstream/chat/android/models/querysort/QuerySorter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;"
        }
    .end annotation
.end field

.field private watcherLimit:I

.field private watcherOffset:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->messageLimit:I

    .line 3
    const-string p1, ""

    iput-object p1, p0, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->messageFilterValue:Ljava/lang/String;

    .line 4
    new-instance p1, Lio/getstream/chat/android/models/querysort/QuerySortByField;

    invoke-direct {p1}, Lio/getstream/chat/android/models/querysort/QuerySortByField;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    const/16 p1, 0x1e

    .line 5
    iput p1, p0, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->channelLimit:I

    .line 6
    iput p1, p0, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->memberLimit:I

    .line 7
    iput p1, p0, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->watcherLimit:I

    return-void
.end method

.method public synthetic constructor <init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/16 p1, 0x1e

    .line 8
    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final getChannelLimit()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->channelLimit:I

    return v0
.end method

.method public final getChannelOffset()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->channelOffset:I

    return v0
.end method

.method public final getMemberLimit()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->memberLimit:I

    return v0
.end method

.method public final getMemberOffset()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->memberOffset:I

    return v0
.end method

.method public final getMessageFilterDirection()Lio/getstream/chat/android/client/api/models/Pagination;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->messageFilterDirection:Lio/getstream/chat/android/client/api/models/Pagination;

    return-object v0
.end method

.method public final getMessageFilterValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->messageFilterValue:Ljava/lang/String;

    return-object v0
.end method

.method public final getMessageLimit()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->messageLimit:I

    return v0
.end method

.method public final getSort()Lio/getstream/chat/android/models/querysort/QuerySorter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    return-object v0
.end method

.method public final getWatcherLimit()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->watcherLimit:I

    return v0
.end method

.method public final getWatcherOffset()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->watcherOffset:I

    return v0
.end method

.method public final setChannelLimit(I)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->channelLimit:I

    return-void
.end method

.method public final setChannelOffset(I)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->channelOffset:I

    return-void
.end method

.method public final setMemberLimit(I)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->memberLimit:I

    return-void
.end method

.method public final setMemberOffset(I)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->memberOffset:I

    return-void
.end method

.method public final setMessageFilterDirection(Lio/getstream/chat/android/client/api/models/Pagination;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->messageFilterDirection:Lio/getstream/chat/android/client/api/models/Pagination;

    return-void
.end method

.method public final setMessageFilterValue(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->messageFilterValue:Ljava/lang/String;

    return-void
.end method

.method public final setMessageLimit(I)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->messageLimit:I

    return-void
.end method

.method public final setSort(Lio/getstream/chat/android/models/querysort/QuerySorter;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    return-void
.end method

.method public final setWatcherLimit(I)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->watcherLimit:I

    return-void
.end method

.method public final setWatcherOffset(I)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->watcherOffset:I

    return-void
.end method
