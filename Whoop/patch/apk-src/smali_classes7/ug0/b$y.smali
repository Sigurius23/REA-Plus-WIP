.class final Lug0/b$y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lug0/b;->Y(Lec3/m;Ltg0/b;Lq83/d;)Ljava/lang/Object;
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
.field final synthetic w:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field

.field final synthetic x:Ltg0/b;

.field final synthetic y:Lcom/whoop/ai/chat/models/AIConversation;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/g0;Ltg0/b;Lcom/whoop/ai/chat/models/AIConversation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/g0;",
            "Ltg0/b;",
            "Lcom/whoop/ai/chat/models/AIConversation;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lug0/b$y;->w:Lkotlin/jvm/internal/g0;

    iput-object p2, p0, Lug0/b$y;->x:Ltg0/b;

    iput-object p3, p0, Lug0/b$y;->y:Lcom/whoop/ai/chat/models/AIConversation;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lvg0/w;Lq83/d;)Ljava/lang/Object;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvg0/w;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lug0/b$y;->w:Lkotlin/jvm/internal/g0;

    sget-object v3, Lvg0/w$b;->a:Lvg0/w$b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v4, v0, Lug0/b$y;->x:Ltg0/b;

    const v21, 0xefff

    const/16 v22, 0x0

    const/4 v5, 0x0

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

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v4 .. v22}, Ltg0/b;->b(Ltg0/b;Lcom/whoop/ai/chat/models/AIConversation;Lfl0/j;Lnl0/m;Ljava/lang/String;Ljava/util/List;Lhl0/d;Ltg0/h;ZZLtg0/e;Lc91/b;ZZZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ltg0/b;

    move-result-object v1

    goto :goto_0

    :cond_0
    instance-of v3, v1, Lvg0/w$c;

    if-eqz v3, :cond_1

    iget-object v4, v0, Lug0/b$y;->x:Ltg0/b;

    iget-object v5, v0, Lug0/b$y;->y:Lcom/whoop/ai/chat/models/AIConversation;

    invoke-virtual {v5}, Lcom/whoop/ai/chat/models/AIConversation;->getMetadata()Lcom/whoop/ai/chat/models/AIConversationMetadata;

    move-result-object v6

    check-cast v1, Lvg0/w$c;

    invoke-virtual {v1}, Lvg0/w$c;->a()Lcom/whoop/ai/chat/models/AIConversationMetadata;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/ai/chat/models/AIConversationMetadata;->getScrollToTurnId()Ljava/lang/String;

    move-result-object v14

    const/16 v15, 0x7f

    const/16 v16, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v6 .. v16}, Lcom/whoop/ai/chat/models/AIConversationMetadata;->copy$default(Lcom/whoop/ai/chat/models/AIConversationMetadata;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/ai/chat/models/AIConversationMetadata;

    move-result-object v6

    const/16 v11, 0x1e

    invoke-static/range {v5 .. v12}, Lcom/whoop/ai/chat/models/AIConversation;->copy$default(Lcom/whoop/ai/chat/models/AIConversation;Lcom/whoop/ai/chat/models/AIConversationMetadata;Ljava/util/List;Lcom/whoop/ai/chat/models/CoachVersionTag;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/ai/chat/models/AIConversation;

    move-result-object v5

    const v21, 0xeffe

    const/16 v22, 0x0

    const/4 v6, 0x0

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

    goto :goto_0

    :cond_1
    instance-of v1, v1, Lvg0/w$a;

    if-eqz v1, :cond_2

    iget-object v3, v0, Lug0/b$y;->x:Ltg0/b;

    const v20, 0xefff

    const/16 v21, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

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

    move-result-object v1

    :goto_0
    iput-object v1, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_2
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lvg0/w;

    invoke-virtual {p0, p1, p2}, Lug0/b$y;->b(Lvg0/w;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
