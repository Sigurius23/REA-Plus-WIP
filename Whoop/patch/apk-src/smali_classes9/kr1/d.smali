.class public abstract Lkr1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a;\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u001a1\u0010\r\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\u000b2\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002H\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lgr1/s;",
        "privacyControls",
        "Lkotlin/Function2;",
        "",
        "",
        "Ll83/a0;",
        "onToggle",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "i",
        "(Lgr1/s;Lc93/m;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "Lgr1/r;",
        "control",
        "e",
        "(Lgr1/r;Lc93/m;Landroidx/compose/runtime/Composer;I)V",
        "integrations_release"
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
.method public static synthetic a(Lgr1/r;Lc93/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lkr1/d;->f(Lgr1/r;Lc93/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lgr1/s;Lc93/m;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lkr1/d;->j(Lgr1/s;Lc93/m;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lgr1/r;Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lkr1/d;->h(Lgr1/r;Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lc93/m;Lgr1/r;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lkr1/d;->g(Lc93/m;Lgr1/r;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lgr1/r;Lc93/m;Landroidx/compose/runtime/Composer;I)V
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgr1/r;",
            "Lc93/m;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v12, p2

    check-cast v12, Lp1/q;

    const v3, -0x2eddbee7

    invoke-virtual {v12, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p3, 0x6

    if-nez v3, :cond_2

    and-int/lit8 v3, p3, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v12, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    :goto_1
    or-int v3, p3, v3

    goto :goto_2

    :cond_2
    move/from16 v3, p3

    :goto_2
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_4

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_3

    :cond_3
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v3, v4

    :cond_4
    and-int/lit8 v4, v3, 0x13

    const/16 v5, 0x12

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v4, v5, :cond_5

    move v4, v7

    goto :goto_4

    :cond_5
    move v4, v6

    :goto_4
    and-int/2addr v3, v7

    invoke-virtual {v12, v3, v4}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_b

    sget-object v3, Lb2/t;->w:Lb2/t;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v8, Lb2/e;->K:Lb2/l;

    sget-object v9, Ll0/m;->a:Ll0/e;

    const/16 v10, 0x30

    invoke-static {v9, v8, v12, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    iget-wide v9, v12, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v12, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v13, v12, Lp1/q;->S:Z

    if-eqz v13, :cond_6

    invoke-virtual {v12, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_5
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v12, v11, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v12, v8, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-nez v10, :cond_7

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_8

    :cond_7
    invoke-static {v9, v12, v9, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v12, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lgr1/r;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v3, v12, v8}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v8, v12, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v10

    invoke-virtual {v8, v12, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v13

    invoke-virtual {v13}, Lb91/d;->a()Lb91/a;

    move-result-object v23

    float-to-double v13, v4

    const-wide/16 v15, 0x0

    cmpl-double v13, v13, v15

    if-lez v13, :cond_9

    move v6, v7

    :cond_9
    if-nez v6, :cond_a

    const-string v6, "invalid weight; must be greater than zero"

    invoke-static {v6}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_a
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v6, v4, v7}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget v4, Lb91/a;->d:I

    shl-int/lit8 v27, v4, 0x12

    const v28, 0x2fff8

    move v5, v7

    move-object v4, v8

    const-wide/16 v7, 0x0

    move v13, v9

    const/4 v9, 0x0

    move v14, v5

    move-wide/from16 v32, v10

    move-object v11, v4

    move-object v4, v6

    move-wide/from16 v5, v32

    const/4 v10, 0x0

    move-object v15, v11

    const/4 v11, 0x0

    move-object/from16 v25, v12

    move/from16 v16, v13

    const-wide/16 v12, 0x0

    move/from16 v17, v14

    const/4 v14, 0x0

    move-object/from16 v18, v15

    const/4 v15, 0x0

    move/from16 v19, v16

    move/from16 v20, v17

    const-wide/16 v16, 0x0

    move-object/from16 v21, v18

    const/16 v18, 0x0

    move/from16 v22, v19

    const/16 v19, 0x0

    move/from16 v24, v20

    const/16 v20, 0x0

    move-object/from16 v26, v21

    const/16 v21, 0x0

    move/from16 v29, v22

    const/16 v22, 0x0

    move/from16 v30, v24

    const/16 v24, 0x0

    move-object/from16 v31, v26

    const/16 v26, 0x0

    move/from16 v0, v29

    move-object/from16 v2, v31

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v25

    invoke-virtual {v2, v12, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->a()J

    move-result-wide v5

    new-instance v0, Lj21/d;

    const/4 v2, 0x6

    move-object/from16 v15, p0

    invoke-direct {v0, v2, v15, v1}, Lj21/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v2, -0x3dcfd252

    invoke-static {v2, v12, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v11

    const/16 v13, 0x6000

    const/16 v14, 0xd

    const-wide/16 v3, 0x0

    const-wide/16 v9, 0x0

    invoke-static/range {v3 .. v14}, Ly81/c;->b(JJJJLc93/m;Landroidx/compose/runtime/Composer;II)V

    const/4 v14, 0x1

    invoke-virtual {v12, v14}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_b
    move-object v15, v0

    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_c

    new-instance v2, Lkl2/f;

    const/4 v3, 0x5

    move/from16 v4, p3

    invoke-direct {v2, v15, v1, v4, v3}, Lkl2/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v2, v0, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final f(Lgr1/r;Lc93/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    and-int/lit8 v0, p3, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p3, v2

    move-object v9, p2

    check-cast v9, Lp1/q;

    invoke-virtual {v9, p3, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {p0}, Lgr1/r;->c()Z

    move-result v2

    invoke-virtual {v9, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v9, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p3

    or-int/2addr p2, p3

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    if-nez p2, :cond_1

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne p3, p2, :cond_2

    :cond_1
    new-instance p3, Ljp1/c;

    const/16 p2, 0xc

    invoke-direct {p3, p2, p1, p0}, Ljp1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v9, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v8, p3

    check-cast v8, Lkotlin/jvm/functions/Function1;

    const/4 v10, 0x0

    const/16 v11, 0x3d

    const/4 v1, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v11}, Lpz0/d;->e(Landroidx/compose/ui/Modifier;ZZJLpz0/e;Li2/t;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_3
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lc93/m;Lgr1/r;Z)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lgr1/r;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lgr1/r;Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lkr1/d;->e(Lgr1/r;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final i(Lgr1/s;Lc93/m;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgr1/s;",
            "Lc93/m;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "privacyControls"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onToggle"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p3

    check-cast v15, Lp1/q;

    const v0, -0x5381ba71

    invoke-virtual {v15, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, v4, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v15, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v15, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v4

    goto :goto_2

    :cond_2
    move v0, v4

    :goto_2
    and-int/lit8 v3, v4, 0x30

    if-nez v3, :cond_4

    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0x20

    goto :goto_3

    :cond_3
    const/16 v3, 0x10

    :goto_3
    or-int/2addr v0, v3

    :cond_4
    and-int/lit8 v3, p5, 0x4

    if-eqz v3, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v5, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v5, v4, 0x180

    if-nez v5, :cond_5

    move-object/from16 v5, p2

    invoke-virtual {v15, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    const/16 v6, 0x100

    goto :goto_4

    :cond_7
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v0, v6

    :goto_5
    and-int/lit16 v6, v0, 0x93

    const/16 v7, 0x92

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eq v6, v7, :cond_8

    move v6, v8

    goto :goto_6

    :cond_8
    move v6, v9

    :goto_6
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v15, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_10

    if-eqz v3, :cond_9

    sget-object v3, Lb2/t;->w:Lb2/t;

    goto :goto_7

    :cond_9
    move-object v3, v5

    :goto_7
    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const-wide/high16 v6, 0x3ff8000000000000L    # 1.5

    double-to-float v6, v6

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v6, v7

    invoke-static {v6}, Ll0/m;->i(F)Ll0/k;

    move-result-object v6

    sget-object v7, Lb2/e;->M:Lb2/k;

    const/4 v10, 0x6

    invoke-static {v6, v7, v15, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v10, v15, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v15, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v12, v15, Lp1/q;->S:Z

    if-eqz v12, :cond_a

    invoke-virtual {v15, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_a
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_8
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v15, v11, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v15, v6, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v10, v15, Lp1/q;->S:Z

    if-nez v10, :cond_b

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_c

    :cond_b
    invoke-static {v7, v15, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v15, v6, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lgr1/s;->b()Lgr1/r;

    move-result-object v5

    if-nez v5, :cond_d

    const v5, -0x726ba754

    invoke-virtual {v15, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v9}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_d
    const v6, -0x726ba753

    invoke-virtual {v15, v6}, Lp1/q;->e0(I)V

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    and-int/lit8 v7, v0, 0x70

    or-int/2addr v6, v7

    invoke-static {v5, v2, v15, v6}, Lkr1/d;->e(Lgr1/r;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v15, v9}, Lp1/q;->q(Z)V

    :goto_9
    invoke-virtual {v1}, Lgr1/s;->a()Lgr1/r;

    move-result-object v5

    if-nez v5, :cond_e

    const v0, -0x7269a7f3

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v9}, Lp1/q;->q(Z)V

    move v11, v8

    goto :goto_b

    :cond_e
    const v6, -0x7269a7f2

    invoke-virtual {v15, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lgr1/s;->b()Lgr1/r;

    move-result-object v6

    if-eqz v6, :cond_f

    const v6, -0x5bcbd724

    invoke-virtual {v15, v6}, Lp1/q;->e0(I)V

    const/16 v16, 0x0

    const/16 v17, 0xff

    move-object v6, v5

    const/4 v5, 0x0

    move-object v7, v6

    const/4 v6, 0x0

    move-object v10, v7

    const/4 v7, 0x0

    move v11, v8

    const/4 v8, 0x0

    move v12, v9

    const/4 v9, 0x0

    move-object v13, v10

    move v14, v11

    const-wide/16 v10, 0x0

    move/from16 v19, v12

    move-object/from16 v18, v13

    const-wide/16 v12, 0x0

    move/from16 v20, v14

    const/4 v14, 0x0

    move/from16 p3, v0

    move-object/from16 v0, v18

    move/from16 v1, v19

    invoke-static/range {v5 .. v17}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v15, v1}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_f
    move/from16 p3, v0

    move-object v0, v5

    move v1, v9

    const v5, -0x5bcb2a76

    invoke-virtual {v15, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v1}, Lp1/q;->q(Z)V

    :goto_a
    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    and-int/lit8 v6, p3, 0x70

    or-int/2addr v5, v6

    invoke-static {v0, v2, v15, v5}, Lkr1/d;->e(Lgr1/r;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v15, v1}, Lp1/q;->q(Z)V

    const/4 v11, 0x1

    :goto_b
    invoke-virtual {v15, v11}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_10
    invoke-virtual {v15}, Lp1/q;->X()V

    move-object v3, v5

    :goto_c
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_11

    new-instance v0, Ljp1/d;

    const/16 v6, 0x14

    move-object/from16 v1, p0

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Ljp1/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final j(Lgr1/s;Lc93/m;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lkr1/d;->i(Lgr1/s;Lc93/m;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
