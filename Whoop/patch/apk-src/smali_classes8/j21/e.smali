.class public abstract Lj21/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj21/e$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lj21/i;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "e",
        "(Landroidx/compose/ui/Modifier;Lj21/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "design_release"
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0}, Lj21/e;->h(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lj21/i;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lj21/e;->g(Lj21/i;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lj21/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lj21/e;->f(Lj21/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;Lj21/i;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lj21/e;->i(Landroidx/compose/ui/Modifier;Lj21/i;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Lj21/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lj21/i;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    move/from16 v1, p4

    const-string v0, "state"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p3

    check-cast v14, Lp1/q;

    const v0, -0x46771bc3    # -2.6109992E-4f

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v2, v1, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v1, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-virtual {v14, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v1

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move v3, v1

    :goto_1
    and-int/lit8 v4, v1, 0x30

    if-nez v4, :cond_4

    invoke-virtual {v14, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_2

    :cond_3
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_4
    and-int/lit16 v4, v1, 0x180

    if-nez v4, :cond_6

    invoke-virtual {v14, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    const/16 v4, 0x100

    goto :goto_3

    :cond_5
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v3, v4

    :cond_6
    and-int/lit16 v4, v3, 0x93

    const/16 v7, 0x92

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v4, v7, :cond_7

    move v4, v9

    goto :goto_4

    :cond_7
    move v4, v8

    :goto_4
    and-int/2addr v3, v9

    invoke-virtual {v14, v3, v4}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_9

    if-eqz v0, :cond_8

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_5

    :cond_8
    move-object v0, v2

    :goto_5
    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v2, 0xc

    int-to-float v2, v2

    invoke-static {v2}, Lt0/j;->e(F)Lt0/i;

    move-result-object v2

    sget-object v3, Lx81/d;->a:Lx81/d;

    const/4 v4, 0x6

    invoke-virtual {v3, v14, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->W0()J

    move-result-wide v9

    int-to-float v12, v8

    new-instance v3, Lj21/d;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v5, v6}, Lj21/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v4, -0x492b89e0

    invoke-static {v4, v14, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v13

    const/high16 v15, 0x1b0000

    const/16 v16, 0x18

    const/4 v11, 0x0

    move-object v8, v2

    invoke-static/range {v7 .. v16}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v4, v0

    goto :goto_6

    :cond_9
    invoke-virtual {v14}, Lp1/q;->X()V

    move-object v4, v2

    :goto_6
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_a

    new-instance v0, Lhy0/v;

    const/16 v3, 0x18

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lhy0/v;-><init>(IIILandroidx/compose/ui/Modifier;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final f(Lj21/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 41

    move-object/from16 v0, p0

    move-object/from16 v4, p1

    and-int/lit8 v1, p3, 0x3

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x2

    if-eq v1, v10, :cond_0

    move v1, v8

    goto :goto_0

    :cond_0
    move v1, v9

    :goto_0
    and-int/lit8 v2, p3, 0x1

    move-object/from16 v5, p2

    check-cast v5, Lp1/q;

    invoke-virtual {v5, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_25

    const/high16 v1, 0x3f800000    # 1.0f

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v6, Ll0/m;->c:Ll0/g;

    sget-object v7, Lb2/e;->M:Lb2/k;

    invoke-static {v6, v7, v5, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v11

    iget-wide v12, v5, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v5, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v15, v5, Lp1/q;->S:Z

    if-eqz v15, :cond_1

    invoke-virtual {v5, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_1
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v5, v15, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v5, v11, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    iget-boolean v1, v5, Lp1/q;->S:Z

    if-nez v1, :cond_2

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :cond_2
    invoke-static {v12, v5, v12, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v5, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v3, v10

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float/2addr v3, v8

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    const-string v10, "InsightsItem"

    invoke-static {v12, v10}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v5, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v10, v12

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-nez v10, :cond_4

    if-ne v12, v9, :cond_5

    :cond_4
    new-instance v12, Lj11/q;

    const/4 v10, 0x1

    invoke-direct {v12, v0, v4, v10}, Lj11/q;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v5, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object/from16 v20, v12

    check-cast v20, Lc93/a;

    const/16 v21, 0xf

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const/4 v12, 0x0

    invoke-static {v6, v7, v5, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    move/from16 p3, v3

    iget-wide v3, v5, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v5, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v12, v5, Lp1/q;->S:Z

    if-eqz v12, :cond_6

    invoke-virtual {v5, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_6
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v5, v15, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v11, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v5, Lp1/q;->S:Z

    if-nez v4, :cond_7

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    :cond_7
    invoke-static {v3, v5, v3, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    invoke-static {v5, v1, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v3, 0x1

    int-to-float v4, v3

    mul-float/2addr v4, v8

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    const/4 v10, 0x6

    invoke-static {v3, v7, v5, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    move-object v6, v11

    iget-wide v10, v5, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v5, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v0, v5, Lp1/q;->S:Z

    if-eqz v0, :cond_9

    invoke-virtual {v5, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_9
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_3
    invoke-static {v5, v15, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v5, Lp1/q;->S:Z

    if-nez v0, :cond_a

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    :cond_a
    invoke-static {v10, v5, v10, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    invoke-static {v5, v1, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lj21/i;->e()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_c

    sget-object v4, Lb2/e;->J:Lb2/l;

    :goto_4
    const/4 v10, 0x6

    goto :goto_5

    :cond_c
    sget-object v4, Lb2/e;->K:Lb2/l;

    goto :goto_4

    :goto_5
    invoke-static {v0, v4, v5, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v10, v5, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v5, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v11, v5, Lp1/q;->S:Z

    if-eqz v11, :cond_d

    invoke-virtual {v5, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_d
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v5, v15, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v6, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v5, Lp1/q;->S:Z

    if-nez v0, :cond_e

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    :cond_e
    invoke-static {v4, v5, v4, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    invoke-static {v5, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lj21/i;->n()Lhy0/c2;

    move-result-object v16

    invoke-virtual/range {p0 .. p0}, Lj21/i;->n()Lhy0/c2;

    move-result-object v0

    invoke-virtual {v0}, Lhy0/c2;->o()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-eqz v0, :cond_10

    invoke-static {v0}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v4

    if-eqz v4, :cond_10

    move-object/from16 v17, v0

    goto :goto_7

    :cond_10
    const/16 v17, 0x0

    :goto_7
    invoke-virtual/range {p0 .. p0}, Lj21/i;->h()Lj21/c;

    move-result-object v0

    invoke-virtual {v0}, Lj21/c;->getIconSize-D9Ej5fM()F

    move-result v27

    const-wide/high16 v10, 0x3fe0000000000000L    # 0.5

    double-to-float v0, v10

    mul-float/2addr v0, v8

    new-instance v4, Ll0/l1;

    invoke-direct {v4, v0, v0, v0, v0}, Ll0/l1;-><init>(FFFF)V

    const/16 v32, 0x3bfe

    const/16 v33, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    move-object/from16 v31, v4

    invoke-static/range {v16 .. v33}, Lhy0/c2;->b(Lhy0/c2;Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;Lhy0/s0;ZZIIFLcom/whoop/navigation/e;Ljava/lang/Float;FLl0/k1;ILjava/lang/Object;)Lhy0/c2;

    move-result-object v0

    sget v4, Lcom/whoop/navigation/e;->d:I

    invoke-static {v0, v5, v4}, Lhy0/z1;->c(Lhy0/c2;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual/range {p0 .. p0}, Lj21/i;->k()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Lj21/i;->m()Lb91/c;

    move-result-object v0

    if-eqz v0, :cond_11

    sget-object v4, Lb91/c;->Companion:Lb91/c$a;

    invoke-virtual {v4, v0}, Lb91/c$a;->a(Lb91/c;)Lb91/a;

    move-result-object v0

    goto :goto_8

    :cond_11
    const/4 v0, 0x0

    :goto_8
    if-nez v0, :cond_12

    const v0, 0x38dd28e8

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    const/4 v10, 0x6

    invoke-virtual {v0, v5, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->a()Lb91/a;

    move-result-object v0

    const/4 v12, 0x0

    :goto_9
    invoke-virtual {v5, v12}, Lp1/q;->q(Z)V

    move-object/from16 v31, v0

    goto :goto_a

    :cond_12
    const/4 v12, 0x0

    const v4, 0x38dd1e21

    invoke-virtual {v5, v4}, Lp1/q;->e0(I)V

    goto :goto_9

    :goto_a
    invoke-virtual/range {p0 .. p0}, Lj21/i;->l()Ly81/f;

    move-result-object v0

    if-nez v0, :cond_13

    const v0, -0x1d372918

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v12}, Lp1/q;->q(Z)V

    const/4 v0, 0x0

    goto :goto_b

    :cond_13
    const v4, 0x38dd3039

    invoke-virtual {v5, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v5, v12}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v3

    invoke-static {v5, v12, v3, v4}, Ldc/b;->h(Lp1/q;ZJ)Li2/x;

    move-result-object v0

    :goto_b
    if-nez v0, :cond_14

    const v0, 0x38dd3550

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    const/4 v3, 0x6

    invoke-static {v0, v5, v3, v12}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v16

    :goto_c
    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_d

    :cond_14
    const v3, 0x38dd2e2b

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v12}, Lp1/q;->q(Z)V

    iget-wide v3, v0, Li2/x;->a:J

    move-wide/from16 v16, v3

    goto :goto_c

    :goto_d
    float-to-double v3, v0

    const-wide/16 v18, 0x0

    cmpl-double v3, v3, v18

    if-lez v3, :cond_15

    goto :goto_e

    :cond_15
    const-string v3, "invalid weight; must be greater than zero"

    invoke-static {v3}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_e
    new-instance v3, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v4, 0x1

    invoke-direct {v3, v0, v4}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const-string v4, "InsightsItem_Title"

    invoke-static {v3, v4}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    const/16 v35, 0x0

    const v36, 0x2fff8

    move-object v4, v14

    move-object v3, v15

    move-wide/from16 v39, v16

    move-object/from16 v17, v13

    move-wide/from16 v13, v39

    const-wide/16 v15, 0x0

    move-object/from16 v18, v17

    const/16 v17, 0x0

    move-object/from16 v19, v18

    const/16 v18, 0x0

    move-object/from16 v20, v19

    const/16 v19, 0x0

    move-object/from16 v22, v20

    const-wide/16 v20, 0x0

    move-object/from16 v23, v22

    const/16 v22, 0x0

    move-object/from16 v24, v23

    const/16 v23, 0x0

    move-object/from16 v26, v24

    const-wide/16 v24, 0x0

    move-object/from16 v27, v26

    const/16 v26, 0x0

    move-object/from16 v28, v27

    const/16 v27, 0x0

    move-object/from16 v29, v28

    const/16 v28, 0x0

    move-object/from16 v30, v29

    const/16 v29, 0x0

    move-object/from16 v32, v30

    const/16 v30, 0x0

    move-object/from16 v33, v32

    const/16 v32, 0x0

    const/16 v34, 0x0

    move-object/from16 v39, v33

    move-object/from16 v33, v5

    move-object/from16 v5, v39

    invoke-static/range {v11 .. v36}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v33

    invoke-virtual/range {p0 .. p0}, Lj21/i;->i()Lgz0/m0;

    move-result-object v12

    if-nez v12, :cond_16

    const v12, -0x1d32aca4

    invoke-virtual {v11, v12}, Lp1/q;->e0(I)V

    const/4 v12, 0x0

    invoke-virtual {v11, v12}, Lp1/q;->q(Z)V

    move-object/from16 v20, v2

    move/from16 v2, p3

    :goto_f
    const/4 v12, 0x1

    goto :goto_10

    :cond_16
    const v13, -0x1d32aca3

    const/4 v14, 0x6

    invoke-static {v11, v13, v12, v11, v14}, Lih0/d0;->s(Lp1/q;ILgz0/m0;Lp1/q;I)Lo2/e;

    move-result-object v17

    sget-object v12, Lx81/d;->a:Lx81/d;

    invoke-virtual {v12, v11, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->b1()J

    move-result-wide v18

    const/4 v15, 0x0

    const/16 v16, 0xe

    const/4 v13, 0x0

    const/4 v14, 0x0

    move/from16 v12, p3

    move-object/from16 v33, v11

    move-object v11, v2

    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object/from16 v20, v11

    const/16 v11, 0x10

    int-to-float v11, v11

    invoke-static {v11, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    move-object/from16 v11, v17

    const/16 v17, 0x1b0

    move-wide/from16 v14, v18

    const/16 v18, 0x0

    move v2, v12

    const/4 v12, 0x0

    move-object/from16 v16, v33

    invoke-static/range {v11 .. v18}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object/from16 v11, v16

    const/4 v12, 0x0

    invoke-virtual {v11, v12}, Lp1/q;->q(Z)V

    goto :goto_f

    :goto_10
    invoke-virtual {v11, v12}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lj21/i;->j()Lj21/j;

    move-result-object v13

    sget-object v14, Lj21/e$a;->a:[I

    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    move-result v13

    aget v13, v14, v13

    if-eq v13, v12, :cond_18

    const/4 v12, 0x2

    if-ne v13, v12, :cond_17

    const-wide/high16 v12, 0x400c000000000000L    # 3.5

    double-to-float v12, v12

    mul-float/2addr v12, v8

    move v8, v12

    const/4 v12, 0x0

    goto :goto_11

    :cond_17
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_18
    const/4 v12, 0x0

    int-to-float v8, v12

    :goto_11
    invoke-virtual/range {p0 .. p0}, Lj21/i;->e()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v14

    if-nez v14, :cond_19

    move-object v10, v13

    goto :goto_12

    :cond_19
    const/4 v10, 0x0

    :goto_12
    if-nez v10, :cond_1a

    const v10, 0x5d32fad1

    invoke-virtual {v11, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v12}, Lp1/q;->q(Z)V

    move/from16 v37, v8

    move-object v8, v11

    move-object/from16 v38, v20

    goto :goto_13

    :cond_1a
    const v12, 0x5d32fad2

    invoke-virtual {v11, v12}, Lp1/q;->e0(I)V

    sget-object v12, Lx81/d;->a:Lx81/d;

    const/4 v14, 0x6

    invoke-virtual {v12, v11, v14}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v13

    invoke-virtual {v13}, Lb91/d;->b()Lb91/a;

    move-result-object v31

    invoke-virtual {v12, v11, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->c1()J

    move-result-wide v17

    const/4 v15, 0x0

    const/16 v16, 0xe

    const/4 v13, 0x0

    const/4 v14, 0x0

    move v12, v8

    move-object/from16 v33, v11

    move-object/from16 v11, v20

    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move-object/from16 v38, v11

    move/from16 v37, v12

    const/16 v35, 0x0

    const v36, 0x2fff8

    const-wide/16 v15, 0x0

    move-wide/from16 v13, v17

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v34, 0x0

    move-object v12, v8

    move-object v11, v10

    invoke-static/range {v11 .. v36}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v33

    const/4 v12, 0x0

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    :goto_13
    invoke-virtual/range {p0 .. p0}, Lj21/i;->b()Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_1b

    const v10, 0x5d38cb2e

    invoke-virtual {v8, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    move-object v11, v8

    move-object/from16 v8, v38

    :goto_14
    const/4 v12, 0x1

    goto :goto_15

    :cond_1b
    const v11, 0x5d38cb2f

    invoke-virtual {v8, v11}, Lp1/q;->e0(I)V

    sget-object v11, Lx81/d;->a:Lx81/d;

    const/4 v14, 0x6

    invoke-virtual {v11, v8, v14}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v12

    invoke-virtual {v12}, Lb91/d;->b()Lb91/a;

    move-result-object v31

    invoke-virtual {v11, v8, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->y()J

    move-result-wide v17

    const/4 v15, 0x0

    const/16 v16, 0xe

    const/4 v13, 0x0

    const/4 v14, 0x0

    move/from16 v12, v37

    move-object/from16 v11, v38

    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v12

    const/16 v35, 0x0

    const v36, 0x2fff8

    const-wide/16 v15, 0x0

    move-wide/from16 v13, v17

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v34, 0x0

    move-object/from16 v33, v8

    move-object v8, v11

    move-object v11, v10

    invoke-static/range {v11 .. v36}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v33

    const/4 v12, 0x0

    invoke-virtual {v11, v12}, Lp1/q;->q(Z)V

    goto :goto_14

    :goto_15
    invoke-virtual {v11, v12}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lj21/i;->c()Lc41/p2;

    move-result-object v10

    if-nez v10, :cond_1d

    invoke-virtual/range {p0 .. p0}, Lj21/i;->a()Lny0/h;

    move-result-object v10

    if-eqz v10, :cond_1c

    goto :goto_16

    :cond_1c
    const/4 v10, 0x0

    goto :goto_17

    :cond_1d
    :goto_16
    const/4 v10, 0x1

    :goto_17
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v9, :cond_1e

    new-instance v12, Liz0/d;

    const/16 v9, 0x10

    invoke-direct {v12, v9}, Liz0/d;-><init>(I)V

    invoke-virtual {v11, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    check-cast v12, Lkotlin/jvm/functions/Function1;

    invoke-static {v8, v10, v12}, Lgb1/d;->b(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static {v2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v10

    const/4 v14, 0x6

    invoke-static {v10, v7, v11, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v12, v11, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v11, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v13, v11, Lp1/q;->S:Z

    if-eqz v13, :cond_1f

    invoke-virtual {v11, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_18

    :cond_1f
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_18
    invoke-static {v11, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v6, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v11, Lp1/q;->S:Z

    if-nez v3, :cond_20

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_21

    :cond_20
    invoke-static {v10, v11, v10, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_21
    invoke-static {v11, v1, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lj21/i;->c()Lc41/p2;

    move-result-object v1

    if-nez v1, :cond_22

    const v1, -0x7055f888

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    const/4 v12, 0x0

    invoke-virtual {v11, v12}, Lp1/q;->q(Z)V

    move v9, v0

    move v0, v2

    goto :goto_19

    :cond_22
    const/4 v12, 0x0

    const v3, -0x7055f887

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    const/4 v6, 0x0

    const/4 v7, 0x6

    move v3, v2

    const/4 v2, 0x0

    move v4, v3

    const/4 v3, 0x0

    move v9, v0

    move v0, v4

    move-object v5, v11

    move-object/from16 v4, p1

    invoke-static/range {v1 .. v7}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v12}, Lp1/q;->q(Z)V

    :goto_19
    invoke-virtual/range {p0 .. p0}, Lj21/i;->a()Lny0/h;

    move-result-object v1

    if-nez v1, :cond_23

    const v1, -0x70523006

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v12}, Lp1/q;->q(Z)V

    :goto_1a
    const/4 v3, 0x1

    goto :goto_1b

    :cond_23
    const v2, -0x70523005

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object/from16 v4, p1

    move-object v5, v11

    invoke-static/range {v1 .. v7}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v12}, Lp1/q;->q(Z)V

    goto :goto_1a

    :goto_1b
    invoke-virtual {v11, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v11, v3}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lj21/i;->g()Lv51/c;

    move-result-object v1

    if-nez v1, :cond_24

    const v0, 0x641b6ce8

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v12}, Lp1/q;->q(Z)V

    :goto_1c
    const/4 v12, 0x1

    goto/16 :goto_1d

    :cond_24
    const v2, 0x641b6ce9

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    const/4 v2, 0x0

    const/4 v12, 0x2

    invoke-static {v8, v0, v2, v12}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lx81/d;->a:Lx81/d;

    const/4 v14, 0x6

    invoke-virtual {v4, v11, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->W0()J

    move-result-wide v18

    const/16 v22, 0x6

    const/16 v23, 0xbe

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v20, 0x0

    move-object/from16 v21, v11

    move-object v11, v3

    invoke-static/range {v11 .. v23}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v11, v21

    invoke-static {v9, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v12, 0x2

    invoke-static {v3, v0, v2, v12}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v14, 0x6

    invoke-virtual {v4, v11, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->q()J

    move-result-wide v3

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    new-instance v3, Ly3/f;

    invoke-direct {v3, v0}, Ly3/f;-><init>(F)V

    const/16 v27, 0x1cff

    const/16 v28, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object v13, v1

    move-object/from16 v23, v3

    move-object/from16 v22, v5

    invoke-static/range {v13 .. v28}, Lv51/c;->b(Lv51/c;Ljava/lang/String;Ljava/lang/String;Lb91/c;Li2/x;Lp3/r;ZLhy0/h1;ZLi2/x;Ly3/f;Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;Ljava/util/List;ILjava/lang/Object;)Lv51/c;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, v2

    move-object v3, v11

    move-object/from16 v2, p1

    invoke-static/range {v0 .. v5}, Lv51/b;->h(Landroidx/compose/ui/Modifier;Lv51/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v12, 0x0

    invoke-virtual {v11, v12}, Lp1/q;->q(Z)V

    goto :goto_1c

    :goto_1d
    invoke-virtual {v11, v12}, Lp1/q;->q(Z)V

    goto :goto_1e

    :cond_25
    move-object v11, v5

    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_1e
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(Lj21/i;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Lj21/i;->f()Lcom/whoop/navigation/e;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance p0, Lj21/b$b;

    invoke-direct {p0, v0}, Lj21/b$b;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance v0, Lj21/b$a;

    invoke-virtual {p0}, Lj21/i;->getId()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lj21/b$a;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 8

    const-string v0, "$this$applyIf"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    int-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float v4, v0, v1

    const/4 v6, 0x0

    const/16 v7, 0xd

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v7}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Landroidx/compose/ui/Modifier;Lj21/i;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lj21/e;->e(Landroidx/compose/ui/Modifier;Lj21/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
