.class public final Lvp1/h$m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvp1/h;->H0(Ltp1/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/n;"
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
.field final synthetic E:Lc93/a;

.field final synthetic F:Lkotlin/jvm/functions/Function1;

.field final synthetic G:Lp1/c1;

.field final synthetic H:Lp1/c1;

.field final synthetic I:Lp1/c1;

.field final synthetic J:Lp1/c1;

.field final synthetic w:Ljava/util/List;

.field final synthetic x:Ltp1/j;

.field final synthetic y:Lkotlin/jvm/functions/Function1;

.field final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Ljava/util/List;Ltp1/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;)V
    .locals 0

    iput-object p1, p0, Lvp1/h$m0;->w:Ljava/util/List;

    iput-object p2, p0, Lvp1/h$m0;->x:Ltp1/j;

    iput-object p3, p0, Lvp1/h$m0;->y:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lvp1/h$m0;->z:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lvp1/h$m0;->E:Lc93/a;

    iput-object p6, p0, Lvp1/h$m0;->F:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lvp1/h$m0;->G:Lp1/c1;

    iput-object p8, p0, Lvp1/h$m0;->H:Lp1/c1;

    iput-object p9, p0, Lvp1/h$m0;->I:Lp1/c1;

    iput-object p10, p0, Lvp1/h$m0;->J:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V
    .locals 22

    move-object/from16 v0, p0

    move/from16 v1, p2

    and-int/lit8 v2, p4, 0x6

    const/4 v3, 0x4

    const/4 v4, 0x2

    if-nez v2, :cond_1

    move-object/from16 v2, p3

    check-cast v2, Lp1/q;

    move-object/from16 v5, p1

    invoke-virtual {v2, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    or-int v2, p4, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p4

    :goto_1
    and-int/lit8 v5, p4, 0x30

    if-nez v5, :cond_3

    move-object/from16 v5, p3

    check-cast v5, Lp1/q;

    invoke-virtual {v5, v1}, Lp1/q;->e(I)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    :cond_3
    and-int/lit16 v5, v2, 0x93

    const/16 v6, 0x92

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eq v5, v6, :cond_4

    move v5, v7

    goto :goto_3

    :cond_4
    move v5, v8

    :goto_3
    and-int/2addr v2, v7

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    invoke-virtual {v12, v2, v5}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_29

    iget-object v2, v0, Lvp1/h$m0;->w:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lm91/u;

    const v1, -0x45711081

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    instance-of v1, v9, Ltp1/l;

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-eqz v1, :cond_b

    const v1, -0x45738b0a

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    iget-object v1, v0, Lvp1/h$m0;->x:Ltp1/j;

    invoke-virtual {v1}, Ltp1/j;->o()Z

    move-result v1

    if-nez v1, :cond_6

    move-object v1, v9

    check-cast v1, Ltp1/l;

    invoke-virtual {v1}, Ltp1/l;->f()Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_4

    :cond_5
    const v1, -0x45688fba

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_6
    :goto_4
    const v1, -0x45725013

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    move-object v1, v9

    check-cast v1, Ltp1/l;

    iget-object v3, v0, Lvp1/h$m0;->y:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_7

    if-ne v4, v2, :cond_8

    :cond_7
    new-instance v4, Lvp1/h$l;

    iget-object v3, v0, Lvp1/h$m0;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {v4, v3}, Lvp1/h$l;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v12, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object v10, v4

    check-cast v10, Lc93/a;

    invoke-virtual {v12, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    iget-object v4, v0, Lvp1/h$m0;->z:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v12, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_9

    if-ne v4, v2, :cond_a

    :cond_9
    new-instance v4, Lvp1/h$m;

    iget-object v2, v0, Lvp1/h$m0;->z:Lkotlin/jvm/functions/Function1;

    invoke-direct {v4, v9, v2}, Lvp1/h$m;-><init>(Lm91/u;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v12, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object v11, v4

    check-cast v11, Lc93/a;

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v9, v1

    invoke-static/range {v9 .. v14}, Lvp1/h;->k2(Ltp1/l;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    :goto_5
    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    goto/16 :goto_f

    :cond_b
    instance-of v1, v9, Ltp1/k;

    if-eqz v1, :cond_12

    const v1, -0x45659ea5

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    move-object v1, v9

    check-cast v1, Ltp1/k;

    invoke-virtual {v1}, Ltp1/k;->c()Ltp1/r;

    move-result-object v3

    sget-object v5, Lvp1/h$n0;->b:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v5, v3

    if-eq v3, v7, :cond_d

    if-ne v3, v4, :cond_c

    iget-object v3, v0, Lvp1/h$m0;->H:Lp1/c1;

    invoke-static {v3}, Lvp1/h;->X1(Lp1/c1;)Z

    move-result v3

    :goto_6
    move v11, v3

    goto :goto_7

    :cond_c
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_d
    iget-object v3, v0, Lvp1/h$m0;->G:Lp1/c1;

    invoke-static {v3}, Lvp1/h;->Y1(Lp1/c1;)Z

    move-result v3

    goto :goto_6

    :goto_7
    invoke-virtual {v1}, Ltp1/k;->c()Ltp1/r;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v5, v3

    if-eq v3, v7, :cond_e

    if-ne v3, v4, :cond_f

    iget-object v3, v0, Lvp1/h$m0;->G:Lp1/c1;

    invoke-static {v3}, Lvp1/h;->Y1(Lp1/c1;)Z

    move-result v7

    :cond_e
    move v10, v7

    goto :goto_8

    :cond_f
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :goto_8
    invoke-virtual {v12, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    iget-object v4, v0, Lvp1/h$m0;->z:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v12, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    iget-object v4, v0, Lvp1/h$m0;->y:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v12, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_10

    if-ne v4, v2, :cond_11

    :cond_10
    new-instance v4, Lvp1/h$n;

    iget-object v2, v0, Lvp1/h$m0;->z:Lkotlin/jvm/functions/Function1;

    iget-object v3, v0, Lvp1/h$m0;->y:Lkotlin/jvm/functions/Function1;

    iget-object v5, v0, Lvp1/h$m0;->I:Lp1/c1;

    invoke-direct {v4, v9, v2, v3, v5}, Lvp1/h$n;-><init>(Lm91/u;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;)V

    invoke-virtual {v12, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v9, v1

    move-object v13, v12

    move-object v12, v4

    invoke-static/range {v9 .. v15}, Lvp1/h;->T1(Ltp1/k;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v12, v13

    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    goto/16 :goto_f

    :cond_12
    instance-of v1, v9, Lbo1/b;

    if-eqz v1, :cond_17

    const v1, -0x45498e27

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    move-object v1, v9

    check-cast v1, Lbo1/b;

    iget-object v3, v0, Lvp1/h$m0;->y:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    iget-object v4, v0, Lvp1/h$m0;->E:Lc93/a;

    invoke-virtual {v12, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_13

    if-ne v4, v2, :cond_14

    :cond_13
    new-instance v4, Lvp1/h$o;

    iget-object v3, v0, Lvp1/h$m0;->y:Lkotlin/jvm/functions/Function1;

    iget-object v5, v0, Lvp1/h$m0;->E:Lc93/a;

    invoke-direct {v4, v3, v5}, Lvp1/h$o;-><init>(Lkotlin/jvm/functions/Function1;Lc93/a;)V

    invoke-virtual {v12, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    move-object v10, v4

    check-cast v10, Lkotlin/jvm/functions/Function1;

    iget-object v3, v0, Lvp1/h$m0;->z:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v12, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_15

    if-ne v4, v2, :cond_16

    :cond_15
    new-instance v4, Lvp1/h$p;

    iget-object v2, v0, Lvp1/h$m0;->z:Lkotlin/jvm/functions/Function1;

    invoke-direct {v4, v2, v9}, Lvp1/h$p;-><init>(Lkotlin/jvm/functions/Function1;Lm91/u;)V

    invoke-virtual {v12, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    move-object v11, v4

    check-cast v11, Lkotlin/jvm/functions/Function1;

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v9, v1

    invoke-static/range {v9 .. v14}, Lgo1/b;->f(Lbo1/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    goto/16 :goto_f

    :cond_17
    instance-of v1, v9, Ltp1/g;

    sget-object v5, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_20

    const v1, -0x453880b9

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    int-to-float v1, v4

    int-to-float v3, v3

    invoke-static {v1, v3, v5, v12}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    move-object v1, v9

    check-cast v1, Ltp1/g;

    invoke-virtual {v1}, Ltp1/g;->f()Ltp1/h;

    move-result-object v3

    if-nez v3, :cond_18

    const/4 v3, -0x1

    goto :goto_9

    :cond_18
    sget-object v5, Lvp1/h$n0;->c:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v5, v3

    :goto_9
    if-eq v3, v7, :cond_1c

    if-eq v3, v4, :cond_1a

    iget-object v3, v0, Lvp1/h$m0;->G:Lp1/c1;

    invoke-static {v3}, Lvp1/h;->Y1(Lp1/c1;)Z

    move-result v7

    :cond_19
    :goto_a
    move v10, v7

    goto :goto_d

    :cond_1a
    iget-object v3, v0, Lvp1/h$m0;->x:Ltp1/j;

    invoke-virtual {v3}, Ltp1/j;->d()Ltp1/f;

    move-result-object v3

    if-eqz v3, :cond_1b

    goto :goto_a

    :cond_1b
    :goto_b
    move v10, v8

    goto :goto_d

    :cond_1c
    iget-object v3, v0, Lvp1/h$m0;->x:Ltp1/j;

    invoke-virtual {v3}, Ltp1/j;->l()Ltp1/q;

    move-result-object v3

    if-eqz v3, :cond_1d

    invoke-virtual {v3}, Ltp1/q;->a()Ljava/util/List;

    move-result-object v3

    goto :goto_c

    :cond_1d
    const/4 v3, 0x0

    :goto_c
    check-cast v3, Ljava/util/Collection;

    if-eqz v3, :cond_1b

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_19

    goto :goto_b

    :goto_d
    invoke-virtual {v12, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    iget-object v4, v0, Lvp1/h$m0;->F:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v12, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_1e

    if-ne v4, v2, :cond_1f

    :cond_1e
    new-instance v4, Lvp1/h$q;

    iget-object v2, v0, Lvp1/h$m0;->F:Lkotlin/jvm/functions/Function1;

    iget-object v3, v0, Lvp1/h$m0;->J:Lp1/c1;

    invoke-direct {v4, v9, v2, v3}, Lvp1/h$q;-><init>(Lm91/u;Lkotlin/jvm/functions/Function1;Lp1/c1;)V

    invoke-virtual {v12, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    move-object v11, v4

    check-cast v11, Lc93/a;

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v9, v1

    invoke-static/range {v9 .. v14}, Lvp1/h;->S1(Ltp1/g;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    goto/16 :goto_f

    :cond_20
    instance-of v1, v9, Ltp1/i;

    const/16 v6, 0x8

    if-eqz v1, :cond_23

    const v1, -0x4510370c

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    int-to-float v1, v6

    int-to-float v3, v3

    invoke-static {v1, v3, v5, v12}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    check-cast v9, Ltp1/i;

    iget-object v1, v0, Lvp1/h$m0;->F:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    iget-object v4, v0, Lvp1/h$m0;->z:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v12, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v1, v4

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_21

    if-ne v4, v2, :cond_22

    :cond_21
    new-instance v4, Lvp1/h$r;

    iget-object v1, v0, Lvp1/h$m0;->F:Lkotlin/jvm/functions/Function1;

    iget-object v2, v0, Lvp1/h$m0;->z:Lkotlin/jvm/functions/Function1;

    invoke-direct {v4, v1, v2}, Lvp1/h$r;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v12, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_22
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v9, v4, v12, v8, v8}, Lvp1/h;->j2(Ltp1/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v3, v3, v5, v12, v8}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    goto/16 :goto_f

    :cond_23
    instance-of v1, v9, Lhy0/e;

    if-eqz v1, :cond_24

    const v1, -0x4505ad71

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    int-to-float v1, v6

    int-to-float v2, v3

    invoke-static {v1, v2, v5, v12}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    check-cast v9, Lhy0/e;

    invoke-virtual {v9}, Lhy0/e;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v20, v2, 0x9

    const/16 v21, 0xf7

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    move-object/from16 v19, v12

    move-object v12, v1

    invoke-static/range {v9 .. v21}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v12, v19

    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    goto/16 :goto_f

    :cond_24
    instance-of v1, v9, Lso1/h;

    if-eqz v1, :cond_28

    const v1, -0x45019c85

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    iget-object v1, v0, Lvp1/h$m0;->x:Ltp1/j;

    invoke-virtual {v1}, Ltp1/j;->k()Ltp1/a;

    move-result-object v1

    if-eqz v1, :cond_27

    const v1, -0x4500654f

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    int-to-float v1, v4

    int-to-float v3, v3

    invoke-static {v1, v3, v5, v12}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    check-cast v9, Lso1/h;

    iget-object v1, v0, Lvp1/h$m0;->x:Ltp1/j;

    invoke-virtual {v1}, Ltp1/j;->k()Ltp1/a;

    move-result-object v10

    iget-object v1, v0, Lvp1/h$m0;->G:Lp1/c1;

    invoke-static {v1}, Lvp1/h;->Y1(Lp1/c1;)Z

    move-result v11

    iget-object v1, v0, Lvp1/h$m0;->y:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_25

    if-ne v3, v2, :cond_26

    :cond_25
    new-instance v3, Lvp1/h$s;

    iget-object v1, v0, Lvp1/h$m0;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {v3, v1}, Lvp1/h$s;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v12, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_26
    check-cast v3, Lkotlin/jvm/functions/Function1;

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v14, v1, 0x3

    move-object v13, v12

    move-object v12, v3

    invoke-static/range {v9 .. v14}, Lvp1/h;->R1(Lso1/h;Ltp1/a;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move-object v12, v13

    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_27
    const v1, -0x44f63bda

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    :goto_e
    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_28
    const v1, -0x44f509d9

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    const/4 v14, 0x0

    const/16 v15, 0xe

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v13, v12

    const/4 v12, 0x0

    invoke-static/range {v9 .. v15}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v12, v13

    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    :goto_f
    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    return-void

    :cond_29
    invoke-virtual {v12}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lvp1/h$m0;->a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
