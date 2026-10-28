.class public abstract Lz0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lc4/j0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lc4/j0;

    const/4 v1, 0x1

    const/16 v2, 0xe

    invoke-direct {v0, v1, v2}, Lc4/j0;-><init>(ZI)V

    sput-object v0, Lz0/i;->a:Lc4/j0;

    return-void
.end method

.method public static final a(Lx0/g;Lx0/c;Landroidx/compose/runtime/Composer;I)V
    .locals 6

    move-object v3, p2

    check-cast v3, Lp1/q;

    const p2, 0x71816bae

    invoke-virtual {v3, p2}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v3, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    const/4 v0, 0x4

    if-eqz p2, :cond_0

    move p2, v0

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p2, p3

    invoke-virtual {v3, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x20

    goto :goto_1

    :cond_1
    const/16 v1, 0x10

    :goto_1
    or-int/2addr p2, v1

    and-int/lit8 v1, p2, 0x13

    const/16 v2, 0x12

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq v1, v2, :cond_2

    move v1, v5

    goto :goto_2

    :cond_2
    move v1, v4

    :goto_2
    and-int/lit8 v2, p2, 0x1

    invoke-virtual {v3, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_6

    const v1, -0x3c2b2dd8

    invoke-virtual {v3, v1}, Lp1/q;->e0(I)V

    sget-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v3, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-virtual {v3, v4}, Lp1/q;->q(Z)V

    invoke-virtual {v3, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    and-int/lit8 p2, p2, 0xe

    if-eq p2, v0, :cond_3

    goto :goto_3

    :cond_3
    move v4, v5

    :goto_3
    or-int p2, v2, v4

    invoke-virtual {v3, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p2, v0

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p2, :cond_4

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne v0, p2, :cond_5

    :cond_4
    new-instance v0, Lwc/e1;

    const/16 p2, 0x14

    invoke-direct {v0, p1, v1, p0, p2}, Lwc/e1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v3, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    const/4 v4, 0x0

    const/4 v5, 0x3

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, Lg0/f;->b(Landroidx/compose/ui/Modifier;Lg0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_4

    :cond_6
    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_7

    new-instance v0, Lx30/f1;

    const/16 v1, 0x9

    invoke-direct {v0, p0, p1, p3, v1}, Lx30/f1;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method public static final b(IJLandroidx/compose/runtime/Composer;I)V
    .locals 20

    move-wide/from16 v3, p1

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v1, -0x49eca00d

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p4, 0x6

    const/4 v2, 0x4

    if-nez v1, :cond_1

    move/from16 v1, p0

    invoke-virtual {v0, v1}, Lp1/q;->e(I)Z

    move-result v5

    if-eqz v5, :cond_0

    move v5, v2

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int v5, p4, v5

    goto :goto_1

    :cond_1
    move/from16 v1, p0

    move/from16 v5, p4

    :goto_1
    and-int/lit8 v6, p4, 0x30

    const/16 v7, 0x20

    if-nez v6, :cond_3

    invoke-virtual {v0, v3, v4}, Lp1/q;->f(J)Z

    move-result v6

    if-eqz v6, :cond_2

    move v6, v7

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_3
    and-int/lit8 v6, v5, 0x13

    const/16 v8, 0x12

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eq v6, v8, :cond_4

    move v6, v9

    goto :goto_3

    :cond_4
    move v6, v10

    :goto_3
    and-int/lit8 v8, v5, 0x1

    invoke-virtual {v0, v8, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_d

    sget-object v6, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v0, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/content/Context;

    invoke-virtual {v0, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    and-int/lit8 v11, v5, 0xe

    if-ne v11, v2, :cond_5

    move v2, v9

    goto :goto_4

    :cond_5
    move v2, v10

    :goto_4
    or-int/2addr v2, v8

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    const/4 v11, -0x1

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-nez v2, :cond_6

    if-ne v8, v12, :cond_7

    :cond_6
    filled-new-array {v1}, [I

    move-result-object v2

    invoke-virtual {v6, v2}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v2

    invoke-virtual {v2, v10, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v0, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v2

    if-ne v2, v11, :cond_8

    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_e

    new-instance v0, Lc41/i0;

    const/4 v5, 0x4

    move/from16 v2, p4

    invoke-direct/range {v0 .. v5}, Lc41/i0;-><init>(IIJI)V

    :goto_5
    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_8
    invoke-static {v2, v0, v10}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v14

    and-int/lit8 v1, v5, 0x70

    if-ne v1, v7, :cond_9

    goto :goto_6

    :cond_9
    move v9, v10

    :goto_6
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v9, :cond_a

    if-ne v1, v12, :cond_c

    :cond_a
    const-wide/16 v1, 0x10

    cmp-long v1, v3, v1

    if-nez v1, :cond_b

    const/4 v1, 0x0

    goto :goto_7

    :cond_b
    new-instance v1, Li2/p;

    const/4 v2, 0x5

    invoke-direct {v1, v3, v4, v2}, Li2/p;-><init>(JI)V

    :goto_7
    invoke-virtual {v0, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object/from16 v18, v1

    check-cast v18, Li2/y;

    sget-object v1, Lb2/t;->w:Lb2/t;

    sget v2, Lg0/e;->j:F

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const/16 v17, 0x0

    const/16 v19, 0x16

    const/4 v15, 0x0

    sget-object v16, Ly2/j;->b:Ly2/b1;

    invoke-static/range {v13 .. v19}, Landroidx/compose/ui/draw/a;->d(Landroidx/compose/ui/Modifier;Ln2/a;Lb2/h;Ly2/k;FLi2/y;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1, v0, v10}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    goto :goto_8

    :cond_d
    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_e

    new-instance v0, Lc41/i0;

    const/4 v5, 0x5

    move/from16 v1, p0

    move/from16 v2, p4

    invoke-direct/range {v0 .. v5}, Lc41/i0;-><init>(IIJI)V

    goto :goto_5

    :cond_e
    return-void
.end method

.method public static final c(Lx0/g;Lb1/f;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 9

    move-object v4, p3

    check-cast v4, Lp1/q;

    const p3, -0x799dedcc

    invoke-virtual {v4, p3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p3, p4, 0x6

    const/4 v0, 0x4

    if-nez p3, :cond_2

    and-int/lit8 p3, p4, 0x8

    if-nez p3, :cond_0

    invoke-virtual {v4, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p3

    goto :goto_0

    :cond_0
    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p3

    :goto_0
    if-eqz p3, :cond_1

    move p3, v0

    goto :goto_1

    :cond_1
    const/4 p3, 0x2

    :goto_1
    or-int/2addr p3, p4

    goto :goto_2

    :cond_2
    move p3, p4

    :goto_2
    and-int/lit8 v1, p4, 0x30

    const/16 v2, 0x20

    if-nez v1, :cond_5

    and-int/lit8 v1, p4, 0x40

    if-nez v1, :cond_3

    invoke-virtual {v4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_3

    :cond_3
    invoke-virtual {v4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_3
    if-eqz v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    const/16 v1, 0x10

    :goto_4
    or-int/2addr p3, v1

    :cond_5
    and-int/lit16 v1, p4, 0x180

    if-nez v1, :cond_7

    invoke-virtual {v4, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    const/16 v1, 0x100

    goto :goto_5

    :cond_6
    const/16 v1, 0x80

    :goto_5
    or-int/2addr p3, v1

    :cond_7
    and-int/lit16 v1, p3, 0x93

    const/16 v3, 0x92

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eq v1, v3, :cond_8

    move v1, v6

    goto :goto_6

    :cond_8
    move v1, v5

    :goto_6
    and-int/lit8 v3, p3, 0x1

    invoke-virtual {v4, v3, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_11

    and-int/lit8 v1, p3, 0x70

    if-eq v1, v2, :cond_a

    and-int/lit8 v1, p3, 0x40

    if-eqz v1, :cond_9

    invoke-virtual {v4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    goto :goto_7

    :cond_9
    move v1, v5

    goto :goto_8

    :cond_a
    :goto_7
    move v1, v6

    :goto_8
    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-nez v1, :cond_b

    if-ne v2, v3, :cond_c

    :cond_b
    new-instance v2, Lz0/k;

    new-instance v1, Le10/k0;

    new-instance v7, Lyo1/b;

    const/16 v8, 0x9

    invoke-direct {v7, v8, p1, p2}, Lyo1/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/16 v8, 0x11

    invoke-direct {v1, v7, v8}, Le10/k0;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v2, v1}, Lz0/k;-><init>(Le10/k0;)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v2, Lz0/k;

    and-int/lit8 v1, p3, 0xe

    if-eq v1, v0, :cond_d

    and-int/lit8 p3, p3, 0x8

    if-eqz p3, :cond_e

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_e

    :cond_d
    move v5, v6

    :cond_e
    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    if-nez v5, :cond_f

    if-ne p3, v3, :cond_10

    :cond_f
    new-instance p3, Lyy/b0;

    const/4 v0, 0x2

    invoke-direct {p3, p0, v0}, Lyy/b0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    move-object v1, p3

    check-cast v1, Lc93/a;

    new-instance p3, Lu10/f;

    const/4 v0, 0x7

    invoke-direct {p3, v0, p1, p0}, Lu10/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v0, 0x4e63add6    # 9.5495514E8f

    invoke-static {v0, v4, p3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    const/16 v5, 0xd80

    const/4 v6, 0x0

    move-object v0, v2

    sget-object v2, Lz0/i;->a:Lc4/j0;

    invoke-static/range {v0 .. v6}, Lc4/r;->a(Lc4/i0;Lc93/a;Lc4/j0;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    goto :goto_9

    :cond_11
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object p3

    if-eqz p3, :cond_12

    new-instance v0, Lvv2/c;

    const/16 v5, 0x13

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lvv2/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p3, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p2, Lp1/q;

    const v0, 0x52f9d6eb

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_1
    move v0, p3

    :goto_1
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_3

    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit8 v1, v0, 0x13

    const/16 v2, 0x12

    if-eq v1, v2, :cond_4

    const/4 v1, 0x1

    goto :goto_3

    :cond_4
    const/4 v1, 0x0

    :goto_3
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {p2, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object v1, Lb1/i;->a:Lp1/b0;

    sget-object v2, Lz0/h;->a:Lx1/b;

    and-int/lit8 v2, v0, 0xe

    or-int/lit16 v2, v2, 0x1b0

    shl-int/lit8 v0, v0, 0x6

    and-int/lit16 v0, v0, 0x1c00

    or-int/2addr v0, v2

    invoke-static {p0, v1, p1, p2, v0}, Lup/d;->g(Landroidx/compose/ui/Modifier;Lp1/t1;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    goto :goto_4

    :cond_5
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_6

    new-instance v0, Lh00/p0;

    const/4 v1, 0x3

    invoke-direct {v0, p0, p1, p3, v1}, Lh00/p0;-><init>(Landroidx/compose/ui/Modifier;Lx1/b;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method
