.class public final synthetic Ll1/d3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ly2/j1;

.field public final synthetic F:Ly2/j1;

.field public final synthetic G:Ly2/j1;

.field public final synthetic H:Ly2/j1;

.field public final synthetic I:Lkotlin/jvm/internal/g0;

.field public final synthetic J:Ly2/j1;

.field public final synthetic K:Ly2/j1;

.field public final synthetic L:Ly2/j1;

.field public final synthetic M:Ly2/t0;

.field public final synthetic N:F

.field public final synthetic w:Ll1/e3;

.field public final synthetic x:I

.field public final synthetic y:I

.field public final synthetic z:Ly2/j1;


# direct methods
.method public synthetic constructor <init>(Ll1/e3;IILy2/j1;Ly2/j1;Ly2/j1;Ly2/j1;Ly2/j1;Lkotlin/jvm/internal/g0;Ly2/j1;Ly2/j1;Ly2/j1;Ly2/t0;F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/d3;->w:Ll1/e3;

    iput p2, p0, Ll1/d3;->x:I

    iput p3, p0, Ll1/d3;->y:I

    iput-object p4, p0, Ll1/d3;->z:Ly2/j1;

    iput-object p5, p0, Ll1/d3;->E:Ly2/j1;

    iput-object p6, p0, Ll1/d3;->F:Ly2/j1;

    iput-object p7, p0, Ll1/d3;->G:Ly2/j1;

    iput-object p8, p0, Ll1/d3;->H:Ly2/j1;

    iput-object p9, p0, Ll1/d3;->I:Lkotlin/jvm/internal/g0;

    iput-object p10, p0, Ll1/d3;->J:Ly2/j1;

    iput-object p11, p0, Ll1/d3;->K:Ly2/j1;

    iput-object p12, p0, Ll1/d3;->L:Ly2/j1;

    iput-object p13, p0, Ll1/d3;->M:Ly2/t0;

    iput p14, p0, Ll1/d3;->N:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Ly2/i1;

    iget-object v2, v0, Ll1/d3;->I:Lkotlin/jvm/internal/g0;

    iget-object v2, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v7, v2

    check-cast v7, Ly2/j1;

    iget-object v2, v0, Ll1/d3;->M:Ly2/t0;

    invoke-interface {v2}, Ly3/c;->getDensity()F

    move-result v3

    invoke-interface {v2}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v4

    iget-object v5, v0, Ll1/d3;->w:Ll1/e3;

    iget v6, v5, Ll1/e3;->f:F

    invoke-interface {v2, v6}, Ly3/c;->q0(F)F

    move-result v2

    iget-object v6, v5, Ll1/e3;->c:Ll1/k4;

    iget-object v8, v5, Ll1/e3;->e:Ll0/k1;

    iget-object v9, v0, Ll1/d3;->K:Ly2/j1;

    const/4 v10, 0x0

    move v11, v3

    const/4 v3, 0x0

    invoke-static {v9, v10, v3, v1}, Ly2/i1;->g(Ly2/j1;IILy2/i1;)V

    iget-object v9, v0, Ll1/d3;->L:Ly2/j1;

    if-eqz v9, :cond_0

    iget v12, v9, Ly2/j1;->x:I

    goto :goto_0

    :cond_0
    move v12, v10

    :goto_0
    iget v13, v0, Ll1/d3;->x:I

    sub-int/2addr v13, v12

    invoke-interface {v8}, Ll0/k1;->d()F

    move-result v12

    mul-float/2addr v12, v11

    invoke-static {v12}, Le93/b;->X(F)I

    move-result v12

    iget-object v14, v0, Ll1/d3;->z:Ly2/j1;

    const/4 v15, 0x1

    const/high16 v16, 0x40000000    # 2.0f

    const/4 v3, 0x0

    if-eqz v14, :cond_1

    iget v10, v14, Ly2/j1;->x:I

    sub-int v10, v13, v10

    int-to-float v10, v10

    div-float v10, v10, v16

    move/from16 v17, v2

    int-to-float v2, v15

    invoke-static {v2, v3, v10}, Ldc/b;->a(FFF)I

    move-result v2

    const/4 v10, 0x0

    invoke-static {v14, v10, v2, v1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    goto :goto_1

    :cond_1
    move/from16 v17, v2

    :goto_1
    iget v2, v0, Ll1/d3;->y:I

    iget-object v10, v0, Ll1/d3;->E:Ly2/j1;

    if-eqz v7, :cond_9

    iget-boolean v3, v5, Ll1/e3;->b:Z

    if-eqz v3, :cond_2

    iget v3, v7, Ly2/j1;->x:I

    sub-int v3, v13, v3

    int-to-float v3, v3

    div-float v3, v3, v16

    move/from16 v19, v2

    int-to-float v2, v15

    const/4 v15, 0x0

    invoke-static {v2, v15, v3}, Ldc/b;->a(FFF)I

    move-result v2

    goto :goto_2

    :cond_2
    move/from16 v19, v2

    move v2, v12

    :goto_2
    iget v3, v7, Ly2/j1;->x:I

    div-int/lit8 v3, v3, 0x2

    neg-int v3, v3

    iget v15, v0, Ll1/d3;->N:F

    invoke-static {v15, v2, v3}, Le93/b;->P(FII)I

    move-result v2

    invoke-static {v8, v4}, Landroidx/compose/foundation/layout/a;->i(Ll0/k1;Ly3/m;)F

    move-result v3

    mul-float/2addr v3, v11

    invoke-static {v8, v4}, Landroidx/compose/foundation/layout/a;->h(Ll0/k1;Ly3/m;)F

    move-result v8

    mul-float/2addr v8, v11

    if-nez v14, :cond_3

    move v11, v3

    const/16 v18, 0x0

    goto :goto_3

    :cond_3
    iget v11, v14, Ly2/j1;->w:I

    int-to-float v11, v11

    sub-float v20, v3, v17

    const/16 v18, 0x0

    cmpg-float v21, v20, v18

    if-gez v21, :cond_4

    move/from16 v20, v18

    :cond_4
    add-float v11, v11, v20

    :goto_3
    if-nez v10, :cond_5

    move/from16 v20, v3

    move/from16 v17, v8

    goto :goto_4

    :cond_5
    move/from16 v20, v3

    iget v3, v10, Ly2/j1;->w:I

    int-to-float v3, v3

    sub-float v17, v8, v17

    cmpg-float v21, v17, v18

    if-gez v21, :cond_6

    const/16 v17, 0x0

    :cond_6
    add-float v3, v3, v17

    move/from16 v17, v3

    :goto_4
    sget-object v3, Ly3/m;->w:Ly3/m;

    if-ne v4, v3, :cond_7

    move/from16 v21, v20

    goto :goto_5

    :cond_7
    move/from16 v21, v8

    :goto_5
    if-ne v4, v3, :cond_8

    move v3, v11

    goto :goto_6

    :cond_8
    move/from16 v3, v17

    :goto_6
    sget v22, Lm1/l0;->a:F

    move/from16 v22, v3

    iget-object v3, v6, Ll1/k4;->b:Lb2/k;

    move-object/from16 v23, v5

    iget v5, v7, Ly2/j1;->w:I

    add-float v11, v11, v17

    invoke-static {v11}, Le93/b;->X(F)I

    move-result v11

    sub-int v11, v19, v11

    invoke-virtual {v3, v5, v11, v4}, Lb2/k;->a(IILy3/m;)I

    move-result v3

    int-to-float v3, v3

    add-float v3, v3, v22

    invoke-static {v6}, Lm1/l0;->c(Ll1/k4;)Lb2/f;

    move-result-object v5

    iget v6, v7, Ly2/j1;->w:I

    add-float v8, v20, v8

    invoke-static {v8}, Le93/b;->X(F)I

    move-result v8

    sub-int v8, v19, v8

    check-cast v5, Lb2/k;

    invoke-virtual {v5, v6, v8, v4}, Lb2/k;->a(IILy3/m;)I

    move-result v4

    int-to-float v4, v4

    add-float v4, v4, v21

    invoke-static {v3, v4, v15}, Le93/b;->O(FFF)F

    move-result v3

    invoke-static {v3}, Le93/b;->X(F)I

    move-result v3

    const/4 v15, 0x0

    invoke-virtual {v1, v7, v3, v2, v15}, Ly2/i1;->f(Ly2/j1;IIF)V

    goto :goto_7

    :cond_9
    move/from16 v19, v2

    move v15, v3

    move-object/from16 v23, v5

    :goto_7
    iget-object v8, v0, Ll1/d3;->F:Ly2/j1;

    if-eqz v8, :cond_b

    if-eqz v14, :cond_a

    iget v2, v14, Ly2/j1;->w:I

    :goto_8
    move v6, v12

    move v5, v13

    move-object/from16 v4, v23

    const/4 v3, 0x0

    goto :goto_9

    :cond_a
    const/4 v2, 0x0

    goto :goto_8

    :goto_9
    invoke-static/range {v3 .. v8}, Ll1/e3;->j(ILl1/e3;IILy2/j1;Ly2/j1;)I

    move-result v11

    invoke-static {v8, v2, v11, v1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    goto :goto_a

    :cond_b
    move v6, v12

    move v5, v13

    move-object/from16 v4, v23

    const/4 v3, 0x0

    :goto_a
    if-eqz v14, :cond_c

    iget v2, v14, Ly2/j1;->w:I

    goto :goto_b

    :cond_c
    const/4 v2, 0x0

    :goto_b
    if-eqz v8, :cond_d

    iget v8, v8, Ly2/j1;->w:I

    goto :goto_c

    :cond_d
    const/4 v8, 0x0

    :goto_c
    add-int/2addr v2, v8

    iget-object v8, v0, Ll1/d3;->H:Ly2/j1;

    invoke-static/range {v3 .. v8}, Ll1/e3;->j(ILl1/e3;IILy2/j1;Ly2/j1;)I

    move-result v11

    invoke-static {v8, v2, v11, v1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    iget-object v8, v0, Ll1/d3;->J:Ly2/j1;

    if-eqz v8, :cond_e

    invoke-static/range {v3 .. v8}, Ll1/e3;->j(ILl1/e3;IILy2/j1;Ly2/j1;)I

    move-result v11

    invoke-static {v8, v2, v11, v1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    :cond_e
    iget-object v8, v0, Ll1/d3;->G:Ly2/j1;

    if-eqz v8, :cond_10

    if-eqz v10, :cond_f

    iget v2, v10, Ly2/j1;->w:I

    goto :goto_d

    :cond_f
    const/4 v2, 0x0

    :goto_d
    sub-int v2, v19, v2

    iget v11, v8, Ly2/j1;->w:I

    sub-int/2addr v2, v11

    invoke-static/range {v3 .. v8}, Ll1/e3;->j(ILl1/e3;IILy2/j1;Ly2/j1;)I

    move-result v3

    invoke-static {v8, v2, v3, v1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    :cond_10
    if-eqz v10, :cond_11

    iget v2, v10, Ly2/j1;->w:I

    sub-int v2, v19, v2

    iget v3, v10, Ly2/j1;->x:I

    sub-int v13, v5, v3

    int-to-float v3, v13

    div-float v3, v3, v16

    const/4 v4, 0x1

    int-to-float v4, v4

    invoke-static {v4, v15, v3}, Ldc/b;->a(FFF)I

    move-result v3

    invoke-static {v10, v2, v3, v1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    :cond_11
    if-eqz v9, :cond_12

    const/4 v10, 0x0

    invoke-static {v9, v10, v5, v1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    :cond_12
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
