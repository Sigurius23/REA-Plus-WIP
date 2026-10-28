.class public abstract Llc0/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a;\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00082\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a/\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u0013\u001a\u00020\u00122\u000e\u0008\u0002\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0014H\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u001aW\u0010!\u001a\u00020\u00042\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u001b\u001a\u00020\u00082\u0006\u0010\u001c\u001a\u00020\u00082\u0006\u0010\u001e\u001a\u00020\u001d2\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00142\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0014H\u0003\u00a2\u0006\u0004\u0008!\u0010\"\u00a8\u0006%\u00b2\u0006\u0010\u0010#\u001a\u0004\u0018\u00010\u00088\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010$\u001a\u00020\u001d8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Ljc0/d$c$a;",
        "viewState",
        "Lkotlin/Function1;",
        "Ljc0/a;",
        "Ll83/a0;",
        "onEvent",
        "o",
        "(Ljc0/d$c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "title",
        "subtitle",
        "Lkd1/o;",
        "imageUrl",
        "Lc41/p2;",
        "infoCallout",
        "D",
        "(Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lc41/p2;Landroidx/compose/runtime/Composer;II)V",
        "header",
        "Lgz0/m0;",
        "icon",
        "Lkotlin/Function0;",
        "onIconClick",
        "G",
        "(Ljava/lang/String;Lgz0/m0;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "Ljc0/d$d;",
        "selectedOption",
        "footerText",
        "nextButtonTitle",
        "saveButtonTitle",
        "",
        "isButtonEnabled",
        "onNextClick",
        "onSaveClick",
        "B",
        "(Ljc0/d$d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "selectedOptionId",
        "showBottomSheet",
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
.method private static final A(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Llc0/j;->u(Lp1/c1;Z)V

    sget-object p1, Ljc0/a$g;->a:Ljc0/a$g;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Ljc0/d$d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 35
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljc0/d$d;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v0, p8

    move-object/from16 v3, p7

    check-cast v3, Lp1/q;

    const v4, 0x738f55d1

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v0, 0x6

    const/4 v5, 0x2

    if-nez v4, :cond_1

    invoke-virtual {v3, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    move v4, v5

    :goto_0
    or-int/2addr v4, v0

    goto :goto_1

    :cond_1
    move v4, v0

    :goto_1
    and-int/lit8 v6, v0, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v3, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    :cond_3
    and-int/lit16 v6, v0, 0x180

    if-nez v6, :cond_5

    move-object/from16 v6, p2

    invoke-virtual {v3, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v4, v7

    goto :goto_4

    :cond_5
    move-object/from16 v6, p2

    :goto_4
    and-int/lit16 v7, v0, 0xc00

    if-nez v7, :cond_7

    move-object/from16 v7, p3

    invoke-virtual {v3, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x800

    goto :goto_5

    :cond_6
    const/16 v8, 0x400

    :goto_5
    or-int/2addr v4, v8

    goto :goto_6

    :cond_7
    move-object/from16 v7, p3

    :goto_6
    and-int/lit16 v8, v0, 0x6000

    if-nez v8, :cond_9

    move/from16 v8, p4

    invoke-virtual {v3, v8}, Lp1/q;->h(Z)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x4000

    goto :goto_7

    :cond_8
    const/16 v9, 0x2000

    :goto_7
    or-int/2addr v4, v9

    goto :goto_8

    :cond_9
    move/from16 v8, p4

    :goto_8
    const/high16 v9, 0x30000

    and-int/2addr v9, v0

    if-nez v9, :cond_b

    move-object/from16 v9, p5

    invoke-virtual {v3, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    const/high16 v10, 0x20000

    goto :goto_9

    :cond_a
    const/high16 v10, 0x10000

    :goto_9
    or-int/2addr v4, v10

    goto :goto_a

    :cond_b
    move-object/from16 v9, p5

    :goto_a
    const/high16 v10, 0x180000

    and-int/2addr v10, v0

    if-nez v10, :cond_d

    move-object/from16 v10, p6

    invoke-virtual {v3, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_c

    const/high16 v11, 0x100000

    goto :goto_b

    :cond_c
    const/high16 v11, 0x80000

    :goto_b
    or-int/2addr v4, v11

    :goto_c
    move/from16 v28, v4

    goto :goto_d

    :cond_d
    move-object/from16 v10, p6

    goto :goto_c

    :goto_d
    const v4, 0x92493

    and-int v4, v28, v4

    const v11, 0x92492

    const/4 v12, 0x0

    if-eq v4, v11, :cond_e

    const/4 v4, 0x1

    goto :goto_e

    :cond_e
    move v4, v12

    :goto_e
    and-int/lit8 v11, v28, 0x1

    invoke-virtual {v3, v11, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_15

    const/high16 v4, 0x3f800000    # 1.0f

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    const/4 v15, 0x3

    int-to-float v13, v15

    const/16 v15, 0x8

    int-to-float v15, v15

    mul-float/2addr v13, v15

    int-to-float v5, v5

    mul-float/2addr v5, v15

    invoke-static {v14, v13, v5}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-static {v5}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    sget-object v14, Lb2/e;->M:Lb2/k;

    const/4 v15, 0x6

    invoke-static {v5, v14, v3, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    move-object/from16 v17, v5

    iget-wide v4, v3, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v3, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v15, v3, Lp1/q;->S:Z

    if-eqz v15, :cond_f

    invoke-virtual {v3, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_f
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_f
    sget-object v14, La3/k;->g:La3/i;

    move-object/from16 v15, v17

    invoke-static {v3, v14, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->f:La3/i;

    invoke-static {v3, v14, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v14, v3, Lp1/q;->S:Z

    if-nez v14, :cond_10

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_11

    :cond_10
    invoke-static {v4, v3, v4, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v3, v4, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-nez v2, :cond_12

    const v4, 0x49373e5b

    invoke-virtual {v3, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v12}, Lp1/q;->q(Z)V

    move-object v2, v3

    move-object v1, v11

    move v0, v12

    const/16 v32, 0x6

    goto/16 :goto_10

    :cond_12
    const v4, 0x49373e5c    # 750565.75f

    invoke-virtual {v3, v4}, Lp1/q;->e0(I)V

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v14, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v13, Lx81/d;->b:I

    invoke-virtual {v5, v3, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v15

    invoke-virtual {v15}, Lb91/d;->b()Lb91/a;

    move-result-object v22

    invoke-virtual {v5, v3, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->c1()J

    move-result-wide v17

    move v5, v14

    new-instance v14, Lw3/k;

    const/4 v13, 0x3

    invoke-direct {v14, v13}, Lw3/k;-><init>(I)V

    sget v13, Lb91/a;->d:I

    shl-int/lit8 v26, v13, 0x12

    const v27, 0x2fdf8

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v15, v11

    move v13, v12

    const-wide/16 v11, 0x0

    move/from16 v16, v13

    const/4 v13, 0x0

    move-object/from16 v21, v15

    move/from16 v20, v16

    const-wide/16 v15, 0x0

    move-object/from16 v24, v3

    move-object v3, v4

    move-wide/from16 v33, v17

    move/from16 v18, v5

    move-wide/from16 v4, v33

    const/16 v17, 0x0

    move/from16 v23, v18

    const/16 v18, 0x0

    const/16 v25, 0x6

    const/16 v19, 0x0

    move/from16 v29, v20

    const/16 v20, 0x0

    move-object/from16 v30, v21

    const/16 v21, 0x0

    move/from16 v31, v23

    const/16 v23, 0x0

    move/from16 v32, v25

    const/16 v25, 0x30

    move/from16 v0, v29

    move-object/from16 v1, v30

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    :goto_10
    if-eqz p0, :cond_13

    invoke-virtual/range {p0 .. p0}, Ljc0/d$d;->b()Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;

    move-result-object v3

    goto :goto_11

    :cond_13
    const/4 v3, 0x0

    :goto_11
    if-eqz v3, :cond_14

    const v3, 0x493c8ed9

    invoke-virtual {v2, v3}, Lp1/q;->e0(I)V

    invoke-static/range {p2 .. p2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v14, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    shr-int/lit8 v3, v28, 0x9

    and-int/lit8 v3, v3, 0x70

    or-int/lit8 v3, v3, 0x6

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v4, v4, 0x12

    or-int v17, v3, v4

    shr-int/lit8 v3, v28, 0x6

    and-int/lit16 v3, v3, 0x1c00

    const/16 v19, 0x1fbc

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v15, p5

    move-object/from16 v16, v2

    move/from16 v18, v3

    move/from16 v3, p4

    move-object v2, v1

    invoke-static/range {v2 .. v19}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v16

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    :goto_12
    const/4 v0, 0x1

    goto :goto_13

    :cond_14
    const v3, 0x49406ed9

    invoke-virtual {v2, v3}, Lp1/q;->e0(I)V

    invoke-static/range {p3 .. p3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v14, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    shr-int/lit8 v3, v28, 0x9

    and-int/lit8 v4, v3, 0x70

    or-int/lit8 v4, v4, 0x6

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v5, v5, 0x12

    or-int v17, v4, v5

    and-int/lit16 v3, v3, 0x1c00

    const/16 v19, 0x1fbc

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v15, p6

    move-object/from16 v16, v2

    move/from16 v18, v3

    move/from16 v3, p4

    move-object v2, v1

    invoke-static/range {v2 .. v19}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v16

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    goto :goto_12

    :goto_13
    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    goto :goto_14

    :cond_15
    move-object v2, v3

    invoke-virtual {v2}, Lp1/q;->X()V

    :goto_14
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_16

    new-instance v0, Lam2/u;

    const/4 v9, 0x2

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p8

    invoke-direct/range {v0 .. v9}, Lam2/u;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLc93/a;Lc93/a;II)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method private static final C(Ljc0/d$d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p7, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p8

    invoke-static/range {v1 .. v9}, Llc0/j;->B(Ljc0/d$d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lc41/p2;Landroidx/compose/runtime/Composer;II)V
    .locals 36

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    move/from16 v5, p5

    move-object/from16 v9, p4

    check-cast v9, Lp1/q;

    const v2, -0x3e9ecb59

    invoke-virtual {v9, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v5, 0x6

    const/4 v3, 0x4

    if-nez v2, :cond_1

    move-object/from16 v2, p0

    invoke-virtual {v9, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    move v4, v3

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v5

    goto :goto_1

    :cond_1
    move-object/from16 v2, p0

    move v4, v5

    :goto_1
    and-int/lit8 v6, p6, 0x2

    if-eqz v6, :cond_3

    or-int/lit8 v4, v4, 0x30

    :cond_2
    move-object/from16 v7, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v5, 0x30

    if-nez v7, :cond_2

    move-object/from16 v7, p1

    invoke-virtual {v9, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v4, v8

    :goto_3
    and-int/lit8 v8, p6, 0x4

    if-eqz v8, :cond_5

    or-int/lit16 v4, v4, 0x180

    goto :goto_6

    :cond_5
    and-int/lit16 v10, v5, 0x180

    if-nez v10, :cond_8

    and-int/lit16 v10, v5, 0x200

    if-nez v10, :cond_6

    invoke-virtual {v9, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    goto :goto_4

    :cond_6
    invoke-virtual {v9, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    :goto_4
    if-eqz v10, :cond_7

    const/16 v10, 0x100

    goto :goto_5

    :cond_7
    const/16 v10, 0x80

    :goto_5
    or-int/2addr v4, v10

    :cond_8
    :goto_6
    and-int/lit8 v10, p6, 0x8

    if-eqz v10, :cond_9

    or-int/lit16 v4, v4, 0xc00

    goto :goto_9

    :cond_9
    and-int/lit16 v11, v5, 0xc00

    if-nez v11, :cond_c

    and-int/lit16 v11, v5, 0x1000

    if-nez v11, :cond_a

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    goto :goto_7

    :cond_a
    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    :goto_7
    if-eqz v11, :cond_b

    const/16 v11, 0x800

    goto :goto_8

    :cond_b
    const/16 v11, 0x400

    :goto_8
    or-int/2addr v4, v11

    :cond_c
    :goto_9
    and-int/lit16 v11, v4, 0x493

    const/16 v12, 0x492

    const/4 v13, 0x0

    if-eq v11, v12, :cond_d

    const/4 v11, 0x1

    goto :goto_a

    :cond_d
    move v11, v13

    :goto_a
    and-int/lit8 v12, v4, 0x1

    invoke-virtual {v9, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_18

    const/4 v11, 0x0

    if-eqz v6, :cond_e

    move-object/from16 v32, v11

    goto :goto_b

    :cond_e
    move-object/from16 v32, v7

    :goto_b
    if-eqz v8, :cond_f

    move-object v6, v11

    goto :goto_c

    :cond_f
    move-object v6, v0

    :goto_c
    if-eqz v10, :cond_10

    move-object v1, v11

    :cond_10
    const/high16 v0, 0x3f800000    # 1.0f

    sget-object v15, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Lb2/e;->M:Lb2/k;

    sget-object v10, Ll0/m;->c:Ll0/g;

    const/16 v12, 0x30

    invoke-static {v10, v8, v9, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v10, v9, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v9, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v14, v9, Lp1/q;->S:Z

    if-eqz v14, :cond_11

    invoke-virtual {v9, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_11
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_d
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v9, v12, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v9, v8, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v11, v9, Lp1/q;->S:Z

    if-nez v11, :cond_12

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_13

    :cond_12
    invoke-static {v10, v9, v10, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v9, v8, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v12, 0x8

    if-nez v6, :cond_14

    const v7, -0x58c5ad16

    invoke-virtual {v9, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    move-object/from16 p2, v1

    move-object/from16 v33, v6

    move v3, v13

    move-object v1, v15

    const/16 v16, 0x30

    goto :goto_e

    :cond_14
    const v7, -0x58c5ad15

    invoke-virtual {v9, v7}, Lp1/q;->e0(I)V

    int-to-float v7, v3

    int-to-float v8, v12

    mul-float v19, v7, v8

    const/16 v20, 0x7

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/16 v10, 0x14

    int-to-float v10, v10

    mul-float/2addr v10, v7

    invoke-static {v10, v8}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    sget v10, Lkd1/o;->a:I

    const/4 v11, 0x3

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v6 .. v11}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v7

    move-object/from16 v33, v6

    move-object v8, v14

    const/16 v14, 0x61b0

    move-object v6, v15

    const/16 v15, 0x68

    move-object v10, v6

    move-object v6, v7

    const/4 v7, 0x0

    move-object/from16 v28, v9

    const/4 v9, 0x0

    move-object v11, v10

    sget-object v10, Ly2/j;->a:Ly2/b1;

    move-object/from16 v16, v11

    const/4 v11, 0x0

    move/from16 v17, v12

    const/4 v12, 0x0

    move-object/from16 p2, v1

    move v3, v13

    move-object/from16 v1, v16

    move-object/from16 v13, v28

    const/16 v16, 0x30

    invoke-static/range {v6 .. v15}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v13

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    :goto_e
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v6, v9, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->O()Lb91/a;

    move-result-object v26

    invoke-virtual {v6, v9, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v10

    new-instance v12, Lw3/k;

    const/4 v13, 0x5

    invoke-direct {v12, v13}, Lw3/k;-><init>(I)V

    and-int/lit8 v4, v4, 0xe

    or-int/lit8 v29, v4, 0x30

    sget v4, Lb91/a;->d:I

    shl-int/lit8 v30, v4, 0x12

    const v31, 0x2fdf8

    move v4, v8

    move-object/from16 v28, v9

    move-wide v8, v10

    const-wide/16 v10, 0x0

    move-object/from16 v18, v12

    const/4 v12, 0x0

    move v14, v13

    const/4 v13, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v17, v15

    const-wide/16 v15, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v21, v19

    const-wide/16 v19, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v25, v24

    const/16 v24, 0x0

    move/from16 v27, v25

    const/16 v25, 0x0

    move/from16 v34, v27

    const/16 v27, 0x0

    move-object/from16 v35, v6

    move-object v6, v2

    move-object/from16 v2, v35

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v28

    if-nez v32, :cond_15

    const v0, -0x58bcd0c2

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    move-object/from16 v0, v32

    goto :goto_f

    :cond_15
    const v6, -0x58bcd0c1

    invoke-virtual {v9, v6}, Lp1/q;->e0(I)V

    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    double-to-float v6, v6

    const/16 v7, 0x8

    int-to-float v8, v7

    invoke-static {v6, v8, v1, v9}, Ld;->w(FFLb2/t;Lp1/q;)V

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v2, v9, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->a()Lb91/a;

    move-result-object v26

    invoke-virtual {v2, v9, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v10

    new-instance v0, Lw3/k;

    const/4 v14, 0x5

    invoke-direct {v0, v14}, Lw3/k;-><init>(I)V

    const/16 v29, 0x30

    const v31, 0x2fdf8

    move-object/from16 v28, v9

    move-wide v8, v10

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    move-object/from16 v18, v0

    move-object/from16 v6, v32

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object v0, v6

    move-object/from16 v9, v28

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    :goto_f
    if-nez p2, :cond_16

    const v1, -0x58b769fd

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    move-object/from16 v7, p2

    const/4 v12, 0x1

    goto :goto_10

    :cond_16
    const v2, -0x58b769fc

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    const/4 v2, 0x4

    int-to-float v2, v2

    const/16 v7, 0x8

    int-to-float v4, v7

    mul-float/2addr v2, v4

    const/4 v4, 0x0

    const/4 v12, 0x1

    invoke-static {v1, v4, v2, v12}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_17

    new-instance v1, Llc0/g;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Llc0/g;-><init>(I)V

    invoke-virtual {v9, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    move-object v8, v1

    check-cast v8, Lkotlin/jvm/functions/Function1;

    sget v1, Lc41/p2;->v:I

    shl-int/lit8 v1, v1, 0x3

    or-int/lit16 v10, v1, 0x186

    const/4 v11, 0x0

    move-object/from16 v7, p2

    invoke-static/range {v6 .. v11}, Lc41/r2;->f(Landroidx/compose/ui/Modifier;Lc41/p2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    :goto_10
    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    move-object v2, v0

    move-object v4, v7

    move-object/from16 v3, v33

    goto :goto_11

    :cond_18
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v3, v0

    move-object v4, v1

    move-object v2, v7

    :goto_11
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_19

    new-instance v0, Lkw1/c;

    const/4 v7, 0x6

    move-object/from16 v1, p0

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lkw1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_19
    return-void
.end method

.method private static final E(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lc41/p2;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Llc0/j;->D(Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lc41/p2;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Ljava/lang/String;Lgz0/m0;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 38
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lgz0/m0;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v1, p4

    move-object/from16 v7, p3

    check-cast v7, Lp1/q;

    const v0, -0x61310724

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v1, 0x6

    const/4 v2, 0x4

    move-object/from16 v4, p0

    if-nez v0, :cond_1

    invoke-virtual {v7, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

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

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    invoke-virtual {v7, v3}, Lp1/q;->e(I)Z

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

    const/16 v5, 0x100

    if-eqz v3, :cond_5

    or-int/lit16 v0, v0, 0x180

    :cond_4
    move-object/from16 v6, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v6, v1, 0x180

    if-nez v6, :cond_4

    move-object/from16 v6, p2

    invoke-virtual {v7, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    move v8, v5

    goto :goto_3

    :cond_6
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v0, v8

    :goto_4
    and-int/lit16 v8, v0, 0x93

    const/16 v9, 0x92

    const/16 v28, 0x0

    const/4 v10, 0x1

    if-eq v8, v9, :cond_7

    move v8, v10

    goto :goto_5

    :cond_7
    move/from16 v8, v28

    :goto_5
    and-int/lit8 v9, v0, 0x1

    invoke-virtual {v7, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_10

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_9

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v8, :cond_8

    new-instance v3, Ll72/f;

    const/16 v6, 0xc

    invoke-direct {v3, v6}, Ll72/f;-><init>(I)V

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v3, Lc93/a;

    goto :goto_6

    :cond_9
    move-object v3, v6

    :goto_6
    const/high16 v6, 0x3f800000    # 1.0f

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const-wide/high16 v12, 0x3fe0000000000000L    # 0.5

    double-to-float v6, v12

    const/16 v12, 0x8

    int-to-float v12, v12

    mul-float v15, v6, v12

    const/16 v16, 0x7

    move v6, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    int-to-float v12, v10

    mul-float/2addr v12, v6

    invoke-static {v12}, Ll0/m;->i(F)Ll0/k;

    move-result-object v6

    sget-object v12, Lb2/e;->K:Lb2/l;

    const/16 v13, 0x36

    invoke-static {v6, v12, v7, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v12, v7, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v7, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v15, v7, Lp1/q;->S:Z

    if-eqz v15, :cond_a

    invoke-virtual {v7, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_7
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v7, v14, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v7, v6, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v13, v7, Lp1/q;->S:Z

    if-nez v13, :cond_b

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_c

    :cond_b
    invoke-static {v12, v7, v12, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v7, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v6, v7, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v12

    invoke-virtual {v12}, Lb91/d;->m()Lb91/a;

    move-result-object v22

    invoke-virtual {v6, v7, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->c1()J

    move-result-wide v12

    and-int/lit8 v25, v0, 0xe

    sget v14, Lb91/a;->d:I

    shl-int/lit8 v26, v14, 0x12

    const v27, 0x2fffa

    move-object v14, v3

    const/4 v3, 0x0

    move-object v15, v6

    move-object/from16 v24, v7

    const-wide/16 v6, 0x0

    move-object/from16 v16, v8

    const/4 v8, 0x0

    move-object/from16 v17, v9

    const/4 v9, 0x0

    move/from16 v18, v10

    const/4 v10, 0x0

    move/from16 v19, v5

    move-wide v4, v12

    move v13, v11

    const-wide/16 v11, 0x0

    move/from16 v20, v13

    const/4 v13, 0x0

    move-object/from16 v21, v14

    const/4 v14, 0x0

    move-object/from16 v23, v15

    move-object/from16 v29, v16

    const-wide/16 v15, 0x0

    move-object/from16 v30, v17

    const/16 v17, 0x0

    move/from16 v31, v18

    const/16 v18, 0x0

    move/from16 v32, v19

    const/16 v19, 0x0

    move/from16 v33, v20

    const/16 v20, 0x0

    move-object/from16 v34, v21

    const/16 v21, 0x0

    move-object/from16 v35, v23

    const/16 v23, 0x0

    move-object/from16 v1, v30

    move/from16 v30, v0

    move-object v0, v1

    move v1, v2

    move/from16 v37, v33

    move-object/from16 v36, v35

    move-object/from16 v2, p0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    int-to-float v1, v1

    mul-float/2addr v1, v1

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move/from16 v0, v30

    and-int/lit16 v0, v0, 0x380

    const/16 v1, 0x100

    if-ne v0, v1, :cond_d

    const/16 v28, 0x1

    :cond_d
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v28, :cond_f

    move-object/from16 v1, v29

    if-ne v0, v1, :cond_e

    goto :goto_8

    :cond_e
    move-object/from16 v14, v34

    goto :goto_9

    :cond_f
    :goto_8
    new-instance v0, Liy0/a;

    const/16 v1, 0x1a

    move-object/from16 v14, v34

    invoke-direct {v0, v14, v1}, Liy0/a;-><init>(Lc93/a;I)V

    invoke-virtual {v7, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_9
    move-object v12, v0

    check-cast v12, Lc93/a;

    const/16 v13, 0xf

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    const/4 v1, 0x6

    invoke-static {v0, v7, v1}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v2

    sget v0, Lgy0/f;->f0:I

    invoke-static {v7, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v15, v36

    move/from16 v13, v37

    invoke-virtual {v15, v7, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v5

    const/4 v8, 0x0

    invoke-static/range {v2 .. v9}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    move-object v6, v14

    goto :goto_a

    :cond_10
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_11

    new-instance v0, Ll72/h;

    const/4 v3, 0x4

    move-object/from16 v4, p0

    move-object/from16 v5, p1

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Ll72/h;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ll83/e;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final H()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final I(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final J(Ljava/lang/String;Lgz0/m0;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Llc0/j;->G(Ljava/lang/String;Lgz0/m0;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic K(Lp1/c1;)Z
    .locals 0

    invoke-static {p0}, Llc0/j;->t(Lp1/c1;)Z

    move-result p0

    return p0
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Llc0/j;->A(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljc0/d$c$a;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Llc0/j;->y(Ljc0/d$c$a;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lc41/p2;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Llc0/j;->F(Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lc41/p2;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljc0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llc0/j;->p(Ljc0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/String;Lgz0/m0;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Llc0/j;->J(Ljava/lang/String;Lgz0/m0;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llc0/j;->I(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Llc0/j;->w(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ljc0/d$d;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Llc0/j;->x(Ljc0/d$d;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ljc0/d$c$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Llc0/j;->v(Ljc0/d$c$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llc0/j;->E(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Ljc0/d$d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Llc0/j;->C(Ljc0/d$d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Ljc0/d$c$a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Llc0/j;->q(Ljc0/d$c$a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m()Ll83/a0;
    .locals 1

    invoke-static {}, Llc0/j;->H()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic n(Ljc0/d$c$a;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0, p2}, Llc0/j;->z(Lkotlin/jvm/functions/Function1;Ljc0/d$c$a;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final o(Ljc0/d$c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 69
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljc0/d$c$a;",
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

    const v0, -0x6edc5cff

    invoke-virtual {v5, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v11, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v11

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

    invoke-virtual {v5, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    :goto_3
    and-int/lit8 v6, v0, 0x13

    const/16 v7, 0x12

    const/4 v13, 0x0

    if-eq v6, v7, :cond_5

    const/4 v6, 0x1

    goto :goto_4

    :cond_5
    move v6, v13

    :goto_4
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v5, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_2e

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_7

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v15, :cond_6

    new-instance v3, Llc0/g;

    invoke-direct {v3, v11}, Llc0/g;-><init>(I)V

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v3, Lkotlin/jvm/functions/Function1;

    goto :goto_5

    :cond_7
    move-object v3, v4

    :goto_5
    invoke-virtual {v1}, Ljc0/d$c$a;->j()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_8

    if-ne v6, v15, :cond_9

    :cond_8
    invoke-virtual {v1}, Ljc0/d$c$a;->j()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v6

    invoke-virtual {v5, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v6, Lp1/c1;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v15, :cond_a

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v4}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    invoke-virtual {v5, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v4, Lp1/c1;

    sget-object v7, Ll1/x3;->w:Ll1/x3;

    invoke-static {v5}, Ll1/k3;->l(Lp1/q;)Ll1/w3;

    move-result-object v7

    invoke-static {v4}, Llc0/j;->t(Lp1/c1;)Z

    move-result v8

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-virtual {v5, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    const/4 v11, 0x0

    if-nez v9, :cond_b

    if-ne v10, v15, :cond_c

    :cond_b
    new-instance v10, Llc0/j$a;

    invoke-direct {v10, v7, v4, v11}, Llc0/j$a;-><init>(Ll1/w3;Lp1/c1;Lq83/d;)V

    invoke-virtual {v5, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v10, Lc93/m;

    invoke-static {v5, v10, v8}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v8, 0x3f800000    # 1.0f

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v8, v9}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v10}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, Ll0/m;->c:Ll0/g;

    move-object/from16 v16, v4

    sget-object v4, Lb2/e;->M:Lb2/k;

    invoke-static {v11, v4, v5, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v12, v5, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v5, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v18, v4

    sget-object v4, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v2, v5, Lp1/q;->S:Z

    if-eqz v2, :cond_d

    invoke-virtual {v5, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_d
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_6
    sget-object v2, La3/k;->g:La3/i;

    invoke-static {v5, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v5, v8, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    iget-boolean v14, v5, Lp1/q;->S:Z

    if-nez v14, :cond_e

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    move/from16 v20, v0

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_7

    :cond_e
    move/from16 v20, v0

    :goto_7
    invoke-static {v12, v5, v12, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v5, v0, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v21, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-virtual {v1}, Ljc0/d$c$a;->n()Z

    move-result v10

    if-eqz v10, :cond_10

    sget-object v10, Lgz0/m0;->CROSS:Lgz0/m0;

    invoke-virtual {v10}, Lgz0/m0;->toWhoopIcon()I

    move-result v10

    goto :goto_8

    :cond_10
    sget-object v10, Lx81/d;->a:Lx81/d;

    invoke-static {v10}, Lih0/d0;->C(Lx81/d;)I

    move-result v10

    :goto_8
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v24

    const v38, 0xfffb

    const/16 v39, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    invoke-direct/range {v21 .. v39}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v10, 0x1

    int-to-float v12, v10

    const/16 v14, 0x8

    int-to-float v10, v14

    mul-float/2addr v12, v10

    invoke-static {v12, v9}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v22

    const/4 v14, 0x4

    int-to-float v14, v14

    mul-float v26, v14, v10

    const/16 v27, 0x7

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-static/range {v22 .. v27}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v19

    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v22

    move-object/from16 v23, v4

    and-int/lit8 v4, v20, 0x70

    move-object/from16 v20, v2

    const/16 v2, 0x20

    if-ne v4, v2, :cond_11

    const/4 v2, 0x1

    goto :goto_9

    :cond_11
    const/4 v2, 0x0

    :goto_9
    or-int v2, v22, v2

    move/from16 v22, v2

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v22, :cond_13

    if-ne v2, v15, :cond_12

    goto :goto_a

    :cond_12
    move/from16 v22, v4

    goto :goto_b

    :cond_13
    :goto_a
    new-instance v2, Ll01/q;

    move/from16 v22, v4

    const/4 v4, 0x7

    invoke-direct {v2, v4, v1, v3}, Ll01/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_b
    check-cast v2, Lc93/a;

    sget v4, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    move/from16 v24, v4

    const/4 v4, 0x3

    shl-int/lit8 v24, v24, 0x3

    or-int/lit8 v24, v24, 0x6

    move/from16 v25, v10

    const/16 v10, 0x34

    move/from16 v26, v4

    const/4 v4, 0x0

    move-object/from16 v27, v6

    const/4 v6, 0x0

    move-object/from16 v29, v7

    const/4 v7, 0x0

    move-object v1, v5

    move-object v5, v2

    move-object/from16 v2, v19

    move-object/from16 v19, v16

    move/from16 v16, v12

    move-object/from16 v12, v20

    move-object/from16 v20, v15

    move-object v15, v8

    move-object v8, v1

    move-object/from16 v41, v9

    move/from16 v17, v14

    move-object/from16 v14, v18

    move/from16 v40, v22

    move-object/from16 v1, v23

    move/from16 v9, v24

    move-object/from16 v18, v3

    move-object/from16 v22, v13

    move-object/from16 v3, v21

    move/from16 v13, v26

    move-object/from16 v21, v0

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static/range {v2 .. v10}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v8

    float-to-double v2, v0

    const-wide/16 v6, 0x0

    cmpl-double v2, v2, v6

    if-lez v2, :cond_14

    goto :goto_c

    :cond_14
    const-string v2, "invalid weight; must be greater than zero"

    invoke-static {v2}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_c
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v10, 0x1

    invoke-direct {v2, v0, v10}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    int-to-float v9, v13

    mul-float v3, v9, v25

    const/4 v4, 0x0

    const/4 v6, 0x2

    invoke-static {v2, v3, v4, v6}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v4, v10, v3}, Lgb1/c;->f(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v6, 0x0

    invoke-static {v6, v5, v10}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v7

    const/16 v8, 0xe

    invoke-static {v2, v7, v8}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v11, v14, v5, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v10, v5, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v5, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v10, v5, Lp1/q;->S:Z

    if-eqz v10, :cond_15

    invoke-virtual {v5, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_15
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_d
    invoke-static {v5, v12, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v15, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v5, Lp1/q;->S:Z

    if-nez v1, :cond_16

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    :cond_16
    move-object/from16 v1, v22

    goto :goto_f

    :cond_17
    :goto_e
    move-object/from16 v1, v21

    goto :goto_10

    :goto_f
    invoke-static {v6, v5, v6, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_e

    :goto_10
    invoke-static {v5, v1, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Ljc0/d$c$a;->m()Ljava/lang/String;

    move-result-object v2

    move-object v1, v3

    invoke-virtual/range {p0 .. p0}, Ljc0/d$c$a;->k()Ljava/lang/String;

    move-result-object v3

    move v6, v4

    invoke-virtual/range {p0 .. p0}, Ljc0/d$c$a;->c()Lkd1/o;

    move-result-object v4

    move-object v8, v5

    invoke-virtual/range {p0 .. p0}, Ljc0/d$c$a;->d()Lc41/p2;

    move-result-object v5

    sget v7, Lkd1/o;->a:I

    shl-int/lit8 v7, v7, 0x6

    sget v10, Lc41/p2;->v:I

    shl-int/lit8 v10, v10, 0x9

    or-int/2addr v7, v10

    move v10, v6

    move-object v6, v8

    const/4 v8, 0x0

    invoke-static/range {v2 .. v8}, Llc0/j;->D(Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lc41/p2;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v6

    invoke-virtual/range {p0 .. p0}, Ljc0/d$c$a;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Ljc0/d$c$a;->h()Lgz0/m0;

    move-result-object v3

    move/from16 v11, v40

    const/16 v4, 0x20

    if-ne v11, v4, :cond_18

    const/4 v4, 0x1

    goto :goto_11

    :cond_18
    const/4 v4, 0x0

    :goto_11
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v12, v20

    if-nez v4, :cond_1a

    if-ne v6, v12, :cond_19

    goto :goto_12

    :cond_19
    move-object/from16 v14, v18

    move-object/from16 v15, v19

    goto :goto_13

    :cond_1a
    :goto_12
    new-instance v6, Lbs1/i;

    const/16 v4, 0x16

    move-object/from16 v14, v18

    move-object/from16 v15, v19

    invoke-direct {v6, v14, v15, v4}, Lbs1/i;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v5, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_13
    move-object v4, v6

    check-cast v4, Lc93/a;

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Llc0/j;->G(Ljava/lang/String;Lgz0/m0;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const v2, -0x458a4b5a

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Ljc0/d$c$a;->f()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_14
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_20

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v63, v2

    check-cast v63, Ljc0/d$d;

    move-object/from16 v2, v41

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move/from16 v4, v17

    invoke-static {v3, v9, v4}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    double-to-float v6, v6

    mul-float v6, v6, v25

    const/4 v7, 0x1

    invoke-static {v3, v10, v6, v7}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v42, Ly71/o;->p:Ly71/o$c;

    invoke-virtual/range {v63 .. v63}, Ljc0/d$d;->d()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v43

    invoke-virtual/range {v63 .. v63}, Ljc0/d$d;->c()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_1c

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    if-nez v6, :cond_1b

    goto :goto_16

    :cond_1b
    :goto_15
    move-object/from16 v46, v6

    goto :goto_17

    :cond_1c
    :goto_16
    const-string v6, ""

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    goto :goto_15

    :goto_17
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v12, :cond_1d

    sget-object v6, Llc0/j$b;->w:Llc0/j$b;

    invoke-virtual {v5, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-static {v6}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v47

    invoke-static/range {v27 .. v27}, Llc0/j;->r(Lp1/c1;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {v63 .. v63}, Ljc0/d$d;->a()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v58

    const v66, 0x6f7fe6

    const/16 v67, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    invoke-static/range {v42 .. v67}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v6

    move-object/from16 v7, v27

    move-object/from16 v0, v63

    invoke-virtual {v5, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v18

    invoke-virtual {v5, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v19

    or-int v18, v18, v19

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v18, :cond_1f

    if-ne v1, v12, :cond_1e

    goto :goto_18

    :cond_1e
    const/16 v10, 0x8

    goto :goto_19

    :cond_1f
    :goto_18
    new-instance v1, Ll01/q;

    const/16 v10, 0x8

    invoke-direct {v1, v10, v0, v7}, Ll01/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v5, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_19
    check-cast v1, Lc93/a;

    sget v0, Ly71/o;->q:I

    shl-int/2addr v0, v13

    move-object/from16 v27, v7

    const/4 v7, 0x0

    move v10, v4

    move-object v4, v1

    move v1, v10

    move-object v10, v2

    move-object v2, v3

    move-object v3, v6

    move v6, v0

    move-object/from16 v0, v27

    invoke-static/range {v2 .. v7}, Ly71/n;->c(Landroidx/compose/ui/Modifier;Ly71/o;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move/from16 v17, v1

    move-object/from16 v41, v10

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    const/4 v10, 0x0

    goto/16 :goto_14

    :cond_20
    move/from16 v2, v16

    move-object/from16 v0, v27

    move-object/from16 v10, v41

    const/4 v6, 0x0

    invoke-static {v5, v6, v10, v2, v5}, Lih0/d0;->B(Lp1/q;ZLb2/t;FLp1/q;)V

    const/4 v10, 0x1

    invoke-virtual {v5, v10}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Ljc0/d$c$a;->f()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_21
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_22

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljc0/d$d;

    invoke-virtual {v3}, Ljc0/d$d;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0}, Llc0/j;->r(Lp1/c1;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_21

    goto :goto_1a

    :cond_22
    const/4 v2, 0x0

    :goto_1a
    check-cast v2, Ljc0/d$d;

    invoke-virtual/range {p0 .. p0}, Ljc0/d$c$a;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Ljc0/d$c$a;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Ljc0/d$c$a;->i()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Llc0/j;->r(Lp1/c1;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_23

    const/4 v6, 0x1

    :goto_1b
    move-object v7, v1

    move-object/from16 v1, p0

    goto :goto_1c

    :cond_23
    const/4 v6, 0x0

    goto :goto_1b

    :goto_1c
    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v5, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v8, v9

    const/16 v9, 0x20

    if-ne v11, v9, :cond_24

    const/4 v10, 0x1

    goto :goto_1d

    :cond_24
    const/4 v10, 0x0

    :goto_1d
    or-int/2addr v8, v10

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_25

    if-ne v9, v12, :cond_26

    :cond_25
    new-instance v9, Llc0/i;

    invoke-direct {v9, v1, v14, v0}, Llc0/i;-><init>(Ljc0/d$c$a;Lkotlin/jvm/functions/Function1;Lp1/c1;)V

    invoke-virtual {v5, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_26
    check-cast v9, Lc93/a;

    const/16 v8, 0x20

    if-ne v11, v8, :cond_27

    const/4 v10, 0x1

    goto :goto_1e

    :cond_27
    const/4 v10, 0x0

    :goto_1e
    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v8, v10

    invoke-virtual {v5, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v8, v10

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v8, :cond_28

    if-ne v10, v12, :cond_29

    :cond_28
    new-instance v10, Llc0/i;

    invoke-direct {v10, v14, v1, v0}, Llc0/i;-><init>(Lkotlin/jvm/functions/Function1;Ljc0/d$c$a;Lp1/c1;)V

    invoke-virtual {v5, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_29
    move-object v8, v10

    check-cast v8, Lc93/a;

    const/4 v10, 0x0

    move-object/from16 v68, v9

    move-object v9, v5

    move-object v5, v7

    move-object/from16 v7, v68

    invoke-static/range {v2 .. v10}, Llc0/j;->B(Ljc0/d$d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    move-object v5, v9

    const/4 v10, 0x1

    invoke-virtual {v5, v10}, Lp1/q;->q(Z)V

    invoke-static {v15}, Llc0/j;->t(Lp1/c1;)Z

    move-result v0

    if-eqz v0, :cond_2d

    invoke-virtual {v1}, Ljc0/d$c$a;->a()Ljc0/d$b;

    move-result-object v0

    if-eqz v0, :cond_2d

    const v0, 0x258047b

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Ljc0/d$c$a;->a()Ljc0/d$b;

    move-result-object v3

    const/16 v2, 0x20

    if-ne v11, v2, :cond_2a

    goto :goto_1f

    :cond_2a
    const/4 v10, 0x0

    :goto_1f
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v10, :cond_2b

    if-ne v0, v12, :cond_2c

    :cond_2b
    new-instance v0, Lbs1/i;

    const/16 v2, 0x17

    invoke-direct {v0, v14, v15, v2}, Lbs1/i;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v5, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2c
    check-cast v0, Lc93/a;

    sget v2, Lny0/h;->z:I

    shl-int/lit8 v7, v2, 0x3

    const/4 v8, 0x1

    const/4 v2, 0x0

    move-object v6, v5

    move-object/from16 v4, v29

    move-object v5, v0

    invoke-static/range {v2 .. v8}, Llc0/b;->g(Landroidx/compose/ui/Modifier;Ljc0/d$b;Ll1/w3;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v6

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Lp1/q;->q(Z)V

    goto :goto_20

    :cond_2d
    const/4 v6, 0x0

    const v0, 0x25c5421

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v6}, Lp1/q;->q(Z)V

    :goto_20
    move-object v3, v14

    goto :goto_21

    :cond_2e
    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v3, v4

    :goto_21
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_2f

    new-instance v0, Lio2/k0;

    const/16 v5, 0x14

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lio2/k0;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_2f
    return-void
.end method

.method private static final p(Ljc0/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Ljc0/d$c$a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Llc0/j;->o(Ljc0/d$c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lp1/c1;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final s(Lp1/c1;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final t(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
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

.method private static final u(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final v(Ljc0/d$c$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Ljc0/d$c$a;->n()Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Ljc0/a$c;->a:Ljc0/a$c;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    sget-object p0, Ljc0/a$b;->a:Ljc0/a$b;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p1, v0}, Llc0/j;->u(Lp1/c1;Z)V

    sget-object p1, Ljc0/a$g;->a:Ljc0/a$g;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Ljc0/d$d;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Ljc0/d$d;->a()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Llc0/j;->s(Lp1/c1;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Ljc0/d$c$a;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 5

    invoke-virtual {p0}, Ljc0/d$c$a;->f()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljc0/d$d;

    invoke-virtual {v3}, Ljc0/d$d;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {p2}, Llc0/j;->r(Lp1/c1;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    check-cast v1, Ljc0/d$d;

    new-instance v0, Ljc0/a$f;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljc0/d$d;->b()Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;

    move-result-object v2

    :cond_2
    invoke-virtual {p0}, Ljc0/d$c$a;->l()Ljava/lang/String;

    move-result-object p0

    invoke-static {p2}, Llc0/j;->r(Lp1/c1;)Ljava/lang/String;

    move-result-object p2

    const-string v1, "USER"

    invoke-direct {v0, v2, p0, p2, v1}, Ljc0/a$f;-><init>(Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lkotlin/jvm/functions/Function1;Ljc0/d$c$a;Lp1/c1;)Ll83/a0;
    .locals 3

    new-instance v0, Ljc0/a$f;

    invoke-virtual {p1}, Ljc0/d$c$a;->l()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2}, Llc0/j;->r(Lp1/c1;)Ljava/lang/String;

    move-result-object p2

    const-string v1, "USER"

    const/4 v2, 0x0

    invoke-direct {v0, v2, p1, p2, v1}, Ljc0/a$f;-><init>(Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
