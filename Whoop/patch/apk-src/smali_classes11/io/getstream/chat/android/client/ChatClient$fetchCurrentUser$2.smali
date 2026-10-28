.class final Lio/getstream/chat/android/client/ChatClient$fetchCurrentUser$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/ChatClient;->fetchCurrentUser()Lo23/d;
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
        "Lio/getstream/chat/android/models/User;",
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
    c = "io.getstream.chat.android.client.ChatClient$fetchCurrentUser$2"
    f = "ChatClient.kt"
    l = {
        0x52f
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field I$0:I

.field I$1:I

.field synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/ChatClient;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/ChatClient;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/ChatClient$fetchCurrentUser$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$fetchCurrentUser$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance v0, Lio/getstream/chat/android/client/ChatClient$fetchCurrentUser$2;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$fetchCurrentUser$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-direct {v0, v1, p2}, Lio/getstream/chat/android/client/ChatClient$fetchCurrentUser$2;-><init>(Lio/getstream/chat/android/client/ChatClient;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/client/ChatClient$fetchCurrentUser$2;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ln23/h;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$fetchCurrentUser$2;->invoke(Ln23/h;Lq83/d;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$fetchCurrentUser$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/ChatClient$fetchCurrentUser$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/ChatClient$fetchCurrentUser$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Lio/getstream/chat/android/client/ChatClient$fetchCurrentUser$2;->L$0:Ljava/lang/Object;

    check-cast v0, Ln23/h;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lio/getstream/chat/android/client/ChatClient$fetchCurrentUser$2;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_1

    if-ne v2, v4, :cond_0

    iget v2, p0, Lio/getstream/chat/android/client/ChatClient$fetchCurrentUser$2;->I$0:I

    iget-object v6, p0, Lio/getstream/chat/android/client/ChatClient$fetchCurrentUser$2;->L$5:Ljava/lang/Object;

    check-cast v6, Lio/getstream/chat/android/client/plugin/Plugin;

    iget-object v6, p0, Lio/getstream/chat/android/client/ChatClient$fetchCurrentUser$2;->L$3:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v7, p0, Lio/getstream/chat/android/client/ChatClient$fetchCurrentUser$2;->L$2:Ljava/lang/Object;

    check-cast v7, Lio/getstream/chat/android/client/ChatClient;

    iget-object v8, p0, Lio/getstream/chat/android/client/ChatClient$fetchCurrentUser$2;->L$1:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Iterable;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/ChatClient$fetchCurrentUser$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-static {p1}, Lio/getstream/chat/android/client/ChatClient;->access$getLogger(Lio/getstream/chat/android/client/ChatClient;)Lb23/k;

    move-result-object p1

    iget-object v2, p1, Lb23/k;->c:Lb23/e;

    iget-object v6, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->x:Lb23/g;

    invoke-interface {v2, v7, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v8, "[fetchCurrentUser] completed: "

    invoke-direct {v2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v7, v6, v2, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    invoke-virtual {v0}, Ln23/h;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/models/User;

    if-eqz p1, :cond_3

    iget-object v2, p0, Lio/getstream/chat/android/client/ChatClient$fetchCurrentUser$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-static {v2}, Lio/getstream/chat/android/client/ChatClient;->access$getMutableClientState$p(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;

    move-result-object v2

    invoke-virtual {v2, p1}, Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;->setUser(Lio/getstream/chat/android/models/User;)V

    :cond_3
    iget-object p1, p0, Lio/getstream/chat/android/client/ChatClient$fetchCurrentUser$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/ChatClient;->getPlugins()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    iget-object v2, p0, Lio/getstream/chat/android/client/ChatClient$fetchCurrentUser$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v6, p1

    move-object v7, v2

    move v2, v3

    :cond_4
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/plugin/Plugin;

    invoke-static {v7}, Lio/getstream/chat/android/client/ChatClient;->access$getLogger(Lio/getstream/chat/android/client/ChatClient;)Lb23/k;

    move-result-object v8

    iget-object v9, v8, Lb23/k;->c:Lb23/e;

    iget-object v10, v8, Lb23/k;->a:Ljava/lang/String;

    sget-object v11, Lb23/g;->x:Lb23/g;

    invoke-interface {v9, v11, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_5

    iget-object v8, v8, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    sget-object v12, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v12, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-interface {v9}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v9

    const-string v12, "[fetchCurrentUser] #doOnResult; plugin: "

    invoke-static {v12, v9}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v11, v10, v9, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    iput-object v0, p0, Lio/getstream/chat/android/client/ChatClient$fetchCurrentUser$2;->L$0:Ljava/lang/Object;

    iput-object v5, p0, Lio/getstream/chat/android/client/ChatClient$fetchCurrentUser$2;->L$1:Ljava/lang/Object;

    iput-object v7, p0, Lio/getstream/chat/android/client/ChatClient$fetchCurrentUser$2;->L$2:Ljava/lang/Object;

    iput-object v6, p0, Lio/getstream/chat/android/client/ChatClient$fetchCurrentUser$2;->L$3:Ljava/lang/Object;

    iput-object v5, p0, Lio/getstream/chat/android/client/ChatClient$fetchCurrentUser$2;->L$4:Ljava/lang/Object;

    iput-object v5, p0, Lio/getstream/chat/android/client/ChatClient$fetchCurrentUser$2;->L$5:Ljava/lang/Object;

    iput v2, p0, Lio/getstream/chat/android/client/ChatClient$fetchCurrentUser$2;->I$0:I

    iput v3, p0, Lio/getstream/chat/android/client/ChatClient$fetchCurrentUser$2;->I$1:I

    iput v4, p0, Lio/getstream/chat/android/client/ChatClient$fetchCurrentUser$2;->label:I

    invoke-interface {p1, v0, p0}, Lio/getstream/chat/android/client/plugin/Plugin;->onFetchCurrentUserResult(Ln23/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
