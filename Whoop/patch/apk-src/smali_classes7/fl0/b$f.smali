.class final Lfl0/b$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfl0/b;->H(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.bot.domain.conversation.AiConversationInteractor$fetchPastConversation$2"
    f = "AiConversationInteractor.kt"
    l = {
        0xd4,
        0xdb,
        0xde
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Lfl0/b;


# direct methods
.method public constructor <init>(Lfl0/b;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfl0/b;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lfl0/b$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfl0/b$f;->z:Lfl0/b;

    iput-object p2, p0, Lfl0/b$f;->E:Ljava/lang/String;

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

    new-instance v0, Lfl0/b$f;

    iget-object v1, p0, Lfl0/b$f;->z:Lfl0/b;

    iget-object v2, p0, Lfl0/b$f;->E:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p2}, Lfl0/b$f;-><init>(Lfl0/b;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Lfl0/b$f;->y:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lfl0/b$f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lfl0/b$f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lfl0/b$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lfl0/b$f;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v5, p0

    iget-object v0, v5, Lfl0/b$f;->y:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lec3/m;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v0, v5, Lfl0/b$f;->x:I

    const/4 v10, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v11, 0x0

    if-eqz v0, :cond_3

    if-eq v0, v2, :cond_2

    if-eq v0, v1, :cond_1

    if-ne v0, v10, :cond_0

    iget-object v0, v5, Lfl0/b$f;->w:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_1

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v12, Lfl0/c;

    iget-object v0, v5, Lfl0/b$f;->z:Lfl0/b;

    invoke-static {v0}, Lfl0/b;->o(Lfl0/b;)Lec3/p1;

    move-result-object v0

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/whoop/bot/models/conversation/AiChatConversation;

    sget-object v14, Lfl0/j;->SUCCESS:Lfl0/j;

    sget-object v15, Lnl0/m;->SCREEN_LOADING:Lnl0/m;

    const/16 v19, 0x38

    const/16 v20, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v12 .. v20}, Lfl0/c;-><init>(Lcom/whoop/bot/models/conversation/AiChatConversation;Lfl0/j;Lnl0/m;Lfl0/k;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v8, v5, Lfl0/b$f;->y:Ljava/lang/Object;

    iput v2, v5, Lfl0/b$f;->x:I

    invoke-interface {v8, v12, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_4

    goto/16 :goto_3

    :cond_4
    :goto_0
    sget-object v0, Lu02/a;->a:Lu02/a$a;

    iget-object v2, v5, Lfl0/b$f;->z:Lfl0/b;

    invoke-static {v2}, Lfl0/b;->s(Lfl0/b;)Ltr2/n;

    move-result-object v2

    new-instance v4, Lfl0/b$f$a;

    iget-object v3, v5, Lfl0/b$f;->z:Lfl0/b;

    iget-object v6, v5, Lfl0/b$f;->E:Ljava/lang/String;

    invoke-direct {v4, v3, v6, v11}, Lfl0/b$f$a;-><init>(Lfl0/b;Ljava/lang/String;Lq83/d;)V

    iput-object v8, v5, Lfl0/b$f;->y:Ljava/lang/Object;

    iput v1, v5, Lfl0/b$f;->x:I

    move-object v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_5

    goto/16 :goto_3

    :cond_5
    :goto_1
    check-cast v0, Lu02/a;

    instance-of v1, v0, Lu02/a$c;

    if-eqz v1, :cond_7

    iget-object v1, v5, Lfl0/b$f;->z:Lfl0/b;

    invoke-static {v1}, Lfl0/b;->o(Lfl0/b;)Lec3/p1;

    move-result-object v1

    :cond_6
    move-object v2, v1

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/whoop/bot/models/conversation/AiChatConversation;

    move-object v4, v0

    check-cast v4, Lu02/a$c;

    invoke-virtual {v4}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/bot/models/conversation/AiChatConversation;

    invoke-virtual {v2, v3, v6}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    new-instance v12, Lfl0/c;

    invoke-virtual {v4}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/whoop/bot/models/conversation/AiChatConversation;

    sget-object v14, Lfl0/j;->SUCCESS:Lfl0/j;

    const/16 v19, 0x3c

    const/16 v20, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v12 .. v20}, Lfl0/c;-><init>(Lcom/whoop/bot/models/conversation/AiChatConversation;Lfl0/j;Lnl0/m;Lfl0/k;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_7
    instance-of v1, v0, Lu02/a$b;

    if-eqz v1, :cond_9

    iget-object v1, v5, Lfl0/b$f;->z:Lfl0/b;

    invoke-static {v1}, Lfl0/b;->l(Lfl0/b;)Lxk0/a;

    move-result-object v1

    check-cast v0, Lu02/a$b;

    const-string v2, "fetch_past_conversation"

    invoke-virtual {v1, v0, v2}, Lxk0/a;->L(Lu02/a$b;Ljava/lang/String;)V

    new-instance v12, Lfl0/c;

    iget-object v0, v5, Lfl0/b$f;->z:Lfl0/b;

    invoke-static {v0}, Lfl0/b;->o(Lfl0/b;)Lec3/p1;

    move-result-object v0

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/whoop/bot/models/conversation/AiChatConversation;

    sget-object v14, Lfl0/j;->SUCCESS:Lfl0/j;

    sget-object v15, Lnl0/m;->SCREEN_ERROR:Lnl0/m;

    new-instance v0, Lfl0/k$d;

    iget-object v1, v5, Lfl0/b$f;->E:Ljava/lang/String;

    invoke-direct {v0, v1}, Lfl0/k$d;-><init>(Ljava/lang/String;)V

    const/16 v19, 0x30

    const/16 v20, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v16, v0

    invoke-direct/range {v12 .. v20}, Lfl0/c;-><init>(Lcom/whoop/bot/models/conversation/AiChatConversation;Lfl0/j;Lnl0/m;Lfl0/k;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_2
    iput-object v11, v5, Lfl0/b$f;->y:Ljava/lang/Object;

    iput-object v11, v5, Lfl0/b$f;->w:Ljava/lang/Object;

    iput v10, v5, Lfl0/b$f;->x:I

    invoke-interface {v8, v12, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_8

    :goto_3
    return-object v9

    :cond_8
    :goto_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_9
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
