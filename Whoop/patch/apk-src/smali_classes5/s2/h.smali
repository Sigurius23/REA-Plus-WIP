.class public abstract Ls2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwy/b;


# direct methods
.method public static final a(Lcom/amplitude/android/engagement/types/NudgeStep;Lsj/l;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V
    .locals 20

    move-object/from16 v2, p1

    sget-object v0, Lb2/e;->J:Lb2/l;

    sget-object v1, Lb2/e;->M:Lb2/k;

    const-string v3, "step"

    move-object/from16 v4, p0

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p4

    check-cast v3, Lp1/q;

    const v5, 0x57560e9d

    invoke-virtual {v3, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, p6, 0x4

    sget-object v6, Lb2/t;->w:Lb2/t;

    if-eqz v5, :cond_0

    move-object v5, v6

    goto :goto_0

    :cond_0
    move-object/from16 v5, p2

    :goto_0
    and-int/lit8 v7, p6, 0x8

    const/4 v8, 0x0

    if-eqz v7, :cond_1

    move v7, v8

    goto :goto_1

    :cond_1
    move/from16 v7, p3

    :goto_1
    const v9, -0x1896950d

    invoke-virtual {v3, v9}, Lp1/q;->f0(I)V

    sget-object v10, Luj/k;->a:Lp1/u2;

    invoke-virtual {v3, v10}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Luj/m;

    invoke-virtual {v3, v8}, Lp1/q;->q(Z)V

    iget-wide v11, v11, Luj/m;->w:J

    sget-object v13, Li2/w0;->a:Li2/v0;

    invoke-static {v6, v11, v12, v13}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v12, Lb2/e;->w:Lb2/m;

    invoke-static {v12, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v13

    iget-wide v14, v3, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v3, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v8, v3, Lp1/q;->S:Z

    if-eqz v8, :cond_2

    invoke-virtual {v3, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_2
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v3, v8, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->f:La3/i;

    invoke-static {v3, v13, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->j:La3/i;

    iget-boolean v4, v3, Lp1/q;->S:Z

    if-nez v4, :cond_3

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v16, v0

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_3

    :cond_3
    move-object/from16 v16, v0

    :goto_3
    invoke-static {v14, v3, v14, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_4
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v3, v0, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v4, -0x5580657c

    invoke-virtual {v3, v4}, Lp1/q;->f0(I)V

    const/16 v4, 0x40

    if-nez v7, :cond_6

    invoke-virtual/range {p0 .. p0}, Lcom/amplitude/android/engagement/types/NudgeStep;->getFormFactor()Lcom/amplitude/android/engagement/types/FormFactor;

    move-result-object v11

    invoke-virtual {v11}, Lcom/amplitude/android/engagement/types/FormFactor;->getTitleAlignment()Lcom/amplitude/android/engagement/types/ContentAlignment;

    move-result-object v11

    sget-object v14, Lcom/amplitude/android/engagement/types/ContentAlignment;->END:Lcom/amplitude/android/engagement/types/ContentAlignment;

    if-ne v11, v14, :cond_5

    move-object v11, v12

    goto :goto_4

    :cond_5
    sget-object v11, Lb2/e;->y:Lb2/m;

    :goto_4
    sget-object v14, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v14, v6, v11}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const/high16 v14, 0x41200000    # 10.0f

    invoke-static {v14, v11}, Lb2/a;->a(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const/4 v14, 0x0

    invoke-virtual {v2, v11, v4, v3, v14}, Lsj/l;->b(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    goto :goto_5

    :cond_6
    const/4 v14, 0x0

    :goto_5
    invoke-virtual {v3, v14}, Lp1/q;->q(Z)V

    const/16 v11, 0x14

    int-to-float v11, v11

    const/4 v4, 0x0

    const/4 v14, 0x1

    invoke-static {v5, v4, v11, v14}, Landroidx/compose/foundation/layout/d;->b(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const v11, -0x1896950d

    invoke-virtual {v3, v11}, Lp1/q;->f0(I)V

    invoke-virtual {v3, v10}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Luj/m;

    const/4 v14, 0x0

    invoke-virtual {v3, v14}, Lp1/q;->q(Z)V

    iget v11, v11, Luj/m;->M:F

    invoke-static {v11, v4}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v12, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v11

    move-object v14, v5

    move-object v12, v6

    iget-wide v5, v3, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v3, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v3}, Lp1/q;->i0()V

    move-object/from16 v17, v12

    iget-boolean v12, v3, Lp1/q;->S:Z

    if-eqz v12, :cond_7

    invoke-virtual {v3, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_7
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v3, v8, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v3, Lp1/q;->S:Z

    if-nez v6, :cond_8

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v6, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_9

    :cond_8
    invoke-static {v5, v3, v5, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    invoke-static {v3, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, Ll0/m;->c:Ll0/g;

    const/4 v5, 0x0

    invoke-static {v4, v1, v3, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v5, v3, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    move-object/from16 v12, v17

    invoke-static {v3, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v3}, Lp1/q;->i0()V

    move-object/from16 v17, v14

    iget-boolean v14, v3, Lp1/q;->S:Z

    if-eqz v14, :cond_a

    invoke-virtual {v3, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v3, v8, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v3, Lp1/q;->S:Z

    if-nez v4, :cond_b

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_c

    :cond_b
    invoke-static {v5, v3, v5, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    invoke-static {v3, v0, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v4, 0x3f800000    # 1.0f

    float-to-double v5, v4

    const-wide/16 v18, 0x0

    cmpl-double v5, v5, v18

    if-lez v5, :cond_d

    goto :goto_8

    :cond_d
    const-string v5, "invalid weight; must be greater than zero"

    invoke-static {v5}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_8
    new-instance v5, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v5, v4, v7}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/4 v6, 0x1

    const/4 v14, 0x0

    invoke-static {v14, v3, v6}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v11

    const/16 v6, 0xe

    invoke-static {v5, v11, v6}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const v11, -0x1896950d

    invoke-virtual {v3, v11}, Lp1/q;->f0(I)V

    invoke-virtual {v3, v10}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Luj/m;

    invoke-virtual {v3, v14}, Lp1/q;->q(Z)V

    iget v6, v6, Luj/m;->N:F

    invoke-static {v6}, Ll0/m;->i(F)Ll0/k;

    move-result-object v6

    invoke-static {v6, v1, v3, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v10, v3, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v3, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v14, v3, Lp1/q;->S:Z

    if-eqz v14, :cond_e

    invoke-virtual {v3, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_e
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v3, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3, v13, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v3, Lp1/q;->S:Z

    if-nez v6, :cond_f

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v6, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_10

    :cond_f
    invoke-static {v10, v3, v10, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    invoke-static {v3, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Ll0/m;->e:Ll0/h;

    const/4 v10, 0x6

    move-object/from16 v11, v16

    invoke-static {v6, v11, v3, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v10, v3, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v3, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v14, v3, Lp1/q;->S:Z

    if-eqz v14, :cond_11

    invoke-virtual {v3, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_11
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v3, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3, v13, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v3, Lp1/q;->S:Z

    if-nez v6, :cond_12

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_13

    :cond_12
    invoke-static {v10, v3, v10, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    invoke-static {v3, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v5, 0x46

    const/4 v14, 0x0

    invoke-virtual {v2, v0, v5, v3, v14}, Lsj/l;->d(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    const/4 v6, 0x1

    invoke-virtual {v3, v6}, Lp1/q;->q(Z)V

    const v0, -0x4a0b8f76

    invoke-virtual {v3, v0}, Lp1/q;->f0(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/amplitude/android/engagement/types/NudgeStep;->getContent()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_14
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_15

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    instance-of v8, v6, Lcom/amplitude/android/engagement/types/MarkdownBlock;

    if-eqz v8, :cond_14

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_15
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_17

    :cond_16
    const/16 v5, 0x40

    const/4 v6, 0x1

    const/4 v8, 0x0

    goto/16 :goto_10

    :cond_17
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_16

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/amplitude/android/engagement/types/MarkdownBlock;

    invoke-virtual {v5}, Lcom/amplitude/android/engagement/types/MarkdownBlock;->getMeta()Lcom/amplitude/android/engagement/types/MarkdownMeta;

    move-result-object v5

    invoke-virtual {v5}, Lcom/amplitude/android/engagement/types/MarkdownMeta;->getValue()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_18

    invoke-static {v4, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v4, Ll0/m;->e:Ll0/h;

    move-object/from16 v11, v16

    const/4 v14, 0x6

    invoke-static {v4, v11, v3, v14}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v5, v3, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v3, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v9, v3, Lp1/q;->S:Z

    if-eqz v9, :cond_19

    invoke-virtual {v3, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_19
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_c
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v3, v8, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v3, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v6, v3, Lp1/q;->S:Z

    if-nez v6, :cond_1a

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1b

    :cond_1a
    invoke-static {v5, v3, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1b
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v3, v4, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/amplitude/android/engagement/types/NudgeStep;->getFormFactor()Lcom/amplitude/android/engagement/types/FormFactor;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/FormFactor;->getContentAlignment()Lcom/amplitude/android/engagement/types/ContentAlignment;

    move-result-object v0

    if-nez v0, :cond_1c

    const/4 v0, -0x1

    goto :goto_d

    :cond_1c
    sget-object v4, Lsj/a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v4, v0

    :goto_d
    const/4 v4, 0x2

    const/4 v6, 0x1

    if-eq v0, v6, :cond_1d

    if-eq v0, v4, :cond_1f

    const/4 v5, 0x3

    if-eq v0, v5, :cond_1e

    :cond_1d
    :goto_e
    const/16 v5, 0x40

    const/4 v8, 0x0

    goto :goto_f

    :cond_1e
    move v4, v5

    goto :goto_e

    :cond_1f
    const/4 v4, 0x4

    goto :goto_e

    :goto_f
    invoke-virtual {v2, v4, v5, v3, v8}, Lsj/l;->e(IILandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v3, v6}, Lp1/q;->q(Z)V

    :goto_10
    invoke-virtual {v3, v8}, Lp1/q;->q(Z)V

    const/16 v0, 0x8

    invoke-virtual {v2, v3, v0}, Lsj/l;->g(Landroidx/compose/runtime/Composer;I)V

    const/4 v4, 0x0

    invoke-virtual {v2, v4, v5, v3, v6}, Lsj/l;->f(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v3, v6}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lcom/amplitude/android/engagement/types/NudgeStep;->getContent()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_20
    :goto_11
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_21

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    instance-of v8, v6, Lcom/amplitude/android/engagement/types/ButtonBlock;

    if-eqz v8, :cond_20

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_11

    :cond_21
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    iget-object v5, v2, Lsj/l;->a:Lcom/amplitude/android/engagement/types/Nudge;

    invoke-virtual {v5}, Lcom/amplitude/android/engagement/types/Nudge;->getShowStepCounter()Z

    move-result v5

    const v6, 0xae04380

    invoke-virtual {v3, v6}, Lp1/q;->f0(I)V

    if-nez v4, :cond_22

    if-eqz v5, :cond_22

    sget-object v4, Ll0/m;->a:Ll0/e;

    const v11, -0x1896950d

    invoke-virtual {v3, v11}, Lp1/q;->f0(I)V

    sget-object v4, Luj/k;->a:Lp1/u2;

    invoke-virtual {v3, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Luj/m;

    const/4 v14, 0x0

    invoke-virtual {v3, v14}, Lp1/q;->q(Z)V

    iget v4, v4, Luj/m;->N:F

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    goto :goto_12

    :cond_22
    const/4 v14, 0x0

    sget-object v4, Ll0/m;->c:Ll0/g;

    :goto_12
    invoke-virtual {v3, v14}, Lp1/q;->q(Z)V

    invoke-static {v4, v1, v3, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v4, v3, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v3, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v9, v3, Lp1/q;->S:Z

    if-eqz v9, :cond_23

    invoke-virtual {v3, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_13

    :cond_23
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_13
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v3, v8, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v3, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v5, v3, Lp1/q;->S:Z

    if-nez v5, :cond_24

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_25

    :cond_24
    invoke-static {v4, v3, v4, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_25
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v3, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2, v3, v0}, Lsj/l;->a(Landroidx/compose/runtime/Composer;I)V

    const v1, 0xae04478

    invoke-virtual {v3, v1}, Lp1/q;->f0(I)V

    if-nez v7, :cond_26

    invoke-virtual {v2, v3, v0}, Lsj/l;->c(Landroidx/compose/runtime/Composer;I)V

    :cond_26
    const/4 v6, 0x1

    const/4 v14, 0x0

    invoke-static {v3, v14, v6, v6, v6}, Lb9/y;->B(Lp1/q;ZZZZ)V

    invoke-virtual {v3, v6}, Lp1/q;->q(Z)V

    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-nez v8, :cond_27

    return-void

    :cond_27
    new-instance v0, Loj/p;

    move-object/from16 v1, p0

    move/from16 v5, p5

    move/from16 v6, p6

    move v4, v7

    move-object/from16 v3, v17

    invoke-direct/range {v0 .. v6}, Loj/p;-><init>(Lcom/amplitude/android/engagement/types/NudgeStep;Lsj/l;Landroidx/compose/ui/Modifier;ZII)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final b(I)J
    .locals 6

    int-to-long v0, p0

    const/16 p0, 0x20

    shl-long/2addr v0, p0

    const/4 p0, 0x0

    int-to-long v2, p0

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    or-long/2addr v0, v2

    sget p0, Ls2/b;->r:I

    return-wide v0
.end method

.method public static final c(ZLv30/e;Landroidx/compose/runtime/Composer;I)V
    .locals 34

    move/from16 v3, p0

    move-object/from16 v7, p1

    move/from16 v8, p3

    move-object/from16 v9, p2

    check-cast v9, Lp1/q;

    const v0, 0x50e8d5b7

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v8, 0x6

    const/4 v10, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v9, v3}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v10

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v8

    goto :goto_1

    :cond_1
    move v0, v8

    :goto_1
    and-int/lit8 v1, v8, 0x30

    if-nez v1, :cond_3

    invoke-virtual {v9, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit8 v0, v0, 0x13

    const/16 v11, 0x12

    if-ne v0, v11, :cond_6

    invoke-virtual {v9}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v9}, Lp1/q;->X()V

    :cond_5
    move-object v1, v9

    goto/16 :goto_6

    :cond_6
    :goto_3
    if-nez v7, :cond_7

    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_10

    new-instance v1, Lx30/k1;

    const/4 v2, 0x0

    invoke-direct {v1, v3, v7, v8, v2}, Lx30/k1;-><init>(ZLv30/e;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_7
    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v9, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, v7, Lv30/e;->f:Lec3/r1;

    const/4 v12, 0x0

    invoke-static {v1, v9, v12}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v1

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object v13, Lb2/e;->K:Lb2/l;

    const v1, 0x65230429

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_8

    invoke-static {v9}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v1

    :cond_8
    check-cast v1, Lj0/i;

    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    const v4, 0x65231570

    invoke-virtual {v9, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v9, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_9

    if-ne v5, v2, :cond_a

    :cond_9
    new-instance v5, Lwr0/r;

    const/4 v2, 0x6

    invoke-direct {v5, v2, v7, v0}, Lwr0/r;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v9, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v5, Lc93/a;

    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    const/16 v6, 0x18

    sget-object v14, Lb2/t;->w:Lb2/t;

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v0, v14

    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Ll0/m;->a:Ll0/e;

    const/16 v4, 0x30

    invoke-static {v2, v13, v9, v4}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

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

    iget-boolean v13, v9, Lp1/q;->S:Z

    if-eqz v13, :cond_b

    invoke-virtual {v9, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_b
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_4
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v9, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v9, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v5, v9, Lp1/q;->S:Z

    if-nez v5, :cond_c

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_d

    :cond_c
    invoke-static {v4, v9, v4, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v9, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Ld40/r;->g:Lp1/u2;

    invoke-virtual {v9, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld40/h;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_f

    if-ne v1, v2, :cond_e

    const v1, 0x7f080848

    goto :goto_5

    :cond_e
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_f
    const v1, 0x7f080847

    :goto_5
    invoke-static {v1, v9, v12}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v1

    const v4, 0x7f1410e2

    move v5, v10

    invoke-static {v9, v4}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v10

    sget-object v6, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v9, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lg1/c1;

    invoke-virtual {v12}, Lg1/c1;->f()J

    move-result-wide v12

    new-instance v15, Li2/p;

    const/4 v14, 0x5

    invoke-direct {v15, v12, v13, v14}, Li2/p;-><init>(JI)V

    int-to-float v11, v11

    invoke-static {v11, v0}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const/16 v17, 0x180

    const/16 v18, 0x38

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v16, v9

    move-object v9, v1

    invoke-static/range {v9 .. v18}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v1, v16

    invoke-static {v1, v4}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    int-to-float v15, v5

    const/16 v18, 0x0

    const/16 v19, 0xe

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v14, v0

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v1, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/c1;

    invoke-virtual {v0}, Lg1/c1;->f()J

    move-result-wide v11

    sget-object v0, Lg1/i9;->b:Lp1/u2;

    invoke-virtual {v1, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/h9;

    iget-object v0, v0, Lg1/h9;->f:Ll3/v0;

    const/16 v32, 0x0

    const v33, 0xfff8

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v31, 0x30

    move-object/from16 v29, v0

    move-object/from16 v30, v1

    invoke-static/range {v9 .. v33}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    :goto_6
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_10

    new-instance v1, Lx30/k1;

    const/4 v2, 0x1

    invoke-direct {v1, v3, v7, v8, v2}, Lx30/k1;-><init>(ZLv30/e;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method public static final d(Ln6/o;Landroidx/compose/runtime/Composer;I)V
    .locals 4

    check-cast p1, Lp1/q;

    const v0, 0x524845ee

    invoke-virtual {p1, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p1, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, p2

    and-int/lit8 v0, v0, 0x3

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp1/q;->X()V

    goto :goto_3

    :cond_2
    :goto_1
    const v0, 0x6e3c21fe

    invoke-virtual {p1, v0}, Lp1/q;->f0(I)V

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_3

    sget-object v0, Lv6/u;->w:Lv6/u;

    invoke-virtual {p1, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v0, Lj93/g;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lp1/q;->q(Z)V

    check-cast v0, Lc93/a;

    const v2, -0x428332f6

    invoke-virtual {p1, v2}, Lp1/q;->f0(I)V

    const v2, 0x7076b8d0

    invoke-virtual {p1, v2}, Lp1/q;->f0(I)V

    iget-object v2, p1, Lp1/q;->a:Lhb3/a0;

    instance-of v2, v2, Ln6/b;

    if-eqz v2, :cond_6

    invoke-virtual {p1}, Lp1/q;->c0()V

    iget-boolean v2, p1, Lp1/q;->S:Z

    if-eqz v2, :cond_4

    new-instance v2, Lch/c;

    const/4 v3, 0x4

    invoke-direct {v2, v0, v3}, Lch/c;-><init>(Lc93/a;I)V

    invoke-virtual {p1, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Lp1/q;->s0()V

    :goto_2
    new-instance v0, Lv6/q;

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3}, Lv6/q;-><init>(IB)V

    invoke-static {p1, v0, p0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lp1/q;->q(Z)V

    invoke-virtual {p1, v1}, Lp1/q;->q(Z)V

    invoke-virtual {p1, v1}, Lp1/q;->q(Z)V

    :goto_3
    invoke-virtual {p1}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_5

    new-instance v0, Ltx0/a;

    const/16 v1, 0x12

    invoke-direct {v0, p0, p2, v1}, Ltx0/a;-><init>(Ljava/lang/Object;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void

    :cond_6
    invoke-static {}, Lp1/x;->w()V

    const/4 p0, 0x0

    throw p0
.end method

.method public static final e(Lce/k;Lce/j;)Lrv/n;
    .locals 23

    move-object/from16 v0, p0

    iget-object v1, v0, Lce/k;->b:Ljava/util/Map;

    const-string v2, "credential_source"

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Lce/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v4, v0, Lce/k;->a:Ljava/lang/String;

    if-eqz v2, :cond_0

    new-instance v0, Lwd/d;

    invoke-direct {v0, v2}, Lwd/d;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_0
    const-string v2, "role_arn"

    invoke-virtual {v0, v2, v3}, Lce/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v5, "web_identity_token_file"

    invoke-virtual {v0, v5, v3}, Lce/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "role_session_name"

    invoke-virtual {v0, v6, v3}, Lce/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "profile ("

    if-nez v5, :cond_1

    move-object v2, v3

    goto :goto_0

    :cond_1
    if-nez v2, :cond_2

    new-instance v2, Lwd/h;

    const-string v5, ") missing `role_arn`"

    invoke-static {v7, v4, v5}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v5}, Lwd/h;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    new-instance v8, Lwd/i;

    new-instance v9, Lwd/g;

    invoke-direct {v9, v2, v5, v6}, Lwd/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v8, v9}, Lwd/i;-><init>(Lrv/n;)V

    move-object v2, v8

    :goto_0
    const-string v5, ") missing `sso_role_name`"

    const-string v6, "sso_role_name"

    const-string v8, ") missing `sso_account_id`"

    const-string v9, "sso_account_id"

    const-string v10, ") missing `sso_region`"

    const-string v11, ") missing `sso_start_url`"

    const-string v12, "sso_start_url"

    const-string v13, "sso_region"

    if-nez v2, :cond_c

    const-string v2, "sso_session"

    invoke-virtual {v0, v2, v3}, Lce/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    if-nez v15, :cond_3

    move-object v2, v3

    goto/16 :goto_1

    :cond_3
    move-object/from16 v2, p1

    iget-object v2, v2, Lce/j;->a:Ln83/f;

    sget-object v14, Lce/l;->x:Lce/l;

    invoke-virtual {v2, v14}, Ln83/f;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    if-nez v2, :cond_4

    sget-object v2, Lm83/z;->w:Lm83/z;

    :cond_4
    invoke-interface {v2, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lce/k;

    if-nez v2, :cond_5

    new-instance v2, Lwd/h;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v14, ") references non-existing sso_session = `"

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v14, 0x60

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lwd/h;-><init>(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_5
    invoke-virtual {v2, v12, v3}, Lce/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    const-string v14, "sso-session ("

    if-nez v16, :cond_6

    new-instance v2, Lwd/h;

    invoke-static {v14, v15, v11}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-direct {v2, v14}, Lwd/h;-><init>(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_6
    invoke-virtual {v2, v13, v3}, Lce/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    if-nez v17, :cond_7

    new-instance v2, Lwd/h;

    invoke-static {v14, v15, v10}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-direct {v2, v14}, Lwd/h;-><init>(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_7
    invoke-virtual {v0, v9, v3}, Lce/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    if-nez v18, :cond_8

    new-instance v2, Lwd/h;

    invoke-static {v7, v4, v8}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-direct {v2, v14}, Lwd/h;-><init>(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_8
    invoke-virtual {v0, v6, v3}, Lce/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    if-nez v19, :cond_9

    new-instance v2, Lwd/h;

    invoke-static {v7, v4, v5}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-direct {v2, v14}, Lwd/h;-><init>(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_9
    move-object/from16 v20, v5

    invoke-virtual {v2, v13, v3}, Lce/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v21, v8

    invoke-virtual {v0, v13, v3}, Lce/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v3, "` does not match profile ("

    if-eqz v5, :cond_a

    if-eqz v8, :cond_a

    invoke-virtual {v5, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v22

    if-nez v22, :cond_a

    new-instance v2, Lwd/h;

    move-object/from16 v22, v10

    const-string v10, ") sso_region = `"

    invoke-static {v14, v15, v10, v5, v3}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v14, 0x60

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lwd/h;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :cond_a
    move-object/from16 v22, v10

    const/4 v5, 0x0

    invoke-virtual {v2, v12, v5}, Lce/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v12, v5}, Lce/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-eqz v2, :cond_b

    if-eqz v8, :cond_b

    invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_b

    new-instance v5, Lwd/h;

    const-string v10, ") sso_start_url = `"

    invoke-static {v14, v15, v10, v2, v3}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v14, 0x60

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v5, v2}, Lwd/h;-><init>(Ljava/lang/String;)V

    move-object v2, v5

    goto :goto_2

    :cond_b
    new-instance v2, Lwd/i;

    new-instance v14, Lwd/f;

    invoke-direct/range {v14 .. v19}, Lwd/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v2, v14}, Lwd/i;-><init>(Lrv/n;)V

    goto :goto_2

    :cond_c
    :goto_1
    move-object/from16 v20, v5

    move-object/from16 v21, v8

    move-object/from16 v22, v10

    :goto_2
    if-nez v2, :cond_12

    invoke-interface {v1, v9}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    invoke-interface {v1, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    const/4 v2, 0x0

    goto :goto_3

    :cond_d
    const/4 v3, 0x0

    invoke-virtual {v0, v12, v3}, Lce/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_e

    new-instance v2, Lwd/h;

    invoke-static {v7, v4, v11}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v5}, Lwd/h;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :cond_e
    invoke-virtual {v0, v13, v3}, Lce/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_f

    new-instance v2, Lwd/h;

    move-object/from16 v5, v22

    invoke-static {v7, v4, v5}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v5}, Lwd/h;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :cond_f
    invoke-virtual {v0, v9, v3}, Lce/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_10

    new-instance v2, Lwd/h;

    move-object/from16 v5, v21

    invoke-static {v7, v4, v5}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v5}, Lwd/h;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :cond_10
    invoke-virtual {v0, v6, v3}, Lce/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_11

    new-instance v2, Lwd/h;

    move-object/from16 v3, v20

    invoke-static {v7, v4, v3}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lwd/h;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :cond_11
    new-instance v3, Lwd/i;

    new-instance v9, Lwd/b;

    invoke-direct {v9, v2, v5, v8, v6}, Lwd/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v3, v9}, Lwd/i;-><init>(Lrv/n;)V

    move-object v2, v3

    :cond_12
    :goto_3
    if-nez v2, :cond_14

    const-string v2, "login_session"

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Lce/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_13

    const/4 v3, 0x0

    goto :goto_4

    :cond_13
    new-instance v3, Lwd/i;

    new-instance v5, Lwd/c;

    invoke-direct {v5, v2}, Lwd/c;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, v5}, Lwd/i;-><init>(Lrv/n;)V

    :goto_4
    move-object v2, v3

    :cond_14
    if-nez v2, :cond_17

    const-string v2, "credential_process"

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    new-instance v0, Lwd/h;

    const-string v1, ") did not contain credential information"

    invoke-static {v7, v4, v1}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lwd/h;-><init>(Ljava/lang/String;)V

    :goto_5
    move-object v2, v0

    goto :goto_6

    :cond_15
    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Lce/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_16

    new-instance v0, Lwd/h;

    const-string v1, ") missing `credential_process`"

    invoke-static {v7, v4, v1}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lwd/h;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_16
    new-instance v1, Lwd/i;

    new-instance v2, Lwd/e;

    invoke-direct {v2, v0}, Lwd/e;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lwd/i;-><init>(Lrv/n;)V

    move-object v2, v1

    :cond_17
    :goto_6
    instance-of v0, v2, Lwd/i;

    if-eqz v0, :cond_18

    check-cast v2, Lwd/i;

    iget-object v0, v2, Lwd/i;->a:Lrv/n;

    return-object v0

    :cond_18
    instance-of v0, v2, Lwd/h;

    if-eqz v0, :cond_19

    new-instance v0, Laws/sdk/kotlin/runtime/auth/credentials/ProviderConfigurationException;

    check-cast v2, Lwd/h;

    iget-object v1, v2, Lwd/h;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3}, Laws/sdk/kotlin/runtime/auth/credentials/ProviderConfigurationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_19
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;)Lti/f;
    .locals 2

    new-instance v0, Lti/f;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lti/f;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method

.method public static g(Landroid/os/Looper;Ljava/lang/Object;Ljava/lang/String;)Lto/k;
    .locals 1

    const-string v0, "Listener must not be null"

    invoke-static {p1, v0}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "Looper must not be null"

    invoke-static {p0, v0}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "Listener type must not be null"

    invoke-static {p2, v0}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lto/k;

    invoke-direct {v0, p0, p1, p2}, Lto/k;-><init>(Landroid/os/Looper;Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public static h(Ltp/g;Ljava/lang/String;)Lto/j;
    .locals 1

    const-string v0, "Listener must not be null"

    invoke-static {p0, v0}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "Listener type must not be empty"

    invoke-static {p1, v0}, Luo/w;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lto/j;

    invoke-direct {v0, p0, p1}, Lto/j;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final i(FFF)F
    .locals 0

    invoke-static {p0, p1, p2}, Le93/b;->O(FFF)F

    move-result p0

    return p0
.end method

.method public static j(Lorg/json/JSONObject;)Ly00/h;
    .locals 28

    move-object/from16 v0, p0

    const-string v1, "object"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "card"

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    :cond_0
    const-string v1, "exp_month"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    move-object v1, v2

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_0
    const/4 v3, -0x1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_1

    :cond_2
    move v1, v3

    :goto_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x1

    if-lt v1, v5, :cond_4

    const/16 v5, 0xc

    if-le v1, v5, :cond_3

    goto :goto_2

    :cond_3
    move-object v7, v4

    goto :goto_3

    :cond_4
    :goto_2
    move-object v7, v2

    :goto_3
    const-string v1, "exp_year"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_5

    move-object v1, v2

    goto :goto_4

    :cond_5
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_4
    if-eqz v1, :cond_6

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    :cond_6
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    if-gez v3, :cond_7

    move-object v8, v2

    goto :goto_5

    :cond_7
    move-object v8, v1

    :goto_5
    const-string v1, "address_city"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v13

    const-string v1, "address_line1"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v10

    const-string v1, "address_line1_check"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v11

    const-string v1, "address_line2"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v12

    const-string v1, "address_country"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v17

    const-string v1, "address_state"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v14

    const-string v1, "address_zip"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v15

    const-string v1, "address_zip_check"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v16

    const-string v1, "brand"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ly00/g;->b(Ljava/lang/String;)Ly00/i;

    move-result-object v19

    const-string v1, "country"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ls/s;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_8

    move-object/from16 v22, v1

    goto :goto_6

    :cond_8
    move-object/from16 v22, v2

    :goto_6
    const-string v1, "customer"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v24

    invoke-static {v0}, Ls/s;->r(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v23

    const-string v1, "cvc_check"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v25

    sget-object v1, Ly00/j;->x:Lt9/p;

    const-string v2, "funding"

    invoke-static {v2, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Lt9/p;->k(Ljava/lang/String;)Ly00/j;

    move-result-object v20

    const-string v1, "fingerprint"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v21

    const-string v1, "id"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v26

    const-string v1, "last4"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v18

    const-string v1, "name"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v9

    sget-object v1, Ly00/h8;->x:Lt9/c0;

    const-string v2, "tokenization_method"

    invoke-static {v2, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lt9/c0;->m(Ljava/lang/String;)Ly00/h8;

    move-result-object v27

    new-instance v6, Ly00/h;

    invoke-direct/range {v6 .. v27}, Ly00/h;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/i;Ly00/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/h8;)V

    return-object v6
.end method

.method public static k([B)Ljava/security/cert/X509Certificate;
    .locals 3

    if-eqz p0, :cond_2

    array-length v0, p0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "X.509"

    invoke-static {v0}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v0

    new-instance v1, Ljava/io/ByteArrayInputStream;

    invoke-direct {v1, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {v0, v1}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object p0

    instance-of v0, p0, Ljava/security/cert/X509Certificate;

    if-eqz v0, :cond_1

    check-cast p0, Ljava/security/cert/X509Certificate;

    return-object p0

    :cond_1
    new-instance v0, Ljava/security/cert/CertificateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Not a X.509 certificate: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/security/cert/Certificate;->getType()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static l(Lab/l0;)Z
    .locals 8

    invoke-virtual {p0}, Lab/l0;->e()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto/16 :goto_2

    :cond_0
    const/16 v0, 0x3c

    invoke-virtual {p0, v0}, Lab/l0;->j(C)Z

    move-result v2

    const/4 v3, 0x1

    const/16 v4, 0x5c

    if-eqz v2, :cond_3

    :goto_0
    invoke-virtual {p0}, Lab/l0;->e()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-virtual {p0}, Lab/l0;->l()C

    move-result v2

    const/16 v5, 0xa

    if-eq v2, v5, :cond_8

    if-eq v2, v0, :cond_8

    const/16 v5, 0x3e

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    invoke-virtual {p0}, Lab/l0;->i()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lab/l0;->i()V

    invoke-virtual {p0}, Lab/l0;->l()C

    move-result v2

    packed-switch v2, :pswitch_data_0

    packed-switch v2, :pswitch_data_1

    packed-switch v2, :pswitch_data_2

    packed-switch v2, :pswitch_data_3

    goto :goto_0

    :pswitch_0
    invoke-virtual {p0}, Lab/l0;->i()V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lab/l0;->i()V

    return v3

    :cond_3
    move v2, v1

    move v0, v3

    :goto_1
    invoke-virtual {p0}, Lab/l0;->e()Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-virtual {p0}, Lab/l0;->l()C

    move-result v5

    const/16 v6, 0x20

    if-eq v5, v6, :cond_b

    if-eq v5, v4, :cond_a

    const/16 v7, 0x28

    if-eq v5, v7, :cond_7

    const/16 v6, 0x29

    if-eq v5, v6, :cond_5

    invoke-static {v5}, Ljava/lang/Character;->isISOControl(C)Z

    move-result v5

    if-eqz v5, :cond_4

    xor-int/lit8 p0, v0, 0x1

    return p0

    :cond_4
    invoke-virtual {p0}, Lab/l0;->i()V

    goto :goto_3

    :cond_5
    if-nez v2, :cond_6

    goto :goto_4

    :cond_6
    add-int/lit8 v2, v2, -0x1

    invoke-virtual {p0}, Lab/l0;->i()V

    goto :goto_3

    :cond_7
    add-int/lit8 v2, v2, 0x1

    if-le v2, v6, :cond_9

    :cond_8
    :goto_2
    return v1

    :cond_9
    invoke-virtual {p0}, Lab/l0;->i()V

    goto :goto_3

    :cond_a
    invoke-virtual {p0}, Lab/l0;->i()V

    invoke-virtual {p0}, Lab/l0;->l()C

    move-result v0

    packed-switch v0, :pswitch_data_4

    packed-switch v0, :pswitch_data_5

    packed-switch v0, :pswitch_data_6

    packed-switch v0, :pswitch_data_7

    goto :goto_3

    :pswitch_1
    invoke-virtual {p0}, Lab/l0;->i()V

    :goto_3
    move v0, v1

    goto :goto_1

    :cond_b
    xor-int/lit8 p0, v0, 0x1

    return p0

    :cond_c
    :goto_4
    return v3

    :pswitch_data_0
    .packed-switch 0x21
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x3a
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x5b
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x7b
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x21
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x3a
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_6
    .packed-switch 0x5b
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_7
    .packed-switch 0x7b
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public static n(Lab/l0;)Z
    .locals 1

    :goto_0
    invoke-virtual {p0}, Lab/l0;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lab/l0;->l()C

    move-result v0

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lab/l0;->i()V

    goto :goto_0

    :pswitch_0
    invoke-virtual {p0}, Lab/l0;->i()V

    invoke-virtual {p0}, Lab/l0;->l()C

    move-result v0

    packed-switch v0, :pswitch_data_1

    packed-switch v0, :pswitch_data_2

    packed-switch v0, :pswitch_data_3

    packed-switch v0, :pswitch_data_4

    goto :goto_0

    :pswitch_1
    invoke-virtual {p0}, Lab/l0;->i()V

    goto :goto_0

    :pswitch_2
    const/4 p0, 0x0

    return p0

    :cond_0
    :pswitch_3
    const/4 p0, 0x1

    return p0

    nop

    :pswitch_data_0
    .packed-switch 0x5b
        :pswitch_2
        :pswitch_0
        :pswitch_3
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x21
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x3a
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x5b
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x7b
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public static o(Lab/l0;C)Z
    .locals 2

    :goto_0
    invoke-virtual {p0}, Lab/l0;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lab/l0;->l()C

    move-result v0

    const/16 v1, 0x5c

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lab/l0;->i()V

    invoke-virtual {p0}, Lab/l0;->l()C

    move-result v0

    packed-switch v0, :pswitch_data_0

    packed-switch v0, :pswitch_data_1

    packed-switch v0, :pswitch_data_2

    packed-switch v0, :pswitch_data_3

    goto :goto_0

    :pswitch_0
    invoke-virtual {p0}, Lab/l0;->i()V

    goto :goto_0

    :cond_0
    if-ne v0, p1, :cond_1

    goto :goto_1

    :cond_1
    const/16 v1, 0x29

    if-ne p1, v1, :cond_2

    const/16 v1, 0x28

    if-ne v0, v1, :cond_2

    const/4 p0, 0x0

    return p0

    :cond_2
    invoke-virtual {p0}, Lab/l0;->i()V

    goto :goto_0

    :cond_3
    :goto_1
    const/4 p0, 0x1

    return p0

    nop

    :pswitch_data_0
    .packed-switch 0x21
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x3a
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x5b
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x7b
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
