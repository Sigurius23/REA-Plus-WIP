.class final Lio/getstream/chat/android/client/ChatClient$connectAnonymousUser$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/ChatClient;->connectAnonymousUser(Ljava/lang/Long;)Lo23/d;
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
    c = "io.getstream.chat.android.client.ChatClient$connectAnonymousUser$1"
    f = "ChatClient.kt"
    l = {
        0x378
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $timeoutMilliseconds:Ljava/lang/Long;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/ChatClient;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/Long;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Ljava/lang/Long;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/ChatClient$connectAnonymousUser$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$connectAnonymousUser$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iput-object p2, p0, Lio/getstream/chat/android/client/ChatClient$connectAnonymousUser$1;->$timeoutMilliseconds:Ljava/lang/Long;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, Lio/getstream/chat/android/client/ChatClient$connectAnonymousUser$1;

    iget-object v0, p0, Lio/getstream/chat/android/client/ChatClient$connectAnonymousUser$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$connectAnonymousUser$1;->$timeoutMilliseconds:Ljava/lang/Long;

    invoke-direct {p1, v0, v1, p2}, Lio/getstream/chat/android/client/ChatClient$connectAnonymousUser$1;-><init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/Long;Lq83/d;)V

    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$connectAnonymousUser$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/ChatClient$connectAnonymousUser$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/ChatClient$connectAnonymousUser$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$connectAnonymousUser$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/client/ChatClient$connectAnonymousUser$1;->label:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/ChatClient$connectAnonymousUser$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-static {p1}, Lio/getstream/chat/android/client/ChatClient;->access$getLogger(Lio/getstream/chat/android/client/ChatClient;)Lb23/k;

    move-result-object p1

    iget-object v1, p1, Lb23/k;->c:Lb23/e;

    iget-object v4, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->y:Lb23/g;

    invoke-interface {v1, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v1, "[connectAnonymousUser] no args"

    invoke-interface {p1, v5, v4, v1, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    iget-object p1, p0, Lio/getstream/chat/android/client/ChatClient$connectAnonymousUser$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-static {p1}, Lio/getstream/chat/android/client/ChatClient;->access$getUserScope$p(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/client/scope/UserScope;

    move-result-object p1

    invoke-interface {p1}, Lio/getstream/chat/android/client/scope/UserScope;->getUserId()Lio/getstream/chat/android/client/scope/user/UserIdentifier;

    move-result-object p1

    const-string v1, "!anon"

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/client/scope/user/UserIdentifier;->setValue(Ljava/lang/String;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/ChatClient$connectAnonymousUser$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    sget-object v4, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-static {v4}, Lio/getstream/chat/android/client/ChatClient$Companion;->access$getAnonUser(Lio/getstream/chat/android/client/ChatClient$Companion;)Lio/getstream/chat/android/models/User;

    move-result-object v4

    new-instance v5, Lio/getstream/chat/android/client/token/ConstantTokenProvider;

    iget-object v6, p0, Lio/getstream/chat/android/client/ChatClient$connectAnonymousUser$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v6, v1}, Lio/getstream/chat/android/client/ChatClient;->devToken(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v5, v1}, Lio/getstream/chat/android/client/token/ConstantTokenProvider;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$connectAnonymousUser$1;->$timeoutMilliseconds:Ljava/lang/Long;

    iput v3, p0, Lio/getstream/chat/android/client/ChatClient$connectAnonymousUser$1;->label:I

    invoke-static {p1, v4, v5, v1, p0}, Lio/getstream/chat/android/client/ChatClient;->access$setUser(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/client/token/TokenProvider;Ljava/lang/Long;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    iget-object v0, p0, Lio/getstream/chat/android/client/ChatClient$connectAnonymousUser$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    move-object v1, p1

    check-cast v1, Ln23/h;

    invoke-static {v0}, Lio/getstream/chat/android/client/ChatClient;->access$getLogger(Lio/getstream/chat/android/client/ChatClient;)Lb23/k;

    move-result-object v0

    iget-object v3, v0, Lb23/k;->c:Lb23/e;

    iget-object v4, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->x:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    instance-of v3, v1, Ln23/g;

    if-eqz v3, :cond_4

    check-cast v1, Ln23/g;

    iget-object v1, v1, Ln23/g;->a:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/ConnectionData;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/ConnectionData;->getConnectionId()Ljava/lang/String;

    move-result-object v1

    const-string v3, "ConnectionData(connectionId="

    const-string v6, ")"

    invoke-static {v3, v1, v6}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_4
    instance-of v3, v1, Ln23/f;

    if-eqz v3, :cond_5

    check-cast v1, Ln23/f;

    iget-object v1, v1, Ln23/f;->a:Ln23/e;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_1
    const-string v3, "[connectAnonymousUser] completed: "

    invoke-static {v3, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v5, v4, v1, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_6
    return-object p1
.end method
