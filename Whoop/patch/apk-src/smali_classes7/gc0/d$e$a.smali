.class public final Lgc0/d$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgc0/d$e;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Lgc0/d;


# direct methods
.method public constructor <init>(Lec3/m;Lgc0/d;)V
    .locals 0

    iput-object p1, p0, Lgc0/d$e$a;->w:Lec3/m;

    iput-object p2, p0, Lgc0/d$e$a;->x:Lgc0/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lgc0/d$e$a$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lgc0/d$e$a$a;

    iget v3, v2, Lgc0/d$e$a$a;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lgc0/d$e$a$a;->x:I

    :goto_0
    move-object v8, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lgc0/d$e$a$a;

    invoke-direct {v2, v0, v1}, Lgc0/d$e$a$a;-><init>(Lgc0/d$e$a;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v1, v8, Lgc0/d$e$a$a;->w:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v8, Lgc0/d$e$a$a;->x:I

    const/4 v4, 0x1

    const/4 v11, 0x2

    const/4 v12, 0x0

    if-eqz v3, :cond_3

    if-eq v3, v4, :cond_2

    if-ne v3, v11, :cond_1

    iget-object v2, v8, Lgc0/d$e$a$a;->G:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v2, v8, Lgc0/d$e$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lgc0/d$e$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget v3, v8, Lgc0/d$e$a$a;->K:I

    iget-object v4, v8, Lgc0/d$e$a$a;->J:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v5, v8, Lgc0/d$e$a$a;->I:Ljava/lang/Object;

    check-cast v5, Lq83/d;

    iget-object v5, v8, Lgc0/d$e$a$a;->H:Ljava/lang/Object;

    check-cast v5, Lec3/m;

    iget-object v6, v8, Lgc0/d$e$a$a;->G:Ljava/lang/Object;

    check-cast v6, Lec3/m;

    iget-object v6, v8, Lgc0/d$e$a$a;->E:Ljava/lang/Object;

    check-cast v6, Lgc0/d$e$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v14, v4

    goto :goto_2

    :cond_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lgc0/d$e$a;->w:Lec3/m;

    move-object/from16 v13, p1

    check-cast v13, Ljava/lang/String;

    sget-object v3, Lu02/a;->a:Lu02/a$a;

    iget-object v5, v0, Lgc0/d$e$a;->x:Lgc0/d;

    invoke-static {v5}, Lgc0/d;->d(Lgc0/d;)Ltr2/n;

    move-result-object v5

    new-instance v7, Lgc0/d$f;

    iget-object v6, v0, Lgc0/d$e$a;->x:Lgc0/d;

    invoke-direct {v7, v6, v13, v12}, Lgc0/d$f;-><init>(Lgc0/d;Ljava/lang/String;Lq83/d;)V

    iput-object v12, v8, Lgc0/d$e$a$a;->y:Ljava/lang/Object;

    iput-object v12, v8, Lgc0/d$e$a$a;->E:Ljava/lang/Object;

    iput-object v12, v8, Lgc0/d$e$a$a;->F:Ljava/lang/Object;

    iput-object v12, v8, Lgc0/d$e$a$a;->G:Ljava/lang/Object;

    iput-object v1, v8, Lgc0/d$e$a$a;->H:Ljava/lang/Object;

    iput-object v12, v8, Lgc0/d$e$a$a;->I:Ljava/lang/Object;

    iput-object v13, v8, Lgc0/d$e$a$a;->J:Ljava/lang/Object;

    const/4 v14, 0x0

    iput v14, v8, Lgc0/d$e$a$a;->K:I

    iput v14, v8, Lgc0/d$e$a$a;->L:I

    iput v4, v8, Lgc0/d$e$a$a;->x:I

    move-object v4, v5

    const/4 v5, 0x0

    const-string v6, "Failed to fetch hormonal context"

    const/4 v9, 0x2

    const/4 v10, 0x0

    invoke-static/range {v3 .. v10}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_4

    goto/16 :goto_4

    :cond_4
    move-object v5, v1

    move-object v1, v3

    move v3, v14

    move-object v14, v13

    :goto_2
    check-cast v1, Lu02/a;

    instance-of v4, v1, Lu02/a$c;

    if-eqz v4, :cond_7

    new-instance v4, Lgc0/c$f;

    check-cast v1, Lu02/a$c;

    invoke-virtual {v1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;

    new-instance v7, Lgc0/e;

    invoke-virtual {v1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;->getIntakeScreens()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreen;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreen;->getId()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-static {v1}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenSerializerKt;->toHormonalContextScreenId(Ljava/lang/String;)Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;

    move-result-object v1

    if-nez v1, :cond_6

    :cond_5
    sget-object v1, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;->LIFE_STAGE:Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;

    :cond_6
    invoke-direct {v7, v1, v12, v11, v12}, Lgc0/e;-><init>(Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v13, Lgc0/b;

    const/16 v20, 0x3e

    const/16 v21, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v13 .. v21}, Lgc0/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v20, 0x8

    const/16 v19, 0x0

    move-object v15, v4

    move-object/from16 v16, v6

    move-object/from16 v17, v7

    move-object/from16 v18, v13

    invoke-direct/range {v15 .. v21}, Lgc0/c$f;-><init>(Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;Lgc0/e;Lgc0/b;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_3

    :cond_7
    instance-of v1, v1, Lu02/a$b;

    if-eqz v1, :cond_9

    new-instance v4, Lgc0/c$a;

    invoke-direct {v4, v14}, Lgc0/c$a;-><init>(Ljava/lang/String;)V

    :goto_3
    iput-object v12, v8, Lgc0/d$e$a$a;->y:Ljava/lang/Object;

    iput-object v12, v8, Lgc0/d$e$a$a;->E:Ljava/lang/Object;

    iput-object v12, v8, Lgc0/d$e$a$a;->F:Ljava/lang/Object;

    iput-object v12, v8, Lgc0/d$e$a$a;->G:Ljava/lang/Object;

    iput-object v12, v8, Lgc0/d$e$a$a;->H:Ljava/lang/Object;

    iput-object v12, v8, Lgc0/d$e$a$a;->I:Ljava/lang/Object;

    iput-object v12, v8, Lgc0/d$e$a$a;->J:Ljava/lang/Object;

    iput v3, v8, Lgc0/d$e$a$a;->K:I

    iput v11, v8, Lgc0/d$e$a$a;->x:I

    invoke-interface {v5, v4, v8}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_8

    :goto_4
    return-object v2

    :cond_8
    :goto_5
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_9
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
