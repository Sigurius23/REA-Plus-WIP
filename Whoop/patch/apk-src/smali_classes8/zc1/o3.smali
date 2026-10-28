.class public abstract Lzc1/o3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0005\u00b2\u0006\u000c\u0010\u0004\u001a\u00020\u00038\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/runtime/Composer;I)V",
        "",
        "isPressed",
        "design-showcase_release"
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
.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/o3;->d(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/runtime/Composer;I)V
    .locals 43

    move-object/from16 v1, p0

    check-cast v1, Lp1/q;

    const v2, -0x691e40c6

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    move v4, v2

    :goto_0
    and-int/lit8 v5, p1, 0x1

    invoke-virtual {v1, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v4, v5, :cond_1

    invoke-static {v1}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v4

    :cond_1
    check-cast v4, Lj0/i;

    const/4 v5, 0x6

    invoke-static {v4, v1, v5}, Lge3/g;->m(Lj0/i;Lp1/q;I)Lp1/c1;

    move-result-object v27

    sget-object v4, Lb2/e;->N:Lb2/k;

    sget-object v6, Ll0/m;->c:Ll0/g;

    const/16 v7, 0x30

    invoke-static {v6, v4, v1, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v6, v1, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v11, v1, Lp1/q;->S:Z

    if-eqz v11, :cond_2

    invoke-virtual {v1, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_1
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v1, v11, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v1, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v12, v1, Lp1/q;->S:Z

    if-nez v12, :cond_3

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_4

    :cond_3
    invoke-static {v6, v1, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_4
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v1, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, Lx81/d;->a:Lx81/d;

    sget v12, Lx81/d;->b:I

    invoke-virtual {v9, v1, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->b()J

    move-result-wide v13

    sget-object v15, Li2/w0;->a:Li2/v0;

    invoke-static {v8, v13, v14, v15}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v14, Lb2/e;->w:Lb2/m;

    invoke-static {v14, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v14, v1, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v1, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v3, v1, Lp1/q;->S:Z

    if-eqz v3, :cond_5

    invoke-virtual {v1, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_5
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v1, v11, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1, v4, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v1, Lp1/q;->S:Z

    if-nez v2, :cond_6

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    :cond_6
    invoke-static {v14, v1, v14, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    invoke-static {v1, v6, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v9, v1, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->M()Lb91/a;

    move-result-object v21

    sget v2, Lb91/a;->d:I

    shl-int/lit8 v25, v2, 0x12

    const v26, 0x2fffe

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    move v7, v5

    const-wide/16 v5, 0x0

    move v10, v7

    const/4 v7, 0x0

    move-object v11, v8

    const/4 v8, 0x0

    move-object v12, v9

    const/4 v9, 0x0

    move v13, v10

    move-object v14, v11

    const-wide/16 v10, 0x0

    move-object v15, v12

    const/4 v12, 0x0

    move/from16 v16, v13

    const/4 v13, 0x0

    move-object/from16 v18, v14

    move-object/from16 v17, v15

    const-wide/16 v14, 0x0

    move/from16 v19, v16

    const/16 v16, 0x0

    move-object/from16 v20, v17

    const/16 v17, 0x0

    move-object/from16 v22, v18

    const/16 v18, 0x0

    move/from16 v23, v19

    const/16 v19, 0x0

    move-object/from16 v24, v20

    const/16 v20, 0x0

    move-object/from16 v28, v22

    const/16 v22, 0x0

    move-object/from16 v29, v24

    const/16 v24, 0x6

    move/from16 v30, v23

    move-object/from16 v23, v1

    const-string v1, "Press to see Trends in \'pressed\' state"

    move-object/from16 v32, v28

    const/4 v0, 0x1

    invoke-static/range {v1 .. v26}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lp1/q;->q(Z)V

    const-string v2, "Clickable"

    const/4 v3, 0x6

    invoke-static {v2, v1, v3}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const-string v2, "1:00"

    move/from16 v30, v3

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const-string v23, "STAT TITLE"

    invoke-static/range {v23 .. v23}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual/range {v29 .. v29}, Lx81/d;->d()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/a;->l()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v24, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v25, v24, 0x6

    shl-int/lit8 v26, v24, 0x15

    or-int v20, v25, v26

    const/16 v21, 0x0

    const v22, 0xff73

    move-object/from16 v19, v1

    const/4 v1, 0x0

    move-object v5, v2

    const/4 v2, 0x0

    move-object v6, v5

    const/4 v5, 0x0

    move-object v7, v6

    const/4 v6, 0x0

    move-object v9, v7

    const/4 v7, 0x0

    move-object v10, v9

    const/4 v9, 0x0

    move-object v12, v10

    const-wide/16 v10, 0x0

    move-object v14, v12

    const-wide/16 v12, 0x0

    move-object v15, v14

    const/4 v14, 0x0

    move-object/from16 v16, v15

    const/4 v15, 0x0

    move-object/from16 v17, v16

    const/16 v16, 0x0

    move-object/from16 v18, v17

    const/16 v17, 0x0

    move-object/from16 v28, v18

    const/16 v18, 0x0

    move-object/from16 p0, v28

    move/from16 v0, v30

    invoke-static/range {v1 .. v22}, Lsz0/p;->e(Landroidx/compose/ui/Modifier;Lsz0/f1;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/h1;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZJJLb91/a;Lb91/a;Lb91/a;ZLc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v19

    const-string v2, "Without Trend"

    invoke-static {v2, v1, v0}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static/range {p0 .. p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static/range {v23 .. v23}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    const v22, 0xff7b

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v22}, Lsz0/p;->e(Landroidx/compose/ui/Modifier;Lsz0/f1;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/h1;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZJJLb91/a;Lb91/a;Lb91/a;ZLc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v19

    const-string v2, "With Suffix"

    invoke-static {v2, v1, v0}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const-string v2, "22,076"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const-string v29, "lbs"

    invoke-static/range {v29 .. v29}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static/range {v23 .. v23}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    shl-int/lit8 v24, v24, 0xc

    or-int v30, v25, v24

    or-int v20, v30, v26

    const v22, 0xff6b

    const/4 v1, 0x0

    move-object v4, v2

    const/4 v2, 0x0

    move-object v6, v4

    const/4 v4, 0x0

    move-object v7, v6

    const/4 v6, 0x0

    move-object v9, v7

    const/4 v7, 0x0

    move-object v10, v9

    const/4 v9, 0x0

    move-object v12, v10

    const-wide/16 v10, 0x0

    move-object v14, v12

    const-wide/16 v12, 0x0

    move-object v15, v14

    const/4 v14, 0x0

    move-object/from16 v16, v15

    const/4 v15, 0x0

    move-object/from16 v17, v16

    const/16 v16, 0x0

    move-object/from16 v18, v17

    const/16 v17, 0x0

    move-object/from16 v31, v18

    const/16 v18, 0x0

    move-object/from16 v0, v31

    invoke-static/range {v1 .. v22}, Lsz0/p;->e(Landroidx/compose/ui/Modifier;Lsz0/f1;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/h1;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZJJLb91/a;Lb91/a;Lb91/a;ZLc93/a;Landroidx/compose/runtime/Composer;III)V

    const-string v1, "84"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const-string v1, "%"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget-object v6, Lsz0/h1;->NUMBER:Lsz0/h1;

    invoke-static/range {v23 .. v23}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    const/high16 v1, 0x30000

    or-int v1, v25, v1

    or-int v1, v1, v24

    or-int v20, v1, v26

    const v22, 0xff4b

    const/4 v1, 0x0

    invoke-static/range {v1 .. v22}, Lsz0/p;->e(Landroidx/compose/ui/Modifier;Lsz0/f1;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/h1;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZJJLb91/a;Lb91/a;Lb91/a;ZLc93/a;Landroidx/compose/runtime/Composer;III)V

    const-string v1, "1:33"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const-string v1, ":45"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static/range {v23 .. v23}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    const/4 v1, 0x0

    invoke-static/range {v1 .. v22}, Lsz0/p;->e(Landroidx/compose/ui/Modifier;Lsz0/f1;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/h1;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZJJLb91/a;Lb91/a;Lb91/a;ZLc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v19

    const/4 v2, 0x2

    int-to-float v2, v2

    const/4 v3, 0x4

    int-to-float v3, v3

    mul-float/2addr v2, v3

    move-object/from16 v3, v32

    invoke-static {v3, v2, v1, v0}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    new-instance v7, Lsz0/g1;

    const-string v24, "12%"

    invoke-static/range {v24 .. v24}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget-object v5, Lhy0/b2;->NEUTRAL:Lhy0/b2;

    invoke-direct {v7, v4, v5}, Lsz0/g1;-><init>(Lcom/whoop/design/util/TextResource;Lhy0/b2;)V

    invoke-static/range {v29 .. v29}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static/range {v23 .. v23}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    sget v6, Lsz0/g1;->c:I

    shl-int/lit8 v29, v6, 0x12

    or-int v6, v30, v29

    or-int v20, v6, v26

    const v22, 0xff2b

    const/4 v1, 0x0

    move v6, v2

    const/4 v2, 0x0

    move-object v9, v5

    move-object v5, v4

    const/4 v4, 0x0

    move v10, v6

    const/4 v6, 0x0

    move-object v11, v9

    const/4 v9, 0x0

    move v12, v10

    move-object v13, v11

    const-wide/16 v10, 0x0

    move v14, v12

    move-object v15, v13

    const-wide/16 v12, 0x0

    move/from16 v16, v14

    const/4 v14, 0x0

    move-object/from16 v17, v15

    const/4 v15, 0x0

    move/from16 v18, v16

    const/16 v16, 0x0

    move-object/from16 v30, v17

    const/16 v17, 0x0

    move/from16 v31, v18

    const/16 v18, 0x0

    move-object/from16 v33, v3

    move-object v3, v0

    move-object/from16 v0, v30

    invoke-static/range {v1 .. v22}, Lsz0/p;->e(Landroidx/compose/ui/Modifier;Lsz0/f1;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/h1;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZJJLb91/a;Lb91/a;Lb91/a;ZLc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v19

    const-string v2, "With Trend"

    const/4 v3, 0x6

    invoke-static {v2, v1, v3}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static/range {p0 .. p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    new-instance v7, Lsz0/g1;

    invoke-static/range {v24 .. v24}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-direct {v7, v2, v0}, Lsz0/g1;-><init>(Lcom/whoop/design/util/TextResource;Lhy0/b2;)V

    invoke-static/range {v23 .. v23}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-static/range {v27 .. v27}, Lzc1/o3;->c(Lp1/t2;)Z

    move-result v9

    or-int v0, v25, v29

    or-int v20, v0, v26

    const v22, 0xfe3b

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v22}, Lsz0/p;->e(Landroidx/compose/ui/Modifier;Lsz0/f1;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/h1;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZJJLb91/a;Lb91/a;Lb91/a;ZLc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, p0

    move-object/from16 v1, v19

    move/from16 v0, v31

    move-object/from16 v3, v33

    invoke-static {v3, v0, v1, v2}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    new-instance v7, Lsz0/g1;

    invoke-static/range {v24 .. v24}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget-object v6, Lhy0/b2;->POSITIVE:Lhy0/b2;

    invoke-direct {v7, v5, v6}, Lsz0/g1;-><init>(Lcom/whoop/design/util/TextResource;Lhy0/b2;)V

    invoke-static/range {v23 .. v23}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-static/range {v27 .. v27}, Lzc1/o3;->c(Lp1/t2;)Z

    move-result v9

    const/4 v1, 0x0

    move-object v5, v2

    const/4 v2, 0x0

    move-object v14, v3

    move-object v3, v4

    const/4 v4, 0x0

    move-object v6, v5

    const/4 v5, 0x0

    move-object v10, v6

    const/4 v6, 0x0

    move-object v12, v10

    const-wide/16 v10, 0x0

    move-object v15, v12

    const-wide/16 v12, 0x0

    move-object/from16 v32, v14

    const/4 v14, 0x0

    move-object/from16 v16, v15

    const/4 v15, 0x0

    move-object/from16 v17, v16

    const/16 v16, 0x0

    move-object/from16 v18, v17

    const/16 v17, 0x0

    move-object/from16 v25, v18

    const/16 v18, 0x0

    move-object/from16 v34, v25

    move-object/from16 v35, v32

    invoke-static/range {v1 .. v22}, Lsz0/p;->e(Landroidx/compose/ui/Modifier;Lsz0/f1;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/h1;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZJJLb91/a;Lb91/a;Lb91/a;ZLc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v19

    move-object/from16 v2, v34

    move-object/from16 v3, v35

    invoke-static {v3, v0, v1, v2}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    new-instance v7, Lsz0/g1;

    invoke-static/range {v24 .. v24}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget-object v6, Lhy0/b2;->NEGATIVE:Lhy0/b2;

    invoke-direct {v7, v5, v6}, Lsz0/g1;-><init>(Lcom/whoop/design/util/TextResource;Lhy0/b2;)V

    invoke-static/range {v23 .. v23}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-static/range {v27 .. v27}, Lzc1/o3;->c(Lp1/t2;)Z

    move-result v9

    const/4 v1, 0x0

    move-object v5, v2

    const/4 v2, 0x0

    move-object v14, v3

    move-object v3, v4

    const/4 v4, 0x0

    move-object v6, v5

    const/4 v5, 0x0

    move-object v10, v6

    const/4 v6, 0x0

    move-object v12, v10

    const-wide/16 v10, 0x0

    move-object v15, v12

    const-wide/16 v12, 0x0

    move-object/from16 v32, v14

    const/4 v14, 0x0

    move-object/from16 v16, v15

    const/4 v15, 0x0

    move-object/from16 v17, v16

    const/16 v16, 0x0

    move-object/from16 v18, v17

    const/16 v17, 0x0

    move-object/from16 v34, v18

    const/16 v18, 0x0

    move-object/from16 v37, v32

    move-object/from16 v36, v34

    invoke-static/range {v1 .. v22}, Lsz0/p;->e(Landroidx/compose/ui/Modifier;Lsz0/f1;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/h1;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZJJLb91/a;Lb91/a;Lb91/a;ZLc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v19

    move-object/from16 v2, v36

    move-object/from16 v3, v37

    invoke-static {v3, v0, v1, v2}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static/range {v23 .. v23}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    sget-object v5, Lhy0/b2;->POSITIVE_RANGE:Lhy0/b2;

    const-string v24, "within 94-95%"

    invoke-static/range {v24 .. v24}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    new-instance v7, Lsz0/g1;

    invoke-direct {v7, v6, v5}, Lsz0/g1;-><init>(Lcom/whoop/design/util/TextResource;Lhy0/b2;)V

    invoke-static/range {v27 .. v27}, Lzc1/o3;->c(Lp1/t2;)Z

    move-result v9

    const/4 v1, 0x0

    move-object v5, v2

    const/4 v2, 0x0

    move-object v14, v3

    move-object v3, v4

    const/4 v4, 0x0

    move-object v6, v5

    const/4 v5, 0x0

    move-object v10, v6

    const/4 v6, 0x0

    move-object v12, v10

    const-wide/16 v10, 0x0

    move-object v15, v12

    const-wide/16 v12, 0x0

    move-object/from16 v32, v14

    const/4 v14, 0x0

    move-object/from16 v16, v15

    const/4 v15, 0x0

    move-object/from16 v17, v16

    const/16 v16, 0x0

    move-object/from16 v18, v17

    const/16 v17, 0x0

    move-object/from16 v34, v18

    const/16 v18, 0x0

    move-object/from16 v39, v32

    move-object/from16 v38, v34

    invoke-static/range {v1 .. v22}, Lsz0/p;->e(Landroidx/compose/ui/Modifier;Lsz0/f1;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/h1;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZJJLb91/a;Lb91/a;Lb91/a;ZLc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v19

    move-object/from16 v2, v38

    move-object/from16 v3, v39

    invoke-static {v3, v0, v1, v2}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static/range {v23 .. v23}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    sget-object v5, Lhy0/b2;->ALERT_RANGE:Lhy0/b2;

    invoke-static/range {v24 .. v24}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    new-instance v7, Lsz0/g1;

    invoke-direct {v7, v6, v5}, Lsz0/g1;-><init>(Lcom/whoop/design/util/TextResource;Lhy0/b2;)V

    invoke-static/range {v27 .. v27}, Lzc1/o3;->c(Lp1/t2;)Z

    move-result v9

    const/4 v1, 0x0

    move-object v5, v2

    const/4 v2, 0x0

    move-object v14, v3

    move-object v3, v4

    const/4 v4, 0x0

    move-object v6, v5

    const/4 v5, 0x0

    move-object v10, v6

    const/4 v6, 0x0

    move-object v12, v10

    const-wide/16 v10, 0x0

    move-object v15, v12

    const-wide/16 v12, 0x0

    move-object/from16 v32, v14

    const/4 v14, 0x0

    move-object/from16 v16, v15

    const/4 v15, 0x0

    move-object/from16 v17, v16

    const/16 v16, 0x0

    move-object/from16 v18, v17

    const/16 v17, 0x0

    move-object/from16 v34, v18

    const/16 v18, 0x0

    move-object/from16 v41, v32

    move-object/from16 v40, v34

    invoke-static/range {v1 .. v22}, Lsz0/p;->e(Landroidx/compose/ui/Modifier;Lsz0/f1;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/h1;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZJJLb91/a;Lb91/a;Lb91/a;ZLc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v19

    move-object/from16 v5, v40

    move-object/from16 v2, v41

    invoke-static {v2, v0, v1, v5}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static/range {v23 .. v23}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    sget-object v4, Lhy0/b2;->CONCERN_RANGE:Lhy0/b2;

    invoke-static/range {v24 .. v24}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    new-instance v7, Lsz0/g1;

    invoke-direct {v7, v5, v4}, Lsz0/g1;-><init>(Lcom/whoop/design/util/TextResource;Lhy0/b2;)V

    invoke-static/range {v27 .. v27}, Lzc1/o3;->c(Lp1/t2;)Z

    move-result v9

    const/4 v1, 0x0

    move-object/from16 v32, v2

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v42, v32

    invoke-static/range {v1 .. v22}, Lsz0/p;->e(Landroidx/compose/ui/Modifier;Lsz0/f1;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/h1;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZJJLb91/a;Lb91/a;Lb91/a;ZLc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v19

    move-object/from16 v3, v42

    const/4 v2, 0x1

    invoke-static {v3, v0, v1, v2}, Lm4/a;->v(Lb2/t;FLp1/q;Z)V

    goto :goto_3

    :cond_8
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_9

    new-instance v1, Lzc1/l2;

    const/16 v2, 0x1a

    move/from16 v3, p1

    invoke-direct {v1, v3, v2}, Lzc1/l2;-><init>(II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final c(Lp1/t2;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final d(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/o3;->b(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
