.class public final Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/MapperKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0000\u00a8\u0006\u0004"
    }
    d2 = {
        "toAnyChannelPaginationRequest",
        "Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;",
        "Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;",
        "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
        "stream-chat-android-client_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final toAnyChannelPaginationRequest(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-virtual {p0}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->pagination()Ll83/k;

    move-result-object v0

    .line 7
    new-instance v1, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    invoke-virtual {p0}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->messagesLimit()I

    move-result v2

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->setMessageLimit(I)V

    if-eqz v0, :cond_0

    .line 9
    iget-object v2, v0, Ll83/k;->w:Ljava/lang/Object;

    .line 10
    move-object v4, v2

    check-cast v4, Lio/getstream/chat/android/client/api/models/Pagination;

    :cond_0
    invoke-virtual {v1, v4}, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->setMessageFilterDirection(Lio/getstream/chat/android/client/api/models/Pagination;)V

    if-eqz v0, :cond_1

    .line 11
    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    .line 12
    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_2

    :cond_1
    const-string v0, ""

    :cond_2
    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->setMessageFilterValue(Ljava/lang/String;)V

    .line 13
    invoke-virtual {p0}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->membersLimit()I

    move-result v0

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->setMemberLimit(I)V

    .line 14
    invoke-virtual {p0}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->membersOffset()I

    move-result v0

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->setMemberOffset(I)V

    .line 15
    invoke-virtual {p0}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->watchersLimit()I

    move-result v0

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->setWatcherLimit(I)V

    .line 16
    invoke-virtual {p0}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->watchersOffset()I

    move-result p0

    invoke-virtual {v1, p0}, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->setWatcherOffset(I)V

    .line 17
    invoke-virtual {v1, v3}, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->setChannelLimit(I)V

    return-object v1
.end method

.method public static final toAnyChannelPaginationRequest(Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;)Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2
    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->getChannelLimit()I

    move-result v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->setChannelLimit(I)V

    .line 3
    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->getChannelOffset()I

    move-result v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->setChannelOffset(I)V

    .line 4
    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->getMessageLimit()I

    move-result v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->setMessageLimit(I)V

    .line 5
    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->getSort()Lio/getstream/chat/android/models/querysort/QuerySorter;

    move-result-object p0

    invoke-virtual {v0, p0}, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->setSort(Lio/getstream/chat/android/models/querysort/QuerySorter;)V

    return-object v0
.end method
