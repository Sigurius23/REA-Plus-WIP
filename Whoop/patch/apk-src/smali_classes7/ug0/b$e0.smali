.class final Lug0/b$e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lug0/b;->b0(Ltg0/b;Lcom/whoop/ai/chat/models/AIConversation;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic y:Lug0/b;

.field final synthetic z:Lcom/whoop/ai/chat/models/AIConversation;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/g0;Ltg0/b;Lug0/b;Lcom/whoop/ai/chat/models/AIConversation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/g0;",
            "Ltg0/b;",
            "Lug0/b;",
            "Lcom/whoop/ai/chat/models/AIConversation;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lug0/b$e0;->w:Lkotlin/jvm/internal/g0;

    iput-object p2, p0, Lug0/b$e0;->x:Ltg0/b;

    iput-object p3, p0, Lug0/b$e0;->y:Lug0/b;

    iput-object p4, p0, Lug0/b$e0;->z:Lcom/whoop/ai/chat/models/AIConversation;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lvg0/x0;Lq83/d;)Ljava/lang/Object;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvg0/x0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lug0/b$e0;->w:Lkotlin/jvm/internal/g0;

    sget-object v3, Lvg0/x0$b;->a:Lvg0/x0$b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v7, Lnl0/m;->MESSAGE_LOADING:Lnl0/m;

    iget-object v4, v0, Lug0/b$e0;->x:Ltg0/b;

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

    goto :goto_0

    :cond_0
    instance-of v3, v1, Lvg0/x0$c;

    if-eqz v3, :cond_1

    iget-object v3, v0, Lug0/b$e0;->y:Lug0/b;

    iget-object v4, v0, Lug0/b$e0;->z:Lcom/whoop/ai/chat/models/AIConversation;

    check-cast v1, Lvg0/x0$c;

    invoke-virtual {v1}, Lvg0/x0$c;->a()Lcom/whoop/ai/chat/models/AITurn;

    move-result-object v1

    invoke-static {v3, v4, v1}, Lug0/b;->c(Lug0/b;Lcom/whoop/ai/chat/models/AIConversation;Lcom/whoop/ai/chat/models/AITurn;)Lcom/whoop/ai/chat/models/AIConversation;

    move-result-object v6

    iget-object v5, v0, Lug0/b$e0;->x:Ltg0/b;

    sget-object v8, Lnl0/m;->NONE:Lnl0/m;

    const v22, 0xffb2

    const/16 v23, 0x0

    const/4 v7, 0x0

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

    const/16 v21, 0x0

    invoke-static/range {v5 .. v23}, Ltg0/b;->b(Ltg0/b;Lcom/whoop/ai/chat/models/AIConversation;Lfl0/j;Lnl0/m;Ljava/lang/String;Ljava/util/List;Lhl0/d;Ltg0/h;ZZLtg0/e;Lc91/b;ZZZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ltg0/b;

    move-result-object v1

    goto :goto_0

    :cond_1
    instance-of v3, v1, Lvg0/x0$a;

    if-eqz v3, :cond_2

    iget-object v4, v0, Lug0/b$e0;->x:Ltg0/b;

    sget-object v7, Lnl0/m;->MESSAGE_ERROR:Lnl0/m;

    check-cast v1, Lvg0/x0$a;

    invoke-virtual {v1}, Lvg0/x0$a;->a()Ljava/lang/String;

    move-result-object v8

    const v21, 0xfff3

    const/16 v22, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

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

    check-cast p1, Lvg0/x0;

    invoke-virtual {p0, p1, p2}, Lug0/b$e0;->b(Lvg0/x0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
