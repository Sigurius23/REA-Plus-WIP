.class final Lio/getstream/chat/android/client/ChatClient$disconnect$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/ChatClient;->disconnect(ZZ)Lo23/d;
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
        "Ll83/a0;",
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
    c = "io.getstream.chat.android.client.ChatClient$disconnect$1"
    f = "ChatClient.kt"
    l = {
        0x614,
        0x616
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $deleteDevice:Z

.field final synthetic $flushPersistence:Z

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/ChatClient;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/ChatClient;ZZLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "ZZ",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/ChatClient$disconnect$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$disconnect$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iput-boolean p2, p0, Lio/getstream/chat/android/client/ChatClient$disconnect$1;->$deleteDevice:Z

    iput-boolean p3, p0, Lio/getstream/chat/android/client/ChatClient$disconnect$1;->$flushPersistence:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, Lio/getstream/chat/android/client/ChatClient$disconnect$1;

    iget-object v0, p0, Lio/getstream/chat/android/client/ChatClient$disconnect$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-boolean v1, p0, Lio/getstream/chat/android/client/ChatClient$disconnect$1;->$deleteDevice:Z

    iget-boolean v2, p0, Lio/getstream/chat/android/client/ChatClient$disconnect$1;->$flushPersistence:Z

    invoke-direct {p1, v0, v1, v2, p2}, Lio/getstream/chat/android/client/ChatClient$disconnect$1;-><init>(Lio/getstream/chat/android/client/ChatClient;ZZLq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$disconnect$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/ChatClient$disconnect$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/ChatClient$disconnect$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$disconnect$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/client/ChatClient$disconnect$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

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

    iget-object p1, p0, Lio/getstream/chat/android/client/ChatClient$disconnect$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-static {p1}, Lio/getstream/chat/android/client/ChatClient;->access$getLogger(Lio/getstream/chat/android/client/ChatClient;)Lb23/k;

    move-result-object p1

    iget-boolean v1, p0, Lio/getstream/chat/android/client/ChatClient$disconnect$1;->$flushPersistence:Z

    iget-object v4, p1, Lb23/k;->c:Lb23/e;

    iget-object v5, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->y:Lb23/g;

    invoke-interface {v4, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    const/4 v7, 0x0

    if-eqz v4, :cond_3

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v4, "[disconnect] flushPersistence: "

    invoke-static {v4, v1}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v6, v5, v1, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    iget-object p1, p0, Lio/getstream/chat/android/client/ChatClient$disconnect$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-static {p1}, Lio/getstream/chat/android/client/ChatClient;->access$isUserSet(Lio/getstream/chat/android/client/ChatClient;)Z

    move-result p1

    if-ne p1, v3, :cond_6

    iget-boolean p1, p0, Lio/getstream/chat/android/client/ChatClient$disconnect$1;->$deleteDevice:Z

    if-eqz p1, :cond_4

    iget-object p1, p0, Lio/getstream/chat/android/client/ChatClient$disconnect$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-static {p1}, Lio/getstream/chat/android/client/ChatClient;->access$getNotifications$p(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/client/notifications/ChatNotifications;

    move-result-object p1

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$disconnect$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/ChatClient;->getCurrentUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    iput v3, p0, Lio/getstream/chat/android/client/ChatClient$disconnect$1;->label:I

    invoke-interface {p1, v1, p0}, Lio/getstream/chat/android/client/notifications/ChatNotifications;->deleteDevice(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_1

    :cond_4
    :goto_0
    iget-object p1, p0, Lio/getstream/chat/android/client/ChatClient$disconnect$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-boolean v1, p0, Lio/getstream/chat/android/client/ChatClient$disconnect$1;->$flushPersistence:Z

    iput v2, p0, Lio/getstream/chat/android/client/ChatClient$disconnect$1;->label:I

    invoke-static {p1, v1, p0}, Lio/getstream/chat/android/client/ChatClient;->access$disconnectSuspend(Lio/getstream/chat/android/client/ChatClient;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_5
    :goto_2
    new-instance p1, Ln23/g;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p1, v0}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_6
    if-nez p1, :cond_8

    iget-object p1, p0, Lio/getstream/chat/android/client/ChatClient$disconnect$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-static {p1}, Lio/getstream/chat/android/client/ChatClient;->access$getLogger(Lio/getstream/chat/android/client/ChatClient;)Lb23/k;

    move-result-object p1

    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    iget-object v1, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v2, Lb23/g;->z:Lb23/g;

    invoke-interface {v0, v2, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v0, "[disconnect] cannot disconnect as the user wasn\'t connected"

    invoke-interface {p1, v2, v1, v0, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    new-instance p1, Ln23/f;

    new-instance v0, Ln23/a;

    const-string v1, "ChatClient can\'t be disconnected because user wasn\'t connected previously"

    invoke-direct {v0, v1}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Ln23/f;-><init>(Ln23/e;)V

    return-object p1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
