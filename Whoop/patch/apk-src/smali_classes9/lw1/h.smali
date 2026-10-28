.class public abstract Llw1/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a1\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\'\u0010\u000c\u001a\u00020\u00052\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Llw1/i;",
        "option",
        "",
        "isHolidayPromoActive",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClick",
        "j",
        "(Llw1/i;ZLc93/a;Landroidx/compose/runtime/Composer;II)V",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "content",
        "h",
        "(Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;II)V",
        "membership_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0}, Llw1/h;->o(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llw1/i;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Llw1/h;->m(Llw1/i;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Llw1/i;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Llw1/h;->p(Llw1/i;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Ll83/a0;
    .locals 1

    invoke-static {}, Llw1/h;->k()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0}, Llw1/h;->n(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroidx/compose/ui/Modifier;Lc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Llw1/h;->i(Landroidx/compose/ui/Modifier;Lc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llw1/h;->l(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;II)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lc93/m;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    const-string v0, "content"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const v0, 0x608552f6

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, p3, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_2

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p3

    goto :goto_1

    :cond_2
    move v1, p3

    :goto_1
    and-int/lit8 v2, p3, 0x30

    if-nez v2, :cond_4

    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/16 v2, 0x20

    goto :goto_2

    :cond_3
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_4
    and-int/lit8 v2, v1, 0x13

    const/16 v3, 0x12

    const/4 v4, 0x1

    if-eq v2, v3, :cond_5

    move v2, v4

    goto :goto_3

    :cond_5
    const/4 v2, 0x0

    :goto_3
    and-int/lit8 v3, v1, 0x1

    invoke-virtual {p2, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_b

    if-eqz v0, :cond_6

    sget-object p0, Lb2/t;->w:Lb2/t;

    :cond_6
    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v0, v2, :cond_7

    sget-object v0, Llw1/h$a;->a:Llw1/h$a;

    invoke-virtual {p2, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v0, Ly2/r0;

    shr-int/lit8 v2, v1, 0x3

    and-int/lit8 v2, v2, 0xe

    or-int/lit16 v2, v2, 0x180

    shl-int/lit8 v1, v1, 0x3

    and-int/lit8 v1, v1, 0x70

    or-int/2addr v1, v2

    iget-wide v2, p2, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {p2}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {p2, p0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    shl-int/lit8 v1, v1, 0x6

    and-int/lit16 v1, v1, 0x380

    or-int/lit8 v1, v1, 0x6

    invoke-virtual {p2}, Lp1/q;->i0()V

    iget-boolean v7, p2, Lp1/q;->S:Z

    if-eqz v7, :cond_8

    invoke-virtual {p2, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_8
    invoke-virtual {p2}, Lp1/q;->s0()V

    :goto_4
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {p2, v6, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {p2, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v3, p2, Lp1/q;->S:Z

    if-nez v3, :cond_9

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    :cond_9
    invoke-static {v2, p2, v2, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {p2, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v0, v1, 0x6

    and-int/lit8 v0, v0, 0xe

    invoke-static {v0, p1, p2, v4}, Ldc/b;->z(ILc93/m;Lp1/q;Z)V

    :goto_5
    move-object v6, p0

    goto :goto_6

    :cond_b
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_5

    :goto_6
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_c

    new-instance v5, Lfo2/b;

    const/4 v10, 0x2

    move-object v7, p1

    move v8, p3

    move v9, p4

    invoke-direct/range {v5 .. v10}, Lfo2/b;-><init>(Landroidx/compose/ui/Modifier;Lc93/m;III)V

    iput-object v5, p0, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final i(Landroidx/compose/ui/Modifier;Lc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Llw1/h;->h(Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final j(Llw1/i;ZLc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 65
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llw1/i;",
            "Z",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v4, p4

    const-string v0, "option"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, -0x17a7acbc

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    const/4 v2, 0x4

    const/4 v3, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v5, p5, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move/from16 v6, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v4, 0x30

    if-nez v6, :cond_2

    move/from16 v6, p1

    invoke-virtual {v10, v6}, Lp1/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v0, v7

    :goto_3
    and-int/lit8 v7, p5, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v9, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v9, v4, 0x180

    if-nez v9, :cond_5

    move-object/from16 v9, p2

    invoke-virtual {v10, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    const/16 v11, 0x100

    goto :goto_4

    :cond_7
    const/16 v11, 0x80

    :goto_4
    or-int/2addr v0, v11

    :goto_5
    and-int/lit16 v11, v0, 0x93

    const/16 v12, 0x92

    const/4 v14, 0x0

    if-eq v11, v12, :cond_8

    const/4 v11, 0x1

    goto :goto_6

    :cond_8
    move v11, v14

    :goto_6
    and-int/lit8 v12, v0, 0x1

    invoke-virtual {v10, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_33

    if-eqz v5, :cond_9

    move/from16 v35, v14

    goto :goto_7

    :cond_9
    move/from16 v35, v6

    :goto_7
    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_b

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v5, :cond_a

    new-instance v6, Llt2/a;

    const/4 v7, 0x2

    invoke-direct {v6, v7}, Llt2/a;-><init>(I)V

    invoke-virtual {v10, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v6, Lc93/a;

    goto :goto_8

    :cond_b
    move-object v6, v9

    :goto_8
    invoke-virtual {v1}, Llw1/i;->l()Ljava/lang/String;

    move-result-object v7

    sget-object v9, Lb2/t;->w:Lb2/t;

    const/high16 v11, 0x7fc00000    # Float.NaN

    const/4 v12, 0x3

    if-eqz v7, :cond_e

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_c

    goto :goto_9

    :cond_c
    const v7, 0x3e84b38e

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    invoke-virtual {v1}, Llw1/i;->j()Z

    move-result v7

    if-eqz v7, :cond_d

    int-to-float v11, v3

    :cond_d
    invoke-static {}, Lgb1/b0;->C0()Li2/t;

    move-result-object v7

    int-to-float v15, v12

    int-to-float v8, v2

    mul-float/2addr v15, v8

    invoke-static {v15}, Lt0/j;->e(F)Lt0/i;

    move-result-object v8

    invoke-static {v11, v9, v7, v8}, Lge3/g;->i(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    goto :goto_a

    :cond_e
    :goto_9
    const v7, 0x3e87f10c

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Llw1/i;->j()Z

    move-result v7

    if-eqz v7, :cond_f

    int-to-float v11, v3

    :cond_f
    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v7, v10, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v7

    int-to-float v15, v12

    int-to-float v3, v2

    mul-float/2addr v15, v3

    invoke-static {v15}, Lt0/j;->e(F)Lt0/i;

    move-result-object v3

    invoke-static {v9, v11, v7, v8, v3}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    :goto_a
    sget-object v3, Lb2/e;->w:Lb2/m;

    invoke-static {v3, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v14, v10, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v10, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v2, v10, Lp1/q;->S:Z

    if-eqz v2, :cond_10

    invoke-virtual {v10, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_10
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_b
    sget-object v2, La3/k;->g:La3/i;

    invoke-static {v10, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v10, v3, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v12, v10, Lp1/q;->S:Z

    if-nez v12, :cond_11

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_12

    :cond_11
    invoke-static {v11, v10, v11, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    sget-object v11, La3/k;->d:La3/i;

    invoke-static {v10, v11, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz v35, :cond_13

    const/16 v12, 0x96

    :goto_c
    int-to-float v12, v12

    goto :goto_d

    :cond_13
    const/16 v12, 0x78

    goto :goto_c

    :goto_d
    const/4 v13, 0x0

    const/4 v15, 0x1

    invoke-static {v9, v13, v12, v15}, Landroidx/compose/foundation/layout/d;->b(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v18

    and-int/lit16 v0, v0, 0x380

    const/16 v12, 0x100

    if-ne v0, v12, :cond_14

    const/4 v15, 0x1

    goto :goto_e

    :cond_14
    const/4 v15, 0x0

    :goto_e
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v15, :cond_15

    if-ne v0, v5, :cond_16

    :cond_15
    new-instance v0, Llq2/k;

    const/4 v12, 0x5

    invoke-direct {v0, v6, v12}, Llq2/k;-><init>(Lc93/a;I)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    move-object/from16 v22, v0

    check-cast v22, Lc93/a;

    const/16 v23, 0xf

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v18 .. v23}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v15, 0x1

    int-to-float v12, v15

    const/16 v13, 0x8

    int-to-float v13, v13

    mul-float v15, v12, v13

    invoke-static {v15, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v18, v6

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v6, Lx81/d;->a:Lx81/d;

    move/from16 v19, v12

    sget v12, Lx81/d;->b:I

    invoke-virtual {v6, v10, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v20

    move-object/from16 v21, v5

    invoke-virtual/range {v20 .. v20}, Ly81/i;->W0()J

    move-result-wide v4

    move/from16 v20, v13

    const/4 v13, 0x3

    int-to-float v13, v13

    move/from16 p2, v15

    const/4 v15, 0x4

    int-to-float v15, v15

    invoke-static {v0, v13, v15, v4, v5}, Lr80/c;->e(Landroidx/compose/ui/Modifier;FFJ)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-interface {v0, v7}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v4, Lb2/e;->E:Lb2/m;

    const/4 v5, 0x0

    invoke-static {v4, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    move-object/from16 p1, v6

    iget-wide v5, v10, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v10, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v15, v10, Lp1/q;->S:Z

    if-eqz v15, :cond_17

    invoke-virtual {v10, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_17
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_f
    invoke-static {v10, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v10, Lp1/q;->S:Z

    if-nez v6, :cond_18

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_19

    :cond_18
    invoke-static {v5, v10, v5, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_19
    invoke-static {v10, v11, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v0, 0x2

    int-to-float v5, v0

    mul-float v5, v5, v20

    invoke-static {v5, v9}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, Lb2/e;->K:Lb2/l;

    sget-object v6, Ll0/m;->a:Ll0/e;

    const/16 v7, 0x30

    invoke-static {v6, v5, v10, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    move-object v15, v14

    iget-wide v13, v10, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v10, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-eqz v7, :cond_1a

    invoke-virtual {v10, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_1a
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_10
    invoke-static {v10, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v3, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v10, Lp1/q;->S:Z

    if-nez v5, :cond_1b

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1c

    :cond_1b
    invoke-static {v13, v10, v13, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1c
    invoke-static {v10, v11, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Lb2/e;->M:Lb2/k;

    invoke-static/range {p2 .. p2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    const/16 v7, 0x36

    invoke-static {v5, v0, v10, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v13, v10, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v10, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v14, v10, Lp1/q;->S:Z

    if-eqz v14, :cond_1d

    invoke-virtual {v10, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_1d
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_11
    invoke-static {v10, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-nez v0, :cond_1e

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1f

    :cond_1e
    invoke-static {v5, v10, v5, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1f
    invoke-static {v10, v11, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Llw1/i;->m()Ljava/lang/String;

    move-result-object v5

    move-object/from16 v0, p1

    invoke-virtual {v0, v10, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->O()Lb91/a;

    move-result-object v7

    invoke-virtual {v0, v10, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v13

    invoke-virtual {v13}, Lb91/d;->O()Lb91/a;

    move-result-object v13

    invoke-virtual {v13}, Lb91/a;->d()Ll3/v0;

    move-result-object v36

    invoke-virtual {v0, v10, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->y()J

    move-result-wide v37

    const/16 v49, 0x0

    const v50, 0xfffffe

    const-wide/16 v39, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const-wide/16 v43, 0x0

    const/16 v45, 0x0

    const-wide/16 v46, 0x0

    const/16 v48, 0x0

    invoke-static/range {v36 .. v50}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v13

    const/4 v14, 0x0

    const/4 v0, 0x2

    invoke-static {v7, v13, v14, v0, v14}, Lb91/a;->c(Lb91/a;Ll3/v0;Lb91/b;ILjava/lang/Object;)Lb91/a;

    move-result-object v25

    sget v0, Lb91/a;->d:I

    shl-int/lit8 v29, v0, 0x12

    const v30, 0x2fffe

    move-object v0, v6

    const/4 v6, 0x0

    move-object v13, v8

    const-wide/16 v7, 0x0

    move-object/from16 v22, v9

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    move-object/from16 v23, v11

    const/4 v11, 0x0

    move/from16 v24, v12

    const/4 v12, 0x0

    move-object/from16 v26, v13

    const/4 v13, 0x0

    move-object/from16 v31, v14

    move-object/from16 v28, v15

    const-wide/16 v14, 0x0

    const/16 v32, 0x0

    const/16 v16, 0x0

    const/16 v33, 0x1

    const/16 v17, 0x0

    move-object/from16 v34, v18

    move/from16 v36, v19

    const-wide/16 v18, 0x0

    const/16 v37, 0x30

    const/16 v20, 0x0

    move-object/from16 v38, v21

    const/16 v21, 0x0

    move-object/from16 v39, v22

    const/16 v22, 0x0

    move-object/from16 v40, v23

    const/16 v23, 0x0

    move/from16 v41, v24

    const/16 v24, 0x0

    move-object/from16 v42, v26

    const/16 v26, 0x0

    move-object/from16 v43, v28

    const/16 v28, 0x0

    move-object/from16 v53, p1

    move-object/from16 v55, v0

    move-object/from16 p1, v4

    move/from16 v0, v33

    move/from16 v52, v36

    move-object/from16 v57, v38

    move-object/from16 v56, v39

    move-object/from16 v51, v40

    move/from16 v54, v41

    move-object/from16 v4, v42

    const/high16 v1, 0x3f800000    # 1.0f

    move-object/from16 v36, v34

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    move/from16 v37, v29

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    float-to-double v5, v1

    const-wide/16 v7, 0x0

    cmpl-double v5, v5, v7

    if-lez v5, :cond_20

    goto :goto_12

    :cond_20
    const-string v5, "invalid weight; must be greater than zero"

    invoke-static {v5}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_12
    invoke-static {v1, v0, v10}, Ldc/b;->y(FZLp1/q;)V

    sget-object v1, Lb2/e;->O:Lb2/k;

    sget-object v5, Ll0/m;->c:Ll0/g;

    const/16 v6, 0x30

    invoke-static {v5, v1, v10, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v7, v10, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    move-object/from16 v8, v56

    invoke-static {v10, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-eqz v11, :cond_21

    invoke-virtual {v10, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_13

    :cond_21
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_13
    invoke-static {v10, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v10, Lp1/q;->S:Z

    if-nez v1, :cond_22

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_23

    :cond_22
    move-object/from16 v1, v43

    goto :goto_15

    :cond_23
    move-object/from16 v1, v43

    :goto_14
    move-object/from16 v5, v51

    goto :goto_16

    :goto_15
    invoke-static {v5, v10, v5, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_14

    :goto_16
    invoke-static {v10, v5, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Llw1/i;->l()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_24

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_25

    :cond_24
    move-object/from16 v43, v1

    move-object/from16 v40, v5

    move v1, v6

    move-object v0, v8

    move-object/from16 v61, v53

    move/from16 v62, v54

    const/4 v5, 0x0

    goto/16 :goto_17

    :cond_25
    const v7, -0xf34c620

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Llw1/i;->l()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget-object v16, Lhy0/o1;->HOLIDAY:Lhy0/o1;

    move-object/from16 v9, v53

    move/from16 v11, v54

    invoke-virtual {v9, v10, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->w()J

    move-result-wide v12

    const/high16 v14, 0x30000000

    sget v15, Lcom/whoop/design/util/TextResource;->$stable:I

    or-int v31, v15, v14

    const/16 v33, 0x0

    const v34, 0x7ffdf6

    move-object/from16 v51, v5

    move/from16 v58, v6

    move-object v5, v7

    const-wide/16 v6, 0x0

    move-object/from16 v22, v8

    const/4 v8, 0x0

    move/from16 v41, v11

    const/4 v11, 0x0

    move-object/from16 v27, v10

    move-wide v9, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v39, v22

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object/from16 v30, v27

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v32, 0x0

    move-object/from16 v43, v1

    move-object/from16 v0, v39

    move/from16 v62, v41

    move-object/from16 v40, v51

    move-object/from16 v61, v53

    move/from16 v1, v58

    invoke-static/range {v5 .. v34}, Lhy0/g1;->j(Lcom/whoop/design/util/TextResource;JLi91/d;JLi2/t;ZLy71/g;Li2/t;FLhy0/o1;Li2/a1;FFLy71/g;Li2/x;FLhy0/c1;Lkd1/o;Ljava/util/List;IILandroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v10, v30

    const/4 v5, 0x0

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    goto :goto_18

    :goto_17
    const v6, -0xf31243f

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    :goto_18
    sget-object v6, Lb2/e;->L:Lb2/l;

    move-object/from16 v7, v55

    invoke-static {v7, v6, v10, v1}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v7, v10, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v10, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-eqz v11, :cond_26

    invoke-virtual {v10, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_19

    :cond_26
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_19
    invoke-static {v10, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v10, Lp1/q;->S:Z

    if-nez v6, :cond_27

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_28

    :cond_27
    move-object/from16 v6, v43

    goto :goto_1b

    :cond_28
    move-object/from16 v6, v43

    :goto_1a
    move-object/from16 v7, v40

    goto :goto_1c

    :goto_1b
    invoke-static {v7, v10, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_1a

    :goto_1c
    invoke-static {v10, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move v13, v5

    invoke-virtual/range {p0 .. p0}, Llw1/i;->g()Ljava/lang/String;

    move-result-object v5

    move-object/from16 v9, v61

    move/from16 v11, v62

    invoke-virtual {v9, v10, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->y()Lb91/a;

    move-result-object v8

    invoke-virtual {v9, v10, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v12

    invoke-virtual {v12}, Lb91/d;->y()Lb91/a;

    move-result-object v12

    invoke-virtual {v12}, Lb91/a;->d()Ll3/v0;

    move-result-object v14

    invoke-virtual {v9, v10, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->y()J

    move-result-wide v15

    const/16 v27, 0x0

    const v28, 0xfffffe

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    invoke-static/range {v14 .. v28}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v9

    const/4 v11, 0x2

    const/4 v12, 0x0

    invoke-static {v8, v9, v12, v11, v12}, Lb91/a;->c(Lb91/a;Ll3/v0;Lb91/b;ILjava/lang/Object;)Lb91/a;

    move-result-object v25

    const/16 v28, 0x0

    const v30, 0x2fffe

    move-object/from16 v43, v6

    const/4 v6, 0x0

    move-object/from16 v51, v7

    const-wide/16 v7, 0x0

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    move-object/from16 v59, v12

    const/4 v12, 0x0

    move/from16 v60, v13

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    move-object/from16 p2, v3

    move/from16 v29, v37

    move-object/from16 v63, v43

    move-object/from16 v64, v51

    move-object/from16 v3, v59

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    const/4 v15, 0x1

    invoke-virtual {v10, v15}, Lp1/q;->q(Z)V

    new-instance v5, Lkk1/b;

    const/16 v6, 0x17

    move-object/from16 v13, p0

    invoke-direct {v5, v13, v6}, Lkk1/b;-><init>(Ljava/lang/Object;I)V

    const v6, 0xe2c61dc

    invoke-static {v6, v10, v5}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    invoke-static {v3, v5, v10, v1, v15}, Llw1/h;->h(Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v15}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v15}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v15}, Lp1/q;->q(Z)V

    invoke-virtual {v13}, Llw1/i;->j()Z

    move-result v1

    if-eqz v1, :cond_32

    const v1, 0x34a98418

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lb2/e;->y:Lb2/m;

    sget-object v3, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v3, v0, v1}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, -0x1

    int-to-float v1, v1

    move/from16 v3, v52

    invoke-static {v0, v1, v3}, Landroidx/compose/foundation/layout/a;->m(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v13}, Llw1/i;->l()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2a

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_29

    goto :goto_1e

    :cond_29
    const/16 v38, 0x0

    :goto_1d
    const/4 v15, 0x1

    goto :goto_1f

    :cond_2a
    :goto_1e
    const/16 v38, 0x1

    goto :goto_1d

    :goto_1f
    xor-int/lit8 v1, v38, 0x1

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v5, v57

    if-ne v3, v5, :cond_2b

    new-instance v3, Llive/hms/video/media/capturers/camera/utils/a;

    const/16 v6, 0x1a

    invoke-direct {v3, v6}, Llive/hms/video/media/capturers/camera/utils/a;-><init>(I)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2b
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v3}, Lgb1/d;->b(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v13}, Llw1/i;->l()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2d

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_2c

    goto :goto_20

    :cond_2c
    const/4 v1, 0x0

    goto :goto_21

    :cond_2d
    :goto_20
    const/4 v1, 0x1

    :goto_21
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v5, :cond_2e

    new-instance v3, Llive/hms/video/media/capturers/camera/utils/a;

    const/16 v5, 0x1b

    invoke-direct {v3, v5}, Llive/hms/video/media/capturers/camera/utils/a;-><init>(I)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2e
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v3}, Lgb1/d;->b(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v1, 0x1c

    int-to-float v1, v1

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v1, p1

    const/4 v3, 0x0

    invoke-static {v1, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v5, v10, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v10, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-eqz v7, :cond_2f

    invoke-virtual {v10, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_22

    :cond_2f
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_22
    invoke-static {v10, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v1, p2

    invoke-static {v10, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v10, Lp1/q;->S:Z

    if-nez v1, :cond_30

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_31

    :cond_30
    move-object/from16 v15, v63

    goto :goto_24

    :cond_31
    :goto_23
    move-object/from16 v5, v64

    goto :goto_25

    :goto_24
    invoke-static {v5, v10, v5, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_23

    :goto_25
    invoke-static {v10, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Lgz0/m0;->SELECTED_CHECK:Lgz0/m0;

    invoke-virtual {v0}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    const/4 v1, 0x6

    invoke-static {v0, v10, v1}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v5

    sget-wide v8, Li2/x;->b:J

    const/16 v11, 0xc30

    const/4 v12, 0x4

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v15, 0x1

    invoke-virtual {v10, v15}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    goto :goto_26

    :cond_32
    const/4 v3, 0x0

    const/4 v15, 0x1

    const v0, 0x34b475b8

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    :goto_26
    invoke-virtual {v10, v15}, Lp1/q;->q(Z)V

    move/from16 v2, v35

    move-object/from16 v3, v36

    goto :goto_27

    :cond_33
    move-object v13, v1

    invoke-virtual {v10}, Lp1/q;->X()V

    move v2, v6

    move-object v3, v9

    :goto_27
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_34

    new-instance v0, Lbg0/h;

    const/16 v6, 0x14

    move/from16 v4, p4

    move/from16 v5, p5

    move-object v1, v13

    invoke-direct/range {v0 .. v6}, Lbg0/h;-><init>(Ljava/lang/Object;ZLjava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_34
    return-void
.end method

.method private static final k()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final l(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Llw1/i;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 31

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v4, p2, 0x1

    move-object/from16 v5, p1

    check-cast v5, Lp1/q;

    invoke-virtual {v5, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual/range {p0 .. p0}, Llw1/i;->h()Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x0

    if-nez v0, :cond_1

    const v0, 0x5ed0f76f

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    move-object v0, v5

    goto :goto_1

    :cond_1
    const v6, 0x5ed0f770

    invoke-virtual {v5, v6}, Lp1/q;->e0(I)V

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v5, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->p()Lb91/a;

    move-result-object v8

    invoke-virtual {v6, v5, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->p()Lb91/a;

    move-result-object v9

    invoke-virtual {v9}, Lb91/a;->d()Ll3/v0;

    move-result-object v10

    invoke-virtual {v6, v5, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->F()J

    move-result-wide v11

    const/16 v23, 0x0

    const v24, 0xff7ffe

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x2

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    invoke-static/range {v10 .. v24}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v6

    invoke-static {v8, v6, v4, v3, v4}, Lb91/a;->c(Lb91/a;Ll3/v0;Lb91/b;ILjava/lang/Object;)Lb91/a;

    move-result-object v25

    sget v6, Lb91/a;->d:I

    shl-int/lit8 v29, v6, 0x12

    const v30, 0x2fffe

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    move-object/from16 v27, v5

    move-object v5, v0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v27

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    :goto_1
    invoke-virtual/range {p0 .. p0}, Llw1/i;->k()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_2

    const v1, 0x5ed96d8f

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    goto/16 :goto_2

    :cond_2
    const v6, 0x5ed96d90

    invoke-virtual {v0, v6}, Lp1/q;->e0(I)V

    int-to-float v1, v1

    const/16 v6, 0x8

    int-to-float v6, v6

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v6, v7, v0}, Ly00/t7;->p(FFLb2/t;Lp1/q;)V

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v1, v0, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->p()Lb91/a;

    move-result-object v7

    invoke-virtual {v1, v0, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->p()Lb91/a;

    move-result-object v8

    invoke-virtual {v8}, Lb91/a;->d()Ll3/v0;

    move-result-object v9

    invoke-virtual {v1, v0, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->F()J

    move-result-wide v10

    const/16 v22, 0x0

    const v23, 0xff6ffe

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x2

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    invoke-static/range {v9 .. v23}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v1

    invoke-static {v7, v1, v4, v3, v4}, Lb91/a;->c(Lb91/a;Ll3/v0;Lb91/b;ILjava/lang/Object;)Lb91/a;

    move-result-object v25

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v29, v1, 0x12

    const v30, 0x2fffe

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    move-object/from16 v27, v0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_3
    move-object v0, v5

    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final n(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 4

    const-string v0, "$this$applyIf"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lgb1/b0;->C0()Li2/t;

    move-result-object v0

    const/4 v1, 0x2

    int-to-float v1, v1

    const/4 v2, 0x4

    int-to-float v3, v2

    mul-float/2addr v1, v3

    invoke-static {v1}, Lt0/j;->e(F)Lt0/i;

    move-result-object v1

    const/4 v3, 0x0

    invoke-static {p0, v0, v1, v3, v2}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final o(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 4

    const-string v0, "$this$applyIf"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Li2/x;->o:I

    sget-wide v0, Li2/x;->f:J

    const/4 v2, 0x2

    int-to-float v2, v2

    const/4 v3, 0x4

    int-to-float v3, v3

    invoke-static {p0, v2, v3, v0, v1}, Lr80/c;->e(Landroidx/compose/ui/Modifier;FFJ)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final p(Llw1/i;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Llw1/h;->j(Llw1/i;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
