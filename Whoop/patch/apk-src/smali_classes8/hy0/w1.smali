.class public abstract Lhy0/w1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u001f\u0010\u0008\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "",
        "iconImage",
        "Li2/x;",
        "iconColor",
        "iconBackgroundColor",
        "Ll83/a0;",
        "e",
        "(IJJLandroidx/compose/runtime/Composer;I)V",
        "c",
        "(IJLandroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(IJJILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lhy0/w1;->f(IJJILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(IJILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lhy0/w1;->d(IJILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(IJLandroidx/compose/runtime/Composer;I)V
    .locals 11

    move-object v7, p3

    check-cast v7, Lp1/q;

    const v0, 0x4015f45a

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x6

    const/4 v2, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v7, p0}, Lp1/q;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    goto :goto_1

    :cond_1
    move v0, p4

    :goto_1
    and-int/lit8 v3, p4, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v7, p1, p2}, Lp1/q;->f(J)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :cond_3
    and-int/lit8 v5, v0, 0x13

    const/16 v6, 0x12

    if-eq v5, v6, :cond_4

    const/4 v5, 0x1

    goto :goto_3

    :cond_4
    const/4 v5, 0x0

    :goto_3
    and-int/lit8 v6, v0, 0x1

    invoke-virtual {v7, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_5

    shl-int/lit8 v5, v0, 0x3

    and-int/lit8 v5, v5, 0x70

    const/4 v6, 0x6

    or-int/2addr v5, v6

    invoke-static {p0, v7, v5}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v5

    const-string v8, "navigate"

    invoke-static {v8, v7, v6}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    const-wide/high16 v9, 0x4004000000000000L    # 2.5

    double-to-float v9, v9

    int-to-float v2, v2

    mul-float/2addr v9, v2

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v9, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    shl-int/2addr v0, v6

    and-int/lit16 v0, v0, 0x1c00

    or-int/lit16 v0, v0, 0x180

    const/4 v9, 0x0

    move-object v4, v2

    move-object v2, v5

    move-object v3, v8

    move-wide v5, p1

    move v8, v0

    invoke-static/range {v2 .. v9}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    goto :goto_4

    :cond_5
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_6

    new-instance v0, Lc41/i0;

    const/4 v5, 0x2

    move v1, p0

    move-wide v3, p1

    move v2, p4

    invoke-direct/range {v0 .. v5}, Lc41/i0;-><init>(IIJI)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method private static final d(IJILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lhy0/w1;->c(IJLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final e(IJJLandroidx/compose/runtime/Composer;I)V
    .locals 8

    check-cast p5, Lp1/q;

    const v0, -0x5c52e5b5

    invoke-virtual {p5, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p6, 0x6

    const/4 v1, 0x4

    if-nez v0, :cond_1

    invoke-virtual {p5, p0}, Lp1/q;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p6

    goto :goto_1

    :cond_1
    move v0, p6

    :goto_1
    and-int/lit8 v2, p6, 0x30

    if-nez v2, :cond_3

    invoke-virtual {p5, p1, p2}, Lp1/q;->f(J)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v0, v2

    :cond_3
    and-int/lit16 v2, p6, 0x180

    if-nez v2, :cond_5

    invoke-virtual {p5, p3, p4}, Lp1/q;->f(J)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v0, v2

    :cond_5
    and-int/lit16 v2, v0, 0x93

    const/16 v3, 0x92

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq v2, v3, :cond_6

    move v2, v5

    goto :goto_4

    :cond_6
    move v2, v4

    :goto_4
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {p5, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_a

    const/4 v2, 0x5

    int-to-float v2, v2

    int-to-float v1, v1

    mul-float/2addr v2, v1

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    double-to-float v3, v6

    invoke-static {v2, v3, v1}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Li2/w0;->a:Li2/v0;

    invoke-static {v1, p3, p4, v2}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->E:Lb2/m;

    invoke-static {v2, v4}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v3, p5, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {p5}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {p5, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {p5}, Lp1/q;->i0()V

    iget-boolean v7, p5, Lp1/q;->S:Z

    if-eqz v7, :cond_7

    invoke-virtual {p5, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {p5}, Lp1/q;->s0()V

    :goto_5
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {p5, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {p5, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v4, p5, Lp1/q;->S:Z

    if-nez v4, :cond_8

    invoke-virtual {p5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    :cond_8
    invoke-static {v3, p5, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {p5, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v0, v0, 0x7e

    invoke-static {p0, p1, p2, p5, v0}, Lhy0/w1;->c(IJLandroidx/compose/runtime/Composer;I)V

    invoke-virtual {p5, v5}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_a
    invoke-virtual {p5}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {p5}, Lp1/q;->u()Lp1/v1;

    move-result-object p5

    if-eqz p5, :cond_b

    new-instance v0, Leo0/b;

    const/4 v5, 0x1

    move v3, p0

    move-wide v1, p1

    move-wide v6, p3

    move v4, p6

    invoke-direct/range {v0 .. v7}, Leo0/b;-><init>(JIIIJ)V

    iput-object v0, p5, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final f(IJJILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move v0, p0

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p6

    invoke-static/range {v0 .. v6}, Lhy0/w1;->e(IJJLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
