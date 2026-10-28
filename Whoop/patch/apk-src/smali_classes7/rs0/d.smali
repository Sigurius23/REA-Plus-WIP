.class public abstract Lrs0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0004\u001aC\u0010\u0007\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001aO\u0010\r\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "backButtonAction",
        "needHelpAction",
        "myWhoopIsBlueAction",
        "Lms0/b;",
        "viewModel",
        "g",
        "(Lc93/a;Lc93/a;Lc93/a;Lms0/b;Landroidx/compose/runtime/Composer;II)V",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "lottieProgressOverride",
        "e",
        "(Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/ui/Modifier;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lms0/b;Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lrs0/d;->i(Lms0/b;Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/ui/Modifier;Ljava/lang/Float;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lrs0/d;->f(Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/ui/Modifier;Ljava/lang/Float;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lc93/a;Lc93/a;Lc93/a;Lms0/b;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lrs0/d;->j(Lc93/a;Lc93/a;Lc93/a;Lms0/b;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lms0/b;Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lrs0/d;->h(Lms0/b;Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/ui/Modifier;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V
    .locals 45
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/ui/Modifier;",
            "Ljava/lang/Float;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v10, p1

    move-object/from16 v9, p2

    move/from16 v11, p6

    const-string v0, "backButtonAction"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "needHelpAction"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "myWhoopIsBlueAction"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, p5

    check-cast v6, Lp1/q;

    const v0, 0x589c59e6

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
    and-int/lit8 v2, p7, 0x8

    if-eqz v2, :cond_7

    or-int/lit16 v0, v0, 0xc00

    :cond_6
    move-object/from16 v3, p3

    goto :goto_5

    :cond_7
    and-int/lit16 v3, v11, 0xc00

    if-nez v3, :cond_6

    move-object/from16 v3, p3

    invoke-virtual {v6, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    const/16 v4, 0x800

    goto :goto_4

    :cond_8
    const/16 v4, 0x400

    :goto_4
    or-int/2addr v0, v4

    :goto_5
    and-int/lit8 v4, p7, 0x10

    if-eqz v4, :cond_a

    or-int/lit16 v0, v0, 0x6000

    :cond_9
    move-object/from16 v5, p4

    :goto_6
    move v13, v0

    goto :goto_8

    :cond_a
    and-int/lit16 v5, v11, 0x6000

    if-nez v5, :cond_9

    move-object/from16 v5, p4

    invoke-virtual {v6, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_b

    const/16 v7, 0x4000

    goto :goto_7

    :cond_b
    const/16 v7, 0x2000

    :goto_7
    or-int/2addr v0, v7

    goto :goto_6

    :goto_8
    and-int/lit16 v0, v13, 0x2493

    const/16 v7, 0x2492

    const/4 v8, 0x0

    if-eq v0, v7, :cond_c

    const/4 v0, 0x1

    goto :goto_9

    :cond_c
    move v0, v8

    :goto_9
    and-int/lit8 v7, v13, 0x1

    invoke-virtual {v6, v7, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_16

    sget-object v15, Lb2/t;->w:Lb2/t;

    if-eqz v2, :cond_d

    move-object v0, v15

    goto :goto_a

    :cond_d
    move-object v0, v3

    :goto_a
    if-eqz v4, :cond_e

    const/4 v2, 0x0

    move-object/from16 v21, v2

    goto :goto_b

    :cond_e
    move-object/from16 v21, v5

    :goto_b
    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v3}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v3}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v3}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const-string v4, "tap_rapidly_pairing_help_screen"

    invoke-static {v3, v4}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Ll0/m;->c:Ll0/g;

    sget-object v5, Lb2/e;->M:Lb2/k;

    invoke-static {v4, v5, v6, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

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

    if-eqz v2, :cond_f

    invoke-virtual {v6, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_f
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_c
    sget-object v2, La3/k;->g:La3/i;

    invoke-static {v6, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v6, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v12, v6, Lp1/q;->S:Z

    if-nez v12, :cond_10

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_11

    :cond_10
    invoke-static {v5, v6, v5, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
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

    const/4 v3, 0x1

    int-to-float v5, v3

    const/16 v3, 0x8

    int-to-float v14, v3

    mul-float v17, v5, v14

    const/16 v20, 0x7

    const/16 v16, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object/from16 v25, v15

    move/from16 v24, v19

    sget v5, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    const/4 v15, 0x3

    shl-int/2addr v5, v15

    or-int/lit8 v5, v5, 0x6

    shl-int/lit8 v15, v13, 0x9

    and-int/lit16 v15, v15, 0x1c00

    or-int/2addr v5, v15

    move-object v15, v8

    const/16 v8, 0x34

    move-object/from16 v16, v2

    const/4 v2, 0x0

    move-object/from16 v17, v4

    const/4 v4, 0x0

    move-object/from16 v18, v7

    move v7, v5

    const/4 v5, 0x0

    move-object/from16 v38, v0

    move-object v0, v3

    move-object/from16 v42, v16

    move-object/from16 v43, v17

    move-object/from16 v44, v18

    move-object v3, v1

    move/from16 v16, v14

    move-object/from16 v1, v23

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static/range {v0 .. v8}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v34, v6

    sget v0, Los0/g;->b:I

    invoke-static {v0}, Lv41/r0$d;->b(I)I

    move-result v0

    float-to-double v1, v14

    const-wide/16 v3, 0x0

    cmpl-double v1, v1, v3

    if-lez v1, :cond_12

    :goto_d
    move-object v1, v12

    const/4 v3, 0x1

    goto :goto_e

    :cond_12
    const-string v1, "invalid weight; must be greater than zero"

    invoke-static {v1}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_d

    :goto_e
    invoke-static {v14, v14, v3}, Ly00/t7;->d(FFZ)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-static {v0}, Lv41/r0$d;->a(I)Lv41/r0$d;

    move-result-object v0

    shl-int/lit8 v2, v13, 0xc

    const/high16 v4, 0xe000000

    and-int v22, v2, v4

    const/16 v23, 0xfc

    move v2, v14

    const/4 v14, 0x0

    move-object v4, v15

    const/4 v15, 0x0

    move/from16 v5, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move v6, v13

    move-object v13, v0

    move v0, v6

    move v7, v3

    move-object/from16 v20, v21

    move-object/from16 v21, v34

    const/4 v3, 0x3

    const/4 v6, 0x2

    invoke-static/range {v12 .. v23}, Lv41/p;->h(Landroidx/compose/ui/Modifier;Lv41/r0;ZFILc93/a;Lkotlin/jvm/functions/Function1;Ly2/k;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v39, v20

    move-object/from16 v8, v21

    invoke-static/range {v24 .. v24}, Ll0/m;->i(F)Ll0/k;

    move-result-object v12

    sget-object v13, Lb2/e;->N:Lb2/k;

    const/16 v19, 0x0

    const/16 v20, 0xd

    const/16 v16, 0x0

    const/16 v18, 0x0

    move/from16 v17, v24

    move-object/from16 v15, v25

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v14

    move-object/from16 v41, v15

    move/from16 v40, v17

    int-to-float v15, v3

    mul-float/2addr v15, v5

    const/4 v2, 0x0

    invoke-static {v14, v15, v2, v6}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v14

    const/16 v2, 0x36

    invoke-static {v12, v13, v8, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v12, v8, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v8, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v6, v8, Lp1/q;->S:Z

    if-eqz v6, :cond_13

    invoke-virtual {v8, v4}, Lp1/q;->l(Lc93/a;)V

    :goto_f
    move-object/from16 v4, v42

    goto :goto_10

    :cond_13
    invoke-virtual {v8}, Lp1/q;->s0()V

    goto :goto_f

    :goto_10
    invoke-static {v8, v4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v2, v43

    invoke-static {v8, v2, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v8, Lp1/q;->S:Z

    if-nez v2, :cond_14

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_15

    :cond_14
    move-object/from16 v2, v44

    invoke-static {v12, v8, v12, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    invoke-static {v8, v1, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v1, Los0/h;->X:I

    invoke-static {v8, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v12

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v1, v8, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v13

    invoke-virtual {v1, v8, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->O()Lb91/a;

    move-result-object v32

    sget v4, Lb91/a;->d:I

    shl-int/lit8 v36, v4, 0x12

    const v37, 0x2fffa

    move v4, v15

    move-wide v14, v13

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

    move-object/from16 v34, v8

    invoke-static/range {v12 .. v37}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    sget v6, Los0/h;->Y:I

    invoke-static {v8, v6}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1, v8, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->c1()J

    move-result-wide v14

    invoke-virtual {v1, v8, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->a()Lb91/a;

    move-result-object v32

    new-instance v1, Lw3/k;

    invoke-direct {v1, v3}, Lw3/k;-><init>(I)V

    const v37, 0x2fdfa

    move-object/from16 v24, v1

    invoke-static/range {v12 .. v37}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    invoke-virtual {v8, v7}, Lp1/q;->q(Z)V

    sget v1, Los0/h;->W:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v1

    const/4 v2, 0x5

    int-to-float v2, v2

    mul-float v17, v2, v5

    const/16 v19, 0x0

    const/16 v20, 0xd

    const/16 v16, 0x0

    const/16 v18, 0x0

    move-object/from16 v15, v41

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move/from16 v5, v17

    const/4 v6, 0x2

    const/4 v12, 0x0

    invoke-static {v2, v4, v12, v6}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v14, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-string v6, "tap_rapidly_my_whoop_is_blue_button"

    invoke-static {v2, v6}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget v6, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v12, v6, 0x12

    or-int/lit8 v26, v12, 0x6

    shl-int/lit8 v12, v0, 0x3

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

    move-object/from16 v17, v1

    move-object v11, v2

    move-object/from16 v25, v8

    move-object/from16 v24, v9

    invoke-static/range {v11 .. v28}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    sget v1, Los0/h;->V:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v2

    const/16 v18, 0x0

    const/16 v20, 0x5

    const/16 v16, 0x0

    move/from16 v19, v5

    move/from16 v17, v40

    move-object/from16 v15, v41

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v5, 0x2

    const/4 v12, 0x0

    invoke-static {v1, v4, v12, v5}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v14, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const-string v4, "tap_rapidly_need_help_button"

    invoke-static {v1, v4}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    shl-int/lit8 v4, v6, 0x6

    or-int/lit8 v12, v4, 0x6

    shr-int/2addr v0, v3

    and-int/lit8 v13, v0, 0xe

    const/16 v14, 0x3fa

    move-object v0, v1

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move/from16 v22, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move/from16 v15, v22

    move-object/from16 v11, v34

    invoke-static/range {v0 .. v14}, Lny0/o0;->b(Landroidx/compose/ui/Modifier;ZLcom/whoop/design/util/TextResource;Lb91/a;Lg1/u0;Lf0/t;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;ZLl0/k1;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object v8, v11

    invoke-virtual {v8, v15}, Lp1/q;->q(Z)V

    move-object/from16 v4, v38

    move-object/from16 v5, v39

    goto :goto_11

    :cond_16
    move-object v8, v6

    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v4, v3

    :goto_11
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_17

    new-instance v0, Lj81/e;

    const/16 v8, 0x12

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lj81/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/Modifier;Ljava/lang/Object;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method private static final f(Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/ui/Modifier;Ljava/lang/Float;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lrs0/d;->e(Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/ui/Modifier;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final g(Lc93/a;Lc93/a;Lc93/a;Lms0/b;Landroidx/compose/runtime/Composer;II)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Lc93/a;",
            "Lc93/a;",
            "Lms0/b;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    move/from16 v10, p5

    const-string v1, "backButtonAction"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "needHelpAction"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "myWhoopIsBlueAction"

    invoke-static {v9, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v5, p4

    check-cast v5, Lp1/q;

    const v1, 0x431e1754

    invoke-virtual {v5, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v10, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v10

    goto :goto_1

    :cond_1
    move v1, v10

    :goto_1
    and-int/lit8 v2, v10, 0x30

    const/16 v3, 0x20

    if-nez v2, :cond_3

    invoke-virtual {v5, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, v10, 0x180

    const/16 v4, 0x100

    if-nez v2, :cond_5

    invoke-virtual {v5, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    move v2, v4

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, v10, 0xc00

    if-nez v2, :cond_8

    and-int/lit8 v2, p6, 0x8

    if-nez v2, :cond_6

    move-object/from16 v2, p3

    invoke-virtual {v5, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

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

    const/16 v7, 0x492

    const/4 v12, 0x0

    if-eq v6, v7, :cond_9

    const/4 v6, 0x1

    goto :goto_6

    :cond_9
    move v6, v12

    :goto_6
    and-int/lit8 v7, v1, 0x1

    invoke-virtual {v5, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_16

    invoke-virtual {v5}, Lp1/q;->Z()V

    and-int/lit8 v6, v10, 0x1

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-eqz v6, :cond_c

    invoke-virtual {v5}, Lp1/q;->C()Z

    move-result v6

    if-eqz v6, :cond_a

    goto :goto_8

    :cond_a
    invoke-virtual {v5}, Lp1/q;->X()V

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

    invoke-virtual {v5, v2}, Lp1/q;->f0(I)V

    sget-object v2, Lpf3/a;->b:Lnf3/a;

    if-eqz v2, :cond_f

    iget-object v2, v2, Lnf3/a;->a:Lwf3/a;

    iget-object v13, v2, Lwf3/a;->d:Lxf3/c;

    const v2, 0x59f3c7cc

    const v6, -0x384098

    invoke-static {v5, v2, v5, v12, v6}, Lvl/b;->r(Lp1/q;ILp1/q;ZI)Ljf3/a;

    move-result-object v2

    const/4 v14, 0x0

    invoke-virtual {v5, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    const/4 v15, 0x0

    invoke-virtual {v5, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    or-int v6, v6, v16

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v6, :cond_d

    if-ne v11, v7, :cond_e

    :cond_d
    move-object/from16 v18, v15

    new-instance v15, Lrs0/d$a;

    invoke-direct {v15, v2}, Lrs0/d$a;-><init>(Ljf3/a;)V

    const-class v2, Lms0/b;

    sget-object v6, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v6, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v16

    const/16 v17, 0x0

    invoke-static/range {v13 .. v18}, Ljc/x;->X(Lxf3/c;Lvf3/a;Lc93/a;Lj93/d;Lc93/a;Lc93/a;)Landroidx/lifecycle/w1;

    move-result-object v11

    invoke-virtual {v5, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    invoke-virtual {v5, v12}, Lp1/q;->q(Z)V

    check-cast v11, Landroidx/lifecycle/w1;

    invoke-virtual {v5, v12}, Lp1/q;->q(Z)V

    move-object v2, v11

    check-cast v2, Lms0/b;

    goto :goto_7

    :cond_f
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "KoinApplication has not been started"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_9
    invoke-virtual {v5}, Lp1/q;->r()V

    invoke-virtual {v5, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    and-int/lit8 v6, v1, 0x70

    if-ne v6, v3, :cond_10

    const/4 v3, 0x1

    goto :goto_a

    :cond_10
    move v3, v12

    :goto_a
    or-int/2addr v2, v3

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_11

    if-ne v3, v7, :cond_12

    :cond_11
    new-instance v3, Lrs0/c;

    const/4 v2, 0x0

    invoke-direct {v3, v11, v8, v2}, Lrs0/c;-><init>(Lms0/b;Lc93/a;I)V

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v3, Lc93/a;

    invoke-virtual {v5, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    and-int/lit16 v6, v1, 0x380

    if-ne v6, v4, :cond_13

    const/4 v12, 0x1

    :cond_13
    or-int/2addr v2, v12

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_14

    if-ne v4, v7, :cond_15

    :cond_14
    new-instance v4, Lrs0/c;

    const/4 v2, 0x1

    invoke-direct {v4, v11, v9, v2}, Lrs0/c;-><init>(Lms0/b;Lc93/a;I)V

    invoke-virtual {v5, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    move-object v2, v4

    check-cast v2, Lc93/a;

    and-int/lit8 v6, v1, 0xe

    const/16 v7, 0x18

    move-object v1, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v7}, Lrs0/d;->e(Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/ui/Modifier;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V

    move-object v4, v11

    goto :goto_b

    :cond_16
    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v4, v2

    :goto_b
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_17

    new-instance v0, Lo72/a;

    const/16 v7, 0x16

    move-object/from16 v1, p0

    move/from16 v6, p6

    move-object v2, v8

    move-object v3, v9

    move v5, v10

    invoke-direct/range {v0 .. v7}, Lo72/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method private static final h(Lms0/b;Lc93/a;)Ll83/a0;
    .locals 1

    sget-object v0, Lns0/b$b;->a:Lns0/b$b;

    invoke-virtual {p0, v0}, Lms0/b;->g(Lns0/b;)V

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lms0/b;Lc93/a;)Ll83/a0;
    .locals 1

    sget-object v0, Lns0/b$a;->a:Lns0/b$a;

    invoke-virtual {p0, v0}, Lms0/b;->g(Lns0/b;)V

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lc93/a;Lc93/a;Lc93/a;Lms0/b;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Lrs0/d;->g(Lc93/a;Lc93/a;Lc93/a;Lms0/b;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
