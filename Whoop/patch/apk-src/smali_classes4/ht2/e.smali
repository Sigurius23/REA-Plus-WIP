.class public abstract Lht2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lht2/e$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a5\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a5\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\u000b2\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a-\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u000f2\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0006H\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a-\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00142\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017\u00b2\u0006\u000e\u0010\u000c\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lgt2/c;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "L",
        "(Landroidx/compose/ui/Modifier;Lgt2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lht2/a;",
        "",
        "isExpanded",
        "F",
        "(Lht2/a;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lht2/i;",
        "U",
        "(Lht2/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "B",
        "(Landroidx/compose/runtime/Composer;I)V",
        "Lgt2/c$a;",
        "x",
        "(Lgt2/c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "weekly-plan_release"
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
.method private static final A(Lgt2/c$a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lht2/e;->x(Lgt2/c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Landroidx/compose/runtime/Composer;I)V
    .locals 46

    move-object/from16 v9, p0

    check-cast v9, Lp1/q;

    const v1, -0x6aca1085

    invoke-virtual {v9, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v13, 0x0

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v13

    :goto_0
    and-int/lit8 v2, p1, 0x1

    invoke-virtual {v9, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_c

    const/4 v1, 0x3

    sget-object v15, Lb2/t;->w:Lb2/t;

    const/4 v2, 0x0

    invoke-static {v15, v2, v1}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const-string v2, "WeeklyPlanHomeTile_LoadingState_Container_Row"

    invoke-static {v1, v2}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->K:Lb2/l;

    sget-object v3, Ll0/m;->a:Ll0/e;

    const/16 v4, 0x30

    invoke-static {v3, v2, v9, v4}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v4, v9, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v9, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v7, v9, Lp1/q;->S:Z

    if-eqz v7, :cond_1

    invoke-virtual {v9, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_1
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v9, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v9, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v8, v9, Lp1/q;->S:Z

    if-nez v8, :cond_2

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3

    :cond_2
    invoke-static {v4, v9, v4, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v9, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v1, 0x6

    int-to-float v1, v1

    const/4 v8, 0x4

    int-to-float v8, v8

    mul-float/2addr v1, v8

    invoke-static {v1, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const-string v11, "WeeklyPlanHomeTile_LoadingState_Container_AnimationBox"

    invoke-static {v10, v11}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, Lb2/e;->w:Lb2/m;

    invoke-static {v11, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v11

    iget-wide v13, v9, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v9, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v14, v9, Lp1/q;->S:Z

    if-eqz v14, :cond_4

    invoke-virtual {v9, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v9, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v2, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v11, v9, Lp1/q;->S:Z

    if-nez v11, :cond_5

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v11, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_6

    :cond_5
    invoke-static {v12, v9, v12, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v9, v4, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1, v15}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v1, v10}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const-string v10, "WeeklyPlanHomeTile_LoadingState_Animation_Loading"

    invoke-static {v1, v10}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget v10, Lgy0/e;->d:I

    invoke-static {v10}, Lv41/r0$d;->b(I)I

    move-result v10

    invoke-static {v10}, Lv41/r0$d;->a(I)Lv41/r0$d;

    move-result-object v10

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-ne v11, v12, :cond_7

    new-instance v11, Lga1/b;

    const/16 v13, 0x10

    invoke-direct {v11, v13}, Lga1/b;-><init>(I)V

    invoke-virtual {v9, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v11, Lc93/a;

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v12, :cond_8

    new-instance v13, Lh01/u;

    const/4 v12, 0x6

    invoke-direct {v13, v12}, Lh01/u;-><init>(I)V

    invoke-virtual {v9, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v13, Lkotlin/jvm/functions/Function1;

    move-object v12, v6

    move-object v6, v11

    const v11, 0x1b0006

    move-object v14, v12

    const/16 v12, 0x19c

    move-object/from16 v17, v3

    const/4 v3, 0x0

    move-object/from16 v18, v4

    const/4 v4, 0x0

    move-object/from16 v19, v5

    const/4 v5, 0x0

    move/from16 v20, v8

    const/4 v8, 0x0

    move-object/from16 v23, v9

    const/4 v9, 0x0

    move-object/from16 v27, v2

    move-object v2, v10

    move-object/from16 v29, v18

    move-object/from16 v28, v19

    move-object/from16 v10, v23

    move-object/from16 v18, v7

    move-object v7, v13

    move/from16 v13, v20

    invoke-static/range {v1 .. v12}, Lv41/p;->h(Landroidx/compose/ui/Modifier;Lv41/r0;ZFILc93/a;Lkotlin/jvm/functions/Function1;Ly2/k;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v10

    const/4 v1, 0x1

    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    int-to-float v2, v1

    mul-float v3, v2, v13

    invoke-static {v3, v15}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v9, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v4, v9, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->s()Lb91/a;

    move-result-object v21

    invoke-virtual {v4, v9, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->b1()J

    move-result-wide v6

    const-string v8, "WeeklyPlanHomeTile_LoadingState_Text_LoadingMessage"

    invoke-static {v15, v8}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget v10, Lb91/a;->d:I

    shl-int/lit8 v25, v10, 0x12

    const v26, 0x2fff8

    move/from16 v16, v1

    const-string v1, "Loading..."

    move v10, v3

    move-object v11, v4

    move-wide v3, v6

    move v7, v5

    const-wide/16 v5, 0x0

    move v12, v7

    const/4 v7, 0x0

    move/from16 v19, v2

    move-object v2, v8

    const/4 v8, 0x0

    move-object/from16 v23, v9

    const/4 v9, 0x0

    move/from16 v20, v10

    move-object/from16 v22, v11

    const-wide/16 v10, 0x0

    move/from16 v24, v12

    const/4 v12, 0x0

    move/from16 v30, v13

    const/4 v13, 0x0

    move-object/from16 v31, v14

    move-object/from16 v32, v15

    const-wide/16 v14, 0x0

    move/from16 v33, v16

    const/16 v16, 0x0

    move-object/from16 v34, v17

    const/16 v17, 0x0

    move-object/from16 v35, v18

    const/16 v18, 0x0

    move/from16 v36, v19

    const/16 v19, 0x0

    move/from16 v37, v20

    const/16 v20, 0x0

    move-object/from16 v38, v22

    const/16 v22, 0x0

    move/from16 v39, v24

    const/16 v24, 0x36

    move-object/from16 v40, v31

    move-object/from16 v45, v32

    move/from16 v0, v33

    move-object/from16 v41, v35

    move/from16 v42, v36

    move-object/from16 v43, v38

    move/from16 v44, v39

    invoke-static/range {v1 .. v26}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v23

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    const/4 v1, 0x2

    int-to-float v2, v1

    move/from16 v13, v30

    move-object/from16 v12, v45

    invoke-static {v2, v13, v12, v9}, Ld;->w(FFLb2/t;Lp1/q;)V

    const/4 v2, -0x1

    int-to-float v2, v2

    mul-float/2addr v2, v13

    const/4 v3, 0x0

    invoke-static {v12, v2, v3, v1}, Landroidx/compose/foundation/layout/a;->n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const-string v2, "WeeklyPlanHomeTile_LoadingState_Container_ProgressBarRow"

    invoke-static {v1, v2}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->J:Lb2/l;

    move-object/from16 v4, v34

    const/4 v5, 0x0

    invoke-static {v4, v2, v9, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v4, v9, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v9, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v6, v9, Lp1/q;->S:Z

    if-eqz v6, :cond_9

    move-object/from16 v14, v40

    invoke-virtual {v9, v14}, Lp1/q;->l(Lc93/a;)V

    :goto_3
    move-object/from16 v6, v41

    goto :goto_4

    :cond_9
    invoke-virtual {v9}, Lp1/q;->s0()V

    goto :goto_3

    :goto_4
    invoke-static {v9, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v2, v27

    invoke-static {v9, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v9, Lp1/q;->S:Z

    if-nez v2, :cond_a

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    :cond_a
    move-object/from16 v2, v28

    goto :goto_6

    :cond_b
    :goto_5
    move-object/from16 v2, v29

    goto :goto_7

    :goto_6
    invoke-static {v4, v9, v4, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_5

    :goto_7
    invoke-static {v9, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Li2/t;->b:Li2/s;

    move-object/from16 v11, v43

    move/from16 v7, v44

    invoke-virtual {v11, v9, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->j()J

    move-result-wide v4

    new-instance v2, Li2/x;

    invoke-direct {v2, v4, v5}, Li2/x;-><init>(J)V

    invoke-virtual {v11, v9, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->j()J

    move-result-wide v4

    new-instance v6, Li2/x;

    invoke-direct {v6, v4, v5}, Li2/x;-><init>(J)V

    filled-new-array {v2, v6}, [Li2/x;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const/16 v4, 0xe

    invoke-static {v1, v2, v3, v3, v4}, Li2/s;->a(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v4

    invoke-virtual {v11, v9, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->W0()J

    move-result-wide v5

    const-string v1, "WeeklyPlanHomeTile_LoadingState_ProgressBar_Empty"

    invoke-static {v12, v1}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const v10, 0x1b01b6

    const/4 v11, 0x0

    const/4 v2, 0x0

    const/16 v3, 0x64

    const/4 v7, 0x0

    move/from16 v8, v37

    invoke-static/range {v1 .. v11}, Llz0/f;->b(Landroidx/compose/ui/Modifier;IILi2/t;JZFLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    const/16 v0, 0x8

    int-to-float v0, v0

    move/from16 v1, v42

    invoke-static {v1, v0, v12, v9}, Ld;->w(FFLb2/t;Lp1/q;)V

    goto :goto_8

    :cond_c
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_d

    new-instance v1, La11/i;

    const/4 v2, 0x3

    move/from16 v3, p1

    invoke-direct {v1, v3, v2}, La11/i;-><init>(II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final C()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final D(F)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lht2/e;->B(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Lht2/a;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 50
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lht2/a;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v4, p4

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v0, 0xc0c6bfe

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v5, v4, 0x30

    if-nez v5, :cond_3

    move/from16 v5, p1

    invoke-virtual {v11, v5}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    goto :goto_3

    :cond_3
    move/from16 v5, p1

    :goto_3
    and-int/lit8 v6, p5, 0x4

    if-eqz v6, :cond_5

    or-int/lit16 v0, v0, 0x180

    :cond_4
    move-object/from16 v7, p2

    goto :goto_5

    :cond_5
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_4

    move-object/from16 v7, p2

    invoke-virtual {v11, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x100

    goto :goto_4

    :cond_6
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v0, v8

    :goto_5
    and-int/lit16 v8, v0, 0x93

    const/16 v9, 0x92

    if-eq v8, v9, :cond_7

    const/4 v8, 0x1

    goto :goto_6

    :cond_7
    const/4 v8, 0x0

    :goto_6
    and-int/lit8 v9, v0, 0x1

    invoke-virtual {v11, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_10

    if-eqz v6, :cond_9

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v6, v7, :cond_8

    new-instance v6, Lh01/u;

    const/4 v7, 0x5

    invoke-direct {v6, v7}, Lh01/u;-><init>(I)V

    invoke-virtual {v11, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v6, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_9
    move-object v6, v7

    :goto_7
    sget-object v13, Lb2/t;->w:Lb2/t;

    const/4 v7, 0x0

    const/4 v8, 0x3

    invoke-static {v13, v7, v8}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v14, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const-string v14, "WeeklyPlanHomeTile_Progress_Container_Row"

    invoke-static {v9, v14}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v14, Lb2/e;->L:Lb2/l;

    sget-object v15, Ll0/m;->a:Ll0/e;

    const/16 v7, 0x30

    invoke-static {v15, v14, v11, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v2, v11, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v11, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v8, v11, Lp1/q;->S:Z

    if-eqz v8, :cond_a

    invoke-virtual {v11, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_a
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_8
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v11, v8, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v11, v7, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v14, v11, Lp1/q;->S:Z

    if-nez v14, :cond_b

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v14, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_c

    :cond_b
    invoke-static {v2, v11, v2, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v11, v2, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, Lb3/v1;->n:Lp1/u2;

    sget-object v12, Ly3/m;->w:Ly3/m;

    invoke-virtual {v9, v12}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v9

    new-instance v12, Lc41/l3;

    const/4 v14, 0x4

    invoke-direct {v12, v1, v14}, Lc41/l3;-><init>(Ljava/lang/Object;I)V

    const v14, -0x40df70de

    invoke-static {v14, v11, v12}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v12

    const/16 v14, 0x38

    invoke-static {v9, v12, v11, v14}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    const/4 v9, 0x1

    int-to-float v12, v9

    const/4 v14, 0x4

    int-to-float v14, v14

    mul-float v9, v12, v14

    move/from16 v31, v0

    invoke-static {v9, v13}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v11, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/16 v16, 0x0

    const/16 v18, 0x7

    move v0, v14

    const/4 v14, 0x0

    move-object/from16 v17, v15

    const/4 v15, 0x0

    move/from16 v48, v12

    move v12, v0

    move-object/from16 v0, v17

    move/from16 v17, v48

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v14

    const-string v15, "WeeklyPlanHomeTile_Progress_Text_Subtitle"

    invoke-static {v14, v15}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-virtual {v1}, Lht2/a;->g()Lht2/g;

    move-result-object v15

    invoke-virtual {v15}, Lht2/g;->b()Ljava/lang/String;

    move-result-object v15

    move/from16 v16, v9

    sget-object v9, Lx81/d;->a:Lx81/d;

    move-object/from16 v18, v10

    sget v10, Lx81/d;->b:I

    invoke-virtual {v9, v11, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Lb91/d;->s()Lb91/a;

    move-result-object v25

    invoke-virtual {v9, v11, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Ly81/i;->c1()J

    move-result-wide v22

    sget v24, Lb91/a;->d:I

    shl-int/lit8 v29, v24, 0x12

    const v30, 0x2fff8

    move-object/from16 v24, v9

    move/from16 v26, v10

    const-wide/16 v9, 0x0

    move-object/from16 v27, v11

    const/4 v11, 0x0

    move/from16 v28, v12

    const/4 v12, 0x0

    move-object/from16 v32, v13

    const/4 v13, 0x0

    move-object/from16 v33, v6

    move-object v6, v14

    move-object v5, v15

    const-wide/16 v14, 0x0

    move/from16 v34, v16

    const/16 v16, 0x0

    move/from16 v35, v17

    const/16 v17, 0x0

    move-object/from16 v36, v18

    const/16 v37, 0x0

    const-wide/16 v18, 0x0

    const/16 v38, 0x3

    const/16 v20, 0x0

    const/16 v39, 0x1

    const/16 v21, 0x0

    move-object/from16 v40, v7

    move-wide/from16 v48, v22

    move-object/from16 v23, v8

    move-wide/from16 v7, v48

    const/16 v22, 0x0

    move-object/from16 v41, v23

    const/16 v23, 0x0

    move-object/from16 v42, v24

    const/16 v24, 0x0

    move/from16 v43, v26

    const/16 v26, 0x0

    move/from16 v44, v28

    const/16 v28, 0x30

    move-object/from16 p2, v2

    move-object/from16 v4, v32

    move/from16 v45, v35

    move-object/from16 v1, v36

    move/from16 v2, v39

    move-object/from16 v46, v42

    move/from16 v47, v43

    move-object/from16 v32, v3

    move/from16 v3, v44

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v27

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    const/4 v5, 0x2

    int-to-float v6, v5

    invoke-static {v6, v3, v4, v11}, Ld;->w(FFLb2/t;Lp1/q;)V

    const/4 v6, -0x1

    int-to-float v6, v6

    mul-float/2addr v6, v3

    const/4 v3, 0x0

    invoke-static {v4, v6, v3, v5}, Landroidx/compose/foundation/layout/a;->n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const-string v6, "WeeklyPlanHomeTile_Progress_Container_ProgressBarRow"

    invoke-static {v5, v6}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Lb2/e;->J:Lb2/l;

    const/4 v7, 0x0

    invoke-static {v0, v6, v11, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v6, v11, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v11, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v8, v11, Lp1/q;->S:Z

    if-eqz v8, :cond_d

    invoke-virtual {v11, v1}, Lp1/q;->l(Lc93/a;)V

    :goto_9
    move-object/from16 v1, v41

    goto :goto_a

    :cond_d
    invoke-virtual {v11}, Lp1/q;->s0()V

    goto :goto_9

    :goto_a
    invoke-static {v11, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v0, v40

    invoke-static {v11, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v11, Lp1/q;->S:Z

    if-nez v0, :cond_e

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    :cond_e
    move-object/from16 v0, v32

    goto :goto_c

    :cond_f
    :goto_b
    move-object/from16 v0, p2

    goto :goto_d

    :goto_c
    invoke-static {v6, v11, v6, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_b

    :goto_d
    invoke-static {v11, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lht2/a;->g()Lht2/g;

    move-result-object v0

    invoke-virtual {v0}, Lht2/g;->c()I

    move-result v6

    sget-object v0, Li2/t;->b:Li2/s;

    move-object/from16 v1, v46

    move/from16 v5, v47

    invoke-virtual {v1, v11, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->j()J

    move-result-wide v7

    new-instance v9, Li2/x;

    invoke-direct {v9, v7, v8}, Li2/x;-><init>(J)V

    invoke-virtual {v1, v11, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->j()J

    move-result-wide v7

    new-instance v10, Li2/x;

    invoke-direct {v10, v7, v8}, Li2/x;-><init>(J)V

    filled-new-array {v9, v10}, [Li2/x;

    move-result-object v7

    invoke-static {v7}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    const/16 v8, 0xe

    invoke-static {v0, v7, v3, v3, v8}, Li2/s;->a(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v0

    invoke-virtual {v1, v11, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->W0()J

    move-result-wide v9

    const-string v1, "WeeklyPlanHomeTile_Progress_ProgressBar_Main"

    invoke-static {v4, v1}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const v14, 0x1b0186

    const/4 v15, 0x0

    const/16 v7, 0x64

    move-object/from16 v27, v11

    const/4 v11, 0x0

    move v12, v8

    move-object v8, v0

    move v0, v12

    move-object/from16 v13, v27

    move/from16 v12, v34

    invoke-static/range {v5 .. v15}, Llz0/f;->b(Landroidx/compose/ui/Modifier;IILi2/t;JZFLandroidx/compose/runtime/Composer;II)V

    move-object v11, v13

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    const/16 v1, 0x8

    int-to-float v1, v1

    move/from16 v2, v45

    invoke-static {v2, v1, v4, v11}, Ld;->w(FFLb2/t;Lp1/q;)V

    const/16 v1, 0xf

    const/4 v2, 0x0

    invoke-static {v2, v2, v1}, Lc0/w0;->d(Ld0/c0;Lkotlin/jvm/functions/Function1;I)Lc0/d1;

    move-result-object v7

    invoke-static {v2, v2, v2, v1}, Lc0/w0;->l(Ld0/c0;Lb2/l;Lkotlin/jvm/functions/Function1;I)Lc0/f1;

    move-result-object v8

    const-string v1, "WeeklyPlanHomeTile_ExpandedContent_Container_Animated"

    invoke-static {v4, v1}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    new-instance v1, Lbp0/h;

    const/4 v2, 0x1

    move-object/from16 v3, p0

    move-object/from16 v4, v33

    invoke-direct {v1, v2, v3, v4}, Lbp0/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v2, -0x4f7ef32a

    invoke-static {v2, v11, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v10

    shr-int/lit8 v1, v31, 0x3

    and-int/2addr v0, v1

    const v1, 0x30db0

    or-int v12, v0, v1

    const/16 v13, 0x10

    const/4 v9, 0x0

    move/from16 v5, p1

    invoke-static/range {v5 .. v13}, Landroidx/compose/animation/b;->f(ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v27, v11

    goto :goto_e

    :cond_10
    move-object v3, v1

    move-object/from16 v27, v11

    invoke-virtual/range {v27 .. v27}, Lp1/q;->X()V

    move-object v4, v7

    :goto_e
    invoke-virtual/range {v27 .. v27}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_11

    new-instance v0, Lht2/b;

    move/from16 v2, p1

    move/from16 v5, p5

    move-object v1, v3

    move-object v3, v4

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lht2/b;-><init>(Lht2/a;ZLkotlin/jvm/functions/Function1;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final G(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Lht2/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 32

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p2, 0x1

    move-object/from16 v4, p1

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lb2/e;->L:Lb2/l;

    sget-object v1, Ll0/m;->a:Ll0/e;

    const/16 v5, 0x30

    invoke-static {v1, v0, v4, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v5, v4, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v9, v4, Lp1/q;->S:Z

    if-eqz v9, :cond_1

    invoke-virtual {v4, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_1
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v4, v8, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v4, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v5, v4, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v1, v4, v1, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v4, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lht2/a;->g()Lht2/g;

    move-result-object v0

    invoke-virtual {v0}, Lht2/g;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4, v2}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v1, v4, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->C()Lb91/a;

    move-result-object v24

    invoke-virtual {v1, v4, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v7

    const-string v9, "WeeklyPlanHomeTile_Progress_Text_Percentage"

    invoke-static {v6, v9}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget v10, Lb91/a;->d:I

    shl-int/lit8 v28, v10, 0x12

    const v29, 0x2fff8

    move v10, v5

    move-object v11, v6

    move-wide v6, v7

    move-object v5, v9

    const-wide/16 v8, 0x0

    move v12, v10

    const/4 v10, 0x0

    move-object v13, v11

    const/4 v11, 0x0

    move v14, v12

    const/4 v12, 0x0

    move-object/from16 v16, v13

    move v15, v14

    const-wide/16 v13, 0x0

    move/from16 v17, v15

    const/4 v15, 0x0

    move-object/from16 v18, v16

    const/16 v16, 0x0

    move/from16 v19, v17

    move-object/from16 v20, v18

    const-wide/16 v17, 0x0

    move/from16 v21, v19

    const/16 v19, 0x0

    move-object/from16 v22, v20

    const/16 v20, 0x0

    move/from16 v23, v21

    const/16 v21, 0x0

    move-object/from16 v25, v22

    const/16 v22, 0x0

    move/from16 v26, v23

    const/16 v23, 0x0

    move-object/from16 v27, v25

    const/16 v25, 0x0

    move-object/from16 v30, v27

    const/16 v27, 0x30

    move-object/from16 v31, v4

    move-object v4, v0

    move/from16 v0, v26

    move-object/from16 v26, v31

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    int-to-float v10, v3

    const/4 v11, 0x7

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v6, v30

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const-string v6, "WeeklyPlanHomeTile_Progress_Text_PercentSymbol"

    invoke-static {v5, v6}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget v6, Lgy0/f;->F1:I

    invoke-static {v6, v4, v2}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v4, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->E()Lb91/a;

    move-result-object v24

    invoke-virtual {v1, v4, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v6

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v4, v2

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    invoke-virtual {v4, v3}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final I(Lht2/a;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 47

    move-object/from16 v0, p1

    move-object/from16 v4, p3

    const-string v1, "$this$AnimatedVisibility"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v9, Lb2/t;->w:Lb2/t;

    const/4 v1, 0x0

    const/4 v10, 0x3

    invoke-static {v9, v1, v10}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const/4 v1, 0x2

    int-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float v13, v1, v2

    const/4 v1, 0x1

    int-to-float v3, v1

    mul-float v15, v3, v2

    const/16 v16, 0x5

    const/4 v12, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-string v5, "WeeklyPlanHomeTile_ExpandedContent_Container_Column"

    invoke-static {v2, v5}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    int-to-float v5, v10

    const/4 v6, 0x4

    int-to-float v6, v6

    mul-float v13, v5, v6

    invoke-static {v13}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    sget-object v6, Lb2/e;->M:Lb2/k;

    const/4 v11, 0x6

    invoke-static {v5, v6, v4, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    move-object v12, v4

    check-cast v12, Lp1/q;

    iget-wide v6, v12, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v4, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    iget-object v14, v12, Lp1/q;->a:Lhb3/a0;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v14, v12, Lp1/q;->S:Z

    if-eqz v14, :cond_0

    invoke-virtual {v12, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_0
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v4, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v4, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v12, Lp1/q;->S:Z

    if-nez v7, :cond_1

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2

    :cond_1
    invoke-static {v6, v12, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v4, v5, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lht2/a;->f()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lht2/i;

    invoke-virtual {v7}, Lht2/i;->d()Lht2/j;

    move-result-object v7

    sget-object v8, Lht2/j;->IN_PROGRESS:Lht2/j;

    if-ne v7, v8, :cond_3

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-virtual/range {p0 .. p0}, Lht2/a;->f()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lht2/i;

    invoke-virtual {v7}, Lht2/i;->d()Lht2/j;

    move-result-object v7

    sget-object v8, Lht2/j;->COMPLETE:Lht2/j;

    if-ne v7, v8, :cond_5

    invoke-virtual {v14, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    const v2, -0x23930dc4

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v15, 0x0

    if-eqz v6, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lht2/i;

    sget v7, Lp01/b;->u:I

    sget v8, Lcom/whoop/navigation/e;->d:I

    or-int/2addr v7, v8

    invoke-static {v6, v0, v4, v7, v15}, Lht2/e;->U(Lht2/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_3

    :cond_7
    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    const/high16 v5, 0x3f800000    # 1.0f

    if-nez v2, :cond_8

    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_8

    const v2, -0x4ecbe3aa

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-static {v5, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-string v6, "WeeklyPlanHomeTile_ExpandedContent_Divider_Separator"

    invoke-static {v2, v6}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v4, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->W0()J

    move-result-wide v6

    move v4, v3

    move-wide/from16 v45, v6

    move v6, v1

    move-object v1, v2

    move-wide/from16 v2, v45

    const/16 v7, 0x186

    const/16 v8, 0x8

    move/from16 v16, v5

    const/4 v5, 0x0

    move-object/from16 v6, p3

    move/from16 p2, v10

    move/from16 v10, v16

    invoke-static/range {v1 .. v8}, Lge3/g;->b(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V

    move-object v4, v6

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_8
    move/from16 p2, v10

    move v10, v5

    const v1, -0x4ec7744a

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    :goto_4
    const v1, -0x2392ce44

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lht2/i;

    sget v3, Lp01/b;->u:I

    sget v5, Lcom/whoop/navigation/e;->d:I

    or-int/2addr v3, v5

    invoke-static {v2, v0, v4, v3, v15}, Lht2/e;->U(Lht2/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_5

    :cond_9
    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lht2/a;->c()Lny0/h;

    move-result-object v17

    if-nez v17, :cond_a

    const v0, -0x4ec5040e

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    move-object v6, v12

    :goto_6
    const/4 v0, 0x1

    goto/16 :goto_7

    :cond_a
    const v1, -0x4ec5040d

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    new-instance v1, Lny0/d;

    invoke-direct {v1}, Lny0/d;-><init>()V

    invoke-static {v10, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move v3, v15

    const/4 v15, 0x0

    const/16 v16, 0xd

    move-object v5, v12

    const/4 v12, 0x0

    const/4 v14, 0x0

    move v6, v11

    move-object v11, v2

    move v2, v6

    move v7, v3

    move-object v6, v5

    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const-string v5, "WeeklyPlanHomeTile_ExpandedContent_Button_ViewPlan"

    invoke-static {v3, v5}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const v43, 0x1ffdfff

    const/16 v44, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

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

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    invoke-static/range {v17 .. v44}, Lny0/h;->b(Lny0/h;Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILjava/lang/Object;)Lny0/h;

    move-result-object v5

    move-object/from16 v8, v17

    invoke-virtual {v6, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v6, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v9, v10

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_b

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v10, v9, :cond_c

    :cond_b
    new-instance v10, Lc11/d;

    const/4 v9, 0x2

    invoke-direct {v10, v0, v8, v9}, Lc11/d;-><init>(Lkotlin/jvm/functions/Function1;Lny0/h;I)V

    invoke-virtual {v6, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v10, Lkotlin/jvm/functions/Function1;

    sget v0, Lny0/h;->z:I

    shl-int/lit8 v0, v0, 0x3

    or-int/2addr v0, v2

    sget v2, Lny0/d;->a:I

    shl-int/lit8 v2, v2, 0x9

    or-int/2addr v0, v2

    move-object v2, v5

    move v5, v0

    move-object v0, v1

    move-object v1, v3

    move-object v3, v10

    invoke-virtual/range {v0 .. v5}, Lny0/d;->e(Landroidx/compose/ui/Modifier;Lny0/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v6, v7}, Lp1/q;->q(Z)V

    goto/16 :goto_6

    :goto_7
    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final J(Lkotlin/jvm/functions/Function1;Lny0/h;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lny0/h;->l()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Lht2/a;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lht2/e;->F(Lht2/a;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final L(Landroidx/compose/ui/Modifier;Lgt2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lgt2/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "modifier"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p3

    check-cast v14, Lp1/q;

    const v0, -0x3d5e678f

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    const/4 v3, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v14, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v5, v4, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v14, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :cond_3
    and-int/lit8 v5, p5, 0x4

    const/16 v6, 0x100

    if-eqz v5, :cond_5

    or-int/lit16 v0, v0, 0x180

    :cond_4
    move-object/from16 v7, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_4

    move-object/from16 v7, p2

    invoke-virtual {v14, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    move v8, v6

    goto :goto_3

    :cond_6
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v0, v8

    :goto_4
    and-int/lit16 v8, v0, 0x93

    const/16 v9, 0x92

    const/4 v11, 0x1

    if-eq v8, v9, :cond_7

    move v8, v11

    goto :goto_5

    :cond_7
    const/4 v8, 0x0

    :goto_5
    and-int/lit8 v9, v0, 0x1

    invoke-virtual {v14, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_15

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_9

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v8, :cond_8

    new-instance v5, Lh01/u;

    const/4 v7, 0x4

    invoke-direct {v5, v7}, Lh01/u;-><init>(I)V

    invoke-virtual {v14, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v5, Lkotlin/jvm/functions/Function1;

    goto :goto_6

    :cond_9
    move-object v5, v7

    :goto_6
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v8, :cond_a

    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v7}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v7

    invoke-virtual {v14, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v7, Lp1/c1;

    sget-object v9, Lx81/d;->a:Lx81/d;

    sget v12, Lx81/d;->b:I

    invoke-virtual {v9, v14, v12}, Lx81/d;->c(Landroidx/compose/runtime/Composer;I)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v9

    const-string v12, "weekly-plan-home-tile-expanded-state-fix"

    invoke-interface {v9, v12}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v9

    instance-of v12, v2, Lgt2/c$c;

    if-eqz v12, :cond_b

    move-object v13, v2

    check-cast v13, Lgt2/c$c;

    invoke-virtual {v13}, Lgt2/c$c;->b()Lm91/u;

    move-result-object v15

    instance-of v15, v15, Lht2/a;

    if-eqz v15, :cond_b

    invoke-virtual {v13}, Lgt2/c$c;->b()Lm91/u;

    move-result-object v13

    check-cast v13, Lht2/a;

    invoke-virtual {v13}, Lht2/a;->i()Z

    move-result v13

    invoke-static {v7, v13}, Lht2/e;->O(Lp1/c1;Z)V

    :cond_b
    new-instance v13, Lcom/whoop/design/util/TextResource$b;

    sget v15, Lks2/a;->k:I

    const/4 v10, 0x0

    invoke-direct {v13, v15, v10, v3, v10}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v3, Lcom/whoop/design/util/TextResource$b;->c:I

    invoke-static {v13, v14, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    if-eqz v12, :cond_c

    move-object v12, v2

    check-cast v12, Lgt2/c$c;

    goto :goto_7

    :cond_c
    move-object v12, v10

    :goto_7
    if-eqz v12, :cond_11

    invoke-virtual {v12}, Lgt2/c$c;->b()Lm91/u;

    move-result-object v12

    instance-of v13, v12, Lht2/a;

    if-eqz v13, :cond_d

    move-object v10, v12

    check-cast v10, Lht2/a;

    :cond_d
    if-eqz v10, :cond_e

    invoke-virtual {v10}, Lht2/a;->h()Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_f

    :cond_e
    move-object v10, v3

    :cond_f
    if-nez v10, :cond_10

    goto :goto_8

    :cond_10
    move-object v3, v10

    :cond_11
    :goto_8
    const-string v10, "WeeklyPlanHomeTile_Main_Container_Tile"

    invoke-static {v1, v10}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    invoke-virtual {v14, v9}, Lp1/q;->h(Z)Z

    move-result v10

    and-int/lit16 v0, v0, 0x380

    if-ne v0, v6, :cond_12

    goto :goto_9

    :cond_12
    const/4 v11, 0x0

    :goto_9
    or-int v0, v10, v11

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v0, :cond_13

    if-ne v6, v8, :cond_14

    :cond_13
    new-instance v6, Lht2/c;

    const/4 v0, 0x0

    invoke-direct {v6, v9, v5, v7, v0}, Lht2/c;-><init>(ZLkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {v14, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    move-object/from16 v19, v6

    check-cast v19, Lc93/a;

    const/16 v20, 0xf

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    new-instance v6, Lb61/j;

    invoke-direct {v6, v2, v5, v3, v7}, Lb61/j;-><init>(Lgt2/c;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lp1/c1;)V

    const v3, -0x48042bff

    invoke-static {v3, v14, v6}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v13

    const/high16 v15, 0xc00000

    const/16 v16, 0x7e

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v21, v5

    move-object v5, v0

    move-object/from16 v0, v21

    invoke-static/range {v5 .. v16}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v3, v0

    goto :goto_a

    :cond_15
    invoke-virtual {v14}, Lp1/q;->X()V

    move-object v3, v7

    :goto_a
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_16

    new-instance v0, Laz0/a;

    const/4 v6, 0x3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Laz0/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method private static final M(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final N(Lp1/c1;)Z
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

.method private static final O(Lp1/c1;Z)V
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

.method private static final P(ZLkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 1

    invoke-static {p2}, Lht2/e;->N(Lp1/c1;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {p2, v0}, Lht2/e;->O(Lp1/c1;Z)V

    if-eqz p0, :cond_0

    new-instance p0, Lgt2/b$a;

    invoke-static {p2}, Lht2/e;->N(Lp1/c1;)Z

    move-result p2

    invoke-direct {p0, p2}, Lgt2/b$a;-><init>(Z)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final Q(Lgt2/c;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 40

    move-object/from16 v0, p0

    and-int/lit8 v2, p5, 0x3

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x2

    if-eq v2, v5, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    and-int/lit8 v6, p5, 0x1

    move-object/from16 v12, p4

    check-cast v12, Lp1/q;

    invoke-virtual {v12, v6, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_19

    int-to-float v2, v5

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float v15, v2, v6

    sget-object v13, Lb2/t;->w:Lb2/t;

    const/4 v6, 0x0

    invoke-static {v13, v15, v6, v5}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v7, Ll0/m;->c:Ll0/g;

    sget-object v8, Lb2/e;->M:Lb2/k;

    invoke-static {v7, v8, v12, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v10, v12, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v12, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v6, v12, Lp1/q;->S:Z

    if-eqz v6, :cond_1

    invoke-virtual {v12, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v12, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v12, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v4, v12, Lp1/q;->S:Z

    if-nez v4, :cond_2

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    :cond_2
    invoke-static {v10, v12, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v12, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v4, 0x0

    const/4 v5, 0x3

    invoke-static {v13, v4, v5}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const-string v10, "WeeklyPlanHomeTile_Header_Container_Row"

    invoke-static {v4, v10}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v10, Lb2/e;->K:Lb2/l;

    sget-object v5, Ll0/m;->a:Ll0/e;

    move-object/from16 v16, v13

    const/16 v13, 0x30

    invoke-static {v5, v10, v12, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    move/from16 v34, v2

    iget-wide v1, v12, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {v12, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-eqz v10, :cond_4

    invoke-virtual {v12, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v12, v6, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v9, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v12, Lp1/q;->S:Z

    if-nez v2, :cond_5

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    :cond_5
    invoke-static {v1, v12, v1, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v12, v3, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v1, 0x41100000    # 9.0f

    float-to-double v4, v1

    const-wide/16 v35, 0x0

    cmpl-double v2, v4, v35

    const-string v4, "invalid weight; must be greater than zero"

    if-lez v2, :cond_7

    goto :goto_3

    :cond_7
    invoke-static {v4}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_3
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v5, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v10, v1, v5

    if-lez v10, :cond_8

    move v1, v5

    :cond_8
    const/4 v10, 0x1

    invoke-direct {v2, v1, v10}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/4 v1, 0x0

    invoke-static {v7, v8, v12, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    move/from16 v37, v5

    move-object v1, v6

    iget-wide v5, v12, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v12, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v8, v12, Lp1/q;->S:Z

    if-eqz v8, :cond_9

    invoke-virtual {v12, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_9
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v12, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v9, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v12, Lp1/q;->S:Z

    if-nez v1, :cond_a

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    :cond_a
    invoke-static {v5, v12, v5, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    invoke-static {v12, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v1, v12, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->L()Lb91/a;

    move-result-object v27

    invoke-virtual {v1, v12, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v9

    const/16 v17, 0x0

    const/16 v18, 0xd

    const/4 v14, 0x0

    move-object/from16 v13, v16

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object v6, v13

    move v5, v15

    const-string v7, "WeeklyPlanHomeTile_Header_Text_Title"

    invoke-static {v3, v7}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget v3, Lb91/a;->d:I

    shl-int/lit8 v31, v3, 0x12

    const v32, 0x2fff8

    move-object/from16 v29, v12

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x30

    move-object/from16 v7, p2

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v29

    instance-of v13, v0, Lgt2/c$c;

    const/4 v14, 0x4

    if-eqz v13, :cond_c

    move-object v7, v0

    check-cast v7, Lgt2/c$c;

    invoke-virtual {v7}, Lgt2/c$c;->b()Lm91/u;

    move-result-object v8

    instance-of v8, v8, Lht2/a;

    if-eqz v8, :cond_c

    const v8, -0x72b6aa7a

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    const/4 v8, 0x3

    int-to-float v8, v8

    int-to-float v9, v14

    mul-float/2addr v8, v9

    invoke-static {v8, v6}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v12, v8}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v7}, Lgt2/c$c;->b()Lm91/u;

    move-result-object v7

    check-cast v7, Lht2/a;

    invoke-virtual {v7}, Lht2/a;->e()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v1, v12, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->c()Lb91/a;

    move-result-object v27

    invoke-virtual {v1, v12, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->c1()J

    move-result-wide v16

    const/4 v10, 0x1

    int-to-float v7, v10

    mul-float v8, v7, v9

    const/4 v10, 0x0

    const/16 v11, 0xd

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/16 v33, 0x0

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const-string v8, "WeeklyPlanHomeTile_Header_Text_DaysLeft"

    invoke-static {v7, v8}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/16 v30, 0x30

    const v32, 0x2fff8

    move-object/from16 v29, v12

    const-wide/16 v11, 0x0

    move v7, v13

    const/4 v13, 0x0

    move v9, v14

    const/4 v14, 0x0

    move v10, v7

    move-object v7, v15

    const/4 v15, 0x0

    move/from16 v19, v9

    move/from16 v18, v10

    move-wide/from16 v9, v16

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

    move/from16 v38, v26

    const/16 v26, 0x0

    move/from16 v39, v28

    const/16 v28, 0x0

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v29

    const/4 v7, 0x0

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    :goto_5
    const/4 v10, 0x1

    goto :goto_6

    :cond_c
    move/from16 v38, v13

    const/4 v7, 0x0

    const/16 v33, 0x0

    const v8, -0x72aeff2f

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    goto :goto_5

    :goto_6
    invoke-virtual {v12, v10}, Lp1/q;->q(Z)V

    float-to-double v7, v3

    cmpl-double v7, v7, v35

    if-lez v7, :cond_d

    goto :goto_7

    :cond_d
    invoke-static {v4}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_7
    new-instance v4, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v7, v3, v37

    if-lez v7, :cond_e

    move/from16 v10, v37

    :goto_8
    const/4 v3, 0x1

    goto :goto_9

    :cond_e
    move v10, v3

    goto :goto_8

    :goto_9
    invoke-direct {v4, v10, v3}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v12, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    if-eqz v38, :cond_10

    const v3, -0x1b4b857a

    invoke-virtual {v12, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lgz0/m0;->CARET_UP:Lgz0/m0;

    invoke-virtual {v3}, Lgz0/m0;->toWhoopIcon()I

    move-result v3

    const/4 v4, 0x6

    invoke-static {v3, v12, v4}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v7

    invoke-virtual {v1, v12, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->b1()J

    move-result-wide v10

    sget v1, Lks2/a;->j:I

    invoke-static {v12, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    const/4 v1, 0x4

    int-to-float v2, v1

    mul-float/2addr v2, v2

    invoke-static {v2, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static/range {p3 .. p3}, Lht2/e;->N(Lp1/c1;)Z

    move-result v3

    if-eqz v3, :cond_f

    move/from16 v3, v33

    goto :goto_a

    :cond_f
    const/high16 v3, 0x43340000    # 180.0f

    :goto_a
    invoke-static {v3, v2}, Landroidx/room/c1;->L(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-string v3, "WeeklyPlanHomeTile_Header_Icon_ExpandCollapse"

    invoke-static {v2, v3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v7 .. v14}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v7, 0x0

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    :goto_b
    const/4 v10, 0x1

    goto :goto_c

    :cond_10
    const/4 v1, 0x4

    const/4 v7, 0x0

    const v2, -0x1b42c9b9

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    goto :goto_b

    :goto_c
    invoke-static {v12, v10, v6, v5, v12}, Lih0/d0;->B(Lp1/q;ZLb2/t;FLp1/q;)V

    instance-of v2, v0, Lgt2/c$a;

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_13

    const v2, 0x3d96475b

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    check-cast v0, Lgt2/c$a;

    move-object/from16 v2, p1

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_11

    if-ne v5, v3, :cond_12

    :cond_11
    new-instance v5, Lb11/b;

    const/4 v3, 0x6

    invoke-direct {v5, v2, v3}, Lb11/b;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x0

    invoke-static {v0, v5, v12, v7, v7}, Lht2/e;->x(Lgt2/c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    goto/16 :goto_e

    :cond_13
    move-object/from16 v2, p1

    const/4 v7, 0x0

    sget-object v4, Lgt2/c$b;->b:Lgt2/c$b;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_14

    const v0, 0x3d9652c0    # 0.07340002f

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-static {v12, v7}, Lht2/e;->B(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_14
    if-eqz v38, :cond_18

    const v4, 0x75352367

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    check-cast v0, Lgt2/c$c;

    invoke-virtual {v0}, Lgt2/c$c;->b()Lm91/u;

    move-result-object v4

    instance-of v4, v4, Lht2/a;

    if-eqz v4, :cond_17

    const v4, 0x75363703

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lgt2/c$c;->b()Lm91/u;

    move-result-object v0

    check-cast v0, Lht2/a;

    invoke-static/range {p3 .. p3}, Lht2/e;->N(Lp1/c1;)Z

    move-result v4

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_15

    if-ne v7, v3, :cond_16

    :cond_15
    new-instance v7, Lb11/b;

    const/4 v3, 0x7

    invoke-direct {v7, v2, v3}, Lb11/b;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object/from16 p0, v0

    move/from16 p4, v2

    move/from16 p5, v3

    move/from16 p1, v4

    move-object/from16 p2, v7

    move-object/from16 p3, v12

    invoke-static/range {p0 .. p5}, Lht2/e;->F(Lht2/a;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v7, 0x0

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_17
    const/4 v7, 0x0

    const v0, 0x7537bd6b

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    :goto_d
    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    :goto_e
    int-to-float v0, v1

    move/from16 v1, v34

    const/4 v10, 0x1

    invoke-static {v1, v0, v6, v12, v10}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    goto :goto_f

    :cond_18
    const/4 v7, 0x0

    const v0, 0x3d963f94

    invoke-static {v0, v12, v7}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_19
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_f
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final R(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final S(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final T(Landroidx/compose/ui/Modifier;Lgt2/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lht2/e;->L(Landroidx/compose/ui/Modifier;Lgt2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final U(Lht2/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lht2/i;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v2, -0x5847e141

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p3, 0x6

    const/4 v3, 0x4

    if-nez v2, :cond_2

    and-int/lit8 v2, p3, 0x8

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    const/4 v2, 0x2

    :goto_1
    or-int v2, p3, v2

    goto :goto_2

    :cond_2
    move/from16 v2, p3

    :goto_2
    and-int/lit8 v5, p4, 0x2

    const/16 v6, 0x20

    if-eqz v5, :cond_4

    or-int/lit8 v2, v2, 0x30

    :cond_3
    move-object/from16 v7, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v7, p3, 0x30

    if-nez v7, :cond_3

    move-object/from16 v7, p1

    invoke-virtual {v0, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    move v8, v6

    goto :goto_3

    :cond_5
    const/16 v8, 0x10

    :goto_3
    or-int/2addr v2, v8

    :goto_4
    and-int/lit8 v8, v2, 0x13

    const/16 v9, 0x12

    const/4 v10, 0x1

    if-eq v8, v9, :cond_6

    move v8, v10

    goto :goto_5

    :cond_6
    const/4 v8, 0x0

    :goto_5
    and-int/lit8 v12, v2, 0x1

    invoke-virtual {v0, v12, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_22

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_8

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v8, :cond_7

    new-instance v5, Lhb1/h;

    const/16 v7, 0x1c

    invoke-direct {v5, v7}, Lhb1/h;-><init>(I)V

    invoke-virtual {v0, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v5, Lkotlin/jvm/functions/Function1;

    goto :goto_6

    :cond_8
    move-object v5, v7

    :goto_6
    invoke-virtual {v1}, Lht2/i;->c()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_9

    const-string v7, "UnknownGoal"

    :cond_9
    invoke-virtual {v1}, Lht2/i;->c()Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_a

    const-string v14, "_HomeTile_Row"

    invoke-virtual {v12, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    goto :goto_7

    :cond_a
    const/4 v12, 0x0

    :goto_7
    const-string v14, "WeeklyPlanHomeTile_Row_Container_"

    invoke-virtual {v14, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v1}, Lht2/i;->c()Ljava/lang/String;

    move-result-object v15

    move/from16 p2, v9

    if-eqz v15, :cond_b

    const-string v9, "_HomeTile_Title"

    invoke-virtual {v15, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    goto :goto_8

    :cond_b
    const/4 v9, 0x0

    :goto_8
    const-string v15, "WeeklyPlanHomeTile_Row_Text_Title_"

    invoke-virtual {v15, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v1}, Lht2/i;->c()Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_c

    const-string v4, "_HomeTile_Progress_Indicator"

    invoke-virtual {v13, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    goto :goto_9

    :cond_c
    const/4 v13, 0x0

    :goto_9
    const-string v4, "WeeklyPlanHomeTile_Row_ProgressIndicator_"

    invoke-virtual {v4, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/high16 v7, 0x3f800000    # 1.0f

    move-object/from16 p1, v13

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v17

    and-int/lit8 v11, v2, 0xe

    if-eq v11, v3, :cond_e

    and-int/lit8 v3, v2, 0x8

    if-eqz v3, :cond_d

    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_d

    goto :goto_a

    :cond_d
    const/4 v3, 0x0

    goto :goto_b

    :cond_e
    :goto_a
    move v3, v10

    :goto_b
    and-int/lit8 v2, v2, 0x70

    if-ne v2, v6, :cond_f

    move v2, v10

    goto :goto_c

    :cond_f
    const/4 v2, 0x0

    :goto_c
    or-int/2addr v2, v3

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_10

    if-ne v3, v8, :cond_11

    :cond_10
    new-instance v3, Lf1/w1;

    const/16 v2, 0x1a

    invoke-direct {v3, v2, v1, v5}, Lf1/w1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    move-object/from16 v21, v3

    check-cast v21, Lc93/a;

    const/16 v22, 0xf

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2, v12}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    if-nez v12, :cond_12

    move v3, v10

    goto :goto_d

    :cond_12
    const/4 v3, 0x0

    :goto_d
    invoke-virtual {v0, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v6, :cond_13

    if-ne v11, v8, :cond_14

    :cond_13
    new-instance v11, Lb30/y4;

    const/16 v6, 0x1c

    invoke-direct {v11, v14, v6}, Lb30/y4;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v11, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v3, v11}, Lgb1/d;->b(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->K:Lb2/l;

    sget-object v6, Ll0/m;->g:Ll0/h;

    const/16 v11, 0x36

    invoke-static {v6, v3, v0, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v11, v0, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v0, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v14, v0, Lp1/q;->S:Z

    if-eqz v14, :cond_15

    invoke-virtual {v0, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_15
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_e
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v0, v12, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v0, v3, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v11, v0, Lp1/q;->S:Z

    if-nez v11, :cond_16

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_17

    :cond_16
    invoke-static {v6, v0, v6, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v0, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v2, v7

    const-wide/16 v11, 0x0

    cmpl-double v2, v2, v11

    if-lez v2, :cond_18

    move v2, v10

    goto :goto_f

    :cond_18
    const/4 v2, 0x0

    :goto_f
    if-nez v2, :cond_19

    const-string v2, "invalid weight; must be greater than zero"

    invoke-static {v2}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_19
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v2, v7, v10}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v2, v9}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    if-nez v9, :cond_1a

    move v3, v10

    goto :goto_10

    :cond_1a
    const/4 v3, 0x0

    :goto_10
    invoke-virtual {v0, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_1b

    if-ne v7, v8, :cond_1c

    :cond_1b
    new-instance v7, Lb30/y4;

    const/16 v6, 0x1d

    invoke-direct {v7, v15, v6}, Lb30/y4;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v3, v7}, Lgb1/d;->b(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v1}, Lht2/i;->e()Ljava/lang/String;

    move-result-object v2

    const/4 v6, 0x0

    invoke-static {v2, v0, v6}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v0, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->a()Lb91/a;

    move-result-object v22

    invoke-virtual {v1}, Lht2/i;->d()Lht2/j;

    move-result-object v9

    sget-object v11, Lht2/e$a;->a:[I

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    aget v9, v11, v9

    if-eq v9, v10, :cond_1e

    const/4 v11, 0x2

    if-ne v9, v11, :cond_1d

    const v9, 0x4e35d04e    # 7.625819E8f

    invoke-virtual {v0, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v0, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->j()J

    move-result-wide v6

    const/4 v9, 0x0

    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_1d
    const/4 v9, 0x0

    const v1, 0x4e35baaf    # 7.6222765E8f

    invoke-static {v1, v0, v9}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_1e
    const/4 v9, 0x0

    const v11, 0x4e35c625    # 7.624154E8f

    invoke-static {v0, v11, v6, v0, v7}, Lm4/a;->B(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v6

    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    :goto_11
    sget v11, Lb91/a;->d:I

    shl-int/lit8 v26, v11, 0x12

    const v27, 0x2fff8

    move-object v12, v4

    move-object v11, v5

    move-wide v4, v6

    const-wide/16 v6, 0x0

    move-object v14, v8

    const/4 v8, 0x0

    move/from16 v23, v9

    const/4 v9, 0x0

    move v15, v10

    const/4 v10, 0x0

    move-object/from16 v16, v11

    move-object/from16 v17, v12

    const-wide/16 v11, 0x0

    move-object/from16 v18, v13

    const/4 v13, 0x0

    move-object/from16 v19, v14

    const/4 v14, 0x0

    move/from16 v21, v15

    move-object/from16 v20, v16

    const-wide/16 v15, 0x0

    move-object/from16 v24, v17

    const/16 v17, 0x0

    move-object/from16 v25, v18

    const/16 v18, 0x0

    move-object/from16 v28, v19

    const/16 v19, 0x0

    move-object/from16 v29, v20

    const/16 v20, 0x0

    move/from16 v30, v21

    const/16 v21, 0x0

    move/from16 v31, v23

    const/16 v23, 0x0

    move-object/from16 v32, v25

    const/16 v25, 0x0

    move-object/from16 v33, v28

    move-object/from16 v1, v32

    move-object/from16 v28, v24

    move-object/from16 v24, v0

    move-object/from16 v0, p1

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    invoke-virtual/range {p0 .. p0}, Lht2/i;->a()Lp01/b;

    move-result-object v3

    invoke-static {v1, v0}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    if-nez v0, :cond_1f

    const/4 v10, 0x1

    :goto_12
    move-object/from16 v12, v28

    goto :goto_13

    :cond_1f
    const/4 v10, 0x0

    goto :goto_12

    :goto_13
    invoke-virtual {v2, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_20

    move-object/from16 v14, v33

    if-ne v4, v14, :cond_21

    :cond_20
    new-instance v4, Lht2/d;

    const/4 v0, 0x0

    invoke-direct {v4, v12, v0}, Lht2/d;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v2, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_21
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v10, v4}, Lgb1/d;->b(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget v1, Lp01/b;->u:I

    shl-int/lit8 v1, v1, 0x3

    const/4 v6, 0x0

    invoke-static {v0, v3, v2, v1, v6}, Lp01/f;->i(Landroidx/compose/ui/Modifier;Lp01/b;Landroidx/compose/runtime/Composer;II)V

    const/4 v15, 0x1

    invoke-virtual {v2, v15}, Lp1/q;->q(Z)V

    move-object/from16 v3, v29

    goto :goto_14

    :cond_22
    move-object v2, v0

    invoke-virtual {v2}, Lp1/q;->X()V

    move-object v3, v7

    :goto_14
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_23

    new-instance v0, Lfc0/e;

    const/16 v5, 0x17

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lfc0/e;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_23
    return-void
.end method

.method private static final V(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final W(Lht2/i;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lht2/i;->b()Lcom/whoop/navigation/e;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final X(Ljava/lang/String;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 1

    const-string v0, "$this$applyIf"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p0}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final Y(Ljava/lang/String;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 1

    const-string v0, "$this$applyIf"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p0}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final Z(Ljava/lang/String;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 1

    const-string v0, "$this$applyIf"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p0}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lny0/h;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lht2/e;->J(Lkotlin/jvm/functions/Function1;Lny0/h;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final a0(Lht2/i;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lht2/e;->U(Lht2/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lht2/e;->C()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lht2/e;->R(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p1, p0}, Lht2/e;->Y(Ljava/lang/String;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p2, p0, p1}, Lht2/e;->P(ZLkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroidx/compose/ui/Modifier;Lgt2/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lht2/e;->T(Landroidx/compose/ui/Modifier;Lgt2/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p1, p0}, Lht2/e;->Z(Ljava/lang/String;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lgt2/c$a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lht2/e;->A(Lgt2/c$a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p1, p0}, Lht2/e;->X(Ljava/lang/String;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lht2/e;->V(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lgt2/c;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lht2/e;->Q(Lgt2/c;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lht2/e;->M(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lht2/i;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lht2/e;->W(Lht2/i;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lkotlin/jvm/functions/Function1;Lgt2/c$a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lht2/e;->z(Lkotlin/jvm/functions/Function1;Lgt2/c$a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lht2/e;->E(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lht2/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lht2/e;->H(Lht2/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lht2/e;->G(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lht2/a;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lht2/e;->K(Lht2/a;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lht2/i;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lht2/e;->a0(Lht2/i;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lht2/a;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lht2/e;->I(Lht2/a;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lht2/e;->y(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(F)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lht2/e;->D(F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lht2/e;->S(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final x(Lgt2/c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 52
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgt2/c$a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v7, p2

    check-cast v7, Lp1/q;

    const v0, 0x5cef1748

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v2, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

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

    invoke-virtual {v7, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

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

    const/16 v12, 0x12

    if-eq v5, v12, :cond_5

    const/4 v5, 0x1

    goto :goto_4

    :cond_5
    const/4 v5, 0x0

    :goto_4
    and-int/lit8 v6, v0, 0x1

    invoke-virtual {v7, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_12

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_7

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v15, :cond_6

    new-instance v3, Lhb1/h;

    const/16 v4, 0x1d

    invoke-direct {v3, v4}, Lhb1/h;-><init>(I)V

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v3, Lkotlin/jvm/functions/Function1;

    goto :goto_5

    :cond_7
    move-object v3, v4

    :goto_5
    int-to-float v2, v2

    mul-float v4, v2, v2

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const-string v8, "WeeklyPlanHomeTile_ErrorState_Container_Row"

    invoke-static {v6, v8}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v8, Lb2/e;->K:Lb2/l;

    sget-object v9, Ll0/m;->a:Ll0/e;

    const/16 v10, 0x30

    invoke-static {v9, v8, v7, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    move/from16 v16, v12

    iget-wide v11, v7, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v7, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v13, v7, Lp1/q;->S:Z

    if-eqz v13, :cond_8

    invoke-virtual {v7, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_8
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_6
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v7, v13, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v7, v8, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v14, v7, Lp1/q;->S:Z

    if-nez v14, :cond_9

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    move/from16 v28, v0

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_7

    :cond_9
    move/from16 v28, v0

    :goto_7
    invoke-static {v11, v7, v11, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v7, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v11, 0x1

    int-to-float v14, v11

    mul-float v6, v14, v2

    invoke-static {v6}, Lt0/j;->e(F)Lt0/i;

    move-result-object v11

    invoke-static {v4, v11}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v11, Lx81/d;->a:Lx81/d;

    move-object/from16 v19, v10

    sget v10, Lx81/d;->b:I

    invoke-virtual {v11, v7, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v20

    move/from16 v22, v2

    move-object/from16 v21, v3

    invoke-virtual/range {v20 .. v20}, Ly81/i;->f()J

    move-result-wide v2

    move-object/from16 v20, v5

    const v5, 0x3e4ccccd    # 0.2f

    invoke-static {v5, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v2

    sget-object v5, Li2/w0;->a:Li2/v0;

    invoke-static {v4, v2, v3, v5}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    double-to-float v3, v3

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v3, v4

    invoke-static {v2, v3, v3}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-string v5, "WeeklyPlanHomeTile_ErrorState_Icon_Warning"

    invoke-static {v2, v5}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v11}, Lx81/d;->d()Lgz0/o0;

    move-result-object v5

    invoke-virtual {v5}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v5

    invoke-virtual {v5}, Lgz0/i0;->b()I

    move-result v5

    move-object/from16 v23, v12

    const/4 v12, 0x6

    invoke-static {v5, v7, v12}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v5

    invoke-virtual {v11, v7, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v24

    invoke-virtual/range {v24 .. v24}, Ly81/i;->f()J

    move-result-wide v24

    move-object/from16 v26, v8

    const/16 v8, 0x30

    move-object/from16 v27, v9

    const/4 v9, 0x0

    move/from16 v29, v3

    const/4 v3, 0x0

    move v12, v6

    move-object/from16 v30, v21

    move/from16 v31, v22

    move-object/from16 v33, v26

    move-object/from16 v32, v27

    move/from16 v34, v29

    move/from16 v29, v4

    move-object/from16 v21, v13

    move-object/from16 v13, v20

    move-object v4, v2

    move-object v2, v5

    move-wide/from16 v5, v24

    invoke-static/range {v2 .. v9}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-static {v12, v13}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v7, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v11, v7, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->s()Lb91/a;

    move-result-object v22

    invoke-virtual {v11, v7, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->b1()J

    move-result-wide v4

    const-string v2, "WeeklyPlanHomeTile_ErrorState_Text_ErrorMessage"

    invoke-static {v13, v2}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget v2, Lb91/a;->d:I

    shl-int/lit8 v26, v2, 0x12

    const v27, 0x2fff8

    const-string v2, "Your plan failed to load"

    move-object/from16 v24, v7

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move/from16 v16, v10

    const/4 v10, 0x0

    move-object/from16 v35, v11

    move/from16 v25, v12

    const-wide/16 v11, 0x0

    move-object/from16 v36, v13

    const/4 v13, 0x0

    move/from16 v37, v14

    const/4 v14, 0x0

    move-object/from16 v39, v15

    move/from16 v38, v16

    const-wide/16 v15, 0x0

    const/16 v40, 0x0

    const/16 v17, 0x0

    const/16 v41, 0x1

    const/16 v18, 0x0

    move-object/from16 v42, v19

    const/16 v19, 0x0

    const/16 v43, 0x6

    const/16 v20, 0x0

    move-object/from16 v44, v21

    const/16 v21, 0x0

    move-object/from16 v45, v23

    const/16 v23, 0x0

    move/from16 v46, v25

    const/16 v25, 0x36

    move-object/from16 v47, v0

    move/from16 v0, v41

    move-object/from16 v48, v42

    move-object/from16 v49, v44

    move-object/from16 v50, v45

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    const/high16 v2, 0x3f800000    # 1.0f

    float-to-double v3, v2

    const-wide/16 v5, 0x0

    cmpl-double v3, v3, v5

    if-lez v3, :cond_b

    goto :goto_8

    :cond_b
    const-string v3, "invalid weight; must be greater than zero"

    invoke-static {v3}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_8
    invoke-static {v2, v0, v7}, Ldc/b;->y(FZLp1/q;)V

    and-int/lit8 v2, v28, 0x70

    const/16 v10, 0x20

    if-ne v2, v10, :cond_c

    move v13, v0

    goto :goto_9

    :cond_c
    const/4 v13, 0x0

    :goto_9
    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v2, v13

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_e

    move-object/from16 v2, v39

    if-ne v3, v2, :cond_d

    goto :goto_a

    :cond_d
    move-object/from16 v13, v30

    goto :goto_b

    :cond_e
    :goto_a
    new-instance v3, Lf1/w1;

    const/16 v2, 0x19

    move-object/from16 v13, v30

    invoke-direct {v3, v2, v13, v1}, Lf1/w1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_b
    move-object/from16 v20, v3

    check-cast v20, Lc93/a;

    const/16 v21, 0xf

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v36

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object/from16 v14, v16

    move/from16 v10, v31

    mul-float v4, v29, v10

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static/range {v46 .. v46}, Lt0/j;->e(F)Lt0/i;

    move-result-object v3

    invoke-static {v2, v3}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v11, 0x0

    move/from16 v3, v34

    const/4 v12, 0x2

    invoke-static {v2, v3, v11, v12}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-string v3, "WeeklyPlanHomeTile_ErrorState_Icon_Retry"

    invoke-static {v2, v3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual/range {v35 .. v35}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/a;->p()I

    move-result v2

    const/4 v3, 0x6

    invoke-static {v2, v7, v3}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v2

    move-object/from16 v15, v35

    move/from16 v3, v38

    invoke-virtual {v15, v7, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v5

    const/16 v8, 0x30

    const/4 v9, 0x0

    const/4 v3, 0x0

    move/from16 v51, v38

    invoke-static/range {v2 .. v9}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    int-to-float v2, v12

    invoke-static {v2, v10, v14, v7}, Ld;->w(FFLb2/t;Lp1/q;)V

    const/4 v2, -0x1

    int-to-float v2, v2

    mul-float/2addr v2, v10

    invoke-static {v14, v2, v11, v12}, Landroidx/compose/foundation/layout/a;->n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-string v3, "WeeklyPlanHomeTile_ErrorState_Container_ProgressBarRow"

    invoke-static {v2, v3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->J:Lb2/l;

    move-object/from16 v4, v32

    const/4 v5, 0x0

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

    if-eqz v6, :cond_f

    move-object/from16 v6, v48

    invoke-virtual {v7, v6}, Lp1/q;->l(Lc93/a;)V

    :goto_c
    move-object/from16 v6, v49

    goto :goto_d

    :cond_f
    invoke-virtual {v7}, Lp1/q;->s0()V

    goto :goto_c

    :goto_d
    invoke-static {v7, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v3, v33

    invoke-static {v7, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v7, Lp1/q;->S:Z

    if-nez v3, :cond_10

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_11

    :cond_10
    move-object/from16 v3, v50

    goto :goto_f

    :cond_11
    :goto_e
    move-object/from16 v3, v47

    goto :goto_10

    :goto_f
    invoke-static {v4, v7, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_e

    :goto_10
    invoke-static {v7, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, Li2/t;->b:Li2/s;

    move/from16 v3, v51

    invoke-virtual {v15, v7, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->j()J

    move-result-wide v4

    new-instance v6, Li2/x;

    invoke-direct {v6, v4, v5}, Li2/x;-><init>(J)V

    invoke-virtual {v15, v7, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->j()J

    move-result-wide v4

    new-instance v8, Li2/x;

    invoke-direct {v8, v4, v5}, Li2/x;-><init>(J)V

    filled-new-array {v6, v8}, [Li2/x;

    move-result-object v4

    invoke-static {v4}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const/16 v5, 0xe

    invoke-static {v2, v4, v11, v11, v5}, Li2/s;->a(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v5

    invoke-virtual {v15, v7, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->W0()J

    move-result-wide v2

    const-string v4, "WeeklyPlanHomeTile_ErrorState_ProgressBar_Empty"

    invoke-static {v14, v4}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const v11, 0x1b01b6

    const/4 v12, 0x0

    move-object/from16 v24, v7

    move-wide v6, v2

    const/4 v3, 0x0

    move-object v2, v4

    const/16 v4, 0x64

    const/4 v8, 0x0

    move-object/from16 v10, v24

    move/from16 v9, v46

    invoke-static/range {v2 .. v12}, Llz0/f;->b(Landroidx/compose/ui/Modifier;IILi2/t;JZFLandroidx/compose/runtime/Composer;II)V

    move-object v7, v10

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    mul-float v0, v37, v29

    invoke-static {v0, v14}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v7, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move-object v3, v13

    goto :goto_11

    :cond_12
    invoke-virtual {v7}, Lp1/q;->X()V

    move-object v3, v4

    :goto_11
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_13

    new-instance v0, Lfc0/e;

    const/16 v5, 0x16

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lfc0/e;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final y(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lkotlin/jvm/functions/Function1;Lgt2/c$a;)Ll83/a0;
    .locals 1

    new-instance v0, Lgt2/b$b;

    invoke-virtual {p1}, Lgt2/c$a;->a()Ljava/time/LocalDate;

    move-result-object p1

    invoke-direct {v0, p1}, Lgt2/b$b;-><init>(Ljava/time/LocalDate;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
