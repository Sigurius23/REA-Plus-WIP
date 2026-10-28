.class final Lug0/b$r0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lug0/b;->i0(Lec3/m;Ltg0/b;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lwg0/h;",
        "interpolationResult",
        "Ll83/a0;",
        "<anonymous>",
        "(Lwg0/h;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner$pollIfNeeded$4"
    f = "AiChatConversationCombiner.kt"
    l = {
        0x3bf,
        0x3ca
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

.field final synthetic F:Lcom/whoop/ai/chat/models/AIConversation;

.field final synthetic G:Lug0/b;

.field final synthetic H:Lkotlin/jvm/internal/b0;

.field final synthetic I:Ljava/lang/String;

.field final synthetic J:Ljava/lang/String;

.field final synthetic K:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/g0;Lcom/whoop/ai/chat/models/AIConversation;Lug0/b;Lkotlin/jvm/internal/b0;Ljava/lang/String;Ljava/lang/String;Lec3/m;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/g0;",
            "Lcom/whoop/ai/chat/models/AIConversation;",
            "Lug0/b;",
            "Lkotlin/jvm/internal/b0;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Lug0/b$r0;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lug0/b$r0;->E:Lkotlin/jvm/internal/g0;

    iput-object p2, p0, Lug0/b$r0;->F:Lcom/whoop/ai/chat/models/AIConversation;

    iput-object p3, p0, Lug0/b$r0;->G:Lug0/b;

    iput-object p4, p0, Lug0/b$r0;->H:Lkotlin/jvm/internal/b0;

    iput-object p5, p0, Lug0/b$r0;->I:Ljava/lang/String;

    iput-object p6, p0, Lug0/b$r0;->J:Ljava/lang/String;

    iput-object p7, p0, Lug0/b$r0;->K:Lec3/m;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 9
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

    new-instance v0, Lug0/b$r0;

    iget-object v1, p0, Lug0/b$r0;->E:Lkotlin/jvm/internal/g0;

    iget-object v2, p0, Lug0/b$r0;->F:Lcom/whoop/ai/chat/models/AIConversation;

    iget-object v3, p0, Lug0/b$r0;->G:Lug0/b;

    iget-object v4, p0, Lug0/b$r0;->H:Lkotlin/jvm/internal/b0;

    iget-object v5, p0, Lug0/b$r0;->I:Ljava/lang/String;

    iget-object v6, p0, Lug0/b$r0;->J:Ljava/lang/String;

    iget-object v7, p0, Lug0/b$r0;->K:Lec3/m;

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lug0/b$r0;-><init>(Lkotlin/jvm/internal/g0;Lcom/whoop/ai/chat/models/AIConversation;Lug0/b;Lkotlin/jvm/internal/b0;Ljava/lang/String;Ljava/lang/String;Lec3/m;Lq83/d;)V

    iput-object p1, v0, Lug0/b$r0;->z:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Lwg0/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwg0/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lug0/b$r0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lug0/b$r0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lug0/b$r0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lwg0/h;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lug0/b$r0;->f(Lwg0/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    move-object/from16 v0, p0

    iget-object v1, v0, Lug0/b$r0;->z:Ljava/lang/Object;

    check-cast v1, Lwg0/h;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lug0/b$r0;->y:I

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v3, :cond_2

    if-eq v3, v6, :cond_1

    if-ne v3, v4, :cond_0

    iget-object v1, v0, Lug0/b$r0;->x:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/ai/chat/models/AIConversation;

    iget-object v1, v0, Lug0/b$r0;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/ai/chat/models/AIConversation;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object v3, v0, Lug0/b$r0;->x:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/ai/chat/models/AIConversation;

    iget-object v7, v0, Lug0/b$r0;->w:Ljava/lang/Object;

    check-cast v7, Lcom/whoop/ai/chat/models/AIConversation;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v0, Lug0/b$r0;->E:Lkotlin/jvm/internal/g0;

    iget-object v3, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v3, Ltg0/b;

    invoke-virtual {v3}, Ltg0/b;->e()Lcom/whoop/ai/chat/models/AIConversation;

    move-result-object v3

    if-nez v3, :cond_3

    iget-object v3, v0, Lug0/b$r0;->F:Lcom/whoop/ai/chat/models/AIConversation;

    :cond_3
    iget-object v7, v0, Lug0/b$r0;->G:Lug0/b;

    invoke-virtual {v1}, Lwg0/h;->a()Lcom/whoop/ai/chat/models/AITurn;

    move-result-object v8

    invoke-static {v7, v3, v8}, Lug0/b;->F(Lug0/b;Lcom/whoop/ai/chat/models/AIConversation;Lcom/whoop/ai/chat/models/AITurn;)Lcom/whoop/ai/chat/models/AIConversation;

    move-result-object v3

    iget-object v7, v0, Lug0/b$r0;->H:Lkotlin/jvm/internal/b0;

    iget-boolean v7, v7, Lkotlin/jvm/internal/b0;->w:Z

    if-nez v7, :cond_4

    invoke-virtual {v1}, Lwg0/h;->a()Lcom/whoop/ai/chat/models/AITurn;

    move-result-object v7

    invoke-static {v7}, Lxg0/b;->b(Lcom/whoop/ai/chat/models/AITurn;)Z

    move-result v7

    if-eqz v7, :cond_4

    iget-object v7, v0, Lug0/b$r0;->H:Lkotlin/jvm/internal/b0;

    iput-boolean v6, v7, Lkotlin/jvm/internal/b0;->w:Z

    iget-object v7, v0, Lug0/b$r0;->G:Lug0/b;

    invoke-static {v7}, Lug0/b;->l(Lug0/b;)Lvg0/i0;

    move-result-object v7

    iget-object v8, v0, Lug0/b$r0;->I:Ljava/lang/String;

    iget-object v9, v0, Lug0/b$r0;->J:Ljava/lang/String;

    iput-object v1, v0, Lug0/b$r0;->z:Ljava/lang/Object;

    iput-object v5, v0, Lug0/b$r0;->w:Ljava/lang/Object;

    iput-object v3, v0, Lug0/b$r0;->x:Ljava/lang/Object;

    iput v6, v0, Lug0/b$r0;->y:I

    invoke-virtual {v7, v8, v9, v0}, Lvg0/i0;->d(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v2, :cond_4

    goto :goto_3

    :cond_4
    :goto_0
    move-object v8, v3

    iget-object v3, v0, Lug0/b$r0;->E:Lkotlin/jvm/internal/g0;

    iget-object v7, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v7, Ltg0/b;

    sget-object v9, Lfl0/j;->SUCCESS:Lfl0/j;

    sget-object v10, Lnl0/m;->NONE:Lnl0/m;

    invoke-virtual {v1}, Lwg0/h;->b()Z

    move-result v11

    if-eqz v11, :cond_5

    invoke-virtual {v1}, Lwg0/h;->a()Lcom/whoop/ai/chat/models/AITurn;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/ai/chat/models/AITurn;->getTurnStatus()Lcom/whoop/bot/models/conversation/AiMessageStatus;

    move-result-object v1

    sget-object v11, Lcom/whoop/bot/models/conversation/AiMessageStatus;->ACTIVE:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    if-ne v1, v11, :cond_5

    :goto_1
    move/from16 v16, v6

    goto :goto_2

    :cond_5
    const/4 v6, 0x0

    goto :goto_1

    :goto_2
    const v24, 0xfef0

    const/16 v25, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v7 .. v25}, Ltg0/b;->b(Ltg0/b;Lcom/whoop/ai/chat/models/AIConversation;Lfl0/j;Lnl0/m;Ljava/lang/String;Ljava/util/List;Lhl0/d;Ltg0/h;ZZLtg0/e;Lc91/b;ZZZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ltg0/b;

    move-result-object v1

    iput-object v1, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object v1, v0, Lug0/b$r0;->K:Lec3/m;

    iget-object v3, v0, Lug0/b$r0;->E:Lkotlin/jvm/internal/g0;

    iget-object v3, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iput-object v5, v0, Lug0/b$r0;->z:Ljava/lang/Object;

    iput-object v5, v0, Lug0/b$r0;->w:Ljava/lang/Object;

    iput-object v5, v0, Lug0/b$r0;->x:Ljava/lang/Object;

    iput v4, v0, Lug0/b$r0;->y:I

    invoke-interface {v1, v3, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_6

    :goto_3
    return-object v2

    :cond_6
    :goto_4
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
