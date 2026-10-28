.class final Lio/getstream/chat/android/client/ChatClient$stopLiveLocationSharing$1$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/ChatClient;->stopLiveLocationSharing(Ljava/lang/String;Ljava/lang/String;)Lo23/d;
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
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Ln23/h;",
        "Lio/getstream/chat/android/models/Location;",
        "result",
        "Ll83/a0;",
        "<anonymous>",
        "(Ln23/h;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.ChatClient$stopLiveLocationSharing$1$1"
    f = "ChatClient.kt"
    l = {
        0x7ab
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $location:Lio/getstream/chat/android/models/Location;

.field I$0:I

.field I$1:I

.field synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/ChatClient;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/models/Location;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lio/getstream/chat/android/models/Location;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/ChatClient$stopLiveLocationSharing$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$stopLiveLocationSharing$1$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iput-object p2, p0, Lio/getstream/chat/android/client/ChatClient$stopLiveLocationSharing$1$1;->$location:Lio/getstream/chat/android/models/Location;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance v0, Lio/getstream/chat/android/client/ChatClient$stopLiveLocationSharing$1$1;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$stopLiveLocationSharing$1$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-object v2, p0, Lio/getstream/chat/android/client/ChatClient$stopLiveLocationSharing$1$1;->$location:Lio/getstream/chat/android/models/Location;

    invoke-direct {v0, v1, v2, p2}, Lio/getstream/chat/android/client/ChatClient$stopLiveLocationSharing$1$1;-><init>(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/models/Location;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/client/ChatClient$stopLiveLocationSharing$1$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ln23/h;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$stopLiveLocationSharing$1$1;->invoke(Ln23/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$stopLiveLocationSharing$1$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/ChatClient$stopLiveLocationSharing$1$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/ChatClient$stopLiveLocationSharing$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/client/ChatClient$stopLiveLocationSharing$1$1;->L$0:Ljava/lang/Object;

    check-cast v1, Ln23/h;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lio/getstream/chat/android/client/ChatClient$stopLiveLocationSharing$1$1;->label:I

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v5, :cond_0

    iget v3, v0, Lio/getstream/chat/android/client/ChatClient$stopLiveLocationSharing$1$1;->I$0:I

    iget-object v6, v0, Lio/getstream/chat/android/client/ChatClient$stopLiveLocationSharing$1$1;->L$6:Ljava/lang/Object;

    check-cast v6, Lio/getstream/chat/android/client/plugin/Plugin;

    iget-object v6, v0, Lio/getstream/chat/android/client/ChatClient$stopLiveLocationSharing$1$1;->L$4:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v7, v0, Lio/getstream/chat/android/client/ChatClient$stopLiveLocationSharing$1$1;->L$3:Ljava/lang/Object;

    check-cast v7, Lio/getstream/chat/android/models/Location;

    iget-object v8, v0, Lio/getstream/chat/android/client/ChatClient$stopLiveLocationSharing$1$1;->L$2:Ljava/lang/Object;

    check-cast v8, Lio/getstream/chat/android/client/ChatClient;

    iget-object v9, v0, Lio/getstream/chat/android/client/ChatClient$stopLiveLocationSharing$1$1;->L$1:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Iterable;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v0, Lio/getstream/chat/android/client/ChatClient$stopLiveLocationSharing$1$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v3}, Lio/getstream/chat/android/client/ChatClient;->getPlugins()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    iget-object v6, v0, Lio/getstream/chat/android/client/ChatClient$stopLiveLocationSharing$1$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-object v7, v0, Lio/getstream/chat/android/client/ChatClient$stopLiveLocationSharing$1$1;->$location:Lio/getstream/chat/android/models/Location;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v8, v6

    move-object v6, v3

    move v3, v4

    :cond_2
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    sget-object v10, Ll83/a0;->a:Ll83/a0;

    if-eqz v9, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lio/getstream/chat/android/client/plugin/Plugin;

    invoke-static {v8}, Lio/getstream/chat/android/client/ChatClient;->access$getLogger(Lio/getstream/chat/android/client/ChatClient;)Lb23/k;

    move-result-object v11

    iget-object v12, v11, Lb23/k;->c:Lb23/e;

    iget-object v13, v11, Lb23/k;->a:Ljava/lang/String;

    sget-object v14, Lb23/g;->x:Lb23/g;

    invoke-interface {v12, v14, v13}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v12

    const/4 v15, 0x0

    if-eqz v12, :cond_3

    iget-object v11, v11, Lb23/k;->b:Lb23/j;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v12

    sget-object v5, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v5, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-interface {v5}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v5

    const-string v12, "[stopLiveLocationSharing] #doOnResult; plugin: "

    invoke-static {v12, v5}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v11, v14, v13, v5, v15}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    iput-object v1, v0, Lio/getstream/chat/android/client/ChatClient$stopLiveLocationSharing$1$1;->L$0:Ljava/lang/Object;

    iput-object v15, v0, Lio/getstream/chat/android/client/ChatClient$stopLiveLocationSharing$1$1;->L$1:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/client/ChatClient$stopLiveLocationSharing$1$1;->L$2:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/ChatClient$stopLiveLocationSharing$1$1;->L$3:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/ChatClient$stopLiveLocationSharing$1$1;->L$4:Ljava/lang/Object;

    iput-object v15, v0, Lio/getstream/chat/android/client/ChatClient$stopLiveLocationSharing$1$1;->L$5:Ljava/lang/Object;

    iput-object v15, v0, Lio/getstream/chat/android/client/ChatClient$stopLiveLocationSharing$1$1;->L$6:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/ChatClient$stopLiveLocationSharing$1$1;->I$0:I

    iput v4, v0, Lio/getstream/chat/android/client/ChatClient$stopLiveLocationSharing$1$1;->I$1:I

    const/4 v5, 0x1

    iput v5, v0, Lio/getstream/chat/android/client/ChatClient$stopLiveLocationSharing$1$1;->label:I

    invoke-interface {v9, v7, v1, v0}, Lio/getstream/chat/android/client/plugin/Plugin;->onStopLiveLocationSharingResult(Lio/getstream/chat/android/models/Location;Ln23/h;Lq83/d;)Ljava/lang/Object;

    if-ne v10, v2, :cond_2

    return-object v2

    :cond_4
    return-object v10
.end method
