.class public abstract Lg90/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a+\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00082\u0008\u0010\n\u001a\u0004\u0018\u00010\u00082\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lg90/g;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "h",
        "(Lg90/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "subtitle",
        "",
        "learnMore",
        "f",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V",
        "activation_release"
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lg90/f;->k(Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V

    return-void
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lg90/f;->i(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;Lp1/i0;)Lp1/h0;
    .locals 0

    invoke-static {p0, p1, p2}, Lg90/f;->j(Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;Lp1/i0;)Lp1/h0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lg90/g;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lg90/f;->l(Lg90/g;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lg90/f;->g(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 40

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v0, p4

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    const v4, -0x6431dfec

    invoke-virtual {v12, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v0, 0x6

    const/4 v5, 0x4

    if-nez v4, :cond_2

    and-int/lit8 v4, v0, 0x8

    if-nez v4, :cond_0

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_0

    :cond_0
    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_0
    if-eqz v4, :cond_1

    move v4, v5

    goto :goto_1

    :cond_1
    const/4 v4, 0x2

    :goto_1
    or-int/2addr v4, v0

    goto :goto_2

    :cond_2
    move v4, v0

    :goto_2
    and-int/lit8 v6, v0, 0x30

    if-nez v6, :cond_5

    and-int/lit8 v6, v0, 0x40

    if-nez v6, :cond_3

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_3

    :cond_3
    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    :goto_3
    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_4

    :cond_4
    const/16 v6, 0x10

    :goto_4
    or-int/2addr v4, v6

    :cond_5
    and-int/lit16 v6, v0, 0x180

    if-nez v6, :cond_7

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x100

    goto :goto_5

    :cond_6
    const/16 v6, 0x80

    :goto_5
    or-int/2addr v4, v6

    :cond_7
    and-int/lit16 v6, v4, 0x93

    const/16 v7, 0x92

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v6, v7, :cond_8

    move v6, v9

    goto :goto_6

    :cond_8
    move v6, v8

    :goto_6
    and-int/lit8 v7, v4, 0x1

    invoke-virtual {v12, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_e

    const/high16 v6, 0x3f800000    # 1.0f

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const/16 v6, 0xa

    int-to-float v6, v6

    const/16 v10, 0x8

    int-to-float v10, v10

    mul-float v17, v6, v10

    const/16 v18, 0x7

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const-wide/high16 v13, 0x3fe0000000000000L    # 0.5

    double-to-float v11, v13

    mul-float v30, v11, v10

    invoke-static/range {v30 .. v30}, Ll0/m;->i(F)Ll0/k;

    move-result-object v10

    sget-object v11, Lb2/e;->M:Lb2/k;

    const/4 v13, 0x6

    invoke-static {v10, v11, v12, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v10

    iget-wide v13, v12, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v12, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v15, v12, Lp1/q;->S:Z

    if-eqz v15, :cond_9

    invoke-virtual {v12, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_9
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_7
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v12, v14, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v12, v10, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v13, v12, Lp1/q;->S:Z

    if-nez v13, :cond_a

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_b

    :cond_a
    invoke-static {v11, v12, v11, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v12, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    and-int/lit8 v4, v4, 0xe

    or-int/2addr v4, v6

    invoke-static {v1, v12, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v10, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v10, v12, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v13

    invoke-virtual {v13}, Lb91/d;->O()Lb91/a;

    move-result-object v24

    invoke-virtual {v10, v12, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->y()J

    move-result-wide v13

    sget v15, Lb91/a;->d:I

    shl-int/lit8 v28, v15, 0x12

    const v29, 0x2fffa

    move v15, v5

    const/4 v5, 0x0

    move/from16 v16, v8

    move/from16 v17, v9

    const-wide/16 v8, 0x0

    move-object/from16 v18, v10

    const/4 v10, 0x0

    move/from16 v19, v11

    const/4 v11, 0x0

    move-object/from16 v26, v12

    const/4 v12, 0x0

    move/from16 v20, v6

    move-object/from16 v21, v7

    move-wide v6, v13

    const-wide/16 v13, 0x0

    move/from16 v22, v15

    const/4 v15, 0x0

    move/from16 v23, v16

    const/16 v16, 0x0

    move/from16 v27, v17

    move-object/from16 v25, v18

    const-wide/16 v17, 0x0

    move/from16 v31, v19

    const/16 v19, 0x0

    move/from16 v32, v20

    const/16 v20, 0x0

    move-object/from16 v33, v21

    const/16 v21, 0x0

    move/from16 v34, v22

    const/16 v22, 0x0

    move/from16 v35, v23

    const/16 v23, 0x0

    move-object/from16 v36, v25

    const/16 v25, 0x0

    move/from16 v37, v27

    const/16 v27, 0x0

    move/from16 v3, v31

    move/from16 v0, v32

    move-object/from16 v38, v33

    move/from16 v1, v35

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v26

    if-nez v2, :cond_c

    const v0, 0x2183d65d

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    move-object/from16 v0, v36

    move-object/from16 v39, v38

    const/4 v2, 0x1

    goto :goto_8

    :cond_c
    const v4, 0x2183d65e

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    const/4 v4, 0x1

    int-to-float v5, v4

    const/4 v15, 0x4

    int-to-float v6, v15

    move-object/from16 v7, v38

    invoke-static {v5, v6, v7, v12}, Ld;->w(FFLb2/t;Lp1/q;)V

    invoke-static {v2, v12, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v5, v36

    invoke-virtual {v5, v12, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->a()Lb91/a;

    move-result-object v24

    invoke-virtual {v5, v12, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->c1()J

    move-result-wide v8

    const/16 v27, 0x0

    const v29, 0x2fffa

    const/4 v5, 0x0

    move-object v13, v7

    move-wide v6, v8

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v26, v12

    const/4 v12, 0x0

    move-object/from16 v33, v13

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    move v2, v4

    move-object/from16 v39, v33

    move-object v4, v0

    move-object/from16 v0, v36

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v26

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    :goto_8
    if-nez p2, :cond_d

    const v0, 0x21880a86

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    goto/16 :goto_9

    :cond_d
    const v4, 0x21880a87

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    int-to-float v4, v2

    const/4 v15, 0x4

    int-to-float v5, v15

    move-object/from16 v13, v39

    invoke-static {v4, v5, v13, v12}, Ld;->w(FFLb2/t;Lp1/q;)V

    const/16 v17, 0x0

    const/16 v18, 0xd

    const/4 v14, 0x0

    const/16 v16, 0x0

    move/from16 v15, v30

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v30

    sget-object v4, Liz0/l;->a:Liz0/l;

    invoke-virtual {v0, v12, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->k()Lb91/a;

    move-result-object v5

    invoke-virtual {v5}, Lb91/a;->d()Ll3/v0;

    move-result-object v5

    invoke-virtual {v0, v12, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v13

    invoke-virtual {v0, v12, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v6

    sget v0, Liz0/l;->b:I

    shl-int/lit8 v28, v0, 0xf

    const/16 v29, 0x7fdc

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    move-object/from16 v26, v12

    const/4 v12, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    invoke-virtual/range {v4 .. v29}, Liz0/l;->a(Ll3/v0;JJJLp3/r;JIJLiz0/a;JFFZZFLandroidx/compose/runtime/Composer;III)Liz0/m;

    move-result-object v6

    sget v0, Liz0/m;->p:I

    shl-int/lit8 v0, v0, 0x9

    or-int/lit8 v13, v0, 0x30

    const/16 v14, 0x1f4

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v3, p2

    move-object/from16 v12, v26

    move-object/from16 v4, v30

    invoke-static/range {v3 .. v14}, Liz0/g;->M(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    :goto_9
    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_e
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_f

    new-instance v0, Lg90/c;

    const/4 v5, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lg90/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final g(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lg90/f;->f(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final h(Lg90/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg90/g;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v5, p2

    check-cast v5, Lp1/q;

    const v0, 0x292fd05d

    invoke-virtual {v5, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

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

    const/4 v0, 0x4

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

    const/16 v4, 0x20

    if-eqz v3, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v6, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v6, p3, 0x30

    if-nez v6, :cond_3

    move-object/from16 v6, p1

    invoke-virtual {v5, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    move v7, v4

    goto :goto_3

    :cond_5
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v0, v7

    :goto_4
    and-int/lit8 v7, v0, 0x13

    const/16 v8, 0x12

    const/4 v12, 0x0

    const/4 v13, 0x1

    if-eq v7, v8, :cond_6

    move v7, v13

    goto :goto_5

    :cond_6
    move v7, v12

    :goto_5
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v5, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_15

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_8

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v7, :cond_7

    new-instance v3, Lg40/y1;

    const/16 v6, 0x10

    invoke-direct {v3, v6}, Lg40/y1;-><init>(I)V

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v14, v3

    goto :goto_6

    :cond_8
    move-object v14, v6

    :goto_6
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()Lp1/t1;

    move-result-object v3

    invoke-virtual {v5, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/lifecycle/g0;

    and-int/lit8 v0, v0, 0x70

    if-ne v0, v4, :cond_9

    move v0, v13

    goto :goto_7

    :cond_9
    move v0, v12

    :goto_7
    invoke-virtual {v5, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_a

    if-ne v4, v7, :cond_b

    :cond_a
    new-instance v4, Lg90/e;

    const/4 v0, 0x0

    invoke-direct {v4, v3, v14, v0}, Lg90/e;-><init>(Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v5, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v3, v4, v5}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    const/high16 v0, 0x3f800000    # 1.0f

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    int-to-float v2, v2

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float v17, v2, v4

    const/4 v2, 0x3

    int-to-float v2, v2

    mul-float v8, v2, v4

    const/4 v10, 0x0

    const/16 v11, 0x8

    move/from16 v9, v17

    move/from16 v7, v17

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Ll0/m;->d:Ll0/g;

    sget-object v6, Lb2/e;->M:Lb2/k;

    const/4 v7, 0x6

    invoke-static {v4, v6, v5, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v5, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v9, v5, Lp1/q;->S:Z

    if-eqz v9, :cond_c

    invoke-virtual {v5, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_c
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_8
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v5, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v5, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v10, v5, Lp1/q;->S:Z

    if-nez v10, :cond_d

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_e

    :cond_d
    invoke-static {v6, v5, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v5, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v10, v0

    const-wide/16 v15, 0x0

    cmpl-double v2, v10, v15

    if-lez v2, :cond_f

    move v2, v13

    goto :goto_9

    :cond_f
    move v2, v12

    :goto_9
    if-nez v2, :cond_10

    const-string v2, "invalid weight; must be greater than zero"

    invoke-static {v2}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_10
    new-instance v15, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v15, v0, v13}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/16 v19, 0x0

    const/16 v20, 0xd

    const/16 v16, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v10, Lb2/e;->N:Lb2/k;

    sget-object v11, Ll0/m;->e:Ll0/h;

    const/16 v15, 0x36

    invoke-static {v11, v10, v5, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v10

    move-object v15, v14

    iget-wide v13, v5, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v5, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v14, v5, Lp1/q;->S:Z

    if-eqz v14, :cond_11

    invoke-virtual {v5, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_11
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v5, v9, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v4, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v5, Lp1/q;->S:Z

    if-nez v4, :cond_12

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_13

    :cond_12
    invoke-static {v11, v5, v11, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    invoke-static {v5, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lg90/g;->a()Lkd1/o;

    move-result-object v2

    if-nez v2, :cond_14

    const v0, 0x79dd679f    # 1.4369991E35f

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v12}, Lp1/q;->q(Z)V

    :goto_b
    const/4 v0, 0x1

    goto :goto_c

    :cond_14
    const v4, 0x79dd67a0    # 1.4369992E35f

    invoke-virtual {v5, v4}, Lp1/q;->e0(I)V

    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget v6, Lkd1/o;->a:I

    const/4 v7, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v2

    const/16 v10, 0x61b0

    const/16 v11, 0x68

    move-object v9, v5

    const/4 v5, 0x0

    sget-object v6, Ly2/j;->a:Ly2/b1;

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v4, v0

    invoke-static/range {v2 .. v11}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v9

    invoke-virtual {v5, v12}, Lp1/q;->q(Z)V

    goto :goto_b

    :goto_c
    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v1}, Lg90/g;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v1}, Lg90/g;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v1}, Lg90/g;->b()Ljava/lang/String;

    move-result-object v4

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v7, v6, 0x3

    or-int/2addr v6, v7

    invoke-static {v2, v3, v4, v5, v6}, Lg90/f;->f(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    move-object v3, v15

    goto :goto_d

    :cond_15
    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v3, v6

    :goto_d
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_16

    new-instance v0, Lfc0/e;

    const/4 v5, 0x6

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lfc0/e;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method private static final i(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;Lp1/i0;)Lp1/h0;
    .locals 1

    const-string v0, "$this$DisposableEffect"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lg90/d;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, Lg90/d;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-interface {p0}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    new-instance p1, Lg90/f$a;

    invoke-direct {p1, p0, p2}, Lg90/f$a;-><init>(Landroidx/lifecycle/g0;Landroidx/lifecycle/e0;)V

    return-object p1
.end method

.method private static final k(Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Landroidx/lifecycle/v;->ON_RESUME:Landroidx/lifecycle/v;

    if-ne p2, p1, :cond_0

    sget-object p1, Lj80/a$b;->a:Lj80/a$b;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private static final l(Lg90/g;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lg90/f;->h(Lg90/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
