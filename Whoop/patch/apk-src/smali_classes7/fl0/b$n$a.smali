.class public final Lfl0/b$n$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfl0/b$n;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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
.field final synthetic E:Z

.field final synthetic w:Lec3/m;

.field final synthetic x:Lfl0/b;

.field final synthetic y:Ljava/lang/String;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lec3/m;Lfl0/b;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    iput-object p1, p0, Lfl0/b$n$a;->w:Lec3/m;

    iput-object p2, p0, Lfl0/b$n$a;->x:Lfl0/b;

    iput-object p3, p0, Lfl0/b$n$a;->y:Ljava/lang/String;

    iput-object p4, p0, Lfl0/b$n$a;->z:Ljava/lang/String;

    iput-boolean p5, p0, Lfl0/b$n$a;->E:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lfl0/b$n$a$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lfl0/b$n$a$a;

    iget v3, v2, Lfl0/b$n$a$a;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lfl0/b$n$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Lfl0/b$n$a$a;

    invoke-direct {v2, v0, v1}, Lfl0/b$n$a$a;-><init>(Lfl0/b$n$a;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lfl0/b$n$a$a;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lfl0/b$n$a$a;->x:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lfl0/b$n$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v2, v2, Lfl0/b$n$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lfl0/b$n$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lfl0/b$n$a;->w:Lec3/m;

    move-object/from16 v4, p1

    check-cast v4, Lpm0/a;

    instance-of v6, v4, Lpm0/a$a$a;

    if-eqz v6, :cond_3

    new-instance v7, Lfl0/c;

    iget-object v6, v0, Lfl0/b$n$a;->x:Lfl0/b;

    check-cast v4, Lpm0/a$a$a;

    invoke-virtual {v4}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/bot/models/conversation/AiChatMessage;

    invoke-static {v6, v4}, Lfl0/b;->e(Lfl0/b;Lcom/whoop/bot/models/conversation/AiChatMessage;)Lcom/whoop/bot/models/conversation/AiChatConversation;

    move-result-object v8

    sget-object v9, Lfl0/j;->SUCCESS:Lfl0/j;

    const/16 v14, 0x3c

    const/4 v15, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v7 .. v15}, Lfl0/c;-><init>(Lcom/whoop/bot/models/conversation/AiChatConversation;Lfl0/j;Lnl0/m;Lfl0/k;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_2

    :cond_3
    instance-of v6, v4, Lpm0/a$a$b;

    if-nez v6, :cond_6

    instance-of v6, v4, Lpm0/a$e;

    if-eqz v6, :cond_4

    goto :goto_1

    :cond_4
    instance-of v6, v4, Lpm0/a$b;

    if-eqz v6, :cond_5

    iget-object v6, v0, Lfl0/b$n$a;->x:Lfl0/b;

    invoke-static {v6}, Lfl0/b;->l(Lfl0/b;)Lxk0/a;

    move-result-object v6

    check-cast v4, Lpm0/a$b;

    const-string v7, "start_conversation"

    invoke-virtual {v6, v4, v7}, Lxk0/a;->K(Lpm0/a$b;Ljava/lang/String;)V

    iget-object v4, v0, Lfl0/b$n$a;->x:Lfl0/b;

    invoke-static {v4}, Lfl0/b;->l(Lfl0/b;)Lxk0/a;

    move-result-object v4

    iget-object v6, v0, Lfl0/b$n$a;->x:Lfl0/b;

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

    iget-object v4, v0, Lfl0/b$n$a;->x:Lfl0/b;

    invoke-static {v4}, Lfl0/b;->o(Lfl0/b;)Lec3/p1;

    move-result-object v4

    check-cast v4, Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v8, v4

    check-cast v8, Lcom/whoop/bot/models/conversation/AiChatConversation;

    sget-object v9, Lfl0/j;->ERROR:Lfl0/j;

    new-instance v10, Lfl0/k$b;

    iget-object v11, v0, Lfl0/b$n$a;->y:Ljava/lang/String;

    iget-object v12, v0, Lfl0/b$n$a;->z:Ljava/lang/String;

    iget-boolean v4, v0, Lfl0/b$n$a;->E:Z

    const/16 v17, 0x1c

    const/16 v18, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move/from16 v16, v4

    invoke-direct/range {v10 .. v18}, Lfl0/k$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v14, 0x34

    const/4 v15, 0x0

    move-object v11, v10

    const/4 v10, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v7 .. v15}, Lfl0/c;-><init>(Lcom/whoop/bot/models/conversation/AiChatConversation;Lfl0/j;Lnl0/m;Lfl0/k;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_5
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_6
    :goto_1
    new-instance v6, Lfl0/c;

    iget-object v4, v0, Lfl0/b$n$a;->x:Lfl0/b;

    invoke-static {v4}, Lfl0/b;->o(Lfl0/b;)Lec3/p1;

    move-result-object v4

    check-cast v4, Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v7, v4

    check-cast v7, Lcom/whoop/bot/models/conversation/AiChatConversation;

    sget-object v8, Lfl0/j;->LOADING:Lfl0/j;

    const/16 v13, 0x3c

    const/4 v14, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v6 .. v14}, Lfl0/c;-><init>(Lcom/whoop/bot/models/conversation/AiChatConversation;Lfl0/j;Lnl0/m;Lfl0/k;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v7, v6

    :goto_2
    const/4 v4, 0x0

    iput-object v4, v2, Lfl0/b$n$a$a;->y:Ljava/lang/Object;

    iput-object v4, v2, Lfl0/b$n$a$a;->E:Ljava/lang/Object;

    iput-object v4, v2, Lfl0/b$n$a$a;->F:Ljava/lang/Object;

    iput-object v4, v2, Lfl0/b$n$a$a;->G:Ljava/lang/Object;

    const/4 v4, 0x0

    iput v4, v2, Lfl0/b$n$a$a;->H:I

    iput v5, v2, Lfl0/b$n$a$a;->x:I

    invoke-interface {v1, v7, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_7

    return-object v3

    :cond_7
    :goto_3
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
