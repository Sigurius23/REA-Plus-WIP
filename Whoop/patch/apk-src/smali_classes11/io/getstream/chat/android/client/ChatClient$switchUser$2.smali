.class final Lio/getstream/chat/android/client/ChatClient$switchUser$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/ChatClient;->switchUser(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/client/token/TokenProvider;Ljava/lang/Long;Lc93/a;)Lo23/d;
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
        "Lio/getstream/chat/android/models/ConnectionData;",
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
    c = "io.getstream.chat.android.client.ChatClient$switchUser$2"
    f = "ChatClient.kt"
    l = {
        0x304,
        0x305,
        0x30a
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $onDisconnectionComplete:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field final synthetic $timeoutMilliseconds:Ljava/lang/Long;

.field final synthetic $tokenProvider:Lio/getstream/chat/android/client/token/TokenProvider;

.field final synthetic $user:Lio/getstream/chat/android/models/User;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/ChatClient;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/models/User;Lc93/a;Lio/getstream/chat/android/client/token/TokenProvider;Ljava/lang/Long;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lio/getstream/chat/android/models/User;",
            "Lc93/a;",
            "Lio/getstream/chat/android/client/token/TokenProvider;",
            "Ljava/lang/Long;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/ChatClient$switchUser$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$switchUser$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iput-object p2, p0, Lio/getstream/chat/android/client/ChatClient$switchUser$2;->$user:Lio/getstream/chat/android/models/User;

    iput-object p3, p0, Lio/getstream/chat/android/client/ChatClient$switchUser$2;->$onDisconnectionComplete:Lc93/a;

    iput-object p4, p0, Lio/getstream/chat/android/client/ChatClient$switchUser$2;->$tokenProvider:Lio/getstream/chat/android/client/token/TokenProvider;

    iput-object p5, p0, Lio/getstream/chat/android/client/ChatClient$switchUser$2;->$timeoutMilliseconds:Ljava/lang/Long;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
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

    new-instance v0, Lio/getstream/chat/android/client/ChatClient$switchUser$2;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$switchUser$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-object v2, p0, Lio/getstream/chat/android/client/ChatClient$switchUser$2;->$user:Lio/getstream/chat/android/models/User;

    iget-object v3, p0, Lio/getstream/chat/android/client/ChatClient$switchUser$2;->$onDisconnectionComplete:Lc93/a;

    iget-object v4, p0, Lio/getstream/chat/android/client/ChatClient$switchUser$2;->$tokenProvider:Lio/getstream/chat/android/client/token/TokenProvider;

    iget-object v5, p0, Lio/getstream/chat/android/client/ChatClient$switchUser$2;->$timeoutMilliseconds:Ljava/lang/Long;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/client/ChatClient$switchUser$2;-><init>(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/models/User;Lc93/a;Lio/getstream/chat/android/client/token/TokenProvider;Ljava/lang/Long;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$switchUser$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/ChatClient$switchUser$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/ChatClient$switchUser$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$switchUser$2;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/client/ChatClient$switchUser$2;->label:I

    const/4 v2, 0x0

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v5, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/ChatClient$switchUser$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-static {p1}, Lio/getstream/chat/android/client/ChatClient;->access$getLogger(Lio/getstream/chat/android/client/ChatClient;)Lb23/k;

    move-result-object p1

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$switchUser$2;->$user:Lio/getstream/chat/android/models/User;

    iget-object v6, p1, Lb23/k;->c:Lb23/e;

    iget-object v7, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v8, Lb23/g;->y:Lb23/g;

    invoke-interface {v6, v8, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_4

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v1

    const-string v6, "[switchUser] user.id: \'"

    const-string v9, "\'"

    invoke-static {v6, v1, v9}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v8, v7, v1, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    iget-object p1, p0, Lio/getstream/chat/android/client/ChatClient$switchUser$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-static {p1}, Lio/getstream/chat/android/client/ChatClient;->access$getNotifications$p(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/client/notifications/ChatNotifications;

    move-result-object p1

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$switchUser$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/ChatClient;->getCurrentUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    iput v5, p0, Lio/getstream/chat/android/client/ChatClient$switchUser$2;->label:I

    invoke-interface {p1, v1, p0}, Lio/getstream/chat/android/client/notifications/ChatNotifications;->deleteDevice(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_2

    :cond_5
    :goto_0
    iget-object p1, p0, Lio/getstream/chat/android/client/ChatClient$switchUser$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iput v4, p0, Lio/getstream/chat/android/client/ChatClient$switchUser$2;->label:I

    invoke-static {p1, v5, p0}, Lio/getstream/chat/android/client/ChatClient;->access$disconnectUserSuspend(Lio/getstream/chat/android/client/ChatClient;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto :goto_2

    :cond_6
    :goto_1
    iget-object p1, p0, Lio/getstream/chat/android/client/ChatClient$switchUser$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-static {p1}, Lio/getstream/chat/android/client/ChatClient;->access$getUserScope$p(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/client/scope/UserScope;

    move-result-object p1

    invoke-interface {p1}, Lio/getstream/chat/android/client/scope/UserScope;->getUserId()Lio/getstream/chat/android/client/scope/user/UserIdentifier;

    move-result-object p1

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$switchUser$2;->$user:Lio/getstream/chat/android/models/User;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/client/scope/user/UserIdentifier;->setValue(Ljava/lang/String;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/ChatClient$switchUser$2;->$onDisconnectionComplete:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    iget-object p1, p0, Lio/getstream/chat/android/client/ChatClient$switchUser$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$switchUser$2;->$user:Lio/getstream/chat/android/models/User;

    iget-object v4, p0, Lio/getstream/chat/android/client/ChatClient$switchUser$2;->$tokenProvider:Lio/getstream/chat/android/client/token/TokenProvider;

    iget-object v5, p0, Lio/getstream/chat/android/client/ChatClient$switchUser$2;->$timeoutMilliseconds:Ljava/lang/Long;

    iput v3, p0, Lio/getstream/chat/android/client/ChatClient$switchUser$2;->label:I

    invoke-static {p1, v1, v4, v5, p0}, Lio/getstream/chat/android/client/ChatClient;->access$connectUserSuspend(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/client/token/TokenProvider;Ljava/lang/Long;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    :goto_2
    return-object v0

    :cond_7
    :goto_3
    iget-object v0, p0, Lio/getstream/chat/android/client/ChatClient$switchUser$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$switchUser$2;->$user:Lio/getstream/chat/android/models/User;

    move-object v3, p1

    check-cast v3, Ln23/h;

    invoke-static {v0}, Lio/getstream/chat/android/client/ChatClient;->access$getLogger(Lio/getstream/chat/android/client/ChatClient;)Lb23/k;

    move-result-object v0

    iget-object v3, v0, Lb23/k;->c:Lb23/e;

    iget-object v4, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->x:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_8

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v1

    const-string v3, "[switchUser] completed(\'"

    const-string v6, "\')"

    invoke-static {v3, v1, v6}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v5, v4, v1, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_8
    return-object p1
.end method
