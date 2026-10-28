.class public final Lg1/q1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:F

.field public final b:F

.field public final c:F

.field public final d:F

.field public final e:F


# direct methods
.method public constructor <init>(FFFFF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lg1/q1;->a:F

    iput p2, p0, Lg1/q1;->b:F

    iput p3, p0, Lg1/q1;->c:F

    iput p4, p0, Lg1/q1;->d:F

    iput p5, p0, Lg1/q1;->e:F

    return-void
.end method


# virtual methods
.method public final a(ZLj0/i;Landroidx/compose/runtime/Composer;I)Ld0/m;
    .locals 14

    move-object/from16 v0, p2

    move/from16 v1, p4

    move-object/from16 v8, p3

    check-cast v8, Lp1/q;

    const v2, -0x5eb281ab

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v2, v5, :cond_0

    new-instance v2, Lz1/p;

    invoke-direct {v2}, Lz1/p;-><init>()V

    invoke-virtual {v8, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    check-cast v2, Lz1/p;

    and-int/lit8 v6, v1, 0x70

    xor-int/lit8 v6, v6, 0x30

    const/16 v7, 0x20

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-le v6, v7, :cond_1

    invoke-virtual {v8, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    :cond_1
    and-int/lit8 v6, v1, 0x30

    if-ne v6, v7, :cond_3

    :cond_2
    move v6, v9

    goto :goto_0

    :cond_3
    move v6, v10

    :goto_0
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    const/4 v11, 0x0

    if-nez v6, :cond_4

    if-ne v7, v5, :cond_5

    :cond_4
    new-instance v7, Lg1/o1;

    const/4 v6, 0x0

    invoke-direct {v7, v0, v2, v11, v6}, Lg1/o1;-><init>(Lj0/i;Lz1/p;Lq83/d;I)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v7, Lc93/m;

    invoke-static {v8, v7, v0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v2}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj0/h;

    if-nez p1, :cond_6

    iget v2, p0, Lg1/q1;->c:F

    goto :goto_1

    :cond_6
    instance-of v2, v0, Lj0/l;

    if-eqz v2, :cond_7

    iget v2, p0, Lg1/q1;->b:F

    goto :goto_1

    :cond_7
    instance-of v2, v0, Lj0/f;

    if-eqz v2, :cond_8

    iget v2, p0, Lg1/q1;->d:F

    goto :goto_1

    :cond_8
    instance-of v2, v0, Lj0/d;

    if-eqz v2, :cond_9

    iget v2, p0, Lg1/q1;->e:F

    goto :goto_1

    :cond_9
    iget v2, p0, Lg1/q1;->a:F

    :goto_1
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v5, :cond_a

    new-instance v6, Ld0/e;

    new-instance v7, Ly3/f;

    invoke-direct {v7, v2}, Ly3/f;-><init>(F)V

    sget-object v12, Ld0/f;->k:Ld0/f2;

    const/16 v13, 0xc

    invoke-direct {v6, v7, v12, v11, v13}, Ld0/e;-><init>(Ljava/lang/Object;Ld0/f2;Ljava/lang/Object;I)V

    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v6, Ld0/e;

    new-instance v11, Ly3/f;

    invoke-direct {v11, v2}, Ly3/f;-><init>(F)V

    invoke-virtual {v8, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v8, v2}, Lp1/q;->d(F)Z

    move-result v12

    or-int/2addr v7, v12

    and-int/lit8 v12, v1, 0xe

    xor-int/lit8 v12, v12, 0x6

    const/4 v13, 0x4

    if-le v12, v13, :cond_b

    invoke-virtual {v8, p1}, Lp1/q;->h(Z)Z

    move-result v12

    if-nez v12, :cond_c

    :cond_b
    and-int/lit8 v12, v1, 0x6

    if-ne v12, v13, :cond_d

    :cond_c
    move v12, v9

    goto :goto_2

    :cond_d
    move v12, v10

    :goto_2
    or-int/2addr v7, v12

    and-int/lit16 v12, v1, 0x380

    xor-int/lit16 v12, v12, 0x180

    const/16 v13, 0x100

    if-le v12, v13, :cond_e

    invoke-virtual {v8, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_10

    :cond_e
    and-int/lit16 v1, v1, 0x180

    if-ne v1, v13, :cond_f

    goto :goto_3

    :cond_f
    move v9, v10

    :cond_10
    :goto_3
    or-int v1, v7, v9

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v1, v7

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v1, :cond_11

    if-ne v7, v5, :cond_12

    :cond_11
    move-object v5, v0

    goto :goto_4

    :cond_12
    move-object v1, v6

    goto :goto_5

    :goto_4
    new-instance v0, Lg1/p1;

    move-object v1, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v4, p0

    move v3, p1

    invoke-direct/range {v0 .. v7}, Lg1/p1;-><init>(Ld0/e;FZLjava/lang/Object;Lj0/h;Lq83/d;I)V

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v7, v0

    :goto_5
    check-cast v7, Lc93/m;

    invoke-static {v8, v7, v11}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object v0, v1, Ld0/e;->c:Ld0/m;

    invoke-virtual {v8, v10}, Lp1/q;->q(Z)V

    return-object v0
.end method
