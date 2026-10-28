.class public final Lnm0/b$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnm0/b$b;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Lnm0/b;

.field final synthetic y:Lnm0/c;

.field final synthetic z:Ls63/a;


# direct methods
.method public constructor <init>(Lec3/m;Lnm0/b;Lnm0/c;Ls63/a;)V
    .locals 0

    iput-object p1, p0, Lnm0/b$b$a;->w:Lec3/m;

    iput-object p2, p0, Lnm0/b$b$a;->x:Lnm0/b;

    iput-object p3, p0, Lnm0/b$b$a;->y:Lnm0/c;

    iput-object p4, p0, Lnm0/b$b$a;->z:Ls63/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    instance-of v2, v0, Lnm0/b$b$a$a;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lnm0/b$b$a$a;

    iget v3, v2, Lnm0/b$b$a$a;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lnm0/b$b$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Lnm0/b$b$a$a;

    invoke-direct {v2, v1, v0}, Lnm0/b$b$a$a;-><init>(Lnm0/b$b$a;Lq83/d;)V

    :goto_0
    iget-object v0, v2, Lnm0/b$b$a$a;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lnm0/b$b$a$a;->x:I

    const-string v5, ""

    const/4 v6, 0x5

    const/4 v7, 0x4

    const/4 v8, 0x3

    const/4 v9, 0x2

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-eqz v4, :cond_6

    if-eq v4, v11, :cond_5

    if-eq v4, v9, :cond_4

    if-eq v4, v8, :cond_3

    if-eq v4, v7, :cond_2

    if-ne v4, v6, :cond_1

    iget-object v3, v2, Lnm0/b$b$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v2, v2, Lnm0/b$b$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lnm0/b$b$a$a;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_b

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget v4, v2, Lnm0/b$b$a$a;->M:I

    iget-object v7, v2, Lnm0/b$b$a$a;->L:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iget-object v7, v2, Lnm0/b$b$a$a;->K:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Exception;

    iget-object v8, v2, Lnm0/b$b$a$a;->J:Ljava/lang/Object;

    check-cast v8, Lu02/g;

    iget-object v8, v2, Lnm0/b$b$a$a;->I:Ljava/lang/Object;

    check-cast v8, Lq83/d;

    iget-object v8, v2, Lnm0/b$b$a$a;->H:Ljava/lang/Object;

    check-cast v8, Lec3/m;

    iget-object v9, v2, Lnm0/b$b$a$a;->G:Ljava/lang/Object;

    check-cast v9, Lec3/m;

    iget-object v9, v2, Lnm0/b$b$a$a;->E:Ljava/lang/Object;

    check-cast v9, Lnm0/b$b$a$a;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_3
    iget v4, v2, Lnm0/b$b$a$a;->O:I

    iget v8, v2, Lnm0/b$b$a$a;->N:I

    iget v9, v2, Lnm0/b$b$a$a;->M:I

    iget-object v10, v2, Lnm0/b$b$a$a;->J:Ljava/lang/Object;

    check-cast v10, Lu02/g;

    iget-object v10, v2, Lnm0/b$b$a$a;->I:Ljava/lang/Object;

    check-cast v10, Lq83/d;

    iget-object v10, v2, Lnm0/b$b$a$a;->H:Ljava/lang/Object;

    check-cast v10, Lec3/m;

    iget-object v11, v2, Lnm0/b$b$a$a;->G:Ljava/lang/Object;

    check-cast v11, Lec3/m;

    iget-object v11, v2, Lnm0/b$b$a$a;->E:Ljava/lang/Object;

    check-cast v11, Lnm0/b$b$a$a;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_5

    :catch_0
    move-exception v0

    move v6, v8

    move-object v8, v10

    move v10, v4

    move v4, v9

    goto/16 :goto_6

    :cond_4
    iget v4, v2, Lnm0/b$b$a$a;->N:I

    iget v9, v2, Lnm0/b$b$a$a;->M:I

    iget-object v13, v2, Lnm0/b$b$a$a;->J:Ljava/lang/Object;

    check-cast v13, Lu02/g;

    iget-object v14, v2, Lnm0/b$b$a$a;->I:Ljava/lang/Object;

    check-cast v14, Lq83/d;

    iget-object v14, v2, Lnm0/b$b$a$a;->H:Ljava/lang/Object;

    check-cast v14, Lec3/m;

    iget-object v15, v2, Lnm0/b$b$a$a;->G:Ljava/lang/Object;

    check-cast v15, Lec3/m;

    iget-object v15, v2, Lnm0/b$b$a$a;->E:Ljava/lang/Object;

    check-cast v15, Lnm0/b$b$a$a;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_5
    iget v10, v2, Lnm0/b$b$a$a;->M:I

    iget-object v4, v2, Lnm0/b$b$a$a;->L:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v5, v2, Lnm0/b$b$a$a;->K:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Integer;

    iget-object v7, v2, Lnm0/b$b$a$a;->J:Ljava/lang/Object;

    check-cast v7, Lu02/g;

    iget-object v7, v2, Lnm0/b$b$a$a;->I:Ljava/lang/Object;

    check-cast v7, Lq83/d;

    iget-object v7, v2, Lnm0/b$b$a$a;->H:Ljava/lang/Object;

    check-cast v7, Lec3/m;

    iget-object v8, v2, Lnm0/b$b$a$a;->G:Ljava/lang/Object;

    check-cast v8, Lec3/m;

    iget-object v8, v2, Lnm0/b$b$a$a;->E:Ljava/lang/Object;

    check-cast v8, Lnm0/b$b$a$a;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_6
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lnm0/b$b$a;->w:Lec3/m;

    move-object/from16 v13, p1

    check-cast v13, Lu02/g;

    instance-of v4, v13, Lu02/e;

    if-eqz v4, :cond_b

    check-cast v13, Lu02/e;

    invoke-virtual {v13}, Lu02/e;->a()Lu02/d;

    move-result-object v4

    invoke-virtual {v4}, Lu02/d;->b()Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v13}, Lu02/e;->a()Lu02/d;

    move-result-object v7

    invoke-virtual {v7}, Lu02/d;->a()Ljava/lang/Throwable;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_7

    goto :goto_1

    :cond_7
    move-object v5, v7

    :goto_1
    if-eqz v4, :cond_a

    invoke-static {}, Lnm0/b;->d()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v7, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    iget-object v7, v1, Lnm0/b$b$a;->x:Lnm0/b;

    invoke-static {v7}, Lnm0/b;->c(Lnm0/b;)Lxm0/b;

    move-result-object v7

    iget-object v8, v1, Lnm0/b$b$a;->y:Lnm0/c;

    iget-object v9, v1, Lnm0/b$b$a;->x:Lnm0/b;

    invoke-static {v9}, Lnm0/b;->g(Lnm0/b;)Lsr2/y;

    move-result-object v9

    invoke-virtual {v8, v9}, Lnm0/c;->d(Lsr2/y;)Ljava/lang/String;

    move-result-object v8

    iput-object v12, v2, Lnm0/b$b$a$a;->y:Ljava/lang/Object;

    iput-object v12, v2, Lnm0/b$b$a$a;->E:Ljava/lang/Object;

    iput-object v12, v2, Lnm0/b$b$a$a;->F:Ljava/lang/Object;

    iput-object v12, v2, Lnm0/b$b$a$a;->G:Ljava/lang/Object;

    iput-object v0, v2, Lnm0/b$b$a$a;->H:Ljava/lang/Object;

    iput-object v12, v2, Lnm0/b$b$a$a;->I:Ljava/lang/Object;

    iput-object v12, v2, Lnm0/b$b$a$a;->J:Ljava/lang/Object;

    iput-object v4, v2, Lnm0/b$b$a$a;->K:Ljava/lang/Object;

    iput-object v5, v2, Lnm0/b$b$a$a;->L:Ljava/lang/Object;

    iput v10, v2, Lnm0/b$b$a$a;->M:I

    iput v10, v2, Lnm0/b$b$a$a;->N:I

    iput v11, v2, Lnm0/b$b$a$a;->x:I

    invoke-virtual {v7, v8, v2}, Lxm0/b;->b(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v3, :cond_8

    goto/16 :goto_a

    :cond_8
    move-object v7, v5

    move-object v5, v4

    move-object v4, v7

    move-object v7, v0

    :goto_2
    move-object v0, v5

    move-object v5, v4

    move-object v4, v0

    move-object v0, v7

    :cond_9
    new-instance v7, Lxm0/a$a$b;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-direct {v7, v5, v8}, Lxm0/a$a$b;-><init>(Ljava/lang/String;I)V

    iget-object v5, v1, Lnm0/b$b$a;->x:Lnm0/b;

    invoke-static {v5}, Lnm0/b;->b(Lnm0/b;)Lvm0/g;

    move-result-object v5

    invoke-interface {v5, v7, v4}, Lvm0/g;->c(Lxm0/a;Ljava/lang/Integer;)V

    goto/16 :goto_9

    :cond_a
    new-instance v7, Lxm0/a$a$c;

    invoke-direct {v7, v5}, Lxm0/a$a$c;-><init>(Ljava/lang/String;)V

    iget-object v4, v1, Lnm0/b$b$a;->x:Lnm0/b;

    invoke-static {v4}, Lnm0/b;->b(Lnm0/b;)Lvm0/g;

    move-result-object v4

    invoke-static {v4, v7, v12, v9, v12}, Lvm0/g;->i(Lvm0/g;Lxm0/a;Ljava/lang/Integer;ILjava/lang/Object;)V

    goto/16 :goto_9

    :cond_b
    instance-of v4, v13, Lu02/h;

    if-eqz v4, :cond_14

    iget-object v4, v1, Lnm0/b$b$a;->x:Lnm0/b;

    invoke-static {v4}, Lnm0/b;->c(Lnm0/b;)Lxm0/b;

    move-result-object v4

    move-object v14, v13

    check-cast v14, Lu02/h;

    invoke-virtual {v14}, Lu02/h;->a()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lne3/l;

    iget-object v15, v1, Lnm0/b$b$a;->y:Lnm0/c;

    iput-object v12, v2, Lnm0/b$b$a$a;->y:Ljava/lang/Object;

    iput-object v12, v2, Lnm0/b$b$a$a;->E:Ljava/lang/Object;

    iput-object v12, v2, Lnm0/b$b$a$a;->F:Ljava/lang/Object;

    iput-object v12, v2, Lnm0/b$b$a$a;->G:Ljava/lang/Object;

    iput-object v0, v2, Lnm0/b$b$a$a;->H:Ljava/lang/Object;

    iput-object v12, v2, Lnm0/b$b$a$a;->I:Ljava/lang/Object;

    iput-object v13, v2, Lnm0/b$b$a$a;->J:Ljava/lang/Object;

    iput v10, v2, Lnm0/b$b$a$a;->M:I

    iput v10, v2, Lnm0/b$b$a$a;->N:I

    iput v9, v2, Lnm0/b$b$a$a;->x:I

    invoke-virtual {v4, v14, v15, v2}, Lxm0/b;->c(Lne3/l;Lnm0/c;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_c

    goto/16 :goto_a

    :cond_c
    move-object v14, v0

    move v4, v10

    move v9, v4

    :goto_3
    iget-object v0, v1, Lnm0/b$b$a;->x:Lnm0/b;

    invoke-static {v0}, Lnm0/b;->e(Lnm0/b;)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v0

    if-eqz v0, :cond_d

    sget-object v15, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->EMPTY_RESPONSE_BODY_HANDLING:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-interface {v0, v15}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z

    move-result v0

    if-ne v0, v11, :cond_d

    move v10, v11

    :cond_d
    if-eqz v10, :cond_e

    :try_start_1
    move-object v0, v13

    check-cast v0, Lu02/h;

    invoke-virtual {v0}, Lu02/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lne3/l;

    invoke-virtual {v0}, Lne3/l;->d()I

    move-result v0

    if-nez v0, :cond_e

    iget-object v0, v1, Lnm0/b$b$a;->z:Ls63/a;

    iget-object v0, v0, Ls63/a;->c:Lj93/a0;

    invoke-interface {v0}, Lj93/a0;->isMarkedNullable()Z

    move-result v0

    if-ne v0, v11, :cond_e

    move v8, v4

    move v4, v10

    move-object v0, v12

    :goto_4
    move-object v10, v14

    goto :goto_5

    :catch_1
    move-exception v0

    move v6, v4

    move v4, v9

    move-object v8, v14

    goto :goto_6

    :cond_e
    iget-object v0, v1, Lnm0/b$b$a;->x:Lnm0/b;

    invoke-static {v0}, Lnm0/b;->f(Lnm0/b;)Lq83/j;

    move-result-object v0

    new-instance v11, Lnm0/b$c;

    iget-object v15, v1, Lnm0/b$b$a;->x:Lnm0/b;

    iget-object v6, v1, Lnm0/b$b$a;->z:Ls63/a;

    invoke-direct {v11, v15, v13, v6, v12}, Lnm0/b$c;-><init>(Lnm0/b;Lu02/g;Ls63/a;Lq83/d;)V

    iput-object v12, v2, Lnm0/b$b$a$a;->y:Ljava/lang/Object;

    iput-object v12, v2, Lnm0/b$b$a$a;->E:Ljava/lang/Object;

    iput-object v12, v2, Lnm0/b$b$a$a;->F:Ljava/lang/Object;

    iput-object v12, v2, Lnm0/b$b$a$a;->G:Ljava/lang/Object;

    iput-object v14, v2, Lnm0/b$b$a$a;->H:Ljava/lang/Object;

    iput-object v12, v2, Lnm0/b$b$a$a;->I:Ljava/lang/Object;

    iput-object v12, v2, Lnm0/b$b$a$a;->J:Ljava/lang/Object;

    iput v9, v2, Lnm0/b$b$a$a;->M:I

    iput v4, v2, Lnm0/b$b$a$a;->N:I

    iput v10, v2, Lnm0/b$b$a$a;->O:I

    iput v8, v2, Lnm0/b$b$a$a;->x:I

    invoke-static {v0, v11, v2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    if-ne v0, v3, :cond_f

    goto/16 :goto_a

    :cond_f
    move v8, v4

    move v4, v10

    goto :goto_4

    :goto_5
    :try_start_2
    new-instance v6, Lxm0/a$c;

    invoke-direct {v6, v0}, Lxm0/a$c;-><init>(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move-object v7, v6

    move-object v0, v10

    move v10, v9

    goto :goto_9

    :goto_6
    invoke-interface {v2}, Lq83/d;->getContext()Lq83/j;

    move-result-object v9

    invoke-static {v9}, Lbc3/f0;->o(Lq83/j;)V

    iget-object v9, v1, Lnm0/b$b$a;->y:Lnm0/c;

    iget-object v11, v1, Lnm0/b$b$a;->x:Lnm0/b;

    invoke-static {v11}, Lnm0/b;->g(Lnm0/b;)Lsr2/y;

    move-result-object v11

    invoke-virtual {v9, v11}, Lnm0/c;->d(Lsr2/y;)Ljava/lang/String;

    move-result-object v9

    iget-object v11, v1, Lnm0/b$b$a;->x:Lnm0/b;

    invoke-static {v11}, Lnm0/b;->b(Lnm0/b;)Lvm0/g;

    move-result-object v11

    iget-object v13, v1, Lnm0/b$b$a;->y:Lnm0/c;

    invoke-virtual {v13}, Lnm0/c;->a()Lz02/a;

    move-result-object v13

    invoke-interface {v13}, Lz02/a;->getTag()Ljava/lang/String;

    move-result-object v13

    if-nez v13, :cond_10

    const-string v13, "unknown"

    :cond_10
    invoke-interface {v11, v9, v13, v0}, Lvm0/g;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v11, v1, Lnm0/b$b$a;->x:Lnm0/b;

    invoke-static {v11}, Lnm0/b;->c(Lnm0/b;)Lxm0/b;

    move-result-object v11

    iput-object v12, v2, Lnm0/b$b$a$a;->y:Ljava/lang/Object;

    iput-object v12, v2, Lnm0/b$b$a$a;->E:Ljava/lang/Object;

    iput-object v12, v2, Lnm0/b$b$a$a;->F:Ljava/lang/Object;

    iput-object v12, v2, Lnm0/b$b$a$a;->G:Ljava/lang/Object;

    iput-object v8, v2, Lnm0/b$b$a$a;->H:Ljava/lang/Object;

    iput-object v12, v2, Lnm0/b$b$a$a;->I:Ljava/lang/Object;

    iput-object v12, v2, Lnm0/b$b$a$a;->J:Ljava/lang/Object;

    iput-object v0, v2, Lnm0/b$b$a$a;->K:Ljava/lang/Object;

    iput-object v12, v2, Lnm0/b$b$a$a;->L:Ljava/lang/Object;

    iput v4, v2, Lnm0/b$b$a$a;->M:I

    iput v6, v2, Lnm0/b$b$a$a;->N:I

    iput v10, v2, Lnm0/b$b$a$a;->O:I

    iput v7, v2, Lnm0/b$b$a$a;->x:I

    invoke-virtual {v11, v9, v2}, Lxm0/b;->b(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v3, :cond_11

    goto :goto_a

    :cond_11
    move-object v7, v0

    :goto_7
    new-instance v0, Lxm0/a$a$a;

    invoke-virtual {v7}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_12

    goto :goto_8

    :cond_12
    move-object v5, v6

    :goto_8
    invoke-direct {v0, v5}, Lxm0/a$a$a;-><init>(Ljava/lang/String;)V

    move-object v7, v0

    move v10, v4

    move-object v0, v8

    :goto_9
    iput-object v12, v2, Lnm0/b$b$a$a;->y:Ljava/lang/Object;

    iput-object v12, v2, Lnm0/b$b$a$a;->E:Ljava/lang/Object;

    iput-object v12, v2, Lnm0/b$b$a$a;->F:Ljava/lang/Object;

    iput-object v12, v2, Lnm0/b$b$a$a;->G:Ljava/lang/Object;

    iput-object v12, v2, Lnm0/b$b$a$a;->H:Ljava/lang/Object;

    iput-object v12, v2, Lnm0/b$b$a$a;->I:Ljava/lang/Object;

    iput-object v12, v2, Lnm0/b$b$a$a;->J:Ljava/lang/Object;

    iput-object v12, v2, Lnm0/b$b$a$a;->K:Ljava/lang/Object;

    iput-object v12, v2, Lnm0/b$b$a$a;->L:Ljava/lang/Object;

    iput v10, v2, Lnm0/b$b$a$a;->M:I

    const/4 v4, 0x5

    iput v4, v2, Lnm0/b$b$a$a;->x:I

    invoke-interface {v0, v7, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_13

    :goto_a
    return-object v3

    :cond_13
    :goto_b
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_14
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
