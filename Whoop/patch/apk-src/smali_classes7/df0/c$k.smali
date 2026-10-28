.class final Ldf0/c$k;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldf0/c;->t(Ljava/lang/String;Ljava/lang/String;)Lec3/l;
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
        "Lec3/m;",
        "Ldf0/b;",
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
    c = "com.whoop.advancedlabs.typeformwebview.domain.AdvancedLabsTypeformWebviewInteractor$pollClinicalIntakeStatus$1"
    f = "AdvancedLabsTypeformWebviewInteractor.kt"
    l = {
        0xcc,
        0xcf,
        0xd4,
        0xda
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

.field final synthetic J:Ldf0/c;

.field final synthetic K:Ljava/lang/String;

.field final synthetic L:Ljava/lang/String;

.field w:Ljava/lang/Object;

.field x:I

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Ldf0/c;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldf0/c;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ldf0/c$k;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldf0/c$k;->J:Ldf0/c;

    iput-object p2, p0, Ldf0/c$k;->K:Ljava/lang/String;

    iput-object p3, p0, Ldf0/c$k;->L:Ljava/lang/String;

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

    new-instance v0, Ldf0/c$k;

    iget-object v1, p0, Ldf0/c$k;->J:Ldf0/c;

    iget-object v2, p0, Ldf0/c$k;->K:Ljava/lang/String;

    iget-object v3, p0, Ldf0/c$k;->L:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, p2}, Ldf0/c$k;-><init>(Ldf0/c;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Ldf0/c$k;->I:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Ldf0/c$k;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ldf0/c$k;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ldf0/c$k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ldf0/c$k;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    iget-object v1, v0, Ldf0/c$k;->I:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, Ldf0/c$k;->H:I

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v3, :cond_4

    if-eq v3, v7, :cond_3

    if-eq v3, v6, :cond_2

    if-eq v3, v5, :cond_2

    if-ne v3, v4, :cond_1

    iget v3, v0, Ldf0/c$k;->y:I

    iget-wide v9, v0, Ldf0/c$k;->E:J

    iget v11, v0, Ldf0/c$k;->x:I

    iget-object v12, v0, Ldf0/c$k;->w:Ljava/lang/Object;

    check-cast v12, Ldf0/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move v6, v3

    move v3, v4

    move v14, v11

    const/4 v11, 0x0

    :cond_0
    move-wide v4, v9

    goto/16 :goto_8

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v0, Ldf0/c$k;->w:Ljava/lang/Object;

    check-cast v1, Ldf0/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_3
    iget v3, v0, Ldf0/c$k;->z:I

    iget-wide v9, v0, Ldf0/c$k;->F:J

    iget v11, v0, Ldf0/c$k;->y:I

    iget-wide v12, v0, Ldf0/c$k;->E:J

    iget v14, v0, Ldf0/c$k;->x:I

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-wide v4, v9

    move v6, v11

    move-wide v9, v12

    move-object/from16 v11, p1

    goto/16 :goto_6

    :cond_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v0, Ldf0/c$k;->J:Ldf0/c;

    invoke-static {v3}, Ldf0/c;->i(Ldf0/c;)Ljs0/c;

    move-result-object v3

    sget-object v9, Lcom/whoop/data/repositories/ClinicalIntakePollingMaxRetries;->INSTANCE:Lcom/whoop/data/repositories/ClinicalIntakePollingMaxRetries;

    invoke-virtual {v3}, Ljs0/c;->getConfigurations()Ljs0/b;

    move-result-object v3

    invoke-virtual {v9}, Ljs0/a;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v9

    sget-object v11, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v12, Ljava/lang/Integer;

    invoke-virtual {v11, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v12

    sget-object v13, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v11, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    const-class v15, Ljava/lang/String;

    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    sget-object v5, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    sget-object v6, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    sget-object v8, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-eqz v14, :cond_6

    invoke-virtual {v3, v10}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_5

    invoke-static {v3}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    goto/16 :goto_0

    :cond_5
    const/4 v3, 0x0

    goto/16 :goto_0

    :cond_6
    invoke-virtual {v11, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_7

    invoke-virtual {v3, v10}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_5

    invoke-static {v3}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v3

    goto :goto_0

    :cond_7
    invoke-virtual {v11, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_8

    invoke-virtual {v3, v10}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_5

    invoke-static {v3}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v3

    goto :goto_0

    :cond_8
    invoke-virtual {v11, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_9

    invoke-virtual {v3, v10}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_5

    invoke-static {v3}, Lyb3/x;->x(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v3

    goto :goto_0

    :cond_9
    invoke-virtual {v11, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_a

    invoke-virtual {v3, v10}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_5

    invoke-static {v3}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v3

    goto :goto_0

    :cond_a
    invoke-virtual {v11, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_b

    invoke-virtual {v3, v10}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_0

    :cond_b
    move-object v3, v9

    :goto_0
    if-nez v3, :cond_c

    goto :goto_1

    :cond_c
    move-object v9, v3

    :goto_1
    if-eqz v9, :cond_1b

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-static {v7, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    iget-object v9, v0, Ldf0/c$k;->J:Ldf0/c;

    invoke-static {v9}, Ldf0/c;->i(Ldf0/c;)Ljs0/c;

    move-result-object v9

    sget-object v10, Lcom/whoop/data/repositories/ClinicalIntakePollingInterval;->INSTANCE:Lcom/whoop/data/repositories/ClinicalIntakePollingInterval;

    invoke-virtual {v9}, Ljs0/c;->getConfigurations()Ljs0/b;

    move-result-object v9

    invoke-virtual {v10}, Ljs0/a;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v10}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v10

    const-class v14, Ljava/lang/Long;

    invoke-virtual {v11, v14}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v14

    invoke-virtual {v11, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v13

    invoke-static {v14, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_e

    invoke-virtual {v9, v12}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_d

    invoke-static {v4}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    goto/16 :goto_2

    :cond_d
    const/4 v4, 0x0

    goto/16 :goto_2

    :cond_e
    invoke-virtual {v11, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v14, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_f

    invoke-virtual {v9, v12}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_d

    invoke-static {v4}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v4

    goto :goto_2

    :cond_f
    invoke-virtual {v11, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v14, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_10

    invoke-virtual {v9, v12}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_d

    invoke-static {v4}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v4

    goto :goto_2

    :cond_10
    invoke-virtual {v11, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v14, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_11

    invoke-virtual {v9, v12}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_d

    invoke-static {v4}, Lyb3/x;->x(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v4

    goto :goto_2

    :cond_11
    invoke-virtual {v11, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-static {v14, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_12

    invoke-virtual {v9, v12}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_d

    invoke-static {v4}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v4

    goto :goto_2

    :cond_12
    invoke-virtual {v11, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-static {v14, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_13

    invoke-virtual {v9, v12}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    goto :goto_2

    :cond_13
    move-object v4, v10

    :goto_2
    if-nez v4, :cond_14

    goto :goto_3

    :cond_14
    move-object v10, v4

    :goto_3
    if-eqz v10, :cond_1a

    check-cast v10, Ljava/lang/Long;

    invoke-virtual {v10}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    if-gt v7, v3, :cond_19

    move v6, v7

    :goto_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    if-ne v6, v3, :cond_15

    move v8, v7

    goto :goto_5

    :cond_15
    const/4 v8, 0x0

    :goto_5
    iget-object v11, v0, Ldf0/c$k;->J:Ldf0/c;

    iget-object v12, v0, Ldf0/c$k;->K:Ljava/lang/String;

    iget-object v13, v0, Ldf0/c$k;->L:Ljava/lang/String;

    iput-object v1, v0, Ldf0/c$k;->I:Ljava/lang/Object;

    const/4 v14, 0x0

    iput-object v14, v0, Ldf0/c$k;->w:Ljava/lang/Object;

    iput v3, v0, Ldf0/c$k;->x:I

    iput-wide v4, v0, Ldf0/c$k;->E:J

    iput v6, v0, Ldf0/c$k;->y:I

    iput-wide v9, v0, Ldf0/c$k;->F:J

    iput v8, v0, Ldf0/c$k;->z:I

    iput v7, v0, Ldf0/c$k;->H:I

    invoke-static {v11, v12, v13, v0}, Ldf0/c;->c(Ldf0/c;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v2, :cond_16

    goto/16 :goto_7

    :cond_16
    move-wide/from16 v18, v9

    move-wide v9, v4

    move-wide/from16 v4, v18

    move v14, v3

    move v3, v8

    :goto_6
    check-cast v11, Ldf0/b;

    instance-of v8, v11, Ldf0/b$e;

    if-eqz v8, :cond_17

    const/4 v8, 0x0

    iput-object v8, v0, Ldf0/c$k;->I:Ljava/lang/Object;

    iput-object v8, v0, Ldf0/c$k;->w:Ljava/lang/Object;

    iput v14, v0, Ldf0/c$k;->x:I

    iput-wide v9, v0, Ldf0/c$k;->E:J

    iput v6, v0, Ldf0/c$k;->y:I

    iput-wide v4, v0, Ldf0/c$k;->F:J

    iput v3, v0, Ldf0/c$k;->z:I

    const/4 v8, 0x2

    iput v8, v0, Ldf0/c$k;->H:I

    invoke-interface {v1, v11, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_19

    goto :goto_7

    :cond_17
    const/4 v8, 0x2

    if-eqz v3, :cond_18

    sget-object v7, Ldf0/b$g;->a:Ldf0/b$g;

    const/4 v8, 0x0

    iput-object v8, v0, Ldf0/c$k;->I:Ljava/lang/Object;

    iput-object v8, v0, Ldf0/c$k;->w:Ljava/lang/Object;

    iput v14, v0, Ldf0/c$k;->x:I

    iput-wide v9, v0, Ldf0/c$k;->E:J

    iput v6, v0, Ldf0/c$k;->y:I

    iput-wide v4, v0, Ldf0/c$k;->F:J

    iput v3, v0, Ldf0/c$k;->z:I

    const/4 v11, 0x3

    iput v11, v0, Ldf0/c$k;->H:I

    invoke-interface {v1, v7, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_19

    goto :goto_7

    :cond_18
    const/4 v11, 0x3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    sub-long/2addr v12, v4

    sub-long v7, v9, v12

    move-wide/from16 v16, v12

    const-wide/16 v11, 0x0

    invoke-static {v7, v8, v11, v12}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v7

    iput-object v1, v0, Ldf0/c$k;->I:Ljava/lang/Object;

    const/4 v11, 0x0

    iput-object v11, v0, Ldf0/c$k;->w:Ljava/lang/Object;

    iput v14, v0, Ldf0/c$k;->x:I

    iput-wide v9, v0, Ldf0/c$k;->E:J

    iput v6, v0, Ldf0/c$k;->y:I

    iput-wide v4, v0, Ldf0/c$k;->F:J

    iput v3, v0, Ldf0/c$k;->z:I

    move-wide/from16 v12, v16

    iput-wide v12, v0, Ldf0/c$k;->G:J

    const/4 v3, 0x4

    iput v3, v0, Ldf0/c$k;->H:I

    invoke-static {v7, v8, v0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_0

    :goto_7
    return-object v2

    :goto_8
    if-eq v6, v14, :cond_19

    add-int/lit8 v6, v6, 0x1

    move v3, v14

    const/4 v7, 0x1

    goto/16 :goto_4

    :cond_19
    :goto_9
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_1a
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "null cannot be cast to non-null type kotlin.Long"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1b
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "null cannot be cast to non-null type kotlin.Int"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
