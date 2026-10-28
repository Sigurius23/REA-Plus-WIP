.class final Lug0/b$n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lug0/b;->T(Lec3/m;Ltg0/b;Ltg0/a$d;Lq83/d;)Ljava/lang/Object;
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
.field final synthetic E:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field

.field final synthetic F:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field

.field final synthetic w:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field

.field final synthetic x:Lcom/whoop/ai/chat/models/AIConversation;

.field final synthetic y:Lug0/b;

.field final synthetic z:Ltg0/a$d;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/g0;Lcom/whoop/ai/chat/models/AIConversation;Lug0/b;Ltg0/a$d;Lkotlin/jvm/internal/g0;Lec3/m;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/g0;",
            "Lcom/whoop/ai/chat/models/AIConversation;",
            "Lug0/b;",
            "Ltg0/a$d;",
            "Lkotlin/jvm/internal/g0;",
            "Lec3/m;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lug0/b$n;->w:Lkotlin/jvm/internal/g0;

    iput-object p2, p0, Lug0/b$n;->x:Lcom/whoop/ai/chat/models/AIConversation;

    iput-object p3, p0, Lug0/b$n;->y:Lug0/b;

    iput-object p4, p0, Lug0/b$n;->z:Ltg0/a$d;

    iput-object p5, p0, Lug0/b$n;->E:Lkotlin/jvm/internal/g0;

    iput-object p6, p0, Lug0/b$n;->F:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lvg0/t;Lq83/d;)Ljava/lang/Object;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvg0/t;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lug0/b$n;->w:Lkotlin/jvm/internal/g0;

    instance-of v3, v1, Lvg0/t$c;

    sget-object v9, Lm83/y;->w:Lm83/y;

    if-eqz v3, :cond_a

    iget-object v3, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v3, Ltg0/b;

    invoke-virtual {v3}, Ltg0/b;->e()Lcom/whoop/ai/chat/models/AIConversation;

    move-result-object v3

    if-nez v3, :cond_0

    iget-object v3, v0, Lug0/b$n;->x:Lcom/whoop/ai/chat/models/AIConversation;

    :cond_0
    iget-object v4, v0, Lug0/b$n;->y:Lug0/b;

    check-cast v1, Lvg0/t$c;

    invoke-virtual {v1}, Lvg0/t$c;->a()Lcom/whoop/ai/chat/models/AITurn;

    move-result-object v5

    invoke-static {v4, v3, v5}, Lug0/b;->c(Lug0/b;Lcom/whoop/ai/chat/models/AIConversation;Lcom/whoop/ai/chat/models/AITurn;)Lcom/whoop/ai/chat/models/AIConversation;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/ai/chat/models/AIConversation;->getMetadata()Lcom/whoop/ai/chat/models/AIConversationMetadata;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/ai/chat/models/AIConversationMetadata;->getFingerprint()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lvg0/t$c;->a()Lcom/whoop/ai/chat/models/AITurn;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/ai/chat/models/AITurn;->getMessages()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Lcom/whoop/ai/chat/models/AIMessage;

    invoke-static {v7}, Lxg0/a;->c(Lcom/whoop/ai/chat/models/AIMessage;)Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_0

    :cond_2
    move-object v5, v6

    :goto_0
    check-cast v5, Lcom/whoop/ai/chat/models/AIMessage;

    if-eqz v5, :cond_4

    invoke-virtual {v5}, Lcom/whoop/ai/chat/models/AIMessage;->getId()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    :goto_1
    move-object v13, v4

    goto :goto_3

    :cond_4
    :goto_2
    invoke-virtual {v1}, Lvg0/t$c;->a()Lcom/whoop/ai/chat/models/AITurn;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/ai/chat/models/AITurn;->getId()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :goto_3
    invoke-virtual {v3}, Lcom/whoop/ai/chat/models/AIConversation;->getTurns()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v4, 0x0

    move v12, v4

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/ai/chat/models/AITurn;

    invoke-virtual {v5}, Lcom/whoop/ai/chat/models/AITurn;->getMessages()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    instance-of v7, v5, Ljava/util/Collection;

    if-eqz v7, :cond_5

    move-object v7, v5

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_5

    move v7, v4

    goto :goto_6

    :cond_5
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v7, v4

    :cond_6
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/ai/chat/models/AIMessage;

    invoke-static {v8}, Lxg0/a;->c(Lcom/whoop/ai/chat/models/AIMessage;)Z

    move-result v8

    if-eqz v8, :cond_6

    add-int/lit8 v7, v7, 0x1

    if-ltz v7, :cond_7

    goto :goto_5

    :cond_7
    invoke-static {}, Lwb3/f;->c0()V

    throw v6

    :cond_8
    :goto_6
    add-int/2addr v12, v7

    goto :goto_4

    :cond_9
    iget-object v1, v0, Lug0/b$n;->y:Lug0/b;

    invoke-static {v1, v3}, Lug0/b;->E(Lug0/b;Lcom/whoop/ai/chat/models/AIConversation;)Lcom/whoop/ai/chat/models/AIConversation;

    move-result-object v5

    iget-object v1, v0, Lug0/b$n;->y:Lug0/b;

    invoke-static {v1}, Lug0/b;->i(Lug0/b;)Lrg0/b;

    move-result-object v1

    new-instance v10, Lrg0/a$v;

    iget-object v3, v0, Lug0/b$n;->z:Ltg0/a$d;

    invoke-virtual {v3}, Ltg0/a$d;->d()Z

    move-result v15

    const/4 v14, 0x0

    invoke-direct/range {v10 .. v15}, Lrg0/a$v;-><init>(Ljava/lang/String;ILjava/lang/String;ZZ)V

    invoke-virtual {v1, v10}, Lrg0/b;->a(Lrg0/a;)V

    iget-object v1, v0, Lug0/b$n;->w:Lkotlin/jvm/internal/g0;

    iget-object v1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Ltg0/b;

    sget-object v6, Lfl0/j;->LOADING:Lfl0/j;

    sget-object v7, Lnl0/m;->NONE:Lnl0/m;

    const v21, 0xffe0

    const/16 v22, 0x0

    const/4 v8, 0x0

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

    const/16 v20, 0x0

    invoke-static/range {v4 .. v22}, Ltg0/b;->b(Ltg0/b;Lcom/whoop/ai/chat/models/AIConversation;Lfl0/j;Lnl0/m;Ljava/lang/String;Ljava/util/List;Lhl0/d;Ltg0/h;ZZLtg0/e;Lc91/b;ZZZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ltg0/b;

    move-result-object v1

    goto/16 :goto_a

    :cond_a
    sget-object v3, Lvg0/t$b;->a:Lvg0/t$b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    iget-object v1, v0, Lug0/b$n;->w:Lkotlin/jvm/internal/g0;

    iget-object v1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Ltg0/b;

    sget-object v6, Lfl0/j;->LOADING:Lfl0/j;

    sget-object v7, Lnl0/m;->NONE:Lnl0/m;

    const v21, 0xffa1

    const/16 v22, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

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

    const/16 v20, 0x0

    invoke-static/range {v4 .. v22}, Ltg0/b;->b(Ltg0/b;Lcom/whoop/ai/chat/models/AIConversation;Lfl0/j;Lnl0/m;Ljava/lang/String;Ljava/util/List;Lhl0/d;Ltg0/h;ZZLtg0/e;Lc91/b;ZZZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ltg0/b;

    move-result-object v1

    goto/16 :goto_a

    :cond_b
    instance-of v3, v1, Lvg0/t$d;

    if-eqz v3, :cond_d

    iget-object v3, v0, Lug0/b$n;->E:Lkotlin/jvm/internal/g0;

    check-cast v1, Lvg0/t$d;

    invoke-virtual {v1}, Lvg0/t$d;->a()Lcom/whoop/ai/chat/models/AITurn;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/ai/chat/models/AITurn;->getId()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object v3, v0, Lug0/b$n;->w:Lkotlin/jvm/internal/g0;

    iget-object v3, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v3, Ltg0/b;

    invoke-virtual {v3}, Ltg0/b;->e()Lcom/whoop/ai/chat/models/AIConversation;

    move-result-object v3

    if-nez v3, :cond_c

    iget-object v3, v0, Lug0/b$n;->x:Lcom/whoop/ai/chat/models/AIConversation;

    :cond_c
    iget-object v4, v0, Lug0/b$n;->y:Lug0/b;

    invoke-virtual {v1}, Lvg0/t$d;->a()Lcom/whoop/ai/chat/models/AITurn;

    move-result-object v1

    invoke-static {v4, v3, v1}, Lug0/b;->F(Lug0/b;Lcom/whoop/ai/chat/models/AIConversation;Lcom/whoop/ai/chat/models/AITurn;)Lcom/whoop/ai/chat/models/AIConversation;

    move-result-object v5

    iget-object v1, v0, Lug0/b$n;->w:Lkotlin/jvm/internal/g0;

    iget-object v1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Ltg0/b;

    sget-object v6, Lfl0/j;->SUCCESS:Lfl0/j;

    sget-object v7, Lnl0/m;->NONE:Lnl0/m;

    const v21, 0xffa0

    const/16 v22, 0x0

    const/4 v8, 0x0

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

    const/16 v20, 0x0

    invoke-static/range {v4 .. v22}, Ltg0/b;->b(Ltg0/b;Lcom/whoop/ai/chat/models/AIConversation;Lfl0/j;Lnl0/m;Ljava/lang/String;Ljava/util/List;Lhl0/d;Ltg0/h;ZZLtg0/e;Lc91/b;ZZZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ltg0/b;

    move-result-object v1

    goto/16 :goto_a

    :cond_d
    instance-of v3, v1, Lvg0/t$a;

    if-eqz v3, :cond_11

    iget-object v3, v0, Lug0/b$n;->w:Lkotlin/jvm/internal/g0;

    iget-object v3, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v3, Ltg0/b;

    invoke-virtual {v3}, Ltg0/b;->e()Lcom/whoop/ai/chat/models/AIConversation;

    move-result-object v3

    if-eqz v3, :cond_f

    invoke-virtual {v3}, Lcom/whoop/ai/chat/models/AIConversation;->getMetadata()Lcom/whoop/ai/chat/models/AIConversationMetadata;

    move-result-object v3

    if-eqz v3, :cond_f

    invoke-virtual {v3}, Lcom/whoop/ai/chat/models/AIConversationMetadata;->getFingerprint()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_e

    goto :goto_8

    :cond_e
    :goto_7
    move-object v11, v3

    goto :goto_9

    :cond_f
    :goto_8
    const-string v3, ""

    goto :goto_7

    :goto_9
    iget-object v3, v0, Lug0/b$n;->y:Lug0/b;

    invoke-static {v3}, Lug0/b;->i(Lug0/b;)Lrg0/b;

    move-result-object v3

    new-instance v4, Lrg0/a$i;

    const/4 v5, 0x1

    invoke-direct {v4, v11, v5}, Lrg0/a$i;-><init>(Ljava/lang/String;Z)V

    invoke-virtual {v3, v4}, Lrg0/b;->a(Lrg0/a;)V

    iget-object v3, v0, Lug0/b$n;->y:Lug0/b;

    invoke-static {v3}, Lug0/b;->i(Lug0/b;)Lrg0/b;

    move-result-object v3

    new-instance v10, Lrg0/a$x;

    check-cast v1, Lvg0/t$a;

    invoke-virtual {v1}, Lvg0/t$a;->a()Ljava/lang/String;

    move-result-object v14

    const/16 v17, 0x30

    const/16 v18, 0x0

    const-string v12, "user"

    const-string v13, "text"

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v10 .. v18}, Lrg0/a$x;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3, v10}, Lrg0/b;->a(Lrg0/a;)V

    iget-object v3, v0, Lug0/b$n;->w:Lkotlin/jvm/internal/g0;

    iget-object v3, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v4, v3

    check-cast v4, Ltg0/b;

    sget-object v6, Lfl0/j;->ERROR:Lfl0/j;

    sget-object v7, Lnl0/m;->NONE:Lnl0/m;

    invoke-virtual {v1}, Lvg0/t$a;->a()Ljava/lang/String;

    move-result-object v8

    new-instance v11, Ltg0/h;

    iget-object v3, v0, Lug0/b$n;->z:Ltg0/a$d;

    new-instance v5, Lfl0/l;

    const-string v10, "text"

    invoke-virtual {v1}, Lvg0/t$a;->a()Ljava/lang/String;

    move-result-object v1

    const-string v12, "user"

    invoke-direct {v5, v12, v10, v1}, Lfl0/l;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v11, v3, v5}, Ltg0/h;-><init>(Ltg0/a;Lfl0/l;)V

    const v21, 0xffa1

    const/16 v22, 0x0

    const/4 v5, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v4 .. v22}, Ltg0/b;->b(Ltg0/b;Lcom/whoop/ai/chat/models/AIConversation;Lfl0/j;Lnl0/m;Ljava/lang/String;Ljava/util/List;Lhl0/d;Ltg0/h;ZZLtg0/e;Lc91/b;ZZZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ltg0/b;

    move-result-object v1

    :goto_a
    iput-object v1, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object v1, v0, Lug0/b$n;->F:Lec3/m;

    iget-object v2, v0, Lug0/b$n;->w:Lkotlin/jvm/internal/g0;

    iget-object v2, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object/from16 v3, p2

    invoke-interface {v1, v2, v3}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lr83/a;->w:Lr83/a;

    if-ne v1, v2, :cond_10

    return-object v1

    :cond_10
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_11
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lvg0/t;

    invoke-virtual {p0, p1, p2}, Lug0/b$n;->b(Lvg0/t;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
