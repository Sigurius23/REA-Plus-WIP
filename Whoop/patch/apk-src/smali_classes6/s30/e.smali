.class public abstract Ls30/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwy/b;


# static fields
.field public static w:Lvp/a;


# direct methods
.method public static final a(Ljava/util/List;Lcom/squareup/wire/q;)Ljava/util/ArrayList;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static final b(Lx30/r1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 7

    const-string v0, "element"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p2

    check-cast v4, Lp1/q;

    const p2, -0x46eff283

    invoke-virtual {v4, p2}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p2, p3

    invoke-virtual {v4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x20

    goto :goto_1

    :cond_1
    const/16 v0, 0x10

    :goto_1
    or-int/2addr p2, v0

    and-int/lit8 p2, p2, 0x13

    const/16 v0, 0x12

    if-ne p2, v0, :cond_3

    invoke-virtual {v4}, Lp1/q;->F()Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v4}, Lp1/q;->X()V

    goto :goto_3

    :cond_3
    :goto_2
    iget-object p2, p0, Lx30/r1;->b:Lzy/c;

    invoke-static {p2, v4}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v1

    const p2, -0x336f59b8

    invoke-virtual {v4, p2}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne p2, v0, :cond_4

    new-instance p2, Lwz/h1;

    const/16 v0, 0x16

    invoke-direct {p2, v0}, Lwz/h1;-><init>(I)V

    invoke-virtual {v4, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast p2, Lkotlin/jvm/functions/Function1;

    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    const/4 v0, 0x1

    invoke-static {p1, v0, p2}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/squareup/wire/n;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V

    :goto_3
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_5

    new-instance v0, Lx30/f1;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, p3, v1}, Lx30/f1;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method public static final c(Lcom/amplitude/android/engagement/types/NudgeStep;Lsj/l;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 18

    move-object/from16 v2, p1

    sget-object v0, Lb2/e;->y:Lb2/m;

    sget-object v1, Lb2/e;->w:Lb2/m;

    sget-object v3, Lb2/e;->M:Lb2/k;

    const-string v4, "step"

    move-object/from16 v5, p0

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p3

    check-cast v4, Lp1/q;

    const v6, 0x4ad34c91    # 6923848.5f

    invoke-virtual {v4, v6}, Lp1/q;->g0(I)Lp1/q;

    const/16 v6, 0x14

    int-to-float v6, v6

    const/4 v7, 0x0

    const/4 v8, 0x1

    move-object/from16 v9, p2

    invoke-static {v9, v7, v6, v8}, Landroidx/compose/foundation/layout/d;->b(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const v10, -0x1896950d

    invoke-virtual {v4, v10}, Lp1/q;->f0(I)V

    sget-object v10, Luj/k;->a:Lp1/u2;

    invoke-virtual {v4, v10}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Luj/m;

    const/4 v11, 0x0

    invoke-virtual {v4, v11}, Lp1/q;->q(Z)V

    iget-wide v12, v10, Luj/m;->w:J

    sget-object v10, Li2/w0;->a:Li2/v0;

    invoke-static {v6, v12, v13, v10}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v10, Ll0/m;->c:Ll0/g;

    invoke-static {v10, v3, v4, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v10

    iget-wide v12, v4, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v4, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v15, v4, Lp1/q;->S:Z

    if-eqz v15, :cond_0

    invoke-virtual {v4, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_0
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v4, v14, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v4, v10, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v13, v4, Lp1/q;->S:Z

    if-nez v13, :cond_1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_2

    :cond_1
    invoke-static {v12, v4, v12, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v4, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v5}, Lcom/amplitude/android/engagement/types/NudgeStep;->getContent()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    instance-of v10, v6, Ljava/util/Collection;

    sget-object v12, Lb2/t;->w:Lb2/t;

    const/high16 v13, 0x3f800000    # 1.0f

    sget-object v14, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    const/4 v15, 0x6

    if-eqz v10, :cond_4

    move-object v10, v6

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_4

    :cond_3
    move-object v10, v14

    goto/16 :goto_3

    :cond_4
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/amplitude/android/engagement/types/ContentBlock;

    instance-of v8, v10, Lcom/amplitude/android/engagement/types/ImageBlock;

    if-nez v8, :cond_6

    instance-of v8, v10, Lcom/amplitude/android/engagement/types/VideoBlock;

    if-eqz v8, :cond_5

    :cond_6
    const v6, 0xabcec3

    invoke-virtual {v4, v6}, Lp1/q;->f0(I)V

    invoke-static {v13, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v1, v11}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    move-object v10, v14

    iget-wide v13, v4, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v4, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v11, v4, Lp1/q;->S:Z

    if-eqz v11, :cond_7

    invoke-virtual {v4, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_7
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_1
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v4, v8, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v4, v1, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v8, v4, Lp1/q;->S:Z

    if-nez v8, :cond_8

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_9

    :cond_8
    invoke-static {v13, v4, v13, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v4, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v1, v15

    const/16 v6, 0xc

    invoke-static {v1, v1, v7, v7, v6}, Lt0/j;->g(FFFFI)Lt0/i;

    move-result-object v1

    invoke-static {v12, v1}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v6, 0x40

    const/4 v11, 0x0

    invoke-virtual {v2, v1, v6, v4, v11}, Lsj/l;->f(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v10, v12, v0}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/high16 v1, 0x41200000    # 10.0f

    invoke-static {v1, v0}, Lb2/a;->a(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v2, v0, v6, v4, v11}, Lsj/l;->b(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v4, v11}, Lp1/q;->q(Z)V

    :goto_2
    const/high16 v8, 0x3f800000    # 1.0f

    goto :goto_5

    :goto_3
    const v6, 0xabd009

    invoke-virtual {v4, v6}, Lp1/q;->f0(I)V

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v1, v11}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v13, v4, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v4, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v8, v4, Lp1/q;->S:Z

    if-eqz v8, :cond_a

    invoke-virtual {v4, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_a
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_4
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v4, v8, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v4, v1, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v8, v4, Lp1/q;->S:Z

    if-nez v8, :cond_b

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v8, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_c

    :cond_b
    invoke-static {v11, v4, v11, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v4, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v10, v12, v0}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v6, 0x40

    const/4 v11, 0x0

    invoke-virtual {v2, v0, v6, v4, v11}, Lsj/l;->b(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v4, v11}, Lp1/q;->q(Z)V

    goto :goto_2

    :goto_5
    invoke-static {v8, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v1, 0x10

    int-to-float v1, v1

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Ll0/m;->c:Ll0/g;

    invoke-static {v1, v3, v4, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v10, v4, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v4, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v11, v4, Lp1/q;->S:Z

    if-eqz v11, :cond_d

    invoke-virtual {v4, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_d
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_6
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v4, v11, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v4, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v13, v4, Lp1/q;->S:Z

    if-nez v13, :cond_e

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_f

    :cond_e
    invoke-static {v3, v4, v3, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v4, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v13, Ll0/m;->a:Ll0/e;

    sget-object v14, Lb2/e;->J:Lb2/l;

    invoke-static {v13, v14, v4, v15}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    move-object/from16 v17, v8

    iget-wide v7, v4, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v4, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v15, v4, Lp1/q;->S:Z

    if-eqz v15, :cond_10

    invoke-virtual {v4, v10}, Lp1/q;->l(Lc93/a;)V

    :goto_7
    move-object/from16 v15, v17

    goto :goto_8

    :cond_10
    invoke-virtual {v4}, Lp1/q;->s0()V

    goto :goto_7

    :goto_8
    invoke-static {v4, v11, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v8, v4, Lp1/q;->S:Z

    if-nez v8, :cond_11

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v8, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_12

    :cond_11
    invoke-static {v7, v4, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    invoke-static {v4, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v0, 0x0

    const/16 v7, 0x40

    const/4 v8, 0x1

    invoke-virtual {v2, v0, v7, v4, v8}, Lsj/l;->d(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v4, v8}, Lp1/q;->q(Z)V

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v7, 0x6

    invoke-static {v13, v14, v4, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v13, v4, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v4, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v15, v4, Lp1/q;->S:Z

    if-eqz v15, :cond_13

    invoke-virtual {v4, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_13
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v4, v11, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v1, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v4, Lp1/q;->S:Z

    if-nez v7, :cond_14

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v7, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_15

    :cond_14
    invoke-static {v13, v4, v13, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    invoke-static {v4, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v0, 0x5

    const/16 v7, 0x40

    const/4 v13, 0x0

    invoke-virtual {v2, v0, v7, v4, v13}, Lsj/l;->e(IILandroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    const/16 v7, 0x8

    invoke-virtual {v2, v4, v7}, Lsj/l;->g(Landroidx/compose/runtime/Composer;I)V

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    int-to-float v12, v7

    const/4 v13, 0x0

    invoke-static {v8, v13, v12, v0}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v0, Ll0/m;->g:Ll0/h;

    sget-object v12, Lb2/e;->K:Lb2/l;

    const/16 v13, 0x36

    invoke-static {v0, v12, v4, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v12, v4, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v4, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v14, v4, Lp1/q;->S:Z

    if-eqz v14, :cond_16

    invoke-virtual {v4, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_16
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v4, v11, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v1, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v4, Lp1/q;->S:Z

    if-nez v0, :cond_17

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    :cond_17
    invoke-static {v12, v4, v12, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_18
    invoke-static {v4, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2, v4, v7}, Lsj/l;->a(Landroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v2, v4, v7}, Lsj/l;->c(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-nez v6, :cond_19

    return-void

    :cond_19
    new-instance v0, Lsj/d;

    const/4 v5, 0x1

    move-object/from16 v1, p0

    move/from16 v4, p4

    move-object v3, v9

    invoke-direct/range {v0 .. v5}, Lsj/d;-><init>(Lcom/amplitude/android/engagement/types/NudgeStep;Lsj/l;Landroidx/compose/ui/Modifier;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final d(Lu2/b;Ls83/a;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p1, Ly0/a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ly0/a;

    iget v1, v0, Ly0/a;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ly0/a;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Ly0/a;

    invoke-direct {v0, p1}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p1, v0, Ly0/a;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ly0/a;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Ly0/a;->w:Lu2/b;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_3
    :goto_1
    iput-object p0, v0, Ly0/a;->w:Lu2/b;

    iput v3, v0, Ly0/a;->y:I

    invoke-static {p0, v0}, Lu2/b;->H(Lu2/b;Ls83/a;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    :goto_2
    check-cast p1, Lu2/k;

    iget v2, p1, Lu2/k;->d:I

    iget-object p1, p1, Lu2/k;->a:Ljava/lang/Object;

    and-int/lit8 v2, v2, 0x42

    if-eqz v2, :cond_3

    move-object v2, p1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v4, 0x0

    move v5, v4

    :goto_3
    if-ge v5, v2, :cond_6

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lu2/r;

    invoke-static {v6}, Lu2/d0;->b(Lu2/r;)Z

    move-result v6

    if-nez v6, :cond_5

    goto :goto_1

    :cond_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_6
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static e([B)I
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    array-length v0, p0

    add-int/lit8 v1, v0, 0x1

    :goto_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_1

    mul-int/lit16 v1, v1, 0x101

    aget-byte v2, p0, v0

    xor-int/2addr v1, v2

    goto :goto_0

    :cond_1
    return v1
.end method

.method public static f([Ljava/lang/Object;Lcom/google/android/gms/common/c;)Z
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    array-length v1, p0

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    move v2, v0

    :goto_1
    if-ge v2, v1, :cond_2

    aget-object v3, p0, v2

    invoke-static {v3, p1}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    if-ltz v2, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    return v0
.end method

.method public static final varargs g([Ljava/lang/Object;)I
    .locals 1

    array-length v0, p0

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static final h(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 2

    instance-of v0, p1, Ltx/g;

    const/4 v1, 0x0

    if-nez v0, :cond_3

    sget-object v0, Lm83/y;->w:Lm83/y;

    if-eq p1, v0, :cond_2

    instance-of v0, p1, Ltx/d;

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Ltx/d;

    invoke-direct {v0, p1}, Ltx/d;-><init>(Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lm83/a;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    return-object v0

    :cond_1
    const-string p1, ".contains(null)"

    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return-object p1

    :cond_3
    invoke-static {p1}, Lr;->t(Ljava/lang/Object;)V

    throw v1
.end method

.method public static final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    if-nez p0, :cond_0

    return-object p0

    :cond_0
    instance-of v0, p0, Ljava/lang/Boolean;

    if-eqz v0, :cond_1

    return-object p0

    :cond_1
    instance-of v0, p0, Ljava/lang/Double;

    if-eqz v0, :cond_2

    return-object p0

    :cond_2
    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_3

    return-object p0

    :cond_3
    instance-of v0, p0, Ljava/util/List;

    if-eqz v0, :cond_5

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p0, Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ls30/e;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    const-string v0, "unmodifiableList(this)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Ljava/lang/Object;

    return-object p0

    :cond_5
    instance-of v0, p0, Ljava/util/Map;

    if-eqz v0, :cond_7

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast p0, Ljava/util/Map;

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2}, Ls30/e;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1}, Ls30/e;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_6
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    const-string v0, "unmodifiableMap(this)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Ljava/lang/Object;

    return-object p0

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "struct value custom must be a JSON type (null, Boolean, Double, String, List, or Map) but was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final j(Lw3/q;Lw3/q;F)Lw3/q;
    .locals 5

    new-instance v0, Lw3/q;

    iget-wide v1, p0, Lw3/q;->a:J

    iget-wide v3, p1, Lw3/q;->a:J

    invoke-static {v1, v2, v3, v4, p2}, Ll3/n0;->c(JJF)J

    move-result-wide v1

    iget-wide v3, p0, Lw3/q;->b:J

    iget-wide p0, p1, Lw3/q;->b:J

    invoke-static {v3, v4, p0, p1, p2}, Ll3/n0;->c(JJF)J

    move-result-wide p0

    invoke-direct {v0, v1, v2, p0, p1}, Lw3/q;-><init>(JJ)V

    return-object v0
.end method

.method public static k(Lcom/google/android/gms/maps/model/CameraPosition;)Lup/a;
    .locals 3

    const-string v0, "cameraPosition must not be null"

    invoke-static {p0, v0}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Lup/a;

    invoke-static {}, Ls30/e;->q()Lvp/a;

    move-result-object v1

    invoke-virtual {v1}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v2

    invoke-static {v2, p0}, Lop/h;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p0, 0x7

    invoke-virtual {v1, v2, p0}, Lip/a;->j0(Landroid/os/Parcel;I)Landroid/os/Parcel;

    move-result-object p0

    invoke-virtual {p0}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v1

    invoke-static {v1}, Lcp/b;->X(Landroid/os/IBinder;)Lcp/a;

    move-result-object v1

    invoke-virtual {p0}, Landroid/os/Parcel;->recycle()V

    invoke-direct {v0, v1}, Lup/a;-><init>(Lcp/a;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static l(Lcom/google/android/gms/maps/model/LatLngBounds;I)Lup/a;
    .locals 3

    const-string v0, "bounds must not be null"

    invoke-static {p0, v0}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Lup/a;

    invoke-static {}, Ls30/e;->q()Lvp/a;

    move-result-object v1

    invoke-virtual {v1}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v2

    invoke-static {v2, p0}, Lop/h;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-virtual {v2, p1}, Landroid/os/Parcel;->writeInt(I)V

    const/16 p0, 0xa

    invoke-virtual {v1, v2, p0}, Lip/a;->j0(Landroid/os/Parcel;I)Landroid/os/Parcel;

    move-result-object p0

    invoke-virtual {p0}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcp/b;->X(Landroid/os/IBinder;)Lcp/a;

    move-result-object p1

    invoke-virtual {p0}, Landroid/os/Parcel;->recycle()V

    invoke-direct {v0, p1}, Lup/a;-><init>(Lcp/a;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance p1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static n(Lcom/google/android/gms/maps/model/LatLng;F)Lup/a;
    .locals 3

    const-string v0, "latLng must not be null"

    invoke-static {p0, v0}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Lup/a;

    invoke-static {}, Ls30/e;->q()Lvp/a;

    move-result-object v1

    invoke-virtual {v1}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v2

    invoke-static {v2, p0}, Lop/h;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-virtual {v2, p1}, Landroid/os/Parcel;->writeFloat(F)V

    const/16 p0, 0x9

    invoke-virtual {v1, v2, p0}, Lip/a;->j0(Landroid/os/Parcel;I)Landroid/os/Parcel;

    move-result-object p0

    invoke-virtual {p0}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcp/b;->X(Landroid/os/IBinder;)Lcp/a;

    move-result-object p1

    invoke-virtual {p0}, Landroid/os/Parcel;->recycle()V

    invoke-direct {v0, p1}, Lup/a;-><init>(Lcp/a;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance p1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static final o(Lio/seon/androidsdk/service/e1;Ljava/nio/ByteBuffer;I)V
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/seon/androidsdk/service/e1;->g:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    iget v1, p0, Lio/seon/androidsdk/service/e1;->b:I

    iget v2, p0, Lio/seon/androidsdk/service/e1;->c:I

    sub-int/2addr v2, v1

    if-lt v2, p2, :cond_0

    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v2

    :try_start_0
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v3

    add-int/2addr v3, p2

    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    invoke-static {v0, p1, v1}, Le93/b;->w(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    invoke-virtual {p0, p2}, Lio/seon/androidsdk/service/e1;->d(I)V

    return-void

    :catchall_0
    move-exception p0

    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    throw p0

    :cond_0
    new-instance p0, Ljava/io/EOFException;

    const-string p1, "Not enough bytes to read a buffer content of size "

    const/16 v0, 0x2e

    invoke-static {p1, p2, v0}, Lr80/c;->o(Ljava/lang/String;IC)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final p(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v0, 0x0

    move v2, v0

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v2, v3, :cond_1

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const-string v4, ",[]{}\\"

    invoke-static {v4, v3, v0}, Lyb3/r;->T(Ljava/lang/CharSequence;CZ)Z

    move-result v4

    if-eqz v4, :cond_0

    const/16 v4, 0x5c

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "StringBuilder(capacity).\u2026builderAction).toString()"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static q()Lvp/a;
    .locals 2

    sget-object v0, Ls30/e;->w:Lvp/a;

    const-string v1, "CameraUpdateFactory is not initialized"

    invoke-static {v0, v1}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
