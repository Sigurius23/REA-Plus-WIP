.class public final synthetic Lg1/v8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic G:Ly2/j1;

.field public final synthetic H:Ly2/j1;

.field public final synthetic I:Ly2/j1;

.field public final synthetic J:Ly2/j1;

.field public final synthetic K:I

.field public final synthetic L:I

.field public final synthetic M:Ly2/t0;

.field public final synthetic N:Ly2/r0;

.field public final synthetic w:I

.field public final synthetic x:Ly2/j1;

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Ly2/j1;IIIILy2/j1;Ly2/j1;Ly2/j1;Ly2/j1;Ly2/r0;IILy2/t0;I)V
    .locals 0

    iput p14, p0, Lg1/v8;->w:I

    iput-object p1, p0, Lg1/v8;->x:Ly2/j1;

    iput p2, p0, Lg1/v8;->y:I

    iput p3, p0, Lg1/v8;->z:I

    iput p4, p0, Lg1/v8;->E:I

    iput p5, p0, Lg1/v8;->F:I

    iput-object p6, p0, Lg1/v8;->G:Ly2/j1;

    iput-object p7, p0, Lg1/v8;->H:Ly2/j1;

    iput-object p8, p0, Lg1/v8;->I:Ly2/j1;

    iput-object p9, p0, Lg1/v8;->J:Ly2/j1;

    iput-object p10, p0, Lg1/v8;->N:Ly2/r0;

    iput p11, p0, Lg1/v8;->K:I

    iput p12, p0, Lg1/v8;->L:I

    iput-object p13, p0, Lg1/v8;->M:Ly2/t0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    iget v1, v0, Lg1/v8;->w:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    iget-object v7, v0, Lg1/v8;->M:Ly2/t0;

    iget v8, v0, Lg1/v8;->L:I

    iget v9, v0, Lg1/v8;->K:I

    iget-object v10, v0, Lg1/v8;->N:Ly2/r0;

    iget-object v11, v0, Lg1/v8;->J:Ly2/j1;

    iget-object v12, v0, Lg1/v8;->I:Ly2/j1;

    iget-object v13, v0, Lg1/v8;->H:Ly2/j1;

    iget-object v14, v0, Lg1/v8;->G:Ly2/j1;

    iget v15, v0, Lg1/v8;->F:I

    const/high16 v16, 0x40000000    # 2.0f

    iget v6, v0, Lg1/v8;->E:I

    iget v3, v0, Lg1/v8;->z:I

    iget v4, v0, Lg1/v8;->y:I

    iget-object v5, v0, Lg1/v8;->x:Ly2/j1;

    packed-switch v1, :pswitch_data_0

    check-cast v10, Li40/k;

    iget-boolean v1, v10, Li40/k;->a:Z

    move-object/from16 v0, p1

    check-cast v0, Ly2/i1;

    move/from16 v17, v1

    const-string v1, "$this$layout"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v5, :cond_7

    sub-int v1, v4, v3

    if-gez v1, :cond_0

    const/4 v1, 0x0

    :cond_0
    add-int/2addr v9, v8

    iget v3, v10, Li40/k;->b:F

    invoke-interface {v7}, Ly3/c;->getDensity()F

    move-result v4

    sget v7, Li40/j;->a:F

    if-eqz v12, :cond_1

    iget v7, v12, Ly2/j1;->x:I

    sub-int v7, v15, v7

    int-to-float v7, v7

    div-float v7, v7, v16

    const/4 v8, 0x1

    int-to-float v10, v8

    const/4 v8, 0x0

    invoke-static {v10, v8, v7}, Ldc/b;->a(FFF)I

    move-result v7

    const/4 v8, 0x0

    invoke-static {v12, v8, v7, v0}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    :cond_1
    if-eqz v11, :cond_2

    iget v7, v11, Ly2/j1;->w:I

    sub-int/2addr v6, v7

    iget v7, v11, Ly2/j1;->x:I

    sub-int v7, v15, v7

    int-to-float v7, v7

    div-float v7, v7, v16

    const/4 v8, 0x1

    int-to-float v10, v8

    const/4 v8, 0x0

    invoke-static {v10, v8, v7}, Ldc/b;->a(FFF)I

    move-result v7

    invoke-static {v11, v6, v7, v0}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    goto :goto_0

    :cond_2
    const/4 v8, 0x0

    :goto_0
    if-eqz v17, :cond_3

    iget v4, v5, Ly2/j1;->x:I

    sub-int/2addr v15, v4

    int-to-float v4, v15

    div-float v4, v4, v16

    const/4 v6, 0x1

    int-to-float v6, v6

    invoke-static {v6, v8, v4}, Ldc/b;->a(FFF)I

    move-result v4

    goto :goto_1

    :cond_3
    sget v6, Li40/a;->b:F

    mul-float/2addr v6, v4

    invoke-static {v6}, Le93/b;->X(F)I

    move-result v4

    :goto_1
    sub-int v1, v4, v1

    int-to-float v1, v1

    mul-float/2addr v1, v3

    invoke-static {v1}, Le93/b;->X(F)I

    move-result v1

    sub-int/2addr v4, v1

    if-eqz v12, :cond_4

    iget v1, v12, Ly2/j1;->w:I

    goto :goto_2

    :cond_4
    const/4 v1, 0x0

    :goto_2
    invoke-static {v5, v1, v4, v0}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    if-eqz v12, :cond_5

    iget v1, v12, Ly2/j1;->w:I

    goto :goto_3

    :cond_5
    const/4 v1, 0x0

    :goto_3
    invoke-static {v14, v1, v9, v0}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    if-eqz v13, :cond_e

    if-eqz v12, :cond_6

    iget v3, v12, Ly2/j1;->w:I

    goto :goto_4

    :cond_6
    const/4 v3, 0x0

    :goto_4
    invoke-static {v13, v3, v9, v0}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    goto/16 :goto_9

    :cond_7
    invoke-interface {v7}, Ly3/c;->getDensity()F

    move-result v1

    iget-object v3, v10, Li40/k;->c:Ll0/l1;

    sget v4, Li40/j;->a:F

    iget v3, v3, Ll0/l1;->b:F

    mul-float/2addr v3, v1

    invoke-static {v3}, Le93/b;->X(F)I

    move-result v1

    if-eqz v12, :cond_8

    iget v3, v12, Ly2/j1;->x:I

    sub-int v3, v15, v3

    int-to-float v3, v3

    div-float v3, v3, v16

    const/4 v8, 0x1

    int-to-float v4, v8

    const/4 v8, 0x0

    invoke-static {v4, v8, v3}, Ldc/b;->a(FFF)I

    move-result v3

    const/4 v8, 0x0

    invoke-static {v12, v8, v3, v0}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    :cond_8
    if-eqz v11, :cond_9

    iget v3, v11, Ly2/j1;->w:I

    sub-int/2addr v6, v3

    iget v3, v11, Ly2/j1;->x:I

    sub-int v3, v15, v3

    int-to-float v3, v3

    div-float v3, v3, v16

    const/4 v8, 0x1

    int-to-float v4, v8

    const/4 v5, 0x0

    invoke-static {v4, v5, v3}, Ldc/b;->a(FFF)I

    move-result v3

    invoke-static {v11, v6, v3, v0}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    goto :goto_5

    :cond_9
    const/4 v5, 0x0

    const/4 v8, 0x1

    :goto_5
    if-eqz v17, :cond_a

    iget v3, v14, Ly2/j1;->x:I

    sub-int v3, v15, v3

    int-to-float v3, v3

    div-float v3, v3, v16

    int-to-float v4, v8

    invoke-static {v4, v5, v3}, Ldc/b;->a(FFF)I

    move-result v3

    goto :goto_6

    :cond_a
    move v3, v1

    :goto_6
    if-eqz v12, :cond_b

    iget v4, v12, Ly2/j1;->w:I

    goto :goto_7

    :cond_b
    const/4 v4, 0x0

    :goto_7
    invoke-static {v14, v4, v3, v0}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    if-eqz v13, :cond_e

    if-eqz v17, :cond_c

    iget v1, v13, Ly2/j1;->x:I

    sub-int/2addr v15, v1

    int-to-float v1, v15

    div-float v1, v1, v16

    const/4 v8, 0x1

    int-to-float v3, v8

    const/4 v8, 0x0

    invoke-static {v3, v8, v1}, Ldc/b;->a(FFF)I

    move-result v1

    :cond_c
    if-eqz v12, :cond_d

    iget v3, v12, Ly2/j1;->w:I

    goto :goto_8

    :cond_d
    const/4 v3, 0x0

    :goto_8
    invoke-static {v13, v3, v1, v0}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    :cond_e
    :goto_9
    return-object v2

    :pswitch_0
    check-cast v10, Lg1/x8;

    iget-boolean v0, v10, Lg1/x8;->a:Z

    move-object/from16 v1, p1

    check-cast v1, Ly2/i1;

    if-eqz v5, :cond_16

    sub-int v3, v4, v3

    if-gez v3, :cond_f

    const/4 v3, 0x0

    :cond_f
    add-int/2addr v9, v8

    iget v4, v10, Lg1/x8;->b:F

    invoke-interface {v7}, Ly3/c;->getDensity()F

    move-result v7

    sget v8, Lg1/u8;->a:F

    if-eqz v12, :cond_10

    iget v8, v12, Ly2/j1;->x:I

    sub-int v8, v15, v8

    int-to-float v8, v8

    div-float v8, v8, v16

    move/from16 v17, v0

    const/4 v10, 0x1

    int-to-float v0, v10

    const/4 v10, 0x0

    invoke-static {v0, v10, v8}, Ldc/b;->a(FFF)I

    move-result v0

    const/4 v8, 0x0

    invoke-static {v12, v8, v0, v1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    goto :goto_a

    :cond_10
    move/from16 v17, v0

    :goto_a
    if-eqz v11, :cond_11

    iget v0, v11, Ly2/j1;->w:I

    sub-int/2addr v6, v0

    iget v0, v11, Ly2/j1;->x:I

    sub-int v0, v15, v0

    int-to-float v0, v0

    div-float v0, v0, v16

    const/4 v8, 0x1

    int-to-float v10, v8

    const/4 v8, 0x0

    invoke-static {v10, v8, v0}, Ldc/b;->a(FFF)I

    move-result v0

    invoke-static {v11, v6, v0, v1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    goto :goto_b

    :cond_11
    const/4 v8, 0x0

    :goto_b
    if-eqz v17, :cond_12

    iget v0, v5, Ly2/j1;->x:I

    sub-int/2addr v15, v0

    int-to-float v0, v15

    div-float v0, v0, v16

    const/4 v6, 0x1

    int-to-float v6, v6

    invoke-static {v6, v8, v0}, Ldc/b;->a(FFF)I

    move-result v0

    goto :goto_c

    :cond_12
    sget v0, Lg1/p8;->a:F

    mul-float/2addr v0, v7

    invoke-static {v0}, Le93/b;->X(F)I

    move-result v0

    :goto_c
    sub-int v3, v0, v3

    int-to-float v3, v3

    mul-float/2addr v3, v4

    invoke-static {v3}, Le93/b;->X(F)I

    move-result v3

    sub-int/2addr v0, v3

    sget v3, Lg1/p8;->a:F

    if-eqz v12, :cond_13

    iget v8, v12, Ly2/j1;->w:I

    goto :goto_d

    :cond_13
    const/4 v8, 0x0

    :goto_d
    invoke-static {v5, v8, v0, v1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    if-eqz v12, :cond_14

    iget v8, v12, Ly2/j1;->w:I

    goto :goto_e

    :cond_14
    const/4 v8, 0x0

    :goto_e
    invoke-static {v14, v8, v9, v1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    if-eqz v13, :cond_1d

    if-eqz v12, :cond_15

    iget v3, v12, Ly2/j1;->w:I

    goto :goto_f

    :cond_15
    const/4 v3, 0x0

    :goto_f
    invoke-static {v13, v3, v9, v1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    goto/16 :goto_15

    :cond_16
    move/from16 v17, v0

    invoke-interface {v7}, Ly3/c;->getDensity()F

    move-result v0

    iget-object v3, v10, Lg1/x8;->c:Ll0/k1;

    sget v4, Lg1/u8;->a:F

    invoke-interface {v3}, Ll0/k1;->d()F

    move-result v3

    mul-float/2addr v3, v0

    invoke-static {v3}, Le93/b;->X(F)I

    move-result v0

    if-eqz v12, :cond_17

    iget v3, v12, Ly2/j1;->x:I

    sub-int v3, v15, v3

    int-to-float v3, v3

    div-float v3, v3, v16

    const/4 v8, 0x1

    int-to-float v4, v8

    const/4 v8, 0x0

    invoke-static {v4, v8, v3}, Ldc/b;->a(FFF)I

    move-result v3

    const/4 v8, 0x0

    invoke-static {v12, v8, v3, v1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    goto :goto_10

    :cond_17
    const/4 v8, 0x0

    :goto_10
    if-eqz v11, :cond_18

    iget v3, v11, Ly2/j1;->w:I

    sub-int/2addr v6, v3

    iget v3, v11, Ly2/j1;->x:I

    sub-int v3, v15, v3

    int-to-float v3, v3

    div-float v3, v3, v16

    const/4 v10, 0x1

    int-to-float v4, v10

    const/4 v5, 0x0

    invoke-static {v4, v5, v3}, Ldc/b;->a(FFF)I

    move-result v3

    invoke-static {v11, v6, v3, v1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    goto :goto_11

    :cond_18
    const/4 v5, 0x0

    const/4 v10, 0x1

    :goto_11
    if-eqz v17, :cond_19

    iget v3, v14, Ly2/j1;->x:I

    sub-int v3, v15, v3

    int-to-float v3, v3

    div-float v3, v3, v16

    int-to-float v4, v10

    invoke-static {v4, v5, v3}, Ldc/b;->a(FFF)I

    move-result v3

    goto :goto_12

    :cond_19
    move v3, v0

    :goto_12
    sget v4, Lg1/p8;->a:F

    if-eqz v12, :cond_1a

    iget v4, v12, Ly2/j1;->w:I

    goto :goto_13

    :cond_1a
    move v4, v8

    :goto_13
    invoke-static {v14, v4, v3, v1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    if-eqz v13, :cond_1d

    if-eqz v17, :cond_1b

    iget v0, v13, Ly2/j1;->x:I

    sub-int/2addr v15, v0

    int-to-float v0, v15

    div-float v0, v0, v16

    const/4 v6, 0x1

    int-to-float v3, v6

    const/4 v5, 0x0

    invoke-static {v3, v5, v0}, Ldc/b;->a(FFF)I

    move-result v0

    :cond_1b
    if-eqz v12, :cond_1c

    iget v3, v12, Ly2/j1;->w:I

    goto :goto_14

    :cond_1c
    move v3, v8

    :goto_14
    invoke-static {v13, v3, v0, v1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    :cond_1d
    :goto_15
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
