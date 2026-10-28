.class public abstract Lw90/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0002\u0008\u0002\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u001f\u0010\u000c\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0018\u00b2\u0006\u000e\u0010\u0014\u001a\u00020\n8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0015\u001a\u00020\n8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000c\u0010\u0017\u001a\u00020\u00168\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lw90/c;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "s",
        "(Lw90/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lc31/k;",
        "progressButtonState",
        "",
        "isVisible",
        "j",
        "(Lc31/k;ZLandroidx/compose/runtime/Composer;I)V",
        "",
        "text",
        "",
        "delayPerCharacter",
        "n",
        "(Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)V",
        "iconVisible",
        "buttonVisible",
        "",
        "alpha",
        "activation_release"
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
.method private static final A(Li2/g0;)Ll83/a0;
    .locals 2

    const-string v0, "$this$graphicsLayer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    int-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float/2addr v0, v1

    check-cast p0, Li2/x0;

    invoke-virtual {p0}, Li2/x0;->getDensity()F

    move-result v1

    mul-float/2addr v1, v0

    invoke-virtual {p0, v1}, Li2/x0;->E(F)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Lw90/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lw90/b;->s(Lw90/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic C(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lw90/b;->p(Lp1/c1;Z)V

    return-void
.end method

.method public static final synthetic D(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lw90/b;->v(Lp1/c1;Z)V

    return-void
.end method

.method public static final synthetic E(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lw90/b;->x(Lp1/c1;Z)V

    return-void
.end method

.method public static synthetic a(I)I
    .locals 0

    invoke-static {p0}, Lw90/b;->k(I)I

    move-result p0

    return p0
.end method

.method public static synthetic b(Ljava/lang/String;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lw90/b;->z(Ljava/lang/String;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lc31/k;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lw90/b;->m(Lc31/k;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lw90/b;->t(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Li2/g0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lw90/b;->A(Li2/g0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lw90/b;->r(Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lc31/k;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lw90/b;->l(Lc31/k;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lw90/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lw90/b;->B(Lw90/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lw90/c;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lw90/b;->y(Lw90/c;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Lc31/k;ZLandroidx/compose/runtime/Composer;I)V
    .locals 9

    move-object v6, p2

    check-cast v6, Lp1/q;

    const p2, -0x20e4cda0

    invoke-virtual {v6, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    const/4 v0, 0x4

    const/4 v1, 0x2

    if-nez p2, :cond_2

    and-int/lit8 p2, p3, 0x8

    if-nez p2, :cond_0

    invoke-virtual {v6, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    goto :goto_0

    :cond_0
    invoke-virtual {v6, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    :goto_0
    if-eqz p2, :cond_1

    move p2, v0

    goto :goto_1

    :cond_1
    move p2, v1

    :goto_1
    or-int/2addr p2, p3

    goto :goto_2

    :cond_2
    move p2, p3

    :goto_2
    and-int/lit8 v2, p3, 0x30

    if-nez v2, :cond_4

    invoke-virtual {v6, p1}, Lp1/q;->h(Z)Z

    move-result v2

    if-eqz v2, :cond_3

    const/16 v2, 0x20

    goto :goto_3

    :cond_3
    const/16 v2, 0x10

    :goto_3
    or-int/2addr p2, v2

    :cond_4
    and-int/lit8 v2, p2, 0x13

    const/16 v3, 0x12

    const/4 v4, 0x0

    if-eq v2, v3, :cond_5

    const/4 v2, 0x1

    goto :goto_4

    :cond_5
    move v2, v4

    :goto_4
    and-int/lit8 v3, p2, 0x1

    invoke-virtual {v6, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_7

    const/16 v2, 0x320

    const/16 v3, 0xa8c

    const/4 v5, 0x0

    invoke-static {v2, v3, v5, v0}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v0

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v2, v3, :cond_6

    new-instance v2, Lw01/e;

    const/16 v3, 0x16

    invoke-direct {v2, v3}, Lw01/e;-><init>(I)V

    invoke-virtual {v6, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v2}, Lc0/w0;->o(Ld0/c0;Lkotlin/jvm/functions/Function1;)Lc0/d1;

    move-result-object v0

    const/16 v2, 0xc8

    const/4 v3, 0x6

    invoke-static {v2, v4, v5, v3}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v2

    invoke-static {v2, v1}, Lc0/w0;->e(Ld0/c0;I)Lc0/d1;

    move-result-object v2

    invoke-virtual {v0, v2}, Lc0/c1;->a(Lc0/c1;)Lc0/d1;

    move-result-object v2

    const/16 v0, 0xa

    invoke-static {v0, v4, v5, v3}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v0

    invoke-static {v0, v1}, Lc0/w0;->f(Ld0/c0;I)Lc0/f1;

    move-result-object v3

    new-instance v0, Lvq2/d;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lvq2/d;-><init>(Ljava/lang/Object;I)V

    const v1, -0x1c262ec8

    invoke-static {v1, v6, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    shr-int/lit8 p2, p2, 0x3

    and-int/lit8 p2, p2, 0xe

    const v0, 0x30d80

    or-int v7, p2, v0

    const/16 v8, 0x12

    const/4 v1, 0x0

    const/4 v4, 0x0

    move v0, p1

    invoke-static/range {v0 .. v8}, Landroidx/compose/animation/b;->f(ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    goto :goto_5

    :cond_7
    move v0, p1

    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_8

    new-instance p2, Lam0/b;

    const/16 v1, 0xf

    invoke-direct {p2, p0, v0, p3, v1}, Lam0/b;-><init>(Ljava/lang/Object;ZII)V

    iput-object p2, p1, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final k(I)I
    .locals 0

    const/16 p0, 0x3e8

    return p0
.end method

.method private static final l(Lc31/k;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 1

    const-string p3, "$this$AnimatedVisibility"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget p1, Lc31/k;->r:I

    const/4 p3, 0x2

    const/4 v0, 0x0

    invoke-static {p0, v0, p2, p1, p3}, Lc31/j;->e(Lc31/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lc31/k;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lw90/b;->j(Lc31/k;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)V
    .locals 36

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p3

    move-object/from16 v7, p2

    check-cast v7, Lp1/q;

    const v3, -0x77a12fc7

    invoke-virtual {v7, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v2

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    and-int/lit8 v4, v2, 0x30

    const/16 v10, 0x20

    if-nez v4, :cond_3

    invoke-virtual {v7, v1}, Lp1/q;->e(I)Z

    move-result v4

    if-eqz v4, :cond_2

    move v4, v10

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_3
    move/from16 v29, v3

    and-int/lit8 v3, v29, 0x13

    const/16 v11, 0x12

    const/4 v12, 0x1

    const/4 v13, 0x0

    if-eq v3, v11, :cond_4

    move v3, v12

    goto :goto_3

    :cond_4
    move v3, v13

    :goto_3
    and-int/lit8 v4, v29, 0x1

    invoke-virtual {v7, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_e

    sget-object v3, Ll0/m;->a:Ll0/e;

    sget-object v4, Lb2/e;->J:Lb2/l;

    invoke-static {v3, v4, v7, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v4, v7, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    sget-object v14, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v9, v7, Lp1/q;->S:Z

    if-eqz v9, :cond_5

    invoke-virtual {v7, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_4
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v7, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v7, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v7, Lp1/q;->S:Z

    if-nez v5, :cond_6

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    :cond_6
    invoke-static {v4, v7, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v7, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v3, 0x328aba68

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    move v3, v13

    move v15, v3

    :goto_5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v15, v4, :cond_d

    invoke-virtual {v0, v15}, Ljava/lang/String;->charAt(I)C

    move-result v4

    add-int/lit8 v30, v3, 0x1

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v5, v6, :cond_8

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v5}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v5

    invoke-virtual {v7, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v5, Lp1/c1;

    and-int/lit8 v8, v29, 0x70

    if-ne v8, v10, :cond_9

    move v8, v12

    goto :goto_6

    :cond_9
    move v8, v13

    :goto_6
    invoke-virtual {v7, v3}, Lp1/q;->e(I)Z

    move-result v9

    or-int/2addr v8, v9

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    const/4 v10, 0x0

    if-nez v8, :cond_a

    if-ne v9, v6, :cond_b

    :cond_a
    new-instance v9, Lw90/b$a;

    invoke-direct {v9, v1, v3, v5, v10}, Lw90/b$a;-><init>(IILp1/c1;Lq83/d;)V

    invoke-virtual {v7, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v9, Lc93/m;

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    invoke-static {v7, v9, v6}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5}, Lw90/b;->o(Lp1/c1;)Z

    move-result v5

    if-eqz v5, :cond_c

    const/high16 v5, 0x3f800000    # 1.0f

    goto :goto_7

    :cond_c
    const/4 v5, 0x0

    :goto_7
    const/16 v6, 0x1f4

    const/4 v8, 0x6

    invoke-static {v6, v13, v10, v8}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v6

    const/16 v8, 0xc30

    const/16 v9, 0x14

    move v10, v3

    move v3, v5

    const-string v5, ""

    move/from16 v16, v4

    move-object v4, v6

    const/4 v6, 0x0

    invoke-static/range {v3 .. v9}, Ld0/g;->b(FLd0/l;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v3

    move-object v4, v3

    invoke-static/range {v16 .. v16}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "AnimatedCharacter"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move/from16 v6, v16

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v14, v5}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v4}, Lw90/b;->q(Lp1/t2;)F

    move-result v4

    invoke-static {v4, v5}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v5, v7, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->O()Lb91/a;

    move-result-object v23

    invoke-virtual {v5, v7, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v5

    sget v8, Lb91/a;->d:I

    shl-int/lit8 v27, v8, 0x12

    const v28, 0x2fff8

    move-object/from16 v25, v7

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move/from16 v16, v11

    const/4 v11, 0x0

    move/from16 v17, v12

    move/from16 v18, v13

    const-wide/16 v12, 0x0

    move-object/from16 v19, v14

    const/4 v14, 0x0

    move/from16 v20, v15

    const/4 v15, 0x0

    move/from16 v21, v16

    move/from16 v22, v17

    const-wide/16 v16, 0x0

    move/from16 v24, v18

    const/16 v18, 0x0

    move-object/from16 v26, v19

    const/16 v19, 0x0

    move/from16 v31, v20

    const/16 v20, 0x0

    move/from16 v32, v21

    const/16 v21, 0x0

    move/from16 v33, v22

    const/16 v22, 0x0

    move/from16 v34, v24

    const/16 v24, 0x0

    move-object/from16 v35, v26

    const/16 v26, 0x0

    move/from16 v0, v34

    const/16 v33, 0x20

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v25

    add-int/lit8 v15, v31, 0x1

    const/4 v12, 0x1

    move v13, v0

    move/from16 v3, v30

    move/from16 v11, v32

    move/from16 v10, v33

    move-object/from16 v14, v35

    move-object/from16 v0, p0

    goto/16 :goto_5

    :cond_d
    move v0, v13

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_e
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_f

    new-instance v3, Lcom/whoop/profile/presentation/edit/b;

    const/4 v4, 0x6

    move-object/from16 v5, p0

    invoke-direct {v3, v5, v1, v2, v4}, Lcom/whoop/profile/presentation/edit/b;-><init>(Ljava/lang/Object;III)V

    iput-object v3, v0, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
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

.method private static final q(Lp1/t2;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")F"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method private static final r(Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lw90/b;->n(Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final s(Lw90/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw90/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p2

    check-cast v9, Lp1/q;

    const v0, -0x4dab0b7a

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int v0, p3, v0

    goto :goto_2

    :cond_2
    move/from16 v0, p3

    :goto_2
    and-int/lit8 v2, p4, 0x2

    const/16 v3, 0x20

    if-eqz v2, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v4, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-virtual {v9, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    move v5, v3

    goto :goto_3

    :cond_5
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v0, v5

    :goto_4
    and-int/lit8 v5, v0, 0x13

    const/16 v6, 0x12

    const/4 v14, 0x0

    if-eq v5, v6, :cond_6

    const/4 v5, 0x1

    goto :goto_5

    :cond_6
    move v5, v14

    :goto_5
    and-int/lit8 v6, v0, 0x1

    invoke-virtual {v9, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_1d

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_8

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v8, :cond_7

    new-instance v2, Lw01/e;

    const/16 v4, 0x17

    invoke-direct {v2, v4}, Lw01/e;-><init>(I)V

    invoke-virtual {v9, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v10, v2

    goto :goto_6

    :cond_8
    move-object v10, v4

    :goto_6
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v8, :cond_9

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v2

    invoke-virtual {v9, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object v11, v2

    check-cast v11, Lp1/c1;

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v8, :cond_a

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v2

    invoke-virtual {v9, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v2, Lp1/c1;

    and-int/lit8 v0, v0, 0x70

    if-ne v0, v3, :cond_b

    const/4 v0, 0x1

    goto :goto_7

    :cond_b
    move v0, v14

    :goto_7
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x0

    if-nez v0, :cond_c

    if-ne v3, v8, :cond_d

    :cond_c
    new-instance v3, Lw90/b$b;

    invoke-direct {v3, v10, v11, v2, v4}, Lw90/b$b;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lq83/d;)V

    invoke-virtual {v9, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v3, Lc93/m;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-static {v9, v3, v0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v0, 0x3f800000    # 1.0f

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Lb2/e;->E:Lb2/m;

    invoke-static {v6, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v12, v9, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v9, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v4, v9, Lp1/q;->S:Z

    if-eqz v4, :cond_e

    invoke-virtual {v9, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_e
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_8
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v9, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v9, v6, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v14, v9, Lp1/q;->S:Z

    if-nez v14, :cond_f

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_10

    :cond_f
    invoke-static {v7, v9, v7, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v14, La3/k;->d:La3/i;

    invoke-static {v9, v14, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    move-object v5, v2

    invoke-virtual {v1}, Lw90/c;->c()Lkd1/o;

    move-result-object v2

    move-object v7, v6

    sget v6, Lkd1/o;->a:I

    move-object/from16 v16, v7

    const/4 v7, 0x3

    move-object/from16 v17, v3

    const/4 v3, 0x0

    move-object/from16 v18, v4

    const/4 v4, 0x0

    move-object/from16 v20, v16

    move-object/from16 v16, v5

    move-object v5, v9

    move-object/from16 v9, v20

    move-object/from16 v20, v17

    invoke-static/range {v2 .. v7}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v2

    move-object v4, v10

    const/16 v10, 0x61b0

    move-object v3, v11

    const/16 v11, 0x68

    move-object v6, v3

    const/4 v3, 0x0

    move-object v7, v9

    move-object v9, v5

    const/4 v5, 0x0

    move-object/from16 v17, v6

    sget-object v6, Ly2/j;->a:Ly2/b1;

    move-object/from16 v21, v7

    const/4 v7, 0x0

    move-object/from16 v22, v8

    const/4 v8, 0x0

    move-object/from16 p1, v4

    move-object v4, v15

    move-object/from16 v15, v18

    move-object/from16 v1, v21

    move-object/from16 v23, v22

    invoke-static/range {v2 .. v11}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v2, v20

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lb2/e;->N:Lb2/k;

    sget-object v5, Ll0/m;->c:Ll0/g;

    const/16 v6, 0x30

    invoke-static {v5, v4, v9, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v6, v9, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v9, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v8, v9, Lp1/q;->S:Z

    if-eqz v8, :cond_11

    invoke-virtual {v9, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_11
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v9, v15, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v9, Lp1/q;->S:Z

    if-nez v5, :cond_12

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_13

    :cond_12
    invoke-static {v6, v9, v6, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    invoke-static {v9, v14, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, Ll0/z;->a:Ll0/z;

    const/4 v5, 0x1

    invoke-virtual {v3, v2, v5, v0}, Ll0/z;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, Ll0/m;->e:Ll0/h;

    const/16 v6, 0x36

    invoke-static {v5, v4, v9, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v5, v9, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v9, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v7, v9, Lp1/q;->S:Z

    if-eqz v7, :cond_14

    invoke-virtual {v9, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_14
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v9, v15, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v9, Lp1/q;->S:Z

    if-nez v4, :cond_15

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_16

    :cond_15
    invoke-static {v5, v9, v5, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_16
    invoke-static {v9, v14, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lw90/c;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lw90/c;->h()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    const/16 v5, 0x320

    div-int v4, v5, v4

    const/4 v6, 0x0

    invoke-static {v0, v4, v9, v6}, Lw90/b;->n(Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)V

    move-object/from16 v20, v2

    move-object v2, v3

    invoke-static/range {v17 .. v17}, Lw90/b;->u(Lp1/c1;)Z

    move-result v3

    const/16 v0, 0x3e8

    const/4 v4, 0x4

    const/4 v6, 0x0

    invoke-static {v5, v0, v6, v4}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v0

    const/4 v4, 0x2

    invoke-static {v0, v4}, Lc0/w0;->e(Ld0/c0;I)Lc0/d1;

    move-result-object v0

    new-instance v4, Lvq2/d;

    const/4 v7, 0x3

    move-object/from16 v8, p0

    invoke-direct {v4, v8, v7}, Lvq2/d;-><init>(Ljava/lang/Object;I)V

    const v7, 0x29f1c950

    invoke-static {v7, v9, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v4

    const/16 v11, 0x1a

    move-object v8, v4

    const/4 v4, 0x0

    move-object/from16 v19, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const v10, 0x180c06

    move/from16 v18, v5

    move-object v5, v0

    move/from16 v0, v18

    move-object/from16 v18, v14

    move-object/from16 v14, v19

    move-object/from16 v24, v20

    invoke-static/range {v2 .. v11}, Landroidx/compose/animation/b;->e(Ll0/y;ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual/range {p0 .. p0}, Lw90/c;->g()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_17

    const v0, -0x6763eae9

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    const/4 v6, 0x0

    invoke-virtual {v9, v6}, Lp1/q;->q(Z)V

    :goto_b
    const/4 v5, 0x1

    goto :goto_c

    :cond_17
    const v4, -0x6763eae8

    invoke-virtual {v9, v4}, Lp1/q;->e0(I)V

    invoke-static/range {v17 .. v17}, Lw90/b;->u(Lp1/c1;)Z

    move-result v4

    const/16 v5, 0x708

    const/4 v6, 0x4

    invoke-static {v0, v5, v14, v6}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v0

    const/4 v5, 0x2

    invoke-static {v0, v5}, Lc0/w0;->e(Ld0/c0;I)Lc0/d1;

    move-result-object v5

    new-instance v0, Ld42/f;

    const/4 v6, 0x5

    invoke-direct {v0, v3, v6}, Ld42/f;-><init>(Ljava/lang/String;I)V

    const v3, -0x53c785de    # -2.621577E-12f

    invoke-static {v3, v9, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    const/16 v11, 0x1a

    move v3, v4

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v11}, Landroidx/compose/animation/b;->e(Ll0/y;ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    const/4 v6, 0x0

    invoke-virtual {v9, v6}, Lp1/q;->q(Z)V

    goto :goto_b

    :goto_c
    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lw90/c;->f()Lc31/k;

    move-result-object v0

    if-nez v0, :cond_18

    const v0, 0x210d95f4

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v6}, Lp1/q;->q(Z)V

    const/4 v5, 0x1

    goto/16 :goto_11

    :cond_18
    const v2, 0x210d95f5

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lb2/e;->I:Lb2/m;

    sget-object v3, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    move-object/from16 v4, v24

    invoke-virtual {v3, v4, v2}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v24

    const/4 v4, 0x4

    int-to-float v2, v4

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float v25, v2, v3

    const/16 v28, 0x0

    const/16 v29, 0xa

    const/16 v26, 0x0

    move/from16 v27, v25

    invoke-static/range {v24 .. v29}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v4, v23

    if-ne v3, v4, :cond_19

    new-instance v3, Lw01/e;

    const/16 v4, 0x18

    invoke-direct {v3, v4}, Lw01/e;-><init>(I)V

    invoke-virtual {v9, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->w:Lb2/m;

    const/4 v6, 0x0

    invoke-static {v3, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v4, v9, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v9, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v6, v9, Lp1/q;->S:Z

    if-eqz v6, :cond_1a

    invoke-virtual {v9, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_1a
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_d
    invoke-static {v9, v15, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v9, Lp1/q;->S:Z

    if-nez v1, :cond_1c

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    goto :goto_f

    :cond_1b
    :goto_e
    move-object/from16 v1, v18

    goto :goto_10

    :cond_1c
    :goto_f
    invoke-static {v4, v9, v4, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_e

    :goto_10
    invoke-static {v9, v1, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static/range {v16 .. v16}, Lw90/b;->w(Lp1/c1;)Z

    move-result v1

    sget v2, Lc31/k;->r:I

    invoke-static {v0, v1, v9, v2}, Lw90/b;->j(Lc31/k;ZLandroidx/compose/runtime/Composer;I)V

    const/4 v5, 0x1

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    const/4 v6, 0x0

    invoke-virtual {v9, v6}, Lp1/q;->q(Z)V

    :goto_11
    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    move-object/from16 v3, p1

    goto :goto_12

    :cond_1d
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v3, v4

    :goto_12
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_1e

    new-instance v0, Lt80/b;

    const/16 v5, 0x1a

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lt80/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_1e
    return-void
.end method

.method private static final t(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lp1/c1;)Z
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

.method private static final v(Lp1/c1;Z)V
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

.method private static final w(Lp1/c1;)Z
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

.method private static final x(Lp1/c1;Z)V
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

.method private static final y(Lw90/c;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 18

    const-string v0, "$this$AnimatedVisibility"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    int-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float v4, v0, v1

    const/4 v6, 0x0

    const/16 v7, 0xd

    sget-object v2, Lb2/t;->w:Lb2/t;

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual/range {p0 .. p0}, Lw90/c;->e()Lkd1/o;

    move-result-object v0

    sget v4, Lkd1/o;->a:I

    const/4 v5, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object/from16 v3, p2

    invoke-static/range {v0 .. v5}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v8

    const/16 v16, 0x61b0

    const/16 v17, 0x68

    const/4 v9, 0x0

    const/4 v11, 0x0

    sget-object v12, Ly2/j;->a:Ly2/b1;

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v15, p2

    invoke-static/range {v8 .. v17}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final z(Ljava/lang/String;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 26

    move-object/from16 v0, p2

    const-string v1, "$this$AnimatedVisibility"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x2

    int-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float v5, v1, v2

    const/4 v7, 0x0

    const/16 v8, 0xd

    sget-object v3, Lb2/t;->w:Lb2/t;

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const-string v2, "WelcomeTransitionSubtitle"

    invoke-static {v1, v2}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v2, v0, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->q()Lb91/a;

    move-result-object v20

    invoke-virtual {v2, v0, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->y()J

    move-result-wide v2

    sget v4, Lb91/a;->d:I

    shl-int/lit8 v24, v4, 0x12

    const v25, 0x2fff8

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x30

    move-object/from16 v22, v0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
