.class final Lfl0/b$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfl0/b;->F(Ljava/util/UUID;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.bot.domain.conversation.AiConversationInteractor$createMxmSupportTicket$2"
    f = "AiConversationInteractor.kt"
    l = {
        0x11b,
        0x122,
        0x123,
        0x126
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field private synthetic E:Ljava/lang/Object;

.field final synthetic F:Lfl0/b;

.field final synthetic G:Ljava/util/UUID;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Lfl0/b;Ljava/util/UUID;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfl0/b;",
            "Ljava/util/UUID;",
            "Lq83/d<",
            "-",
            "Lfl0/b$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfl0/b$d;->F:Lfl0/b;

    iput-object p2, p0, Lfl0/b$d;->G:Ljava/util/UUID;

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

    new-instance v0, Lfl0/b$d;

    iget-object v1, p0, Lfl0/b$d;->F:Lfl0/b;

    iget-object v2, p0, Lfl0/b$d;->G:Ljava/util/UUID;

    invoke-direct {v0, v1, v2, p2}, Lfl0/b$d;-><init>(Lfl0/b;Ljava/util/UUID;Lq83/d;)V

    iput-object p1, v0, Lfl0/b$d;->E:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lfl0/b$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lfl0/b$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lfl0/b$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lfl0/b$d;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v5, p0

    iget-object v0, v5, Lfl0/b$d;->E:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lec3/m;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v0, v5, Lfl0/b$d;->z:I

    const/4 v10, 0x4

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-eqz v0, :cond_4

    if-eq v0, v11, :cond_3

    if-eq v0, v2, :cond_2

    if-eq v0, v1, :cond_1

    if-ne v0, v10, :cond_0

    iget-object v0, v5, Lfl0/b$d;->y:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, v5, Lfl0/b$d;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/bot/models/conversation/AiChatMessage;

    iget-object v0, v5, Lfl0/b$d;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v13, v0

    move-object/from16 v0, p1

    goto/16 :goto_2

    :cond_2
    iget-object v0, v5, Lfl0/b$d;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/bot/models/conversation/AiChatMessage;

    iget-object v2, v5, Lfl0/b$d;->w:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v13, v2

    goto/16 :goto_1

    :cond_3
    :goto_0
    iget-object v0, v5, Lfl0/b$d;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/bot/models/conversation/AiChatMessage;

    iget-object v0, v5, Lfl0/b$d;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v5, Lfl0/b$d;->F:Lfl0/b;

    invoke-static {v0}, Lfl0/b;->o(Lfl0/b;)Lec3/p1;

    move-result-object v0

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/bot/models/conversation/AiChatConversation;

    invoke-virtual {v0}, Lcom/whoop/bot/models/conversation/AiChatConversation;->getId()Ljava/lang/String;

    move-result-object v0

    iget-object v3, v5, Lfl0/b$d;->F:Lfl0/b;

    invoke-static {v3}, Lfl0/b;->l(Lfl0/b;)Lxk0/a;

    move-result-object v3

    invoke-virtual {v3, v0}, Lxk0/a;->l(Ljava/lang/String;)V

    iget-object v3, v5, Lfl0/b$d;->F:Lfl0/b;

    invoke-static {v3}, Lfl0/b;->o(Lfl0/b;)Lec3/p1;

    move-result-object v3

    check-cast v3, Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/bot/models/conversation/AiChatConversation;

    invoke-static {v3}, Lcom/whoop/bot/models/conversation/AiChatConversationKt;->getLatestAssistantResponse(Lcom/whoop/bot/models/conversation/AiChatConversation;)Lcom/whoop/bot/models/conversation/AiChatMessage;

    move-result-object v3

    if-nez v3, :cond_5

    new-instance v13, Lfl0/c;

    iget-object v0, v5, Lfl0/b$d;->F:Lfl0/b;

    invoke-static {v0}, Lfl0/b;->o(Lfl0/b;)Lec3/p1;

    move-result-object v0

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lcom/whoop/bot/models/conversation/AiChatConversation;

    sget-object v15, Lfl0/j;->ERROR:Lfl0/j;

    const/16 v20, 0x3c

    const/16 v21, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v13 .. v21}, Lfl0/c;-><init>(Lcom/whoop/bot/models/conversation/AiChatConversation;Lfl0/j;Lnl0/m;Lfl0/k;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v12, v5, Lfl0/b$d;->E:Ljava/lang/Object;

    iput-object v12, v5, Lfl0/b$d;->w:Ljava/lang/Object;

    iput-object v12, v5, Lfl0/b$d;->x:Ljava/lang/Object;

    iput v11, v5, Lfl0/b$d;->z:I

    invoke-interface {v8, v13, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_9

    goto/16 :goto_4

    :cond_5
    new-instance v13, Lfl0/c;

    iget-object v4, v5, Lfl0/b$d;->F:Lfl0/b;

    invoke-static {v4}, Lfl0/b;->o(Lfl0/b;)Lec3/p1;

    move-result-object v4

    check-cast v4, Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v14, v4

    check-cast v14, Lcom/whoop/bot/models/conversation/AiChatConversation;

    sget-object v15, Lfl0/j;->LOADING:Lfl0/j;

    const/16 v20, 0x3c

    const/16 v21, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v13 .. v21}, Lfl0/c;-><init>(Lcom/whoop/bot/models/conversation/AiChatConversation;Lfl0/j;Lnl0/m;Lfl0/k;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v8, v5, Lfl0/b$d;->E:Ljava/lang/Object;

    iput-object v0, v5, Lfl0/b$d;->w:Ljava/lang/Object;

    iput-object v3, v5, Lfl0/b$d;->x:Ljava/lang/Object;

    iput v2, v5, Lfl0/b$d;->z:I

    invoke-interface {v8, v13, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v9, :cond_6

    goto/16 :goto_4

    :cond_6
    move-object v13, v0

    move-object v0, v3

    :goto_1
    sget-object v2, Lu02/a;->a:Lu02/a$a;

    iget-object v3, v5, Lfl0/b$d;->F:Lfl0/b;

    invoke-static {v3}, Lfl0/b;->s(Lfl0/b;)Ltr2/n;

    move-result-object v3

    new-instance v4, Lfl0/b$d$a;

    iget-object v6, v5, Lfl0/b$d;->F:Lfl0/b;

    iget-object v7, v5, Lfl0/b$d;->G:Ljava/util/UUID;

    invoke-direct {v4, v6, v0, v7, v12}, Lfl0/b$d$a;-><init>(Lfl0/b;Lcom/whoop/bot/models/conversation/AiChatMessage;Ljava/util/UUID;Lq83/d;)V

    iput-object v8, v5, Lfl0/b$d;->E:Ljava/lang/Object;

    iput-object v13, v5, Lfl0/b$d;->w:Ljava/lang/Object;

    iput-object v12, v5, Lfl0/b$d;->x:Ljava/lang/Object;

    iput v1, v5, Lfl0/b$d;->z:I

    move-object v0, v2

    const/4 v2, 0x0

    move-object v1, v3

    const/4 v3, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_7

    goto :goto_4

    :cond_7
    :goto_2
    check-cast v0, Lu02/a;

    instance-of v1, v0, Lu02/a$c;

    if-eqz v1, :cond_8

    new-instance v14, Lfl0/c;

    iget-object v1, v5, Lfl0/b$d;->F:Lfl0/b;

    check-cast v0, Lu02/a$c;

    invoke-virtual {v0}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/bot/models/conversation/AiChatMessage;

    invoke-static {v1, v0}, Lfl0/b;->e(Lfl0/b;Lcom/whoop/bot/models/conversation/AiChatMessage;)Lcom/whoop/bot/models/conversation/AiChatConversation;

    move-result-object v15

    sget-object v16, Lfl0/j;->SUCCESS:Lfl0/j;

    const/16 v21, 0x3c

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v14 .. v22}, Lfl0/c;-><init>(Lcom/whoop/bot/models/conversation/AiChatConversation;Lfl0/j;Lnl0/m;Lfl0/k;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_3

    :cond_8
    instance-of v1, v0, Lu02/a$b;

    if-eqz v1, :cond_a

    iget-object v1, v5, Lfl0/b$d;->F:Lfl0/b;

    invoke-static {v1}, Lfl0/b;->l(Lfl0/b;)Lxk0/a;

    move-result-object v1

    check-cast v0, Lu02/a$b;

    const-string v2, "create_mxm_support_ticket"

    invoke-virtual {v1, v0, v2}, Lxk0/a;->L(Lu02/a$b;Ljava/lang/String;)V

    iget-object v0, v5, Lfl0/b$d;->F:Lfl0/b;

    invoke-static {v0}, Lfl0/b;->l(Lfl0/b;)Lxk0/a;

    move-result-object v0

    invoke-virtual {v0, v13, v11}, Lxk0/a;->h(Ljava/lang/String;Z)V

    new-instance v14, Lfl0/c;

    iget-object v0, v5, Lfl0/b$d;->F:Lfl0/b;

    invoke-static {v0}, Lfl0/b;->o(Lfl0/b;)Lec3/p1;

    move-result-object v0

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lcom/whoop/bot/models/conversation/AiChatConversation;

    sget-object v16, Lfl0/j;->ERROR:Lfl0/j;

    const/16 v21, 0x3c

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v14 .. v22}, Lfl0/c;-><init>(Lcom/whoop/bot/models/conversation/AiChatConversation;Lfl0/j;Lnl0/m;Lfl0/k;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_3
    iput-object v12, v5, Lfl0/b$d;->E:Ljava/lang/Object;

    iput-object v12, v5, Lfl0/b$d;->w:Ljava/lang/Object;

    iput-object v12, v5, Lfl0/b$d;->x:Ljava/lang/Object;

    iput-object v12, v5, Lfl0/b$d;->y:Ljava/lang/Object;

    iput v10, v5, Lfl0/b$d;->z:I

    invoke-interface {v8, v14, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_9

    :goto_4
    return-object v9

    :cond_9
    :goto_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_a
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
