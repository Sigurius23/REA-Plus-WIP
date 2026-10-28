.class public abstract Lu21/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0017\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lu21/d;",
        "milestoneProgressCardState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "f",
        "(Landroidx/compose/ui/Modifier;Lu21/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lu21/e;",
        "milestone",
        "d",
        "(Lu21/e;Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lu21/c;->g(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lu21/e;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lu21/c;->e(Lu21/e;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lu21/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lu21/c;->h(Landroidx/compose/ui/Modifier;Lu21/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lu21/e;Landroidx/compose/runtime/Composer;I)V
    .locals 22

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v5, p1

    check-cast v5, Lp1/q;

    const v2, 0x7675299f

    invoke-virtual {v5, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    const/4 v3, 0x2

    const/4 v8, 0x4

    if-nez v2, :cond_1

    invoke-virtual {v5, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v8

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int/2addr v2, v1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    and-int/lit8 v4, v2, 0x3

    const/4 v9, 0x1

    const/4 v12, 0x0

    if-eq v4, v3, :cond_2

    move v3, v9

    goto :goto_2

    :cond_2
    move v3, v12

    :goto_2
    and-int/2addr v2, v9

    invoke-virtual {v5, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-virtual {v0}, Lu21/e;->a()Li51/i;

    move-result-object v2

    sget-object v10, Lb2/t;->w:Lb2/t;

    const/16 v11, 0x15

    if-eqz v2, :cond_6

    const v2, 0xc585ea2

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    int-to-float v2, v11

    int-to-float v3, v8

    mul-float/2addr v2, v3

    invoke-static {v2, v10}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->w:Lb2/m;

    invoke-static {v3, v12}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v5, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v8, v5, Lp1/q;->S:Z

    if-eqz v8, :cond_3

    invoke-virtual {v5, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_3
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v5, v7, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v5, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v6, v5, Lp1/q;->S:Z

    if-nez v6, :cond_4

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    :cond_4
    invoke-static {v4, v5, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v5, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lu21/e;->a()Li51/i;

    move-result-object v13

    const/16 v20, 0x1f

    const/16 v21, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1

    invoke-static/range {v13 .. v21}, Li51/i;->b(Li51/i;Li51/h;Li51/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Li51/p;ZILjava/lang/Object;)Li51/i;

    move-result-object v2

    const/4 v7, 0x0

    const/16 v8, 0xe

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v6, v5

    const/4 v5, 0x0

    invoke-static/range {v2 .. v8}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v6, v9}, Lp1/q;->q(Z)V

    invoke-virtual {v6, v12}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_6
    move-object v6, v5

    const v2, 0xc5cfad0

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lu21/e;->b()Lkd1/o;

    move-result-object v2

    const/4 v6, 0x0

    const/4 v7, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v2

    move-object v6, v5

    int-to-float v3, v11

    int-to-float v4, v8

    mul-float/2addr v3, v4

    invoke-static {v3, v10}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v10, 0x1b0

    const/16 v11, 0x78

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v9, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v11}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v9

    invoke-virtual {v6, v12}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_7
    move-object v6, v5

    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_8

    new-instance v3, Lsl0/j2;

    const/4 v4, 0x6

    invoke-direct {v3, v0, v1, v4}, Lsl0/j2;-><init>(Ljava/lang/Object;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final e(Lu21/e;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lu21/c;->d(Lu21/e;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final f(Landroidx/compose/ui/Modifier;Lu21/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 48
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lu21/d;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    const-string v0, "milestoneProgressCardState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v0, 0x18e94a60

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    const/4 v1, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v3, p4, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, p4, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v11, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    move v4, v1

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int v4, p4, v4

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move/from16 v4, p4

    :goto_1
    and-int/lit8 v5, p4, 0x30

    const/16 v6, 0x10

    if-nez v5, :cond_5

    and-int/lit8 v5, p4, 0x40

    if-nez v5, :cond_3

    invoke-virtual {v11, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_2

    :cond_3
    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_2
    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_3

    :cond_4
    move v5, v6

    :goto_3
    or-int/2addr v4, v5

    :cond_5
    and-int/lit8 v5, v4, 0x13

    const/16 v7, 0x12

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v5, v7, :cond_6

    move v5, v9

    goto :goto_4

    :cond_6
    move v5, v8

    :goto_4
    and-int/2addr v4, v9

    invoke-virtual {v11, v4, v5}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_22

    sget-object v12, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_7

    move-object v0, v12

    goto :goto_5

    :cond_7
    move-object v0, v3

    :goto_5
    and-int/lit8 v3, p5, 0x4

    if-eqz v3, :cond_9

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v3, v4, :cond_8

    new-instance v3, Lu0/r;

    const/16 v4, 0x14

    invoke-direct {v3, v4}, Lu0/r;-><init>(I)V

    invoke-virtual {v11, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object/from16 v29, v3

    goto :goto_6

    :cond_9
    move-object/from16 v29, p2

    :goto_6
    invoke-virtual {v2}, Lu21/d;->e()Ly81/e;

    move-result-object v3

    if-nez v3, :cond_a

    const v3, -0xbb65952

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v8}, Lp1/q;->q(Z)V

    const/4 v3, 0x0

    goto :goto_7

    :cond_a
    const v4, -0x7c3fb04d

    invoke-virtual {v11, v4}, Lp1/q;->e0(I)V

    invoke-interface {v3, v11, v8}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v3

    invoke-static {v11, v8, v3, v4}, Ldc/b;->h(Lp1/q;ZJ)Li2/x;

    move-result-object v3

    :goto_7
    const/4 v4, 0x6

    if-nez v3, :cond_b

    const v3, -0x7c3faa35

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    invoke-virtual {v3, v11, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->p0()J

    move-result-wide v13

    invoke-virtual {v11, v8}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_b
    const v5, -0x7c3fb597

    invoke-virtual {v11, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v8}, Lp1/q;->q(Z)V

    iget-wide v13, v3, Li2/x;->a:J

    :goto_8
    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v7, Lx81/d;->a:Lx81/d;

    invoke-virtual {v7, v11, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->a1()J

    move-result-wide v9

    int-to-float v6, v6

    invoke-static {v6}, Lt0/j;->e(F)Lt0/i;

    move-result-object v6

    invoke-static {v5, v9, v10, v6}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    int-to-float v1, v1

    mul-float v6, v1, v1

    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Lb2/e;->w:Lb2/m;

    invoke-static {v6, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    iget-wide v3, v11, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v11, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v15, v11, Lp1/q;->S:Z

    if-eqz v15, :cond_c

    invoke-virtual {v11, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_c
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_9
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v11, v15, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v11, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v8, v11, Lp1/q;->S:Z

    if-nez v8, :cond_d

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v30, v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto :goto_a

    :cond_d
    move-object/from16 v30, v0

    :goto_a
    invoke-static {v3, v11, v3, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v11, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v3, Lb2/e;->K:Lb2/l;

    sget-object v8, Ll0/m;->f:Ll0/h;

    move/from16 v31, v1

    const/16 v1, 0x36

    invoke-static {v8, v3, v11, v1}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v2, v11, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v11, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v8, v11, Lp1/q;->S:Z

    if-eqz v8, :cond_f

    invoke-virtual {v11, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_f
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_b
    invoke-static {v11, v15, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v11, Lp1/q;->S:Z

    if-nez v1, :cond_10

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    :cond_10
    invoke-static {v2, v11, v2, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    invoke-static {v11, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lu21/d;->a()Lu21/e;

    move-result-object v1

    if-nez v1, :cond_12

    const v1, -0x2b3cfc55

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    const/4 v2, 0x0

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    :goto_c
    const/high16 v3, 0x3f800000    # 1.0f

    goto :goto_d

    :cond_12
    const/4 v2, 0x0

    const v3, -0x2b3cfc54

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    invoke-static {v1, v11, v2}, Lu21/c;->d(Lu21/e;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    goto :goto_c

    :goto_d
    float-to-double v1, v3

    const-wide/16 v16, 0x0

    cmpl-double v1, v1, v16

    if-lez v1, :cond_13

    const/4 v1, 0x1

    goto :goto_e

    :cond_13
    const/4 v1, 0x0

    :goto_e
    if-nez v1, :cond_14

    const-string v1, "invalid weight; must be greater than zero"

    invoke-static {v1}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_14
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v2, 0x1

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v1, v3, v2}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v2, Lb2/e;->E:Lb2/m;

    const/4 v3, 0x0

    invoke-static {v2, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    move-wide/from16 v16, v13

    iget-wide v13, v11, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v11, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v8, v11, Lp1/q;->S:Z

    if-eqz v8, :cond_15

    invoke-virtual {v11, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_15
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_f
    invoke-static {v11, v15, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v9, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v11, Lp1/q;->S:Z

    if-nez v2, :cond_16

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_17

    :cond_16
    invoke-static {v3, v11, v3, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    invoke-static {v11, v0, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v2, 0x0

    invoke-static {v6, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v2, v11, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v11, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v6, v11, Lp1/q;->S:Z

    if-eqz v6, :cond_18

    invoke-virtual {v11, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_18
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_10
    invoke-static {v11, v15, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v11, Lp1/q;->S:Z

    if-nez v1, :cond_19

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    :cond_19
    invoke-static {v2, v11, v2, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1a
    invoke-static {v11, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Lb2/e;->N:Lb2/k;

    const/4 v2, 0x1

    int-to-float v3, v2

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v5, v3

    const/4 v6, 0x0

    invoke-static {v12, v6, v5, v2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v13, Ll0/m;->c:Ll0/g;

    const/16 v14, 0x30

    invoke-static {v13, v1, v11, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v13, v11, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v11, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v2, v11, Lp1/q;->S:Z

    if-eqz v2, :cond_1b

    invoke-virtual {v11, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_1b
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_11
    invoke-static {v11, v15, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v9, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v11, Lp1/q;->S:Z

    if-nez v1, :cond_1c

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    :cond_1c
    invoke-static {v13, v11, v13, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1d
    invoke-static {v11, v0, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lu21/d;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v11, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    const/4 v8, 0x6

    invoke-virtual {v7, v11, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v13

    invoke-virtual {v13}, Lb91/d;->c()Lb91/a;

    move-result-object v23

    invoke-virtual {v7, v11, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->y()J

    move-result-wide v18

    mul-float v3, v3, v31

    move-wide/from16 v13, v16

    const/16 v17, 0x7

    move-wide/from16 v20, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v16, v15

    const/4 v15, 0x0

    move-object/from16 v32, v16

    move/from16 v16, v3

    move-object/from16 v3, v32

    move-wide/from16 v32, v20

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v13

    move/from16 v34, v16

    new-instance v15, Lw3/k;

    const/4 v14, 0x3

    invoke-direct {v15, v14}, Lw3/k;-><init>(I)V

    const/16 v27, 0x0

    const v28, 0x2fdf8

    move-object/from16 v16, v7

    move/from16 v17, v8

    const-wide/16 v7, 0x0

    move-object/from16 v20, v9

    const/4 v9, 0x0

    move-object/from16 v21, v10

    const/4 v10, 0x0

    move-object/from16 v25, v11

    const/4 v11, 0x0

    move-object/from16 v22, v4

    move-object/from16 v24, v12

    move-object v4, v13

    const-wide/16 v12, 0x0

    move/from16 v26, v14

    const/4 v14, 0x0

    move-object/from16 v35, v16

    move/from16 v36, v17

    const-wide/16 v16, 0x0

    move/from16 v37, v6

    move-wide/from16 v46, v18

    move/from16 v19, v5

    move-wide/from16 v5, v46

    const/16 v18, 0x0

    move/from16 v38, v19

    const/16 v19, 0x0

    move-object/from16 v39, v20

    const/16 v20, 0x0

    move-object/from16 v40, v21

    const/16 v21, 0x0

    move-object/from16 v41, v22

    const/16 v22, 0x0

    move-object/from16 v42, v24

    const/16 v24, 0x0

    move/from16 v43, v26

    const/16 v26, 0x30

    move-object/from16 p0, v3

    move-object v3, v1

    move-object/from16 v1, v35

    move-object/from16 v35, p0

    move-object/from16 p0, v0

    move/from16 v2, v36

    move-object/from16 v44, v39

    move-object/from16 v45, v41

    move-object/from16 v0, v42

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v25

    invoke-virtual/range {p1 .. p1}, Lu21/d;->f()D

    move-result-wide v3

    const/16 v5, 0x64

    int-to-double v5, v5

    mul-double/2addr v3, v5

    double-to-int v4, v3

    invoke-virtual {v1, v11, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->W0()J

    move-result-wide v7

    sget-object v3, Li2/t;->b:Li2/s;

    new-instance v5, Li2/x;

    move-wide/from16 v13, v32

    invoke-direct {v5, v13, v14}, Li2/x;-><init>(J)V

    new-instance v6, Li2/x;

    invoke-direct {v6, v13, v14}, Li2/x;-><init>(J)V

    filled-new-array {v5, v6}, [Li2/x;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const/16 v6, 0xe

    const/4 v9, 0x0

    invoke-static {v3, v5, v9, v9, v6}, Li2/s;->a(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v6

    const v12, 0x1b0180

    const/4 v13, 0x1

    const/4 v3, 0x0

    const/16 v5, 0x64

    const/4 v9, 0x0

    move/from16 v10, v34

    invoke-static/range {v3 .. v13}, Llz0/f;->b(Landroidx/compose/ui/Modifier;IILi2/t;JZFLandroidx/compose/runtime/Composer;II)V

    const/16 v3, 0x23

    int-to-float v3, v3

    mul-float v3, v3, v31

    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lb2/e;->x:Lb2/m;

    const/4 v5, 0x0

    invoke-static {v4, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v6, v11, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v11, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v8, v11, Lp1/q;->S:Z

    if-eqz v8, :cond_1e

    move-object/from16 v8, v40

    invoke-virtual {v11, v8}, Lp1/q;->l(Lc93/a;)V

    :goto_12
    move-object/from16 v8, v35

    goto :goto_13

    :cond_1e
    invoke-virtual {v11}, Lp1/q;->s0()V

    goto :goto_12

    :goto_13
    invoke-static {v11, v8, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v4, v44

    invoke-static {v11, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v11, Lp1/q;->S:Z

    if-nez v4, :cond_1f

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_20

    :cond_1f
    move-object/from16 v4, v45

    goto :goto_15

    :cond_20
    :goto_14
    move-object/from16 v4, p0

    goto :goto_16

    :goto_15
    invoke-static {v6, v11, v6, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_14

    :goto_16
    invoke-static {v11, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lu21/d;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3, v11, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v11, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->c()Lb91/a;

    move-result-object v23

    invoke-virtual {v1, v11, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->c1()J

    move-result-wide v1

    const/16 v16, 0x0

    const/16 v17, 0xd

    const/4 v13, 0x0

    const/4 v15, 0x0

    move-object v12, v0

    move/from16 v14, v38

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    new-instance v15, Lw3/k;

    const/4 v0, 0x3

    invoke-direct {v15, v0}, Lw3/k;-><init>(I)V

    const/16 v27, 0x0

    const v28, 0x2fdf8

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v25, v11

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x30

    move-wide/from16 v46, v1

    move v2, v5

    move-wide/from16 v5, v46

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v25

    const/4 v0, 0x1

    invoke-static {v11, v0, v0, v0, v0}, Lb9/y;->B(Lp1/q;ZZZZ)V

    invoke-virtual/range {p1 .. p1}, Lu21/d;->c()Lu21/e;

    move-result-object v1

    if-nez v1, :cond_21

    const v1, -0x2b1c4295

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    goto :goto_17

    :cond_21
    const v3, -0x2b1c4294

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    invoke-static {v1, v11, v2}, Lu21/c;->d(Lu21/e;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    :goto_17
    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    move-object/from16 v3, v29

    move-object/from16 v1, v30

    goto :goto_18

    :cond_22
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v1, v3

    move-object/from16 v3, p2

    :goto_18
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_23

    new-instance v0, Lt01/e;

    const/16 v6, 0xb

    move-object/from16 v2, p1

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lt01/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_23
    return-void
.end method

.method private static final g(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Landroidx/compose/ui/Modifier;Lu21/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lu21/c;->f(Landroidx/compose/ui/Modifier;Lu21/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
