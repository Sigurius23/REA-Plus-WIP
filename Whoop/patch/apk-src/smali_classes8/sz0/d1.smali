.class public abstract Lsz0/d1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lsz0/e1;",
        "state",
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/ui/Modifier;Lsz0/e1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lsz0/e1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lsz0/d1;->c(Landroidx/compose/ui/Modifier;Lsz0/e1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Lsz0/e1;Landroidx/compose/runtime/Composer;II)V
    .locals 19

    move-object/from16 v2, p1

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p2

    check-cast v13, Lp1/q;

    const v0, 0x570775d2

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v3, p3, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, p3, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v13, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    move v4, v1

    :goto_0
    or-int v4, p3, v4

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move/from16 v4, p3

    :goto_1
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_4

    invoke-virtual {v13, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_2

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_4
    and-int/lit8 v5, v4, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v5, v6, :cond_5

    move v5, v8

    goto :goto_3

    :cond_5
    move v5, v7

    :goto_3
    and-int/2addr v4, v8

    invoke-virtual {v13, v4, v5}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_d

    if-eqz v0, :cond_6

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_4

    :cond_6
    move-object v0, v3

    :goto_4
    int-to-float v1, v1

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v1, v3

    invoke-static {v1}, Ll0/m;->i(F)Ll0/k;

    move-result-object v1

    sget-object v3, Lb2/e;->M:Lb2/k;

    const/16 v4, 0x36

    invoke-static {v1, v3, v13, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v3, v13, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v13, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v9, v13, Lp1/q;->S:Z

    if-eqz v9, :cond_7

    invoke-virtual {v13, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_5
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v13, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v13, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v4, v13, Lp1/q;->S:Z

    if-nez v4, :cond_8

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    :cond_8
    invoke-static {v3, v13, v3, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v13, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, 0x3e199547

    invoke-virtual {v13, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lsz0/e1;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v3, v7

    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v16, v3, 0x1

    const/4 v5, 0x0

    if-ltz v3, :cond_b

    check-cast v4, Lsz0/x;

    const v6, -0x3b3efb94

    invoke-virtual {v4}, Lsz0/x;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v13, v6, v9}, Lp1/q;->b0(ILjava/lang/Object;)V

    invoke-static {v5, v4, v13, v7, v8}, Lsz0/w;->d(Landroidx/compose/ui/Modifier;Lsz0/x;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v2}, Lsz0/e1;->a()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v4

    if-eq v3, v4, :cond_a

    const v3, -0x2c9ed06b

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    const/4 v14, 0x0

    const/16 v15, 0xff

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v9, v7

    const/4 v7, 0x0

    move v11, v8

    move v10, v9

    const-wide/16 v8, 0x0

    move v12, v10

    move/from16 v17, v11

    const-wide/16 v10, 0x0

    move/from16 v18, v12

    const/4 v12, 0x0

    move-object/from16 p0, v0

    move-object/from16 p2, v1

    move/from16 v1, v17

    move/from16 v0, v18

    invoke-static/range {v3 .. v15}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_a
    move-object/from16 p0, v0

    move-object/from16 p2, v1

    move v0, v7

    move v1, v8

    const v3, -0x2c9e05b5

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    :goto_7
    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    move v7, v0

    move v8, v1

    move/from16 v3, v16

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    goto :goto_6

    :cond_b
    invoke-static {}, Lwb3/f;->d0()V

    throw v5

    :cond_c
    move-object/from16 p0, v0

    move v0, v7

    move v1, v8

    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    move-object/from16 v1, p0

    goto :goto_8

    :cond_d
    invoke-virtual {v13}, Lp1/q;->X()V

    move-object v1, v3

    :goto_8
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_e

    new-instance v0, Lqk2/i;

    const/16 v5, 0x1a

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lqk2/i;-><init>(Landroidx/compose/ui/Modifier;Lm91/u;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final c(Landroidx/compose/ui/Modifier;Lsz0/e1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lsz0/d1;->b(Landroidx/compose/ui/Modifier;Lsz0/e1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
