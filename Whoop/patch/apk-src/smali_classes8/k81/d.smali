.class public abstract Lk81/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u001b\u0010\u000c\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a#\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lk81/e;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "d",
        "(Landroidx/compose/ui/Modifier;Lk81/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "sectionId",
        "i",
        "(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;",
        "Lm91/u;",
        "item",
        "h",
        "(Landroidx/compose/ui/Modifier;Lm91/u;Ljava/lang/String;)Landroidx/compose/ui/Modifier;",
        "design_release"
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lk81/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lk81/d;->g(Landroidx/compose/ui/Modifier;Lk81/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lm91/o;Lk81/e;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lk81/d;->f(Lm91/o;Lk81/e;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lk81/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lk81/d;->e(Landroidx/compose/ui/Modifier;Lk81/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Lk81/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 46
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lk81/e;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, 0x466a9e2c

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v5, v4, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v4, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-virtual {v10, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    move v6, v1

    :goto_0
    or-int/2addr v6, v4

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v4

    :goto_1
    and-int/lit8 v7, v4, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_4
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_6

    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x100

    goto :goto_3

    :cond_5
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v6, v7

    :cond_6
    and-int/lit16 v7, v6, 0x93

    const/16 v8, 0x92

    const/4 v9, 0x0

    const/4 v11, 0x1

    if-eq v7, v8, :cond_7

    move v7, v11

    goto :goto_4

    :cond_7
    move v7, v9

    :goto_4
    and-int/lit8 v8, v6, 0x1

    invoke-virtual {v10, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_15

    sget-object v27, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_8

    move v0, v1

    move-object/from16 v1, v27

    goto :goto_5

    :cond_8
    move v0, v1

    move-object v1, v5

    :goto_5
    invoke-virtual {v2}, Lk81/e;->k()Z

    move-result v5

    if-nez v5, :cond_9

    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_16

    new-instance v0, Lk81/c;

    const/4 v6, 0x0

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lk81/c;-><init>(Landroidx/compose/ui/Modifier;Lk81/e;Lkotlin/jvm/functions/Function1;III)V

    :goto_6
    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_9
    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lk81/e;->getId()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Section_"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lk81/e;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lk81/d;->i(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, Lk81/e;->h()F

    move-result v14

    invoke-virtual/range {p1 .. p1}, Lk81/e;->g()F

    move-result v16

    const/16 v17, 0x5

    const/4 v13, 0x0

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lk81/e;->c()Lk81/a;

    move-result-object v3

    invoke-virtual {v3}, Lk81/a;->getHorizontalAlignment()Lb2/f;

    move-result-object v3

    sget-object v4, Ll0/m;->c:Ll0/g;

    invoke-static {v4, v3, v10, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, v10, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v10, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v8, v10, Lp1/q;->S:Z

    if-eqz v8, :cond_a

    invoke-virtual {v10, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_7
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v10, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v10, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v12, v10, Lp1/q;->S:Z

    if-nez v12, :cond_b

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_c

    :cond_b
    invoke-static {v4, v10, v4, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v10, v4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v2, v1

    invoke-virtual/range {p1 .. p1}, Lk81/e;->j()Ljava/lang/String;

    move-result-object v1

    const/4 v12, 0x6

    if-nez v1, :cond_d

    const v1, -0x5222bb43

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v9}, Lp1/q;->q(Z)V

    move-object/from16 v29, v2

    move-object/from16 v39, v3

    move-object/from16 v41, v4

    move-object/from16 v40, v5

    move/from16 v31, v6

    move-object/from16 v33, v7

    move-object/from16 v38, v8

    move v0, v9

    goto/16 :goto_8

    :cond_d
    const v13, -0x5222bb42

    invoke-virtual {v10, v13}, Lp1/q;->e0(I)V

    sget-object v13, Lx81/d;->a:Lx81/d;

    invoke-virtual {v13, v10, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v14

    invoke-virtual {v14}, Lb91/d;->P()Lb91/a;

    move-result-object v21

    invoke-virtual {v13, v10, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->y()J

    move-result-wide v13

    const/16 v25, 0x0

    const v26, 0x2fffa

    move-object v15, v2

    const/4 v2, 0x0

    move-object/from16 v17, v5

    move/from16 v16, v6

    const-wide/16 v5, 0x0

    move-object/from16 v18, v7

    const/4 v7, 0x0

    move-object/from16 v19, v8

    const/4 v8, 0x0

    move/from16 v20, v9

    const/4 v9, 0x0

    move-object/from16 v23, v10

    move/from16 v22, v11

    const-wide/16 v10, 0x0

    move/from16 v24, v12

    const/4 v12, 0x0

    move-object/from16 v28, v4

    move-wide/from16 v44, v13

    move-object v14, v3

    move-wide/from16 v3, v44

    const/4 v13, 0x0

    move-object/from16 v30, v14

    move-object/from16 v29, v15

    const-wide/16 v14, 0x0

    move/from16 v31, v16

    const/16 v16, 0x0

    move-object/from16 v32, v17

    const/16 v17, 0x0

    move-object/from16 v33, v18

    const/16 v18, 0x0

    move-object/from16 v34, v19

    const/16 v19, 0x0

    move/from16 v35, v20

    const/16 v20, 0x0

    move/from16 v36, v22

    const/16 v22, 0x0

    move/from16 v37, v24

    const/16 v24, 0x0

    move-object/from16 v41, v28

    move-object/from16 v39, v30

    move-object/from16 v40, v32

    move-object/from16 v38, v34

    move/from16 v0, v35

    invoke-static/range {v1 .. v26}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v23

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    :goto_8
    invoke-virtual/range {p1 .. p1}, Lk81/e;->i()Ljava/lang/String;

    move-result-object v30

    const/16 v1, 0x8

    if-nez v30, :cond_e

    const v2, -0x521f4cba

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    move-object/from16 v43, v27

    goto/16 :goto_9

    :cond_e
    const v2, -0x521f4cb9

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    const/4 v2, 0x1

    int-to-float v3, v2

    int-to-float v4, v1

    mul-float v14, v3, v4

    const/16 v16, 0x0

    const/16 v17, 0xd

    const/4 v13, 0x0

    const/4 v15, 0x0

    move-object/from16 v12, v27

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v27

    move v3, v1

    sget-object v1, Liz0/l;->a:Liz0/l;

    sget-object v4, Lx81/d;->a:Lx81/d;

    move/from16 v42, v2

    const/4 v5, 0x6

    invoke-static {v4, v10, v5}, Lte0/d;->t(Lx81/d;Lp1/q;I)Ll3/v0;

    move-result-object v2

    invoke-virtual {v4, v10, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->c1()J

    move-result-wide v6

    invoke-virtual {v4, v10, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->k0()J

    move-result-wide v4

    const/high16 v25, 0x30000

    const/16 v26, 0x7ff8

    move v9, v3

    move-wide/from16 v44, v6

    move-wide v5, v4

    move-wide/from16 v3, v44

    const-wide/16 v7, 0x0

    move v11, v9

    const/4 v9, 0x0

    move-object/from16 v23, v10

    move v13, v11

    const-wide/16 v10, 0x0

    move-object v14, v12

    const/4 v12, 0x0

    move/from16 v16, v13

    move-object v15, v14

    const-wide/16 v13, 0x0

    move-object/from16 v17, v15

    const/4 v15, 0x0

    move/from16 v19, v16

    move-object/from16 v18, v17

    const-wide/16 v16, 0x0

    move-object/from16 v20, v18

    const/16 v18, 0x0

    move/from16 v21, v19

    const/16 v19, 0x0

    move-object/from16 v22, v20

    const/16 v20, 0x0

    move/from16 v24, v21

    const/16 v21, 0x0

    move-object/from16 v32, v22

    const/16 v22, 0x0

    move/from16 v34, v24

    const/16 v24, 0x0

    move-object/from16 v43, v32

    invoke-virtual/range {v1 .. v26}, Liz0/l;->a(Ll3/v0;JJJLp3/r;JIJLiz0/a;JFFZZFLandroidx/compose/runtime/Composer;III)Liz0/m;

    move-result-object v4

    const/16 v11, 0x30

    const/16 v12, 0x1f4

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v10, v23

    move-object/from16 v2, v27

    move-object/from16 v1, v30

    invoke-static/range {v1 .. v12}, Liz0/g;->M(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    :goto_9
    invoke-virtual/range {p1 .. p1}, Lk81/e;->j()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_10

    invoke-virtual/range {p1 .. p1}, Lk81/e;->i()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_f

    goto :goto_a

    :cond_f
    move-object/from16 v12, v43

    goto :goto_b

    :cond_10
    :goto_a
    invoke-virtual/range {p1 .. p1}, Lk81/e;->f()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_f

    const v1, -0x5217e5ba

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    const/4 v1, 0x2

    int-to-float v1, v1

    const/16 v11, 0x8

    int-to-float v2, v11

    move-object/from16 v12, v43

    invoke-static {v1, v2, v12, v10, v0}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    goto :goto_c

    :goto_b
    const v1, -0x52170c00

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    :goto_c
    invoke-virtual/range {p1 .. p1}, Lk81/e;->c()Lk81/a;

    move-result-object v1

    invoke-virtual {v1}, Lk81/a;->getHorizontalAlignment()Lb2/f;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lk81/e;->e()F

    move-result v2

    invoke-static {v2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    invoke-static {v2, v1, v10, v0}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v2, v10, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v10, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v5, v10, Lp1/q;->S:Z

    if-eqz v5, :cond_11

    move-object/from16 v5, v33

    invoke-virtual {v10, v5}, Lp1/q;->l(Lc93/a;)V

    :goto_d
    move-object/from16 v5, v38

    goto :goto_e

    :cond_11
    invoke-virtual {v10}, Lp1/q;->s0()V

    goto :goto_d

    :goto_e
    invoke-static {v10, v5, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v14, v39

    invoke-static {v10, v14, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v10, Lp1/q;->S:Z

    if-nez v1, :cond_12

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    :cond_12
    move-object/from16 v1, v40

    goto :goto_10

    :cond_13
    :goto_f
    move-object/from16 v1, v41

    goto :goto_11

    :goto_10
    invoke-static {v2, v10, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_f

    :goto_11
    invoke-static {v10, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, 0x1d1f3295

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lk81/e;->f()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_12
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_14

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm91/o;

    new-instance v2, Lih1/f;

    const/4 v3, 0x6

    move-object/from16 v4, p1

    invoke-direct {v2, v3, v1, v4}, Lih1/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    shl-int/lit8 v3, v31, 0x3

    and-int/lit16 v5, v3, 0x1c00

    const/4 v6, 0x2

    move/from16 v35, v0

    move-object v0, v1

    const/4 v1, 0x0

    move-object/from16 v3, p2

    move-object v4, v10

    move/from16 v8, v35

    invoke-static/range {v0 .. v6}, Lm91/l;->q(Lm91/o;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move v0, v8

    goto :goto_12

    :cond_14
    move v8, v0

    const/4 v2, 0x1

    invoke-static {v10, v8, v2, v2}, Lm4/a;->y(Lp1/q;ZZZ)V

    move-object/from16 v1, v29

    goto :goto_13

    :cond_15
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v1, v5

    :goto_13
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_16

    new-instance v0, Lk81/c;

    const/4 v6, 0x1

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lk81/c;-><init>(Landroidx/compose/ui/Modifier;Lk81/e;Lkotlin/jvm/functions/Function1;III)V

    goto/16 :goto_6

    :cond_16
    return-void
.end method

.method private static final e(Landroidx/compose/ui/Modifier;Lk81/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lk81/d;->d(Landroidx/compose/ui/Modifier;Lk81/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lm91/o;Lk81/e;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    const-string p4, "it"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lp1/q;

    const p2, 0x1d08707c

    invoke-virtual {p3, p2}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Lm91/o;->e()Lm91/u;

    move-result-object p0

    invoke-virtual {p1}, Lk81/e;->getId()Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lb2/t;->w:Lb2/t;

    invoke-static {p2, p0, p1}, Lk81/d;->h(Landroidx/compose/ui/Modifier;Lm91/u;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {p3, p1}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/Modifier;Lk81/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lk81/d;->d(Landroidx/compose/ui/Modifier;Lk81/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final h(Landroidx/compose/ui/Modifier;Lm91/u;Ljava/lang/String;)Landroidx/compose/ui/Modifier;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "sectionId"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final i(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sectionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
