.class public abstract Low2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Ll0/y;",
        "Lcom/whoop/whattoexpect/domain/models/DailyProgress;",
        "dailyProgress",
        "Ll83/a0;",
        "b",
        "(Ll0/y;Lcom/whoop/whattoexpect/domain/models/DailyProgress;Landroidx/compose/runtime/Composer;I)V",
        "what-to-expect_release"
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
.method public static synthetic a(Ll0/y;Lcom/whoop/whattoexpect/domain/models/DailyProgress;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Low2/a;->c(Ll0/y;Lcom/whoop/whattoexpect/domain/models/DailyProgress;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ll0/y;Lcom/whoop/whattoexpect/domain/models/DailyProgress;Landroidx/compose/runtime/Composer;I)V
    .locals 49

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v3, "<this>"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "dailyProgress"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v4, -0x451d49de

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, p3, 0x30

    const/16 v5, 0x10

    if-nez v4, :cond_2

    and-int/lit8 v4, p3, 0x40

    if-nez v4, :cond_0

    invoke-virtual {v3, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_0

    :cond_0
    invoke-virtual {v3, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_0
    if-eqz v4, :cond_1

    const/16 v4, 0x20

    goto :goto_1

    :cond_1
    move v4, v5

    :goto_1
    or-int v4, p3, v4

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v6, v4, 0x11

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eq v6, v5, :cond_3

    move v5, v7

    goto :goto_3

    :cond_3
    move v5, v8

    :goto_3
    and-int/2addr v4, v7

    invoke-virtual {v3, v4, v5}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_12

    const/high16 v4, 0x3f800000    # 1.0f

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Lb2/e;->K:Lb2/l;

    sget-object v10, Ll0/m;->g:Ll0/h;

    const/16 v11, 0x36

    invoke-static {v10, v6, v3, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v10, v3, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v3, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v12, v3, Lp1/q;->S:Z

    if-eqz v12, :cond_4

    invoke-virtual {v3, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_4
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v3, v12, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v3, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v13, v3, Lp1/q;->S:Z

    if-nez v13, :cond_5

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_6

    :cond_5
    invoke-static {v10, v3, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v3, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-wide/high16 v13, 0x3fe0000000000000L    # 0.5

    double-to-float v5, v13

    const/16 v13, 0x8

    int-to-float v13, v13

    mul-float v17, v5, v13

    move v5, v13

    const/4 v13, 0x0

    const/16 v14, 0xa

    move-object/from16 v16, v11

    const/4 v11, 0x0

    move-object/from16 v18, v12

    move/from16 v12, v17

    move/from16 v30, v5

    move-object v5, v10

    move/from16 v10, v17

    invoke-static/range {v9 .. v14}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    move/from16 v31, v10

    invoke-virtual {v1}, Lcom/whoop/whattoexpect/domain/models/DailyProgress;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    sget v12, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v10, v3, v12}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v10

    sget-object v12, Lx81/d;->a:Lx81/d;

    sget v13, Lx81/d;->b:I

    invoke-virtual {v12, v3, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v14

    invoke-virtual {v14}, Lb91/d;->s()Lb91/a;

    move-result-object v24

    invoke-virtual {v12, v3, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    invoke-virtual {v14}, Ly81/i;->b1()J

    move-result-wide v19

    sget v14, Lb91/a;->d:I

    shl-int/lit8 v28, v14, 0x12

    const v29, 0x2fff8

    move/from16 v17, v8

    move-object v14, v9

    const-wide/16 v8, 0x0

    move/from16 v21, v4

    move-object v4, v10

    const/4 v10, 0x0

    move-object/from16 v22, v5

    move-object v5, v11

    const/4 v11, 0x0

    move-object/from16 v23, v12

    const/4 v12, 0x0

    move/from16 v25, v13

    move-object/from16 v26, v14

    const-wide/16 v13, 0x0

    move-object/from16 v27, v15

    const/4 v15, 0x0

    move-object/from16 v32, v16

    const/16 v16, 0x0

    move/from16 v34, v17

    move-object/from16 v33, v18

    const-wide/16 v17, 0x0

    move/from16 v35, v7

    move-wide/from16 v47, v19

    move-object/from16 v20, v6

    move-wide/from16 v6, v47

    const/16 v19, 0x0

    move-object/from16 v36, v20

    const/16 v20, 0x0

    move/from16 v37, v21

    const/16 v21, 0x0

    move-object/from16 v38, v22

    const/16 v22, 0x0

    move-object/from16 v39, v23

    const/16 v23, 0x0

    move/from16 v40, v25

    const/16 v25, 0x0

    move-object/from16 v41, v27

    const/16 v27, 0x30

    move-object/from16 v1, v26

    move-object/from16 v45, v32

    move-object/from16 v43, v33

    move-object/from16 v44, v36

    move/from16 v2, v37

    move-object/from16 v46, v38

    move/from16 v0, v40

    move-object/from16 v42, v41

    move-object/from16 v26, v3

    move-object/from16 v3, v39

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    const-wide/high16 v5, 0x3fd0000000000000L    # 0.25

    double-to-float v5, v5

    const/4 v6, 0x4

    int-to-float v6, v6

    mul-float/2addr v5, v6

    invoke-static {v5, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v2, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v3, v4, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->W0()J

    move-result-wide v7

    sget-object v0, Li2/w0;->a:Li2/v0;

    invoke-static {v5, v7, v8, v0}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v3, 0x0

    invoke-static {v0, v4, v3}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    const-wide/high16 v7, 0x3ff8000000000000L    # 1.5

    double-to-float v0, v7

    mul-float v13, v0, v30

    invoke-static {v1, v13, v4, v1, v2}, Lq63/c;->e(Lb2/t;FLp1/q;Lb2/t;F)Landroidx/compose/ui/Modifier;

    move-result-object v16

    const/16 v20, 0x0

    const/16 v21, 0xa

    const/16 v18, 0x0

    move/from16 v19, v31

    move/from16 v17, v31

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v13}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v5, Lb2/e;->J:Lb2/l;

    const/4 v7, 0x6

    invoke-static {v3, v5, v4, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v7, v4, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v4, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v8, v4, Lp1/q;->S:Z

    if-eqz v8, :cond_7

    move-object/from16 v8, v42

    invoke-virtual {v4, v8}, Lp1/q;->l(Lc93/a;)V

    :goto_5
    move-object/from16 v8, v43

    goto :goto_6

    :cond_7
    invoke-virtual {v4}, Lp1/q;->s0()V

    goto :goto_5

    :goto_6
    invoke-static {v4, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v3, v44

    invoke-static {v4, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v4, Lp1/q;->S:Z

    if-nez v3, :cond_8

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    :cond_8
    move-object/from16 v3, v45

    goto :goto_8

    :cond_9
    :goto_7
    move-object/from16 v5, v46

    goto :goto_9

    :goto_8
    invoke-static {v5, v4, v5, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_7

    :goto_9
    invoke-static {v4, v5, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, -0x7e9842af

    invoke-virtual {v4, v2}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/whattoexpect/domain/models/DailyProgress;->getTotalCount()I

    move-result v2

    const/4 v8, 0x0

    :goto_a
    if-ge v8, v2, :cond_11

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/whattoexpect/domain/models/DailyProgress;->getFilledCount()I

    move-result v3

    if-ge v8, v3, :cond_a

    const/4 v7, 0x1

    goto :goto_b

    :cond_a
    const/4 v7, 0x0

    :goto_b
    mul-float v13, v30, v6

    invoke-static {v13, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    if-eqz v7, :cond_b

    const v5, -0x205fbf75

    invoke-virtual {v4, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v5, v4, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->i()J

    move-result-wide v9

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_b
    const/4 v5, 0x0

    const v9, -0x205e3606

    invoke-virtual {v4, v9}, Lp1/q;->e0(I)V

    sget-object v9, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-static {v9, v4, v10, v5}, Lih0/d0;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v9

    :goto_c
    sget-object v5, Lt0/j;->a:Lt0/i;

    invoke-static {v3, v0, v9, v10, v5}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    if-eqz v7, :cond_c

    const v9, -0x205abe49    # -2.3816E19f

    invoke-virtual {v4, v9}, Lp1/q;->e0(I)V

    sget-object v9, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v9, v4, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->i()J

    move-result-wide v9

    const v11, 0x3e19999a    # 0.15f

    invoke-static {v11, v9, v10}, Li2/x;->c(FJ)J

    move-result-wide v9

    const/4 v11, 0x0

    invoke-virtual {v4, v11}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_c
    const/4 v11, 0x0

    const v9, -0x2058e94a

    invoke-virtual {v4, v9}, Lp1/q;->e0(I)V

    sget-object v9, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v9, v4, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->V0()J

    move-result-wide v9

    invoke-virtual {v4, v11}, Lp1/q;->q(Z)V

    :goto_d
    invoke-static {v3, v9, v10, v5}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v5, Lb2/e;->E:Lb2/m;

    invoke-static {v5, v11}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v9, v4, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v4, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v12, v4, Lp1/q;->S:Z

    if-eqz v12, :cond_d

    invoke-virtual {v4, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_d
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_e
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v4, v11, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v4, v5, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v10, v4, Lp1/q;->S:Z

    if-nez v10, :cond_e

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_f

    :cond_e
    invoke-static {v9, v4, v9, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v4, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    add-int/lit8 v3, v8, 0x1

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    if-eqz v7, :cond_10

    const v7, -0x52964779

    invoke-virtual {v4, v7}, Lp1/q;->e0(I)V

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    const/4 v11, 0x0

    invoke-static {v7, v4, v8, v11}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v7

    goto :goto_f

    :cond_10
    const/4 v11, 0x0

    const v7, -0x5296433c

    invoke-virtual {v4, v7}, Lp1/q;->e0(I)V

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-static {v7, v4, v8, v11}, Lih0/d0;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v7

    :goto_f
    sget-object v9, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v9, v4, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->E()Lb91/a;

    move-result-object v24

    sget v9, Lb91/a;->d:I

    shl-int/lit8 v28, v9, 0x12

    const v29, 0x2fffa

    move-object/from16 v26, v4

    move-object v4, v5

    const/4 v5, 0x0

    move v10, v6

    move-wide v6, v7

    const-wide/16 v8, 0x0

    move v11, v10

    const/4 v10, 0x0

    move v12, v11

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v15, v13

    const-wide/16 v13, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v19, v17

    const-wide/16 v17, 0x0

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v25, v23

    const/16 v23, 0x0

    move/from16 v27, v25

    const/16 v25, 0x0

    move/from16 v31, v27

    const/16 v27, 0x0

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Lp1/q;->q(Z)V

    move v8, v3

    move/from16 v6, v31

    goto/16 :goto_a

    :cond_11
    const/4 v5, 0x1

    const/4 v11, 0x0

    invoke-virtual {v4, v11}, Lp1/q;->q(Z)V

    invoke-virtual {v4, v5}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_12
    move-object v4, v3

    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_10
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_13

    new-instance v1, Lof2/d;

    const/4 v2, 0x7

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move/from16 v5, p3

    invoke-direct {v1, v3, v4, v5, v2}, Lof2/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final c(Ll0/y;Lcom/whoop/whattoexpect/domain/models/DailyProgress;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Low2/a;->b(Ll0/y;Lcom/whoop/whattoexpect/domain/models/DailyProgress;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
