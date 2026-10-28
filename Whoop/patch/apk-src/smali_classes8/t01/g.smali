.class public abstract Lt01/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a=\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lsy0/e;",
        "state",
        "Lcom/whoop/design/util/TextResource;",
        "contentDescription",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "d",
        "(Lsy0/e;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lsy0/e;Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lt01/g;->f(Lsy0/e;Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lsy0/e;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lt01/g;->g(Lsy0/e;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/String;Lsy0/e;Li3/z;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lt01/g;->e(Ljava/lang/String;Lsy0/e;Li3/z;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lsy0/e;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsy0/e;",
            "Lcom/whoop/design/util/TextResource;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v5, p5

    const-string v0, "state"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentDescription"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p4

    check-cast v11, Lp1/q;

    const v0, 0x710f02eb

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    const/4 v4, 0x2

    const/4 v6, 0x4

    if-nez v0, :cond_2

    and-int/lit8 v0, v5, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    move v0, v6

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    or-int/2addr v0, v5

    goto :goto_2

    :cond_2
    move v0, v5

    :goto_2
    and-int/lit8 v7, v5, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v11, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_3

    :cond_3
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v0, v7

    :cond_4
    and-int/lit16 v7, v5, 0x180

    if-nez v7, :cond_6

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x100

    goto :goto_4

    :cond_5
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v0, v7

    :cond_6
    and-int/lit8 v7, p6, 0x8

    if-eqz v7, :cond_8

    or-int/lit16 v0, v0, 0xc00

    :cond_7
    move-object/from16 v9, p3

    goto :goto_6

    :cond_8
    and-int/lit16 v9, v5, 0xc00

    if-nez v9, :cond_7

    move-object/from16 v9, p3

    invoke-virtual {v11, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_9

    const/16 v10, 0x800

    goto :goto_5

    :cond_9
    const/16 v10, 0x400

    :goto_5
    or-int/2addr v0, v10

    :goto_6
    and-int/lit16 v10, v0, 0x493

    const/16 v12, 0x492

    const/4 v15, 0x0

    if-eq v10, v12, :cond_a

    const/4 v10, 0x1

    goto :goto_7

    :cond_a
    move v10, v15

    :goto_7
    and-int/lit8 v12, v0, 0x1

    invoke-virtual {v11, v12, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_1a

    sget-object v10, Lb2/t;->w:Lb2/t;

    if-eqz v7, :cond_b

    move-object v7, v10

    goto :goto_8

    :cond_b
    move-object v7, v9

    :goto_8
    int-to-float v4, v4

    int-to-float v9, v6

    mul-float/2addr v4, v9

    invoke-static {v4}, Lt0/j;->e(F)Lt0/i;

    move-result-object v4

    shr-int/lit8 v12, v0, 0x3

    and-int/lit8 v12, v12, 0xe

    invoke-static {v2, v11, v12}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    and-int/lit8 v8, v0, 0xe

    if-eq v8, v6, :cond_d

    and-int/lit8 v16, v0, 0x8

    if-eqz v16, :cond_c

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_c

    goto :goto_9

    :cond_c
    move/from16 v16, v15

    goto :goto_a

    :cond_d
    :goto_9
    const/16 v16, 0x1

    :goto_a
    or-int v13, v13, v16

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-nez v13, :cond_e

    if-ne v6, v14, :cond_f

    :cond_e
    new-instance v6, Lsg2/t;

    const/16 v13, 0xd

    invoke-direct {v6, v13, v12, v1}, Lsg2/t;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v11, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-static {v7, v15, v6}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v17

    invoke-virtual {v1}, Lsy0/e;->i()Z

    move-result v18

    new-instance v6, Li3/i;

    const/4 v12, 0x1

    invoke-direct {v6, v12}, Li3/i;-><init>(I)V

    const/4 v12, 0x4

    if-eq v8, v12, :cond_11

    and-int/lit8 v8, v0, 0x8

    if-eqz v8, :cond_10

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_10

    goto :goto_b

    :cond_10
    move v8, v15

    goto :goto_c

    :cond_11
    :goto_b
    const/4 v8, 0x1

    :goto_c
    and-int/lit16 v0, v0, 0x380

    const/16 v12, 0x100

    if-ne v0, v12, :cond_12

    const/4 v0, 0x1

    goto :goto_d

    :cond_12
    move v0, v15

    :goto_d
    or-int/2addr v0, v8

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v0, :cond_13

    if-ne v8, v14, :cond_14

    :cond_13
    new-instance v8, Lsy0/c;

    const/4 v0, 0x1

    invoke-direct {v8, v1, v3, v0}, Lsy0/c;-><init>(Lsy0/e;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    move-object/from16 v21, v8

    check-cast v21, Lkotlin/jvm/functions/Function1;

    const/16 v22, 0xa

    const/16 v19, 0x0

    move-object/from16 v20, v6

    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/selection/d;->b(Landroidx/compose/ui/Modifier;ZZLi3/i;Lkotlin/jvm/functions/Function1;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v6, 0x6

    int-to-float v8, v6

    mul-float/2addr v8, v9

    invoke-static {v8, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, v4}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v1}, Lsy0/e;->i()Z

    move-result v8

    if-eqz v8, :cond_15

    const v4, -0x3e0ba203

    invoke-virtual {v11, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-virtual {v4, v11, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->j()J

    move-result-wide v12

    sget-object v4, Li2/w0;->a:Li2/v0;

    invoke-static {v10, v12, v13, v4}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v11, v15}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_15
    const v8, -0x3e0a2b1b

    invoke-virtual {v11, v8}, Lp1/q;->e0(I)V

    const/4 v12, 0x1

    int-to-float v8, v12

    sget-object v12, Lx81/d;->a:Lx81/d;

    invoke-virtual {v12, v11, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->y()J

    move-result-wide v12

    invoke-static {v10, v8, v12, v13, v4}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v11, v15}, Lp1/q;->q(Z)V

    :goto_e
    invoke-interface {v0, v4}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v4, Lb2/e;->E:Lb2/m;

    invoke-static {v4, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v12, v11, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v11, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v14, v11, Lp1/q;->S:Z

    if-eqz v14, :cond_16

    invoke-virtual {v11, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_16
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_f
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v11, v13, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v11, v4, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v12, v11, Lp1/q;->S:Z

    if-nez v12, :cond_17

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_18

    :cond_17
    invoke-static {v8, v11, v8, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_18
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v11, v4, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lsy0/e;->i()Z

    move-result v0

    if-eqz v0, :cond_19

    const v0, -0x668d79df

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0}, Lx81/d;->d()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/i0;->i()I

    move-result v4

    invoke-static {v4, v11, v15}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v4

    invoke-virtual {v0, v11, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->w()J

    move-result-wide v12

    const/4 v0, 0x3

    int-to-float v0, v0

    mul-float/2addr v0, v9

    invoke-static {v0, v10}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move-wide v9, v12

    const/16 v12, 0x1b0

    const/4 v13, 0x0

    move-object v0, v7

    const/4 v7, 0x0

    move-object v6, v4

    invoke-static/range {v6 .. v13}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v15}, Lp1/q;->q(Z)V

    :goto_10
    const/4 v12, 0x1

    goto :goto_11

    :cond_19
    move-object v0, v7

    const v4, -0x6689a123

    invoke-virtual {v11, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v15}, Lp1/q;->q(Z)V

    goto :goto_10

    :goto_11
    invoke-virtual {v11, v12}, Lp1/q;->q(Z)V

    move-object v4, v0

    goto :goto_12

    :cond_1a
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v4, v9

    :goto_12
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_1b

    new-instance v0, Lsl0/k2;

    const/4 v7, 0x3

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lsl0/k2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_1b
    return-void
.end method

.method private static final e(Ljava/lang/String;Lsy0/e;Li3/z;)Ll83/a0;
    .locals 1

    const-string v0, "$this$semantics"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p2}, Li3/w;->e(Ljava/lang/String;Li3/z;)V

    invoke-virtual {p1}, Lsy0/e;->i()Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Lk3/a;->w:Lk3/a;

    goto :goto_0

    :cond_0
    sget-object p0, Lk3/a;->x:Lk3/a;

    :goto_0
    invoke-static {p2, p0}, Li3/w;->m(Li3/z;Lk3/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lsy0/e;Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Lsy0/e;->g()Lsy0/a;

    move-result-object p0

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p0}, Lsy0/a;->b()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lsy0/a;->a()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p0

    :goto_0
    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method private static final g(Lsy0/e;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Lt01/g;->d(Lsy0/e;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
