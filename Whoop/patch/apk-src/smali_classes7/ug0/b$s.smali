.class final Lug0/b$s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lug0/b;->V(Lec3/m;Ltg0/b;Ltg0/a$f;Lq83/d;)Ljava/lang/Object;
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
.field final synthetic E:Ltg0/a$f;

.field final synthetic w:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field

.field final synthetic x:Ltg0/b;

.field final synthetic y:Lug0/b;

.field final synthetic z:Lcom/whoop/ai/chat/models/AIConversation;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/g0;Ltg0/b;Lug0/b;Lcom/whoop/ai/chat/models/AIConversation;Ltg0/a$f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/g0;",
            "Ltg0/b;",
            "Lug0/b;",
            "Lcom/whoop/ai/chat/models/AIConversation;",
            "Ltg0/a$f;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lug0/b$s;->w:Lkotlin/jvm/internal/g0;

    iput-object p2, p0, Lug0/b$s;->x:Ltg0/b;

    iput-object p3, p0, Lug0/b$s;->y:Lug0/b;

    iput-object p4, p0, Lug0/b$s;->z:Lcom/whoop/ai/chat/models/AIConversation;

    iput-object p5, p0, Lug0/b$s;->E:Ltg0/a$f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lvg0/z;Lq83/d;)Ljava/lang/Object;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvg0/z;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lug0/b$s;->w:Lkotlin/jvm/internal/g0;

    sget-object v3, Lvg0/z$b;->a:Lvg0/z$b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v7, Lnl0/m;->MESSAGE_LOADING:Lnl0/m;

    iget-object v4, v0, Lug0/b$s;->x:Ltg0/b;

    const v21, 0xffb3

    const/16 v22, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

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

    const/16 v20, 0x0

    invoke-static/range {v4 .. v22}, Ltg0/b;->b(Ltg0/b;Lcom/whoop/ai/chat/models/AIConversation;Lfl0/j;Lnl0/m;Ljava/lang/String;Ljava/util/List;Lhl0/d;Ltg0/h;ZZLtg0/e;Lc91/b;ZZZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ltg0/b;

    move-result-object v1

    goto/16 :goto_2

    :cond_0
    instance-of v3, v1, Lvg0/z$c;

    if-eqz v3, :cond_5

    iget-object v3, v0, Lug0/b$s;->y:Lug0/b;

    iget-object v4, v0, Lug0/b$s;->z:Lcom/whoop/ai/chat/models/AIConversation;

    check-cast v1, Lvg0/z$c;

    invoke-virtual {v1}, Lvg0/z$c;->a()Lcom/whoop/ai/chat/models/AITurn;

    move-result-object v5

    invoke-static {v3, v4, v5}, Lug0/b;->c(Lug0/b;Lcom/whoop/ai/chat/models/AIConversation;Lcom/whoop/ai/chat/models/AITurn;)Lcom/whoop/ai/chat/models/AIConversation;

    move-result-object v7

    invoke-virtual {v1}, Lvg0/z$c;->a()Lcom/whoop/ai/chat/models/AITurn;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/ai/chat/models/AITurn;->getTurnStatus()Lcom/whoop/bot/models/conversation/AiMessageStatus;

    move-result-object v3

    sget-object v4, Lcom/whoop/bot/models/conversation/AiMessageStatus;->COMPLETE:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    if-ne v3, v4, :cond_4

    invoke-virtual {v7}, Lcom/whoop/ai/chat/models/AIConversation;->getMetadata()Lcom/whoop/ai/chat/models/AIConversationMetadata;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/ai/chat/models/AIConversationMetadata;->getFingerprint()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lvg0/z$c;->a()Lcom/whoop/ai/chat/models/AITurn;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/ai/chat/models/AITurn;->getMessages()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/whoop/ai/chat/models/AIMessage;

    invoke-virtual {v6}, Lcom/whoop/ai/chat/models/AIMessage;->getRole()Ljava/lang/String;

    move-result-object v6

    sget-object v8, Lnl0/b;->ASSISTANT:Lnl0/b;

    invoke-virtual {v8}, Lnl0/b;->getValue()Ljava/lang/String;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_0

    :cond_2
    const/4 v5, 0x0

    :goto_0
    check-cast v5, Lcom/whoop/ai/chat/models/AIMessage;

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Lcom/whoop/ai/chat/models/AIMessage;->getId()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v1}, Lvg0/z$c;->a()Lcom/whoop/ai/chat/models/AITurn;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/ai/chat/models/AITurn;->getId()Ljava/lang/String;

    move-result-object v4

    :goto_1
    iget-object v1, v0, Lug0/b$s;->y:Lug0/b;

    invoke-static {v1}, Lug0/b;->i(Lug0/b;)Lrg0/b;

    move-result-object v1

    new-instance v5, Lrg0/a$b;

    invoke-direct {v5, v3, v4}, Lrg0/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Lrg0/b;->a(Lrg0/a;)V

    :cond_4
    iget-object v6, v0, Lug0/b$s;->x:Ltg0/b;

    sget-object v9, Lnl0/m;->NONE:Lnl0/m;

    const v23, 0xffb2

    const/16 v24, 0x0

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

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v6 .. v24}, Ltg0/b;->b(Ltg0/b;Lcom/whoop/ai/chat/models/AIConversation;Lfl0/j;Lnl0/m;Ljava/lang/String;Ljava/util/List;Lhl0/d;Ltg0/h;ZZLtg0/e;Lc91/b;ZZZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ltg0/b;

    move-result-object v1

    goto :goto_2

    :cond_5
    instance-of v3, v1, Lvg0/z$a;

    if-eqz v3, :cond_6

    iget-object v3, v0, Lug0/b$s;->x:Ltg0/b;

    invoke-virtual {v3}, Ltg0/b;->e()Lcom/whoop/ai/chat/models/AIConversation;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/ai/chat/models/AIConversation;->getMetadata()Lcom/whoop/ai/chat/models/AIConversationMetadata;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/ai/chat/models/AIConversationMetadata;->getFingerprint()Ljava/lang/String;

    move-result-object v5

    iget-object v3, v0, Lug0/b$s;->y:Lug0/b;

    invoke-static {v3}, Lug0/b;->i(Lug0/b;)Lrg0/b;

    move-result-object v3

    new-instance v4, Lrg0/a$i;

    const/4 v6, 0x1

    invoke-direct {v4, v5, v6}, Lrg0/a$i;-><init>(Ljava/lang/String;Z)V

    invoke-virtual {v3, v4}, Lrg0/b;->a(Lrg0/a;)V

    iget-object v3, v0, Lug0/b$s;->y:Lug0/b;

    invoke-static {v3}, Lug0/b;->i(Lug0/b;)Lrg0/b;

    move-result-object v3

    new-instance v4, Lrg0/a$x;

    check-cast v1, Lvg0/z$a;

    invoke-virtual {v1}, Lvg0/z$a;->a()Ljava/lang/String;

    move-result-object v8

    const/16 v11, 0x30

    const/4 v12, 0x0

    const-string v6, "assistant"

    const-string v7, "text"

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v4 .. v12}, Lrg0/a$x;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3, v4}, Lrg0/b;->a(Lrg0/a;)V

    iget-object v5, v0, Lug0/b$s;->x:Ltg0/b;

    sget-object v8, Lnl0/m;->MESSAGE_ERROR:Lnl0/m;

    invoke-virtual {v1}, Lvg0/z$a;->a()Ljava/lang/String;

    move-result-object v9

    new-instance v12, Ltg0/h;

    iget-object v3, v0, Lug0/b$s;->E:Ltg0/a$f;

    new-instance v4, Lfl0/l;

    const-string v6, "text"

    invoke-virtual {v1}, Lvg0/z$a;->a()Ljava/lang/String;

    move-result-object v1

    const-string v7, "assistant"

    invoke-direct {v4, v7, v6, v1}, Lfl0/l;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v12, v3, v4}, Ltg0/h;-><init>(Ltg0/a;Lfl0/l;)V

    const v22, 0xffb3

    const/16 v23, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v5 .. v23}, Ltg0/b;->b(Ltg0/b;Lcom/whoop/ai/chat/models/AIConversation;Lfl0/j;Lnl0/m;Ljava/lang/String;Ljava/util/List;Lhl0/d;Ltg0/h;ZZLtg0/e;Lc91/b;ZZZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ltg0/b;

    move-result-object v1

    :goto_2
    iput-object v1, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_6
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lvg0/z;

    invoke-virtual {p0, p1, p2}, Lug0/b$s;->b(Lvg0/z;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
