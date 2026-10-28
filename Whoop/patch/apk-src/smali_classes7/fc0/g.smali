.class public abstract Lfc0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a!\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000c\u00b2\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lfc0/h;",
        "state",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ll83/a0;",
        "h",
        "(Lfc0/h;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "Lfc0/b;",
        "q",
        "(Lfc0/b;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "",
        "maxCardHeightPx",
        "advanced-labs_release"
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
.method public static synthetic a(Lfc0/h;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lfc0/g;->p(Lfc0/h;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lbc3/c0;Lq0/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lfc0/g;->o(Lbc3/c0;Lq0/y;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lbc3/c0;Lq0/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lfc0/g;->n(Lbc3/c0;Lq0/y;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lfc0/b;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lfc0/g;->r(Lfc0/b;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lfc0/h;Ly3/c;Lp1/a1;Lq0/r;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lfc0/g;->l(Lfc0/h;Ly3/c;Lp1/a1;Lq0/r;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lfc0/h;)I
    .locals 0

    invoke-static {p0}, Lfc0/g;->i(Lfc0/h;)I

    move-result p0

    return p0
.end method

.method public static synthetic g(Lp1/a1;Ly2/y;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lfc0/g;->m(Lp1/a1;Ly2/y;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lfc0/h;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 53

    move-object/from16 v1, p0

    const-string v0, "state"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p2

    check-cast v7, Lp1/q;

    const v0, 0x2c1f0105

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v2, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    or-int v0, p3, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p3

    :goto_1
    and-int/lit8 v3, p4, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_2

    move-object/from16 v4, p1

    invoke-virtual {v7, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :goto_3
    and-int/lit8 v5, v0, 0x13

    const/16 v6, 0x12

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v5, v6, :cond_5

    move v5, v9

    goto :goto_4

    :cond_5
    move v5, v8

    :goto_4
    and-int/2addr v0, v9

    invoke-virtual {v7, v0, v5}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_19

    sget-object v0, Lb2/t;->w:Lb2/t;

    if-eqz v3, :cond_6

    move-object v3, v0

    goto :goto_5

    :cond_6
    move-object v3, v4

    :goto_5
    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-nez v4, :cond_7

    if-ne v5, v10, :cond_8

    :cond_7
    new-instance v5, Ld1/i;

    const/16 v4, 0x12

    invoke-direct {v5, v1, v4}, Ld1/i;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v7, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v5, Lc93/a;

    const/4 v4, 0x6

    invoke-static {v5, v8, v4, v7, v2}, Lq0/c0;->b(Lc93/a;IILandroidx/compose/runtime/Composer;I)Lq0/b;

    move-result-object v28

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v10, :cond_9

    invoke-static {v7}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v5

    invoke-virtual {v7, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v5, Lbc3/c0;

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v10, :cond_a

    invoke-static {v8, v7}, Lr80/c;->v(ILp1/q;)Lp1/h1;

    move-result-object v11

    :cond_a
    check-cast v11, Lp1/a1;

    sget-object v12, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v7, v12}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ly3/c;

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    int-to-float v2, v2

    const/16 v15, 0x8

    int-to-float v15, v15

    mul-float v29, v2, v15

    invoke-static/range {v29 .. v29}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    move/from16 p2, v6

    sget-object v6, Lb2/e;->M:Lb2/k;

    invoke-static {v2, v6, v7, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    move-object/from16 p1, v10

    iget-wide v9, v7, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v7, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-eqz v6, :cond_b

    invoke-virtual {v7, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_b
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_6
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v7, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v7, v2, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v13, v7, Lp1/q;->S:Z

    if-nez v13, :cond_c

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v13, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_d

    :cond_c
    invoke-static {v4, v7, v4, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v7, v4, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lfc0/h;->b()Ljava/lang/String;

    move-result-object v8

    const/4 v10, 0x0

    invoke-static {v8, v7, v10}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    sget-object v13, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v13, v7, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Lb91/d;->p()Lb91/a;

    move-result-object v22

    invoke-virtual {v13, v7, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v19

    sget v10, Lb91/a;->d:I

    shl-int/lit8 v26, v10, 0x12

    const v27, 0x2fffa

    move-object v10, v3

    const/4 v3, 0x0

    move-object v13, v6

    move-object/from16 v24, v7

    const-wide/16 v6, 0x0

    move-object/from16 v21, v2

    move-object v2, v8

    const/4 v8, 0x0

    move-object/from16 v23, v9

    const/4 v9, 0x0

    move-object/from16 v25, v10

    const/4 v10, 0x0

    move-object/from16 v30, v11

    move-object/from16 v31, v12

    const-wide/16 v11, 0x0

    move-object/from16 v32, v13

    const/4 v13, 0x0

    move-object/from16 v33, v14

    const/4 v14, 0x0

    move/from16 v34, v15

    const/16 v35, 0x1

    const-wide/16 v15, 0x0

    const/high16 v36, 0x3f800000    # 1.0f

    const/16 v17, 0x0

    const/16 v37, 0x0

    const/16 v18, 0x0

    move-object/from16 v38, v4

    move-wide/from16 v51, v19

    move-object/from16 v20, v5

    move-wide/from16 v4, v51

    const/16 v19, 0x0

    move-object/from16 v39, v20

    const/16 v20, 0x0

    move-object/from16 v40, v21

    const/16 v21, 0x0

    move-object/from16 v41, v23

    const/16 v23, 0x0

    move-object/from16 v42, v25

    const/16 v25, 0x0

    move-object/from16 v50, p1

    move-object/from16 p2, v0

    move-object/from16 v0, v30

    move-object/from16 v44, v31

    move-object/from16 v46, v32

    move-object/from16 v45, v33

    move-object/from16 v49, v38

    move-object/from16 v43, v39

    move-object/from16 v47, v40

    move-object/from16 v48, v41

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    mul-float v15, v34, v34

    const/16 v2, 0xb

    const/4 v3, 0x0

    invoke-static {v3, v3, v15, v3, v2}, Landroidx/compose/foundation/layout/a;->c(FFFFI)Ll0/l1;

    move-result-object v4

    sget-object v8, Lb2/e;->J:Lb2/l;

    new-instance v2, Lfc0/c;

    const/4 v3, 0x0

    move-object/from16 v12, v44

    invoke-direct {v2, v1, v12, v0, v3}, Lfc0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v0, 0x52d58fc

    invoke-static {v0, v7, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v14

    const/16 v17, 0x6000

    const/16 v18, 0x3f9a

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const v16, 0x1b0180

    move-object v15, v7

    move-object/from16 v2, v28

    move/from16 v7, v29

    invoke-static/range {v2 .. v18}, Ldp/d;->d(Lq0/y;Landroidx/compose/ui/Modifier;Ll0/k1;Lq0/e;IFLb2/g;Lh0/p3;ZLt2/a;Li0/n;Lf0/k;Lx1/b;Landroidx/compose/runtime/Composer;III)V

    move-object v0, v2

    move-object v7, v15

    invoke-virtual {v1}, Lfc0/h;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v12, 0x1

    if-le v2, v12, :cond_18

    const v2, -0x40239a7b

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    move-object/from16 v2, p2

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->K:Lb2/l;

    sget-object v4, Ll0/m;->a:Ll0/e;

    const/16 v5, 0x30

    invoke-static {v4, v3, v7, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v4, v7, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v7, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-eqz v6, :cond_e

    move-object/from16 v6, v45

    invoke-virtual {v7, v6}, Lp1/q;->l(Lc93/a;)V

    :goto_7
    move-object/from16 v13, v46

    goto :goto_8

    :cond_e
    invoke-virtual {v7}, Lp1/q;->s0()V

    goto :goto_7

    :goto_8
    invoke-static {v7, v13, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v3, v47

    invoke-static {v7, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v7, Lp1/q;->S:Z

    if-nez v3, :cond_f

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_10

    :cond_f
    move-object/from16 v3, v48

    goto :goto_a

    :cond_10
    :goto_9
    move-object/from16 v3, v49

    goto :goto_b

    :goto_a
    invoke-static {v4, v7, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_9

    :goto_b
    invoke-static {v7, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v13, Lny0/o;

    sget-object v14, Lny0/q$c;->f:Lny0/q$c;

    sget-object v2, Lgz0/m0;->CARET_BACKWARD:Lgz0/m0;

    invoke-virtual {v2}, Lgz0/m0;->toWhoopIcon()I

    move-result v15

    invoke-virtual {v0}, Lq0/y;->k()I

    move-result v2

    if-lez v2, :cond_11

    move/from16 v19, v12

    goto :goto_c

    :cond_11
    const/16 v19, 0x0

    :goto_c
    const/16 v24, 0x3dc

    const/16 v25, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v13 .. v25}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v2, Lma0/d;->m:I

    invoke-static {v7, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v15, v43

    invoke-virtual {v7, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v11, v50

    if-nez v2, :cond_12

    if-ne v4, v11, :cond_13

    :cond_12
    new-instance v4, Lfc0/d;

    const/4 v2, 0x0

    invoke-direct {v4, v15, v0, v2}, Lfc0/d;-><init>(Lbc3/c0;Lq0/b;I)V

    invoke-virtual {v7, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    move-object v6, v4

    check-cast v6, Lc93/a;

    sget v8, Lny0/o;->k:I

    const/16 v9, 0xc

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, v13

    invoke-static/range {v2 .. v9}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move v13, v8

    invoke-virtual {v1}, Lfc0/h;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v0}, Lq0/y;->k()I

    move-result v3

    float-to-double v4, v10

    const-wide/16 v8, 0x0

    cmpl-double v4, v4, v8

    if-lez v4, :cond_14

    goto :goto_d

    :cond_14
    const-string v4, "invalid weight; must be greater than zero"

    invoke-static {v4}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_d
    new-instance v4, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v4, v10, v12}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/4 v10, 0x0

    move-object/from16 v50, v11

    const/16 v11, 0x18

    const-wide/16 v5, 0x0

    move-object/from16 v24, v7

    const-wide/16 v7, 0x0

    move/from16 v35, v12

    move-object/from16 v9, v24

    move-object/from16 v12, v50

    invoke-static/range {v2 .. v11}, Ljz0/c;->d(IILandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V

    move-object v7, v9

    new-instance v2, Lny0/o;

    sget-object v3, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    invoke-virtual {v3}, Lgz0/m0;->toWhoopIcon()I

    move-result v16

    invoke-virtual {v0}, Lq0/y;->k()I

    move-result v3

    invoke-virtual {v1}, Lfc0/h;->a()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    if-ge v3, v4, :cond_15

    move/from16 v20, v35

    goto :goto_e

    :cond_15
    const/16 v20, 0x0

    :goto_e
    const/16 v25, 0x3dc

    const/16 v26, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object v5, v15

    move-object v15, v14

    move-object v14, v2

    invoke-direct/range {v14 .. v26}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v2, Lma0/d;->l:I

    invoke-static {v7, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v7, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_16

    if-ne v4, v12, :cond_17

    :cond_16
    new-instance v4, Lfc0/d;

    const/4 v2, 0x1

    invoke-direct {v4, v5, v0, v2}, Lfc0/d;-><init>(Lbc3/c0;Lq0/b;I)V

    invoke-virtual {v7, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    move-object v6, v4

    check-cast v6, Lc93/a;

    const/16 v9, 0xc

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v8, v13

    move-object v2, v14

    invoke-static/range {v2 .. v9}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move/from16 v12, v35

    invoke-virtual {v7, v12}, Lp1/q;->q(Z)V

    const/4 v10, 0x0

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_18
    const/4 v10, 0x0

    const v0, -0x400b2c79

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    :goto_f
    invoke-virtual {v7, v12}, Lp1/q;->q(Z)V

    move-object/from16 v3, v42

    goto :goto_10

    :cond_19
    invoke-virtual {v7}, Lp1/q;->X()V

    move-object v3, v4

    :goto_10
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_1a

    new-instance v0, Lfc0/e;

    const/4 v5, 0x0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lfc0/e;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method

.method private static final i(Lfc0/h;)I
    .locals 0

    invoke-virtual {p0}, Lfc0/h;->a()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method private static final j(Lp1/a1;)I
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0}, Lp1/h1;->x()I

    move-result p0

    return p0
.end method

.method private static final k(Lp1/a1;I)V
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0, p1}, Lp1/h1;->y(I)V

    return-void
.end method

.method private static final l(Lfc0/h;Ly3/c;Lp1/a1;Lq0/r;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    const-string p6, "$this$HorizontalPager"

    invoke-static {p3, p6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lfc0/h;->a()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfc0/b;

    invoke-static {p2}, Lfc0/g;->j(Lp1/a1;)I

    move-result p3

    invoke-interface {p1, p3}, Ly3/c;->e0(I)F

    move-result p1

    const/4 p3, 0x0

    const/4 p4, 0x2

    sget-object p6, Lb2/t;->w:Lb2/t;

    invoke-static {p6, p1, p3, p4}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object p1

    check-cast p5, Lp1/q;

    invoke-virtual {p5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    sget-object p4, Lp1/l;->a:Lp1/v0;

    if-ne p3, p4, :cond_0

    new-instance p3, Lfc0/f;

    const/4 p4, 0x0

    invoke-direct {p3, p2, p4}, Lfc0/f;-><init>(Lp1/a1;I)V

    invoke-virtual {p5, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    check-cast p3, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, p3}, Landroidx/compose/ui/layout/a;->d(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    sget p2, Lkd1/o;->a:I

    const/4 p3, 0x0

    invoke-static {p0, p1, p5, p2, p3}, Lfc0/g;->q(Lfc0/b;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lp1/a1;Ly2/y;)Ll83/a0;
    .locals 4

    const-string v0, "coords"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ly2/y;->n()J

    move-result-wide v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int v0, v0

    invoke-static {p0}, Lfc0/g;->j(Lp1/a1;)I

    move-result v1

    if-le v0, v1, :cond_0

    invoke-interface {p1}, Ly2/y;->n()J

    move-result-wide v0

    and-long/2addr v0, v2

    long-to-int p1, v0

    invoke-static {p0, p1}, Lfc0/g;->k(Lp1/a1;I)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lbc3/c0;Lq0/y;)Ll83/a0;
    .locals 2

    new-instance v0, Lfc0/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lfc0/g$a;-><init>(Lq0/y;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {p0, v1, v1, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lbc3/c0;Lq0/y;)Ll83/a0;
    .locals 2

    new-instance v0, Lfc0/g$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lfc0/g$b;-><init>(Lq0/y;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {p0, v1, v1, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lfc0/h;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lfc0/g;->h(Lfc0/h;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lfc0/b;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 32

    move-object/from16 v1, p0

    move-object/from16 v5, p2

    check-cast v5, Lp1/q;

    const v0, -0x415becf8

    invoke-virtual {v5, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v8, 0x4

    const/4 v2, 0x2

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v5, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    move v0, v8

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    or-int v0, p3, v0

    goto :goto_2

    :cond_2
    move/from16 v0, p3

    :goto_2
    and-int/lit8 v3, p4, 0x2

    if-eqz v3, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v4, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-virtual {v5, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x20

    goto :goto_3

    :cond_5
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v0, v6

    :goto_4
    and-int/lit8 v6, v0, 0x13

    const/16 v12, 0x12

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-eq v6, v12, :cond_6

    move v6, v14

    goto :goto_5

    :cond_6
    move v6, v13

    :goto_5
    and-int/2addr v0, v14

    invoke-virtual {v5, v0, v6}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_b

    sget-object v0, Lb2/t;->w:Lb2/t;

    if-eqz v3, :cond_7

    move-object v15, v0

    goto :goto_6

    :cond_7
    move-object v15, v4

    :goto_6
    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    int-to-float v10, v2

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v2, v10

    invoke-static {v2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    sget-object v4, Lb2/e;->M:Lb2/k;

    const/4 v6, 0x6

    invoke-static {v2, v4, v5, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v5, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v11, v5, Lp1/q;->S:Z

    if-eqz v11, :cond_8

    invoke-virtual {v5, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_8
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_7
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v5, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v5, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v6, v5, Lp1/q;->S:Z

    if-nez v6, :cond_9

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_a

    :cond_9
    invoke-static {v4, v5, v4, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v5, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lfc0/b;->a()Lkd1/o;

    move-result-object v2

    sget v6, Lkd1/o;->a:I

    const/4 v7, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v2

    move-object/from16 v24, v5

    invoke-static {v9, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, v13, v9}, Landroidx/compose/foundation/layout/a;->f(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v3, v8

    invoke-static {v0, v10, v3}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v10, 0x6030

    const/16 v11, 0x68

    const/4 v3, 0x0

    const/4 v5, 0x0

    sget-object v6, Ly2/j;->a:Ly2/b1;

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v9, v24

    invoke-static/range {v2 .. v11}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v9

    invoke-virtual {v1}, Lfc0/b;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v5, v13}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v0, v5, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->Q()Lb91/a;

    move-result-object v22

    invoke-virtual {v0, v5, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v6

    sget v4, Lb91/a;->d:I

    shl-int/lit8 v26, v4, 0x12

    const v27, 0x2fffa

    move v4, v3

    const/4 v3, 0x0

    move v8, v4

    move-object/from16 v24, v5

    move-wide v4, v6

    const-wide/16 v6, 0x0

    move v9, v8

    const/4 v8, 0x0

    move v10, v9

    const/4 v9, 0x0

    move v11, v10

    const/4 v10, 0x0

    move/from16 v16, v11

    const-wide/16 v11, 0x0

    move/from16 v17, v13

    const/4 v13, 0x0

    move/from16 v18, v14

    const/4 v14, 0x0

    move-object/from16 v19, v15

    move/from16 v20, v16

    const-wide/16 v15, 0x0

    move/from16 v21, v17

    const/16 v17, 0x0

    move/from16 v23, v18

    const/16 v18, 0x0

    move-object/from16 v25, v19

    const/16 v19, 0x0

    move/from16 v28, v20

    const/16 v20, 0x0

    move/from16 v29, v21

    const/16 v21, 0x0

    move/from16 v30, v23

    const/16 v23, 0x0

    move-object/from16 v31, v25

    const/16 v25, 0x0

    move-object/from16 p1, v0

    move/from16 v1, v28

    move/from16 v0, v29

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    invoke-virtual/range {p0 .. p0}, Lfc0/b;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v5, v0}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-virtual {v0, v5, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->b()Lb91/a;

    move-result-object v22

    invoke-virtual {v0, v5, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v0

    const/4 v3, 0x0

    move-wide v4, v0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    move-object/from16 v3, v31

    goto :goto_8

    :cond_b
    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v3, v4

    :goto_8
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_c

    new-instance v0, Lfc0/e;

    const/4 v5, 0x1

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lfc0/e;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final r(Lfc0/b;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lfc0/g;->q(Lfc0/b;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
