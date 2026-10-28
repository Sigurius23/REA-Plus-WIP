.class public final Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/plugin/listeners/QueryChannelListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J.\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ(\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ6\u0010\u0012\u001a\u00020\u000c2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState;",
        "Lio/getstream/chat/android/client/plugin/listeners/QueryChannelListener;",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
        "logic",
        "<init>",
        "(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)V",
        "",
        "channelType",
        "channelId",
        "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
        "request",
        "Ln23/h;",
        "Ll83/a0;",
        "onQueryChannelPrecondition",
        "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;",
        "onQueryChannelRequest",
        "Lio/getstream/chat/android/models/Channel;",
        "result",
        "onQueryChannelResult",
        "(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
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
.field private final logger$delegate:Ll83/h;

.field private final logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)V
    .locals 1

    const-string v0, "logic"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    const-string p1, "QueryChannelListenerS"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState;->logger$delegate:Ll83/h;

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method


# virtual methods
.method public final onQueryChannelPrecondition(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
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

.method public final onQueryChannelRequest(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState$onQueryChannelRequest$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState$onQueryChannelRequest$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState$onQueryChannelRequest$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState$onQueryChannelRequest$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState$onQueryChannelRequest$1;

    invoke-direct {v0, p0, p4}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState$onQueryChannelRequest$1;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState;Lq83/d;)V

    :goto_0
    iget-object p4, v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState$onQueryChannelRequest$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState$onQueryChannelRequest$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState$onQueryChannelRequest$1;->L$4:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState$onQueryChannelRequest$1;->L$3:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState$onQueryChannelRequest$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState$onQueryChannelRequest$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState$onQueryChannelRequest$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState;->getLogger()Lb23/k;

    move-result-object p4

    iget-object v2, p4, Lb23/k;->c:Lb23/e;

    iget-object v4, p4, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    iget-object p4, p4, Lb23/k;->b:Lb23/j;

    const-string v2, ":"

    const-string v7, ", request: "

    const-string v8, "[onQueryChannelRequest] cid: "

    invoke-static {v8, p1, v2, p2, v7}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p4, v5, v4, v2, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    iget-object p4, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {p4, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channel(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    move-result-object p1

    invoke-interface {p1, p3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->setPaginationDirection(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)V

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState$onQueryChannelRequest$1;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState$onQueryChannelRequest$1;->L$1:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState$onQueryChannelRequest$1;->L$2:Ljava/lang/Object;

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState$onQueryChannelRequest$1;->L$3:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState$onQueryChannelRequest$1;->L$4:Ljava/lang/Object;

    const/4 p2, 0x0

    iput p2, v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState$onQueryChannelRequest$1;->I$0:I

    iput v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState$onQueryChannelRequest$1;->label:I

    invoke-interface {p1, p3, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->updateStateFromDatabase(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onQueryChannelResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState;->getLogger()Lb23/k;

    move-result-object p5

    iget-object v0, p5, Lb23/k;->c:Lb23/e;

    sget-object v1, Lb23/g;->y:Lb23/g;

    iget-object v2, p5, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object p5, p5, Lb23/k;->b:Lb23/j;

    instance-of v0, p1, Ln23/g;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ln23/g;

    iget-object v0, v0, Ln23/g;->a:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/Channel;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ln23/f;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Ln23/f;

    iget-object v0, v0, Ln23/f;->a:Ln23/e;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    const-string v3, ":"

    const-string v4, ", request: "

    const-string v5, "[onQueryChannelResult] cid: "

    invoke-static {v5, p2, v3, p3, v4}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ", result: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-interface {p5, v1, v2, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_1
    iget-object p5, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {p5, p2, p3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channel(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    move-result-object p2

    invoke-interface {p2, p4, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->onQueryChannelResult(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Ln23/h;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
