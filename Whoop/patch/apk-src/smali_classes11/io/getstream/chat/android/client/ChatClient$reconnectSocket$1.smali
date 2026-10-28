.class final Lio/getstream/chat/android/client/ChatClient$reconnectSocket$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/ChatClient;->reconnectSocket()Lo23/d;
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
    c = "io.getstream.chat.android.client.ChatClient$reconnectSocket$1"
    f = "ChatClient.kt"
    l = {
        0x53d
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

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
            "Lio/getstream/chat/android/client/ChatClient$reconnectSocket$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$reconnectSocket$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Lio/getstream/chat/android/client/ChatClient$reconnectSocket$1;

    iget-object v0, p0, Lio/getstream/chat/android/client/ChatClient$reconnectSocket$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-direct {p1, v0, p2}, Lio/getstream/chat/android/client/ChatClient$reconnectSocket$1;-><init>(Lio/getstream/chat/android/client/ChatClient;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$reconnectSocket$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/ChatClient$reconnectSocket$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/ChatClient$reconnectSocket$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$reconnectSocket$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/client/ChatClient$reconnectSocket$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/ChatClient$reconnectSocket$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/clientstate/UserState;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/ChatClient$reconnectSocket$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-static {p1}, Lio/getstream/chat/android/client/ChatClient;->access$getUserStateService$p(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/client/clientstate/UserStateService;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/clientstate/UserStateService;->getState$stream_chat_android_client_release()Lio/getstream/chat/android/client/clientstate/UserState;

    move-result-object p1

    instance-of v1, p1, Lio/getstream/chat/android/client/clientstate/UserState$UserSet;

    if-nez v1, :cond_3

    instance-of v1, p1, Lio/getstream/chat/android/client/clientstate/UserState$AnonymousUserSet;

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Ln23/f;

    new-instance v1, Ln23/a;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Invalid user state "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " without user being set!"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ln23/f;-><init>(Ln23/e;)V

    return-object v0

    :cond_3
    :goto_0
    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$reconnectSocket$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-static {v1}, Lio/getstream/chat/android/client/ChatClient;->access$getChatSocket$p(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/client/socket/ChatSocket;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/clientstate/UserState;->userOrError$stream_chat_android_client_release()Lio/getstream/chat/android/models/User;

    move-result-object v3

    instance-of p1, p1, Lio/getstream/chat/android/client/clientstate/UserState$AnonymousUserSet;

    const/4 v4, 0x0

    iput-object v4, p0, Lio/getstream/chat/android/client/ChatClient$reconnectSocket$1;->L$0:Ljava/lang/Object;

    iput v2, p0, Lio/getstream/chat/android/client/ChatClient$reconnectSocket$1;->label:I

    invoke-virtual {v1, v3, p1, v2, p0}, Lio/getstream/chat/android/client/socket/ChatSocket;->reconnectUser(Lio/getstream/chat/android/models/User;ZZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    new-instance p1, Ln23/g;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p1, v0}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method
