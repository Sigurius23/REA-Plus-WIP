.class public final Ll1/z2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ll83/e;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Z

.field public final synthetic z:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;ZZLq3/g0;Lj0/i;Lc93/m;Li2/a1;Ll1/e4;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ll1/z2;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/z2;->x:Ljava/lang/Object;

    iput-boolean p2, p0, Ll1/z2;->y:Z

    iput-boolean p3, p0, Ll1/z2;->z:Z

    iput-object p4, p0, Ll1/z2;->E:Ljava/lang/Object;

    iput-object p5, p0, Ll1/z2;->F:Ljava/lang/Object;

    iput-object p6, p0, Ll1/z2;->G:Ll83/e;

    iput-object p7, p0, Ll1/z2;->H:Ljava/lang/Object;

    iput-object p8, p0, Ll1/z2;->I:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZZLq3/g0;Lj0/i;Lc93/m;Ll1/e4;Li2/a1;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ll1/z2;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/z2;->x:Ljava/lang/Object;

    iput-boolean p2, p0, Ll1/z2;->y:Z

    iput-boolean p3, p0, Ll1/z2;->z:Z

    iput-object p4, p0, Ll1/z2;->E:Ljava/lang/Object;

    iput-object p5, p0, Ll1/z2;->F:Ljava/lang/Object;

    iput-object p6, p0, Ll1/z2;->G:Ll83/e;

    iput-object p7, p0, Ll1/z2;->I:Ljava/lang/Object;

    iput-object p8, p0, Ll1/z2;->H:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(ZLn0/u;Ljava/util/List;ZLh20/t0;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Ll1/z2;->w:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ll1/z2;->y:Z

    iput-object p2, p0, Ll1/z2;->x:Ljava/lang/Object;

    iput-object p3, p0, Ll1/z2;->E:Ljava/lang/Object;

    iput-boolean p4, p0, Ll1/z2;->z:Z

    iput-object p5, p0, Ll1/z2;->F:Ljava/lang/Object;

    iput-object p6, p0, Ll1/z2;->G:Ll83/e;

    iput-object p7, p0, Ll1/z2;->I:Ljava/lang/Object;

    iput-object p8, p0, Ll1/z2;->H:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    iget v1, v0, Ll1/z2;->w:I

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Ll1/z2;->E:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Ljava/util/List;

    move-object/from16 v1, p1

    check-cast v1, Ll0/v;

    move-object/from16 v2, p2

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object/from16 v4, p3

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    const-string v5, "$this$BoxWithConstraints"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v5, v4, 0x6

    const/4 v6, 0x2

    if-nez v5, :cond_1

    move-object v5, v2

    check-cast v5, Lp1/q;

    invoke-virtual {v5, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    move v5, v6

    :goto_0
    or-int/2addr v4, v5

    :cond_1
    and-int/lit8 v4, v4, 0x13

    const/16 v5, 0x12

    if-ne v4, v5, :cond_3

    move-object v4, v2

    check-cast v4, Lp1/q;

    invoke-virtual {v4}, Lp1/q;->F()Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v4}, Lp1/q;->X()V

    goto/16 :goto_3

    :cond_3
    :goto_1
    check-cast v1, Landroidx/compose/foundation/layout/c;

    invoke-virtual {v1}, Landroidx/compose/foundation/layout/c;->d()F

    move-result v1

    move-object v15, v2

    check-cast v15, Lp1/q;

    const v2, -0x42e82c8d

    invoke-virtual {v15, v2}, Lp1/q;->e0(I)V

    const v2, 0x298e40fb

    invoke-virtual {v15, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v1}, Lp1/q;->d(F)Z

    move-result v2

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-nez v2, :cond_4

    if-ne v4, v5, :cond_5

    :cond_4
    const/16 v2, 0x11

    int-to-float v2, v2

    int-to-float v4, v6

    mul-float/2addr v2, v4

    sub-float/2addr v1, v2

    const/16 v2, 0x64

    int-to-float v2, v2

    const/4 v6, 0x6

    int-to-float v6, v6

    mul-float/2addr v6, v4

    add-float/2addr v6, v2

    mul-float/2addr v4, v1

    div-float/2addr v4, v6

    float-to-int v2, v4

    int-to-float v2, v2

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v2, v4

    div-float/2addr v1, v2

    new-instance v4, Ly3/f;

    invoke-direct {v4, v1}, Ly3/f;-><init>(F)V

    invoke-virtual {v15, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v4, Ly3/f;

    iget v7, v4, Ly3/f;->w:F

    const/4 v1, 0x0

    invoke-virtual {v15, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v15, v1}, Lp1/q;->q(Z)V

    iget-boolean v2, v0, Ll1/z2;->y:Z

    xor-int/lit8 v13, v2, 0x1

    sget-object v4, Ld40/p;->f:Ld40/g;

    iget v6, v4, Ld40/g;->a:F

    const/4 v8, 0x3

    int-to-float v8, v8

    sub-float/2addr v6, v8

    int-to-float v9, v1

    cmpg-float v10, v6, v9

    if-gez v10, :cond_6

    move v6, v9

    :cond_6
    iget v4, v4, Ld40/g;->c:F

    sub-float/2addr v4, v8

    cmpg-float v8, v4, v9

    if-gez v8, :cond_7

    goto :goto_2

    :cond_7
    move v9, v4

    :goto_2
    const/16 v4, 0xa

    const/4 v8, 0x0

    invoke-static {v6, v8, v9, v8, v4}, Landroidx/compose/foundation/layout/a;->c(FFFFI)Ll0/l1;

    move-result-object v11

    iget-object v4, v0, Ll1/z2;->x:Ljava/lang/Object;

    move-object v12, v4

    check-cast v12, Ln0/u;

    const v4, -0xf911d83

    invoke-virtual {v15, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v15, v2}, Lp1/q;->h(Z)Z

    move-result v2

    or-int/2addr v2, v4

    iget-boolean v4, v0, Ll1/z2;->z:Z

    invoke-virtual {v15, v4}, Lp1/q;->h(Z)Z

    move-result v4

    or-int/2addr v2, v4

    iget-object v4, v0, Ll1/z2;->F:Ljava/lang/Object;

    check-cast v4, Lh20/t0;

    invoke-virtual {v15, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    invoke-virtual {v15, v7}, Lp1/q;->d(F)Z

    move-result v4

    or-int/2addr v2, v4

    iget-object v4, v0, Ll1/z2;->G:Ll83/e;

    check-cast v4, Lc93/a;

    invoke-virtual {v15, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    iget-object v4, v0, Ll1/z2;->I:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v15, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    iget-object v4, v0, Ll1/z2;->H:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v15, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    iget-object v4, v0, Ll1/z2;->F:Ljava/lang/Object;

    move-object v6, v4

    check-cast v6, Lh20/t0;

    iget-object v4, v0, Ll1/z2;->G:Ll83/e;

    move-object v8, v4

    check-cast v8, Lc93/a;

    iget-object v4, v0, Ll1/z2;->I:Ljava/lang/Object;

    move-object v9, v4

    check-cast v9, Lkotlin/jvm/functions/Function1;

    iget-object v4, v0, Ll1/z2;->H:Ljava/lang/Object;

    move-object v10, v4

    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_8

    if-ne v4, v5, :cond_9

    :cond_8
    new-instance v2, Lb30/l5;

    iget-boolean v4, v0, Ll1/z2;->y:Z

    iget-boolean v5, v0, Ll1/z2;->z:Z

    invoke-direct/range {v2 .. v10}, Lb30/l5;-><init>(Ljava/util/List;ZZLh20/t0;FLc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v15, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v4, v2

    :cond_9
    move-object v14, v4

    check-cast v14, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v15, v1}, Lp1/q;->q(Z)V

    const/16 v16, 0x0

    const/16 v17, 0x79

    const/4 v7, 0x0

    const/4 v10, 0x0

    move-object v9, v11

    const/4 v11, 0x0

    move-object v8, v12

    const/4 v12, 0x0

    invoke-static/range {v7 .. v17}, Lkotlin/jvm/internal/j;->e(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/i;Lb2/g;Lh0/o1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    :goto_3
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    move-object/from16 v4, p1

    check-cast v4, Lc93/m;

    move-object/from16 v1, p2

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x6

    if-nez v3, :cond_b

    move-object v3, v1

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    const/4 v3, 0x4

    goto :goto_4

    :cond_a
    const/4 v3, 0x2

    :goto_4
    or-int/2addr v2, v3

    :cond_b
    and-int/lit8 v3, v2, 0x13

    const/16 v5, 0x12

    if-eq v3, v5, :cond_c

    const/4 v3, 0x1

    goto :goto_5

    :cond_c
    const/4 v3, 0x0

    :goto_5
    and-int/lit8 v5, v2, 0x1

    move-object v14, v1

    check-cast v14, Lp1/q;

    invoke-virtual {v14, v5, v3}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_d

    move v1, v2

    sget-object v2, Ll1/h4;->a:Ll1/h4;

    iget-object v3, v0, Ll1/z2;->x:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v5, v0, Ll1/z2;->E:Ljava/lang/Object;

    move-object v7, v5

    check-cast v7, Lq3/g0;

    iget-object v5, v0, Ll1/z2;->F:Ljava/lang/Object;

    move-object v8, v5

    check-cast v8, Lj0/i;

    iget-object v5, v0, Ll1/z2;->G:Ll83/e;

    move-object v9, v5

    check-cast v9, Lc93/m;

    iget-object v5, v0, Ll1/z2;->H:Ljava/lang/Object;

    move-object v10, v5

    check-cast v10, Li2/a1;

    iget-object v5, v0, Ll1/z2;->I:Ljava/lang/Object;

    move-object v11, v5

    check-cast v11, Ll1/e4;

    shl-int/lit8 v1, v1, 0x3

    and-int/lit8 v15, v1, 0x70

    iget-boolean v5, v0, Ll1/z2;->y:Z

    iget-boolean v6, v0, Ll1/z2;->z:Z

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-virtual/range {v2 .. v15}, Ll1/h4;->b(Ljava/lang/String;Lc93/m;ZZLq3/g0;Lj0/i;Lc93/m;Li2/a1;Ll1/e4;Ll0/k1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_6

    :cond_d
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_6
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_1
    move-object/from16 v4, p1

    check-cast v4, Lc93/m;

    move-object/from16 v1, p2

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x6

    if-nez v3, :cond_f

    move-object v3, v1

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_e

    const/4 v3, 0x4

    goto :goto_7

    :cond_e
    const/4 v3, 0x2

    :goto_7
    or-int/2addr v2, v3

    :cond_f
    and-int/lit8 v3, v2, 0x13

    const/16 v5, 0x12

    if-eq v3, v5, :cond_10

    const/4 v3, 0x1

    goto :goto_8

    :cond_10
    const/4 v3, 0x0

    :goto_8
    and-int/lit8 v5, v2, 0x1

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v5, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_11

    move v3, v2

    sget-object v2, Ll1/t2;->a:Ll1/t2;

    iget-object v5, v0, Ll1/z2;->x:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v0, Ll1/z2;->E:Ljava/lang/Object;

    move-object v7, v6

    check-cast v7, Lq3/g0;

    iget-object v6, v0, Ll1/z2;->F:Ljava/lang/Object;

    move-object v8, v6

    check-cast v8, Lj0/i;

    iget-object v6, v0, Ll1/z2;->G:Ll83/e;

    check-cast v6, Lc93/m;

    iget-object v9, v0, Ll1/z2;->I:Ljava/lang/Object;

    move-object v13, v9

    check-cast v13, Ll1/e4;

    move-object v10, v8

    new-instance v8, Ll1/y2;

    iget-object v9, v0, Ll1/z2;->H:Ljava/lang/Object;

    move-object v12, v9

    check-cast v12, Li2/a1;

    move-object v11, v13

    const/4 v13, 0x0

    iget-boolean v9, v0, Ll1/z2;->y:Z

    invoke-direct/range {v8 .. v13}, Ll1/y2;-><init>(ZLj0/i;Ll1/e4;Li2/a1;I)V

    const v12, -0x27281f48

    invoke-static {v12, v1, v8}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v15

    shl-int/lit8 v3, v3, 0x3

    and-int/lit8 v17, v3, 0x70

    move-object v13, v11

    move-object v11, v6

    iget-boolean v6, v0, Ll1/z2;->z:Z

    move-object v3, v5

    move v5, v9

    const/4 v9, 0x0

    move-object v8, v10

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    move-object/from16 v16, v1

    invoke-virtual/range {v2 .. v17}, Ll1/t2;->b(Ljava/lang/String;Lc93/m;ZZLq3/g0;Lj0/i;ZLc93/m;Lc93/m;Lc93/m;Ll1/e4;Ll0/k1;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    goto :goto_9

    :cond_11
    move-object/from16 v16, v1

    invoke-virtual/range {v16 .. v16}, Lp1/q;->X()V

    :goto_9
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
