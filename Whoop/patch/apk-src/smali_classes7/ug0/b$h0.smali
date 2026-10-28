.class final Lug0/b$h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lug0/b;->d0(Lec3/m;Ltg0/b;Ltg0/a$p;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic w:Lug0/b;

.field final synthetic x:Lcom/whoop/ai/chat/models/AIConversation;

.field final synthetic y:Ltg0/b;

.field final synthetic z:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lug0/b;Lcom/whoop/ai/chat/models/AIConversation;Ltg0/b;Lec3/m;Lkotlin/jvm/internal/g0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lug0/b;",
            "Lcom/whoop/ai/chat/models/AIConversation;",
            "Ltg0/b;",
            "Lec3/m;",
            "Lkotlin/jvm/internal/g0;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lug0/b$h0;->w:Lug0/b;

    iput-object p2, p0, Lug0/b$h0;->x:Lcom/whoop/ai/chat/models/AIConversation;

    iput-object p3, p0, Lug0/b$h0;->y:Ltg0/b;

    iput-object p4, p0, Lug0/b$h0;->z:Lec3/m;

    iput-object p5, p0, Lug0/b$h0;->E:Lkotlin/jvm/internal/g0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lvg0/a1;Lq83/d;)Ljava/lang/Object;
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvg0/a1;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lug0/b$h0$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lug0/b$h0$a;

    iget v3, v2, Lug0/b$h0$a;->F:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lug0/b$h0$a;->F:I

    goto :goto_0

    :cond_0
    new-instance v2, Lug0/b$h0$a;

    invoke-direct {v2, v0, v1}, Lug0/b$h0$a;-><init>(Lug0/b$h0;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lug0/b$h0$a;->z:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lug0/b$h0$a;->F:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lug0/b$h0$a;->y:Ljava/lang/Object;

    check-cast v3, Ltg0/b;

    iget-object v4, v2, Lug0/b$h0$a;->x:Ljava/lang/Object;

    check-cast v4, Lcom/whoop/ai/chat/models/AIConversation;

    iget-object v2, v2, Lug0/b$h0$a;->w:Ljava/lang/Object;

    check-cast v2, Lvg0/a1;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lug0/b$h0;->w:Lug0/b;

    iget-object v4, v0, Lug0/b$h0;->x:Lcom/whoop/ai/chat/models/AIConversation;

    invoke-virtual/range {p1 .. p1}, Lvg0/a1;->e()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lvg0/a1;->c()Lcom/whoop/ai/chat/models/TurnFeedbackResponse;

    move-result-object v7

    invoke-static {v1, v4, v6, v7}, Lug0/b;->G(Lug0/b;Lcom/whoop/ai/chat/models/AIConversation;Ljava/lang/String;Lcom/whoop/ai/chat/models/TurnFeedbackResponse;)Lcom/whoop/ai/chat/models/AIConversation;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lvg0/a1;->d()Lhl0/d;

    move-result-object v14

    iget-object v8, v0, Lug0/b$h0;->y:Ltg0/b;

    const v25, 0xffd6

    const/16 v26, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

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

    invoke-static/range {v8 .. v26}, Ltg0/b;->b(Ltg0/b;Lcom/whoop/ai/chat/models/AIConversation;Lfl0/j;Lnl0/m;Ljava/lang/String;Ljava/util/List;Lhl0/d;Ltg0/h;ZZLtg0/e;Lc91/b;ZZZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ltg0/b;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lvg0/a1;->d()Lhl0/d;

    move-result-object v4

    if-eqz v4, :cond_4

    iget-object v4, v0, Lug0/b$h0;->z:Lec3/m;

    const/4 v6, 0x0

    iput-object v6, v2, Lug0/b$h0$a;->w:Ljava/lang/Object;

    iput-object v6, v2, Lug0/b$h0$a;->x:Ljava/lang/Object;

    iput-object v1, v2, Lug0/b$h0$a;->y:Ljava/lang/Object;

    iput v5, v2, Lug0/b$h0$a;->F:I

    invoke-interface {v4, v1, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_3

    return-object v3

    :cond_3
    move-object v3, v1

    :goto_1
    move-object v1, v3

    :cond_4
    iget-object v2, v0, Lug0/b$h0;->E:Lkotlin/jvm/internal/g0;

    iput-object v1, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lvg0/a1;

    invoke-virtual {p0, p1, p2}, Lug0/b$h0;->b(Lvg0/a1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
