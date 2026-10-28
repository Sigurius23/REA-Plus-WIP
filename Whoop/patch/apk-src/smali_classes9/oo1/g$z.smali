.class final Loo1/g$z;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loo1/g;->B(Ljava/lang/String;)Lec3/l;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Ldc3/u;",
        "Loo1/g$d;",
        "Ll83/a0;",
        "<anonymous>",
        "(Ldc3/u;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor$pollDataFromCache$1"
    f = "MciOverviewInteractor.kt"
    l = {
        0x14d,
        0x155
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:J

.field F:J

.field G:J

.field H:I

.field private synthetic I:Ljava/lang/Object;

.field final synthetic J:Loo1/g;

.field final synthetic K:Ljava/lang/String;

.field w:Ljava/lang/Object;

.field x:I

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Loo1/g;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loo1/g;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Loo1/g$z;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Loo1/g$z;->J:Loo1/g;

    iput-object p2, p0, Loo1/g$z;->K:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance v0, Loo1/g$z;

    iget-object v1, p0, Loo1/g$z;->J:Loo1/g;

    iget-object v2, p0, Loo1/g$z;->K:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p2}, Loo1/g$z;-><init>(Loo1/g;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Loo1/g$z;->I:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ldc3/u;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldc3/u;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Loo1/g$z;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Loo1/g$z;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Loo1/g$z;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Ldc3/u;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Loo1/g$z;->invoke(Ldc3/u;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Loo1/g$z;->I:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Ldc3/u;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Loo1/g$z;->H:I

    const/4 v8, 0x2

    const/4 v9, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v9, :cond_1

    if-ne v2, v8, :cond_0

    iget v2, v0, Loo1/g$z;->y:I

    iget-wide v3, v0, Loo1/g$z;->E:J

    iget v6, v0, Loo1/g$z;->x:I

    iget-object v7, v0, Loo1/g$z;->w:Ljava/lang/Object;

    check-cast v7, Lbc3/k1;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-wide v14, v3

    move v7, v6

    const/4 v11, 0x0

    move v6, v2

    move v2, v8

    goto/16 :goto_8

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget v2, v0, Loo1/g$z;->z:I

    iget-wide v3, v0, Loo1/g$z;->F:J

    iget v6, v0, Loo1/g$z;->y:I

    iget-wide v11, v0, Loo1/g$z;->E:J

    iget v7, v0, Loo1/g$z;->x:I

    iget-object v13, v0, Loo1/g$z;->w:Ljava/lang/Object;

    check-cast v13, Lbc3/k1;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-wide v10, v11

    goto/16 :goto_6

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Loo1/g$z;->J:Loo1/g;

    invoke-static {v2}, Loo1/g;->g(Loo1/g;)Ljs0/c;

    move-result-object v2

    sget-object v3, Lcom/whoop/data/repositories/MCIOverviewPollingMaxRetries;->INSTANCE:Lcom/whoop/data/repositories/MCIOverviewPollingMaxRetries;

    invoke-virtual {v2}, Ljs0/c;->getConfigurations()Ljs0/b;

    move-result-object v2

    invoke-virtual {v3}, Ljs0/a;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v3

    sget-object v6, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v7, Ljava/lang/Integer;

    invoke-virtual {v6, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v6, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v12

    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    const-class v13, Ljava/lang/String;

    sget-object v14, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    sget-object v15, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    sget-object v8, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    sget-object v10, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-eqz v12, :cond_4

    invoke-virtual {v2, v4}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_3

    invoke-static {v2}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    goto/16 :goto_0

    :cond_3
    const/4 v2, 0x0

    goto/16 :goto_0

    :cond_4
    invoke-virtual {v6, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v12

    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_5

    invoke-virtual {v2, v4}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_3

    invoke-static {v2}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    goto :goto_0

    :cond_5
    invoke-virtual {v6, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v12

    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_6

    invoke-virtual {v2, v4}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_3

    invoke-static {v2}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v2

    goto :goto_0

    :cond_6
    invoke-virtual {v6, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v12

    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    invoke-virtual {v2, v4}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_3

    invoke-static {v2}, Lyb3/x;->x(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v2

    goto :goto_0

    :cond_7
    invoke-virtual {v6, v14}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v12

    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    invoke-virtual {v2, v4}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_3

    invoke-static {v2}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v2

    goto :goto_0

    :cond_8
    invoke-virtual {v6, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v12

    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-virtual {v2, v4}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_0

    :cond_9
    move-object v2, v3

    :goto_0
    if-nez v2, :cond_a

    goto :goto_1

    :cond_a
    move-object v3, v2

    :goto_1
    if-eqz v3, :cond_19

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-static {v9, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget-object v3, v0, Loo1/g$z;->J:Loo1/g;

    invoke-static {v3}, Loo1/g;->g(Loo1/g;)Ljs0/c;

    move-result-object v3

    sget-object v4, Lcom/whoop/data/repositories/MCIOverviewPollingInterval;->INSTANCE:Lcom/whoop/data/repositories/MCIOverviewPollingInterval;

    invoke-virtual {v3}, Ljs0/c;->getConfigurations()Ljs0/b;

    move-result-object v3

    invoke-virtual {v4}, Ljs0/a;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v4

    const-class v12, Ljava/lang/Long;

    invoke-virtual {v6, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v12

    invoke-virtual {v6, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-static {v12, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_c

    invoke-virtual {v3, v7}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_b

    invoke-static {v3}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    goto/16 :goto_2

    :cond_b
    const/4 v3, 0x0

    goto/16 :goto_2

    :cond_c
    invoke-virtual {v6, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-static {v12, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_d

    invoke-virtual {v3, v7}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_b

    invoke-static {v3}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v3

    goto :goto_2

    :cond_d
    invoke-virtual {v6, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v12, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_e

    invoke-virtual {v3, v7}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_b

    invoke-static {v3}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v3

    goto :goto_2

    :cond_e
    invoke-virtual {v6, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v12, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_f

    invoke-virtual {v3, v7}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_b

    invoke-static {v3}, Lyb3/x;->x(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v3

    goto :goto_2

    :cond_f
    invoke-virtual {v6, v14}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v12, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_10

    invoke-virtual {v3, v7}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_b

    invoke-static {v3}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v3

    goto :goto_2

    :cond_10
    invoke-virtual {v6, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v12, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-virtual {v3, v7}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_2

    :cond_11
    move-object v3, v4

    :goto_2
    if-nez v3, :cond_12

    goto :goto_3

    :cond_12
    move-object v4, v3

    :goto_3
    if-eqz v4, :cond_18

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    if-gt v9, v2, :cond_17

    move v8, v2

    move-wide v10, v3

    move v12, v9

    :goto_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    if-ne v12, v8, :cond_13

    move v6, v9

    goto :goto_5

    :cond_13
    const/4 v2, 0x0

    move v6, v2

    :goto_5
    new-instance v2, Loo1/g$z$a;

    iget-object v3, v0, Loo1/g$z;->J:Loo1/g;

    iget-object v4, v0, Loo1/g$z;->K:Ljava/lang/String;

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v7}, Loo1/g$z$a;-><init>(Loo1/g;Ljava/lang/String;Ldc3/u;ZLq83/d;)V

    const/4 v3, 0x3

    const/4 v4, 0x0

    invoke-static {v5, v4, v4, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v2

    iput-object v5, v0, Loo1/g$z;->I:Ljava/lang/Object;

    iput-object v4, v0, Loo1/g$z;->w:Ljava/lang/Object;

    iput v8, v0, Loo1/g$z;->x:I

    iput-wide v10, v0, Loo1/g$z;->E:J

    iput v12, v0, Loo1/g$z;->y:I

    iput-wide v13, v0, Loo1/g$z;->F:J

    iput v6, v0, Loo1/g$z;->z:I

    iput v9, v0, Loo1/g$z;->H:I

    invoke-virtual {v2, v0}, Lbc3/t1;->join(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_14

    goto :goto_7

    :cond_14
    move v2, v6

    move v7, v8

    move v6, v12

    move-wide v3, v13

    :goto_6
    if-eqz v2, :cond_15

    goto :goto_9

    :cond_15
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    sub-long/2addr v12, v3

    sub-long v14, v10, v12

    move-wide/from16 v16, v10

    const-wide/16 v9, 0x0

    invoke-static {v14, v15, v9, v10}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v9

    iput-object v5, v0, Loo1/g$z;->I:Ljava/lang/Object;

    const/4 v11, 0x0

    iput-object v11, v0, Loo1/g$z;->w:Ljava/lang/Object;

    iput v7, v0, Loo1/g$z;->x:I

    move-wide/from16 v14, v16

    iput-wide v14, v0, Loo1/g$z;->E:J

    iput v6, v0, Loo1/g$z;->y:I

    iput-wide v3, v0, Loo1/g$z;->F:J

    iput v2, v0, Loo1/g$z;->z:I

    iput-wide v12, v0, Loo1/g$z;->G:J

    const/4 v2, 0x2

    iput v2, v0, Loo1/g$z;->H:I

    invoke-static {v9, v10, v0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_16

    :goto_7
    return-object v1

    :cond_16
    :goto_8
    if-eq v6, v7, :cond_17

    add-int/lit8 v12, v6, 0x1

    move v8, v7

    move-wide v10, v14

    const/4 v9, 0x1

    goto :goto_4

    :cond_17
    :goto_9
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_18
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "null cannot be cast to non-null type kotlin.Long"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_19
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "null cannot be cast to non-null type kotlin.Int"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
