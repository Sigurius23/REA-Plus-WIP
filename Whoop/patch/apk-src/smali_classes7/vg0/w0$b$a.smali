.class final Lvg0/w0$b$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvg0/w0$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lpg3/v0;",
        "Lcom/whoop/ai/chat/models/AITurn;",
        "<anonymous>",
        "()Lpg3/v0;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.ai.chat.domain.interactors.StopTurnInteractor$interact$1$1$response$1"
    f = "StopTurnInteractor.kt"
    l = {
        0x37
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lvg0/w0;

.field final synthetic y:Lvg0/v0;


# direct methods
.method public constructor <init>(Lvg0/w0;Lvg0/v0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvg0/w0;",
            "Lvg0/v0;",
            "Lq83/d<",
            "-",
            "Lvg0/w0$b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvg0/w0$b$a;->x:Lvg0/w0;

    iput-object p2, p0, Lvg0/w0$b$a;->y:Lvg0/v0;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lvg0/w0$b$a;

    iget-object v1, p0, Lvg0/w0$b$a;->x:Lvg0/w0;

    iget-object v2, p0, Lvg0/w0$b$a;->y:Lvg0/v0;

    invoke-direct {v0, v1, v2, p1}, Lvg0/w0$b$a;-><init>(Lvg0/w0;Lvg0/v0;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lvg0/w0$b$a;->invoke(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/ai/chat/models/AITurn;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lvg0/w0$b$a;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvg0/w0$b$a;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lvg0/w0$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lvg0/w0$b$a;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lvg0/w0$b$a;->x:Lvg0/w0;

    invoke-static {p1}, Lvg0/w0;->c(Lvg0/w0;)Lcom/whoop/ai/chat/api/AiChatApi;

    move-result-object p1

    iget-object v1, p0, Lvg0/w0$b$a;->y:Lvg0/v0;

    invoke-virtual {v1}, Lvg0/v0;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lvg0/w0$b$a;->y:Lvg0/v0;

    invoke-virtual {v3}, Lvg0/v0;->b()Ljava/lang/String;

    move-result-object v3

    iput v2, p0, Lvg0/w0$b$a;->w:I

    invoke-interface {p1, v1, v3, p0}, Lcom/whoop/ai/chat/api/AiChatApi;->stopConversationTurn(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
