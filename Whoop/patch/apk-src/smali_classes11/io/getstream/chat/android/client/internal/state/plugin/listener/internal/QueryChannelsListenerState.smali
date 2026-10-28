.class public final Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/plugin/listeners/QueryChannelsListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001e\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\n\u001a\u00020\tH\u0096@\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ&\u0010\u0012\u001a\u00020\u000c2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0014R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState;",
        "Lio/getstream/chat/android/client/plugin/listeners/QueryChannelsListener;",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
        "logic",
        "Lec3/p1;",
        "",
        "queryingChannelsFree",
        "<init>",
        "(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lec3/p1;)V",
        "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;",
        "request",
        "Ln23/h;",
        "Ll83/a0;",
        "onQueryChannelsPrecondition",
        "(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lq83/d;)Ljava/lang/Object;",
        "onQueryChannelsRequest",
        "Lio/getstream/chat/android/client/api/models/QueryChannelsResult;",
        "result",
        "onQueryChannelsResult",
        "(Ln23/h;Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
        "Lec3/p1;",
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
.field private static final Companion:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState$Companion;


# instance fields
.field private final logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

.field private final queryingChannelsFree:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState;->Companion:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState$Companion;

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lec3/p1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
            "Lec3/p1;",
            ")V"
        }
    .end annotation

    const-string v0, "logic"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "queryingChannelsFree"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState;->queryingChannelsFree:Lec3/p1;

    return-void
.end method


# virtual methods
.method public final onQueryChannelsPrecondition(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p1, Ln23/g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p1, p2}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public final onQueryChannelsRequest(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState;->queryingChannelsFree:Lec3/p1;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->queryChannels$stream_chat_android_client_release(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->setCurrentRequest$stream_chat_android_client_release(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)V

    sget-object v1, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState;->Companion:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState$Companion;

    invoke-static {v1, p1}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState$Companion;->access$toPagination(Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState$Companion;Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->queryOffline$stream_chat_android_client_release(Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onQueryChannelsResult(Ln23/h;Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState$onQueryChannelsResult$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState$onQueryChannelsResult$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState$onQueryChannelsResult$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState$onQueryChannelsResult$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState$onQueryChannelsResult$1;

    invoke-direct {v0, p0, p3}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState$onQueryChannelsResult$1;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState$onQueryChannelsResult$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState$onQueryChannelsResult$1;->label:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState$onQueryChannelsResult$1;->L$3:Ljava/lang/Object;

    check-cast p1, Ln23/h;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState$onQueryChannelsResult$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState$onQueryChannelsResult$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState$onQueryChannelsResult$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ln23/h;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {p3, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->queryChannels$stream_chat_android_client_release(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;

    move-result-object p3

    instance-of v2, p1, Ln23/g;

    if-eqz v2, :cond_3

    move-object v5, p1

    check-cast v5, Ln23/g;

    iget-object v5, v5, Ln23/g;->a:Ljava/lang/Object;

    check-cast v5, Lio/getstream/chat/android/client/api/models/QueryChannelsResult;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/api/models/QueryChannelsResult;->getPredefinedFilter()Lio/getstream/chat/android/client/api/models/PredefinedFilter;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Lio/getstream/chat/android/client/api/models/PredefinedFilter;->getFilter()Lio/getstream/chat/android/models/FilterObject;

    move-result-object v6

    invoke-virtual {v5}, Lio/getstream/chat/android/client/api/models/PredefinedFilter;->getSort()Lio/getstream/chat/android/models/querysort/QuerySorter;

    move-result-object v5

    invoke-virtual {p3, v6, v5}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->applyResolvedSpec$stream_chat_android_client_release(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)V

    :cond_3
    if-eqz v2, :cond_4

    check-cast p1, Ln23/g;

    iget-object p1, p1, Ln23/g;->a:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/api/models/QueryChannelsResult;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelsResult;->getChannels()Ljava/util/List;

    move-result-object p1

    new-instance v2, Ln23/g;

    invoke-direct {v2, p1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    move-object p1, v2

    goto :goto_1

    :cond_4
    instance-of v2, p1, Ln23/f;

    if-eqz v2, :cond_6

    :goto_1
    iput-object v4, v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState$onQueryChannelsResult$1;->L$0:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState$onQueryChannelsResult$1;->L$1:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState$onQueryChannelsResult$1;->L$2:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState$onQueryChannelsResult$1;->L$3:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState$onQueryChannelsResult$1;->label:I

    invoke-virtual {p3, p1, p2, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->onQueryChannelsResult(Ln23/h;Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState;->queryingChannelsFree:Lec3/p1;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, v4, p2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
