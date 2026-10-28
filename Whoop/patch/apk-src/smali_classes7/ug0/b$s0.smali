.class final Lug0/b$s0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lug0/b;->i0(Lec3/m;Ltg0/b;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lug0/b$s0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u0004*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lec3/m;",
        "Lwg0/h;",
        "",
        "cause",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;Ljava/lang/Throwable;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner$pollIfNeeded$5"
    f = "AiChatConversationCombiner.kt"
    l = {
        0x3f9
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field

.field final synthetic F:Lug0/b;

.field final synthetic G:Ljava/lang/String;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/g0;Lug0/b;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/g0;",
            "Lug0/b;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lug0/b$s0;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lug0/b$s0;->E:Lkotlin/jvm/internal/g0;

    iput-object p2, p0, Lug0/b$s0;->F:Lug0/b;

    iput-object p3, p0, Lug0/b$s0;->G:Ljava/lang/String;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Throwable;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Ljava/lang/Throwable;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance p1, Lug0/b$s0;

    iget-object v0, p0, Lug0/b$s0;->E:Lkotlin/jvm/internal/g0;

    iget-object v1, p0, Lug0/b$s0;->F:Lug0/b;

    iget-object v2, p0, Lug0/b$s0;->G:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2, p3}, Lug0/b$s0;-><init>(Lkotlin/jvm/internal/g0;Lug0/b;Ljava/lang/String;Lq83/d;)V

    iput-object p2, p1, Lug0/b$s0;->z:Ljava/lang/Object;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lug0/b$s0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Ljava/lang/Throwable;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lug0/b$s0;->invoke(Lec3/m;Ljava/lang/Throwable;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v0, p0

    iget-object v1, v0, Lug0/b$s0;->z:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Throwable;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lug0/b$s0;->y:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    iget-object v1, v0, Lug0/b$s0;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/g0;

    iget-object v2, v0, Lug0/b$s0;->w:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/ai/chat/models/AITurn;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    goto/16 :goto_6

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    if-nez v1, :cond_10

    iget-object v1, v0, Lug0/b$s0;->E:Lkotlin/jvm/internal/g0;

    iget-object v3, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v5, v3

    check-cast v5, Ltg0/b;

    const v22, 0xfe7f

    const/16 v23, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v5 .. v23}, Ltg0/b;->b(Ltg0/b;Lcom/whoop/ai/chat/models/AIConversation;Lfl0/j;Lnl0/m;Ljava/lang/String;Ljava/util/List;Lhl0/d;Ltg0/h;ZZLtg0/e;Lc91/b;ZZZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ltg0/b;

    move-result-object v3

    iput-object v3, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object v1, v0, Lug0/b$s0;->E:Lkotlin/jvm/internal/g0;

    iget-object v1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Ltg0/b;

    invoke-virtual {v1}, Ltg0/b;->e()Lcom/whoop/ai/chat/models/AIConversation;

    move-result-object v1

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/whoop/ai/chat/models/AIConversation;->getTurns()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {v1}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/ai/chat/models/AITurn;

    goto :goto_0

    :cond_2
    move-object v1, v3

    :goto_0
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/whoop/ai/chat/models/AITurn;->getTurnStatus()Lcom/whoop/bot/models/conversation/AiMessageStatus;

    move-result-object v5

    goto :goto_1

    :cond_3
    move-object v5, v3

    :goto_1
    const/4 v6, -0x1

    if-nez v5, :cond_4

    move v5, v6

    goto :goto_2

    :cond_4
    sget-object v7, Lug0/b$s0$a;->a:[I

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v5, v7, v5

    :goto_2
    if-eq v5, v6, :cond_10

    if-eq v5, v4, :cond_10

    const/4 v6, 0x2

    if-eq v5, v6, :cond_f

    const/4 v6, 0x3

    if-eq v5, v6, :cond_e

    const/4 v6, 0x4

    if-eq v5, v6, :cond_6

    const/4 v6, 0x5

    if-ne v5, v6, :cond_5

    goto :goto_3

    :cond_5
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_6
    :goto_3
    invoke-virtual {v1}, Lcom/whoop/ai/chat/models/AITurn;->getTurnStatus()Lcom/whoop/bot/models/conversation/AiMessageStatus;

    move-result-object v5

    sget-object v6, Lcom/whoop/bot/models/conversation/AiMessageStatus;->COMPLETE:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    if-ne v5, v6, :cond_c

    iget-object v5, v0, Lug0/b$s0;->E:Lkotlin/jvm/internal/g0;

    iget-object v5, v5, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v5, Ltg0/b;

    invoke-virtual {v5}, Ltg0/b;->e()Lcom/whoop/ai/chat/models/AIConversation;

    move-result-object v5

    if-eqz v5, :cond_7

    invoke-virtual {v5}, Lcom/whoop/ai/chat/models/AIConversation;->getMetadata()Lcom/whoop/ai/chat/models/AIConversationMetadata;

    move-result-object v5

    if-eqz v5, :cond_7

    invoke-virtual {v5}, Lcom/whoop/ai/chat/models/AIConversationMetadata;->getFingerprint()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_8

    :cond_7
    const-string v5, ""

    :cond_8
    invoke-virtual {v1}, Lcom/whoop/ai/chat/models/AITurn;->getMessages()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_9
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lcom/whoop/ai/chat/models/AIMessage;

    invoke-virtual {v8}, Lcom/whoop/ai/chat/models/AIMessage;->getRole()Ljava/lang/String;

    move-result-object v8

    sget-object v9, Lnl0/b;->ASSISTANT:Lnl0/b;

    invoke-virtual {v9}, Lnl0/b;->getValue()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_9

    goto :goto_4

    :cond_a
    move-object v7, v3

    :goto_4
    check-cast v7, Lcom/whoop/ai/chat/models/AIMessage;

    if-eqz v7, :cond_b

    invoke-virtual {v7}, Lcom/whoop/ai/chat/models/AIMessage;->getId()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_b

    goto :goto_5

    :cond_b
    invoke-virtual {v1}, Lcom/whoop/ai/chat/models/AITurn;->getId()Ljava/lang/String;

    move-result-object v6

    :goto_5
    iget-object v1, v0, Lug0/b$s0;->F:Lug0/b;

    invoke-static {v1}, Lug0/b;->i(Lug0/b;)Lrg0/b;

    move-result-object v1

    new-instance v7, Lrg0/a$b;

    invoke-direct {v7, v5, v6}, Lrg0/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Lrg0/b;->a(Lrg0/a;)V

    :cond_c
    iget-object v1, v0, Lug0/b$s0;->E:Lkotlin/jvm/internal/g0;

    iget-object v5, v0, Lug0/b$s0;->F:Lug0/b;

    iget-object v6, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v6, Ltg0/b;

    iget-object v7, v0, Lug0/b$s0;->G:Ljava/lang/String;

    iput-object v3, v0, Lug0/b$s0;->z:Ljava/lang/Object;

    iput-object v3, v0, Lug0/b$s0;->w:Ljava/lang/Object;

    iput-object v1, v0, Lug0/b$s0;->x:Ljava/lang/Object;

    iput v4, v0, Lug0/b$s0;->y:I

    invoke-static {v5, v6, v7, v0}, Lug0/b;->h(Lug0/b;Ltg0/b;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_d

    return-object v2

    :cond_d
    :goto_6
    iput-object v3, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    goto :goto_7

    :cond_e
    invoke-static {v1}, Lxg0/b;->a(Lcom/whoop/ai/chat/models/AITurn;)Z

    move-result v1

    if-eqz v1, :cond_10

    iget-object v1, v0, Lug0/b$s0;->E:Lkotlin/jvm/internal/g0;

    iget-object v2, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v3, v2

    check-cast v3, Ltg0/b;

    sget-object v5, Lfl0/j;->ERROR:Lfl0/j;

    const v20, 0xfffd

    const/16 v21, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v3 .. v21}, Ltg0/b;->b(Ltg0/b;Lcom/whoop/ai/chat/models/AIConversation;Lfl0/j;Lnl0/m;Ljava/lang/String;Ljava/util/List;Lhl0/d;Ltg0/h;ZZLtg0/e;Lc91/b;ZZZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ltg0/b;

    move-result-object v2

    iput-object v2, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    goto :goto_7

    :cond_f
    invoke-static {v1}, Lxg0/b;->a(Lcom/whoop/ai/chat/models/AITurn;)Z

    move-result v1

    if-eqz v1, :cond_10

    iget-object v1, v0, Lug0/b$s0;->E:Lkotlin/jvm/internal/g0;

    iget-object v2, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v3, v2

    check-cast v3, Ltg0/b;

    sget-object v5, Lfl0/j;->FLAGGED:Lfl0/j;

    const v20, 0xfffd

    const/16 v21, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v3 .. v21}, Ltg0/b;->b(Ltg0/b;Lcom/whoop/ai/chat/models/AIConversation;Lfl0/j;Lnl0/m;Ljava/lang/String;Ljava/util/List;Lhl0/d;Ltg0/h;ZZLtg0/e;Lc91/b;ZZZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ltg0/b;

    move-result-object v2

    iput-object v2, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    :cond_10
    :goto_7
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
