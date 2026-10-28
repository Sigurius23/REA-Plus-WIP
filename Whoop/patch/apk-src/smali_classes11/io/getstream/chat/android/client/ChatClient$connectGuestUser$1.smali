.class final Lio/getstream/chat/android/client/ChatClient$connectGuestUser$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/ChatClient;->connectGuestUser(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lo23/d;
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
    c = "io.getstream.chat.android.client.ChatClient$connectGuestUser$1"
    f = "ChatClient.kt"
    l = {
        0x398,
        0x399
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $timeoutMilliseconds:Ljava/lang/Long;

.field final synthetic $userId:Ljava/lang/String;

.field final synthetic $username:Ljava/lang/String;

.field I$0:I

.field I$1:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/ChatClient;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/ChatClient$connectGuestUser$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$connectGuestUser$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iput-object p2, p0, Lio/getstream/chat/android/client/ChatClient$connectGuestUser$1;->$userId:Ljava/lang/String;

    iput-object p3, p0, Lio/getstream/chat/android/client/ChatClient$connectGuestUser$1;->$username:Ljava/lang/String;

    iput-object p4, p0, Lio/getstream/chat/android/client/ChatClient$connectGuestUser$1;->$timeoutMilliseconds:Ljava/lang/Long;

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

    new-instance v0, Lio/getstream/chat/android/client/ChatClient$connectGuestUser$1;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$connectGuestUser$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-object v2, p0, Lio/getstream/chat/android/client/ChatClient$connectGuestUser$1;->$userId:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/client/ChatClient$connectGuestUser$1;->$username:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/chat/android/client/ChatClient$connectGuestUser$1;->$timeoutMilliseconds:Ljava/lang/Long;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/client/ChatClient$connectGuestUser$1;-><init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$connectGuestUser$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/ChatClient$connectGuestUser$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/ChatClient$connectGuestUser$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$connectGuestUser$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/client/ChatClient$connectGuestUser$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/ChatClient$connectGuestUser$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/GuestUser;

    iget-object v0, p0, Lio/getstream/chat/android/client/ChatClient$connectGuestUser$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lq83/d;

    iget-object v0, p0, Lio/getstream/chat/android/client/ChatClient$connectGuestUser$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ln23/h;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/ChatClient$connectGuestUser$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-static {p1}, Lio/getstream/chat/android/client/ChatClient;->access$getLogger(Lio/getstream/chat/android/client/ChatClient;)Lb23/k;

    move-result-object p1

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$connectGuestUser$1;->$userId:Ljava/lang/String;

    iget-object v5, p0, Lio/getstream/chat/android/client/ChatClient$connectGuestUser$1;->$username:Ljava/lang/String;

    iget-object v6, p1, Lb23/k;->c:Lb23/e;

    iget-object v7, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v8, Lb23/g;->y:Lb23/g;

    invoke-interface {v6, v8, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v6, "\', username: \'"

    const-string v9, "\'"

    const-string v10, "[connectGuestUser] userId: \'"

    invoke-static {v10, v1, v6, v5, v9}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v8, v7, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    iget-object p1, p0, Lio/getstream/chat/android/client/ChatClient$connectGuestUser$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-static {p1}, Lio/getstream/chat/android/client/ChatClient;->access$getUserScope$p(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/client/scope/UserScope;

    move-result-object p1

    invoke-interface {p1}, Lio/getstream/chat/android/client/scope/UserScope;->getUserId()Lio/getstream/chat/android/client/scope/user/UserIdentifier;

    move-result-object p1

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$connectGuestUser$1;->$userId:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/client/scope/user/UserIdentifier;->setValue(Ljava/lang/String;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/ChatClient$connectGuestUser$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$connectGuestUser$1;->$userId:Ljava/lang/String;

    iget-object v5, p0, Lio/getstream/chat/android/client/ChatClient$connectGuestUser$1;->$username:Ljava/lang/String;

    invoke-virtual {p1, v1, v5}, Lio/getstream/chat/android/client/ChatClient;->getGuestToken(Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    iput v3, p0, Lio/getstream/chat/android/client/ChatClient$connectGuestUser$1;->label:I

    invoke-interface {p1, p0}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_1

    :cond_4
    :goto_0
    check-cast p1, Ln23/h;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$connectGuestUser$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-object v3, p0, Lio/getstream/chat/android/client/ChatClient$connectGuestUser$1;->$timeoutMilliseconds:Ljava/lang/Long;

    instance-of v5, p1, Ln23/g;

    if-eqz v5, :cond_5

    check-cast p1, Ln23/g;

    iget-object p1, p1, Ln23/g;->a:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/GuestUser;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/GuestUser;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v5

    new-instance v6, Lio/getstream/chat/android/client/token/ConstantTokenProvider;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/GuestUser;->getToken()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v6, p1}, Lio/getstream/chat/android/client/token/ConstantTokenProvider;-><init>(Ljava/lang/String;)V

    iput-object v4, p0, Lio/getstream/chat/android/client/ChatClient$connectGuestUser$1;->L$0:Ljava/lang/Object;

    iput-object v4, p0, Lio/getstream/chat/android/client/ChatClient$connectGuestUser$1;->L$1:Ljava/lang/Object;

    iput-object v4, p0, Lio/getstream/chat/android/client/ChatClient$connectGuestUser$1;->L$2:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, p0, Lio/getstream/chat/android/client/ChatClient$connectGuestUser$1;->I$0:I

    iput p1, p0, Lio/getstream/chat/android/client/ChatClient$connectGuestUser$1;->I$1:I

    iput v2, p0, Lio/getstream/chat/android/client/ChatClient$connectGuestUser$1;->label:I

    invoke-static {v1, v5, v6, v3, p0}, Lio/getstream/chat/android/client/ChatClient;->access$setUser(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/client/token/TokenProvider;Ljava/lang/Long;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_1
    return-object v0

    :cond_5
    instance-of v0, p1, Ln23/f;

    if-eqz v0, :cond_a

    :cond_6
    :goto_2
    check-cast p1, Ln23/h;

    iget-object v0, p0, Lio/getstream/chat/android/client/ChatClient$connectGuestUser$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    instance-of v1, p1, Ln23/g;

    if-eqz v1, :cond_7

    move-object v1, p1

    check-cast v1, Ln23/g;

    iget-object v1, v1, Ln23/g;->a:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/ConnectionData;

    invoke-static {v0}, Lio/getstream/chat/android/client/ChatClient;->access$getLogger(Lio/getstream/chat/android/client/ChatClient;)Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->x:Lb23/g;

    invoke-interface {v2, v5, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/ConnectionData;->getConnectionId()Ljava/lang/String;

    move-result-object v1

    const-string v2, "[connectGuestUser] completed: ConnectionData(connectionId="

    const-string v6, ")"

    invoke-static {v2, v1, v6}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v5, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object p1

    :cond_7
    instance-of v0, p1, Ln23/f;

    if-eqz v0, :cond_9

    :cond_8
    return-object p1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
