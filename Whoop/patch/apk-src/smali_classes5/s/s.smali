.class public abstract Ls/s;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 25

    move-object/from16 v0, p0

    const-string v1, "text"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p2

    check-cast v1, Lp1/q;

    const v2, -0x66bb7baf

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v1, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p3, v2

    and-int/lit8 v3, p4, 0x2

    if-eqz v3, :cond_2

    or-int/lit8 v2, v2, 0x30

    :cond_1
    move-object/from16 v4, p1

    goto :goto_2

    :cond_2
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_1

    move-object/from16 v4, p1

    invoke-virtual {v1, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_1

    :cond_3
    const/16 v5, 0x10

    :goto_1
    or-int/2addr v2, v5

    :goto_2
    and-int/lit8 v5, v2, 0x13

    const/16 v6, 0x12

    if-ne v5, v6, :cond_5

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v5

    if-nez v5, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v1}, Lp1/q;->X()V

    move-object/from16 v21, v1

    move-object v2, v4

    goto :goto_5

    :cond_5
    :goto_3
    if-eqz v3, :cond_6

    sget-object v3, Lb2/t;->w:Lb2/t;

    goto :goto_4

    :cond_6
    move-object v3, v4

    :goto_4
    sget-object v4, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v1, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg1/c1;

    invoke-virtual {v4}, Lg1/c1;->e()J

    move-result-wide v4

    sget-object v6, Lg1/i9;->b:Lp1/u2;

    invoke-virtual {v1, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg1/h9;

    iget-object v6, v6, Lg1/h9;->d:Ll3/v0;

    and-int/lit8 v22, v2, 0x7e

    const/16 v23, 0x0

    const v24, 0xfff8

    move-object/from16 v21, v1

    move-object v1, v3

    move-wide v2, v4

    const-wide/16 v4, 0x0

    move-object/from16 v20, v6

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

    invoke-static/range {v0 .. v24}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object v2, v1

    :goto_5
    invoke-virtual/range {v21 .. v21}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_7

    new-instance v0, Leo2/l;

    const/16 v5, 0xa

    move-object/from16 v1, p0

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Leo2/l;-><init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p2, Lp1/q;

    const v0, 0x7b14daa1

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

    and-int/lit8 v1, v0, 0xe

    or-int/lit8 v1, v1, 0x30

    shl-int/lit8 v0, v0, 0x3

    and-int/lit16 v0, v0, 0x380

    or-int/2addr v0, v1

    invoke-static {p0, p1, p2, v0}, Ls/s;->c(Landroidx/compose/ui/Modifier;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    goto :goto_4

    :cond_5
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_6

    new-instance v0, Lh00/p0;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, p3, v1}, Lh00/p0;-><init>(Landroidx/compose/ui/Modifier;Lx1/b;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 6

    check-cast p2, Lp1/q;

    const v0, 0x2e032b74

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

    const/4 v2, 0x0

    if-nez v1, :cond_3

    invoke-virtual {p2, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit16 v1, p3, 0x180

    if-nez v1, :cond_5

    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

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

    const/16 v3, 0x92

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq v1, v3, :cond_6

    move v1, v5

    goto :goto_4

    :cond_6
    move v1, v4

    :goto_4
    and-int/2addr v0, v5

    invoke-virtual {p2, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_7

    sget-object v0, Lp1/v0;->y:Lp1/v0;

    new-instance v3, Lp1/k1;

    invoke-direct {v3, v2, v0}, Lp1/k1;-><init>(Ljava/lang/Object;Lp1/o2;)V

    invoke-virtual {p2, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v0, v3

    :cond_7
    check-cast v0, Lp1/c1;

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_8

    new-instance v2, Luz1/g;

    const/16 v1, 0x17

    invoke-direct {v2, v1, v0}, Luz1/g;-><init>(ILp1/c1;)V

    invoke-virtual {p2, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v2, Lc93/a;

    invoke-static {v2, p2, v4}, Ls/s;->v(Lc93/a;Landroidx/compose/runtime/Composer;I)Lz0/f;

    move-result-object v1

    sget-object v2, Lb1/i;->b:Lp1/b0;

    invoke-virtual {v2, v1}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    new-instance v2, Lg1/f;

    const/16 v3, 0xe

    invoke-direct {v2, p0, v0, p1, v3}, Lg1/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v0, -0x115affcc

    invoke-static {v0, p2, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v2, 0x38

    invoke-static {v1, v0, p2, v2}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_5

    :cond_9
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_a

    new-instance v0, Lh00/p0;

    const/4 v1, 0x2

    invoke-direct {v0, p0, p1, p3, v1}, Lh00/p0;-><init>(Landroidx/compose/ui/Modifier;Lx1/b;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method public static final d(Ljava/util/List;Landroid/content/res/Resources;)F
    .locals 3

    check-cast p0, Ljava/lang/Iterable;

    const/4 v0, 0x0

    int-to-float v0, v0

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v1, v2

    add-float/2addr v0, v1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public static final e(Ldg/a;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p1, Luf/x;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Luf/x;

    iget v1, v0, Luf/x;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Luf/x;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Luf/x;

    invoke-direct {v0, p1}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p1, v0, Luf/x;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Luf/x;->E:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget p0, v0, Luf/x;->y:I

    iget-object v2, v0, Luf/x;->x:Ljava/util/Iterator;

    iget-object v5, v0, Luf/x;->w:Ldg/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p1, v2

    move v2, p0

    move-object p0, v5

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Luf/i;->d:Lgf/a;

    invoke-virtual {p0, p1}, Ldg/a;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_5

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v2, 0x0

    :cond_4
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lrf/l;

    iput-object p0, v0, Luf/x;->w:Ldg/a;

    iput-object p1, v0, Luf/x;->x:Ljava/util/Iterator;

    iput v2, v0, Luf/x;->y:I

    iput v4, v0, Luf/x;->E:I

    invoke-static {v5, v0}, Lx43/j;->q(Lrf/l;Ls83/c;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_4

    goto :goto_2

    :cond_5
    iget-object p0, p0, Ldg/a;->x:Lbc3/l1;

    invoke-static {p0}, Lbc3/f0;->s(Lq83/j;)Lbc3/k1;

    move-result-object p0

    const/4 p1, 0x0

    iput-object p1, v0, Luf/x;->w:Ldg/a;

    iput-object p1, v0, Luf/x;->x:Ljava/util/Iterator;

    iput v3, v0, Luf/x;->E:I

    invoke-static {p0, v0}, Lbc3/f0;->j(Lbc3/k1;Ls83/c;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    :goto_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final f(IILgi/i;Lgi/g;Lgi/i;)J
    .locals 2

    sget-object v0, Lgi/i;->c:Lgi/i;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p0, p2, Lgi/i;->a:Lgi/c;

    invoke-static {p0, p3}, Ls/s;->x(Lgi/c;Lgi/g;)I

    move-result p0

    iget-object p1, p2, Lgi/i;->b:Lgi/c;

    invoke-static {p1, p3}, Ls/s;->x(Lgi/c;Lgi/g;)I

    move-result p1

    :goto_0
    iget-object p2, p4, Lgi/i;->a:Lgi/c;

    iget-object p3, p4, Lgi/i;->b:Lgi/c;

    instance-of p4, p2, Lgi/a;

    const v0, 0x7fffffff

    const/high16 v1, -0x80000000

    if-eqz p4, :cond_2

    if-eq p0, v1, :cond_2

    if-ne p0, v0, :cond_1

    goto :goto_1

    :cond_1
    check-cast p2, Lgi/a;

    iget p2, p2, Lgi/a;->a:I

    if-le p0, p2, :cond_2

    move p0, p2

    :cond_2
    :goto_1
    instance-of p2, p3, Lgi/a;

    if-eqz p2, :cond_4

    if-eq p1, v1, :cond_4

    if-ne p1, v0, :cond_3

    goto :goto_2

    :cond_3
    check-cast p3, Lgi/a;

    iget p2, p3, Lgi/a;->a:I

    if-le p1, p2, :cond_4

    move p1, p2

    :cond_4
    :goto_2
    int-to-long p2, p0

    const/16 p0, 0x20

    shl-long/2addr p2, p0

    int-to-long p0, p1

    const-wide v0, 0xffffffffL

    and-long/2addr p0, v0

    or-long/2addr p0, p2

    return-wide p0
.end method

.method public static final g(IIIILgi/g;)D
    .locals 4

    int-to-double v0, p2

    int-to-double v2, p0

    div-double/2addr v0, v2

    int-to-double p2, p3

    int-to-double p0, p1

    div-double/2addr p2, p0

    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    if-eqz p0, :cond_1

    const/4 p1, 0x1

    if-ne p0, p1, :cond_0

    invoke-static {v0, v1, p2, p3}, Ljava/lang/Math;->min(DD)D

    move-result-wide p0

    return-wide p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    invoke-static {v0, v1, p2, p3}, Ljava/lang/Math;->max(DD)D

    move-result-wide p0

    return-wide p0
.end method

.method public static h([B)[B
    .locals 5

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Ljava/util/zip/Inflater;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ljava/util/zip/Inflater;-><init>(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    new-instance v2, Ljava/util/zip/InflaterInputStream;

    new-instance v3, Ljava/io/ByteArrayInputStream;

    invoke-direct {v3, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {v2, v3, v1}, Ljava/util/zip/InflaterInputStream;-><init>(Ljava/io/InputStream;Ljava/util/zip/Inflater;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    new-instance p0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v0, 0x400

    new-array v0, v0, [B

    :goto_0
    invoke-virtual {v2, v0}, Ljava/io/InputStream;->read([B)I

    move-result v3

    if-lez v3, :cond_0

    const/4 v4, 0x0

    invoke-virtual {p0, v0, v4, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    :catchall_0
    move-exception p0

    move-object v0, v2

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {v2}, Ljava/util/zip/InflaterInputStream;->close()V

    invoke-virtual {v1}, Ljava/util/zip/Inflater;->end()V

    return-object p0

    :catchall_1
    move-exception p0

    goto :goto_1

    :catchall_2
    move-exception p0

    move-object v1, v0

    :goto_1
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/zip/InflaterInputStream;->close()V

    :cond_1
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/util/zip/Inflater;->end()V

    :cond_2
    throw p0
.end method

.method public static i(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    if-eqz p0, :cond_a

    if-nez p1, :cond_0

    goto/16 :goto_0

    :cond_0
    instance-of v0, p0, [Ljava/lang/Object;

    if-eqz v0, :cond_1

    instance-of v0, p1, [Ljava/lang/Object;

    if-eqz v0, :cond_1

    check-cast p0, [Ljava/lang/Object;

    check-cast p1, [Ljava/lang/Object;

    invoke-static {p0, p1}, Ljava/util/Arrays;->deepEquals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_1
    instance-of v0, p0, [Z

    if-eqz v0, :cond_2

    instance-of v0, p1, [Z

    if-eqz v0, :cond_2

    check-cast p0, [Z

    check-cast p1, [Z

    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([Z[Z)Z

    move-result p0

    return p0

    :cond_2
    instance-of v0, p0, [B

    if-eqz v0, :cond_3

    instance-of v0, p1, [B

    if-eqz v0, :cond_3

    check-cast p0, [B

    check-cast p1, [B

    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p0

    return p0

    :cond_3
    instance-of v0, p0, [C

    if-eqz v0, :cond_4

    instance-of v0, p1, [C

    if-eqz v0, :cond_4

    check-cast p0, [C

    check-cast p1, [C

    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([C[C)Z

    move-result p0

    return p0

    :cond_4
    instance-of v0, p0, [D

    if-eqz v0, :cond_5

    instance-of v0, p1, [D

    if-eqz v0, :cond_5

    check-cast p0, [D

    check-cast p1, [D

    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([D[D)Z

    move-result p0

    return p0

    :cond_5
    instance-of v0, p0, [F

    if-eqz v0, :cond_6

    instance-of v0, p1, [F

    if-eqz v0, :cond_6

    check-cast p0, [F

    check-cast p1, [F

    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([F[F)Z

    move-result p0

    return p0

    :cond_6
    instance-of v0, p0, [I

    if-eqz v0, :cond_7

    instance-of v0, p1, [I

    if-eqz v0, :cond_7

    check-cast p0, [I

    check-cast p1, [I

    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([I[I)Z

    move-result p0

    return p0

    :cond_7
    instance-of v0, p0, [J

    if-eqz v0, :cond_8

    instance-of v0, p1, [J

    if-eqz v0, :cond_8

    check-cast p0, [J

    check-cast p1, [J

    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([J[J)Z

    move-result p0

    return p0

    :cond_8
    instance-of v0, p0, [S

    if-eqz v0, :cond_9

    instance-of v0, p1, [S

    if-eqz v0, :cond_9

    check-cast p0, [S

    check-cast p1, [S

    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([S[S)Z

    move-result p0

    return p0

    :cond_9
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_a
    :goto_0
    if-ne p0, p1, :cond_b

    const/4 p0, 0x1

    return p0

    :cond_b
    const/4 p0, 0x0

    return p0
.end method

.method public static j(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    if-nez p0, :cond_1

    if-nez p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final k(Lm63/d;Lyf/e;Ljava/lang/Object;Ld33/x;Lq83/d;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p4

    instance-of v3, v2, Luf/z;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Luf/z;

    iget v4, v3, Luf/z;->z:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Luf/z;->z:I

    goto :goto_0

    :cond_0
    new-instance v3, Luf/z;

    invoke-direct {v3, v2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object v2, v3, Luf/z;->y:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Luf/z;->z:I

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v5, :cond_4

    if-eq v5, v8, :cond_3

    if-eq v5, v7, :cond_2

    if-eq v5, v6, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, v3, Luf/z;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_2
    iget-object v0, v3, Luf/z;->x:Ljava/lang/Object;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v0

    :cond_3
    iget-object v0, v3, Luf/z;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lrg/h;

    iget-object v5, v3, Luf/z;->w:Lm63/d;

    :try_start_0
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v13, v1

    move-object v1, v5

    goto/16 :goto_3

    :catchall_0
    move-exception v0

    move-object v13, v1

    move-object v1, v5

    goto/16 :goto_6

    :catch_0
    move-exception v0

    move-object v13, v1

    move-object v1, v5

    goto/16 :goto_4

    :cond_4
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v1, Lm63/d;->x:Ljava/lang/Object;

    check-cast v2, Lio/sentry/android/replay/video/d;

    iget-object v5, v1, Lm63/d;->H:Ljava/lang/Object;

    check-cast v5, Ljava/util/ArrayList;

    iget-object v10, v1, Lm63/d;->y:Ljava/lang/Object;

    check-cast v10, Ldg/a;

    const-string v11, "<this>"

    invoke-static {v2, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "handler"

    invoke-static {v0, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v11, La30/w0;

    iget-object v12, v1, Lm63/d;->F:Ljava/lang/Object;

    check-cast v12, Luf/v;

    invoke-direct {v11, v10, v5, v12}, La30/w0;-><init>(Ldg/a;Ljava/util/ArrayList;Luf/v;)V

    iget-object v12, v2, Lio/sentry/android/replay/video/d;->d:Ljava/lang/Object;

    check-cast v12, Lag/e;

    new-instance v13, Lag/e;

    invoke-direct {v13, v7}, Lag/e;-><init>(I)V

    sget-object v14, Lag/f;->x:Lag/f;

    invoke-virtual {v12, v13, v14}, Lag/e;->c(Lag/b;Lag/f;)V

    new-instance v13, Lag/e;

    invoke-direct {v13, v11, v6}, Lag/e;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v12, v13, v14}, Lag/e;->c(Lag/b;Lag/f;)V

    sget-object v13, Luf/a0;->w:Luf/a0;

    new-instance v15, Lag/c;

    invoke-direct {v15, v13}, Lag/c;-><init>(Lkotlin/jvm/functions/Function3;)V

    invoke-virtual {v12, v15, v14}, Lag/e;->c(Lag/b;Lag/f;)V

    new-array v13, v8, [Lag/b;

    const/4 v14, 0x0

    aput-object v12, v13, v14

    invoke-static {v0, v13}, Lx30/s0;->n(Lyf/e;[Lag/b;)Lyf/e;

    move-result-object v0

    iget-object v12, v1, Lm63/d;->E:Ljava/lang/Object;

    check-cast v12, Luf/h;

    new-instance v13, Luf/e;

    invoke-direct {v13, v0, v12, v11}, Luf/e;-><init>(Lyf/e;Luf/h;La30/w0;)V

    new-instance v0, Luf/b;

    iget-object v12, v2, Lio/sentry/android/replay/video/d;->e:Ljava/lang/Object;

    check-cast v12, Luf/p;

    iget-object v15, v2, Lio/sentry/android/replay/video/d;->f:Ljava/lang/Object;

    check-cast v15, Luf/f;

    invoke-direct {v0, v13, v11, v12, v15}, Luf/b;-><init>(Luf/e;La30/w0;Luf/p;Luf/f;)V

    iget-object v12, v2, Lio/sentry/android/replay/video/d;->c:Ljava/lang/Object;

    check-cast v12, Lag/e;

    new-array v13, v8, [Lag/b;

    aput-object v12, v13, v14

    invoke-static {v0, v13}, Lx30/s0;->n(Lyf/e;[Lag/b;)Lyf/e;

    move-result-object v0

    new-instance v12, Ltf/d;

    iget-object v13, v2, Lio/sentry/android/replay/video/d;->g:Ljava/lang/Object;

    check-cast v13, Leg/o;

    iget-object v15, v2, Lio/sentry/android/replay/video/d;->h:Ljava/lang/Object;

    check-cast v15, Lgg/g;

    invoke-direct {v12, v13, v15, v11}, Ltf/d;-><init>(Leg/o;Lgg/g;La30/w0;)V

    new-array v13, v8, [Lag/b;

    aput-object v12, v13, v14

    invoke-static {v0, v13}, Lx30/s0;->n(Lyf/e;[Lag/b;)Lyf/e;

    move-result-object v0

    new-instance v12, Luf/m;

    invoke-direct {v12, v0, v8}, Luf/m;-><init>(Lyf/e;I)V

    iget-object v0, v2, Lio/sentry/android/replay/video/d;->b:Ljava/lang/Object;

    check-cast v0, Lag/e;

    new-array v13, v8, [Lag/b;

    aput-object v0, v13, v14

    invoke-static {v12, v13}, Lx30/s0;->n(Lyf/e;[Lag/b;)Lyf/e;

    move-result-object v0

    iget-object v12, v1, Lm63/d;->z:Ljava/lang/Object;

    check-cast v12, Luf/l;

    new-instance v13, Luf/e;

    invoke-direct {v13, v0, v12, v11}, Luf/e;-><init>(Lyf/e;Luf/l;La30/w0;)V

    new-instance v0, Luf/m;

    invoke-direct {v0, v13, v14}, Luf/m;-><init>(Lyf/e;I)V

    iget-object v2, v2, Lio/sentry/android/replay/video/d;->a:Ljava/lang/Object;

    check-cast v2, Lag/e;

    new-array v12, v8, [Lag/b;

    aput-object v2, v12, v14

    invoke-static {v0, v12}, Lx30/s0;->n(Lyf/e;[Lag/b;)Lyf/e;

    move-result-object v0

    new-instance v15, Luf/s;

    invoke-direct {v15, v0, v11}, Luf/s;-><init>(Lyf/e;La30/w0;)V

    new-instance v0, Luf/u;

    move-object/from16 v2, p2

    invoke-direct {v0, v10, v2}, Luf/u;-><init>(Ldg/a;Ljava/lang/Object;)V

    iget-object v2, v1, Lm63/d;->G:Ljava/lang/Object;

    check-cast v2, Lb30/m;

    sget-object v11, Lcf/l;->b:Lgf/a;

    invoke-virtual {v10, v11}, Ldg/a;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    const-string v12, "Required value was null."

    if-eqz v11, :cond_d

    sget-object v13, Lcf/l;->a:Lgf/a;

    invoke-virtual {v10, v13}, Ldg/a;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    if-eqz v13, :cond_c

    iget-object v12, v2, Lb30/m;->F:Ljava/lang/Object;

    iget-object v12, v2, Lb30/m;->x:Ljava/lang/Object;

    check-cast v12, Lmg/h;

    invoke-interface {v12}, Lmg/h;->d()Lrg/n;

    move-result-object v12

    check-cast v12, Lrg/l;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v12, v2, Lb30/m;->x:Ljava/lang/Object;

    check-cast v12, Lmg/h;

    invoke-interface {v12}, Lmg/h;->b()Lng/d;

    move-result-object v12

    check-cast v12, Lng/b;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v12, Lgf/c;

    invoke-direct {v12}, Lgf/c;-><init>()V

    new-instance v14, Lgf/a;

    const-string v6, "rpc.service"

    invoke-direct {v14, v6}, Lgf/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v14, v11}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    new-instance v6, Lgf/a;

    const-string v14, "rpc.method"

    invoke-direct {v6, v14}, Lgf/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v6, v13}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    iget-object v6, v2, Lb30/m;->z:Ljava/lang/Object;

    check-cast v6, Lgf/b;

    invoke-static {v6}, Ljc/x;->w0(Lgf/b;)Lgf/c;

    move-result-object v6

    invoke-static {v6, v12}, Ljc/x;->c0(Lgf/l;Lgf/b;)V

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v14, 0x2e

    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    iget-object v14, v2, Lb30/m;->y:Ljava/lang/Object;

    check-cast v14, Lrg/d;

    const-string v7, "name"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "spanKind"

    invoke-static {v14, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v7, Lrg/h;->s:Lrg/g;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, Lrg/g;->b:Lrg/f;

    new-instance v14, Lmg/i;

    iget-object v9, v2, Lb30/m;->x:Ljava/lang/Object;

    check-cast v9, Lmg/h;

    invoke-direct {v14, v9}, Lmg/i;-><init>(Lmg/h;)V

    new-instance v9, Log/k;

    new-instance v8, Ll83/k;

    move-object/from16 v16, v0

    const-string v0, "rpc"

    invoke-direct {v8, v0, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Luf/i;->e:Lgf/a;

    invoke-static {v10, v0}, Ljc/x;->J(Lgf/b;Lgf/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v6, Ll83/k;

    move-object/from16 p1, v15

    const-string v15, "sdkInvocationId"

    invoke-direct {v6, v15, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v8, v6}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->k0([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    invoke-direct {v9, v0}, Log/k;-><init>(Ljava/util/Map;)V

    invoke-virtual {v14, v9}, Lq83/a;->plus(Lq83/j;)Lq83/j;

    move-result-object v0

    sget-object v6, Luf/i;->g:Lgf/a;

    iget-object v8, v2, Lb30/m;->E:Ljava/lang/Object;

    check-cast v8, Luf/t;

    invoke-virtual {v10, v6, v8}, Ldg/a;->c(Lgf/a;Ljava/lang/Object;)V

    sget-object v6, Luf/i;->h:Lgf/a;

    invoke-virtual {v10, v6, v12}, Ldg/a;->c(Lgf/a;Ljava/lang/Object;)V

    new-instance v6, Lsf/n;

    iget-object v2, v2, Lb30/m;->E:Ljava/lang/Object;

    check-cast v2, Luf/t;

    invoke-direct {v6, v2, v11, v13}, Lsf/n;-><init>(Luf/t;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :try_start_1
    invoke-interface {v3}, Lq83/d;->getContext()Lq83/j;

    move-result-object v2

    sget-object v5, Lmg/i;->x:Lg73/d;

    invoke-interface {v2, v5}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v2

    check-cast v2, Lmg/i;

    if-eqz v2, :cond_5

    iget-object v2, v2, Lmg/i;->w:Lmg/h;

    if-eqz v2, :cond_5

    invoke-interface {v2}, Lmg/h;->b()Lng/d;

    move-result-object v2

    if-eqz v2, :cond_5

    sget-object v2, Lng/a;->a:Lng/f;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v13, v7

    goto/16 :goto_6

    :catch_1
    move-exception v0

    move-object v13, v7

    goto :goto_4

    :cond_5
    const/4 v2, 0x0

    :goto_1
    sget-object v5, Lq83/k;->w:Lq83/k;

    if-eqz v2, :cond_6

    :try_start_2
    new-instance v6, Lng/h;

    invoke-direct {v6, v2}, Lng/h;-><init>(Lng/f;)V

    goto :goto_2

    :cond_6
    invoke-interface {v3}, Lq83/d;->getContext()Lq83/j;

    move-result-object v2

    sget-object v6, Lng/h;->x:Lng/f;

    invoke-interface {v2, v6}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lng/h;

    if-eqz v6, :cond_7

    goto :goto_2

    :cond_7
    move-object v6, v5

    :goto_2
    new-instance v2, Lrg/i;

    invoke-direct {v2, v7}, Lrg/i;-><init>(Lrg/h;)V

    invoke-interface {v0, v2}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v0

    invoke-interface {v0, v6}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v0

    invoke-interface {v0, v5}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v0

    new-instance v12, Luf/y;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    const/4 v14, 0x0

    move-object/from16 v15, p1

    move-object/from16 v17, p3

    move-object v13, v7

    :try_start_3
    invoke-direct/range {v12 .. v17}, Luf/y;-><init>(Lrg/h;Lq83/d;Luf/s;Luf/u;Lc93/m;)V

    iput-object v1, v3, Luf/z;->w:Lm63/d;

    iput-object v13, v3, Luf/z;->x:Ljava/lang/Object;

    const/4 v2, 0x1

    iput v2, v3, Luf/z;->z:I

    invoke-static {v0, v12, v3}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v2
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    if-ne v2, v4, :cond_8

    goto :goto_8

    :cond_8
    :goto_3
    :try_start_4
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    iget-object v0, v1, Lm63/d;->y:Ljava/lang/Object;

    check-cast v0, Ldg/a;

    const/4 v1, 0x0

    iput-object v1, v3, Luf/z;->w:Lm63/d;

    iput-object v2, v3, Luf/z;->x:Ljava/lang/Object;

    const/4 v1, 0x2

    iput v1, v3, Luf/z;->z:I

    invoke-static {v0, v3}, Ls/s;->e(Ldg/a;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_9

    goto :goto_8

    :cond_9
    return-object v2

    :catchall_2
    move-exception v0

    goto :goto_7

    :catchall_3
    move-exception v0

    goto :goto_6

    :catch_2
    move-exception v0

    :goto_4
    :try_start_5
    instance-of v2, v0, Ljava/util/concurrent/CancellationException;

    if-eqz v2, :cond_a

    const-string v2, "cancelled"

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v13, v2, v5}, Lrg/j;->n(Lrg/h;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_5

    :cond_a
    sget-object v2, Lrg/e;->w:[Lrg/e;

    move-object v2, v13

    check-cast v2, Lrg/f;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v13, v0}, Lrg/j;->m(Lrg/h;Ljava/lang/Exception;)V

    :goto_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :goto_6
    :try_start_6
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :goto_7
    iget-object v1, v1, Lm63/d;->y:Ljava/lang/Object;

    check-cast v1, Ldg/a;

    const/4 v2, 0x0

    iput-object v2, v3, Luf/z;->w:Lm63/d;

    iput-object v0, v3, Luf/z;->x:Ljava/lang/Object;

    const/4 v2, 0x3

    iput v2, v3, Luf/z;->z:I

    invoke-static {v1, v3}, Ls/s;->e(Ldg/a;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_b

    :goto_8
    return-object v4

    :cond_b
    :goto_9
    throw v0

    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v12}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v12}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static l(Lorg/json/JSONArray;)Ljava/util/ArrayList;
    .locals 4

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v2

    invoke-static {v1, v2}, Le93/b;->i0(II)Li93/j;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    move-object v3, v1

    check-cast v3, Li93/i;

    iget-boolean v3, v3, Li93/i;->y:Z

    if-eqz v3, :cond_1

    move-object v3, v1

    check-cast v3, Lm83/e0;

    invoke-virtual {v3}, Lm83/e0;->nextInt()I

    move-result v3

    invoke-virtual {p0, v3}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lorg/json/JSONArray;

    if-eqz v3, :cond_3

    check-cast v2, Lorg/json/JSONArray;

    invoke-static {v2}, Ls/s;->l(Lorg/json/JSONArray;)Ljava/util/ArrayList;

    move-result-object v2

    goto :goto_2

    :cond_3
    instance-of v3, v2, Lorg/json/JSONObject;

    if-eqz v3, :cond_4

    check-cast v2, Lorg/json/JSONObject;

    invoke-static {v2}, Ls/s;->m(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object v2

    goto :goto_2

    :cond_4
    const-string v3, "null"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    move-object v2, v0

    :cond_5
    :goto_2
    if-eqz v2, :cond_2

    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    return-object p0
.end method

.method public static m(Lorg/json/JSONObject;)Ljava/util/Map;
    .locals 6

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lorg/json/JSONObject;->names()Lorg/json/JSONArray;

    move-result-object v1

    if-nez v1, :cond_1

    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    :cond_1
    const/4 v2, 0x0

    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v3

    invoke-static {v2, v3}, Le93/b;->i0(II)Li93/j;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v2}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    move-object v4, v2

    check-cast v4, Li93/i;

    iget-boolean v4, v4, Li93/i;->y:Z

    if-eqz v4, :cond_2

    move-object v4, v2

    check-cast v4, Lm83/e0;

    invoke-virtual {v4}, Lm83/e0;->nextInt()I

    move-result v4

    invoke-virtual {v1, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_6

    const-string v5, "null"

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    instance-of v5, v4, Lorg/json/JSONObject;

    if-eqz v5, :cond_4

    check-cast v4, Lorg/json/JSONObject;

    invoke-static {v4}, Ls/s;->m(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object v4

    goto :goto_2

    :cond_4
    instance-of v5, v4, Lorg/json/JSONArray;

    if-eqz v5, :cond_5

    check-cast v4, Lorg/json/JSONArray;

    invoke-static {v4}, Ls/s;->l(Lorg/json/JSONArray;)Ljava/util/ArrayList;

    move-result-object v4

    :cond_5
    :goto_2
    invoke-static {v4, v3}, Lvl/b;->q(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    goto :goto_3

    :cond_6
    move-object v3, v0

    :goto_3
    if-eqz v3, :cond_3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_7
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    sget-object v0, Lm83/z;->w:Lm83/z;

    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-static {v0, v1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    goto :goto_4

    :cond_8
    return-object v0
.end method

.method public static n(Ljava/util/List;)Lorg/json/JSONArray;
    .locals 3

    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/util/Map;

    if-eqz v2, :cond_0

    check-cast v1, Ljava/util/Map;

    invoke-static {v1}, Ls/s;->o(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object v1

    goto :goto_1

    :cond_0
    instance-of v2, v1, Ljava/util/List;

    if-eqz v2, :cond_1

    check-cast v1, Ljava/util/List;

    invoke-static {v1}, Ls/s;->n(Ljava/util/List;)Lorg/json/JSONArray;

    move-result-object v1

    goto :goto_1

    :cond_1
    instance-of v2, v1, Ljava/lang/Number;

    if-nez v2, :cond_3

    instance-of v2, v1, Ljava/lang/Boolean;

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    :cond_3
    :goto_1
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    :cond_4
    return-object v0
.end method

.method public static o(Ljava/util/Map;)Lorg/json/JSONObject;
    .locals 5

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :catch_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    :try_start_0
    instance-of v4, v3, Ljava/util/Map;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v4, :cond_2

    :try_start_1
    check-cast v3, Ljava/util/Map;

    invoke-static {v3}, Ls/s;->o(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :cond_2
    :try_start_2
    instance-of v4, v3, Ljava/util/List;

    if-eqz v4, :cond_3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Ls/s;->n(Ljava/util/List;)Lorg/json/JSONArray;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    :cond_3
    instance-of v4, v3, Ljava/lang/Number;

    if-nez v4, :cond_5

    instance-of v4, v3, Ljava/lang/Boolean;

    if-eqz v4, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    :cond_5
    :goto_1
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :cond_6
    return-object v0
.end method

.method public static p(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    if-eqz p0, :cond_1

    const-string v0, "null"

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static q(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;Landroid/widget/TextView;)V
    .locals 0

    if-eqz p0, :cond_0

    iget-object p0, p1, Landroid/view/inputmethod/EditorInfo;->hintText:Ljava/lang/CharSequence;

    if-nez p0, :cond_0

    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    :goto_0
    instance-of p1, p0, Landroid/view/View;

    if-eqz p1, :cond_0

    invoke-interface {p0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static final r(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 2

    const-string v0, "currency"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ls/s;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic s(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Long;
    .locals 1

    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public static final t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-static {p0}, Ls/s;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final u(Ln6/o;F)Ln6/o;
    .locals 7

    new-instance v2, Lv6/o;

    const/4 v0, 0x2

    invoke-direct {v2, p1, v0}, Lv6/o;-><init>(FI)V

    new-instance v0, Lv6/p;

    new-instance v1, Lv6/o;

    const/4 p1, 0x0

    const/4 v3, 0x3

    invoke-direct {v1, p1, v3}, Lv6/o;-><init>(FI)V

    new-instance v4, Lv6/o;

    invoke-direct {v4, p1, v3}, Lv6/o;-><init>(FI)V

    move-object v3, v2

    move-object v5, v2

    move-object v6, v2

    invoke-direct/range {v0 .. v6}, Lv6/p;-><init>(Lv6/o;Lv6/o;Lv6/o;Lv6/o;Lv6/o;Lv6/o;)V

    invoke-interface {p0, v0}, Ln6/o;->d(Ln6/o;)Ln6/o;

    move-result-object p0

    return-object p0
.end method

.method public static final v(Lc93/a;Landroidx/compose/runtime/Composer;I)Lz0/f;
    .locals 3

    sget-object p2, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f:Lp1/u2;

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/View;

    invoke-virtual {p1, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-nez v0, :cond_0

    if-ne v1, v2, :cond_1

    :cond_0
    new-instance v1, Lz0/f;

    const/4 v0, 0x0

    invoke-direct {v1, p2, v0, p0}, Lz0/f;-><init>(Landroid/view/View;Lkotlin/jvm/functions/Function1;Lc93/a;)V

    invoke-virtual {p1, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v1, Lz0/f;

    invoke-virtual {p1, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p0, :cond_2

    if-ne p2, v2, :cond_3

    :cond_2
    new-instance p2, Lz0/a;

    const/4 p0, 0x3

    invoke-direct {p2, v1, p0}, Lz0/a;-><init>(Lz0/f;I)V

    invoke-virtual {p1, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast p2, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, p2, p1}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    return-object v1
.end method

.method public static final w(Lm63/d;Lyf/e;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 4

    new-instance v0, Ld33/x;

    const/4 v1, 0x2

    const/16 v2, 0x9

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Ld33/x;-><init>(IILq83/d;)V

    invoke-static {p0, p1, p2, v0, p3}, Ls/s;->k(Lm63/d;Lyf/e;Ljava/lang/Object;Ld33/x;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static x(Lgi/c;Lgi/g;)I
    .locals 1

    instance-of v0, p0, Lgi/a;

    if-eqz v0, :cond_0

    check-cast p0, Lgi/a;

    iget p0, p0, Lgi/a;->a:I

    return p0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    if-eqz p0, :cond_2

    const/4 p1, 0x1

    if-ne p0, p1, :cond_1

    const p0, 0x7fffffff

    return p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    const/high16 p0, -0x80000000

    return p0
.end method
