.class final Lfl0/b$o;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfl0/b;->L(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lec3/l;
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
        "Lfl0/c;",
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
    c = "com.whoop.bot.domain.conversation.AiConversationInteractor$postNewConversation$2"
    f = "AiConversationInteractor.kt"
    l = {
        0x1ff
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcom/whoop/bot/models/conversation/StartConversationRequest;

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Lfl0/b;


# direct methods
.method public constructor <init>(Lfl0/b;Lcom/whoop/bot/models/conversation/StartConversationRequest;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfl0/b;",
            "Lcom/whoop/bot/models/conversation/StartConversationRequest;",
            "Lq83/d<",
            "-",
            "Lfl0/b$o;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfl0/b$o;->z:Lfl0/b;

    iput-object p2, p0, Lfl0/b$o;->E:Lcom/whoop/bot/models/conversation/StartConversationRequest;

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

    new-instance v0, Lfl0/b$o;

    iget-object v1, p0, Lfl0/b$o;->z:Lfl0/b;

    iget-object v2, p0, Lfl0/b$o;->E:Lcom/whoop/bot/models/conversation/StartConversationRequest;

    invoke-direct {v0, v1, v2, p2}, Lfl0/b$o;-><init>(Lfl0/b;Lcom/whoop/bot/models/conversation/StartConversationRequest;Lq83/d;)V

    iput-object p1, v0, Lfl0/b$o;->y:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lfl0/b$o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lfl0/b$o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lfl0/b$o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lfl0/b$o;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    iget-object v1, v0, Lfl0/b$o;->y:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lfl0/b$o;->x:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    iget-object v1, v0, Lfl0/b$o;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/bot/models/conversation/AiChatConversation;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v0, Lfl0/b$o;->z:Lfl0/b;

    invoke-static {v3}, Lfl0/b;->o(Lfl0/b;)Lec3/p1;

    move-result-object v3

    iget-object v5, v0, Lfl0/b$o;->E:Lcom/whoop/bot/models/conversation/StartConversationRequest;

    :cond_2
    move-object v6, v3

    check-cast v6, Lec3/h2;

    invoke-virtual {v6}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lcom/whoop/bot/models/conversation/AiChatConversation;

    invoke-virtual {v5}, Lcom/whoop/bot/models/conversation/StartConversationRequest;->getBody()Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;

    move-result-object v8

    const/4 v9, 0x0

    if-eqz v8, :cond_3

    invoke-static {v8}, Lcom/whoop/bot/models/conversation/ConversationRequestsKt;->toChatMessage(Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;)Lcom/whoop/bot/models/conversation/AiChatMessage;

    move-result-object v8

    goto :goto_0

    :cond_3
    move-object v8, v9

    :goto_0
    invoke-static {v8}, Lwb3/f;->L(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    new-instance v14, Lcom/whoop/bot/models/conversation/AiChatConversation;

    invoke-virtual {v5}, Lcom/whoop/bot/models/conversation/StartConversationRequest;->getConversationId()Ljava/lang/String;

    move-result-object v11

    const/16 v18, 0x7c

    const/16 v19, 0x0

    const/4 v13, 0x0

    move-object v10, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v10 .. v19}, Lcom/whoop/bot/models/conversation/AiChatConversation;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/bot/models/conversation/BetaTagModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v6, v7, v10}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    new-instance v13, Lfl0/c;

    sget-object v15, Lfl0/j;->LOADING:Lfl0/j;

    const/16 v20, 0x3c

    const/16 v21, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object v14, v10

    invoke-direct/range {v13 .. v21}, Lfl0/c;-><init>(Lcom/whoop/bot/models/conversation/AiChatConversation;Lfl0/j;Lnl0/m;Lfl0/k;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v9, v0, Lfl0/b$o;->y:Ljava/lang/Object;

    iput-object v9, v0, Lfl0/b$o;->w:Ljava/lang/Object;

    iput v4, v0, Lfl0/b$o;->x:I

    invoke-interface {v1, v13, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_4

    return-object v2

    :cond_4
    :goto_1
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
