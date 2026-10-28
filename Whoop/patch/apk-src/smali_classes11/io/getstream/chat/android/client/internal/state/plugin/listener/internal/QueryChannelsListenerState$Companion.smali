.class final Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0082\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000c\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0002\u00a8\u0006\u0007"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState$Companion;",
        "",
        "<init>",
        "()V",
        "toPagination",
        "Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;",
        "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;",
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

.method public static final synthetic access$toPagination(Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState$Companion;Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState$Companion;->toPagination(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;

    move-result-object p0

    return-object p0
.end method

.method private final toPagination(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;
    .locals 6

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->getQuerySort()Lio/getstream/chat/android/models/querysort/QuerySorter;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->getLimit()I

    move-result v3

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->getOffset()I

    move-result v2

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->getMessageLimit()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :goto_0
    move v4, v0

    goto :goto_1

    :cond_0
    const/16 v0, 0xa

    goto :goto_0

    :goto_1
    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->getMemberLimit()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    :goto_2
    move v5, p1

    goto :goto_3

    :cond_1
    const/16 p1, 0x1e

    goto :goto_2

    :goto_3
    new-instance v0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;-><init>(Lio/getstream/chat/android/models/querysort/QuerySorter;IIII)V

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/MapperKt;->toAnyChannelPaginationRequest(Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;)Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;

    move-result-object p1

    return-object p1
.end method
