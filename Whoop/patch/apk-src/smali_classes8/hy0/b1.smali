.class public abstract Lhy0/b1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001aM\u0010\t\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\'\u0010\u000b\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "deleteBackgroundModifier",
        "Le41/k;",
        "swipeState",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onDeleteClicked",
        "content",
        "j",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Le41/k;Lc93/a;Lc93/m;Landroidx/compose/runtime/Composer;II)V",
        "g",
        "(Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Le41/k;Lc93/a;Lc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lhy0/b1;->n(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Le41/k;Lc93/a;Lc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lhy0/b1;->k()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lhy0/b1;->h(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lhy0/b1;->i(Landroidx/compose/ui/Modifier;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lg1/n7;Ly3/c;)Ly3/j;
    .locals 0

    invoke-static {p0, p1}, Lhy0/b1;->m(Lg1/n7;Ly3/c;)Ly3/j;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Le41/k;Le41/k;)Lg1/g9;
    .locals 0

    invoke-static {p0, p1}, Lhy0/b1;->l(Le41/k;Le41/k;)Lg1/g9;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v5, p2

    check-cast v5, Lp1/q;

    const v0, -0x89b1443

    invoke-virtual {v5, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, p3, 0x6

    move v3, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v5, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int v3, p3, v3

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move/from16 v3, p3

    :goto_1
    and-int/lit8 v4, p3, 0x30

    const/16 v6, 0x20

    if-nez v4, :cond_4

    invoke-virtual {v5, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    move v4, v6

    goto :goto_2

    :cond_3
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_4
    and-int/lit8 v4, v3, 0x13

    const/16 v7, 0x12

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v4, v7, :cond_5

    move v4, v9

    goto :goto_3

    :cond_5
    move v4, v8

    :goto_3
    and-int/lit8 v7, v3, 0x1

    invoke-virtual {v5, v7, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_d

    sget-object v10, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_6

    move-object v0, v10

    goto :goto_4

    :cond_6
    move-object v0, v1

    :goto_4
    and-int/lit8 v1, v3, 0x70

    if-ne v1, v6, :cond_7

    move v8, v9

    :cond_7
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v8, :cond_8

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v1, v4, :cond_9

    :cond_8
    new-instance v1, Lhy0/y0;

    const/4 v4, 0x1

    invoke-direct {v1, v2, v4}, Lhy0/y0;-><init>(Lc93/a;I)V

    invoke-virtual {v5, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object v14, v1

    check-cast v14, Lc93/a;

    const/16 v15, 0xf

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-interface {v1, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v4, Lb2/e;->K:Lb2/l;

    sget-object v6, Ll0/m;->e:Ll0/h;

    const/16 v7, 0x36

    invoke-static {v6, v4, v5, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v5, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v10, v5, Lp1/q;->S:Z

    if-eqz v10, :cond_a

    invoke-virtual {v5, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_a
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_5
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v5, v8, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v5, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v7, v5, Lp1/q;->S:Z

    if-nez v7, :cond_b

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_c

    :cond_b
    invoke-static {v6, v5, v6, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v5, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v10, Lny0/o;

    sget-object v11, Lny0/q$b;->f:Lny0/q$b;

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-virtual {v1}, Lx81/d;->d()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/a;->g()I

    move-result v12

    sget-object v13, Ly81/f;->BRAND_WHITE:Ly81/f;

    const/16 v21, 0x3f8

    const/16 v22, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v10 .. v22}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v1, Lgy0/f;->f:I

    invoke-static {v5, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    shl-int/lit8 v3, v3, 0x9

    const v4, 0xe000

    and-int v6, v3, v4

    const/16 v7, 0xc

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v4, v10

    move-object v10, v0

    move-object v0, v4

    move-object/from16 v4, p1

    invoke-static/range {v0 .. v7}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v5, v9}, Lp1/q;->q(Z)V

    move-object v1, v10

    goto :goto_6

    :cond_d
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_e

    new-instance v0, Lau1/d;

    const/4 v5, 0x5

    move-object/from16 v2, p1

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lau1/d;-><init>(Landroidx/compose/ui/Modifier;Lc93/a;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final h(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Landroidx/compose/ui/Modifier;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lhy0/b1;->g(Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final j(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Le41/k;Lc93/a;Lc93/m;Landroidx/compose/runtime/Composer;II)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/ui/Modifier;",
            "Le41/k;",
            "Lc93/a;",
            "Lc93/m;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v6, p6

    move-object/from16 v0, p5

    check-cast v0, Lp1/q;

    const v1, 0x2ae1ca06

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p7, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v3, v6, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v6, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v6

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v6

    :goto_1
    and-int/lit8 v5, v6, 0x30

    if-nez v5, :cond_5

    and-int/lit8 v5, p7, 0x2

    if-nez v5, :cond_3

    move-object/from16 v5, p1

    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    move-object/from16 v5, p1

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    goto :goto_3

    :cond_5
    move-object/from16 v5, p1

    :goto_3
    and-int/lit8 v7, p7, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v4, v4, 0x180

    goto :goto_6

    :cond_6
    and-int/lit16 v8, v6, 0x180

    if-nez v8, :cond_9

    if-nez p2, :cond_7

    const/4 v8, -0x1

    goto :goto_4

    :cond_7
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    :goto_4
    invoke-virtual {v0, v8}, Lp1/q;->e(I)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x100

    goto :goto_5

    :cond_8
    const/16 v8, 0x80

    :goto_5
    or-int/2addr v4, v8

    :cond_9
    :goto_6
    and-int/lit8 v8, p7, 0x8

    if-eqz v8, :cond_b

    or-int/lit16 v4, v4, 0xc00

    :cond_a
    move-object/from16 v9, p3

    goto :goto_8

    :cond_b
    and-int/lit16 v9, v6, 0xc00

    if-nez v9, :cond_a

    move-object/from16 v9, p3

    invoke-virtual {v0, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_c

    const/16 v10, 0x800

    goto :goto_7

    :cond_c
    const/16 v10, 0x400

    :goto_7
    or-int/2addr v4, v10

    :goto_8
    and-int/lit8 v10, p7, 0x10

    if-eqz v10, :cond_e

    or-int/lit16 v4, v4, 0x6000

    :cond_d
    move-object/from16 v11, p4

    goto :goto_a

    :cond_e
    and-int/lit16 v11, v6, 0x6000

    if-nez v11, :cond_d

    move-object/from16 v11, p4

    invoke-virtual {v0, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_f

    const/16 v12, 0x4000

    goto :goto_9

    :cond_f
    const/16 v12, 0x2000

    :goto_9
    or-int/2addr v4, v12

    :goto_a
    and-int/lit16 v12, v4, 0x2493

    const/16 v13, 0x2492

    if-eq v12, v13, :cond_10

    const/4 v12, 0x1

    goto :goto_b

    :cond_10
    const/4 v12, 0x0

    :goto_b
    and-int/lit8 v13, v4, 0x1

    invoke-virtual {v0, v13, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_24

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v12, v6, 0x1

    sget-object v13, Lb2/t;->w:Lb2/t;

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-eqz v12, :cond_13

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v12

    if-eqz v12, :cond_11

    goto :goto_c

    :cond_11
    invoke-virtual {v0}, Lp1/q;->X()V

    and-int/lit8 v1, p7, 0x2

    if-eqz v1, :cond_12

    and-int/lit8 v4, v4, -0x71

    :cond_12
    move-object/from16 v2, p2

    move-object v1, v5

    goto :goto_f

    :cond_13
    :goto_c
    if-eqz v1, :cond_14

    move-object v3, v13

    :cond_14
    and-int/lit8 v1, p7, 0x2

    if-eqz v1, :cond_15

    sget-object v1, Lx81/d;->a:Lx81/d;

    const/4 v5, 0x6

    invoke-virtual {v1, v0, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    move-object/from16 p0, v3

    invoke-virtual {v1}, Ly81/i;->x()J

    move-result-wide v2

    sget-object v1, Li2/w0;->a:Li2/v0;

    invoke-static {v13, v2, v3, v1}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    and-int/lit8 v4, v4, -0x71

    goto :goto_d

    :cond_15
    move-object/from16 p0, v3

    move-object v1, v5

    :goto_d
    if-eqz v7, :cond_16

    sget-object v2, Le41/k;->NOT_EXPANDED:Le41/k;

    goto :goto_e

    :cond_16
    move-object/from16 v2, p2

    :goto_e
    if-eqz v8, :cond_18

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v15, :cond_17

    new-instance v3, Lhb1/l;

    const/16 v5, 0x18

    invoke-direct {v3, v5}, Lhb1/l;-><init>(I)V

    invoke-virtual {v0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v3, Lc93/a;

    move-object v9, v3

    :cond_18
    if-eqz v10, :cond_19

    sget-object v3, Lhy0/b;->a:Lhy0/b;

    invoke-virtual {v3}, Lhy0/b;->d()Lc93/m;

    move-result-object v3

    move-object v11, v3

    :cond_19
    move-object/from16 v3, p0

    :goto_f
    invoke-virtual {v0}, Lp1/q;->r()V

    sget-object v5, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:Lp1/b0;

    invoke-virtual {v0, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/content/res/Configuration;

    iget v5, v5, Landroid/content/res/Configuration;->screenWidthDp:I

    int-to-float v5, v5

    sget-object v7, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v0, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ly3/c;

    invoke-interface {v8, v5}, Ly3/c;->q0(F)F

    move-result v5

    const/4 v8, 0x0

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    move/from16 p0, v8

    sget-object v8, Le41/k;->NOT_EXPANDED:Le41/k;

    new-instance v12, Ll83/k;

    invoke-direct {v12, v10, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v8, -0x41666666    # -0.3f

    mul-float/2addr v5, v8

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    sget-object v8, Le41/k;->EXPANDED:Le41/k;

    new-instance v10, Ll83/k;

    invoke-direct {v10, v5, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v12, v10}, [Ll83/k;

    move-result-object v5

    invoke-static {v5}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v18

    shr-int/lit8 v5, v4, 0x6

    and-int/lit8 v8, v5, 0xe

    invoke-static {v2, v0, v8}, Lj93/l0;->W(Ljava/lang/Object;Lp1/q;I)Lg1/n7;

    move-result-object v8

    invoke-virtual {v0, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ly3/c;

    iget-object v10, v8, Lg1/n7;->e:Lp1/g1;

    invoke-interface {v10}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->floatValue()F

    move-result v10

    neg-float v10, v10

    const/4 v12, 0x2

    int-to-float v12, v12

    const/16 v14, 0x8

    int-to-float v14, v14

    mul-float/2addr v12, v14

    invoke-interface {v7, v12}, Ly3/c;->q0(F)F

    move-result v12

    sub-float/2addr v10, v12

    cmpg-float v12, v10, p0

    if-gez v12, :cond_1a

    move/from16 v10, p0

    :cond_1a
    invoke-static {v10}, Le93/b;->X(F)I

    move-result v10

    invoke-interface {v7, v10}, Ly3/c;->e0(I)F

    move-result v7

    sget-object v10, Lh0/d2;->w:Lh0/d2;

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v15, :cond_1b

    new-instance v10, Lg1/w8;

    const/16 v12, 0x16

    invoke-direct {v10, v12}, Lg1/w8;-><init>(I)V

    invoke-virtual {v0, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    move-object/from16 v21, v10

    check-cast v21, Lc93/m;

    const/16 v22, 0x0

    const/16 v23, 0x1b8

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v17, v8

    move-object/from16 v16, v13

    invoke-static/range {v16 .. v23}, Lj93/l0;->c0(Landroidx/compose/ui/Modifier;Lg1/n7;Ljava/util/Map;ZZLc93/m;Lg1/x4;I)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move-object/from16 v12, v16

    move-object/from16 v10, v17

    invoke-interface {v8, v3}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v13, Lb2/e;->w:Lb2/m;

    move-object/from16 v16, v2

    const/4 v14, 0x0

    invoke-static {v13, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    move-object v14, v3

    move/from16 p0, v4

    iget-wide v3, v0, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v0, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 p1, v5

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v6, v0, Lp1/q;->S:Z

    if-eqz v6, :cond_1c

    invoke-virtual {v0, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_1c
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_10
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v0, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v0, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    move-object/from16 p2, v14

    iget-boolean v14, v0, Lp1/q;->S:Z

    if-nez v14, :cond_1d

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    move-object/from16 v17, v9

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v14, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1e

    goto :goto_11

    :cond_1d
    move-object/from16 v17, v9

    :goto_11
    invoke-static {v3, v0, v3, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1e
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v0, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, Lb2/e;->z:Lb2/m;

    sget-object v9, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v9, v12, v8}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v0, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v12, :cond_1f

    if-ne v14, v15, :cond_20

    :cond_1f
    new-instance v14, Lhy0/l;

    const/4 v12, 0x1

    invoke-direct {v14, v10, v12}, Lhy0/l;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_20
    check-cast v14, Lkotlin/jvm/functions/Function1;

    invoke-static {v8, v14}, Landroidx/compose/foundation/layout/a;->l(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v8}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/4 v14, 0x0

    invoke-static {v13, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v12

    iget-wide v13, v0, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v0, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v15, v0, Lp1/q;->S:Z

    if-eqz v15, :cond_21

    invoke-virtual {v0, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_12

    :cond_21
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_12
    invoke-static {v0, v6, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v2, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v0, Lp1/q;->S:Z

    if-nez v2, :cond_22

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_23

    :cond_22
    invoke-static {v13, v0, v13, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_23
    invoke-static {v0, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v2, p0, 0xc

    and-int/lit8 v2, v2, 0xe

    const/4 v12, 0x1

    invoke-static {v2, v11, v0, v12}, Ldc/b;->z(ILc93/m;Lp1/q;Z)V

    sget-object v2, Lb2/e;->F:Lb2/m;

    invoke-virtual {v9, v1, v2}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v10, v2}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v7, v2}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    and-int/lit8 v3, p1, 0x70

    move-object/from16 v9, v17

    const/4 v14, 0x0

    invoke-static {v2, v9, v0, v3, v14}, Lhy0/b1;->g(Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v0, v12}, Lp1/q;->q(Z)V

    move-object v2, v1

    move-object/from16 v3, v16

    move-object/from16 v1, p2

    :goto_13
    move-object v4, v9

    move-object v5, v11

    goto :goto_14

    :cond_24
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v1, v3

    move-object v2, v5

    move-object/from16 v3, p2

    goto :goto_13

    :goto_14
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_25

    new-instance v0, La01/f;

    const/16 v8, 0x1a

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, La01/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_25
    return-void
.end method

.method private static final k()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final l(Le41/k;Le41/k;)Lg1/g9;
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lg1/c3;

    const p1, 0x3e99999a    # 0.3f

    invoke-direct {p0, p1}, Lg1/c3;-><init>(F)V

    return-object p0
.end method

.method private static final m(Lg1/n7;Ly3/c;)Ly3/j;
    .locals 4

    const-string v0, "$this$offset"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lg1/n7;->e:Lp1/g1;

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    invoke-static {p0}, Le93/b;->X(F)I

    move-result p0

    int-to-long p0, p0

    const/16 v0, 0x20

    shl-long/2addr p0, v0

    const/4 v0, 0x0

    int-to-long v0, v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    or-long/2addr p0, v0

    new-instance v0, Ly3/j;

    invoke-direct {v0, p0, p1}, Ly3/j;-><init>(J)V

    return-object v0
.end method

.method private static final n(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Le41/k;Lc93/a;Lc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lhy0/b1;->j(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Le41/k;Lc93/a;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
