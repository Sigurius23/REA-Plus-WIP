.class public final Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/plugin/listeners/QueryChannelListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J.\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ(\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ6\u0010\u0012\u001a\u00020\u000c2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase;",
        "Lio/getstream/chat/android/client/plugin/listeners/QueryChannelListener;",
        "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;",
        "repos",
        "<init>",
        "(Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;)V",
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
        "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;",
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
.field private final repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;)V
    .locals 1

    const-string v0, "repos"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    return-void
.end method

.method public static final synthetic access$getRepos$p(Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase;)Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    return-object p0
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
    .locals 0
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

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onQueryChannelResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;
    .locals 7
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

    instance-of p2, p5, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;

    if-eqz p2, :cond_0

    move-object p2, p5

    check-cast p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;

    iget p3, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->label:I

    const/high16 p4, -0x80000000

    and-int v0, p3, p4

    if-eqz v0, :cond_0

    sub-int/2addr p3, p4

    iput p3, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->label:I

    goto :goto_0

    :cond_0
    new-instance p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;

    invoke-direct {p2, p0, p5}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;-><init>(Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase;Lq83/d;)V

    :goto_0
    iget-object p3, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->result:Ljava/lang/Object;

    sget-object p4, Lr83/a;->w:Lr83/a;

    iget p5, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->label:I

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p5, :cond_3

    if-eq p5, v1, :cond_2

    if-ne p5, v0, :cond_1

    iget-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->L$8:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Channel;

    iget-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->L$7:Ljava/lang/Object;

    check-cast p1, Lq83/d;

    iget-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->L$6:Ljava/lang/Object;

    check-cast p1, Ln23/h;

    iget-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->L$5:Ljava/lang/Object;

    check-cast p1, Ln23/h;

    iget-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->L$4:Ljava/lang/Object;

    check-cast p1, Ln23/h;

    iget-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->L$3:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;

    iget-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->L$2:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ln23/h;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->I$2:I

    iget p5, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->I$1:I

    iget v1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->I$0:I

    iget-object v3, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->L$8:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/models/Channel;

    iget-object v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->L$7:Ljava/lang/Object;

    check-cast v4, Lq83/d;

    iget-object v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->L$6:Ljava/lang/Object;

    check-cast v4, Ln23/h;

    iget-object v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->L$5:Ljava/lang/Object;

    check-cast v4, Ln23/h;

    iget-object v5, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->L$4:Ljava/lang/Object;

    check-cast v5, Ln23/h;

    iget-object v5, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->L$3:Ljava/lang/Object;

    check-cast v5, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;

    iget-object v5, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->L$2:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v5, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->L$1:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v5, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->L$0:Ljava/lang/Object;

    check-cast v5, Ln23/h;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v6, v4

    move v4, p1

    move-object p1, v6

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p3, p1, Ln23/g;

    if-eqz p3, :cond_5

    move-object p3, p1

    check-cast p3, Ln23/g;

    iget-object p3, p3, Ln23/g;->a:Ljava/lang/Object;

    move-object v3, p3

    check-cast v3, Lio/getstream/chat/android/models/Channel;

    iget-object p3, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    new-instance p5, Lio/getstream/chat/android/models/ChannelConfig;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Channel;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Channel;->getConfig()Lio/getstream/chat/android/models/Config;

    move-result-object v5

    invoke-direct {p5, v4, v5}, Lio/getstream/chat/android/models/ChannelConfig;-><init>(Ljava/lang/String;Lio/getstream/chat/android/models/Config;)V

    iput-object v2, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->L$0:Ljava/lang/Object;

    iput-object v2, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->L$1:Ljava/lang/Object;

    iput-object v2, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->L$2:Ljava/lang/Object;

    iput-object v2, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->L$3:Ljava/lang/Object;

    iput-object v2, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->L$4:Ljava/lang/Object;

    iput-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->L$5:Ljava/lang/Object;

    iput-object v2, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->L$6:Ljava/lang/Object;

    iput-object v2, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->L$7:Ljava/lang/Object;

    iput-object v3, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->L$8:Ljava/lang/Object;

    const/4 v4, 0x0

    iput v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->I$0:I

    iput v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->I$1:I

    iput v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->I$2:I

    iput v1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->label:I

    invoke-virtual {p3, p5, p2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->insertChannelConfig(Lio/getstream/chat/android/models/ChannelConfig;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, p4, :cond_4

    goto :goto_2

    :cond_4
    move p5, v4

    move v1, p5

    :goto_1
    iget-object p3, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iput-object v2, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->L$0:Ljava/lang/Object;

    iput-object v2, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->L$1:Ljava/lang/Object;

    iput-object v2, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->L$2:Ljava/lang/Object;

    iput-object v2, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->L$3:Ljava/lang/Object;

    iput-object v2, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->L$4:Ljava/lang/Object;

    iput-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->L$5:Ljava/lang/Object;

    iput-object v2, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->L$6:Ljava/lang/Object;

    iput-object v2, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->L$7:Ljava/lang/Object;

    iput-object v2, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->L$8:Ljava/lang/Object;

    iput v1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->I$0:I

    iput p5, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->I$1:I

    iput v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->I$2:I

    iput v0, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase$onQueryChannelResult$1;->label:I

    invoke-virtual {p3, v3, p2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->storeStateForChannel(Lio/getstream/chat/android/models/Channel;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, p4, :cond_6

    :goto_2
    return-object p4

    :cond_5
    instance-of p1, p1, Ln23/f;

    if-eqz p1, :cond_7

    :cond_6
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
