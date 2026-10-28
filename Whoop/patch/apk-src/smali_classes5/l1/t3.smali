.class public abstract Ll1/t3;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:Ld0/e2;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x16

    int-to-float v0, v0

    sput v0, Ll1/t3;->a:F

    sget-object v0, Ld0/b0;->a:Ld0/v;

    const/4 v1, 0x2

    const/16 v2, 0x12c

    const/4 v3, 0x0

    invoke-static {v2, v3, v0, v1}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v0

    sput-object v0, Ll1/t3;->b:Ld0/e2;

    return-void
.end method

.method public static final a(Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 9

    move-object v6, p1

    check-cast v6, Lp1/q;

    const p1, 0x3d9bae7c

    invoke-virtual {v6, p1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p1, p2, 0x13

    const/16 v0, 0x12

    const/4 v1, 0x0

    const/4 v8, 0x1

    if-eq p1, v0, :cond_0

    move p1, v8

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    and-int/lit8 v0, p2, 0x1

    invoke-virtual {v6, v0, p1}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_4

    const p1, 0x7f1407ca

    invoke-static {v6, p1}, Lm1/e0;->i(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lb2/e;->N:Lb2/k;

    new-instance v2, Landroidx/compose/foundation/layout/HorizontalAlignElement;

    invoke-direct {v2, v0}, Landroidx/compose/foundation/layout/HorizontalAlignElement;-><init>(Lb2/f;)V

    sget-object v0, Lb2/e;->w:Lb2/m;

    invoke-static {v0, v1}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v0

    iget-wide v3, v6, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v6, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, La3/l;->a:La3/k;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v5, v6, Lp1/q;->S:Z

    if-eqz v5, :cond_1

    invoke-virtual {v6, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_1
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v6, v4, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v6, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v3, v6, Lp1/q;->S:Z

    if-nez v3, :cond_2

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    :cond_2
    invoke-static {v1, v6, v1, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v6, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6}, Ll1/r4;->a(Landroidx/compose/runtime/Composer;)Ll1/v4;

    move-result-object v0

    new-instance v1, Lg1/q6;

    const/4 v2, 0x4

    invoke-direct {v1, p1, v2}, Lg1/q6;-><init>(Ljava/lang/String;I)V

    const p1, 0x7ac6d537

    invoke-static {p1, v6, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    invoke-static {v6}, Ll1/u4;->c(Landroidx/compose/runtime/Composer;)Ll1/x4;

    move-result-object v2

    const/4 v4, 0x0

    const v7, 0x6000030

    const/4 v3, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v7}, Ll1/u4;->b(Lc4/i0;Lx1/b;Ll1/x4;Landroidx/compose/ui/Modifier;ZLx1/b;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v6, v8}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    move-object v5, p0

    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_5

    new-instance p1, Lf1/z;

    const/4 v0, 0x3

    invoke-direct {p1, v5, p2, v0}, Lf1/z;-><init>(Lx1/b;II)V

    iput-object p1, p0, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method public static final b(ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll1/w3;
    .locals 11

    sget-object v0, Ll1/x3;->w:Ll1/x3;

    const/4 v1, 0x1

    and-int/2addr p4, v1

    const/4 v2, 0x0

    if-eqz p4, :cond_0

    move v4, v2

    goto :goto_0

    :cond_0
    move v4, p0

    :goto_0
    sget p0, Ll1/d;->c:F

    sget p4, Ll1/d;->d:F

    sget-object v3, Lb3/v1;->h:Lp1/u2;

    check-cast p3, Lp1/q;

    invoke-virtual {p3, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly3/c;

    invoke-virtual {p3, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {p3, p0}, Lp1/q;->d(F)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-nez v5, :cond_1

    if-ne v6, v9, :cond_2

    :cond_1
    new-instance v6, Ll1/r3;

    const/4 v5, 0x0

    invoke-direct {v6, v3, p0, v5}, Ll1/r3;-><init>(Ly3/c;FI)V

    invoke-virtual {p3, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v5, v6

    check-cast v5, Lc93/a;

    invoke-virtual {p3, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {p3, p4}, Lp1/q;->d(F)Z

    move-result v6

    or-int/2addr p0, v6

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez p0, :cond_3

    if-ne v6, v9, :cond_4

    :cond_3
    new-instance v6, Ll1/r3;

    const/4 p0, 0x1

    invoke-direct {v6, v3, p4, p0}, Ll1/r3;-><init>(Ly3/c;FI)V

    invoke-virtual {p3, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v6, Lc93/a;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    const/4 v8, 0x0

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p4

    filled-new-array {p0, p1, p4}, [Ljava/lang/Object;

    move-result-object p0

    new-instance p4, Lkf0/l;

    const/16 v3, 0xa

    invoke-direct {p4, v3}, Lkf0/l;-><init>(I)V

    new-instance v3, Liw0/j0;

    move-object v7, p1

    invoke-direct/range {v3 .. v8}, Liw0/j0;-><init>(ZLc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Z)V

    new-instance p1, Lp0/n0;

    const/16 v10, 0xa

    invoke-direct {p1, v10, p4, v3}, Lp0/n0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    and-int/lit8 p4, p2, 0xe

    xor-int/lit8 p4, p4, 0x6

    const/4 v3, 0x4

    if-le p4, v3, :cond_5

    invoke-virtual {p3, v4}, Lp1/q;->h(Z)Z

    move-result p4

    if-nez p4, :cond_6

    :cond_5
    and-int/lit8 p4, p2, 0x6

    if-ne p4, v3, :cond_7

    :cond_6
    move p4, v1

    goto :goto_1

    :cond_7
    move p4, v2

    :goto_1
    invoke-virtual {p3, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr p4, v3

    invoke-virtual {p3, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr p4, v3

    and-int/lit16 v3, p2, 0x380

    xor-int/lit16 v3, v3, 0x180

    const/16 v10, 0x100

    if-le v3, v10, :cond_8

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-virtual {p3, v0}, Lp1/q;->e(I)Z

    move-result v0

    if-nez v0, :cond_9

    :cond_8
    and-int/lit16 v0, p2, 0x180

    if-ne v0, v10, :cond_a

    :cond_9
    move v0, v1

    goto :goto_2

    :cond_a
    move v0, v2

    :goto_2
    or-int/2addr p4, v0

    invoke-virtual {p3, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p4, v0

    and-int/lit16 v0, p2, 0x1c00

    xor-int/lit16 v0, v0, 0xc00

    const/16 v3, 0x800

    if-le v0, v3, :cond_b

    invoke-virtual {p3, v8}, Lp1/q;->h(Z)Z

    move-result v0

    if-nez v0, :cond_d

    :cond_b
    and-int/lit16 p2, p2, 0xc00

    if-ne p2, v3, :cond_c

    goto :goto_3

    :cond_c
    move v1, v2

    :cond_d
    :goto_3
    or-int p2, p4, v1

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p4

    if-nez p2, :cond_e

    if-ne p4, v9, :cond_f

    :cond_e
    new-instance v3, Ll1/s3;

    invoke-direct/range {v3 .. v8}, Ll1/s3;-><init>(ZLc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Z)V

    invoke-virtual {p3, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object p4, v3

    :cond_f
    check-cast p4, Lc93/a;

    invoke-static {p0, p1, p4, p3, v2}, Ly1/k;->d([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll1/w3;

    return-object p0
.end method
