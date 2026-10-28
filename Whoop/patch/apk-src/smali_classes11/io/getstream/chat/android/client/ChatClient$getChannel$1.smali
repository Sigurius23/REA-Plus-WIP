.class final Lio/getstream/chat/android/client/ChatClient$getChannel$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/ChatClient;->getChannel(Ljava/lang/String;IIZ)Lo23/d;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lbc3/c0;",
        "Ln23/h;",
        "Lio/getstream/chat/android/models/Channel;",
        "<anonymous>",
        "(Lbc3/c0;)Ln23/h;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.ChatClient$getChannel$1"
    f = "ChatClient.kt"
    l = {
        0xbbd
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $cid:Ljava/lang/String;

.field final synthetic $memberLimit:I

.field final synthetic $messageLimit:I

.field final synthetic $state:Z

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/ChatClient;


# direct methods
.method public constructor <init>(Ljava/lang/String;IILio/getstream/chat/android/client/ChatClient;ZLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Z",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/ChatClient$getChannel$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$getChannel$1;->$cid:Ljava/lang/String;

    iput p2, p0, Lio/getstream/chat/android/client/ChatClient$getChannel$1;->$messageLimit:I

    iput p3, p0, Lio/getstream/chat/android/client/ChatClient$getChannel$1;->$memberLimit:I

    iput-object p4, p0, Lio/getstream/chat/android/client/ChatClient$getChannel$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iput-boolean p5, p0, Lio/getstream/chat/android/client/ChatClient$getChannel$1;->$state:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$1(Lio/getstream/chat/android/client/api/models/QueryChannelsResult;)Ljava/util/List;
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/client/api/models/QueryChannelsResult;->getChannels()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7
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

    new-instance v0, Lio/getstream/chat/android/client/ChatClient$getChannel$1;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$getChannel$1;->$cid:Ljava/lang/String;

    iget v2, p0, Lio/getstream/chat/android/client/ChatClient$getChannel$1;->$messageLimit:I

    iget v3, p0, Lio/getstream/chat/android/client/ChatClient$getChannel$1;->$memberLimit:I

    iget-object v4, p0, Lio/getstream/chat/android/client/ChatClient$getChannel$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-boolean v5, p0, Lio/getstream/chat/android/client/ChatClient$getChannel$1;->$state:Z

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/client/ChatClient$getChannel$1;-><init>(Ljava/lang/String;IILio/getstream/chat/android/client/ChatClient;ZLq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$getChannel$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/ChatClient$getChannel$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/ChatClient$getChannel$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$getChannel$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/ChatClient$getChannel$1;->label:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v1, v0, Lio/getstream/chat/android/client/ChatClient$getChannel$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v5, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    const-string v2, "cid"

    iget-object v6, v0, Lio/getstream/chat/android/client/ChatClient$getChannel$1;->$cid:Ljava/lang/String;

    invoke-static {v2, v6}, Lio/getstream/chat/android/models/Filters;->eq(Ljava/lang/String;Ljava/lang/Object;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object v6

    iget v2, v0, Lio/getstream/chat/android/client/ChatClient$getChannel$1;->$messageLimit:I

    new-instance v10, Ljava/lang/Integer;

    invoke-direct {v10, v2}, Ljava/lang/Integer;-><init>(I)V

    iget v2, v0, Lio/getstream/chat/android/client/ChatClient$getChannel$1;->$memberLimit:I

    new-instance v11, Ljava/lang/Integer;

    invoke-direct {v11, v2}, Ljava/lang/Integer;-><init>(I)V

    const/16 v15, 0x1ca

    const/16 v16, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v5 .. v16}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;-><init>(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-boolean v2, v0, Lio/getstream/chat/android/client/ChatClient$getChannel$1;->$state:Z

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->setWatch(Z)V

    invoke-virtual {v5, v2}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->setState(Z)V

    iget-object v2, v0, Lio/getstream/chat/android/client/ChatClient$getChannel$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-static {v2}, Lio/getstream/chat/android/client/ChatClient;->access$getApi$p(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/client/api/ChatApi;

    move-result-object v2

    invoke-interface {v2, v5}, Lio/getstream/chat/android/client/api/ChatApi;->queryChannels(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)Lo23/d;

    move-result-object v2

    new-instance v5, Lih0/t;

    const/16 v6, 0x17

    invoke-direct {v5, v6}, Lih0/t;-><init>(I)V

    invoke-static {v2, v5}, Lo23/f;->g(Lo23/d;Lkotlin/jvm/functions/Function1;)Lo23/o;

    move-result-object v2

    iput-object v4, v0, Lio/getstream/chat/android/client/ChatClient$getChannel$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/ChatClient$getChannel$1;->label:I

    invoke-virtual {v2, v0}, Lo23/o;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    check-cast v2, Ln23/h;

    instance-of v1, v2, Ln23/g;

    if-eqz v1, :cond_4

    check-cast v2, Ln23/g;

    iget-object v1, v2, Ln23/g;->a:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_3

    new-instance v1, Lio/getstream/chat/android/client/errors/cause/StreamChannelNotFoundException;

    iget-object v2, v0, Lio/getstream/chat/android/client/ChatClient$getChannel$1;->$cid:Ljava/lang/String;

    const/4 v3, 0x2

    invoke-direct {v1, v2, v4, v3, v4}, Lio/getstream/chat/android/client/errors/cause/StreamChannelNotFoundException;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Ln23/f;

    new-instance v3, Ln23/d;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/errors/cause/StreamChannelNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4, v1}, Ln23/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v2, v3}, Ln23/f;-><init>(Ln23/e;)V

    return-object v2

    :cond_3
    new-instance v2, Ln23/g;

    invoke-static {v1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v2, v1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object v2

    :cond_4
    instance-of v1, v2, Ln23/f;

    if-eqz v1, :cond_5

    return-object v2

    :cond_5
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
