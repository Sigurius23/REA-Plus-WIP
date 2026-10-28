.class public final Lfl0/b$q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfl0/b$q;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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
.field final synthetic E:Ljava/lang/String;

.field final synthetic F:Ljava/lang/String;

.field final synthetic G:Z

.field final synthetic H:Z

.field final synthetic I:Z

.field final synthetic w:Lec3/m;

.field final synthetic x:Lfl0/b;

.field final synthetic y:Ljava/lang/String;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lec3/m;Lfl0/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V
    .locals 0

    iput-object p1, p0, Lfl0/b$q$a;->w:Lec3/m;

    iput-object p2, p0, Lfl0/b$q$a;->x:Lfl0/b;

    iput-object p3, p0, Lfl0/b$q$a;->y:Ljava/lang/String;

    iput-object p4, p0, Lfl0/b$q$a;->z:Ljava/lang/String;

    iput-object p5, p0, Lfl0/b$q$a;->E:Ljava/lang/String;

    iput-object p6, p0, Lfl0/b$q$a;->F:Ljava/lang/String;

    iput-boolean p7, p0, Lfl0/b$q$a;->G:Z

    iput-boolean p8, p0, Lfl0/b$q$a;->H:Z

    iput-boolean p9, p0, Lfl0/b$q$a;->I:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lfl0/b$q$a$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lfl0/b$q$a$a;

    iget v3, v2, Lfl0/b$q$a$a;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lfl0/b$q$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Lfl0/b$q$a$a;

    invoke-direct {v2, v0, v1}, Lfl0/b$q$a$a;-><init>(Lfl0/b$q$a;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lfl0/b$q$a$a;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lfl0/b$q$a$a;->x:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lfl0/b$q$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v2, v2, Lfl0/b$q$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lfl0/b$q$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lfl0/b$q$a;->w:Lec3/m;

    move-object/from16 v4, p1

    check-cast v4, Lpm0/a;

    instance-of v6, v4, Lpm0/a$a$a;

    if-eqz v6, :cond_5

    iget-object v6, v0, Lfl0/b$q$a;->x:Lfl0/b;

    invoke-static {v6}, Lfl0/b;->o(Lfl0/b;)Lec3/p1;

    move-result-object v6

    :cond_3
    move-object v7, v6

    check-cast v7, Lec3/h2;

    invoke-virtual {v7}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lcom/whoop/bot/models/conversation/AiChatConversation;

    move-object v9, v4

    check-cast v9, Lpm0/a$a$a;

    invoke-virtual {v9}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v10

    move-object v12, v10

    check-cast v12, Lcom/whoop/bot/models/conversation/AiChatConversation;

    invoke-virtual {v7, v8, v12}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    sget-object v13, Lfl0/j;->SUCCESS:Lfl0/j;

    invoke-virtual {v9}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/bot/models/conversation/AiChatConversation;

    invoke-virtual {v4}, Lcom/whoop/bot/models/conversation/AiChatConversation;->getMessages()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_4

    new-instance v14, Lfl0/k$b;

    iget-object v15, v0, Lfl0/b$q$a;->y:Ljava/lang/String;

    iget-object v4, v0, Lfl0/b$q$a;->z:Ljava/lang/String;

    iget-object v6, v0, Lfl0/b$q$a;->E:Ljava/lang/String;

    iget-object v7, v0, Lfl0/b$q$a;->F:Ljava/lang/String;

    iget-boolean v8, v0, Lfl0/b$q$a;->G:Z

    iget-boolean v9, v0, Lfl0/b$q$a;->H:Z

    move-object/from16 v16, v4

    move-object/from16 v17, v6

    move-object/from16 v18, v7

    move/from16 v19, v8

    move/from16 v20, v9

    invoke-direct/range {v14 .. v20}, Lfl0/k$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V

    :goto_1
    move-object v15, v14

    goto :goto_2

    :cond_4
    sget-object v14, Lfl0/k$c;->a:Lfl0/k$c;

    goto :goto_1

    :goto_2
    new-instance v11, Lfl0/c;

    iget-boolean v4, v0, Lfl0/b$q$a;->I:Z

    const/16 v18, 0x24

    const/16 v19, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    move/from16 v16, v4

    invoke-direct/range {v11 .. v19}, Lfl0/c;-><init>(Lcom/whoop/bot/models/conversation/AiChatConversation;Lfl0/j;Lnl0/m;Lfl0/k;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_4

    :cond_5
    instance-of v6, v4, Lpm0/a$a$b;

    if-nez v6, :cond_8

    instance-of v6, v4, Lpm0/a$e;

    if-eqz v6, :cond_6

    goto :goto_3

    :cond_6
    instance-of v6, v4, Lpm0/a$b;

    if-eqz v6, :cond_7

    iget-object v6, v0, Lfl0/b$q$a;->x:Lfl0/b;

    invoke-static {v6}, Lfl0/b;->l(Lfl0/b;)Lxk0/a;

    move-result-object v6

    check-cast v4, Lpm0/a$b;

    const-string v7, "start_conversation_v2"

    invoke-virtual {v6, v4, v7}, Lxk0/a;->K(Lpm0/a$b;Ljava/lang/String;)V

    iget-object v4, v0, Lfl0/b$q$a;->x:Lfl0/b;

    invoke-static {v4}, Lfl0/b;->l(Lfl0/b;)Lxk0/a;

    move-result-object v4

    iget-object v6, v0, Lfl0/b$q$a;->x:Lfl0/b;

    invoke-static {v6}, Lfl0/b;->o(Lfl0/b;)Lec3/p1;

    move-result-object v6

    check-cast v6, Lec3/h2;

    invoke-virtual {v6}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/bot/models/conversation/AiChatConversation;

    invoke-virtual {v6}, Lcom/whoop/bot/models/conversation/AiChatConversation;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6, v5}, Lxk0/a;->h(Ljava/lang/String;Z)V

    new-instance v7, Lfl0/c;

    iget-object v4, v0, Lfl0/b$q$a;->x:Lfl0/b;

    invoke-static {v4}, Lfl0/b;->o(Lfl0/b;)Lec3/p1;

    move-result-object v4

    check-cast v4, Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v8, v4

    check-cast v8, Lcom/whoop/bot/models/conversation/AiChatConversation;

    sget-object v9, Lfl0/j;->ERROR:Lfl0/j;

    new-instance v10, Lfl0/k$b;

    iget-object v11, v0, Lfl0/b$q$a;->y:Ljava/lang/String;

    iget-object v12, v0, Lfl0/b$q$a;->z:Ljava/lang/String;

    iget-object v13, v0, Lfl0/b$q$a;->E:Ljava/lang/String;

    iget-object v14, v0, Lfl0/b$q$a;->F:Ljava/lang/String;

    iget-boolean v15, v0, Lfl0/b$q$a;->G:Z

    iget-boolean v4, v0, Lfl0/b$q$a;->H:Z

    move/from16 v16, v4

    invoke-direct/range {v10 .. v16}, Lfl0/k$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V

    iget-boolean v12, v0, Lfl0/b$q$a;->I:Z

    const/16 v14, 0x24

    const/4 v15, 0x0

    move-object v11, v10

    const/4 v10, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v7 .. v15}, Lfl0/c;-><init>(Lcom/whoop/bot/models/conversation/AiChatConversation;Lfl0/j;Lnl0/m;Lfl0/k;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v11, v7

    goto :goto_4

    :cond_7
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_8
    :goto_3
    new-instance v6, Lfl0/c;

    iget-object v4, v0, Lfl0/b$q$a;->x:Lfl0/b;

    invoke-static {v4}, Lfl0/b;->o(Lfl0/b;)Lec3/p1;

    move-result-object v4

    check-cast v4, Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v7, v4

    check-cast v7, Lcom/whoop/bot/models/conversation/AiChatConversation;

    sget-object v8, Lfl0/j;->LOADING:Lfl0/j;

    iget-boolean v11, v0, Lfl0/b$q$a;->I:Z

    const/16 v13, 0x2c

    const/4 v14, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v6 .. v14}, Lfl0/c;-><init>(Lcom/whoop/bot/models/conversation/AiChatConversation;Lfl0/j;Lnl0/m;Lfl0/k;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v11, v6

    :goto_4
    const/4 v4, 0x0

    iput-object v4, v2, Lfl0/b$q$a$a;->y:Ljava/lang/Object;

    iput-object v4, v2, Lfl0/b$q$a$a;->E:Ljava/lang/Object;

    iput-object v4, v2, Lfl0/b$q$a$a;->F:Ljava/lang/Object;

    iput-object v4, v2, Lfl0/b$q$a$a;->G:Ljava/lang/Object;

    const/4 v4, 0x0

    iput v4, v2, Lfl0/b$q$a$a;->H:I

    iput v5, v2, Lfl0/b$q$a$a;->x:I

    invoke-interface {v1, v11, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_9

    return-object v3

    :cond_9
    :goto_5
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
