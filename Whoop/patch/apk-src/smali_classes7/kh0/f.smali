.class public abstract Lkh0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a?\u0010\u0008\u001a\u00020\u00062\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0016\u0008\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "",
        "Lkd1/o;",
        "imageSources",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onImageClick",
        "c",
        "(Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "bot_release"
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 1

    move-object v0, p1

    move-object p1, p0

    move-object p0, v0

    invoke-static/range {p0 .. p6}, Lkh0/f;->e(Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lkd1/o;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lkh0/f;->d(Lkotlin/jvm/functions/Function1;Lkd1/o;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lkd1/o;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v4, p4

    const-string v0, "imageSources"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    const v0, -0x58888b0a

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    const/4 v2, 0x2

    const/4 v3, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

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
    move-object/from16 v6, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v4, 0x30

    if-nez v6, :cond_2

    move-object/from16 v6, p1

    invoke-virtual {v12, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

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

    const/16 v15, 0x100

    if-eqz v7, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v8, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v4, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v12, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    move v9, v15

    goto :goto_4

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v0, v9

    :goto_5
    and-int/lit16 v9, v0, 0x93

    const/16 v10, 0x92

    const/4 v11, 0x1

    const/4 v13, 0x0

    if-eq v9, v10, :cond_8

    move v9, v11

    goto :goto_6

    :cond_8
    move v9, v13

    :goto_6
    and-int/lit8 v10, v0, 0x1

    invoke-virtual {v12, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_14

    sget-object v14, Lb2/t;->w:Lb2/t;

    if-eqz v5, :cond_9

    move-object v5, v14

    goto :goto_7

    :cond_9
    move-object v5, v6

    :goto_7
    const/16 v16, 0x0

    if-eqz v7, :cond_a

    move-object/from16 v8, v16

    :cond_a
    invoke-static {v13, v12, v11}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v6

    invoke-static {v5, v6, v11, v13}, Lq83/g;->V(Landroidx/compose/ui/Modifier;Lf0/r1;ZZ)Landroidx/compose/ui/Modifier;

    move-result-object v6

    int-to-float v7, v11

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float/2addr v7, v9

    invoke-static {v7}, Ll0/m;->i(F)Ll0/k;

    move-result-object v7

    sget-object v9, Lb2/e;->J:Lb2/l;

    const/4 v10, 0x6

    invoke-static {v7, v9, v12, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v9, v12, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v12, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v13, v12, Lp1/q;->S:Z

    if-eqz v13, :cond_b

    invoke-virtual {v12, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_b
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_8
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v12, v11, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v12, v7, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-nez v10, :cond_c

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_d

    :cond_c
    invoke-static {v9, v12, v9, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v12, v7, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v6, -0x6cbc3063

    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    move-object v6, v1

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v18

    const/4 v11, 0x0

    :goto_9
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_13

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v19, v11, 0x1

    if-ltz v11, :cond_12

    check-cast v6, Lkd1/o;

    sget v9, Lkd1/o;->a:I

    const/4 v10, 0x3

    move-object v7, v5

    move-object v5, v6

    const/4 v6, 0x0

    move-object v13, v7

    const/4 v7, 0x0

    move-object/from16 v20, v12

    move-object v12, v8

    move-object/from16 v8, v20

    move-object/from16 v20, v13

    invoke-static/range {v5 .. v10}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v6

    const/16 v7, 0xbe

    int-to-float v7, v7

    const/16 v9, 0xa0

    int-to-float v9, v9

    invoke-static {v14, v9, v7}, Landroidx/compose/foundation/layout/d;->r(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v7

    int-to-float v9, v2

    int-to-float v10, v3

    invoke-static {v7, v9, v10}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v9, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v9, v8, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->W0()J

    move-result-wide v9

    sget-object v13, Li2/w0;->a:Li2/v0;

    invoke-static {v7, v9, v10, v13}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    if-eqz v12, :cond_11

    const v9, -0x1c81682a

    invoke-virtual {v8, v9}, Lp1/q;->e0(I)V

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "chat_carousel_image_"

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v14, v9}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v21

    and-int/lit16 v9, v0, 0x380

    if-ne v9, v15, :cond_e

    const/4 v9, 0x1

    goto :goto_a

    :cond_e
    const/4 v9, 0x0

    :goto_a
    invoke-virtual {v8, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v9, v10

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_f

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v10, v9, :cond_10

    :cond_f
    new-instance v10, Lj11/q;

    const/16 v9, 0x12

    invoke-direct {v10, v9, v12, v5}, Lj11/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    move-object/from16 v25, v10

    check-cast v25, Lc93/a;

    const/16 v26, 0xf

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-static/range {v21 .. v26}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v9, 0x0

    invoke-virtual {v8, v9}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_11
    const/4 v9, 0x0

    const v5, -0x1c7e4f1f

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v9}, Lp1/q;->q(Z)V

    move-object v5, v14

    :goto_b
    invoke-interface {v7, v5}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v13, 0x6030

    move-object v5, v14

    const/16 v14, 0x68

    move-object v10, v5

    move-object v5, v6

    const/4 v6, 0x0

    move-object v11, v12

    move-object v12, v8

    const/4 v8, 0x0

    move/from16 v17, v9

    sget-object v9, Ly2/j;->a:Ly2/b1;

    move-object/from16 v21, v10

    const/4 v10, 0x0

    move-object/from16 v22, v11

    const/4 v11, 0x0

    move/from16 v3, v17

    const/4 v2, 0x1

    invoke-static/range {v5 .. v14}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move/from16 v11, v19

    move-object/from16 v5, v20

    move-object/from16 v14, v21

    move-object/from16 v8, v22

    const/4 v2, 0x2

    const/4 v3, 0x4

    goto/16 :goto_9

    :cond_12
    invoke-static {}, Lwb3/f;->d0()V

    throw v16

    :cond_13
    move-object/from16 v20, v5

    move-object/from16 v22, v8

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    move-object/from16 v2, v20

    move-object/from16 v3, v22

    goto :goto_c

    :cond_14
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v2, v6

    move-object v3, v8

    :goto_c
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_15

    new-instance v0, La81/k;

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, La81/k;-><init>(Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_15
    return-void
.end method

.method private static final d(Lkotlin/jvm/functions/Function1;Lkd1/o;)Ll83/a0;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lkh0/f;->c(Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
