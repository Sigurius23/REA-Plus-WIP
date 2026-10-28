.class public final Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController$Companion;
    }
.end annotation

.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0082@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\r\u0010\u000e\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0010\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0012R\u001a\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0017\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u00140#8F\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010%R\u0017\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u00080\'8F\u00a2\u0006\u0006\u001a\u0004\u0008(\u0010)\u00a8\u0006,"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;",
        "",
        "",
        "cid",
        "Lio/getstream/chat/android/client/channel/ChannelClient;",
        "channelClient",
        "<init>",
        "(Ljava/lang/String;Lio/getstream/chat/android/client/channel/ChannelClient;)V",
        "Ll83/a0;",
        "loadPinnedMessages",
        "(Lq83/d;)Ljava/lang/Object;",
        "",
        "shouldLoadMore",
        "()Z",
        "load",
        "()V",
        "loadMore",
        "Ljava/lang/String;",
        "Lio/getstream/chat/android/client/channel/ChannelClient;",
        "Lec3/p1;",
        "Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;",
        "_state",
        "Lec3/p1;",
        "Lec3/o1;",
        "_errorEvents",
        "Lec3/o1;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "Lbc3/c0;",
        "scope",
        "Lbc3/c0;",
        "Lec3/f2;",
        "getState",
        "()Lec3/f2;",
        "state",
        "Lec3/t1;",
        "getErrorEvents",
        "()Lec3/t1;",
        "errorEvents",
        "Companion",
        "stream-chat-android-ui-common_release"
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
.field public static final $stable:I = 0x8

.field private static final Companion:Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController$Companion;

.field private static final QUERY_LIMIT:I = 0x1e


# instance fields
.field private final _errorEvents:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final _state:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final channelClient:Lio/getstream/chat/android/client/channel/ChannelClient;

.field private final cid:Ljava/lang/String;

.field private final logger$delegate:Ll83/h;

.field private final scope:Lbc3/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;->Companion:Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lio/getstream/chat/android/client/channel/ChannelClient;)V
    .locals 8

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelClient"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;->cid:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;->channelClient:Lio/getstream/chat/android/client/channel/ChannelClient;

    .line 4
    new-instance v1, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;

    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;-><init>(ZLjava/util/List;ZLjava/util/Date;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;->_state:Lec3/p1;

    const/4 p1, 0x0

    const/4 p2, 0x7

    const/4 v0, 0x0

    .line 5
    invoke-static {v0, v0, p1, p2}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;->_errorEvents:Lec3/o1;

    .line 6
    const-string p1, "PinnedMessageListController"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;->logger$delegate:Ll83/h;

    .line 7
    sget-object p1, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {p1}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getMain()Lbc3/z;

    move-result-object p1

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object p2

    invoke-virtual {p1, p2}, Lq83/a;->plus(Lq83/j;)Lq83/j;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;->scope:Lbc3/c0;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lio/getstream/chat/android/client/channel/ChannelClient;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 8
    sget-object p2, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object p2

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/client/ChatClient;->channel(Ljava/lang/String;)Lio/getstream/chat/android/client/channel/ChannelClient;

    move-result-object p2

    .line 9
    :cond_0
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/channel/ChannelClient;)V

    return-void
.end method

.method public static final synthetic access$get_state$p(Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;)Lec3/p1;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;->_state:Lec3/p1;

    return-object p0
.end method

.method public static final synthetic access$loadPinnedMessages(Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;->loadPinnedMessages(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$shouldLoadMore(Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;)Z
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;->shouldLoadMore()Z

    move-result p0

    return p0
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final loadPinnedMessages(Lq83/d;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController$loadPinnedMessages$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController$loadPinnedMessages$1;

    iget v3, v2, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController$loadPinnedMessages$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController$loadPinnedMessages$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController$loadPinnedMessages$1;

    invoke-direct {v2, v0, v1}, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController$loadPinnedMessages$1;-><init>(Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController$loadPinnedMessages$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController$loadPinnedMessages$1;->label:I

    const/16 v5, 0x1e

    const/4 v6, 0x2

    sget-object v7, Ll83/a0;->a:Ll83/a0;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eqz v4, :cond_3

    if-eq v4, v10, :cond_2

    if-ne v4, v6, :cond_1

    iget-object v3, v2, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController$loadPinnedMessages$1;->L$1:Ljava/lang/Object;

    check-cast v3, Ln23/h;

    iget-object v2, v2, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController$loadPinnedMessages$1;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/util/Date;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v7

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v4, v2, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController$loadPinnedMessages$1;->L$0:Ljava/lang/Object;

    check-cast v4, Ljava/util/Date;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;->_state:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->getNextDate()Ljava/util/Date;

    move-result-object v4

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v11, v1, Lb23/k;->c:Lb23/e;

    iget-object v12, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v13, Lb23/g;->y:Lb23/g;

    invoke-interface {v11, v13, v12}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_4

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    iget-object v11, v0, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;->cid:Ljava/lang/String;

    new-instance v14, Ljava/lang/StringBuilder;

    const-string v15, "Loading pinned messages (cid: "

    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, ", before: "

    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v11, ", limit: 30)"

    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v1, v13, v12, v11, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;->channelClient:Lio/getstream/chat/android/client/channel/ChannelClient;

    sget-object v11, Lio/getstream/chat/android/models/querysort/QuerySortByField;->Companion:Lio/getstream/chat/android/models/querysort/QuerySortByField$Companion;

    const-string v12, "pinned_at"

    invoke-virtual {v11, v12}, Lio/getstream/chat/android/models/querysort/QuerySortByField$Companion;->descByName(Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/QuerySortByField;

    move-result-object v11

    new-instance v12, Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination$BeforeDate;

    invoke-direct {v12, v4, v9}, Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination$BeforeDate;-><init>(Ljava/util/Date;Z)V

    invoke-virtual {v1, v5, v11, v12}, Lio/getstream/chat/android/client/channel/ChannelClient;->getPinnedMessages(ILio/getstream/chat/android/models/querysort/QuerySorter;Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;)Lo23/d;

    move-result-object v1

    iput-object v4, v2, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController$loadPinnedMessages$1;->L$0:Ljava/lang/Object;

    iput v10, v2, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController$loadPinnedMessages$1;->label:I

    invoke-interface {v1, v2}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_5

    goto/16 :goto_6

    :cond_5
    :goto_1
    check-cast v1, Ln23/h;

    instance-of v11, v1, Ln23/g;

    if-eqz v11, :cond_e

    check-cast v1, Ln23/g;

    iget-object v1, v1, Ln23/g;->a:Ljava/lang/Object;

    move-object v11, v1

    check-cast v11, Ljava/util/List;

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v3, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v6, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v2

    const-string v12, "Loaded "

    const-string v13, " pinned messages"

    invoke-static {v2, v12, v13}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v6, v3, v2, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    iget-object v12, v0, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;->_state:Lec3/p1;

    :goto_2
    move-object v1, v12

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->getResults()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/util/Collection;

    move-object v13, v11

    check-cast v13, Ljava/lang/Iterable;

    new-instance v14, Ljava/util/ArrayList;

    const/16 v15, 0xa

    invoke-static {v13, v15}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v15

    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_3
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_7

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lio/getstream/chat/android/models/Message;

    new-instance v10, Lio/getstream/chat/android/ui/common/model/MessageResult;

    invoke-direct {v10, v15, v8}, Lio/getstream/chat/android/ui/common/model/MessageResult;-><init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Channel;)V

    invoke-virtual {v14, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v10, 0x1

    goto :goto_3

    :cond_7
    invoke-static {v6, v14}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v6

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_8
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_9

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    move-object v14, v13

    check-cast v14, Lio/getstream/chat/android/ui/common/model/MessageResult;

    invoke-virtual {v14}, Lio/getstream/chat/android/ui/common/model/MessageResult;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v14

    invoke-virtual {v14}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v14

    if-lez v14, :cond_8

    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_9
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v6

    if-ne v6, v5, :cond_a

    const/4 v6, 0x1

    goto :goto_5

    :cond_a
    move v6, v9

    :goto_5
    invoke-static {v11}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lio/getstream/chat/android/models/Message;

    if-eqz v13, :cond_b

    invoke-virtual {v13}, Lio/getstream/chat/android/models/Message;->getPinnedAt()Ljava/util/Date;

    move-result-object v13

    if-nez v13, :cond_c

    :cond_b
    move-object v13, v4

    :cond_c
    invoke-virtual {v3, v6, v10, v9, v13}, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->copy(ZLjava/util/List;ZLjava/util/Date;)Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    goto :goto_7

    :cond_d
    const/4 v10, 0x1

    goto/16 :goto_2

    :cond_e
    instance-of v4, v1, Ln23/f;

    if-eqz v4, :cond_12

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;->getLogger()Lb23/k;

    move-result-object v4

    iget-object v5, v4, Lb23/k;->c:Lb23/e;

    iget-object v9, v4, Lb23/k;->a:Ljava/lang/String;

    sget-object v10, Lb23/g;->y:Lb23/g;

    invoke-interface {v5, v10, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_f

    iget-object v4, v4, Lb23/k;->b:Lb23/j;

    check-cast v1, Ln23/f;

    iget-object v1, v1, Ln23/f;->a:Ln23/e;

    invoke-virtual {v1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v1

    const-string v5, "Loading pinned messages failed: "

    invoke-static {v5, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v10, v9, v1, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_f
    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;->_state:Lec3/p1;

    :cond_10
    move-object v4, v1

    check-cast v4, Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    move-object v9, v5

    check-cast v9, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;

    const/16 v14, 0xa

    const/4 v15, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v9 .. v15}, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->copy$default(Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;ZLjava/util/List;ZLjava/util/Date;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;

    move-result-object v9

    invoke-virtual {v4, v5, v9}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_10

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;->_errorEvents:Lec3/o1;

    iput-object v8, v2, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController$loadPinnedMessages$1;->L$0:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController$loadPinnedMessages$1;->L$1:Ljava/lang/Object;

    iput v6, v2, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController$loadPinnedMessages$1;->label:I

    invoke-interface {v1, v7, v2}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_11

    :goto_6
    return-object v3

    :cond_11
    :goto_7
    return-object v7

    :cond_12
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method private final shouldLoadMore()Z
    .locals 6

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;->_state:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->getCanLoadMore()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-nez v1, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v4, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->y:Lb23/g;

    invoke-interface {v1, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "No more messages to load"

    invoke-interface {v0, v5, v4, v1, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return v3

    :cond_0
    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->isLoading()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v4, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->y:Lb23/g;

    invoke-interface {v1, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "Already loading"

    invoke-interface {v0, v5, v4, v1, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    return v3

    :cond_2
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public final getErrorEvents()Lec3/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/t1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;->_errorEvents:Lec3/o1;

    return-object v0
.end method

.method public final getState()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;->_state:Lec3/p1;

    return-object v0
.end method

.method public final load()V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController$load$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController$load$1;-><init>(Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final loadMore()V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController$loadMore$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController$loadMore$1;-><init>(Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
