.class public abstract Lrs0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aC\u0010\u0007\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001aC\u0010\u000b\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0008\u0008\u0002\u0010\n\u001a\u00020\tH\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "backButtonAction",
        "needHelpAction",
        "nextAction",
        "Lms0/a;",
        "viewModel",
        "g",
        "(Lc93/a;Lc93/a;Lc93/a;Lms0/a;Landroidx/compose/runtime/Composer;II)V",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "e",
        "(Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "connectivity-common-ui_release"
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
.method public static synthetic a(Lc93/a;Lc93/a;Lc93/a;Lms0/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lrs0/b;->j(Lc93/a;Lc93/a;Lc93/a;Lms0/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lrs0/b;->f(Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lms0/a;Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lrs0/b;->i(Lms0/a;Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lms0/a;Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lrs0/b;->h(Lms0/a;Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 48
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v10, p1

    move-object/from16 v9, p2

    move/from16 v11, p5

    const-string v0, "backButtonAction"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "needHelpAction"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nextAction"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, p4

    check-cast v6, Lp1/q;

    const v0, 0x1bdce644

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v11, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v6, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v11

    goto :goto_1

    :cond_1
    move v0, v11

    :goto_1
    and-int/lit8 v2, v11, 0x30

    if-nez v2, :cond_3

    invoke-virtual {v6, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v0, v2

    :cond_3
    and-int/lit16 v2, v11, 0x180

    if-nez v2, :cond_5

    invoke-virtual {v6, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v0, v2

    :cond_5
    and-int/lit8 v2, p6, 0x8

    if-eqz v2, :cond_7

    or-int/lit16 v0, v0, 0xc00

    :cond_6
    move-object/from16 v3, p3

    :goto_4
    move v13, v0

    goto :goto_6

    :cond_7
    and-int/lit16 v3, v11, 0xc00

    if-nez v3, :cond_6

    move-object/from16 v3, p3

    invoke-virtual {v6, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    const/16 v4, 0x800

    goto :goto_5

    :cond_8
    const/16 v4, 0x400

    :goto_5
    or-int/2addr v0, v4

    goto :goto_4

    :goto_6
    and-int/lit16 v0, v13, 0x493

    const/16 v4, 0x492

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-eq v0, v4, :cond_9

    move v0, v15

    goto :goto_7

    :cond_9
    move v0, v14

    :goto_7
    and-int/lit8 v4, v13, 0x1

    invoke-virtual {v6, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_13

    sget-object v16, Lb2/t;->w:Lb2/t;

    if-eqz v2, :cond_a

    move-object/from16 v0, v16

    goto :goto_8

    :cond_a
    move-object v0, v3

    :goto_8
    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v3}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v3}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v3}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const-string v4, "take_off_whoop_pairing_help_screen"

    invoke-static {v3, v4}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Ll0/m;->c:Ll0/g;

    sget-object v5, Lb2/e;->M:Lb2/k;

    invoke-static {v4, v5, v6, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v7, v6, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v6, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v2, v6, Lp1/q;->S:Z

    if-eqz v2, :cond_b

    invoke-virtual {v6, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_b
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_9
    sget-object v2, La3/k;->g:La3/i;

    invoke-static {v6, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v6, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v12, v6, Lp1/q;->S:Z

    if-nez v12, :cond_c

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_d

    :cond_c
    invoke-static {v5, v6, v5, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v12, La3/k;->d:La3/i;

    invoke-static {v6, v12, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v23, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v24

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/w;->q()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v26

    sget v3, Luv0/c;->E:I

    invoke-static {v6, v3}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v27

    const v40, 0xfff2

    const/16 v41, 0x0

    const/16 v25, 0x0

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

    const/16 v38, 0x0

    const/16 v39, 0x0

    invoke-direct/range {v23 .. v41}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    int-to-float v3, v15

    const/16 v5, 0x8

    int-to-float v14, v5

    mul-float v18, v3, v14

    const/16 v21, 0x7

    const/16 v17, 0x0

    move/from16 v20, v18

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object/from16 v25, v16

    move/from16 v24, v20

    sget v5, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    move/from16 v16, v13

    const/4 v13, 0x3

    shl-int/2addr v5, v13

    or-int/lit8 v5, v5, 0x6

    shl-int/lit8 v13, v16, 0x9

    and-int/lit16 v13, v13, 0x1c00

    or-int/2addr v5, v13

    move-object v13, v8

    const/16 v8, 0x34

    move-object/from16 v18, v2

    const/4 v2, 0x0

    move-object/from16 v19, v4

    const/4 v4, 0x0

    move-object/from16 v20, v7

    move v7, v5

    const/4 v5, 0x0

    move-object/from16 v38, v0

    move-object v0, v3

    move-object/from16 v42, v13

    move-object/from16 v43, v18

    move-object/from16 v44, v19

    move-object/from16 v45, v20

    const/high16 v13, 0x3f800000    # 1.0f

    move-object v3, v1

    move-object/from16 v1, v23

    invoke-static/range {v0 .. v8}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget v0, Los0/f;->e:I

    const/4 v1, 0x0

    invoke-static {v0, v6, v1}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v0

    float-to-double v1, v13

    const-wide/16 v3, 0x0

    cmpl-double v1, v1, v3

    if-lez v1, :cond_e

    goto :goto_a

    :cond_e
    const-string v1, "invalid weight; must be greater than zero"

    invoke-static {v1}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_a
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v2, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v3, v13, v2

    if-lez v3, :cond_f

    goto :goto_b

    :cond_f
    move v2, v13

    :goto_b
    invoke-direct {v1, v2, v15}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v13, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->N:Lb2/k;

    invoke-static {v2, v1}, Lev/n;->g(Lb2/k;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v20, 0x30

    const/16 v21, 0x78

    move v3, v13

    const/4 v13, 0x0

    move v4, v15

    const/4 v15, 0x0

    move/from16 v5, v16

    const/16 v16, 0x0

    const/4 v7, 0x3

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v19, v12

    move-object v12, v0

    move-object/from16 v0, v19

    move/from16 v19, v14

    move-object v14, v1

    move/from16 v1, v19

    move-object/from16 v19, v6

    move v6, v4

    const/4 v4, 0x2

    invoke-static/range {v12 .. v21}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v8, v19

    invoke-static/range {v24 .. v24}, Ll0/m;->i(F)Ll0/k;

    move-result-object v12

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v19, 0x0

    move/from16 v18, v24

    move-object/from16 v16, v25

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v13

    move-object/from16 v40, v16

    move/from16 v39, v18

    int-to-float v14, v7

    mul-float/2addr v14, v1

    const/4 v15, 0x0

    invoke-static {v13, v14, v15, v4}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const/16 v15, 0x36

    invoke-static {v12, v2, v8, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v3, v8, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v8, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v13, v8, Lp1/q;->S:Z

    if-eqz v13, :cond_10

    move-object/from16 v13, v42

    invoke-virtual {v8, v13}, Lp1/q;->l(Lc93/a;)V

    :goto_c
    move-object/from16 v13, v43

    goto :goto_d

    :cond_10
    invoke-virtual {v8}, Lp1/q;->s0()V

    goto :goto_c

    :goto_d
    invoke-static {v8, v13, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v2, v44

    invoke-static {v8, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v8, Lp1/q;->S:Z

    if-nez v2, :cond_11

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_12

    :cond_11
    move-object/from16 v2, v45

    invoke-static {v3, v8, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    invoke-static {v8, v0, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v0, Los0/h;->T:I

    invoke-static {v8, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v12

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v0, v8, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v3

    invoke-virtual {v0, v8, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v13

    invoke-virtual {v13}, Lb91/d;->O()Lb91/a;

    move-result-object v32

    sget v13, Lb91/a;->d:I

    shl-int/lit8 v36, v13, 0x12

    const v37, 0x2fffa

    const/4 v13, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x0

    move-wide/from16 v46, v3

    move v3, v14

    move-wide/from16 v14, v46

    move-object/from16 v34, v8

    const/4 v4, 0x0

    invoke-static/range {v12 .. v37}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    sget v12, Los0/h;->U:I

    invoke-static {v8, v12}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0, v8, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->c1()J

    move-result-wide v14

    invoke-virtual {v0, v8, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->a()Lb91/a;

    move-result-object v32

    new-instance v0, Lw3/k;

    invoke-direct {v0, v7}, Lw3/k;-><init>(I)V

    const v37, 0x2fdfa

    const/4 v13, 0x0

    move-object/from16 v24, v0

    invoke-static/range {v12 .. v37}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    invoke-virtual {v8, v6}, Lp1/q;->q(Z)V

    sget v0, Los0/h;->b0:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    const/4 v2, 0x5

    int-to-float v2, v2

    mul-float v18, v2, v1

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v40

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move/from16 v2, v18

    const/4 v12, 0x2

    invoke-static {v1, v3, v4, v12}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const-string v12, "take_off_whoop_next_button"

    invoke-static {v1, v12}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget v29, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v12, v29, 0x12

    or-int/lit8 v26, v12, 0x6

    shl-int/lit8 v12, v5, 0x3

    and-int/lit16 v12, v12, 0x1c00

    const/16 v28, 0x1fbe

    move/from16 v27, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v17, v0

    move-object v11, v1

    move-object/from16 v25, v8

    move-object/from16 v24, v9

    invoke-static/range {v11 .. v28}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    sget v0, Los0/h;->V:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    const/16 v19, 0x0

    const/16 v21, 0x5

    const/16 v17, 0x0

    move/from16 v20, v2

    move/from16 v18, v39

    move-object/from16 v16, v40

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v12, 0x2

    invoke-static {v1, v3, v4, v12}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const-string v2, "take_off_whoop_need_help_button"

    invoke-static {v1, v2}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    shl-int/lit8 v2, v29, 0x6

    or-int/lit8 v12, v2, 0x6

    shr-int/lit8 v2, v5, 0x3

    and-int/lit8 v13, v2, 0xe

    const/16 v14, 0x3fa

    move-object v2, v0

    move-object v0, v1

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v7, v6

    const/4 v6, 0x0

    move v9, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    move v11, v9

    const/4 v9, 0x0

    move v15, v11

    move-object/from16 v11, v34

    invoke-static/range {v0 .. v14}, Lny0/o0;->b(Landroidx/compose/ui/Modifier;ZLcom/whoop/design/util/TextResource;Lb91/a;Lg1/u0;Lf0/t;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;ZLl0/k1;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object v8, v11

    invoke-virtual {v8, v15}, Lp1/q;->q(Z)V

    move-object/from16 v4, v38

    goto :goto_e

    :cond_13
    move-object v8, v6

    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v4, v3

    :goto_e
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_14

    new-instance v0, Lo72/a;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lo72/a;-><init>(Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/ui/Modifier;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final f(Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Lrs0/b;->e(Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final g(Lc93/a;Lc93/a;Lc93/a;Lms0/a;Landroidx/compose/runtime/Composer;II)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Lc93/a;",
            "Lc93/a;",
            "Lms0/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    move/from16 v9, p5

    const-string v1, "backButtonAction"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "needHelpAction"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "nextAction"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p4

    check-cast v4, Lp1/q;

    const v1, 0x40ef08f3

    invoke-virtual {v4, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v9, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v4, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v9

    goto :goto_1

    :cond_1
    move v1, v9

    :goto_1
    and-int/lit8 v2, v9, 0x30

    const/16 v3, 0x20

    if-nez v2, :cond_3

    invoke-virtual {v4, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, v9, 0x180

    const/16 v5, 0x100

    if-nez v2, :cond_5

    invoke-virtual {v4, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    move v2, v5

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, v9, 0xc00

    if-nez v2, :cond_8

    and-int/lit8 v2, p6, 0x8

    if-nez v2, :cond_6

    move-object/from16 v2, p3

    invoke-virtual {v4, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    const/16 v6, 0x800

    goto :goto_4

    :cond_6
    move-object/from16 v2, p3

    :cond_7
    const/16 v6, 0x400

    :goto_4
    or-int/2addr v1, v6

    goto :goto_5

    :cond_8
    move-object/from16 v2, p3

    :goto_5
    and-int/lit16 v6, v1, 0x493

    const/16 v10, 0x492

    const/4 v12, 0x0

    if-eq v6, v10, :cond_9

    const/4 v6, 0x1

    goto :goto_6

    :cond_9
    move v6, v12

    :goto_6
    and-int/lit8 v10, v1, 0x1

    invoke-virtual {v4, v10, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_16

    invoke-virtual {v4}, Lp1/q;->Z()V

    and-int/lit8 v6, v9, 0x1

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-eqz v6, :cond_c

    invoke-virtual {v4}, Lp1/q;->C()Z

    move-result v6

    if-eqz v6, :cond_a

    goto :goto_8

    :cond_a
    invoke-virtual {v4}, Lp1/q;->X()V

    and-int/lit8 v6, p6, 0x8

    if-eqz v6, :cond_b

    :goto_7
    and-int/lit16 v1, v1, -0x1c01

    :cond_b
    move-object v11, v2

    goto :goto_9

    :cond_c
    :goto_8
    and-int/lit8 v6, p6, 0x8

    if-eqz v6, :cond_b

    const v2, 0x59f3c69b

    invoke-virtual {v4, v2}, Lp1/q;->f0(I)V

    sget-object v2, Lpf3/a;->b:Lnf3/a;

    if-eqz v2, :cond_f

    iget-object v2, v2, Lnf3/a;->a:Lwf3/a;

    iget-object v13, v2, Lwf3/a;->d:Lxf3/c;

    const v2, 0x59f3c7cc

    const v6, -0x384098

    invoke-static {v4, v2, v4, v12, v6}, Lvl/b;->r(Lp1/q;ILp1/q;ZI)Ljf3/a;

    move-result-object v2

    const/4 v14, 0x0

    invoke-virtual {v4, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    const/4 v15, 0x0

    invoke-virtual {v4, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    or-int v6, v6, v16

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v6, :cond_d

    if-ne v11, v10, :cond_e

    :cond_d
    move-object/from16 v18, v15

    new-instance v15, Lrs0/b$a;

    invoke-direct {v15, v2}, Lrs0/b$a;-><init>(Ljf3/a;)V

    const-class v2, Lms0/a;

    sget-object v6, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v6, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v16

    const/16 v17, 0x0

    invoke-static/range {v13 .. v18}, Ljc/x;->X(Lxf3/c;Lvf3/a;Lc93/a;Lj93/d;Lc93/a;Lc93/a;)Landroidx/lifecycle/w1;

    move-result-object v11

    invoke-virtual {v4, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    invoke-virtual {v4, v12}, Lp1/q;->q(Z)V

    check-cast v11, Landroidx/lifecycle/w1;

    invoke-virtual {v4, v12}, Lp1/q;->q(Z)V

    move-object v2, v11

    check-cast v2, Lms0/a;

    goto :goto_7

    :cond_f
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "KoinApplication has not been started"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_9
    invoke-virtual {v4}, Lp1/q;->r()V

    invoke-virtual {v4, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    and-int/lit8 v6, v1, 0x70

    if-ne v6, v3, :cond_10

    const/4 v3, 0x1

    goto :goto_a

    :cond_10
    move v3, v12

    :goto_a
    or-int/2addr v2, v3

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_11

    if-ne v3, v10, :cond_12

    :cond_11
    new-instance v3, Lrs0/a;

    const/4 v2, 0x0

    invoke-direct {v3, v11, v7, v2}, Lrs0/a;-><init>(Lms0/a;Lc93/a;I)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v3, Lc93/a;

    invoke-virtual {v4, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    and-int/lit16 v6, v1, 0x380

    if-ne v6, v5, :cond_13

    const/4 v12, 0x1

    :cond_13
    or-int/2addr v2, v12

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_14

    if-ne v5, v10, :cond_15

    :cond_14
    new-instance v5, Lrs0/a;

    const/4 v2, 0x1

    invoke-direct {v5, v11, v8, v2}, Lrs0/a;-><init>(Lms0/a;Lc93/a;I)V

    invoke-virtual {v4, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    move-object v2, v5

    check-cast v2, Lc93/a;

    and-int/lit8 v5, v1, 0xe

    const/16 v6, 0x8

    move-object v1, v3

    const/4 v3, 0x0

    invoke-static/range {v0 .. v6}, Lrs0/b;->e(Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    goto :goto_b

    :cond_16
    invoke-virtual {v4}, Lp1/q;->X()V

    move-object v11, v2

    :goto_b
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_17

    new-instance v0, Lo72/a;

    const/16 v7, 0x14

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v6, p6

    move-object v3, v8

    move v5, v9

    move-object v4, v11

    invoke-direct/range {v0 .. v7}, Lo72/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method private static final h(Lms0/a;Lc93/a;)Ll83/a0;
    .locals 1

    sget-object v0, Lns0/a$a;->a:Lns0/a$a;

    invoke-virtual {p0, v0}, Lms0/a;->g(Lns0/a;)V

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lms0/a;Lc93/a;)Ll83/a0;
    .locals 1

    sget-object v0, Lns0/a$b;->a:Lns0/a$b;

    invoke-virtual {p0, v0}, Lms0/a;->g(Lns0/a;)V

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lc93/a;Lc93/a;Lc93/a;Lms0/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Lrs0/b;->g(Lc93/a;Lc93/a;Lc93/a;Lms0/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
