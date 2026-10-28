.class final Lvg0/b1$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvg0/b1;->s(Lvg0/o0;Z)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvg0/b1$b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Lcom/whoop/ai/chat/models/AITurn;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.ai.chat.domain.interactors.TurnPollingInteractor$pollTurnEndpoint$1"
    f = "TurnPollingInteractor.kt"
    l = {
        0x3b,
        0x3f,
        0x47,
        0x58,
        0x5f
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field private synthetic F:Ljava/lang/Object;

.field final synthetic G:Z

.field final synthetic H:Lvg0/b1;

.field final synthetic I:Lvg0/o0;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field z:I


# direct methods
.method public constructor <init>(ZLvg0/b1;Lvg0/o0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lvg0/b1;",
            "Lvg0/o0;",
            "Lq83/d<",
            "-",
            "Lvg0/b1$b;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lvg0/b1$b;->G:Z

    iput-object p2, p0, Lvg0/b1$b;->H:Lvg0/b1;

    iput-object p3, p0, Lvg0/b1$b;->I:Lvg0/o0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Lvg0/b1$b;

    iget-boolean v1, p0, Lvg0/b1$b;->G:Z

    iget-object v2, p0, Lvg0/b1$b;->H:Lvg0/b1;

    iget-object v3, p0, Lvg0/b1$b;->I:Lvg0/o0;

    invoke-direct {v0, v1, v2, v3, p2}, Lvg0/b1$b;-><init>(ZLvg0/b1;Lvg0/o0;Lq83/d;)V

    iput-object p1, v0, Lvg0/b1$b;->F:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lvg0/b1$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvg0/b1$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvg0/b1$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvg0/b1$b;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v5, p0

    iget-object v0, v5, Lvg0/b1$b;->F:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v1, v5, Lvg0/b1$b;->E:I

    const/4 v9, 0x5

    const/4 v10, 0x4

    const/4 v11, 0x3

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/4 v14, 0x1

    const/4 v15, 0x0

    if-eqz v1, :cond_5

    if-eq v1, v14, :cond_4

    if-eq v1, v12, :cond_3

    if-eq v1, v11, :cond_2

    if-eq v1, v10, :cond_1

    if-ne v1, v9, :cond_0

    iget v1, v5, Lvg0/b1$b;->z:I

    iget-object v2, v5, Lvg0/b1$b;->w:Ljava/lang/Object;

    check-cast v2, Lu02/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move v2, v9

    move v3, v10

    goto/16 :goto_c

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget v1, v5, Lvg0/b1$b;->z:I

    iget-object v2, v5, Lvg0/b1$b;->x:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/ai/chat/models/AITurn;

    iget-object v2, v5, Lvg0/b1$b;->w:Ljava/lang/Object;

    check-cast v2, Lu02/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move v3, v10

    :goto_0
    move v2, v1

    goto/16 :goto_a

    :cond_2
    iget v1, v5, Lvg0/b1$b;->z:I

    iget-object v2, v5, Lvg0/b1$b;->x:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/ai/chat/models/AITurn;

    iget-object v3, v5, Lvg0/b1$b;->w:Ljava/lang/Object;

    check-cast v3, Lu02/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_3
    iget v1, v5, Lvg0/b1$b;->z:I

    iget v2, v5, Lvg0/b1$b;->y:I

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, v0

    move-object/from16 v0, p1

    goto/16 :goto_6

    :cond_4
    iget v1, v5, Lvg0/b1$b;->y:I

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_5
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean v1, v5, Lvg0/b1$b;->G:Z

    move v2, v1

    move v1, v14

    :goto_1
    if-eqz v1, :cond_1a

    if-nez v2, :cond_e

    iget-object v3, v5, Lvg0/b1$b;->H:Lvg0/b1;

    invoke-static {v3}, Lvg0/b1;->e(Lvg0/b1;)Ljs0/c;

    move-result-object v3

    sget-object v4, Lcom/whoop/data/repositories/AiPollingDelay;->INSTANCE:Lcom/whoop/data/repositories/AiPollingDelay;

    invoke-virtual {v3}, Ljs0/c;->getConfigurations()Ljs0/b;

    move-result-object v3

    invoke-virtual {v4}, Ljs0/a;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v4

    sget-object v7, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v9, Ljava/lang/Long;

    invoke-virtual {v7, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v7, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    invoke-virtual {v3, v6}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_6

    invoke-static {v3}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    goto/16 :goto_2

    :cond_6
    move-object v3, v15

    goto/16 :goto_2

    :cond_7
    sget-object v10, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {v7, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-virtual {v3, v6}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_6

    invoke-static {v3}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v3

    goto :goto_2

    :cond_8
    sget-object v10, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-virtual {v7, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_9

    invoke-virtual {v3, v6}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_6

    invoke-static {v3}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v3

    goto :goto_2

    :cond_9
    sget-object v10, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-virtual {v7, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    invoke-virtual {v3, v6}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_6

    invoke-static {v3}, Lyb3/x;->x(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v3

    goto :goto_2

    :cond_a
    sget-object v10, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {v7, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_b

    invoke-virtual {v3, v6}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_6

    invoke-static {v3}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v3

    goto :goto_2

    :cond_b
    const-class v10, Ljava/lang/String;

    invoke-virtual {v7, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v9, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_c

    invoke-virtual {v3, v6}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_2

    :cond_c
    move-object v3, v4

    :goto_2
    if-nez v3, :cond_d

    goto :goto_3

    :cond_d
    move-object v4, v3

    :goto_3
    if-eqz v4, :cond_f

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    iput-object v0, v5, Lvg0/b1$b;->F:Ljava/lang/Object;

    iput-object v15, v5, Lvg0/b1$b;->w:Ljava/lang/Object;

    iput-object v15, v5, Lvg0/b1$b;->x:Ljava/lang/Object;

    iput v1, v5, Lvg0/b1$b;->y:I

    iput v2, v5, Lvg0/b1$b;->z:I

    iput v14, v5, Lvg0/b1$b;->E:I

    invoke-static {v3, v4, v5}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v8, :cond_e

    goto/16 :goto_b

    :cond_e
    :goto_4
    move-object v9, v0

    move v10, v1

    goto :goto_5

    :cond_f
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type kotlin.Long"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_5
    sget-object v0, Lu02/a;->a:Lu02/a$a;

    iget-object v1, v5, Lvg0/b1$b;->H:Lvg0/b1;

    invoke-static {v1}, Lvg0/b1;->f(Lvg0/b1;)Ltr2/n;

    move-result-object v1

    new-instance v4, Lvg0/b1$b$b;

    iget-object v2, v5, Lvg0/b1$b;->H:Lvg0/b1;

    iget-object v3, v5, Lvg0/b1$b;->I:Lvg0/o0;

    invoke-direct {v4, v2, v3, v15}, Lvg0/b1$b$b;-><init>(Lvg0/b1;Lvg0/o0;Lq83/d;)V

    iput-object v9, v5, Lvg0/b1$b;->F:Ljava/lang/Object;

    iput-object v15, v5, Lvg0/b1$b;->w:Ljava/lang/Object;

    iput-object v15, v5, Lvg0/b1$b;->x:Ljava/lang/Object;

    iput v10, v5, Lvg0/b1$b;->y:I

    iput v13, v5, Lvg0/b1$b;->z:I

    iput v12, v5, Lvg0/b1$b;->E:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_10

    goto/16 :goto_b

    :cond_10
    move v2, v10

    move v1, v13

    :goto_6
    check-cast v0, Lu02/a;

    instance-of v3, v0, Lu02/a$c;

    if-eqz v3, :cond_17

    check-cast v0, Lu02/a$c;

    invoke-virtual {v0}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpg3/v0;

    iget-object v0, v0, Lpg3/v0;->b:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/ai/chat/models/AITurn;

    if-eqz v0, :cond_15

    iget-object v3, v5, Lvg0/b1$b;->H:Lvg0/b1;

    iget-object v4, v5, Lvg0/b1$b;->I:Lvg0/o0;

    invoke-virtual {v4}, Lvg0/o0;->b()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4, v0}, Lvg0/b1;->j(Lvg0/b1;Ljava/lang/String;Lcom/whoop/ai/chat/models/AITurn;)V

    iput-object v9, v5, Lvg0/b1$b;->F:Ljava/lang/Object;

    iput-object v15, v5, Lvg0/b1$b;->w:Ljava/lang/Object;

    iput-object v0, v5, Lvg0/b1$b;->x:Ljava/lang/Object;

    iput v2, v5, Lvg0/b1$b;->y:I

    iput v1, v5, Lvg0/b1$b;->z:I

    iput v11, v5, Lvg0/b1$b;->E:I

    invoke-interface {v9, v0, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v8, :cond_11

    goto/16 :goto_b

    :cond_11
    move-object v2, v0

    move-object v0, v9

    :goto_7
    invoke-virtual {v2}, Lcom/whoop/ai/chat/models/AITurn;->getTurnStatus()Lcom/whoop/bot/models/conversation/AiMessageStatus;

    move-result-object v2

    sget-object v3, Lvg0/b1$b$a;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    if-eq v2, v14, :cond_14

    if-eq v2, v12, :cond_13

    if-eq v2, v11, :cond_13

    const/4 v3, 0x4

    if-eq v2, v3, :cond_13

    const/4 v3, 0x5

    if-ne v2, v3, :cond_12

    goto :goto_8

    :cond_12
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_13
    :goto_8
    iget-object v2, v5, Lvg0/b1$b;->H:Lvg0/b1;

    iget-object v3, v5, Lvg0/b1$b;->I:Lvg0/o0;

    invoke-virtual {v3}, Lvg0/o0;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lvg0/b1;->g(Lvg0/b1;Ljava/lang/String;)V

    move v2, v1

    move v1, v13

    :goto_9
    const/4 v9, 0x5

    const/4 v10, 0x4

    goto/16 :goto_1

    :cond_14
    iget-object v2, v5, Lvg0/b1$b;->H:Lvg0/b1;

    iget-object v3, v5, Lvg0/b1$b;->I:Lvg0/o0;

    invoke-virtual {v3}, Lvg0/o0;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lvg0/b1;->h(Lvg0/b1;Ljava/lang/String;)V

    move v2, v1

    move v1, v14

    goto :goto_9

    :cond_15
    iget-object v0, v5, Lvg0/b1$b;->H:Lvg0/b1;

    iget-object v3, v5, Lvg0/b1$b;->I:Lvg0/o0;

    invoke-virtual {v3}, Lvg0/o0;->b()Ljava/lang/String;

    move-result-object v3

    const-string v4, "Poll response body is null"

    invoke-static {v0, v3, v4}, Lvg0/b1;->i(Lvg0/b1;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v5, Lvg0/b1$b;->H:Lvg0/b1;

    iget-object v3, v5, Lvg0/b1$b;->I:Lvg0/o0;

    invoke-virtual {v3}, Lvg0/o0;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lvg0/b1;->c(Lvg0/b1;Ljava/lang/String;)Lcom/whoop/ai/chat/models/AITurn;

    move-result-object v0

    iput-object v9, v5, Lvg0/b1$b;->F:Ljava/lang/Object;

    iput-object v15, v5, Lvg0/b1$b;->w:Ljava/lang/Object;

    iput-object v15, v5, Lvg0/b1$b;->x:Ljava/lang/Object;

    iput v2, v5, Lvg0/b1$b;->y:I

    iput v1, v5, Lvg0/b1$b;->z:I

    const/4 v3, 0x4

    iput v3, v5, Lvg0/b1$b;->E:I

    invoke-interface {v9, v0, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_16

    goto :goto_b

    :cond_16
    move-object v0, v9

    goto/16 :goto_0

    :goto_a
    move v10, v3

    move v1, v13

    const/4 v9, 0x5

    goto/16 :goto_1

    :cond_17
    const/4 v3, 0x4

    instance-of v4, v0, Lu02/a$b;

    if-eqz v4, :cond_19

    iget-object v4, v5, Lvg0/b1$b;->H:Lvg0/b1;

    iget-object v6, v5, Lvg0/b1$b;->I:Lvg0/o0;

    invoke-virtual {v6}, Lvg0/o0;->b()Ljava/lang/String;

    move-result-object v6

    check-cast v0, Lu02/a$b;

    invoke-virtual {v0}, Lu02/a$b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v6, v0}, Lvg0/b1;->i(Lvg0/b1;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v5, Lvg0/b1$b;->H:Lvg0/b1;

    iget-object v4, v5, Lvg0/b1$b;->I:Lvg0/o0;

    invoke-virtual {v4}, Lvg0/o0;->b()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lvg0/b1;->c(Lvg0/b1;Ljava/lang/String;)Lcom/whoop/ai/chat/models/AITurn;

    move-result-object v0

    iput-object v9, v5, Lvg0/b1$b;->F:Ljava/lang/Object;

    iput-object v15, v5, Lvg0/b1$b;->w:Ljava/lang/Object;

    iput v2, v5, Lvg0/b1$b;->y:I

    iput v1, v5, Lvg0/b1$b;->z:I

    const/4 v2, 0x5

    iput v2, v5, Lvg0/b1$b;->E:I

    invoke-interface {v9, v0, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_18

    :goto_b
    return-object v8

    :cond_18
    move-object v0, v9

    :goto_c
    move v9, v2

    move v10, v3

    move v2, v1

    move v1, v13

    goto/16 :goto_1

    :cond_19
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1a
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
