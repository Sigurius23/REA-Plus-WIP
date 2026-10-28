.class final Lcl0/b$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcl0/b;->g(Lcom/whoop/bot/models/conversation/AiChatMessage;)Lec3/l;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Lcom/whoop/bot/models/conversation/AiChatMessage;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.bot.domain.active.ActiveResponsePollingInteractor$pollMessageEndpoint$1"
    f = "ActiveResponsePollingInteractor.kt"
    l = {
        0x1f,
        0x21,
        0x22,
        0x23
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcl0/b;

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Lcom/whoop/bot/models/conversation/AiChatMessage;


# direct methods
.method public constructor <init>(Lcom/whoop/bot/models/conversation/AiChatMessage;Lcl0/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/bot/models/conversation/AiChatMessage;",
            "Lcl0/b;",
            "Lq83/d<",
            "-",
            "Lcl0/b$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcl0/b$c;->z:Lcom/whoop/bot/models/conversation/AiChatMessage;

    iput-object p2, p0, Lcl0/b$c;->E:Lcl0/b;

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

    new-instance v0, Lcl0/b$c;

    iget-object v1, p0, Lcl0/b$c;->z:Lcom/whoop/bot/models/conversation/AiChatMessage;

    iget-object v2, p0, Lcl0/b$c;->E:Lcl0/b;

    invoke-direct {v0, v1, v2, p2}, Lcl0/b$c;-><init>(Lcom/whoop/bot/models/conversation/AiChatMessage;Lcl0/b;Lq83/d;)V

    iput-object p1, v0, Lcl0/b$c;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcl0/b$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcl0/b$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcl0/b$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcl0/b$c;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lcl0/b$c;->y:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lcl0/b$c;->x:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v2, p0, Lcl0/b$c;->w:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/bot/models/conversation/AiChatMessage;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_2
    iget-object v2, p0, Lcl0/b$c;->w:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/bot/models/conversation/AiChatMessage;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    :goto_0
    iget-object v2, p0, Lcl0/b$c;->w:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/bot/models/conversation/AiChatMessage;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, p0, Lcl0/b$c;->z:Lcom/whoop/bot/models/conversation/AiChatMessage;

    iput-object v0, p0, Lcl0/b$c;->y:Ljava/lang/Object;

    iput-object v2, p0, Lcl0/b$c;->w:Ljava/lang/Object;

    iput v6, p0, Lcl0/b$c;->x:I

    invoke-interface {v0, v2, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_4

    :cond_5
    :goto_1
    invoke-virtual {v2}, Lcom/whoop/bot/models/conversation/AiChatMessage;->getMessageStatus()Lcom/whoop/bot/models/conversation/AiMessageStatus;

    move-result-object p1

    sget-object v6, Lcom/whoop/bot/models/conversation/AiMessageStatus;->ACTIVE:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    if-ne p1, v6, :cond_8

    iget-object p1, p0, Lcl0/b$c;->E:Lcl0/b;

    invoke-static {p1}, Lcl0/b;->d(Lcl0/b;)Lcl0/a;

    move-result-object p1

    invoke-virtual {v2}, Lcom/whoop/bot/models/conversation/AiChatMessage;->getId()Ljava/lang/String;

    move-result-object v2

    iput-object v0, p0, Lcl0/b$c;->y:Ljava/lang/Object;

    const/4 v6, 0x0

    iput-object v6, p0, Lcl0/b$c;->w:Ljava/lang/Object;

    iput v5, p0, Lcl0/b$c;->x:I

    invoke-virtual {p1, v2, p0}, Lcl0/a;->c(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_4

    :cond_6
    :goto_2
    check-cast p1, Lcom/whoop/bot/models/conversation/AiChatMessage;

    iput-object v0, p0, Lcl0/b$c;->y:Ljava/lang/Object;

    iput-object p1, p0, Lcl0/b$c;->w:Ljava/lang/Object;

    iput v4, p0, Lcl0/b$c;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_7

    goto :goto_4

    :cond_7
    move-object v2, p1

    :goto_3
    iget-object p1, p0, Lcl0/b$c;->E:Lcl0/b;

    iput-object v0, p0, Lcl0/b$c;->y:Ljava/lang/Object;

    iput-object v2, p0, Lcl0/b$c;->w:Ljava/lang/Object;

    iput v3, p0, Lcl0/b$c;->x:I

    invoke-static {p1, v2, p0}, Lcl0/b;->c(Lcl0/b;Lcom/whoop/bot/models/conversation/AiChatMessage;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_4
    return-object v1

    :cond_8
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
