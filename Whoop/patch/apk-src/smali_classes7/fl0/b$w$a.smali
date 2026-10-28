.class public final Lfl0/b$w$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfl0/b$w;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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
.field final synthetic E:Ljava/util/List;

.field final synthetic F:Z

.field final synthetic G:Ljava/lang/String;

.field final synthetic w:Lec3/m;

.field final synthetic x:Lfl0/b;

.field final synthetic y:Z

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lec3/m;Lfl0/b;ZLjava/lang/String;Ljava/util/List;ZLjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lfl0/b$w$a;->w:Lec3/m;

    iput-object p2, p0, Lfl0/b$w$a;->x:Lfl0/b;

    iput-boolean p3, p0, Lfl0/b$w$a;->y:Z

    iput-object p4, p0, Lfl0/b$w$a;->z:Ljava/lang/String;

    iput-object p5, p0, Lfl0/b$w$a;->E:Ljava/util/List;

    iput-boolean p6, p0, Lfl0/b$w$a;->F:Z

    iput-object p7, p0, Lfl0/b$w$a;->G:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lfl0/b$w$a$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lfl0/b$w$a$a;

    iget v3, v2, Lfl0/b$w$a$a;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lfl0/b$w$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Lfl0/b$w$a$a;

    invoke-direct {v2, v0, v1}, Lfl0/b$w$a$a;-><init>(Lfl0/b$w$a;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lfl0/b$w$a$a;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lfl0/b$w$a$a;->x:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lfl0/b$w$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v2, v2, Lfl0/b$w$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lfl0/b$w$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lfl0/b$w$a;->w:Lec3/m;

    move-object/from16 v4, p1

    check-cast v4, Lpm0/a;

    instance-of v6, v4, Lpm0/a$a$a;

    const/4 v7, 0x0

    if-eqz v6, :cond_5

    check-cast v4, Lpm0/a$a$a;

    invoke-virtual {v4}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/bot/models/conversation/AiChatMessage;

    invoke-virtual {v6}, Lcom/whoop/bot/models/conversation/AiChatMessage;->getMessageStatus()Lcom/whoop/bot/models/conversation/AiMessageStatus;

    move-result-object v6

    sget-object v8, Lcom/whoop/bot/models/conversation/AiMessageStatus;->FLAGGED:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    if-ne v6, v8, :cond_3

    move v6, v5

    goto :goto_1

    :cond_3
    move v6, v7

    :goto_1
    iget-object v8, v0, Lfl0/b$w$a;->x:Lfl0/b;

    invoke-static {v8}, Lfl0/b;->l(Lfl0/b;)Lxk0/a;

    move-result-object v8

    iget-object v9, v0, Lfl0/b$w$a;->x:Lfl0/b;

    invoke-static {v9}, Lfl0/b;->o(Lfl0/b;)Lec3/p1;

    move-result-object v9

    check-cast v9, Lec3/h2;

    invoke-virtual {v9}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/whoop/bot/models/conversation/AiChatConversation;

    invoke-virtual {v9}, Lcom/whoop/bot/models/conversation/AiChatConversation;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/whoop/bot/models/conversation/AiChatMessage;

    invoke-virtual {v10}, Lcom/whoop/bot/models/conversation/AiChatMessage;->getId()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v9, v10}, Lxk0/a;->t(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v11, Lfl0/c;

    iget-object v8, v0, Lfl0/b$w$a;->x:Lfl0/b;

    invoke-virtual {v4}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/bot/models/conversation/AiChatMessage;

    invoke-static {v8, v4}, Lfl0/b;->e(Lfl0/b;Lcom/whoop/bot/models/conversation/AiChatMessage;)Lcom/whoop/bot/models/conversation/AiChatConversation;

    move-result-object v12

    if-eqz v6, :cond_4

    sget-object v4, Lfl0/j;->FLAGGED:Lfl0/j;

    :goto_2
    move-object v13, v4

    goto :goto_3

    :cond_4
    sget-object v4, Lfl0/j;->SUCCESS:Lfl0/j;

    goto :goto_2

    :goto_3
    const/16 v18, 0x3c

    const/16 v19, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v11 .. v19}, Lfl0/c;-><init>(Lcom/whoop/bot/models/conversation/AiChatConversation;Lfl0/j;Lnl0/m;Lfl0/k;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_6

    :cond_5
    instance-of v6, v4, Lpm0/a$a$b;

    if-nez v6, :cond_c

    instance-of v6, v4, Lpm0/a$e;

    if-eqz v6, :cond_6

    goto/16 :goto_5

    :cond_6
    instance-of v6, v4, Lpm0/a$b;

    if-eqz v6, :cond_b

    sget-object v6, Lxk0/c;->a:Lxk0/c;

    check-cast v4, Lpm0/a$b;

    invoke-virtual {v6, v4}, Lxk0/c;->b(Lpm0/a$b;)Lxk0/d;

    move-result-object v6

    invoke-virtual {v6}, Lxk0/d;->a()Ljava/lang/String;

    move-result-object v6

    iget-object v8, v0, Lfl0/b$w$a;->x:Lfl0/b;

    invoke-static {v8}, Lfl0/b;->l(Lfl0/b;)Lxk0/a;

    move-result-object v8

    const-string v9, "send_message"

    invoke-virtual {v8, v4, v9}, Lxk0/a;->K(Lpm0/a$b;Ljava/lang/String;)V

    iget-object v4, v0, Lfl0/b$w$a;->x:Lfl0/b;

    invoke-static {v4}, Lfl0/b;->l(Lfl0/b;)Lxk0/a;

    move-result-object v4

    iget-object v8, v0, Lfl0/b$w$a;->x:Lfl0/b;

    invoke-static {v8}, Lfl0/b;->o(Lfl0/b;)Lec3/p1;

    move-result-object v8

    check-cast v8, Lec3/h2;

    invoke-virtual {v8}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/bot/models/conversation/AiChatConversation;

    invoke-virtual {v8}, Lcom/whoop/bot/models/conversation/AiChatConversation;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8, v5}, Lxk0/a;->h(Ljava/lang/String;Z)V

    iget-boolean v4, v0, Lfl0/b$w$a;->y:Z

    if-eqz v4, :cond_7

    iget-object v4, v0, Lfl0/b$w$a;->x:Lfl0/b;

    invoke-static {v4}, Lfl0/b;->l(Lfl0/b;)Lxk0/a;

    move-result-object v4

    invoke-virtual {v4, v6}, Lxk0/a;->N(Ljava/lang/String;)V

    :cond_7
    new-instance v8, Lfl0/c;

    iget-object v4, v0, Lfl0/b$w$a;->x:Lfl0/b;

    invoke-static {v4}, Lfl0/b;->o(Lfl0/b;)Lec3/p1;

    move-result-object v4

    check-cast v4, Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v9, v4

    check-cast v9, Lcom/whoop/bot/models/conversation/AiChatConversation;

    sget-object v10, Lfl0/j;->ERROR:Lfl0/j;

    iget-object v4, v0, Lfl0/b$w$a;->x:Lfl0/b;

    invoke-static {v4}, Lfl0/b;->o(Lfl0/b;)Lec3/p1;

    move-result-object v4

    check-cast v4, Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/bot/models/conversation/AiChatConversation;

    invoke-virtual {v4}, Lcom/whoop/bot/models/conversation/AiChatConversation;->getId()Ljava/lang/String;

    move-result-object v14

    new-instance v4, Lfl0/l;

    sget-object v11, Lnl0/b;->USER:Lnl0/b;

    invoke-virtual {v11}, Lnl0/b;->getValue()Ljava/lang/String;

    move-result-object v11

    iget-object v12, v0, Lfl0/b$w$a;->z:Ljava/lang/String;

    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v12

    if-lez v12, :cond_8

    iget-object v12, v0, Lfl0/b$w$a;->E:Ljava/util/List;

    if-eqz v12, :cond_8

    check-cast v12, Ljava/util/Collection;

    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    move-result v12

    xor-int/2addr v12, v5

    if-ne v12, v5, :cond_8

    const-string v12, "text_and_image"

    goto :goto_4

    :cond_8
    iget-object v12, v0, Lfl0/b$w$a;->E:Ljava/util/List;

    if-eqz v12, :cond_9

    check-cast v12, Ljava/util/Collection;

    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    move-result v12

    xor-int/2addr v12, v5

    if-ne v12, v5, :cond_9

    const-string v12, "image"

    goto :goto_4

    :cond_9
    iget-boolean v12, v0, Lfl0/b$w$a;->y:Z

    if-eqz v12, :cond_a

    const-string v12, "push_to_talk"

    goto :goto_4

    :cond_a
    const-string v12, "text"

    :goto_4
    invoke-direct {v4, v11, v12, v6}, Lfl0/l;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v11, Lfl0/k$e;

    iget-object v12, v0, Lfl0/b$w$a;->z:Ljava/lang/String;

    iget-boolean v13, v0, Lfl0/b$w$a;->F:Z

    iget-object v15, v0, Lfl0/b$w$a;->G:Ljava/lang/String;

    move-object/from16 v16, v4

    invoke-direct/range {v11 .. v16}, Lfl0/k$e;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lfl0/l;)V

    const/16 v15, 0x34

    const/16 v16, 0x0

    move-object v12, v11

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v8 .. v16}, Lfl0/c;-><init>(Lcom/whoop/bot/models/conversation/AiChatConversation;Lfl0/j;Lnl0/m;Lfl0/k;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v11, v8

    goto :goto_6

    :cond_b
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_c
    :goto_5
    iget-object v4, v0, Lfl0/b$w$a;->x:Lfl0/b;

    invoke-static {v4}, Lfl0/b;->o(Lfl0/b;)Lec3/p1;

    move-result-object v4

    :cond_d
    move-object v6, v4

    check-cast v6, Lec3/h2;

    invoke-virtual {v6}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lcom/whoop/bot/models/conversation/AiChatConversation;

    const/16 v17, 0x7b

    const/16 v18, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    sget-object v12, Lm83/y;->w:Lm83/y;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v9 .. v18}, Lcom/whoop/bot/models/conversation/AiChatConversation;->copy$default(Lcom/whoop/bot/models/conversation/AiChatConversation;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/bot/models/conversation/BetaTagModel;ILjava/lang/Object;)Lcom/whoop/bot/models/conversation/AiChatConversation;

    move-result-object v9

    invoke-virtual {v6, v8, v9}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_d

    sget-object v21, Lfl0/j;->LOADING:Lfl0/j;

    new-instance v19, Lfl0/c;

    const/16 v24, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x3c

    const/16 v27, 0x0

    move-object/from16 v20, v9

    invoke-direct/range {v19 .. v27}, Lfl0/c;-><init>(Lcom/whoop/bot/models/conversation/AiChatConversation;Lfl0/j;Lnl0/m;Lfl0/k;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v11, v19

    :goto_6
    const/4 v4, 0x0

    iput-object v4, v2, Lfl0/b$w$a$a;->y:Ljava/lang/Object;

    iput-object v4, v2, Lfl0/b$w$a$a;->E:Ljava/lang/Object;

    iput-object v4, v2, Lfl0/b$w$a$a;->F:Ljava/lang/Object;

    iput-object v4, v2, Lfl0/b$w$a$a;->G:Ljava/lang/Object;

    iput v7, v2, Lfl0/b$w$a$a;->H:I

    iput v5, v2, Lfl0/b$w$a$a;->x:I

    invoke-interface {v1, v11, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_e

    return-object v3

    :cond_e
    :goto_7
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
