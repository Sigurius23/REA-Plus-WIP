.class final Lfl0/b$d$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfl0/b$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/whoop/bot/models/conversation/AiChatMessage;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.bot.domain.conversation.AiConversationInteractor$createMxmSupportTicket$2$response$1"
    f = "AiConversationInteractor.kt"
    l = {
        0x124
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lfl0/b;

.field final synthetic y:Lcom/whoop/bot/models/conversation/AiChatMessage;

.field final synthetic z:Ljava/util/UUID;


# direct methods
.method public constructor <init>(Lfl0/b;Lcom/whoop/bot/models/conversation/AiChatMessage;Ljava/util/UUID;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfl0/b;",
            "Lcom/whoop/bot/models/conversation/AiChatMessage;",
            "Ljava/util/UUID;",
            "Lq83/d<",
            "-",
            "Lfl0/b$d$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfl0/b$d$a;->x:Lfl0/b;

    iput-object p2, p0, Lfl0/b$d$a;->y:Lcom/whoop/bot/models/conversation/AiChatMessage;

    iput-object p3, p0, Lfl0/b$d$a;->z:Ljava/util/UUID;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Lfl0/b$d$a;

    iget-object v1, p0, Lfl0/b$d$a;->x:Lfl0/b;

    iget-object v2, p0, Lfl0/b$d$a;->y:Lcom/whoop/bot/models/conversation/AiChatMessage;

    iget-object v3, p0, Lfl0/b$d$a;->z:Ljava/util/UUID;

    invoke-direct {v0, v1, v2, v3, p1}, Lfl0/b$d$a;-><init>(Lfl0/b;Lcom/whoop/bot/models/conversation/AiChatMessage;Ljava/util/UUID;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lfl0/b$d$a;->invoke(Lq83/d;)Ljava/lang/Object;

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
            "Lcom/whoop/bot/models/conversation/AiChatMessage;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lfl0/b$d$a;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lfl0/b$d$a;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lfl0/b$d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lfl0/b$d$a;->w:I

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

    iget-object p1, p0, Lfl0/b$d$a;->x:Lfl0/b;

    invoke-static {p1}, Lfl0/b;->m(Lfl0/b;)Lcom/whoop/bot/api/AiConversationApi;

    move-result-object p1

    iget-object v1, p0, Lfl0/b$d$a;->x:Lfl0/b;

    invoke-static {v1}, Lfl0/b;->o(Lfl0/b;)Lec3/p1;

    move-result-object v1

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/bot/models/conversation/AiChatConversation;

    invoke-virtual {v1}, Lcom/whoop/bot/models/conversation/AiChatConversation;->getId()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lfl0/b$d$a;->y:Lcom/whoop/bot/models/conversation/AiChatMessage;

    invoke-virtual {v3}, Lcom/whoop/bot/models/conversation/AiChatMessage;->getId()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lfl0/b$d$a;->z:Ljava/util/UUID;

    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "toString(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput v2, p0, Lfl0/b$d$a;->w:I

    invoke-interface {p1, v1, v3, v4, p0}, Lcom/whoop/bot/api/AiConversationApi;->postMxmCreateTicket(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
