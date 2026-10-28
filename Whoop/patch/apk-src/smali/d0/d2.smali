.class public abstract Ld0/d2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/whoop/data/repositories/f;

.field public static final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/data/repositories/f;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/whoop/data/repositories/f;-><init>(I)V

    sput-object v0, Ld0/d2;->a:Lcom/whoop/data/repositories/f;

    sget-object v0, Ll83/i;->y:Ll83/i;

    new-instance v1, La13/f;

    const/16 v2, 0x10

    invoke-direct {v1, v2}, La13/f;-><init>(I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Ld0/d2;->b:Ljava/lang/Object;

    return-void
.end method

.method public static final a(Ld0/z1;Ld0/v1;Ljava/lang/Object;Ljava/lang/Object;Ld0/c0;Landroidx/compose/runtime/Composer;I)V
    .locals 8

    check-cast p5, Lp1/q;

    const v0, 0x33ae021d

    invoke-virtual {p5, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p6, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p5, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p6

    goto :goto_1

    :cond_1
    move v0, p6

    :goto_1
    and-int/lit8 v1, p6, 0x30

    if-nez v1, :cond_3

    invoke-virtual {p5, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit16 v1, p6, 0x180

    if-nez v1, :cond_6

    and-int/lit16 v1, p6, 0x200

    if-nez v1, :cond_4

    invoke-virtual {p5, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_3

    :cond_4
    invoke-virtual {p5, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_3
    if-eqz v1, :cond_5

    const/16 v1, 0x100

    goto :goto_4

    :cond_5
    const/16 v1, 0x80

    :goto_4
    or-int/2addr v0, v1

    :cond_6
    and-int/lit16 v1, p6, 0xc00

    if-nez v1, :cond_9

    and-int/lit16 v1, p6, 0x1000

    if-nez v1, :cond_7

    invoke-virtual {p5, p3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_5

    :cond_7
    invoke-virtual {p5, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_5
    if-eqz v1, :cond_8

    const/16 v1, 0x800

    goto :goto_6

    :cond_8
    const/16 v1, 0x400

    :goto_6
    or-int/2addr v0, v1

    :cond_9
    and-int/lit16 v1, p6, 0x6000

    if-nez v1, :cond_c

    const v1, 0x8000

    and-int/2addr v1, p6

    if-nez v1, :cond_a

    invoke-virtual {p5, p4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_7

    :cond_a
    invoke-virtual {p5, p4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_7
    if-eqz v1, :cond_b

    const/16 v1, 0x4000

    goto :goto_8

    :cond_b
    const/16 v1, 0x2000

    :goto_8
    or-int/2addr v0, v1

    :cond_c
    and-int/lit16 v1, v0, 0x2493

    const/16 v2, 0x2492

    const/4 v3, 0x1

    if-eq v1, v2, :cond_d

    move v1, v3

    goto :goto_9

    :cond_d
    const/4 v1, 0x0

    :goto_9
    and-int/2addr v0, v3

    invoke-virtual {p5, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-virtual {p0}, Ld0/z1;->g()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-virtual {p1, p2, p3, p4}, Ld0/v1;->g(Ljava/lang/Object;Ljava/lang/Object;Ld0/c0;)V

    goto :goto_a

    :cond_e
    invoke-virtual {p1, p3, p4}, Ld0/v1;->j(Ljava/lang/Object;Ld0/c0;)V

    goto :goto_a

    :cond_f
    invoke-virtual {p5}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {p5}, Lp1/q;->u()Lp1/v1;

    move-result-object p5

    if-eqz p5, :cond_10

    new-instance v0, Lb61/d;

    const/4 v7, 0x1

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p6

    invoke-direct/range {v0 .. v7}, Lb61/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p5, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method public static final b(Ld0/z1;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ld0/z1;
    .locals 10

    and-int/lit8 v0, p5, 0xe

    xor-int/lit8 v0, v0, 0x6

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x4

    if-le v0, v3, :cond_0

    move-object v4, p4

    check-cast v4, Lp1/q;

    invoke-virtual {v4, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    :cond_0
    and-int/lit8 v4, p5, 0x6

    if-ne v4, v3, :cond_2

    :cond_1
    move v4, v1

    goto :goto_0

    :cond_2
    move v4, v2

    :goto_0
    check-cast p4, Lp1/q;

    invoke-virtual {p4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-nez v4, :cond_3

    if-ne v5, v6, :cond_4

    :cond_3
    new-instance v5, Ld0/z1;

    new-instance v4, Ld0/q0;

    invoke-direct {v4, p1}, Ld0/q0;-><init>(Ljava/lang/Object;)V

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v8, p0, Ld0/z1;->c:Ljava/lang/String;

    const-string v9, " > "

    invoke-static {v7, v8, v9, p3}, Lb9/y;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-direct {v5, v4, p0, p3}, Ld0/z1;-><init>(Lal/a;Ld0/z1;Ljava/lang/String;)V

    invoke-virtual {p4, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v5, Ld0/z1;

    if-le v0, v3, :cond_5

    invoke-virtual {p4, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_7

    :cond_5
    and-int/lit8 p3, p5, 0x6

    if-ne p3, v3, :cond_6

    goto :goto_1

    :cond_6
    move v1, v2

    :cond_7
    :goto_1
    invoke-virtual {p4, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p3

    or-int/2addr p3, v1

    invoke-virtual {p4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p5

    if-nez p3, :cond_8

    if-ne p5, v6, :cond_9

    :cond_8
    new-instance p5, Lbp0/n;

    const/16 p3, 0xa

    invoke-direct {p5, p3, p0, v5}, Lbp0/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p4, p5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast p5, Lkotlin/jvm/functions/Function1;

    invoke-static {v5, p5, p4}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    invoke-virtual {p0}, Ld0/z1;->g()Z

    move-result p0

    if-eqz p0, :cond_a

    invoke-virtual {v5, p1, p2}, Ld0/z1;->k(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v5

    :cond_a
    invoke-virtual {v5, p2}, Ld0/z1;->p(Ljava/lang/Object;)V

    iget-object p0, v5, Ld0/z1;->k:Lp1/k1;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-object v5
.end method

.method public static final c(Ld0/z1;Ld0/f2;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/s1;
    .locals 1

    and-int/lit8 p4, p5, 0x2

    if-eqz p4, :cond_0

    const-string p2, "DeferredAnimation"

    :cond_0
    move-object p4, p3

    check-cast p4, Lp1/q;

    invoke-virtual {p4, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p4

    check-cast p3, Lp1/q;

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p5

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-nez p4, :cond_1

    if-ne p5, v0, :cond_2

    :cond_1
    new-instance p5, Ld0/s1;

    invoke-direct {p5, p0, p1, p2}, Ld0/s1;-><init>(Ld0/z1;Ld0/f2;Ljava/lang/String;)V

    invoke-virtual {p3, p5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast p5, Ld0/s1;

    invoke-virtual {p3, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {p3, p5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    or-int/2addr p1, p2

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_3

    if-ne p2, v0, :cond_4

    :cond_3
    new-instance p2, Lcom/whoop/profile/view/edit/n;

    const/4 p1, 0x6

    invoke-direct {p2, p1, p0, p5}, Lcom/whoop/profile/view/edit/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p3, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast p2, Lkotlin/jvm/functions/Function1;

    invoke-static {p5, p2, p3}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    invoke-virtual {p0}, Ld0/z1;->g()Z

    move-result p0

    if-eqz p0, :cond_5

    invoke-virtual {p5}, Ld0/s1;->c()V

    :cond_5
    return-object p5
.end method

.method public static final d(Ld0/z1;Ljava/lang/Object;Ljava/lang/Object;Ld0/c0;Ld0/f2;Landroidx/compose/runtime/Composer;I)Ld0/v1;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    and-int/lit8 v2, p6, 0xe

    xor-int/lit8 v7, v2, 0x6

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x4

    if-le v7, v10, :cond_0

    move-object/from16 v3, p5

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    :cond_0
    and-int/lit8 v3, p6, 0x6

    if-ne v3, v10, :cond_2

    :cond_1
    move v3, v8

    goto :goto_0

    :cond_2
    move v3, v9

    :goto_0
    move-object/from16 v5, p5

    check-cast v5, Lp1/q;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-nez v3, :cond_4

    if-ne v4, v11, :cond_3

    goto :goto_1

    :cond_3
    move-object/from16 v15, p1

    move-object/from16 v14, p2

    goto :goto_3

    :cond_4
    :goto_1
    invoke-static {}, Lyl/a;->c()Lz1/f;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Lz1/f;->e()Lkotlin/jvm/functions/Function1;

    move-result-object v4

    goto :goto_2

    :cond_5
    const/4 v4, 0x0

    :goto_2
    invoke-static {v3}, Lyl/a;->e(Lz1/f;)Lz1/f;

    move-result-object v6

    :try_start_0
    new-instance v12, Ld0/v1;

    iget-object v13, v1, Ld0/f2;->a:Lkotlin/jvm/functions/Function1;

    move-object/from16 v14, p2

    invoke-interface {v13, v14}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ld0/r;

    invoke-virtual {v13}, Ld0/r;->d()V

    move-object/from16 v15, p1

    invoke-direct {v12, v0, v15, v13, v1}, Ld0/v1;-><init>(Ld0/z1;Ljava/lang/Object;Ld0/r;Ld0/f2;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v3, v6, v4}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v5, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v4, v12

    :goto_3
    move-object v1, v4

    check-cast v1, Ld0/v1;

    shr-int/lit8 v3, p6, 0x3

    and-int/lit8 v3, v3, 0x8

    shl-int/lit8 v4, v3, 0x6

    or-int/2addr v2, v4

    shl-int/lit8 v4, p6, 0x3

    and-int/lit16 v6, v4, 0x380

    or-int/2addr v2, v6

    shl-int/lit8 v3, v3, 0x9

    or-int/2addr v2, v3

    and-int/lit16 v3, v4, 0x1c00

    or-int/2addr v2, v3

    const v3, 0xe000

    and-int/2addr v3, v4

    or-int v6, v2, v3

    move-object/from16 v4, p3

    move-object v3, v14

    move-object v2, v15

    invoke-static/range {v0 .. v6}, Ld0/d2;->a(Ld0/z1;Ld0/v1;Ljava/lang/Object;Ljava/lang/Object;Ld0/c0;Landroidx/compose/runtime/Composer;I)V

    if-le v7, v10, :cond_6

    invoke-virtual {v5, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    :cond_6
    and-int/lit8 v2, p6, 0x6

    if-ne v2, v10, :cond_7

    goto :goto_4

    :cond_7
    move v8, v9

    :cond_8
    :goto_4
    invoke-virtual {v5, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v2, v8

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_9

    if-ne v3, v11, :cond_a

    :cond_9
    new-instance v3, Lbp0/n;

    const/16 v2, 0xb

    invoke-direct {v3, v2, v0, v1}, Lbp0/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v3, v5}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    return-object v1

    :catchall_0
    move-exception v0

    invoke-static {v3, v6, v4}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    throw v0
.end method

.method public static final e(Lal/a;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ld0/z1;
    .locals 10

    and-int/lit8 v0, p3, 0xe

    xor-int/lit8 v0, v0, 0x6

    const/4 v1, 0x1

    const/4 v2, 0x4

    const/4 v3, 0x0

    if-le v0, v2, :cond_0

    move-object v4, p2

    check-cast v4, Lp1/q;

    invoke-virtual {v4, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    :cond_0
    and-int/lit8 v4, p3, 0x6

    if-ne v4, v2, :cond_2

    :cond_1
    move v4, v1

    goto :goto_0

    :cond_2
    move v4, v3

    :goto_0
    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Lp1/l;->a:Lp1/v0;

    const/4 v7, 0x0

    if-nez v4, :cond_3

    if-ne v5, v6, :cond_5

    :cond_3
    invoke-static {}, Lyl/a;->c()Lz1/f;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Lz1/f;->e()Lkotlin/jvm/functions/Function1;

    move-result-object v5

    goto :goto_1

    :cond_4
    move-object v5, v7

    :goto_1
    invoke-static {v4}, Lyl/a;->e(Lz1/f;)Lz1/f;

    move-result-object v8

    :try_start_0
    new-instance v9, Ld0/z1;

    invoke-direct {v9, p0, v7, p1}, Ld0/z1;-><init>(Lal/a;Ld0/z1;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v4, v8, v5}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v5, v9

    :cond_5
    check-cast v5, Ld0/z1;

    instance-of p1, p0, Ld0/f1;

    if-eqz p1, :cond_b

    const p1, -0x50eb2897

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    move-object p1, p0

    check-cast p1, Ld0/f1;

    iget-object v4, p1, Ld0/f1;->z:Lp1/k1;

    invoke-virtual {v4}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v4

    iget-object p1, p1, Ld0/f1;->y:Lp1/k1;

    invoke-virtual {p1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-le v0, v2, :cond_6

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    :cond_6
    and-int/lit8 p3, p3, 0x6

    if-ne p3, v2, :cond_7

    goto :goto_2

    :cond_7
    move v1, v3

    :cond_8
    :goto_2
    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    if-nez v1, :cond_9

    if-ne p3, v6, :cond_a

    :cond_9
    new-instance p3, La6/v;

    const/4 v0, 0x5

    invoke-direct {p3, p0, v7, v0}, La6/v;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {p2, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast p3, Lc93/m;

    invoke-static {v4, p1, p3, p2}, Lp1/x;->h(Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    invoke-virtual {p2, v3}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_b
    const p1, -0x50e41da0

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Lal/a;->z0()Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v5, p0, p2, v3}, Ld0/z1;->a(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p2, v3}, Lp1/q;->q(Z)V

    :goto_3
    invoke-virtual {p2, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    if-nez p0, :cond_c

    if-ne p1, v6, :cond_d

    :cond_c
    new-instance p1, Ld0/a2;

    const/4 p0, 0x0

    invoke-direct {p1, v5, p0}, Ld0/a2;-><init>(Ld0/z1;I)V

    invoke-virtual {p2, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast p1, Lkotlin/jvm/functions/Function1;

    invoke-static {v5, p1, p2}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    return-object v5

    :catchall_0
    move-exception p0

    invoke-static {v4, v8, v5}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    throw p0
.end method

.method public static final f(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/z1;
    .locals 3

    and-int/lit8 p4, p4, 0x2

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p4

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne p4, v1, :cond_1

    new-instance p4, Ld0/z1;

    new-instance v2, Ld0/q0;

    invoke-direct {v2, p0}, Ld0/q0;-><init>(Ljava/lang/Object;)V

    invoke-direct {p4, v2, v0, p1}, Ld0/z1;-><init>(Lal/a;Ld0/z1;Ljava/lang/String;)V

    invoke-virtual {p2, p4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast p4, Ld0/z1;

    and-int/lit8 p1, p3, 0x8

    or-int/lit8 p1, p1, 0x30

    and-int/lit8 p3, p3, 0xe

    or-int/2addr p1, p3

    invoke-virtual {p4, p0, p2, p1}, Ld0/z1;->a(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_2

    new-instance p0, Ld0/a2;

    const/4 p1, 0x1

    invoke-direct {p0, p4, p1}, Ld0/a2;-><init>(Ld0/z1;I)V

    invoke-virtual {p2, p0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast p0, Lkotlin/jvm/functions/Function1;

    invoke-static {p4, p0, p2}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    return-object p4
.end method
