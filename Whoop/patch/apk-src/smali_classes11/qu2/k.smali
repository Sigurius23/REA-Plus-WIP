.class public abstract Lqu2/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u001a3\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u001d\u0010\u0008\u001a\u00020\u00032\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0011\u00b2\u0006\u000e\u0010\r\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u000e\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0010\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "",
        "countingDown",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onCountdownComplete",
        "contentBehindCountdown",
        "m",
        "(ZLc93/a;Lc93/m;Landroidx/compose/runtime/Composer;I)V",
        "h",
        "(Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "Landroidx/compose/ui/Modifier;",
        "B",
        "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;",
        "countdownShown",
        "alreadyAnimated",
        "",
        "currentCountdownNumber",
        "weightlifting_release"
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
.method public static final synthetic A(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lqu2/k;->s(Lp1/c1;Z)V

    return-void
.end method

.method private static final B(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 6

    sget-object v0, Li2/t;->b:Li2/s;

    const-wide v1, 0xff66ddffL

    invoke-static {v1, v2}, Li2/w0;->e(J)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    const-wide v1, 0xff0093e7L

    invoke-static {v1, v2}, Li2/w0;->e(J)J

    move-result-wide v1

    new-instance v4, Li2/x;

    invoke-direct {v4, v1, v2}, Li2/x;-><init>(J)V

    const-wide v1, 0xff132c5fL

    invoke-static {v1, v2}, Li2/w0;->e(J)J

    move-result-wide v1

    new-instance v5, Li2/x;

    invoke-direct {v5, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, v4, v5}, [Li2/x;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    const/16 v3, 0xe

    invoke-static {v0, v1, v2, v2, v3}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v0

    invoke-static {v0}, Li91/c;->h(Li2/t;)Li91/a;

    move-result-object v0

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v0}, Li91/c;->c(Landroidx/compose/ui/Modifier;Li91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Lp1/c1;ZLc0/q;)Lc0/l0;
    .locals 0

    invoke-static {p0, p1, p2}, Lqu2/k;->t(Lp1/c1;ZLc0/q;)Lc0/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ZLc93/a;Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lqu2/k;->v(ZLc93/a;Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Lp1/c1;
    .locals 1

    invoke-static {}, Lqu2/k;->n()Lp1/c1;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d()Lp1/c1;
    .locals 1

    invoke-static {}, Lqu2/k;->q()Lp1/c1;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e(Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lqu2/k;->l(Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lc93/a;Lp1/c1;Lc93/m;Lp1/c1;Lc0/o;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lqu2/k;->u(Lc93/a;Lp1/c1;Lc93/m;Lp1/c1;Lc0/o;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g()Lp1/c1;
    .locals 1

    invoke-static {}, Lqu2/k;->i()Lp1/c1;

    move-result-object v0

    return-object v0
.end method

.method public static final h(Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p2

    const-string v2, "onCountdownComplete"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, 0x564e3591

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v1, 0x6

    const/4 v4, 0x2

    const/4 v5, 0x4

    if-nez v3, :cond_1

    invoke-virtual {v2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int/2addr v3, v1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    and-int/lit8 v6, v3, 0x3

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eq v6, v4, :cond_2

    move v4, v7

    goto :goto_2

    :cond_2
    move v4, v8

    :goto_2
    and-int/lit8 v6, v3, 0x1

    invoke-virtual {v2, v6, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_b

    new-array v4, v8, [Ljava/lang/Object;

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v6, v9, :cond_3

    new-instance v6, Lqo1/b;

    const/16 v10, 0x1d

    invoke-direct {v6, v10}, Lqo1/b;-><init>(I)V

    invoke-virtual {v2, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v6, Lc93/a;

    const/16 v10, 0x30

    invoke-static {v4, v6, v2, v10}, Ly1/k;->c([Ljava/lang/Object;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp1/c1;

    invoke-virtual {v2, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    and-int/lit8 v3, v3, 0xe

    if-ne v3, v5, :cond_4

    move v3, v7

    goto :goto_3

    :cond_4
    move v3, v8

    :goto_3
    or-int/2addr v3, v6

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_5

    if-ne v5, v9, :cond_6

    :cond_5
    new-instance v5, Lqu2/k$a;

    const/4 v3, 0x0

    invoke-direct {v5, v0, v4, v3}, Lqu2/k$a;-><init>(Lc93/a;Lp1/c1;Lq83/d;)V

    invoke-virtual {v2, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v5, Lc93/m;

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    invoke-static {v2, v5, v3}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, Lb2/e;->E:Lb2/m;

    sget-object v5, Lb2/t;->w:Lb2/t;

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v5}, Lqu2/k;->B(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v3, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v9, v2, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v2, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v11, v2, Lp1/q;->S:Z

    if-eqz v11, :cond_7

    invoke-virtual {v2, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_7
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_4
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v2, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v2, v3, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v9, v2, Lp1/q;->S:Z

    if-nez v9, :cond_8

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_9

    :cond_8
    invoke-static {v6, v2, v6, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v2, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4}, Lqu2/k;->j(Lp1/c1;)I

    move-result v3

    if-lez v3, :cond_a

    const v3, -0x3e14f342

    invoke-virtual {v2, v3}, Lp1/q;->e0(I)V

    invoke-static {v4}, Lqu2/k;->j(Lp1/c1;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v4, v2, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->u()Lb91/a;

    move-result-object v23

    invoke-virtual {v4, v2, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v5

    sget v4, Lb91/a;->d:I

    shl-int/lit8 v27, v4, 0x12

    const v28, 0x2fffa

    const/4 v4, 0x0

    move v9, v7

    move v10, v8

    const-wide/16 v7, 0x0

    move v11, v9

    const/4 v9, 0x0

    move v12, v10

    const/4 v10, 0x0

    move v13, v11

    const/4 v11, 0x0

    move v15, v12

    move v14, v13

    const-wide/16 v12, 0x0

    move/from16 v16, v14

    const/4 v14, 0x0

    move/from16 v17, v15

    const/4 v15, 0x0

    move/from16 v18, v16

    move/from16 v19, v17

    const-wide/16 v16, 0x0

    move/from16 v20, v18

    const/16 v18, 0x0

    move/from16 v21, v19

    const/16 v19, 0x0

    move/from16 v22, v20

    const/16 v20, 0x0

    move/from16 v24, v21

    const/16 v21, 0x0

    move/from16 v25, v22

    const/16 v22, 0x0

    move/from16 v26, v24

    const/16 v24, 0x0

    move/from16 v29, v26

    const/16 v26, 0x0

    move-object/from16 v25, v2

    move/from16 v2, v29

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v25

    invoke-virtual {v3, v2}, Lp1/q;->q(Z)V

    :goto_5
    const/4 v13, 0x1

    goto :goto_6

    :cond_a
    move-object v3, v2

    move v2, v8

    const v4, -0x3e121609

    invoke-virtual {v3, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v2}, Lp1/q;->q(Z)V

    goto :goto_5

    :goto_6
    invoke-virtual {v3, v13}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_b
    move-object v3, v2

    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_c

    new-instance v3, Lch0/t;

    const/16 v4, 0x13

    invoke-direct {v3, v1, v4, v0}, Lch0/t;-><init>(IILc93/a;)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final i()Lp1/c1;
    .locals 1

    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    return-object v0
.end method

.method private static final j(Lp1/c1;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")I"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private static final k(Lp1/c1;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "I)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final l(Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lqu2/k;->h(Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final m(ZLc93/a;Lc93/m;Landroidx/compose/runtime/Composer;I)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lc93/a;",
            "Lc93/m;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v0, p4

    const-string v4, "onCountdownComplete"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "contentBehindCountdown"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    const v4, -0x1e5a00d5

    invoke-virtual {v12, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v0, 0x6

    const/4 v5, 0x4

    if-nez v4, :cond_1

    invoke-virtual {v12, p0}, Lp1/q;->h(Z)Z

    move-result v4

    if-eqz v4, :cond_0

    move v4, v5

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v0

    goto :goto_1

    :cond_1
    move v4, v0

    :goto_1
    and-int/lit8 v6, v0, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    :cond_3
    and-int/lit16 v6, v0, 0x180

    if-nez v6, :cond_5

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v4, v6

    :cond_5
    and-int/lit16 v6, v4, 0x93

    const/16 v7, 0x92

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v6, v7, :cond_6

    move v6, v9

    goto :goto_4

    :cond_6
    move v6, v8

    :goto_4
    and-int/lit8 v7, v4, 0x1

    invoke-virtual {v12, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_c

    new-array v6, v8, [Ljava/lang/Object;

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-ne v7, v10, :cond_7

    new-instance v7, Lqo1/b;

    const/16 v11, 0x1b

    invoke-direct {v7, v11}, Lqo1/b;-><init>(I)V

    invoke-virtual {v12, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v7, Lc93/a;

    const/16 v11, 0x30

    invoke-static {v6, v7, v12, v11}, Ly1/k;->c([Ljava/lang/Object;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lp1/c1;

    new-array v7, v8, [Ljava/lang/Object;

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v10, :cond_8

    new-instance v13, Lqo1/b;

    const/16 v14, 0x1c

    invoke-direct {v13, v14}, Lqo1/b;-><init>(I)V

    invoke-virtual {v12, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v13, Lc93/a;

    invoke-static {v7, v13, v12, v11}, Ly1/k;->c([Ljava/lang/Object;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lp1/c1;

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v11

    invoke-virtual {v12, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    and-int/lit8 v14, v4, 0xe

    if-ne v14, v5, :cond_9

    move v8, v9

    :cond_9
    or-int v4, v13, v8

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_a

    if-ne v5, v10, :cond_b

    :cond_a
    new-instance v5, Lhh0/e;

    invoke-direct {v5, v7, p0}, Lhh0/e;-><init>(Lp1/c1;Z)V

    invoke-virtual {v12, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object v8, v5

    check-cast v8, Lkotlin/jvm/functions/Function1;

    new-instance v2, Lbm0/f;

    move-object v4, v6

    move-object v6, v7

    const/4 v7, 0x6

    move-object v5, v3

    move-object/from16 v3, p1

    invoke-direct/range {v2 .. v7}, Lbm0/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v3, -0xd71b5d2

    invoke-static {v3, v12, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    const/high16 v3, 0x180000

    or-int v13, v14, v3

    const/16 v14, 0x3a

    const/4 v6, 0x0

    move-object v7, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v5, v11

    move-object v11, v2

    invoke-static/range {v5 .. v14}, Landroidx/compose/animation/a;->b(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lb2/h;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/n;Landroidx/compose/runtime/Composer;II)V

    goto :goto_5

    :cond_c
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_d

    new-instance v0, Lar2/f;

    const/16 v5, 0x1c

    move v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lar2/f;-><init>(ZLjava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final n()Lp1/c1;
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    return-object v0
.end method

.method private static final o(Lp1/c1;)Z
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

.method private static final p(Lp1/c1;Z)V
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

.method private static final q()Lp1/c1;
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    return-object v0
.end method

.method private static final r(Lp1/c1;)Z
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

.method private static final s(Lp1/c1;Z)V
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

.method private static final t(Lp1/c1;ZLc0/q;)Lc0/l0;
    .locals 5

    const-string v0, "$this$AnimatedContent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lc0/l0;

    sget-object v1, Lc0/c1;->a:Lc0/d1;

    invoke-static {p0}, Lqu2/k;->r(Lp1/c1;)Z

    move-result p0

    const/4 v2, 0x0

    if-eqz p0, :cond_0

    sget-object p0, Lc0/e1;->a:Lc0/f1;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    const/4 v3, 0x6

    const/16 v4, 0x1f4

    invoke-static {v4, p0, v2, v3}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object p0

    const/4 v3, 0x4

    const/4 v4, 0x2

    invoke-static {p2, v4, p0, v3}, Lc0/q;->a(Lc0/q;ILd0/e2;I)Lc0/f1;

    move-result-object p0

    :goto_0
    const/16 p2, 0xc

    invoke-direct {v0, v1, p0, v2, p2}, Lc0/l0;-><init>(Lc0/d1;Lc0/f1;Lc0/r1;I)V

    if-eqz p1, :cond_1

    const/high16 p0, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    :goto_1
    iget-object p1, v0, Lc0/l0;->c:Lp1/g1;

    invoke-virtual {p1, p0}, Lp1/g1;->y(F)V

    return-object v0
.end method

.method private static final u(Lc93/a;Lp1/c1;Lc93/m;Lp1/c1;Lc0/o;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 2

    const-string p7, "$this$AnimatedContent"

    invoke-static {p4, p7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p4, 0x0

    sget-object p7, Lp1/l;->a:Lp1/v0;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    const/4 v1, 0x0

    if-eqz p5, :cond_2

    invoke-static {p3}, Lqu2/k;->r(Lp1/c1;)Z

    move-result p5

    if-nez p5, :cond_2

    check-cast p6, Lp1/q;

    const p2, 0x7c6b70df

    invoke-virtual {p6, p2}, Lp1/q;->e0(I)V

    invoke-static {p0, p6, v1}, Lqu2/k;->h(Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p6, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {p6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p0, :cond_0

    if-ne p2, p7, :cond_1

    :cond_0
    new-instance p2, Lqu2/k$b;

    invoke-direct {p2, p1, p4}, Lqu2/k$b;-><init>(Lp1/c1;Lq83/d;)V

    invoke-virtual {p6, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast p2, Lc93/m;

    invoke-static {p6, p2, v0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {p6, v1}, Lp1/q;->q(Z)V

    return-object v0

    :cond_2
    check-cast p6, Lp1/q;

    const p0, 0x7c6dd883

    invoke-virtual {p6, p0}, Lp1/q;->e0(I)V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p2, p6, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p6, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {p6, p3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    or-int/2addr p0, p2

    invoke-virtual {p6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p0, :cond_3

    if-ne p2, p7, :cond_4

    :cond_3
    new-instance p2, Lqu2/k$c;

    invoke-direct {p2, p1, p3, p4}, Lqu2/k$c;-><init>(Lp1/c1;Lp1/c1;Lq83/d;)V

    invoke-virtual {p6, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast p2, Lc93/m;

    invoke-static {p6, p2, v0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {p6, v1}, Lp1/q;->q(Z)V

    return-object v0
.end method

.method private static final v(ZLc93/a;Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lqu2/k;->m(ZLc93/a;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic w(Lp1/c1;)I
    .locals 0

    invoke-static {p0}, Lqu2/k;->j(Lp1/c1;)I

    move-result p0

    return p0
.end method

.method public static final synthetic x(Lp1/c1;I)V
    .locals 0

    invoke-static {p0, p1}, Lqu2/k;->k(Lp1/c1;I)V

    return-void
.end method

.method public static final synthetic y(Lp1/c1;)Z
    .locals 0

    invoke-static {p0}, Lqu2/k;->o(Lp1/c1;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic z(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lqu2/k;->p(Lp1/c1;Z)V

    return-void
.end method
