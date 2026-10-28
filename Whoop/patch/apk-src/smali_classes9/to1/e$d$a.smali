.class public final Lto1/e$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lto1/e$d;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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
.field final synthetic w:Lec3/m;

.field final synthetic x:Lto1/e;


# direct methods
.method public constructor <init>(Lec3/m;Lto1/e;)V
    .locals 0

    iput-object p1, p0, Lto1/e$d$a;->w:Lec3/m;

    iput-object p2, p0, Lto1/e$d$a;->x:Lto1/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lto1/e$d$a$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lto1/e$d$a$a;

    iget v3, v2, Lto1/e$d$a$a;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lto1/e$d$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Lto1/e$d$a$a;

    invoke-direct {v2, v0, v1}, Lto1/e$d$a$a;-><init>(Lto1/e$d$a;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lto1/e$d$a$a;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lto1/e$d$a$a;->x:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lto1/e$d$a$a;->H:Ljava/lang/Object;

    check-cast v3, Lso1/c0;

    iget-object v3, v2, Lto1/e$d$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v2, v2, Lto1/e$d$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lto1/e$d$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lto1/e$d$a;->w:Lec3/m;

    move-object/from16 v4, p1

    check-cast v4, Loo1/c;

    invoke-virtual {v4}, Loo1/c;->a()Loo1/f;

    move-result-object v6

    invoke-virtual {v4}, Loo1/c;->b()Loo1/h;

    move-result-object v4

    const-string v7, "null cannot be cast to non-null type com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewLocalStateAction.GraphSwitch"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v13, v4

    check-cast v13, Loo1/h$a;

    instance-of v4, v6, Loo1/f$b;

    const/4 v7, 0x0

    if-eqz v4, :cond_3

    sget-object v4, Lso1/c0$b;->b:Lso1/c0$b;

    goto/16 :goto_1

    :cond_3
    instance-of v4, v6, Loo1/f$a;

    if-eqz v4, :cond_4

    new-instance v4, Lso1/c0$a;

    check-cast v6, Loo1/f$a;

    invoke-virtual {v6}, Loo1/f$a;->a()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v6}, Lso1/c0$a;-><init>(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_4
    instance-of v4, v6, Loo1/f$e;

    if-eqz v4, :cond_5

    new-instance v4, Lso1/c0$d;

    check-cast v6, Loo1/f$e;

    invoke-virtual {v6}, Loo1/f$e;->a()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v6}, Lso1/c0$d;-><init>(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_5
    sget-object v4, Loo1/f$d;->a:Loo1/f$d;

    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v4, Lso1/c0$c;->b:Lso1/c0$c;

    goto :goto_1

    :cond_6
    sget-object v4, Loo1/f$f;->a:Loo1/f$f;

    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    sget-object v4, Lso1/c0$e;->b:Lso1/c0$e;

    goto :goto_1

    :cond_7
    instance-of v4, v6, Loo1/f$g;

    if-eqz v4, :cond_8

    iget-object v8, v0, Lto1/e$d$a;->x:Lto1/e;

    check-cast v6, Loo1/f$g;

    invoke-virtual {v6}, Loo1/f$g;->f()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualCycleInsightsResponse;

    move-result-object v9

    invoke-virtual {v6}, Loo1/f$g;->c()Lh91/b;

    move-result-object v10

    invoke-virtual {v6}, Loo1/f$g;->d()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v6}, Loo1/f$g;->e()I

    move-result v4

    new-instance v12, Ljava/lang/Integer;

    invoke-direct {v12, v4}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v6}, Loo1/f$g;->g()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;

    move-result-object v14

    invoke-virtual {v6}, Loo1/f$g;->h()Z

    move-result v15

    invoke-static/range {v8 .. v15}, Lto1/e;->b(Lto1/e;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualCycleInsightsResponse;Lh91/b;Ljava/lang/String;Ljava/lang/Integer;Loo1/h$a;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;Z)Lso1/c0$f;

    move-result-object v4

    goto :goto_1

    :cond_8
    instance-of v4, v6, Loo1/f$h;

    if-eqz v4, :cond_9

    iget-object v8, v0, Lto1/e$d$a;->x:Lto1/e;

    check-cast v6, Loo1/f$h;

    invoke-virtual {v6}, Loo1/f$h;->d()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualCycleInsightsResponse;

    move-result-object v9

    invoke-virtual {v6}, Loo1/f$h;->a()Lh91/b;

    move-result-object v10

    invoke-virtual {v6}, Loo1/f$h;->b()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v6}, Loo1/f$h;->c()I

    move-result v4

    new-instance v12, Ljava/lang/Integer;

    invoke-direct {v12, v4}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v6}, Loo1/f$h;->e()Z

    move-result v15

    const/16 v16, 0x20

    const/16 v17, 0x0

    const/4 v14, 0x0

    invoke-static/range {v8 .. v17}, Lto1/e;->h(Lto1/e;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualCycleInsightsResponse;Lh91/b;Ljava/lang/String;Ljava/lang/Integer;Loo1/h$a;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;ZILjava/lang/Object;)Lso1/c0$f;

    move-result-object v4

    goto :goto_1

    :cond_9
    instance-of v4, v6, Loo1/f$c;

    if-eqz v4, :cond_b

    move-object v4, v7

    :goto_1
    if-eqz v4, :cond_a

    iput-object v7, v2, Lto1/e$d$a$a;->y:Ljava/lang/Object;

    iput-object v7, v2, Lto1/e$d$a$a;->E:Ljava/lang/Object;

    iput-object v7, v2, Lto1/e$d$a$a;->F:Ljava/lang/Object;

    iput-object v7, v2, Lto1/e$d$a$a;->G:Ljava/lang/Object;

    iput-object v7, v2, Lto1/e$d$a$a;->H:Ljava/lang/Object;

    const/4 v6, 0x0

    iput v6, v2, Lto1/e$d$a$a;->I:I

    iput v5, v2, Lto1/e$d$a$a;->x:I

    invoke-interface {v1, v4, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_a

    return-object v3

    :cond_a
    :goto_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_b
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
