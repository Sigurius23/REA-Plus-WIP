.class public final synthetic Ll1/l4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ly2/t0;

.field public final synthetic F:I

.field public final synthetic G:I

.field public final synthetic H:Ly2/j1;

.field public final synthetic I:Ly2/j1;

.field public final synthetic J:Ly2/j1;

.field public final synthetic K:Ly2/j1;

.field public final synthetic L:Ly2/j1;

.field public final synthetic M:Ly2/j1;

.field public final synthetic N:Ly2/j1;

.field public final synthetic O:Ly2/j1;

.field public final synthetic P:F

.field public final synthetic w:Lkotlin/jvm/internal/g0;

.field public final synthetic x:Ll1/m4;

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/g0;Ll1/m4;IILy2/t0;IILy2/j1;Ly2/j1;Ly2/j1;Ly2/j1;Ly2/j1;Ly2/j1;Ly2/j1;Ly2/j1;F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/l4;->w:Lkotlin/jvm/internal/g0;

    iput-object p2, p0, Ll1/l4;->x:Ll1/m4;

    iput p3, p0, Ll1/l4;->y:I

    iput p4, p0, Ll1/l4;->z:I

    iput-object p5, p0, Ll1/l4;->E:Ly2/t0;

    iput p6, p0, Ll1/l4;->F:I

    iput p7, p0, Ll1/l4;->G:I

    iput-object p8, p0, Ll1/l4;->H:Ly2/j1;

    iput-object p9, p0, Ll1/l4;->I:Ly2/j1;

    iput-object p10, p0, Ll1/l4;->J:Ly2/j1;

    iput-object p11, p0, Ll1/l4;->K:Ly2/j1;

    iput-object p12, p0, Ll1/l4;->L:Ly2/j1;

    iput-object p13, p0, Ll1/l4;->M:Ly2/j1;

    iput-object p14, p0, Ll1/l4;->N:Ly2/j1;

    iput-object p15, p0, Ll1/l4;->O:Ly2/j1;

    move/from16 p1, p16

    iput p1, p0, Ll1/l4;->P:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Ly2/i1;

    iget-object v2, v0, Ll1/l4;->w:Lkotlin/jvm/internal/g0;

    iget-object v3, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object v4, v0, Ll1/l4;->x:Ll1/m4;

    iget-object v5, v0, Ll1/l4;->E:Ly2/t0;

    iget v6, v0, Ll1/l4;->F:I

    iget v7, v0, Ll1/l4;->G:I

    iget-object v8, v0, Ll1/l4;->H:Ly2/j1;

    iget-object v9, v0, Ll1/l4;->I:Ly2/j1;

    iget-object v10, v0, Ll1/l4;->J:Ly2/j1;

    iget-object v11, v0, Ll1/l4;->K:Ly2/j1;

    iget-object v12, v0, Ll1/l4;->L:Ly2/j1;

    iget-object v13, v0, Ll1/l4;->M:Ly2/j1;

    iget-object v14, v0, Ll1/l4;->N:Ly2/j1;

    iget-object v15, v0, Ll1/l4;->O:Ly2/j1;

    move-object/from16 p1, v3

    const/high16 v16, 0x40000000    # 2.0f

    if-eqz p1, :cond_11

    iget-boolean v3, v4, Ll1/m4;->a:Z

    move/from16 v17, v3

    iget v3, v0, Ll1/l4;->z:I

    if-eqz v17, :cond_0

    move/from16 v17, v6

    move-object/from16 v6, p1

    check-cast v6, Ly2/j1;

    iget v6, v6, Ly2/j1;->x:I

    move/from16 p1, v6

    iget v6, v0, Ll1/l4;->y:I

    sub-int v6, v6, p1

    int-to-float v6, v6

    div-float v6, v6, v16

    move/from16 p1, v7

    move-object/from16 v18, v13

    const/4 v7, 0x1

    int-to-float v13, v7

    const/4 v7, 0x0

    invoke-static {v13, v7, v6}, Ldc/b;->a(FFF)I

    move-result v6

    goto :goto_0

    :cond_0
    move/from16 v17, v6

    move/from16 p1, v7

    move-object/from16 v18, v13

    iget v6, v4, Ll1/m4;->e:F

    invoke-interface {v5, v6}, Ly3/c;->F(F)I

    move-result v6

    add-int/2addr v6, v3

    :goto_0
    iget-object v2, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v2, Ly2/j1;

    iget v7, v2, Ly2/j1;->x:I

    add-int/2addr v7, v3

    invoke-interface {v5}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v5

    iget-object v4, v4, Ll1/m4;->b:Ll1/k4;

    const/4 v13, 0x0

    invoke-static {v14, v13, v13, v1}, Ly2/i1;->g(Ly2/j1;IILy2/i1;)V

    if-eqz v15, :cond_1

    iget v13, v15, Ly2/j1;->x:I

    goto :goto_1

    :cond_1
    const/4 v13, 0x0

    :goto_1
    sub-int v13, p1, v13

    if-eqz v10, :cond_2

    iget v14, v10, Ly2/j1;->x:I

    sub-int v14, v13, v14

    int-to-float v14, v14

    div-float v14, v14, v16

    move/from16 p1, v13

    move-object/from16 v19, v15

    const/4 v13, 0x1

    int-to-float v15, v13

    const/4 v13, 0x0

    invoke-static {v15, v13, v14}, Ldc/b;->a(FFF)I

    move-result v14

    const/4 v13, 0x0

    invoke-static {v10, v13, v14, v1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    goto :goto_2

    :cond_2
    move/from16 p1, v13

    move-object/from16 v19, v15

    :goto_2
    iget v13, v0, Ll1/l4;->P:F

    invoke-static {v13, v6, v3}, Le93/b;->P(FII)I

    move-result v3

    sget-object v6, Ly3/m;->w:Ly3/m;

    if-ne v5, v6, :cond_4

    if-eqz v10, :cond_3

    iget v6, v10, Ly2/j1;->w:I

    goto :goto_3

    :cond_3
    const/4 v6, 0x0

    goto :goto_3

    :cond_4
    if-eqz v11, :cond_3

    iget v6, v11, Ly2/j1;->w:I

    :goto_3
    sget v14, Lm1/l0;->a:F

    iget-object v14, v4, Ll1/k4;->b:Lb2/k;

    iget v15, v2, Ly2/j1;->w:I

    if-eqz v10, :cond_5

    iget v0, v10, Ly2/j1;->w:I

    goto :goto_4

    :cond_5
    const/4 v0, 0x0

    :goto_4
    sub-int v0, v17, v0

    move/from16 v20, v0

    if-eqz v11, :cond_6

    iget v0, v11, Ly2/j1;->w:I

    goto :goto_5

    :cond_6
    const/4 v0, 0x0

    :goto_5
    sub-int v0, v20, v0

    invoke-virtual {v14, v15, v0, v5}, Lb2/k;->a(IILy3/m;)I

    move-result v0

    add-int/2addr v0, v6

    invoke-static {v4}, Lm1/l0;->c(Ll1/k4;)Lb2/f;

    move-result-object v4

    iget v14, v2, Ly2/j1;->w:I

    if-eqz v10, :cond_7

    iget v15, v10, Ly2/j1;->w:I

    goto :goto_6

    :cond_7
    const/4 v15, 0x0

    :goto_6
    sub-int v15, v17, v15

    move-object/from16 v20, v4

    if-eqz v11, :cond_8

    iget v4, v11, Ly2/j1;->w:I

    goto :goto_7

    :cond_8
    const/4 v4, 0x0

    :goto_7
    sub-int/2addr v15, v4

    move-object/from16 v4, v20

    check-cast v4, Lb2/k;

    invoke-virtual {v4, v14, v15, v5}, Lb2/k;->a(IILy3/m;)I

    move-result v4

    add-int/2addr v4, v6

    invoke-static {v13, v0, v4}, Le93/b;->P(FII)I

    move-result v0

    const/4 v13, 0x0

    invoke-virtual {v1, v2, v0, v3, v13}, Ly2/i1;->f(Ly2/j1;IIF)V

    if-eqz v12, :cond_a

    if-eqz v10, :cond_9

    iget v0, v10, Ly2/j1;->w:I

    goto :goto_8

    :cond_9
    const/4 v0, 0x0

    :goto_8
    invoke-static {v12, v0, v7, v1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    :cond_a
    if-eqz v10, :cond_b

    iget v0, v10, Ly2/j1;->w:I

    goto :goto_9

    :cond_b
    const/4 v0, 0x0

    :goto_9
    if-eqz v12, :cond_c

    iget v2, v12, Ly2/j1;->w:I

    goto :goto_a

    :cond_c
    const/4 v2, 0x0

    :goto_a
    add-int/2addr v0, v2

    invoke-static {v8, v0, v7, v1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    if-eqz v9, :cond_d

    invoke-static {v9, v0, v7, v1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    :cond_d
    if-eqz v18, :cond_f

    if-eqz v11, :cond_e

    iget v0, v11, Ly2/j1;->w:I

    goto :goto_b

    :cond_e
    const/4 v0, 0x0

    :goto_b
    sub-int v6, v17, v0

    move-object/from16 v0, v18

    iget v2, v0, Ly2/j1;->w:I

    sub-int/2addr v6, v2

    invoke-static {v0, v6, v7, v1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    :cond_f
    if-eqz v11, :cond_10

    iget v0, v11, Ly2/j1;->w:I

    sub-int v6, v17, v0

    iget v0, v11, Ly2/j1;->x:I

    sub-int v13, p1, v0

    int-to-float v0, v13

    div-float v0, v0, v16

    const/4 v7, 0x1

    int-to-float v2, v7

    const/4 v13, 0x0

    invoke-static {v2, v13, v0}, Ldc/b;->a(FFF)I

    move-result v0

    invoke-static {v11, v6, v0, v1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    :cond_10
    if-eqz v19, :cond_1c

    move/from16 v7, p1

    move-object/from16 v2, v19

    const/4 v13, 0x0

    invoke-static {v2, v13, v7, v1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    goto/16 :goto_11

    :cond_11
    move/from16 v17, v6

    move/from16 p1, v7

    move-object v0, v13

    move-object v2, v15

    invoke-interface {v5}, Ly3/c;->getDensity()F

    move-result v3

    const-wide/16 v5, 0x0

    invoke-static {v1, v14, v5, v6}, Ly2/i1;->k(Ly2/i1;Ly2/j1;J)V

    if-eqz v2, :cond_12

    iget v5, v2, Ly2/j1;->x:I

    goto :goto_c

    :cond_12
    const/4 v5, 0x0

    :goto_c
    sub-int v7, p1, v5

    iget-object v5, v4, Ll1/m4;->d:Ll0/k1;

    invoke-interface {v5}, Ll0/k1;->d()F

    move-result v5

    mul-float/2addr v5, v3

    invoke-static {v5}, Le93/b;->X(F)I

    move-result v3

    if-eqz v10, :cond_13

    iget v5, v10, Ly2/j1;->x:I

    sub-int v5, v7, v5

    int-to-float v5, v5

    div-float v5, v5, v16

    const/4 v13, 0x1

    int-to-float v6, v13

    const/4 v13, 0x0

    invoke-static {v6, v13, v5}, Ldc/b;->a(FFF)I

    move-result v5

    const/4 v13, 0x0

    invoke-static {v10, v13, v5, v1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    :cond_13
    if-eqz v12, :cond_15

    if-eqz v10, :cond_14

    iget v13, v10, Ly2/j1;->w:I

    goto :goto_d

    :cond_14
    const/4 v13, 0x0

    :goto_d
    invoke-static {v4, v7, v3, v12}, Ll1/m4;->i(Ll1/m4;IILy2/j1;)I

    move-result v5

    invoke-static {v12, v13, v5, v1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    :cond_15
    if-eqz v10, :cond_16

    iget v13, v10, Ly2/j1;->w:I

    goto :goto_e

    :cond_16
    const/4 v13, 0x0

    :goto_e
    if-eqz v12, :cond_17

    iget v5, v12, Ly2/j1;->w:I

    goto :goto_f

    :cond_17
    const/4 v5, 0x0

    :goto_f
    add-int/2addr v13, v5

    invoke-static {v4, v7, v3, v8}, Ll1/m4;->i(Ll1/m4;IILy2/j1;)I

    move-result v5

    invoke-static {v8, v13, v5, v1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    if-eqz v9, :cond_18

    invoke-static {v4, v7, v3, v9}, Ll1/m4;->i(Ll1/m4;IILy2/j1;)I

    move-result v5

    invoke-static {v9, v13, v5, v1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    :cond_18
    if-eqz v0, :cond_1a

    if-eqz v11, :cond_19

    iget v13, v11, Ly2/j1;->w:I

    goto :goto_10

    :cond_19
    const/4 v13, 0x0

    :goto_10
    sub-int v6, v17, v13

    iget v5, v0, Ly2/j1;->w:I

    sub-int/2addr v6, v5

    invoke-static {v4, v7, v3, v0}, Ll1/m4;->i(Ll1/m4;IILy2/j1;)I

    move-result v3

    invoke-static {v0, v6, v3, v1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    :cond_1a
    if-eqz v11, :cond_1b

    iget v0, v11, Ly2/j1;->w:I

    sub-int v6, v17, v0

    iget v0, v11, Ly2/j1;->x:I

    sub-int v0, v7, v0

    int-to-float v0, v0

    div-float v0, v0, v16

    const/4 v13, 0x1

    int-to-float v3, v13

    const/4 v13, 0x0

    invoke-static {v3, v13, v0}, Ldc/b;->a(FFF)I

    move-result v0

    invoke-static {v11, v6, v0, v1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    :cond_1b
    if-eqz v2, :cond_1c

    const/4 v13, 0x0

    invoke-static {v2, v13, v7, v1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    :cond_1c
    :goto_11
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
