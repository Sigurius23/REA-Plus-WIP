.class final Lio/getstream/chat/android/client/ChatClient$markMessageAsDelivered$3;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/ChatClient;->markMessageAsDelivered(Ljava/lang/String;)Lo23/d;
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
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Ln23/h;",
        "",
        "it",
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
    c = "io.getstream.chat.android.client.ChatClient$markMessageAsDelivered$3"
    f = "ChatClient.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $messageId:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/ChatClient;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/ChatClient$markMessageAsDelivered$3;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$markMessageAsDelivered$3;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iput-object p2, p0, Lio/getstream/chat/android/client/ChatClient$markMessageAsDelivered$3;->$messageId:Ljava/lang/String;

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

    new-instance p1, Lio/getstream/chat/android/client/ChatClient$markMessageAsDelivered$3;

    iget-object v0, p0, Lio/getstream/chat/android/client/ChatClient$markMessageAsDelivered$3;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$markMessageAsDelivered$3;->$messageId:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Lio/getstream/chat/android/client/ChatClient$markMessageAsDelivered$3;-><init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Lq83/d;)V

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ln23/h;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$markMessageAsDelivered$3;->invoke(Ln23/h;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$markMessageAsDelivered$3;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/ChatClient$markMessageAsDelivered$3;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/ChatClient$markMessageAsDelivered$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lio/getstream/chat/android/client/ChatClient$markMessageAsDelivered$3;->label:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/ChatClient$markMessageAsDelivered$3;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-static {p1}, Lio/getstream/chat/android/client/ChatClient;->access$getLogger(Lio/getstream/chat/android/client/ChatClient;)Lb23/k;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/ChatClient$markMessageAsDelivered$3;->$messageId:Ljava/lang/String;

    iget-object v1, p1, Lb23/k;->c:Lb23/e;

    iget-object v2, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->x:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v1, "[markMessageAsDelivered] #doOnResult; completed("

    const-string v4, ")"

    invoke-static {v1, v0, v4}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p1, v3, v2, v0, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
