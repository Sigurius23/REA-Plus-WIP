.class public abstract Ls3/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwy/b;


# direct methods
.method public static final a(Lcom/amplitude/android/engagement/types/NudgeStep;Lsj/l;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move-object/from16 v2, p1

    sget-object v0, Lb2/e;->J:Lb2/l;

    const-string v1, "step"

    move-object/from16 v3, p0

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p3

    check-cast v1, Lp1/q;

    const v4, -0x4ff5f7af

    invoke-virtual {v1, v4}, Lp1/q;->g0(I)Lp1/q;

    const/16 v4, 0x14

    int-to-float v4, v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object/from16 v7, p2

    invoke-static {v7, v5, v4, v6}, Landroidx/compose/foundation/layout/d;->b(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const v8, -0x1896950d

    invoke-virtual {v1, v8}, Lp1/q;->f0(I)V

    sget-object v8, Luj/k;->a:Lp1/u2;

    invoke-virtual {v1, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Luj/m;

    const/4 v9, 0x0

    invoke-virtual {v1, v9}, Lp1/q;->q(Z)V

    iget-wide v10, v8, Luj/m;->w:J

    sget-object v8, Li2/w0;->a:Li2/v0;

    invoke-static {v4, v10, v11, v8}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v8, Lb2/e;->w:Lb2/m;

    invoke-static {v8, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v8

    iget-wide v10, v1, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v1, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v13, v1, Lp1/q;->S:Z

    if-eqz v13, :cond_0

    invoke-virtual {v1, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_0
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v1, v13, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v1, v8, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v14, v1, Lp1/q;->S:Z

    if-nez v14, :cond_1

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_2

    :cond_1
    invoke-static {v10, v1, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v1, v10, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    sget-object v14, Lb2/e;->y:Lb2/m;

    sget-object v15, Lb2/t;->w:Lb2/t;

    invoke-virtual {v4, v15, v14}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/high16 v14, 0x41200000    # 10.0f

    invoke-static {v14, v4}, Lb2/a;->a(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v14, 0x40

    invoke-virtual {v2, v4, v14, v1, v9}, Lsj/l;->b(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v14, Ll0/m;->a:Ll0/e;

    const/4 v9, 0x6

    invoke-static {v14, v0, v1, v9}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v14

    iget-wide v6, v1, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v1, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v9, v1, Lp1/q;->S:Z

    if-eqz v9, :cond_3

    invoke-virtual {v1, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_3
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_1
    invoke-static {v1, v13, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1, v8, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v1, Lp1/q;->S:Z

    if-nez v7, :cond_4

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5

    :cond_4
    invoke-static {v6, v1, v6, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    invoke-static {v1, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v5, 0x3a08a200

    invoke-virtual {v1, v5}, Lp1/q;->f0(I)V

    invoke-virtual {v3}, Lcom/amplitude/android/engagement/types/NudgeStep;->getContent()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    instance-of v6, v5, Ljava/util/Collection;

    const-string v7, "left"

    const/16 v8, 0x8

    sget-object v9, Ll0/t1;->a:Ll0/t1;

    if-eqz v6, :cond_6

    move-object v6, v5

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_6

    goto :goto_3

    :cond_6
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/amplitude/android/engagement/types/ContentBlock;

    instance-of v10, v6, Lcom/amplitude/android/engagement/types/ImageBlock;

    if-nez v10, :cond_8

    instance-of v6, v6, Lcom/amplitude/android/engagement/types/VideoBlock;

    if-eqz v6, :cond_7

    :cond_8
    invoke-virtual {v3}, Lcom/amplitude/android/engagement/types/NudgeStep;->getFormFactor()Lcom/amplitude/android/engagement/types/FormFactor;

    move-result-object v5

    invoke-virtual {v5}, Lcom/amplitude/android/engagement/types/FormFactor;->getMediaPosition()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    const/4 v5, 0x1

    invoke-virtual {v9, v15, v5, v4}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v2, v6, v1, v8}, Ls3/d;->b(Lsj/l;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :goto_2
    const/4 v6, 0x0

    goto :goto_4

    :cond_9
    :goto_3
    const/4 v5, 0x1

    goto :goto_2

    :goto_4
    invoke-virtual {v1, v6}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v15, v5, v4}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v4, v10}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/16 v10, 0x10

    int-to-float v10, v10

    invoke-static {v10, v5}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v10, Ll0/m;->c:Ll0/g;

    sget-object v11, Lb2/e;->M:Lb2/k;

    invoke-static {v10, v11, v1, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v10

    iget-wide v11, v1, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v1, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v13, v1, Lp1/q;->S:Z

    if-eqz v13, :cond_a

    invoke-virtual {v1, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_a
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_5
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v1, v13, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v1, v10, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v14, v1, Lp1/q;->S:Z

    if-nez v14, :cond_b

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v14, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_c

    :cond_b
    invoke-static {v6, v1, v6, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v1, v6, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v8, Ll0/m;->a:Ll0/e;

    const/4 v14, 0x6

    invoke-static {v8, v0, v1, v14}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    move-object v14, v7

    move-object/from16 v16, v8

    iget-wide v7, v1, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v1, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v3, v1, Lp1/q;->S:Z

    if-eqz v3, :cond_d

    invoke-virtual {v1, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_d
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v1, v13, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1, v10, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v1, Lp1/q;->S:Z

    if-nez v3, :cond_e

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_f

    :cond_e
    invoke-static {v7, v1, v7, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    invoke-static {v1, v6, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v3, 0x0

    const/16 v4, 0x40

    const/4 v5, 0x1

    invoke-virtual {v2, v3, v4, v1, v5}, Lsj/l;->d(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v1, v5}, Lp1/q;->q(Z)V

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move-object/from16 v3, v16

    const/4 v5, 0x6

    invoke-static {v3, v0, v1, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v7, v1, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v1, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v7, v1, Lp1/q;->S:Z

    if-eqz v7, :cond_10

    invoke-virtual {v1, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_10
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v1, v13, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v1, Lp1/q;->S:Z

    if-nez v0, :cond_11

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    :cond_11
    invoke-static {v3, v1, v3, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    invoke-static {v1, v6, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v0, 0x2

    const/4 v3, 0x0

    const/16 v4, 0x40

    invoke-virtual {v2, v0, v4, v1, v3}, Lsj/l;->e(IILandroidx/compose/runtime/Composer;I)V

    const/4 v5, 0x1

    invoke-virtual {v1, v5}, Lp1/q;->q(Z)V

    const/16 v0, 0x8

    invoke-virtual {v2, v1, v0}, Lsj/l;->g(Landroidx/compose/runtime/Composer;I)V

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    int-to-float v3, v0

    const/4 v0, 0x0

    invoke-static {v4, v0, v3, v5}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v3, Ll0/m;->g:Ll0/h;

    sget-object v4, Lb2/e;->K:Lb2/l;

    const/16 v5, 0x36

    invoke-static {v3, v4, v1, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v4, v1, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v1, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v7, v1, Lp1/q;->S:Z

    if-eqz v7, :cond_13

    invoke-virtual {v1, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_13
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v1, v13, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v1, Lp1/q;->S:Z

    if-nez v3, :cond_14

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_15

    :cond_14
    invoke-static {v4, v1, v4, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    invoke-static {v1, v6, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v0, 0x8

    invoke-virtual {v2, v1, v0}, Lsj/l;->a(Landroidx/compose/runtime/Composer;I)V

    const/4 v5, 0x1

    invoke-virtual {v1, v5}, Lp1/q;->q(Z)V

    invoke-virtual {v2, v1, v0}, Lsj/l;->c(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v1, v5}, Lp1/q;->q(Z)V

    const v0, -0x1dd584fe

    invoke-virtual {v1, v0}, Lp1/q;->f0(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/amplitude/android/engagement/types/NudgeStep;->getContent()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v3, v0, Ljava/util/Collection;

    if-eqz v3, :cond_16

    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_16

    goto :goto_a

    :cond_16
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_19

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/amplitude/android/engagement/types/ContentBlock;

    instance-of v4, v3, Lcom/amplitude/android/engagement/types/ImageBlock;

    if-nez v4, :cond_18

    instance-of v3, v3, Lcom/amplitude/android/engagement/types/VideoBlock;

    if-eqz v3, :cond_17

    :cond_18
    invoke-virtual/range {p0 .. p0}, Lcom/amplitude/android/engagement/types/NudgeStep;->getFormFactor()Lcom/amplitude/android/engagement/types/FormFactor;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/FormFactor;->getMediaPosition()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_19

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v5, 0x1

    invoke-virtual {v9, v15, v5, v3}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v3, 0x8

    invoke-static {v2, v0, v1, v3}, Ls3/d;->b(Lsj/l;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :goto_9
    const/4 v3, 0x0

    goto :goto_b

    :cond_19
    :goto_a
    const/4 v5, 0x1

    goto :goto_9

    :goto_b
    invoke-virtual {v1, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v1, v5}, Lp1/q;->q(Z)V

    invoke-virtual {v1, v5}, Lp1/q;->q(Z)V

    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-nez v6, :cond_1a

    return-void

    :cond_1a
    new-instance v0, Lsj/d;

    const/4 v5, 0x0

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lsj/d;-><init>(Lcom/amplitude/android/engagement/types/NudgeStep;Lsj/l;Landroidx/compose/ui/Modifier;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final b(Lsj/l;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 8

    check-cast p2, Lp1/q;

    const v0, 0x578c38a5

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, p1}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v2, 0x6

    int-to-float v2, v2

    const/16 v3, 0x9

    const/4 v4, 0x0

    invoke-static {v4, v2, v2, v4, v3}, Lt0/j;->g(FFFFI)Lt0/i;

    move-result-object v2

    invoke-static {v1, v2}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->w:Lb2/m;

    const/4 v3, 0x0

    invoke-static {v2, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v4, p2, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {p2}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {p2, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {p2}, Lp1/q;->i0()V

    iget-boolean v7, p2, Lp1/q;->S:Z

    if-eqz v7, :cond_0

    invoke-virtual {p2, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lp1/q;->s0()V

    :goto_0
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {p2, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {p2, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v5, p2, Lp1/q;->S:Z

    if-nez v5, :cond_1

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    :cond_1
    invoke-static {v4, p2, v4, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {p2, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v1, 0x46

    invoke-virtual {p0, v0, v1, p2, v3}, Lsj/l;->f(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lp1/q;->q(Z)V

    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-nez p2, :cond_3

    return-void

    :cond_3
    new-instance v0, Lc4/q;

    const/16 v1, 0x8

    invoke-direct {v0, p0, p1, p3, v1}, Lc4/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final c(ZLx30/n1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 14

    move/from16 v4, p4

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v0, -0x7eb5c44

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v11, p0}, Lp1/q;->h(Z)Z

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
    and-int/lit8 v1, v4, 0x30

    if-nez v1, :cond_3

    invoke-virtual {v11, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit16 v1, v4, 0x180

    move-object/from16 v3, p2

    if-nez v1, :cond_5

    invoke-virtual {v11, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x100

    goto :goto_3

    :cond_4
    const/16 v1, 0x80

    :goto_3
    or-int/2addr v0, v1

    :cond_5
    and-int/lit16 v1, v0, 0x93

    const/16 v2, 0x92

    if-ne v1, v2, :cond_7

    invoke-virtual {v11}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {v11}, Lp1/q;->X()V

    goto :goto_5

    :cond_7
    :goto_4
    iget-object v1, p1, Lx30/n1;->f:Lx30/l1;

    iget-object v2, v1, Lx30/l1;->c:Lec3/h2;

    const/4 v5, 0x0

    invoke-static {v2, v11, v5}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v2

    iget-object v6, v1, Lx30/l1;->a:Lec3/h2;

    invoke-static {v6, v11, v5}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v6

    iget-object v7, p1, Lx30/n1;->d:Ln53/e;

    invoke-static {v7, v11, v5}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v7

    invoke-interface {v7}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    invoke-interface {v6}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lzy/c;

    invoke-static {v6, v11}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v8

    const v6, -0x47e3e2d9

    invoke-virtual {v11, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v11, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v6, v9

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v6, :cond_8

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v9, v6, :cond_9

    :cond_8
    new-instance v9, Lx30/j1;

    const/4 v6, 0x1

    invoke-direct {v9, v6, v1, v2}, Lx30/j1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v11, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object v10, v9

    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    shr-int/lit8 v1, v0, 0x6

    and-int/lit8 v1, v1, 0xe

    or-int/lit8 v1, v1, 0x30

    shl-int/lit8 v0, v0, 0xc

    const v2, 0xe000

    and-int/2addr v0, v2

    or-int v12, v1, v0

    const/4 v13, 0x0

    const-string v6, "SET_AS_DEFAULT_PAYMENT_METHOD_TEST_TAG"

    move v9, p0

    move-object v5, v3

    invoke-static/range {v5 .. v13}, Lx30/s0;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLjava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    :cond_a
    :goto_5
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_b

    new-instance v0, Lsg2/o;

    const/16 v5, 0x9

    move v1, p0

    move-object v2, p1

    move-object/from16 v3, p2

    invoke-direct/range {v0 .. v5}, Lsg2/o;-><init>(ZLjava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method public static final d(FLm83/p;)F
    .locals 1

    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lm83/p;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    :cond_0
    return p0
.end method

.method public static final e(Lwe/g;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lwe/g;->m:Lve/e;

    iget-object v1, v1, Lve/e;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ls3/d;->h(Lwe/g;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static f(CLjava/lang/CharSequence;I)I
    .locals 2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    :goto_0
    if-ge p2, v0, :cond_1

    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    if-ne v1, p0, :cond_0

    return p2

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method

.method public static g(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/ApiException;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/Status;->y:Landroid/app/PendingIntent;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/common/api/ResolvableApiException;

    invoke-direct {v0, p0}, Lcom/google/android/gms/common/api/ApiException;-><init>(Lcom/google/android/gms/common/api/Status;)V

    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/common/api/ApiException;

    invoke-direct {v0, p0}, Lcom/google/android/gms/common/api/ApiException;-><init>(Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method

.method public static final h(Lwe/g;)Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lwe/g;->c:Ljava/lang/String;

    iget-object v1, p0, Lwe/g;->d:Lug/b;

    sget-object v2, Lug/t;->y:Lug/t;

    invoke-virtual {v1, v2}, Lug/b;->b(Lug/t;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lwe/g;->f:Lwe/e;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    const-string v3, "/aws4_request"

    const/16 v4, 0x2f

    if-eqz v2, :cond_1

    const/4 p0, 0x1

    if-ne v2, p0, :cond_0

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lwe/g;->b:Ljava/lang/String;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Ljava/util/Locale;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final j(Lxz/x;)Lwz/e;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lxz/x;->a:Lxz/f0;

    iget-object p0, p0, Lxz/f0;->b:Lec3/r1;

    iget-object p0, p0, Lec3/r1;->w:Lec3/f2;

    invoke-interface {p0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lwz/e;

    return-object p0
.end method

.method public static k(I)Z
    .locals 3

    invoke-static {p0}, Ljava/lang/Character;->getType(I)I

    move-result v0

    const/16 v1, 0x1d

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    const/16 v1, 0x1e

    if-eq v0, v1, :cond_0

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x24

    if-eq p0, v0, :cond_0

    const/16 v0, 0x2b

    if-eq p0, v0, :cond_0

    const/16 v0, 0x5e

    if-eq p0, v0, :cond_0

    const/16 v0, 0x60

    if-eq p0, v0, :cond_0

    const/16 v0, 0x7c

    if-eq p0, v0, :cond_0

    const/16 v0, 0x7e

    if-eq p0, v0, :cond_0

    packed-switch p0, :pswitch_data_1

    const/4 p0, 0x0

    return p0

    :cond_0
    :pswitch_0
    return v2

    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x3c
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static l(I)Z
    .locals 3

    const/16 v0, 0x9

    const/4 v1, 0x1

    if-eq p0, v0, :cond_1

    const/16 v0, 0xa

    if-eq p0, v0, :cond_1

    const/16 v0, 0xc

    if-eq p0, v0, :cond_1

    const/16 v2, 0xd

    if-eq p0, v2, :cond_1

    const/16 v2, 0x20

    if-eq p0, v2, :cond_1

    invoke-static {p0}, Ljava/lang/Character;->getType(I)I

    move-result p0

    if-ne p0, v0, :cond_0

    return v1

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    return v1
.end method

.method public static final n(Lw3/o;Lw3/o;F)Lw3/o;
    .locals 6

    instance-of v0, p0, Lw3/b;

    sget-object v1, Lw3/n;->a:Lw3/n;

    const-wide/16 v2, 0x10

    if-nez v0, :cond_1

    instance-of v4, p1, Lw3/b;

    if-nez v4, :cond_1

    invoke-interface {p0}, Lw3/o;->b()J

    move-result-wide v4

    invoke-interface {p1}, Lw3/o;->b()J

    move-result-wide p0

    invoke-static {v4, v5, p0, p1, p2}, Li2/w0;->w(JJF)J

    move-result-wide p0

    cmp-long p2, p0, v2

    if-eqz p2, :cond_0

    new-instance p2, Lw3/c;

    invoke-direct {p2, p0, p1}, Lw3/c;-><init>(J)V

    return-object p2

    :cond_0
    return-object v1

    :cond_1
    if-eqz v0, :cond_6

    instance-of v0, p1, Lw3/b;

    if-eqz v0, :cond_6

    check-cast p0, Lw3/b;

    iget-object v0, p0, Lw3/b;->a:Li2/y0;

    check-cast p1, Lw3/b;

    iget-object v4, p1, Lw3/b;->a:Li2/y0;

    invoke-static {p2, v0, v4}, Ll3/n0;->b(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li2/t;

    iget p0, p0, Lw3/b;->b:F

    iget p1, p1, Lw3/b;->b:F

    invoke-static {p0, p1, p2}, Le93/b;->O(FFF)F

    move-result p0

    if-nez v0, :cond_2

    return-object v1

    :cond_2
    instance-of p1, v0, Li2/c1;

    if-eqz p1, :cond_4

    check-cast v0, Li2/c1;

    iget-wide p1, v0, Li2/c1;->c:J

    invoke-static {p0, p1, p2}, Ls3/d;->p(FJ)J

    move-result-wide p0

    cmp-long p2, p0, v2

    if-eqz p2, :cond_3

    new-instance p2, Lw3/c;

    invoke-direct {p2, p0, p1}, Lw3/c;-><init>(J)V

    return-object p2

    :cond_3
    return-object v1

    :cond_4
    instance-of p1, v0, Li2/y0;

    if-eqz p1, :cond_5

    new-instance p1, Lw3/b;

    check-cast v0, Li2/y0;

    invoke-direct {p1, v0, p0}, Lw3/b;-><init>(Li2/y0;F)V

    return-object p1

    :cond_5
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_6
    invoke-static {p2, p0, p1}, Ll3/n0;->b(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lw3/o;

    return-object p0
.end method

.method public static final o(Lxz/x;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, Lxz/g0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lxz/g0;

    iget v1, v0, Lxz/g0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lxz/g0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lxz/g0;

    invoke-direct {v0, p1}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lxz/g0;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lxz/g0;->y:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lxz/g0;->w:Lxz/x;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lxz/x;->j:Ly00/k0;

    if-nez p1, :cond_5

    iput-object p0, v0, Lxz/g0;->w:Lxz/x;

    iput v3, v0, Lxz/g0;->y:I

    invoke-virtual {p0, v0}, Lxz/x;->h(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    instance-of v0, p1, Ll83/m;

    if-eqz v0, :cond_4

    move-object p1, v4

    :cond_4
    check-cast p1, Ly00/k0;

    if-nez p1, :cond_5

    goto :goto_3

    :cond_5
    iget-object v0, p1, Ly00/k0;->w:Ljava/util/ArrayList;

    iput-object p1, p0, Lxz/x;->j:Ly00/k0;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ly00/j0;

    iget-boolean v2, v2, Ly00/j0;->x:Z

    if-eqz v2, :cond_6

    goto :goto_2

    :cond_7
    move-object v1, v4

    :goto_2
    check-cast v1, Ly00/j0;

    if-nez v1, :cond_8

    invoke-static {v0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ly00/j0;

    :cond_8
    if-eqz v1, :cond_a

    iget-object p0, p0, Lxz/x;->a:Lxz/f0;

    iget-object p0, p0, Lxz/f0;->b:Lec3/r1;

    iget-object p0, p0, Lec3/r1;->w:Lec3/f2;

    invoke-interface {p0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lwz/d;

    iget-object p0, p0, Lwz/d;->w:Ld00/l;

    if-eqz p0, :cond_9

    invoke-virtual {p0}, Ld00/l;->f()Ljava/lang/String;

    move-result-object v4

    :cond_9
    iget-object p0, v1, Ly00/j0;->w:Ljava/lang/String;

    iget-boolean p1, v1, Ly00/j0;->x:Z

    iget-object v0, v1, Ly00/j0;->y:Ly00/y;

    const-string v1, "id"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "address"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ly00/j0;

    invoke-direct {v1, p0, p1, v0, v4}, Ly00/j0;-><init>(Ljava/lang/String;ZLy00/y;Ljava/lang/String;)V

    return-object v1

    :cond_a
    :goto_3
    return-object v4
.end method

.method public static final p(FJ)J
    .locals 1

    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_1

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p0, v0

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Li2/x;->e(J)F

    move-result v0

    mul-float/2addr v0, p0

    invoke-static {v0, p1, p2}, Li2/x;->c(FJ)J

    move-result-wide p0

    return-wide p0

    :cond_1
    :goto_0
    return-wide p1
.end method

.method public static q(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lcq/i;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/Status;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2, p1}, Lcq/i;->b(Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-static {p0}, Ls3/d;->g(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/ApiException;

    move-result-object p0

    invoke-virtual {p2, p0}, Lcq/i;->a(Ljava/lang/Exception;)V

    return-void
.end method

.method public static r(Ljava/lang/CharSequence;II)I
    .locals 2

    :goto_0
    if-ge p1, p2, :cond_1

    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_0

    const/16 v1, 0x20

    if-eq v0, v1, :cond_0

    return p1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    return p2
.end method

.method public static s(Ljava/lang/CharSequence;II)I
    .locals 2

    :goto_0
    if-lt p1, p2, :cond_1

    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_0

    const/16 v1, 0x20

    if-eq v0, v1, :cond_0

    return p1

    :cond_0
    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_1
    add-int/lit8 p2, p2, -0x1

    return p2
.end method

.method public static t(Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    new-instance v0, Lt9/c0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tasks/Task;->continueWith(Lcq/b;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method public static final u(Lwz/e;Lxz/f0;)V
    .locals 1

    const-string v0, "linkAccountHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lwz/d;

    if-eqz v0, :cond_0

    check-cast p0, Lwz/d;

    invoke-virtual {p1, p0}, Lxz/f0;->a(Lwz/d;)V

    return-void

    :cond_0
    sget-object p1, Lwz/b;->w:Lwz/b;

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    return-void

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final v(Lw63/a;Lw63/a;I)I
    .locals 5

    iget v0, p1, Lio/seon/androidsdk/service/e1;->c:I

    iget v1, p1, Lio/seon/androidsdk/service/e1;->b:I

    sub-int/2addr v0, v1

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    iget v0, p0, Lio/seon/androidsdk/service/e1;->e:I

    iget v1, p0, Lio/seon/androidsdk/service/e1;->c:I

    sub-int v2, v0, v1

    if-gt v2, p2, :cond_1

    iget v3, p0, Lio/seon/androidsdk/service/e1;->f:I

    sub-int v4, v3, v0

    add-int/2addr v4, v2

    if-lt v4, p2, :cond_0

    add-int v2, v1, p2

    sub-int/2addr v2, v0

    if-lez v2, :cond_1

    iput v3, p0, Lio/seon/androidsdk/service/e1;->e:I

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Can\'t append buffer: not enough free space at the end"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    iget-object v0, p0, Lio/seon/androidsdk/service/e1;->g:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    iget-object v2, p1, Lio/seon/androidsdk/service/e1;->g:Ljava/lang/Object;

    check-cast v2, Ljava/nio/ByteBuffer;

    iget v3, p1, Lio/seon/androidsdk/service/e1;->b:I

    invoke-static {v2, v0, v3, p2, v1}, Lt63/b;->a(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;III)V

    invoke-virtual {p1, p2}, Lio/seon/androidsdk/service/e1;->d(I)V

    invoke-virtual {p0, p2}, Lio/seon/androidsdk/service/e1;->b(I)V

    return p2
.end method
