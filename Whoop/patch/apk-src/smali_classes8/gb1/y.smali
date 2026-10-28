.class public abstract Lgb1/y;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a9\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u001a#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u000b\u001a\u00020\u0007H\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a\u001f\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u001a+\u0010\u0019\u001a\u00020\u0018*\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "Li2/x;",
        "color",
        "Ly3/f;",
        "diameter",
        "",
        "centerAlpha",
        "",
        "pulse",
        "f",
        "(Landroidx/compose/ui/Modifier;Li2/x;FFZLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;",
        "active",
        "Ld0/e;",
        "Ld0/n;",
        "i",
        "(ZLandroidx/compose/runtime/Composer;I)Ld0/e;",
        "fraction",
        "e",
        "(F)F",
        "d",
        "(FF)F",
        "Lk2/e;",
        "radius",
        "alpha",
        "Ll83/a0;",
        "c",
        "(Lk2/e;JFF)V",
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
.method public static synthetic a(Li2/x;FFLk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lgb1/y;->g(Li2/x;FFLk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ld0/e;Li2/x;FFLk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lgb1/y;->h(Ld0/e;Li2/x;FFLk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lk2/e;JFF)V
    .locals 14

    sget-object v0, Li2/t;->b:Li2/s;

    move-wide v1, p1

    move/from16 v3, p4

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    sget-wide v1, Li2/x;->m:J

    new-instance v4, Li2/x;

    invoke-direct {v4, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, v4}, [Li2/x;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {p0}, Lk2/e;->B0()J

    move-result-wide v2

    const/16 v5, 0x8

    move/from16 v4, p3

    invoke-static/range {v0 .. v5}, Li2/s;->g(Li2/s;Ljava/util/List;JFI)Li2/u0;

    move-result-object v7

    invoke-interface {p0}, Lk2/e;->B0()J

    move-result-wide v9

    const/4 v12, 0x0

    const/16 v13, 0x78

    const/4 v11, 0x0

    move-object v6, p0

    move/from16 v8, p3

    invoke-static/range {v6 .. v13}, Lk2/e;->G(Lk2/e;Li2/t;FJFLk2/f;I)V

    return-void
.end method

.method public static final d(FF)F
    .locals 2

    const/high16 v0, 0x3f000000    # 0.5f

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1, p0}, Le93/b;->O(FFF)F

    move-result p0

    mul-float/2addr p0, p1

    return p0
.end method

.method public static final e(F)F
    .locals 2

    const v0, 0x3f59999a    # 0.85f

    const v1, 0x3f933333    # 1.15f

    invoke-static {v0, v1, p0}, Le93/b;->O(FFF)F

    move-result p0

    return p0
.end method

.method public static final f(Landroidx/compose/ui/Modifier;Li2/x;FFZLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;
    .locals 7

    const-string v0, "$this$radialGlow"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p7, 0x4

    if-eqz v0, :cond_0

    const/high16 p3, 0x3f000000    # 0.5f

    :cond_0
    and-int/lit8 p7, p7, 0x8

    const/4 v0, 0x0

    if-eqz p7, :cond_1

    move p4, v0

    :cond_1
    const/4 p7, 0x1

    if-eqz p1, :cond_2

    if-eqz p4, :cond_2

    move v1, p7

    goto :goto_0

    :cond_2
    move v1, v0

    :goto_0
    invoke-static {v1, p5, v0}, Lgb1/y;->i(ZLandroidx/compose/runtime/Composer;I)Ld0/e;

    move-result-object v1

    if-nez p1, :cond_3

    check-cast p5, Lp1/q;

    const p1, 0x468deb46

    invoke-virtual {p5, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p5, v0}, Lp1/q;->q(Z)V

    return-object p0

    :cond_3
    sget-object v2, Lp1/l;->a:Lp1/v0;

    const/16 v3, 0x800

    const/16 v4, 0x100

    const/16 v5, 0x20

    if-nez p4, :cond_f

    check-cast p5, Lp1/q;

    const p4, 0x468dee7d

    invoke-virtual {p5, p4}, Lp1/q;->e0(I)V

    and-int/lit8 p4, p6, 0x70

    xor-int/lit8 p4, p4, 0x30

    if-le p4, v5, :cond_4

    invoke-virtual {p5, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p4

    if-nez p4, :cond_5

    :cond_4
    and-int/lit8 p4, p6, 0x30

    if-ne p4, v5, :cond_6

    :cond_5
    move p4, p7

    goto :goto_1

    :cond_6
    move p4, v0

    :goto_1
    and-int/lit16 v1, p6, 0x380

    xor-int/lit16 v1, v1, 0x180

    if-le v1, v4, :cond_7

    invoke-virtual {p5, p2}, Lp1/q;->d(F)Z

    move-result v1

    if-nez v1, :cond_8

    :cond_7
    and-int/lit16 v1, p6, 0x180

    if-ne v1, v4, :cond_9

    :cond_8
    move v1, p7

    goto :goto_2

    :cond_9
    move v1, v0

    :goto_2
    or-int/2addr p4, v1

    and-int/lit16 v1, p6, 0x1c00

    xor-int/lit16 v1, v1, 0xc00

    if-le v1, v3, :cond_a

    invoke-virtual {p5, p3}, Lp1/q;->d(F)Z

    move-result v1

    if-nez v1, :cond_c

    :cond_a
    and-int/lit16 p6, p6, 0xc00

    if-ne p6, v3, :cond_b

    goto :goto_3

    :cond_b
    move p7, v0

    :cond_c
    :goto_3
    or-int/2addr p4, p7

    invoke-virtual {p5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p6

    if-nez p4, :cond_d

    if-ne p6, v2, :cond_e

    :cond_d
    new-instance p6, Lgb1/x;

    const/4 p4, 0x0

    invoke-direct {p6, p2, p3, p4, p1}, Lgb1/x;-><init>(FFILjava/lang/Object;)V

    invoke-virtual {p5, p6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast p6, Lkotlin/jvm/functions/Function1;

    invoke-static {p0, p6}, Landroidx/compose/ui/draw/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-virtual {p5, v0}, Lp1/q;->q(Z)V

    return-object p0

    :cond_f
    check-cast p5, Lp1/q;

    const p4, 0x468dfcb2

    invoke-virtual {p5, p4}, Lp1/q;->e0(I)V

    invoke-virtual {p5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p4

    and-int/lit8 v6, p6, 0x70

    xor-int/lit8 v6, v6, 0x30

    if-le v6, v5, :cond_10

    invoke-virtual {p5, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_11

    :cond_10
    and-int/lit8 v6, p6, 0x30

    if-ne v6, v5, :cond_12

    :cond_11
    move v5, p7

    goto :goto_4

    :cond_12
    move v5, v0

    :goto_4
    or-int/2addr p4, v5

    and-int/lit16 v5, p6, 0x380

    xor-int/lit16 v5, v5, 0x180

    if-le v5, v4, :cond_13

    invoke-virtual {p5, p2}, Lp1/q;->d(F)Z

    move-result v5

    if-nez v5, :cond_14

    :cond_13
    and-int/lit16 v5, p6, 0x180

    if-ne v5, v4, :cond_15

    :cond_14
    move v4, p7

    goto :goto_5

    :cond_15
    move v4, v0

    :goto_5
    or-int/2addr p4, v4

    and-int/lit16 v4, p6, 0x1c00

    xor-int/lit16 v4, v4, 0xc00

    if-le v4, v3, :cond_16

    invoke-virtual {p5, p3}, Lp1/q;->d(F)Z

    move-result v4

    if-nez v4, :cond_18

    :cond_16
    and-int/lit16 p6, p6, 0xc00

    if-ne p6, v3, :cond_17

    goto :goto_6

    :cond_17
    move p7, v0

    :cond_18
    :goto_6
    or-int/2addr p4, p7

    invoke-virtual {p5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p6

    if-nez p4, :cond_19

    if-ne p6, v2, :cond_1a

    :cond_19
    new-instance p6, Lgb1/v;

    invoke-direct {p6, v1, p1, p2, p3}, Lgb1/v;-><init>(Ld0/e;Li2/x;FF)V

    invoke-virtual {p5, p6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    check-cast p6, Lkotlin/jvm/functions/Function1;

    invoke-static {p0, p6}, Landroidx/compose/ui/draw/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-virtual {p5, v0}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final g(Li2/x;FFLk2/e;)Ll83/a0;
    .locals 2

    const-string v0, "$this$drawBehind"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p0, Li2/x;->a:J

    invoke-interface {p3, p1}, Ly3/c;->q0(F)F

    move-result p0

    const/high16 p1, 0x40000000    # 2.0f

    div-float/2addr p0, p1

    invoke-static {p3, v0, v1, p0, p2}, Lgb1/y;->c(Lk2/e;JFF)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Ld0/e;Li2/x;FFLk2/e;)Ll83/a0;
    .locals 2

    const-string v0, "$this$drawBehind"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    iget-wide v0, p1, Li2/x;->a:J

    invoke-interface {p4, p2}, Ly3/c;->q0(F)F

    move-result p1

    const/high16 p2, 0x40000000    # 2.0f

    div-float/2addr p1, p2

    invoke-static {p0}, Lgb1/y;->e(F)F

    move-result p2

    mul-float/2addr p2, p1

    invoke-static {p0, p3}, Lgb1/y;->d(FF)F

    move-result p0

    invoke-static {p4, v0, v1, p2, p0}, Lgb1/y;->c(Lk2/e;JFF)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final i(ZLandroidx/compose/runtime/Composer;I)Ld0/e;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Ld0/e;"
        }
    .end annotation

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, Ld0/f;->a(F)Ld0/e;

    move-result-object v0

    invoke-virtual {p1, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    check-cast v0, Ld0/e;

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    and-int/lit8 v3, p2, 0xe

    xor-int/lit8 v3, v3, 0x6

    const/4 v4, 0x4

    if-le v3, v4, :cond_1

    invoke-virtual {p1, p0}, Lp1/q;->h(Z)Z

    move-result v3

    if-nez v3, :cond_2

    :cond_1
    and-int/lit8 p2, p2, 0x6

    if-ne p2, v4, :cond_3

    :cond_2
    const/4 p2, 0x1

    goto :goto_0

    :cond_3
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr p2, v3

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez p2, :cond_4

    if-ne v3, v1, :cond_5

    :cond_4
    new-instance v3, Lgb1/y$a;

    const/4 p2, 0x0

    invoke-direct {v3, p0, v0, p2}, Lgb1/y$a;-><init>(ZLd0/e;Lq83/d;)V

    invoke-virtual {p1, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v3, Lc93/m;

    invoke-static {p1, v3, v2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    return-object v0
.end method
