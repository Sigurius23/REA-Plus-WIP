.class public abstract Lbb2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a#\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u0017\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000c\u00b2\u0006\u000c\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "",
        "pageCount",
        "activePage",
        "Ll83/a0;",
        "h",
        "(IILandroidx/compose/runtime/Composer;II)V",
        "",
        "isActive",
        "d",
        "(ZLandroidx/compose/runtime/Composer;I)V",
        "Li2/x;",
        "dotColor",
        "settings_release"
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
.method public static synthetic a(FLp1/t2;Lk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lbb2/f;->f(FLp1/t2;Lk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lbb2/f;->g(ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(IIIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lbb2/f;->i(IIIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(ZLandroidx/compose/runtime/Composer;I)V
    .locals 10

    move-object v4, p1

    check-cast v4, Lp1/q;

    const p1, 0x43be9c17

    invoke-virtual {v4, p1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p1, p2, 0x6

    const/4 v7, 0x4

    const/4 v8, 0x2

    if-nez p1, :cond_1

    invoke-virtual {v4, p0}, Lp1/q;->h(Z)Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v7

    goto :goto_0

    :cond_0
    move p1, v8

    :goto_0
    or-int/2addr p1, p2

    goto :goto_1

    :cond_1
    move p1, p2

    :goto_1
    and-int/lit8 v0, p1, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v8, :cond_2

    move v0, v1

    goto :goto_2

    :cond_2
    move v0, v2

    :goto_2
    and-int/2addr p1, v1

    invoke-virtual {v4, p1, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_6

    if-eqz p0, :cond_3

    const p1, 0x4e880481

    invoke-virtual {v4, p1}, Lp1/q;->e0(I)V

    sget-object p1, Lx81/d;->a:Lx81/d;

    sget v0, Lx81/d;->b:I

    invoke-static {p1, v4, v0, v2}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v0

    goto :goto_3

    :cond_3
    const p1, 0x4e8808be

    invoke-virtual {v4, p1}, Lp1/q;->e0(I)V

    sget-object p1, Lx81/d;->a:Lx81/d;

    sget v0, Lx81/d;->b:I

    invoke-static {p1, v4, v0, v2}, Lih0/d0;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v0

    :goto_3
    const/16 p1, 0x12c

    const/4 v3, 0x0

    const/4 v9, 0x6

    invoke-static {p1, v2, v3, v9}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v2

    const/16 v5, 0x30

    const/16 v6, 0xc

    invoke-static/range {v0 .. v6}, Lc0/m1;->a(JLd0/c0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object p1

    int-to-float v0, v8

    int-to-float v1, v7

    mul-float/2addr v0, v1

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v0, v0}, Landroidx/compose/foundation/layout/d;->r(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_4

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_5

    :cond_4
    new-instance v3, Lbb2/d;

    const/4 v2, 0x0

    invoke-direct {v3, v0, p1, v2}, Lbb2/d;-><init>(FLp1/t2;I)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v3, v4, v9}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_4

    :cond_6
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_7

    new-instance v0, Lbb2/e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p2, v1}, Lbb2/e;-><init>(ZII)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final e(Lp1/t2;)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")J"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Li2/x;

    iget-wide v0, p0, Li2/x;->a:J

    return-wide v0
.end method

.method private static final f(FLp1/t2;Lk2/e;)Ll83/a0;
    .locals 13

    const-string v0, "$this$Canvas"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lbb2/f;->e(Lp1/t2;)J

    move-result-wide v2

    invoke-interface {p2, p0}, Ly3/c;->q0(F)F

    move-result p1

    invoke-interface {p2, p0}, Ly3/c;->q0(F)F

    move-result v0

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v4, p1

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v0, p1

    const/16 p1, 0x20

    shl-long/2addr v4, p1

    const-wide v6, 0xffffffffL

    and-long/2addr v0, v6

    or-long/2addr v0, v4

    invoke-interface {p2, p0}, Ly3/c;->q0(F)F

    move-result v4

    invoke-interface {p2, p0}, Ly3/c;->q0(F)F

    move-result p0

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v4, v4

    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long v8, p0

    shl-long p0, v4, p1

    and-long v4, v8, v6

    or-long v8, p0, v4

    const/4 v11, 0x0

    const/16 v12, 0xf2

    const-wide/16 v4, 0x0

    const/4 v10, 0x0

    move-wide v6, v0

    move-object v1, p2

    invoke-static/range {v1 .. v12}, Lk2/e;->D(Lk2/e;JJJJLk2/f;FI)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lbb2/f;->d(ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final h(IILandroidx/compose/runtime/Composer;II)V
    .locals 8

    check-cast p2, Lp1/q;

    const v0, -0x61db0405

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v2, p3, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_2

    invoke-virtual {p2, p0}, Lp1/q;->e(I)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_0
    or-int/2addr v2, p3

    goto :goto_1

    :cond_2
    move v2, p3

    :goto_1
    and-int/lit8 v3, p4, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_5

    invoke-virtual {p2, p1}, Lp1/q;->e(I)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v2, v4

    :cond_5
    :goto_3
    and-int/lit8 v4, v2, 0x13

    const/16 v5, 0x12

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v4, v5, :cond_6

    move v4, v7

    goto :goto_4

    :cond_6
    move v4, v6

    :goto_4
    and-int/2addr v2, v7

    invoke-virtual {p2, v2, v4}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_e

    if-eqz v0, :cond_7

    move p0, v6

    :cond_7
    if-eqz v3, :cond_8

    move p1, v6

    :cond_8
    sget-object v0, Lb2/e;->K:Lb2/l;

    sget-object v2, Ll0/m;->a:Ll0/e;

    int-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v1, v2

    sget-object v2, Lb2/e;->N:Lb2/k;

    invoke-static {v1, v2}, Ll0/m;->j(FLb2/f;)Ll0/k;

    move-result-object v1

    sget-object v2, Lb2/t;->w:Lb2/t;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v3, 0x36

    invoke-static {v1, v0, p2, v3}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v3, p2, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {p2}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {p2, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, La3/l;->a:La3/k;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, La3/k;->b:La3/j;

    invoke-virtual {p2}, Lp1/q;->i0()V

    iget-boolean v5, p2, Lp1/q;->S:Z

    if-eqz v5, :cond_9

    invoke-virtual {p2, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_9
    invoke-virtual {p2}, Lp1/q;->s0()V

    :goto_5
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {p2, v4, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {p2, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v3, p2, Lp1/q;->S:Z

    if-nez v3, :cond_a

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    :cond_a
    invoke-static {v1, p2, v1, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {p2, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, -0x10a56ed4

    invoke-virtual {p2, v0}, Lp1/q;->e0(I)V

    move v0, v6

    :goto_6
    if-ge v0, p0, :cond_d

    if-ne v0, p1, :cond_c

    move v1, v7

    goto :goto_7

    :cond_c
    move v1, v6

    :goto_7
    invoke-static {v1, p2, v6}, Lbb2/f;->d(ZLandroidx/compose/runtime/Composer;I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_d
    invoke-virtual {p2, v6}, Lp1/q;->q(Z)V

    invoke-virtual {p2, v7}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_e
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_f

    new-instance v0, Lbb2/c;

    invoke-direct {v0, p0, p1, p3, p4}, Lbb2/c;-><init>(IIII)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final i(IIIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lbb2/f;->h(IILandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
