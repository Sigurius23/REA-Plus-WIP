.class public abstract Ly2/q1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ly2/b1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly2/b1;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Ly2/b1;-><init>(I)V

    sput-object v0, Ly2/q1;->a:Ly2/b1;

    return-void
.end method

.method public static final a(Landroidx/compose/ui/Modifier;Lx1/b;Ly2/r0;Landroidx/compose/runtime/Composer;I)V
    .locals 6

    check-cast p3, Lp1/q;

    const v0, -0x63243d80

    invoke-virtual {p3, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p3, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    invoke-virtual {p3, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x100

    goto :goto_1

    :cond_1
    const/16 v1, 0x80

    :goto_1
    or-int/2addr v0, v1

    and-int/lit16 v1, v0, 0x93

    const/16 v2, 0x92

    const/4 v3, 0x1

    if-eq v1, v2, :cond_2

    move v1, v3

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    and-int/2addr v0, v3

    invoke-virtual {p3, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-wide v0, p3, Lp1/q;->T:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    invoke-static {p3, p0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {p3}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    sget-object v4, La3/j;->y:La3/j;

    invoke-virtual {p3}, Lp1/q;->i0()V

    iget-boolean v5, p3, Lp1/q;->S:Z

    if-eqz v5, :cond_3

    invoke-virtual {p3, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {p3}, Lp1/q;->s0()V

    :goto_3
    sget-object v4, La3/l;->a:La3/k;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, La3/k;->g:La3/i;

    invoke-static {p3, v4, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {p3, v4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, p3, Lp1/q;->S:Z

    if-eqz v2, :cond_4

    new-instance v2, Lp02/a;

    const/4 v4, 0x3

    invoke-direct {v2, v4}, Lp02/a;-><init>(I)V

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p3, v4, v2}, Lp1/q;->b(Ljava/lang/Object;Lc93/m;)V

    :cond_4
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {p3, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v2, p3, Lp1/q;->S:Z

    if-nez v2, :cond_5

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    :cond_5
    invoke-static {v0, p3, v0, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    const/4 v0, 0x6

    invoke-static {v0, p1, p3, v3}, Lih0/d0;->y(ILx1/b;Lp1/q;Z)V

    goto :goto_4

    :cond_7
    invoke-virtual {p3}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {p3}, Lp1/q;->u()Lp1/v1;

    move-result-object p3

    if-eqz p3, :cond_8

    new-instance v0, Lgb/r;

    invoke-direct {v0, p0, p1, p2, p4}, Lgb/r;-><init>(Landroidx/compose/ui/Modifier;Lx1/b;Ly2/r0;I)V

    iput-object v0, p3, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;II)V
    .locals 8

    check-cast p2, Lp1/q;

    const v0, -0x4d634bd0    # -1.824273E-8f

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, p3, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_2

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p3

    goto :goto_1

    :cond_2
    move v1, p3

    :goto_1
    and-int/lit8 v2, p3, 0x30

    if-nez v2, :cond_4

    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/16 v2, 0x20

    goto :goto_2

    :cond_3
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_4
    and-int/lit8 v2, v1, 0x13

    const/16 v3, 0x12

    if-eq v2, v3, :cond_5

    const/4 v2, 0x1

    goto :goto_3

    :cond_5
    const/4 v2, 0x0

    :goto_3
    and-int/lit8 v3, v1, 0x1

    invoke-virtual {p2, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_8

    if-eqz v0, :cond_6

    sget-object p0, Lb2/t;->w:Lb2/t;

    :cond_6
    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v0, v2, :cond_7

    new-instance v0, Ly2/u1;

    sget-object v2, Ly2/b1;->x:Ly2/b1;

    invoke-direct {v0, v2}, Ly2/u1;-><init>(Ly2/x1;)V

    invoke-virtual {p2, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v0, Ly2/u1;

    shl-int/lit8 v1, v1, 0x3

    and-int/lit16 v1, v1, 0x3f0

    invoke-static {v0, p0, p1, p2, v1}, Ly2/q1;->c(Ly2/u1;Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    :goto_4
    move-object v3, p0

    goto :goto_5

    :cond_8
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_4

    :goto_5
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_9

    new-instance v2, Lnj/g;

    const/4 v7, 0x1

    move-object v4, p1

    move v5, p3

    move v6, p4

    invoke-direct/range {v2 .. v7}, Lnj/g;-><init>(Landroidx/compose/ui/Modifier;Ll83/e;III)V

    iput-object v2, p0, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method public static final c(Ly2/u1;Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;I)V
    .locals 8

    check-cast p3, Lp1/q;

    const v0, -0x1e845847

    invoke-virtual {p3, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p3, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    goto :goto_1

    :cond_1
    move v0, p4

    :goto_1
    and-int/lit8 v1, p4, 0x30

    if-nez v1, :cond_3

    invoke-virtual {p3, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit16 v1, p4, 0x180

    if-nez v1, :cond_5

    invoke-virtual {p3, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x100

    goto :goto_3

    :cond_4
    const/16 v1, 0x80

    :goto_3
    or-int/2addr v0, v1

    :cond_5
    and-int/lit16 v1, v0, 0x93

    const/16 v2, 0x92

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v1, v2, :cond_6

    move v1, v4

    goto :goto_4

    :cond_6
    move v1, v3

    :goto_4
    and-int/2addr v0, v4

    invoke-virtual {p3, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_d

    iget-wide v0, p3, Lp1/q;->T:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-static {p3}, Lp1/x;->E(Landroidx/compose/runtime/Composer;)Lp1/o;

    move-result-object v1

    invoke-static {p3, p1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {p3}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    sget-object v6, La3/j;->y:La3/j;

    invoke-virtual {p3}, Lp1/q;->i0()V

    iget-boolean v7, p3, Lp1/q;->S:Z

    if-eqz v7, :cond_7

    invoke-virtual {p3, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {p3}, Lp1/q;->s0()V

    :goto_5
    iget-object v6, p0, Ly2/u1;->c:Ly2/t1;

    invoke-static {p3, v6, p0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object v6, p0, Ly2/u1;->d:Ly2/t1;

    invoke-static {p3, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object v1, p0, Ly2/u1;->e:Ly2/t1;

    invoke-static {p3, v1, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/l;->a:La3/k;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {p3, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->d:La3/i;

    invoke-static {p3, v1, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v2, p3, Lp1/q;->S:Z

    if-nez v2, :cond_8

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    :cond_8
    invoke-static {v0, p3, v0, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    invoke-virtual {p3, v4}, Lp1/q;->q(Z)V

    invoke-virtual {p3}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_c

    const v0, -0x4b0f01b4

    invoke-virtual {p3, v0}, Lp1/q;->e0(I)V

    invoke-virtual {p3, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_a

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v1, v0, :cond_b

    :cond_a
    new-instance v1, La3/l0;

    const/16 v0, 0x16

    invoke-direct {v1, p0, v0}, La3/l0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p3, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v1, Lc93/a;

    invoke-static {v1, p3}, Lp1/x;->k(Lc93/a;Landroidx/compose/runtime/Composer;)V

    invoke-virtual {p3, v3}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_c
    const v0, -0x4b0e1cb7

    invoke-virtual {p3, v0}, Lp1/q;->e0(I)V

    invoke-virtual {p3, v3}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_d
    invoke-virtual {p3}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {p3}, Lp1/q;->u()Lp1/v1;

    move-result-object p3

    if-eqz p3, :cond_e

    new-instance v0, Lc4/c;

    const/16 v5, 0x9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lc4/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ll83/e;II)V

    iput-object v0, p3, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method public static final d(JJ)F
    .locals 4

    const/16 v0, 0x20

    shr-long v1, p2, v0

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    shr-long v2, p0, v0

    long-to-int v0, v2

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    div-float/2addr v1, v0

    const-wide v2, 0xffffffffL

    and-long/2addr p2, v2

    long-to-int p2, p2

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    and-long/2addr p0, v2

    long-to-int p0, p0

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    div-float/2addr p2, p0

    invoke-static {v1, p2}, Ljava/lang/Math;->min(FF)F

    move-result p0

    return p0
.end method

.method public static final e(Ly2/y;)Lh2/c;
    .locals 6

    invoke-interface {p0}, Ly2/y;->V()Ly2/y;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-interface {v0, p0, v1}, Ly2/y;->r(Ly2/y;Z)Lh2/c;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lh2/c;

    invoke-interface {p0}, Ly2/y;->n()J

    move-result-wide v1

    const/16 v3, 0x20

    shr-long/2addr v1, v3

    long-to-int v1, v1

    int-to-float v1, v1

    invoke-interface {p0}, Ly2/y;->n()J

    move-result-wide v2

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    long-to-int p0, v2

    int-to-float p0, p0

    const/4 v2, 0x0

    invoke-direct {v0, v2, v2, v1, p0}, Lh2/c;-><init>(FFFF)V

    return-object v0
.end method

.method public static final f(Ly2/y;)Lh2/c;
    .locals 16

    invoke-static/range {p0 .. p0}, Ly2/q1;->h(Ly2/y;)Ly2/y;

    move-result-object v0

    invoke-interface {v0}, Ly2/y;->n()J

    move-result-wide v1

    const/16 v3, 0x20

    shr-long/2addr v1, v3

    long-to-int v1, v1

    int-to-float v1, v1

    invoke-interface {v0}, Ly2/y;->n()J

    move-result-wide v4

    const-wide v6, 0xffffffffL

    and-long/2addr v4, v6

    long-to-int v2, v4

    int-to-float v2, v2

    const/4 v4, 0x1

    move-object/from16 v5, p0

    invoke-interface {v0, v5, v4}, Ly2/y;->r(Ly2/y;Z)Lh2/c;

    move-result-object v4

    iget v5, v4, Lh2/c;->a:F

    const/4 v8, 0x0

    cmpg-float v9, v5, v8

    if-gez v9, :cond_0

    move v5, v8

    :cond_0
    cmpl-float v9, v5, v1

    if-lez v9, :cond_1

    move v5, v1

    :cond_1
    iget v9, v4, Lh2/c;->b:F

    cmpg-float v10, v9, v8

    if-gez v10, :cond_2

    move v9, v8

    :cond_2
    cmpl-float v10, v9, v2

    if-lez v10, :cond_3

    move v9, v2

    :cond_3
    iget v10, v4, Lh2/c;->c:F

    cmpg-float v11, v10, v8

    if-gez v11, :cond_4

    move v10, v8

    :cond_4
    cmpl-float v11, v10, v1

    if-lez v11, :cond_5

    goto :goto_0

    :cond_5
    move v1, v10

    :goto_0
    iget v4, v4, Lh2/c;->d:F

    cmpg-float v10, v4, v8

    if-gez v10, :cond_6

    goto :goto_1

    :cond_6
    move v8, v4

    :goto_1
    cmpl-float v4, v8, v2

    if-lez v4, :cond_7

    goto :goto_2

    :cond_7
    move v2, v8

    :goto_2
    cmpg-float v4, v5, v1

    if-nez v4, :cond_8

    goto :goto_3

    :cond_8
    cmpg-float v4, v9, v2

    if-nez v4, :cond_9

    :goto_3
    sget-object v0, Lh2/c;->e:Lh2/c;

    return-object v0

    :cond_9
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v10, v4

    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v12, v4

    shl-long/2addr v10, v3

    and-long/2addr v12, v6

    or-long/2addr v10, v12

    invoke-interface {v0, v10, v11}, Ly2/y;->E(J)J

    move-result-wide v10

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v12, v4

    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v8, v4

    shl-long/2addr v12, v3

    and-long/2addr v8, v6

    or-long/2addr v8, v12

    invoke-interface {v0, v8, v9}, Ly2/y;->E(J)J

    move-result-wide v8

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v12, v1

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v14, v1

    shl-long/2addr v12, v3

    and-long/2addr v14, v6

    or-long/2addr v12, v14

    invoke-interface {v0, v12, v13}, Ly2/y;->E(J)J

    move-result-wide v12

    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v4, v1

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    shl-long/2addr v4, v3

    and-long/2addr v1, v6

    or-long/2addr v1, v4

    invoke-interface {v0, v1, v2}, Ly2/y;->E(J)J

    move-result-wide v0

    shr-long v4, v10, v3

    long-to-int v2, v4

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    shr-long v4, v8, v3

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    shr-long v14, v0, v3

    long-to-int v5, v14

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    shr-long v14, v12, v3

    long-to-int v3, v14

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    invoke-static {v5, v3}, Ljava/lang/Math;->min(FF)F

    move-result v14

    invoke-static {v4, v14}, Ljava/lang/Math;->min(FF)F

    move-result v14

    invoke-static {v2, v14}, Ljava/lang/Math;->min(FF)F

    move-result v14

    invoke-static {v5, v3}, Ljava/lang/Math;->max(FF)F

    move-result v3

    invoke-static {v4, v3}, Ljava/lang/Math;->max(FF)F

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    move-result v2

    and-long v3, v10, v6

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    and-long v4, v8, v6

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    and-long/2addr v0, v6

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    and-long v5, v12, v6

    long-to-int v1, v5

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v5

    invoke-static {v4, v5}, Ljava/lang/Math;->min(FF)F

    move-result v5

    invoke-static {v3, v5}, Ljava/lang/Math;->min(FF)F

    move-result v5

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-static {v4, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-static {v3, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    new-instance v1, Lh2/c;

    invoke-direct {v1, v14, v5, v2, v0}, Lh2/c;-><init>(FFFF)V

    return-object v1
.end method

.method public static final g(JJ)Z
    .locals 0

    cmp-long p0, p0, p2

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final h(Ly2/y;)Ly2/y;
    .locals 2

    invoke-interface {p0}, Ly2/y;->V()Ly2/y;

    move-result-object v0

    :goto_0
    move-object v1, v0

    move-object v0, p0

    move-object p0, v1

    if-eqz p0, :cond_0

    invoke-interface {p0}, Ly2/y;->V()Ly2/y;

    move-result-object v0

    goto :goto_0

    :cond_0
    instance-of p0, v0, Landroidx/compose/ui/node/NodeCoordinator;

    if-eqz p0, :cond_1

    move-object p0, v0

    check-cast p0, Landroidx/compose/ui/node/NodeCoordinator;

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    :goto_1
    if-nez p0, :cond_2

    return-object v0

    :cond_2
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    :goto_2
    move-object v1, v0

    move-object v0, p0

    move-object p0, v1

    if-eqz p0, :cond_3

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    goto :goto_2

    :cond_3
    return-object v0
.end method

.method public static final i(JJ)J
    .locals 5

    const/16 v0, 0x20

    shr-long v1, p0, v0

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    shr-long v2, p2, v0

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    mul-float/2addr v2, v1

    const-wide v3, 0xffffffffL

    and-long/2addr p0, v3

    long-to-int p0, p0

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    and-long p1, p2, v3

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    mul-float/2addr p1, p0

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long p2, p0

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long p0, p0

    shl-long/2addr p2, v0

    and-long/2addr p0, v3

    or-long/2addr p0, p2

    return-wide p0
.end method
