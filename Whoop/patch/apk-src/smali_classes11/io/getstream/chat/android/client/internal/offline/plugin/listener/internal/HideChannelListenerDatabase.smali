.class public final Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/plugin/listeners/HideChannelListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J.\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J(\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0004\u0008\u0011\u0010\u0010J6\u0010\u0013\u001a\u00020\u000e2\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase;",
        "Lio/getstream/chat/android/client/plugin/listeners/HideChannelListener;",
        "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;",
        "channelRepository",
        "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;",
        "messageRepository",
        "<init>",
        "(Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;)V",
        "",
        "channelType",
        "channelId",
        "",
        "clearHistory",
        "Ln23/h;",
        "Ll83/a0;",
        "onHideChannelPrecondition",
        "(Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;",
        "onHideChannelRequest",
        "result",
        "onHideChannelResult",
        "(Ln23/h;Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;",
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
.field private final channelRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

.field private final messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;)V
    .locals 1

    const-string v0, "channelRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase;->channelRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    return-void
.end method


# virtual methods
.method public final onHideChannelPrecondition(Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p3, Ll83/k;

    invoke-direct {p3, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p3}, Lio/getstream/chat/android/client/extensions/internal/PairKt;->toCid(Ll83/k;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/internal/ValidationKt;->validateCidWithResult(Ljava/lang/String;)Ln23/h;

    move-result-object p1

    invoke-virtual {p1}, Ln23/h;->d()Ln23/h;

    move-result-object p1

    return-object p1
.end method

.method public final onHideChannelRequest(Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onHideChannelResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p5, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase$onHideChannelResult$1;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase$onHideChannelResult$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase$onHideChannelResult$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase$onHideChannelResult$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase$onHideChannelResult$1;

    invoke-direct {v0, p0, p5}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase$onHideChannelResult$1;-><init>(Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase;Lq83/d;)V

    :goto_0
    iget-object p5, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase$onHideChannelResult$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase$onHideChannelResult$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    :goto_1
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase$onHideChannelResult$1;->L$3:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase$onHideChannelResult$1;->L$2:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase$onHideChannelResult$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase$onHideChannelResult$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ln23/h;

    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase$onHideChannelResult$1;->L$4:Ljava/lang/Object;

    check-cast p1, Ljava/util/Date;

    goto :goto_1

    :cond_3
    iget-boolean p4, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase$onHideChannelResult$1;->Z$0:Z

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase$onHideChannelResult$1;->L$4:Ljava/lang/Object;

    check-cast p1, Ljava/util/Date;

    iget-object p2, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase$onHideChannelResult$1;->L$3:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    iget-object p3, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase$onHideChannelResult$1;->L$2:Ljava/lang/Object;

    check-cast p3, Ljava/lang/String;

    iget-object p3, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase$onHideChannelResult$1;->L$1:Ljava/lang/Object;

    check-cast p3, Ljava/lang/String;

    iget-object p3, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase$onHideChannelResult$1;->L$0:Ljava/lang/Object;

    check-cast p3, Ln23/h;

    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, p1, Ln23/g;

    if-eqz p1, :cond_7

    new-instance p1, Ll83/k;

    invoke-direct {p1, p2, p3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1}, Lio/getstream/chat/android/client/extensions/internal/PairKt;->toCid(Ll83/k;)Ljava/lang/String;

    move-result-object p2

    if-eqz p4, :cond_6

    new-instance p1, Ljava/util/Date;

    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    iget-object p3, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase;->channelRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase$onHideChannelResult$1;->L$0:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase$onHideChannelResult$1;->L$1:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase$onHideChannelResult$1;->L$2:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase$onHideChannelResult$1;->L$3:Ljava/lang/Object;

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase$onHideChannelResult$1;->L$4:Ljava/lang/Object;

    iput-boolean p4, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase$onHideChannelResult$1;->Z$0:Z

    iput v6, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase$onHideChannelResult$1;->label:I

    invoke-interface {p3, p2, v6, p1, v0}, Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;->setHiddenForChannel(Ljava/lang/String;ZLjava/util/Date;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    iget-object p3, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase$onHideChannelResult$1;->L$0:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase$onHideChannelResult$1;->L$1:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase$onHideChannelResult$1;->L$2:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase$onHideChannelResult$1;->L$3:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase$onHideChannelResult$1;->L$4:Ljava/lang/Object;

    iput-boolean p4, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase$onHideChannelResult$1;->Z$0:Z

    iput v4, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase$onHideChannelResult$1;->label:I

    invoke-interface {p3, p2, p1, v0}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->deleteChannelMessagesBefore(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_3

    :cond_6
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase;->channelRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase$onHideChannelResult$1;->L$0:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase$onHideChannelResult$1;->L$1:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase$onHideChannelResult$1;->L$2:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase$onHideChannelResult$1;->L$3:Ljava/lang/Object;

    iput-boolean p4, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase$onHideChannelResult$1;->Z$0:Z

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase$onHideChannelResult$1;->label:I

    invoke-interface {p1, p2, v6, v0}, Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;->setHiddenForChannel(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_3
    return-object v1

    :cond_7
    return-object v5
.end method
