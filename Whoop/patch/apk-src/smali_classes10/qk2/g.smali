.class public abstract Lqk2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lok2/h;",
        "itemState",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ll83/a0;",
        "b",
        "(Lok2/h;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "track-activity_release"
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
.method public static synthetic a(Lok2/h;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lqk2/g;->c(Lok2/h;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lok2/h;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 14

    const-string v0, "itemState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p2

    check-cast v4, Lp1/q;

    const v0, 0x32fc543c

    invoke-virtual {v4, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int v0, p3, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p3

    :goto_1
    and-int/lit8 v2, p4, 0x2

    if-eqz v2, :cond_2

    or-int/lit8 v0, v0, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_4

    invoke-virtual {v4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_2

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :cond_4
    :goto_3
    and-int/lit8 v5, v0, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x1

    if-eq v5, v6, :cond_5

    move v5, v7

    goto :goto_4

    :cond_5
    const/4 v5, 0x0

    :goto_4
    and-int/2addr v0, v7

    invoke-virtual {v4, v0, v5}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_a

    if-eqz v2, :cond_6

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_5

    :cond_6
    move-object v0, p1

    :goto_5
    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    int-to-float v3, v1

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v3, v5

    const/4 v6, 0x0

    invoke-static {v2, v3, v6, v1}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/4 v1, 0x6

    int-to-float v1, v1

    mul-float v10, v1, v5

    const/4 v12, 0x0

    const/16 v13, 0xd

    const/4 v9, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->N:Lb2/k;

    sget-object v3, Ll0/m;->c:Ll0/g;

    const/16 v5, 0x30

    invoke-static {v3, v2, v4, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v5, v4, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v4, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v8, v4, Lp1/q;->S:Z

    if-eqz v8, :cond_7

    invoke-virtual {v4, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_7
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_6
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v4, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v4, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v5, v4, Lp1/q;->S:Z

    if-nez v5, :cond_8

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_9

    :cond_8
    invoke-static {v3, v4, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v4, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lok2/h;->b()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0}, Lok2/h;->a()Lok2/c;

    move-result-object v2

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lqk2/b;->v(Ljava/util/List;Lok2/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    move-object v11, v0

    goto :goto_7

    :cond_a
    invoke-virtual {v4}, Lp1/q;->X()V

    move-object v11, p1

    :goto_7
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_b

    new-instance v8, Lno0/y0;

    const/16 v13, 0x1d

    move-object v9, p0

    move/from16 v10, p3

    move/from16 v12, p4

    invoke-direct/range {v8 .. v13}, Lno0/y0;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v8, v0, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final c(Lok2/h;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lqk2/g;->b(Lok2/h;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
