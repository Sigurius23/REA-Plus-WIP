.class public abstract Ldh0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldh0/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a?\u0010\n\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u001b\u0010\r\u001a\u00020\u000c*\u00020\u000c2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lnl0/b;",
        "role",
        "Lm91/u;",
        "item",
        "Ly3/f;",
        "topPadding",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "f",
        "(Lnl0/b;Lm91/u;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Landroidx/compose/ui/Modifier;",
        "k",
        "(Landroidx/compose/ui/Modifier;Lnl0/b;)Landroidx/compose/ui/Modifier;",
        "bot_release"
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
.method public static synthetic a(Lnl0/b;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ldh0/c;->i(Lnl0/b;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lm91/q;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ldh0/c;->h(Lm91/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ldh0/c;->g(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lnl0/b;Lm91/u;FLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Ldh0/c;->j(Lnl0/b;Lm91/u;FLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lnl0/b;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ldh0/c;->l(Lnl0/b;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lnl0/b;Lm91/u;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnl0/b;",
            "Lm91/u;",
            "F",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v0, p5

    const-string v3, "role"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "item"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, p4

    check-cast v6, Lp1/q;

    const v3, -0x3dd85c54

    invoke-virtual {v6, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v0, 0x6

    const/4 v4, 0x2

    const/4 v5, 0x4

    if-nez v3, :cond_1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    invoke-virtual {v6, v3}, Lp1/q;->e(I)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int/2addr v3, v0

    goto :goto_1

    :cond_1
    move v3, v0

    :goto_1
    and-int/lit8 v7, v0, 0x30

    const/16 v8, 0x10

    if-nez v7, :cond_3

    invoke-virtual {v6, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    move v7, v8

    :goto_2
    or-int/2addr v3, v7

    :cond_3
    and-int/lit8 v7, p6, 0x4

    if-eqz v7, :cond_5

    or-int/lit16 v3, v3, 0x180

    :cond_4
    move/from16 v9, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v9, v0, 0x180

    if-nez v9, :cond_4

    move/from16 v9, p2

    invoke-virtual {v6, v9}, Lp1/q;->d(F)Z

    move-result v10

    if-eqz v10, :cond_6

    const/16 v10, 0x100

    goto :goto_3

    :cond_6
    const/16 v10, 0x80

    :goto_3
    or-int/2addr v3, v10

    :goto_4
    and-int/lit8 v10, p6, 0x8

    if-eqz v10, :cond_8

    or-int/lit16 v3, v3, 0xc00

    :cond_7
    move-object/from16 v11, p3

    goto :goto_6

    :cond_8
    and-int/lit16 v11, v0, 0xc00

    if-nez v11, :cond_7

    move-object/from16 v11, p3

    invoke-virtual {v6, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_9

    const/16 v12, 0x800

    goto :goto_5

    :cond_9
    const/16 v12, 0x400

    :goto_5
    or-int/2addr v3, v12

    :goto_6
    and-int/lit16 v12, v3, 0x493

    const/16 v13, 0x492

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-eq v12, v13, :cond_a

    move v12, v15

    goto :goto_7

    :cond_a
    move v12, v14

    :goto_7
    and-int/lit8 v13, v3, 0x1

    invoke-virtual {v6, v13, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_19

    const/16 v12, 0x8

    if-eqz v7, :cond_b

    int-to-float v7, v14

    int-to-float v9, v12

    mul-float/2addr v7, v9

    move/from16 v18, v7

    goto :goto_8

    :cond_b
    move/from16 v18, v9

    :goto_8
    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-eqz v10, :cond_d

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v7, :cond_c

    new-instance v9, Ldh0/a;

    const/4 v10, 0x0

    invoke-direct {v9, v10}, Ldh0/a;-><init>(I)V

    invoke-virtual {v6, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v9, Lkotlin/jvm/functions/Function1;

    goto :goto_9

    :cond_d
    move-object v9, v11

    :goto_9
    sget-object v10, Ldh0/c$a;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aget v10, v10, v11

    sget-object v16, Lb2/t;->w:Lb2/t;

    const/4 v11, 0x3

    if-eq v10, v15, :cond_10

    if-eq v10, v4, :cond_f

    if-eq v10, v11, :cond_f

    if-ne v10, v5, :cond_e

    goto :goto_a

    :cond_e
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_f
    :goto_a
    int-to-float v4, v11

    int-to-float v5, v12

    mul-float v17, v4, v5

    const/16 v20, 0x0

    const/16 v21, 0x8

    move/from16 v19, v17

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    :goto_b
    move-object/from16 v5, v16

    goto :goto_c

    :cond_10
    int-to-float v4, v8

    int-to-float v5, v12

    mul-float v17, v4, v5

    const-wide/high16 v12, 0x3ff8000000000000L    # 1.5

    double-to-float v4, v12

    mul-float v19, v4, v5

    const/16 v20, 0x0

    const/16 v21, 0x8

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    goto :goto_b

    :goto_c
    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-interface {v8, v4}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v8, Lb2/e;->w:Lb2/m;

    invoke-static {v8, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v10

    iget-wide v12, v6, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v6, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 p2, v11

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v15, v6, Lp1/q;->S:Z

    if-eqz v15, :cond_11

    invoke-virtual {v6, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_11
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_d
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v6, v15, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v6, v10, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    iget-boolean v14, v6, Lp1/q;->S:Z

    if-nez v14, :cond_12

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    :cond_12
    invoke-static {v12, v6, v12, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v6, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, Lnl0/b;->USER:Lnl0/b;

    if-ne v1, v4, :cond_14

    sget-object v4, Lb2/e;->F:Lb2/m;

    goto :goto_e

    :cond_14
    sget-object v4, Lb2/e;->z:Lb2/m;

    :goto_e
    sget-object v12, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v12, v5, v4}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v8, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    move-object/from16 p3, v9

    iget-wide v8, v6, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v6, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v12, v6, Lp1/q;->S:Z

    if-eqz v12, :cond_15

    invoke-virtual {v6, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_15
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_f
    invoke-static {v6, v15, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v10, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v6, Lp1/q;->S:Z

    if-nez v5, :cond_16

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_17

    :cond_16
    invoke-static {v8, v6, v8, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    invoke-static {v6, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_18

    new-instance v0, Ldh0/a;

    const/4 v4, 0x1

    invoke-direct {v0, v4}, Ldh0/a;-><init>(I)V

    invoke-virtual {v6, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Lm91/m;->g(Lkotlin/jvm/functions/Function1;)Lm91/p;

    move-result-object v0

    new-instance v4, Ldh0/b;

    const/4 v5, 0x0

    invoke-direct {v4, v1, v5}, Ldh0/b;-><init>(Lnl0/b;I)V

    shr-int/lit8 v5, v3, 0x3

    and-int/lit8 v5, v5, 0xe

    sget v7, Lm91/p;->b:I

    shl-int/lit8 v7, v7, 0x3

    or-int/2addr v5, v7

    and-int/lit16 v3, v3, 0x1c00

    or-int v7, v5, v3

    const/4 v8, 0x0

    move-object/from16 v5, p3

    move-object v3, v0

    invoke-static/range {v2 .. v8}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    move-object v4, v5

    move/from16 v3, v18

    goto :goto_10

    :cond_19
    invoke-virtual {v6}, Lp1/q;->X()V

    move v3, v9

    move-object v4, v11

    :goto_10
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_1a

    new-instance v0, Lcom/whoop/profile/view/j;

    const/4 v7, 0x2

    move-object/from16 v2, p1

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lcom/whoop/profile/view/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;FLl83/e;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method

.method private static final g(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lm91/q;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemViewFactory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lsl0/m0;->c()Lm91/p;

    move-result-object v0

    invoke-virtual {p0, v0}, Lm91/q;->b(Lm91/p;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lnl0/b;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    const-string p3, "it"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const p3, -0xe206af0

    invoke-virtual {p2, p3}, Lp1/q;->e0(I)V

    instance-of p1, p1, Loh0/c;

    sget-object p3, Lb2/t;->w:Lb2/t;

    if-eqz p1, :cond_0

    invoke-static {p3, p0}, Ldh0/c;->k(Landroidx/compose/ui/Modifier;Lnl0/b;)Landroidx/compose/ui/Modifier;

    move-result-object p3

    :cond_0
    const/4 p0, 0x0

    invoke-virtual {p2, p0}, Lp1/q;->q(Z)V

    return-object p3
.end method

.method private static final j(Lnl0/b;Lm91/u;FLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Ldh0/c;->f(Lnl0/b;Lm91/u;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Landroidx/compose/ui/Modifier;Lnl0/b;)Landroidx/compose/ui/Modifier;
    .locals 2

    new-instance v0, Ldh0/b;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Ldh0/b;-><init>(Lnl0/b;I)V

    invoke-static {p0, v0}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final l(Lnl0/b;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 3

    const-string p3, "$this$composed"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const p1, -0x1b246980

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    sget-object p1, Ldh0/c$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, p1, p0

    const/4 p1, 0x1

    sget-object p3, Lb2/t;->w:Lb2/t;

    const/4 v0, 0x4

    const/4 v1, 0x3

    const/4 v2, 0x0

    if-eq p0, p1, :cond_2

    const/4 p1, 0x2

    if-eq p0, p1, :cond_1

    if-eq p0, v1, :cond_1

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const p0, 0x1c4ff8cc

    invoke-static {p0, p2, v2}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p0

    throw p0

    :cond_1
    :goto_0
    const p0, 0x1c502708

    invoke-virtual {p2, p0}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v2}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_2
    const p0, 0x1c50163c

    invoke-virtual {p2, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/d;->a:Lx81/d;

    sget p1, Lx81/d;->b:I

    invoke-virtual {p0, p2, p1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->W0()J

    move-result-wide p0

    int-to-float v1, v1

    int-to-float v0, v0

    invoke-static {v1, v0, p3, p0, p1}, Ldc/b;->f(FFLb2/t;J)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const-wide/high16 v0, 0x3ff8000000000000L    # 1.5

    double-to-float p1, v0

    const/16 p3, 0x8

    int-to-float p3, p3

    mul-float/2addr p1, p3

    invoke-static {p1, p0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p3

    invoke-virtual {p2, v2}, Lp1/q;->q(Z)V

    :goto_1
    invoke-virtual {p2, v2}, Lp1/q;->q(Z)V

    return-object p3
.end method
