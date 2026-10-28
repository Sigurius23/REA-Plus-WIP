.class final Lug0/b$c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lug0/b;->a0(Ltg0/b;Lcom/whoop/ai/chat/models/AIConversation;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lcom/whoop/ai/chat/models/AIConversation;

.field final synthetic x:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field

.field final synthetic y:Ltg0/b;


# direct methods
.method public constructor <init>(Lcom/whoop/ai/chat/models/AIConversation;Lkotlin/jvm/internal/g0;Ltg0/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/ai/chat/models/AIConversation;",
            "Lkotlin/jvm/internal/g0;",
            "Ltg0/b;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lug0/b$c0;->w:Lcom/whoop/ai/chat/models/AIConversation;

    iput-object p2, p0, Lug0/b$c0;->x:Lkotlin/jvm/internal/g0;

    iput-object p3, p0, Lug0/b$c0;->y:Ltg0/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lvg0/u0;Lq83/d;)Ljava/lang/Object;
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvg0/u0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lug0/b$c0;->w:Lcom/whoop/ai/chat/models/AIConversation;

    invoke-virtual {v2}, Lcom/whoop/ai/chat/models/AIConversation;->getTurns()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/whoop/ai/chat/models/AITurn;

    invoke-virtual {v6}, Lcom/whoop/ai/chat/models/AITurn;->getTurnStatus()Lcom/whoop/bot/models/conversation/AiMessageStatus;

    move-result-object v5

    sget-object v7, Lcom/whoop/bot/models/conversation/AiMessageStatus;->ACTIVE:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    if-ne v5, v7, :cond_0

    sget-object v8, Lcom/whoop/bot/models/conversation/AiMessageStatus;->STOPPED:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    const/16 v13, 0x3d

    const/4 v14, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v6 .. v14}, Lcom/whoop/ai/chat/models/AITurn;->copy$default(Lcom/whoop/ai/chat/models/AITurn;Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiMessageStatus;Ljava/util/List;Lcom/whoop/ai/chat/models/TurnFeedbackResponse;Ljava/lang/Boolean;ZILjava/lang/Object;)Lcom/whoop/ai/chat/models/AITurn;

    move-result-object v6

    :cond_0
    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const/16 v8, 0x1d

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Lcom/whoop/ai/chat/models/AIConversation;->copy$default(Lcom/whoop/ai/chat/models/AIConversation;Lcom/whoop/ai/chat/models/AIConversationMetadata;Ljava/util/List;Lcom/whoop/ai/chat/models/CoachVersionTag;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/ai/chat/models/AIConversation;

    move-result-object v11

    iget-object v2, v0, Lug0/b$c0;->x:Lkotlin/jvm/internal/g0;

    sget-object v3, Lvg0/u0$b;->a:Lvg0/u0$b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v1, v0, Lug0/b$c0;->y:Ltg0/b;

    goto :goto_1

    :cond_2
    instance-of v3, v1, Lvg0/u0$c;

    if-eqz v3, :cond_3

    iget-object v10, v0, Lug0/b$c0;->y:Ltg0/b;

    sget-object v13, Lnl0/m;->NONE:Lnl0/m;

    const v27, 0xffb2

    const/16 v28, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-static/range {v10 .. v28}, Ltg0/b;->b(Ltg0/b;Lcom/whoop/ai/chat/models/AIConversation;Lfl0/j;Lnl0/m;Ljava/lang/String;Ljava/util/List;Lhl0/d;Ltg0/h;ZZLtg0/e;Lc91/b;ZZZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ltg0/b;

    move-result-object v1

    goto :goto_1

    :cond_3
    instance-of v1, v1, Lvg0/u0$a;

    if-eqz v1, :cond_4

    iget-object v10, v0, Lug0/b$c0;->y:Ltg0/b;

    sget-object v13, Lnl0/m;->NONE:Lnl0/m;

    const v27, 0xffb2

    const/16 v28, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-static/range {v10 .. v28}, Ltg0/b;->b(Ltg0/b;Lcom/whoop/ai/chat/models/AIConversation;Lfl0/j;Lnl0/m;Ljava/lang/String;Ljava/util/List;Lhl0/d;Ltg0/h;ZZLtg0/e;Lc91/b;ZZZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ltg0/b;

    move-result-object v1

    :goto_1
    iput-object v1, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_4
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lvg0/u0;

    invoke-virtual {p0, p1, p2}, Lug0/b$c0;->b(Lvg0/u0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
