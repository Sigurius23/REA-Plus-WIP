.class public abstract Lgz2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a5\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lhz2/c;",
        "section",
        "Lkotlin/Function1;",
        "Lcom/whoop/whooplabs/feature/navigation/c;",
        "Ll83/a0;",
        "onNavEvent",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "b",
        "(Lhz2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "whooplabs_release"
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
.method public static synthetic a(Lhz2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lgz2/f;->c(Lhz2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lhz2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhz2/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v4, p0

    move-object/from16 v6, p1

    move/from16 v1, p4

    const-string v0, "section"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavEvent"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p3

    check-cast v15, Lp1/q;

    const v0, -0x2a8ab359

    invoke-virtual {v15, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v1, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v15, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    and-int/lit8 v3, v1, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v15, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :cond_3
    and-int/lit8 v3, p5, 0x4

    if-eqz v3, :cond_5

    or-int/lit16 v0, v0, 0x180

    :cond_4
    move-object/from16 v5, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v5, v1, 0x180

    if-nez v5, :cond_4

    move-object/from16 v5, p2

    invoke-virtual {v15, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x100

    goto :goto_3

    :cond_6
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v0, v7

    :goto_4
    and-int/lit16 v7, v0, 0x93

    const/16 v8, 0x92

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v7, v8, :cond_7

    move v7, v10

    goto :goto_5

    :cond_7
    move v7, v9

    :goto_5
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v15, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_d

    sget-object v7, Lb2/t;->w:Lb2/t;

    if-eqz v3, :cond_8

    move-object v3, v7

    goto :goto_6

    :cond_8
    move-object v3, v5

    :goto_6
    sget-object v5, Ll0/m;->c:Ll0/g;

    sget-object v8, Lb2/e;->M:Lb2/k;

    invoke-static {v5, v8, v15, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v11, v15, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v15, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v14, v15, Lp1/q;->S:Z

    if-eqz v14, :cond_9

    invoke-virtual {v15, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_9
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_7
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v15, v13, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v15, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v11, v15, Lp1/q;->S:Z

    if-nez v11, :cond_a

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v11, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_b

    :cond_a
    invoke-static {v8, v15, v8, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v15, v5, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v4}, Lhz2/c;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    if-nez v5, :cond_c

    const v5, 0x1e5afa5e

    invoke-virtual {v15, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v9}, Lp1/q;->q(Z)V

    move/from16 v33, v0

    move-object v5, v7

    move v0, v10

    goto/16 :goto_8

    :cond_c
    const v8, 0x1e5afa5f

    invoke-virtual {v15, v8}, Lp1/q;->e0(I)V

    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v5, v15, v8}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v8, v15, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->y()J

    move-result-wide v12

    invoke-virtual {v8, v15, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->p()Lb91/a;

    move-result-object v27

    sget v8, Lb91/a;->d:I

    shl-int/lit8 v31, v8, 0x12

    const v32, 0x2fffa

    const/4 v8, 0x0

    move v14, v10

    move-wide/from16 v35, v12

    move v13, v9

    move-wide/from16 v9, v35

    const-wide/16 v11, 0x0

    move/from16 v16, v13

    const/4 v13, 0x0

    move/from16 v17, v14

    const/4 v14, 0x0

    move-object/from16 v29, v15

    const/4 v15, 0x0

    move/from16 v18, v16

    move/from16 v19, v17

    const-wide/16 v16, 0x0

    move/from16 v20, v18

    const/16 v18, 0x0

    move/from16 v21, v19

    const/16 v19, 0x0

    move/from16 v22, v20

    move/from16 v23, v21

    const-wide/16 v20, 0x0

    move/from16 v24, v22

    const/16 v22, 0x0

    move/from16 v25, v23

    const/16 v23, 0x0

    move/from16 v26, v24

    const/16 v24, 0x0

    move/from16 v28, v25

    const/16 v25, 0x0

    move/from16 v30, v26

    const/16 v26, 0x0

    move/from16 v33, v28

    const/16 v28, 0x0

    move/from16 v34, v30

    const/16 v30, 0x0

    move/from16 v2, v33

    move/from16 v33, v0

    move v0, v2

    move-object v2, v7

    move-object v7, v5

    move-object v5, v2

    move/from16 v2, v34

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v29

    invoke-virtual {v15, v2}, Lp1/q;->q(Z)V

    :goto_8
    const/4 v2, 0x3

    int-to-float v2, v2

    const/4 v7, 0x4

    int-to-float v7, v7

    mul-float/2addr v2, v7

    invoke-static {v2, v5}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v15, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move-object v2, v5

    invoke-virtual {v4}, Lhz2/c;->a()Ljava/util/List;

    move-result-object v5

    and-int/lit8 v9, v33, 0x70

    const/4 v10, 0x4

    const/4 v7, 0x0

    move-object v8, v15

    invoke-static/range {v5 .. v10}, Lgz2/c;->c(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    const-wide/high16 v5, 0x4004000000000000L    # 2.5

    double-to-float v5, v5

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v5, v6

    const/4 v6, 0x0

    invoke-static {v2, v6, v5, v0}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Lhy0/g;->SOLID:Lhy0/g;

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v2, v15, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->b1()J

    move-result-wide v10

    const/16 v16, 0x36

    const/16 v17, 0xdc

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    invoke-static/range {v5 .. v17}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v15, v0}, Lp1/q;->q(Z)V

    move-object v5, v3

    goto :goto_9

    :cond_d
    invoke-virtual {v15}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_e

    new-instance v0, Lf02/c;

    const/16 v3, 0x10

    move-object/from16 v6, p1

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lf02/c;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ll83/e;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final c(Lhz2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lgz2/f;->b(Lhz2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
