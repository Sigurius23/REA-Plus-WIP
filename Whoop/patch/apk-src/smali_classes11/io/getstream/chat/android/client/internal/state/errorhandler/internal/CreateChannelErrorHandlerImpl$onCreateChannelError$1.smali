.class final Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl$onCreateChannelError$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl;->onCreateChannelError(Lo23/d;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lo23/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Ln23/e;",
        "originalError",
        "Ln23/h;",
        "Lio/getstream/chat/android/models/Channel;",
        "<anonymous>",
        "(Ln23/e;)Ln23/h;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.internal.state.errorhandler.internal.CreateChannelErrorHandlerImpl$onCreateChannelError$1"
    f = "CreateChannelErrorHandlerImpl.kt"
    l = {
        0x47
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $channelId:Ljava/lang/String;

.field final synthetic $channelType:Ljava/lang/String;

.field final synthetic $memberIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl$onCreateChannelError$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl$onCreateChannelError$1;->this$0:Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl$onCreateChannelError$1;->$channelType:Ljava/lang/String;

    iput-object p3, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl$onCreateChannelError$1;->$channelId:Ljava/lang/String;

    iput-object p4, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl$onCreateChannelError$1;->$memberIds:Ljava/util/List;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl$onCreateChannelError$1;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl$onCreateChannelError$1;->this$0:Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl$onCreateChannelError$1;->$channelType:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl$onCreateChannelError$1;->$channelId:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl$onCreateChannelError$1;->$memberIds:Ljava/util/List;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl$onCreateChannelError$1;-><init>(Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl$onCreateChannelError$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ln23/e;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl$onCreateChannelError$1;->invoke(Ln23/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ln23/e;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/e;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl$onCreateChannelError$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl$onCreateChannelError$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl$onCreateChannelError$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl$onCreateChannelError$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ln23/e;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl$onCreateChannelError$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl$onCreateChannelError$1;->L$1:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl$onCreateChannelError$1;->this$0:Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl;->access$getClientState$p(Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl;)Lio/getstream/chat/android/client/setup/state/ClientState;

    move-result-object p1

    invoke-interface {p1}, Lio/getstream/chat/android/client/setup/state/ClientState;->isOnline()Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, Ln23/f;

    invoke-direct {p1, v0}, Ln23/f;-><init>(Ln23/e;)V

    return-object p1

    :cond_2
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl$onCreateChannelError$1;->$channelType:Ljava/lang/String;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl$onCreateChannelError$1;->$channelId:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl$onCreateChannelError$1;->$memberIds:Ljava/util/List;

    invoke-static {v0, v2}, Lio/getstream/chat/android/client/utils/channel/ChannelUtilsKt;->generateChannelIdIfNeeded(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const-string v2, ":"

    invoke-static {p1, v2, v0}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl$onCreateChannelError$1;->this$0:Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl;->access$getChannelRepository$p(Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl;)Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    move-result-object v0

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const/4 v2, 0x0

    iput-object v2, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl$onCreateChannelError$1;->L$0:Ljava/lang/Object;

    iput-object v2, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl$onCreateChannelError$1;->L$1:Ljava/lang/Object;

    iput v3, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl$onCreateChannelError$1;->label:I

    invoke-interface {v0, p1, p0}, Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;->selectChannels(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_0
    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/models/Channel;

    if-nez p1, :cond_4

    new-instance p1, Ln23/f;

    new-instance v0, Ln23/a;

    const-string v1, "Channel wasn\'t cached properly."

    invoke-direct {v0, v1}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Ln23/f;-><init>(Ln23/e;)V

    return-object p1

    :cond_4
    new-instance v0, Ln23/g;

    invoke-direct {v0, p1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
