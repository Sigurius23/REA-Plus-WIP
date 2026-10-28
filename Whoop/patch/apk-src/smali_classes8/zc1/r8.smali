.class public abstract Lzc1/r8;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Ll83/a0;",
        "f",
        "(Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a()Ll83/a0;
    .locals 1

    invoke-static {}, Lzc1/r8;->g()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lzc1/r8;->i()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Lzc1/r8;->h()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/r8;->k(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e()Ll83/a0;
    .locals 1

    invoke-static {}, Lzc1/r8;->j()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static final f(Landroidx/compose/runtime/Composer;I)V
    .locals 34

    move-object/from16 v6, p0

    check-cast v6, Lp1/q;

    const v1, 0x2eaac6dc

    invoke-virtual {v6, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v9, 0x0

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v9

    :goto_0
    and-int/lit8 v2, p1, 0x1

    invoke-virtual {v6, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_14

    const/4 v1, 0x4

    int-to-float v11, v1

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float v12, v11, v1

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v12, v13}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Ll0/m;->c:Ll0/g;

    sget-object v3, Lb2/e;->M:Lb2/k;

    invoke-static {v2, v3, v6, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v3, v6, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v6, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v5, v6, Lp1/q;->S:Z

    if-eqz v5, :cond_1

    invoke-virtual {v6, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_1
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v6, v15, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v6, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v5, v6, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v3, v6, v3, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v6, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v1, "Tooltip Gallery"

    const/4 v5, 0x6

    invoke-static {v1, v6, v5}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const-string v1, "Arrow Bottom | Arrow Top "

    invoke-static {v1, v6, v5}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const-string v1, "Default"

    invoke-static {v1, v6, v5}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/4 v1, 0x3

    int-to-float v1, v1

    mul-float/2addr v1, v11

    invoke-static {v1, v13}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Ll0/m;->a:Ll0/e;

    sget-object v10, Lb2/e;->J:Lb2/l;

    invoke-static {v8, v10, v6, v9}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    move-object/from16 v17, v10

    iget-wide v9, v6, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v6, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v6}, Lp1/q;->i0()V

    move/from16 v18, v1

    iget-boolean v1, v6, Lp1/q;->S:Z

    if-eqz v1, :cond_4

    invoke-virtual {v6, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v6, v15, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v2, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v6, Lp1/q;->S:Z

    if-nez v1, :cond_5

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    :cond_5
    invoke-static {v9, v6, v9, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v6, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v9, "Tooltip text label"

    move-object v1, v2

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    move-object v5, v3

    sget-object v3, Lhy0/s1;->UP:Lhy0/s1;

    sget v10, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v7, v10, 0x3

    move-object/from16 v19, v1

    move v1, v7

    or-int/lit16 v7, v1, 0x6d86

    move-object/from16 v20, v8

    const/4 v8, 0x0

    move-object/from16 v21, v4

    const/4 v4, 0x0

    move-object/from16 v22, v5

    const/4 v5, 0x0

    move/from16 v24, v1

    move/from16 v23, v10

    move/from16 v16, v11

    move/from16 v1, v18

    move-object/from16 v10, v19

    move-object/from16 v0, v20

    move-object/from16 v11, v21

    move/from16 v18, v12

    const/4 v12, 0x6

    invoke-static/range {v1 .. v8}, Lhy0/t1;->d(FLcom/whoop/design/util/TextResource;Lhy0/s1;Lcom/whoop/design/util/TextResource;Lhy0/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v19, v3

    const/4 v2, 0x5

    int-to-float v2, v2

    mul-float v2, v2, v16

    move v3, v2

    invoke-static {v13, v3, v6, v9}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    move v4, v3

    sget-object v3, Lhy0/s1;->DOWN:Lhy0/s1;

    const/16 v5, 0x14

    int-to-float v5, v5

    mul-float v5, v5, v16

    move v8, v1

    move v1, v5

    const/4 v5, 0x0

    move/from16 v20, v8

    const/4 v8, 0x0

    move/from16 v21, v4

    const/4 v4, 0x0

    move/from16 v25, v20

    move/from16 v26, v21

    invoke-static/range {v1 .. v8}, Lhy0/t1;->d(FLcom/whoop/design/util/TextResource;Lhy0/s1;Lcom/whoop/design/util/TextResource;Lhy0/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v20, v3

    const/4 v1, 0x1

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    const-string v1, "TITLE"

    invoke-static {v1, v6, v12}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    move/from16 v1, v25

    invoke-static {v1, v13}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object/from16 v3, v17

    const/4 v4, 0x0

    invoke-static {v0, v3, v6, v4}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v7, v6, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v6, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-eqz v8, :cond_7

    invoke-virtual {v6, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_7
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_3
    invoke-static {v6, v15, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v10, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v6, Lp1/q;->S:Z

    if-nez v5, :cond_9

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_8

    goto :goto_5

    :cond_8
    :goto_4
    move-object/from16 v4, v22

    goto :goto_6

    :cond_9
    :goto_5
    invoke-static {v4, v6, v4, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_4

    :goto_6
    invoke-static {v6, v4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const-string v17, "TOOLTIP TITLE"

    move-object/from16 v22, v4

    invoke-static/range {v17 .. v17}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    move/from16 v5, v24

    or-int/lit16 v7, v5, 0x6186

    shl-int/lit8 v21, v23, 0x9

    or-int v7, v7, v21

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object/from16 v28, v3

    move-object/from16 v3, v19

    move-object/from16 v27, v22

    move/from16 v29, v24

    invoke-static/range {v1 .. v8}, Lhy0/t1;->d(FLcom/whoop/design/util/TextResource;Lhy0/s1;Lcom/whoop/design/util/TextResource;Lhy0/a;Landroidx/compose/runtime/Composer;II)V

    move/from16 v2, v26

    invoke-static {v13, v2, v6, v9}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static/range {v17 .. v17}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    const/16 v5, 0xa

    int-to-float v5, v5

    mul-float v5, v5, v16

    move v8, v1

    move v1, v5

    const/4 v5, 0x0

    move/from16 v25, v8

    const/4 v8, 0x0

    move/from16 v31, v2

    move-object v2, v3

    move-object/from16 v3, v20

    move/from16 v30, v25

    invoke-static/range {v1 .. v8}, Lhy0/t1;->d(FLcom/whoop/design/util/TextResource;Lhy0/s1;Lcom/whoop/design/util/TextResource;Lhy0/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x1

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    const-string v1, "CTA"

    invoke-static {v1, v6, v12}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    move/from16 v1, v30

    invoke-static {v1, v13}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object/from16 v3, v28

    const/4 v4, 0x0

    invoke-static {v0, v3, v6, v4}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v7, v6, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v6, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-eqz v8, :cond_a

    invoke-virtual {v6, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v6, v15, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v10, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v6, Lp1/q;->S:Z

    if-nez v5, :cond_c

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_b

    goto :goto_9

    :cond_b
    :goto_8
    move-object/from16 v4, v27

    goto :goto_a

    :cond_c
    :goto_9
    invoke-static {v4, v6, v4, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_8

    :goto_a
    invoke-static {v6, v4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const-string v22, "BUTTON TEXT"

    invoke-static/range {v22 .. v22}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-ne v7, v8, :cond_d

    new-instance v7, Lzc1/h6;

    const/16 v12, 0x19

    invoke-direct {v7, v12}, Lzc1/h6;-><init>(I)V

    invoke-virtual {v6, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v7, Lc93/a;

    new-instance v12, Lhy0/a;

    invoke-direct {v12, v5, v7}, Lhy0/a;-><init>(Lcom/whoop/design/util/TextResource;Lc93/a;)V

    const/4 v5, 0x6

    int-to-float v7, v5

    mul-float v7, v7, v16

    move/from16 v25, v1

    move/from16 v5, v29

    or-int/lit16 v1, v5, 0xd86

    sget v24, Lhy0/a;->c:I

    shl-int/lit8 v24, v24, 0xc

    or-int v1, v1, v24

    move-object/from16 v26, v8

    const/4 v8, 0x0

    move-object/from16 v27, v4

    const/4 v4, 0x0

    move/from16 v32, v7

    move v7, v1

    move/from16 v1, v32

    move-object/from16 v32, v11

    move-object v11, v3

    move-object/from16 v3, v19

    move-object/from16 v19, v32

    move/from16 v32, v5

    move-object v5, v12

    move/from16 v12, v25

    move-object/from16 v25, v10

    move-object/from16 v10, v26

    invoke-static/range {v1 .. v8}, Lhy0/t1;->d(FLcom/whoop/design/util/TextResource;Lhy0/s1;Lcom/whoop/design/util/TextResource;Lhy0/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v26, v3

    move/from16 v1, v31

    invoke-static {v13, v1, v6, v9}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static/range {v22 .. v22}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v10, :cond_e

    new-instance v4, Lzc1/h6;

    const/16 v5, 0x1a

    invoke-direct {v4, v5}, Lzc1/h6;-><init>(I)V

    invoke-virtual {v6, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v4, Lc93/a;

    new-instance v5, Lhy0/a;

    invoke-direct {v5, v3, v4}, Lhy0/a;-><init>(Lcom/whoop/design/util/TextResource;Lc93/a;)V

    const/4 v3, 0x2

    int-to-float v3, v3

    mul-float v3, v3, v16

    const/4 v4, 0x0

    const/4 v8, 0x0

    move/from16 v33, v1

    move v1, v3

    move-object/from16 v3, v20

    invoke-static/range {v1 .. v8}, Lhy0/t1;->d(FLcom/whoop/design/util/TextResource;Lhy0/s1;Lcom/whoop/design/util/TextResource;Lhy0/a;Landroidx/compose/runtime/Composer;II)V

    move/from16 v16, v1

    const/4 v1, 0x1

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    const-string v1, "TITLE / CTA"

    const/4 v5, 0x6

    invoke-static {v1, v6, v5}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v12, v13}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v4, 0x0

    invoke-static {v0, v11, v6, v4}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v2, v6, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v6, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v4, v6, Lp1/q;->S:Z

    if-eqz v4, :cond_f

    invoke-virtual {v6, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_f
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_b
    invoke-static {v6, v15, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v0, v25

    invoke-static {v6, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v6, Lp1/q;->S:Z

    if-nez v0, :cond_10

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    :cond_10
    move-object/from16 v11, v19

    goto :goto_d

    :cond_11
    :goto_c
    move-object/from16 v4, v27

    goto :goto_e

    :goto_d
    invoke-static {v2, v6, v2, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_c

    :goto_e
    invoke-static {v6, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static/range {v17 .. v17}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static/range {v22 .. v22}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v10, :cond_12

    new-instance v1, Lzc1/h6;

    const/16 v3, 0x1b

    invoke-direct {v1, v3}, Lzc1/h6;-><init>(I)V

    invoke-virtual {v6, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v1, Lc93/a;

    new-instance v5, Lhy0/a;

    invoke-direct {v5, v0, v1}, Lhy0/a;-><init>(Lcom/whoop/design/util/TextResource;Lc93/a;)V

    move/from16 v1, v32

    or-int/lit16 v0, v1, 0x186

    or-int v0, v0, v21

    or-int v7, v0, v24

    const/4 v8, 0x0

    move/from16 v1, v18

    move-object/from16 v3, v26

    invoke-static/range {v1 .. v8}, Lhy0/t1;->d(FLcom/whoop/design/util/TextResource;Lhy0/s1;Lcom/whoop/design/util/TextResource;Lhy0/a;Landroidx/compose/runtime/Composer;II)V

    move/from16 v1, v33

    invoke-static {v13, v1, v6, v9}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static/range {v17 .. v17}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static/range {v22 .. v22}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v10, :cond_13

    new-instance v1, Lzc1/h6;

    const/16 v3, 0x1c

    invoke-direct {v1, v3}, Lzc1/h6;-><init>(I)V

    invoke-virtual {v6, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v1, Lc93/a;

    new-instance v5, Lhy0/a;

    invoke-direct {v5, v0, v1}, Lhy0/a;-><init>(Lcom/whoop/design/util/TextResource;Lc93/a;)V

    const/4 v8, 0x0

    move/from16 v1, v16

    move-object/from16 v3, v20

    invoke-static/range {v1 .. v8}, Lhy0/t1;->d(FLcom/whoop/design/util/TextResource;Lhy0/s1;Lcom/whoop/design/util/TextResource;Lhy0/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x1

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_14
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_f
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_15

    new-instance v1, Lzc1/t7;

    const/16 v2, 0x19

    move/from16 v3, p1

    invoke-direct {v1, v3, v2}, Lzc1/t7;-><init>(II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_15
    return-void
.end method

.method private static final g()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final h()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final j()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final k(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/r8;->f(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
